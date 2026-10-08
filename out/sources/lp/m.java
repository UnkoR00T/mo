package lp;

import io.sentry.android.core.c2;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class m implements hp.c, u, g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final a0 f119121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<Integer, Float> f119122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f119123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<Integer, Float> f119124d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<Integer, xp.g> f119125e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float[] f119126f = {880.0f, -1000.0f};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final bp.d f119127g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private s f119128h;

    m(bp.d dVar, a0 a0Var) {
        this.f119127g = dVar;
        this.f119121a = a0Var;
        r();
        q();
    }

    private float l() {
        if (this.f119123c == 0.0f) {
            bp.b bVarP4 = this.f119127g.p4(bp.i.T2);
            if (bVarP4 instanceof bp.k) {
                this.f119123c = ((bp.k) bVarP4).i3();
            } else {
                this.f119123c = 1000.0f;
            }
        }
        return this.f119123c;
    }

    private float o(int i15) {
        Float fValueOf = this.f119122b.get(Integer.valueOf(i15));
        if (fValueOf == null) {
            fValueOf = Float.valueOf(l());
        }
        return fValueOf.floatValue();
    }

    private void q() {
        bp.b bVarP4 = this.f119127g.p4(bp.i.U2);
        if (bVarP4 instanceof bp.a) {
            bp.a aVar = (bp.a) bVarP4;
            bp.b bVarK4 = aVar.k4(0);
            bp.b bVarK5 = aVar.k4(1);
            if ((bVarK4 instanceof bp.k) && (bVarK5 instanceof bp.k)) {
                this.f119126f[0] = ((bp.k) bVarK4).i3();
                this.f119126f[1] = ((bp.k) bVarK5).i3();
            }
        }
        bp.b bVarP5 = this.f119127g.p4(bp.i.E9);
        if (bVarP5 instanceof bp.a) {
            bp.a aVar2 = (bp.a) bVarP5;
            int i15 = 0;
            while (i15 < aVar2.size()) {
                bp.k kVar = (bp.k) aVar2.k4(i15);
                int i16 = i15 + 1;
                bp.b bVarK6 = aVar2.k4(i16);
                if (bVarK6 instanceof bp.a) {
                    bp.a aVar3 = (bp.a) bVarK6;
                    for (int i17 = 0; i17 < aVar3.size(); i17 += 3) {
                        int iJ3 = kVar.J3() + (i17 / 3);
                        bp.k kVar2 = (bp.k) aVar3.k4(i17);
                        bp.k kVar3 = (bp.k) aVar3.k4(i17 + 1);
                        bp.k kVar4 = (bp.k) aVar3.k4(i17 + 2);
                        this.f119124d.put(Integer.valueOf(iJ3), Float.valueOf(kVar2.i3()));
                        this.f119125e.put(Integer.valueOf(iJ3), new xp.g(kVar3.i3(), kVar4.i3()));
                    }
                } else {
                    int iJ4 = ((bp.k) bVarK6).J3();
                    bp.k kVar5 = (bp.k) aVar2.k4(i15 + 2);
                    bp.k kVar6 = (bp.k) aVar2.k4(i15 + 3);
                    int i18 = i15 + 4;
                    bp.k kVar7 = (bp.k) aVar2.k4(i18);
                    for (int iJ5 = kVar.J3(); iJ5 <= iJ4; iJ5++) {
                        this.f119124d.put(Integer.valueOf(iJ5), Float.valueOf(kVar5.i3()));
                        this.f119125e.put(Integer.valueOf(iJ5), new xp.g(kVar6.i3(), kVar7.i3()));
                    }
                    i16 = i18;
                }
                i15 = i16 + 1;
            }
        }
    }

    private void r() {
        this.f119122b = new HashMap();
        bp.b bVarP4 = this.f119127g.p4(bp.i.D9);
        if (bVarP4 instanceof bp.a) {
            bp.a aVar = (bp.a) bVarP4;
            int size = aVar.size();
            int i15 = 0;
            while (i15 < size - 1) {
                int i16 = i15 + 1;
                bp.b bVarK4 = aVar.k4(i15);
                if (bVarK4 instanceof bp.k) {
                    bp.k kVar = (bp.k) bVarK4;
                    int i17 = i15 + 2;
                    bp.b bVarK5 = aVar.k4(i16);
                    if (bVarK5 instanceof bp.a) {
                        bp.a aVar2 = (bp.a) bVarK5;
                        int iJ3 = kVar.J3();
                        int size2 = aVar2.size();
                        for (int i18 = 0; i18 < size2; i18++) {
                            bp.b bVarK6 = aVar2.k4(i18);
                            if (bVarK6 instanceof bp.k) {
                                this.f119122b.put(Integer.valueOf(iJ3 + i18), Float.valueOf(((bp.k) bVarK6).i3()));
                            } else {
                                c2.g("PdfBox-Android", "Expected a number array member, got " + bVarK6);
                            }
                        }
                        i15 = i17;
                    } else {
                        if (i17 >= size) {
                            c2.g("PdfBox-Android", "premature end of widths array");
                            return;
                        }
                        i15 += 3;
                        bp.b bVarK7 = aVar.k4(i17);
                        if ((bVarK5 instanceof bp.k) && (bVarK7 instanceof bp.k)) {
                            int iJ4 = ((bp.k) bVarK5).J3();
                            float fI3 = ((bp.k) bVarK7).i3();
                            for (int iJ5 = kVar.J3(); iJ5 <= iJ4; iJ5++) {
                                this.f119122b.put(Integer.valueOf(iJ5), Float.valueOf(fI3));
                            }
                        } else {
                            c2.g("PdfBox-Android", "Expected two numbers, got " + bVarK5 + " and " + bVarK7);
                        }
                    }
                } else {
                    c2.g("PdfBox-Android", "Expected a number array member, got " + bVarK4);
                    i15 = i16;
                }
            }
        }
    }

    public abstract int f(int i15);

    public abstract int g(int i15);

    @Override // lp.u
    public String getName() {
        return i();
    }

    protected abstract byte[] h(int i15);

    public String i() {
        return this.f119127g.H4(bp.i.f20897v0);
    }

    public q j() {
        bp.b bVarP4 = this.f119127g.p4(bp.i.f20833p1);
        if (bVarP4 instanceof bp.d) {
            return new q((bp.d) bVarP4);
        }
        return null;
    }

    @Override // hp.c
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public bp.d D1() {
        return this.f119127g;
    }

    public s m() {
        bp.d dVar;
        if (this.f119128h == null && (dVar = (bp.d) this.f119127g.p4(bp.i.J3)) != null) {
            this.f119128h = new s(dVar);
        }
        return this.f119128h;
    }

    public float n(int i15) {
        return o(f(i15));
    }

    final int[] p() throws IOException {
        bp.b bVarP4 = this.f119127g.p4(bp.i.f20814n1);
        if (!(bVarP4 instanceof bp.o)) {
            return null;
        }
        bp.g gVarL5 = ((bp.o) bVarP4).l5();
        byte[] bArrE = dp.a.e(gVarL5);
        dp.a.b(gVarL5);
        int length = bArrE.length / 2;
        int[] iArr = new int[length];
        int i15 = 0;
        for (int i16 = 0; i16 < length; i16++) {
            iArr[i16] = ((bArrE[i15] & 255) << 8) | (bArrE[i15 + 1] & 255);
            i15 += 2;
        }
        return iArr;
    }
}
