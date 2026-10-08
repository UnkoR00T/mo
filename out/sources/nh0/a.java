package nh0;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kh0.BEAirQualityRateDictionary;
import kh0.BEAirQualityWidgetPoint;
import kh0.BEBasicMeasurementPoint;
import kh0.BEExtendedMeasurementPoint;
import kh0.BEExtendedQuality;
import kh0.BEFavoriteMeasurementPoint;
import kh0.BEFavoritePointsContainer;
import kh0.BELocation;
import kh0.BEPlace;
import kh0.k;
import kh0.l;
import oh0.AirQualityWidgetLocationDto;
import oh0.AirQualityWidgetPointDto;
import oh0.FavouritePointWithDictionaryContainerDto;
import oh0.FavouriteSmogMeasurementPointDto;
import oh0.SmogMeasurementPartialDetailsDto;
import oh0.SmogMeasurementPointContainerDto;
import oh0.SmogMeasurementPointDetailsDto;
import oh0.SmogMeasurementPointDetailsDtoExtended;
import oh0.SmogRateDictionaryDto;
import oh0.h;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import vy.Coordinates;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\u000b\u001a\u00020\n*\u00020\t¢\u0006\u0004\b\u000b\u0010\f\u001a\u0011\u0010\u000f\u001a\u00020\u000e*\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0011\u0010\u0012\u001a\u00020\u0006*\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0005*\b\u0012\u0004\u0012\u00020\u00140\u0005¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0011\u0010\u0018\u001a\u00020\u0015*\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0011\u0010\u001b\u001a\u00020\u0006*\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0011\u0010\u001f\u001a\u00020\u001e*\u00020\u001d¢\u0006\u0004\b\u001f\u0010 \u001a\u0011\u0010#\u001a\u00020\"*\u00020!¢\u0006\u0004\b#\u0010$\u001a\u0011\u0010'\u001a\u00020&*\u00020%¢\u0006\u0004\b'\u0010(\u001a\u0011\u0010+\u001a\u00020**\u00020)¢\u0006\u0004\b+\u0010,¨\u0006-"}, d2 = {"Loh0/d;", "Lkh0/h;", "i", "(Loh0/d;)Lkh0/h;", "Loh0/k;", "", "Lkh0/c;", "c", "(Loh0/k;)Ljava/util/List;", "Loh0/m;", "Lkh0/e;", "g", "(Loh0/m;)Lkh0/e;", "Loh0/e;", "Lkh0/g;", "h", "(Loh0/e;)Lkh0/g;", "Loh0/l;", "a", "(Loh0/l;)Lkh0/c;", "Loh0/n;", "Lkh0/a;", "b", "(Ljava/util/List;)Ljava/util/List;", "d", "(Loh0/n;)Lkh0/a;", "Loh0/j;", "f", "(Loh0/j;)Lkh0/c;", "Loh0/h;", "Lkh0/l;", "l", "(Loh0/h;)Lkh0/l;", "Loh0/c;", "Lkh0/b;", "e", "(Loh0/c;)Lkh0/b;", "Loh0/c$a;", "Lkh0/k;", "k", "(Loh0/c$a;)Lkh0/k;", "Loh0/b;", "Lkh0/i;", "j", "(Loh0/b;)Lkh0/i;", "airqualityservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: nh0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C3361a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f136317a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f136318b;

        static {
            int[] iArr = new int[h.values().length];
            try {
                iArr[h.A.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.B.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h.C.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[h.D.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[h.E.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[h.F.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f136317a = iArr;
            int[] iArr2 = new int[AirQualityWidgetPointDto.a.values().length];
            try {
                iArr2[AirQualityWidgetPointDto.a.A.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[AirQualityWidgetPointDto.a.B.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[AirQualityWidgetPointDto.a.C.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[AirQualityWidgetPointDto.a.D.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[AirQualityWidgetPointDto.a.E.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[AirQualityWidgetPointDto.a.F.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[AirQualityWidgetPointDto.a.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            f136318b = iArr2;
        }
    }

    public static final BEBasicMeasurementPoint a(SmogMeasurementPointDetailsDto smogMeasurementPointDetailsDto) {
        return new BEBasicMeasurementPoint(smogMeasurementPointDetailsDto.getLocation().getId(), new Coordinates(smogMeasurementPointDetailsDto.getLocation().getLatitude().doubleValue(), smogMeasurementPointDetailsDto.getLocation().getLongitude().doubleValue()), new BEPlace(smogMeasurementPointDetailsDto.getLocation().getName(), smogMeasurementPointDetailsDto.getLocation().getStreet(), smogMeasurementPointDetailsDto.getLocation().getPostcode(), smogMeasurementPointDetailsDto.getLocation().getCity()), l(smogMeasurementPointDetailsDto.getAirQuality().getRateCode()), smogMeasurementPointDetailsDto.getFavourite(), smogMeasurementPointDetailsDto.getExpired());
    }

    public static final List<BEAirQualityRateDictionary> b(List<SmogRateDictionaryDto> list) {
        List<SmogRateDictionaryDto> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(d((SmogRateDictionaryDto) it.next()));
        }
        return arrayList;
    }

    public static final List<BEBasicMeasurementPoint> c(SmogMeasurementPointContainerDto smogMeasurementPointContainerDto) {
        List<SmogMeasurementPartialDetailsDto> listA = smogMeasurementPointContainerDto.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(f((SmogMeasurementPartialDetailsDto) it.next()));
        }
        return arrayList;
    }

    public static final BEAirQualityRateDictionary d(SmogRateDictionaryDto smogRateDictionaryDto) {
        l lVarL = l(smogRateDictionaryDto.getCode());
        String description = smogRateDictionaryDto.getDescription();
        BigDecimal pm25minValue = smogRateDictionaryDto.getPm25minValue();
        Float fValueOf = pm25minValue != null ? Float.valueOf(pm25minValue.floatValue()) : null;
        BigDecimal pm25MaxValue = smogRateDictionaryDto.getPm25MaxValue();
        return new BEAirQualityRateDictionary(lVarL, description, fValueOf, pm25MaxValue != null ? Float.valueOf(pm25MaxValue.floatValue()) : null);
    }

    public static final BEAirQualityWidgetPoint e(AirQualityWidgetPointDto airQualityWidgetPointDto) {
        return new BEAirQualityWidgetPoint(airQualityWidgetPointDto.getLocation().getId(), airQualityWidgetPointDto.getTimestamp(), k(airQualityWidgetPointDto.getRateCode()), j(airQualityWidgetPointDto.getLocation()));
    }

    public static final BEBasicMeasurementPoint f(SmogMeasurementPartialDetailsDto smogMeasurementPartialDetailsDto) {
        return new BEBasicMeasurementPoint(smogMeasurementPartialDetailsDto.getLocation().getId(), new Coordinates(smogMeasurementPartialDetailsDto.getLocation().getLatitude().doubleValue(), smogMeasurementPartialDetailsDto.getLocation().getLongitude().doubleValue()), new BEPlace(smogMeasurementPartialDetailsDto.getLocation().getName(), smogMeasurementPartialDetailsDto.getLocation().getStreet(), smogMeasurementPartialDetailsDto.getLocation().getPostcode(), smogMeasurementPartialDetailsDto.getLocation().getCity()), l(smogMeasurementPartialDetailsDto.getAirQuality().getRateCode()), smogMeasurementPartialDetailsDto.getFavourite(), !smogMeasurementPartialDetailsDto.getActive());
    }

    public static final BEExtendedMeasurementPoint g(SmogMeasurementPointDetailsDtoExtended smogMeasurementPointDetailsDtoExtended) {
        String id5 = smogMeasurementPointDetailsDtoExtended.getLocation().getId();
        Coordinates coordinates = new Coordinates(smogMeasurementPointDetailsDtoExtended.getLocation().getLatitude().doubleValue(), smogMeasurementPointDetailsDtoExtended.getLocation().getLongitude().doubleValue());
        BEPlace bEPlace = new BEPlace(smogMeasurementPointDetailsDtoExtended.getLocation().getName(), smogMeasurementPointDetailsDtoExtended.getLocation().getStreet(), smogMeasurementPointDetailsDtoExtended.getLocation().getPostcode(), smogMeasurementPointDetailsDtoExtended.getLocation().getCity());
        l lVarL = l(smogMeasurementPointDetailsDtoExtended.getAirQuality().getRateCode());
        BigDecimal humidityAvg = smogMeasurementPointDetailsDtoExtended.getAirQuality().getHumidityAvg();
        Float fValueOf = humidityAvg != null ? Float.valueOf(humidityAvg.floatValue()) : null;
        BigDecimal pressureAvg = smogMeasurementPointDetailsDtoExtended.getAirQuality().getPressureAvg();
        Float fValueOf2 = pressureAvg != null ? Float.valueOf(pressureAvg.floatValue()) : null;
        BigDecimal temperatureAvg = smogMeasurementPointDetailsDtoExtended.getAirQuality().getTemperatureAvg();
        Float fValueOf3 = temperatureAvg != null ? Float.valueOf(temperatureAvg.floatValue()) : null;
        BigDecimal pm10Avg = smogMeasurementPointDetailsDtoExtended.getAirQuality().getPm10Avg();
        Float fValueOf4 = pm10Avg != null ? Float.valueOf(pm10Avg.floatValue()) : null;
        BigDecimal pm25Avg = smogMeasurementPointDetailsDtoExtended.getAirQuality().getPm25Avg();
        BEExtendedQuality bEExtendedQuality = new BEExtendedQuality(lVarL, fValueOf, fValueOf2, fValueOf3, fValueOf4, pm25Avg != null ? Float.valueOf(pm25Avg.floatValue()) : null);
        List<SmogMeasurementPointDetailsDto> listB = smogMeasurementPointDetailsDtoExtended.b();
        ArrayList arrayList = new ArrayList(v.y(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(a((SmogMeasurementPointDetailsDto) it.next()));
        }
        return new BEExtendedMeasurementPoint(id5, coordinates, bEPlace, bEExtendedQuality, arrayList, smogMeasurementPointDetailsDtoExtended.getTimestamp(), smogMeasurementPointDetailsDtoExtended.getExpirationTimestamp(), smogMeasurementPointDetailsDtoExtended.getFavourite(), smogMeasurementPointDetailsDtoExtended.getExpired());
    }

    public static final BEFavoriteMeasurementPoint h(FavouriteSmogMeasurementPointDto favouriteSmogMeasurementPointDto) {
        return new BEFavoriteMeasurementPoint(favouriteSmogMeasurementPointDto.getLocation().getId(), new Coordinates(favouriteSmogMeasurementPointDto.getLocation().getLatitude().doubleValue(), favouriteSmogMeasurementPointDto.getLocation().getLongitude().doubleValue()), new BEPlace(favouriteSmogMeasurementPointDto.getLocation().getName(), favouriteSmogMeasurementPointDto.getLocation().getStreet(), favouriteSmogMeasurementPointDto.getLocation().getPostcode(), favouriteSmogMeasurementPointDto.getLocation().getCity()), l(favouriteSmogMeasurementPointDto.getAirQuality().getRateCode()), favouriteSmogMeasurementPointDto.getTimestamp(), favouriteSmogMeasurementPointDto.getActive());
    }

    public static final BEFavoritePointsContainer i(FavouritePointWithDictionaryContainerDto favouritePointWithDictionaryContainerDto) {
        List<BEAirQualityRateDictionary> listB = b(favouritePointWithDictionaryContainerDto.c());
        List<FavouriteSmogMeasurementPointDto> listB2 = favouritePointWithDictionaryContainerDto.b();
        ArrayList arrayList = new ArrayList(v.y(listB2, 10));
        Iterator<T> it = listB2.iterator();
        while (it.hasNext()) {
            arrayList.add(h((FavouriteSmogMeasurementPointDto) it.next()));
        }
        return new BEFavoritePointsContainer(arrayList, favouritePointWithDictionaryContainerDto.getWidgetPointId(), favouritePointWithDictionaryContainerDto.getFavouritePointsLimitReached(), listB);
    }

    public static final BELocation j(AirQualityWidgetLocationDto airQualityWidgetLocationDto) {
        return new BELocation(airQualityWidgetLocationDto.getCity(), airQualityWidgetLocationDto.getStreet());
    }

    public static final k k(AirQualityWidgetPointDto.a aVar) {
        switch (C3361a.f136318b[aVar.ordinal()]) {
            case 1:
                return k.A;
            case 2:
                return k.B;
            case 3:
                return k.C;
            case 4:
                return k.D;
            case 5:
                return k.E;
            case 6:
                return k.F;
            case 7:
                return k.UNKNOWN;
            default:
                throw new p();
        }
    }

    public static final l l(h hVar) {
        try {
            switch (C3361a.f136317a[hVar.ordinal()]) {
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
                default:
                    return l.UNKNOWN;
            }
        } catch (NullPointerException unused) {
            return l.UNKNOWN;
        }
    }
}
