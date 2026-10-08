package com.google.android.gms.internal.oss_licenses;

/* JADX INFO: loaded from: classes3.dex */
final class c3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final c3 f30761b = new c3(new a("Failure occurred while trying to finish a future."));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Throwable f30762a;

    class a extends Throwable {
        a(String str) {
            super("Failure occurred while trying to finish a future.");
        }

        @Override // java.lang.Throwable
        public final Throwable fillInStackTrace() {
            return this;
        }
    }

    c3(Throwable th4) {
        th4.getClass();
        this.f30762a = th4;
    }
}
