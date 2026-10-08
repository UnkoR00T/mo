package com.google.android.libraries.places.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ak.u0 f33472a = ak.u0.L("http", "https", "mailto", "ftp");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ak.u0 f33473b = ak.u0.Q("audio/3gpp2", "audio/3gpp", "audio/aac", "audio/midi", "audio/mp3", "audio/mp4", "audio/mpeg", "audio/oga", "audio/ogg", "audio/opus", "audio/x-m4a", "audio/x-matroska", "audio/x-wav", "audio/wav", "audio/webm", "image/bmp", "image/gif", "image/jpeg", "image/jpg", "image/png", "image/svg+xml", "image/tiff", "image/webp", "image/x-icon", "video/mpeg", "video/mp4", "video/ogg", "video/webm", "video/x-matroska", "font/ttf");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ak.u0 f33474c = ak.u0.C();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f33475d = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static q a(String str, q qVar) {
        char cCharAt;
        int i15;
        char cCharAt2;
        char cCharAt3;
        ak.u0 u0Var = f33474c;
        String strF = zj.c.f(str);
        ak.h2 it = f33472a.iterator();
        while (it.hasNext()) {
            if (strF.startsWith(String.valueOf((String) it.next()).concat(":"))) {
                return new q(str);
            }
        }
        if (!strF.startsWith("data:")) {
            Iterator<E> it4 = u0Var.iterator();
            while (it4.hasNext()) {
                if (strF.startsWith(String.valueOf(zj.c.f(((m) it4.next()).name()).replace('_', '-')).concat(":"))) {
                    return new q(str);
                }
            }
            for (int i16 = 0; i16 < str.length() && (cCharAt = str.charAt(i16)) != '#' && cCharAt != '/'; i16++) {
                if (cCharAt == ':') {
                    return qVar;
                }
                if (cCharAt == '?') {
                    break;
                }
            }
            return new q(str);
        }
        String strF2 = zj.c.f(str);
        if (strF2.startsWith("data:") && strF2.length() > 5) {
            int i17 = 5;
            while (i17 < strF2.length() && (cCharAt3 = strF2.charAt(i17)) != ';' && cCharAt3 != ',') {
                i17++;
            }
            if (f33473b.contains(strF2.substring(5, i17)) && strF2.startsWith(";base64,", i17) && (i15 = i17 + 8) < strF2.length()) {
                while (i15 < strF2.length() && (cCharAt2 = strF2.charAt(i15)) != '=') {
                    if ((cCharAt2 >= 'a' && cCharAt2 <= 'z') || ((cCharAt2 >= '0' && cCharAt2 <= '9') || cCharAt2 == '+' || cCharAt2 == '/')) {
                        i15++;
                    }
                }
                while (i15 < strF2.length()) {
                    if (strF2.charAt(i15) == '=') {
                        i15++;
                    }
                }
                return new q(str);
            }
        }
        return qVar;
    }
}
