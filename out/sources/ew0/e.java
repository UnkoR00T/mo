package ew0;

import fw0.AbroadBasicDataDto;
import fw0.AbroadServiceErrorDto;
import fw0.AutoDnaDto;
import fw0.CarVerticalDto;
import fw0.CarfaxDto;
import fw0.OdometerDataDto;
import fw0.RiskDto;
import fw0.VehicleHistoryAbroadDto;
import fw0.VehicleHistoryBasicDataDto;
import fw0.VehicleHistoryDocumentDto;
import fw0.VehicleHistoryDto;
import fw0.VehicleHistoryEventDetailDto;
import fw0.VehicleHistoryEventDto;
import fw0.VehicleHistoryHomologationDataDto;
import fw0.VehicleHistoryTechnicalDataDto;
import fw0.VehicleHistoryTimelineDto;
import fw0.b0;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oq.p;
import org.bouncycastle.asn1.BERTags;
import p071kotlin.Metadata;
import pq.v;
import uv0.AbroadBasicData;
import uv0.AutoDna;
import uv0.CarVertical;
import uv0.Carfax;
import uv0.Risk;
import uv0.VehicleHistory;
import uv0.VehicleHistoryAbroad;
import uv0.VehicleHistoryEvent;
import uv0.VehicleHistoryEventDetail;
import uv0.VehicleHistoryTimeline;
import uv0.j;
import uv0.l;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0013\u0010\u001e\u001a\u00020\u001d*\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0013\u0010\"\u001a\u00020!*\u00020 H\u0002¢\u0006\u0004\b\"\u0010#\u001a\u0013\u0010&\u001a\u00020%*\u00020$H\u0002¢\u0006\u0004\b&\u0010'\u001a\u0013\u0010*\u001a\u00020)*\u00020(H\u0002¢\u0006\u0004\b*\u0010+\u001a\u0013\u0010-\u001a\u00020,*\u00020(H\u0002¢\u0006\u0004\b-\u0010.\u001a\u0013\u00101\u001a\u000200*\u00020/H\u0002¢\u0006\u0004\b1\u00102\u001a\u0013\u00105\u001a\u000204*\u000203H\u0002¢\u0006\u0004\b5\u00106\u001a\u0013\u00109\u001a\u000208*\u000207H\u0000¢\u0006\u0004\b9\u0010:\u001a\u0013\u0010=\u001a\u00020<*\u00020;H\u0002¢\u0006\u0004\b=\u0010>\u001a\u0017\u0010A\u001a\u00020@2\u0006\u0010?\u001a\u00020;H\u0002¢\u0006\u0004\bA\u0010B\u001a\u0013\u0010E\u001a\u00020D*\u00020CH\u0002¢\u0006\u0004\bE\u0010F\"\u001a\u0010J\u001a\u0004\u0018\u00010G*\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u0010I\"\u001a\u0010L\u001a\u0004\u0018\u00010G*\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bK\u0010I¨\u0006M"}, d2 = {"Lfw0/t3;", "Luv0/m;", "o", "(Lfw0/t3;)Luv0/m;", "Lfw0/r3;", "Luv0/m$a;", "k", "(Lfw0/r3;)Luv0/m$a;", "Lfw0/x3;", "Luv0/m$d;", "n", "(Lfw0/x3;)Luv0/m$d;", "Lfw0/s3;", "Luv0/m$b;", "l", "(Lfw0/s3;)Luv0/m$b;", "Lfw0/w3;", "Luv0/m$c;", "m", "(Lfw0/w3;)Luv0/m$c;", "Lfw0/q3;", "Luv0/n;", "p", "(Lfw0/q3;)Luv0/n;", "Lfw0/j;", "Luv0/f;", "h", "(Lfw0/j;)Luv0/f;", "Lfw0/a;", "Luv0/a;", "d", "(Lfw0/a;)Luv0/a;", "Lfw0/e;", "Luv0/c;", "f", "(Lfw0/e;)Luv0/c;", "Lfw0/i;", "Luv0/e;", "g", "(Lfw0/i;)Luv0/e;", "Lfw0/c;", "Luv0/b;", "e", "(Lfw0/c;)Luv0/b;", "Luv0/g;", "c", "(Lfw0/c;)Luv0/g;", "Lfw0/d1;", "Luv0/j;", "i", "(Lfw0/d1;)Luv0/j;", "Lfw0/q1;", "Luv0/k;", "j", "(Lfw0/q1;)Luv0/k;", "Lfw0/y3;", "Luv0/t;", "s", "(Lfw0/y3;)Luv0/t;", "Lfw0/v3;", "Luv0/q;", "q", "(Lfw0/v3;)Luv0/q;", "vehicleHistoryEventDto", "Luv0/l;", "t", "(Lfw0/v3;)Luv0/l;", "Lfw0/u3;", "Luv0/r;", "r", "(Lfw0/u3;)Luv0/r;", "Luv0/m$d$a;", "a", "(Lfw0/x3;)Luv0/m$d$a;", "alternativeFuel", "b", "alternativeFuel2", "vehicleservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class e {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f53851a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f53852b;

        static {
            int[] iArr = new int[fw0.b.values().length];
            try {
                iArr[fw0.b.VEHICLE_HISTORY_NOT_FOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fw0.b.INTERNAL_SERVER_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fw0.b.CAR_VERTICAL_NOT_AVAILABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[fw0.b.UNSPECIFIED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[fw0.b.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f53851a = iArr;
            int[] iArr2 = new int[b0.values().length];
            try {
                iArr2[b0.TECHNICAL_INSPECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[b0.FIRST_OWNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[b0.FIRST_REGISTRATION_IN_POLAND.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[b0.TECHNICAL_INSPECTION_PERIODIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[b0.SIGNIFICANT_DAMAGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[b0.FIRST_REGISTRATION.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[b0.READMISSION_TO_TRAFFIC.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[b0.OWNER_CHANGE.ordinal()] = 8;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[b0.REGISTRATION_PLACE_CHANGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[b0.COOWNER_ADD.ordinal()] = 10;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[b0.OWNER_ADD.ordinal()] = 11;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[b0.STOLEN.ordinal()] = 12;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[b0.STOLEN_FOUND.ordinal()] = 13;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[b0.FOUND.ordinal()] = 14;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[b0.WITHDRAWN_FROM_CIRCULATION.ordinal()] = 15;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[b0.DEREGISTERED.ordinal()] = 16;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[b0.OTHER.ordinal()] = 17;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[b0.END_OF_TEMPORARILY_REGISTRATION.ordinal()] = 18;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[b0.REREGISTRATION.ordinal()] = 19;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[b0.DISPOSAL.ordinal()] = 20;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[b0.PURCHASE.ordinal()] = 21;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr2[b0.DISPOSAL_PURCHASE.ordinal()] = 22;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr2[b0.TECHNICAL_INSPECTION_COUNTER_ROLLED_BACK.ordinal()] = 23;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr2[b0.TECHNICAL_INSPECTION_ADDITIONAL.ordinal()] = 24;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr2[b0.TECHNICAL_INSPECTION_ADDITIONAL_COUNTER_ROLLED_BACK.ordinal()] = 25;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr2[b0.TECHNICAL_INSPECTION_PERIODIC_ADDITIONAL.ordinal()] = 26;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr2[b0.INSPECTION_ODOMETER_READING.ordinal()] = 27;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr2[b0.INSPECTION_ODOMETER_READING_COUNTER_ROLLED_BACK.ordinal()] = 28;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr2[b0.EXCHANGED_ODOMETER_READING.ordinal()] = 29;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr2[b0.NUMBER_PLATE_EXPIRATION.ordinal()] = 30;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr2[b0.UNSPECIFIED.ordinal()] = 31;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr2[b0.UNKNOWN.ordinal()] = 32;
            } catch (NoSuchFieldError unused37) {
            }
            f53852b = iArr2;
        }
    }

    private static final VehicleHistory.TechnicalData.AlternativeFuel a(VehicleHistoryTechnicalDataDto vehicleHistoryTechnicalDataDto) {
        String alternativeFuelType = vehicleHistoryTechnicalDataDto.getAlternativeFuelType();
        if (alternativeFuelType != null) {
            return new VehicleHistory.TechnicalData.AlternativeFuel(alternativeFuelType, vehicleHistoryTechnicalDataDto.getAverageAlternativeFuelConsumption(), vehicleHistoryTechnicalDataDto.getAverageEmissionLevelCO2AlternativeFuel());
        }
        return null;
    }

    private static final VehicleHistory.TechnicalData.AlternativeFuel b(VehicleHistoryTechnicalDataDto vehicleHistoryTechnicalDataDto) {
        String alternativeFuelType2 = vehicleHistoryTechnicalDataDto.getAlternativeFuelType2();
        if (alternativeFuelType2 != null) {
            return new VehicleHistory.TechnicalData.AlternativeFuel(alternativeFuelType2, vehicleHistoryTechnicalDataDto.getAverageAlternativeFuelConsumption2(), vehicleHistoryTechnicalDataDto.getAverageEmissionLevelCO2AlternativeFuel2());
        }
        return null;
    }

    private static final uv0.g c(AbroadServiceErrorDto abroadServiceErrorDto) {
        int i15 = a.f53851a[abroadServiceErrorDto.getCode().ordinal()];
        if (i15 == 1) {
            return uv0.g.VEHICLE_HISTORY_NOT_FOUND;
        }
        if (i15 == 2) {
            return uv0.g.INTERNAL_SERVER_ERROR;
        }
        if (i15 == 3 || i15 == 4 || i15 == 5) {
            return uv0.g.UNSPECIFIED;
        }
        throw new p();
    }

    private static final AbroadBasicData d(AbroadBasicDataDto abroadBasicDataDto) {
        return new AbroadBasicData(abroadBasicDataDto.getDescription(), abroadBasicDataDto.getYearOfProduction(), abroadBasicDataDto.getVin(), abroadBasicDataDto.getEngineCapacity(), abroadBasicDataDto.getTransmissionType(), abroadBasicDataDto.getFuelType(), abroadBasicDataDto.getEnginePowerPs(), abroadBasicDataDto.getEnginePower(), abroadBasicDataDto.getEmissionLevelCO2(), abroadBasicDataDto.getColour(), abroadBasicDataDto.getDrive());
    }

    private static final uv0.b e(AbroadServiceErrorDto abroadServiceErrorDto) {
        return new uv0.b(c(abroadServiceErrorDto), abroadServiceErrorDto.getTitle(), abroadServiceErrorDto.getMessage());
    }

    private static final AutoDna f(AutoDnaDto autoDnaDto) {
        List listN;
        List listN2;
        String name = autoDnaDto.getName();
        List<RiskDto> listD = autoDnaDto.d();
        if (listD != null) {
            List<RiskDto> list = listD;
            listN = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                listN.add(j((RiskDto) it.next()));
            }
        } else {
            listN = v.n();
        }
        List<OdometerDataDto> listC = autoDnaDto.c();
        if (listC != null) {
            List<OdometerDataDto> list2 = listC;
            listN2 = new ArrayList(v.y(list2, 10));
            Iterator<T> it4 = list2.iterator();
            while (it4.hasNext()) {
                listN2.add(i((OdometerDataDto) it4.next()));
            }
        } else {
            listN2 = v.n();
        }
        AbroadServiceErrorDto error = autoDnaDto.getError();
        return new AutoDna(name, listN, listN2, error != null ? e(error) : null);
    }

    private static final CarVertical g(CarVerticalDto carVerticalDto) {
        List listN;
        List listN2;
        String name = carVerticalDto.getName();
        List<RiskDto> listD = carVerticalDto.d();
        if (listD != null) {
            List<RiskDto> list = listD;
            listN = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                listN.add(j((RiskDto) it.next()));
            }
        } else {
            listN = v.n();
        }
        List<OdometerDataDto> listC = carVerticalDto.c();
        if (listC != null) {
            List<OdometerDataDto> list2 = listC;
            listN2 = new ArrayList(v.y(list2, 10));
            Iterator<T> it4 = list2.iterator();
            while (it4.hasNext()) {
                listN2.add(i((OdometerDataDto) it4.next()));
            }
        } else {
            listN2 = v.n();
        }
        AbroadServiceErrorDto error = carVerticalDto.getError();
        return new CarVertical(name, listN, listN2, error != null ? e(error) : null);
    }

    private static final Carfax h(CarfaxDto carfaxDto) {
        List listN;
        String name = carfaxDto.getName();
        List<RiskDto> listD = carfaxDto.d();
        if (listD != null) {
            List<RiskDto> list = listD;
            listN = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                listN.add(j((RiskDto) it.next()));
            }
        } else {
            listN = v.n();
        }
        AbroadBasicDataDto abroadBasicDataDto = carfaxDto.getAbroadBasicDataDto();
        AbroadBasicData abroadBasicDataD = abroadBasicDataDto != null ? d(abroadBasicDataDto) : null;
        AbroadServiceErrorDto error = carfaxDto.getError();
        return new Carfax(name, listN, abroadBasicDataD, error != null ? e(error) : null);
    }

    private static final j i(OdometerDataDto odometerDataDto) {
        return new j(odometerDataDto.getDate(), odometerDataDto.getState(), odometerDataDto.getCountry());
    }

    private static final Risk j(RiskDto riskDto) {
        return new Risk(riskDto.getTitle(), riskDto.getIsRisk());
    }

    private static final VehicleHistory.BasicData k(VehicleHistoryBasicDataDto vehicleHistoryBasicDataDto) {
        return new VehicleHistory.BasicData(vehicleHistoryBasicDataDto.getDescription(), uv0.v.d(vehicleHistoryBasicDataDto.getVin()), vehicleHistoryBasicDataDto.getYearOfProduction(), vehicleHistoryBasicDataDto.getIsCivilLiabilityInsurance(), vehicleHistoryBasicDataDto.getIsLost(), vehicleHistoryBasicDataDto.getIsTemporarilyWithdrawnFromCirculation(), vehicleHistoryBasicDataDto.getOdometerState(), vehicleHistoryBasicDataDto.getRegistrationStatus(), vehicleHistoryBasicDataDto.getVehicleTechnicalInspection(), null);
    }

    private static final VehicleHistory.Document l(VehicleHistoryDocumentDto vehicleHistoryDocumentDto) {
        return new VehicleHistory.Document(vehicleHistoryDocumentDto.getRegistrationDocumentDateOfIssue(), vehicleHistoryDocumentDto.getDocumentType(), vehicleHistoryDocumentDto.getDocumentState());
    }

    private static final VehicleHistory.HomologationData m(VehicleHistoryHomologationDataDto vehicleHistoryHomologationDataDto) {
        return new VehicleHistory.HomologationData(vehicleHistoryHomologationDataDto.getHomologationCertificateNumber(), vehicleHistoryHomologationDataDto.getHomologationCategory(), vehicleHistoryHomologationDataDto.getHomologationVersion(), vehicleHistoryHomologationDataDto.getHomologationVariant(), vehicleHistoryHomologationDataDto.getHomologationType());
    }

    private static final VehicleHistory.TechnicalData n(VehicleHistoryTechnicalDataDto vehicleHistoryTechnicalDataDto) {
        return new VehicleHistory.TechnicalData(vehicleHistoryTechnicalDataDto.getIsEuroNorm(), vehicleHistoryTechnicalDataDto.getEnginePower(), vehicleHistoryTechnicalDataDto.getCurbWeight(), vehicleHistoryTechnicalDataDto.getMaxCurbWeight(), vehicleHistoryTechnicalDataDto.getPermissibleGrossWeight(), vehicleHistoryTechnicalDataDto.getPermissibleTotalPayload(), vehicleHistoryTechnicalDataDto.getMaxTrailerWeightWithBrake(), vehicleHistoryTechnicalDataDto.getMaxTrailerWeightNoBrake(), vehicleHistoryTechnicalDataDto.getNumberOfAxles(), vehicleHistoryTechnicalDataDto.getMaxAxleLoad(), vehicleHistoryTechnicalDataDto.getTotalNumberOfSeats(), vehicleHistoryTechnicalDataDto.getNumberOfStandingPlaces(), vehicleHistoryTechnicalDataDto.getNumberOfSeats(), vehicleHistoryTechnicalDataDto.getWheelbase(), vehicleHistoryTechnicalDataDto.getTrackOfWheels(), vehicleHistoryTechnicalDataDto.getFuelType(), vehicleHistoryTechnicalDataDto.getEmissionLevelCO2(), vehicleHistoryTechnicalDataDto.getEmissionLevelEuro(), vehicleHistoryTechnicalDataDto.getAverageFuelConsumption(), vehicleHistoryTechnicalDataDto.getOdometerState(), a(vehicleHistoryTechnicalDataDto), b(vehicleHistoryTechnicalDataDto));
    }

    public static final VehicleHistory o(VehicleHistoryDto vehicleHistoryDto) {
        return new VehicleHistory(k(vehicleHistoryDto.getBasicData()), n(vehicleHistoryDto.getTechnicalData()), l(vehicleHistoryDto.getDocumentData()), m(vehicleHistoryDto.getHomologationData()));
    }

    public static final VehicleHistoryAbroad p(VehicleHistoryAbroadDto vehicleHistoryAbroadDto) {
        return new VehicleHistoryAbroad(h(vehicleHistoryAbroadDto.getCarfaxDto()), f(vehicleHistoryAbroadDto.getAutoDnaDto()), g(vehicleHistoryAbroadDto.getCarVerticalDto()));
    }

    private static final VehicleHistoryEvent q(VehicleHistoryEventDto vehicleHistoryEventDto) {
        List listN;
        LocalDate date = vehicleHistoryEventDto.getDate();
        String name = vehicleHistoryEventDto.getName();
        l lVarT = t(vehicleHistoryEventDto);
        String description = vehicleHistoryEventDto.getDescription();
        List<VehicleHistoryEventDetailDto> listC = vehicleHistoryEventDto.c();
        if (listC != null) {
            List<VehicleHistoryEventDetailDto> list = listC;
            ArrayList arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(r((VehicleHistoryEventDetailDto) it.next()));
            }
            listN = new ArrayList();
            for (Object obj : arrayList) {
                if (!((VehicleHistoryEventDetail) obj).d()) {
                    listN.add(obj);
                }
            }
        } else {
            listN = v.n();
        }
        return new VehicleHistoryEvent(date, name, lVarT, description, listN);
    }

    private static final VehicleHistoryEventDetail r(VehicleHistoryEventDetailDto vehicleHistoryEventDetailDto) {
        String name = vehicleHistoryEventDetailDto.getName();
        String value = vehicleHistoryEventDetailDto.getValue();
        List<String> listA = vehicleHistoryEventDetailDto.a();
        if (listA == null) {
            listA = v.n();
        }
        return new VehicleHistoryEventDetail(name, value, listA);
    }

    public static final VehicleHistoryTimeline s(VehicleHistoryTimelineDto vehicleHistoryTimelineDto) {
        List listN;
        int yearOfProduction = vehicleHistoryTimelineDto.getYearOfProduction();
        List<VehicleHistoryEventDto> listA = vehicleHistoryTimelineDto.a();
        if (listA != null) {
            List<VehicleHistoryEventDto> list = listA;
            listN = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                listN.add(q((VehicleHistoryEventDto) it.next()));
            }
        } else {
            listN = v.n();
        }
        return new VehicleHistoryTimeline(yearOfProduction, listN);
    }

    private static final l t(VehicleHistoryEventDto vehicleHistoryEventDto) {
        b0 type = vehicleHistoryEventDto.getType();
        switch (type == null ? -1 : a.f53852b[type.ordinal()]) {
            case -1:
                return l.UNSPECIFIED;
            case 0:
            default:
                throw new p();
            case 1:
                return l.TECHNICAL_INSPECTION;
            case 2:
                return l.FIRST_OWNER;
            case 3:
                return l.FIRST_REGISTRATION_IN_POLAND;
            case 4:
                return l.TECHNICAL_INSPECTION_PERIODIC;
            case 5:
                return l.SIGNIFICANT_DAMAGE;
            case 6:
                return l.FIRST_REGISTRATION;
            case 7:
                return l.READMISSION_TO_TRAFFIC;
            case 8:
                return l.OWNER_CHANGE;
            case 9:
                return l.REGISTRATION_PLACE_CHANGE;
            case 10:
                return l.COOWNER_ADD;
            case 11:
                return l.OWNER_ADD;
            case 12:
                return l.STOLEN;
            case 13:
                return l.STOLEN_FOUND;
            case 14:
                return l.FOUND;
            case 15:
                return l.WITHDRAWN_FROM_CIRCULATION;
            case 16:
                return l.DEREGISTERED;
            case 17:
                return l.OTHER;
            case 18:
                return l.END_OF_TEMPORARILY_REGISTRATION;
            case 19:
                return l.REREGISTRATION;
            case 20:
                return l.DISPOSAL;
            case 21:
                return l.PURCHASE;
            case 22:
                return l.DISPOSAL_PURCHASE;
            case 23:
                return l.TECHNICAL_INSPECTION_COUNTER_ROLLED_BACK;
            case 24:
                return l.TECHNICAL_INSPECTION_ADDITIONAL;
            case 25:
                return l.TECHNICAL_INSPECTION_ADDITIONAL_COUNTER_ROLLED_BACK;
            case 26:
                return l.TECHNICAL_INSPECTION_PERIODIC_ADDITIONAL;
            case 27:
                return l.INSPECTION_ODOMETER_READING;
            case 28:
                return l.INSPECTION_ODOMETER_READING_COUNTER_ROLLED_BACK;
            case 29:
                return l.EXCHANGED_ODOMETER_READING;
            case 30:
                return l.NUMBER_PLATE_EXPIRATION;
            case BERTags.DATE /* 31 */:
            case 32:
                return l.UNSPECIFIED;
        }
    }
}
