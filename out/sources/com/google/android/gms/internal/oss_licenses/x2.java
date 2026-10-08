package com.google.android.gms.internal.oss_licenses;

/* JADX INFO: loaded from: classes3.dex */
enum x2 {
    BOOLEAN,
    STRING,
    LONG,
    DOUBLE;

    static /* synthetic */ x2 b(Object obj) {
        if (obj instanceof String) {
            return STRING;
        }
        if (obj instanceof Boolean) {
            return BOOLEAN;
        }
        if (obj instanceof Long) {
            return LONG;
        }
        if (obj instanceof Double) {
            return DOUBLE;
        }
        throw new AssertionError("invalid tag type: ".concat(String.valueOf(obj.getClass())));
    }
}
