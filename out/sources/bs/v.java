package bs;

/* JADX INFO: loaded from: classes4.dex */
public final class v extends h implements qs.m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Enum<?> f21266c;

    public v(zs.f fVar, Enum<?> r15) {
        super(fVar, null);
        this.f21266c = r15;
    }

    @Override // qs.m
    public zs.b d() {
        Class<?> enclosingClass = this.f21266c.getClass();
        if (!enclosingClass.isEnum()) {
            enclosingClass = enclosingClass.getEnclosingClass();
        }
        return f.e(enclosingClass);
    }

    @Override // qs.m
    public zs.f e() {
        return zs.f.l(this.f21266c.name());
    }
}
