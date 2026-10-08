package y7;

import java.util.ArrayList;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f224844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<x> f224845b = new ArrayList<>(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f224846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private j f224847d;

    protected b(boolean z15) {
        this.f224844a = z15;
    }

    @Override // y7.f
    public final void m(x xVar) {
        zj.p.q(xVar);
        if (this.f224845b.contains(xVar)) {
            return;
        }
        this.f224845b.add(xVar);
        this.f224846c++;
    }

    protected final void q(int i15) {
        j jVar = (j) o0.h(this.f224847d);
        for (int i16 = 0; i16 < this.f224846c; i16++) {
            this.f224845b.get(i16).f(this, jVar, this.f224844a, i15);
        }
    }

    protected final void r() {
        j jVar = (j) o0.h(this.f224847d);
        for (int i15 = 0; i15 < this.f224846c; i15++) {
            this.f224845b.get(i15).c(this, jVar, this.f224844a);
        }
        this.f224847d = null;
    }

    protected final void s(j jVar) {
        for (int i15 = 0; i15 < this.f224846c; i15++) {
            this.f224845b.get(i15).g(this, jVar, this.f224844a);
        }
    }

    protected final void t(j jVar) {
        this.f224847d = jVar;
        for (int i15 = 0; i15 < this.f224846c; i15++) {
            this.f224845b.get(i15).b(this, jVar, this.f224844a);
        }
    }
}
