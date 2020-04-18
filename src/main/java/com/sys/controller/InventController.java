package com.sys.controller;

import com.sys.dto.InventDto;
import com.sys.dto.InventSug;
import com.sys.entity.InventExample;
import com.sys.entity.LoginUser;
import com.sys.service.InventService;
import com.sys.utils.*;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("invent")
@Slf4j
public class InventController {

    @Autowired
    private InventService inventService;

    @PostMapping("/listByPage")
    @ApiOperation(value = "分页获取专利信息", notes = "分页获取专利信息")//描述
    @ApiImplicitParam(name = "request", value = "分页查询实体类", required=false)
    @PreAuthorize("hasAuthority('sys:invent:query')")
    @ResponseBody
    public PageResult getInventList(PageTableRequest request, InventDto inventDto) {
        InventExample inventExample = new InventExample();
        InventExample.Criteria criteria = inventExample.createCriteria();
        if(inventDto.getInvent_name()!=null && !"".equals(inventDto.getInvent_name())){
            criteria.andInvent_nameLike("%"+inventDto.getInvent_name()+"%");
        }
        if(inventDto.getCate_type()!=null && !"".equals(inventDto.getCate_type())){
            criteria.andCate_typeEqualTo(inventDto.getCate_type());
        }
        if(inventDto.getStatus_cd()!=null && !"".equals(inventDto.getStatus_cd())){
            criteria.andStatus_cdEqualTo(inventDto.getStatus_cd());
        }
        if(inventDto.getBak1()!=null && !"".equals(inventDto.getBak1())){
            criteria.andBak1EqualTo(inventDto.getBak1());
        }
        if(inventDto.getBak2()!=null && !"".equals(inventDto.getBak2())){
            criteria.andBak2EqualTo(inventDto.getBak2());
        }
        request.countOffset();
        return inventService.getAllInventsByPage(request.getOffset(),request.getRows(),inventExample);
    }

    @PostMapping("/save")
    @ApiOperation(value = "添加或修改专利信息", notes = "添加或修改专利信息，根据TParkDto id是否为null区分")
    @ApiImplicitParam(name = "request", value = "添加修改实体类", required=true)
    @PreAuthorize("hasAuthority('sys:invent:edit')")
    public String saveInvent(MultipartFile attach_name, InventDto inventDto) throws Exception {
        if(attach_name.getOriginalFilename()!=null && (attach_name.getOriginalFilename().endsWith(".docx") || attach_name.getOriginalFilename().endsWith(".doc") )){
            String attach = FileUtil.saveFile(attach_name);
            inventDto.setAttach(attach);
        }
        if(inventDto.getId()==null){
            //获取登录用户信息
            LoginUser loginUser = (LoginUser) SecurityUtils.getCurrentUserAuthentication().getPrincipal();
            inventDto.setCreate_date(new Date());
            inventDto.setStatus_cd("0");
            inventDto.setBak1(loginUser.getUsername());
            Results results = this.inventService.addInvent(inventDto);
        }
        Results results = this.inventService.editInvent(inventDto);
        return "redirect:/invent/attachPage";
    }

    @RequestMapping("/attachPage")
    public String inventPage(){
        return "/pages/base/invent_mine";
    }

    @PostMapping(value = "/delete")
    @ResponseBody
    @PreAuthorize("hasAuthority('sys:invent:del')")
    @ApiOperation(value = "批量删除专利信息", notes = "批量删除专利信息")//描述
    public Results deleteInvents(@RequestBody InventDto inventDto) {
        return inventService.deleteParkByInventIds(inventDto.getInventIds());
    }

    @PostMapping(value = "/verify")
    @ResponseBody
    @PreAuthorize("hasAuthority('sys:invent:verify')")
    @ApiOperation(value = "审核通过专利信息", notes = "审核通过专利信息，添加意见")//描述
    public Results verifyInvents(InventSug inventSug) {
        return inventService.verifyParkByInventSug(inventSug);
    }

    @PostMapping(value = "/inventSugListByInventId")
    @ResponseBody
    @ApiOperation(value = "处理意见", notes = "处理意见根据专利id获取")//描述
    public List<InventSug> inventSugListByInventId(InventSug inventSug) {
        return inventService.inventSugListByInventId(inventSug);
    }


}
