package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes3.dex */
final class b3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f29191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f29192b = 0;

    b3(String str) {
        this.f29191a = str;
    }

    final boolean a() {
        return this.f29192b < this.f29191a.length();
    }

    final int b() {
        String str = this.f29191a;
        int i15 = this.f29192b;
        this.f29192b = i15 + 1;
        char cCharAt = str.charAt(i15);
        if (cCharAt < 55296) {
            return cCharAt;
        }
        int i16 = cCharAt & 8191;
        int i17 = 13;
        while (true) {
            String str2 = this.f29191a;
            int i18 = this.f29192b;
            this.f29192b = i18 + 1;
            char cCharAt2 = str2.charAt(i18);
            if (cCharAt2 < 55296) {
                return i16 | (cCharAt2 << i17);
            }
            i16 |= (cCharAt2 & 8191) << i17;
            i17 += 13;
        }
    }
}
