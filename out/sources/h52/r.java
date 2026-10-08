package h52;

import d1.a3;
import d1.d3;
import d1.r3;
import f1.q0;
import i50.BaseScaffoldData;
import j50.SearchBarData;
import l1.RoundedCornerShape;
import mx.Label;
import n50.SingleCardConfig;
import oq.i0;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p046f2.vb;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a%\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a!\u0010\r\u001a\u00020\u0002*\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lh52/h;", "viewModel", "Loq/i0;", "t", "(Lh52/h;Lm2/r;I)V", "Lh52/h$a;", "screenData", "Lka/a;", "Ln50/k;", "institutions", "j", "(Lh52/h$a;Lka/a;Lm2/r;I)V", "Lf1/q0;", "q", "(Lf1/q0;Lka/a;)V", "epayments_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class r {
    public static final void j(final h.Data data, final ka.a<n50.k> aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(1983441977);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(data) : rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1983441977, i16, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.stampdutypayments.institutions.StampDutyPaymentsInstitutionsContent (StampDutyPaymentsInstitutionsScreen.kt:65)");
            }
            rVar2 = rVarH;
            i50.s.r(data.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(845791320, true, new er.q() { // from class: h52.j
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return r.k(data, aVar, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: h52.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return r.p(data, aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(final h.Data data, final ka.a aVar, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(845791320, i16, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.stampdutypayments.institutions.StampDutyPaymentsInstitutionsContent.<anonymous>.<anonymous> (StampDutyPaymentsInstitutionsScreen.kt:69)");
            }
            f3.m mVarP = a3.p(a3.l(f3.m.INSTANCE, d3Var), k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200(), 0.0f, 2, null);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarP);
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
            boolean zG = rVar.G(data) | rVar.G(aVar);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: h52.l
                    @Override // er.l
                    public final Object b(Object obj) {
                        return r.l(data, aVar, (q0) obj);
                    }
                };
                rVar.v(objE);
            }
            f1.d.c(null, null, null, false, null, null, null, false, null, (er.l) objE, rVar, 0, 511);
            if (aVar.g() == 0) {
                rVar.X(199055106);
                f52.b.b(data.getStampDutyEmptySectionData(), rVar, 0);
            } else {
                rVar.X(194625888);
            }
            rVar.R();
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
    public static final i0 l(final h.Data data, ka.a aVar, q0 q0Var) {
        final Label titleLabel = data.getTitleLabel();
        if (titleLabel != null) {
            q0.c(q0Var, null, null, y2.m.b(1339207678, true, new er.q() { // from class: h52.m
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return r.m(titleLabel, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
        }
        final Label descriptionLabel = data.getDescriptionLabel();
        if (descriptionLabel != null) {
            q0.c(q0Var, null, null, y2.m.b(1131014695, true, new er.q() { // from class: h52.n
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return r.n(descriptionLabel, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
        }
        q0.h(q0Var, null, null, y2.m.b(-1636726111, true, new er.r() { // from class: h52.o
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return r.o(data, (f1.e) obj, ((Integer) obj2).intValue(), (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 3, null);
        q(q0Var, aVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(Label label, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1339207678, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.stampdutypayments.institutions.StampDutyPaymentsInstitutionsContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (StampDutyPaymentsInstitutionsScreen.kt:77)");
            }
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            j70.h.g(null, null, label, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).i(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, aVar.b(rVar, i16).getSpacing200()), rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(Label label, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1131014695, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.stampdutypayments.institutions.StampDutyPaymentsInstitutionsContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (StampDutyPaymentsInstitutionsScreen.kt:87)");
            }
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            j70.h.g(null, null, label, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, aVar.b(rVar, i16).getSpacing200()), rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(h.Data data, f1.e eVar, int i15, p076m2.r rVar, int i16) {
        float spacing200;
        if (rVar.r((i16 & 129) != 128, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1636726111, i16, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.stampdutypayments.institutions.StampDutyPaymentsInstitutionsContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (StampDutyPaymentsInstitutionsScreen.kt:96)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            boolean isActive = data.getSearchBarData().getIsActive();
            if (isActive) {
                rVar.X(-935756987);
                spacing200 = k70.a.f108864a.b(rVar, k70.a.f108865b).getZero();
                rVar.R();
            } else {
                if (isActive) {
                    rVar.X(-935759271);
                    rVar.R();
                    throw new oq.p();
                }
                rVar.X(-935755381);
                spacing200 = k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200();
                rVar.R();
            }
            j50.f0.A(a3.p(companion, spacing200, 0.0f, 2, null), data.getSearchBarData(), e.f81021a.f(), rVar, MLKEMEngine.KyberPolyBytes, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(h.Data data, ka.a aVar, int i15, p076m2.r rVar, int i16) {
        j(data, aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void q(q0 q0Var, final ka.a<n50.k> aVar) {
        if (fr.t.c(aVar.i().getRefresh(), ja.w.Loading.f101205b)) {
            q0.c(q0Var, null, null, e.f81021a.e(), 3, null);
            return;
        }
        if (aVar.g() != 0) {
            e eVar = e.f81021a;
            q0.c(q0Var, null, null, eVar.g(), 3, null);
            q0.e(q0Var, aVar.g(), null, null, y2.m.b(1409897372, true, new er.r() { // from class: h52.p
                @Override // er.r
                public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                    return r.r(aVar, (f1.e) obj, ((Integer) obj2).intValue(), (p076m2.r) obj3, ((Integer) obj4).intValue());
                }
            }), 6, null);
            q0.c(q0Var, null, null, y2.m.b(-822793874, true, new er.q() { // from class: h52.q
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return r.s(aVar, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
            q0.c(q0Var, null, null, eVar.h(), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(ka.a aVar, f1.e eVar, int i15, p076m2.r rVar, int i16) {
        int i17;
        RoundedCornerShape roundedCornerShapeF;
        if ((i16 & 48) == 0) {
            i17 = i16 | (rVar.c(i15) ? 32 : 16);
        } else {
            i17 = i16;
        }
        if (rVar.r((i17 & 145) != 144, i17 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1409897372, i17, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.stampdutypayments.institutions.StampDutyPaymentsInstitutionsListContent.<anonymous> (StampDutyPaymentsInstitutionsScreen.kt:136)");
            }
            n50.k kVar = (n50.k) aVar.f(i15);
            if (kVar == null) {
                rVar.X(1767504005);
            } else {
                rVar.X(1767504006);
                f3.m.Companion companion = f3.m.INSTANCE;
                if (i15 == 0) {
                    rVar.X(-239098966);
                    if (aVar.g() - 1 == 0) {
                        rVar.X(1177895478);
                        roundedCornerShapeF = l1.h.f(k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200());
                        rVar.R();
                    } else {
                        rVar.X(1178023632);
                        k70.a aVar2 = k70.a.f108864a;
                        int i18 = k70.a.f108865b;
                        roundedCornerShapeF = l1.h.h(aVar2.b(rVar, i18).getSpacing200(), aVar2.b(rVar, i18).getSpacing200(), 0.0f, 0.0f, 12, null);
                        rVar.R();
                    }
                    rVar.R();
                } else if (i15 == aVar.g() - 1) {
                    rVar.X(-239086254);
                    k70.a aVar3 = k70.a.f108864a;
                    int i19 = k70.a.f108865b;
                    roundedCornerShapeF = l1.h.h(0.0f, 0.0f, aVar3.b(rVar, i19).getSpacing200(), aVar3.b(rVar, i19).getSpacing200(), 3, null);
                    rVar.R();
                } else {
                    rVar.X(-239080075);
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
                rVar.X(1768643008);
                f3.m.Companion companion3 = f3.m.INSTANCE;
                k70.a aVar4 = k70.a.f108864a;
                int i25 = k70.a.f108865b;
                vb.h(a3.r(companion3, aVar4.b(rVar, i25).getSpacing200(), 0.0f, aVar4.b(rVar, i25).getSpacing200(), 0.0f, 10, null), aVar4.b(rVar, i25).getStrokeWidth(), aVar4.a(rVar, i25).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().g(), rVar, 0, 0);
            } else {
                rVar.X(1762276166);
            }
            rVar.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(ka.a aVar, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-822793874, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.stampdutypayments.institutions.StampDutyPaymentsInstitutionsListContent.<anonymous> (StampDutyPaymentsInstitutionsScreen.kt:180)");
            }
            if (fr.t.c(aVar.i().getAppend(), ja.w.Loading.f101205b)) {
                rVar.X(-473869241);
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
                rVar.X(-480642028);
            }
            rVar.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    public static final void t(final h hVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(256145556);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(hVar) : rVarH.G(hVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(256145556, i16, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.stampdutypayments.institutions.StampDutyPaymentsInstitutionsScreen (StampDutyPaymentsInstitutionsScreen.kt:45)");
            }
            f6 f6VarC = m7.b.c(hVar.getState(), null, null, null, rVarH, 0, 7);
            ka.a aVarB = ka.b.b(hVar.y8(), null, rVarH, 0, 1);
            j(h.Data.b(u(f6VarC), null, null, null, null, SearchBarData.b(u(f6VarC).getSearchBarData(), null, null, false, null, null, null, null, Integer.valueOf(aVarB.g()), CertificateBody.profileType, null), null, 47, null), aVarB, rVarH, BaseScaffoldData.f89350g | (ka.a.f109310f << 3));
            p088nul.q0.g(false, u(f6VarC).e(), rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: h52.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return r.v(hVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final h.Data u(f6<h.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(h hVar, int i15, p076m2.r rVar, int i16) {
        t(hVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
