package it.matteoavanzini.articles;

public class Comment {
	private int id;
	private Author author;
	private Post post;
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
