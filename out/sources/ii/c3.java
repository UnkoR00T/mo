package ii;

/* JADX INFO: loaded from: classes4.dex */
final class c3 extends x0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f92389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f92390b;

    c3() {
    }

    @Override // ii.x0.a
    public final x0 a() {
        String str;
        String str2 = this.f92389a;
        if (str2 != null && (str = this.f92390b) != null) {
            return new q6(str2, str);
        }
        StringBuilder sb5 = new StringBuilder();
        if (this.f92389a == null) {
            sb5.append(" id");
        }
        if (this.f92390b == null) {
            sb5.append(" name");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb5.toString()));
    }

    @Override // ii.x0.a
    public final x0.a b(String str) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f92390b = str;
        return this;
    }

    public final x0.a c(String str) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.f92389a = str;
        return this;
    }
}
