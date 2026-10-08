package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class p2 extends IOException {
    p2(String str, Throwable th4) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th4);
    }

    p2(Throwable th4) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th4);
    }
}
