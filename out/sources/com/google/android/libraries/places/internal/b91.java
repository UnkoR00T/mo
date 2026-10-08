package com.google.android.libraries.places.internal;

import java.lang.reflect.Array;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class b91 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final char[][] f31774b = (char[][]) Array.newInstance((Class<?>) Character.TYPE, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final char[][] f31775a;

    private b91(char[][] cArr) {
        this.f31775a = cArr;
    }

    public static b91 a(Map map) {
        char[][] cArr;
        zj.p.q(map);
        if (map.isEmpty()) {
            cArr = f31774b;
        } else {
            char[][] cArr2 = new char[((Character) Collections.max(map.keySet())).charValue() + 1][];
            for (Character ch4 : map.keySet()) {
                cArr2[ch4.charValue()] = ((String) map.get(ch4)).toCharArray();
            }
            cArr = cArr2;
        }
        return new b91(cArr);
    }

    final char[][] b() {
        return this.f31775a;
    }
}
