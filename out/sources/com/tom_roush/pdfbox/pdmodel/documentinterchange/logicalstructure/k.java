package com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure;

/* JADX INFO: loaded from: classes4.dex */
public class k extends hp.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f36984b;

    public k(j jVar) {
        this.f36984b = jVar;
    }

    private boolean e(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 != null;
        }
        return !obj.equals(obj2);
    }

    private void g(Object obj, Object obj2) {
        if (e(obj, obj2)) {
            this.f36984b.q(this);
        }
    }

    public String b() {
        return D1().L4(bp.i.f20846q3);
    }

    public String c() {
        return D1().H4(bp.i.L5);
    }

    public bp.b d() {
        return D1().p4(bp.i.f20863r9);
    }

    @Override // hp.d
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        j jVar = this.f36984b;
        if (jVar == null) {
            if (kVar.f36984b != null) {
                return false;
            }
        } else if (!jVar.equals(kVar.f36984b)) {
            return false;
        }
        return true;
    }

    public boolean f() {
        return D1().h4(bp.i.f20717d4, false);
    }

    public void h(String str) {
        g(b(), str);
        D1().g5(bp.i.f20846q3, str);
    }

    @Override // hp.d
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        j jVar = this.f36984b;
        return iHashCode + (jVar == null ? 0 : jVar.hashCode());
    }

    public void i(boolean z15) {
        g(Boolean.valueOf(f()), Boolean.valueOf(z15));
        D1().Q4(bp.i.f20717d4, z15);
    }

    public void j(String str) {
        g(c(), str);
        D1().d5(bp.i.L5, str);
    }

    public void k(bp.b bVar) {
        g(d(), bVar);
        D1().Y4(bp.i.f20863r9, bVar);
    }

    public String toString() {
        return "Name=" + c() + ", Value=" + d() + ", FormattedValue=" + b() + ", Hidden=" + f();
    }

    public k(bp.d dVar, j jVar) {
        super(dVar);
        this.f36984b = jVar;
    }
}
