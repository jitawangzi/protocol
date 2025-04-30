package cn.game.protocol.tool.obj;

public class HandlerParam {

	public String HandlerPackage;
	public String ClientHandlerPackage;
	public String Function;
	public String MessageModule;

	public String getHandlerPackage() {
		return HandlerPackage;
	}

	public void setHandlerPackage(String handlerPackage) {
		HandlerPackage = handlerPackage;
	}

	public String getFunction() {
		return Function;
	}

	public void setFunction(String function) {
		Function = function;
	}

	public String getMessageModule() {
		return MessageModule;
	}

	public void setMessageModule(String messageModule) {
		MessageModule = messageModule;
	}

	public String getClientHandlerPackage() {
		return ClientHandlerPackage;
	}

	public void setClientHandlerPackage(String clientHandlerPackage) {
		ClientHandlerPackage = clientHandlerPackage;
	}

}
