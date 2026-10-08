package io.sentry.util;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class y {
    public static boolean a(List<String> list, String str) {
        if (list.isEmpty()) {
            return false;
        }
        for (String str2 : list) {
            if (str.contains(str2)) {
                return true;
            }
            try {
                if (str.matches(str2)) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
