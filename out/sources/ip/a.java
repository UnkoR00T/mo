package ip;

import bp.d;
import bp.h;
import bp.i;
import hp.c;
import op.e;

/* JADX INFO: loaded from: classes4.dex */
public class a implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f96137b = "S";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f96138c = "D";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f96139a;

    public a() {
        this.f96139a = new d();
    }

    @Override // hp.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public d D1() {
        return this.f96139a;
    }

    public op.a b() {
        d dVar = this.f96139a;
        i iVar = i.Q0;
        bp.a aVar = (bp.a) dVar.p4(iVar);
        if (aVar == null) {
            aVar = new bp.a();
            h hVar = h.f20678g;
            aVar.A3(hVar);
            aVar.A3(hVar);
            aVar.A3(hVar);
            this.f96139a.Y4(iVar, aVar);
        }
        return new op.a(aVar.s4(), e.f148062c);
    }

    public String c() {
        return this.f96139a.I4(i.J7, f96137b);
    }

    public float d() {
        return this.f96139a.u4(i.D9, 1.0f);
    }

    public np.a e() {
        d dVar = this.f96139a;
        i iVar = i.W1;
        bp.a aVar = (bp.a) dVar.p4(iVar);
        if (aVar == null) {
            aVar = new bp.a();
            aVar.A3(h.f20681k);
            this.f96139a.Y4(iVar, aVar);
        }
        bp.a aVar2 = new bp.a();
        aVar2.A3(aVar);
        return new np.a(aVar2, 0);
    }

    public void f(op.a aVar) {
        this.f96139a.Y4(i.Q0, aVar != null ? aVar.d() : null);
    }

    public void g(String str) {
        this.f96139a.d5(i.J7, str);
    }

    public void h(float f15) {
        this.f96139a.U4(i.D9, f15);
    }

    public void i(bp.a aVar) {
        if (aVar == null) {
            aVar = null;
        }
        this.f96139a.Y4(i.W1, aVar);
    }

    public a(d dVar) {
        this.f96139a = dVar;
    }
}
