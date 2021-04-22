package com.transfer.tx.tel;

/**
 * Data
 *
 * @author lizheng 日撸代码三千行，不识加班累，只缘bug狂。
 * @version 1.0
 * @date 2021/4/21 下午7:35
 */
public class Data {
	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Data: " + text;
	}
}
