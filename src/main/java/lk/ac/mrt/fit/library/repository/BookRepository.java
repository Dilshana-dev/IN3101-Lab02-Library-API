package lk.ac.mrt.fit.library.repository; 

import lk.ac.mrt.fit.library.model.Book; 
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> { } 