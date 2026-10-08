package jy0;

import ay0.AirQualityWidgetPoint;
import ay0.WidgetLocation;
import ay0.e;
import kh0.BEAirQualityWidgetPoint;
import kh0.BEFavoriteMeasurementPoint;
import kh0.BELocation;
import kh0.k;
import kh0.l;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u0010\u001a\u00020\f*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lkh0/g;", "Lay0/b;", "d", "(Lkh0/g;)Lay0/b;", "Lkh0/b;", "a", "(Lkh0/b;)Lay0/b;", "Lkh0/i;", "Lay0/d;", "b", "(Lkh0/i;)Lay0/d;", "Lkh0/l;", "Lay0/e;", "e", "(Lkh0/l;)Lay0/e;", "Lkh0/k;", "c", "(Lkh0/k;)Lay0/e;", "airquality_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: jy0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C2535a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f106479a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f106480b;

        static {
            int[] iArr = new int[l.values().length];
            try {
                iArr[l.A.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.B.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l.C.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[l.D.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[l.E.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[l.F.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[l.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f106479a = iArr;
            int[] iArr2 = new int[k.values().length];
            try {
                iArr2[k.A.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[k.B.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[k.C.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[k.D.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[k.E.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[k.F.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[k.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            f106480b = iArr2;
        }
    }

    public static final AirQualityWidgetPoint a(BEAirQualityWidgetPoint bEAirQualityWidgetPoint) {
        return new AirQualityWidgetPoint(bEAirQualityWidgetPoint.getId(), bEAirQualityWidgetPoint.getTimestamp(), c(bEAirQualityWidgetPoint.getQualityRate()), b(bEAirQualityWidgetPoint.getLocation()));
    }

    private static final WidgetLocation b(BELocation bELocation) {
        return new WidgetLocation(bELocation.getCity(), bELocation.getStreet());
    }

    private static final e c(k kVar) {
        switch (C2535a.f106480b[kVar.ordinal()]) {
            case 1:
                return e.A;
            case 2:
                return e.B;
            case 3:
                return e.C;
            case 4:
                return e.D;
            case 5:
                return e.E;
            case 6:
                return e.F;
            case 7:
                return e.UNKNOWN;
            default:
                throw new p();
        }
    }

    public static final AirQualityWidgetPoint d(BEFavoriteMeasurementPoint bEFavoriteMeasurementPoint) {
        if (bEFavoriteMeasurementPoint == null) {
            return null;
        }
        return new AirQualityWidgetPoint(bEFavoriteMeasurementPoint.getId(), bEFavoriteMeasurementPoint.getTimestamp(), e(bEFavoriteMeasurementPoint.getQuality()), new WidgetLocation(bEFavoriteMeasurementPoint.getPlace().getCity(), bEFavoriteMeasurementPoint.getPlace().getStreet()));
    }

    private static final e e(l lVar) {
        switch (C2535a.f106479a[lVar.ordinal()]) {
            case 1:
                return e.A;
            case 2:
                return e.B;
            case 3:
                return e.C;
            case 4:
                return e.D;
            case 5:
                return e.E;
            case 6:
                return e.F;
            case 7:
                return e.UNKNOWN;
            default:
                throw new p();
        }
    }
}
