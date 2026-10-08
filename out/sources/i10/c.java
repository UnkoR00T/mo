package i10;

import com.google.android.gms.maps.model.LatLng;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;
import vy.Coordinates;
import vy.DistanceDegree;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010JE\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\"\u0004\b\u0000\u0010\u00112\u0006\u0010\u0012\u001a\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Li10/c;", "Luy/b;", "<init>", "()V", "Lvy/c;", "Lcom/google/android/gms/maps/model/LatLng;", "e", "(Lvy/c;)Lcom/google/android/gms/maps/model/LatLng;", "Lvy/g;", "distance", "Lvy/h;", "a", "(D)Lvy/h;", "first", "second", "c", "(Lvy/c;Lvy/c;)D", "T", "distanceTo", "", "dataToOrder", "Lkotlin/Function1;", "transformToCoordinates", "", "d", "(Lvy/c;Ljava/util/Collection;Ler/l;)Ljava/util/List;", "sensor_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements uy.b {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a<T> implements Comparator {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Coordinates f88119b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ er.l f88120c;

        public a(Coordinates coordinates, er.l lVar) {
            this.f88119b = coordinates;
            this.f88120c = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            return sq.a.e(Double.valueOf(vy.g.f(c.this.c(this.f88119b, (Coordinates) this.f88120c.b(t15)))), Double.valueOf(vy.g.f(c.this.c(this.f88119b, (Coordinates) this.f88120c.b(t16)))));
        }
    }

    private final LatLng e(Coordinates coordinates) {
        return new LatLng(coordinates.getLatitude(), coordinates.getLongitude());
    }

    @Override // uy.b
    public DistanceDegree a(double distance) {
        return new DistanceDegree(vy.e.a(vy.g.f(vy.g.c(distance, 111))), vy.e.a(vy.g.f(vy.g.b(distance, 70.0d))), null);
    }

    public double c(Coordinates first, Coordinates second) {
        return vy.i.b(am.f.b(e(first), e(second)));
    }

    @Override // uy.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public <T> List<T> b(Coordinates distanceTo, Collection<? extends T> dataToOrder, er.l<? super T, Coordinates> transformToCoordinates) {
        return v.U0(dataToOrder, new a(distanceTo, transformToCoordinates));
    }
}
