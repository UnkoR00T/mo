package v9;

import java.util.Collections;
import java.util.List;
import o8.s0;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<l0.a> f205052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f205053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s0[] f205054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f205055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f205056e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f205057f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f205058g = -9223372036854775807L;

    public l(List<l0.a> list, String str) {
        this.f205052a = list;
        this.f205053b = str;
        this.f205054c = new s0[list.size()];
    }

    private boolean a(w7.c0 c0Var, int i15) {
        if (c0Var.a() == 0) {
            return false;
        }
        if (c0Var.Q() != i15) {
            this.f205055d = false;
        }
        this.f205056e--;
        return this.f205055d;
    }

    @Override // v9.m
    public void b(w7.c0 c0Var) {
        if (this.f205055d) {
            if (this.f205056e != 2 || a(c0Var, 32)) {
                if (this.f205056e != 1 || a(c0Var, 0)) {
                    int iG = c0Var.g();
                    int iA = c0Var.a();
                    for (s0 s0Var : this.f205054c) {
                        c0Var.f0(iG);
                        s0Var.a(c0Var, iA);
                    }
                    this.f205057f += iA;
                }
            }
        }
    }

    @Override // v9.m
    public void c() {
        this.f205055d = false;
        this.f205058g = -9223372036854775807L;
    }

    @Override // v9.m
    public void d(o8.r rVar, l0.d dVar) {
        for (int i15 = 0; i15 < this.f205054c.length; i15++) {
            l0.a aVar = this.f205052a.get(i15);
            dVar.a();
            s0 s0VarV = rVar.v(dVar.c(), 3);
            s0VarV.e(new t7.p.b().k0(dVar.b()).X(this.f205053b).A0("application/dvbsubs").l0(Collections.singletonList(aVar.f205061c)).o0(aVar.f205059a).Q());
            this.f205054c[i15] = s0VarV;
        }
    }

    @Override // v9.m
    public void e(boolean z15) {
        if (this.f205055d) {
            zj.p.w(this.f205058g != -9223372036854775807L);
            for (s0 s0Var : this.f205054c) {
                s0Var.c(this.f205058g, 1, this.f205057f, 0, null);
            }
            this.f205055d = false;
        }
    }

    @Override // v9.m
    public void f(long j15, int i15) {
        if ((i15 & 4) == 0) {
            return;
        }
        this.f205055d = true;
        this.f205058g = j15;
        this.f205057f = 0;
        this.f205056e = 2;
    }
}
