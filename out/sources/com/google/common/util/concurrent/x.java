package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes4.dex */
final class x {
    static void a(Throwable th4) {
        zj.p.q(th4);
        if (th4 instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }
}
