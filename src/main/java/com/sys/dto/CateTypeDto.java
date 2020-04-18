package com.sys.dto;

import com.sys.entity.CateType;

import java.util.List;

public class CateTypeDto extends CateType {

    private List<Long> cateIds;

    public List<Long> getCateIds() {
        return cateIds;
    }

    public void setCateIds(List<Long> cateIds) {
        this.cateIds = cateIds;
    }
}
