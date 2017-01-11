package org.empleodigital.struts.Aldi.actions;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.empleodigital.struts.Aldi.db.GestorUsuarios;
import org.empleodigital.struts.Aldi.jpa.Main;
import org.empleodigital.struts.Aldi.models.Cliente;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	private String user, pass;

	public String execute() throws Exception {

		if (GestorUsuarios.getCliente(user, pass) != null) {
			Map<String, Object> session = ActionContext.getContext().getSession();
			session.put("cliente", GestorUsuarios.getCliente(user, pass));
			return SUCCESS;
		}
		return ERROR;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

}
