package qr;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
class c implements er.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f168157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f168158b;

    public c(Class cls, Map map) {
        this.f168157a = cls;
        this.f168158b = map;
    }

    @Override // er.a
    public Object a() {
        return f.l(this.f168157a, this.f168158b);
    }
}
