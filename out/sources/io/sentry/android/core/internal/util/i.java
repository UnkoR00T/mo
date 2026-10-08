package io.sentry.android.core.internal.util;

/* JADX INFO: loaded from: classes4.dex */
public class i {
    public static String a(Object obj) {
        if (obj == null) {
            return null;
        }
        String canonicalName = obj.getClass().getCanonicalName();
        return canonicalName != null ? canonicalName : obj.getClass().getSimpleName();
    }
}
