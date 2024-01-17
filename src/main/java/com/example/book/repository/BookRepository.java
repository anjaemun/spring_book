package com.example.book.repository;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.book.dto.BookDTO;

@Repository
public class BookRepository {


	@Autowired
	private SqlSessionTemplate sql;

	public void save(BookDTO bookDTO) {
		// TODO Auto-generated method stub
		sql.insert("Book.save",bookDTO);
	}

	public List<BookDTO> findAll() {
		// TODO Auto-generated method stub
		return sql.selectList("Book.list");
	}

	public BookDTO findById(Long id) {
		// TODO Auto-generated method stub
		return sql.selectOne("Book.findById",id);
	}
}
