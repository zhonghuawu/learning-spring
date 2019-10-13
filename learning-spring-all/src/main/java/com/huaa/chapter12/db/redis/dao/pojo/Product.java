package com.huaa.chapter12.db.redis.dao.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * Desc:
 *
 * @author wu_zh
 * @date 2019/10/6 22:36
 */
@Data
public class Product implements Serializable {
    private String sku;
    private String name;
    private String desc;
}
