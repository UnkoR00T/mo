package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public abstract class mx {
    static /* synthetic */ String b(int i15, int i16, byte b15, String str, String str2) {
        StringBuilder sb5 = new StringBuilder(String.valueOf(i16).length() + b15 + String.valueOf(i15).length());
        sb5.append(str);
        sb5.append(i16);
        sb5.append(str2);
        sb5.append(i15);
        return sb5.toString();
    }

    public abstract void a(byte[] bArr, int i15, int i16);
}
