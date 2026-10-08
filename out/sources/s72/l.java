package s72;

import android.content.Context;
import androidx.compose.ui.graphics.Color;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import d1.a3;
import d1.d3;
import d72.HydroArea;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ju.d2;
import ju.p0;
import oq.i0;
import p036e4.w0;
import p049fm.MapProperties;
import p049fm.MapUiSettings;
import p049fm.m5;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.e0;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.x5;
import p088nul.q0;
import vy.Coordinates;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001aI\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\"\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Ls72/c;", "viewModel", "", "testMode", "Loq/i0;", "i", "(Ls72/c;ZLm2/r;II)V", "Ls72/c$a;", "data", "n", "(Ls72/c$a;Lm2/r;I)V", "", "Landroidx/compose/ui/graphics/Color;", "v", "(ILm2/r;I)J", "Lju/p0;", "coroutineScope", "Lfm/e;", "cameraPositionState", "Lvy/c;", "mapCoordinates", "", "zoom", "cameraAnimationDurationMs", "Lkotlin/Function0;", "animationFinished", "Lju/d2;", "t", "(Lju/p0;Lfm/e;Lvy/c;FILer/a;)Lju/d2;", "Lcom/google/android/gms/maps/model/LatLng;", "a", "Lcom/google/android/gms/maps/model/LatLng;", "COORDINATE_LODZ_LAT_LNG", "floodalert_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final LatLng f178764a = new LatLng(51.759445d, 19.457216d);

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements er.a<p049fm.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ er.l f178765a;

        public a(er.l lVar) {
            this.f178765a = lVar;
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final p049fm.e a() {
            p049fm.e eVarC = p049fm.e.Companion.c(p049fm.e.INSTANCE, null, 1, null);
            this.f178765a.b(eVarC);
            return eVarC;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f178766a;

        static {
            int[] iArr = new int[androidx.lifecycle.j.a.values().length];
            try {
                iArr[androidx.lifecycle.j.a.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.lifecycle.j.a.ON_PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f178766a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f178767e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f178768f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f178769g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f178770h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Coordinates f178771j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ p049fm.e f178772k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ float f178773l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f178774m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ er.a<i0> f178775n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Coordinates coordinates, p049fm.e eVar, float f15, int i15, er.a<i0> aVar, tq.e<? super c> eVar2) {
            super(2, eVar2);
            this.f178771j = coordinates;
            this.f178772k = eVar;
            this.f178773l = f15;
            this.f178774m = i15;
            this.f178775n = aVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            er.a<i0> aVar;
            Object objE = uq.b.e();
            int i15 = this.f178770h;
            if (i15 == 0) {
                oq.u.b(obj);
                Coordinates coordinates = this.f178771j;
                if (coordinates != null) {
                    p049fm.e eVar = this.f178772k;
                    float f15 = this.f178773l;
                    int i16 = this.f178774m;
                    er.a<i0> aVar2 = this.f178775n;
                    lh.a aVarA = lh.b.a(CameraPosition.h(new LatLng(coordinates.getLatitude(), coordinates.getLongitude()), f15));
                    this.f178767e = aVar2;
                    this.f178768f = vq.j.a(coordinates);
                    this.f178769g = 0;
                    this.f178770h = 1;
                    if (eVar.n(aVarA, i16, this) == objE) {
                        return objE;
                    }
                    aVar = aVar2;
                }
                return i0.f148189a;
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (er.a) this.f178767e;
            oq.u.b(obj);
            aVar.a();
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((c) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new c(this.f178771j, this.f178772k, this.f178773l, this.f178774m, this.f178775n, eVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    /* JADX WARN: Code duplicated, block: B:40:0x0086  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    public static final void i(final s72.c cVar, boolean z15, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        final boolean z16;
        boolean z17;
        d5 d5VarM;
        final boolean z18;
        final f6 f6VarC;
        boolean zW;
        Object objE;
        p076m2.r rVarH = rVar.h(-1658919539);
        if ((i15 & 6) == 0) {
            i17 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i18 = i16 & 2;
        if (i18 == 0) {
            if ((i15 & 48) == 0) {
                z16 = z15;
                i17 |= rVarH.a(z16) ? 32 : 16;
            }
            if ((i17 & 19) != 18) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i17 & 1)) {
                if (i18 != 0) {
                    z18 = false;
                } else {
                    z18 = z16;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(-1658919539, i17, -1, "pl.gov.coi.mobywatel.feature.floodalert.presentation.map.FloodAlertMapScreen (FloodAlertMapScreen.kt:40)");
                }
                f6VarC = m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7);
                zW = rVarH.W(f6VarC);
                objE = rVarH.E();
                if (zW || objE == p076m2.r.INSTANCE.a()) {
                    objE = new er.p() { // from class: s72.d
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l.k(f6VarC, (androidx.p016lifecycle.q) obj, (androidx.lifecycle.j.a) obj2);
                        }
                    };
                    rVarH.v(objE);
                }
                t70.s.j((er.p) objE, rVarH, 0);
                boolean z19 = z18;
                i50.s.r(j(f6VarC).getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(462055354, true, new er.q() { // from class: s72.e
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return l.l(z18, f6VarC, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
                rVarH = rVarH;
                q0.g(false, j(f6VarC).d(), rVarH, 0, 1);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                z16 = z19;
            } else {
                rVarH.O();
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: s72.f
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return l.m(cVar, z16, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 48;
        z16 = z15;
        if ((i17 & 19) != 18) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (rVarH.r(z17, i17 & 1)) {
            if (i18 != 0) {
                z18 = false;
            } else {
                z18 = z16;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(-1658919539, i17, -1, "pl.gov.coi.mobywatel.feature.floodalert.presentation.map.FloodAlertMapScreen (FloodAlertMapScreen.kt:40)");
            }
            f6VarC = m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7);
            zW = rVarH.W(f6VarC);
            objE = rVarH.E();
            if (zW) {
                objE = new er.p() { // from class: s72.d
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return l.k(f6VarC, (androidx.p016lifecycle.q) obj, (androidx.lifecycle.j.a) obj2);
                    }
                };
                rVarH.v(objE);
            } else {
                objE = new er.p() { // from class: s72.d
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return l.k(f6VarC, (androidx.p016lifecycle.q) obj, (androidx.lifecycle.j.a) obj2);
                    }
                };
                rVarH.v(objE);
            }
            t70.s.j((er.p) objE, rVarH, 0);
            boolean z110 = z18;
            i50.s.r(j(f6VarC).getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(462055354, true, new er.q() { // from class: s72.e
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return l.l(z18, f6VarC, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
            rVarH = rVarH;
            q0.g(false, j(f6VarC).d(), rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            z16 = z110;
        } else {
            rVarH.O();
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: s72.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.m(cVar, z16, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final s72.c.Data j(f6<s72.c.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(f6 f6Var, androidx.p016lifecycle.q qVar, androidx.lifecycle.j.a aVar) {
        int i15 = b.f178766a[aVar.ordinal()];
        if (i15 == 1) {
            j(f6Var).f().a();
        } else if (i15 == 2) {
            j(f6Var).e().a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(boolean z15, f6 f6Var, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(462055354, i15, -1, "pl.gov.coi.mobywatel.feature.floodalert.presentation.map.FloodAlertMapScreen.<anonymous> (FloodAlertMapScreen.kt:53)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarL = a3.l(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), d3Var);
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarI = d1.r.i(companion2.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarL);
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
            n6.i(rVarC, w0VarI, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.x xVar = d1.x.f39368a;
            if (z15) {
                rVar.X(-368179550);
            } else {
                rVar.X(-365933445);
                n(j(f6Var), rVar, 0);
            }
            rVar.R();
            f3.m mVarH = androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            f3.m mVarO = a3.o(mVarH, aVar.b(rVar, i16).getSpacing200(), aVar.b(rVar, i16).getSpacing100());
            w0 w0VarI2 = d1.r.i(companion2.o(), false);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarO);
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
            n6.i(rVarC2, w0VarI2, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            c30.e.c(null, j(f6Var).getInfoAlert(), rVar, c30.b.f22944i << 3, 1);
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
    public static final i0 m(s72.c cVar, boolean z15, int i15, int i16, p076m2.r rVar, int i17) {
        i(cVar, z15, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    public static final void n(final s72.c.Data data, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-1748770717);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1748770717, i16, -1, "pl.gov.coi.mobywatel.feature.floodalert.presentation.map.NewGoogleMapContent (FloodAlertMapScreen.kt:83)");
            }
            Object objE = rVarH.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = Function0.i(tq.j.f191408a, rVarH);
                rVarH.v(objE);
            }
            final p0 p0Var = (p0) objE;
            final p049fm.e eVar = (p049fm.e) b3.f.i(new Object[0], p049fm.e.INSTANCE.a(), new a(new er.l() { // from class: s72.g
                @Override // er.l
                public final Object b(Object obj) {
                    return l.o((p049fm.e) obj);
                }
            }), rVarH, 0);
            final f6 f6VarP = x5.p(data.getMapViewCoordinates(), rVarH, Coordinates.f208679c);
            MapProperties mapProperties = new MapProperties(false, false, data.getIsMyLocationEnabled(), false, null, null, null, 0.0f, 0.0f, 507, null);
            MapUiSettings mapUiSettings = new MapUiSettings(false, false, false, false, false, false, false, false, false, false, 755, null);
            Object objE2 = rVarH.E();
            if (objE2 == companion.a()) {
                objE2 = new er.p() { // from class: s72.h
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return l.p((Context) obj, (GoogleMapOptions) obj2);
                    }
                };
                rVarH.v(objE2);
            }
            rVar2 = rVarH;
            p049fm.b0.h(null, false, eVar, null, null, mapProperties, null, mapUiSettings, null, null, null, null, null, null, null, null, null, (er.p) objE2, y2.m.d(467195594, true, new er.p() { // from class: s72.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.q(p0Var, eVar, f6VarP, data, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVar2, (p049fm.e.f65033i << 6) | (MapProperties.f65356j << 15) | (MapUiSettings.f65123k << 21), 113246208, 130907);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: s72.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.s(data, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(p049fm.e eVar) {
        eVar.E(CameraPosition.h(f178764a, 5.5f));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lh.e p(Context context, GoogleMapOptions googleMapOptions) {
        lh.e eVar = new lh.e(context, googleMapOptions);
        eVar.setFocusable(false);
        eVar.setFocusableInTouchMode(false);
        eVar.setDescendantFocusability(393216);
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(p0 p0Var, p049fm.e eVar, f6 f6Var, s72.c.Data data, p076m2.r rVar, int i15) {
        p076m2.r rVar2 = rVar;
        int i16 = 0;
        if (rVar2.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(467195594, i15, -1, "pl.gov.coi.mobywatel.feature.floodalert.presentation.map.NewGoogleMapContent.<anonymous> (FloodAlertMapScreen.kt:110)");
            }
            Coordinates coordinates = (Coordinates) f6Var.getValue();
            Object objE = rVar2.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: s72.k
                    @Override // er.a
                    public final Object a() {
                        return l.r();
                    }
                };
                rVar2.v(objE);
            }
            u(p0Var, eVar, coordinates, 10.0f, 0, (er.a) objE, 16, null);
            List<List<List<HydroArea>>> listA = data.a();
            int i17 = 10;
            ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                List list = (List) it.next();
                rVar2.X(-1996590662);
                List<List> list2 = list;
                ArrayList arrayList2 = new ArrayList(pq.v.y(list2, i17));
                for (List list3 : list2) {
                    rVar2.X(-1996589833);
                    List<HydroArea> list4 = list3;
                    ArrayList arrayList3 = new ArrayList(pq.v.y(list4, i17));
                    for (HydroArea hydroArea : list4) {
                        ArrayList arrayList4 = arrayList3;
                        m5.p(hydroArea.c(), false, Color.m9copywmQWz5c$default(v(hydroArea.getColor(), rVar2, i16), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), false, hydroArea.b(), v(hydroArea.getColor(), rVar2, i16), 0, null, 1.0f, null, false, 0.0f, null, rVar2, 100663296, 0, 7882);
                        arrayList4.add(i0.f148189a);
                        rVar2 = rVar;
                        arrayList3 = arrayList4;
                        i16 = i16;
                        i17 = i17;
                        arrayList = arrayList;
                        arrayList2 = arrayList2;
                    }
                    ArrayList arrayList5 = arrayList2;
                    rVar.R();
                    arrayList5.add(arrayList3);
                    rVar2 = rVar;
                    arrayList2 = arrayList5;
                }
                ArrayList arrayList6 = arrayList;
                rVar.R();
                arrayList6.add(arrayList2);
                rVar2 = rVar;
                arrayList = arrayList6;
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
    public static final i0 r() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(s72.c.Data data, int i15, p076m2.r rVar, int i16) {
        n(data, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final d2 t(p0 p0Var, p049fm.e eVar, Coordinates coordinates, float f15, int i15, er.a<i0> aVar) {
        return ju.k.d(p0Var, null, null, new c(coordinates, eVar, f15, i15, aVar, null), 3, null);
    }

    static /* synthetic */ d2 u(p0 p0Var, p049fm.e eVar, Coordinates coordinates, float f15, int i15, er.a aVar, int i16, Object obj) {
        if ((i16 & 16) != 0) {
            i15 = 500;
        }
        return t(p0Var, eVar, coordinates, f15, i15, aVar);
    }

    public static final long v(int i15, p076m2.r rVar, int i16) {
        long j15;
        if (p076m2.t.k()) {
            p076m2.t.o(-1251712973, i16, -1, "pl.gov.coi.mobywatel.feature.floodalert.presentation.map.toHydroAlertColor (FloodAlertMapScreen.kt:138)");
        }
        if (i15 == 1) {
            rVar.X(-305321634);
            j15 = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().j();
            rVar.R();
        } else if (i15 == 2) {
            rVar.X(-305320191);
            j15 = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().f();
            rVar.R();
        } else if (i15 != 3) {
            rVar.X(-305317091);
            j15 = k70.a.f108864a.a(rVar, k70.a.f108865b).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b();
            rVar.R();
        } else {
            rVar.X(-305318657);
            j15 = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().g();
            rVar.R();
        }
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return j15;
    }
}
