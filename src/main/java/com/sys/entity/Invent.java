package com.sys.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2020-04-17
 */
@Data
public class Invent {
    private Integer id;

    private String invent_name;

    /**
     * 基础类别
     */
    private String cate_type;

    private String area_type;

    /**
     * 申请人
     */
    private String apply_men;

    /**
     * 身份证号
     */
    private String card_no;

    private String acc_nbr;

    private String adress;

    /**
     * 详细介绍
     */
    private String invent_des;

    /**
     * 附件
     */
    private String attach;

    @JsonFormat(pattern = "yyyy-MM-dd  HH:mm:ss",timezone="GMT+8")
    private Date create_date;

    @JsonFormat(pattern = "yyyy-MM-dd  HH:mm:ss",timezone="GMT+8")
    private Date verify_date;

    /**
     * 0 申请中 1已审核
     */
    private String status_cd;

    private String bak1;

    private String bak2;

    private CateType cateType;

}