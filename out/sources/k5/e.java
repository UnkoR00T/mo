package k5;

import java.util.ArrayList;
import java.util.Collections;
import n5.j;

/* JADX INFO: loaded from: classes.dex */
public class e extends a implements l5.e {

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    protected final g f108487m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    final g.d f108488n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    protected ArrayList<Object> f108489o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private j f108490p0;

    public e(g gVar, g.d dVar) {
        super(gVar);
        this.f108489o0 = new ArrayList<>();
        this.f108487m0 = gVar;
        this.f108488n0 = dVar;
    }

    @Override // k5.a, k5.f
    public n5.e a() {
        return u0();
    }

    @Override // k5.a, k5.f
    public void apply() {
    }

    public e s0(Object... objArr) {
        Collections.addAll(this.f108489o0, objArr);
        return this;
    }

    public void t0() {
        super.apply();
    }

    public j u0() {
        return this.f108490p0;
    }

    public g.d v0() {
        return this.f108488n0;
    }
}
