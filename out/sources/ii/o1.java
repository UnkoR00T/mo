package ii;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class o1 extends y.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f92674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f92675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f92676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f92677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f92678e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private y.b f92679f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Double f92680g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Double f92681h;

    o1() {
    }

    @Override // ii.y.a
    public final y.a b(String str) {
        this.f92676c = str;
        return this;
    }

    @Override // ii.y.a
    public final y.a c(String str) {
        this.f92677d = str;
        return this;
    }

    @Override // ii.y.a
    public final y.a d(String str) {
        this.f92675b = str;
        return this;
    }

    @Override // ii.y.a
    public final y.a e(String str) {
        this.f92674a = str;
        return this;
    }

    @Override // ii.y.a
    public final y.a f(y.b bVar) {
        this.f92679f = bVar;
        return this;
    }

    @Override // ii.y.a
    public final y.a g(Double d15) {
        this.f92680g = d15;
        return this;
    }

    @Override // ii.y.a
    public final y.a h(Double d15) {
        this.f92681h = d15;
        return this;
    }

    @Override // ii.y.a
    public final y.a i(List<String> list) {
        this.f92678e = list;
        return this;
    }

    @Override // ii.y.a
    final List j() {
        return this.f92678e;
    }

    @Override // ii.y.a
    final y k() {
        return new a5(this.f92674a, this.f92675b, this.f92676c, this.f92677d, this.f92678e, this.f92679f, this.f92680g, this.f92681h);
    }
}
