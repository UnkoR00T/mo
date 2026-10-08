package qk2;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import i50.BaseScaffoldData;
import n50.h0;
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
import q4.TextStyle;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lqk2/c;", "viewModel", "Loq/i0;", "k", "(Lqk2/c;Lm2/r;I)V", "Lqk2/c$a;", "data", "Li70/p;", "snackBarState", "Lkotlin/Function0;", "onSnackBarHidden", "f", "(Lqk2/c$a;Li70/p;Ler/a;Lm2/r;I)V", "midcard_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class a extends fr.q implements er.a<i0> {
        a(Object obj) {
            super(0, obj, c.class, "hideSnackBar", "hideSnackBar()V", 0);
        }

        public final void E() {
            ((c) this.f66391b).B0();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            E();
            return i0.f148189a;
        }
    }

    public static final void f(final c.Data data, final i70.p pVar, final er.a<i0> aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1740872864);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(data) : rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(aVar) ? 256 : 128;
        }
        int i17 = i16;
        if (rVarH.r((i17 & 147) != 146, i17 & 1)) {
            if (t.k()) {
                t.o(1740872864, i17, -1, "pl.gov.coi.mobywatel.feature.midcard.presentation.screen.iddocumentdetails.ChooseDocumentInitializedScreenContent (IdDocumentDetailsScreen.kt:50)");
            }
            Object objE = rVarH.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = new al();
                rVarH.v(objE);
            }
            final al alVar = (al) objE;
            i70.m.d(alVar, pVar, aVar, null, null, rVarH, (i17 & 112) | 6 | (i17 & 896), 24);
            boolean z15 = (i17 & 14) == 4 || ((i17 & 8) != 0 && rVarH.G(data));
            Object objE2 = rVarH.E();
            if (z15 || objE2 == companion.a()) {
                objE2 = new er.a() { // from class: qk2.e
                    @Override // er.a
                    public final Object a() {
                        return i.g(data);
                    }
                };
                rVarH.v(objE2);
            }
            q0.g(false, (er.a) objE2, rVarH, 0, 1);
            i50.s.r(data.getBaseScaffoldData(), null, y2.m.d(-459890026, true, new er.p() { // from class: qk2.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.h(alVar, pVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1205644723, true, new er.q() { // from class: qk2.g
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return i.i(data, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g | MLKEMEngine.KyberPolyBytes, 196608, 32762);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: qk2.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.j(data, pVar, aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(c.Data data) {
        data.f().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(al alVar, i70.p pVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-459890026, i15, -1, "pl.gov.coi.mobywatel.feature.midcard.presentation.screen.iddocumentdetails.ChooseDocumentInitializedScreenContent.<anonymous> (IdDocumentDetailsScreen.kt:64)");
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
    public static final i0 i(c.Data data, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(-1205644723, i16, -1, "pl.gov.coi.mobywatel.feature.midcard.presentation.screen.iddocumentdetails.ChooseDocumentInitializedScreenContent.<anonymous> (IdDocumentDetailsScreen.kt:70)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(a3.l(companion, d3Var), 0.0f, 1, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarF);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            if (data.getItemsCardList() == null || data.getItemsCardList().d().size() <= 1) {
                rVar.X(1712709032);
                f3.m mVarF2 = androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null);
                w0 w0VarA2 = e0.a(iVar.e(), companion2.g(), rVar, 54);
                int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
                p076m2.e0 e0VarT2 = rVar.t();
                f3.m mVarE2 = f3.j.e(rVar, mVarF2);
                er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
                if (rVar.l() == null) {
                    p076m2.m.d();
                }
                rVar.K();
                if (rVar.getInserting()) {
                    rVar.H(aVarB2);
                } else {
                    rVar.u();
                }
                p076m2.r rVarC2 = n6.c(rVar);
                n6.i(rVarC2, w0VarA2, companion3.d());
                n6.i(rVarC2, e0VarT2, companion3.f());
                n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
                n6.g(rVarC2, companion3.a());
                n6.i(rVarC2, mVarE2, companion3.e());
                k70.a aVar = k70.a.f108864a;
                int i17 = k70.a.f108865b;
                TextStyle textStyleI = aVar.f(rVar, i17).i();
                b5.j.Companion companion4 = b5.j.INSTANCE;
                j70.h.g(null, null, data.getEmptyContentHeader(), null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, b5.j.h(companion4.a()), 0L, 0, false, 0, 0, null, textStyleI, null, null, false, false, null, rVar, 0, 0, 0, 33026011);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing250()), rVar, 0);
                j70.h.g(null, null, data.getEmptyContentDescription(), null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, b5.j.h(companion4.a()), 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).b(), null, null, false, false, null, rVar, 0, 0, 0, 33026011);
                rVar.x();
                rVar.R();
            } else {
                rVar.X(1713503965);
                k70.a aVar2 = k70.a.f108864a;
                int i18 = k70.a.f108865b;
                f3.m mVarS = t70.i.S(a3.q(companion, aVar2.b(rVar, i18).getSpacing200(), aVar2.b(rVar, i18).getSpacing100(), aVar2.b(rVar, i18).getSpacing200(), aVar2.b(rVar, i18).getSpacing200()), null, rVar, 0, 1);
                w0 w0VarA3 = e0.a(iVar.k(), companion2.k(), rVar, 0);
                int iHashCode3 = Long.hashCode(p076m2.m.b(rVar, 0));
                p076m2.e0 e0VarT3 = rVar.t();
                f3.m mVarE3 = f3.j.e(rVar, mVarS);
                er.a<androidx.compose.ui.node.c> aVarB3 = companion3.b();
                if (rVar.l() == null) {
                    p076m2.m.d();
                }
                rVar.K();
                if (rVar.getInserting()) {
                    rVar.H(aVarB3);
                } else {
                    rVar.u();
                }
                p076m2.r rVarC3 = n6.c(rVar);
                n6.i(rVarC3, w0VarA3, companion3.d());
                n6.i(rVarC3, e0VarT3, companion3.f());
                n6.i(rVarC3, Integer.valueOf(iHashCode3), companion3.c());
                n6.g(rVarC3, companion3.a());
                n6.i(rVarC3, mVarE3, companion3.e());
                m30.i.d(data.getItemsCardList(), null, null, rVar, 0, 6);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVar, i18).getSpacing200()), rVar, 0);
                if (data.getUpdateCardData() == null) {
                    rVar.X(-1511321767);
                } else {
                    rVar.X(-1511321766);
                    h0.v(data.getUpdateCardData(), null, rVar, 0, 2);
                    i0 i0Var2 = i0.f148189a;
                }
                rVar.R();
                if (data.getElectronicLayerSettingsCardData() == null) {
                    rVar.X(-1511163667);
                } else {
                    rVar.X(-1511163666);
                    r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVar, i18).getSpacing100()), rVar, 0);
                    h0.v(data.getElectronicLayerSettingsCardData(), null, rVar, 0, 2);
                    i0 i0Var3 = i0.f148189a;
                }
                rVar.R();
                rVar.x();
                rVar.R();
            }
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(c.Data data, i70.p pVar, er.a aVar, int i15, p076m2.r rVar, int i16) {
        f(data, pVar, aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void k(final c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(748583073);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        boolean z15 = false;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(748583073, i16, -1, "pl.gov.coi.mobywatel.feature.midcard.presentation.screen.iddocumentdetails.IdDocumentDetailsScreen (IdDocumentDetailsScreen.kt:32)");
            }
            f6 f6VarC = m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7);
            f6 f6VarB = m7.b.b(cVar.j(), i70.p.a.f89857a, null, null, null, rVarH, i70.p.a.f89858b << 3, 14);
            rVarH = rVarH;
            c.Data dataL = l(f6VarC);
            i70.p pVarM = m(f6VarB);
            if ((i16 & 14) == 4 || ((i16 & 8) != 0 && rVarH.G(cVar))) {
                z15 = true;
            }
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new a(cVar);
                rVarH.v(objE);
            }
            f(dataL, pVarM, (er.a) ((mr.g) objE), rVarH, BaseScaffoldData.f89350g);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: qk2.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.n(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.Data l(f6<c.Data> f6Var) {
        return f6Var.getValue();
    }

    private static final i70.p m(f6<? extends i70.p> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(c cVar, int i15, p076m2.r rVar, int i16) {
        k(cVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
