package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="blog")
public class Blog {
	@Id
String id;
String Title;
String Description;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getTitle() {
	return Title;
}
public void setTitle(String title) {
	Title = title;
}
public String getDescription() {
	return Description;
}
public void setDescription(String description) {
	Description = description;
}

}
