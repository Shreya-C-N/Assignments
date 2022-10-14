package valtechspring.orm;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@DiscriminatorValue("ax")
public class Article extends Book {
	
private String url;

public Article() {
	
}

public Article(String url) {
	super();
	this.url = url;
}

public String getUrl() {
	return url;
}

public void setUrl(String url) {
	this.url = url;
}




}
