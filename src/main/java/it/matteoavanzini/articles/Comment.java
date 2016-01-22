package it.matteoavanzini.articles;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="comments")
public class Comment {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name="author_id")
	private Author author;
	
	@ManyToOne
	@JoinColumn(name="post_id")
	private Post post;
	
	@Column(name="content")
	private String content;
	
	public int getId() {
		return id;
	}
	public Author getAuthor() {
		return author;
	}
	public Post getPost() {
		return post;
	}
	public String getContent() {
		return content;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public void setPost(Post post) {
		this.post = post;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
}
