package an3;

import bn3.l;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbn3/l;", "Lwm3/b;", "a", "(Lbn3/l;)Lwm3/b;", "vehicles_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: an3.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C0181a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8012a;

        static {
            int[] iArr = new int[l.values().length];
            try {
                iArr[l.Ambulance.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.Bus.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l.Motorcycle.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[l.StandardCar.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[l.Tractor.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[l.Trailer.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[l.Truck.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f8012a = iArr;
        }
    }

    public static final wm3.b a(l lVar) {
        switch (C0181a.f8012a[lVar.ordinal()]) {
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
