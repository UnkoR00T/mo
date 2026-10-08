package ew0;

import fw0.BasicDataDto;
import fw0.DatesDataDto;
import fw0.HomologationDataDto;
import fw0.StatusDataDto;
import fw0.TechnicalDataDto;
import fw0.VehicleDto;
import fw0.m1;
import fw0.n1;
import oq.p;
import p071kotlin.Metadata;
import uv0.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0013\u0010\u001e\u001a\u00020\u001d*\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lfw0/p3;", "Lrv0/c;", "h", "(Lfw0/p3;)Lrv0/c;", "Lfw0/f;", "Lrv0/c$a;", "c", "(Lfw0/f;)Lrv0/c$a;", "Lfw0/v0;", "Lrv0/c$c;", "e", "(Lfw0/v0;)Lrv0/c$c;", "Lfw0/w1;", "Lrv0/c$e;", "g", "(Lfw0/w1;)Lrv0/c$e;", "Lfw0/t;", "Lrv0/c$b;", "d", "(Lfw0/t;)Lrv0/c$b;", "Lfw0/u1;", "Lrv0/c$d;", "f", "(Lfw0/u1;)Lrv0/c$d;", "Lfw0/m1;", "Lrv0/a;", "a", "(Lfw0/m1;)Lrv0/a;", "Lfw0/n1;", "Lrv0/b;", "b", "(Lfw0/n1;)Lrv0/b;", "vehicleservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f53838a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f53839b;

        static {
            int[] iArr = new int[m1.values().length];
            try {
                iArr[m1.REGISTERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m1.DEREGISTERED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m1.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f53838a = iArr;
            int[] iArr2 = new int[n1.values().length];
            try {
                iArr2[n1.STOLEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[n1.TEMPORARILY_WITHDRAWN_FROM_CIRCULATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[n1.INVALID_DOCUMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[n1.OK.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[n1.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            f53839b = iArr2;
        }
    }

    private static final rv0.a a(m1 m1Var) {
        int i15 = a.f53838a[m1Var.ordinal()];
        if (i15 == 1) {
            return rv0.a.REGISTERED;
        }
        if (i15 == 2) {
            return rv0.a.DEREGISTERED;
        }
        if (i15 == 3) {
            return rv0.a.UNKNOWN;
        }
        throw new p();
    }

    private static final rv0.b b(n1 n1Var) {
        int i15 = a.f53839b[n1Var.ordinal()];
        if (i15 == 1) {
            return rv0.b.STOLEN;
        }
        if (i15 == 2) {
            return rv0.b.TEMPORARILY_WITHDRAWN_FROM_CIRCULATION;
        }
        if (i15 == 3) {
            return rv0.b.INVALID_DOCUMENT;
        }
        if (i15 == 4) {
            return rv0.b.OK;
        }
        if (i15 == 5) {
            return rv0.b.UNKNOWN;
        }
        throw new p();
    }

    private static final rv0.c.BasicData c(BasicDataDto basicDataDto) {
        return new rv0.c.BasicData(basicDataDto.getBrand(), v.d(basicDataDto.getVin()), uv0.d.c(basicDataDto.getNumberPlate()), basicDataDto.getYearOfProduction(), basicDataDto.getRegistrationAuthorityCode(), basicDataDto.getType(), basicDataDto.getModel(), null);
    }

    private static final rv0.c.DatesData d(DatesDataDto datesDataDto) {
        return new rv0.c.DatesData(datesDataDto.getRegistrationDocumentDateOfIssue(), datesDataDto.getNextCivilLiabilityInsuranceDate(), datesDataDto.getVehicleTechnicalInspectionEndDate());
    }

    private static final rv0.c.HomologationData e(HomologationDataDto homologationDataDto) {
        return new rv0.c.HomologationData(homologationDataDto.getHomologationCategory(), homologationDataDto.getHomologationVersion(), homologationDataDto.getHomologationCertificateNumber(), homologationDataDto.getHomologationVariant());
    }

    private static final rv0.c.StatusData f(StatusDataDto statusDataDto) {
        return new rv0.c.StatusData(statusDataDto.getCivilLiabilityInsurance(), a(statusDataDto.getRegistrationStatus()), statusDataDto.getValidVehicleTechnicalInspection(), b(statusDataDto.getReportStatus()));
    }

    private static final rv0.c.TechnicalData g(TechnicalDataDto technicalDataDto) {
        return new rv0.c.TechnicalData(technicalDataDto.getTotalNumberOfSeats(), technicalDataDto.getNumberOfSeats(), technicalDataDto.getNumberOfStandingPlaces(), technicalDataDto.getCurbWeight(), technicalDataDto.getPermissibleGrossWeight(), technicalDataDto.getNumberOfAxles(), technicalDataDto.getLastRegisteredMeterOneReading(), technicalDataDto.getUnitOfMeterOne(), technicalDataDto.getLastRegisteredMeterTwoReading(), technicalDataDto.getUnitOfMeterTwo());
    }

    public static final rv0.c h(VehicleDto vehicleDto) {
        return new rv0.c(c(vehicleDto.getBasicData()), e(vehicleDto.getHomologationData()), g(vehicleDto.getTechnicalData()), d(vehicleDto.getDatesData()), f(vehicleDto.getStatusData()));
    }
}
