package com.google.android.gms.internal.vision;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<e, List<Throwable>> f31008a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ReferenceQueue<Throwable> f31009b = new ReferenceQueue<>();

    f() {
    }

    public final List<Throwable> a(Throwable th4, boolean z15) {
        Reference<? extends Throwable> referencePoll = this.f31009b.poll();
        while (referencePoll != null) {
            this.f31008a.remove(referencePoll);
            referencePoll = this.f31009b.poll();
        }
        List<Throwable> list = this.f31008a.get(new e(th4, null));
        if (!z15 || list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> listPutIfAbsent = this.f31008a.putIfAbsent(new e(th4, this.f31009b), vector);
        return listPutIfAbsent == null ? vector : listPutIfAbsent;
    }
}
