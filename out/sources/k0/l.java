package k0;

import v.a0;
import v.b0;
import v.c0;
import v.t3;
import v.v;
import v.w;
import v.x;
import v.y;
import v.z;

/* JADX INFO: loaded from: classes.dex */
public class l implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c0 f107173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t3 f107174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f107175c;

    public l(t3 t3Var, c0 c0Var) {
        this(c0Var, t3Var, -1L);
    }

    @Override // v.c0
    public b0 c() {
        c0 c0Var = this.f107173a;
        return c0Var != null ? c0Var.c() : b0.UNKNOWN;
    }

    @Override // v.c0
    public t3 d() {
        return this.f107174b;
    }

    @Override // v.c0
    public z f() {
        c0 c0Var = this.f107173a;
        return c0Var != null ? c0Var.f() : z.UNKNOWN;
    }

    @Override // v.c0
    public long getTimestamp() {
        c0 c0Var = this.f107173a;
        if (c0Var != null) {
            return c0Var.getTimestamp();
        }
        long j15 = this.f107175c;
        if (j15 != -1) {
            return j15;
        }
        throw new IllegalStateException("No timestamp is available.");
    }

    @Override // v.c0
    public v i() {
        c0 c0Var = this.f107173a;
        return c0Var != null ? c0Var.i() : v.UNKNOWN;
    }

    @Override // v.c0
    public y j() {
        c0 c0Var = this.f107173a;
        return c0Var != null ? c0Var.j() : y.UNKNOWN;
    }

    @Override // v.c0
    public a0 k() {
        c0 c0Var = this.f107173a;
        return c0Var != null ? c0Var.k() : a0.UNKNOWN;
    }

    @Override // v.c0
    public x l() {
        c0 c0Var = this.f107173a;
        return c0Var != null ? c0Var.l() : x.UNKNOWN;
    }

    @Override // v.c0
    public w n() {
        c0 c0Var = this.f107173a;
        return c0Var != null ? c0Var.n() : w.UNKNOWN;
    }

    public l(t3 t3Var, long j15) {
        this(null, t3Var, j15);
    }

    private l(c0 c0Var, t3 t3Var, long j15) {
        this.f107173a = c0Var;
        this.f107174b = t3Var;
        this.f107175c = j15;
    }
}
