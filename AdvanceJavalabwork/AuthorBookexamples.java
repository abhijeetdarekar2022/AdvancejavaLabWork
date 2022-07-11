package cadc.abhi;

import java.util.ArrayList;
import java.util.List;

import cdac.abhi.dao.GenericDao;
import cdac.abhi.entity.Author;
import cdac.abhi.entity.Book;

public class AuthorBookexamples {
	public static void main (String [] args) {
	
	GenericDao dao = new GenericDao();
	/*
	Author author = new Author();
	author.setName("Darekar");
	author.setEmail("Darekar@gmail.com");
	dao.save(author);
	*/
	
	
	Book book = new Book();
	book.setName("Advance Java");
	book.setCost(2000);

	List<Author> authors = new ArrayList<Author>();
	
	authors.add((Author)dao.fetchById(Author.class, 1));
	authors.add((Author)dao.fetchById(Author.class, 2));
	
	book.setAuthor(authors);
	dao.save(book);
	
	}
}
