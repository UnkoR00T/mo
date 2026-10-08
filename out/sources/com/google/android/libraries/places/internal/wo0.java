package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class wo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String[] f34187a;

    public final int a() {
        return this.f34187a.length >> 1;
    }

    public final String b(int i15) {
        int i16 = i15 + i15;
        if (i16 < 0) {
            return null;
        }
        String[] strArr = this.f34187a;
        if (i16 >= strArr.length) {
            return null;
        }
        return strArr[i16];
    }

    public final String c(int i15) {
        int i16 = i15 + i15 + 1;
        if (i16 < 0) {
            return null;
        }
        String[] strArr = this.f34187a;
        if (i16 >= strArr.length) {
            return null;
        }
        return strArr[i16];
    }

    public final String toString() {
        StringBuilder sb5 = new StringBuilder();
        int iA = a();
        for (int i15 = 0; i15 < iA; i15++) {
            sb5.append(b(i15));
            sb5.append(": ");
            sb5.append(c(i15));
            sb5.append("\n");
        }
        return sb5.toString();
    }
}
