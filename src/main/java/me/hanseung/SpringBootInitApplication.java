package me.hanseung;

import me.hanseung.listener.SampleListener;
import me.hanseung.object.Phone2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
public class SpringBootInitApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(SpringBootInitApplication.class);
//		application.addListeners(new SampleListener()); // ApplicationContext 가 구동되기 전에 실행되는 listener 같은 객체들은 application에 직접add해야 함
		application.run(args);

//		SpringApplication.run(SpringBootInitApplication.class, args);

//		SpringApplication application = new SpringApplication(SpringBootInitApplication.class);
//		application.setWebApplicationType(WebApplicationType.NONE); // web application 을 띄우지 않겠다.
//		application.run(args);


	}

	/*
	@Value("${server.port.http}")
	private int httpServerPort;

	// HTTP/HTTPS multi connector 구현을 위한 추가 코드
	@Bean
	public ServletWebServerFactory serverFactory() {
		TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();
		tomcat.addAdditionalTomcatConnectors(createStandardConnector());
		return tomcat;
	}

	private Connector createStandardConnector() {
		Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
		connector.setPort(httpServerPort);
		return connector;
	}
	*/

//	@Bean
//	public Holoman holoman() {
//		Holoman holoman = new Holoman();
//		holoman.setName("suho");
//		holoman.setHowLong(60);
//		return holoman;
//	}

}
