package com.sxt.sys.service.impl;

import com.sxt.sys.domain.Billtype;
import com.sxt.sys.mapper.BilltypeMapper;
import com.sxt.sys.service.BilltypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.io.Serializable;

import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 老雷
 * @since 2019-09-20
 */
@Service
public class BilltypeServiceImpl extends ServiceImpl<BilltypeMapper, Billtype> implements BilltypeService {

	
	@Override
	public Billtype getById(Serializable id) {
		return super.getById(id);
	}
}
