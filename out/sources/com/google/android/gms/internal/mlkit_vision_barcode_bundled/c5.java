package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
final class c5 extends c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final h5 f29693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    f2 f29694b = a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ j5 f29695c;

    c5(j5 j5Var) {
        this.f29695c = j5Var;
        this.f29693a = new h5(j5Var, null);
    }

    private final f2 a() {
        h5 h5Var = this.f29693a;
        if (h5Var.hasNext()) {
            return h5Var.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f29694b != null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.f2
    public final byte zza() {
        f2 f2Var = this.f29694b;
        if (f2Var == null) {
            throw new NoSuchElementException();
        }
        byte bZza = f2Var.zza();
        if (!this.f29694b.hasNext()) {
            this.f29694b = a();
        }
        return bZza;
    }
}
