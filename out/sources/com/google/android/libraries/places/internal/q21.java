package com.google.android.libraries.places.internal;

import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class q21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ak.p0 f33374a = ak.p0.a().g("OPERATIONAL", ii.l0.c.OPERATIONAL).g("CLOSED_TEMPORARILY", ii.l0.c.CLOSED_TEMPORARILY).g("CLOSED_PERMANENTLY", ii.l0.c.CLOSED_PERMANENTLY).d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ak.p0 f33375b = ak.p0.a().g("ACCESS", ii.g0.b.ACCESS).g("BREAKFAST", ii.g0.b.BREAKFAST).g("BRUNCH", ii.g0.b.BRUNCH).g("DELIVERY", ii.g0.b.DELIVERY).g("DINNER", ii.g0.b.DINNER).g("DRIVE_THROUGH", ii.g0.b.DRIVE_THROUGH).g("HAPPY_HOUR", ii.g0.b.HAPPY_HOUR).g("KITCHEN", ii.g0.b.KITCHEN).g("LUNCH", ii.g0.b.LUNCH).g("ONLINE_SERVICE_HOURS", ii.g0.b.ONLINE_SERVICE_HOURS).g("PICKUP", ii.g0.b.PICKUP).g("SENIOR_HOURS", ii.g0.b.SENIOR_HOURS).g("TAKEOUT", ii.g0.b.TAKEOUT).d();

    q21() {
    }

    static ii.y0 a(a31 a31Var) {
        ii.b0 b0VarJ;
        ii.p pVar;
        ii.a0 a0VarB = null;
        if (a31Var == null) {
            return null;
        }
        try {
            Integer num = (Integer) zj.p.r(a31Var.a(), "Unable to convert Pablo response to TimeOfWeek: The \"day\" field is missing.");
            String str = (String) zj.p.r(a31Var.b(), "Unable to convert Pablo response to TimeOfWeek: The \"time\" field is missing.");
            if (str != null) {
                String str2 = String.format("Unable to convert %s to LocalTime, must be of format \"hhmm\".", str);
                zj.p.e(str.length() == 4, str2);
                try {
                    b0VarJ = ii.b0.j(Integer.parseInt(str.substring(0, 2)), Integer.parseInt(str.substring(2, 4)));
                } catch (NumberFormatException e15) {
                    throw new IllegalArgumentException(str2, e15);
                }
            } else {
                b0VarJ = null;
            }
            ii.b0 b0Var = (ii.b0) zj.p.q(b0VarJ);
            try {
                a0VarB = b(a31Var.c());
            } catch (IllegalArgumentException unused) {
            }
            switch (num.intValue()) {
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
                    throw new IllegalArgumentException("pabloDayOfWeek can only be an integer between 0 and 6");
            }
            ii.y0.a aVarA = ii.y0.a(pVar, b0Var);
            aVarA.b(a0VarB);
            aVarA.d(Objects.equals(a31Var.d(), Boolean.TRUE));
            return aVarA.a();
        } catch (NullPointerException e16) {
            throw new IllegalArgumentException(e16.getMessage(), e16);
        }
    }

    static ii.a0 b(String str) {
        if (str == null) {
            return null;
        }
        try {
            return ii.a0.k(Integer.parseInt(str.substring(0, 4)), Integer.parseInt(str.substring(5, 7)), Integer.parseInt(str.substring(8, 10)));
        } catch (IllegalArgumentException e15) {
            throw new IllegalArgumentException(String.format("Unable to convert %s to LocalDate; date should be in format YYYY-MM-DD.", str), e15);
        }
    }

    static List c(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list;
    }

    static ii.l0.a d(Boolean bool) {
        if (bool == null) {
            return ii.l0.a.UNKNOWN;
        }
        return bool.booleanValue() ? ii.l0.a.TRUE : ii.l0.a.FALSE;
    }

    static List e(List list) {
        return list != null ? list : new ArrayList();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007c  */
    static final ii.l0 f(e31 e31Var, List list) throws hg.b {
        ii.c cVarB;
        ii.b bVarA;
        LatLng latLngH;
        LatLngBounds latLngBounds;
        Integer numValueOf;
        ArrayList arrayList;
        ii.n0 n0VarA;
        ii.k0 k0VarA;
        ii.l0.b bVarA2 = ii.l0.a();
        bVarA2.g(list);
        if (e31Var != null) {
            ak.n0<t21> n0VarG = e31Var.g();
            ArrayList arrayList2 = null;
            if (n0VarG.isEmpty()) {
                cVarB = null;
            } else {
                ArrayList arrayList3 = new ArrayList();
                for (t21 t21Var : n0VarG) {
                    if (t21Var == null) {
                        bVarA = null;
                    } else {
                        try {
                            ii.b.a aVarA = ii.b.a((String) zj.p.q(t21Var.a()), t21Var.c());
                            aVarA.b(t21Var.b());
                            bVarA = aVarA.a();
                        } catch (IllegalStateException | NullPointerException e15) {
                            throw i(String.format("AddressComponent not properly defined (%s).", e15.getMessage()));
                        }
                    }
                    j(arrayList3, bVarA);
                }
                cVarB = ii.c.b(arrayList3);
            }
            x21 x21VarO = e31Var.o();
            if (x21VarO != null) {
                latLngH = h(x21VarO.a());
                w21 w21VarB = x21VarO.b();
                if (w21VarB == null) {
                    latLngBounds = null;
                } else {
                    LatLng latLngH2 = h(w21VarB.b());
                    LatLng latLngH3 = h(w21VarB.a());
                    if (latLngH2 == null || latLngH3 == null) {
                        latLngBounds = null;
                    } else {
                        latLngBounds = new LatLngBounds(latLngH2, latLngH3);
                    }
                }
            } else {
                latLngH = null;
                latLngBounds = null;
            }
            String strF = e31Var.f();
            Uri uri = strF != null ? Uri.parse(strF) : null;
            String strQ = e31Var.q();
            String strConcat = strQ != null ? strQ.concat(".png") : null;
            String strP = e31Var.p();
            if (strP != null) {
                try {
                    numValueOf = Integer.valueOf(Color.parseColor(strP));
                } catch (IllegalArgumentException unused) {
                    numValueOf = null;
                }
            } else {
                numValueOf = null;
            }
            bVarA2.c(cVarB);
            bVarA2.h((ii.l0.c) f33374a.getOrDefault(e31Var.h(), null));
            bVarA2.k(d(e31Var.i()));
            bVarA2.l(g(e31Var.j()));
            bVarA2.n(d(e31Var.k()));
            bVarA2.o(d(e31Var.l()));
            bVarA2.p(e31Var.s());
            u21 u21VarM = e31Var.m();
            bVarA2.r(u21VarM == null ? null : u21VarM.b());
            u21 u21VarM2 = e31Var.m();
            bVarA2.s(u21VarM2 == null ? null : u21VarM2.a());
            bVarA2.v(e31Var.n());
            bVarA2.D(numValueOf);
            bVarA2.E(strConcat);
            bVarA2.F(e31Var.v());
            bVarA2.G(e31Var.r());
            bVarA2.I(latLngH);
            bVarA2.M(g(e31Var.t()));
            ak.n0<c31> n0VarU = e31Var.u();
            if (n0VarU.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = new ArrayList();
                for (c31 c31Var : n0VarU) {
                    if (c31Var == null) {
                        k0VarA = null;
                    } else {
                        String strC = c31Var.c();
                        if (TextUtils.isEmpty(strC)) {
                            throw i("Photo reference not provided for a PhotoMetadata result.");
                        }
                        Integer numA = c31Var.a();
                        Integer numB = c31Var.b();
                        ii.k0.a aVarA2 = ii.k0.a(strC);
                        ak.n0 n0VarD = c31Var.d();
                        aVarA2.b(n0VarD.isEmpty() ? "" : zj.i.h(", ").i().e(n0VarD));
                        aVarA2.e(numA == null ? 0 : numA.intValue());
                        aVarA2.f(numB != null ? numB.intValue() : 0);
                        k0VarA = aVarA2.a();
                    }
                    j(arrayList, k0VarA);
                }
            }
            bVarA2.Q(arrayList);
            bVarA2.R(c(e31Var.c()));
            d31 d31VarW = e31Var.w();
            if (d31VarW == null) {
                n0VarA = null;
            } else {
                ii.n0.a aVarA3 = ii.n0.a();
                aVarA3.b(d31VarW.a());
                aVarA3.c(d31VarW.b());
                n0VarA = aVarA3.a();
            }
            bVarA2.S(n0VarA);
            bVarA2.U(e31Var.x());
            bVarA2.a0(e31Var.y());
            bVarA2.b0(d(e31Var.z()));
            ak.n0 n0VarA2 = e31Var.A();
            if (!n0VarA2.isEmpty()) {
                ArrayList arrayList4 = new ArrayList();
                Iterator<E> it = n0VarA2.iterator();
                while (it.hasNext()) {
                    j(arrayList4, g((b31) it.next()));
                }
                if (!arrayList4.isEmpty()) {
                    arrayList2 = arrayList4;
                }
            }
            bVarA2.g0(arrayList2);
            bVarA2.h0(d(e31Var.B()));
            bVarA2.i0(d(e31Var.C()));
            bVarA2.j0(d(e31Var.C()));
            bVarA2.n0(d(e31Var.D()));
            bVarA2.o0(d(e31Var.E()));
            bVarA2.p0(d(e31Var.F()));
            bVarA2.q0(d(e31Var.a()));
            bVarA2.t0(d(e31Var.b()));
            bVarA2.v0(e31Var.d());
            bVarA2.w0(e31Var.e());
            bVarA2.x0(latLngBounds);
            bVarA2.y0(uri);
        }
        return bVarA2.a();
    }

    private static ii.g0 g(b31 b31Var) {
        ArrayList arrayList;
        ii.w0 w0VarA;
        ii.j0 j0VarA;
        if (b31Var == null) {
            return null;
        }
        ii.g0.a aVarA = ii.g0.a();
        ak.n0<y21> n0VarA = b31Var.a();
        if (n0VarA.isEmpty()) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (y21 y21Var : n0VarA) {
                if (y21Var != null) {
                    ii.j0.a aVarA2 = ii.j0.a();
                    aVarA2.c(a(y21Var.b()));
                    aVarA2.b(a(y21Var.a()));
                    j0VarA = aVarA2.a();
                } else {
                    j0VarA = null;
                }
                j(arrayList, j0VarA);
            }
        }
        aVarA.c(e(arrayList));
        aVarA.e(b31Var.b());
        aVarA.b((ii.g0.b) f33375b.getOrDefault(b31Var.c(), null));
        ak.n0<z21> n0VarD = b31Var.d();
        ArrayList arrayList2 = new ArrayList();
        if (!n0VarD.isEmpty()) {
            for (z21 z21Var : n0VarD) {
                if (z21Var == null) {
                    w0VarA = null;
                } else {
                    try {
                        ii.w0.a aVarA3 = ii.w0.a((ii.a0) zj.p.q(b(z21Var.a())));
                        aVarA3.b(Objects.equals(z21Var.b(), Boolean.TRUE));
                        w0VarA = aVarA3.a();
                    } catch (IllegalArgumentException | NullPointerException unused) {
                        w0VarA = null;
                    }
                }
                j(arrayList2, w0VarA);
            }
        }
        aVarA.d(arrayList2);
        return aVarA.a();
    }

    private static LatLng h(v21 v21Var) {
        if (v21Var == null) {
            return null;
        }
        Double dA = v21Var.a();
        Double dB = v21Var.b();
        if (dA == null || dB == null) {
            return null;
        }
        return new LatLng(dA.doubleValue(), dB.doubleValue());
    }

    private static hg.b i(String str) {
        return new hg.b(new Status(8, "Unexpected server error: ".concat(String.valueOf(str))));
    }

    private static boolean j(Collection collection, Object obj) {
        if (obj != null) {
            return collection.add(obj);
        }
        return false;
    }
}
