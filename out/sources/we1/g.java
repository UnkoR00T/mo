package we1;

import d1.a3;
import d1.e0;
import d1.h0;
import d1.m3;
import d1.p3;
import d1.q3;
import d1.r3;
import l3.d0;
import l3.g0;
import n4.f0;
import n50.SingleCardConfig;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import w0.q0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Lwe1/j;", "viewModel", "Loq/i0;", "m", "(Lwe1/j;Lm2/r;I)V", "Lwe1/j$a$b;", "data", "g", "(Lwe1/j$a$b;Lm2/r;I)V", "Lwe1/j$a;", "state", "company_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class g {
    private static final void g(j.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        final j.a.Initialized initialized2;
        int i17;
        SingleCardConfig singleCardConfig;
        p076m2.r rVarH = rVar.h(-1892387498);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(initialized) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1892387498, i16, -1, "pl.gov.coi.mobywatel.feature.companycommon.pkdcode.PkdCodeContent (PkdCodeScreen.kt:54)");
            }
            cb4.i dialogVMSAdapter = initialized.getDialogVMSAdapter();
            if (dialogVMSAdapter == null) {
                rVarH.X(-375131133);
                rVarH.R();
            } else {
                rVarH.X(-1813216322);
                dialogVMSAdapter.b(rVarH, 0);
                rVarH.R();
                i0 i0Var = i0.f148189a;
            }
            Object objE = rVarH.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = new d0();
                rVarH.v(objE);
            }
            final d0 d0Var = (d0) objE;
            f3.m.Companion companion2 = f3.m.INSTANCE;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(companion2, 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i18 = k70.a.f108865b;
            f3.m mVarS = t70.i.S(t70.s.n(w0.i.d(mVarF, aVar.a(rVarH, i18).getBase().a(), null, 2, null), rVarH, 0), null, rVarH, 0, 1);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion3 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion3.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarS);
            androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion4.b();
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
            n6.i(rVarC, w0VarA, companion4.d());
            n6.i(rVarC, e0VarT, companion4.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion4.c());
            n6.g(rVarC, companion4.a());
            n6.i(rVarC, mVarE, companion4.e());
            f3.m mVarS2 = t70.i.S(h0.b(d1.i0.f39176a, a3.r(companion2, 0.0f, 0.0f, 0.0f, aVar.b(rVarH, i18).getSpacing200(), 7, null), 1.0f, false, 2, null), null, rVarH, 0, 1);
            w0 w0VarA2 = e0.a(iVar.r(aVar.b(rVarH, i18).getSpacing200()), companion3.k(), rVarH, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarS2);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion4.b();
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
            n6.i(rVarC2, w0VarA2, companion4.d());
            n6.i(rVarC2, e0VarT2, companion4.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion4.c());
            n6.g(rVarC2, companion4.a());
            n6.i(rVarC2, mVarE2, companion4.e());
            Object objE2 = rVarH.E();
            if (objE2 == companion.a()) {
                objE2 = new er.l() { // from class: we1.b
                    @Override // er.l
                    public final Object b(Object obj) {
                        return g.h(d0Var, (l3.v) obj);
                    }
                };
                rVarH.v(objE2);
            }
            f3.m mVarC = q0.c(l3.y.a(companion2, (er.l) objE2), false, null, 3, null);
            w0 w0VarA3 = e0.a(iVar.k(), companion3.k(), rVarH, 0);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT3 = rVarH.t();
            f3.m mVarE3 = f3.j.e(rVarH, mVarC);
            er.a<androidx.compose.ui.node.c> aVarB3 = companion4.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB3);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC3 = n6.c(rVarH);
            n6.i(rVarC3, w0VarA3, companion4.d());
            n6.i(rVarC3, e0VarT3, companion4.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion4.c());
            n6.g(rVarC3, companion4.a());
            n6.i(rVarC3, mVarE3, companion4.e());
            w0 w0VarB = m3.b(iVar.j(), companion3.i(), rVarH, 48);
            int iHashCode4 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT4 = rVarH.t();
            f3.m mVarE4 = f3.j.e(rVarH, companion2);
            er.a<androidx.compose.ui.node.c> aVarB4 = companion4.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB4);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC4 = n6.c(rVarH);
            n6.i(rVarC4, w0VarB, companion4.d());
            n6.i(rVarC4, e0VarT4, companion4.f());
            n6.i(rVarC4, Integer.valueOf(iHashCode4), companion4.c());
            n6.g(rVarC4, companion4.a());
            n6.i(rVarC4, mVarE4, companion4.e());
            j70.h.g(p3.c(q3.f39261a, companion2, 1.0f, false, 2, null), null, initialized.getTitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i18).j(), null, Float.valueOf(0.0f), false, false, null, rVarH, 0, 0, 48, 30932986);
            r3.a(androidx.compose.foundation.layout.d.y(companion2, aVar.b(rVarH, i18).getSpacing100()), rVarH, 0);
            h30.q.p(initialized.getAddPkdCodeButtonData(), false, Float.valueOf(2.0f), rVarH, MLKEMEngine.KyberPolyBytes, 2);
            rVarH.x();
            r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar.b(rVarH, i18).getSpacing100()), rVarH, 0);
            j70.h.g(null, null, initialized.getDescription(), null, null, aVar.a(rVarH, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i18).f(), null, Float.valueOf(1.0f), false, false, null, rVarH, 0, 0, 48, 30932955);
            rVarH = rVarH;
            rVarH.x();
            if (initialized.getUserPkdCodes().d().isEmpty()) {
                i17 = 1;
                singleCardConfig = null;
                rVarH.X(1771359480);
            } else {
                rVarH.X(1775071451);
                Object objE3 = rVarH.E();
                if (objE3 == companion.a()) {
                    objE3 = new er.l() { // from class: we1.c
                        @Override // er.l
                        public final Object b(Object obj) {
                            return g.i((n4.i0) obj);
                        }
                    };
                    rVarH.v(objE3);
                }
                i17 = 1;
                singleCardConfig = null;
                f3.m mVarD = n4.v.d(companion2, false, (er.l) objE3, 1, null);
                w0 w0VarA4 = e0.a(iVar.k(), companion3.k(), rVarH, 0);
                int iHashCode5 = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT5 = rVarH.t();
                f3.m mVarE5 = f3.j.e(rVarH, mVarD);
                er.a<androidx.compose.ui.node.c> aVarB5 = companion4.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB5);
                } else {
                    rVarH.u();
                }
                p076m2.r rVarC5 = n6.c(rVarH);
                n6.i(rVarC5, w0VarA4, companion4.d());
                n6.i(rVarC5, e0VarT5, companion4.f());
                n6.i(rVarC5, Integer.valueOf(iHashCode5), companion4.c());
                n6.g(rVarC5, companion4.a());
                n6.i(rVarC5, mVarE5, companion4.e());
                m30.i.d(initialized.getUserPkdCodes(), null, null, rVarH, 0, 6);
                rVarH.x();
            }
            rVarH.R();
            Object objE4 = rVarH.E();
            if (objE4 == companion.a()) {
                objE4 = new er.l() { // from class: we1.d
                    @Override // er.l
                    public final Object b(Object obj) {
                        return g.j((n4.i0) obj);
                    }
                };
                rVarH.v(objE4);
            }
            f3.m mVarD2 = n4.v.d(companion2, false, (er.l) objE4, i17, singleCardConfig);
            w0 w0VarA5 = e0.a(iVar.k(), companion3.k(), rVarH, 0);
            int iHashCode6 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT6 = rVarH.t();
            f3.m mVarE6 = f3.j.e(rVarH, mVarD2);
            er.a<androidx.compose.ui.node.c> aVarB6 = companion4.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB6);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC6 = n6.c(rVarH);
            n6.i(rVarC6, w0VarA5, companion4.d());
            n6.i(rVarC6, e0VarT6, companion4.f());
            n6.i(rVarC6, Integer.valueOf(iHashCode6), companion4.c());
            n6.g(rVarC6, companion4.a());
            n6.i(rVarC6, mVarE6, companion4.e());
            n50.h0.v(initialized.getAddPkdCodeSingleCardData(), singleCardConfig, rVarH, 0, 2);
            rVarH.x();
            rVarH.x();
            r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar.b(rVarH, i18).getSpacing200()), rVarH, 0);
            f3.m mVarA = g0.a(companion2, d0Var);
            w0 w0VarA6 = e0.a(iVar.k(), companion3.k(), rVarH, 0);
            int iHashCode7 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT7 = rVarH.t();
            f3.m mVarE7 = f3.j.e(rVarH, mVarA);
            er.a<androidx.compose.ui.node.c> aVarB7 = companion4.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB7);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC7 = n6.c(rVarH);
            n6.i(rVarC7, w0VarA6, companion4.d());
            n6.i(rVarC7, e0VarT7, companion4.f());
            n6.i(rVarC7, Integer.valueOf(iHashCode7), companion4.c());
            n6.g(rVarC7, companion4.a());
            n6.i(rVarC7, mVarE7, companion4.e());
            h30.q.p(initialized.getNextButton(), false, null, rVarH, 0, 6);
            rVarH.x();
            rVarH.x();
            initialized2 = initialized;
            boolean zG = rVarH.G(initialized2);
            Object objE5 = rVarH.E();
            if (zG || objE5 == companion.a()) {
                objE5 = new er.a() { // from class: we1.e
                    @Override // er.a
                    public final Object a() {
                        return g.k(initialized2);
                    }
                };
                rVarH.v(objE5);
            }
            p088nul.q0.g(false, (er.a) objE5, rVarH, 0, i17);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            initialized2 = initialized;
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: we1.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.l(initialized2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(d0 d0Var, l3.v vVar) {
        vVar.m(d0Var);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(n4.i0 i0Var) {
        f0.H0(i0Var, true);
        f0.I0(i0Var, 3.0f);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(n4.i0 i0Var) {
        f0.H0(i0Var, true);
        f0.I0(i0Var, 4.0f);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(j.a.Initialized initialized) {
        initialized.f().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(j.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        g(initialized, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void m(final j jVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(711210697);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(jVar) : rVarH.G(jVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(711210697, i16, -1, "pl.gov.coi.mobywatel.feature.companycommon.pkdcode.PkdCodeScreen (PkdCodeScreen.kt:41)");
            }
            f6 f6VarC = m7.b.c(jVar.getState(), null, null, null, rVarH, 0, 7);
            oz.l.b(jVar.getLifecycleConnector(), rVarH, 0);
            j.a aVarN = n(f6VarC);
            if (aVarN instanceof j.a.Initialized) {
                rVarH.X(573687556);
                g((j.a.Initialized) aVarN, rVarH, 0);
                rVarH.R();
            } else {
                if (!fr.t.c(aVarN, j.a.C5617a.f212719a)) {
                    rVarH.X(573685342);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(573689709);
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
            d5VarM.a(new er.p() { // from class: we1.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.o(jVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final j.a n(f6<? extends j.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(j jVar, int i15, p076m2.r rVar, int i16) {
        m(jVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
