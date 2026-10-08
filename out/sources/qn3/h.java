package qn3;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import d1.a3;
import d1.h0;
import d1.i;
import d1.m3;
import d1.p3;
import d1.q3;
import d1.r3;
import er.l;
import er.p;
import er.q;
import f3.j;
import f3.m;
import l1.RoundedCornerShape;
import n4.f0;
import n4.g0;
import n4.v;
import oq.i0;
import p036e4.w0;
import p046f2.c2;
import p046f2.x1;
import p046f2.y1;
import p046f2.z1;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import sn3.VehicleItemModel;
import t70.y;
import w0.i1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lsn3/a;", "vehicleItemModel", "Loq/i0;", "f", "(Lsn3/a;Lm2/r;I)V", "vehicles_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class h {
    public static final void f(final VehicleItemModel vehicleItemModel, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(840479798);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.W(vehicleItemModel) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(840479798, i16, -1, "pl.gov.coi.mobywatel.feature.vehicles.presentation.screens.vehiclelist.component.VehicleListItem (VehicleListItem.kt:43)");
            }
            final Context context = (Context) rVarH.N(AndroidCompositionLocals_androidKt.c());
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            RoundedCornerShape roundedCornerShapeF = l1.h.f(aVar.b(rVarH, i17).getSpacing200());
            int i18 = i16;
            y1 y1Var = y1.f58315a;
            long jA = aVar.a(rVarH, i17).getSurface().a();
            int i19 = y1.f58316b;
            x1 x1VarB = y1Var.b(jA, 0L, 0L, 0L, rVarH, i19 << 12, 14);
            z1 z1VarC = y1Var.c(aVar.c(rVarH, i17).getLevel0(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, rVarH, i19 << 18, 62);
            rVar2 = rVarH;
            m.Companion companion = m.INSTANCE;
            boolean z15 = (i18 & 14) == 4;
            Object objE = rVar2.E();
            if (z15 || objE == r.INSTANCE.a()) {
                objE = new er.a() { // from class: qn3.c
                    @Override // er.a
                    public final Object a() {
                        return h.g(vehicleItemModel);
                    }
                };
                rVar2.v(objE);
            }
            c2.c(androidx.compose.foundation.b.n(companion, false, null, null, null, (er.a) objE, 15, null), roundedCornerShapeF, x1VarB, z1VarC, null, y2.m.d(-341641724, true, new q() { // from class: qn3.d
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return h.h(vehicleItemModel, context, (h0) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVar2, 54), rVar2, 196608, 16);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: qn3.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.k(vehicleItemModel, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(VehicleItemModel vehicleItemModel) {
        vehicleItemModel.b().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(final VehicleItemModel vehicleItemModel, final Context context, h0 h0Var, r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (t.k()) {
                t.o(-341641724, i15, -1, "pl.gov.coi.mobywatel.feature.vehicles.presentation.screens.vehiclelist.component.VehicleListItem.<anonymous> (VehicleListItem.kt:51)");
            }
            f3.c.Companion companion = f3.c.INSTANCE;
            f3.c.InterfaceC1317c interfaceC1317cI = companion.i();
            i iVar = i.f39152a;
            i.f fVarH = iVar.h();
            m.Companion companion2 = m.INSTANCE;
            m mVarH = androidx.compose.foundation.layout.d.h(companion2, 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            m mVarO = a3.o(mVarH, aVar.b(rVar, i16).getSpacing200(), aVar.b(rVar, i16).getSpacing250());
            w0 w0VarB = m3.b(fVarH, interfaceC1317cI, rVar, 54);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
            m mVarE = j.e(rVar, mVarO);
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
            r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarB, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            m mVarC = p3.c(q3.f39261a, companion2, 1.0f, false, 2, null);
            w0 w0VarB2 = m3.b(iVar.j(), companion.i(), rVar, 48);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT2 = rVar.t();
            m mVarE2 = j.e(rVar, mVarC);
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
            r rVarC2 = n6.c(rVar);
            n6.i(rVarC2, w0VarB2, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            m mVarT = androidx.compose.foundation.layout.d.t(companion2, h60.g.XBig.getDimension());
            Object objE = rVar.E();
            r.Companion companion4 = r.INSTANCE;
            if (objE == companion4.a()) {
                objE = new l() { // from class: qn3.f
                    @Override // er.l
                    public final Object b(Object obj) {
                        return h.i((n4.i0) obj);
                    }
                };
                rVar.v(objE);
            }
            m mVarD = v.d(mVarT, false, (l) objE, 1, null);
            boolean zW = rVar.W(vehicleItemModel) | rVar.G(context);
            Object objE2 = rVar.E();
            if (zW || objE2 == companion4.a()) {
                objE2 = new l() { // from class: qn3.g
                    @Override // er.l
                    public final Object b(Object obj) {
                        return h.j(vehicleItemModel, context, (n4.i0) obj);
                    }
                };
                rVar.v(objE2);
            }
            i1.c(l4.c.c(vehicleItemModel.getVehicleIcon(), rVar, 0), null, v.d(mVarD, false, (l) objE2, 1, null), null, null, 0.0f, null, rVar, androidx.compose.ui.graphics.painter.a.f9956g | 48, 120);
            r3.a(androidx.compose.foundation.layout.d.y(companion2, aVar.b(rVar, i16).getSpacing200()), rVar, 0);
            w0 w0VarA = d1.e0.a(iVar.k(), companion.k(), rVar, 0);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT3 = rVar.t();
            m mVarE3 = j.e(rVar, companion2);
            er.a<androidx.compose.ui.node.c> aVarB3 = companion3.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB3);
            } else {
                rVar.u();
            }
            r rVarC3 = n6.c(rVar);
            n6.i(rVarC3, w0VarA, companion3.d());
            n6.i(rVarC3, e0VarT3, companion3.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion3.c());
            n6.g(rVarC3, companion3.a());
            n6.i(rVarC3, mVarE3, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            j70.h.g(null, null, vehicleItemModel.getVehicleName(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).a(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            j70.h.g(null, null, vehicleItemModel.getRegistrationNumber(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).d(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar.b(rVar, i16).getSpacing200()), rVar, 0);
            b.b(vehicleItemModel.getInsuranceValidity().getTitle(), vehicleItemModel.getInsuranceValidity().getStatus(), null, rVar, 0, 4);
            r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar.b(rVar, i16).getSpacing100()), rVar, 0);
            b.b(vehicleItemModel.getTechnicalExaminationValidity().getTitle(), vehicleItemModel.getTechnicalExaminationValidity().getStatus(), null, rVar, 0, 4);
            rVar.x();
            rVar.x();
            h60.f.e(androidx.compose.foundation.layout.d.t(companion2, aVar.b(rVar, i16).getSpacing300()), null, Integer.valueOf(jz.a.V), null, aVar.a(rVar, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0.0f, null, null, 0L, 0.0f, 0.0f, null, rVar, 0, 48, 2026);
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(n4.i0 i0Var) {
        g0.a(i0Var, true);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(VehicleItemModel vehicleItemModel, Context context, n4.i0 i0Var) {
        f0.y0(i0Var, "icon" + y.a(Integer.valueOf(vehicleItemModel.getVehicleIcon()), context));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(VehicleItemModel vehicleItemModel, int i15, r rVar, int i16) {
        f(vehicleItemModel, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
