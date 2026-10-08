package rs;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
class b implements er.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f175615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f175616b;

    public b(List list, e eVar) {
        this.f175615a = list;
        this.f175616b = eVar;
    }

    @Override // er.a
    public Object a() {
        return e.a(this.f175615a, this.f175616b);
    }
}
