package _01.hello.primefaces;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "personBeanData")
public class PersonBeanData {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
