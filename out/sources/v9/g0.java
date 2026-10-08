package v9;

import java.util.List;
import o8.s0;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<t7.p> f204950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f204951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s0[] f204952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final x7.k f204953d = new x7.k(new x7.k.b() { // from class: v9.f0
        @Override // x7.k.b
        public final void a(long j15, w7.c0 c0Var) {
            o8.f.a(j15, c0Var, this.f204949a.f204952c);
        }
    });

    public g0(List<t7.p> list, String str) {
        this.f204950a = list;
        this.f204951b = str;
        this.f204952c = new s0[list.size()];
    }

    public void b() {
        this.f204953d.d();
    }

    public void c(long j15, w7.c0 c0Var) {
        this.f204953d.a(j15, c0Var);
    }

    public void d(o8.r rVar, l0.d dVar) {
        for (int i15 = 0; i15 < this.f204952c.length; i15++) {
            dVar.a();
            s0 s0VarV = rVar.v(dVar.c(), 3);
            t7.p pVar = this.f204950a.get(i15);
            String str = pVar.f188381p;
            zj.p.l("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: %s", str);
            String strB = pVar.f188366a;
            if (strB == null) {
                strB = dVar.b();
            }
            s0VarV.e(new t7.p.b().k0(strB).X(this.f204951b).A0(str).C0(pVar.f188370e).o0(pVar.f188369d).R(pVar.M).l0(pVar.f188384s).Q());
            this.f204952c[i15] = s0VarV;
        }
    }

    public void e() {
        this.f204953d.d();
    }

    public void f(int i15) {
        this.f204953d.g(i15);
    }
}
