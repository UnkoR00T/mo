package com.google.android.gms.internal.vision;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class g extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f31051b = new f();

    g() {
    }

    @Override // com.google.android.gms.internal.vision.c
    public final void a(Throwable th4) {
        th4.printStackTrace();
        List<Throwable> listA = this.f31051b.a(th4, false);
        if (listA == null) {
            return;
        }
        synchronized (listA) {
            try {
                for (Throwable th5 : listA) {
                    System.err.print("Suppressed: ");
                    th5.printStackTrace();
                }
            } catch (Throwable th6) {
                throw th6;
            }
        }
    }
}
