package so;

import android.graphics.Path;

/* JADX INFO: loaded from: classes4.dex */
public class c0 extends n0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f182601h;

    c0(i0 i0Var) {
        super(i0Var);
    }

    @Override // so.n0
    public o I() {
        if (this.f182601h) {
            throw new UnsupportedOperationException("OTF fonts do not have a glyf table");
        }
        return super.I();
    }

    @Override // so.n0
    void K1(float f15) {
        this.f182601h = Float.floatToIntBits(f15) == 1184802985;
        super.K1(f15);
    }

    public b P1() {
        if (this.f182601h) {
            return (b) n0("CFF ");
        }
        throw new UnsupportedOperationException("TTF fonts do not have a CFF table");
    }

    public boolean Q1() {
        return this.f182727d.containsKey("CFF ");
    }

    @Override // so.n0, mo.b
    public Path r(String str) {
        return P1().j().e(x1(str)).d();
    }
}
