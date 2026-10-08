package com.google.android.gms.internal.oss_licenses;

/* JADX INFO: loaded from: classes3.dex */
final class i extends ThreadLocal {
    i() {
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        v vVar = new v(c.a(Thread.currentThread()));
        Thread threadCurrentThread = Thread.currentThread();
        synchronized (j.f30795d) {
            j.f30795d.put(threadCurrentThread, vVar);
        }
        return vVar;
    }
}
