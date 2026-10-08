package com.google.android.libraries.places.internal;

import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes4.dex */
final class u70 extends w70 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final v70 f33860f;

    /* synthetic */ u70(String str, boolean z15, v70 v70Var, byte[] bArr) {
        super(str, false, v70Var, null);
        zj.p.m(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        this.f33860f = (v70) zj.p.r(v70Var, "marshaller");
    }

    @Override // com.google.android.libraries.places.internal.w70
    final byte[] a(Object obj) {
        return ((String) zj.p.r(this.f33860f.c(obj), "null marshaller.toAsciiString()")).getBytes(StandardCharsets.US_ASCII);
    }

    @Override // com.google.android.libraries.places.internal.w70
    final Object b(byte[] bArr) {
        return this.f33860f.a(new String(bArr, StandardCharsets.US_ASCII));
    }
}
