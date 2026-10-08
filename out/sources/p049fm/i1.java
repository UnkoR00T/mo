package p049fm;

import android.location.Location;
import com.google.android.gms.maps.model.LatLng;
import er.a;
import er.l;
import nh.k;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.c6;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R+\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\nRG\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0007\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012RG\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0007\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R;\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00182\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00188F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0007\u001a\u0004\b\u0014\u0010\u0019\"\u0004\b\u001a\u0010\u001bR;\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00182\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00188F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u0007\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bRG\u0010$\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010\u0007\u001a\u0004\b\"\u0010\u0010\"\u0004\b#\u0010\u0012RG\u0010(\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010\u0007\u001a\u0004\b&\u0010\u0010\"\u0004\b'\u0010\u0012¨\u0006)"}, d2 = {"Lfm/i1;", "", "<init>", "()V", "Lfm/e0;", "<set-?>", "a", "Lm2/a3;", "()Lfm/e0;", "h", "(Lfm/e0;)V", "indoorStateChangeListener", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/LatLng;", "Loq/i0;", "b", "()Ler/l;", "i", "(Ler/l;)V", "onMapClick", "c", "d", "k", "onMapLongClick", "Lkotlin/Function0;", "()Ler/a;", "j", "(Ler/a;)V", "onMapLoaded", "", "e", "l", "onMyLocationButtonClick", "Landroid/location/Location;", "f", "m", "onMyLocationClick", "Lnh/k;", "g", "n", "onPOIClick", "maps-compose_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a3 indoorStateChangeListener = c6.e(s.f65257a, null, 2, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a3 onMapClick = c6.e(null, null, 2, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a3 onMapLongClick = c6.e(null, null, 2, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final a3 onMapLoaded = c6.e(null, null, 2, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final a3 onMyLocationButtonClick = c6.e(null, null, 2, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final a3 onMyLocationClick = c6.e(null, null, 2, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final a3 onPOIClick = c6.e(null, null, 2, null);

    public final e0 a() {
        return (e0) this.indoorStateChangeListener.getValue();
    }

    public final l<LatLng, i0> b() {
        return (l) this.onMapClick.getValue();
    }

    public final a<i0> c() {
        return (a) this.onMapLoaded.getValue();
    }

    public final l<LatLng, i0> d() {
        return (l) this.onMapLongClick.getValue();
    }

    public final a<Boolean> e() {
        return (a) this.onMyLocationButtonClick.getValue();
    }

    public final l<Location, i0> f() {
        return (l) this.onMyLocationClick.getValue();
    }

    public final l<k, i0> g() {
        return (l) this.onPOIClick.getValue();
    }

    public final void h(e0 e0Var) {
        this.indoorStateChangeListener.setValue(e0Var);
    }

    public final void i(l<? super LatLng, i0> lVar) {
        this.onMapClick.setValue(lVar);
    }

    public final void j(a<i0> aVar) {
        this.onMapLoaded.setValue(aVar);
    }

    public final void k(l<? super LatLng, i0> lVar) {
        this.onMapLongClick.setValue(lVar);
    }

    public final void l(a<Boolean> aVar) {
        this.onMyLocationButtonClick.setValue(aVar);
    }

    public final void m(l<? super Location, i0> lVar) {
        this.onMyLocationClick.setValue(lVar);
    }

    public final void n(l<? super k, i0> lVar) {
        this.onPOIClick.setValue(lVar);
    }
}
