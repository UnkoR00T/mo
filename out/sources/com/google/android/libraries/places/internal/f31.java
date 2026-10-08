package com.google.android.libraries.places.internal;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class f31 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x004c A[RETURN] */
    public static int a(String str) {
        if (str == null) {
            return 13;
        }
        switch (str) {
            case "REQUEST_DENIED":
                return 9011;
            case "INVALID_REQUEST":
                return 9012;
            case "ZERO_RESULTS":
                return 0;
            case "OK":
                return 0;
            case "NOT_FOUND":
                return 9013;
            case "OVER_QUERY_LIMIT":
                return 9010;
            default:
                return 13;
        }
    }

    public static String b(String str, String str2) {
        return TextUtils.isEmpty(str2) ? str : str2;
    }
}
