package ii;

/* JADX INFO: loaded from: classes4.dex */
final class s7 extends l.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f92766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private m f92767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f92768c;

    s7() {
    }

    @Override // ii.l.a
    public final l a() {
        return new f4(this.f92766a, this.f92767b, this.f92768c);
    }

    @Override // ii.l.a
    public final l.a b(m mVar) {
        this.f92767b = mVar;
        return this;
    }

    @Override // ii.l.a
    public final l.a c(String str) {
        this.f92768c = str;
        return this;
    }

    @Override // ii.l.a
    public final l.a d(String str) {
        this.f92766a = str;
        return this;
    }
}
