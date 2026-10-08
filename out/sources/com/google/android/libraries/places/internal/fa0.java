package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public abstract class fa0 implements sj0 {
    @Override // com.google.android.libraries.places.internal.sj0
    public void a() {
        throw new UnsupportedOperationException();
    }

    protected final void b(int i15) {
        if (f() < i15) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override // com.google.android.libraries.places.internal.sj0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // com.google.android.libraries.places.internal.sj0
    public boolean zza() {
        return false;
    }

    @Override // com.google.android.libraries.places.internal.sj0
    public void zzb() {
    }
}
