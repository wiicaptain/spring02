package Model;

public class UserMessage {
String name;
String message;
public UserMessage(String name, String message) {
	this.name = name;
	this.message = message;
}



@Override
public String toString() {
	return "UserMessage [name=" + name + ", message=" + message + "]";
}



public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}



}
