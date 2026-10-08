package com.google.android.gms.internal.oss_licenses;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
final class b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final d2 f30752a = b(d2.f30767a);

    private static d2 b(String[] strArr) {
        h2 h2Var;
        try {
            h2Var = j2.f30799a;
        } catch (NoClassDefFoundError unused) {
            h2Var = null;
        }
        if (h2Var != null) {
            return h2Var;
        }
        StringBuilder sb5 = new StringBuilder();
        for (String str : strArr) {
            try {
                return (d2) Class.forName(str).getConstructor(null).newInstance(null);
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
