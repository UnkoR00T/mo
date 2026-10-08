package rr3;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.m3;
import d1.q3;
import i50.BaseScaffoldData;
import i50.s;
import mx.Label;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p046f2.al;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.t;
import p088nul.q0;
import tr3.ZusVisitInfoPageSection;
import x40.LinkData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0003¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e²\u0006\f\u0010\r\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lrr3/e;", "viewModel", "Loq/i0;", "f", "(Lrr3/e;Lm2/r;I)V", "Lrr3/e$a;", "data", "Li70/p;", "snackBarState", "Lkotlin/Function0;", "onSnackBarHidden", "j", "(Lrr3/e$a;Li70/p;Ler/a;Lm2/r;I)V", "state", "zusvisit_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class k {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class a extends fr.q implements er.a<i0> {
        a(Object obj) {
            super(0, obj, e.class, "hideSnackBar", "hideSnackBar()V", 0);
        }

        public final void E() {
            ((e) this.f66391b).B0();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            E();
            return i0.f148189a;
        }
    }

    public static final void f(final e eVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1234073908);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(eVar) : rVarH.G(eVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        boolean z15 = true;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1234073908, i16, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.infopage.ZusVisitInfoPageScreen (ZusVisitInfoPageScreen.kt:35)");
            }
            f6 f6VarC = m7.b.c(eVar.getState(), null, null, null, rVarH, 0, 7);
            f6 f6VarB = m7.b.b(eVar.j(), i70.p.a.f89857a, null, null, null, rVarH, i70.p.a.f89858b << 3, 14);
            rVarH = rVarH;
            e.Data dataG = g(f6VarC);
            i70.p pVarH = h(f6VarB);
            if ((i16 & 14) != 4 && ((i16 & 8) == 0 || !rVarH.G(eVar))) {
                z15 = false;
            }
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new a(eVar);
                rVarH.v(objE);
            }
            j(dataG, pVarH, (er.a) ((mr.g) objE), rVarH, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: rr3.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.i(eVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final e.Data g(f6<e.Data> f6Var) {
        return f6Var.getValue();
    }

    private static final i70.p h(f6<? extends i70.p> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(e eVar, int i15, p076m2.r rVar, int i16) {
        f(eVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void j(final e.Data data, final i70.p pVar, final er.a<i0> aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1637462627);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(aVar) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (t.k()) {
                t.o(-1637462627, i16, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.infopage.ZusVisitInfoPageScreenContent (ZusVisitInfoPageScreen.kt:53)");
            }
            Object objE = rVarH.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = new al();
                rVarH.v(objE);
            }
            final al alVar = (al) objE;
            i70.m.d(alVar, pVar, aVar, null, null, rVarH, (i16 & 112) | 6 | (i16 & 896), 24);
            s.r(data.getBaseScaffoldData(), null, y2.m.d(-688683801, true, new er.p() { // from class: rr3.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.k(alVar, pVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(2044228688, true, new er.q() { // from class: rr3.h
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return k.l(data, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g | MLKEMEngine.KyberPolyBytes, 196608, 32762);
            boolean zG = rVarH.G(data);
            Object objE2 = rVarH.E();
            if (zG || objE2 == companion.a()) {
                objE2 = new er.a() { // from class: rr3.i
                    @Override // er.a
                    public final Object a() {
                        return k.m(data);
                    }
                };
                rVarH.v(objE2);
            }
            q0.g(false, (er.a) objE2, rVarH, 0, 1);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: rr3.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.n(data, pVar, aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(al alVar, i70.p pVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-688683801, i15, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.infopage.ZusVisitInfoPageScreenContent.<anonymous> (ZusVisitInfoPageScreen.kt:64)");
            }
            i70.d.d(alVar, pVar, false, rVar, 6, 4);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(e.Data data, d3 d3Var, p076m2.r rVar, int i15) {
        p076m2.r rVar2 = rVar;
        int i16 = (i15 & 6) == 0 ? i15 | (rVar2.W(d3Var) ? 4 : 2) : i15;
        boolean z15 = true;
        int i17 = 0;
        if (rVar2.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(2044228688, i16, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.infopage.ZusVisitInfoPageScreenContent.<anonymous> (ZusVisitInfoPageScreen.kt:67)");
            }
            boolean z16 = false;
            Object obj = null;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i18 = k70.a.f108865b;
            f3.m mVarN = t70.s.n(a3.l(t70.i.S(w0.i.d(mVarF, aVar.a(rVar2, i18).getBase().a(), null, 2, null), null, rVar2, 0, 1), d3Var), rVar2, 0);
            w0 w0VarA = e0.a(d1.i.f39152a.r(aVar.b(rVar2, i18).getSpacing400()), f3.c.INSTANCE.k(), rVar2, 48);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar2, 0));
            p076m2.e0 e0VarT = rVar2.t();
            f3.m mVarE = f3.j.e(rVar2, mVarN);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
            if (rVar2.l() == null) {
                p076m2.m.d();
            }
            rVar2.K();
            if (rVar2.getInserting()) {
                rVar2.H(aVarB);
            } else {
                rVar2.u();
            }
            p076m2.r rVarC = n6.c(rVar2);
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            rVar2.X(1878106939);
            for (ZusVisitInfoPageSection zusVisitInfoPageSection : data.c()) {
                d1.i iVar = d1.i.f39152a;
                k70.a aVar2 = k70.a.f108864a;
                int i19 = k70.a.f108865b;
                d1.i.f fVarR = iVar.r(aVar2.b(rVar2, i19).getSpacing250());
                f3.m.Companion companion2 = f3.m.INSTANCE;
                w0 w0VarA2 = e0.a(fVarR, f3.c.INSTANCE.k(), rVar2, i17);
                int iHashCode2 = Long.hashCode(p076m2.m.b(rVar2, i17));
                p076m2.e0 e0VarT2 = rVar2.t();
                f3.m mVarE2 = f3.j.e(rVar2, companion2);
                androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
                er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
                if (rVar2.l() == null) {
                    p076m2.m.d();
                }
                rVar2.K();
                if (rVar2.getInserting()) {
                    rVar2.H(aVarB2);
                } else {
                    rVar2.u();
                }
                p076m2.r rVarC2 = n6.c(rVar2);
                n6.i(rVarC2, w0VarA2, companion3.d());
                n6.i(rVarC2, e0VarT2, companion3.f());
                n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
                n6.g(rVarC2, companion3.a());
                n6.i(rVarC2, mVarE2, companion3.e());
                d1.i0 i0Var2 = d1.i0.f39176a;
                j70.h.g(null, null, zusVisitInfoPageSection.getHeader(), null, null, aVar2.a(rVar2, i19).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar2, i19).h(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
                rVar2 = rVar;
                rVar2.X(2006656493);
                for (Label label : zusVisitInfoPageSection.b()) {
                    f3.m mVarH = androidx.compose.foundation.layout.d.h(f3.m.INSTANCE, 0.0f, 1, null);
                    w0 w0VarB = m3.b(d1.i.f39152a.j(), f3.c.INSTANCE.l(), rVar2, 0);
                    int iHashCode3 = Long.hashCode(p076m2.m.b(rVar2, 0));
                    p076m2.e0 e0VarT3 = rVar2.t();
                    f3.m mVarE3 = f3.j.e(rVar2, mVarH);
                    androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
                    er.a<androidx.compose.ui.node.c> aVarB3 = companion4.b();
                    if (rVar2.l() == null) {
                        p076m2.m.d();
                    }
                    rVar2.K();
                    if (rVar2.getInserting()) {
                        rVar2.H(aVarB3);
                    } else {
                        rVar2.u();
                    }
                    p076m2.r rVarC3 = n6.c(rVar2);
                    n6.i(rVarC3, w0VarB, companion4.d());
                    n6.i(rVarC3, e0VarT3, companion4.f());
                    n6.i(rVarC3, Integer.valueOf(iHashCode3), companion4.c());
                    n6.g(rVarC3, companion4.a());
                    n6.i(rVarC3, mVarE3, companion4.e());
                    q3 q3Var = q3.f39261a;
                    Label labelO = mx.b.b("•  ", "bulletPointPrefix").o(label);
                    k70.a aVar3 = k70.a.f108864a;
                    int i25 = k70.a.f108865b;
                    j70.h.g(null, null, labelO, null, null, aVar3.a(rVar2, i25).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar3.f(rVar2, i25).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
                    rVar2 = rVar;
                    rVar2.x();
                }
                rVar2.R();
                Label additionalLabel = zusVisitInfoPageSection.getAdditionalLabel();
                if (additionalLabel == null) {
                    rVar2.X(2077227764);
                } else {
                    rVar2.X(2077227765);
                    k70.a aVar4 = k70.a.f108864a;
                    int i26 = k70.a.f108865b;
                    j70.h.g(null, null, additionalLabel, null, null, aVar4.a(rVar2, i26).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar4.f(rVar2, i26).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
                    rVar2 = rVar;
                    i0 i0Var3 = i0.f148189a;
                }
                rVar2.R();
                LinkData zusLinkData = zusVisitInfoPageSection.getZusLinkData();
                if (zusLinkData == null) {
                    rVar2.X(2077483452);
                } else {
                    rVar2.X(2077483453);
                    x40.h.g(zusLinkData, rVar2, LinkData.f216731g);
                    i0 i0Var4 = i0.f148189a;
                }
                rVar2.R();
                rVar2.x();
                i17 = 0;
                obj = null;
                z16 = false;
                z15 = true;
            }
            rVar2.R();
            rVar2.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(e.Data data) {
        data.b().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(e.Data data, i70.p pVar, er.a aVar, int i15, p076m2.r rVar, int i16) {
        j(data, pVar, aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
