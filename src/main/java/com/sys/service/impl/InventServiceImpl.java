package com.sys.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sys.dao.CateTypeMapper;
import com.sys.dao.InventMapper;
import com.sys.dao.UserDao;
import com.sys.dto.InventDto;
import com.sys.dto.InventSug;
import com.sys.entity.CateType;
import com.sys.entity.Invent;
import com.sys.entity.InventExample;
import com.sys.service.InventService;
import com.sys.utils.PageResult;
import com.sys.utils.Results;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional
@Slf4j
public class InventServiceImpl implements InventService {

    @Autowired
    private InventMapper inventMapper;
    @Autowired
    private CateTypeMapper cateTypeMapper;
    @Autowired
    private UserDao userDao;

    @Override
    public PageResult getAllInventsByPage(Integer offset, Integer rows, InventExample inventExample) {
        PageHelper.startPage(offset,rows);
        Page<Invent> pages = (Page<Invent>)this.inventMapper.selectByExample(inventExample);
        List<Invent> list = pages.getResult();
        list.forEach(p -> {
            CateType cateType = this.cateTypeMapper.selectByPrimaryKey(Integer.parseInt(p.getCate_type()));
            p.setCateType(cateType);
        });
        return new PageResult(pages.getTotal(), list);
    }

    @Override
    public Results addInvent(InventDto inventDto) {
        int rows = this.inventMapper.insert(inventDto);
        return Results.success();
    }

    @Override
    public Results editInvent(InventDto inventDto) {
        int rows = this.inventMapper.updateByPrimaryKeySelective(inventDto);
        return Results.success();
    }

    @Override
    public Results deleteParkByInventIds(List<Long> inventIds) {
        inventIds.forEach(p -> {
            this.inventMapper.deleteByPrimaryKey(p.intValue());
        });
        return Results.success();
    }

    @Override
    public Results verifyParkByInventIds(List<Long> inventIds) {
        inventIds.forEach(p -> {
            Invent invent = this.inventMapper.selectByPrimaryKey(p.intValue());
            invent.setStatus_cd("1");
            invent.setVerify_date(new Date());
            this.inventMapper.updateByPrimaryKeySelective(invent);
        });
        return Results.success();
    }

    @Override
    public Results verifyParkByInventSug(InventSug inventSug) {
        int rows = this.inventMapper.insertInventSug(inventSug);
        Invent invent = this.inventMapper.selectByPrimaryKey(inventSug.getInvent_id());
        if(inventSug.getStatus_cd()!=null && "1".equals(inventSug.getStatus_cd())){
            //请求同意
            invent.setStatus_cd("1");
            this.inventMapper.updateByPrimaryKeySelective(invent);
            return Results.success("已审核同意");
        }
        invent.setStatus_cd("2");
        return Results.success("已驳回");
    }

    @Override
    public List<InventSug> inventSugListByInventId(InventSug inventSug) {
        List<InventSug> sugList =  this.inventMapper.inventSugListByInventId(inventSug);
        sugList.forEach(p ->{
            if(p.getUser_id()!=null){
                p.setUser(userDao.getById(p.getUser_id().longValue()));
            }
        });
        return sugList;
    }
}
