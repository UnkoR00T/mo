package dp1;

import androidx.compose.ui.graphics.Color;
import d1.a3;
import d1.e0;
import d1.x;
import er.p;
import f3.j;
import f3.m;
import h30.ButtonData;
import h30.q;
import i30.ButtonIconData;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import p70.n;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a)\u0010\u0005\u001a\u00020\u00032\b\b\u0001\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ldp1/e;", "viewModel", "Lkotlin/Function0;", "Loq/i0;", "close", "d", "(Ldp1/e;Ler/a;Lm2/r;II)V", "developer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f43685a = new a();

        a() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(463328961);
            if (t.k()) {
                t.o(463328961, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.designer.loader.DeveloperLoaderScreen.<anonymous>.<anonymous> (DeveloperLoaderScreen.kt:35)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jB;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x006f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:48:0x0187  */
    /* JADX WARN: Code duplicated, block: B:51:0x0193  */
    /* JADX WARN: Code duplicated, block: B:52:0x0197  */
    /* JADX WARN: Code duplicated, block: B:61:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:66:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:69:0x0232  */
    /* JADX WARN: Code duplicated, block: B:71:0x0238  */
    /* JADX WARN: Code duplicated, block: B:74:0x0241  */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    public static final void d(final e eVar, er.a<i0> aVar, r rVar, final int i15, final int i16) {
        int i17;
        final er.a<i0> aVar2;
        boolean z15;
        d5 d5VarM;
        er.a<i0> aVar3;
        er.a<androidx.compose.ui.node.c> aVarB;
        int i18;
        er.a<androidx.compose.ui.node.c> aVarB2;
        boolean z16;
        Object objE;
        Object objE2;
        r rVarH = rVar.h(-480342968);
        if ((i15 & 6) == 0) {
            i17 = i15 | ((i15 & 8) == 0 ? rVarH.W(eVar) : rVarH.G(eVar) ? 4 : 2);
        } else {
            i17 = i15;
        }
        int i19 = i16 & 2;
        if (i19 == 0) {
            if ((i15 & 48) == 0) {
                aVar2 = aVar;
                i17 |= rVarH.G(aVar2) ? 32 : 16;
            }
            if ((i17 & 19) != 18) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i19 != 0) {
                    objE2 = rVarH.E();
                    if (objE2 == r.INSTANCE.a()) {
                        objE2 = new er.a() { // from class: dp1.a
                            @Override // er.a
                            public final Object a() {
                                return d.e();
                            }
                        };
                        rVarH.v(objE2);
                    }
                    aVar3 = (er.a) objE2;
                } else {
                    aVar3 = aVar2;
                }
                if (t.k()) {
                    t.o(-480342968, i17, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.designer.loader.DeveloperLoaderScreen (DeveloperLoaderScreen.kt:27)");
                }
                m.Companion companion = m.INSTANCE;
                m mVarF = androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null);
                d1.i.n nVarK = d1.i.f39152a.k();
                f3.c.Companion companion2 = f3.c.INSTANCE;
                w0 w0VarA = e0.a(nVarK, companion2.k(), rVarH, 0);
                int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT = rVarH.t();
                m mVarE = j.e(rVarH, mVarF);
                androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
                aVarB = companion3.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB);
                } else {
                    rVarH.u();
                }
                r rVarC = n6.c(rVarH);
                n6.i(rVarC, w0VarA, companion3.d());
                n6.i(rVarC, e0VarT, companion3.f());
                n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
                n6.g(rVarC, companion3.a());
                n6.i(rVarC, mVarE, companion3.e());
                d1.i0 i0Var = d1.i0.f39176a;
                i18 = i17;
                n.g(null, null, mx.b.b("Loader", ""), null, null, 0L, null, new ButtonIconData(null, jz.a.U, a.f43685a, null, c70.a.f23835a.a().R(), aVar3, 9, null), rVarH, ButtonIconData.f88935g << 21, 123);
                k70.a aVar4 = k70.a.f108864a;
                int i25 = k70.a.f108865b;
                m mVarP = a3.p(a3.r(companion, 0.0f, aVar4.b(rVarH, i25).getSpacing400(), 0.0f, 0.0f, 13, null), aVar4.b(rVarH, i25).getSpacing200(), 0.0f, 2, null);
                w0 w0VarI = d1.r.i(companion2.o(), false);
                int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT2 = rVarH.t();
                m mVarE2 = j.e(rVarH, mVarP);
                aVarB2 = companion3.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB2);
                } else {
                    rVarH.u();
                }
                r rVarC2 = n6.c(rVarH);
                n6.i(rVarC2, w0VarI, companion3.d());
                n6.i(rVarC2, e0VarT2, companion3.f());
                n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
                n6.g(rVarC2, companion3.a());
                n6.i(rVarC2, mVarE2, companion3.e());
                x xVar = x.f39368a;
                k30.a.Large large = new k30.a.Large(false, 1, null);
                k30.d.a aVar5 = k30.d.a.f107773a;
                k30.c.WithText withText = new k30.c.WithText(mx.b.b("Show loader", ""), null, 2, null);
                if ((i18 & 14) != 4 || ((i18 & 8) != 0 && rVarH.G(eVar))) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objE = rVarH.E();
                if (z16 || objE == r.INSTANCE.a()) {
                    objE = new er.a() { // from class: dp1.b
                        @Override // er.a
                        public final Object a() {
                            return d.f(eVar);
                        }
                    };
                    rVarH.v(objE);
                }
                q.p(new ButtonData(null, null, large, withText, aVar5, null, (er.a) objE, 35, null), false, null, rVarH, 0, 6);
                rVarH.x();
                rVarH.x();
                if (t.k()) {
                    t.n();
                }
                aVar2 = aVar3;
            } else {
                rVarH.O();
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: dp1.c
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return d.g(eVar, aVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 48;
        aVar2 = aVar;
        if ((i17 & 19) != 18) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i17 & 1)) {
            if (i19 != 0) {
                objE2 = rVarH.E();
                if (objE2 == r.INSTANCE.a()) {
                    objE2 = new er.a() { // from class: dp1.a
                        @Override // er.a
                        public final Object a() {
                            return d.e();
                        }
                    };
                    rVarH.v(objE2);
                }
                aVar3 = (er.a) objE2;
            } else {
                aVar3 = aVar2;
            }
            if (t.k()) {
                t.o(-480342968, i17, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.designer.loader.DeveloperLoaderScreen (DeveloperLoaderScreen.kt:27)");
            }
            m.Companion companion4 = m.INSTANCE;
            m mVarF2 = androidx.compose.foundation.layout.d.f(companion4, 0.0f, 1, null);
            d1.i.n nVarK2 = d1.i.f39152a.k();
            f3.c.Companion companion5 = f3.c.INSTANCE;
            w0 w0VarA2 = e0.a(nVarK2, companion5.k(), rVarH, 0);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT3 = rVarH.t();
            m mVarE3 = j.e(rVarH, mVarF2);
            androidx.compose.ui.node.c.Companion companion6 = androidx.compose.ui.node.c.INSTANCE;
            aVarB = companion6.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            r rVarC3 = n6.c(rVarH);
            n6.i(rVarC3, w0VarA2, companion6.d());
            n6.i(rVarC3, e0VarT3, companion6.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion6.c());
            n6.g(rVarC3, companion6.a());
            n6.i(rVarC3, mVarE3, companion6.e());
            d1.i0 i0Var2 = d1.i0.f39176a;
            i18 = i17;
            n.g(null, null, mx.b.b("Loader", ""), null, null, 0L, null, new ButtonIconData(null, jz.a.U, a.f43685a, null, c70.a.f23835a.a().R(), aVar3, 9, null), rVarH, ButtonIconData.f88935g << 21, 123);
            k70.a aVar6 = k70.a.f108864a;
            int i26 = k70.a.f108865b;
            m mVarP2 = a3.p(a3.r(companion4, 0.0f, aVar6.b(rVarH, i26).getSpacing400(), 0.0f, 0.0f, 13, null), aVar6.b(rVarH, i26).getSpacing200(), 0.0f, 2, null);
            w0 w0VarI2 = d1.r.i(companion5.o(), false);
            int iHashCode4 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT4 = rVarH.t();
            m mVarE4 = j.e(rVarH, mVarP2);
            aVarB2 = companion6.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB2);
            } else {
                rVarH.u();
            }
            r rVarC4 = n6.c(rVarH);
            n6.i(rVarC4, w0VarI2, companion6.d());
            n6.i(rVarC4, e0VarT4, companion6.f());
            n6.i(rVarC4, Integer.valueOf(iHashCode4), companion6.c());
            n6.g(rVarC4, companion6.a());
            n6.i(rVarC4, mVarE4, companion6.e());
            x xVar2 = x.f39368a;
            k30.a.Large large2 = new k30.a.Large(false, 1, null);
            k30.d.a aVar7 = k30.d.a.f107773a;
            k30.c.WithText withText2 = new k30.c.WithText(mx.b.b("Show loader", ""), null, 2, null);
            if ((i18 & 14) != 4) {
                z16 = true;
            } else {
                z16 = true;
            }
            objE = rVarH.E();
            if (z16) {
                objE = new er.a() { // from class: dp1.b
                    @Override // er.a
                    public final Object a() {
                        return d.f(eVar);
                    }
                };
                rVarH.v(objE);
            } else {
                objE = new er.a() { // from class: dp1.b
                    @Override // er.a
                    public final Object a() {
                        return d.f(eVar);
                    }
                };
                rVarH.v(objE);
            }
            q.p(new ButtonData(null, null, large2, withText2, aVar7, null, (er.a) objE, 35, null), false, null, rVarH, 0, 6);
            rVarH.x();
            rVarH.x();
            if (t.k()) {
                t.n();
            }
            aVar2 = aVar3;
        } else {
            rVarH.O();
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: dp1.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d.g(eVar, aVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(e eVar) {
        eVar.e3();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(e eVar, er.a aVar, int i15, int i16, r rVar, int i17) {
        d(eVar, aVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }
}
