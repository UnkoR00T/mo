package pb3;

import android.content.Context;
import androidx.compose.ui.platform.u1;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.LatLng;
import er.l;
import er.p;
import f3.m;
import ju.p0;
import ob3.v;
import oq.i0;
import oq.u;
import p049fm.MapProperties;
import p049fm.MapUiSettings;
import p049fm.b0;
import p049fm.r4;
import p049fm.v4;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import rb3.SelectedPlaceData;
import vq.k;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lf3/m;", "modifier", "Lob3/v$a$b$a;", "data", "Loq/i0;", "e", "(Lf3/m;Lob3/v$a$b$a;Lm2/r;II)V", "travelabroad_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class e {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements er.a<p049fm.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f154070a;

        public a(l lVar) {
            this.f154070a = lVar;
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final p049fm.e a() {
            p049fm.e eVarC = p049fm.e.Companion.c(p049fm.e.INSTANCE, null, 1, null);
            this.f154070a.b(eVarC);
            return eVarC;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f154071e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ v.a.Initialized.MapData f154072f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ p049fm.e f154073g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(v.a.Initialized.MapData mapData, p049fm.e eVar, tq.e<? super b> eVar2) {
            super(2, eVar2);
            this.f154072f = mapData;
            this.f154073g = eVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f154071e;
            if (i15 == 0) {
                u.b(obj);
                if (this.f154072f.getIsLoaded()) {
                    SelectedPlaceData selectedPlace = this.f154072f.getSelectedPlace();
                    if ((selectedPlace != null ? selectedPlace.getCoordinates() : null) != null) {
                        p049fm.e eVar = this.f154073g;
                        lh.a aVarB = lh.b.b(this.f154072f.getSelectedPlace().getCoordinates(), 15.0f);
                        this.f154071e = 1;
                        if (eVar.n(aVarB, 1000, this) == objE) {
                            return objE;
                        }
                    }
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
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
            return new b(this.f154072f, this.f154073g, eVar);
        }
    }

    public static final void e(m mVar, final v.a.Initialized.MapData mapData, r rVar, final int i15, final int i16) {
        m mVar2;
        int i17;
        r rVar2;
        final m mVar3;
        r rVarH = rVar.h(-283665752);
        int i18 = i16 & 1;
        if (i18 != 0) {
            i17 = i15 | 6;
            mVar2 = mVar;
        } else if ((i15 & 6) == 0) {
            mVar2 = mVar;
            i17 = (rVarH.W(mVar2) ? 4 : 2) | i15;
        } else {
            mVar2 = mVar;
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.W(mapData) ? 32 : 16;
        }
        if (rVarH.r((i17 & 19) != 18, i17 & 1)) {
            m mVar4 = i18 != 0 ? m.INSTANCE : mVar2;
            if (t.k()) {
                t.o(-283665752, i17, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.trip.map.components.MapComponent (MapComponent.kt:25)");
            }
            p049fm.e eVar = (p049fm.e) b3.f.i(new Object[0], p049fm.e.INSTANCE.a(), new a(new l() { // from class: pb3.a
                @Override // er.l
                public final Object b(Object obj) {
                    return e.f(mapData, (p049fm.e) obj);
                }
            }), rVarH, 0);
            if (((Boolean) rVarH.N(u1.a())).booleanValue()) {
                rVarH.X(1808284250);
            } else {
                rVarH.X(1809489313);
                Boolean boolValueOf = Boolean.valueOf(mapData.getIsLoaded());
                SelectedPlaceData selectedPlace = mapData.getSelectedPlace();
                LatLng coordinates = selectedPlace != null ? selectedPlace.getCoordinates() : null;
                boolean zG = ((i17 & 112) == 32) | rVarH.G(eVar);
                Object objE = rVarH.E();
                if (zG || objE == r.INSTANCE.a()) {
                    objE = new b(mapData, eVar, null);
                    rVarH.v(objE);
                }
                Function0.e(boolValueOf, coordinates, (p) objE, rVarH, 0);
            }
            rVarH.R();
            Object objE2 = rVarH.E();
            r.Companion companion = r.INSTANCE;
            if (objE2 == companion.a()) {
                MapUiSettings mapUiSettings = new MapUiSettings(false, false, false, false, false, false, false, false, false, false, 754, null);
                rVarH.v(mapUiSettings);
                objE2 = mapUiSettings;
            }
            MapUiSettings mapUiSettings2 = (MapUiSettings) objE2;
            Object objE3 = rVarH.E();
            if (objE3 == companion.a()) {
                MapProperties mapProperties = new MapProperties(false, false, false, false, null, null, null, 0.0f, 0.0f, 511, null);
                rVarH.v(mapProperties);
                objE3 = mapProperties;
            }
            MapProperties mapProperties2 = (MapProperties) objE3;
            l<LatLng, i0> lVarB = mapData.b();
            er.a<i0> aVarC = mapData.c();
            Object objE4 = rVarH.E();
            if (objE4 == companion.a()) {
                objE4 = new p() { // from class: pb3.b
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return e.g((Context) obj, (GoogleMapOptions) obj2);
                    }
                };
                rVarH.v(objE4);
            }
            rVar2 = rVarH;
            mVar3 = mVar4;
            b0.h(mVar3, true, eVar, null, null, mapProperties2, null, mapUiSettings2, null, lVarB, null, aVarC, null, null, null, null, null, (p) objE4, y2.m.d(2061034255, true, new p() { // from class: pb3.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return e.h(mapData, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVar2, (i17 & 14) | 48 | (p049fm.e.f65033i << 6) | (MapProperties.f65356j << 15) | (MapUiSettings.f65123k << 21), 113246208, 128344);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
            mVar3 = mVar2;
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: pb3.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return e.i(mVar3, mapData, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(v.a.Initialized.MapData mapData, p049fm.e eVar) {
        eVar.E(mapData.getInitialCameraPosition());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lh.e g(Context context, GoogleMapOptions googleMapOptions) {
        lh.e eVar = new lh.e(context, googleMapOptions);
        eVar.setFocusable(false);
        eVar.setFocusableInTouchMode(false);
        eVar.setDescendantFocusability(393216);
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(v.a.Initialized.MapData mapData, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(2061034255, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.trip.map.components.MapComponent.<anonymous> (MapComponent.kt:66)");
            }
            SelectedPlaceData selectedPlace = mapData.getSelectedPlace();
            LatLng coordinates = selectedPlace != null ? selectedPlace.getCoordinates() : null;
            if (coordinates == null) {
                rVar.X(-580928828);
                rVar.R();
            } else {
                rVar.X(-580928827);
                boolean zW = rVar.W(coordinates);
                Object objE = rVar.E();
                if (zW || objE == r.INSTANCE.a()) {
                    objE = v4.INSTANCE.a(coordinates);
                    rVar.v(objE);
                }
                r4.E((v4) objE, null, 0.0f, 0L, false, false, null, 0L, 0.0f, null, null, null, false, 0.0f, null, null, null, null, rVar, v4.f65331f, 0, 262142);
                rVar.R();
            }
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(m mVar, v.a.Initialized.MapData mapData, int i15, int i16, r rVar, int i17) {
        e(mVar, mapData, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }
}
