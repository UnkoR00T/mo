package xd3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import sv0.BEVehicleData;
import sv0.f;
import tv0.BEVehicleCollisionDescriptionConception;
import tv0.BEVehicleDataWithType;
import tv0.BEVehiclesPages;
import w04.LocationDetails;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a%\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0006*\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u0019\u0010\u000b\u001a\u00020\b*\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u0011\u0010\u000f\u001a\u00020\u000e*\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0011\u0010\u0011\u001a\u00020\r*\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0011\u0010\u0015\u001a\u00020\u0014*\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lsv0/f;", "Lvm3/a;", "vehicleTypeMapper", "Ltv0/m$a;", "a", "(Lsv0/f;Lvm3/a;)Ltv0/m$a;", "", "Lsv0/e;", "Ltv0/k;", "b", "(Ljava/util/List;Lvm3/a;)Ljava/util/List;", "c", "(Lsv0/e;Lvm3/a;)Ltv0/k;", "Lwm3/b;", "Ltv0/k$a;", "e", "(Lwm3/b;)Ltv0/k$a;", "f", "(Ltv0/k$a;)Lwm3/b;", "Lw04/c;", "Ltv0/i$a;", "d", "(Lw04/c;)Ltv0/i$a;", "vehiclecollision_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: xd3.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C5823a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f218053a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f218054b;

        static {
            int[] iArr = new int[wm3.b.values().length];
            try {
                iArr[wm3.b.Ambulance.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[wm3.b.Bus.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[wm3.b.Motorcycle.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[wm3.b.StandardCar.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[wm3.b.Tractor.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[wm3.b.Trailer.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[wm3.b.Truck.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f218053a = iArr;
            int[] iArr2 = new int[BEVehicleDataWithType.a.values().length];
            try {
                iArr2[BEVehicleDataWithType.a.Ambulance.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[BEVehicleDataWithType.a.Bus.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[BEVehicleDataWithType.a.Motorcycle.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[BEVehicleDataWithType.a.StandardCar.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[BEVehicleDataWithType.a.Tractor.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[BEVehicleDataWithType.a.Trailer.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[BEVehicleDataWithType.a.Truck.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            f218054b = iArr2;
        }
    }

    public static final BEVehiclesPages.BEVehiclesPageWithTypes a(f fVar, vm3.a aVar) {
        return new BEVehiclesPages.BEVehiclesPageWithTypes(fVar.getKey(), fVar.getNextPageKey(), b(fVar.b(), aVar));
    }

    public static final List<BEVehicleDataWithType> b(List<BEVehicleData> list, vm3.a aVar) {
        List<BEVehicleData> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(c((BEVehicleData) it.next(), aVar));
        }
        return arrayList;
    }

    public static final BEVehicleDataWithType c(BEVehicleData bEVehicleData, vm3.a aVar) {
        return new BEVehicleDataWithType(bEVehicleData, e(aVar.b(new vm3.a.Params(null, bEVehicleData.getKind()))));
    }

    public static final BEVehicleCollisionDescriptionConception.LocationDetails d(LocationDetails locationDetails) {
        return new BEVehicleCollisionDescriptionConception.LocationDetails(locationDetails.getPlaceOfName(), locationDetails.getStreetNameAndNumber(), locationDetails.getCityName(), locationDetails.getPostalCode(), locationDetails.getVoivodeshipName(), locationDetails.getCountry(), locationDetails.getCoordinates());
    }

    public static final BEVehicleDataWithType.a e(wm3.b bVar) {
        switch (C5823a.f218053a[bVar.ordinal()]) {
            case 1:
                return BEVehicleDataWithType.a.Ambulance;
            case 2:
                return BEVehicleDataWithType.a.Bus;
            case 3:
                return BEVehicleDataWithType.a.Motorcycle;
            case 4:
                return BEVehicleDataWithType.a.StandardCar;
            case 5:
                return BEVehicleDataWithType.a.Tractor;
            case 6:
                return BEVehicleDataWithType.a.Trailer;
            case 7:
                return BEVehicleDataWithType.a.Truck;
            default:
                throw new p();
        }
    }

    public static final wm3.b f(BEVehicleDataWithType.a aVar) {
        switch (C5823a.f218054b[aVar.ordinal()]) {
            case 1:
                return wm3.b.Ambulance;
            case 2:
                return wm3.b.Bus;
            case 3:
                return wm3.b.Motorcycle;
            case 4:
                return wm3.b.StandardCar;
            case 5:
                return wm3.b.Tractor;
            case 6:
                return wm3.b.Trailer;
            case 7:
                return wm3.b.Truck;
            default:
                throw new p();
        }
    }
}
