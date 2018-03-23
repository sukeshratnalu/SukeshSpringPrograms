package com.sb.pacticeApplication;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class TestLifeCycle implements BeanPostProcessor {
  public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
    System.out.println("BeforeInitialization : " + s);
    return o;
  }

  public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
    System.out.println("AfterInitialization : " + s);
    return o;
  }
}
