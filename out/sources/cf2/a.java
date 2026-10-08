package cf2;

import bf2.d;
import bf2.e;
import com.google.android.gms.maps.model.LatLng;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import mx.b;
import mx.c;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import vy.Coordinates;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\n*\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcf2/a;", "Lxw/f;", "Lcf2/a$a;", "Lbf2/e$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "", "stringId", "Lmx/a;", "f", "(I)Lmx/a;", "Lvy/c;", "Lcom/google/android/gms/maps/model/LatLng;", "h", "(Lvy/c;)Lcom/google/android/gms/maps/model/LatLng;", "c", "(Lvy/c;)Lmx/a;", "params", "e", "(Lcf2/a$a;)Lbf2/e$a;", "a", "Lmx/c;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, e.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: cf2.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001c\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0015\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcf2/a$a;", "", "Lbf2/d;", "state", "Lkotlin/Function0;", "Loq/i0;", "onGetLocationClick", "onSnackBarHidden", "onCloseClick", "<init>", "(Lbf2/d;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbf2/d;", "d", "()Lbf2/d;", "b", "Ler/a;", "()Ler/a;", "c", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final d state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onGetLocationClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onSnackBarHidden;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseClick;

        public Params(d dVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = dVar;
            this.onGetLocationClick = aVar;
            this.onSnackBarHidden = aVar2;
            this.onCloseClick = aVar3;
        }

        public final er.a<i0> a() {
            return this.onCloseClick;
        }

        public final er.a<i0> b() {
            return this.onGetLocationClick;
        }

        public final er.a<i0> c() {
            return this.onSnackBarHidden;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final d getState() {
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
            return t.c(this.state, params.state) && t.c(this.onGetLocationClick, params.onGetLocationClick) && t.c(this.onSnackBarHidden, params.onSnackBarHidden) && t.c(this.onCloseClick, params.onCloseClick);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onGetLocationClick.hashCode()) * 31) + this.onSnackBarHidden.hashCode()) * 31) + this.onCloseClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onGetLocationClick=" + this.onGetLocationClick + ", onSnackBarHidden=" + this.onSnackBarHidden + ", onCloseClick=" + this.onCloseClick + ')';
        }
    }

    public a(c cVar) {
        this.labelProvider = cVar;
    }

    private final Label c(Coordinates coordinates) {
        return b.b(coordinates.getLatitude() + ", " + coordinates.getLongitude(), "address");
    }

    private final Label f(int stringId) {
        return this.labelProvider.c(stringId);
    }

    private final LatLng h(Coordinates coordinates) {
        return new LatLng(coordinates.getLatitude(), coordinates.getLongitude());
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public e.Data b(Params params) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.a()), f(ud2.a.f197736g0), null, null, null, 28, null), null, null, null, null, 61, null);
        boolean isMyLocationEnabled = params.getState().getShowMapScreenStateData().getIsMyLocationEnabled();
        LatLng latLngH = h(params.getState().getShowMapScreenStateData().getCameraPosition());
        LatLng latLngH2 = h(params.getState().getShowMapScreenStateData().getMarkerCoordinates());
        Label labelC = c(params.getState().getShowMapScreenStateData().getAddress());
        Label labelF = f(ud2.a.f197740i0);
        er.a<i0> aVarC = params.c();
        cb4.i dialogVMSAdapter = null;
        k30.a.Large large = new k30.a.Large(false, 1, null);
        k30.c.WithIcon withIcon = new k30.c.WithIcon(params.getState().getShowMapScreenStateData().getIsMyLocationEnabled() ? jz.a.f106737b1 : jz.a.f106745c1, c70.a.f23835a.a().o());
        k30.d.a aVar = k30.d.a.f107773a;
        ButtonData buttonData = new ButtonData(null, null, large, withIcon, aVar, null, params.b(), 35, null);
        ButtonData buttonData2 = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(f(ud2.a.f197733f), null, 2, null), aVar, null, params.a(), 35, null);
        d state = params.getState();
        if (!(state instanceof d.Screen)) {
            if (!(state instanceof d.Dialog)) {
                throw new p();
            }
            dialogVMSAdapter = ((d.Dialog) params.getState()).getDialogVMSAdapter();
        }
        return new e.Data(baseScaffoldData, isMyLocationEnabled, latLngH, latLngH2, labelC, labelF, 0.0f, buttonData, buttonData2, dialogVMSAdapter, aVarC, params.a(), 64, null);
    }
}
