package com.sys.controller;

import com.sys.dto.CateTypeDto;
import com.sys.entity.CateType;
import com.sys.entity.CateTypeExample;
import com.sys.service.CateTypeService;
import com.sys.utils.PageResult;
import com.sys.utils.PageTableRequest;
import com.sys.utils.Results;
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

import java.util.List;

@Controller
@RequestMapping("cate_type")
@Slf4j
public class CateTypeController {

    @Autowired
    private CateTypeService cateTypeService;

    @PostMapping("/listByPage")
    @ApiOperation(value = "分页获取专利分类信息", notes = "分页获取专利分类信息")//描述
    @ApiImplicitParam(name = "request", value = "分页查询实体类", required=false)
    @ResponseBody
    public PageResult getCateList(PageTableRequest request, CateTypeDto cateTypeDto) {
        CateTypeExample cateTypeExample = new CateTypeExample();
        request.countOffset();
        return cateTypeService.getAllParksByPage(request.getOffset(),request.getRows(),cateTypeExample);
    }

    @PostMapping("/list")
    @ApiOperation(value = "分页获取专利全部信息", notes = "分页获取专利全部信息")//描述
    @ApiImplicitParam(name = "request", value = "分页查询实体类", required=false)
    @ResponseBody
    public List<CateType> getCateListAll(CateTypeDto cateTypeDto) {
        return cateTypeService.getAllCate();
    }

    @PostMapping("/save")
    @ApiOperation(value = "添加或修改专利分类信息", notes = "添加或修改专利分类信息，根据TParkDto id是否为null区分")
    @ApiImplicitParam(name = "request", value = "添加修改实体类", required=true)
    @ResponseBody
    @PreAuthorize("hasAuthority('sys:cate:edit')")
    public Results saveCate(CateTypeDto cateTypeDto){
        if(cateTypeDto.getId()==null){
            return this.cateTypeService.addCate(cateTypeDto);
        }
        return this.cateTypeService.editCate(cateTypeDto);
    }

    @PostMapping(value = "/delete")
    @ResponseBody
    @PreAuthorize("hasAuthority('sys:cate:del')")
    @ApiOperation(value = "批量删除专利分类信息", notes = "批量删除专利分类信息")//描述
    public Results deleteParks(@RequestBody CateTypeDto cateTypeDto) {
        return cateTypeService.deleteParkByCateIds(cateTypeDto.getCateIds());
    }


}
