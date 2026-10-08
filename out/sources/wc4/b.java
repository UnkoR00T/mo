package wc4;

import j84.NotificationsHistoryRecord;
import j84.NotificationsHistoryRecordParameters;
import kt0.NotificationRecord;
import kt0.RemoteMessageParameters;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0006\u001a\u00020\u0005*\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lkt0/b;", "Lj84/c;", "d", "(Lkt0/b;)Lj84/c;", "Lkt0/b$a;", "Lj84/c$a;", "c", "(Lkt0/b$a;)Lj84/c$a;", "Lkt0/i;", "Lj84/d;", "b", "(Lkt0/i;)Lj84/d;", "mObywatel_prodRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f212173a;

        static {
            int[] iArr = new int[NotificationRecord.a.values().length];
            try {
                iArr[NotificationRecord.a.EXTERNAL_QUALIFIED_SIGNATURE_AUTHORIZATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NotificationRecord.a.TRUSTED_PROFILE_AUTHORIZATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NotificationRecord.a.NEW_PAYMENT_IN_OFFICE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NotificationRecord.a.COUNTRY_TRAVEL_ADVISORY_UPDATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f212173a = iArr;
        }
    }

    private static final NotificationsHistoryRecordParameters b(RemoteMessageParameters remoteMessageParameters) {
        String countryIso;
        RemoteMessageParameters.TrustedProfileAuthorizationParameters trustedProfileAuthorization = remoteMessageParameters.getTrustedProfileAuthorization();
        NotificationsHistoryRecordParameters.CountryDetailsParams countryDetailsParams = null;
        NotificationsHistoryRecordParameters.TrustedProfileAuthorizationParams trustedProfileAuthorizationParams = trustedProfileAuthorization != null ? new NotificationsHistoryRecordParameters.TrustedProfileAuthorizationParams(trustedProfileAuthorization.getAuthorizationId(), trustedProfileAuthorization.getExpirationDateTime()) : null;
        RemoteMessageParameters.ExternalQualifiedSignatureAuthorization qualifiedSignatureAuthorization = remoteMessageParameters.getQualifiedSignatureAuthorization();
        NotificationsHistoryRecordParameters.QualifiedSignatureAuthorizationParams qualifiedSignatureAuthorizationParams = qualifiedSignatureAuthorization != null ? new NotificationsHistoryRecordParameters.QualifiedSignatureAuthorizationParams(qualifiedSignatureAuthorization.getAuthorizationId(), qualifiedSignatureAuthorization.getExpirationDateTime(), qualifiedSignatureAuthorization.getProcessId()) : null;
        RemoteMessageParameters.PaymentParameters payment = remoteMessageParameters.getPayment();
        NotificationsHistoryRecordParameters.PaymentParams paymentParams = payment != null ? new NotificationsHistoryRecordParameters.PaymentParams(payment.getPaymentId()) : null;
        RemoteMessageParameters.TravelAdvisoryParameters countryDetails = remoteMessageParameters.getCountryDetails();
        if (countryDetails != null && (countryIso = countryDetails.getCountryIso()) != null) {
            countryDetailsParams = new NotificationsHistoryRecordParameters.CountryDetailsParams(countryIso);
        }
        return new NotificationsHistoryRecordParameters(trustedProfileAuthorizationParams, qualifiedSignatureAuthorizationParams, paymentParams, countryDetailsParams);
    }

    private static final NotificationsHistoryRecord.a c(NotificationRecord.a aVar) {
        int i15 = aVar == null ? -1 : a.f212173a[aVar.ordinal()];
        if (i15 == 1) {
            return NotificationsHistoryRecord.a.EXTERNAL_QUALIFIED_SIGNATURE_AUTHORIZATION;
        }
        if (i15 == 2) {
            return NotificationsHistoryRecord.a.TRUSTED_PROFILE_AUTHORIZATION;
        }
        if (i15 != 3) {
            return i15 != 4 ? NotificationsHistoryRecord.a.NOT_MAPPED : NotificationsHistoryRecord.a.COUNTRY_TRAVEL_ADVISORY_UPDATE;
        }
        return NotificationsHistoryRecord.a.NEW_PAYMENT_IN_OFFICE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NotificationsHistoryRecord d(NotificationRecord notificationRecord) {
        return new NotificationsHistoryRecord(notificationRecord.getId(), notificationRecord.getTitle(), notificationRecord.getContent(), notificationRecord.getPrivateContent(), notificationRecord.getSendingDateTime(), notificationRecord.getDisplayed(), c(notificationRecord.getPushType()), b(notificationRecord.getParameters()));
    }
}
