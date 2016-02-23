package cn.lxl;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Select;

public interface UserMapperI {

	@Insert("insert into user_test(id,name,telephone) values(#{uid},#{uname},#{utelephone})")
	public int addUser(User user);
	
	@Delete("delete from user_test where id = #{uid}")
	public int deleteUserById(String id);
	
	@Update("update user_test set name=#{uname},telephone=#{utelephone} where id=#{uid}")
	public int updateUserById(User user);
	
	@Select("select id uid,name uname,telephone utelephone from user_test where id = #{uid}")
	public User selectUserById(String id);
	
	@Select("select id uid,name uname,telephone utelephone from user_test")
	public List<User> selectAll();
}
