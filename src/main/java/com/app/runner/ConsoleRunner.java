package com.app.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repo.ProductRepository;
@Component
public class ConsoleRunner implements CommandLineRunner {
	@Autowired
	private ProductRepository repo;

	@Override
	public void run(String... args) throws Exception {
	/*	repo.save(new Product(10,"aa",33.33));
		repo.save(new Product(11,"aa",33.33));
		repo.save(new Product(12,"aa",33.33));
		repo.save(new Product(13,"aa",33.33));
		//update call
		repo.save(new Product(13,"bb",44.33));
		//bulk insert
		List<Product> prds=Arrays.asList(
				new Product(101,"RR",55.33),
				new Product(102,"ss",53.33),
				new Product(103,"TT",63.33)
				);
				repo.saveAll(prds);*/
		//fetch one row
	/*	Optional<Product> p=repo.findById(101);
		if(p.isPresent()) {
			Product prd=p.get();
			System.out.println(prd.getProdCode());
		}else {
			System.out.println("Row Not Found");
		}*/
		//fetching multiple rows
		List<Product> list=repo.findAll();
				list.forEach(System.out::println);
				
			///delete operation 
				repo.deleteById(10);
				repo.deleteAll();
				repo.deleteAllInBatch();

		
	}

}
