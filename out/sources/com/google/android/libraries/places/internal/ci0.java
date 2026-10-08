package com.google.android.libraries.places.internal;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
final class ci0 extends me0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ReferenceQueue f31902c = new ReferenceQueue();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ConcurrentMap f31903d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Logger f31904e = Logger.getLogger(ci0.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bi0 f31905b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ci0(r70 r70Var) {
        super(r70Var);
        ReferenceQueue referenceQueue = f31902c;
        ConcurrentMap concurrentMap = f31903d;
        this.f31905b = new bi0(this, r70Var, referenceQueue, concurrentMap);
    }

    @Override // com.google.android.libraries.places.internal.me0, com.google.android.libraries.places.internal.r70
    public final r70 i() {
        this.f31905b.b();
        return super.i();
    }
}
