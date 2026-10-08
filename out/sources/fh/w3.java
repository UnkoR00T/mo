package fh;

/* JADX INFO: loaded from: classes3.dex */
public final class w3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ie f63601a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Boolean f63603c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final wh f63605e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Boolean f63602b = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final rd f63604d = null;

    /* synthetic */ w3(u3 u3Var, v3 v3Var) {
        this.f63601a = u3Var.f63554a;
        this.f63603c = u3Var.f63555b;
        this.f63605e = u3Var.f63556c;
    }

    @z1(zza = 1)
    public final ie a() {
        return this.f63601a;
    }

    @z1(zza = 5)
    public final wh b() {
        return this.f63605e;
    }

    @z1(zza = 3)
    public final Boolean c() {
        return this.f63603c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w3)) {
            return false;
        }
        w3 w3Var = (w3) obj;
        return jg.r.a(this.f63601a, w3Var.f63601a) && jg.r.a(null, null) && jg.r.a(this.f63603c, w3Var.f63603c) && jg.r.a(null, null) && jg.r.a(this.f63605e, w3Var.f63605e);
    }

    public final int hashCode() {
        return jg.r.b(this.f63601a, null, this.f63603c, null, this.f63605e);
    }
}
