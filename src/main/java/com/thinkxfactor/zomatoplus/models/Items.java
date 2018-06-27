package com.thinkxfactor.zomatoplus.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_item")
public class Items implements Serializable{
	@Id
	@GeneratedValue
	@Column(name="item_id")
	private long item_id;
	@Column(name="res_id")
	private long res_id;
	@Column(name="itemname")
	private String itemname;
	@Column(name="itemprice")
	private int itemprice;
	@Column(name="description")
	private String description;
	
	 public Items(long item_id, long res_id, String itemname, int itemprice, String description) {
		super();
		this.item_id = item_id;
		this.res_id = res_id;
		this.itemname = itemname;
		this.itemprice = itemprice;
		this.description = description;
	}
	 public Items()
	 {
		 super();
	 }
	 
	public long getItem_id() {
		return item_id;
	}
	public void setItem_id(long item_id) {
		this.item_id = item_id;
	}
	public long getRes_id() {
		return res_id;
	}
	public void setRes_id(long res_id) {
		this.res_id = res_id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
