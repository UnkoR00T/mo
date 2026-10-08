package oe2;

import cb4.i;
import com.google.android.gms.maps.model.LatLng;
import er.l;
import er.p;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import k30.d;
import mx.Label;
import ne2.e;
import nh.k;
import oq.i0;
import p071kotlin.Metadata;
import pe2.SelectedAddress;
import vy.Coordinates;
import x50.NavigationButtonData;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\b*\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Loe2/c;", "Lxw/f;", "Loe2/c$a;", "Lne2/e$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lvy/c;", "Lcom/google/android/gms/maps/model/LatLng;", "q", "(Lvy/c;)Lcom/google/android/gms/maps/model/LatLng;", "m", "(Lcom/google/android/gms/maps/model/LatLng;)Lvy/c;", "", "stringId", "Lmx/a;", "l", "(I)Lmx/a;", "params", "f", "(Loe2/c$a;)Lne2/e$a;", "a", "Lmx/c;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, e.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: oe2.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R)\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\n8\u0006¢\u0006\f\n\u0004\b%\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b(\u0010!\u001a\u0004\b#\u0010\"R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b*\u0010!\u001a\u0004\b+\u0010\"R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b+\u0010!\u001a\u0004\b*\u0010\"R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\b\u001c\u0010\"¨\u0006,"}, d2 = {"Loe2/c$a;", "", "Lne2/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "onCloseClick", "Lkotlin/Function1;", "Lvy/c;", "onMapClick", "Lkotlin/Function2;", "", "onPlaceOfNameClick", "onGetLocationClick", "onSnackBarHidden", "onSelectedClick", "onCameraMoved", "<init>", "(Lne2/c;Ler/a;Ler/l;Ler/p;Ler/a;Ler/a;Ler/a;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lne2/c;", "h", "()Lne2/c;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/l;", "d", "()Ler/l;", "Ler/p;", "e", "()Ler/p;", "f", "g", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ne2.c state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Coordinates, i0> onMapClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final p<Coordinates, String, i0> onPlaceOfNameClick;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onGetLocationClick;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onSnackBarHidden;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onSelectedClick;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCameraMoved;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(ne2.c cVar, er.a<i0> aVar, l<? super Coordinates, i0> lVar, p<? super Coordinates, ? super String, i0> pVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5) {
            this.state = cVar;
            this.onCloseClick = aVar;
            this.onMapClick = lVar;
            this.onPlaceOfNameClick = pVar;
            this.onGetLocationClick = aVar2;
            this.onSnackBarHidden = aVar3;
            this.onSelectedClick = aVar4;
            this.onCameraMoved = aVar5;
        }

        public final er.a<i0> a() {
            return this.onCameraMoved;
        }

        public final er.a<i0> b() {
            return this.onCloseClick;
        }

        public final er.a<i0> c() {
            return this.onGetLocationClick;
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
            return t.c(this.state, params.state) && t.c(this.onCloseClick, params.onCloseClick) && t.c(this.onMapClick, params.onMapClick) && t.c(this.onPlaceOfNameClick, params.onPlaceOfNameClick) && t.c(this.onGetLocationClick, params.onGetLocationClick) && t.c(this.onSnackBarHidden, params.onSnackBarHidden) && t.c(this.onSelectedClick, params.onSelectedClick) && t.c(this.onCameraMoved, params.onCameraMoved);
        }

        public final er.a<i0> f() {
            return this.onSelectedClick;
        }

        public final er.a<i0> g() {
            return this.onSnackBarHidden;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final ne2.c getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((((this.state.hashCode() * 31) + this.onCloseClick.hashCode()) * 31) + this.onMapClick.hashCode()) * 31) + this.onPlaceOfNameClick.hashCode()) * 31) + this.onGetLocationClick.hashCode()) * 31) + this.onSnackBarHidden.hashCode()) * 31) + this.onSelectedClick.hashCode()) * 31) + this.onCameraMoved.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onCloseClick=" + this.onCloseClick + ", onMapClick=" + this.onMapClick + ", onPlaceOfNameClick=" + this.onPlaceOfNameClick + ", onGetLocationClick=" + this.onGetLocationClick + ", onSnackBarHidden=" + this.onSnackBarHidden + ", onSelectedClick=" + this.onSelectedClick + ", onCameraMoved=" + this.onCameraMoved + ')';
        }
    }

    public c(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(Params params, c cVar, LatLng latLng) {
        params.d().b(cVar.m(latLng));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(Params params, c cVar, k kVar) {
        params.e().B(cVar.m(kVar.f136295a), kVar.f136297c);
        return i0.f148189a;
    }

    private final Label l(int stringId) {
        return this.labelProvider.c(stringId);
    }

    private final Coordinates m(LatLng latLng) {
        return new Coordinates(latLng.f31423a, latLng.f31424b);
    }

    private final LatLng q(Coordinates coordinates) {
        return new LatLng(coordinates.getLatitude(), coordinates.getLongitude());
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public e.Data b(final Params params) {
        SelectedAddress selectedAddress;
        i dialog;
        er.a<i0> aVarB = params.b();
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.b()), l(ud2.a.f197738h0), null, null, null, 28, null), null, null, null, null, 61, null);
        boolean showMyLocalization = params.getState().getMapScreenStateData().getShowMyLocalization();
        Coordinates cameraPosition = params.getState().getMapScreenStateData().getCameraPosition();
        LatLng latLngQ = cameraPosition != null ? q(cameraPosition) : null;
        Coordinates markerCoordinates = params.getState().getMapScreenStateData().getMarkerCoordinates();
        LatLng latLngQ2 = markerCoordinates != null ? q(markerCoordinates) : null;
        Coordinates incidentLocation = params.getState().getMapScreenStateData().getIncidentLocation();
        if (incidentLocation != null) {
            selectedAddress = new SelectedAddress(mx.b.b(incidentLocation.getLatitude() + ", " + incidentLocation.getLongitude(), "addressCords"), l(ud2.a.f197740i0), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(l(ud2.a.f197733f), null, 2, null), d.a.f107773a, null, params.f(), 35, null));
        } else {
            selectedAddress = null;
        }
        ne2.c state = params.getState();
        if (state instanceof ne2.c.Dialog) {
            dialog = ((ne2.c.Dialog) params.getState()).getDialog();
        } else {
            if (!(state instanceof ne2.c.Screen)) {
                throw new oq.p();
            }
            dialog = null;
        }
        return new e.Data(baseScaffoldData, showMyLocalization, latLngQ, latLngQ2, selectedAddress, 15.0f, dialog, new l() { // from class: oe2.a
            @Override // er.l
            public final Object b(Object obj) {
                return c.h(params, this, (LatLng) obj);
            }
        }, new l() { // from class: oe2.b
            @Override // er.l
            public final Object b(Object obj) {
                return c.i(params, this, (k) obj);
            }
        }, params.g(), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithIcon(params.getState().getMapScreenStateData().getShowMyLocalization() ? jz.a.f106737b1 : jz.a.f106745c1, c70.a.f23835a.a().o()), d.a.f107773a, null, params.c(), 35, null), params.a(), aVarB);
    }
}
