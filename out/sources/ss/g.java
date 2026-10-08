package ss;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class g<A, C> extends e.a<A> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<a0, List<A>> f183850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<a0, C> f183851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<a0, C> f183852c;

    /* JADX WARN: Multi-variable type inference failed */
    public g(Map<a0, ? extends List<? extends A>> map, Map<a0, ? extends C> map2, Map<a0, ? extends C> map3) {
        this.f183850a = map;
        this.f183851b = map2;
        this.f183852c = map3;
    }

    @Override // ss.e.a
    public Map<a0, List<A>> a() {
        return this.f183850a;
    }

    public final Map<a0, C> b() {
        return this.f183852c;
    }

    public final Map<a0, C> c() {
        return this.f183851b;
    }
}
