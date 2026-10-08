package ii;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class o5 extends d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f92685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f92686b;

    o5() {
    }

    @Override // ii.d.a
    public final d.a b(List<e> list) {
        this.f92686b = list;
        return this;
    }

    @Override // ii.d.a
    public final d.a c(List<y> list) {
        this.f92685a = list;
        return this;
    }

    @Override // ii.d.a
    final List d() {
        return this.f92685a;
    }

    @Override // ii.d.a
    final List e() {
        return this.f92686b;
    }

    @Override // ii.d.a
    final d f() {
        return new o3(this.f92685a, this.f92686b);
    }
}
