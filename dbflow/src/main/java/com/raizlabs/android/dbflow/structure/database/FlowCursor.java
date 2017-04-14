package com.raizlabs.android.dbflow.structure.database;

import android.database.Cursor;
import android.database.CursorWrapper;
import android.support.annotation.NonNull;

public class FlowCursor extends CursorWrapper {

    public static FlowCursor from(Cursor cursor) {
        if (cursor instanceof FlowCursor) {
            return (FlowCursor) cursor;
        } else {
            return new FlowCursor(cursor);
        }
    }

    private FlowCursor(@NonNull Cursor cursor) {
        super(cursor);
    }

    public String getStringOrDefault(int index, String defValue) {
        if (index != -1 && !getWrappedCursor().isNull(index)) {
            return getWrappedCursor().getString(index);
        } else {
            return defValue;
        }
    }

    public String getStringOrDefault(String columnName, String defValue) {
        return getStringOrDefault(getWrappedCursor().getColumnIndex(columnName), defValue);
    }

    public int getIntOrDefault(int index, int defValue) {
        if (index != -1 && !getWrappedCursor().isNull(index)) {
            return getWrappedCursor().getInt(index);
        } else {
            return defValue;
        }
    }

    public int getIntOrDefault(String columnName, int defValue) {
        return getIntOrDefault(getWrappedCursor().getColumnIndex(columnName), defValue);
    }

    public double getDoubleOrDefault(int index, double defValue) {
        if (index != -1 && !getWrappedCursor().isNull(index)) {
            return getWrappedCursor().getDouble(index);
        } else {
            return defValue;
        }
    }

    public double getDoubleOrDefault(String columnName, double defValue) {
        return getDoubleOrDefault(getWrappedCursor().getColumnIndex(columnName), defValue);
    }

    public float getFloatOrDefault(int index, float defValue) {
        if (index != -1 && !getWrappedCursor().isNull(index)) {
            return getWrappedCursor().getFloat(index);
        } else {
            return defValue;
        }
    }

    public float getFloatOrDefault(String columnName, float defValue) {
        return getFloatOrDefault(getWrappedCursor().getColumnIndex(columnName), defValue);
    }

    public long getLongOrDefault(int index, long defValue) {
        if (index != -1 && !getWrappedCursor().isNull(index)) {
            return getWrappedCursor().getLong(index);
        } else {
            return defValue;
        }
    }

    public long getLongOrDefault(String columnName, long defValue) {
        return getLongOrDefault(getWrappedCursor().getColumnIndex(columnName), defValue);
    }

    public short getShortOrDefault(int index, short defValue) {
        if (index != -1 && !getWrappedCursor().isNull(index)) {
            return getWrappedCursor().getShort(index);
        } else {
            return defValue;
        }
    }

    public short getShortOrDefault(String columnName, short defValue) {
        return getShortOrDefault(getWrappedCursor().getColumnIndex(columnName), defValue);
    }

    public byte[] getBlobOrDefault(int index, byte[] defValue) {
        if (index != -1 && !getWrappedCursor().isNull(index)) {
            return getWrappedCursor().getBlob(index);
        } else {
            return defValue;
        }
    }

    public byte[] getBlobOrDefault(String columnName, byte[] defValue) {
        return getBlobOrDefault(getWrappedCursor().getColumnIndex(columnName), defValue);
    }

    public boolean getBooleanOrDefault(int index, boolean defValue) {
        if (index != -1 && !getWrappedCursor().isNull(index)) {
            return getWrappedCursor().getInt(index) == 1;
        } else {
            return defValue;
        }
    }

    public boolean getBooleanOrDefault(String columnName, boolean defValue) {
        return getBooleanOrDefault(getWrappedCursor().getColumnIndex(columnName), defValue);
    }
}