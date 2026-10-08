package com.google.android.libraries.places.internal;

import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class ur0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f33972a = 0;

    static {
        Logger.getLogger("okio.Okio");
    }

    public static final boolean a(AssertionError assertionError) {
        String message;
        return (assertionError.getCause() == null || (message = assertionError.getMessage()) == null || !fu.r.d0(message, "getsockname failed", false, 2, null)) ? false : true;
    }
}
