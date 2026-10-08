package nj3;

import d1.a3;
import d1.d3;
import d1.r3;
import i50.BaseScaffoldData;
import java.io.IOException;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.xmlpull.v1.XmlPullParserException;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import u50.v0;
import v40.InputDateTimeData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lnj3/f;", "viewModel", "Loq/i0;", "h", "(Lnj3/f;Lm2/r;I)V", "Lnj3/f$b;", "data", "k", "(Lnj3/f$b;Lm2/r;I)V", "Lnj3/f$b$b;", "m", "(Lnj3/f$b$b;Lm2/r;I)V", "vehiclehistory_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class n {
    public static final void h(final f fVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1727895895);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(fVar) : rVarH.G(fVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1727895895, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclehistory.presentation.vehiclehistory.form.VehicleHistoryVerificationFormScreen (VehicleHistoryVerificationFormScreen.kt:29)");
            }
            k(i(m7.b.c(fVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: nj3.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.j(fVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final f.b i(f6<? extends f.b> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j(f fVar, int i15, p076m2.r rVar, int i16) {
        h(fVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void k(final f.b bVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1431649926);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(bVar) : rVarH.G(bVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1431649926, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclehistory.presentation.vehiclehistory.form.VehicleHistoryVerificationFormScreenContent (VehicleHistoryVerificationFormScreen.kt:38)");
            }
            if (fr.t.c(bVar, f.b.a.f136905a)) {
                rVarH.X(-1257514586);
                rVarH.R();
            } else {
                if (!(bVar instanceof f.b.Initialized)) {
                    rVarH.X(-1426040432);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-1426035786);
                m((f.b.Initialized) bVar, rVarH, i16 & 14);
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
            d5VarM.a(new er.p() { // from class: nj3.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.l(bVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(f.b bVar, int i15, p076m2.r rVar, int i16) {
        k(bVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void m(final f.b.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(843848885);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(843848885, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclehistory.presentation.vehiclehistory.form.VehicleHistoryVerificationFormScreenInitialized (VehicleHistoryVerificationFormScreen.kt:49)");
            }
            if (initialized.getSkipForm()) {
                rVar2 = rVarH;
                rVar2.X(656586381);
            } else {
                rVarH.X(658752072);
                i50.s.r(initialized.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(2084715053, true, new er.q() { // from class: nj3.i
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return n.n(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
                rVar2 = rVarH;
            }
            rVar2.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: nj3.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.r(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(final f.b.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) throws XmlPullParserException, IOException {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2084715053, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclehistory.presentation.vehiclehistory.form.VehicleHistoryVerificationFormScreenInitialized.<anonymous> (VehicleHistoryVerificationFormScreen.kt:55)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarL = a3.l(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), d3Var);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarR = a3.r(mVarL, aVar.b(rVar, i17).getSpacing200(), 0.0f, aVar.b(rVar, i17).getSpacing200(), aVar.b(rVar, i17).getSpacing200(), 2, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = d1.e0.a(nVarK, companion2.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarR);
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
            f3.m mVarR2 = a3.r(t70.i.S(d1.h0.b(d1.i0.f39176a, companion, 1.0f, false, 2, null), null, rVar, 0, 1), 0.0f, aVar.b(rVar, i17).getSpacing100(), 0.0f, aVar.b(rVar, i17).getSpacing200(), 5, null);
            w0 w0VarA2 = d1.e0.a(iVar.k(), companion2.k(), rVar, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarR2);
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
            o40.j.i(initialized.getHeaderData(), rVar, 0);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing300()), rVar, 0);
            x30.c.c(null, 0.0f, y2.m.d(-1715351616, true, new er.p() { // from class: nj3.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.o(initialized, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, MLKEMEngine.KyberPolyBytes, 3);
            rVar.x();
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            h30.q.p(initialized.getButtonData(), false, null, rVar, 0, 6);
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
    public static final oq.i0 o(final f.b.Initialized initialized, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1715351616, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclehistory.presentation.vehiclehistory.form.VehicleHistoryVerificationFormScreenInitialized.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehicleHistoryVerificationFormScreen.kt:77)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
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
            d1.i0 i0Var = d1.i0.f39176a;
            v50.c.Text plateTextInputData = initialized.getContentData().getPlateTextInputData();
            boolean zG = rVar.G(initialized);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: nj3.l
                    @Override // er.l
                    public final Object b(Object obj) {
                        return n.p(initialized, ((Boolean) obj).booleanValue());
                    }
                };
                rVar.v(objE);
            }
            d60.c cVarB = d60.e.b(false, (er.l) objE, rVar, 0, 1);
            int i16 = v50.c.Text.P;
            v0.g(plateTextInputData, cVarB, rVar, i16, 0);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            v50.c.Text vinTextInputData = initialized.getContentData().getVinTextInputData();
            boolean zG2 = rVar.G(initialized);
            Object objE2 = rVar.E();
            if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = new er.l() { // from class: nj3.m
                    @Override // er.l
                    public final Object b(Object obj) {
                        return n.q(initialized, ((Boolean) obj).booleanValue());
                    }
                };
                rVar.v(objE2);
            }
            v0.g(vinTextInputData, d60.e.b(false, (er.l) objE2, rVar, 0, 1), rVar, i16, 0);
            InputDateTimeData registrationDateData = initialized.getContentData().getRegistrationDateData();
            if (registrationDateData == null) {
                rVar.X(1598949060);
            } else {
                rVar.X(1598949061);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
                v40.i.h(registrationDateData, rVar, InputDateTimeData.f203769m);
            }
            rVar.R();
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
    public static final oq.i0 p(f.b.Initialized initialized, boolean z15) {
        initialized.getContentData().a().b(Boolean.valueOf(z15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(f.b.Initialized initialized, boolean z15) {
        initialized.getContentData().b().b(Boolean.valueOf(z15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r(f.b.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        m(initialized, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
