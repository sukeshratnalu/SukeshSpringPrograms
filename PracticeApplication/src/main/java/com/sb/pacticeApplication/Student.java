package com.sb.pacticeApplication;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean/*, DisposableBean*/ {
  private int id;
  private String name;

  public Student() {
    System.out.println("calling default constructor...........!");
    System.out.println(name);
  }

  public Student(int id) {
    this.id = id;
  }

  public Student(String name) {
    this.name = name;
  }

  public Student(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public void setName(String name){
    this.name = name;
  }

  public void getStudent(){
    System.out.println("getting Student data");
    System.out.println(id+" "+name);
  }

  public void afterPropertiesSet() throws Exception {
    System.out.println("calling afterPropertiesSet");
  }

  public void init(){
    System.out.println("Bean is going through init.");
  }

  public void destroy() throws Exception {
    System.out.println("Bean will destroy now.");
  }
}
