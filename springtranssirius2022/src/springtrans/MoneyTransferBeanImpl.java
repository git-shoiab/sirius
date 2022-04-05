package springtrans;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class MoneyTransferBeanImpl implements MoneyTransferBean {
	
	private DataSource dataSource;

	@Override
	public void doCredit(int craccid, int amt) throws Exception {
		JdbcTemplate jdbc=new JdbcTemplate(dataSource);;
		Integer oldamount=jdbc.queryForObject("select amount from accounts where accid=?", new Object[] {craccid},Integer.class);
		
		int newamt=oldamount+amt;
		
		NamedParameterJdbcTemplate namedJdbc=new NamedParameterJdbcTemplate(dataSource);
		MapSqlParameterSource mps=new MapSqlParameterSource();
		mps.addValue("newamt",newamt);
		mps.addValue("accid",craccid);
		
		namedJdbc.update("update accounts set amount=:newamt where accid=:accid",mps);
		
	}

	@Override
	public void doDebit(int draccid, int amt) throws Exception {
		JdbcTemplate jdbc=new JdbcTemplate(dataSource);
		int newamt=0;
		Integer oldamount=jdbc.queryForObject("select amount from accounts where accid=?", new Object[] {draccid},Integer.class);
		if(oldamount<amt) {
			throw new InsufficientBalanceException("Need more money money money......");
		}
		else {
			 newamt=oldamount-amt;
		}
		
		NamedParameterJdbcTemplate namedJdbc=new NamedParameterJdbcTemplate(dataSource);
		MapSqlParameterSource mps=new MapSqlParameterSource();
		mps.addValue("newamt",newamt);
		mps.addValue("accid",draccid);
		
		namedJdbc.update("update accounts set amount=:newamt where accid=:accid",mps);
		
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

}
