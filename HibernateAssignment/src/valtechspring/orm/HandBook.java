package valtechspring.orm;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@DiscriminatorValue("hx")
public class HandBook extends Book{

private String isbn;
private float price;
private Date publishedYear;
private int editions;
public HandBook() {
	
}
public HandBook(String isbn, float price, Date publishedYear, int editions) {
	super();
	this.isbn = isbn;
	this.price = price;
	this.publishedYear = publishedYear;
	this.editions = editions;
}
public String getIsbn() {
	return isbn;
}
public void setIsbn(String isbn) {
	this.isbn = isbn;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public Date getPublishedYear() {
	return publishedYear;
}
public void setPublishedYear(Date publishedYear) {
	this.publishedYear = publishedYear;
}
public int getEditions() {
	return editions;
}
public void setEditions(int editions) {
	this.editions = editions;
}




}
