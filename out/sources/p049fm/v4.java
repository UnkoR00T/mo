package p049fm;

import b3.a0;
import b3.b0;
import b3.x;
import com.google.android.gms.maps.model.LatLng;
import er.l;
import er.p;
import fr.k;
import nh.h;
import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.c6;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\u0007B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R+\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0005R+\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\f8F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R1\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00128F@@X\u0087\u008e\u0002¢\u0006\u0018\n\u0004\b\u0013\u0010\b\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\bR(\u0010$\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001c8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lfm/v4;", "", "Lcom/google/android/gms/maps/model/LatLng;", "position", "<init>", "(Lcom/google/android/gms/maps/model/LatLng;)V", "<set-?>", "a", "Lm2/a3;", "e", "()Lcom/google/android/gms/maps/model/LatLng;", "i", "", "b", "isDragging", "()Z", "g", "(Z)V", "Lfm/t;", "c", "getDragState", "()Lfm/t;", "f", "(Lfm/t;)V", "getDragState$annotations", "()V", "dragState", "Lm2/a3;", "Lnh/h;", "d", "markerState", "value", "getMarker$maps_compose_release", "()Lnh/h;", "h", "(Lnh/h;)V", "marker", "maps-compose_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v4 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f65331f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a3 position;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a3 isDragging;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a3 dragState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final a3<h> markerState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final x<v4, LatLng> f65332g = a0.e(new p() { // from class: fm.t4
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return v4.c((b0) obj, (v4) obj2);
        }
    }, new l() { // from class: fm.u4
        @Override // er.l
        public final Object b(Object obj) {
            return v4.d((LatLng) obj);
        }
    });

    /* JADX INFO: renamed from: fm.v4$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0087\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lfm/v4$a;", "", "<init>", "()V", "Lcom/google/android/gms/maps/model/LatLng;", "position", "Lfm/v4;", "a", "(Lcom/google/android/gms/maps/model/LatLng;)Lfm/v4;", "maps-compose_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final v4 a(LatLng position) {
            return new v4(position, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ v4(LatLng latLng, k kVar) {
        this(latLng);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LatLng c(b0 b0Var, v4 v4Var) {
        return v4Var.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v4 d(LatLng latLng) {
        return new v4(latLng);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final LatLng e() {
        return (LatLng) this.position.getValue();
    }

    public final void f(t tVar) {
        this.dragState.setValue(tVar);
    }

    public final void g(boolean z15) {
        this.isDragging.setValue(Boolean.valueOf(z15));
    }

    public final void h(h hVar) {
        if (this.markerState.getValue() == null && hVar == null) {
            return;
        }
        if (this.markerState.getValue() != null && hVar != null) {
            throw new IllegalStateException("MarkerState may only be associated with one Marker at a time.");
        }
        this.markerState.setValue(hVar);
    }

    public final void i(LatLng latLng) {
        this.position.setValue(latLng);
    }

    private v4(LatLng latLng) {
        this.position = c6.e(latLng, null, 2, null);
        this.isDragging = c6.e(Boolean.FALSE, null, 2, null);
        this.dragState = c6.e(t.END, null, 2, null);
        this.markerState = c6.e(null, null, 2, null);
    }
}
