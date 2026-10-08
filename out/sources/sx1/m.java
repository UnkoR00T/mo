package sx1;

import d1.a3;
import d1.d3;
import i50.BaseScaffoldData;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import q40.IconPageBottomContentData;
import q40.IconPageData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e²\u0006\f\u0010\r\u001a\u00020\f8\nX\u008a\u0084\u0002"}, d2 = {"Lsx1/e;", "viewModel", "Loq/i0;", "g", "(Lsx1/e;Lm2/r;I)V", "Lsx1/e$a$d;", "data", "m", "(Lsx1/e$a$d;Lm2/r;I)V", "Lsx1/e$a$a;", "j", "(Lsx1/e$a$a;Lm2/r;I)V", "Lsx1/e$a;", "state", "eidservices_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class m {
    public static final void g(final e eVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1369471314);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(eVar) : rVarH.G(eVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1369471314, i16, -1, "pl.gov.coi.mobywatel.feature.eidservices.documentsigning.presentation.signfile.DocumentSigningSignFileScreen (DocumentSigningSignFileScreen.kt:28)");
            }
            oz.l.b(eVar.a(), rVarH, 0);
            e.a aVarH = h(m7.b.c(eVar.getState(), null, null, null, rVarH, 0, 7));
            if (aVarH instanceof e.a.NfcInfo) {
                rVarH.X(1801949516);
                bx1.i.k(((e.a.NfcInfo) aVarH).getData(), rVarH, BaseScaffoldData.f89350g);
                rVarH.R();
            } else if (aVarH instanceof e.a.NfcScanning) {
                rVarH.X(1801953392);
                bx1.i.p(((e.a.NfcScanning) aVarH).getData(), rVarH, BaseScaffoldData.f89350g);
                rVarH.R();
            } else if (aVarH instanceof e.a.SuccessData) {
                rVarH.X(1801957387);
                m((e.a.SuccessData) aVarH, rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarH instanceof e.a.Error)) {
                    rVarH.X(1801947076);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(1801961022);
                j((e.a.Error) aVarH, rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: sx1.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.i(eVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final e.a h(f6<? extends e.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i(e eVar, int i15, p076m2.r rVar, int i16) {
        g(eVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void j(final e.a.Error error, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1060235067);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(error) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1060235067, i16, -1, "pl.gov.coi.mobywatel.feature.eidservices.documentsigning.presentation.signfile.ErrorScreen (DocumentSigningSignFileScreen.kt:82)");
            }
            error.getErrorVMS().b(rVarH, 0);
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: sx1.j
                    @Override // er.a
                    public final Object a() {
                        return m.k();
                    }
                };
                rVarH.v(objE);
            }
            p088nul.q0.g(false, (er.a) objE, rVarH, 48, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: sx1.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.l(error, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k() {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(e.a.Error error, int i15, p076m2.r rVar, int i16) {
        j(error, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void m(final e.a.SuccessData successData, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-349035633);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(successData) : rVarH.G(successData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-349035633, i16, -1, "pl.gov.coi.mobywatel.feature.eidservices.documentsigning.presentation.signfile.SignSuccessScreenContent (DocumentSigningSignFileScreen.kt:54)");
            }
            rVar2 = rVarH;
            i50.s.r(successData.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-799958078, true, new er.q() { // from class: sx1.h
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return m.n(successData, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: sx1.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.p(successData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(final e.a.SuccessData successData, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-799958078, i15, -1, "pl.gov.coi.mobywatel.feature.eidservices.documentsigning.presentation.signfile.SignSuccessScreenContent.<anonymous> (DocumentSigningSignFileScreen.kt:56)");
            }
            f3.m mVarL = a3.l(w0.i.d(androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null), k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().a(), null, 2, null), d3Var);
            p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
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
            q40.i.b(successData.a(), null, b.f185217a.b(), rVar, IconPageData.f164667h | IconPageBottomContentData.f164663d | MLKEMEngine.KyberPolyBytes, 2);
            rVar.x();
            boolean zG = rVar.G(successData);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: sx1.l
                    @Override // er.a
                    public final Object a() {
                        return m.o(successData);
                    }
                };
                rVar.v(objE);
            }
            p088nul.q0.g(false, (er.a) objE, rVar, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(e.a.SuccessData successData) {
        successData.b().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p(e.a.SuccessData successData, int i15, p076m2.r rVar, int i16) {
        m(successData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
