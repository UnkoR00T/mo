package a52;

import d1.a3;
import d1.d3;
import d1.m3;
import d1.q3;
import d1.r3;
import f1.q0;
import g52.StampDutyEmptySectionData;
import i50.BaseScaffoldData;
import j50.SearchBarData;
import l1.RoundedCornerShape;
import mx.Label;
import n50.SingleCardConfig;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p046f2.vb;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import q40.IconPageBottomContentData;
import q40.IconPageData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a%\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a%\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a%\u0010\u0012\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"La52/c;", "viewModel", "Loq/i0;", "s", "(La52/c;Lm2/r;I)V", "La52/c$a;", "screenData", "Lka/a;", "Ln50/k;", "commitmentTypes", "k", "(La52/c$a;Lka/a;Lm2/r;I)V", "La52/c$a$c;", "v", "(La52/c$a$c;Lka/a;Lm2/r;I)V", "lazyPagingSingleCardData", "Lg52/a;", "stampDutyEmptySectionData", "n", "(Lka/a;Lg52/a;Lm2/r;I)V", "epayments_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class n {
    public static final void k(final c.a aVar, final ka.a<n50.k> aVar2, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-1519098344);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? rVarH.W(aVar2) : rVarH.G(aVar2) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1519098344, i16, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.stampdutypayments.commitmenttypes.CommitmentTypesContent (CommitmentTypesScreen.kt:63)");
            }
            if (aVar instanceof c.a.Initial) {
                rVarH.X(435378867);
                f3.m.Companion companion = f3.m.INSTANCE;
                f3.m mVarF = androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null);
                d1.i iVar = d1.i.f39152a;
                d1.i.n nVarK = iVar.k();
                f3.c.Companion companion2 = f3.c.INSTANCE;
                w0 w0VarA = d1.e0.a(nVarK, companion2.k(), rVarH, 0);
                int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT = rVarH.t();
                f3.m mVarE = f3.j.e(rVarH, mVarF);
                androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
                er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
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
                n6.i(rVarC, w0VarA, companion3.d());
                n6.i(rVarC, e0VarT, companion3.f());
                n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
                n6.g(rVarC, companion3.a());
                n6.i(rVarC, mVarE, companion3.e());
                d1.i0 i0Var = d1.i0.f39176a;
                if (aVar2.i().getRefresh() instanceof ja.w.NotLoading) {
                    rVarH.X(659386288);
                    rVarH.R();
                    if (aVar2.g() == 0) {
                        ((c.a.Initial) aVar).b().a();
                    } else {
                        ((c.a.Initial) aVar).c().a();
                    }
                } else {
                    rVarH.X(-1033710952);
                    f3.m mVarF2 = androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null);
                    w0 w0VarB = m3.b(iVar.e(), companion2.i(), rVarH, 54);
                    int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
                    p076m2.e0 e0VarT2 = rVarH.t();
                    f3.m mVarE2 = f3.j.e(rVarH, mVarF2);
                    er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
                    if (rVarH.l() == null) {
                        p076m2.m.d();
                    }
                    rVarH.K();
                    if (rVarH.getInserting()) {
                        rVarH.H(aVarB2);
                    } else {
                        rVarH.u();
                    }
                    p076m2.r rVarC2 = n6.c(rVarH);
                    n6.i(rVarC2, w0VarB, companion3.d());
                    n6.i(rVarC2, e0VarT2, companion3.f());
                    n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
                    n6.g(rVarC2, companion3.a());
                    n6.i(rVarC2, mVarE2, companion3.e());
                    q3 q3Var = q3.f39261a;
                    x70.f.g(x70.a.b.f217282c, rVarH, x70.a.b.f217283d);
                    rVarH.x();
                    rVarH.R();
                }
                rVarH.x();
                rVarH.R();
                rVar2 = rVarH;
            } else if (aVar instanceof c.a.NoData) {
                rVarH.X(435396427);
                i50.s.r(((c.a.NoData) aVar).getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1890976950, true, new er.q() { // from class: a52.e
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return n.l(aVar, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
                rVar2 = rVarH;
                rVar2.R();
            } else {
                rVar2 = rVarH;
                if (!(aVar instanceof c.a.WithData)) {
                    rVar2.X(435377539);
                    rVar2.R();
                    throw new oq.p();
                }
                rVar2.X(435408816);
                c.a.WithData withData = (c.a.WithData) aVar;
                v(c.a.WithData.c(withData, null, null, null, SearchBarData.b(withData.getSearchBarData(), null, null, false, null, null, null, null, Integer.valueOf(aVar2.g()), CertificateBody.profileType, null), null, 23, null), aVar2, rVar2, (i16 & 112) | BaseScaffoldData.f89350g | (ka.a.f109310f << 3));
                rVar2.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: a52.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.m(aVar, aVar2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(c.a aVar, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1890976950, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.stampdutypayments.commitmenttypes.CommitmentTypesContent.<anonymous> (CommitmentTypesScreen.kt:81)");
            }
            f3.m mVarL = a3.l(f3.m.INSTANCE, d3Var);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarL);
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
            q40.i.b(((c.a.NoData) aVar).c(), null, j0.f3566a.b(), rVar, IconPageData.f164667h | IconPageBottomContentData.f164663d | MLKEMEngine.KyberPolyBytes, 2);
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
    public static final oq.i0 m(c.a aVar, ka.a aVar2, int i15, p076m2.r rVar, int i16) {
        k(aVar, aVar2, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void n(final ka.a<n50.k> aVar, final StampDutyEmptySectionData stampDutyEmptySectionData, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(190885199);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(stampDutyEmptySectionData) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(190885199, i16, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.stampdutypayments.commitmenttypes.CommitmentTypesListContent (CommitmentTypesScreen.kt:163)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null);
            k70.a aVar2 = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarP = a3.p(mVarF, aVar2.b(rVarH, i17).getSpacing200(), 0.0f, 2, null);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarP);
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
            if (aVar.g() == 0) {
                rVarH.X(-1059090269);
                f52.b.b(stampDutyEmptySectionData, rVarH, (i16 >> 3) & 14);
                rVarH.R();
            } else {
                rVarH.X(-1058926589);
                f3.m mVarR = a3.r(companion, 0.0f, aVar2.b(rVarH, i17).getSpacing300(), 0.0f, 0.0f, 13, null);
                d3 d3VarI = a3.i(0.0f, 0.0f, 0.0f, aVar2.b(rVarH, i17).getSpacing200(), 7, null);
                boolean z15 = (i16 & 14) == 4 || ((i16 & 8) != 0 && rVarH.G(aVar));
                Object objE = rVarH.E();
                if (z15 || objE == p076m2.r.INSTANCE.a()) {
                    objE = new er.l() { // from class: a52.j
                        @Override // er.l
                        public final Object b(Object obj) {
                            return n.o(aVar, (q0) obj);
                        }
                    };
                    rVarH.v(objE);
                }
                f1.d.c(mVarR, null, d3VarI, false, null, null, null, false, null, (er.l) objE, rVarH, 0, 506);
                rVarH.R();
            }
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: a52.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.r(aVar, stampDutyEmptySectionData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(final ka.a aVar, q0 q0Var) {
        q0.e(q0Var, aVar.g(), null, null, y2.m.b(100220807, true, new er.r() { // from class: a52.l
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return n.p(aVar, (f1.e) obj, ((Integer) obj2).intValue(), (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 6, null);
        q0.c(q0Var, null, null, y2.m.b(1545590462, true, new er.q() { // from class: a52.m
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return n.q(aVar, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p(ka.a aVar, f1.e eVar, int i15, p076m2.r rVar, int i16) {
        int i17;
        RoundedCornerShape roundedCornerShapeF;
        if ((i16 & 48) == 0) {
            i17 = i16 | (rVar.c(i15) ? 32 : 16);
        } else {
            i17 = i16;
        }
        if (rVar.r((i17 & 145) != 144, i17 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(100220807, i17, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.stampdutypayments.commitmenttypes.CommitmentTypesListContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CommitmentTypesScreen.kt:175)");
            }
            n50.k kVar = (n50.k) aVar.f(i15);
            if (kVar == null) {
                rVar.X(675889322);
            } else {
                rVar.X(675889323);
                f3.m.Companion companion = f3.m.INSTANCE;
                if (i15 == 0) {
                    rVar.X(-1493700555);
                    if (aVar.g() - 1 == 0) {
                        rVar.X(939963105);
                        roundedCornerShapeF = l1.h.f(k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200());
                        rVar.R();
                    } else {
                        rVar.X(940097273);
                        k70.a aVar2 = k70.a.f108864a;
                        int i18 = k70.a.f108865b;
                        roundedCornerShapeF = l1.h.h(aVar2.b(rVar, i18).getSpacing200(), aVar2.b(rVar, i18).getSpacing200(), 0.0f, 0.0f, 12, null);
                        rVar.R();
                    }
                    rVar.R();
                } else if (i15 == aVar.g() - 1) {
                    rVar.X(-1493686615);
                    k70.a aVar3 = k70.a.f108864a;
                    int i19 = k70.a.f108865b;
                    roundedCornerShapeF = l1.h.h(0.0f, 0.0f, aVar3.b(rVar, i19).getSpacing200(), aVar3.b(rVar, i19).getSpacing200(), 3, null);
                    rVar.R();
                } else {
                    rVar.X(-1493680218);
                    roundedCornerShapeF = l1.h.f(k70.a.f108864a.b(rVar, k70.a.f108865b).getZero());
                    rVar.R();
                }
                f3.m mVarD = w0.i.d(k3.f.a(companion, roundedCornerShapeF), k70.a.f108864a.a(rVar, k70.a.f108865b).getSurface().a(), null, 2, null);
                w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
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
                n6.i(rVarC, w0VarI, companion2.d());
                n6.i(rVarC, e0VarT, companion2.f());
                n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
                n6.g(rVarC, companion2.a());
                n6.i(rVarC, mVarE, companion2.e());
                d1.x xVar = d1.x.f39368a;
                n50.h0.v(kVar, new SingleCardConfig(null, false, 1, null), rVar, SingleCardConfig.f132071c << 3, 0);
                rVar.x();
            }
            rVar.R();
            if (i15 < aVar.g() - 1) {
                rVar.X(677119651);
                f3.m.Companion companion3 = f3.m.INSTANCE;
                k70.a aVar4 = k70.a.f108864a;
                int i25 = k70.a.f108865b;
                vb.h(a3.r(companion3, aVar4.b(rVar, i25).getSpacing200(), 0.0f, aVar4.b(rVar, i25).getSpacing200(), 0.0f, 10, null), aVar4.b(rVar, i25).getStrokeWidth(), aVar4.a(rVar, i25).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().g(), rVar, 0, 0);
            } else {
                rVar.X(669035099);
            }
            rVar.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(ka.a aVar, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1545590462, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.stampdutypayments.commitmenttypes.CommitmentTypesListContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CommitmentTypesScreen.kt:217)");
            }
            if (fr.t.c(aVar.i().getAppend(), ja.w.Loading.f101205b)) {
                rVar.X(-1658839769);
                f3.m mVarH = androidx.compose.foundation.layout.d.h(f3.m.INSTANCE, 0.0f, 1, null);
                f3.c.Companion companion = f3.c.INSTANCE;
                f3.m mVarG = androidx.compose.foundation.layout.d.G(mVarH, companion.g(), false, 2, null);
                w0 w0VarI = d1.r.i(companion.o(), false);
                int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
                p076m2.e0 e0VarT = rVar.t();
                f3.m mVarE = f3.j.e(rVar, mVarG);
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
                n6.i(rVarC, w0VarI, companion2.d());
                n6.i(rVarC, e0VarT, companion2.f());
                n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
                n6.g(rVarC, companion2.a());
                n6.i(rVarC, mVarE, companion2.e());
                d1.x xVar = d1.x.f39368a;
                x70.f.g(x70.a.C5796a.f217280c, rVar, x70.a.C5796a.f217281d);
                rVar.x();
            } else {
                rVar.X(-1667365916);
            }
            rVar.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r(ka.a aVar, StampDutyEmptySectionData stampDutyEmptySectionData, int i15, p076m2.r rVar, int i16) {
        n(aVar, stampDutyEmptySectionData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void s(final c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(757606429);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(757606429, i16, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.stampdutypayments.commitmenttypes.CommitmentTypesScreen (CommitmentTypesScreen.kt:48)");
            }
            f6 f6VarC = m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7);
            k(t(f6VarC), ka.b.b(cVar.m6(), null, rVarH, 0, 1), rVarH, ka.a.f109310f << 3);
            p088nul.q0.g(false, t(f6VarC).a(), rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: a52.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.u(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
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

    public static final void v(final c.a.WithData withData, final ka.a<n50.k> aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(3288897);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(withData) : rVarH.G(withData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(3288897, i16, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.stampdutypayments.commitmenttypes.CommitmentTypesWithDataScreen (CommitmentTypesScreen.kt:105)");
            }
            rVar2 = rVarH;
            i50.s.r(withData.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1654705030, true, new er.q() { // from class: a52.g
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return n.w(withData, aVar, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32766);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: a52.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.y(withData, aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w(final c.a.WithData withData, final ka.a aVar, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        f3.m.Companion companion;
        float spacing200;
        p076m2.r rVar2 = rVar;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar2.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar2.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1654705030, i16, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.stampdutypayments.commitmenttypes.CommitmentTypesWithDataScreen.<anonymous>.<anonymous> (CommitmentTypesScreen.kt:110)");
            }
            f3.m.Companion companion2 = f3.m.INSTANCE;
            f3.m mVarL = a3.l(companion2, d3Var);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar2, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar2, 0));
            p076m2.e0 e0VarT = rVar2.t();
            f3.m mVarE = f3.j.e(rVar2, mVarL);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
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
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            Label titleLabel = withData.getTitleLabel();
            if (titleLabel == null) {
                rVar2.X(1991616525);
                rVar2.R();
                companion = companion2;
            } else {
                rVar2.X(1991616526);
                k70.a aVar2 = k70.a.f108864a;
                int i17 = k70.a.f108865b;
                j70.h.g(a3.p(companion2, aVar2.b(rVar2, i17).getSpacing200(), 0.0f, 2, null), null, titleLabel, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar2, i17).i(), null, null, false, false, null, rVar, 0, 0, 0, 33030138);
                rVar2 = rVar;
                companion = companion2;
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVar2, i17).getSpacing200()), rVar2, 0);
                rVar2.R();
            }
            boolean isActive = withData.getSearchBarData().getIsActive();
            if (isActive) {
                rVar2.X(1865374868);
                spacing200 = k70.a.f108864a.b(rVar2, k70.a.f108865b).getZero();
                rVar2.R();
            } else {
                if (isActive) {
                    rVar2.X(1865372700);
                    rVar2.R();
                    throw new oq.p();
                }
                rVar2.X(1865376346);
                spacing200 = k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing200();
                rVar2.R();
            }
            j50.f0.A(a3.p(companion, spacing200, 0.0f, 2, null), withData.getSearchBarData(), y2.m.d(2144067634, true, new er.p() { // from class: a52.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.x(withData, aVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar2, 54), rVar2, MLKEMEngine.KyberPolyBytes, 0);
            if (withData.getSearchBarData().getIsActive()) {
                rVar2.X(1986936146);
            } else {
                rVar2.X(1992845924);
                n(aVar, withData.getStampDutyEmptySectionData(), rVar2, ka.a.f109310f);
            }
            rVar2.R();
            rVar2.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 x(c.a.WithData withData, ka.a aVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2144067634, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.stampdutypayments.commitmenttypes.CommitmentTypesWithDataScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CommitmentTypesScreen.kt:132)");
            }
            if (withData.getSearchBarData().getIsActive()) {
                rVar.X(-834685320);
                if (fr.t.c(aVar.i().getRefresh(), ja.w.Loading.f101205b)) {
                    rVar.X(-834575921);
                    f3.m mVarF = androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null);
                    w0 w0VarB = m3.b(d1.i.f39152a.e(), f3.c.INSTANCE.i(), rVar, 54);
                    int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
                    p076m2.e0 e0VarT = rVar.t();
                    f3.m mVarE = f3.j.e(rVar, mVarF);
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
                    n6.i(rVarC, w0VarB, companion.d());
                    n6.i(rVarC, e0VarT, companion.f());
                    n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
                    n6.g(rVarC, companion.a());
                    n6.i(rVarC, mVarE, companion.e());
                    q3 q3Var = q3.f39261a;
                    x70.f.g(x70.a.C5796a.f217280c, rVar, x70.a.C5796a.f217281d);
                    rVar.x();
                    rVar.R();
                } else {
                    rVar.X(-834305074);
                    n(aVar, withData.getStampDutyEmptySectionData(), rVar, ka.a.f109310f);
                    rVar.R();
                }
            } else {
                rVar.X(-839969456);
            }
            rVar.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y(c.a.WithData withData, ka.a aVar, int i15, p076m2.r rVar, int i16) {
        v(withData, aVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
