package com.zr.model;

import lombok.Data;

/**
 * Created by zr on 2017/1/13.
 */
@Data
public class Role {
    private int rid;
    private String rname;
    private String rno;
    private User user;
}
