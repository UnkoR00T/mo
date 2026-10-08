package kf3;

import android.content.Context;
import androidx.compose.ui.graphics.Color;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import i50.BaseScaffoldData;
import ju.p0;
import mx.Label;
import nf3.SelectedAddress;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p046f2.al;
import p049fm.MapProperties;
import p049fm.MapUiSettings;
import p049fm.r4;
import p049fm.v4;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import w0.q0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lkf3/c;", "viewModel", "Loq/i0;", "h", "(Lkf3/c;Lm2/r;I)V", "Lkf3/c$a;", "data", "Li70/p;", "snackBarState", "l", "(Lkf3/c$a;Li70/p;Lm2/r;I)V", "Lnf3/a;", "selectedAddress", "q", "(Lnf3/a;Lm2/r;I)V", "vehiclecollision_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class k {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements er.a<p049fm.e> {
        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final p049fm.e a() {
            return p049fm.e.Companion.c(p049fm.e.INSTANCE, null, 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f110713e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ kf3.c.Data f110714f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ p049fm.e f110715g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kf3.c.Data data, p049fm.e eVar, tq.e<? super b> eVar2) {
            super(2, eVar2);
            this.f110714f = data;
            this.f110715g = eVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f110713e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (this.f110714f.getCameraPosition() != null) {
                this.f110715g.E(CameraPosition.h(this.f110714f.getCameraPosition(), this.f110714f.getZoomMap()));
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new b(this.f110714f, this.f110715g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f110716e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ p049fm.e f110717f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ kf3.c.Data f110718g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(p049fm.e eVar, kf3.c.Data data, tq.e<? super c> eVar2) {
            super(2, eVar2);
            this.f110717f = eVar;
            this.f110718g = data;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f110716e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (this.f110717f.v() && this.f110717f.p() == p049fm.a.GESTURE) {
                this.f110718g.e().a();
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((c) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new c(this.f110717f, this.f110718g, eVar);
        }
    }

    public static final void h(final kf3.c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-397121255);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-397121255, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.chooselocalizationmap.ChooseLocalizationMapScreen (ChooseLocalizationMapScreen.kt:48)");
            }
            f6 f6VarC = m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7);
            f6 f6VarB = m7.b.b(cVar.j(), i70.p.a.f89857a, null, null, null, rVarH, i70.p.a.f89858b << 3, 14);
            rVarH = rVarH;
            l(i(f6VarC), j(f6VarB), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: kf3.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.k(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final kf3.c.Data i(f6<kf3.c.Data> f6Var) {
        return f6Var.getValue();
    }

    private static final i70.p j(f6<? extends i70.p> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(kf3.c cVar, int i15, p076m2.r rVar, int i16) {
        h(cVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void l(final kf3.c.Data data, final i70.p pVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-466640399);
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
                p076m2.t.o(-466640399, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.chooselocalizationmap.ChooseLocalizationMapScreenContentLocation (ChooseLocalizationMapScreen.kt:64)");
            }
            Object objE = rVarH.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = new al();
                rVarH.v(objE);
            }
            i70.m.d((al) objE, pVar, data.h(), null, null, rVarH, (i16 & 112) | 6, 24);
            final p049fm.e eVar = (p049fm.e) b3.f.i(new Object[0], p049fm.e.INSTANCE.a(), new a(), rVarH, 0);
            LatLng cameraPosition = data.getCameraPosition();
            boolean zG = rVarH.G(data) | rVarH.G(eVar);
            Object objE2 = rVarH.E();
            if (zG || objE2 == companion.a()) {
                objE2 = new b(data, eVar, null);
                rVarH.v(objE2);
            }
            Function0.d(cameraPosition, (er.p) objE2, rVarH, 0);
            Boolean boolValueOf = Boolean.valueOf(eVar.v());
            boolean zG2 = rVarH.G(eVar) | rVarH.G(data);
            Object objE3 = rVarH.E();
            if (zG2 || objE3 == companion.a()) {
                objE3 = new c(eVar, data, null);
                rVarH.v(objE3);
            }
            Function0.d(boolValueOf, (er.p) objE3, rVarH, 0);
            final MapProperties mapProperties = new MapProperties(false, false, data.getShowMyLocalization(), false, null, null, null, 0.0f, 0.0f, 507, null);
            Object objE4 = rVarH.E();
            if (objE4 == companion.a()) {
                MapUiSettings mapUiSettings = new MapUiSettings(false, false, false, false, false, false, false, false, false, false, 759, null);
                rVarH.v(mapUiSettings);
                objE4 = mapUiSettings;
            }
            final MapUiSettings mapUiSettings2 = (MapUiSettings) objE4;
            i50.s.r(data.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1414707428, true, new er.q() { // from class: kf3.e
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return k.m(data, eVar, mapProperties, mapUiSettings2, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: kf3.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.p(data, pVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(final kf3.c.Data data, p049fm.e eVar, MapProperties mapProperties, MapUiSettings mapUiSettings, d3 d3Var, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1414707428, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.chooselocalizationmap.ChooseLocalizationMapScreenContentLocation.<anonymous> (ChooseLocalizationMapScreen.kt:106)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, companion);
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
            f3.m mVarF = androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null);
            w0 w0VarI = d1.r.i(companion2.o(), false);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarF);
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
            n6.i(rVarC2, w0VarI, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            d1.x xVar = d1.x.f39368a;
            f3.m mVarF2 = androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null);
            er.l<LatLng, i0> lVarF = data.f();
            er.l<nh.k, i0> lVarG = data.g();
            Object objE = rVar.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new er.p() { // from class: kf3.g
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return k.n((Context) obj, (GoogleMapOptions) obj2);
                    }
                };
                rVar.v(objE);
            }
            p049fm.b0.h(mVarF2, false, eVar, null, null, mapProperties, null, mapUiSettings, null, lVarF, null, null, null, null, lVarG, null, null, (er.p) objE, y2.m.d(-1058243761, true, new er.p() { // from class: kf3.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.o(data, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, (p049fm.e.f65033i << 6) | 6 | (MapProperties.f65356j << 15) | (MapUiSettings.f65123k << 21), 113246208, 114010);
            f3.m mVarD = xVar.d(companion, companion2.c());
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            f3.m mVarR = a3.r(mVarD, aVar.b(rVar, i16).getSpacing300(), 0.0f, aVar.b(rVar, i16).getSpacing300(), aVar.b(rVar, i16).getSpacing500(), 2, null);
            w0 w0VarA2 = e0.a(iVar.k(), companion2.k(), rVar, 0);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT3 = rVar.t();
            f3.m mVarE3 = f3.j.e(rVar, mVarR);
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
            p076m2.r rVarC3 = n6.c(rVar);
            n6.i(rVarC3, w0VarA2, companion3.d());
            n6.i(rVarC3, e0VarT3, companion3.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion3.c());
            n6.g(rVarC3, companion3.a());
            n6.i(rVarC3, mVarE3, companion3.e());
            f3.m mVarC = i0Var.c(w0.i.d(companion, Color.INSTANCE.g(), null, 2, null), companion2.j());
            w0 w0VarA3 = e0.a(iVar.k(), companion2.k(), rVar, 0);
            int iHashCode4 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT4 = rVar.t();
            f3.m mVarE4 = f3.j.e(rVar, mVarC);
            er.a<androidx.compose.ui.node.c> aVarB4 = companion3.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB4);
            } else {
                rVar.u();
            }
            p076m2.r rVarC4 = n6.c(rVar);
            n6.i(rVarC4, w0VarA3, companion3.d());
            n6.i(rVarC4, e0VarT4, companion3.f());
            n6.i(rVarC4, Integer.valueOf(iHashCode4), companion3.c());
            n6.g(rVarC4, companion3.a());
            n6.i(rVarC4, mVarE4, companion3.e());
            r3.a(q0.c(companion, false, null, 3, null), rVar, 6);
            h30.q.p(data.getNavigationButtonData(), false, null, rVar, 0, 6);
            rVar.x();
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing200()), rVar, 0);
            SelectedAddress selectedAddress = data.getSelectedAddress();
            if (selectedAddress == null) {
                rVar.X(-1343679516);
            } else {
                rVar.X(-1343679515);
                q(selectedAddress, rVar, 0);
                i0 i0Var2 = i0.f148189a;
            }
            rVar.R();
            rVar.x();
            rVar.x();
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
    public static final lh.e n(Context context, GoogleMapOptions googleMapOptions) {
        lh.e eVar = new lh.e(context, googleMapOptions);
        eVar.setFocusable(false);
        eVar.setFocusableInTouchMode(false);
        eVar.setDescendantFocusability(393216);
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(kf3.c.Data data, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1058243761, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.chooselocalizationmap.ChooseLocalizationMapScreenContentLocation.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChooseLocalizationMapScreen.kt:125)");
            }
            LatLng markerCoordinates = data.getMarkerCoordinates();
            if (markerCoordinates == null) {
                rVar.X(-1079892467);
                rVar.R();
            } else {
                rVar.X(-1079892466);
                r4.E(v4.INSTANCE.a(markerCoordinates), null, 0.0f, 0L, false, false, null, 0L, 0.0f, null, null, null, false, 0.0f, null, null, null, null, rVar, v4.f65331f, 0, 262142);
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
    public static final i0 p(kf3.c.Data data, i70.p pVar, int i15, p076m2.r rVar, int i16) {
        l(data, pVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void q(final SelectedAddress selectedAddress, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(581742502);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(selectedAddress) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(581742502, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.chooselocalizationmap.SheetContent (ChooseLocalizationMapScreen.kt:168)");
            }
            x30.c.c(null, 0.0f, y2.m.d(-914353081, true, new er.p() { // from class: kf3.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.r(selectedAddress, (p076m2.r) obj, ((Integer) obj2).intValue());
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
            d5VarM.a(new er.p() { // from class: kf3.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.s(selectedAddress, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(SelectedAddress selectedAddress, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-914353081, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.chooselocalizationmap.SheetContent.<anonymous> (ChooseLocalizationMapScreen.kt:170)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
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
            Label title = selectedAddress.getTitle();
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            j70.h.g(null, null, title, null, null, aVar.a(rVar, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, b5.v.INSTANCE.b(), false, 2, 0, null, aVar.f(rVar, i16).a(), null, null, false, false, null, rVar, 0, 1597440, 0, 32948187);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing100()), rVar, 0);
            j70.h.g(null, null, selectedAddress.getAddressStr(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).d(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing200()), rVar, 0);
            h30.q.p(selectedAddress.getSelectButtonData(), false, null, rVar, 0, 6);
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
    public static final i0 s(SelectedAddress selectedAddress, int i15, p076m2.r rVar, int i16) {
        q(selectedAddress, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
