package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
final class y70 extends w70 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final z70 f34348f;

    /* synthetic */ y70(String str, boolean z15, z70 z70Var, byte[] bArr) {
        super(str, z15, z70Var, null);
        zj.p.m(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        this.f34348f = (z70) zj.p.r(z70Var, "marshaller");
    }

    @Override // com.google.android.libraries.places.internal.w70
    final byte[] a(Object obj) {
        return (byte[]) zj.p.r(this.f34348f.b(obj), "null marshaller.toAsciiString()");
    }

    @Override // com.google.android.libraries.places.internal.w70
    final Object b(byte[] bArr) {
        return this.f34348f.a(bArr);
    }
}
