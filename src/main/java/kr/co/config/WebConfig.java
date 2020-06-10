package kr.co.config;

import javax.servlet.Filter;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

@Configuration
public class WebConfig extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {
	// getRootConfigClasses 클래스는 'root-context.xml'을 대신하는 클래스를 지정하는데 예제는 RootConfig
	// 클래스를 사용하므로
	// 아래와 같이 메서드의 내용을 변경한다.
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { RootConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { ServletConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

	@Override
	protected void customizeRegistration(Dynamic registration) {
		registration.setInitParameter("throwExceptionIfNoHandlerFound", "true");
	}

	@Override
	protected Filter[] getServletFilters() {
		CharacterEncodingFilter en = new CharacterEncodingFilter();
		en.setEncoding("UTF-8");
		en.setForceEncoding(true);
		return new Filter[] {en};
//		CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
//		encodingFilter.setEncoding("UTF-8");
//		return new Filter[] { encodingFilter };
	}

}
