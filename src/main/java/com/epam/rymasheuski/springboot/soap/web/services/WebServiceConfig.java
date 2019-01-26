package com.epam.rymasheuski.springboot.soap.web.services;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class WebServiceConfig {

  @Bean
  public ServletRegistrationBean messageDispatcherServlet(ApplicationContext context) {
    MessageDispatcherServlet messageDispatcherServlet = new MessageDispatcherServlet();
    messageDispatcherServlet.setApplicationContext(context);
    messageDispatcherServlet.setTransformWsdlLocations(true);
    return new ServletRegistrationBean(messageDispatcherServlet, "/ws/*");
  }
  
  @Bean(name = "contacts")
  public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema contactsSchema) {
    DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
    definition.setPortTypeName("ContactsPort");
    definition.setTargetNamespace("http://services.web.soap.springboot.rymasheuski.epam.com/contacts");
    definition.setLocationUri("/ws");
    definition.setSchema(contactsSchema);
    return definition;
  }

  @Bean
  public XsdSchema contactsSchema() {
    return new SimpleXsdSchema(new ClassPathResource("contacts.xsd"));
  }
}