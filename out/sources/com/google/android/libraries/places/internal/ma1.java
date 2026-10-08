package com.google.android.libraries.places.internal;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes4.dex */
final class ma1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final oa1 f32932a = b(oa1.f33168a);

    private static oa1 b(String[] strArr) {
        sa1 sa1Var;
        try {
            sa1Var = ua1.f33874a;
        } catch (NoClassDefFoundError unused) {
            sa1Var = null;
        }
        if (sa1Var != null) {
            return sa1Var;
        }
        StringBuilder sb5 = new StringBuilder();
        for (String str : strArr) {
            try {
                return (oa1) Class.forName(str).getConstructor(null).newInstance(null);
            } catch (Throwable th4) {
                th = th4;
                sb5.append('\n');
                sb5.append(str);
                sb5.append(": ");
                if (th instanceof InvocationTargetException) {
                    th = th.getCause();
                }
                sb5.append(th);
            }
        }
        throw new IllegalStateException(sb5.insert(0, "No logging platforms found:").toString());
    }
}
