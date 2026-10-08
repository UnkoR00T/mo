package pc4;

import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.eac.EACTags;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf24/i;", "Lrq0/b;", "a", "(Lf24/i;)Lrq0/b;", "mObywatel_prodRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class r2 {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f155704a;

        static {
            int[] iArr = new int[f24.i.values().length];
            try {
                iArr[f24.i.ID_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f24.i.DRIVING_LICENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f24.i.VEHICLE_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[f24.i.FAMILY_CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[f24.i.REFUGEE_CARD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[f24.i.REFUGEE_CHILD_CARD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[f24.i.STUDENT_CARD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[f24.i.RAILWAY_CARD.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[f24.i.PENSIONER_CARD.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[f24.i.DEPUTY_CARD.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[f24.i.ADVOCATE_CARD.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[f24.i.MIDWIFE_CARD.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[f24.i.NURSE_CARD.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[f24.i.RASKA_SENIOR_LICENCE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[f24.i.ZDUNSKOWOLSKA_RESIDENT_LICENCE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[f24.i.OLAWA_RESIDENT_LICENCE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[f24.i.OLAWA_FAMILY_LICENCE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[f24.i.OLAWA_SENIOR_LICENCE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[f24.i.ZDUNSKOWOLSKA_FAMILY_LICENCE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[f24.i.ZDUNSKOWOLSKA_SENIOR_LICENCE.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[f24.i.SUCHY_LAS_FAMILY_LICENCE.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[f24.i.MIEJSKA_AUGUSTOW_TOURIST_LICENCE.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[f24.i.CHELM_FAMILY_LICENCE.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[f24.i.CHELM_SENIOR_LICENCE.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[f24.i.CHELM_RESIDENT_LICENCE.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[f24.i.LODZ_SENIOR_LICENCE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[f24.i.LODZ_FAMILY_LICENCE.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[f24.i.SENATOR_CARD.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[f24.i.RACIBORSKA_RESIDENT_LICENCE.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[f24.i.RACIBORSKA_SENIOR_LICENCE.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[f24.i.RACIBORSKA_FAMILY_LICENCE.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[f24.i.GIZYCKA_RESIDENT_LICENCE.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[f24.i.PZPN_LICENCE.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[f24.i.KOBYLKA_RESIDENT_LICENCE.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[f24.i.WROCLAWSKA_SENIOR_LICENCE.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[f24.i.MIEKINIA_SENIOR_LICENCE.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[f24.i.MIEKINIA_FAMILY_LICENCE.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[f24.i.TOPR_LICENCE.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[f24.i.MAZOVIA_LICENCE.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[f24.i.GENERAL_COUNSEL_LICENCE.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[f24.i.OLECKO_RESIDENT_LICENCE.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[f24.i.BYDGOSZCZ_FAMILY_LICENCE.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[f24.i.WODZISLAW_FAMILY_LICENCE.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[f24.i.MICHALOWICE_RESIDENT_LICENCE.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[f24.i.KOLEJE_DOLNOSLASKIE_LICENCE.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[f24.i.WISLA_RESIDENT_LICENCE.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[f24.i.FIREFIGHTER_OSP_LICENCE.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[f24.i.JASTRZEBIA_GORA_RESIDENT_LICENCE.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[f24.i.DOCTOR.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr[f24.i.DENTIST.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr[f24.i.ATTORNEY_AT_LAW.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr[f24.i.TRAINEE_ATTORNEY_AT_LAW.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr[f24.i.CIVIL_ENGINEER.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr[f24.i.TAX_ADVISOR.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr[f24.i.JUNIOR_SCHOOL_CARD_MOBYWATEL_APP.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr[f24.i.AUDITOR.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr[f24.i.SOLIDARITY_CARD.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr[f24.i.PHD_STUDENT.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr[f24.i.PHYSIOTHERAPIST.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr[f24.i.PHARMACIST.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr[f24.i.SHOOTING_LICENCE.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr[f24.i.SPORT_SHOOTING_COMPETITOR_LICENCE.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr[f24.i.SPORT_SHOOTING_COACH_LICENCE.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr[f24.i.SPORT_SHOOTING_INSTRUCTOR_LICENCE.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr[f24.i.SPORT_SHOOTING_REFEREE_LICENCE_STATIC_SHOOTING.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr[f24.i.SPORT_SHOOTING_REFEREE_LICENCE_DYNAMIC_SHOOTING.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr[f24.i.SPORT_SHOOTING_RANGE_OFFICER_LICENCE.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr[f24.i.DISABLED_PERSON_IDENTIFICATION_CARD.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr[f24.i.TEACHER.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr[f24.i.BAILIFF_CARD.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr[f24.i.ELECTRONIC_DIPLOMA_GRADUATION.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                iArr[f24.i.ELECTRONIC_DIPLOMA_PHD.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                iArr[f24.i.ELECTRONIC_DIPLOMA_DSC.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                iArr[f24.i.LABORATORY_DIAGNOSTICIAN.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                iArr[f24.i.PENSIONER_MSWIA.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            f155704a = iArr;
        }
    }

    public static final rq0.b a(f24.i iVar) {
        switch (a.f155704a[iVar.ordinal()]) {
            case 1:
                return rq0.b.d.ID_CARD;
            case 2:
                return rq0.b.d.DRIVING_LICENCE;
            case 3:
                return rq0.b.d.VEHICLE_CARD;
            case 4:
                return rq0.b.d.FAMILY_CARD;
            case 5:
                return rq0.b.d.DIIA_REFUGEE_CARD;
            case 6:
                return rq0.b.d.DIIA_REFUGEE_CHILD_CARD;
            case 7:
                return rq0.b.d.STUDENT_CARD;
            case 8:
                return rq0.b.d.RAILWAY_CARD;
            case 9:
                return rq0.b.d.PENSIONER_CARD;
            case 10:
                return rq0.b.d.DEPUTY_CARD;
            case 11:
                return rq0.b.d.ADVOCATE_CARD;
            case 12:
                return rq0.b.d.MIDWIFE_CARD;
            case 13:
                return rq0.b.d.NURSE_CARD;
            case 14:
                return rq0.b.e.RASKA_SENIOR_LICENCE;
            case 15:
                return rq0.b.e.ZDUNSKOWOLSKA_RESIDENT_LICENCE;
            case 16:
                return rq0.b.e.OLAWA_RESIDENT_LICENCE;
            case 17:
                return rq0.b.e.OLAWA_FAMILY_LICENCE;
            case 18:
                return rq0.b.e.OLAWA_SENIOR_LICENCE;
            case 19:
                return rq0.b.e.ZDUNSKOWOLSKA_FAMILY_LICENCE;
            case 20:
                return rq0.b.e.ZDUNSKOWOLSKA_SENIOR_LICENCE;
            case 21:
                return rq0.b.e.SUCHY_LAS_FAMILY_LICENCE;
            case 22:
                return rq0.b.e.MIEJSKA_AUGUSTOW_TOURIST_LICENCE;
            case 23:
                return rq0.b.e.CHELM_FAMILY_LICENCE;
            case 24:
                return rq0.b.e.CHELM_SENIOR_LICENCE;
            case 25:
                return rq0.b.e.CHELM_RESIDENT_LICENCE;
            case 26:
                return rq0.b.e.LODZ_SENIOR_LICENCE;
            case 27:
                return rq0.b.e.LODZ_FAMILY_LICENCE;
            case 28:
                return rq0.b.e.SENATOR_CARD;
            case 29:
                return rq0.b.e.RACIBORSKA_RESIDENT_LICENCE;
            case 30:
                return rq0.b.e.RACIBORSKA_SENIOR_LICENCE;
            case BERTags.DATE /* 31 */:
                return rq0.b.e.RACIBORSKA_FAMILY_LICENCE;
            case 32:
                return rq0.b.e.GIZYCKA_RESIDENT_LICENCE;
            case 33:
                return rq0.b.e.PZPN_LICENCE;
            case 34:
                return rq0.b.e.KOBYLKA_RESIDENT_LICENCE;
            case 35:
                return rq0.b.e.WROCLAWSKA_SENIOR_LICENCE;
            case 36:
                return rq0.b.e.MIEKINIA_SENIOR_LICENCE;
            case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                return rq0.b.e.MIEKINIA_FAMILY_LICENCE;
            case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                return rq0.b.e.TOPR_LICENCE;
            case EACTags.INTERCHANGE_CONTROL /* 39 */:
                return rq0.b.e.MAZOVIA_LICENCE;
            case 40:
                return rq0.b.e.GENERAL_COUNSEL_LICENCE;
            case EACTags.INTERCHANGE_PROFILE /* 41 */:
                return rq0.b.e.OLECKO_RESIDENT_LICENCE;
            case EACTags.CURRENCY_CODE /* 42 */:
                return rq0.b.e.BYDGOSZCZ_FAMILY_LICENCE;
            case EACTags.DATE_OF_BIRTH /* 43 */:
                return rq0.b.e.WODZISLAW_FAMILY_LICENCE;
            case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                return rq0.b.e.MICHALOWICE_RESIDENT_LICENCE;
            case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                return rq0.b.e.KOLEJE_DOLNOSLASKIE_LICENCE;
            case 46:
                return rq0.b.e.WISLA_RESIDENT_LICENCE;
            case 47:
                return rq0.b.e.FIREFIGHTER_OSP_LICENCE;
            case 48:
                return rq0.b.e.JASTRZEBIA_GORA_RESIDENT_LICENCE;
            case 49:
                return rq0.b.EnumC4479b.DOCTOR;
            case 50:
                return rq0.b.EnumC4479b.DENTIST;
            case EACTags.TRANSACTION_DATE /* 51 */:
                return rq0.b.EnumC4479b.ATTORNEY_AT_LAW;
            case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                return rq0.b.EnumC4479b.TRAINEE_ATTORNEY_AT_LAW;
            case 53:
                return rq0.b.EnumC4479b.CIVIL_ENGINEER;
            case EACTags.CURRENCY_EXPONENT /* 54 */:
                return rq0.b.EnumC4479b.TAX_ADVISOR;
            case 55:
                return rq0.b.EnumC4479b.JUNIOR_SCHOOL_CARD_MOBYWATEL_APP;
            case 56:
                return rq0.b.EnumC4479b.AUDITOR;
            case 57:
                return rq0.b.EnumC4479b.SOLIDARITY_CARD;
            case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                return rq0.b.EnumC4479b.PHD_STUDENT;
            case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                return rq0.b.EnumC4479b.PHYSIOTHERAPIST;
            case 60:
                return rq0.b.EnumC4479b.PHARMACIST;
            case 61:
                return rq0.b.EnumC4479b.SHOOTING_LICENCE;
            case 62:
                return rq0.b.EnumC4479b.SPORT_SHOOTING_COMPETITOR_LICENCE;
            case 63:
                return rq0.b.EnumC4479b.SPORT_SHOOTING_COACH_LICENCE;
            case 64:
                return rq0.b.EnumC4479b.SPORT_SHOOTING_INSTRUCTOR_LICENCE;
            case 65:
                return rq0.b.EnumC4479b.SPORT_SHOOTING_REFEREE_LICENCE_STATIC_SHOOTING;
            case 66:
                return rq0.b.EnumC4479b.SPORT_SHOOTING_REFEREE_LICENCE_DYNAMIC_SHOOTING;
            case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                return rq0.b.EnumC4479b.SPORT_SHOOTING_RANGE_OFFICER_LICENCE;
            case EACTags.APPLICATION_IMAGE /* 68 */:
                return rq0.b.c.DISABLED_PERSON_IDENTIFICATION_CARD;
            case EACTags.DISPLAY_IMAGE /* 69 */:
                return rq0.b.c.TEACHER;
            case 70:
                return rq0.b.c.BAILIFF_CARD;
            case EACTags.MESSAGE_REFERENCE /* 71 */:
                return rq0.b.c.ELECTRONIC_DIPLOMA_GRADUATION;
            case 72:
                return rq0.b.c.ELECTRONIC_DIPLOMA_PHD;
            case 73:
                return rq0.b.c.ELECTRONIC_DIPLOMA_DSC;
            case EACTags.CERTIFICATION_AUTHORITY_PUBLIC_KEY /* 74 */:
                return rq0.b.EnumC4479b.LABORATORY_DIAGNOSTICIAN;
            case EACTags.DEPRECATED /* 75 */:
                return rq0.b.EnumC4479b.PENSIONER_MSWIA;
            default:
                throw new oq.p();
        }
    }
}
