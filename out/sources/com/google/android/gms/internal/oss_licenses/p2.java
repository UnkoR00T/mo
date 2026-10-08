package com.google.android.gms.internal.oss_licenses;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes3.dex */
public final class p2 extends e2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set f30864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final x1 f30865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final n2 f30866d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f30867e = 0;

    static {
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(l1.f30816a, o1.f30856a, p1.f30863a)));
        f30864b = setUnmodifiableSet;
        f30865c = a2.a(setUnmodifiableSet).b();
        f30866d = new n2(null);
    }

    /* synthetic */ p2(String str, String str2, boolean z15, int i15, Level level, Set set, x1 x1Var, byte[] bArr) {
        super(str2);
        if (str2.length() > 23) {
            int i16 = -1;
            for (int length = str2.length() - 1; length >= 0; length--) {
                char cCharAt = str2.charAt(length);
                if (cCharAt == '.' || cCharAt == '$') {
                    i16 = length;
                    break;
                }
            }
            str2 = str2.substring(i16 + 1);
        }
        String strConcat = "".concat(String.valueOf(str2));
        strConcat.substring(0, Math.min(strConcat.length(), 23));
    }

    public static n2 b() {
        return f30866d;
    }
}
