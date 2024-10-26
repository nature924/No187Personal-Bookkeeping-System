package com.sxt.sys.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.sxt.common.DataGridView;
import com.sxt.sys.service.BilltypeService;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 老雷
 * @since 2019-09-20
 */
@RestController
@RequestMapping("/billtype")
public class BilltypeController {
	
	@Autowired
	private BilltypeService billtypeService;

	
	@RequestMapping("loadAllBillType")
	public DataGridView loadAllBillType() {
		return new DataGridView(0L, billtypeService.list());
	}

}

