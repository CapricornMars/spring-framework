package test.lihp;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import test.config.AppConfig;

/**
 * @author luoxin
 * @Description:
 * @date 2019/9/24 15:08
 */

public class RunTest {
	// 加载类，查看类的初始化过程
	@Test
	public void runTest(){
		AnnotationConfigApplicationContext ct = new AnnotationConfigApplicationContext(AppConfig.class);
		CityService cityService = (CityService)ct.getBean("cityService");
		cityService.setName("张三");
		cityService.setLocation("北京");
		System.out.println(cityService);
	}
}
