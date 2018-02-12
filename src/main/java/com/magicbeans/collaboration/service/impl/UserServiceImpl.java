package com.magicbeans.collaboration.service.impl;

import com.magicbeans.collaboration.entity.User;
import com.magicbeans.collaboration.mapper.UserMapper;
import com.magicbeans.collaboration.service.IUserService;
import com.magicbeans.base.BaseServiceImp;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户 服务实现类
 * </p>
 *
 * @author null123
 * @since 2018-02-12
 */
@Service
public class UserServiceImpl extends BaseServiceImp<UserMapper, User> implements IUserService {

}
