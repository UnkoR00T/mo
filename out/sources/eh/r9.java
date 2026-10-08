package eh;

/* JADX INFO: loaded from: classes3.dex */
public final class r9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p9 f51021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f51022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Integer f51023c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Boolean f51024d = null;

    /* synthetic */ r9(o9 o9Var, q9 q9Var) {
        this.f51021a = o9Var.f50898a;
        this.f51022b = o9Var.f50899b;
    }

    @w1(zza = 1)
    public final p9 a() {
        return this.f51021a;
    }

    @w1(zza = 2)
    public final Integer b() {
        return this.f51022b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r9)) {
            return false;
        }
        r9 r9Var = (r9) obj;
        return jg.r.a(this.f51021a, r9Var.f51021a) && jg.r.a(this.f51022b, r9Var.f51022b) && jg.r.a(null, null) && jg.r.a(null, null);
    }

    public final int hashCode() {
        return jg.r.b(this.f51021a, this.f51022b, null, null);
    }
}
