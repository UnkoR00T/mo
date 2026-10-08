package com.google.android.gms.common.util;

/* JADX INFO: loaded from: classes3.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f29058a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final char[] f29059b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String a(byte[] bArr, boolean z15) {
        int length = bArr.length;
        StringBuilder sb5 = new StringBuilder(length + length);
        for (int i15 = 0; i15 < length && (!z15 || i15 != length - 1 || (bArr[i15] & 255) != 0); i15++) {
            char[] cArr = f29058a;
            sb5.append(cArr[(bArr[i15] & 240) >>> 4]);
            sb5.append(cArr[bArr[i15] & 15]);
        }
        return sb5.toString();
    }
}
