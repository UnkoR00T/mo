package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes3.dex */
public class s1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final r0 f29533d = r0.b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a0 f29534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile l2 f29535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile a0 f29536c;

    public final int a() {
        if (this.f29536c != null) {
            return this.f29536c.size();
        }
        if (this.f29535b != null) {
            return this.f29535b.l();
        }
        return 0;
    }

    public final l2 b(l2 l2Var) {
        l2 l2Var2 = this.f29535b;
        this.f29534a = null;
        this.f29536c = null;
        this.f29535b = l2Var;
        return l2Var2;
    }

    public final a0 c() {
        a0 a0Var;
        if (this.f29536c != null) {
            return this.f29536c;
        }
        synchronized (this) {
            try {
                if (this.f29536c == null) {
                    this.f29536c = this.f29535b == null ? a0.f29117b : this.f29535b.e();
                }
                a0Var = this.f29536c;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return a0Var;
    }
}
