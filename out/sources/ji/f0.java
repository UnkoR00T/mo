package ji;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class f0 extends i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f103196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private vh.a f103197b;

    f0() {
    }

    @Override // ji.i.a
    public final i.a b(vh.a aVar) {
        this.f103197b = aVar;
        return this;
    }

    @Override // ji.i.a
    final i.a c(List list) {
        if (list == null) {
            throw new NullPointerException("Null placeFields");
        }
        this.f103196a = list;
        return this;
    }

    @Override // ji.i.a
    final i d() {
        List list = this.f103196a;
        if (list != null) {
            return new g0(list, this.f103197b, null);
        }
        throw new IllegalStateException("Missing required properties: placeFields");
    }
}
