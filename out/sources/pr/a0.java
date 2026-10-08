package pr;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
class a0 implements er.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f161746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f161747b;

    public a0(List list, int i15) {
        this.f161746a = list;
        this.f161747b = i15;
    }

    @Override // er.a
    public Object a() {
        return c0.r(this.f161746a, this.f161747b);
    }
}
