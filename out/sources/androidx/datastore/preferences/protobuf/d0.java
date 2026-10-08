package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes3.dex */
public class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g f11938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private o f11939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected volatile r0 f11940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile g f11941d;

    protected void a(r0 r0Var) {
        if (this.f11940c != null) {
            return;
        }
        synchronized (this) {
            if (this.f11940c != null) {
                return;
            }
            try {
                if (this.f11938a != null) {
                    this.f11940c = r0Var.j().a(this.f11938a, this.f11939b);
                    this.f11941d = this.f11938a;
                } else {
                    this.f11940c = r0Var;
                    this.f11941d = g.f11949b;
                }
            } catch (a0 unused) {
                this.f11940c = r0Var;
                this.f11941d = g.f11949b;
            }
        }
    }

    public int b() {
        if (this.f11941d != null) {
            return this.f11941d.size();
        }
        g gVar = this.f11938a;
        if (gVar != null) {
            return gVar.size();
        }
        if (this.f11940c != null) {
            return this.f11940c.e();
        }
        return 0;
    }

    public r0 c(r0 r0Var) {
        a(r0Var);
        return this.f11940c;
    }

    public r0 d(r0 r0Var) {
        r0 r0Var2 = this.f11940c;
        this.f11938a = null;
        this.f11941d = null;
        this.f11940c = r0Var;
        return r0Var2;
    }

    public g e() {
        if (this.f11941d != null) {
            return this.f11941d;
        }
        g gVar = this.f11938a;
        if (gVar != null) {
            return gVar;
        }
        synchronized (this) {
            try {
                if (this.f11941d != null) {
                    return this.f11941d;
                }
                if (this.f11940c == null) {
                    this.f11941d = g.f11949b;
                } else {
                    this.f11941d = this.f11940c.l();
                }
                return this.f11941d;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
