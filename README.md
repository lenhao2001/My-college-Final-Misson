http://localhost:8080/

if u dont have login ， thet will auto redirect to login page

http://localhost:8080/user/securePage

——————————————————————————————————————————————
@Mapper
public interface LoginMapper extends BaseMapper<User>{
    @Select("select * from User where UserId = #{UserId} and UserPasswd = #{UserPasswd}") 
    User SelectUserIdandPassword(User user);
}

by maven dependency environment，I do make wrong MybatisPlus version with mybatis ver，the proble make the project cant use baseMapper normal class，i have need to diy for my self and use annotation to be a sql then get Mysql Data return.  
