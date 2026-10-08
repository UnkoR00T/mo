package eh;

/* JADX INFO: loaded from: classes3.dex */
public final class q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ca f50948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Boolean f50949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final r9 f50950c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final n9 f50951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Integer f50952e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Integer f50953f;

    /* synthetic */ q2(o2 o2Var, p2 p2Var) {
        this.f50948a = o2Var.f50870a;
        this.f50949b = o2Var.f50871b;
        this.f50951d = o2Var.f50872c;
        this.f50952e = o2Var.f50873d;
        this.f50953f = o2Var.f50874e;
    }

    @w1(zza = 4)
    public final n9 a() {
        return this.f50951d;
    }

    @w1(zza = 1)
    public final ca b() {
        return this.f50948a;
    }

    @w1(zza = 2)
    public final Boolean c() {
        return this.f50949b;
    }

    @w1(zza = 5)
    public final Integer d() {
        return this.f50952e;
    }

    @w1(zza = 6)
    public final Integer e() {
        return this.f50953f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q2)) {
            return false;
        }
        q2 q2Var = (q2) obj;
        return jg.r.a(this.f50948a, q2Var.f50948a) && jg.r.a(this.f50949b, q2Var.f50949b) && jg.r.a(null, null) && jg.r.a(this.f50951d, q2Var.f50951d) && jg.r.a(this.f50952e, q2Var.f50952e) && jg.r.a(this.f50953f, q2Var.f50953f);
    }

    public final int hashCode() {
        return jg.r.b(this.f50948a, this.f50949b, null, this.f50951d, this.f50952e, this.f50953f);
    }
}
