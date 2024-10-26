package com.sxt.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataGridView {
	private Long code=0L;
	private String msg="";
	private Long count;
	private Object data;
	public DataGridView(Long count, Object data) {
		super();
		this.count = count;
		this.data = data;
	}
}
