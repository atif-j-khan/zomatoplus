package com.thinkxfactor.zomatoplus.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="tbl_restaurant")
	public class Restaurant implements Serializable{
	@Id
	@GeneratedValue
	@Column(name="r_id")
	private long r_id;
	@Column(name="restaurantname")
		private String restaurantname;
	@Column(name="restaurantaddress")
		private String restaurantaddress;
	@Column(name="rating")
		private int rating;
	@Column(name="phoneno")
		private long phoneno;
	@Column(name="website")
		private String website;
	@Column(name="city")
	private String city;
	@Column(name="description")
	private String description;
		public Restaurant(long id, String restaurantname, String restaurantaddress, int rating, long phoneno,
				String website, String city, String description) {
			super();
			this.r_id = id;
			this.restaurantname = restaurantname;
			this.restaurantaddress = restaurantaddress;
			this.rating = rating;
			this.phoneno = phoneno;
			this.website = website;
			this.city = city;
			this.description = description;
		}
		public Restaurant()
		 {
			 super();
		 }
		 public String getCity() {
				return city;
			}
			public void setCity(String city) {
				this.city = city;
			}
			public String getDescription() {
				return description;
			}
			public void setDescription(String description) {
				this.description = description;
			}
		 public long getId() {
				return r_id;
			}
			public void setId(long id) {
				this.r_id = id;
			}
		 
		public String getRestaurantname() {
			return restaurantname;
		}
		public void setRestaurantname(String restaurantname) {
			this.restaurantname = restaurantname;
		}
		public String getRestaurantaddress() {
			return restaurantaddress;
		}
		public void setRestaurantaddress(String restaurantaddress) {
			this.restaurantaddress = restaurantaddress;
		}
		public int getRating() {
			return rating;
		}
		public void setRating(int rating) {
			this.rating = rating;
		}
		public long getPhoneno() {
			return phoneno;
		}
		public void setPhoneno(long phoneno) {
			this.phoneno = phoneno;
		}
		public String getWebsite() {
			return website;
		}
		public void setWebsite(String website) {
			this.website = website;
		}
}