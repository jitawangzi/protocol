package cn.game.protocol.manual;

public enum MountainNodeType {
    Start(0),
    Battle(1),
    Event(2),
    Shop(3),
    Hp(4),
    Boss(5),
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
