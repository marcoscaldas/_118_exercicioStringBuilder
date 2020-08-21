package entitites;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); //declara essa costante para nao ter que repetir a cada post
	
	private Date moment;
	private String title;
	private String content;
	private Integer likes;

	private List<Comment> comments = new ArrayList<>(); // implementar a associacao
	// a lista/colecao  nao coloca no construtor, fazer o metodo add e remove
	
	public Post() {
		
	}

	public Post(Date moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	} 

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void addComment(Comment comment) {// criado na mao para adicionar comentarios
		comments.add(comment);
	}
	public void removeComment(Comment comment) {// criado na mao para remover comentarios
		comments.remove(comment);
	}
	/*public void setComments(List<Comment> comments) {
		this.comments = comments;
	}NAO PODE TER ESSE METODO POIS UMA LISTA NAO PODE SER MODIFICADA*/
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(title +"\n" );     //appen significa acrescentar no final
		sb.append(likes);
		sb.append(" Likes - " );
		sb.append(sdf.format(moment)+ "\n");
		sb.append(content + "\n");
		sb.append("Comments: \n");
		for (Comment c : comments) {
			sb.append(c.getText() + "\n");
		}
		return sb.toString();
	}
	
}
