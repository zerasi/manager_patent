package com.sys.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sys.dao.CateTypeMapper;
import com.sys.dto.CateTypeDto;
import com.sys.entity.CateType;
import com.sys.entity.CateTypeExample;
import com.sys.service.CateTypeService;
import com.sys.utils.PageResult;
import com.sys.utils.Results;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@Slf4j
public class CateTypeServiceImpl implements CateTypeService {

    @Autowired
    private CateTypeMapper cateTypeMapper;

    @Override
    public PageResult getAllParksByPage(Integer offset, Integer rows, CateTypeExample cateTypeExample) {
        PageHelper.startPage(offset,rows);
        Page<CateType> pages = (Page<CateType>)this.cateTypeMapper.selectByExample(cateTypeExample);
        return new PageResult(pages.getTotal(), pages.getResult());
    }

    @Override
    public Results editCate(CateTypeDto cateTypeDto) {
        int rows = cateTypeMapper.updateByPrimaryKeySelective(cateTypeDto);
        return Results.success();
    }

    @Override
    public Results addCate(CateTypeDto cateTypeDto) {
        int rows = this.cateTypeMapper.insert(cateTypeDto);
        return Results.success();
    }

    @Override
    public Results deleteParkByCateIds(List<Long> cateIds) {
        cateIds.forEach(p ->{
            this.cateTypeMapper.deleteByPrimaryKey(p.intValue());
        });
        return Results.success();
    }

    @Override
    public List<CateType> getAllCate() {
        return this.cateTypeMapper.selectByExample(new CateTypeExample());
    }
}
