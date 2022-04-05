package dbpack;
//ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;

import javax.sql.DataSource;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class DbDemo {
	public static void main(String[] args) throws Exception{
		ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
		
		
		DataSource ds=ctx.getBean("dataSource",DataSource.class);
		
		System.out.println(ds.getConnection());
		
		JdbcTemplate jdbc=new JdbcTemplate(ds);
		
		int noofusers=jdbc.queryForInt("select count(*) from users");
		
		System.out.println(noofusers);
		
	String name=	jdbc.queryForObject("select uname from users where uid=?", new Object[] {1},String.class);
		System.out.println(name);
		
		User user=jdbc.queryForObject("select * from users where uid=?", new Object[] {1},new MyRowMapper());
		
		System.out.println(user);
		
		Connection con=ds.getConnection();
		
		con.setAutoCommit(false);
		//st1
		Savepoint sp= con.setSavepoint("aa");
		//st2
		//st3
		//con.commit();
		con.rollback(sp);
		con.commit();
		
	}
}
class MyRowMapper implements RowMapper<User>
{
	@Override
	public User mapRow(ResultSet rs, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		User user =new User();
		user.setUid(rs.getInt(1));
		user.setUname(rs.getString(2));
		user.setUpass(rs.getString(3));
		user.setFlag(rs.getInt(4));
		return user;
	}
}
