package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class g10 extends RuntimeException {
    public g10(g00 g00Var) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final lz a() {
        return new lz(getMessage());
    }
}
