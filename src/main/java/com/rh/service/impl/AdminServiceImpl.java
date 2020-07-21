package com.rh.service.impl;

import com.rh.entity.Admin;
import com.rh.dao.AdminDAO;
import com.rh.service.AdminService;
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
public class AdminServiceImpl extends ServiceImpl<AdminDAO, Admin> implements AdminService {

}
