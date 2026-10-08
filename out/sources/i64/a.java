package i64;

import g64.GlobalSearchEntry;
import g64.c;
import g64.d;
import n64.SearchEntryEntity;
import oq.p;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.asn1.eac.EACTags;
import org.conscrypt.metrics.ConscryptStatsLog;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\b\u001a\u00020\u0004*\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001a\u0011\u0010\f\u001a\u00020\u000b*\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a\u0011\u0010\u000e\u001a\u00020\n*\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ln64/b;", "Lg64/b;", "a", "(Ln64/b;)Lg64/b;", "Lg64/c;", "Lo64/c;", "e", "(Lg64/c;)Lo64/c;", "b", "(Lo64/c;)Lg64/c;", "Lg64/d;", "Lo64/a;", "d", "(Lg64/d;)Lo64/a;", "c", "(Lo64/a;)Lg64/d;", "mobile_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: i64.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C2129a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f89824a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f89825b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f89826c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f89827d;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.DOCUMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.MENU_ITEMS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f89824a = iArr;
            int[] iArr2 = new int[o64.c.values().length];
            try {
                iArr2[o64.c.DOCUMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[o64.c.SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[o64.c.APP_MENU_ITEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f89825b = iArr2;
            int[] iArr3 = new int[d.values().length];
            try {
                iArr3[d.ID_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[d.DRIVING_LICENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[d.VEHICLE_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[d.FAMILY_CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[d.DIIA_REFUGEE_CARD.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[d.DIIA_REFUGEE_CHILD_CARD.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[d.STUDENT_CARD.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[d.RAILWAY_CARD.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[d.PENSIONER_CARD.ordinal()] = 9;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[d.DEPUTY_CARD.ordinal()] = 10;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[d.ADVOCATE_CARD.ordinal()] = 11;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[d.MIDWIFE_CARD.ordinal()] = 12;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[d.NURSE_CARD.ordinal()] = 13;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr3[d.RASKA_SENIOR_LICENCE.ordinal()] = 14;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr3[d.ZDUNSKOWOLSKA_RESIDENT_LICENCE.ordinal()] = 15;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr3[d.OLAWA_RESIDENT_LICENCE.ordinal()] = 16;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr3[d.OLAWA_FAMILY_LICENCE.ordinal()] = 17;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr3[d.OLAWA_SENIOR_LICENCE.ordinal()] = 18;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr3[d.ZDUNSKOWOLSKA_FAMILY_LICENCE.ordinal()] = 19;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr3[d.ZDUNSKOWOLSKA_SENIOR_LICENCE.ordinal()] = 20;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr3[d.SUCHY_LAS_FAMILY_LICENCE.ordinal()] = 21;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr3[d.MIEJSKA_AUGUSTOW_TOURIST_LICENCE.ordinal()] = 22;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr3[d.CHELM_FAMILY_LICENCE.ordinal()] = 23;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr3[d.CHELM_SENIOR_LICENCE.ordinal()] = 24;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr3[d.CHELM_RESIDENT_LICENCE.ordinal()] = 25;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr3[d.LODZ_SENIOR_LICENCE.ordinal()] = 26;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr3[d.LODZ_FAMILY_LICENCE.ordinal()] = 27;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr3[d.SENATOR_CARD.ordinal()] = 28;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr3[d.RACIBORSKA_RESIDENT_LICENCE.ordinal()] = 29;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr3[d.RACIBORSKA_SENIOR_LICENCE.ordinal()] = 30;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr3[d.RACIBORSKA_FAMILY_LICENCE.ordinal()] = 31;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr3[d.GIZYCKA_RESIDENT_LICENCE.ordinal()] = 32;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr3[d.PZPN_LICENCE.ordinal()] = 33;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr3[d.KOBYLKA_RESIDENT_LICENCE.ordinal()] = 34;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr3[d.WROCLAWSKA_SENIOR_LICENCE.ordinal()] = 35;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr3[d.MIEKINIA_SENIOR_LICENCE.ordinal()] = 36;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr3[d.MIEKINIA_FAMILY_LICENCE.ordinal()] = 37;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr3[d.TOPR_LICENCE.ordinal()] = 38;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr3[d.MAZOVIA_LICENCE.ordinal()] = 39;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr3[d.GENERAL_COUNSEL_LICENCE.ordinal()] = 40;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr3[d.OLECKO_RESIDENT_LICENCE.ordinal()] = 41;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr3[d.BYDGOSZCZ_FAMILY_LICENCE.ordinal()] = 42;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr3[d.WODZISLAW_FAMILY_LICENCE.ordinal()] = 43;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr3[d.MICHALOWICE_RESIDENT_LICENCE.ordinal()] = 44;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr3[d.KOLEJE_DOLNOSLASKIE_LICENCE.ordinal()] = 45;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr3[d.WISLA_RESIDENT_LICENCE.ordinal()] = 46;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr3[d.JASTRZEBIA_GORA_RESIDENT_LICENCE.ordinal()] = 47;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr3[d.FIREFIGHTER_OSP_LICENCE.ordinal()] = 48;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr3[d.DOCTOR.ordinal()] = 49;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr3[d.DENTIST.ordinal()] = 50;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr3[d.ATTORNEY_AT_LAW.ordinal()] = 51;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr3[d.TRAINEE_ATTORNEY_AT_LAW.ordinal()] = 52;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr3[d.CIVIL_ENGINEER.ordinal()] = 53;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr3[d.TAX_ADVISOR.ordinal()] = 54;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr3[d.JUNIOR_SCHOOL_CARD_MOBYWATEL_APP.ordinal()] = 55;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr3[d.AUDITOR.ordinal()] = 56;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr3[d.SOLIDARITY_CARD.ordinal()] = 57;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr3[d.PHD_STUDENT.ordinal()] = 58;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr3[d.PHYSIOTHERAPIST.ordinal()] = 59;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr3[d.PHARMACIST.ordinal()] = 60;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr3[d.SHOOTING_LICENCE.ordinal()] = 61;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr3[d.SPORT_SHOOTING_COMPETITOR_LICENCE.ordinal()] = 62;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr3[d.SPORT_SHOOTING_COACH_LICENCE.ordinal()] = 63;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr3[d.SPORT_SHOOTING_INSTRUCTOR_LICENCE.ordinal()] = 64;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr3[d.SPORT_SHOOTING_REFEREE_LICENCE_STATIC_SHOOTING.ordinal()] = 65;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                iArr3[d.SPORT_SHOOTING_REFEREE_LICENCE_DYNAMIC_SHOOTING.ordinal()] = 66;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                iArr3[d.SPORT_SHOOTING_RANGE_OFFICER_LICENCE.ordinal()] = 67;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                iArr3[d.LABORATORY_DIAGNOSTICIAN.ordinal()] = 68;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                iArr3[d.PENSIONER_MSWIA.ordinal()] = 69;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                iArr3[d.DISABLED_PERSON_IDENTIFICATION_CARD.ordinal()] = 70;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                iArr3[d.TEACHER.ordinal()] = 71;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                iArr3[d.BAILIFF_CARD.ordinal()] = 72;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                iArr3[d.ELECTRONIC_DIPLOMA_GRADUATION.ordinal()] = 73;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                iArr3[d.ELECTRONIC_DIPLOMA_PHD.ordinal()] = 74;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                iArr3[d.ELECTRONIC_DIPLOMA_DSC.ordinal()] = 75;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                iArr3[d.GIOS.ordinal()] = 76;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                iArr3[d.MAKE_PROPOSAL.ordinal()] = 77;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                iArr3[d.E_PAYMENTS.ordinal()] = 78;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                iArr3[d.ZUS_VISIT.ordinal()] = 79;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                iArr3[d.PENALTY_POINTS.ordinal()] = 80;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                iArr3[d.TRAIN_TICKETS.ordinal()] = 81;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                iArr3[d.GAS_SUPPLEMENT.ordinal()] = 82;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                iArr3[d.ABROAD_INFO.ordinal()] = 83;
            } catch (NoSuchFieldError unused89) {
            }
            try {
                iArr3[d.MEDICAL_PRESCRIPTIONS.ordinal()] = 84;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                iArr3[d.COAL_SUPPLEMENT.ordinal()] = 85;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                iArr3[d.ENERGY_LIMIT_STATEMENT.ordinal()] = 86;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                iArr3[d.SAFE_BUS.ordinal()] = 87;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                iArr3[d.VEHICLE_HISTORY.ordinal()] = 88;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                iArr3[d.PESEL_RESTRICTION.ordinal()] = 89;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                iArr3[d.CRACOW_CITY_CARD.ordinal()] = 90;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                iArr3[d.AIR_QUALITY.ordinal()] = 91;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                iArr3[d.ELECTORAL_REGISTER.ordinal()] = 92;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                iArr3[d.GIVE_ELECTORAL_SUPPORT.ordinal()] = 93;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                iArr3[d.FINES.ordinal()] = 94;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                iArr3[d.PESEL_RESTRICTION_VERIFICATION.ordinal()] = 95;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                iArr3[d.MY_CASES.ordinal()] = 96;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                iArr3[d.DOCUMENT_SIGNING.ordinal()] = 97;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                iArr3[d.PASSPORTS_DATA.ordinal()] = 98;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                iArr3[d.VEHICLE_COLLISION_DATA.ordinal()] = 99;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                iArr3[d.COMPANY.ordinal()] = 100;
            } catch (NoSuchFieldError unused106) {
            }
            try {
                iArr3[d.VEHICLE_COLLISION.ordinal()] = 101;
            } catch (NoSuchFieldError unused107) {
            }
            try {
                iArr3[d.NETWORK_SECURITY_ISSUES.ordinal()] = 102;
            } catch (NoSuchFieldError unused108) {
            }
            try {
                iArr3[d.ENERGY_VOUCHER.ordinal()] = 103;
            } catch (NoSuchFieldError unused109) {
            }
            try {
                iArr3[d.FLOOD_ALERT.ordinal()] = 104;
            } catch (NoSuchFieldError unused110) {
            }
            try {
                iArr3[d.APPLICATION_FORM_SERVICES.ordinal()] = 105;
            } catch (NoSuchFieldError unused111) {
            }
            try {
                iArr3[d.IDENTITY_CARD_SUSPENSION.ordinal()] = 106;
            } catch (NoSuchFieldError unused112) {
            }
            try {
                iArr3[d.IDENTITY_CARD_INVALIDATION.ordinal()] = 107;
            } catch (NoSuchFieldError unused113) {
            }
            try {
                iArr3[d.DRIVER_QUALIFICATIONS.ordinal()] = 108;
            } catch (NoSuchFieldError unused114) {
            }
            try {
                iArr3[d.DOCUMENT_RESTRICTION.ordinal()] = 109;
            } catch (NoSuchFieldError unused115) {
            }
            try {
                iArr3[d.ID_CARD_VERIFICATION.ordinal()] = 110;
            } catch (NoSuchFieldError unused116) {
            }
            try {
                iArr3[d.ID_CARD_COLLECTING.ordinal()] = 111;
            } catch (NoSuchFieldError unused117) {
            }
            try {
                iArr3[d.MY_IKP.ordinal()] = 112;
            } catch (NoSuchFieldError unused118) {
            }
            try {
                iArr3[d.DEFENCE_TRAINING.ordinal()] = 113;
            } catch (NoSuchFieldError unused119) {
            }
            try {
                iArr3[d.QUALIFIED_SIGNATURE.ordinal()] = 114;
            } catch (NoSuchFieldError unused120) {
            }
            try {
                iArr3[d.LAND_REGISTRY.ordinal()] = 115;
            } catch (NoSuchFieldError unused121) {
            }
            try {
                iArr3[d.CHECK_VEHICLE_INSURANCE.ordinal()] = 116;
            } catch (NoSuchFieldError unused122) {
            }
            try {
                iArr3[d.NATIONAL_COURT_REGISTER.ordinal()] = 117;
            } catch (NoSuchFieldError unused123) {
            }
            try {
                iArr3[d.MILITARY_ALERT.ordinal()] = 118;
            } catch (NoSuchFieldError unused124) {
            }
            try {
                iArr3[d.SAFETY_GUIDE.ordinal()] = 119;
            } catch (NoSuchFieldError unused125) {
            }
            try {
                iArr3[d.PASSPORT_PICKUP.ordinal()] = 120;
            } catch (NoSuchFieldError unused126) {
            }
            try {
                iArr3[d.CHILD_PASSPORT_APPLICATION_DATA.ordinal()] = 121;
            } catch (NoSuchFieldError unused127) {
            }
            try {
                iArr3[d.INTERNET_ACCESS.ordinal()] = 122;
            } catch (NoSuchFieldError unused128) {
            }
            try {
                iArr3[d.TRAVEL_ABROAD.ordinal()] = 123;
            } catch (NoSuchFieldError unused129) {
            }
            try {
                iArr3[d.JUNIOR_SCHOOL_EDUCATION.ordinal()] = 124;
            } catch (NoSuchFieldError unused130) {
            }
            try {
                iArr3[d.SANITARY_VIOLATION.ordinal()] = 125;
            } catch (NoSuchFieldError unused131) {
            }
            try {
                iArr3[d.YOUR_DATA_CONTACT_DETAILS.ordinal()] = 126;
            } catch (NoSuchFieldError unused132) {
            }
            try {
                iArr3[d.YOUR_DATA_RESIDENCE_DETAILS.ordinal()] = 127;
            } catch (NoSuchFieldError unused133) {
            }
            try {
                iArr3[d.YOUR_DATA_PASSPORT_DETAILS.ordinal()] = 128;
            } catch (NoSuchFieldError unused134) {
            }
            try {
                iArr3[d.SETTINGS_CHANGE_PASSWORD.ordinal()] = 129;
            } catch (NoSuchFieldError unused135) {
            }
            try {
                iArr3[d.SETTINGS_BIOMETRIC_LOGIN.ordinal()] = 130;
            } catch (NoSuchFieldError unused136) {
            }
            try {
                iArr3[d.SETTINGS_NOTIFICATIONS.ordinal()] = 131;
            } catch (NoSuchFieldError unused137) {
            }
            try {
                iArr3[d.SETTINGS_APPEARANCE.ordinal()] = 132;
            } catch (NoSuchFieldError unused138) {
            }
            try {
                iArr3[d.SETTINGS_APP_LANGUAGE.ordinal()] = 133;
            } catch (NoSuchFieldError unused139) {
            }
            try {
                iArr3[d.SETTINGS_ISSUED_CERTIFICATES.ordinal()] = 134;
            } catch (NoSuchFieldError unused140) {
            }
            try {
                iArr3[d.OTHERS_ACTIVITY_HISTORY.ordinal()] = 135;
            } catch (NoSuchFieldError unused141) {
            }
            try {
                iArr3[d.OTHERS_ABOUT_APP.ordinal()] = 136;
            } catch (NoSuchFieldError unused142) {
            }
            try {
                iArr3[d.OTHERS_TECHNICAL_SUPPORT.ordinal()] = 137;
            } catch (NoSuchFieldError unused143) {
            }
            try {
                iArr3[d.OTHERS_RATE_APP.ordinal()] = 138;
            } catch (NoSuchFieldError unused144) {
            }
            try {
                iArr3[d.OTHERS_VIRTUAL_ASSISTANT.ordinal()] = 139;
            } catch (NoSuchFieldError unused145) {
            }
            try {
                iArr3[d.OTHERS_VOTE_FOR_IDEA.ordinal()] = 140;
            } catch (NoSuchFieldError unused146) {
            }
            try {
                iArr3[d.OTHERS_DEACTIVATE_APP.ordinal()] = 141;
            } catch (NoSuchFieldError unused147) {
            }
            try {
                iArr3[d.OTHERS_LOG_OUT.ordinal()] = 142;
            } catch (NoSuchFieldError unused148) {
            }
            try {
                iArr3[d.E_DELIVERY.ordinal()] = 143;
            } catch (NoSuchFieldError unused149) {
            }
            try {
                iArr3[d.NOTIFICATIONS.ordinal()] = 144;
            } catch (NoSuchFieldError unused150) {
            }
            try {
                iArr3[d.VERIFIER.ordinal()] = 145;
            } catch (NoSuchFieldError unused151) {
            }
            try {
                iArr3[d.VEHICLE_REGISTRATION.ordinal()] = 146;
            } catch (NoSuchFieldError unused152) {
            }
            try {
                iArr3[d.EUROPE_READINESS.ordinal()] = 147;
            } catch (NoSuchFieldError unused153) {
            }
            f89826c = iArr3;
            int[] iArr4 = new int[o64.a.values().length];
            try {
                iArr4[o64.a.ID_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused154) {
            }
            try {
                iArr4[o64.a.DRIVING_LICENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused155) {
            }
            try {
                iArr4[o64.a.VEHICLE_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused156) {
            }
            try {
                iArr4[o64.a.FAMILY_CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused157) {
            }
            try {
                iArr4[o64.a.DIIA_REFUGEE_CARD.ordinal()] = 5;
            } catch (NoSuchFieldError unused158) {
            }
            try {
                iArr4[o64.a.DIIA_REFUGEE_CHILD_CARD.ordinal()] = 6;
            } catch (NoSuchFieldError unused159) {
            }
            try {
                iArr4[o64.a.STUDENT_CARD.ordinal()] = 7;
            } catch (NoSuchFieldError unused160) {
            }
            try {
                iArr4[o64.a.RAILWAY_CARD.ordinal()] = 8;
            } catch (NoSuchFieldError unused161) {
            }
            try {
                iArr4[o64.a.PENSIONER_CARD.ordinal()] = 9;
            } catch (NoSuchFieldError unused162) {
            }
            try {
                iArr4[o64.a.DEPUTY_CARD.ordinal()] = 10;
            } catch (NoSuchFieldError unused163) {
            }
            try {
                iArr4[o64.a.ADVOCATE_CARD.ordinal()] = 11;
            } catch (NoSuchFieldError unused164) {
            }
            try {
                iArr4[o64.a.MIDWIFE_CARD.ordinal()] = 12;
            } catch (NoSuchFieldError unused165) {
            }
            try {
                iArr4[o64.a.NURSE_CARD.ordinal()] = 13;
            } catch (NoSuchFieldError unused166) {
            }
            try {
                iArr4[o64.a.RASKA_SENIOR_LICENCE.ordinal()] = 14;
            } catch (NoSuchFieldError unused167) {
            }
            try {
                iArr4[o64.a.ZDUNSKOWOLSKA_RESIDENT_LICENCE.ordinal()] = 15;
            } catch (NoSuchFieldError unused168) {
            }
            try {
                iArr4[o64.a.OLAWA_RESIDENT_LICENCE.ordinal()] = 16;
            } catch (NoSuchFieldError unused169) {
            }
            try {
                iArr4[o64.a.OLAWA_FAMILY_LICENCE.ordinal()] = 17;
            } catch (NoSuchFieldError unused170) {
            }
            try {
                iArr4[o64.a.OLAWA_SENIOR_LICENCE.ordinal()] = 18;
            } catch (NoSuchFieldError unused171) {
            }
            try {
                iArr4[o64.a.ZDUNSKOWOLSKA_FAMILY_LICENCE.ordinal()] = 19;
            } catch (NoSuchFieldError unused172) {
            }
            try {
                iArr4[o64.a.ZDUNSKOWOLSKA_SENIOR_LICENCE.ordinal()] = 20;
            } catch (NoSuchFieldError unused173) {
            }
            try {
                iArr4[o64.a.SUCHY_LAS_FAMILY_LICENCE.ordinal()] = 21;
            } catch (NoSuchFieldError unused174) {
            }
            try {
                iArr4[o64.a.MIEJSKA_AUGUSTOW_TOURIST_LICENCE.ordinal()] = 22;
            } catch (NoSuchFieldError unused175) {
            }
            try {
                iArr4[o64.a.CHELM_FAMILY_LICENCE.ordinal()] = 23;
            } catch (NoSuchFieldError unused176) {
            }
            try {
                iArr4[o64.a.CHELM_SENIOR_LICENCE.ordinal()] = 24;
            } catch (NoSuchFieldError unused177) {
            }
            try {
                iArr4[o64.a.CHELM_RESIDENT_LICENCE.ordinal()] = 25;
            } catch (NoSuchFieldError unused178) {
            }
            try {
                iArr4[o64.a.LODZ_SENIOR_LICENCE.ordinal()] = 26;
            } catch (NoSuchFieldError unused179) {
            }
            try {
                iArr4[o64.a.LODZ_FAMILY_LICENCE.ordinal()] = 27;
            } catch (NoSuchFieldError unused180) {
            }
            try {
                iArr4[o64.a.SENATOR_CARD.ordinal()] = 28;
            } catch (NoSuchFieldError unused181) {
            }
            try {
                iArr4[o64.a.RACIBORSKA_RESIDENT_LICENCE.ordinal()] = 29;
            } catch (NoSuchFieldError unused182) {
            }
            try {
                iArr4[o64.a.RACIBORSKA_SENIOR_LICENCE.ordinal()] = 30;
            } catch (NoSuchFieldError unused183) {
            }
            try {
                iArr4[o64.a.RACIBORSKA_FAMILY_LICENCE.ordinal()] = 31;
            } catch (NoSuchFieldError unused184) {
            }
            try {
                iArr4[o64.a.GIZYCKA_RESIDENT_LICENCE.ordinal()] = 32;
            } catch (NoSuchFieldError unused185) {
            }
            try {
                iArr4[o64.a.PZPN_LICENCE.ordinal()] = 33;
            } catch (NoSuchFieldError unused186) {
            }
            try {
                iArr4[o64.a.KOBYLKA_RESIDENT_LICENCE.ordinal()] = 34;
            } catch (NoSuchFieldError unused187) {
            }
            try {
                iArr4[o64.a.WROCLAWSKA_SENIOR_LICENCE.ordinal()] = 35;
            } catch (NoSuchFieldError unused188) {
            }
            try {
                iArr4[o64.a.MIEKINIA_SENIOR_LICENCE.ordinal()] = 36;
            } catch (NoSuchFieldError unused189) {
            }
            try {
                iArr4[o64.a.MIEKINIA_FAMILY_LICENCE.ordinal()] = 37;
            } catch (NoSuchFieldError unused190) {
            }
            try {
                iArr4[o64.a.TOPR_LICENCE.ordinal()] = 38;
            } catch (NoSuchFieldError unused191) {
            }
            try {
                iArr4[o64.a.MAZOVIA_LICENCE.ordinal()] = 39;
            } catch (NoSuchFieldError unused192) {
            }
            try {
                iArr4[o64.a.GENERAL_COUNSEL_LICENCE.ordinal()] = 40;
            } catch (NoSuchFieldError unused193) {
            }
            try {
                iArr4[o64.a.OLECKO_RESIDENT_LICENCE.ordinal()] = 41;
            } catch (NoSuchFieldError unused194) {
            }
            try {
                iArr4[o64.a.BYDGOSZCZ_FAMILY_LICENCE.ordinal()] = 42;
            } catch (NoSuchFieldError unused195) {
            }
            try {
                iArr4[o64.a.WODZISLAW_FAMILY_LICENCE.ordinal()] = 43;
            } catch (NoSuchFieldError unused196) {
            }
            try {
                iArr4[o64.a.MICHALOWICE_RESIDENT_LICENCE.ordinal()] = 44;
            } catch (NoSuchFieldError unused197) {
            }
            try {
                iArr4[o64.a.KOLEJE_DOLNOSLASKIE_LICENCE.ordinal()] = 45;
            } catch (NoSuchFieldError unused198) {
            }
            try {
                iArr4[o64.a.WISLA_RESIDENT_LICENCE.ordinal()] = 46;
            } catch (NoSuchFieldError unused199) {
            }
            try {
                iArr4[o64.a.JASTRZEBIA_GORA_RESIDENT_LICENCE.ordinal()] = 47;
            } catch (NoSuchFieldError unused200) {
            }
            try {
                iArr4[o64.a.FIREFIGHTER_OSP_LICENCE.ordinal()] = 48;
            } catch (NoSuchFieldError unused201) {
            }
            try {
                iArr4[o64.a.DOCTOR.ordinal()] = 49;
            } catch (NoSuchFieldError unused202) {
            }
            try {
                iArr4[o64.a.DENTIST.ordinal()] = 50;
            } catch (NoSuchFieldError unused203) {
            }
            try {
                iArr4[o64.a.ATTORNEY_AT_LAW.ordinal()] = 51;
            } catch (NoSuchFieldError unused204) {
            }
            try {
                iArr4[o64.a.TRAINEE_ATTORNEY_AT_LAW.ordinal()] = 52;
            } catch (NoSuchFieldError unused205) {
            }
            try {
                iArr4[o64.a.CIVIL_ENGINEER.ordinal()] = 53;
            } catch (NoSuchFieldError unused206) {
            }
            try {
                iArr4[o64.a.TAX_ADVISOR.ordinal()] = 54;
            } catch (NoSuchFieldError unused207) {
            }
            try {
                iArr4[o64.a.JUNIOR_SCHOOL_CARD_MOBYWATEL_APP.ordinal()] = 55;
            } catch (NoSuchFieldError unused208) {
            }
            try {
                iArr4[o64.a.AUDITOR.ordinal()] = 56;
            } catch (NoSuchFieldError unused209) {
            }
            try {
                iArr4[o64.a.SOLIDARITY_CARD.ordinal()] = 57;
            } catch (NoSuchFieldError unused210) {
            }
            try {
                iArr4[o64.a.PHD_STUDENT.ordinal()] = 58;
            } catch (NoSuchFieldError unused211) {
            }
            try {
                iArr4[o64.a.PHYSIOTHERAPIST.ordinal()] = 59;
            } catch (NoSuchFieldError unused212) {
            }
            try {
                iArr4[o64.a.PHARMACIST.ordinal()] = 60;
            } catch (NoSuchFieldError unused213) {
            }
            try {
                iArr4[o64.a.SHOOTING_LICENCE.ordinal()] = 61;
            } catch (NoSuchFieldError unused214) {
            }
            try {
                iArr4[o64.a.SPORT_SHOOTING_COMPETITOR_LICENCE.ordinal()] = 62;
            } catch (NoSuchFieldError unused215) {
            }
            try {
                iArr4[o64.a.SPORT_SHOOTING_COACH_LICENCE.ordinal()] = 63;
            } catch (NoSuchFieldError unused216) {
            }
            try {
                iArr4[o64.a.SPORT_SHOOTING_INSTRUCTOR_LICENCE.ordinal()] = 64;
            } catch (NoSuchFieldError unused217) {
            }
            try {
                iArr4[o64.a.SPORT_SHOOTING_REFEREE_LICENCE_STATIC_SHOOTING.ordinal()] = 65;
            } catch (NoSuchFieldError unused218) {
            }
            try {
                iArr4[o64.a.SPORT_SHOOTING_REFEREE_LICENCE_DYNAMIC_SHOOTING.ordinal()] = 66;
            } catch (NoSuchFieldError unused219) {
            }
            try {
                iArr4[o64.a.SPORT_SHOOTING_RANGE_OFFICER_LICENCE.ordinal()] = 67;
            } catch (NoSuchFieldError unused220) {
            }
            try {
                iArr4[o64.a.LABORATORY_DIAGNOSTICIAN.ordinal()] = 68;
            } catch (NoSuchFieldError unused221) {
            }
            try {
                iArr4[o64.a.PENSIONER_MSWIA.ordinal()] = 69;
            } catch (NoSuchFieldError unused222) {
            }
            try {
                iArr4[o64.a.DISABLED_PERSON_IDENTIFICATION_CARD.ordinal()] = 70;
            } catch (NoSuchFieldError unused223) {
            }
            try {
                iArr4[o64.a.TEACHER.ordinal()] = 71;
            } catch (NoSuchFieldError unused224) {
            }
            try {
                iArr4[o64.a.BAILIFF_CARD.ordinal()] = 72;
            } catch (NoSuchFieldError unused225) {
            }
            try {
                iArr4[o64.a.ELECTRONIC_DIPLOMA.ordinal()] = 73;
            } catch (NoSuchFieldError unused226) {
            }
            try {
                iArr4[o64.a.ELECTRONIC_DIPLOMA_PHD.ordinal()] = 74;
            } catch (NoSuchFieldError unused227) {
            }
            try {
                iArr4[o64.a.ELECTRONIC_DIPLOMA_DSC.ordinal()] = 75;
            } catch (NoSuchFieldError unused228) {
            }
            try {
                iArr4[o64.a.GIOS.ordinal()] = 76;
            } catch (NoSuchFieldError unused229) {
            }
            try {
                iArr4[o64.a.MAKE_PROPOSAL.ordinal()] = 77;
            } catch (NoSuchFieldError unused230) {
            }
            try {
                iArr4[o64.a.E_PAYMENTS.ordinal()] = 78;
            } catch (NoSuchFieldError unused231) {
            }
            try {
                iArr4[o64.a.ZUS_VISIT.ordinal()] = 79;
            } catch (NoSuchFieldError unused232) {
            }
            try {
                iArr4[o64.a.PENALTY_POINTS.ordinal()] = 80;
            } catch (NoSuchFieldError unused233) {
            }
            try {
                iArr4[o64.a.TRAIN_TICKETS.ordinal()] = 81;
            } catch (NoSuchFieldError unused234) {
            }
            try {
                iArr4[o64.a.GAS_SUPPLEMENT.ordinal()] = 82;
            } catch (NoSuchFieldError unused235) {
            }
            try {
                iArr4[o64.a.ABROAD_INFO.ordinal()] = 83;
            } catch (NoSuchFieldError unused236) {
            }
            try {
                iArr4[o64.a.MEDICAL_PRESCRIPTIONS.ordinal()] = 84;
            } catch (NoSuchFieldError unused237) {
            }
            try {
                iArr4[o64.a.COAL_SUPPLEMENT.ordinal()] = 85;
            } catch (NoSuchFieldError unused238) {
            }
            try {
                iArr4[o64.a.ENERGY_LIMIT_STATEMENT.ordinal()] = 86;
            } catch (NoSuchFieldError unused239) {
            }
            try {
                iArr4[o64.a.SAFE_BUS.ordinal()] = 87;
            } catch (NoSuchFieldError unused240) {
            }
            try {
                iArr4[o64.a.VEHICLE_HISTORY.ordinal()] = 88;
            } catch (NoSuchFieldError unused241) {
            }
            try {
                iArr4[o64.a.PESEL_RESTRICTION.ordinal()] = 89;
            } catch (NoSuchFieldError unused242) {
            }
            try {
                iArr4[o64.a.CRACOW_CITY_CARD.ordinal()] = 90;
            } catch (NoSuchFieldError unused243) {
            }
            try {
                iArr4[o64.a.AIR_QUALITY.ordinal()] = 91;
            } catch (NoSuchFieldError unused244) {
            }
            try {
                iArr4[o64.a.ELECTORAL_REGISTER.ordinal()] = 92;
            } catch (NoSuchFieldError unused245) {
            }
            try {
                iArr4[o64.a.GIVE_ELECTORAL_SUPPORT.ordinal()] = 93;
            } catch (NoSuchFieldError unused246) {
            }
            try {
                iArr4[o64.a.FINES.ordinal()] = 94;
            } catch (NoSuchFieldError unused247) {
            }
            try {
                iArr4[o64.a.PESEL_RESTRICTION_VERIFICATION.ordinal()] = 95;
            } catch (NoSuchFieldError unused248) {
            }
            try {
                iArr4[o64.a.MY_CASES.ordinal()] = 96;
            } catch (NoSuchFieldError unused249) {
            }
            try {
                iArr4[o64.a.DOCUMENT_SIGNING.ordinal()] = 97;
            } catch (NoSuchFieldError unused250) {
            }
            try {
                iArr4[o64.a.PASSPORTS_DATA.ordinal()] = 98;
            } catch (NoSuchFieldError unused251) {
            }
            try {
                iArr4[o64.a.VEHICLE_COLLISION_DATA.ordinal()] = 99;
            } catch (NoSuchFieldError unused252) {
            }
            try {
                iArr4[o64.a.CHILD_PASSPORT_APPLICATION_DATA.ordinal()] = 100;
            } catch (NoSuchFieldError unused253) {
            }
            try {
                iArr4[o64.a.COMPANY.ordinal()] = 101;
            } catch (NoSuchFieldError unused254) {
            }
            try {
                iArr4[o64.a.VEHICLE_COLLISION.ordinal()] = 102;
            } catch (NoSuchFieldError unused255) {
            }
            try {
                iArr4[o64.a.NETWORK_SECURITY_ISSUES.ordinal()] = 103;
            } catch (NoSuchFieldError unused256) {
            }
            try {
                iArr4[o64.a.ENERGY_VOUCHER.ordinal()] = 104;
            } catch (NoSuchFieldError unused257) {
            }
            try {
                iArr4[o64.a.FLOOD_ALERT.ordinal()] = 105;
            } catch (NoSuchFieldError unused258) {
            }
            try {
                iArr4[o64.a.APPLICATION_FORM_SERVICES.ordinal()] = 106;
            } catch (NoSuchFieldError unused259) {
            }
            try {
                iArr4[o64.a.IDENTITY_CARD_SUSPENSION.ordinal()] = 107;
            } catch (NoSuchFieldError unused260) {
            }
            try {
                iArr4[o64.a.IDENTITY_CARD_INVALIDATION.ordinal()] = 108;
            } catch (NoSuchFieldError unused261) {
            }
            try {
                iArr4[o64.a.DRIVER_QUALIFICATIONS.ordinal()] = 109;
            } catch (NoSuchFieldError unused262) {
            }
            try {
                iArr4[o64.a.DOCUMENT_RESTRICTION.ordinal()] = 110;
            } catch (NoSuchFieldError unused263) {
            }
            try {
                iArr4[o64.a.ID_CARD_VERIFICATION.ordinal()] = 111;
            } catch (NoSuchFieldError unused264) {
            }
            try {
                iArr4[o64.a.ID_CARD_COLLECTING.ordinal()] = 112;
            } catch (NoSuchFieldError unused265) {
            }
            try {
                iArr4[o64.a.MY_IKP.ordinal()] = 113;
            } catch (NoSuchFieldError unused266) {
            }
            try {
                iArr4[o64.a.DEFENCE_TRAINING.ordinal()] = 114;
            } catch (NoSuchFieldError unused267) {
            }
            try {
                iArr4[o64.a.QUALIFIED_SIGNATURE.ordinal()] = 115;
            } catch (NoSuchFieldError unused268) {
            }
            try {
                iArr4[o64.a.LAND_REGISTRY.ordinal()] = 116;
            } catch (NoSuchFieldError unused269) {
            }
            try {
                iArr4[o64.a.CHECK_VEHICLE_INSURANCE.ordinal()] = 117;
            } catch (NoSuchFieldError unused270) {
            }
            try {
                iArr4[o64.a.NATIONAL_COURT_REGISTER.ordinal()] = 118;
            } catch (NoSuchFieldError unused271) {
            }
            try {
                iArr4[o64.a.MILITARY_ALERT.ordinal()] = 119;
            } catch (NoSuchFieldError unused272) {
            }
            try {
                iArr4[o64.a.SAFETY_GUIDE.ordinal()] = 120;
            } catch (NoSuchFieldError unused273) {
            }
            try {
                iArr4[o64.a.PASSPORT_PICKUP.ordinal()] = 121;
            } catch (NoSuchFieldError unused274) {
            }
            try {
                iArr4[o64.a.INTERNET_ACCESS.ordinal()] = 122;
            } catch (NoSuchFieldError unused275) {
            }
            try {
                iArr4[o64.a.TRAVEL_ABROAD.ordinal()] = 123;
            } catch (NoSuchFieldError unused276) {
            }
            try {
                iArr4[o64.a.JUNIOR_SCHOOL_EDUCATION.ordinal()] = 124;
            } catch (NoSuchFieldError unused277) {
            }
            try {
                iArr4[o64.a.SANITARY_VIOLATION.ordinal()] = 125;
            } catch (NoSuchFieldError unused278) {
            }
            try {
                iArr4[o64.a.YOUR_DATA_CONTACT_DETAILS.ordinal()] = 126;
            } catch (NoSuchFieldError unused279) {
            }
            try {
                iArr4[o64.a.YOUR_DATA_RESIDENCE_DETAILS.ordinal()] = 127;
            } catch (NoSuchFieldError unused280) {
            }
            try {
                iArr4[o64.a.YOUR_DATA_PASSPORT_DETAILS.ordinal()] = 128;
            } catch (NoSuchFieldError unused281) {
            }
            try {
                iArr4[o64.a.SETTINGS_CHANGE_PASSWORD.ordinal()] = 129;
            } catch (NoSuchFieldError unused282) {
            }
            try {
                iArr4[o64.a.SETTINGS_BIOMETRIC_LOGIN.ordinal()] = 130;
            } catch (NoSuchFieldError unused283) {
            }
            try {
                iArr4[o64.a.SETTINGS_NOTIFICATIONS.ordinal()] = 131;
            } catch (NoSuchFieldError unused284) {
            }
            try {
                iArr4[o64.a.SETTINGS_APPEARANCE.ordinal()] = 132;
            } catch (NoSuchFieldError unused285) {
            }
            try {
                iArr4[o64.a.SETTINGS_APP_LANGUAGE.ordinal()] = 133;
            } catch (NoSuchFieldError unused286) {
            }
            try {
                iArr4[o64.a.SETTINGS_ISSUED_CERTIFICATES.ordinal()] = 134;
            } catch (NoSuchFieldError unused287) {
            }
            try {
                iArr4[o64.a.OTHERS_ACTIVITY_HISTORY.ordinal()] = 135;
            } catch (NoSuchFieldError unused288) {
            }
            try {
                iArr4[o64.a.OTHERS_ABOUT_APP.ordinal()] = 136;
            } catch (NoSuchFieldError unused289) {
            }
            try {
                iArr4[o64.a.OTHERS_TECHNICAL_SUPPORT.ordinal()] = 137;
            } catch (NoSuchFieldError unused290) {
            }
            try {
                iArr4[o64.a.OTHERS_RATE_APP.ordinal()] = 138;
            } catch (NoSuchFieldError unused291) {
            }
            try {
                iArr4[o64.a.OTHERS_VIRTUAL_ASSISTANT.ordinal()] = 139;
            } catch (NoSuchFieldError unused292) {
            }
            try {
                iArr4[o64.a.OTHERS_VOTE_FOR_IDEA.ordinal()] = 140;
            } catch (NoSuchFieldError unused293) {
            }
            try {
                iArr4[o64.a.OTHERS_DEACTIVATE_APP.ordinal()] = 141;
            } catch (NoSuchFieldError unused294) {
            }
            try {
                iArr4[o64.a.OTHERS_LOG_OUT.ordinal()] = 142;
            } catch (NoSuchFieldError unused295) {
            }
            try {
                iArr4[o64.a.E_DELIVERY.ordinal()] = 143;
            } catch (NoSuchFieldError unused296) {
            }
            try {
                iArr4[o64.a.NOTIFICATIONS.ordinal()] = 144;
            } catch (NoSuchFieldError unused297) {
            }
            try {
                iArr4[o64.a.VERIFIER.ordinal()] = 145;
            } catch (NoSuchFieldError unused298) {
            }
            try {
                iArr4[o64.a.VEHICLE_REGISTRATION.ordinal()] = 146;
            } catch (NoSuchFieldError unused299) {
            }
            try {
                iArr4[o64.a.EUROPE_READINESS.ordinal()] = 147;
            } catch (NoSuchFieldError unused300) {
            }
            f89827d = iArr4;
        }
    }

    public static final GlobalSearchEntry a(SearchEntryEntity searchEntryEntity) {
        return new GlobalSearchEntry(b(searchEntryEntity.getMainType()), c(searchEntryEntity.getType()));
    }

    public static final c b(o64.c cVar) {
        int i15 = C2129a.f89825b[cVar.ordinal()];
        if (i15 == 1) {
            return c.DOCUMENT;
        }
        if (i15 == 2) {
            return c.SERVICE;
        }
        if (i15 == 3) {
            return c.MENU_ITEMS;
        }
        throw new p();
    }

    public static final d c(o64.a aVar) {
        switch (C2129a.f89827d[aVar.ordinal()]) {
            case 1:
                return d.ID_CARD;
            case 2:
                return d.DRIVING_LICENCE;
            case 3:
                return d.VEHICLE_CARD;
            case 4:
                return d.FAMILY_CARD;
            case 5:
                return d.DIIA_REFUGEE_CARD;
            case 6:
                return d.DIIA_REFUGEE_CHILD_CARD;
            case 7:
                return d.STUDENT_CARD;
            case 8:
                return d.RAILWAY_CARD;
            case 9:
                return d.PENSIONER_CARD;
            case 10:
                return d.DEPUTY_CARD;
            case 11:
                return d.ADVOCATE_CARD;
            case 12:
                return d.MIDWIFE_CARD;
            case 13:
                return d.NURSE_CARD;
            case 14:
                return d.RASKA_SENIOR_LICENCE;
            case 15:
                return d.ZDUNSKOWOLSKA_RESIDENT_LICENCE;
            case 16:
                return d.OLAWA_RESIDENT_LICENCE;
            case 17:
                return d.OLAWA_FAMILY_LICENCE;
            case 18:
                return d.OLAWA_SENIOR_LICENCE;
            case 19:
                return d.ZDUNSKOWOLSKA_FAMILY_LICENCE;
            case 20:
                return d.ZDUNSKOWOLSKA_SENIOR_LICENCE;
            case 21:
                return d.SUCHY_LAS_FAMILY_LICENCE;
            case 22:
                return d.MIEJSKA_AUGUSTOW_TOURIST_LICENCE;
            case 23:
                return d.CHELM_FAMILY_LICENCE;
            case 24:
                return d.CHELM_SENIOR_LICENCE;
            case 25:
                return d.CHELM_RESIDENT_LICENCE;
            case 26:
                return d.LODZ_SENIOR_LICENCE;
            case 27:
                return d.LODZ_FAMILY_LICENCE;
            case 28:
                return d.SENATOR_CARD;
            case 29:
                return d.RACIBORSKA_RESIDENT_LICENCE;
            case 30:
                return d.RACIBORSKA_SENIOR_LICENCE;
            case BERTags.DATE /* 31 */:
                return d.RACIBORSKA_FAMILY_LICENCE;
            case 32:
                return d.GIZYCKA_RESIDENT_LICENCE;
            case 33:
                return d.PZPN_LICENCE;
            case 34:
                return d.KOBYLKA_RESIDENT_LICENCE;
            case 35:
                return d.WROCLAWSKA_SENIOR_LICENCE;
            case 36:
                return d.MIEKINIA_SENIOR_LICENCE;
            case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                return d.MIEKINIA_FAMILY_LICENCE;
            case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                return d.TOPR_LICENCE;
            case EACTags.INTERCHANGE_CONTROL /* 39 */:
                return d.MAZOVIA_LICENCE;
            case 40:
                return d.GENERAL_COUNSEL_LICENCE;
            case EACTags.INTERCHANGE_PROFILE /* 41 */:
                return d.OLECKO_RESIDENT_LICENCE;
            case EACTags.CURRENCY_CODE /* 42 */:
                return d.BYDGOSZCZ_FAMILY_LICENCE;
            case EACTags.DATE_OF_BIRTH /* 43 */:
                return d.WODZISLAW_FAMILY_LICENCE;
            case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                return d.MICHALOWICE_RESIDENT_LICENCE;
            case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                return d.KOLEJE_DOLNOSLASKIE_LICENCE;
            case 46:
                return d.WISLA_RESIDENT_LICENCE;
            case 47:
                return d.JASTRZEBIA_GORA_RESIDENT_LICENCE;
            case 48:
                return d.FIREFIGHTER_OSP_LICENCE;
            case 49:
                return d.DOCTOR;
            case 50:
                return d.DENTIST;
            case EACTags.TRANSACTION_DATE /* 51 */:
                return d.ATTORNEY_AT_LAW;
            case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                return d.TRAINEE_ATTORNEY_AT_LAW;
            case 53:
                return d.CIVIL_ENGINEER;
            case EACTags.CURRENCY_EXPONENT /* 54 */:
                return d.TAX_ADVISOR;
            case 55:
                return d.JUNIOR_SCHOOL_CARD_MOBYWATEL_APP;
            case 56:
                return d.AUDITOR;
            case 57:
                return d.SOLIDARITY_CARD;
            case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                return d.PHD_STUDENT;
            case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                return d.PHYSIOTHERAPIST;
            case 60:
                return d.PHARMACIST;
            case 61:
                return d.SHOOTING_LICENCE;
            case 62:
                return d.SPORT_SHOOTING_COMPETITOR_LICENCE;
            case 63:
                return d.SPORT_SHOOTING_COACH_LICENCE;
            case 64:
                return d.SPORT_SHOOTING_INSTRUCTOR_LICENCE;
            case 65:
                return d.SPORT_SHOOTING_REFEREE_LICENCE_STATIC_SHOOTING;
            case 66:
                return d.SPORT_SHOOTING_REFEREE_LICENCE_DYNAMIC_SHOOTING;
            case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                return d.SPORT_SHOOTING_RANGE_OFFICER_LICENCE;
            case EACTags.APPLICATION_IMAGE /* 68 */:
                return d.LABORATORY_DIAGNOSTICIAN;
            case EACTags.DISPLAY_IMAGE /* 69 */:
                return d.PENSIONER_MSWIA;
            case 70:
                return d.DISABLED_PERSON_IDENTIFICATION_CARD;
            case EACTags.MESSAGE_REFERENCE /* 71 */:
                return d.TEACHER;
            case 72:
                return d.BAILIFF_CARD;
            case 73:
                return d.ELECTRONIC_DIPLOMA_GRADUATION;
            case EACTags.CERTIFICATION_AUTHORITY_PUBLIC_KEY /* 74 */:
                return d.ELECTRONIC_DIPLOMA_PHD;
            case EACTags.DEPRECATED /* 75 */:
                return d.ELECTRONIC_DIPLOMA_DSC;
            case 76:
                return d.GIOS;
            case EACTags.INTEGRATED_CIRCUIT_MANUFACTURER_ID /* 77 */:
                return d.MAKE_PROPOSAL;
            case 78:
                return d.E_PAYMENTS;
            case 79:
                return d.ZUS_VISIT;
            case EACTags.UNIFORM_RESOURCE_LOCATOR /* 80 */:
                return d.PENALTY_POINTS;
            case EACTags.ANSWER_TO_RESET /* 81 */:
                return d.TRAIN_TICKETS;
            case EACTags.HISTORICAL_BYTES /* 82 */:
                return d.GAS_SUPPLEMENT;
            case 83:
                return d.ABROAD_INFO;
            case 84:
                return d.MEDICAL_PRESCRIPTIONS;
            case 85:
                return d.COAL_SUPPLEMENT;
            case 86:
                return d.ENERGY_LIMIT_STATEMENT;
            case 87:
                return d.SAFE_BUS;
            case 88:
                return d.VEHICLE_HISTORY;
            case 89:
                return d.PESEL_RESTRICTION;
            case 90:
                return d.CRACOW_CITY_CARD;
            case 91:
                return d.AIR_QUALITY;
            case 92:
                return d.ELECTORAL_REGISTER;
            case 93:
                return d.GIVE_ELECTORAL_SUPPORT;
            case 94:
                return d.FINES;
            case 95:
                return d.PESEL_RESTRICTION_VERIFICATION;
            case 96:
                return d.MY_CASES;
            case 97:
                return d.DOCUMENT_SIGNING;
            case 98:
                return d.PASSPORTS_DATA;
            case 99:
                return d.VEHICLE_COLLISION_DATA;
            case 100:
                return d.CHILD_PASSPORT_APPLICATION_DATA;
            case 101:
                return d.COMPANY;
            case 102:
                return d.VEHICLE_COLLISION;
            case 103:
                return d.NETWORK_SECURITY_ISSUES;
            case 104:
                return d.ENERGY_VOUCHER;
            case 105:
                return d.FLOOD_ALERT;
            case 106:
                return d.APPLICATION_FORM_SERVICES;
            case 107:
                return d.IDENTITY_CARD_SUSPENSION;
            case 108:
                return d.IDENTITY_CARD_INVALIDATION;
            case 109:
                return d.DRIVER_QUALIFICATIONS;
            case 110:
                return d.DOCUMENT_RESTRICTION;
            case 111:
                return d.ID_CARD_VERIFICATION;
            case 112:
                return d.ID_CARD_COLLECTING;
            case 113:
                return d.MY_IKP;
            case 114:
                return d.DEFENCE_TRAINING;
            case 115:
                return d.QUALIFIED_SIGNATURE;
            case 116:
                return d.LAND_REGISTRY;
            case 117:
                return d.CHECK_VEHICLE_INSURANCE;
            case 118:
                return d.NATIONAL_COURT_REGISTER;
            case 119:
                return d.MILITARY_ALERT;
            case 120:
                return d.SAFETY_GUIDE;
            case 121:
                return d.PASSPORT_PICKUP;
            case 122:
                return d.INTERNET_ACCESS;
            case 123:
                return d.TRAVEL_ABROAD;
            case 124:
                return d.JUNIOR_SCHOOL_EDUCATION;
            case 125:
                return d.SANITARY_VIOLATION;
            case 126:
                return d.YOUR_DATA_CONTACT_DETAILS;
            case CertificateBody.profileType /* 127 */:
                return d.YOUR_DATA_RESIDENCE_DETAILS;
            case 128:
                return d.YOUR_DATA_PASSPORT_DETAILS;
            case 129:
                return d.SETTINGS_CHANGE_PASSWORD;
            case 130:
                return d.SETTINGS_BIOMETRIC_LOGIN;
            case 131:
                return d.SETTINGS_NOTIFICATIONS;
            case 132:
                return d.SETTINGS_APPEARANCE;
            case 133:
                return d.SETTINGS_APP_LANGUAGE;
            case 134:
                return d.SETTINGS_ISSUED_CERTIFICATES;
            case 135:
                return d.OTHERS_ACTIVITY_HISTORY;
            case 136:
                return d.OTHERS_ABOUT_APP;
            case 137:
                return d.OTHERS_TECHNICAL_SUPPORT;
            case 138:
                return d.OTHERS_RATE_APP;
            case 139:
                return d.OTHERS_VIRTUAL_ASSISTANT;
            case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_PSK_WITH_AES_128_CBC_SHA /* 140 */:
                return d.OTHERS_VOTE_FOR_IDEA;
            case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_PSK_WITH_AES_256_CBC_SHA /* 141 */:
                return d.OTHERS_DEACTIVATE_APP;
            case 142:
                return d.OTHERS_LOG_OUT;
            case 143:
                return d.E_DELIVERY;
            case 144:
                return d.NOTIFICATIONS;
            case 145:
                return d.VERIFIER;
            case 146:
                return d.VEHICLE_REGISTRATION;
            case 147:
                return d.EUROPE_READINESS;
            default:
                throw new p();
        }
    }

    public static final o64.a d(d dVar) {
        switch (C2129a.f89826c[dVar.ordinal()]) {
            case 1:
                return o64.a.ID_CARD;
            case 2:
                return o64.a.DRIVING_LICENCE;
            case 3:
                return o64.a.VEHICLE_CARD;
            case 4:
                return o64.a.FAMILY_CARD;
            case 5:
                return o64.a.DIIA_REFUGEE_CARD;
            case 6:
                return o64.a.DIIA_REFUGEE_CHILD_CARD;
            case 7:
                return o64.a.STUDENT_CARD;
            case 8:
                return o64.a.RAILWAY_CARD;
            case 9:
                return o64.a.PENSIONER_CARD;
            case 10:
                return o64.a.DEPUTY_CARD;
            case 11:
                return o64.a.ADVOCATE_CARD;
            case 12:
                return o64.a.MIDWIFE_CARD;
            case 13:
                return o64.a.NURSE_CARD;
            case 14:
                return o64.a.RASKA_SENIOR_LICENCE;
            case 15:
                return o64.a.ZDUNSKOWOLSKA_RESIDENT_LICENCE;
            case 16:
                return o64.a.OLAWA_RESIDENT_LICENCE;
            case 17:
                return o64.a.OLAWA_FAMILY_LICENCE;
            case 18:
                return o64.a.OLAWA_SENIOR_LICENCE;
            case 19:
                return o64.a.ZDUNSKOWOLSKA_FAMILY_LICENCE;
            case 20:
                return o64.a.ZDUNSKOWOLSKA_SENIOR_LICENCE;
            case 21:
                return o64.a.SUCHY_LAS_FAMILY_LICENCE;
            case 22:
                return o64.a.MIEJSKA_AUGUSTOW_TOURIST_LICENCE;
            case 23:
                return o64.a.CHELM_FAMILY_LICENCE;
            case 24:
                return o64.a.CHELM_SENIOR_LICENCE;
            case 25:
                return o64.a.CHELM_RESIDENT_LICENCE;
            case 26:
                return o64.a.LODZ_SENIOR_LICENCE;
            case 27:
                return o64.a.LODZ_FAMILY_LICENCE;
            case 28:
                return o64.a.SENATOR_CARD;
            case 29:
                return o64.a.RACIBORSKA_RESIDENT_LICENCE;
            case 30:
                return o64.a.RACIBORSKA_SENIOR_LICENCE;
            case BERTags.DATE /* 31 */:
                return o64.a.RACIBORSKA_FAMILY_LICENCE;
            case 32:
                return o64.a.GIZYCKA_RESIDENT_LICENCE;
            case 33:
                return o64.a.PZPN_LICENCE;
            case 34:
                return o64.a.KOBYLKA_RESIDENT_LICENCE;
            case 35:
                return o64.a.WROCLAWSKA_SENIOR_LICENCE;
            case 36:
                return o64.a.MIEKINIA_SENIOR_LICENCE;
            case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                return o64.a.MIEKINIA_FAMILY_LICENCE;
            case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                return o64.a.TOPR_LICENCE;
            case EACTags.INTERCHANGE_CONTROL /* 39 */:
                return o64.a.MAZOVIA_LICENCE;
            case 40:
                return o64.a.GENERAL_COUNSEL_LICENCE;
            case EACTags.INTERCHANGE_PROFILE /* 41 */:
                return o64.a.OLECKO_RESIDENT_LICENCE;
            case EACTags.CURRENCY_CODE /* 42 */:
                return o64.a.BYDGOSZCZ_FAMILY_LICENCE;
            case EACTags.DATE_OF_BIRTH /* 43 */:
                return o64.a.WODZISLAW_FAMILY_LICENCE;
            case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                return o64.a.MICHALOWICE_RESIDENT_LICENCE;
            case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                return o64.a.KOLEJE_DOLNOSLASKIE_LICENCE;
            case 46:
                return o64.a.WISLA_RESIDENT_LICENCE;
            case 47:
                return o64.a.JASTRZEBIA_GORA_RESIDENT_LICENCE;
            case 48:
                return o64.a.FIREFIGHTER_OSP_LICENCE;
            case 49:
                return o64.a.DOCTOR;
            case 50:
                return o64.a.DENTIST;
            case EACTags.TRANSACTION_DATE /* 51 */:
                return o64.a.ATTORNEY_AT_LAW;
            case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                return o64.a.TRAINEE_ATTORNEY_AT_LAW;
            case 53:
                return o64.a.CIVIL_ENGINEER;
            case EACTags.CURRENCY_EXPONENT /* 54 */:
                return o64.a.TAX_ADVISOR;
            case 55:
                return o64.a.JUNIOR_SCHOOL_CARD_MOBYWATEL_APP;
            case 56:
                return o64.a.AUDITOR;
            case 57:
                return o64.a.SOLIDARITY_CARD;
            case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                return o64.a.PHD_STUDENT;
            case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                return o64.a.PHYSIOTHERAPIST;
            case 60:
                return o64.a.PHARMACIST;
            case 61:
                return o64.a.SHOOTING_LICENCE;
            case 62:
                return o64.a.SPORT_SHOOTING_COMPETITOR_LICENCE;
            case 63:
                return o64.a.SPORT_SHOOTING_COACH_LICENCE;
            case 64:
                return o64.a.SPORT_SHOOTING_INSTRUCTOR_LICENCE;
            case 65:
                return o64.a.SPORT_SHOOTING_REFEREE_LICENCE_STATIC_SHOOTING;
            case 66:
                return o64.a.SPORT_SHOOTING_REFEREE_LICENCE_DYNAMIC_SHOOTING;
            case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                return o64.a.SPORT_SHOOTING_RANGE_OFFICER_LICENCE;
            case EACTags.APPLICATION_IMAGE /* 68 */:
                return o64.a.LABORATORY_DIAGNOSTICIAN;
            case EACTags.DISPLAY_IMAGE /* 69 */:
                return o64.a.PENSIONER_MSWIA;
            case 70:
                return o64.a.DISABLED_PERSON_IDENTIFICATION_CARD;
            case EACTags.MESSAGE_REFERENCE /* 71 */:
                return o64.a.TEACHER;
            case 72:
                return o64.a.BAILIFF_CARD;
            case 73:
                return o64.a.ELECTRONIC_DIPLOMA;
            case EACTags.CERTIFICATION_AUTHORITY_PUBLIC_KEY /* 74 */:
                return o64.a.ELECTRONIC_DIPLOMA_PHD;
            case EACTags.DEPRECATED /* 75 */:
                return o64.a.ELECTRONIC_DIPLOMA_DSC;
            case 76:
                return o64.a.GIOS;
            case EACTags.INTEGRATED_CIRCUIT_MANUFACTURER_ID /* 77 */:
                return o64.a.MAKE_PROPOSAL;
            case 78:
                return o64.a.E_PAYMENTS;
            case 79:
                return o64.a.ZUS_VISIT;
            case EACTags.UNIFORM_RESOURCE_LOCATOR /* 80 */:
                return o64.a.PENALTY_POINTS;
            case EACTags.ANSWER_TO_RESET /* 81 */:
                return o64.a.TRAIN_TICKETS;
            case EACTags.HISTORICAL_BYTES /* 82 */:
                return o64.a.GAS_SUPPLEMENT;
            case 83:
                return o64.a.ABROAD_INFO;
            case 84:
                return o64.a.MEDICAL_PRESCRIPTIONS;
            case 85:
                return o64.a.COAL_SUPPLEMENT;
            case 86:
                return o64.a.ENERGY_LIMIT_STATEMENT;
            case 87:
                return o64.a.SAFE_BUS;
            case 88:
                return o64.a.VEHICLE_HISTORY;
            case 89:
                return o64.a.PESEL_RESTRICTION;
            case 90:
                return o64.a.CRACOW_CITY_CARD;
            case 91:
                return o64.a.AIR_QUALITY;
            case 92:
                return o64.a.ELECTORAL_REGISTER;
            case 93:
                return o64.a.GIVE_ELECTORAL_SUPPORT;
            case 94:
                return o64.a.FINES;
            case 95:
                return o64.a.PESEL_RESTRICTION_VERIFICATION;
            case 96:
                return o64.a.MY_CASES;
            case 97:
                return o64.a.DOCUMENT_SIGNING;
            case 98:
                return o64.a.PASSPORTS_DATA;
            case 99:
                return o64.a.VEHICLE_COLLISION_DATA;
            case 100:
                return o64.a.COMPANY;
            case 101:
                return o64.a.VEHICLE_COLLISION;
            case 102:
                return o64.a.NETWORK_SECURITY_ISSUES;
            case 103:
                return o64.a.ENERGY_VOUCHER;
            case 104:
                return o64.a.FLOOD_ALERT;
            case 105:
                return o64.a.APPLICATION_FORM_SERVICES;
            case 106:
                return o64.a.IDENTITY_CARD_SUSPENSION;
            case 107:
                return o64.a.IDENTITY_CARD_INVALIDATION;
            case 108:
                return o64.a.DRIVER_QUALIFICATIONS;
            case 109:
                return o64.a.DOCUMENT_RESTRICTION;
            case 110:
                return o64.a.ID_CARD_VERIFICATION;
            case 111:
                return o64.a.ID_CARD_COLLECTING;
            case 112:
                return o64.a.MY_IKP;
            case 113:
                return o64.a.DEFENCE_TRAINING;
            case 114:
                return o64.a.QUALIFIED_SIGNATURE;
            case 115:
                return o64.a.LAND_REGISTRY;
            case 116:
                return o64.a.CHECK_VEHICLE_INSURANCE;
            case 117:
                return o64.a.NATIONAL_COURT_REGISTER;
            case 118:
                return o64.a.MILITARY_ALERT;
            case 119:
                return o64.a.SAFETY_GUIDE;
            case 120:
                return o64.a.PASSPORT_PICKUP;
            case 121:
                return o64.a.CHILD_PASSPORT_APPLICATION_DATA;
            case 122:
                return o64.a.INTERNET_ACCESS;
            case 123:
                return o64.a.TRAVEL_ABROAD;
            case 124:
                return o64.a.JUNIOR_SCHOOL_EDUCATION;
            case 125:
                return o64.a.SANITARY_VIOLATION;
            case 126:
                return o64.a.YOUR_DATA_CONTACT_DETAILS;
            case CertificateBody.profileType /* 127 */:
                return o64.a.YOUR_DATA_RESIDENCE_DETAILS;
            case 128:
                return o64.a.YOUR_DATA_PASSPORT_DETAILS;
            case 129:
                return o64.a.SETTINGS_CHANGE_PASSWORD;
            case 130:
                return o64.a.SETTINGS_BIOMETRIC_LOGIN;
            case 131:
                return o64.a.SETTINGS_NOTIFICATIONS;
            case 132:
                return o64.a.SETTINGS_APPEARANCE;
            case 133:
                return o64.a.SETTINGS_APP_LANGUAGE;
            case 134:
                return o64.a.SETTINGS_ISSUED_CERTIFICATES;
            case 135:
                return o64.a.OTHERS_ACTIVITY_HISTORY;
            case 136:
                return o64.a.OTHERS_ABOUT_APP;
            case 137:
                return o64.a.OTHERS_TECHNICAL_SUPPORT;
            case 138:
                return o64.a.OTHERS_RATE_APP;
            case 139:
                return o64.a.OTHERS_VIRTUAL_ASSISTANT;
            case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_PSK_WITH_AES_128_CBC_SHA /* 140 */:
                return o64.a.OTHERS_VOTE_FOR_IDEA;
            case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_PSK_WITH_AES_256_CBC_SHA /* 141 */:
                return o64.a.OTHERS_DEACTIVATE_APP;
            case 142:
                return o64.a.OTHERS_LOG_OUT;
            case 143:
                return o64.a.E_DELIVERY;
            case 144:
                return o64.a.NOTIFICATIONS;
            case 145:
                return o64.a.VERIFIER;
            case 146:
                return o64.a.VEHICLE_REGISTRATION;
            case 147:
                return o64.a.EUROPE_READINESS;
            default:
                throw new p();
        }
    }

    public static final o64.c e(c cVar) {
        int i15 = C2129a.f89824a[cVar.ordinal()];
        if (i15 == 1) {
            return o64.c.DOCUMENT;
        }
        if (i15 == 2) {
            return o64.c.SERVICE;
        }
        if (i15 == 3) {
            return o64.c.APP_MENU_ITEM;
        }
        throw new p();
    }
}
