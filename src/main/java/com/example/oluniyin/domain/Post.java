package com.example.oluniyin.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Post implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -58390506078017532L;

	@Id
	@GeneratedValue
	private Long id;
	@Column
	private String title;
	@Column(columnDefinition = "TEXT")
	private String body;
	@Column
	private Date posteOn;

	@ManyToOne
	private Author author;

	@SuppressWarnings("unused")
	private Post() {

	}

	public Post(String title) {
		this.setTitle(title);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Date getPosteOn() {
		return posteOn;
	}

	public void setPosteOn(Date posteOn) {
		this.posteOn = posteOn;
	}
	

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Publication [id=" + id + ", title=" + title + ", body=" + body + ", posteOn=" + posteOn + "]";
	}

}
