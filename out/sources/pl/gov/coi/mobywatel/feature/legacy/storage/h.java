package pl.gov.coi.mobywatel.feature.legacy.storage;

import ej2.InstitutionHistoryType;
import ej2.VerificationHistoryType;
import java.util.ArrayList;
import java.util.List;
import oq.i0;
import oq.p;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.eac.EACTags;
import p071kotlin.Metadata;
import pq.v;
import xi2.InstitutionHistory;
import xi2.VerificationHistory;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0004*\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\nH\u0016¢\u0006\u0004\b\u000f\u0010\rJ$\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lpl/gov/coi/mobywatel/feature/legacy/storage/h;", "Lpl/gov/coi/mobywatel/feature/legacy/storage/g;", "<init>", "()V", "Lrq0/b;", "Lth2/a;", "e", "(Lrq0/b;)Lth2/a;", "d", "(Lth2/a;)Lrq0/b;", "", "Lej2/a;", "c", "()Ljava/util/List;", "Lej2/b;", "a", "Ly92/a;", "historyEntry", "Ldx/i;", "Ldx/b;", "Loq/i0;", "b", "(Ly92/a;Ltq/e;)Ljava/lang/Object;", "legacy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements g {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f158774a;

        static {
            int[] iArr = new int[th2.a.values().length];
            try {
                iArr[th2.a.DOCTOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[th2.a.DENTIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[th2.a.ATTORNEY_AT_LAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[th2.a.TRAINEE_ATTORNEY_AT_LAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[th2.a.CIVIL_ENGINEER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[th2.a.BAILIFF.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[th2.a.TEACHER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[th2.a.ELECTRONIC_DIPLOMA_GRADUATION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[th2.a.ELECTRONIC_DIPLOMA_PHD.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[th2.a.ELECTRONIC_DIPLOMA_DSC.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[th2.a.TAX_ADVISOR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[th2.a.AUDITOR.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[th2.a.SOLIDARITY_CARD.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[th2.a.DISABLED_PERSON_IDENTIFICATION_CARD.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[th2.a.JUNIOR_SCHOOL_CARD_MOBYWATEL_APP.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[th2.a.PHYSIOTHERAPIST.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[th2.a.PHD_STUDENT.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[th2.a.PHARMACIST.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[th2.a.SHOOTING_LICENCE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[th2.a.SPORT_SHOOTING_COMPETITOR_LICENCE.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[th2.a.SPORT_SHOOTING_COACH_LICENCE.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[th2.a.SPORT_SHOOTING_INSTRUCTOR_LICENCE.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[th2.a.SPORT_SHOOTING_REFEREE_LICENCE_STATIC_SHOOTING.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[th2.a.SPORT_SHOOTING_REFEREE_LICENCE_DYNAMIC_SHOOTING.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[th2.a.SPORT_SHOOTING_RANGE_OFFICER_LICENCE.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[th2.a.LABORATORY_DIAGNOSTICIAN.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[th2.a.PENSIONER_MSWIA.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[th2.a.ONE_WAY_IDENTITY_MW.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[th2.a.STUDENT_IDENTITY.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[th2.a.SCHOOL_IDENTITY.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[th2.a.DRIVING_LICENCE.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[th2.a.FAMILY_CARD.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[th2.a.RAILWAY_CARD.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[th2.a.REFUGEE_CARD.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[th2.a.REFUGEE_CHILD_CARD.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[th2.a.DEPUTY_CARD.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[th2.a.PENSIONER_CARD.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[th2.a.NURSE_CARD.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[th2.a.MIDWIFE_CARD.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[th2.a.ADVOCATE_CARD.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[th2.a.RASKA_SENIOR_LICENCE.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[th2.a.ZDUNSKOWOLSKA_RESIDENT_LICENCE.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[th2.a.ZDUNSKOWOLSKA_CITY_FAMILY_LICENCE.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[th2.a.ZDUNSKOWOLSKA_SENIOR_LICENCE.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[th2.a.OLAWA_RESIDENT_LICENCE.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[th2.a.OLAWA_FAMILY_LICENCE.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[th2.a.OLAWA_SENIOR_LICENCE.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[th2.a.SUCHY_LAS_FAMILY_LICENCE.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[th2.a.MIEJSKA_AUGUSTOW_TOURIST_LICENCE.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr[th2.a.CHELM_FAMILY_LICENCE.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr[th2.a.CHELM_SENIOR_LICENCE.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr[th2.a.CHELM_RESIDENT_LICENCE.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr[th2.a.LODZ_SENIOR_LICENCE.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr[th2.a.LODZ_FAMILY_LICENCE.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr[th2.a.SENATOR_CARD.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr[th2.a.PZPN_LICENCE.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr[th2.a.GIZYCKA_RESIDENT_LICENCE.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr[th2.a.RACIBORSKA_RESIDENT_LICENCE.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr[th2.a.RACIBORSKA_SENIOR_LICENCE.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr[th2.a.RACIBORSKA_FAMILY_LICENCE.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr[th2.a.WROCLAWSKA_SENIOR_LICENCE.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr[th2.a.KOBYLKA_RESIDENT_LICENCE.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr[th2.a.MIEKINIA_SENIOR_LICENCE.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr[th2.a.MIEKINIA_FAMILY_LICENCE.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr[th2.a.TOPR_LICENCE.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr[th2.a.GENERAL_COUNSEL_LICENCE.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr[th2.a.MAZOVIA_LICENCE.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr[th2.a.BYDGOSZCZ_FAMILY_LICENCE.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr[th2.a.WODZISLAW_FAMILY_LICENCE.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr[th2.a.MICHALOWICE_RESIDENT_LICENCE.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr[th2.a.KOLEJE_DOLNOSLASKIE_LICENCE.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                iArr[th2.a.WISLA_RESIDENT_LICENCE.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                iArr[th2.a.JASTRZEBIA_GORA_RESIDENT_LICENCE.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                iArr[th2.a.OLECKO_RESIDENT_LICENCE.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                iArr[th2.a.FIREFIGHTER_OSP_LICENCE.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            f158774a = iArr;
        }
    }

    private final rq0.b d(th2.a aVar) {
        switch (a.f158774a[aVar.ordinal()]) {
            case 1:
                return rq0.b.EnumC4479b.DOCTOR;
            case 2:
                return rq0.b.EnumC4479b.DENTIST;
            case 3:
                return rq0.b.EnumC4479b.ATTORNEY_AT_LAW;
            case 4:
                return rq0.b.EnumC4479b.TRAINEE_ATTORNEY_AT_LAW;
            case 5:
                return rq0.b.EnumC4479b.CIVIL_ENGINEER;
            case 6:
                return rq0.b.c.BAILIFF_CARD;
            case 7:
                return rq0.b.c.TEACHER;
            case 8:
                return rq0.b.c.ELECTRONIC_DIPLOMA_GRADUATION;
            case 9:
                return rq0.b.c.ELECTRONIC_DIPLOMA_PHD;
            case 10:
                return rq0.b.c.ELECTRONIC_DIPLOMA_DSC;
            case 11:
                return rq0.b.EnumC4479b.TAX_ADVISOR;
            case 12:
                return rq0.b.EnumC4479b.AUDITOR;
            case 13:
                return rq0.b.EnumC4479b.SOLIDARITY_CARD;
            case 14:
                return rq0.b.c.DISABLED_PERSON_IDENTIFICATION_CARD;
            case 15:
                return rq0.b.EnumC4479b.JUNIOR_SCHOOL_CARD_MOBYWATEL_APP;
            case 16:
                return rq0.b.EnumC4479b.PHYSIOTHERAPIST;
            case 17:
                return rq0.b.EnumC4479b.PHD_STUDENT;
            case 18:
                return rq0.b.EnumC4479b.PHARMACIST;
            case 19:
                return rq0.b.EnumC4479b.SHOOTING_LICENCE;
            case 20:
                return rq0.b.EnumC4479b.SPORT_SHOOTING_COMPETITOR_LICENCE;
            case 21:
                return rq0.b.EnumC4479b.SPORT_SHOOTING_COACH_LICENCE;
            case 22:
                return rq0.b.EnumC4479b.SPORT_SHOOTING_INSTRUCTOR_LICENCE;
            case 23:
                return rq0.b.EnumC4479b.SPORT_SHOOTING_REFEREE_LICENCE_STATIC_SHOOTING;
            case 24:
                return rq0.b.EnumC4479b.SPORT_SHOOTING_REFEREE_LICENCE_DYNAMIC_SHOOTING;
            case 25:
                return rq0.b.EnumC4479b.SPORT_SHOOTING_RANGE_OFFICER_LICENCE;
            case 26:
                return rq0.b.EnumC4479b.LABORATORY_DIAGNOSTICIAN;
            case 27:
                return rq0.b.EnumC4479b.PENSIONER_MSWIA;
            case 28:
                return rq0.b.d.ID_CARD;
            case 29:
                return rq0.b.d.STUDENT_CARD;
            case 30:
                return rq0.b.d.SCHOOL_CARD;
            case BERTags.DATE /* 31 */:
                return rq0.b.d.DRIVING_LICENCE;
            case 32:
                return rq0.b.d.FAMILY_CARD;
            case 33:
                return rq0.b.d.RAILWAY_CARD;
            case 34:
                return rq0.b.d.DIIA_REFUGEE_CARD;
            case 35:
                return rq0.b.d.DIIA_REFUGEE_CHILD_CARD;
            case 36:
                return rq0.b.d.DEPUTY_CARD;
            case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                return rq0.b.d.PENSIONER_CARD;
            case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                return rq0.b.d.NURSE_CARD;
            case EACTags.INTERCHANGE_CONTROL /* 39 */:
                return rq0.b.d.MIDWIFE_CARD;
            case 40:
                return rq0.b.d.ADVOCATE_CARD;
            case EACTags.INTERCHANGE_PROFILE /* 41 */:
                return rq0.b.e.RASKA_SENIOR_LICENCE;
            case EACTags.CURRENCY_CODE /* 42 */:
                return rq0.b.e.ZDUNSKOWOLSKA_RESIDENT_LICENCE;
            case EACTags.DATE_OF_BIRTH /* 43 */:
                return rq0.b.e.ZDUNSKOWOLSKA_FAMILY_LICENCE;
            case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                return rq0.b.e.ZDUNSKOWOLSKA_SENIOR_LICENCE;
            case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                return rq0.b.e.OLAWA_RESIDENT_LICENCE;
            case 46:
                return rq0.b.e.OLAWA_FAMILY_LICENCE;
            case 47:
                return rq0.b.e.OLAWA_SENIOR_LICENCE;
            case 48:
                return rq0.b.e.SUCHY_LAS_FAMILY_LICENCE;
            case 49:
                return rq0.b.e.MIEJSKA_AUGUSTOW_TOURIST_LICENCE;
            case 50:
                return rq0.b.e.CHELM_FAMILY_LICENCE;
            case EACTags.TRANSACTION_DATE /* 51 */:
                return rq0.b.e.CHELM_SENIOR_LICENCE;
            case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                return rq0.b.e.CHELM_RESIDENT_LICENCE;
            case 53:
                return rq0.b.e.LODZ_SENIOR_LICENCE;
            case EACTags.CURRENCY_EXPONENT /* 54 */:
                return rq0.b.e.LODZ_FAMILY_LICENCE;
            case 55:
                return rq0.b.e.SENATOR_CARD;
            case 56:
                return rq0.b.e.PZPN_LICENCE;
            case 57:
                return rq0.b.e.GIZYCKA_RESIDENT_LICENCE;
            case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                return rq0.b.e.RACIBORSKA_RESIDENT_LICENCE;
            case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                return rq0.b.e.RACIBORSKA_SENIOR_LICENCE;
            case 60:
                return rq0.b.e.RACIBORSKA_FAMILY_LICENCE;
            case 61:
                return rq0.b.e.WROCLAWSKA_SENIOR_LICENCE;
            case 62:
                return rq0.b.e.KOBYLKA_RESIDENT_LICENCE;
            case 63:
                return rq0.b.e.MIEKINIA_SENIOR_LICENCE;
            case 64:
                return rq0.b.e.MIEKINIA_FAMILY_LICENCE;
            case 65:
                return rq0.b.e.TOPR_LICENCE;
            case 66:
                return rq0.b.e.GENERAL_COUNSEL_LICENCE;
            case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                return rq0.b.e.MAZOVIA_LICENCE;
            case EACTags.APPLICATION_IMAGE /* 68 */:
                return rq0.b.e.BYDGOSZCZ_FAMILY_LICENCE;
            case EACTags.DISPLAY_IMAGE /* 69 */:
                return rq0.b.e.WODZISLAW_FAMILY_LICENCE;
            case 70:
                return rq0.b.e.MICHALOWICE_RESIDENT_LICENCE;
            case EACTags.MESSAGE_REFERENCE /* 71 */:
                return rq0.b.e.KOLEJE_DOLNOSLASKIE_LICENCE;
            case 72:
                return rq0.b.e.WISLA_RESIDENT_LICENCE;
            case 73:
                return rq0.b.e.JASTRZEBIA_GORA_RESIDENT_LICENCE;
            case EACTags.CERTIFICATION_AUTHORITY_PUBLIC_KEY /* 74 */:
                return rq0.b.e.OLECKO_RESIDENT_LICENCE;
            case EACTags.DEPRECATED /* 75 */:
                return rq0.b.e.FIREFIGHTER_OSP_LICENCE;
            default:
                throw new p();
        }
    }

    private final th2.a e(rq0.b bVar) {
        if (bVar == rq0.b.d.ID_CARD) {
            return th2.a.ONE_WAY_IDENTITY_MW;
        }
        if (bVar == rq0.b.d.DIIA_REFUGEE_CARD) {
            return th2.a.REFUGEE_CARD;
        }
        if (bVar == rq0.b.d.DIIA_REFUGEE_CHILD_CARD) {
            return th2.a.REFUGEE_CHILD_CARD;
        }
        if (bVar == rq0.b.d.PENSIONER_CARD) {
            return th2.a.PENSIONER_CARD;
        }
        if (bVar == rq0.b.d.SCHOOL_CARD) {
            return th2.a.SCHOOL_IDENTITY;
        }
        if (bVar == rq0.b.e.ZDUNSKOWOLSKA_SENIOR_LICENCE) {
            return th2.a.ZDUNSKOWOLSKA_SENIOR_LICENCE;
        }
        if (bVar == rq0.b.e.ZDUNSKOWOLSKA_RESIDENT_LICENCE) {
            return th2.a.ZDUNSKOWOLSKA_RESIDENT_LICENCE;
        }
        if (bVar == rq0.b.e.ZDUNSKOWOLSKA_FAMILY_LICENCE) {
            return th2.a.ZDUNSKOWOLSKA_CITY_FAMILY_LICENCE;
        }
        if (bVar == rq0.b.e.RASKA_SENIOR_LICENCE) {
            return th2.a.RASKA_SENIOR_LICENCE;
        }
        if (bVar == rq0.b.e.OLAWA_RESIDENT_LICENCE) {
            return th2.a.OLAWA_RESIDENT_LICENCE;
        }
        if (bVar == rq0.b.e.OLAWA_FAMILY_LICENCE) {
            return th2.a.OLAWA_FAMILY_LICENCE;
        }
        if (bVar == rq0.b.e.OLAWA_SENIOR_LICENCE) {
            return th2.a.OLAWA_SENIOR_LICENCE;
        }
        if (bVar == rq0.b.e.SUCHY_LAS_FAMILY_LICENCE) {
            return th2.a.SUCHY_LAS_FAMILY_LICENCE;
        }
        if (bVar == rq0.b.e.MIEJSKA_AUGUSTOW_TOURIST_LICENCE) {
            return th2.a.MIEJSKA_AUGUSTOW_TOURIST_LICENCE;
        }
        if (bVar == rq0.b.e.CHELM_FAMILY_LICENCE) {
            return th2.a.CHELM_FAMILY_LICENCE;
        }
        if (bVar == rq0.b.e.CHELM_SENIOR_LICENCE) {
            return th2.a.CHELM_SENIOR_LICENCE;
        }
        if (bVar == rq0.b.e.CHELM_RESIDENT_LICENCE) {
            return th2.a.CHELM_RESIDENT_LICENCE;
        }
        if (bVar == rq0.b.e.LODZ_SENIOR_LICENCE) {
            return th2.a.LODZ_SENIOR_LICENCE;
        }
        if (bVar == rq0.b.e.LODZ_FAMILY_LICENCE) {
            return th2.a.LODZ_FAMILY_LICENCE;
        }
        if (bVar == rq0.b.d.FAMILY_CARD) {
            return th2.a.FAMILY_CARD;
        }
        if (bVar == rq0.b.e.SENATOR_CARD) {
            return th2.a.SENATOR_CARD;
        }
        if (bVar == rq0.b.d.DRIVING_LICENCE) {
            return th2.a.DRIVING_LICENCE;
        }
        if (bVar == rq0.b.d.STUDENT_CARD) {
            return th2.a.STUDENT_IDENTITY;
        }
        if (bVar == rq0.b.d.RAILWAY_CARD) {
            return th2.a.RAILWAY_CARD;
        }
        if (bVar == rq0.b.d.ADVOCATE_CARD) {
            return th2.a.ADVOCATE_CARD;
        }
        if (bVar == rq0.b.e.PZPN_LICENCE) {
            return th2.a.PZPN_LICENCE;
        }
        if (bVar == rq0.b.d.DEPUTY_CARD) {
            return th2.a.DEPUTY_CARD;
        }
        if (bVar == rq0.b.e.GIZYCKA_RESIDENT_LICENCE) {
            return th2.a.GIZYCKA_RESIDENT_LICENCE;
        }
        if (bVar == rq0.b.e.RACIBORSKA_RESIDENT_LICENCE) {
            return th2.a.RACIBORSKA_RESIDENT_LICENCE;
        }
        if (bVar == rq0.b.e.RACIBORSKA_SENIOR_LICENCE) {
            return th2.a.RACIBORSKA_SENIOR_LICENCE;
        }
        if (bVar == rq0.b.e.RACIBORSKA_FAMILY_LICENCE) {
            return th2.a.RACIBORSKA_FAMILY_LICENCE;
        }
        if (bVar == rq0.b.d.NURSE_CARD) {
            return th2.a.NURSE_CARD;
        }
        if (bVar == rq0.b.d.MIDWIFE_CARD) {
            return th2.a.MIDWIFE_CARD;
        }
        if (bVar == rq0.b.e.WROCLAWSKA_SENIOR_LICENCE) {
            return th2.a.WROCLAWSKA_SENIOR_LICENCE;
        }
        if (bVar == rq0.b.e.KOBYLKA_RESIDENT_LICENCE) {
            return th2.a.KOBYLKA_RESIDENT_LICENCE;
        }
        if (bVar == rq0.b.e.MIEKINIA_SENIOR_LICENCE) {
            return th2.a.MIEKINIA_SENIOR_LICENCE;
        }
        if (bVar == rq0.b.e.MIEKINIA_FAMILY_LICENCE) {
            return th2.a.MIEKINIA_FAMILY_LICENCE;
        }
        if (bVar == rq0.b.e.TOPR_LICENCE) {
            return th2.a.TOPR_LICENCE;
        }
        if (bVar == rq0.b.e.MAZOVIA_LICENCE) {
            return th2.a.MAZOVIA_LICENCE;
        }
        if (bVar == rq0.b.e.GENERAL_COUNSEL_LICENCE) {
            return th2.a.GENERAL_COUNSEL_LICENCE;
        }
        if (bVar == rq0.b.e.OLECKO_RESIDENT_LICENCE) {
            return th2.a.OLECKO_RESIDENT_LICENCE;
        }
        if (bVar == rq0.b.e.BYDGOSZCZ_FAMILY_LICENCE) {
            return th2.a.BYDGOSZCZ_FAMILY_LICENCE;
        }
        if (bVar == rq0.b.e.WODZISLAW_FAMILY_LICENCE) {
            return th2.a.WODZISLAW_FAMILY_LICENCE;
        }
        if (bVar == rq0.b.e.MICHALOWICE_RESIDENT_LICENCE) {
            return th2.a.MICHALOWICE_RESIDENT_LICENCE;
        }
        if (bVar == rq0.b.e.KOLEJE_DOLNOSLASKIE_LICENCE) {
            return th2.a.KOLEJE_DOLNOSLASKIE_LICENCE;
        }
        if (bVar == rq0.b.e.WISLA_RESIDENT_LICENCE) {
            return th2.a.WISLA_RESIDENT_LICENCE;
        }
        if (bVar == rq0.b.e.JASTRZEBIA_GORA_RESIDENT_LICENCE) {
            return th2.a.JASTRZEBIA_GORA_RESIDENT_LICENCE;
        }
        if (bVar == rq0.b.e.FIREFIGHTER_OSP_LICENCE) {
            return th2.a.FIREFIGHTER_OSP_LICENCE;
        }
        if (bVar == rq0.b.EnumC4479b.DOCTOR) {
            return th2.a.DOCTOR;
        }
        if (bVar == rq0.b.EnumC4479b.DENTIST) {
            return th2.a.DENTIST;
        }
        if (bVar == rq0.b.EnumC4479b.ATTORNEY_AT_LAW) {
            return th2.a.ATTORNEY_AT_LAW;
        }
        if (bVar == rq0.b.EnumC4479b.TAX_ADVISOR) {
            return th2.a.TAX_ADVISOR;
        }
        if (bVar == rq0.b.EnumC4479b.TRAINEE_ATTORNEY_AT_LAW) {
            return th2.a.TRAINEE_ATTORNEY_AT_LAW;
        }
        if (bVar == rq0.b.EnumC4479b.CIVIL_ENGINEER) {
            return th2.a.CIVIL_ENGINEER;
        }
        if (bVar == rq0.b.EnumC4479b.JUNIOR_SCHOOL_CARD_MOBYWATEL_APP) {
            return th2.a.JUNIOR_SCHOOL_CARD_MOBYWATEL_APP;
        }
        if (bVar == rq0.b.EnumC4479b.AUDITOR) {
            return th2.a.AUDITOR;
        }
        if (bVar == rq0.b.EnumC4479b.SOLIDARITY_CARD) {
            return th2.a.SOLIDARITY_CARD;
        }
        if (bVar == rq0.b.EnumC4479b.PHD_STUDENT) {
            return th2.a.PHD_STUDENT;
        }
        if (bVar == rq0.b.EnumC4479b.PHYSIOTHERAPIST) {
            return th2.a.PHYSIOTHERAPIST;
        }
        if (bVar == rq0.b.EnumC4479b.PHARMACIST) {
            return th2.a.PHARMACIST;
        }
        if (bVar == rq0.b.c.BAILIFF_CARD) {
            return th2.a.BAILIFF;
        }
        if (bVar == rq0.b.c.TEACHER) {
            return th2.a.TEACHER;
        }
        if (bVar == rq0.b.c.DISABLED_PERSON_IDENTIFICATION_CARD) {
            return th2.a.DISABLED_PERSON_IDENTIFICATION_CARD;
        }
        if (bVar == rq0.b.c.ELECTRONIC_DIPLOMA_GRADUATION) {
            return th2.a.ELECTRONIC_DIPLOMA_GRADUATION;
        }
        if (bVar == rq0.b.c.ELECTRONIC_DIPLOMA_PHD) {
            return th2.a.ELECTRONIC_DIPLOMA_PHD;
        }
        if (bVar == rq0.b.c.ELECTRONIC_DIPLOMA_DSC) {
            return th2.a.ELECTRONIC_DIPLOMA_DSC;
        }
        if (bVar == rq0.b.EnumC4479b.SHOOTING_LICENCE) {
            return th2.a.SHOOTING_LICENCE;
        }
        if (bVar == rq0.b.EnumC4479b.SPORT_SHOOTING_COMPETITOR_LICENCE) {
            return th2.a.SPORT_SHOOTING_COMPETITOR_LICENCE;
        }
        if (bVar == rq0.b.EnumC4479b.SPORT_SHOOTING_COACH_LICENCE) {
            return th2.a.SPORT_SHOOTING_COACH_LICENCE;
        }
        if (bVar == rq0.b.EnumC4479b.SPORT_SHOOTING_INSTRUCTOR_LICENCE) {
            return th2.a.SPORT_SHOOTING_INSTRUCTOR_LICENCE;
        }
        if (bVar == rq0.b.EnumC4479b.SPORT_SHOOTING_REFEREE_LICENCE_STATIC_SHOOTING) {
            return th2.a.SPORT_SHOOTING_REFEREE_LICENCE_STATIC_SHOOTING;
        }
        if (bVar == rq0.b.EnumC4479b.SPORT_SHOOTING_REFEREE_LICENCE_DYNAMIC_SHOOTING) {
            return th2.a.SPORT_SHOOTING_REFEREE_LICENCE_DYNAMIC_SHOOTING;
        }
        if (bVar == rq0.b.EnumC4479b.SPORT_SHOOTING_RANGE_OFFICER_LICENCE) {
            return th2.a.SPORT_SHOOTING_RANGE_OFFICER_LICENCE;
        }
        if (bVar == rq0.b.EnumC4479b.LABORATORY_DIAGNOSTICIAN) {
            return th2.a.LABORATORY_DIAGNOSTICIAN;
        }
        if (bVar == rq0.b.EnumC4479b.PENSIONER_MSWIA) {
            return th2.a.PENSIONER_MSWIA;
        }
        if (bVar == rq0.b.EnumC4479b.DEFAULT || bVar == rq0.b.c.DEFAULT || bVar == rq0.b.d.VEHICLE_CARD) {
            return null;
        }
        throw new p();
    }

    @Override // pl.gov.coi.mobywatel.feature.legacy.storage.g
    public List<VerificationHistoryType> a() {
        try {
            ArrayList<VerificationHistory> arrayListG = ContainerManagerNew.u().s().g();
            ArrayList arrayList = new ArrayList(v.y(arrayListG, 10));
            for (VerificationHistory verificationHistory : arrayListG) {
                arrayList.add(new VerificationHistoryType(verificationHistory.getTimestamp(), d(verificationHistory.getServiceType()), verificationHistory.getIsAccepted(), verificationHistory.getConnectionError()));
            }
            return arrayList;
        } catch (Exception e15) {
            px.f.f163100a.d("HistoryRepositoryImpl legacy error: loadVerificationHistory()", e15, px.c.a(this));
            return v.n();
        }
    }

    @Override // pl.gov.coi.mobywatel.feature.legacy.storage.g
    public Object b(y92.a aVar, tq.e<? super dx.i<? extends dx.b, i0>> eVar) {
        bj2.a aVarS = ContainerManagerNew.u().s();
        try {
            if (aVar instanceof y92.a.Institutions) {
                long timestamp = ((y92.a.Institutions) aVar).getTimestamp();
                int scope = ((y92.a.Institutions) aVar).getScope();
                String institutionName = ((y92.a.Institutions) aVar).getInstitutionName();
                String purposeName = ((y92.a.Institutions) aVar).getPurposeName();
                th2.a aVarE = e(((y92.a.Institutions) aVar).getDocumentType());
                if (aVarE == null) {
                    return new dx.i.Left(new dx.b.Generic(new Exception("Document " + ((y92.a.Institutions) aVar).getDocumentType() + " is not supported")));
                }
                aVarS.f().add(new InstitutionHistory(timestamp, scope, institutionName, purposeName, aVarE, ((y92.a.Institutions) aVar).getUrl(), ((y92.a.Institutions) aVar).getCardId(), ((y92.a.Institutions) aVar).getInstitutionId(), ((y92.a.Institutions) aVar).getInstitutionCertificateDn(), ((y92.a.Institutions) aVar).getInstitutionCertificateSn(), ((y92.a.Institutions) aVar).getInstitutionCertificateIssuer()));
            } else {
                if (!(aVar instanceof y92.a.Verification)) {
                    throw new p();
                }
                long timestamp2 = ((y92.a.Verification) aVar).getTimestamp();
                String purpose = ((y92.a.Verification) aVar).getPurpose();
                xi2.c cVar = xi2.c.BT;
                th2.a aVarE2 = e(((y92.a.Verification) aVar).getDocumentType());
                if (aVarE2 == null) {
                    return new dx.i.Left(new dx.b.Generic(new Exception("Document " + ((y92.a.Verification) aVar).getDocumentType() + " is not supported")));
                }
                aVarS.g().add(new VerificationHistory(timestamp2, aVarE2, true, "", "", purpose, cVar, false));
            }
            aVarS.c();
            return new dx.i.Right(i0.f148189a);
        } catch (Exception e15) {
            return new dx.i.Left(new dx.b.Generic(e15));
        }
    }

    @Override // pl.gov.coi.mobywatel.feature.legacy.storage.g
    public List<InstitutionHistoryType> c() {
        try {
            ArrayList<InstitutionHistory> arrayListF = ContainerManagerNew.u().s().f();
            ArrayList arrayList = new ArrayList(v.y(arrayListF, 10));
            for (InstitutionHistory institutionHistory : arrayListF) {
                arrayList.add(new InstitutionHistoryType(institutionHistory.getTimestamp(), d(institutionHistory.getServiceType()), institutionHistory.getInstitutionName()));
            }
            return arrayList;
        } catch (Exception e15) {
            px.f.f163100a.d("HistoryRepositoryImpl legacy error: loadDataTransferInstitutionHistory()", e15, px.c.a(this));
            return v.n();
        }
    }
}
