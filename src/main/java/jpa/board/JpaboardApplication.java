package jpa.board;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jpa.board.model.Board;
import jpa.board.repository.BoardRepository;

//많은 Spring Boot 개발자들은 항상 그들의 메인 클래스에 
//@Configuration, @EnableAutoConfiguration 그리고 @ComponetScan을 어노테이트한다. 
//이 어노테이션들은 자주 함께 사용된다. Spring Boot는 편의를 위해 @SpringBootApplication을 제공한다. 
//@SpringBootApplication 어노테이션은 @Configuration, @EnableAutoConfiguration 
//그리고 @ComponentScan을 디폴트 속성으로 함께 사용하는 것과 같다.

@SpringBootApplication
public class JpaboardApplication /*implements CommandLineRunner*/{

	
	public static void main(String[] args) {
		SpringApplication.run(JpaboardApplication.class, args);
		
	}


	/*@Autowired
	BoardRepository boardRepository;*/
	
/*	public void main(String[] args) {
		SpringApplication.run(JpaboardApplication.class, args);
	}*/


	/*public void run(String...args) {
		
		//테스트를 위해 글6개 입력
		Board b1 = new Board();
		b1.setContent("JPA강좌 추천해 주세요1~");
		b1.setName("홍길동1");		b1.setPasswd("1111");
		b1.setReadcount(0);		b1.setRegdate(new Date());
		b1.setReply(1);		b1.setReplylevel(0);
		b1.setReplystep(0);		b1.setTitle("강좌추천요망1");
		
		boardRepository.save(b1);
		
		Board b2 = new Board();
		b2.setContent("JPA강좌 추천해 주세요2~");
		b2.setName("홍길동2");		b2.setPasswd("1111");
		b2.setReadcount(0);		b2.setRegdate(new Date());
		b2.setReply(2);		b2.setReplylevel(0);
		b2.setReplystep(0);		b2.setTitle("강좌추천요망2");
		
		boardRepository.save(b2);
			
		Board b3 = new Board();
		b3.setContent("JPA강좌 추천해 주세요3~");
		b3.setName("홍길동3");		b3.setPasswd("1111");
		b3.setReadcount(0);		b3.setRegdate(new Date());
		b3.setReply(3);		b3.setReplylevel(0);
		b3.setReplystep(0);		b3.setTitle("강좌추천요망3");
		
		boardRepository.save(b3);
		
		Board b4 = new Board();
		b4.setContent("OJC로 가세요...");
		b4.setName("홍길동4");		b4.setPasswd("1111");
		b4.setReadcount(0);		b4.setRegdate(new Date());
		b4.setReply(6);		b4.setReplylevel(1);
		b4.setReplystep(1);		b4.setTitle("[답변]강좌추천요망6");
		
		boardRepository.save(b4);
		
		Board b5 = new Board();
		b5.setContent("OJC로 가세요...");
		b5.setName("홍길동5");		b5.setPasswd("1111");
		b5.setReadcount(0);		b5.setRegdate(new Date());
		b5.setReply(2);		b5.setReplylevel(1);
		b5.setReplystep(1);		b5.setTitle("[답변]강좌추천요망2");
		
		boardRepository.save(b5);
		
		Board b6 = new Board();
		b6.setContent("JPA강좌 추천해 주세요6~");
		b6.setName("홍길동6");		b6.setPasswd("1111");
		b6.setReadcount(0);		b6.setRegdate(new Date());
		b6.setReply(6);		b6.setReplylevel(0);
		b6.setReplystep(0);		b6.setTitle("강좌추천요망6");
		
		boardRepository.save(b6);	
		
	}*/
}
