package nt0;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kt0.NotificationRecord;
import kt0.NotificationSettingsEntry;
import kt0.NotificationSettingsSection;
import kt0.NotificationsHistoryModel;
import kt0.PushNotificationSettings;
import kt0.RegisterDeviceRequest;
import kt0.RegisterDeviceResponse;
import kt0.RemoteMessageParameters;
import oq.p;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.eac.EACTags;
import ot0.ExternalQualifiedSignatureAuthorizationParametersDto;
import ot0.PaymentParametersDto;
import ot0.PushHistoryDto;
import ot0.PushHistoryEntryDto;
import ot0.PushParametersDto;
import ot0.PushSettingsDto;
import ot0.PushSettingsEntryDto;
import ot0.PushSettingsEntryPresentationDto;
import ot0.PushSettingsPresentationDto;
import ot0.PushSettingsSectionPresentationDto;
import ot0.RegisterDeviceRequestDto;
import ot0.RegisterDeviceResponseDto;
import ot0.TravelAdvisoryParametersDto;
import ot0.TrustedProfileAuthorizationParametersDto;
import ot0.m;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0016\u001a\u00020\u0015*\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0011\u0010\u001a\u001a\u00020\u0019*\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0011\u0010\u001e\u001a\u00020\u001d*\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0011\u0010\"\u001a\u00020!*\u00020 ¢\u0006\u0004\b\"\u0010#\u001a\u0011\u0010&\u001a\u00020%*\u00020$¢\u0006\u0004\b&\u0010'\u001a\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)*\u00020(¢\u0006\u0004\b+\u0010,\u001a\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020.0)*\b\u0012\u0004\u0012\u00020-0)¢\u0006\u0004\b/\u00100\u001a\u0017\u00103\u001a\u000202*\b\u0012\u0004\u0012\u0002010)¢\u0006\u0004\b3\u00104¨\u00065"}, d2 = {"Lot0/f;", "Lkt0/b;", "c", "(Lot0/f;)Lkt0/b;", "Lot0/m;", "Lkt0/b$a;", "m", "(Lot0/m;)Lkt0/b$a;", "Lot0/e;", "Lkt0/e;", "d", "(Lot0/e;)Lkt0/e;", "Lkt0/g;", "Lot0/n;", "l", "(Lkt0/g;)Lot0/n;", "Lot0/o;", "Lkt0/h;", "e", "(Lot0/o;)Lkt0/h;", "Lot0/g;", "Lkt0/i;", "j", "(Lot0/g;)Lkt0/i;", "Lot0/d;", "Lkt0/i$b;", "g", "(Lot0/d;)Lkt0/i$b;", "Lot0/r;", "Lkt0/i$d;", "i", "(Lot0/r;)Lkt0/i$d;", "Lot0/a;", "Lkt0/i$a;", "f", "(Lot0/a;)Lkt0/i$a;", "Lot0/q;", "Lkt0/i$c;", "h", "(Lot0/q;)Lkt0/i$c;", "Lot0/k;", "", "Lkt0/d;", "b", "(Lot0/k;)Ljava/util/List;", "Lot0/j;", "Lkt0/c;", "a", "(Ljava/util/List;)Ljava/util/List;", "Lkt0/f;", "Lot0/h;", "k", "(Ljava/util/List;)Lot0/h;", "pushservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: nt0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C3411a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f138310a;

        static {
            int[] iArr = new int[m.values().length];
            try {
                iArr[m.CERTIFICATE_EXPIRY_REMINDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m.CERTIFICATE_REVOKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m.DOCUMENT_REVOKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[m.OTHER_DEVICE_APP_ACTIVATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[m.LEGACY_GENERIC_MESSAGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[m.LEGACY_GENERIC_INTERACTION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[m.MOBYWATEL_NEWS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[m.SECURITY_NEWS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[m.EDELIVERY_MESSAGE_RECEIVED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[m.EDELIVERY_MESSAGE_SENT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[m.EDELIVERY_MESSAGE_FAILED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[m.EDELIVERY_MESSAGE_REJECTED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[m.EDELIVERY_APPLICATION_RECEIVED.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[m.EDELIVERY_APPLICATION_ACCEPTED.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[m.EDELIVERY_APPLICATION_REJECTED.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[m.EDELIVERY_ADDRESS_ACTIVATED.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[m.EDELIVERY_ADDRESS_DEACTIVATED.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[m.NEW_PAYMENT.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[m.PAYMENT_REMINDER.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[m.PAYMENT_EXPIRED.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[m.PAYMENT_CANCELLED.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[m.PAYMENT_FULFILLED.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[m.PAYMENT_REJECTED.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[m.PESEL_VERIFIED.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[m.PESEL_CANCELLED.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[m.PESEL_SUSPENDED.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[m.PESEL_SUSPENSION_CANCELLED.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[m.NEW_PERSONAL_DOCUMENT_AVAILABLE.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[m.PERSONAL_DOCUMENT_EXPIRED.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[m.OLD_PERSONAL_DOCUMENT_EXPIRED.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[m.PERSONAL_DOCUMENT_EXPIRATION_REMINDER.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[m.TAX_OFFICE_DELIVERY_RECEIVED.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[m.TRUSTED_PROFILE_DOCUMENT_SIGNED.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[m.TRUSTED_PROFILE_INIT_APPLICATION_CREATED.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[m.TRUSTED_PROFILE_EXTEND_APPLICATION_CREATED.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[m.TRUSTED_PROFILE_LOGIN_FAILED.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[m.TRUSTED_PROFILE_AUTHORIZATION_METHOD_CHANGED.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[m.TRUSTED_PROFILE_DATA_CHANGED.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[m.TRUSTED_PROFILE_DATA_UPDATED.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[m.TRUSTED_PROFILE_REVOKED.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[m.TRUSTED_PROFILE_EXPIRED.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[m.TRUSTED_PROFILE_EXPIRATION_EXTENDED.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[m.TRUSTED_PROFILE_EXPIRATION_REMINDER.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[m.TEMPORARY_DRIVING_LICENCE_CREATED.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[m.CONTACT_DATA_CHANGED.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[m.TRUSTED_PROFILE_AUTHORIZATION_DATA_CHANGED.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[m.VEHICLE_COLLISION_WORKING_COPY_EXPIRY_REMINDER.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[m.TRUSTED_PROFILE_ACCOUNT_DEACTIVATION.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[m.COMPANY_ACTIVATION_KRUS_NEXT_STEPS.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr[m.COMPANY_ACTIVATION_ZUS_NEXT_STEPS.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr[m.COMPANY_ACTIVATION_ZUS_CONTRIBUTION_EXEMPTION.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr[m.COMPANY_ACTIVATION_ZUS_CONTRIBUTION_REDUCTION.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr[m.COMPANY_CONCESSION_TERMINATION_REMINDER.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr[m.COMPANY_NIP_CREATED.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr[m.COMPANY_REGON_CREATED.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr[m.COMPANY_STATUS_CHANGED.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr[m.COMPANY_EDELIVERY_ACTIVATED.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr[m.COMPANY_PKD_UPDATE.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr[m.COMPANY_EDELIVERY_ACTIVATION_REMINDER.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr[m.COMPANY_CASH_BASED_PIT_SETTLEMENT.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr[m.COMPANY_KRS_FINANCIAL_STATEMENT.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr[m.COMPANY_BY_OTHER_CHANNEL_SUSPENDED.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr[m.COMPANY_DATA_UPDATED.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr[m.COMPANY_ACTIVATED.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr[m.COMPANY_REACTIVATED.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr[m.COMPANY_APPLICATION_SUSPENSION_ACCEPTED.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr[m.COMPANY_APPLICATION_DATA_UPDATE_CANCELLED.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr[m.DIFFERENT_DEFENCE_TRAINING_PROPOSITION_FROM_RESERVE_LIST.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr[m.DIFFERENT_DEFENCE_TRAINING_PROPOSITION_FOR_PREVIOUS_CANCELLED.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr[m.DEFENCE_TRAINING_CANCELLED.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr[m.REGISTRATION_FOR_DEFENCE_TRAINING_FROM_RESERVE_LIST.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                iArr[m.UPCOMING_DEFENCE_TRAINING_REMINDER.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                iArr[m.POSSIBILITY_OF_DEFENCE_TRAINING_CANCELLATION_REMINDER.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                iArr[m.REGISTRATION_FOR_DEFENCE_TRAINING_CLOSED.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                iArr[m.NATIONAL_COURT_REGISTRY_CASE_REGISTERED.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                iArr[m.NATIONAL_COURT_REGISTRY_DATA_CHANGED.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                iArr[m.NATIONAL_COURT_REGISTRY_SUBSCRIPTION_EXPIRY_REMINDER.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                iArr[m.NATIONAL_COURT_REGISTRY_SUBSCRIPTION_EXPIRED.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                iArr[m.TEMPORARY_DRIVING_LICENCE_CREATION_AWAIT_AGE_REQUIREMENT.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                iArr[m.TEMPORARY_DRIVING_LICENCE_WITH_PROBATIONARY_PERIOD_CREATED.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                iArr[m.DRIVING_PROBATIONARY_PERIOD_SECOND_SAFETY_RELATED_TRAFFIC_VIOLATION.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                iArr[m.DRIVING_PROBATIONARY_PERIOD_THIRD_SAFETY_RELATED_TRAFFIC_VIOLATION.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                iArr[m.DRIVING_PROBATIONARY_PERIOD_12_PENALTY_POINTS_EXCEEDED.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                iArr[m.DRIVING_PROBATIONARY_PERIOD_20_PENALTY_POINTS_EXCEEDED.ordinal()] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                iArr[m.DRIVING_PROBATIONARY_PERIOD_SERIOUS_SAFETY_VIOLATION.ordinal()] = 85;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                iArr[m.DRIVING_PROBATIONARY_PERIOD_BAN_VIOLATED.ordinal()] = 86;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                iArr[m.DRIVING_PROBATIONARY_PERIOD_TRAFFIC_HAZARDS_TRAINING_COMPLETED.ordinal()] = 87;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                iArr[m.DRIVING_PROBATIONARY_PERIOD_TRAFFIC_HAZARDS_TRAINING_NON_COMPLETED.ordinal()] = 88;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                iArr[m.DRIVING_PROBATIONARY_PERIOD_TRAFFIC_HAZARDS_TRAINING_REMINDER.ordinal()] = 89;
            } catch (NoSuchFieldError unused89) {
            }
            try {
                iArr[m.DRIVING_PROBATIONARY_PERIOD_STARTED.ordinal()] = 90;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                iArr[m.DRIVING_PROBATIONARY_PERIOD_EXTENDED.ordinal()] = 91;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                iArr[m.DRIVING_PROBATIONARY_PERIOD_SUPPLEMENTED.ordinal()] = 92;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                iArr[m.DRIVING_PROBATIONARY_PERIOD_SUPERVISED_DRIVING.ordinal()] = 93;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                iArr[m.DRIVING_PROBATIONARY_PERIOD_SELF_DRIVING.ordinal()] = 94;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                iArr[m.VEHICLE_COLLISION_REPORT_REMINDER.ordinal()] = 95;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                iArr[m.LAND_REGISTER_DOCUMENT_ORDER_GENERATION_SUCCESS.ordinal()] = 96;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                iArr[m.LAND_REGISTER_DOCUMENT_ORDER_GENERATION_ERROR.ordinal()] = 97;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                iArr[m.STUDENT_CERTIFICATE_OLD_SIGNER.ordinal()] = 98;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                iArr[m.COMPANY_REACTIVATION.ordinal()] = 99;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                iArr[m.MJUNIOR_NEWS.ordinal()] = 100;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                iArr[m.LAND_REGISTER_DOCUMENT_ORDER_TO_DOWNLOAD_EXPIRY_REMINDER.ordinal()] = 101;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                iArr[m.UNKNOWN.ordinal()] = 102;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                iArr[m.TRUSTED_PROFILE_AUTHORIZATION.ordinal()] = 103;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                iArr[m.EXTERNAL_QUALIFIED_SIGNATURE_AUTHORIZATION.ordinal()] = 104;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                iArr[m.NEW_PAYMENT_IN_OFFICE.ordinal()] = 105;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                iArr[m.COUNTRY_TRAVEL_ADVISORY_UPDATE.ordinal()] = 106;
            } catch (NoSuchFieldError unused106) {
            }
            f138310a = iArr;
        }
    }

    public static final List<NotificationSettingsEntry> a(List<PushSettingsEntryPresentationDto> list) {
        List<PushSettingsEntryPresentationDto> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        for (PushSettingsEntryPresentationDto pushSettingsEntryPresentationDto : list2) {
            arrayList.add(new NotificationSettingsEntry(pushSettingsEntryPresentationDto.getType(), pushSettingsEntryPresentationDto.getTitle(), pushSettingsEntryPresentationDto.getDescription(), pushSettingsEntryPresentationDto.getEnabled()));
        }
        return arrayList;
    }

    public static final List<NotificationSettingsSection> b(PushSettingsPresentationDto pushSettingsPresentationDto) {
        List<PushSettingsSectionPresentationDto> listA = pushSettingsPresentationDto.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        for (PushSettingsSectionPresentationDto pushSettingsSectionPresentationDto : listA) {
            arrayList.add(new NotificationSettingsSection(pushSettingsSectionPresentationDto.getTitle(), a(pushSettingsSectionPresentationDto.a())));
        }
        return arrayList;
    }

    public static final NotificationRecord c(PushHistoryEntryDto pushHistoryEntryDto) {
        String id5 = pushHistoryEntryDto.getId();
        String title = pushHistoryEntryDto.getTitle();
        String content = pushHistoryEntryDto.getContent();
        OffsetDateTime sendingDateTime = pushHistoryEntryDto.getSendingDateTime();
        String sendersId = pushHistoryEntryDto.getSendersId();
        m pushType = pushHistoryEntryDto.getPushType();
        return new NotificationRecord(id5, title, content, sendingDateTime, pushType != null ? m(pushType) : null, j(pushHistoryEntryDto.getParameters()), sendersId, pushHistoryEntryDto.getPrivateContent(), pushHistoryEntryDto.getDisplayed());
    }

    public static final NotificationsHistoryModel d(PushHistoryDto pushHistoryDto) {
        ArrayList arrayList;
        List<PushHistoryEntryDto> listA = pushHistoryDto.a();
        if (listA != null) {
            List<PushHistoryEntryDto> list = listA;
            arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(c((PushHistoryEntryDto) it.next()));
            }
        } else {
            arrayList = null;
        }
        return new NotificationsHistoryModel(arrayList);
    }

    public static final RegisterDeviceResponse e(RegisterDeviceResponseDto registerDeviceResponseDto) {
        return new RegisterDeviceResponse(registerDeviceResponseDto.getEncryptingKey());
    }

    public static final RemoteMessageParameters.ExternalQualifiedSignatureAuthorization f(ExternalQualifiedSignatureAuthorizationParametersDto externalQualifiedSignatureAuthorizationParametersDto) {
        return new RemoteMessageParameters.ExternalQualifiedSignatureAuthorization(externalQualifiedSignatureAuthorizationParametersDto.getAuthorizationId(), externalQualifiedSignatureAuthorizationParametersDto.getExpirationDateTime(), externalQualifiedSignatureAuthorizationParametersDto.getProcessId());
    }

    public static final RemoteMessageParameters.PaymentParameters g(PaymentParametersDto paymentParametersDto) {
        return new RemoteMessageParameters.PaymentParameters(paymentParametersDto.getPaymentId());
    }

    public static final RemoteMessageParameters.TravelAdvisoryParameters h(TravelAdvisoryParametersDto travelAdvisoryParametersDto) {
        return new RemoteMessageParameters.TravelAdvisoryParameters(travelAdvisoryParametersDto.getCountryIso());
    }

    public static final RemoteMessageParameters.TrustedProfileAuthorizationParameters i(TrustedProfileAuthorizationParametersDto trustedProfileAuthorizationParametersDto) {
        return new RemoteMessageParameters.TrustedProfileAuthorizationParameters(trustedProfileAuthorizationParametersDto.getAuthorizationId(), trustedProfileAuthorizationParametersDto.getExpirationDateTime());
    }

    public static final RemoteMessageParameters j(PushParametersDto pushParametersDto) {
        PaymentParametersDto payment = pushParametersDto.getPayment();
        RemoteMessageParameters.PaymentParameters paymentParametersG = payment != null ? g(payment) : null;
        TrustedProfileAuthorizationParametersDto trustedProfileAuthorization = pushParametersDto.getTrustedProfileAuthorization();
        RemoteMessageParameters.TrustedProfileAuthorizationParameters trustedProfileAuthorizationParametersI = trustedProfileAuthorization != null ? i(trustedProfileAuthorization) : null;
        ExternalQualifiedSignatureAuthorizationParametersDto externalQualifiedSignatureAuthorization = pushParametersDto.getExternalQualifiedSignatureAuthorization();
        RemoteMessageParameters.ExternalQualifiedSignatureAuthorization externalQualifiedSignatureAuthorizationF = externalQualifiedSignatureAuthorization != null ? f(externalQualifiedSignatureAuthorization) : null;
        TravelAdvisoryParametersDto travelAdvisory = pushParametersDto.getTravelAdvisory();
        return new RemoteMessageParameters(paymentParametersG, trustedProfileAuthorizationParametersI, externalQualifiedSignatureAuthorizationF, travelAdvisory != null ? h(travelAdvisory) : null);
    }

    public static final PushSettingsDto k(List<PushNotificationSettings> list) {
        List<PushNotificationSettings> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        for (PushNotificationSettings pushNotificationSettings : list2) {
            arrayList.add(new PushSettingsEntryDto(pushNotificationSettings.getEnabled(), pushNotificationSettings.getType()));
        }
        return new PushSettingsDto(arrayList);
    }

    public static final RegisterDeviceRequestDto l(RegisterDeviceRequest registerDeviceRequest) {
        return new RegisterDeviceRequestDto(registerDeviceRequest.getPushNotificationsEnabled(), registerDeviceRequest.getPushToken());
    }

    public static final NotificationRecord.a m(m mVar) {
        switch (C3411a.f138310a[mVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case BERTags.DATE /* 31 */:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
            case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
            case EACTags.INTERCHANGE_CONTROL /* 39 */:
            case 40:
            case EACTags.INTERCHANGE_PROFILE /* 41 */:
            case EACTags.CURRENCY_CODE /* 42 */:
            case EACTags.DATE_OF_BIRTH /* 43 */:
            case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
            case EACTags.LANGUAGE_PREFERENCES /* 45 */:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case EACTags.TRANSACTION_DATE /* 51 */:
            case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
            case 53:
            case EACTags.CURRENCY_EXPONENT /* 54 */:
            case 55:
            case 56:
            case 57:
            case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
            case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
            case EACTags.APPLICATION_IMAGE /* 68 */:
            case EACTags.DISPLAY_IMAGE /* 69 */:
            case 70:
            case EACTags.MESSAGE_REFERENCE /* 71 */:
            case 72:
            case 73:
            case EACTags.CERTIFICATION_AUTHORITY_PUBLIC_KEY /* 74 */:
            case EACTags.DEPRECATED /* 75 */:
            case 76:
            case EACTags.INTEGRATED_CIRCUIT_MANUFACTURER_ID /* 77 */:
            case 78:
            case 79:
            case EACTags.UNIFORM_RESOURCE_LOCATOR /* 80 */:
            case EACTags.ANSWER_TO_RESET /* 81 */:
            case EACTags.HISTORICAL_BYTES /* 82 */:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
                return NotificationRecord.a.NOT_MAPPED;
            case 103:
                return NotificationRecord.a.TRUSTED_PROFILE_AUTHORIZATION;
            case 104:
                return NotificationRecord.a.EXTERNAL_QUALIFIED_SIGNATURE_AUTHORIZATION;
            case 105:
                return NotificationRecord.a.NEW_PAYMENT_IN_OFFICE;
            case 106:
                return NotificationRecord.a.COUNTRY_TRAVEL_ADVISORY_UPDATE;
            default:
                throw new p();
        }
    }
}
