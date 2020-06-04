package com.spring5.core.event;

import org.springframework.context.ApplicationEvent;

/**
 * TestEvent
 *
 * @author lizheng 日撸代码三千行，不识加班累，只缘bug狂。
 * @version 1.0
 * @date 2020/6/3 8:36
 */
public class TestEvent extends ApplicationEvent {
	private static final long serialVersionUID = 8099057708183571937L;
	/**
	 * Create a new ApplicationEvent.
	 *
	 * @param source the object on which the event initially occurred (never {@code null})
	 */
	public TestEvent(Object source) {
		super(source);
	}
}
