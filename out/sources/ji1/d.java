package ji1;

import iq0.DashboardServiceEntry;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.eac.EACTags;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Liq0/p;", "Lji1/c;", "a", "(Liq0/p;)Lji1/c;", "dashboard_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f103400a;

        static {
            int[] iArr = new int[rq0.c.values().length];
            try {
                iArr[rq0.c.ZUS_VISIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[rq0.c.PENALTY_POINTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[rq0.c.TRAIN_TICKETS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[rq0.c.ABROAD_INFO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[rq0.c.MEDICAL_PRESCRIPTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[rq0.c.GIOS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[rq0.c.QUALIFIED_SIGNATURE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[rq0.c.GAS_SUPPLEMENT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[rq0.c.COAL_SUPPLEMENT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[rq0.c.ENERGY_LIMIT_STATEMENT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[rq0.c.ENERGY_VOUCHER.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[rq0.c.SAFE_BUS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[rq0.c.VEHICLE_HISTORY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[rq0.c.PESEL_RESTRICTION.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[rq0.c.CRACOW_CITY_CARD.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[rq0.c.E_PAYMENTS.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[rq0.c.AIR_QUALITY.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[rq0.c.ELECTORAL_REGISTER.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[rq0.c.GIVE_ELECTORAL_SUPPORT.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[rq0.c.FINES.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[rq0.c.PESEL_RESTRICTION_VERIFICATION.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[rq0.c.MY_CASES.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[rq0.c.DOCUMENT_SIGNING.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[rq0.c.COMPANY.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[rq0.c.VEHICLE_COLLISION.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[rq0.c.NETWORK_SECURITY_ISSUES.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[rq0.c.FLOOD_ALERT.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[rq0.c.APPLICATION_FORM_SERVICES.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[rq0.c.IDENTITY_CARD_SUSPENSION.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[rq0.c.IDENTITY_CARD_INVALIDATION.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[rq0.c.DRIVER_QUALIFICATIONS.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[rq0.c.DOCUMENT_RESTRICTION.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[rq0.c.ID_CARD_VERIFICATION.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[rq0.c.ID_CARD_COLLECTING.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[rq0.c.MY_IKP.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[rq0.c.DEFENCE_TRAINING.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[rq0.c.LAND_REGISTRY.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[rq0.c.CHECK_VEHICLE_INSURANCE.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[rq0.c.NATIONAL_COURT_REGISTER.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[rq0.c.MILITARY_ALERT.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[rq0.c.SAFETY_GUIDE.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[rq0.c.PASSPORT_PICKUP.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[rq0.c.INTERNET_ACCESS.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[rq0.c.TRAVEL_ABROAD.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[rq0.c.JUNIOR_SCHOOL_EDUCATION.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[rq0.c.SANITARY_VIOLATION.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[rq0.c.VEHICLE_REGISTRATION.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[rq0.c.EUROPE_READINESS.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            f103400a = iArr;
        }
    }

    public static final c a(DashboardServiceEntry dashboardServiceEntry) {
        switch (a.f103400a[dashboardServiceEntry.getType().ordinal()]) {
            case 1:
                return new c.ZusVisit(dashboardServiceEntry.getName());
            case 2:
                return new c.PenaltyPoints(dashboardServiceEntry.getName());
            case 3:
                return new c.TrainTickets(dashboardServiceEntry.getName());
            case 4:
                return new c.AbroadInfo(dashboardServiceEntry.getName());
            case 5:
                return new c.MedicalPrescriptions(dashboardServiceEntry.getName());
            case 6:
                return new c.EnvironmentalViolation(dashboardServiceEntry.getName());
            case 7:
                return new c.QualifiedSignature(dashboardServiceEntry.getName());
            case 8:
                return new c.GasSupplement(dashboardServiceEntry.getName(), dashboardServiceEntry.getSupplementOrigin());
            case 9:
                return new c.CoalSupplement(dashboardServiceEntry.getName(), dashboardServiceEntry.getSupplementOrigin());
            case 10:
                return new c.EnergyLimitStatement(dashboardServiceEntry.getName(), dashboardServiceEntry.getSupplementOrigin(), dashboardServiceEntry.getWebUrl());
            case 11:
                return new c.EnergyVoucher(dashboardServiceEntry.getName(), dashboardServiceEntry.getSupplementOrigin());
            case 12:
                return new c.SafeBusStatement(dashboardServiceEntry.getName());
            case 13:
                return new c.VehicleHistoryStatement(dashboardServiceEntry.getName());
            case 14:
                return new c.PeselRestriction(dashboardServiceEntry.getName());
            case 15:
                return new c.CracowCityCard(dashboardServiceEntry.getName());
            case 16:
                return new c.Payments(dashboardServiceEntry.getName());
            case 17:
                return new c.AirQuality(dashboardServiceEntry.getName());
            case 18:
                return new c.ElectoralRegister(dashboardServiceEntry.getName());
            case 19:
                return new c.ElectoralSupport(dashboardServiceEntry.getName());
            case 20:
                return new c.Fines(dashboardServiceEntry.getName());
            case 21:
                return new c.PeselRestrictionVerification(dashboardServiceEntry.getName());
            case 22:
                return new c.Cases(dashboardServiceEntry.getName());
            case 23:
                return new c.DocumentSigning(dashboardServiceEntry.getName());
            case 24:
                return new c.Company(dashboardServiceEntry.getName());
            case 25:
                return new c.VehicleCollision(dashboardServiceEntry.getName());
            case 26:
                return new c.NetworkSecurityIssues(dashboardServiceEntry.getName());
            case 27:
                return new c.FloodAlert(dashboardServiceEntry.getName());
            case 28:
                return new c.ApplicationForms(dashboardServiceEntry.getName());
            case 29:
                return new c.IdentityCardSuspension(dashboardServiceEntry.getName());
            case 30:
                return new c.IdentityCardInvalidation(dashboardServiceEntry.getName());
            case BERTags.DATE /* 31 */:
                return new c.DriverQualifications(dashboardServiceEntry.getName());
            case 32:
                return new c.DocumentRestriction(dashboardServiceEntry.getName());
            case 33:
                return new c.IdCardVerification(dashboardServiceEntry.getName());
            case 34:
                return new c.IdCardCollecting(dashboardServiceEntry.getName());
            case 35:
                return new c.MyIkp(dashboardServiceEntry.getName());
            case 36:
                return new c.DefenceTraining(dashboardServiceEntry.getName());
            case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                return new c.LandRegistry(dashboardServiceEntry.getName());
            case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                return new c.CheckVehicleInsurance(dashboardServiceEntry.getName());
            case EACTags.INTERCHANGE_CONTROL /* 39 */:
                return new c.NationalCourtRegister(dashboardServiceEntry.getName());
            case 40:
                return new c.MilitaryAlert(dashboardServiceEntry.getName());
            case EACTags.INTERCHANGE_PROFILE /* 41 */:
                return new c.SafetyGuide(dashboardServiceEntry.getName());
            case EACTags.CURRENCY_CODE /* 42 */:
                return new c.PassportPickup(dashboardServiceEntry.getName());
            case EACTags.DATE_OF_BIRTH /* 43 */:
                return new c.InternetAccess(dashboardServiceEntry.getName());
            case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                return new c.TravelAbroad(dashboardServiceEntry.getName());
            case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                return new c.JuniorSchoolEducation(dashboardServiceEntry.getName());
            case 46:
                return new c.Sanitary(dashboardServiceEntry.getName());
            case 47:
                return new c.VehicleRegistration(dashboardServiceEntry.getName());
            case 48:
                return new c.EuropeReadiness(dashboardServiceEntry.getName());
            default:
                return new c.Undefined(dashboardServiceEntry.getName(), dashboardServiceEntry.getSupplementOrigin(), dashboardServiceEntry.getWebUrl());
        }
    }
}
