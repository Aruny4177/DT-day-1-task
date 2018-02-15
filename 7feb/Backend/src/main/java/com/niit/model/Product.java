package com.niit.model;

	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Transient;
	import javax.validation.constraints.Size;

	import org.hibernate.validator.constraints.NotEmpty;
	import org.springframework.web.multipart.MultipartFile;

	@Entity
	public class Product {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;
		@Size(min = 3, message = "Please enter the 3 char name")
		public String productname;

		public double price;
	    @Transient
	    MultipartFile file;
	    
		public MultipartFile getFile() {
			return file;
		}

		public void setFile(MultipartFile file) {
			this.file = file;
		}

		public long qty;
		@NotEmpty(message = "Please enter the brand name")
		public String brand;
		@NotEmpty(message = "Please enter the brand name")
		public String category;

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getProductname() {
			return productname;
		}

		public void setProductname(String productname) {
			this.productname = productname;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public long getQty() {
			return qty;
		}

		public void setQty(long qty) {
			this.qty = qty;
		}

		public String getBrand() {
			return brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}

		@Override
		public String toString() {
			return "Product [id=" + id + ", productname=" + productname + ", price=" + price + ", qty=" + qty + ", brand="
					+ brand + ", category=" + category + "]";
		}

	}


