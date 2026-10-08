package ji;

import ii.u0;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class r0 extends s.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f103290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f103291b;

    r0() {
    }

    @Override // ji.s.a
    public final s a() {
        List list = this.f103290a;
        if (list != null) {
            return new s0(list, this.f103291b, null);
        }
        throw new IllegalStateException("Missing required properties: places");
    }

    @Override // ji.s.a
    public final List<ii.l0> c() {
        List<ii.l0> list = this.f103290a;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("Property \"places\" has not been set");
    }

    @Override // ji.s.a
    public final List<u0> d() {
        return this.f103291b;
    }

    @Override // ji.s.a
    public final s.a e(List<ii.l0> list) {
        if (list == null) {
            throw new NullPointerException("Null places");
        }
        this.f103290a = list;
        return this;
    }

    @Override // ji.s.a
    public final s.a f(List<u0> list) {
        this.f103291b = list;
        return this;
    }
}
