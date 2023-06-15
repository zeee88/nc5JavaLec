package project1.spring.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebMvcConfig implements WebMvcConfigurer{

	//application properties에 설정해놓은 경로
	@Value(value = "${uploadPath}")
	private String uploadPath;
	
	//alt + shift + s => override method 클릭
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/images/**")	//웹에서 실제로 접근하는 경로(논리적인 경로)
		        .addResourceLocations(uploadPath);		//내 컴퓨터 드라이브의 실제 경로(물리적인 경로)를 기준으로 파일을 읽어온다. 
	}

	
}
