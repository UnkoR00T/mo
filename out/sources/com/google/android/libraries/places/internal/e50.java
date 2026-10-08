package com.google.android.libraries.places.internal;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes4.dex */
final class e50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final f50 f32158a;

    static {
        f50 v90Var;
        AtomicReference atomicReference = new AtomicReference();
        try {
            v90Var = (f50) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(f50.class).getConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e15) {
            atomicReference.set(e15);
            v90Var = new v90();
        } catch (Exception e16) {
            throw new RuntimeException("Storage override failed to initialize", e16);
        }
        f32158a = v90Var;
        Throwable th4 = (Throwable) atomicReference.get();
        if (th4 != null) {
            g50.f32363a.logp(Level.FINE, "io.grpc.Context$LazyStorage", "<clinit>", "Storage override doesn't exist. Using default", th4);
        }
    }
}
