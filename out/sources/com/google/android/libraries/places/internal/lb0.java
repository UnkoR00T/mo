package com.google.android.libraries.places.internal;

import java.io.Closeable;
import java.net.SocketAddress;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public interface lb0 extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    vb0 f3(SocketAddress socketAddress, kb0 kb0Var, i40 i40Var);

    ScheduledExecutorService zzb();
}
