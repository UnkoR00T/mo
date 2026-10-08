package androidx.camera.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
final class t extends e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f9331d;

    t(o oVar) {
        super(oVar);
        this.f9331d = new AtomicBoolean(false);
    }

    @Override // androidx.camera.core.e, androidx.camera.core.o, java.lang.AutoCloseable
    public void close() {
        if (this.f9331d.getAndSet(true)) {
            return;
        }
        super.close();
    }
}
