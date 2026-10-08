package ch;

/* JADX INFO: loaded from: classes3.dex */
public final class e3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xe f25848a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Boolean f25850c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final wj f25852e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final i1 f25853f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final i1 f25854g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Boolean f25849b = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final fe f25851d = null;

    /* synthetic */ e3(c3 c3Var, d3 d3Var) {
        this.f25848a = c3Var.f25807a;
        this.f25850c = c3Var.f25808b;
        this.f25852e = c3Var.f25809c;
        this.f25853f = c3Var.f25810d;
        this.f25854g = c3Var.f25811e;
    }

    @p2(zza = 6)
    public final i1 a() {
        return this.f25853f;
    }

    @p2(zza = 7)
    public final i1 b() {
        return this.f25854g;
    }

    @p2(zza = 1)
    public final xe c() {
        return this.f25848a;
    }

    @p2(zza = 5)
    public final wj d() {
        return this.f25852e;
    }

    @p2(zza = 3)
    public final Boolean e() {
        return this.f25850c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e3)) {
            return false;
        }
        e3 e3Var = (e3) obj;
        return jg.r.a(this.f25848a, e3Var.f25848a) && jg.r.a(null, null) && jg.r.a(this.f25850c, e3Var.f25850c) && jg.r.a(null, null) && jg.r.a(this.f25852e, e3Var.f25852e) && jg.r.a(this.f25853f, e3Var.f25853f) && jg.r.a(this.f25854g, e3Var.f25854g);
    }

    public final int hashCode() {
        return jg.r.b(this.f25848a, null, this.f25850c, null, this.f25852e, this.f25853f, this.f25854g);
    }
}
