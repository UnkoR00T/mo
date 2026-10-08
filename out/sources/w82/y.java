package w82;

import android.content.Context;
import androidx.compose.ui.graphics.Color;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import d1.a3;
import d1.r3;
import h30.ButtonData;
import mx.Label;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p046f2.al;
import p049fm.MapProperties;
import p049fm.MapUiSettings;
import p049fm.b0;
import p049fm.r4;
import p049fm.v4;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import w04.LocationCoordinates;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lw82/c;", "viewModel", "Loq/i0;", "g", "(Lw82/c;Lm2/r;I)V", "Lw82/c$a;", "data", "Li70/p;", "snackBarState", "k", "(Lw82/c$a;Li70/p;Lm2/r;I)V", "Lw82/z;", "selectedAddress", "Lh30/a;", "nextButtonData", "o", "(Lw82/z;Lh30/a;Lm2/r;I)V", "gios_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class y {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements er.a<p049fm.e> {
        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final p049fm.e a() {
            return p049fm.e.Companion.c(p049fm.e.INSTANCE, null, 1, null);
        }
    }

    public static final void g(final c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-41262775);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-41262775, i16, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.map.MapScreen (MapScreen.kt:45)");
            }
            f6 f6VarC = m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7);
            f6 f6VarB = m7.b.b(cVar.j(), i70.p.a.f89857a, null, null, null, rVarH, i70.p.a.f89858b << 3, 14);
            rVarH = rVarH;
            oz.l.b(cVar.getLifecycleConnector(), rVarH, 0);
            k(h(f6VarC), i(f6VarB), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: w82.s
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return y.j(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.Data h(f6<c.Data> f6Var) {
        return f6Var.getValue();
    }

    private static final i70.p i(f6<? extends i70.p> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(c cVar, int i15, p076m2.r rVar, int i16) {
        g(cVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void k(final c.Data data, i70.p pVar, p076m2.r rVar, final int i15) {
        int i16;
        final i70.p pVar2;
        p076m2.r rVarH = rVar.h(1478889296);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1478889296, i16, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.map.MapScreenContentInitialized (MapScreen.kt:63)");
            }
            Object objE = rVarH.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = new al();
                rVarH.v(objE);
            }
            i70.m.d((al) objE, pVar, data.f(), null, null, rVarH, (i16 & 112) | 6, 24);
            pVar2 = pVar;
            rVarH = rVarH;
            p049fm.e eVar = (p049fm.e) b3.f.i(new Object[0], p049fm.e.INSTANCE.a(), new a(), rVarH, 0);
            if (data.getMarkerLatLng() != null && !data.getPinChosenByUser()) {
                eVar.E(CameraPosition.h(data.getMarkerLatLng(), data.getZoomMap()));
            }
            LocationCoordinates locationCoordinates = data.getLocationCoordinates();
            MapProperties mapProperties = new MapProperties(false, false, locationCoordinates != null ? locationCoordinates.getIsMyLocationEnabled() : false, false, null, null, null, 0.0f, 0.0f, 507, null);
            Object objE2 = rVarH.E();
            if (objE2 == companion.a()) {
                MapUiSettings mapUiSettings = new MapUiSettings(false, false, false, false, false, false, false, false, false, false, 1015, null);
                rVarH.v(mapUiSettings);
                objE2 = mapUiSettings;
            }
            MapUiSettings mapUiSettings2 = (MapUiSettings) objE2;
            f3.m.Companion companion2 = f3.m.INSTANCE;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(companion2, 0.0f, 1, null);
            f3.c.Companion companion3 = f3.c.INSTANCE;
            w0 w0VarI = d1.r.i(companion3.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarF);
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
            n6.i(rVarC, w0VarI, companion4.d());
            n6.i(rVarC, e0VarT, companion4.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion4.c());
            n6.g(rVarC, companion4.a());
            n6.i(rVarC, mVarE, companion4.e());
            d1.x xVar = d1.x.f39368a;
            f3.m mVarF2 = androidx.compose.foundation.layout.d.f(companion2, 0.0f, 1, null);
            er.l<LatLng, i0> lVarE = data.e();
            Object objE3 = rVarH.E();
            if (objE3 == companion.a()) {
                objE3 = new er.p() { // from class: w82.t
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return y.l((Context) obj, (GoogleMapOptions) obj2);
                    }
                };
                rVarH.v(objE3);
            }
            b0.h(mVarF2, false, eVar, null, null, mapProperties, null, mapUiSettings2, null, lVarE, null, null, null, null, null, null, null, (er.p) objE3, y2.m.d(-56887183, true, new er.p() { // from class: w82.u
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return y.m(data, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, (p049fm.e.f65033i << 6) | 6 | (MapProperties.f65356j << 15) | (MapUiSettings.f65123k << 21), 113246208, 130394);
            f3.m mVarD = xVar.d(companion2, companion3.c());
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarR = a3.r(mVarD, aVar.b(rVarH, i17).getSpacing300(), 0.0f, aVar.b(rVarH, i17).getSpacing300(), aVar.b(rVarH, i17).getSpacing500(), 2, null);
            d1.i iVar = d1.i.f39152a;
            w0 w0VarA = d1.e0.a(iVar.k(), companion3.k(), rVarH, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarR);
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
            n6.i(rVarC2, w0VarA, companion4.d());
            n6.i(rVarC2, e0VarT2, companion4.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion4.c());
            n6.g(rVarC2, companion4.a());
            n6.i(rVarC2, mVarE2, companion4.e());
            f3.m mVarC = d1.i0.f39176a.c(w0.i.d(companion2, Color.INSTANCE.g(), null, 2, null), companion3.j());
            w0 w0VarA2 = d1.e0.a(iVar.k(), companion3.k(), rVarH, 0);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT3 = rVarH.t();
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
            n6.i(rVarC3, w0VarA2, companion4.d());
            n6.i(rVarC3, e0VarT3, companion4.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion4.c());
            n6.g(rVarC3, companion4.a());
            n6.i(rVarC3, mVarE3, companion4.e());
            h30.q.p(data.getNavigationButtonData(), false, null, rVarH, 0, 6);
            rVarH.x();
            r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
            if (data.getShowBottomAddress()) {
                rVarH.X(2122227651);
                o(data.getSelectedAddress(), data.getNextButtonData(), rVarH, 0);
            } else {
                rVarH.X(2117886318);
            }
            rVarH.R();
            rVarH.x();
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            pVar2 = pVar;
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: w82.v
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return y.n(data, pVar2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lh.e l(Context context, GoogleMapOptions googleMapOptions) {
        lh.e eVar = new lh.e(context, googleMapOptions);
        eVar.setFocusable(false);
        eVar.setFocusableInTouchMode(false);
        eVar.setDescendantFocusability(393216);
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(c.Data data, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-56887183, i15, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.map.MapScreenContentInitialized.<anonymous>.<anonymous> (MapScreen.kt:101)");
            }
            LatLng markerLatLng = data.getMarkerLatLng();
            if (markerLatLng == null) {
                rVar.X(1786042587);
                rVar.R();
            } else {
                rVar.X(1786042588);
                r4.E(v4.INSTANCE.a(markerLatLng), null, 0.0f, 0L, false, false, null, 0L, 0.0f, null, null, null, false, 0.0f, null, null, null, null, rVar, v4.f65331f, 0, 262142);
                rVar.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(c.Data data, i70.p pVar, int i15, p076m2.r rVar, int i16) {
        k(data, pVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void o(final SelectedAddress selectedAddress, final ButtonData buttonData, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1950466594);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(selectedAddress) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(buttonData) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1950466594, i16, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.map.SheetContent (MapScreen.kt:141)");
            }
            x30.c.c(null, 0.0f, y2.m.d(1081405955, true, new er.p() { // from class: w82.w
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return y.p(selectedAddress, buttonData, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, MLKEMEngine.KyberPolyBytes, 3);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: w82.x
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return y.q(selectedAddress, buttonData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(SelectedAddress selectedAddress, ButtonData buttonData, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1081405955, i15, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.map.SheetContent.<anonymous> (MapScreen.kt:143)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
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
            Label title = selectedAddress.getTitle();
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            j70.h.g(null, null, title, null, null, aVar.a(rVar, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, b5.v.INSTANCE.b(), false, 2, 0, null, aVar.f(rVar, i16).a(), null, null, false, false, null, rVar, 0, 1597440, 0, 32948187);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing100()), rVar, 0);
            j70.h.g(null, null, selectedAddress.getAddress(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).d(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing200()), rVar, 0);
            h30.q.p(buttonData, false, null, rVar, 0, 6);
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
    public static final i0 q(SelectedAddress selectedAddress, ButtonData buttonData, int i15, p076m2.r rVar, int i16) {
        o(selectedAddress, buttonData, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
