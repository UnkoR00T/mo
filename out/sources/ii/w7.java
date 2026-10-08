package ii;

/* JADX INFO: loaded from: classes4.dex */
final class w7 extends n.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f92842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f92843b;

    w7() {
    }

    @Override // ii.n.a
    public final n a() {
        String str;
        String str2 = this.f92842a;
        if (str2 != null && (str = this.f92843b) != null) {
            return new j4(str2, str);
        }
        StringBuilder sb5 = new StringBuilder();
        if (this.f92842a == null) {
            sb5.append(" resourceName");
        }
        if (this.f92843b == null) {
            sb5.append(" id");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb5.toString()));
    }

    @Override // ii.n.a
    public final n.a b(String str) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.f92843b = str;
        return this;
    }

    public final n.a c(String str) {
        if (str == null) {
            throw new NullPointerException("Null resourceName");
        }
        this.f92842a = str;
        return this;
    }
}
