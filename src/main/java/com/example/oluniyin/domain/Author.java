package com.example.oluniyin.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Author implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4746494555596690643L;
	@Id
	@GeneratedValue
	private Long id;
	private String firstName;
	private String lastName;

	@OneToMany(mappedBy = "author")
	private List<Post> posts;

	@SuppressWarnings("unused")
	private Author() {

	}

	public Author(String first, String last) {
		this.setFirstName(first);
		this.setLastName(last);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Auteur [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}



}
