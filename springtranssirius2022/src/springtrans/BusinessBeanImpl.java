package springtrans;

public class BusinessBeanImpl implements BusinessBean{
	private MoneyTransferBean mtb;
@Override
public void doTransaction(int craccid, int draccid, int amt) throws Exception {
	mtb.doCredit(craccid, amt);
	mtb.doDebit(draccid, amt);
	
}
public MoneyTransferBean getMtb() {
	return mtb;
}
public void setMtb(MoneyTransferBean mtb) {
	this.mtb = mtb;
}
}
