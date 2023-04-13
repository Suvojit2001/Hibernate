package com.author;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Book {
	@Id
   int book_id;
   String book_name;
   @ManyToOne
   Author author;
public int getBook_id() {
	return book_id;
}
public void setBook_id(int book_id) {
	this.book_id = book_id;
}
public String getBook_name() {
	return book_name;
}
public void setBook_name(String book_name) {
	this.book_name = book_name;
}
public Author getAuthor() {
	return author;
}
public void setAuthor(Author author) {
	this.author = author;
}
public Book(int book_id, String book_name, Author author) {
	super();
	this.book_id = book_id;
	this.book_name = book_name;
	this.author = author;
}
public Book() {
	super();
	// TODO Auto-generated constructor stub
}
   
}
