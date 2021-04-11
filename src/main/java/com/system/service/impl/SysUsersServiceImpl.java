package com.system.service.impl;

import com.system.model.SysUsers;
import com.system.mapper.SysUsersMapper;
import com.system.service.ISysUsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author Ablett_Chen
 * @since 2021-01-25
 */
@Service("iSysUsersService")
public class SysUsersServiceImpl extends ServiceImpl<SysUsersMapper, SysUsers> implements ISysUsersService {
	 @Autowired
    private SysUsersMapper sysUsersMapper;
}
