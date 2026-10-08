package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class ev extends IOException {
    ev(String str, Throwable th4) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th4);
    }

    ev(Throwable th4) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th4);
    }
}
