package qr;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
class b implements er.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f168156a;

    public b(Map map) {
        this.f168156a = map;
    }

    @Override // er.a
    public Object a() {
        return Integer.valueOf(f.j(this.f168156a));
    }
}
