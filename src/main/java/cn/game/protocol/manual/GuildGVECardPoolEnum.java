package cn.game.protocol.manual;

public enum GuildGVECardPoolEnum {
    /** 1级 */
    CardPool1(1),
    /** 2级 */
    CardPool2(2),
    /** 3级 */
    CardPool3(3),
    ;
     int type ;
    GuildGVECardPoolEnum(int i) {
        this.type = i;
    }
    public int getType() {
        return type;
    }
    public static GuildGVECardPoolEnum getByType(int type) {
        for (GuildGVECardPoolEnum value : values()) {
            if (value.type == type) {
                return value;
            }
        }
        return CardPool1;
    }
}
