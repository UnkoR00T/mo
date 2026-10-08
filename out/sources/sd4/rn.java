package sd4;

import android.net.Uri;
import android.os.Bundle;
import java.time.LocalDate;
import p071kotlin.Metadata;
import pj3.VehicleIdentificationPayload;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lsd4/rn;", "Lj00/b;", "<init>", "()V", "Lf00/s;", "destinationNavigator", "Loq/i0;", "g2", "(Lf00/s;)V", "Landroid/os/Bundle;", "savedInstanceState", "x0", "(Landroid/os/Bundle;)V", "S1", "(Lm2/r;I)V", "Lrh2/a;", "L0", "Lrh2/a;", "f2", "()Lrh2/a;", "setFragmentNavigator", "(Lrh2/a;)V", "fragmentNavigator", "Landroid/net/Uri;", "M0", "Landroid/net/Uri;", "deeplink", "Lpj3/a;", "N0", "Lpj3/a;", "vehicleIdentificationData", "O0", "a", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class rn extends cb {

    /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int P0 = 8;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    public rh2.a fragmentNavigator;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    private Uri deeplink;

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    private VehicleIdentificationPayload vehicleIdentificationData;

    /* JADX INFO: renamed from: sd4.rn$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011¨\u0006\u0017"}, d2 = {"Lsd4/rn$a;", "", "<init>", "()V", "Landroid/net/Uri;", "deeplink", "", "vin", "plate", "", "skipForm", "Ljava/time/LocalDate;", "firstRegistrationDate", "Lsd4/rn;", "a", "(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/time/LocalDate;)Lsd4/rn;", "KEY_DEEP_LINK", "Ljava/lang/String;", "VEHICLE_HISTORY_FRAGMENT", "KEY_VIN", "KEY_PLATE", "KEY_SKIP_FORM", "KEY_FIRST_REGISTRATION_DATE", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public static /* synthetic */ rn b(Companion companion, Uri uri, String str, String str2, Boolean bool, LocalDate localDate, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                uri = null;
            }
            return companion.a(uri, str, str2, bool, localDate);
        }

        public final rn a(Uri deeplink, String vin, String plate, Boolean skipForm, LocalDate firstRegistrationDate) {
            rn rnVar = new rn();
            Bundle bundle = new Bundle();
            if (deeplink != null) {
                bundle.putParcelable("deepLinkUri", deeplink);
            }
            if (vin != null) {
                bundle.putString("VIN_VEHICLE_HISTORY", vin);
            }
            if (plate != null) {
                bundle.putString("PLATE_VEHICLE_HISTORY", plate);
            }
            if (skipForm != null) {
                bundle.putBoolean("SKIP_FORM_VEHICLE_HISTORY", skipForm.booleanValue());
            }
            if (firstRegistrationDate != null) {
                bundle.putLong("KEY_FIRST_REGISTRATION_DATE", firstRegistrationDate.toEpochDay());
            }
            rnVar.F1(bundle);
            return rnVar;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class b extends fr.q implements er.l<f00.s, oq.i0> {
        b(Object obj) {
            super(1, obj, rn.class, "onNavGraphReady", "onNavGraphReady(Lpl/gov/coi/common/navigation/DestinationNavigator;)V", 0);
        }

        public final void E(f00.s sVar) {
            ((rn) this.f66391b).g2(sVar);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(f00.s sVar) {
            E(sVar);
            return oq.i0.f148189a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 b2(dj3.a aVar, final rn rnVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1706094434, i15, -1, "pl.gov.mc.fringers.mobywatel.view.fragment.feature.VehicleHistoryFeatureFragment.GetContent.<anonymous> (VehicleHistoryFeatureFragment.kt:64)");
            }
            boolean zG = rVar.G(rnVar);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new b(rnVar);
                rVar.v(objE);
            }
            er.l lVar = (er.l) ((mr.g) objE);
            boolean zG2 = rVar.G(rnVar);
            Object objE2 = rVar.E();
            if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = new er.a() { // from class: sd4.qn
                    @Override // er.a
                    public final Object a() {
                        return rn.c2(this.f180826a);
                    }
                };
                rVar.v(objE2);
            }
            ej3.d1.I(aVar, lVar, (er.a) objE2, rnVar.vehicleIdentificationData, rVar, VehicleIdentificationPayload.f158028e << 9);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c2(rn rnVar) {
        rnVar.f2().c("VehicleHistoryFragment");
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d2(rn rnVar, int i15, p076m2.r rVar, int i16) {
        rnVar.S1(rVar, p076m2.g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g2(f00.s destinationNavigator) {
        Uri uri = this.deeplink;
        if (uri != null) {
            destinationNavigator.getNavController().F(uri);
        }
    }

    @Override // j00.b
    public void S1(p076m2.r rVar, final int i15) {
        int i16;
        Object obj;
        p076m2.r rVarH = rVar.h(-123531250);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(this) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-123531250, i16, -1, "pl.gov.mc.fringers.mobywatel.view.fragment.feature.VehicleHistoryFeatureFragment.GetContent (VehicleHistoryFeatureFragment.kt:55)");
            }
            boolean zA = w0.h0.a(rVarH, 0);
            boolean zA2 = rVarH.a(zA);
            Object objE = rVarH.E();
            if (zA2 || objE == p076m2.r.INSTANCE.a()) {
                if (zA) {
                    obj = dj3.d.f42907a;
                } else {
                    if (zA) {
                        throw new oq.p();
                    }
                    obj = dj3.e.f42909a;
                }
                objE = obj;
                rVarH.v(objE);
            }
            final dj3.a aVar = (dj3.a) objE;
            mc4.d.d(false, y2.m.d(1706094434, true, new er.p() { // from class: sd4.on
                @Override // er.p
                public final Object B(Object obj2, Object obj3) {
                    return rn.b2(aVar, this, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, 48, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        p076m2.d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: sd4.pn
                @Override // er.p
                public final Object B(Object obj2, Object obj3) {
                    return rn.d2(this.f180804a, i15, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    public final rh2.a f2() {
        rh2.a aVar = this.fragmentNavigator;
        if (aVar != null) {
            return aVar;
        }
        return null;
    }

    @Override // androidx.fragment.app.o
    public void x0(Bundle savedInstanceState) {
        super.x0(savedInstanceState);
        Bundle bundleV = v();
        LocalDate localDateOfEpochDay = null;
        this.deeplink = bundleV != null ? (Uri) bundleV.getParcelable("deepLinkUri") : null;
        Bundle bundleV2 = v();
        String string = bundleV2 != null ? bundleV2.getString("VIN_VEHICLE_HISTORY") : null;
        Bundle bundleV3 = v();
        String string2 = bundleV3 != null ? bundleV3.getString("PLATE_VEHICLE_HISTORY") : null;
        Bundle bundleV4 = v();
        Boolean boolValueOf = bundleV4 != null ? Boolean.valueOf(bundleV4.getBoolean("SKIP_FORM_VEHICLE_HISTORY")) : null;
        Bundle bundleV5 = v();
        if (bundleV5 != null) {
            if (!bundleV5.containsKey("KEY_FIRST_REGISTRATION_DATE")) {
                bundleV5 = null;
            }
            if (bundleV5 != null) {
                localDateOfEpochDay = LocalDate.ofEpochDay(bundleV5.getLong("KEY_FIRST_REGISTRATION_DATE"));
            }
        }
        LocalDate localDate = localDateOfEpochDay;
        if (string == null || string2 == null || boolValueOf == null || localDate == null) {
            return;
        }
        this.vehicleIdentificationData = new VehicleIdentificationPayload(uv0.d.c(string2), uv0.v.d(string), boolValueOf.booleanValue(), localDate, null);
    }
}
