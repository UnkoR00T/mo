package c33;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import i50.BaseScaffoldData;
import mx.Label;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n²\u0006\f\u0010\t\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lc33/d;", "viewModel", "Loq/i0;", "m", "(Lc33/d;Lm2/r;I)V", "Lc33/d$a;", "data", "g", "(Lc33/d$a;Lm2/r;I)V", "state", "sanitary_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class w {
    public static final void g(final d.Data data, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1770015430);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(data) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1770015430, i16, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.locationaddress.AddressContent (LocationAddressScreen.kt:41)");
            }
            i50.s.r(data.getBaseScaffoldData(), y2.m.d(-716406289, true, new er.p() { // from class: c33.r
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return w.h(data, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1119902695, true, new er.q() { // from class: c33.s
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return w.i(data, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g | 48, 196608, 32764);
            rVarH = rVarH;
            boolean zG = rVarH.G(data);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: c33.t
                    @Override // er.a
                    public final Object a() {
                        return w.k(data);
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
            d5VarM.a(new er.p() { // from class: c33.u
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return w.l(data, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(d.Data data, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-716406289, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.locationaddress.AddressContent.<anonymous> (LocationAddressScreen.kt:45)");
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
            h30.q.p(data.getNextButtonData(), false, null, rVar, 0, 6);
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
    public static final i0 i(final d.Data data, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        f3.m.Companion companion;
        k70.a aVar;
        int i17;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1119902695, i16, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.locationaddress.AddressContent.<anonymous> (LocationAddressScreen.kt:52)");
            }
            f3.m.Companion companion2 = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(t70.i.S(androidx.compose.foundation.layout.d.f(a3.l(companion2, d3Var), 0.0f, 1, null), null, rVar, 0, 1), rVar, 0);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarN);
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
            Label title = data.getTitle();
            k70.a aVar2 = k70.a.f108864a;
            int i18 = k70.a.f108865b;
            j70.h.g(null, null, title, null, null, aVar2.a(rVar, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar, i18).m(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            p076m2.r rVar2 = rVar;
            if (data.getDescription() == null) {
                rVar2.X(-414867685);
                rVar2.R();
                companion = companion2;
                aVar = aVar2;
                i17 = i18;
            } else {
                rVar2.X(-414867684);
                r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar2.b(rVar2, i18).getSpacing100()), rVar2, 0);
                companion = companion2;
                j70.h.g(null, null, data.getDescription(), null, null, aVar2.a(rVar2, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar2, i18).d(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
                rVar2 = rVar;
                rVar2.R();
                aVar = aVar2;
                i17 = i18;
            }
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing300()), rVar2, 0);
            x30.c.c(null, 0.0f, y2.m.d(-1971045506, true, new er.p() { // from class: c33.v
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return w.j(data, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar2, 54), rVar2, MLKEMEngine.KyberPolyBytes, 3);
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
    public static final i0 j(d.Data data, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1971045506, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.locationaddress.AddressContent.<anonymous>.<anonymous>.<anonymous> (LocationAddressScreen.kt:74)");
            }
            data.getAddressFormVMS().b(rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(d.Data data) {
        data.f().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(d.Data data, int i15, p076m2.r rVar, int i16) {
        g(data, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void m(final d dVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(957614153);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(dVar) : rVarH.G(dVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(957614153, i16, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.locationaddress.AddressScreen (LocationAddressScreen.kt:28)");
            }
            f6 f6VarC = m7.b.c(dVar.getState(), null, null, null, rVarH, 0, 7);
            cb4.i dialogVMSAdapter = n(f6VarC).getDialogVMSAdapter();
            if (dialogVMSAdapter == null) {
                rVarH.X(1110594096);
            } else {
                rVarH.X(1144204273);
                dialogVMSAdapter.b(rVarH, 0);
            }
            rVarH.R();
            g(n(f6VarC), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: c33.q
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return w.o(dVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final d.Data n(f6<d.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(d dVar, int i15, p076m2.r rVar, int i16) {
        m(dVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
