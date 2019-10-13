package com.huaa.chapter12.db.mongo.dao.pojo;

import lombok.Data;

/**
 * Desc:
 *
 * @author zhonghua.wu
 * @date 2019/10/6 17:50
 */
@Data
public class Item {
    private Long id;
    private Order order;
    private String product;
    private Double price;
    private Integer quantity;

}
