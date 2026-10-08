package cy0;

import fy0.MeasurementPointEntity;
import fy0.e;
import kh0.BEExtendedMeasurementPoint;
import kh0.BEExtendedQuality;
import kh0.BEPlace;
import kh0.l;
import oq.p;
import p071kotlin.Metadata;
import vy.Coordinates;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lfy0/b;", "Lkh0/e;", "a", "(Lfy0/b;)Lkh0/e;", "Lfy0/e;", "Lkh0/l;", "b", "(Lfy0/e;)Lkh0/l;", "airquality_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: cy0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C0824a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38473a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.A.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.B.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.C.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e.D.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[e.E.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[e.F.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[e.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f38473a = iArr;
        }
    }

    public static final BEExtendedMeasurementPoint a(MeasurementPointEntity measurementPointEntity) {
        return new BEExtendedMeasurementPoint(measurementPointEntity.getId(), new Coordinates(measurementPointEntity.getCoordinates().getLatitude(), measurementPointEntity.getCoordinates().getLongitude()), new BEPlace(measurementPointEntity.getPlace().getName(), measurementPointEntity.getPlace().getStreet(), measurementPointEntity.getPlace().getPostcode(), measurementPointEntity.getPlace().getCity()), new BEExtendedQuality(b(measurementPointEntity.getQuality().getRate()), measurementPointEntity.getQuality().getHumidity(), measurementPointEntity.getQuality().getPressure(), measurementPointEntity.getQuality().getTemperature(), measurementPointEntity.getQuality().getPm10value(), measurementPointEntity.getQuality().getPm25value()), null, measurementPointEntity.getTimestamp(), measurementPointEntity.getExpirationTimestamp(), false, false, 16, null);
    }

    public static final l b(e eVar) {
        switch (C0824a.f38473a[eVar.ordinal()]) {
            case 1:
                return l.A;
            case 2:
                return l.B;
            case 3:
                return l.C;
            case 4:
                return l.D;
            case 5:
                return l.E;
            case 6:
                return l.F;
            case 7:
                return l.UNKNOWN;
            default:
                throw new p();
        }
    }
}
