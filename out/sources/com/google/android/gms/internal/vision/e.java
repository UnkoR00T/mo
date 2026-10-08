package com.google.android.gms.internal.vision;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
final class e extends WeakReference<Throwable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f30996a;

    public e(Throwable th4, ReferenceQueue<Throwable> referenceQueue) {
        super(th4, referenceQueue);
        if (th4 == null) {
            throw new NullPointerException("The referent cannot be null");
        }
        this.f30996a = System.identityHashCode(th4);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == e.class) {
            if (this == obj) {
                return true;
            }
            e eVar = (e) obj;
            if (this.f30996a == eVar.f30996a && get() == eVar.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f30996a;
    }
}
