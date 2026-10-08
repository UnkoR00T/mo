package wh3;

import d1.a3;
import d1.d3;
import d1.m3;
import d1.p3;
import d1.q3;
import d1.r3;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import mx.Label;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n²\u0006\f\u0010\t\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lwh3/q;", "viewModel", "Loq/i0;", "q", "(Lwh3/q;Lm2/r;I)V", "Lwh3/q$a;", "data", "i", "(Lwh3/q$a;Lm2/r;I)V", "state", "vehiclecollision_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class z {
    public static final void i(final q.Data data, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1222154874);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(data) : rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1222154874, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.vehicleownership.VehicleOwnershipInitialized (VehicleOwnershipScreen.kt:48)");
            }
            int i17 = i16;
            i50.s.r(data.getBaseScaffoldData(), y2.m.d(-291632645, true, new er.p() { // from class: wh3.s
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return z.j(data, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-536027661, true, new er.q() { // from class: wh3.t
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return z.k(data, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g | 48, 196608, 32764);
            rVarH = rVarH;
            boolean z15 = (i17 & 14) == 4 || ((i17 & 8) != 0 && rVarH.G(data));
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: wh3.u
                    @Override // er.a
                    public final Object a() {
                        return z.o(data);
                    }
                };
                rVarH.v(objE);
            }
            p088nul.q0.g(false, (er.a) objE, rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: wh3.v
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return z.p(data, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j(q.Data data, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-291632645, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.vehicleownership.VehicleOwnershipInitialized.<anonymous> (VehicleOwnershipScreen.kt:53)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            f3.m mVarR = a3.r(companion, aVar.b(rVar, i16).getSpacing200(), 0.0f, aVar.b(rVar, i16).getSpacing200(), aVar.b(rVar, i16).getSpacing200(), 2, null);
            p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarR);
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
            h30.q.p(data.getNextButtonData(), false, null, rVar, 0, 6);
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
    public static final oq.i0 k(q.Data data, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-536027661, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.vehicleownership.VehicleOwnershipInitialized.<anonymous> (VehicleOwnershipScreen.kt:64)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(androidx.compose.foundation.layout.d.f(t70.i.S(a3.l(companion, d3Var), null, rVar, 0, 1), 0.0f, 1, null), rVar, 0);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            p036e4.w0 w0VarA = d1.e0.a(nVarK, companion2.k(), rVar, 0);
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
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            j70.h.g(null, null, title, null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing100()), rVar, 0);
            j70.h.g(null, null, data.getDescription(), null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            p076m2.r rVar2 = rVar;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
            y30.m.g(data.getControllersData(), rVar2, y30.n.Switch.f223693f);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing100()), rVar2, 0);
            f3.m mVarR = a3.r(companion, 0.0f, aVar.b(rVar2, i17).getSpacing100(), 0.0f, aVar.b(rVar2, i17).getSpacing200(), 5, null);
            p036e4.w0 w0VarA2 = d1.e0.a(iVar.k(), companion2.k(), rVar2, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar2, 0));
            p076m2.e0 e0VarT2 = rVar2.t();
            f3.m mVarE2 = f3.j.e(rVar2, mVarR);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
            if (rVar2.l() == null) {
                p076m2.m.d();
            }
            rVar2.K();
            if (rVar2.getInserting()) {
                rVar2.H(aVarB2);
            } else {
                rVar2.u();
            }
            p076m2.r rVarC2 = n6.c(rVar2);
            n6.i(rVarC2, w0VarA2, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            final zh3.a screenSectionsModel = data.getScreenSectionsModel();
            if (screenSectionsModel instanceof zh3.a.PhysicalOwner) {
                rVar2.X(1743818361);
                rVar2.X(-82295427);
                zh3.a.PhysicalOwner physicalOwner = (zh3.a.PhysicalOwner) screenSectionsModel;
                final zh3.a.PhysicalOwner.PersonScreenModel ownerData = physicalOwner.getOwnerData();
                x30.c.c(null, 0.0f, y2.m.d(-175124966, true, new er.p() { // from class: wh3.w
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return z.l(ownerData, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                }, rVar2, 54), rVar2, MLKEMEngine.KyberPolyBytes, 3);
                oq.i0 i0Var2 = oq.i0.f148189a;
                rVar2.R();
                final zh3.a.PhysicalOwner.InterfaceC6342a coOwnerData = physicalOwner.getCoOwnerData();
                if (coOwnerData instanceof zh3.a.PhysicalOwner.InterfaceC6342a.Folded) {
                    rVar2.X(1744520976);
                    r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
                    n50.h0.v(((zh3.a.PhysicalOwner.InterfaceC6342a.Folded) coOwnerData).getExpandSingleCardData(), null, rVar2, 0, 2);
                    rVar2.R();
                } else {
                    if (!(coOwnerData instanceof zh3.a.PhysicalOwner.InterfaceC6342a.Expanded)) {
                        rVar2.X(-82274493);
                        rVar2.R();
                        throw new oq.p();
                    }
                    rVar2.X(1744788165);
                    r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing300()), rVar2, 0);
                    f3.m mVarH = androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null);
                    p036e4.w0 w0VarB = m3.b(iVar.j(), companion2.l(), rVar2, 0);
                    int iHashCode3 = Long.hashCode(p076m2.m.b(rVar2, 0));
                    p076m2.e0 e0VarT3 = rVar2.t();
                    f3.m mVarE3 = f3.j.e(rVar2, mVarH);
                    er.a<androidx.compose.ui.node.c> aVarB3 = companion3.b();
                    if (rVar2.l() == null) {
                        p076m2.m.d();
                    }
                    rVar2.K();
                    if (rVar2.getInserting()) {
                        rVar2.H(aVarB3);
                    } else {
                        rVar2.u();
                    }
                    p076m2.r rVarC3 = n6.c(rVar2);
                    n6.i(rVarC3, w0VarB, companion3.d());
                    n6.i(rVarC3, e0VarT3, companion3.f());
                    n6.i(rVarC3, Integer.valueOf(iHashCode3), companion3.c());
                    n6.g(rVarC3, companion3.a());
                    n6.i(rVarC3, mVarE3, companion3.e());
                    zh3.a.PhysicalOwner.InterfaceC6342a.Expanded expanded = (zh3.a.PhysicalOwner.InterfaceC6342a.Expanded) coOwnerData;
                    j70.h.g(p3.c(q3.f39261a, companion, 1.0f, false, 2, null), null, expanded.getSectionTitle(), null, null, aVar.a(rVar2, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i17).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030106);
                    rVar2 = rVar;
                    j30.f.e(null, expanded.getCloseSectionButtonData(), false, rVar2, ButtonTextData.f99099f << 3, 5);
                    rVar2.x();
                    r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
                    x30.c.c(null, 0.0f, y2.m.d(-575248295, true, new er.p() { // from class: wh3.x
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return z.m(coOwnerData, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVar2, 54), rVar2, MLKEMEngine.KyberPolyBytes, 3);
                    rVar2.R();
                }
                rVar2.R();
            } else {
                if (!(screenSectionsModel instanceof zh3.a.CompanyOwner)) {
                    rVar2.X(-82298121);
                    rVar2.R();
                    throw new oq.p();
                }
                rVar2.X(-82219360);
                x30.c.c(null, 0.0f, y2.m.d(-1518092319, true, new er.p() { // from class: wh3.y
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return z.n(screenSectionsModel, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                }, rVar2, 54), rVar2, MLKEMEngine.KyberPolyBytes, 3);
                rVar2.R();
            }
            rVar2.x();
            rVar2.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(zh3.a.PhysicalOwner.PersonScreenModel personScreenModel, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-175124966, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.vehicleownership.VehicleOwnershipInitialized.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehicleOwnershipScreen.kt:99)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
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
            v50.c nameInput = personScreenModel.getNameInput();
            int i16 = v50.c.f203957t;
            u50.v0.g(nameInput, null, rVar, i16, 2);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            u50.v0.g(personScreenModel.getSurnameInput(), null, rVar, i16, 2);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            u50.v0.g(personScreenModel.getPhoneInput(), null, rVar, i16, 2);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            u50.v0.g(personScreenModel.getEmailInput(), null, rVar, i16, 2);
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
    public static final oq.i0 m(zh3.a.PhysicalOwner.InterfaceC6342a interfaceC6342a, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-575248295, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.vehicleownership.VehicleOwnershipInitialized.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehicleOwnershipScreen.kt:141)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
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
            zh3.a.PhysicalOwner.InterfaceC6342a.Expanded expanded = (zh3.a.PhysicalOwner.InterfaceC6342a.Expanded) interfaceC6342a;
            v50.c nameInput = expanded.getPersonData().getNameInput();
            int i16 = v50.c.f203957t;
            u50.v0.g(nameInput, null, rVar, i16, 2);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            u50.v0.g(expanded.getPersonData().getSurnameInput(), null, rVar, i16, 2);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            u50.v0.g(expanded.getPersonData().getPhoneInput(), null, rVar, i16, 2);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            u50.v0.g(expanded.getPersonData().getEmailInput(), null, rVar, i16, 2);
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
    public static final oq.i0 n(zh3.a aVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1518092319, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.vehicleownership.VehicleOwnershipInitialized.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehicleOwnershipScreen.kt:159)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
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
            zh3.a.CompanyOwner companyOwner = (zh3.a.CompanyOwner) aVar;
            v50.c nameInput = companyOwner.getNameInput();
            int i16 = v50.c.f203957t;
            u50.v0.g(nameInput, null, rVar, i16, 2);
            k70.a aVar2 = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVar, i17).getSpacing200()), rVar, 0);
            u50.v0.g(companyOwner.getPhoneInput(), null, rVar, i16, 2);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVar, i17).getSpacing200()), rVar, 0);
            u50.v0.g(companyOwner.getEmailInput(), null, rVar, i16, 2);
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
    public static final oq.i0 o(q.Data data) {
        data.e().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p(q.Data data, int i15, p076m2.r rVar, int i16) {
        i(data, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void q(final q qVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-207726404);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(qVar) : rVarH.G(qVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-207726404, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.vehicleownership.VehicleOwnershipScreen (VehicleOwnershipScreen.kt:36)");
            }
            i(r(m7.b.c(qVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: wh3.r
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return z.s(qVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final q.Data r(f6<q.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s(q qVar, int i15, p076m2.r rVar, int i16) {
        q(qVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
