package ji3;

import com.google.android.gms.maps.model.LatLng;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import ii3.State;
import ii3.g;
import k30.d;
import md3.b;
import mx.Label;
import mx.c;
import oq.i0;
import p071kotlin.Metadata;
import vy.Coordinates;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lji3/a;", "Lxw/f;", "Lji3/a$a;", "Lii3/g$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lvy/c;", "Lcom/google/android/gms/maps/model/LatLng;", "e", "(Lvy/c;)Lcom/google/android/gms/maps/model/LatLng;", "params", "c", "(Lji3/a$a;)Lii3/g$a;", "a", "Lmx/c;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, g.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: ji3.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001c\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0015\u0010\u001b¨\u0006\u001d"}, d2 = {"Lji3/a$a;", "", "Lii3/f;", "state", "Lkotlin/Function0;", "Loq/i0;", "getLocation", "onSnackBarHidden", "close", "<init>", "(Lii3/f;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lii3/f;", "d", "()Lii3/f;", "b", "Ler/a;", "()Ler/a;", "c", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f103412e = Coordinates.f208679c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> getLocation;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onSnackBarHidden;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> close;

        public Params(State state, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = state;
            this.getLocation = aVar;
            this.onSnackBarHidden = aVar2;
            this.close = aVar3;
        }

        public final er.a<i0> a() {
            return this.close;
        }

        public final er.a<i0> b() {
            return this.getLocation;
        }

        public final er.a<i0> c() {
            return this.onSnackBarHidden;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
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
            return t.c(this.state, params.state) && t.c(this.getLocation, params.getLocation) && t.c(this.onSnackBarHidden, params.onSnackBarHidden) && t.c(this.close, params.close);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.getLocation.hashCode()) * 31) + this.onSnackBarHidden.hashCode()) * 31) + this.close.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", getLocation=" + this.getLocation + ", onSnackBarHidden=" + this.onSnackBarHidden + ", close=" + this.close + ')';
        }
    }

    public a(c cVar) {
        this.labelProvider = cVar;
    }

    private final LatLng e(Coordinates coordinates) {
        return new LatLng(coordinates.getLatitude(), coordinates.getLongitude());
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public g.Data b(Params params) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.a()), this.labelProvider.c(b.B3), null, null, null, 28, null), null, null, null, null, 61, null);
        boolean isMyLocationEnabled = params.getState().getIsMyLocationEnabled();
        LatLng latLngE = e(params.getState().getCameraPosition());
        LatLng latLngE2 = e(params.getState().getMarkerCoordinates());
        Label labelB = mx.b.b(params.getState().getAddress(), "address");
        Label labelC = this.labelProvider.c(b.B3);
        er.a<i0> aVarC = params.c();
        k30.a.Large large = new k30.a.Large(false, 1, null);
        k30.c.WithIcon withIcon = new k30.c.WithIcon(params.getState().getIsMyLocationEnabled() ? jz.a.f106737b1 : jz.a.f106745c1, c70.a.f23835a.a().o());
        d.a aVar = d.a.f107773a;
        return new g.Data(baseScaffoldData, isMyLocationEnabled, latLngE, latLngE2, labelB, labelC, 0.0f, aVarC, new ButtonData(null, null, large, withIcon, aVar, null, params.b(), 35, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(b.f125723g), null, 2, null), aVar, null, params.a(), 35, null), 64, null);
    }
}
