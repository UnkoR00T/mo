package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes4.dex */
public class e0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final p f36043e = p.b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private h f36044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p f36045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected volatile r0 f36046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile h f36047d;

    protected void a(r0 r0Var) {
        if (this.f36046c != null) {
            return;
        }
        synchronized (this) {
            if (this.f36046c != null) {
                return;
            }
            try {
                if (this.f36044a != null) {
                    this.f36046c = r0Var.j().b(this.f36044a, this.f36045b);
                    this.f36047d = this.f36044a;
                } else {
                    this.f36046c = r0Var;
                    this.f36047d = h.f36058b;
                }
            } catch (b0 unused) {
                this.f36046c = r0Var;
                this.f36047d = h.f36058b;
            }
        }
    }

    public int b() {
        if (this.f36047d != null) {
            return this.f36047d.size();
        }
        h hVar = this.f36044a;
        if (hVar != null) {
            return hVar.size();
        }
        if (this.f36046c != null) {
            return this.f36046c.e();
        }
        return 0;
    }

    public r0 c(r0 r0Var) {
        a(r0Var);
        return this.f36046c;
    }

    public r0 d(r0 r0Var) {
        r0 r0Var2 = this.f36046c;
        this.f36044a = null;
        this.f36047d = null;
        this.f36046c = r0Var;
        return r0Var2;
    }

    public h e() {
        if (this.f36047d != null) {
            return this.f36047d;
        }
        h hVar = this.f36044a;
        if (hVar != null) {
            return hVar;
        }
        synchronized (this) {
            try {
                if (this.f36047d != null) {
                    return this.f36047d;
                }
                if (this.f36046c == null) {
                    this.f36047d = h.f36058b;
                } else {
                    this.f36047d = this.f36046c.l();
                }
                return this.f36047d;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
