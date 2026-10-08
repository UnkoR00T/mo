package mf3;

import com.google.android.gms.maps.model.LatLng;
import er.l;
import er.p;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import k30.d;
import kf3.State;
import mx.Label;
import nf3.SelectedAddress;
import nh.k;
import oq.i0;
import p071kotlin.Metadata;
import tv0.BEVehicleCollisionDescriptionConception;
import vy.Coordinates;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0013B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\n*\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lmf3/c;", "Lxw/f;", "Lmf3/c$a;", "Lkf3/c$a;", "Lmx/c;", "labelProvider", "Lje3/a;", "addressFormatter", "<init>", "(Lmx/c;Lje3/a;)V", "Lvy/c;", "Lcom/google/android/gms/maps/model/LatLng;", "m", "(Lvy/c;)Lcom/google/android/gms/maps/model/LatLng;", "l", "(Lcom/google/android/gms/maps/model/LatLng;)Lvy/c;", "params", "f", "(Lmf3/c$a;)Lkf3/c$a;", "a", "Lmx/c;", "b", "Lje3/a;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, kf3.c.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final je3.a addressFormatter;

    /* JADX INFO: renamed from: mf3.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R)\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b8\u0006¢\u0006\f\n\u0004\b\"\u0010(\u001a\u0004\b \u0010)R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b8\u0006¢\u0006\f\n\u0004\b&\u0010(\u001a\u0004\b*\u0010)R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b8\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b+\u0010)R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b8\u0006¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b\u001c\u0010)R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010(\u001a\u0004\b$\u0010)¨\u0006,"}, d2 = {"Lmf3/c$a;", "", "Lkf3/b;", "state", "Lkotlin/Function1;", "Lvy/c;", "Loq/i0;", "onMapClick", "Lkotlin/Function2;", "", "onPlaceOfNameClick", "Lkotlin/Function0;", "getLocation", "onSnackBarHidden", "onSelectedClicked", "close", "onCameraMoved", "<init>", "(Lkf3/b;Ler/l;Ler/p;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkf3/b;", "h", "()Lkf3/b;", "b", "Ler/l;", "d", "()Ler/l;", "c", "Ler/p;", "e", "()Ler/p;", "Ler/a;", "()Ler/a;", "g", "f", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Coordinates, i0> onMapClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final p<Coordinates, String, i0> onPlaceOfNameClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> getLocation;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onSnackBarHidden;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onSelectedClicked;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> close;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCameraMoved;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, l<? super Coordinates, i0> lVar, p<? super Coordinates, ? super String, i0> pVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5) {
            this.state = state;
            this.onMapClick = lVar;
            this.onPlaceOfNameClick = pVar;
            this.getLocation = aVar;
            this.onSnackBarHidden = aVar2;
            this.onSelectedClicked = aVar3;
            this.close = aVar4;
            this.onCameraMoved = aVar5;
        }

        public final er.a<i0> a() {
            return this.close;
        }

        public final er.a<i0> b() {
            return this.getLocation;
        }

        public final er.a<i0> c() {
            return this.onCameraMoved;
        }

        public final l<Coordinates, i0> d() {
            return this.onMapClick;
        }

        public final p<Coordinates, String, i0> e() {
            return this.onPlaceOfNameClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onMapClick, params.onMapClick) && t.c(this.onPlaceOfNameClick, params.onPlaceOfNameClick) && t.c(this.getLocation, params.getLocation) && t.c(this.onSnackBarHidden, params.onSnackBarHidden) && t.c(this.onSelectedClicked, params.onSelectedClicked) && t.c(this.close, params.close) && t.c(this.onCameraMoved, params.onCameraMoved);
        }

        public final er.a<i0> f() {
            return this.onSelectedClicked;
        }

        public final er.a<i0> g() {
            return this.onSnackBarHidden;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((((this.state.hashCode() * 31) + this.onMapClick.hashCode()) * 31) + this.onPlaceOfNameClick.hashCode()) * 31) + this.getLocation.hashCode()) * 31) + this.onSnackBarHidden.hashCode()) * 31) + this.onSelectedClicked.hashCode()) * 31) + this.close.hashCode()) * 31) + this.onCameraMoved.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onMapClick=" + this.onMapClick + ", onPlaceOfNameClick=" + this.onPlaceOfNameClick + ", getLocation=" + this.getLocation + ", onSnackBarHidden=" + this.onSnackBarHidden + ", onSelectedClicked=" + this.onSelectedClicked + ", close=" + this.close + ", onCameraMoved=" + this.onCameraMoved + ')';
        }
    }

    public c(mx.c cVar, je3.a aVar) {
        this.labelProvider = cVar;
        this.addressFormatter = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(Params params, c cVar, LatLng latLng) {
        params.d().b(cVar.l(latLng));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(Params params, c cVar, k kVar) {
        params.e().B(cVar.l(kVar.f136295a), kVar.f136297c);
        return i0.f148189a;
    }

    private final Coordinates l(LatLng latLng) {
        return new Coordinates(latLng.f31423a, latLng.f31424b);
    }

    private final LatLng m(Coordinates coordinates) {
        return new LatLng(coordinates.getLatitude(), coordinates.getLongitude());
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public kf3.c.Data b(final Params params) {
        SelectedAddress selectedAddress;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.a()), this.labelProvider.c(md3.b.f125879z3), null, null, null, 28, null), null, null, null, null, 61, null);
        boolean showMyLocalization = params.getState().getShowMyLocalization();
        Coordinates cameraPosition = params.getState().getCameraPosition();
        LatLng latLngM = cameraPosition != null ? m(cameraPosition) : null;
        Coordinates markerCoordinates = params.getState().getMarkerCoordinates();
        LatLng latLngM2 = markerCoordinates != null ? m(markerCoordinates) : null;
        BEVehicleCollisionDescriptionConception.LocationDetails address = params.getState().getAddress();
        if (address != null) {
            Label labelB = mx.b.b(this.addressFormatter.a(address), "addressStr");
            Label placeOfName = address.getPlaceOfName();
            if (placeOfName.getText().length() == 0) {
                placeOfName = this.labelProvider.c(md3.b.f125871y3);
            }
            selectedAddress = new SelectedAddress(labelB, placeOfName, new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(md3.b.f125723g), null, 2, null), d.a.f107773a, null, params.f(), 35, null));
        } else {
            selectedAddress = null;
        }
        return new kf3.c.Data(baseScaffoldData, showMyLocalization, latLngM, latLngM2, selectedAddress, 15.0f, new l() { // from class: mf3.a
            @Override // er.l
            public final Object b(Object obj) {
                return c.h(params, this, (LatLng) obj);
            }
        }, new l() { // from class: mf3.b
            @Override // er.l
            public final Object b(Object obj) {
                return c.i(params, this, (k) obj);
            }
        }, params.g(), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithIcon(params.getState().getShowMyLocalization() ? jz.a.f106737b1 : jz.a.f106745c1, c70.a.f23835a.a().o()), d.a.f107773a, null, params.b(), 35, null), params.c());
    }
}
