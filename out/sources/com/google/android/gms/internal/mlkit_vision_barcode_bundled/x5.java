package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes3.dex */
public final class x5 extends RuntimeException {
    public x5(r4 r4Var) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final v3 a() {
        return new v3(getMessage());
    }
}
