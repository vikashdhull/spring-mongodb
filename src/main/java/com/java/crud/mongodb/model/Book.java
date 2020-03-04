package com.java.crud.mongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Document(collection="Book")
public class Book {

	@Id
	@Generated
	private int id;
	private String bookName;
	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", authoName=" + authoName + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthoName() {
		return authoName;
	}
	public void setAuthoName(String authoName) {
		this.authoName = authoName;
	}
	private String authoName;
	
	
}
