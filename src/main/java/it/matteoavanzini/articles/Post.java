package it.matteoavanzini.articles;

public class Post {
	private int id;
	private String title;
	private String content;
	private Author author;
	
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
