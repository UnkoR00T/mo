package v9;

import java.util.List;
import o8.s0;

/* JADX INFO: loaded from: classes3.dex */
final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<t7.p> f205123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f205124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s0[] f205125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final x7.k f205126d;

    public o0(List<t7.p> list, String str) {
        this.f205123a = list;
        this.f205124b = str;
        this.f205125c = new s0[list.size()];
        x7.k kVar = new x7.k(new x7.k.b() { // from class: v9.n0
            @Override // x7.k.b
            public final void a(long j15, w7.c0 c0Var) {
                o8.f.b(j15, c0Var, this.f205095a.f205125c);
            }
        });
        this.f205126d = kVar;
        kVar.g(3);
    }

    public void b(long j15, w7.c0 c0Var) {
        if (c0Var.a() < 9) {
            return;
        }
        int iZ = c0Var.z();
        int iZ2 = c0Var.z();
        int iQ = c0Var.Q();
        if (iZ == 434 && iZ2 == 1195456820 && iQ == 3) {
            this.f205126d.a(j15, c0Var);
        }
    }

    public void c(o8.r rVar, l0.d dVar) {
        for (int i15 = 0; i15 < this.f205125c.length; i15++) {
            dVar.a();
            s0 s0VarV = rVar.v(dVar.c(), 3);
            t7.p pVar = this.f205123a.get(i15);
            String str = pVar.f188381p;
            zj.p.l("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: %s", str);
            s0VarV.e(new t7.p.b().k0(dVar.b()).X(this.f205124b).A0(str).C0(pVar.f188370e).o0(pVar.f188369d).R(pVar.M).l0(pVar.f188384s).Q());
            this.f205125c[i15] = s0VarV;
        }
    }
}
