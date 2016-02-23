package cn.lxl;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisTest {

	private String resource = "config/config.xml";
	private Reader reader = null;
	private SqlSessionFactory factory = null;
	private SqlSession session = null;
 	
	private static MybatisTest instance = new MybatisTest();
	
	private MybatisTest() {
		try {
			reader = Resources.getResourceAsReader("config/config.xml");
		} catch (IOException e) {
			e.printStackTrace();
		}
		factory = new SqlSessionFactoryBuilder().build(reader);
		session = factory.openSession();
	}
	
	public static MybatisTest getInstance(){
		return instance;
	}
	
	public static void test1(){
		SqlSession s = MybatisTest.getInstance().session;
		
		System.out.println(s.selectList("why.getAll"));
		
		User tmp = new User("3","´óË§","999999");
		s.insert("why.addUser",tmp);
		System.out.println(s.selectList("getAll"));
		
		tmp.setUtelephone("8888888888888888");
		s.update("why.updateUserById",tmp);
		System.out.println(s.selectList("getAll"));
		
		s.delete("why.deleteUserById", 3);
		System.out.println(s.selectList("getAll"));
	}
	
	public static void test2(){
		SqlSession s = instance.session;
		UserMapperI mapper = s.getMapper(UserMapperI.class);
		
		System.out.println("select 1");
		System.out.println(mapper.selectUserById("1"));
		
		System.out.println("all");
		System.out.println(mapper.selectAll());
		
		System.out.println("add");
		User tmp = new User("4","5","6");
		mapper.addUser(tmp);
		System.out.println(mapper.selectAll());
		
		System.out.println("update");
		tmp.setUname("¶þÃ¨");
		mapper.updateUserById(tmp);
		System.out.println(mapper.selectAll());
		
		System.out.println("delete 4");
		mapper.deleteUserById("4");
		System.out.println(mapper.selectAll());
	}
	
	public static void test3(){
		Classes c1 = MybatisTest.getInstance().session.selectOne("class.getClassById_1","c001");
		System.out.println("c1:\n"+c1);
		
		Classes c2 = MybatisTest.getInstance().session.selectOne("class.getClassById_2","c002");
		System.out.println("c2:\n"+c2);
		
		Classes c3 = MybatisTest.getInstance().session.selectOne("class.getClassById_3","c002");
		System.out.println("c3:\n"+c3);
		
		Classes c4 = MybatisTest.getInstance().session.selectOne("class.getClassById_4","c002");
		System.out.println("c4:\n"+c4);
	}
	public static void main(String[] args) throws IOException {
 
		test1();
		test2();
		test3();
		
		
		UserMapperI m = getInstance().session.getMapper(UserMapperI.class);
	}
}
