package it.matteoavanzini.articles;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="posts")
public class Post {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="content")
	private String content;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="author_id")
	private Author author;
	
	@OneToMany(mappedBy="post", fetch=FetchType.LAZY)
	private List<Comment> comments;
	
	@ManyToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinTable(name="category_post", 
			   joinColumns = { @JoinColumn(name="id_post") }, 
			   inverseJoinColumns = { @JoinColumn(name="id_category") })
	private List<Category> categories;
	
	public Post() {
		categories = new ArrayList<Category>();
	}
	
	public void addCategory(Category category) {
		categories.add(category);
	}
	
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getContent() {
		return content;
	}
	public Author getAuthor() {
		return author;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	
}
