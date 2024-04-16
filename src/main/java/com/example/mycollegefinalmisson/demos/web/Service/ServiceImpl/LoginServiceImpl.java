package com.example.mycollegefinalmisson.demos.web.Service.ServiceImpl;

import com.example.mycollegefinalmisson.demos.web.Entity.User;
import com.example.mycollegefinalmisson.demos.web.Mapper.LoginMapper;
import com.example.mycollegefinalmisson.demos.web.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description:
 * User: Lenhao
 * Date: 2024-03-27
 * Time: 10:17
 */
@Service
public class LoginServiceImpl implements LoginService{

    @Autowired
    LoginMapper loginMapper;

    @Override
    public int AuthenticateUser(User user){

        User userReturn = loginMapper.SelectUserIdandPassword(user);

        int Pass = 0; //默认账号不存在

        if (userReturn == null){
            return Pass; // 没查询到账号返回默认情况--=账号不存在
        } else if (!userReturn.getUserPasswd().equals(user.getUserPasswd())) {
            return Pass+1; //查询到账号，但密码不正确.
        }

        return Pass+2;//以上两步都通过，账号密码正确，登录验证通过.

    }
}
