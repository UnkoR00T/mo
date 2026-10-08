package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
final class x71 extends ThreadLocal {
    x71() {
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        l81 l81Var = new l81(n71.a(Thread.currentThread()));
        Thread threadCurrentThread = Thread.currentThread();
        synchronized (y71.f34351c) {
            y71.f34351c.put(threadCurrentThread, l81Var);
        }
        return l81Var;
    }
}
