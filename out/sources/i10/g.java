package i10;

import android.content.Context;
import android.location.Geocoder;
import android.location.Geocoder$GeocodeListener;
import android.os.Build;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import p071kotlin.Metadata;
import pq.v;
import vy.Address;
import vy.Coordinates;
import vy.DistanceDegree;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ:\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00140\n2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J*\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00140\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001a¨\u0006\u001b"}, d2 = {"Li10/g;", "Luy/c;", "Landroid/content/Context;", "context", "Luy/b;", "distanceCalculator", "<init>", "(Landroid/content/Context;Luy/b;)V", "Lvy/c;", "latLng", "Ldx/i;", "Ldx/b;", "Lvy/a;", "a", "(Lvy/c;)Ldx/i;", "center", "Lvy/g;", "distance", "", "location", "", "b", "(Lvy/c;DLjava/lang/String;Ltq/e;)Ljava/lang/Object;", "c", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Landroid/content/Context;", "Luy/b;", "sensor_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements uy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final uy.b distanceCalculator;

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"i10/g$b", "Landroid/location/Geocoder$GeocodeListener;", "", "Landroid/location/Address;", "addresses", "Loq/i0;", "onGeocode", "(Ljava/util/List;)V", "", "errorMessage", "onError", "(Ljava/lang/String;)V", "sensor_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements Geocoder$GeocodeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ju.n<dx.i<? extends dx.b, ? extends List<Address>>> f88136a;

        /* JADX WARN: Multi-variable type inference failed */
        b(ju.n<? super dx.i<? extends dx.b, ? extends List<Address>>> nVar) {
            this.f88136a = nVar;
        }

        public void onError(String errorMessage) {
            ju.n<dx.i<? extends dx.b, ? extends List<Address>>> nVar = this.f88136a;
            oq.t.Companion companion = oq.t.INSTANCE;
            if (errorMessage == null) {
                errorMessage = "Unknown error";
            }
            nVar.i(oq.t.b(new dx.i.Left(new dx.b.Generic(new Exception(errorMessage)))));
        }

        public void onGeocode(List<android.location.Address> addresses) {
            ju.n<dx.i<? extends dx.b, ? extends List<Address>>> nVar = this.f88136a;
            List<android.location.Address> list = addresses;
            ArrayList arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(j10.a.b((android.location.Address) it.next()));
            }
            nVar.i(oq.t.b(new dx.i.Right(arrayList)));
        }
    }

    public g(Context context, uy.b bVar) {
        this.context = context;
        this.distanceCalculator = bVar;
    }

    @Override // uy.c
    public dx.i<dx.b, Address> a(Coordinates latLng) {
        try {
            List<android.location.Address> fromLocation = new Geocoder(this.context, Locale.getDefault()).getFromLocation(latLng.getLatitude(), latLng.getLongitude(), 1);
            android.location.Address address = fromLocation != null ? (android.location.Address) v.n0(fromLocation) : null;
            return address != null ? new dx.i.Right(j10.a.b(address)) : new dx.i.Left(new dx.b.Generic(new Exception("Address not found")));
        } catch (IOException unused) {
            return new dx.i.Left(new dx.b.Generic(new Exception("something went wrong")));
        }
    }

    @Override // uy.c
    public Object b(Coordinates coordinates, double d15, String str, tq.e<? super dx.i<? extends dx.b, ? extends List<Address>>> eVar) {
        Collection collectionN;
        try {
            Geocoder geocoder = new Geocoder(this.context, Locale.getDefault(Locale.Category.DISPLAY));
            DistanceDegree distanceDegreeA = this.distanceCalculator.a(vy.g.c(d15, 2));
            double dA = vy.f.a(coordinates.getLatitude(), distanceDegreeA.getLatitude());
            double dB = vy.f.b(coordinates.getLatitude(), distanceDegreeA.getLatitude());
            double dA2 = vy.f.a(coordinates.getLongitude(), distanceDegreeA.getLongitude());
            double dB2 = vy.f.b(coordinates.getLongitude(), distanceDegreeA.getLongitude());
            px.f.f163100a.b("lowerLeftLatitude: " + ((Object) vy.e.g(dA)) + " \nupperRightLatitude: " + ((Object) vy.e.g(dB)) + " \nlowerLeftLongitude: " + ((Object) vy.e.g(dA2)) + " \nupperRightLongitude: " + ((Object) vy.e.g(dB2)) + ' ', px.c.a(this));
            List<android.location.Address> fromLocationName = geocoder.getFromLocationName(str, 5, vy.e.f(dA), vy.e.f(dA2), vy.e.f(dB), vy.e.f(dB2));
            if (fromLocationName != null) {
                List<android.location.Address> list = fromLocationName;
                collectionN = new ArrayList(v.y(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    collectionN.add(j10.a.b((android.location.Address) it.next()));
                }
            } else {
                collectionN = v.n();
            }
            return new dx.i.Right(collectionN);
        } catch (CancellationException e15) {
            throw e15;
        } catch (Exception e16) {
            return new dx.i.Left(new dx.b.Generic(e16));
        }
    }

    @Override // uy.c
    public Object c(String str, tq.e<? super dx.i<? extends dx.b, ? extends List<Address>>> eVar) {
        Collection collectionN;
        ju.p pVar = new ju.p(uq.b.c(eVar), 1);
        pVar.D();
        Geocoder geocoder = new Geocoder(this.context, Locale.getDefault(Locale.Category.DISPLAY));
        if (Build.VERSION.SDK_INT >= 33) {
            geocoder.getFromLocationName(str, 5, new b(pVar));
        } else {
            try {
                List<android.location.Address> fromLocationName = geocoder.getFromLocationName(str, 5);
                if (fromLocationName != null) {
                    List<android.location.Address> list = fromLocationName;
                    collectionN = new ArrayList(v.y(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        collectionN.add(j10.a.b((android.location.Address) it.next()));
                    }
                } else {
                    collectionN = v.n();
                }
                pVar.i(oq.t.b(new dx.i.Right(collectionN)));
            } catch (CancellationException e15) {
                throw e15;
            } catch (Exception e16) {
                oq.t.Companion companion = oq.t.INSTANCE;
                pVar.i(oq.t.b(new dx.i.Left(new dx.b.Generic(e16))));
            }
        }
        Object objX = pVar.x();
        if (objX == uq.b.e()) {
            vq.g.c(eVar);
        }
        return objX;
    }
}
