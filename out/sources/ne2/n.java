package ne2;

import android.content.Context;
import androidx.compose.ui.graphics.Color;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import d1.a3;
import d1.d3;
import d1.r3;
import i50.BaseScaffoldData;
import ju.p0;
import mx.Label;
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
import p088nul.q0;
import pe2.SelectedAddress;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Lne2/e;", "viewModel", "", "testMode", "Loq/i0;", "h", "(Lne2/e;ZLm2/r;II)V", "Lne2/e$a;", "data", "Li70/p;", "snackBarState", "l", "(Lne2/e$a;Li70/p;ZLm2/r;I)V", "Lpe2/a;", "selectedAddress", "q", "(Lpe2/a;Lm2/r;I)V", "incidentreport_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class n {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f135167e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ e.Data f135168f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ p049fm.e f135169g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(e.Data data, p049fm.e eVar, tq.e<? super a> eVar2) {
            super(2, eVar2);
            this.f135168f = data;
            this.f135169g = eVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f135167e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (this.f135168f.getCameraPosition() != null) {
                this.f135169g.E(CameraPosition.h(this.f135168f.getCameraPosition(), this.f135168f.getZoomMap()));
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f135168f, this.f135169g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f135170e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ p049fm.e f135171f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ e.Data f135172g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p049fm.e eVar, e.Data data, tq.e<? super b> eVar2) {
            super(2, eVar2);
            this.f135171f = eVar;
            this.f135172g = data;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f135170e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (this.f135171f.v() && this.f135171f.p() == p049fm.a.GESTURE) {
                this.f135172g.g().a();
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
            return new b(this.f135171f, this.f135172g, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c implements er.a<p049fm.e> {
        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final p049fm.e a() {
            return p049fm.e.Companion.c(p049fm.e.INSTANCE, null, 1, null);
        }
    }

    public static final void h(final e eVar, final boolean z15, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        p076m2.r rVarH = rVar.h(229717836);
        if ((i15 & 6) == 0) {
            i17 = ((i15 & 8) == 0 ? rVarH.W(eVar) : rVarH.G(eVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i18 = i16 & 2;
        if (i18 != 0) {
            i17 |= 48;
        } else if ((i15 & 48) == 0) {
            i17 |= rVarH.a(z15) ? 32 : 16;
        }
        if (rVarH.r((i17 & 19) != 18, i17 & 1)) {
            if (i18 != 0) {
                z15 = false;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(229717836, i17, -1, "pl.gov.coi.mobywatel.feature.incidentreport.presentation.newincident.localization.IncidentLocalizationScreen (IncidentLocalizationScreen.kt:49)");
            }
            f6 f6VarC = m7.b.c(eVar.getState(), null, null, null, rVarH, 0, 7);
            f6 f6VarB = m7.b.b(eVar.j(), i70.p.a.f89857a, null, null, null, rVarH, i70.p.a.f89858b << 3, 14);
            rVarH = rVarH;
            l(i(f6VarC), j(f6VarB), z15, rVarH, (i17 << 3) & 896);
            q0.g(false, i(f6VarC).f(), rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ne2.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.k(eVar, z15, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final e.Data i(f6<e.Data> f6Var) {
        return f6Var.getValue();
    }

    private static final i70.p j(f6<? extends i70.p> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(e eVar, boolean z15, int i15, int i16, p076m2.r rVar, int i17) {
        h(eVar, z15, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    public static final void l(final e.Data data, final i70.p pVar, final boolean z15, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(563131561);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.a(z15) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(563131561, i16, -1, "pl.gov.coi.mobywatel.feature.incidentreport.presentation.newincident.localization.IncidentLocalizationScreenContent (IncidentLocalizationScreen.kt:69)");
            }
            cb4.i dialogVMS = data.getDialogVMS();
            if (dialogVMS == null) {
                rVarH.X(110233552);
            } else {
                rVarH.X(3555921);
                dialogVMS.b(rVarH, 0);
            }
            rVarH.R();
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new al();
                rVarH.v(objE);
            }
            i70.m.d((al) objE, pVar, data.j(), null, null, rVarH, (i16 & 112) | 6, 24);
            i50.s.r(data.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1399292892, true, new er.q() { // from class: ne2.h
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return n.m(z15, data, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: ne2.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.p(data, pVar, z15, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final i0 m(boolean z15, final e.Data data, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        d1.i0 i0Var;
        f3.m.Companion companion;
        d1.x xVar;
        p076m2.r rVar2 = rVar;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar2.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar2.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1399292892, i16, -1, "pl.gov.coi.mobywatel.feature.incidentreport.presentation.newincident.localization.IncidentLocalizationScreenContent.<anonymous> (IncidentLocalizationScreen.kt:82)");
            }
            f3.m.Companion companion2 = f3.m.INSTANCE;
            f3.m mVarL = a3.l(companion2, d3Var);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion3 = f3.c.INSTANCE;
            w0 w0VarA = d1.e0.a(nVarK, companion3.k(), rVar2, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar2, 0));
            p076m2.e0 e0VarT = rVar2.t();
            f3.m mVarE = f3.j.e(rVar2, mVarL);
            androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion4.b();
            if (rVar2.l() == null) {
                p076m2.m.d();
            }
            rVar2.K();
            if (rVar2.getInserting()) {
                rVar2.H(aVarB);
            } else {
                rVar2.u();
            }
            p076m2.r rVarC = n6.c(rVar2);
            n6.i(rVarC, w0VarA, companion4.d());
            n6.i(rVarC, e0VarT, companion4.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion4.c());
            n6.g(rVarC, companion4.a());
            n6.i(rVarC, mVarE, companion4.e());
            d1.i0 i0Var2 = d1.i0.f39176a;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(companion2, 0.0f, 1, null);
            w0 w0VarI = d1.r.i(companion3.o(), false);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar2, 0));
            p076m2.e0 e0VarT2 = rVar2.t();
            f3.m mVarE2 = f3.j.e(rVar2, mVarF);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion4.b();
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
            n6.i(rVarC2, w0VarI, companion4.d());
            n6.i(rVarC2, e0VarT2, companion4.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion4.c());
            n6.g(rVarC2, companion4.a());
            n6.i(rVarC2, mVarE2, companion4.e());
            d1.x xVar2 = d1.x.f39368a;
            if (z15) {
                i0Var = i0Var2;
                companion = companion2;
                xVar = xVar2;
                rVar2.X(1041887650);
            } else {
                rVar2.X(1045280042);
                p049fm.e eVar = (p049fm.e) b3.f.i(new Object[0], p049fm.e.INSTANCE.a(), new c(), rVar2, 0);
                LatLng cameraPosition = data.getCameraPosition();
                boolean zG = rVar2.G(data) | rVar2.G(eVar);
                Object objE = rVar2.E();
                if (zG || objE == p076m2.r.INSTANCE.a()) {
                    objE = new a(data, eVar, null);
                    rVar2.v(objE);
                }
                Function0.d(cameraPosition, (er.p) objE, rVar2, 0);
                Boolean boolValueOf = Boolean.valueOf(eVar.v());
                boolean zG2 = rVar2.G(eVar) | rVar2.G(data);
                Object objE2 = rVar2.E();
                if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
                    objE2 = new b(eVar, data, null);
                    rVar2.v(objE2);
                }
                Function0.d(boolValueOf, (er.p) objE2, rVar2, 0);
                MapProperties mapProperties = new MapProperties(false, false, data.getShowMyLocalization(), false, null, null, null, 0.0f, 0.0f, 507, null);
                Object objE3 = rVar2.E();
                p076m2.r.Companion companion5 = p076m2.r.INSTANCE;
                if (objE3 == companion5.a()) {
                    objE3 = new MapUiSettings(false, false, false, false, false, false, false, false, false, false, 759, null);
                    rVar2.v(objE3);
                }
                MapUiSettings mapUiSettings = (MapUiSettings) objE3;
                f3.m mVarF2 = androidx.compose.foundation.layout.d.f(companion2, 0.0f, 1, null);
                er.l<LatLng, i0> lVarH = data.h();
                er.l<nh.k, i0> lVarI = data.i();
                Object objE4 = rVar2.E();
                if (objE4 == companion5.a()) {
                    objE4 = new er.p() { // from class: ne2.j
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return n.n((Context) obj, (GoogleMapOptions) obj2);
                        }
                    };
                    rVar2.v(objE4);
                }
                companion = companion2;
                i0Var = i0Var2;
                xVar = xVar2;
                p049fm.b0.h(mVarF2, false, eVar, null, null, mapProperties, null, mapUiSettings, null, lVarH, null, null, null, null, lVarI, null, null, (er.p) objE4, y2.m.d(-506426612, true, new er.p() { // from class: ne2.k
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return n.o(data, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                }, rVar2, 54), rVar, (p049fm.e.f65033i << 6) | 6 | (MapProperties.f65356j << 15) | (MapUiSettings.f65123k << 21), 113246208, 114010);
                rVar2 = rVar;
            }
            rVar2.R();
            f3.m mVarD = xVar.d(companion, companion3.c());
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarR = a3.r(mVarD, aVar.b(rVar2, i17).getSpacing200(), 0.0f, aVar.b(rVar2, i17).getSpacing200(), aVar.b(rVar2, i17).getSpacing500(), 2, null);
            w0 w0VarA2 = d1.e0.a(iVar.k(), companion3.k(), rVar2, 0);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVar2, 0));
            p076m2.e0 e0VarT3 = rVar2.t();
            f3.m mVarE3 = f3.j.e(rVar2, mVarR);
            er.a<androidx.compose.ui.node.c> aVarB3 = companion4.b();
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
            n6.i(rVarC3, w0VarA2, companion4.d());
            n6.i(rVarC3, e0VarT3, companion4.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion4.c());
            n6.g(rVarC3, companion4.a());
            n6.i(rVarC3, mVarE3, companion4.e());
            f3.m.Companion companion6 = companion;
            f3.m mVarC = i0Var.c(w0.i.d(companion6, Color.INSTANCE.g(), null, 2, null), companion3.j());
            w0 w0VarA3 = d1.e0.a(iVar.k(), companion3.k(), rVar2, 0);
            int iHashCode4 = Long.hashCode(p076m2.m.b(rVar2, 0));
            p076m2.e0 e0VarT4 = rVar2.t();
            f3.m mVarE4 = f3.j.e(rVar2, mVarC);
            er.a<androidx.compose.ui.node.c> aVarB4 = companion4.b();
            if (rVar2.l() == null) {
                p076m2.m.d();
            }
            rVar2.K();
            if (rVar2.getInserting()) {
                rVar2.H(aVarB4);
            } else {
                rVar2.u();
            }
            p076m2.r rVarC4 = n6.c(rVar2);
            n6.i(rVarC4, w0VarA3, companion4.d());
            n6.i(rVarC4, e0VarT4, companion4.f());
            n6.i(rVarC4, Integer.valueOf(iHashCode4), companion4.c());
            n6.g(rVarC4, companion4.a());
            n6.i(rVarC4, mVarE4, companion4.e());
            r3.a(w0.q0.c(companion6, false, null, 3, null), rVar2, 6);
            h30.q.p(data.getNavigationButtonData(), false, null, rVar2, 0, 6);
            rVar2.x();
            r3.a(androidx.compose.foundation.layout.d.i(companion6, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
            SelectedAddress selectedAddress = data.getSelectedAddress();
            if (selectedAddress == null) {
                rVar2.X(1833568108);
            } else {
                rVar2.X(1833568109);
                q(selectedAddress, rVar2, 0);
                i0 i0Var3 = i0.f148189a;
            }
            rVar2.R();
            rVar2.x();
            rVar2.x();
            rVar2.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2.O();
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
    public static final i0 o(e.Data data, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-506426612, i15, -1, "pl.gov.coi.mobywatel.feature.incidentreport.presentation.newincident.localization.IncidentLocalizationScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IncidentLocalizationScreen.kt:134)");
            }
            LatLng markerCoordinates = data.getMarkerCoordinates();
            if (markerCoordinates == null) {
                rVar.X(1264953832);
                rVar.R();
            } else {
                rVar.X(1264953833);
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
    public static final i0 p(e.Data data, i70.p pVar, boolean z15, int i15, p076m2.r rVar, int i16) {
        l(data, pVar, z15, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void q(final SelectedAddress selectedAddress, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1501064120);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(selectedAddress) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1501064120, i16, -1, "pl.gov.coi.mobywatel.feature.incidentreport.presentation.newincident.localization.SheetContent (IncidentLocalizationScreen.kt:178)");
            }
            x30.c.c(null, 0.0f, y2.m.d(1116826887, true, new er.p() { // from class: ne2.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.r(selectedAddress, (p076m2.r) obj, ((Integer) obj2).intValue());
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
            d5VarM.a(new er.p() { // from class: ne2.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.s(selectedAddress, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(SelectedAddress selectedAddress, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1116826887, i15, -1, "pl.gov.coi.mobywatel.feature.incidentreport.presentation.newincident.localization.SheetContent.<anonymous> (IncidentLocalizationScreen.kt:180)");
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
            Label title = selectedAddress.getTitle();
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            j70.h.g(null, null, title, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, b5.v.INSTANCE.b(), false, 0, 0, null, aVar.f(rVar, i16).a(), null, null, false, false, null, rVar, 0, 24576, 0, 33013755);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing50()), rVar, 0);
            j70.h.g(null, null, selectedAddress.getAddressCords(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).d(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
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
