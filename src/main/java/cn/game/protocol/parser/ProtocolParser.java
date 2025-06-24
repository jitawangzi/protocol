package cn.game.protocol.parser;

import java.nio.ByteBuffer;

public interface ProtocolParser {

	public Object parseFrom(int msgID, byte[] data);

	public Object parseFrom(int msgID, ByteBuffer data);

	public int getMsgId(String name);

	public String getMsgName(int id);
}
