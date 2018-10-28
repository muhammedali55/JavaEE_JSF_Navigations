package com.muhammet;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "kosulluBean")
@RequestScoped
public class KosulluGezinmeBean implements Serializable {
	@ManagedProperty(value = "#{param.sayfaUrlID}")
	private String sayfaUrlID;

	public String urlVer() {

		if (sayfaUrlID.equals(null))
			return "KosulluGezinme";
		else if (sayfaUrlID.equals("1"))
			return "kosulSayfa1";
		else if (sayfaUrlID.equals("2"))
			return "kosulSayfa2";
		else
			return "KosulluGensinme";
	}

	public String getSayfaUrlID() {
		return sayfaUrlID;
	}

	public void setSayfaUrlID(String sayfaUrlID) {
		this.sayfaUrlID = sayfaUrlID;
	}

}
