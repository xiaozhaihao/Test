package com.rh.service.impl;

import com.rh.entity.User;
import com.rh.dao.UserDAO;
import com.rh.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xxx
 * @since 2020-07-21
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDAO, User> implements UserService {

}
