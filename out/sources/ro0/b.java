package ro0;

import java.util.ArrayList;
import java.util.List;
import oo0.BEReportIssueReason;
import oo0.Category;
import oo0.CategoryTopics;
import oo0.Topic;
import oq.p;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.eac.EACTags;
import p071kotlin.Metadata;
import pq.v;
import so0.CategorizedTopicsDtoDto;
import so0.CategoryDtoDto;
import so0.CategoryTopicsDtoDto;
import so0.ReportIssueReasonDtoDto;
import so0.TopicDtoDto;
import so0.b0;
import so0.d;
import so0.x;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0011\u0010\u0007\u001a\u00020\u0006*\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\u000b\u001a\u00020\n*\u00020\t¢\u0006\u0004\b\u000b\u0010\f\u001a\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001*\b\u0012\u0004\u0012\u00020\r0\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0011\u0010\u0013\u001a\u00020\u0012*\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0011\u0010\u0015\u001a\u00020\u0011*\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0011\u0010\u0019\u001a\u00020\u0018*\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0011\u0010\u001d\u001a\u00020\u001c*\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lso0/c;", "", "Loo0/d;", "b", "(Lso0/c;)Ljava/util/List;", "Lso0/e;", "Loo0/c;", "f", "(Lso0/e;)Loo0/c;", "Lso0/d;", "Loo0/c$a;", "e", "(Lso0/d;)Loo0/c$a;", "Lso0/a0;", "Loo0/u;", "a", "(Ljava/util/List;)Ljava/util/List;", "Lso0/b0;", "Loo0/u$b;", "g", "(Lso0/b0;)Loo0/u$b;", "h", "(Loo0/u$b;)Lso0/b0;", "Lso0/y;", "Loo0/b;", "d", "(Lso0/y;)Loo0/b;", "Lso0/x;", "Loo0/a;", "c", "(Lso0/x;)Loo0/a;", "feedbackservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f175353a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f175354b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f175355c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f175356d;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.DOCUMENTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.SERVICES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.APPLICATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f175353a = iArr;
            int[] iArr2 = new int[b0.values().length];
            try {
                iArr2[b0.PESEL_RESTRICTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[b0.AIR_QUALITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[b0.VEHICLE_HISTORY.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[b0.MEDICAL_PRESCRIPTIONS.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[b0.SAFE_BUS.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[b0.TRAIN_TICKETS.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[b0.ENVIRONMENTAL_VIOLATION.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[b0.ABROAD_INFO.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[b0.PAYMENTS.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[b0.GAS_SUPPLEMENT.ordinal()] = 10;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[b0.MKA_CARD.ordinal()] = 11;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[b0.E_VISIT_ZUS.ordinal()] = 12;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[b0.PENALTY_POINTS.ordinal()] = 13;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[b0.FINES.ordinal()] = 14;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[b0.DOCUMENT_SIGN.ordinal()] = 15;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[b0.TRUSTED_PROFILE_BANKING.ordinal()] = 16;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[b0.COMPANY.ordinal()] = 17;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[b0.VEHICLE_COLLISION.ordinal()] = 18;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[b0.NETWORK_SECURITY_ISSUES.ordinal()] = 19;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[b0.ENERGY_VOUCHER.ordinal()] = 20;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[b0.MOBILE_ID_CARD.ordinal()] = 21;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[b0.DRIVING_LICENCE.ordinal()] = 22;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr2[b0.VEHICLE_CARD.ordinal()] = 23;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr2[b0.FAMILY_CARD.ordinal()] = 24;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr2[b0.DIIA.ordinal()] = 25;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr2[b0.SCHOOL_STUDENT_CARD.ordinal()] = 26;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr2[b0.UNIVERSITY_STUDENT_CARD.ordinal()] = 27;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr2[b0.PENSIONER.ordinal()] = 28;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr2[b0.UUT_CARD.ordinal()] = 29;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr2[b0.DEPUTY.ordinal()] = 30;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr2[b0.ADVOCATE.ordinal()] = 31;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr2[b0.NURSE.ordinal()] = 32;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr2[b0.DOCTOR.ordinal()] = 33;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr2[b0.DENTIST.ordinal()] = 34;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr2[b0.MIDWIFE.ordinal()] = 35;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr2[b0.OTHER_SERVICES.ordinal()] = 36;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr2[b0.OTHER_DOCUMENTS.ordinal()] = 37;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr2[b0.OTHER.ordinal()] = 38;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr2[b0.APPLICATION_FORM_SERVICES.ordinal()] = 39;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr2[b0.DISABLED_PERSON_IDENTIFICATION_CARD.ordinal()] = 40;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr2[b0.TEACHER.ordinal()] = 41;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr2[b0.CIVIL_ENGINEER.ordinal()] = 42;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr2[b0.FLOOD_ALERT.ordinal()] = 43;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr2[b0.BAILIFF.ordinal()] = 44;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr2[b0.ATTORNEY_AT_LAW.ordinal()] = 45;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr2[b0.TRAINEE_ATTORNEY_AT_LAW.ordinal()] = 46;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr2[b0.DRIVER_QUALIFICATIONS.ordinal()] = 47;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr2[b0.TAX_ADVISOR.ordinal()] = 48;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr2[b0.DOCUMENT_RESTRICTION.ordinal()] = 49;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr2[b0.ID_CARD_COLLECTING.ordinal()] = 50;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr2[b0.ID_CARD_VERIFICATION.ordinal()] = 51;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr2[b0.MY_CASES.ordinal()] = 52;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr2[b0.AUDITOR.ordinal()] = 53;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr2[b0.SOLIDARITY_CARD.ordinal()] = 54;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr2[b0.MY_IKP.ordinal()] = 55;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr2[b0.QUALIFIED_SIGNATURE.ordinal()] = 56;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr2[b0.DEFENCE_TRAINING.ordinal()] = 57;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr2[b0.ELECTRONIC_DELIVERY.ordinal()] = 58;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr2[b0.VEHICLE_INSURANCE_VERIFICATION.ordinal()] = 59;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr2[b0.LAND_REGISTER.ordinal()] = 60;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr2[b0.KRS_DATA.ordinal()] = 61;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr2[b0.SAFETY_GUIDE.ordinal()] = 62;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr2[b0.PASSPORT_PICKUP.ordinal()] = 63;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr2[b0.PHD_STUDENT.ordinal()] = 64;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr2[b0.INTERNET_ACCESS.ordinal()] = 65;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr2[b0.TRAVEL_ABROAD.ordinal()] = 66;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr2[b0.JUNIOR_SCHOOL_EDUCATION.ordinal()] = 67;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                iArr2[b0.PHYSIOTHERAPIST.ordinal()] = 68;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                iArr2[b0.PHARMACIST.ordinal()] = 69;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                iArr2[b0.SANITARY_VIOLATION.ordinal()] = 70;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                iArr2[b0.SHOOTING_LICENCE.ordinal()] = 71;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                iArr2[b0.SPORT_SHOOTING_COMPETITOR_LICENCE.ordinal()] = 72;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                iArr2[b0.SPORT_SHOOTING_COACH_LICENCE.ordinal()] = 73;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                iArr2[b0.SPORT_SHOOTING_INSTRUCTOR_LICENCE.ordinal()] = 74;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                iArr2[b0.SPORT_SHOOTING_REFEREE_LICENCE_STATIC_SHOOTING.ordinal()] = 75;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                iArr2[b0.SPORT_SHOOTING_REFEREE_LICENCE_DYNAMIC_SHOOTING.ordinal()] = 76;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                iArr2[b0.SPORT_SHOOTING_RANGE_OFFICER_LICENCE.ordinal()] = 77;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                iArr2[b0.ELECTRONIC_DIPLOMA_GRADUATION.ordinal()] = 78;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                iArr2[b0.ELECTRONIC_DIPLOMA_PHD.ordinal()] = 79;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                iArr2[b0.ELECTRONIC_DIPLOMA_DSC.ordinal()] = 80;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                iArr2[b0.LABORATORY_DIAGNOSTICIAN.ordinal()] = 81;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                iArr2[b0.PENSIONER_MSWIA.ordinal()] = 82;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                iArr2[b0.VEHICLE_REGISTRATION.ordinal()] = 83;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                iArr2[b0.GIVE_ELECTORAL_SUPPORT.ordinal()] = 84;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                iArr2[b0.EUROPE_READINESS.ordinal()] = 85;
            } catch (NoSuchFieldError unused89) {
            }
            try {
                iArr2[b0.RCB_ALERT.ordinal()] = 86;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                iArr2[b0.UNKNOWN.ordinal()] = 87;
            } catch (NoSuchFieldError unused91) {
            }
            f175354b = iArr2;
            int[] iArr3 = new int[Topic.b.values().length];
            try {
                iArr3[Topic.b.PESEL_RESTRICTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                iArr3[Topic.b.AIR_QUALITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                iArr3[Topic.b.VEHICLE_HISTORY.ordinal()] = 3;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                iArr3[Topic.b.MEDICAL_PRESCRIPTIONS.ordinal()] = 4;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                iArr3[Topic.b.SAFE_BUS.ordinal()] = 5;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                iArr3[Topic.b.TRAIN_TICKETS.ordinal()] = 6;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                iArr3[Topic.b.ENVIRONMENTAL_VIOLATION.ordinal()] = 7;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                iArr3[Topic.b.ABROAD_INFO.ordinal()] = 8;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                iArr3[Topic.b.PAYMENTS.ordinal()] = 9;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                iArr3[Topic.b.GAS_SUPPLEMENT.ordinal()] = 10;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                iArr3[Topic.b.MKA_CARD.ordinal()] = 11;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                iArr3[Topic.b.E_VISIT_ZUS.ordinal()] = 12;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                iArr3[Topic.b.PENALTY_POINTS.ordinal()] = 13;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                iArr3[Topic.b.FINES.ordinal()] = 14;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                iArr3[Topic.b.DOCUMENT_SIGN.ordinal()] = 15;
            } catch (NoSuchFieldError unused106) {
            }
            try {
                iArr3[Topic.b.TRUSTED_PROFILE_BANKING.ordinal()] = 16;
            } catch (NoSuchFieldError unused107) {
            }
            try {
                iArr3[Topic.b.COMPANY.ordinal()] = 17;
            } catch (NoSuchFieldError unused108) {
            }
            try {
                iArr3[Topic.b.VEHICLE_COLLISION.ordinal()] = 18;
            } catch (NoSuchFieldError unused109) {
            }
            try {
                iArr3[Topic.b.NETWORK_SECURITY_ISSUES.ordinal()] = 19;
            } catch (NoSuchFieldError unused110) {
            }
            try {
                iArr3[Topic.b.ENERGY_VOUCHER.ordinal()] = 20;
            } catch (NoSuchFieldError unused111) {
            }
            try {
                iArr3[Topic.b.MOBILE_ID_CARD.ordinal()] = 21;
            } catch (NoSuchFieldError unused112) {
            }
            try {
                iArr3[Topic.b.DRIVING_LICENCE.ordinal()] = 22;
            } catch (NoSuchFieldError unused113) {
            }
            try {
                iArr3[Topic.b.VEHICLE_CARD.ordinal()] = 23;
            } catch (NoSuchFieldError unused114) {
            }
            try {
                iArr3[Topic.b.FAMILY_CARD.ordinal()] = 24;
            } catch (NoSuchFieldError unused115) {
            }
            try {
                iArr3[Topic.b.DIIA.ordinal()] = 25;
            } catch (NoSuchFieldError unused116) {
            }
            try {
                iArr3[Topic.b.SCHOOL_STUDENT_CARD.ordinal()] = 26;
            } catch (NoSuchFieldError unused117) {
            }
            try {
                iArr3[Topic.b.UNIVERSITY_STUDENT_CARD.ordinal()] = 27;
            } catch (NoSuchFieldError unused118) {
            }
            try {
                iArr3[Topic.b.PENSIONER.ordinal()] = 28;
            } catch (NoSuchFieldError unused119) {
            }
            try {
                iArr3[Topic.b.UUT_CARD.ordinal()] = 29;
            } catch (NoSuchFieldError unused120) {
            }
            try {
                iArr3[Topic.b.DEPUTY.ordinal()] = 30;
            } catch (NoSuchFieldError unused121) {
            }
            try {
                iArr3[Topic.b.ADVOCATE.ordinal()] = 31;
            } catch (NoSuchFieldError unused122) {
            }
            try {
                iArr3[Topic.b.NURSE.ordinal()] = 32;
            } catch (NoSuchFieldError unused123) {
            }
            try {
                iArr3[Topic.b.DOCTOR.ordinal()] = 33;
            } catch (NoSuchFieldError unused124) {
            }
            try {
                iArr3[Topic.b.DENTIST.ordinal()] = 34;
            } catch (NoSuchFieldError unused125) {
            }
            try {
                iArr3[Topic.b.MIDWIFE.ordinal()] = 35;
            } catch (NoSuchFieldError unused126) {
            }
            try {
                iArr3[Topic.b.OTHER_SERVICES.ordinal()] = 36;
            } catch (NoSuchFieldError unused127) {
            }
            try {
                iArr3[Topic.b.OTHER_DOCUMENTS.ordinal()] = 37;
            } catch (NoSuchFieldError unused128) {
            }
            try {
                iArr3[Topic.b.OTHER.ordinal()] = 38;
            } catch (NoSuchFieldError unused129) {
            }
            try {
                iArr3[Topic.b.APPLICATION_FORM_SERVICES.ordinal()] = 39;
            } catch (NoSuchFieldError unused130) {
            }
            try {
                iArr3[Topic.b.DISABLED_PERSON_IDENTIFICATION_CARD.ordinal()] = 40;
            } catch (NoSuchFieldError unused131) {
            }
            try {
                iArr3[Topic.b.TEACHER.ordinal()] = 41;
            } catch (NoSuchFieldError unused132) {
            }
            try {
                iArr3[Topic.b.CIVIL_ENGINEER.ordinal()] = 42;
            } catch (NoSuchFieldError unused133) {
            }
            try {
                iArr3[Topic.b.FLOOD_ALERT.ordinal()] = 43;
            } catch (NoSuchFieldError unused134) {
            }
            try {
                iArr3[Topic.b.BAILIFF.ordinal()] = 44;
            } catch (NoSuchFieldError unused135) {
            }
            try {
                iArr3[Topic.b.ATTORNEY_AT_LAW.ordinal()] = 45;
            } catch (NoSuchFieldError unused136) {
            }
            try {
                iArr3[Topic.b.TRAINEE_ATTORNEY_AT_LAW.ordinal()] = 46;
            } catch (NoSuchFieldError unused137) {
            }
            try {
                iArr3[Topic.b.ELECTORAL_REGISTER.ordinal()] = 47;
            } catch (NoSuchFieldError unused138) {
            }
            try {
                iArr3[Topic.b.GIVE_ELECTORAL_SUPPORT.ordinal()] = 48;
            } catch (NoSuchFieldError unused139) {
            }
            try {
                iArr3[Topic.b.DRIVER_QUALIFICATIONS.ordinal()] = 49;
            } catch (NoSuchFieldError unused140) {
            }
            try {
                iArr3[Topic.b.TAX_ADVISOR.ordinal()] = 50;
            } catch (NoSuchFieldError unused141) {
            }
            try {
                iArr3[Topic.b.DOCUMENT_RESTRICTION.ordinal()] = 51;
            } catch (NoSuchFieldError unused142) {
            }
            try {
                iArr3[Topic.b.ID_CARD_COLLECTING.ordinal()] = 52;
            } catch (NoSuchFieldError unused143) {
            }
            try {
                iArr3[Topic.b.ID_CARD_VERIFICATION.ordinal()] = 53;
            } catch (NoSuchFieldError unused144) {
            }
            try {
                iArr3[Topic.b.MY_CASES.ordinal()] = 54;
            } catch (NoSuchFieldError unused145) {
            }
            try {
                iArr3[Topic.b.AUDITOR.ordinal()] = 55;
            } catch (NoSuchFieldError unused146) {
            }
            try {
                iArr3[Topic.b.MY_IKP.ordinal()] = 56;
            } catch (NoSuchFieldError unused147) {
            }
            try {
                iArr3[Topic.b.DEFENCE_TRAINING.ordinal()] = 57;
            } catch (NoSuchFieldError unused148) {
            }
            try {
                iArr3[Topic.b.QUALIFIED_SIGNATURE.ordinal()] = 58;
            } catch (NoSuchFieldError unused149) {
            }
            try {
                iArr3[Topic.b.ELECTRONIC_DELIVERY.ordinal()] = 59;
            } catch (NoSuchFieldError unused150) {
            }
            try {
                iArr3[Topic.b.CHECK_VEHICLE_INSURANCE.ordinal()] = 60;
            } catch (NoSuchFieldError unused151) {
            }
            try {
                iArr3[Topic.b.LAND_REGISTRY.ordinal()] = 61;
            } catch (NoSuchFieldError unused152) {
            }
            try {
                iArr3[Topic.b.SOLIDARITY_CARD.ordinal()] = 62;
            } catch (NoSuchFieldError unused153) {
            }
            try {
                iArr3[Topic.b.NATIONAL_COURT_REGISTER.ordinal()] = 63;
            } catch (NoSuchFieldError unused154) {
            }
            try {
                iArr3[Topic.b.SAFETY_GUIDE.ordinal()] = 64;
            } catch (NoSuchFieldError unused155) {
            }
            try {
                iArr3[Topic.b.PASSPORT_PICKUP.ordinal()] = 65;
            } catch (NoSuchFieldError unused156) {
            }
            try {
                iArr3[Topic.b.PHD_STUDENT.ordinal()] = 66;
            } catch (NoSuchFieldError unused157) {
            }
            try {
                iArr3[Topic.b.INTERNET_ACCESS.ordinal()] = 67;
            } catch (NoSuchFieldError unused158) {
            }
            try {
                iArr3[Topic.b.TRAVEL_ABROAD.ordinal()] = 68;
            } catch (NoSuchFieldError unused159) {
            }
            try {
                iArr3[Topic.b.JUNIOR_SCHOOL_EDUCATION.ordinal()] = 69;
            } catch (NoSuchFieldError unused160) {
            }
            try {
                iArr3[Topic.b.PHYSIOTHERAPIST.ordinal()] = 70;
            } catch (NoSuchFieldError unused161) {
            }
            try {
                iArr3[Topic.b.PHARMACIST.ordinal()] = 71;
            } catch (NoSuchFieldError unused162) {
            }
            try {
                iArr3[Topic.b.SANITARY_VIOLATION.ordinal()] = 72;
            } catch (NoSuchFieldError unused163) {
            }
            try {
                iArr3[Topic.b.SHOOTING_LICENCE.ordinal()] = 73;
            } catch (NoSuchFieldError unused164) {
            }
            try {
                iArr3[Topic.b.SPORT_SHOOTING_COMPETITOR_LICENCE.ordinal()] = 74;
            } catch (NoSuchFieldError unused165) {
            }
            try {
                iArr3[Topic.b.SPORT_SHOOTING_COACH_LICENCE.ordinal()] = 75;
            } catch (NoSuchFieldError unused166) {
            }
            try {
                iArr3[Topic.b.SPORT_SHOOTING_INSTRUCTOR_LICENCE.ordinal()] = 76;
            } catch (NoSuchFieldError unused167) {
            }
            try {
                iArr3[Topic.b.SPORT_SHOOTING_REFEREE_LICENCE_STATIC_SHOOTING.ordinal()] = 77;
            } catch (NoSuchFieldError unused168) {
            }
            try {
                iArr3[Topic.b.SPORT_SHOOTING_REFEREE_LICENCE_DYNAMIC_SHOOTING.ordinal()] = 78;
            } catch (NoSuchFieldError unused169) {
            }
            try {
                iArr3[Topic.b.SPORT_SHOOTING_RANGE_OFFICER_LICENCE.ordinal()] = 79;
            } catch (NoSuchFieldError unused170) {
            }
            try {
                iArr3[Topic.b.ELECTRONIC_DIPLOMA_GRADUATION.ordinal()] = 80;
            } catch (NoSuchFieldError unused171) {
            }
            try {
                iArr3[Topic.b.ELECTRONIC_DIPLOMA_PHD.ordinal()] = 81;
            } catch (NoSuchFieldError unused172) {
            }
            try {
                iArr3[Topic.b.ELECTRONIC_DIPLOMA_DSC.ordinal()] = 82;
            } catch (NoSuchFieldError unused173) {
            }
            try {
                iArr3[Topic.b.LABORATORY_DIAGNOSTICIAN.ordinal()] = 83;
            } catch (NoSuchFieldError unused174) {
            }
            try {
                iArr3[Topic.b.VEHICLE_REGISTRATION.ordinal()] = 84;
            } catch (NoSuchFieldError unused175) {
            }
            try {
                iArr3[Topic.b.PENSIONER_MSWIA.ordinal()] = 85;
            } catch (NoSuchFieldError unused176) {
            }
            try {
                iArr3[Topic.b.EUROPE_READINESS.ordinal()] = 86;
            } catch (NoSuchFieldError unused177) {
            }
            try {
                iArr3[Topic.b.UNKNOWN.ordinal()] = 87;
            } catch (NoSuchFieldError unused178) {
            }
            f175355c = iArr3;
            int[] iArr4 = new int[x.values().length];
            try {
                iArr4[x.MISSING_VEHICLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused179) {
            }
            try {
                iArr4[x.VISIBLE_SOLD_VEHICLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused180) {
            }
            try {
                iArr4[x.MISSING_VEHICLE_CO_OWNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused181) {
            }
            try {
                iArr4[x.VEHICLE_INSURANCE_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused182) {
            }
            try {
                iArr4[x.TECHNICAL_INSPECTION_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused183) {
            }
            try {
                iArr4[x.COUNTER_READING_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused184) {
            }
            try {
                iArr4[x.EURO_STANDARD_ERROR.ordinal()] = 7;
            } catch (NoSuchFieldError unused185) {
            }
            try {
                iArr4[x.OTHER.ordinal()] = 8;
            } catch (NoSuchFieldError unused186) {
            }
            try {
                iArr4[x.UNKNOWN.ordinal()] = 9;
            } catch (NoSuchFieldError unused187) {
            }
            f175356d = iArr4;
        }
    }

    public static final List<Topic> a(List<TopicDtoDto> list) {
        List<TopicDtoDto> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        for (TopicDtoDto topicDtoDto : list2) {
            arrayList.add(new Topic(topicDtoDto.getLabel(), g(topicDtoDto.getType()), topicDtoDto.getEmail()));
        }
        return arrayList;
    }

    public static final List<CategoryTopics> b(CategorizedTopicsDtoDto categorizedTopicsDtoDto) {
        List<Topic> listN;
        List<CategoryTopicsDtoDto> listA = categorizedTopicsDtoDto.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        for (CategoryTopicsDtoDto categoryTopicsDtoDto : listA) {
            Category categoryF = f(categoryTopicsDtoDto.getCategory());
            List<TopicDtoDto> listB = categoryTopicsDtoDto.b();
            if (listB == null || (listN = a(listB)) == null) {
                listN = v.n();
            }
            arrayList.add(new CategoryTopics(categoryF, listN));
        }
        return arrayList;
    }

    public static final oo0.a c(x xVar) {
        switch (a.f175356d[xVar.ordinal()]) {
            case 1:
                return oo0.a.MISSING_VEHICLE;
            case 2:
                return oo0.a.VISIBLE_SOLD_VEHICLE;
            case 3:
                return oo0.a.MISSING_VEHICLE_CO_OWNER;
            case 4:
                return oo0.a.VEHICLE_INSURANCE_ERROR;
            case 5:
                return oo0.a.TECHNICAL_INSPECTION_ERROR;
            case 6:
                return oo0.a.COUNTER_READING_ERROR;
            case 7:
                return oo0.a.EURO_STANDARD_ERROR;
            case 8:
                return oo0.a.OTHER;
            case 9:
                return oo0.a.UNKNOWN;
            default:
                throw new p();
        }
    }

    public static final BEReportIssueReason d(ReportIssueReasonDtoDto reportIssueReasonDtoDto) {
        return new BEReportIssueReason(reportIssueReasonDtoDto.getLabel(), c(reportIssueReasonDtoDto.getType()));
    }

    public static final Category.a e(d dVar) {
        int i15 = a.f175353a[dVar.ordinal()];
        if (i15 == 1) {
            return Category.a.DOCUMENTS;
        }
        if (i15 == 2) {
            return Category.a.SERVICES;
        }
        if (i15 == 3) {
            return Category.a.APPLICATION;
        }
        if (i15 == 4) {
            return Category.a.UNKNOWN;
        }
        throw new p();
    }

    public static final Category f(CategoryDtoDto categoryDtoDto) {
        return new Category(categoryDtoDto.getDescription(), e(categoryDtoDto.getCode()));
    }

    public static final Topic.b g(b0 b0Var) {
        switch (a.f175354b[b0Var.ordinal()]) {
            case 1:
                return Topic.b.PESEL_RESTRICTION;
            case 2:
                return Topic.b.AIR_QUALITY;
            case 3:
                return Topic.b.VEHICLE_HISTORY;
            case 4:
                return Topic.b.MEDICAL_PRESCRIPTIONS;
            case 5:
                return Topic.b.SAFE_BUS;
            case 6:
                return Topic.b.TRAIN_TICKETS;
            case 7:
                return Topic.b.ENVIRONMENTAL_VIOLATION;
            case 8:
                return Topic.b.ABROAD_INFO;
            case 9:
                return Topic.b.PAYMENTS;
            case 10:
                return Topic.b.GAS_SUPPLEMENT;
            case 11:
                return Topic.b.MKA_CARD;
            case 12:
                return Topic.b.E_VISIT_ZUS;
            case 13:
                return Topic.b.PENALTY_POINTS;
            case 14:
                return Topic.b.FINES;
            case 15:
                return Topic.b.DOCUMENT_SIGN;
            case 16:
                return Topic.b.TRUSTED_PROFILE_BANKING;
            case 17:
                return Topic.b.COMPANY;
            case 18:
                return Topic.b.VEHICLE_COLLISION;
            case 19:
                return Topic.b.NETWORK_SECURITY_ISSUES;
            case 20:
                return Topic.b.ENERGY_VOUCHER;
            case 21:
                return Topic.b.MOBILE_ID_CARD;
            case 22:
                return Topic.b.DRIVING_LICENCE;
            case 23:
                return Topic.b.VEHICLE_CARD;
            case 24:
                return Topic.b.FAMILY_CARD;
            case 25:
                return Topic.b.DIIA;
            case 26:
                return Topic.b.SCHOOL_STUDENT_CARD;
            case 27:
                return Topic.b.UNIVERSITY_STUDENT_CARD;
            case 28:
                return Topic.b.PENSIONER;
            case 29:
                return Topic.b.UUT_CARD;
            case 30:
                return Topic.b.DEPUTY;
            case BERTags.DATE /* 31 */:
                return Topic.b.ADVOCATE;
            case 32:
                return Topic.b.NURSE;
            case 33:
                return Topic.b.DOCTOR;
            case 34:
                return Topic.b.DENTIST;
            case 35:
                return Topic.b.MIDWIFE;
            case 36:
                return Topic.b.OTHER_SERVICES;
            case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                return Topic.b.OTHER_DOCUMENTS;
            case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                return Topic.b.OTHER;
            case EACTags.INTERCHANGE_CONTROL /* 39 */:
                return Topic.b.APPLICATION_FORM_SERVICES;
            case 40:
                return Topic.b.DISABLED_PERSON_IDENTIFICATION_CARD;
            case EACTags.INTERCHANGE_PROFILE /* 41 */:
                return Topic.b.TEACHER;
            case EACTags.CURRENCY_CODE /* 42 */:
                return Topic.b.CIVIL_ENGINEER;
            case EACTags.DATE_OF_BIRTH /* 43 */:
                return Topic.b.FLOOD_ALERT;
            case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                return Topic.b.BAILIFF;
            case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                return Topic.b.ATTORNEY_AT_LAW;
            case 46:
                return Topic.b.TRAINEE_ATTORNEY_AT_LAW;
            case 47:
                return Topic.b.DRIVER_QUALIFICATIONS;
            case 48:
                return Topic.b.TAX_ADVISOR;
            case 49:
                return Topic.b.DOCUMENT_RESTRICTION;
            case 50:
                return Topic.b.ID_CARD_COLLECTING;
            case EACTags.TRANSACTION_DATE /* 51 */:
                return Topic.b.ID_CARD_VERIFICATION;
            case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                return Topic.b.MY_CASES;
            case 53:
                return Topic.b.AUDITOR;
            case EACTags.CURRENCY_EXPONENT /* 54 */:
                return Topic.b.SOLIDARITY_CARD;
            case 55:
                return Topic.b.MY_IKP;
            case 56:
                return Topic.b.QUALIFIED_SIGNATURE;
            case 57:
                return Topic.b.DEFENCE_TRAINING;
            case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                return Topic.b.ELECTRONIC_DELIVERY;
            case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                return Topic.b.CHECK_VEHICLE_INSURANCE;
            case 60:
                return Topic.b.LAND_REGISTRY;
            case 61:
                return Topic.b.NATIONAL_COURT_REGISTER;
            case 62:
                return Topic.b.SAFETY_GUIDE;
            case 63:
                return Topic.b.PASSPORT_PICKUP;
            case 64:
                return Topic.b.PHD_STUDENT;
            case 65:
                return Topic.b.INTERNET_ACCESS;
            case 66:
                return Topic.b.TRAVEL_ABROAD;
            case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                return Topic.b.JUNIOR_SCHOOL_EDUCATION;
            case EACTags.APPLICATION_IMAGE /* 68 */:
                return Topic.b.PHYSIOTHERAPIST;
            case EACTags.DISPLAY_IMAGE /* 69 */:
                return Topic.b.PHARMACIST;
            case 70:
                return Topic.b.SANITARY_VIOLATION;
            case EACTags.MESSAGE_REFERENCE /* 71 */:
                return Topic.b.SHOOTING_LICENCE;
            case 72:
                return Topic.b.SPORT_SHOOTING_COMPETITOR_LICENCE;
            case 73:
                return Topic.b.SPORT_SHOOTING_COACH_LICENCE;
            case EACTags.CERTIFICATION_AUTHORITY_PUBLIC_KEY /* 74 */:
                return Topic.b.SPORT_SHOOTING_INSTRUCTOR_LICENCE;
            case EACTags.DEPRECATED /* 75 */:
                return Topic.b.SPORT_SHOOTING_REFEREE_LICENCE_STATIC_SHOOTING;
            case 76:
                return Topic.b.SPORT_SHOOTING_REFEREE_LICENCE_DYNAMIC_SHOOTING;
            case EACTags.INTEGRATED_CIRCUIT_MANUFACTURER_ID /* 77 */:
                return Topic.b.SPORT_SHOOTING_RANGE_OFFICER_LICENCE;
            case 78:
                return Topic.b.ELECTRONIC_DIPLOMA_GRADUATION;
            case 79:
                return Topic.b.ELECTRONIC_DIPLOMA_PHD;
            case EACTags.UNIFORM_RESOURCE_LOCATOR /* 80 */:
                return Topic.b.ELECTRONIC_DIPLOMA_DSC;
            case EACTags.ANSWER_TO_RESET /* 81 */:
                return Topic.b.LABORATORY_DIAGNOSTICIAN;
            case EACTags.HISTORICAL_BYTES /* 82 */:
                return Topic.b.PENSIONER_MSWIA;
            case 83:
                return Topic.b.VEHICLE_REGISTRATION;
            case 84:
                return Topic.b.GIVE_ELECTORAL_SUPPORT;
            case 85:
                return Topic.b.EUROPE_READINESS;
            case 86:
            case 87:
                return Topic.b.UNKNOWN;
            default:
                throw new p();
        }
    }

    public static final b0 h(Topic.b bVar) {
        switch (a.f175355c[bVar.ordinal()]) {
            case 1:
                return b0.PESEL_RESTRICTION;
            case 2:
                return b0.AIR_QUALITY;
            case 3:
                return b0.VEHICLE_HISTORY;
            case 4:
                return b0.MEDICAL_PRESCRIPTIONS;
            case 5:
                return b0.SAFE_BUS;
            case 6:
                return b0.TRAIN_TICKETS;
            case 7:
                return b0.ENVIRONMENTAL_VIOLATION;
            case 8:
                return b0.ABROAD_INFO;
            case 9:
                return b0.PAYMENTS;
            case 10:
                return b0.GAS_SUPPLEMENT;
            case 11:
                return b0.MKA_CARD;
            case 12:
                return b0.E_VISIT_ZUS;
            case 13:
                return b0.PENALTY_POINTS;
            case 14:
                return b0.FINES;
            case 15:
                return b0.DOCUMENT_SIGN;
            case 16:
                return b0.TRUSTED_PROFILE_BANKING;
            case 17:
                return b0.COMPANY;
            case 18:
                return b0.VEHICLE_COLLISION;
            case 19:
                return b0.NETWORK_SECURITY_ISSUES;
            case 20:
                return b0.ENERGY_VOUCHER;
            case 21:
                return b0.MOBILE_ID_CARD;
            case 22:
                return b0.DRIVING_LICENCE;
            case 23:
                return b0.VEHICLE_CARD;
            case 24:
                return b0.FAMILY_CARD;
            case 25:
                return b0.DIIA;
            case 26:
                return b0.SCHOOL_STUDENT_CARD;
            case 27:
                return b0.UNIVERSITY_STUDENT_CARD;
            case 28:
                return b0.PENSIONER;
            case 29:
                return b0.UUT_CARD;
            case 30:
                return b0.DEPUTY;
            case BERTags.DATE /* 31 */:
                return b0.ADVOCATE;
            case 32:
                return b0.NURSE;
            case 33:
                return b0.DOCTOR;
            case 34:
                return b0.DENTIST;
            case 35:
                return b0.MIDWIFE;
            case 36:
                return b0.OTHER_SERVICES;
            case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                return b0.OTHER_DOCUMENTS;
            case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                return b0.OTHER;
            case EACTags.INTERCHANGE_CONTROL /* 39 */:
                return b0.APPLICATION_FORM_SERVICES;
            case 40:
                return b0.DISABLED_PERSON_IDENTIFICATION_CARD;
            case EACTags.INTERCHANGE_PROFILE /* 41 */:
                return b0.TEACHER;
            case EACTags.CURRENCY_CODE /* 42 */:
                return b0.CIVIL_ENGINEER;
            case EACTags.DATE_OF_BIRTH /* 43 */:
                return b0.FLOOD_ALERT;
            case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                return b0.BAILIFF;
            case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                return b0.ATTORNEY_AT_LAW;
            case 46:
                return b0.TRAINEE_ATTORNEY_AT_LAW;
            case 47:
                return b0.UNKNOWN;
            case 48:
                return b0.GIVE_ELECTORAL_SUPPORT;
            case 49:
                return b0.DRIVER_QUALIFICATIONS;
            case 50:
                return b0.TAX_ADVISOR;
            case EACTags.TRANSACTION_DATE /* 51 */:
                return b0.DOCUMENT_RESTRICTION;
            case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                return b0.ID_CARD_COLLECTING;
            case 53:
                return b0.ID_CARD_VERIFICATION;
            case EACTags.CURRENCY_EXPONENT /* 54 */:
                return b0.MY_CASES;
            case 55:
                return b0.AUDITOR;
            case 56:
                return b0.MY_IKP;
            case 57:
                return b0.DEFENCE_TRAINING;
            case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                return b0.QUALIFIED_SIGNATURE;
            case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                return b0.ELECTRONIC_DELIVERY;
            case 60:
                return b0.VEHICLE_INSURANCE_VERIFICATION;
            case 61:
                return b0.LAND_REGISTER;
            case 62:
                return b0.SOLIDARITY_CARD;
            case 63:
                return b0.KRS_DATA;
            case 64:
                return b0.SAFETY_GUIDE;
            case 65:
                return b0.PASSPORT_PICKUP;
            case 66:
                return b0.PHD_STUDENT;
            case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                return b0.INTERNET_ACCESS;
            case EACTags.APPLICATION_IMAGE /* 68 */:
                return b0.TRAVEL_ABROAD;
            case EACTags.DISPLAY_IMAGE /* 69 */:
                return b0.JUNIOR_SCHOOL_EDUCATION;
            case 70:
                return b0.PHYSIOTHERAPIST;
            case EACTags.MESSAGE_REFERENCE /* 71 */:
                return b0.PHARMACIST;
            case 72:
                return b0.SANITARY_VIOLATION;
            case 73:
                return b0.SHOOTING_LICENCE;
            case EACTags.CERTIFICATION_AUTHORITY_PUBLIC_KEY /* 74 */:
                return b0.SPORT_SHOOTING_COMPETITOR_LICENCE;
            case EACTags.DEPRECATED /* 75 */:
                return b0.SPORT_SHOOTING_COACH_LICENCE;
            case 76:
                return b0.SPORT_SHOOTING_INSTRUCTOR_LICENCE;
            case EACTags.INTEGRATED_CIRCUIT_MANUFACTURER_ID /* 77 */:
                return b0.SPORT_SHOOTING_REFEREE_LICENCE_STATIC_SHOOTING;
            case 78:
                return b0.SPORT_SHOOTING_REFEREE_LICENCE_DYNAMIC_SHOOTING;
            case 79:
                return b0.SPORT_SHOOTING_RANGE_OFFICER_LICENCE;
            case EACTags.UNIFORM_RESOURCE_LOCATOR /* 80 */:
                return b0.ELECTRONIC_DIPLOMA_GRADUATION;
            case EACTags.ANSWER_TO_RESET /* 81 */:
                return b0.ELECTRONIC_DIPLOMA_PHD;
            case EACTags.HISTORICAL_BYTES /* 82 */:
                return b0.ELECTRONIC_DIPLOMA_DSC;
            case 83:
                return b0.LABORATORY_DIAGNOSTICIAN;
            case 84:
                return b0.VEHICLE_REGISTRATION;
            case 85:
                return b0.PENSIONER_MSWIA;
            case 86:
                return b0.EUROPE_READINESS;
            case 87:
                return b0.UNKNOWN;
            default:
                throw new p();
        }
    }
}
