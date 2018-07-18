package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

public class BookingInquiry extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(BookingInquiry.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder)
	{
		return builder.sources(BookingInquiry.class);
	}
}
