package com.dearcom.stat.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.base4j.orm.hibernate.BaseEntity;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.ever4j.annotation.ClassConfig;
import org.ever4j.annotation.FieldConfig;

import com.dearcom.customer.entity.Customer;
import com.dearcom.customer.entity.Terminal;
import com.dearcom.mall.entity.Mall;
import com.dearcom.mall.entity.Shop;
import com.dearcom.mall.entity.ShopPromotion;

@Entity
@Table(name = "com_show_shop_prom")
@ClassConfig(title = "商铺优惠券浏览的详细日志", isShowMenu = true)
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler", "list" })
public class ShowShopProm extends BaseEntity {
	@FieldConfig(title = "终端", valueField = "memo")
	@ManyToOne
	@JoinColumn(name = "term_id")
	private Terminal terminal;

	@FieldConfig(title = "会员", valueField = "mobile")
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;

	@FieldConfig(title = "商场", valueField = "name")
	@ManyToOne
	@JoinColumn(name = "mall_id")
	private Mall mall;

	@FieldConfig(title = "商户", valueField = "name")
	@ManyToOne
	@JoinColumn(name = "shop_id")
	private Shop shop;

	@FieldConfig(title = "优惠券", valueField = "intro")
	@ManyToOne
	@JoinColumn(name = "shop_prom_id")
	private ShopPromotion promotion;

	@FieldConfig(title = "时间")
	@Temporal(TemporalType.TIMESTAMP)
	private Date time;

	public Terminal getTerminal() {
		return terminal;
	}

	public void setTerminal(Terminal terminal) {
		this.terminal = terminal;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Mall getMall() {
		return mall;
	}

	public void setMall(Mall mall) {
		this.mall = mall;
	}

	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

	public ShopPromotion getPromotion() {
		return promotion;
	}

	public void setPromotion(ShopPromotion promotion) {
		this.promotion = promotion;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}
}
