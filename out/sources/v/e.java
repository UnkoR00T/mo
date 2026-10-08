package v;

import android.util.Range;

/* JADX INFO: loaded from: classes.dex */
public class e extends a2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m0 f202547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l3 f202548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f202549d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f202550e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final f0 f202551f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private androidx.p016lifecycle.y<o.l2> f202552g;

    public e(m0 m0Var, f0 f0Var) {
        super(m0Var);
        this.f202549d = false;
        this.f202550e = false;
        this.f202552g = null;
        this.f202547b = m0Var;
        this.f202551f = f0Var;
        this.f202548c = f0Var.F(null);
        p(f0Var.p());
        m(f0Var.c0());
    }

    public static float h(float f15, float f16, float f17) {
        if (f17 == f16) {
            return 0.0f;
        }
        if (f15 == f17) {
            return 1.0f;
        }
        if (f15 == f16) {
            return 0.0f;
        }
        float f18 = 1.0f / f16;
        return ((1.0f / f15) - f18) / ((1.0f / f17) - f18);
    }

    @Override // v.a2, o.q
    public androidx.p016lifecycle.y<o.l2> D() {
        if (!y.u.a(this.f202548c, 0)) {
            return new androidx.p016lifecycle.b0(b0.h.d(1.0f, 1.0f, 1.0f, 0.0f));
        }
        if (this.f202548c != null) {
            o.l2 l2VarF = this.f202547b.D().f();
            final Range<Float> rangeG = this.f202548c.g();
            if (rangeG != null && (((Float) rangeG.getLower()).floatValue() != l2VarF.getMinZoomRatio() || ((Float) rangeG.getUpper()).floatValue() != l2VarF.getMaxZoomRatio())) {
                if (this.f202552g == null) {
                    this.f202552g = y.l.a(this.f202547b.D(), new p105prN.o2() { // from class: v.d
                        @Override // p105prN.o2
                        public final Object apply(Object obj) {
                            Range range = rangeG;
                            o.l2 l2Var = (o.l2) obj;
                            return b0.h.d(l2Var.getZoomRatio(), ((Float) range.getUpper()).floatValue(), ((Float) range.getLower()).floatValue(), e.h(l2Var.getZoomRatio(), ((Float) range.getLower()).floatValue(), ((Float) range.getUpper()).floatValue()));
                        }
                    });
                }
                return this.f202552g;
            }
        }
        return this.f202547b.D();
    }

    @Override // v.a2, v.m0
    public boolean P() {
        int[] iArrI;
        l3 l3Var = this.f202548c;
        if (l3Var == null || (iArrI = l3Var.i()) == null) {
            return super.P();
        }
        for (int i15 : iArrI) {
            if (i15 == 2) {
                return true;
            }
        }
        return false;
    }

    public f0 e() {
        return this.f202551f;
    }

    public void m(boolean z15) {
        this.f202550e = z15;
    }

    public void p(boolean z15) {
        this.f202549d = z15;
    }

    @Override // v.a2, v.m0
    public boolean w() {
        int[] iArrI;
        l3 l3Var = this.f202548c;
        if (l3Var == null || (iArrI = l3Var.i()) == null) {
            return super.w();
        }
        for (int i15 : iArrI) {
            if (i15 == 1) {
                return true;
            }
        }
        return false;
    }

    @Override // v.a2, v.m0
    public m0 x() {
        return this.f202547b;
    }
}
