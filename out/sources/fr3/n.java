package fr3;

import d1.a3;
import d1.d3;
import d1.r3;
import g30.ModalBottomSheetData;
import h70.ShortcutsLayoutData;
import hr3.DocumentMainCardScreenData;
import hr3.WruDocumentScreenData;
import i50.BaseScaffoldData;
import mx.Label;
import n30.CardListData;
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
import p088nul.q0;
import w20.BaseDocumentScreenState;
import w20.DocumentGiloshData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a5\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001f\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u001a²\u0006\f\u0010\u0019\u001a\u00020\u00188\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Lfr3/d;", "viewModel", "Loq/i0;", "n", "(Lfr3/d;Lm2/r;I)V", "Lfr3/d$a$b;", "data", "Li70/p;", "snackBarState", "Lhr3/e;", "bottomSheetState", "Lkotlin/Function0;", "hideSnackBar", "s", "(Lfr3/d$a$b;Li70/p;Lhr3/e;Ler/a;Lm2/r;I)V", "Lhr3/f;", "j", "(Lhr3/f;Lm2/r;I)V", "Lmx/a;", "sectionLabel", "Ln30/b;", "cardListData", "l", "(Lmx/a;Ln30/b;Lm2/r;I)V", "Lfr3/d$a;", "state", "wru_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class n {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class a extends fr.q implements er.a<i0> {
        a(Object obj) {
            super(0, obj, d.class, "hideSnackBar", "hideSnackBar()V", 0);
        }

        public final void E() {
            ((d) this.f66391b).B0();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            E();
            return i0.f148189a;
        }
    }

    private static final void j(final WruDocumentScreenData wruDocumentScreenData, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1516745914);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(wruDocumentScreenData) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1516745914, i16, -1, "pl.gov.coi.mobywatel.feature.wru.presentation.screens.wru.Content (WruScreen.kt:115)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            j70.h.g(androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null), null, wruDocumentScreenData.getCurrentDateTime(), null, null, 0L, 0L, null, null, null, 0L, null, b5.j.h(b5.j.INSTANCE.a()), 0L, 0, false, 0, 0, null, null, null, null, false, false, null, rVarH, 6, 0, 0, 33550330);
            rVarH = rVarH;
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing150()), rVarH, 0);
            t20.c.c(wruDocumentScreenData.getLogotypeData().getName(), wruDocumentScreenData.getLogotypeData().getLogo(), wruDocumentScreenData.getLogotypeData().getDescription(), rVarH, 0, 0);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
            rVarH.X(-1598894512);
            DocumentMainCardScreenData mainCardData = wruDocumentScreenData.getMainCardData();
            u20.g.g(null, new DocumentGiloshData(mainCardData.getGiloshBackground(), mainCardData.getGiloshForeground(), mainCardData.getUserPhoto(), null, null, null, null, e20.k.Poland, null, mainCardData.getIsValid(), mainCardData.getValidityMessage(), null, mainCardData.getKeyValuesGroup(), mainCardData.getKeyValueItemsColor(), mainCardData.getEnabledAnimations(), mainCardData.getAnimationsButtonText(), mainCardData.a(), wruDocumentScreenData.getLogoFlagContentDescription(), null, 264568, null), new BaseDocumentScreenState(null, wruDocumentScreenData.getEmblemText(), mainCardData.c().B(rVarH, 0), mainCardData.i(), 1, null), rVarH, (BaseDocumentScreenState.f209332e << 6) | (DocumentGiloshData.f209344t << 3), 1);
            rVarH.R();
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing300()), rVarH, 0);
            ShortcutsLayoutData shortcutsLayoutData = wruDocumentScreenData.getShortcutsLayoutData();
            if (shortcutsLayoutData == null) {
                rVarH.X(1974787624);
            } else {
                rVarH.X(1974787625);
                h70.g.f(shortcutsLayoutData, rVarH, ShortcutsLayoutData.f81324c);
            }
            rVarH.R();
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
            h0.v(wruDocumentScreenData.getRefreshDataItem(), null, rVarH, 0, 2);
            if (wruDocumentScreenData.getAdditionalSectionData().getData().d().isEmpty()) {
                rVarH.X(1969107836);
            } else {
                rVarH.X(1975031688);
                l(wruDocumentScreenData.getAdditionalSectionData().getLabel(), wruDocumentScreenData.getAdditionalSectionData().getData(), rVarH, 0);
            }
            rVarH.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: fr3.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.k(wruDocumentScreenData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(WruDocumentScreenData wruDocumentScreenData, int i15, p076m2.r rVar, int i16) {
        j(wruDocumentScreenData, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void l(Label label, CardListData cardListData, p076m2.r rVar, final int i15) {
        int i16;
        final Label label2;
        p076m2.r rVar2;
        final CardListData cardListData2 = cardListData;
        p076m2.r rVarH = rVar.h(-1067672522);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.W(label) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(cardListData2) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1067672522, i16, -1, "pl.gov.coi.mobywatel.feature.wru.presentation.screens.wru.DocumentAdditionalData (WruScreen.kt:176)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarR = a3.r(companion, 0.0f, aVar.b(rVarH, i17).getSpacing200(), 0.0f, 0.0f, 13, null);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarR);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            rVar2 = rVarH;
            j70.h.g(a3.r(companion, aVar.b(rVarH, i17).getSpacing100(), 0.0f, 0.0f, 0.0f, 14, null), null, label, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).j(), null, null, false, false, null, rVar2, (i16 << 6) & 896, 0, 0, 33030138);
            label2 = label;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
            cardListData2 = cardListData;
            m30.i.d(cardListData2, null, null, rVar2, (i16 >> 3) & 14, 6);
            rVar2.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            label2 = label;
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: fr3.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.m(label2, cardListData2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(Label label, CardListData cardListData, int i15, p076m2.r rVar, int i16) {
        l(label, cardListData, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void n(final d dVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-489649536);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(dVar) : rVarH.G(dVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        boolean z15 = false;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-489649536, i16, -1, "pl.gov.coi.mobywatel.feature.wru.presentation.screens.wru.WruScreen (WruScreen.kt:46)");
            }
            f6 f6VarC = m7.b.c(dVar.getState(), null, null, null, rVarH, 0, 7);
            f6 f6VarB = m7.b.b(dVar.j(), i70.p.a.f89857a, null, null, null, rVarH, i70.p.a.f89858b << 3, 14);
            rVarH = rVarH;
            f6 f6VarC2 = m7.b.c(dVar.T(), null, null, null, rVarH, 0, 7);
            d.a aVarO = o(f6VarC);
            if (aVarO instanceof d.a.C1488a) {
                rVarH.X(1893210884);
                rVarH.R();
            } else {
                if (!(aVarO instanceof d.a.Initialized)) {
                    rVarH.X(1893209145);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(1893212520);
                d.a.Initialized initialized = (d.a.Initialized) aVarO;
                i70.p pVarP = p(f6VarB);
                hr3.e eVarQ = q(f6VarC2);
                if ((i16 & 14) == 4 || ((i16 & 8) != 0 && rVarH.G(dVar))) {
                    z15 = true;
                }
                Object objE = rVarH.E();
                if (z15 || objE == p076m2.r.INSTANCE.a()) {
                    objE = new a(dVar);
                    rVarH.v(objE);
                }
                s(initialized, pVarP, eVarQ, (er.a) ((mr.g) objE), rVarH, 0);
                rVarH.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: fr3.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.r(dVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final d.a o(f6<? extends d.a> f6Var) {
        return f6Var.getValue();
    }

    private static final i70.p p(f6<? extends i70.p> f6Var) {
        return f6Var.getValue();
    }

    private static final hr3.e q(f6<? extends hr3.e> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(d dVar, int i15, p076m2.r rVar, int i16) {
        n(dVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void s(final d.a.Initialized initialized, i70.p pVar, final hr3.e eVar, final er.a<i0> aVar, p076m2.r rVar, final int i15) {
        int i16;
        final i70.p pVar2 = pVar;
        p076m2.r rVarH = rVar.h(-313277936);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar2) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= (i15 & 512) == 0 ? rVarH.W(eVar) : rVarH.G(eVar) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= rVarH.G(aVar) ? 2048 : 1024;
        }
        if (rVarH.r((i16 & 1171) != 1170, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-313277936, i16, -1, "pl.gov.coi.mobywatel.feature.wru.presentation.screens.wru.WruScreenContent (WruScreen.kt:70)");
            }
            Object objE = rVarH.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = new al();
                rVarH.v(objE);
            }
            final al alVar = (al) objE;
            i70.m.d(alVar, pVar2, aVar, null, null, rVarH, (i16 & 112) | 6 | ((i16 >> 3) & 896), 24);
            pVar2 = pVar2;
            g30.t.f(initialized.getModalBottomSheetData(), 0.0f, false, null, null, y2.m.d(-1088192855, true, new er.p() { // from class: fr3.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.t(eVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), y2.m.d(1055291306, true, new er.p() { // from class: fr3.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.u(initialized, alVar, pVar2, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, ModalBottomSheetData.f70192e | 1769472, 30);
            boolean zG = rVarH.G(initialized);
            Object objE2 = rVarH.E();
            if (zG || objE2 == companion.a()) {
                objE2 = new er.a() { // from class: fr3.h
                    @Override // er.a
                    public final Object a() {
                        return n.x(initialized);
                    }
                };
                rVarH.v(objE2);
            }
            q0.g(false, (er.a) objE2, rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: fr3.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.y(initialized, pVar2, eVar, aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(hr3.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1088192855, i15, -1, "pl.gov.coi.mobywatel.feature.wru.presentation.screens.wru.WruScreenContent.<anonymous> (WruScreen.kt:80)");
            }
            if (eVar instanceof hr3.e.Expanded) {
                rVar.X(-2076277727);
                hr3.e.Expanded expanded = (hr3.e.Expanded) eVar;
                a70.b.b(expanded.getBitmap(), expanded.getButtonText(), expanded.c(), rVar, 0);
                rVar.R();
            } else {
                if (!fr.t.c(eVar, hr3.e.a.f86454a)) {
                    rVar.X(-2076280121);
                    rVar.R();
                    throw new oq.p();
                }
                rVar.X(-2076269651);
                rVar.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(final d.a.Initialized initialized, final al alVar, final i70.p pVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1055291306, i15, -1, "pl.gov.coi.mobywatel.feature.wru.presentation.screens.wru.WruScreenContent.<anonymous> (WruScreen.kt:92)");
            }
            i50.s.r(initialized.getBaseScaffoldData(), null, y2.m.d(715422624, true, new er.p() { // from class: fr3.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.v(alVar, pVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1654966697, true, new er.q() { // from class: fr3.k
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return n.w(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVar, 54), rVar, BaseScaffoldData.f89350g | MLKEMEngine.KyberPolyBytes, 196608, 32762);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(al alVar, i70.p pVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(715422624, i15, -1, "pl.gov.coi.mobywatel.feature.wru.presentation.screens.wru.WruScreenContent.<anonymous>.<anonymous> (WruScreen.kt:94)");
            }
            i70.d.d(alVar, pVar, false, rVar, 6, 4);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w(d.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1654966697, i15, -1, "pl.gov.coi.mobywatel.feature.wru.presentation.screens.wru.WruScreenContent.<anonymous>.<anonymous> (WruScreen.kt:96)");
            }
            f3.m mVarN = t70.s.n(t70.i.S(androidx.compose.foundation.layout.d.f(a3.l(f3.m.INSTANCE, d3Var), 0.0f, 1, null), null, rVar, 0, 1), rVar, 0);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarN);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
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
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            j(initialized.getWruDocumentScreenData(), rVar, 0);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(d.a.Initialized initialized) {
        initialized.c().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y(d.a.Initialized initialized, i70.p pVar, hr3.e eVar, er.a aVar, int i15, p076m2.r rVar, int i16) {
        s(initialized, pVar, eVar, aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
