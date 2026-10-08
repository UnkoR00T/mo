package li3;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.i0;
import d1.r3;
import f1.b1;
import f1.y0;
import i50.BaseScaffoldData;
import java.io.IOException;
import k40.EmptyStateData;
import mx.Label;
import n50.h0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.xmlpull.v1.XmlPullParserException;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import u60.PagingListData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001f\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0017²\u0006\f\u0010\u0016\u001a\u00020\u00158\nX\u008a\u0084\u0002"}, d2 = {"Lli3/c;", "viewModel", "Loq/i0;", "s", "(Lli3/c;Lm2/r;I)V", "Lli3/c$a$c;", "data", "Lf1/y0;", "lazyListState", "l", "(Lli3/c$a$c;Lf1/y0;Lm2/r;I)V", "Lo40/a;", "collisionHeaderData", "Lni3/a$a;", "statementListModel", "i", "(Lo40/a;Lni3/a$a;Lm2/r;I)V", "Lni3/a$b;", "list", "p", "(Lni3/a$b;Lf1/y0;Lm2/r;I)V", "Lli3/c$a;", "state", "vehiclecollision_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class l {
    private static final void i(final o40.a aVar, final ni3.a.Empty empty, p076m2.r rVar, final int i15) throws XmlPullParserException, IOException {
        int i16;
        p076m2.r rVarH = rVar.h(-1498617761);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(empty) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1498617761, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.statementlist.StatementEmptyContent (StatementListScreen.kt:94)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar2 = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarR = a3.r(companion, aVar2.b(rVarH, i17).getSpacing200(), 0.0f, aVar2.b(rVarH, i17).getSpacing200(), 0.0f, 10, null);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
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
            i0 i0Var = i0.f39176a;
            o40.j.i(aVar, rVarH, i16 & 14);
            rVarH.x();
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVarH, i17).getSpacing300()), rVarH, 0);
            x30.c.c(a3.p(companion, aVar2.b(rVarH, i17).getSpacing200(), 0.0f, 2, null), 0.0f, y2.m.d(1738771806, true, new er.p() { // from class: li3.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.j(empty, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, MLKEMEngine.KyberPolyBytes, 2);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: li3.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.k(aVar, empty, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j(ni3.a.Empty empty, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1738771806, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.statementlist.StatementEmptyContent.<anonymous> (StatementListScreen.kt:110)");
            }
            k40.d.c(null, empty.getEmptyState(), rVar, EmptyStateData.f108236d << 3, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k(o40.a aVar, ni3.a.Empty empty, int i15, p076m2.r rVar, int i16) throws XmlPullParserException, IOException {
        i(aVar, empty, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void l(final c.a.Initialized initialized, final y0 y0Var, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(944396433);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(initialized) : rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(y0Var) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(944396433, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.statementlist.StatementInitializedContent (StatementListScreen.kt:59)");
            }
            rVar2 = rVarH;
            i50.s.r(initialized.getScaffoldData(), y2.m.d(1823060934, true, new er.p() { // from class: li3.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.m(initialized, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1112315458, true, new er.q() { // from class: li3.f
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return l.n(initialized, y0Var, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g | 48, 196608, 32764);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: li3.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.o(initialized, y0Var, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(c.a.Initialized initialized, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1823060934, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.statementlist.StatementInitializedContent.<anonymous> (StatementListScreen.kt:63)");
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
            i0 i0Var = i0.f39176a;
            h30.q.p(initialized.getNewStatementButtonData(), false, null, rVar, 0, 6);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(c.a.Initialized initialized, y0 y0Var, d3 d3Var, p076m2.r rVar, int i15) throws XmlPullParserException, IOException {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1112315458, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.statementlist.StatementInitializedContent.<anonymous> (StatementListScreen.kt:70)");
            }
            f3.m mVarH = androidx.compose.foundation.layout.d.h(a3.l(f3.m.INSTANCE, d3Var), 0.0f, 1, null);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarH);
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
            i0 i0Var = i0.f39176a;
            ni3.a statementListModel = initialized.getStatementListModel();
            if (statementListModel instanceof ni3.a.Empty) {
                rVar.X(-1682779829);
                i(((ni3.a.Empty) statementListModel).getCollisionHeaderData(), (ni3.a.Empty) initialized.getStatementListModel(), rVar, 0);
                rVar.R();
            } else {
                if (!(statementListModel instanceof ni3.a.StatementListByPaging)) {
                    rVar.X(-1682782378);
                    rVar.R();
                    throw new oq.p();
                }
                rVar.X(-1682773210);
                p((ni3.a.StatementListByPaging) initialized.getStatementListModel(), y0Var, rVar, 0);
                rVar.R();
            }
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(c.a.Initialized initialized, y0 y0Var, int i15, p076m2.r rVar, int i16) {
        l(initialized, y0Var, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void p(final ni3.a.StatementListByPaging statementListByPaging, final y0 y0Var, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1377201953);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(statementListByPaging) : rVarH.G(statementListByPaging) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(y0Var) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1377201953, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.statementlist.StatementListContent (StatementListScreen.kt:120)");
            }
            PagingListData<ni3.a.StatementListByPaging.AbstractC3368a> pagingListDataA = statementListByPaging.a();
            f3.m mVarH = androidx.compose.foundation.layout.d.h(f3.m.INSTANCE, 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            u60.j.g(pagingListDataA, a3.r(w0.i.d(mVarH, aVar.a(rVarH, i17).getBase().a(), null, 2, null), aVar.b(rVarH, i17).getSpacing200(), aVar.b(rVarH, i17).getSpacing100(), aVar.b(rVarH, i17).getSpacing200(), 0.0f, 8, null), null, null, null, y0Var, y2.m.d(746703404, true, new er.s() { // from class: li3.j
                @Override // er.s
                public final Object C(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    return l.q(statementListByPaging, (f1.e) obj, ((Integer) obj2).intValue(), (ni3.a.StatementListByPaging.AbstractC3368a) obj3, (p076m2.r) obj4, ((Integer) obj5).intValue());
                }
            }, rVarH, 54), rVarH, 1572864 | PagingListData.f195779i | ((i16 << 12) & 458752), 28);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: li3.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.r(statementListByPaging, y0Var, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(ni3.a.StatementListByPaging statementListByPaging, f1.e eVar, int i15, ni3.a.StatementListByPaging.AbstractC3368a abstractC3368a, p076m2.r rVar, int i16) throws XmlPullParserException, IOException {
        int i17;
        if ((i16 & 48) == 0) {
            i17 = (rVar.c(i15) ? 32 : 16) | i16;
        } else {
            i17 = i16;
        }
        if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= rVar.W(abstractC3368a) ? 256 : 128;
        }
        if (rVar.r((i17 & 1169) != 1168, i17 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(746703404, i17, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.statementlist.StatementListContent.<anonymous> (StatementListScreen.kt:134)");
            }
            if (abstractC3368a instanceof ni3.a.StatementListByPaging.AbstractC3368a.Header) {
                rVar.X(322436733);
                f3.m.Companion companion = f3.m.INSTANCE;
                w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
                int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
                p076m2.e0 e0VarT = rVar.t();
                f3.m mVarE = f3.j.e(rVar, companion);
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
                i0 i0Var = i0.f39176a;
                o40.j.i(((ni3.a.StatementListByPaging.AbstractC3368a.Header) abstractC3368a).getCollisionHeaderData(), rVar, 0);
                r3.a(androidx.compose.foundation.layout.d.i(companion, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing300()), rVar, 0);
                rVar.x();
                rVar.R();
            } else if (abstractC3368a instanceof ni3.a.StatementListByPaging.AbstractC3368a.Section) {
                rVar.X(1405829069);
                Label title = ((ni3.a.StatementListByPaging.AbstractC3368a.Section) abstractC3368a).getTitle();
                k70.a aVar = k70.a.f108864a;
                int i18 = k70.a.f108865b;
                j70.h.g(null, null, title, null, null, aVar.a(rVar, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i18).q(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
                if (i15 != statementListByPaging.a().b().size() - 1) {
                    rVar.X(1406044085);
                    r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, aVar.b(rVar, i18).getSpacing200()), rVar, 0);
                } else {
                    rVar.X(1400986838);
                }
                rVar.R();
                rVar.R();
            } else {
                if (!(abstractC3368a instanceof ni3.a.StatementListByPaging.AbstractC3368a.Item)) {
                    rVar.X(322434474);
                    rVar.R();
                    throw new oq.p();
                }
                rVar.X(1406225838);
                h0.v(((ni3.a.StatementListByPaging.AbstractC3368a.Item) abstractC3368a).getCard(), null, rVar, 0, 2);
                if (i15 != statementListByPaging.a().b().size() - 1) {
                    rVar.X(1406347637);
                    r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing100()), rVar, 0);
                } else {
                    rVar.X(1400986838);
                }
                rVar.R();
                rVar.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r(ni3.a.StatementListByPaging statementListByPaging, y0 y0Var, int i15, p076m2.r rVar, int i16) {
        p(statementListByPaging, y0Var, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void s(final c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(237001843);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(237001843, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.statementlist.StatementListScreen (StatementListScreen.kt:38)");
            }
            f6 f6VarC = m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7);
            oz.l.b(cVar.getLifecycleConnector(), rVarH, 0);
            y0 y0VarC = b1.c(0, 0, rVarH, 0, 3);
            c.a aVarT = t(f6VarC);
            if (aVarT instanceof c.a.b) {
                rVarH.X(125514308);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else if (aVarT instanceof c.a.d) {
                rVarH.X(125516413);
                x70.f.g(x70.a.b.f217282c, rVarH, x70.a.b.f217283d);
                rVarH.R();
            } else if (aVarT instanceof c.a.Error) {
                rVarH.X(125519899);
                ((c.a.Error) aVarT).getErrorVMS().b(rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarT instanceof c.a.Initialized)) {
                    rVarH.X(125512117);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(125521909);
                l((c.a.Initialized) aVarT, y0VarC, rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: li3.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.u(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.a t(f6<? extends c.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u(c cVar, int i15, p076m2.r rVar, int i16) {
        s(cVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
