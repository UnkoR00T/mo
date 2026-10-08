package yr;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class c0 implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<f0> f228747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<f0> f228748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<f0> f228749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set<f0> f228750d;

    public c0(List<f0> list, Set<f0> set, List<f0> list2, Set<f0> set2) {
        this.f228747a = list;
        this.f228748b = set;
        this.f228749c = list2;
        this.f228750d = set2;
    }

    @Override // yr.b0
    public List<f0> a() {
        return this.f228747a;
    }

    @Override // yr.b0
    public List<f0> b() {
        return this.f228749c;
    }

    @Override // yr.b0
    public Set<f0> c() {
        return this.f228748b;
    }
}
