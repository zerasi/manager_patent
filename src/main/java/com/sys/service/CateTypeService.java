package com.sys.service;

import com.sys.dto.CateTypeDto;
import com.sys.entity.CateType;
import com.sys.entity.CateTypeExample;
import com.sys.utils.PageResult;
import com.sys.utils.Results;

import java.util.List;

public interface CateTypeService {
    PageResult getAllParksByPage(Integer offset, Integer rows, CateTypeExample cateTypeExample);

    Results editCate(CateTypeDto cateTypeDto);

    Results addCate(CateTypeDto cateTypeDto);

    Results deleteParkByCateIds(List<Long> cateIds);

    List<CateType> getAllCate();
}
