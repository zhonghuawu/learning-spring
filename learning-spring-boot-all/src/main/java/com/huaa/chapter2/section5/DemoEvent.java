package com.huaa.chapter2.section5;

import lombok.Data;
import org.springframework.context.ApplicationEvent;

/**
 * @author wu_zh
 * @date
 */
@Data
public class DemoEvent extends ApplicationEvent {

    private String msg;

    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param source the object on which the event initially occurred or with
     *               which the event is associated (never {@code null})
     */
    public DemoEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

}
