package com.example.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.book.dto.BookDTO;
import com.example.book.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;

	public void save(BookDTO bookDTO) {
		// TODO Auto-generated method stub
		System.out.println("bookRepository.save()");
		System.out.println("bookDTO : " +bookDTO);
		bookRepository.save(bookDTO);
		
	}

	public List<BookDTO> findAll() {
		// TODO Auto-generated method stub
		
		return bookRepository.findAll();
	}

	public BookDTO findById(Long id) {
		// TODO Auto-generated method stub
		return bookRepository.findById(id);
	}

	public void delete(Long id) {
		bookRepository.delete(id);
		
	}

	public void update(BookDTO bookDTO) {
		// TODO Auto-generated method stub
		bookRepository.update(bookDTO);
	}
}
