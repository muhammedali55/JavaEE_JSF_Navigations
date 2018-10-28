package com.muhammet;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="indexBean")
@SessionScoped
public class indexBean  implements Serializable{

	public String sayfayaGit() {
		return "SayfaYeni";
	}
	
}
