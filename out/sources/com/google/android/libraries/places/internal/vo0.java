package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class vo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f34078a = new ArrayList(20);

    public final vo0 a(String str, String str2) {
        int i15 = 0;
        for (int i16 = 0; i16 < str.length(); i16++) {
            char cCharAt = str.charAt(i16);
            if (cCharAt <= 31 || cCharAt >= 127) {
                throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i16), str));
            }
        }
        if (str2 == null) {
            throw new IllegalArgumentException("value == null");
        }
        for (int i17 = 0; i17 < str2.length(); i17++) {
            char cCharAt2 = str2.charAt(i17);
            if (cCharAt2 <= 31 || cCharAt2 >= 127) {
                throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header value: %s", Integer.valueOf(cCharAt2), Integer.valueOf(i17), str2));
            }
        }
        while (true) {
            List list = this.f34078a;
            if (i15 >= list.size()) {
                list.add(str);
                list.add(str2.trim());
                return this;
            }
            if (str.equalsIgnoreCase((String) list.get(i15))) {
                list.remove(i15);
                list.remove(i15);
                i15 -= 2;
            }
            i15 += 2;
        }
    }

    public final wo0 b() {
        return new wo0(this, null);
    }

    final /* synthetic */ List c() {
        return this.f34078a;
    }
}
