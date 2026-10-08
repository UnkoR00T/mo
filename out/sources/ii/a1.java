package ii;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class a1 extends o.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f92352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f92353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f92354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f92355d;

    a1() {
    }

    @Override // ii.o.a
    public final o.a b(String str) {
        this.f92352a = str;
        return this;
    }

    @Override // ii.o.a
    public final o.a c(String str) {
        this.f92353b = str;
        return this;
    }

    @Override // ii.o.a
    public final o.a d(List<String> list) {
        this.f92355d = list;
        return this;
    }

    @Override // ii.o.a
    public final o.a e(List<String> list) {
        this.f92354c = list;
        return this;
    }

    @Override // ii.o.a
    final List f() {
        return this.f92354c;
    }

    @Override // ii.o.a
    final List g() {
        return this.f92355d;
    }

    @Override // ii.o.a
    final o h() {
        return new l4(this.f92352a, this.f92353b, this.f92354c, this.f92355d);
    }
}
