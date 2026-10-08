package ii;

/* JADX INFO: loaded from: classes4.dex */
final class i7 extends f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f92483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f92484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f92485c;

    i7() {
    }

    @Override // ii.f.a
    public final f.a b(String str) {
        this.f92485c = str;
        return this;
    }

    @Override // ii.f.a
    public final f.a c(String str) {
        this.f92484b = str;
        return this;
    }

    @Override // ii.f.a
    final f d() {
        String str = this.f92483a;
        if (str != null) {
            return new t3(str, this.f92484b, this.f92485c);
        }
        throw new IllegalStateException("Missing required properties: name");
    }

    final f.a e(String str) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f92483a = str;
        return this;
    }
}
