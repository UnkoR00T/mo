package qz2;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import java.io.IOException;
import oq.i0;
import org.xmlpull.v1.XmlPullParserException;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;
import t40.InfoRowListData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\fH\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011²\u0006\f\u0010\u0010\u001a\u00020\u000f8\nX\u008a\u0084\u0002"}, d2 = {"Lqz2/n;", "viewModel", "Loq/i0;", "r", "(Lqz2/n;Lm2/r;I)V", "Lqz2/n$a$d;", "data", "u", "(Lqz2/n$a$d;Lm2/r;I)V", "Lqz2/n$a$b;", "k", "(Lqz2/n$a$b;Lm2/r;I)V", "Lqz2/n$a$a;", "o", "(Lqz2/n$a$a;Lm2/r;I)V", "Lqz2/n$a;", "state", "qualifiedsignature_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class k {
    public static final void k(final n.a.InfoPage infoPage, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-76725676);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(infoPage) : rVarH.G(infoPage) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-76725676, i16, -1, "pl.gov.coi.mobywatel.feature.qualifiedsignature.presentation.screen.main.InfoPageScreen (QualifiedSignatureScreen.kt:84)");
            }
            int i17 = i16;
            i50.s.r(infoPage.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(436233095, true, new er.q() { // from class: qz2.d
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return k.l(infoPage, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
            rVarH = rVarH;
            boolean z15 = (i17 & 14) == 4 || ((i17 & 8) != 0 && rVarH.G(infoPage));
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: qz2.e
                    @Override // er.a
                    public final Object a() {
                        return k.m(infoPage);
                    }
                };
                rVarH.v(objE);
            }
            q0.g(false, (er.a) objE, rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: qz2.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.n(infoPage, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(n.a.InfoPage infoPage, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(436233095, i16, -1, "pl.gov.coi.mobywatel.feature.qualifiedsignature.presentation.screen.main.InfoPageScreen.<anonymous> (QualifiedSignatureScreen.kt:88)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(a3.l(androidx.compose.foundation.layout.d.f(t70.i.S(companion, null, rVar, 6, 1), 0.0f, 1, null), d3Var), rVar, 0);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarD = w0.i.d(mVarN, aVar.a(rVar, i17).getBase().a(), null, 2, null);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarD);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
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
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            j70.h.g(null, null, infoPage.getTitle(), null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).i(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            s40.g.c(infoPage.getInfoRowListData(), 0.0f, rVar, InfoRowListData.f187643b, 2);
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
    public static final i0 m(n.a.InfoPage infoPage) {
        infoPage.b().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(n.a.InfoPage infoPage, int i15, p076m2.r rVar, int i16) {
        k(infoPage, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void o(final n.a.Error error, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(722871096);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(error) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(722871096, i16, -1, "pl.gov.coi.mobywatel.feature.qualifiedsignature.presentation.screen.main.QualifiedSignatureErrorScreen (QualifiedSignatureScreen.kt:113)");
            }
            error.getErrorVMS().b(rVarH, 0);
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: qz2.b
                    @Override // er.a
                    public final Object a() {
                        return k.p();
                    }
                };
                rVarH.v(objE);
            }
            q0.g(false, (er.a) objE, rVarH, 48, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: qz2.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.q(error, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(n.a.Error error, int i15, p076m2.r rVar, int i16) {
        o(error, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void r(final n nVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-787506032);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(nVar) : rVarH.G(nVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-787506032, i16, -1, "pl.gov.coi.mobywatel.feature.qualifiedsignature.presentation.screen.main.QualifiedSignatureScreen (QualifiedSignatureScreen.kt:32)");
            }
            n.a aVarS = s(m7.b.c(nVar.getState(), null, null, null, rVarH, 0, 7));
            if (fr.t.c(aVarS, n.a.c.f169712a)) {
                rVarH.X(-879045599);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else if (aVarS instanceof n.a.Initialized) {
                rVarH.X(-879043140);
                u((n.a.Initialized) aVarS, rVarH, 0);
                rVarH.R();
            } else if (aVarS instanceof n.a.Error) {
                rVarH.X(-879040038);
                o((n.a.Error) aVarS, rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarS instanceof n.a.InfoPage)) {
                    rVarH.X(-879047701);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-879036917);
                k((n.a.InfoPage) aVarS, rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: qz2.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.t(nVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final n.a s(f6<? extends n.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(n nVar, int i15, p076m2.r rVar, int i16) {
        r(nVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void u(final n.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-364076813);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(initialized) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-364076813, i16, -1, "pl.gov.coi.mobywatel.feature.qualifiedsignature.presentation.screen.main.QualifiedSignatureScreenContent (QualifiedSignatureScreen.kt:46)");
            }
            i50.s.r(initialized.getScaffoldData(), y2.m.d(1928344478, true, new er.p() { // from class: qz2.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.v(initialized, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(998124198, true, new er.q() { // from class: qz2.h
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return k.w(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g | 48, 196608, 32764);
            rVarH = rVarH;
            boolean zG = rVarH.G(initialized);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: qz2.i
                    @Override // er.a
                    public final Object a() {
                        return k.x(initialized);
                    }
                };
                rVarH.v(objE);
            }
            q0.g(false, (er.a) objE, rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: qz2.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.y(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(n.a.Initialized initialized, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1928344478, i15, -1, "pl.gov.coi.mobywatel.feature.qualifiedsignature.presentation.screen.main.QualifiedSignatureScreenContent.<anonymous> (QualifiedSignatureScreen.kt:50)");
            }
            f3.m mVarN = a3.n(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200());
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
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
            h30.q.p(initialized.getNextButtonData(), false, null, rVar, 0, 6);
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
    public static final i0 w(n.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) throws XmlPullParserException, IOException {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(998124198, i15, -1, "pl.gov.coi.mobywatel.feature.qualifiedsignature.presentation.screen.main.QualifiedSignatureScreenContent.<anonymous> (QualifiedSignatureScreen.kt:55)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(a3.l(androidx.compose.foundation.layout.d.f(t70.i.S(companion, null, rVar, 6, 1), 0.0f, 1, null), d3Var), rVar, 0);
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            f3.m mVarD = w0.i.d(mVarN, aVar.a(rVar, i16).getBase().a(), null, 2, null);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarD);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
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
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            o40.j.i(initialized.getHeaderData(), rVar, 0);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing300()), rVar, 0);
            rz2.f.f(initialized.getFreeSignaturesCounterModel(), rVar, 0);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing300()), rVar, 0);
            j30.f.e(null, initialized.getMoreInfoButtonData(), false, rVar, ButtonTextData.f99099f << 3, 5);
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
    public static final i0 x(n.a.Initialized initialized) {
        initialized.e().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y(n.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        u(initialized, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
