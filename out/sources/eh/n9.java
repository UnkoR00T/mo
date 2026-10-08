package eh;

/* JADX INFO: loaded from: classes3.dex */
public final class n9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k9 f50855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h9 f50856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l9 f50857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i9 f50858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Boolean f50859e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Float f50860f;

    /* synthetic */ n9(g9 g9Var, m9 m9Var) {
        this.f50855a = g9Var.f50588a;
        this.f50856b = g9Var.f50589b;
        this.f50857c = g9Var.f50590c;
        this.f50858d = g9Var.f50591d;
        this.f50859e = g9Var.f50592e;
        this.f50860f = g9Var.f50593f;
    }

    @w1(zza = 2)
    public final h9 a() {
        return this.f50856b;
    }

    @w1(zza = 4)
    public final i9 b() {
        return this.f50858d;
    }

    @w1(zza = 1)
    public final k9 c() {
        return this.f50855a;
    }

    @w1(zza = 3)
    public final l9 d() {
        return this.f50857c;
    }

    @w1(zza = 5)
    public final Boolean e() {
        return this.f50859e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n9)) {
            return false;
        }
        n9 n9Var = (n9) obj;
        return jg.r.a(this.f50855a, n9Var.f50855a) && jg.r.a(this.f50856b, n9Var.f50856b) && jg.r.a(this.f50857c, n9Var.f50857c) && jg.r.a(this.f50858d, n9Var.f50858d) && jg.r.a(this.f50859e, n9Var.f50859e) && jg.r.a(this.f50860f, n9Var.f50860f);
    }

    @w1(zza = 6)
    public final Float f() {
        return this.f50860f;
    }

    public final int hashCode() {
        return jg.r.b(this.f50855a, this.f50856b, this.f50857c, this.f50858d, this.f50859e, this.f50860f);
    }
}
