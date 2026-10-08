package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class jr0 {
    public static final void a(long j15, long j16, long j17) {
        if ((j16 | j17) < 0 || j16 > j15 || j15 - j16 < j17) {
            int length = String.valueOf(j15).length();
            StringBuilder sb5 = new StringBuilder(length + 13 + String.valueOf(j16).length() + 11 + String.valueOf(j17).length());
            sb5.append("size=");
            sb5.append(j15);
            sb5.append(" offset=");
            sb5.append(j16);
            sb5.append(" byteCount=");
            sb5.append(j17);
            throw new ArrayIndexOutOfBoundsException(sb5.toString());
        }
    }

    public static final boolean b(byte[] bArr, int i15, byte[] bArr2, int i16, int i17) {
        for (int i18 = 0; i18 < i17; i18++) {
            if (bArr[i18 + i15] != bArr2[i18 + i16]) {
                return false;
            }
        }
        return true;
    }

    public static final String c(int i15) {
        int i16 = 0;
        char[] cArr = {js0.a()[i15 >> 28], js0.a()[(i15 >> 24) & 15], js0.a()[(i15 >> 20) & 15], js0.a()[(i15 >> 16) & 15], js0.a()[(i15 >> 12) & 15], js0.a()[(i15 >> 8) & 15], js0.a()[(i15 >> 4) & 15], js0.a()[i15 & 15]};
        while (i16 < 8 && cArr[i16] == '0') {
            i16++;
        }
        return fu.r.z(cArr, i16, 8);
    }
}
