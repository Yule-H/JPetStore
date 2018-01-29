package com.yul.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="cart")
public class Cart {

	@EmbeddedId
	private CartKey cartKey;
	private Integer amount;
	
	public CartKey getCartKey() {
		return cartKey;
	}
	public void setCartKey(CartKey cartKey) {
		this.cartKey = cartKey;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	
}
