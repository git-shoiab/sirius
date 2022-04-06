package compkeypack;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class InvTrans {
	@EmbeddedId
	private CompKey compKey;
	private int qty;
	
	public final CompKey getCompKey() {
		return compKey;
	}
	public final void setCompKey(CompKey compKey) {
		this.compKey = compKey;
	}
	public final int getQty() {
		return qty;
	}
	public final void setQty(int qty) {
		this.qty = qty;
	}
	
}
