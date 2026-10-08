package com.google.android.gms.internal.oss_licenses;

/* JADX INFO: loaded from: classes3.dex */
final class k0 {
    static void a(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 != null) {
            return;
        }
        String string = obj.toString();
        StringBuilder sb5 = new StringBuilder(string.length() + 26);
        sb5.append("null value in entry: ");
        sb5.append(string);
        sb5.append("=null");
        throw new NullPointerException(sb5.toString());
    }
}
