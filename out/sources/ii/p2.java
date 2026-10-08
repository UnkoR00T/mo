package ii;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class p2 extends o0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f92705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f92706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f92707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f92708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f92709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f92710f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f92711g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List f92712h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List f92713i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f92714j;

    p2() {
    }

    @Override // ii.o0.a
    public final o0.a b(List<String> list) {
        this.f92712h = list;
        return this;
    }

    @Override // ii.o0.a
    public final o0.a c(String str) {
        this.f92709e = str;
        return this;
    }

    @Override // ii.o0.a
    public final o0.a d(String str) {
        this.f92706b = str;
        return this;
    }

    @Override // ii.o0.a
    public final o0.a e(String str) {
        this.f92710f = str;
        return this;
    }

    @Override // ii.o0.a
    public final o0.a f(String str) {
        this.f92714j = str;
        return this;
    }

    @Override // ii.o0.a
    public final o0.a g(String str) {
        this.f92707c = str;
        return this;
    }

    @Override // ii.o0.a
    public final o0.a h(List<String> list) {
        this.f92713i = list;
        return this;
    }

    @Override // ii.o0.a
    public final o0.a i(String str) {
        this.f92708d = str;
        return this;
    }

    @Override // ii.o0.a
    public final o0.a j(String str) {
        this.f92711g = str;
        return this;
    }

    @Override // ii.o0.a
    final List k() {
        return this.f92712h;
    }

    @Override // ii.o0.a
    final List l() {
        return this.f92713i;
    }

    @Override // ii.o0.a
    final o0 m() {
        String str = this.f92705a;
        if (str != null) {
            return new d6(str, this.f92706b, this.f92707c, this.f92708d, this.f92709e, this.f92710f, this.f92711g, this.f92712h, this.f92713i, this.f92714j);
        }
        throw new IllegalStateException("Missing required properties: regionCode");
    }

    public final o0.a n(String str) {
        if (str == null) {
            throw new NullPointerException("Null regionCode");
        }
        this.f92705a = str;
        return this;
    }
}
