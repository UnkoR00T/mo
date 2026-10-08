package cn3;

import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcn3/b;", "Lxm3/a;", "<init>", "()V", "Lxm3/a$a;", "params", "", "b", "(Lxm3/a$a;)Ljava/lang/Integer;", "vehicles_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements xm3.a {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28414a;

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
            f28414a = iArr;
        }
    }

    @Override // gz.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer a(xm3.a.Params params) {
        int i15;
        wm3.b vehicleType = params.getVehicleType();
        switch (vehicleType == null ? -1 : a.f28414a[vehicleType.ordinal()]) {
            case -1:
                i15 = um3.a.f199199d;
                break;
            case 0:
            default:
                throw new p();
            case 1:
                i15 = um3.a.f199196a;
                break;
            case 2:
                i15 = um3.a.f199197b;
                break;
            case 3:
                i15 = um3.a.f199198c;
                break;
            case 4:
                i15 = um3.a.f199199d;
                break;
            case 5:
                i15 = um3.a.f199203h;
                break;
            case 6:
                i15 = um3.a.f199204i;
                break;
            case 7:
                i15 = um3.a.f199205j;
                break;
        }
        return Integer.valueOf(i15);
    }
}
