package com.google.android.gms.internal.vision;

/* JADX INFO: loaded from: classes3.dex */
public class d3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final y1 f30989d = y1.b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e1 f30990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile u3 f30991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile e1 f30992c;

    public final u3 a(u3 u3Var) {
        u3 u3Var2 = this.f30991b;
        this.f30990a = null;
        this.f30992c = null;
        this.f30991b = u3Var;
        return u3Var2;
    }

    public final int b() {
        if (this.f30992c != null) {
            return this.f30992c.f();
        }
        if (this.f30991b != null) {
            return this.f30991b.q();
        }
        return 0;
    }

    public final e1 c() {
        if (this.f30992c != null) {
            return this.f30992c;
        }
        synchronized (this) {
            try {
                if (this.f30992c != null) {
                    return this.f30992c;
                }
                if (this.f30991b == null) {
                    this.f30992c = e1.f30998b;
                } else {
                    this.f30992c = this.f30991b.i();
                }
                return this.f30992c;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
