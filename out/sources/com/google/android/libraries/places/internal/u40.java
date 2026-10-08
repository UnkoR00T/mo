package com.google.android.libraries.places.internal;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class u40 implements w40 {
    @Override // com.google.android.libraries.places.internal.x40
    public final OutputStream a(OutputStream outputStream) {
        return new GZIPOutputStream(outputStream);
    }

    @Override // com.google.android.libraries.places.internal.k50
    public final InputStream b(InputStream inputStream) {
        return new GZIPInputStream(inputStream);
    }

    @Override // com.google.android.libraries.places.internal.x40, com.google.android.libraries.places.internal.k50
    public final String zza() {
        return "gzip";
    }
}
