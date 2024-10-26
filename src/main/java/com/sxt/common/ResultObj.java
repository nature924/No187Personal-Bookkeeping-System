package com.sxt.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用于返回json 数据
 * @author mrt
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultObj {
	//业务响应码
	private int code ;
	//业务消息
	private String msg;
}
