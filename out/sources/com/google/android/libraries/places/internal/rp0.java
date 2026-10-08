package com.google.android.libraries.places.internal;

import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
final class rp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f33590a = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f33591b = new String[64];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f33592c = new String[256];

    static {
        int i15 = 0;
        for (int i16 = 0; i16 < 256; i16++) {
            f33592c[i16] = String.format("%8s", Integer.toBinaryString(i16)).replace(' ', '0');
        }
        String[] strArr = f33591b;
        strArr[0] = "";
        strArr[1] = "END_STREAM";
        int[] iArr = {1};
        strArr[8] = "PADDED";
        for (int i17 = 0; i17 <= 0; i17++) {
            int i18 = iArr[i17];
            String[] strArr2 = f33591b;
            strArr2[i18 | 8] = String.valueOf(strArr2[i18]).concat("|PADDED");
        }
        String[] strArr3 = f33591b;
        strArr3[4] = "END_HEADERS";
        strArr3[32] = "PRIORITY";
        strArr3[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        int i19 = 0;
        while (i19 < 3) {
            int i25 = iArr2[i19];
            for (int i26 = i15; i26 <= 0; i26++) {
                int i27 = iArr[i26];
                int i28 = i27 | i25;
                String[] strArr4 = f33591b;
                String str = strArr4[i27];
                String str2 = strArr4[i25];
                StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
                sb5.append(str);
                sb5.append("|");
                sb5.append(str2);
                strArr4[i28] = sb5.toString();
                int i29 = i28 | 8;
                String str3 = strArr4[i27];
                String str4 = strArr4[i25];
                StringBuilder sb6 = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length() + 7);
                sb6.append(str3);
                sb6.append("|");
                sb6.append(str4);
                sb6.append("|PADDED");
                strArr4[i29] = sb6.toString();
            }
            i19++;
            i15 = 0;
        }
        for (int i35 = 0; i35 < 64; i35++) {
            String[] strArr5 = f33591b;
            if (strArr5[i35] == null) {
                strArr5[i35] = f33592c[i35];
            }
        }
    }

    rp0() {
    }

    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    static String a(boolean z15, int i15, int i16, byte b15, byte b16) {
        String strReplace;
        String str = b15 < 10 ? f33590a[b15] : String.format("0x%02x", Byte.valueOf(b15));
        if (b16 == 0) {
            strReplace = "";
        } else if (b15 == 2 || b15 == 3) {
            strReplace = f33592c[b16];
        } else if (b15 == 4 || b15 == 6) {
            strReplace = b16 == 1 ? "ACK" : f33592c[b16];
        } else if (b15 == 7 || b15 == 8) {
            strReplace = f33592c[b16];
        } else {
            String str2 = b16 < 64 ? f33591b[b16] : f33592c[b16];
            if (b15 == 5) {
                if ((b16 & 4) != 0) {
                    strReplace = str2.replace("HEADERS", "PUSH_PROMISE");
                } else {
                    strReplace = str2;
                }
            } else if (b15 != 0 || (b16 & 32) == 0) {
                strReplace = str2;
            } else {
                strReplace = str2.replace("PRIORITY", "COMPRESSED");
            }
        }
        return String.format(Locale.US, "%s 0x%08x %5d %-13s %s", true != z15 ? ">>" : "<<", Integer.valueOf(i15), Integer.valueOf(i16), str, strReplace);
    }
}
