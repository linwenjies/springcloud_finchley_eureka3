package com.lwj.eureka.listener;

import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceCanceledEvent;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceRegisteredEvent;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceRenewedEvent;
import org.springframework.cloud.netflix.eureka.server.event.EurekaRegistryAvailableEvent;
import org.springframework.cloud.netflix.eureka.server.event.EurekaServerStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * spring cloud自身提供了一套事件监控Listener，我们可以定制开发，在一些特殊情况下发送邮件或者进行其他操作
 * @author linwenjie
 *
 */
@Component
public class EurekaStateChangeListener {

	@EventListener
	public void listen(EurekaInstanceCanceledEvent event) {
		//服务状态变为down的时候不会触发这个事件，只有服务下线才会触发
		System.err.println(event.getServerId() + "\t" + event.getAppName() + " 服务下线 ");
	}
	
	@EventListener
	public void listen(EurekaInstanceRegisteredEvent event) {
		System.err.println(event.getInstanceInfo().getAppName() + " 进行注册  ");
	}
	
	@EventListener
	public void listen(EurekaInstanceRenewedEvent event) {
		System.err.println(event.getServerId() + "\t" + event.getAppName() + " 服务进行续约 ");
	}
	
	@EventListener
	public void listen(EurekaRegistryAvailableEvent event) {
		System.err.println(" 注册中心 启动 ");
	}
	
	@EventListener
	public void listen(EurekaServerStartedEvent event) {
		System.err.println(" EurekaServer 启动  ");
	}
	
}
