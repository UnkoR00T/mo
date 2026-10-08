package com.google.android.libraries.places.internal;

import java.io.Closeable;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public interface sj0 extends Closeable {
    void D(int i15);

    void H3(OutputStream outputStream, int i15);

    sj0 W2(int i15);

    void a();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    int f();

    int i();

    void t3(byte[] bArr, int i15, int i16);

    boolean zza();

    void zzb();
}
