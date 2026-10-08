package com.google.android.libraries.places.internal;

import android.graphics.Color;
import android.net.Uri;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.time.Instant;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes4.dex */
final class nz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ak.p0 f33104a = ak.p0.a().g(cu.OPERATIONAL, ii.l0.c.OPERATIONAL).g(cu.CLOSED_TEMPORARILY, ii.l0.c.CLOSED_TEMPORARILY).g(cu.CLOSED_PERMANENTLY, ii.l0.c.CLOSED_PERMANENTLY).d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ak.p0 f33105b = ak.p0.a().g(zu.ACCESS, ii.g0.b.ACCESS).g(zu.BREAKFAST, ii.g0.b.BREAKFAST).g(zu.BRUNCH, ii.g0.b.BRUNCH).g(zu.DELIVERY, ii.g0.b.DELIVERY).g(zu.DINNER, ii.g0.b.DINNER).g(zu.DRIVE_THROUGH, ii.g0.b.DRIVE_THROUGH).g(zu.HAPPY_HOUR, ii.g0.b.HAPPY_HOUR).g(zu.KITCHEN, ii.g0.b.KITCHEN).g(zu.LUNCH, ii.g0.b.LUNCH).g(zu.ONLINE_SERVICE_HOURS, ii.g0.b.ONLINE_SERVICE_HOURS).g(zu.PICKUP, ii.g0.b.PICKUP).g(zu.SENIOR_HOURS, ii.g0.b.SENIOR_HOURS).g(zu.TAKEOUT, ii.g0.b.TAKEOUT).d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ak.p0 f33106c = ak.p0.a().g(zs.EV_CONNECTOR_TYPE_UNSPECIFIED, ii.r.EV_CONNECTOR_TYPE_UNSPECIFIED).g(zs.EV_CONNECTOR_TYPE_OTHER, ii.r.EV_CONNECTOR_TYPE_OTHER).g(zs.EV_CONNECTOR_TYPE_J1772, ii.r.EV_CONNECTOR_TYPE_J1772).g(zs.EV_CONNECTOR_TYPE_TYPE_2, ii.r.EV_CONNECTOR_TYPE_TYPE_2).g(zs.EV_CONNECTOR_TYPE_CHADEMO, ii.r.EV_CONNECTOR_TYPE_CHADEMO).g(zs.EV_CONNECTOR_TYPE_CCS_COMBO_1, ii.r.EV_CONNECTOR_TYPE_CCS_COMBO_1).g(zs.EV_CONNECTOR_TYPE_CCS_COMBO_2, ii.r.EV_CONNECTOR_TYPE_CCS_COMBO_2).g(zs.EV_CONNECTOR_TYPE_TESLA, ii.r.EV_CONNECTOR_TYPE_TESLA).g(zs.EV_CONNECTOR_TYPE_UNSPECIFIED_GB_T, ii.r.EV_CONNECTOR_TYPE_UNSPECIFIED_GB_T).g(zs.EV_CONNECTOR_TYPE_UNSPECIFIED_WALL_OUTLET, ii.r.EV_CONNECTOR_TYPE_UNSPECIFIED_WALL_OUTLET).g(zs.EV_CONNECTOR_TYPE_NACS, ii.r.EV_CONNECTOR_TYPE_NACS).d();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ak.p0 f33107d = ak.p0.a().g(dt.FUEL_TYPE_UNSPECIFIED, ii.v.b.FUEL_TYPE_UNSPECIFIED).g(dt.DIESEL, ii.v.b.DIESEL).g(dt.REGULAR_UNLEADED, ii.v.b.REGULAR_UNLEADED).g(dt.MIDGRADE, ii.v.b.MIDGRADE).g(dt.PREMIUM, ii.v.b.PREMIUM).g(dt.SP91, ii.v.b.SP91).g(dt.SP91_E10, ii.v.b.SP91_E10).g(dt.SP92, ii.v.b.SP92).g(dt.SP95, ii.v.b.SP95).g(dt.SP95_E10, ii.v.b.SP95_E10).g(dt.SP98, ii.v.b.SP98).g(dt.SP99, ii.v.b.SP99).g(dt.SP100, ii.v.b.SP100).g(dt.LPG, ii.v.b.LPG).g(dt.E80, ii.v.b.E80).g(dt.E85, ii.v.b.E85).g(dt.METHANE, ii.v.b.METHANE).g(dt.BIO_DIESEL, ii.v.b.BIO_DIESEL).g(dt.TRUCK_DIESEL, ii.v.b.TRUCK_DIESEL).d();

    nz0() {
    }

    static final /* synthetic */ ii.e f(uq uqVar) {
        ii.e.b bVar;
        ii.e.a aVarA = ii.e.a();
        aVarA.f(k(uqVar.I()));
        aVarA.e(k(uqVar.J()));
        aVarA.c(k(uqVar.K().I()));
        aVarA.d(k(uqVar.K().J()));
        int iM = uqVar.M() - 2;
        if (iM == 1) {
            bVar = ii.e.b.WITHIN;
        } else if (iM != 2) {
            bVar = iM != 3 ? ii.e.b.CONTAINMENT_UNSPECIFIED : ii.e.b.NEAR;
        } else {
            bVar = ii.e.b.OUTSKIRTS;
        }
        aVarA.b(bVar);
        return aVarA.a();
    }

    static final /* synthetic */ ii.y g(xq xqVar) {
        ii.y.b bVar;
        Float fValueOf = xqVar.M() ? Float.valueOf(xqVar.N()) : null;
        float fL = xqVar.L();
        ii.y.a aVarA = ii.y.a();
        aVarA.e(k(xqVar.I()));
        aVarA.d(k(xqVar.J()));
        aVarA.b(k(xqVar.K().I()));
        aVarA.c(k(xqVar.K().J()));
        int iP = xqVar.P() - 2;
        if (iP == 0) {
            bVar = ii.y.b.NEAR;
        } else if (iP == 1) {
            bVar = ii.y.b.WITHIN;
        } else if (iP == 2) {
            bVar = ii.y.b.BESIDE;
        } else if (iP == 3) {
            bVar = ii.y.b.ACROSS_THE_ROAD;
        } else if (iP != 4) {
            bVar = iP != 5 ? ii.y.b.BEHIND : ii.y.b.AROUND_THE_CORNER;
        } else {
            bVar = ii.y.b.DOWN_THE_ROAD;
        }
        aVarA.f(bVar);
        aVarA.g(Double.valueOf(fL));
        aVarA.h(fValueOf != null ? Double.valueOf(fValueOf.doubleValue()) : null);
        return aVarA.a();
    }

    private final List h(List list) {
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(i((cv) it.next()));
        }
        return arrayList;
    }

    private final ii.g0 i(cv cvVar) throws hg.b {
        ii.g0.a aVarA = ii.g0.a();
        List listK = cvVar.K();
        ArrayList arrayList = new ArrayList();
        Iterator it = listK.iterator();
        while (true) {
            ii.y0 y0VarW = null;
            if (!it.hasNext()) {
                break;
            }
            yu yuVar = (yu) it.next();
            ii.j0.a aVarA2 = ii.j0.a();
            aVarA2.c(yuVar.I() ? w(yuVar.J()) : null);
            if (yuVar.K()) {
                y0VarW = w(yuVar.L());
            }
            aVarA2.b(y0VarW);
            arrayList.add(aVarA2.a());
        }
        aVarA.c(arrayList);
        aVarA.e(cvVar.L());
        aVarA.b((ii.g0.b) this.f33105b.getOrDefault(cvVar.M(), null));
        List listN = cvVar.N();
        ArrayList arrayList2 = new ArrayList();
        Iterator it4 = listN.iterator();
        while (it4.hasNext()) {
            try {
                ii.w0.a aVarA3 = ii.w0.a(q(((bv) it4.next()).I()));
                aVarA3.b(true);
                arrayList2.add(aVarA3.a());
            } catch (IllegalArgumentException e15) {
                throw j(String.format("Special day is not properly defined: %s", e15.getMessage()));
            }
        }
        aVarA.d(arrayList2);
        aVarA.f(cvVar.I() ? Boolean.valueOf(cvVar.J()) : null);
        aVarA.g(cvVar.O() ? l(cvVar.P()) : null);
        aVarA.h(cvVar.Q() ? l(cvVar.R()) : null);
        return aVarA.a();
    }

    private static final hg.b j(String str) {
        return new hg.b(new Status(8, "Unexpected server error: ".concat(String.valueOf(str))));
    }

    private static final String k(String str) {
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private static final Instant l(f10 f10Var) {
        return Instant.ofEpochSecond(f10Var.I(), f10Var.J());
    }

    private static final ii.l0.a m(boolean z15, boolean z16) {
        if (z15) {
            return z16 ? ii.l0.a.TRUE : ii.l0.a.FALSE;
        }
        return ii.l0.a.UNKNOWN;
    }

    private static final String n(String str) {
        return str.startsWith("//") ? "https:".concat(str) : str;
    }

    private static final Instant o(f10 f10Var) {
        return Instant.ofEpochSecond(f10Var.I(), f10Var.J());
    }

    private static final LatLng p(f30 f30Var) {
        return new LatLng(f30Var.I(), f30Var.J());
    }

    private static final ii.a0 q(d30 d30Var) {
        return ii.a0.k(d30Var.I(), d30Var.J(), d30Var.K());
    }

    private static final ii.e0 r(k30 k30Var) {
        return ii.e0.d(k30Var.I(), Long.valueOf(k30Var.J()), Integer.valueOf(k30Var.K()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String s(String str, String str2) {
        o oVar = new o("a");
        int i15 = r.f33475d;
        oVar.a(r.a(str, q.f33370b));
        oVar.b(str2);
        return oVar.c().a();
    }

    private static final Uri t(String str) {
        if (str.isEmpty()) {
            return null;
        }
        return Uri.parse(str);
    }

    private static final ii.f u(br brVar) throws hg.b {
        String strI = brVar.I();
        if (strI.isEmpty()) {
            throw j("Author name not provided for an AuthorAttribution result.");
        }
        ii.f.a aVarA = ii.f.a(strI);
        aVarA.c(k(brVar.J()));
        aVarA.b(k(brVar.K()));
        return aVarA.a();
    }

    private static final ii.o v(cs csVar) {
        ii.o.a aVarA = ii.o.a();
        aVarA.b(k(csVar.I().I()));
        aVarA.c(k(csVar.I().J()));
        aVarA.e(csVar.J().isEmpty() ? null : csVar.J());
        aVarA.d(csVar.J().isEmpty() ? null : (ak.n0) csVar.J().stream().map(hz0.f32517a).collect(ak.n0.W()));
        return aVarA.a();
    }

    private static final ii.y0 w(xu xuVar) throws hg.b {
        ii.p pVar;
        int I = xuVar.I();
        ii.b0 b0VarJ = ii.b0.j(xuVar.J(), xuVar.K());
        ii.a0 a0VarQ = xuVar.L() ? q(xuVar.M()) : null;
        switch (I) {
            case 0:
                pVar = ii.p.SUNDAY;
                break;
            case 1:
                pVar = ii.p.MONDAY;
                break;
            case 2:
                pVar = ii.p.TUESDAY;
                break;
            case 3:
                pVar = ii.p.WEDNESDAY;
                break;
            case 4:
                pVar = ii.p.THURSDAY;
                break;
            case 5:
                pVar = ii.p.FRIDAY;
                break;
            case 6:
                pVar = ii.p.SATURDAY;
                break;
            default:
                throw j("Day of week must an integer between 0 and 6");
        }
        ii.y0.a aVarA = ii.y0.a(pVar, b0VarJ);
        aVarA.b(a0VarQ);
        aVarA.d(xuVar.N());
        return aVarA.a();
    }

    /* JADX WARN: Code duplicated, block: B:186:0x07ca  */
    final ii.l0 a(ov ovVar) throws hg.b {
        ii.c cVarB;
        ii.d dVarA;
        ii.l lVarA;
        ak.n0 n0VarK;
        ii.t tVarA;
        ii.q qVarC;
        ii.w wVarA;
        ii.x xVarA;
        Integer numValueOf;
        ii.f0 f0VarA;
        ArrayList arrayList;
        ii.g gVarB;
        ii.n0 n0VarA;
        ii.o0 o0VarA;
        Integer num;
        ii.p0 p0VarA;
        ii.s0 s0VarA;
        ArrayList arrayList2;
        ArrayList arrayList3;
        LatLngBounds latLngBounds;
        ii.m mVarA;
        ii.l0.b bVarA = ii.l0.a();
        ut utVarB0 = ovVar.B0();
        ii.a.AbstractC2187a abstractC2187aA = ii.a.a();
        abstractC2187aA.c(m(utVarB0.I(), utVarB0.J()));
        abstractC2187aA.b(m(utVarB0.K(), utVarB0.L()));
        abstractC2187aA.d(m(utVarB0.M(), utVarB0.N()));
        abstractC2187aA.e(m(utVarB0.O(), utVarB0.P()));
        bVarA.b(abstractC2187aA.a());
        List<wt> listP1 = ovVar.P1();
        String str = null;
        if (listP1.isEmpty()) {
            cVarB = null;
        } else {
            ArrayList arrayList4 = new ArrayList();
            for (wt wtVar : listP1) {
                try {
                    ii.b.a aVarA = ii.b.a(wtVar.I(), wtVar.K());
                    aVarA.b(k(wtVar.J()));
                    arrayList4.add(aVarA.a());
                } catch (IllegalArgumentException e15) {
                    throw j(String.format("AddressComponent is not properly defined: %s.", e15.getMessage()));
                }
            }
            cVarB = ii.c.b(arrayList4);
        }
        bVarA.c(cVarB);
        if (ovVar.n1()) {
            yq yqVarO1 = ovVar.o1();
            ii.d.a aVarA2 = ii.d.a();
            aVarA2.c(yqVarO1.I().isEmpty() ? null : (List) yqVarO1.I().stream().map(new Function(this) { // from class: com.google.android.libraries.places.internal.mz0
                @Override // java.util.function.Function
                public final /* synthetic */ Object apply(Object obj) {
                    return nz0.g((xq) obj);
                }
            }).collect(ak.n0.W()));
            aVarA2.b(yqVarO1.J().isEmpty() ? null : (List) yqVarO1.J().stream().map(new Function(this) { // from class: com.google.android.libraries.places.internal.gz0
                @Override // java.util.function.Function
                public final /* synthetic */ Object apply(Object obj) {
                    return nz0.f((uq) obj);
                }
            }).collect(ak.n0.W()));
            dVarA = aVarA2.a();
        } else {
            dVarA = null;
        }
        bVarA.d(dVarA);
        String strP = ovVar.P();
        bVarA.e(strP.isEmpty() ? null : p.a(strP).a());
        bVarA.f(m(ovVar.q0(), ovVar.r0()));
        List listS = ovVar.S();
        bVarA.g(listS.isEmpty() ? null : (List) listS.stream().map(new Function(this) { // from class: com.google.android.libraries.places.internal.jz0
            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                au auVar = (au) obj;
                return nz0.s(nz0.n(auVar.J()), auVar.I());
            }
        }).collect(ak.n0.W()));
        bVarA.h((ii.l0.c) this.f33104a.getOrDefault(ovVar.Q(), null));
        if (ovVar.y1()) {
            ju juVarZ1 = ovVar.z1();
            ii.l.a aVarA3 = ii.l.a();
            aVarA3.d(k(juVarZ1.I()));
            if (juVarZ1.J()) {
                iu iuVarK = juVarZ1.K();
                ii.m.a aVarA4 = ii.m.a();
                aVarA4.e(k(iuVarK.I()));
                aVarA4.d(k(iuVarK.J()));
                aVarA4.b(k(iuVarK.K().I()));
                aVarA4.c(t(iuVarK.K().J()));
                mVarA = aVarA4.a();
            } else {
                mVarA = null;
            }
            aVarA3.b(mVarA);
            aVarA3.c(k(juVarZ1.L()));
            lVarA = aVarA3.a();
        } else {
            lVarA = null;
        }
        bVarA.i(lVarA);
        List<lu> listJ0 = ovVar.J0();
        if (listJ0.isEmpty()) {
            n0VarK = null;
        } else {
            ak.n0.a aVarS = ak.n0.s();
            for (lu luVar : listJ0) {
                String strK = k(luVar.I());
                String strK2 = k(luVar.J());
                ii.n nVarA = (strK == null || strK2 == null) ? null : ii.n.a(strK, strK2).a();
                if (nVarA != null) {
                    aVarS.a(nVarA);
                }
            }
            n0VarK = aVarS.k();
        }
        bVarA.j(n0VarK);
        bVarA.k(m(ovVar.d0(), ovVar.e0()));
        bVarA.l(ovVar.X0() ? i(ovVar.Y0()) : null);
        bVarA.m(h(ovVar.Z0()));
        bVarA.n(m(ovVar.Z(), ovVar.a0()));
        bVarA.o(m(ovVar.b0(), ovVar.c0()));
        bVarA.p(ovVar.D1() ? k(ovVar.E1().I()) : null);
        bVarA.q(ovVar.D1() ? k(ovVar.E1().J()) : null);
        bVarA.r(ovVar.b1() ? k(ovVar.c1().I()) : null);
        bVarA.s(ovVar.b1() ? k(ovVar.c1().J()) : null);
        if (ovVar.u1()) {
            nu nuVarV1 = ovVar.v1();
            ii.t.a aVarA5 = ii.t.a(v(nuVarV1.I()));
            aVarA5.b(nuVarV1.J() ? v(nuVarV1.K()) : null);
            aVarA5.f(nuVarV1.L() ? v(nuVarV1.M()) : null);
            aVarA5.g(nuVarV1.N() ? v(nuVarV1.O()) : null);
            aVarA5.e(t(nuVarV1.P()));
            aVarA5.c(k(nuVarV1.Q().I()));
            aVarA5.d(k(nuVarV1.Q().J()));
            tVarA = aVarA5.a();
        } else {
            tVarA = null;
        }
        bVarA.t(tVarA);
        if (ovVar.E0()) {
            ys ysVarF0 = ovVar.F0();
            qVarC = ii.q.c(Integer.valueOf(ysVarF0.I()), (ak.n0) ysVarF0.J().stream().map(new Function() { // from class: com.google.android.libraries.places.internal.lz0
                @Override // java.util.function.Function
                public final /* synthetic */ Object apply(Object obj) {
                    return this.f32890a.c((vs) obj);
                }
            }).collect(ak.n0.W()));
        } else {
            qVarC = null;
        }
        bVarA.u(qVarC);
        bVarA.v(k(ovVar.L1()));
        bVarA.w(ovVar.C0() ? ii.u.b((ak.n0) ovVar.D0().I().stream().map(new Function() { // from class: com.google.android.libraries.places.internal.kz0
            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                return this.f32775a.b((et) obj);
            }
        }).collect(ak.n0.W())) : null);
        if (ovVar.G0()) {
            pu puVarI0 = ovVar.I0();
            ii.w.a aVarA6 = ii.w.a();
            aVarA6.e(puVarI0.I() ? k(puVarI0.J().I()) : null);
            aVarA6.f(puVarI0.I() ? k(puVarI0.J().J()) : null);
            aVarA6.d(t(puVarI0.K()));
            aVarA6.b(puVarI0.L() ? k(puVarI0.M().I()) : null);
            aVarA6.c(puVarI0.L() ? k(puVarI0.M().J()) : null);
            wVarA = aVarA6.a();
        } else {
            wVarA = null;
        }
        bVarA.x(wVarA);
        bVarA.y(m(ovVar.o0(), ovVar.p0()));
        bVarA.z(m(ovVar.u0(), ovVar.v0()));
        bVarA.A(m(ovVar.w0(), ovVar.x0()));
        if (ovVar.p1()) {
            ru ruVarQ1 = ovVar.q1();
            ii.x.a aVarA7 = ii.x.a();
            aVarA7.b(t(ruVarQ1.I()));
            aVarA7.d(t(ruVarQ1.J()));
            aVarA7.f(t(ruVarQ1.K()));
            aVarA7.e(t(ruVarQ1.L()));
            aVarA7.c(t(ruVarQ1.M()));
            xVarA = aVarA7.a();
        } else {
            xVarA = null;
        }
        bVarA.B(xVarA);
        bVarA.C(t(ovVar.X1()));
        String strW = ovVar.W();
        if (strW.isEmpty()) {
            numValueOf = null;
        } else {
            try {
                numValueOf = Integer.valueOf(Color.parseColor(strW));
            } catch (IllegalArgumentException unused) {
                numValueOf = null;
            }
        }
        bVarA.D(numValueOf);
        String strV = ovVar.V();
        bVarA.E(!strV.isEmpty() ? strV.concat(".png") : null);
        bVarA.F(k(ovVar.C1()));
        bVarA.G(k(ovVar.K1()));
        bVarA.H(m(ovVar.g1(), ovVar.h1()));
        bVarA.I(ovVar.S1() ? p(ovVar.T1()) : null);
        bVarA.J(m(ovVar.i1(), ovVar.j1()));
        bVarA.K(k(ovVar.J1()));
        if (ovVar.w1()) {
            tu tuVarX1 = ovVar.x1();
            ii.f0.a aVarA8 = ii.f0.a();
            aVarA8.f(tuVarX1.I() ? v(tuVarX1.J()) : null);
            aVarA8.b(tuVarX1.K() ? v(tuVarX1.L()) : null);
            aVarA8.e(t(tuVarX1.M()));
            aVarA8.c(k(tuVarX1.N().I()));
            aVarA8.d(k(tuVarX1.N().J()));
            f0VarA = aVarA8.a();
        } else {
            f0VarA = null;
        }
        bVarA.L(f0VarA);
        bVarA.M(ovVar.I() ? i(ovVar.J()) : null);
        bVarA.N(m(ovVar.e1(), ovVar.f1()));
        fv fvVarZ0 = ovVar.z0();
        ii.h0.a aVarA9 = ii.h0.a();
        aVarA9.c(m(fvVarZ0.I(), fvVarZ0.J()));
        aVarA9.f(m(fvVarZ0.K(), fvVarZ0.L()));
        aVarA9.d(m(fvVarZ0.M(), fvVarZ0.N()));
        aVarA9.g(m(fvVarZ0.O(), fvVarZ0.P()));
        aVarA9.h(m(fvVarZ0.Q(), fvVarZ0.R()));
        aVarA9.b(m(fvVarZ0.S(), fvVarZ0.T()));
        aVarA9.e(m(fvVarZ0.U(), fvVarZ0.V()));
        bVarA.O(aVarA9.a());
        hv hvVarY0 = ovVar.y0();
        ii.i0.a aVarA10 = ii.i0.a();
        aVarA10.c(m(hvVarY0.I(), hvVarY0.J()));
        aVarA10.d(m(hvVarY0.K(), hvVarY0.L()));
        aVarA10.b(m(hvVarY0.M(), hvVarY0.N()));
        aVarA10.e(m(hvVarY0.O(), hvVarY0.P()));
        bVarA.P(aVarA10.a());
        List<qt> listO = ovVar.O();
        if (listO.isEmpty()) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (qt qtVar : listO) {
                String strI = qtVar.I();
                if (strI.isEmpty() || strI.split("/").length != 4) {
                    throw j("Photo reference not provided for a PhotoMetadata result.");
                }
                ii.k0.a aVarA11 = ii.k0.a((String) ak.x0.d(zj.t.e('/').g(strI), 3));
                aVarA11.g(qtVar.I());
                aVarA11.b((String) qtVar.L().stream().map(new Function(this) { // from class: com.google.android.libraries.places.internal.iz0
                    @Override // java.util.function.Function
                    public final /* synthetic */ Object apply(Object obj) {
                        br brVar = (br) obj;
                        return nz0.s(nz0.n(brVar.J()), brVar.I());
                    }
                }).collect(Collectors.joining(", ")));
                aVarA11.e(qtVar.K());
                aVarA11.f(qtVar.J());
                List listL = qtVar.L();
                if (listL.isEmpty()) {
                    gVarB = null;
                } else {
                    ak.n0.a aVarS2 = ak.n0.s();
                    Iterator it = listL.iterator();
                    while (it.hasNext()) {
                        aVarS2.a(u((br) it.next()));
                    }
                    gVarB = ii.g.b(aVarS2.k());
                }
                aVarA11.c(gVarB);
                aVarA11.d(t(qtVar.M()));
                aVarA11.h(t(qtVar.N()));
                arrayList.add(aVarA11.a());
            }
        }
        bVarA.Q(arrayList);
        bVarA.R(ovVar.F1().isEmpty() ? null : ovVar.F1());
        if (ovVar.Q1()) {
            jv jvVarR1 = ovVar.R1();
            ii.n0.a aVarA12 = ii.n0.a();
            aVarA12.b(k(jvVarR1.J()));
            aVarA12.c(k(jvVarR1.I()));
            n0VarA = aVarA12.a();
        } else {
            n0VarA = null;
        }
        bVarA.S(n0VarA);
        if (ovVar.N1()) {
            m30 m30VarO1 = ovVar.O1();
            String strK3 = k(m30VarO1.I());
            if (strK3 == null) {
                o0VarA = null;
            } else {
                ii.o0.a aVarA13 = ii.o0.a(strK3);
                aVarA13.d(k(m30VarO1.J()));
                aVarA13.g(k(m30VarO1.K()));
                aVarA13.i(k(m30VarO1.L()));
                aVarA13.c(k(m30VarO1.M()));
                aVarA13.e(k(m30VarO1.N()));
                aVarA13.j(k(m30VarO1.O()));
                aVarA13.b(m30VarO1.P().isEmpty() ? null : m30VarO1.P());
                aVarA13.h(m30VarO1.Q().isEmpty() ? null : m30VarO1.Q());
                aVarA13.f(k(m30VarO1.R()));
                o0VarA = aVarA13.a();
            }
        } else {
            o0VarA = null;
        }
        bVarA.T(o0VarA);
        int iOrdinal = ovVar.R().ordinal();
        if (iOrdinal == 1) {
            num = 0;
        } else if (iOrdinal == 2) {
            num = 1;
        } else if (iOrdinal == 3) {
            num = 2;
        } else if (iOrdinal != 4) {
            num = iOrdinal != 5 ? null : 4;
        } else {
            num = 3;
        }
        bVarA.U(num);
        if (ovVar.r1().I()) {
            ii.p0.a aVarA14 = ii.p0.a();
            aVarA14.c(r(ovVar.r1().J()));
            if (ovVar.r1().K()) {
                aVarA14.b(r(ovVar.r1().L()));
            }
            p0VarA = aVarA14.a();
        } else {
            p0VarA = null;
        }
        bVarA.V(p0VarA);
        bVarA.W(k(ovVar.G1()));
        bVarA.X(ovVar.H1() ? k(ovVar.I1().I()) : null);
        bVarA.Y(ovVar.H1() ? k(ovVar.I1().J()) : null);
        bVarA.Z(m(ovVar.l1(), ovVar.m1()));
        double dW1 = ovVar.W1();
        bVarA.a0(dW1 < 1.0d ? null : Double.valueOf(dW1));
        bVarA.b0(m(ovVar.f0(), ovVar.g0()));
        bVarA.c0(k(ovVar.i0()));
        bVarA.d0(m(ovVar.s0(), ovVar.t0()));
        if (ovVar.s1()) {
            lv lvVarT1 = ovVar.t1();
            ii.s0.a aVarA15 = ii.s0.a();
            aVarA15.f(k(lvVarT1.I().I()));
            aVarA15.g(k(lvVarT1.I().J()));
            aVarA15.d(t(lvVarT1.J()));
            aVarA15.b(k(lvVarT1.K().I()));
            aVarA15.c(k(lvVarT1.K().J()));
            aVarA15.e(t(lvVarT1.L()));
            s0VarA = aVarA15.a();
        } else {
            s0VarA = null;
        }
        bVarA.e0(s0VarA);
        List<aw> listZ1 = ovVar.Z1();
        if (listZ1.isEmpty()) {
            arrayList2 = null;
        } else {
            arrayList2 = new ArrayList();
            for (aw awVar : listZ1) {
                double dN = awVar.N();
                if (dN == 0.0d) {
                    throw j("Review rating not provided for a Review result.");
                }
                if (!awVar.O()) {
                    throw j("Author attribution not provided for a Review result.");
                }
                String strA = awVar.Q() ? b20.a(awVar.R()) : str;
                String strK4 = awVar.J() ? k(awVar.K().I()) : str;
                String strK5 = awVar.J() ? k(awVar.K().J()) : str;
                String strK6 = awVar.L() ? k(awVar.M().I()) : str;
                String strK7 = awVar.L() ? k(awVar.M().J()) : str;
                String strK8 = k(awVar.I());
                ii.a0 a0VarK = awVar.T() ? ii.a0.k(awVar.U().I(), awVar.U().J(), 1) : null;
                ii.r0.a aVarA16 = ii.r0.a(Double.valueOf(dN), u(awVar.P()));
                aVarA16.e(strA);
                aVarA16.g(strK4);
                aVarA16.h(strK5);
                aVarA16.c(strK6);
                aVarA16.d(strK7);
                aVarA16.f(strK8);
                aVarA16.b(t(awVar.S()));
                aVarA16.i(a0VarK);
                arrayList2.add(aVarA16.a());
                str = null;
            }
        }
        bVarA.f0(arrayList2);
        bVarA.g0(h(ovVar.a1()));
        bVarA.h0(m(ovVar.P0(), ovVar.Q0()));
        bVarA.i0(m(ovVar.h0(), ovVar.K0()));
        bVarA.j0(m(ovVar.T0(), ovVar.U0()));
        bVarA.k0(m(ovVar.k1(), ovVar.j0()));
        bVarA.l0(m(ovVar.m0(), ovVar.n0()));
        bVarA.m0(m(ovVar.k0(), ovVar.l0()));
        bVarA.n0(m(ovVar.N0(), ovVar.O0()));
        bVarA.o0(m(ovVar.L0(), ovVar.M0()));
        bVarA.p0(m(ovVar.V0(), ovVar.W0()));
        bVarA.q0(m(ovVar.R0(), ovVar.S0()));
        bVarA.r0(k(ovVar.M1()));
        List<nv> listA0 = ovVar.A0();
        if (listA0.isEmpty()) {
            arrayList3 = null;
        } else {
            arrayList3 = new ArrayList();
            for (nv nvVar : listA0) {
                arrayList3.add(ii.x0.c(nvVar.J(), nvVar.I()));
            }
        }
        bVarA.s0(arrayList3);
        bVarA.t0(m(ovVar.X(), ovVar.Y()));
        bVarA.u0(ovVar.M() ? ZoneId.of(ovVar.N().I()) : null);
        bVarA.v0(ovVar.T() ? Integer.valueOf(ovVar.U()) : null);
        bVarA.w0(ovVar.K() ? Integer.valueOf(ovVar.L()) : null);
        if (ovVar.U1()) {
            fp fpVarV1 = ovVar.V1();
            latLngBounds = new LatLngBounds(p(fpVarV1.I()), p(fpVarV1.J()));
        } else {
            latLngBounds = null;
        }
        bVarA.x0(latLngBounds);
        bVarA.y0(t(ovVar.Y1()));
        return bVarA.a();
    }

    final /* synthetic */ ii.v b(et etVar) {
        return ii.v.d((ii.v.b) this.f33107d.getOrDefault(etVar.I(), ii.v.b.FUEL_TYPE_UNSPECIFIED), r(etVar.J()), o(etVar.K()));
    }

    final /* synthetic */ ii.k c(vs vsVar) {
        ii.k.a aVarA = ii.k.a((ii.r) this.f33106c.getOrDefault(vsVar.I(), ii.r.EV_CONNECTOR_TYPE_UNSPECIFIED), Double.valueOf(vsVar.J()), Integer.valueOf(vsVar.K()));
        aVarA.c(vsVar.L() ? Integer.valueOf(vsVar.M()) : null);
        aVarA.f(vsVar.N() ? Integer.valueOf(vsVar.O()) : null);
        aVarA.b(vsVar.P() ? o(vsVar.Q()) : null);
        return aVarA.a();
    }
}
