package pn3;

import android.annotation.SuppressLint;
import d1.a3;
import d1.d3;
import d1.e0;
import d1.h0;
import d1.r3;
import f1.q0;
import i50.BaseScaffoldData;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p046f2.al;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import q40.IconPageData;
import sn3.VehicleItemModel;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a5\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0018²\u0006\f\u0010\u0017\u001a\u00020\u00168\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lpn3/p;", "viewModel", "Loq/i0;", "p", "(Lpn3/p;Lm2/r;I)V", "Li50/a;", "scaffoldData", "Li70/p;", "snackBarState", "Lf2/al;", "snackbarHostState", "Lkotlin/Function0;", "content", "A", "(Li50/a;Li70/p;Lf2/al;Ler/p;Lm2/r;I)V", "Lpn3/p$a$b;", "model", "m", "(Lpn3/p$a$b;Lm2/r;I)V", "Lpn3/p$a$a;", "o", "(Lpn3/p$a$a;Lm2/r;I)V", "Lpn3/p$a;", "viewModelState", "vehicles_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class m {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class a extends fr.q implements er.a<i0> {
        a(Object obj) {
            super(0, obj, p.class, "hideSnackBar", "hideSnackBar()V", 0);
        }

        public final void E() {
            ((p) this.f66391b).B0();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            E();
            return i0.f148189a;
        }
    }

    @SuppressLint({"UnusedMaterial3ScaffoldPaddingParameter"})
    private static final void A(final BaseScaffoldData baseScaffoldData, final i70.p pVar, final al alVar, final er.p<? super p076m2.r, ? super Integer, i0> pVar2, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-1732281853);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(baseScaffoldData) : rVarH.G(baseScaffoldData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.W(alVar) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= rVarH.G(pVar2) ? 2048 : 1024;
        }
        if (rVarH.r((i16 & 1171) != 1170, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1732281853, i16, -1, "pl.gov.coi.mobywatel.feature.vehicles.presentation.screens.vehiclelist.VehicleListTopMenu (VehicleListScreen.kt:77)");
            }
            rVar2 = rVarH;
            i50.s.r(baseScaffoldData, null, y2.m.d(-183237511, true, new er.p() { // from class: pn3.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.B(alVar, pVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1890731152, true, new er.q() { // from class: pn3.d
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return m.C(pVar2, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g | MLKEMEngine.KyberPolyBytes | (i16 & 14), 196608, 32762);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: pn3.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.D(baseScaffoldData, pVar, alVar, pVar2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B(al alVar, i70.p pVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-183237511, i15, -1, "pl.gov.coi.mobywatel.feature.vehicles.presentation.screens.vehiclelist.VehicleListTopMenu.<anonymous> (VehicleListScreen.kt:82)");
            }
            i70.d.d(alVar, pVar, false, rVar, 0, 4);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C(er.p pVar, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1890731152, i15, -1, "pl.gov.coi.mobywatel.feature.vehicles.presentation.screens.vehiclelist.VehicleListTopMenu.<anonymous> (VehicleListScreen.kt:85)");
            }
            f3.m mVarL = a3.l(androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null), d3Var);
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            f3.m mVarR = a3.r(mVarL, aVar.b(rVar, i16).getSpacing200(), 0.0f, aVar.b(rVar, i16).getSpacing200(), aVar.b(rVar, i16).getSpacing200(), 2, null);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarR);
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
            pVar.B(rVar, 0);
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
    public static final i0 D(BaseScaffoldData baseScaffoldData, i70.p pVar, al alVar, er.p pVar2, int i15, p076m2.r rVar, int i16) {
        A(baseScaffoldData, pVar, alVar, pVar2, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void m(final p.a.Empty empty, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-568382291);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(empty) : rVarH.G(empty) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-568382291, i16, -1, "pl.gov.coi.mobywatel.feature.vehicles.presentation.screens.vehiclelist.VehicleListEmptyScreen (VehicleListScreen.kt:103)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            d1.i.n nVarK = d1.i.f39152a.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, companion);
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
            f3.m mVarB = h0.b(d1.i0.f39176a, companion, 1.0f, false, 2, null);
            w0 w0VarI = d1.r.i(companion2.o(), false);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarB);
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
            n6.i(rVarC2, w0VarI, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            d1.x xVar = d1.x.f39368a;
            q40.i.b(empty.a(), null, null, rVarH, IconPageData.f164667h, 6);
            rVarH.x();
            h30.q.p(empty.getUpdateButtonData(), false, null, rVarH, 0, 6);
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: pn3.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.n(empty, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(p.a.Empty empty, int i15, p076m2.r rVar, int i16) {
        m(empty, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void o(final p.a.DataLoaded dataLoaded, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(2140752826);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(dataLoaded) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2140752826, i16, -1, "pl.gov.coi.mobywatel.feature.vehicles.presentation.screens.vehiclelist.VehicleListScreen (VehicleListScreen.kt:117)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, companion);
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
            f3.m mVarB = h0.b(d1.i0.f39176a, androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), 1.0f, false, 2, null);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            d1.i.f fVarR = iVar.r(aVar.b(rVarH, i17).getSpacing200());
            d3 d3VarI = a3.i(0.0f, aVar.b(rVarH, i17).getSpacing100(), 0.0f, 0.0f, 13, null);
            boolean zG = rVarH.G(dataLoaded);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: pn3.f
                    @Override // er.l
                    public final Object b(Object obj) {
                        return m.w(dataLoaded, (q0) obj);
                    }
                };
                rVarH.v(objE);
            }
            f1.d.c(mVarB, null, d3VarI, false, fVarR, null, null, false, null, (er.l) objE, rVarH, 0, 490);
            f3.m mVarR = a3.r(companion, 0.0f, aVar.b(rVarH, i17).getSpacing200(), 0.0f, 0.0f, 13, null);
            w0 w0VarI = d1.r.i(companion2.o(), false);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarR);
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
            n6.i(rVarC2, w0VarI, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            d1.x xVar = d1.x.f39368a;
            h30.q.p(dataLoaded.getUpdateButtonData(), false, null, rVarH, 0, 6);
            rVarH.x();
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: pn3.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.z(dataLoaded, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void p(final p pVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-478943697);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(pVar) : rVarH.G(pVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        boolean z15 = false;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-478943697, i16, -1, "pl.gov.coi.mobywatel.feature.vehicles.presentation.screens.vehiclelist.VehicleListScreen (VehicleListScreen.kt:38)");
            }
            f6 f6VarC = m7.b.c(pVar.getState(), null, null, null, rVarH, 0, 7);
            f6 f6VarB = m7.b.b(pVar.j(), i70.p.a.f89857a, null, null, null, rVarH, i70.p.a.f89858b << 3, 14);
            Object objE = rVarH.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = new al();
                rVarH.v(objE);
            }
            al alVar = (al) objE;
            final p.a aVarQ = q(f6VarC);
            if (aVarQ instanceof p.a.DataLoaded) {
                rVarH.X(-329931831);
                A(((p.a.DataLoaded) aVarQ).getScaffoldData(), r(f6VarB), alVar, y2.m.d(1648210113, true, new er.p() { // from class: pn3.k
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return m.s(aVarQ, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVarH, BaseScaffoldData.f89350g | 3456);
                rVarH.R();
            } else if (aVarQ instanceof p.a.Empty) {
                rVarH.X(-329699548);
                A(((p.a.Empty) aVarQ).getScaffoldData(), r(f6VarB), alVar, y2.m.d(-1468762454, true, new er.p() { // from class: pn3.l
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return m.t(aVarQ, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVarH, BaseScaffoldData.f89350g | 3456);
                rVarH.R();
            } else {
                if (!fr.t.c(aVarQ, p.a.c.f161286a)) {
                    rVarH.X(-703381577);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-703364717);
                rVarH.R();
            }
            int i17 = i16 & 14;
            boolean z16 = i17 == 4 || ((i16 & 8) != 0 && rVarH.G(pVar));
            Object objE2 = rVarH.E();
            if (z16 || objE2 == companion.a()) {
                objE2 = new er.a() { // from class: pn3.b
                    @Override // er.a
                    public final Object a() {
                        return m.u(pVar);
                    }
                };
                rVarH.v(objE2);
            }
            p088nul.q0.g(false, (er.a) objE2, rVarH, 0, 1);
            i70.p pVarR = r(f6VarB);
            if (i17 == 4 || ((i16 & 8) != 0 && rVarH.G(pVar))) {
                z15 = true;
            }
            Object objE3 = rVarH.E();
            if (z15 || objE3 == companion.a()) {
                objE3 = new a(pVar);
                rVarH.v(objE3);
            }
            i70.m.d(alVar, pVarR, (er.a) ((mr.g) objE3), null, null, rVarH, 6, 24);
            rVarH = rVarH;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: pn3.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.v(pVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final p.a q(f6<? extends p.a> f6Var) {
        return f6Var.getValue();
    }

    private static final i70.p r(f6<? extends i70.p> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(p.a aVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1648210113, i15, -1, "pl.gov.coi.mobywatel.feature.vehicles.presentation.screens.vehiclelist.VehicleListScreen.<anonymous> (VehicleListScreen.kt:47)");
            }
            o((p.a.DataLoaded) aVar, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(p.a aVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1468762454, i15, -1, "pl.gov.coi.mobywatel.feature.vehicles.presentation.screens.vehiclelist.VehicleListScreen.<anonymous> (VehicleListScreen.kt:53)");
            }
            m((p.a.Empty) aVar, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(p pVar) {
        pVar.d();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(p pVar, int i15, p076m2.r rVar, int i16) {
        p(pVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w(final p.a.DataLoaded dataLoaded, q0 q0Var) {
        for (final VehicleItemModel vehicleItemModel : dataLoaded.d()) {
            q0.c(q0Var, null, null, y2.m.b(2060768584, true, new er.q() { // from class: pn3.i
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return m.x(vehicleItemModel, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
        }
        q0.c(q0Var, null, null, y2.m.b(1828490959, true, new er.q() { // from class: pn3.j
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return m.y(dataLoaded, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(VehicleItemModel vehicleItemModel, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2060768584, i15, -1, "pl.gov.coi.mobywatel.feature.vehicles.presentation.screens.vehiclelist.VehicleListScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehicleListScreen.kt:128)");
            }
            qn3.h.f(vehicleItemModel, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y(p.a.DataLoaded dataLoaded, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1828490959, i15, -1, "pl.gov.coi.mobywatel.feature.vehicles.presentation.screens.vehiclelist.VehicleListScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehicleListScreen.kt:132)");
            }
            c30.b.c inconsistentDataAlert = dataLoaded.getInconsistentDataAlert();
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing100()), rVar, 0);
            c30.e.c(null, inconsistentDataAlert, rVar, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(p.a.DataLoaded dataLoaded, int i15, p076m2.r rVar, int i16) {
        o(dataLoaded, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
