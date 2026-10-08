package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
final class vl0 extends tl0 {
    private vl0() {
        throw null;
    }

    @Override // com.google.android.libraries.places.internal.tl0
    public final boolean a(wl0 wl0Var, int i15, int i16) {
        synchronized (wl0Var) {
            try {
                if (wl0Var.a() != 0) {
                    return false;
                }
                wl0Var.c(-1);
                return true;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.tl0
    public final void b(wl0 wl0Var, int i15) {
        synchronized (wl0Var) {
            wl0Var.c(0);
        }
    }

    /* synthetic */ vl0(byte[] bArr) {
        super(null);
    }
}
