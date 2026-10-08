package v9;

import o8.s0;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f205206a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private s0 f205208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f205209d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f205211f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f205212g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w7.c0 f205207b = new w7.c0(10);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f205210e = -9223372036854775807L;

    public r(String str) {
        this.f205206a = str;
    }

    @Override // v9.m
    public void b(w7.c0 c0Var) {
        zj.p.q(this.f205208c);
        if (this.f205209d) {
            int iA = c0Var.a();
            int i15 = this.f205212g;
            if (i15 < 10) {
                int iMin = Math.min(iA, 10 - i15);
                System.arraycopy(c0Var.f(), c0Var.g(), this.f205207b.f(), this.f205212g, iMin);
                if (this.f205212g + iMin == 10) {
                    this.f205207b.f0(0);
                    if (73 != this.f205207b.Q() || 68 != this.f205207b.Q() || 51 != this.f205207b.Q()) {
                        w7.t.h("Id3Reader", "Discarding invalid ID3 tag");
                        this.f205209d = false;
                        return;
                    } else {
                        this.f205207b.g0(3);
                        this.f205211f = this.f205207b.P() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iA, this.f205211f - this.f205212g);
            this.f205208c.a(c0Var, iMin2);
            this.f205212g += iMin2;
        }
    }

    @Override // v9.m
    public void c() {
        this.f205209d = false;
        this.f205210e = -9223372036854775807L;
    }

    @Override // v9.m
    public void d(o8.r rVar, l0.d dVar) {
        dVar.a();
        s0 s0VarV = rVar.v(dVar.c(), 5);
        this.f205208c = s0VarV;
        s0VarV.e(new t7.p.b().k0(dVar.b()).X(this.f205206a).A0("application/id3").Q());
    }

    @Override // v9.m
    public void e(boolean z15) {
        int i15;
        zj.p.q(this.f205208c);
        if (this.f205209d && (i15 = this.f205211f) != 0 && this.f205212g == i15) {
            zj.p.w(this.f205210e != -9223372036854775807L);
            this.f205208c.c(this.f205210e, 1, this.f205211f, 0, null);
            this.f205209d = false;
        }
    }

    @Override // v9.m
    public void f(long j15, int i15) {
        if ((i15 & 4) == 0) {
            return;
        }
        this.f205209d = true;
        this.f205210e = j15;
        this.f205211f = 0;
        this.f205212g = 0;
    }
}
