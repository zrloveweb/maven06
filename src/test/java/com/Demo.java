package com;


import com.zr.mapper.RoleMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by zr on 2017/1/13.
 */
public class Demo {
    @Test
    public void abc() throws IOException {
        SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("config.xml"));
        SqlSession s = sf.openSession();
        RoleMapper r = s.getMapper(RoleMapper.class);
        System.out.println(r.findById(1));
    }
}
