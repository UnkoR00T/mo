package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class ay extends IOException {
    ay(long j15, long j16, int i15, Throwable th4) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.format(Locale.US, "Pos: %d, limit: %d, len: %d", Long.valueOf(j15), Long.valueOf(j16), Integer.valueOf(i15))), th4);
    }

    ay(Throwable th4) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th4);
    }
}
