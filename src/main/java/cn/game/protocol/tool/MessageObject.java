package cn.game.protocol.tool;

import java.util.ArrayList;
import java.util.List;

import cn.game.util.HexUtil;

public class MessageObject implements Comparable<MessageObject> {
	private String longName;
	/** 16进制 */
	private String id;
	private String shortName ; 
	private String prefix ; 
	private String comment ; 
	private boolean isEnum ; 
	
	private List<MessageField> fields = new ArrayList<MessageObject.MessageField>(); 

	public String camelize(String s) {
		String str = s;
		if ((s.startsWith("_")) && (s.length() > 1)) {
			str = s.substring(1);
		}
		StringBuffer sb = new StringBuffer();
		for (String e : str.split("_"))
			if (e.length() == 1) {
				sb.append(e);
			} else {
				sb.append(e.substring(0, 1).toUpperCase());
				sb.append(e.substring(1).toLowerCase());
			}
		return sb.toString();
	}
	public void addField(MessageField field){
		this.fields.add(field) ; 
	}
	/** 
	 * 是否是请求消息
	 * @return
	 */
	public boolean isRequest() {

		return shortName.indexOf("Request") >= 0;
	}

	public boolean isResponse() {

		return shortName.indexOf("Response") >= 0;
	}
	/** 
	 * 如果是请求协议，则返回 返回的协议id
	 * 如果是返回协议，则返回 请求协议的id
	 * @return 16进制协议id
	 */
	public String getPairId() {
		// 请求id+1是返回id
 		if (isRequest()) {
			int reqId = Integer.parseInt(id.substring(2), 16);
			int resId = reqId + 1;
			String resIdHex = HexUtil.toHexString(resId);
			return resIdHex;
		} else if (isResponse()) {
			int resId = Integer.parseInt(id.substring(2), 16);
			int reqId = resId - 1;
			String reqIdHex = HexUtil.toHexString(reqId);
			return reqIdHex;
		}
		return null; // push 类的协议
	}

	public boolean isPush() {

		return shortName.indexOf("Push") >= 0;
	}
	/**   
	 * 
	 * 2021年9月1日 下午12:33:03
	 * @author SYQ
	 */
	public static class MessageField{
		private String type ; 
		private String name ; 
		private boolean isArray ;
		/** 枚举的index */
		private String index ; 
		private String desc ; 
		
		public String getType() {
			return type;
		}
		
		public void setType(String type) {
			this.type = type;
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public boolean isArray() {
			return isArray;
		}
		
		public void setArray(boolean isArray) {
			this.isArray = isArray;
		}

		
		public String getIndex() {
			return index;
		}

		
		public void setIndex(String index) {
			this.index = index;
		}

		
		public String getDesc() {
			return desc;
		}

		
		public void setDesc(String desc) {
			this.desc = desc;
		} 
		
		
	}
	public String getLongName() {
		return longName;
	}

	public void setLongName(String longName) {
		this.longName = longName;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public int compareTo(MessageObject o) {
		return this.getShortName().compareTo(o.getShortName());
	}
	
	public List<MessageField> getFields() {
		return fields;
	}
	
	public boolean isEnum() {
		return isEnum;
	}
	
	public void setEnum(boolean isEnum) {
		this.isEnum = isEnum;
	}
	
}
