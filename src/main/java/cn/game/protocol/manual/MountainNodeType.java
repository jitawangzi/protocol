package cn.game.protocol.manual;

public enum MountainNodeType {
    Start(0),
    Easy(1),
    Hard(2),
    Boss(3),
    Hp(4),
    Shop(5),
    Event(6),
    ;
    private int type;
    MountainNodeType(int type) {
        this.type = type;
    }
    public int getType() {
        return type;
    }
    public static MountainNodeType get(int type) {
        for (MountainNodeType value : values()) {
            if (value.getType() == type) {
                return value;
            }
        }
        return null;
    }
}
