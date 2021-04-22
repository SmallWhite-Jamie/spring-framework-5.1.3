package com.transfer.tx.tel;

import org.springframework.context.ApplicationEvent;

import java.io.Serializable;

/**
 * @author lizheng
 */
public class RegCustomerEvent extends ApplicationEvent implements Serializable {
	private static final long serialVersionUID = 1;
    public RegCustomerEvent(Data data){
        super(data);
    }
}