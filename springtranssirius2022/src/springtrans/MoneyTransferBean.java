package springtrans;

public interface MoneyTransferBean {
	public void doCredit(int craccid,int amt)throws Exception;
	public void doDebit(int draccid,int amt)throws Exception;
}
