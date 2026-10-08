package ig;

/* JADX INFO: loaded from: classes3.dex */
final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f92191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final gg.c f92192b;

    /* synthetic */ f0(b bVar, gg.c cVar, byte[] bArr) {
        this.f92191a = bVar;
        this.f92192b = cVar;
    }

    final /* synthetic */ b a() {
        return this.f92191a;
    }

    final /* synthetic */ gg.c b() {
        return this.f92192b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f0) {
            f0 f0Var = (f0) obj;
            if (jg.r.a(this.f92191a, f0Var.f92191a) && jg.r.a(this.f92192b, f0Var.f92192b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return jg.r.b(this.f92191a, this.f92192b);
    }

    public final String toString() {
        return jg.r.c(this).a("key", this.f92191a).a("feature", this.f92192b).toString();
    }
}
