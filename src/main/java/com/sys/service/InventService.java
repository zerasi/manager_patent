package com.sys.service;

import com.sys.dto.InventDto;
import com.sys.dto.InventSug;
import com.sys.entity.InventExample;
import com.sys.utils.PageResult;
import com.sys.utils.Results;

import java.util.List;

public interface InventService {
    PageResult getAllInventsByPage(Integer offset, Integer rows, InventExample inventExample);

    Results addInvent(InventDto inventDto);

    Results editInvent(InventDto inventDto);

    Results deleteParkByInventIds(List<Long> inventIds);

    Results verifyParkByInventIds(List<Long> inventIds);

    Results verifyParkByInventSug(InventSug inventSug);

    List<InventSug> inventSugListByInventId(InventSug inventSug);
}
