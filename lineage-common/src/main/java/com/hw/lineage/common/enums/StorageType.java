package com.hw.lineage.common.enums;


import com.hw.lineage.common.enums.basic.StringEnum;

/**
 * @description: StorageType
 * @author: HamaWhite
 */
public enum StorageType implements StringEnum<StorageType> {

    FUNCTION("functions"),
    CATALOG("catalogs");

    private final String value;

    StorageType(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }
}
