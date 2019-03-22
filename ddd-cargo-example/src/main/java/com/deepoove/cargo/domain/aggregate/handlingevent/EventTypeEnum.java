package com.deepoove.cargo.domain.aggregate.handlingevent;

public enum EventTypeEnum {
    RECIEVE(0), LOAD(1), UNLOAD(2), END(3);

    int index;

    private EventTypeEnum(int i) {
        this.index = i;
    }

    public static EventTypeEnum of(int i) {
        EventTypeEnum[] values = EventTypeEnum.values();
        for (EventTypeEnum type : values) {
            if (type.index == i) return type;
        }
        return null;
    }

    public int index() {
        return index;
    }
}
