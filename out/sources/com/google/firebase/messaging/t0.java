package com.google.firebase.messaging;

import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class t0 extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f36592a;

    t0(String str) {
        super(str);
        this.f36592a = a(str);
    }

    private int a(String str) {
        if (str == null) {
            return 0;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        lowerCase.getClass();
        switch (lowerCase) {
            case "service_not_available":
                return 3;
            case "toomanymessages":
                return 4;
            case "invalid_parameters":
            case "missing_to":
                return 1;
            case "messagetoobig":
                return 2;
            default:
                return 0;
        }
    }
}
