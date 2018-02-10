package chapter05;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Login114 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3392332554957095164L;

	private String username;
	private transient String password;
	public Login114(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("Username:"+username);
		sb.append("password:"+password);
		return sb.toString();
	}
	@Override
	protected Login114 clone() {
		Login114 login=null;
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		try {
			ObjectOutputStream oos=new ObjectOutputStream(baos);
			oos.writeObject(this);
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		ByteArrayInputStream bais=new ByteArrayInputStream(baos.toByteArray());
		try {
			ObjectInputStream bis=new ObjectInputStream(bais);
			login=(Login114) bis.readObject();
			bis.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return login;
	}
	
	
	
	
}
