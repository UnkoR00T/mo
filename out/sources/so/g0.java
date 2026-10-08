package so;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class g0 implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f182642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f182643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<String> f182644c;

    public g0(d dVar, n nVar, List<String> list) {
        this.f182642a = dVar;
        this.f182643b = nVar;
        this.f182644c = list;
    }

    @Override // so.c
    public List<Integer> a(int i15) {
        return this.f182642a.a(this.f182643b.p(i15));
    }

    @Override // so.c
    public int b(int i15) {
        return this.f182643b.o(this.f182642a.b(i15), d0.b(i15), this.f182644c);
    }
}
