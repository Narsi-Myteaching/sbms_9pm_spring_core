package com.weshopify.feature.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.weshopify.feature"})
public class AppConfig {

	/*
	 * @Autowired private OrderDetails orderDetails;
	 */
	
	/*
	 * @Bean public Products product01() { Products product = new Products();
	 * product.setAvailable(true); product.setCategory("HomeAppliances");
	 * product.setName("Product-01"); product.setProductId(123); return product; }
	 * 
	 * @Bean public OrderDetails orderDetails() { OrderDetails orderDetail = new
	 * OrderDetails(); orderDetail.setOrderDetailsId("ORD-100"); Map<String,String>
	 * orderInfoMap = new HashMap<>(); orderInfoMap.put("product-01",
	 * "LG-4K-ULTRA-HD-SMART-TV"); orderInfoMap.put("product-02",
	 * "SAMSUNG-4K-ULTRA-HD-SMART-TV"); orderDetail.setOrdersInfo(orderInfoMap);
	 * 
	 * return orderDetail; }
	 * 
	 * @Bean public Order order() { Order order = new Order(orderDetails());
	 * order.setListOfProducts(Arrays.asList(product01())); return order; }
	 */
}
