package t7;

import ak.n0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final e0.c f188121a = new e0.c();

    protected d() {
    }

    private int L() {
        int iE = E();
        if (iE == 1) {
            return 0;
        }
        return iE;
    }

    private void N(long j15, int i15) {
        M(D(), j15, i15, false);
    }

    @Override // t7.a0
    public final boolean A() {
        e0 e0VarR = r();
        return !e0VarR.q() && e0VarR.n(D(), this.f188121a).f188160h;
    }

    @Override // t7.a0
    public final boolean C() {
        return B() == 3 && u() && q() == 0;
    }

    @Override // t7.a0
    public final boolean H() {
        e0 e0VarR = r();
        return !e0VarR.q() && e0VarR.n(D(), this.f188121a).f();
    }

    public final long I() {
        e0 e0VarR = r();
        if (e0VarR.q()) {
            return -9223372036854775807L;
        }
        return e0VarR.n(D(), this.f188121a).d();
    }

    public final int J() {
        e0 e0VarR = r();
        if (e0VarR.q()) {
            return -1;
        }
        return e0VarR.e(D(), L(), F());
    }

    public final int K() {
        e0 e0VarR = r();
        if (e0VarR.q()) {
            return -1;
        }
        return e0VarR.l(D(), L(), F());
    }

    protected abstract void M(int i15, long j15, int i16, boolean z15);

    public final void O(List<s> list) {
        f(list, true);
    }

    @Override // t7.a0
    public final void g() {
        k(false);
    }

    @Override // t7.a0
    public final void h() {
        k(true);
    }

    @Override // t7.a0
    public final boolean n() {
        return J() != -1;
    }

    @Override // t7.a0
    public final boolean p() {
        e0 e0VarR = r();
        return !e0VarR.q() && e0VarR.n(D(), this.f188121a).f188161i;
    }

    @Override // t7.a0
    public final void seekTo(long j15) {
        N(j15, 5);
    }

    @Override // t7.a0
    public final void t(s sVar) {
        O(n0.E(sVar));
    }

    @Override // t7.a0
    public final boolean w() {
        return K() != -1;
    }
}
