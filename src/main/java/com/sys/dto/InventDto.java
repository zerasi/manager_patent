package com.sys.dto;

import com.sys.entity.Invent;

import java.util.List;

public class InventDto extends Invent {

    private List<Long> inventIds;

    public List<Long> getInventIds() {
        return inventIds;
    }

    public void setInventIds(List<Long> inventIds) {
        this.inventIds = inventIds;
    }
}