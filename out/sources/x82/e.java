package x82;

import com.google.android.gms.maps.model.LatLng;
import er.l;
import fr.k;
import fr.t;
import fu.r;
import h30.ButtonData;
import oq.i0;
import p071kotlin.Metadata;
import vy.Coordinates;
import w04.LocationCoordinates;
import w04.LocationDetails;
import w82.SelectedAddress;
import w82.State;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0018\u0011B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\b*\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0017\u001a\u00020\u0014*\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lx82/e;", "Lxw/f;", "Lx82/e$b;", "Lw82/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lvy/c;", "Lcom/google/android/gms/maps/model/LatLng;", "l", "(Lvy/c;)Lcom/google/android/gms/maps/model/LatLng;", "i", "(Lcom/google/android/gms/maps/model/LatLng;)Lvy/c;", "params", "f", "(Lx82/e$b;)Lw82/c$a;", "a", "Lmx/c;", "Lw04/c;", "", "e", "(Lw04/c;)Ljava/lang/String;", "fullAddressString", "b", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements f<Params, w82.c.Data> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f217378b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f217379c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lx82/e$a;", "", "<init>", "()V", "", "NEW_LINE", "Ljava/lang/String;", "SPACE", "ADDRESS_LABEL_TAG", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: x82.e$b, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001a\u0010#R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b$\u0010#R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\"\u001a\u0004\b!\u0010#R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010#R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010#¨\u0006)"}, d2 = {"Lx82/e$b;", "", "Lw82/b;", "state", "Lkotlin/Function1;", "Lvy/c;", "Loq/i0;", "onMapClick", "Lkotlin/Function0;", "getLocation", "onSnackBarHidden", "onNextClick", "permissionRequestPositiveAction", "locationRequestPositiveAction", "<init>", "(Lw82/b;Ler/l;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lw82/b;", "e", "()Lw82/b;", "b", "Ler/l;", "()Ler/l;", "c", "Ler/a;", "()Ler/a;", "d", "f", "getPermissionRequestPositiveAction", "g", "getLocationRequestPositiveAction", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Coordinates, i0> onMapClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> getLocation;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onSnackBarHidden;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextClick;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> permissionRequestPositiveAction;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> locationRequestPositiveAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, l<? super Coordinates, i0> lVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5) {
            this.state = state;
            this.onMapClick = lVar;
            this.getLocation = aVar;
            this.onSnackBarHidden = aVar2;
            this.onNextClick = aVar3;
            this.permissionRequestPositiveAction = aVar4;
            this.locationRequestPositiveAction = aVar5;
        }

        public final er.a<i0> a() {
            return this.getLocation;
        }

        public final l<Coordinates, i0> b() {
            return this.onMapClick;
        }

        public final er.a<i0> c() {
            return this.onNextClick;
        }

        public final er.a<i0> d() {
            return this.onSnackBarHidden;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onMapClick, params.onMapClick) && t.c(this.getLocation, params.getLocation) && t.c(this.onSnackBarHidden, params.onSnackBarHidden) && t.c(this.onNextClick, params.onNextClick) && t.c(this.permissionRequestPositiveAction, params.permissionRequestPositiveAction) && t.c(this.locationRequestPositiveAction, params.locationRequestPositiveAction);
        }

        public int hashCode() {
            return (((((((((((this.state.hashCode() * 31) + this.onMapClick.hashCode()) * 31) + this.getLocation.hashCode()) * 31) + this.onSnackBarHidden.hashCode()) * 31) + this.onNextClick.hashCode()) * 31) + this.permissionRequestPositiveAction.hashCode()) * 31) + this.locationRequestPositiveAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onMapClick=" + this.onMapClick + ", getLocation=" + this.getLocation + ", onSnackBarHidden=" + this.onSnackBarHidden + ", onNextClick=" + this.onNextClick + ", permissionRequestPositiveAction=" + this.permissionRequestPositiveAction + ", locationRequestPositiveAction=" + this.locationRequestPositiveAction + ')';
        }
    }

    public e(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final String e(LocationDetails locationDetails) {
        StringBuilder sb5 = new StringBuilder();
        if (locationDetails.getStreetNameAndNumber().l()) {
            sb5.append(locationDetails.getStreetNameAndNumber().getText());
            sb5.append("\n");
        }
        if (locationDetails.getPostalCode().l()) {
            sb5.append(locationDetails.getPostalCode().getText());
            sb5.append(" ");
        }
        if (locationDetails.getCityName().l()) {
            sb5.append(locationDetails.getCityName().getText());
        }
        if (locationDetails.getPostalCode().l() || locationDetails.getCityName().l()) {
            sb5.append("\n");
        }
        if (locationDetails.getVoivodeshipName().l()) {
            sb5.append(locationDetails.getVoivodeshipName().getText());
            sb5.append("\n");
        }
        if (!r.t0(locationDetails.getCountry())) {
            sb5.append(locationDetails.getCountry());
        }
        if (locationDetails.getStreetNameAndNumber().k() && locationDetails.getCityName().k() && locationDetails.getVoivodeshipName().k() && locationDetails.getPostalCode().k() && r.t0(locationDetails.getCountry())) {
            sb5.append(t04.a.f(locationDetails.getCoordinates().getLatitude()));
            sb5.append(" ");
            sb5.append(t04.a.f(locationDetails.getCoordinates().getLongitude()));
        }
        return sb5.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(Params params, e eVar, LatLng latLng) {
        params.b().b(eVar.i(latLng));
        return i0.f148189a;
    }

    private final Coordinates i(LatLng latLng) {
        return new Coordinates(latLng.f31423a, latLng.f31424b);
    }

    private final LatLng l(Coordinates coordinates) {
        return new LatLng(coordinates.getLatitude(), coordinates.getLongitude());
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public w82.c.Data b(final Params params) {
        LocationCoordinates locationCoordinates = params.getState().getLocationCoordinates();
        boolean showBottomAddress = params.getState().getShowBottomAddress();
        Coordinates markerCoordinates = params.getState().getMarkerCoordinates();
        LatLng latLngL = markerCoordinates != null ? l(markerCoordinates) : null;
        LocationDetails violationAddress = params.getState().getViolationAddress();
        er.a<i0> aVarA = params.a();
        k30.a.Large large = new k30.a.Large(false, 1, null);
        LocationCoordinates locationCoordinates2 = params.getState().getLocationCoordinates();
        k30.c.WithIcon withIcon = new k30.c.WithIcon((locationCoordinates2 != null && locationCoordinates2.getHadGpsPermission() && locationCoordinates2.getIsMyLocationEnabled()) ? jz.a.f106737b1 : jz.a.f106745c1, c70.a.f23835a.a().o());
        k30.d.a aVar = k30.d.a.f107773a;
        return new w82.c.Data(locationCoordinates, showBottomAddress, latLngL, violationAddress, new SelectedAddress(mx.b.b(e(params.getState().getViolationAddress()), "addressStr"), this.labelProvider.c(v72.b.T)), false, 15.0f, new l() { // from class: x82.d
            @Override // er.l
            public final Object b(Object obj) {
                return e.h(params, this, (LatLng) obj);
            }
        }, aVarA, new ButtonData(null, null, large, withIcon, aVar, null, params.a(), 35, null), params.d(), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(v72.b.f204268k), null, 2, null), aVar, null, params.c(), 35, null));
    }
}
