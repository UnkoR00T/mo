package j84;

import fr.t;
import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: j84.d, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001:\u0004\u0018\u001c\u001a\u0016B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001a\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010 \u001a\u0004\b\u0016\u0010!¨\u0006\""}, d2 = {"Lj84/d;", "", "Lj84/d$d;", "trustedProfileAuthorization", "Lj84/d$c;", "qualifiedSignatureAuthorization", "Lj84/d$b;", "payment", "Lj84/d$a;", "countryDetails", "<init>", "(Lj84/d$d;Lj84/d$c;Lj84/d$b;Lj84/d$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lj84/d$d;", "d", "()Lj84/d$d;", "b", "Lj84/d$c;", "c", "()Lj84/d$c;", "Lj84/d$b;", "()Lj84/d$b;", "Lj84/d$a;", "()Lj84/d$a;", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NotificationsHistoryRecordParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final TrustedProfileAuthorizationParams trustedProfileAuthorization;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final QualifiedSignatureAuthorizationParams qualifiedSignatureAuthorization;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final PaymentParams payment;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final CountryDetailsParams countryDetails;

    /* JADX INFO: renamed from: j84.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0011"}, d2 = {"Lj84/d$a;", "", "", "countryIso", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CountryDetailsParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String countryIso;

        public CountryDetailsParams(String str) {
            this.countryIso = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCountryIso() {
            return this.countryIso;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CountryDetailsParams) && t.c(this.countryIso, ((CountryDetailsParams) other).countryIso);
        }

        public int hashCode() {
            return this.countryIso.hashCode();
        }

        public String toString() {
            return "CountryDetailsParams(countryIso=" + this.countryIso + ')';
        }
    }

    /* JADX INFO: renamed from: j84.d$b, reason: from toString */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0011"}, d2 = {"Lj84/d$b;", "", "", "paymentId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PaymentParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String paymentId;

        public PaymentParams(String str) {
            this.paymentId = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getPaymentId() {
            return this.paymentId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PaymentParams) && t.c(this.paymentId, ((PaymentParams) other).paymentId);
        }

        public int hashCode() {
            String str = this.paymentId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "PaymentParams(paymentId=" + this.paymentId + ')';
        }
    }

    /* JADX INFO: renamed from: j84.d$c, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0017\u0010\n¨\u0006\u0018"}, d2 = {"Lj84/d$c;", "", "", "authorizationId", "Ljava/time/OffsetDateTime;", "expirationDateTime", "processId", "<init>", "(Ljava/lang/String;Ljava/time/OffsetDateTime;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "c", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class QualifiedSignatureAuthorizationParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String authorizationId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final OffsetDateTime expirationDateTime;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String processId;

        public QualifiedSignatureAuthorizationParams(String str, OffsetDateTime offsetDateTime, String str2) {
            this.authorizationId = str;
            this.expirationDateTime = offsetDateTime;
            this.processId = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAuthorizationId() {
            return this.authorizationId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final OffsetDateTime getExpirationDateTime() {
            return this.expirationDateTime;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getProcessId() {
            return this.processId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QualifiedSignatureAuthorizationParams)) {
                return false;
            }
            QualifiedSignatureAuthorizationParams qualifiedSignatureAuthorizationParams = (QualifiedSignatureAuthorizationParams) other;
            return t.c(this.authorizationId, qualifiedSignatureAuthorizationParams.authorizationId) && t.c(this.expirationDateTime, qualifiedSignatureAuthorizationParams.expirationDateTime) && t.c(this.processId, qualifiedSignatureAuthorizationParams.processId);
        }

        public int hashCode() {
            return (((this.authorizationId.hashCode() * 31) + this.expirationDateTime.hashCode()) * 31) + this.processId.hashCode();
        }

        public String toString() {
            return "QualifiedSignatureAuthorizationParams(authorizationId=" + this.authorizationId + ", expirationDateTime=" + this.expirationDateTime + ", processId=" + this.processId + ')';
        }
    }

    /* JADX INFO: renamed from: j84.d$d, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Lj84/d$d;", "", "", "authorizationId", "Ljava/time/OffsetDateTime;", "expirationDateTime", "<init>", "(Ljava/lang/String;Ljava/time/OffsetDateTime;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TrustedProfileAuthorizationParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String authorizationId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final OffsetDateTime expirationDateTime;

        public TrustedProfileAuthorizationParams(String str, OffsetDateTime offsetDateTime) {
            this.authorizationId = str;
            this.expirationDateTime = offsetDateTime;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAuthorizationId() {
            return this.authorizationId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final OffsetDateTime getExpirationDateTime() {
            return this.expirationDateTime;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrustedProfileAuthorizationParams)) {
                return false;
            }
            TrustedProfileAuthorizationParams trustedProfileAuthorizationParams = (TrustedProfileAuthorizationParams) other;
            return t.c(this.authorizationId, trustedProfileAuthorizationParams.authorizationId) && t.c(this.expirationDateTime, trustedProfileAuthorizationParams.expirationDateTime);
        }

        public int hashCode() {
            return (this.authorizationId.hashCode() * 31) + this.expirationDateTime.hashCode();
        }

        public String toString() {
            return "TrustedProfileAuthorizationParams(authorizationId=" + this.authorizationId + ", expirationDateTime=" + this.expirationDateTime + ')';
        }
    }

    public NotificationsHistoryRecordParameters(TrustedProfileAuthorizationParams trustedProfileAuthorizationParams, QualifiedSignatureAuthorizationParams qualifiedSignatureAuthorizationParams, PaymentParams paymentParams, CountryDetailsParams countryDetailsParams) {
        this.trustedProfileAuthorization = trustedProfileAuthorizationParams;
        this.qualifiedSignatureAuthorization = qualifiedSignatureAuthorizationParams;
        this.payment = paymentParams;
        this.countryDetails = countryDetailsParams;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final CountryDetailsParams getCountryDetails() {
        return this.countryDetails;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final PaymentParams getPayment() {
        return this.payment;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final QualifiedSignatureAuthorizationParams getQualifiedSignatureAuthorization() {
        return this.qualifiedSignatureAuthorization;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TrustedProfileAuthorizationParams getTrustedProfileAuthorization() {
        return this.trustedProfileAuthorization;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationsHistoryRecordParameters)) {
            return false;
        }
        NotificationsHistoryRecordParameters notificationsHistoryRecordParameters = (NotificationsHistoryRecordParameters) other;
        return t.c(this.trustedProfileAuthorization, notificationsHistoryRecordParameters.trustedProfileAuthorization) && t.c(this.qualifiedSignatureAuthorization, notificationsHistoryRecordParameters.qualifiedSignatureAuthorization) && t.c(this.payment, notificationsHistoryRecordParameters.payment) && t.c(this.countryDetails, notificationsHistoryRecordParameters.countryDetails);
    }

    public int hashCode() {
        TrustedProfileAuthorizationParams trustedProfileAuthorizationParams = this.trustedProfileAuthorization;
        int iHashCode = (trustedProfileAuthorizationParams == null ? 0 : trustedProfileAuthorizationParams.hashCode()) * 31;
        QualifiedSignatureAuthorizationParams qualifiedSignatureAuthorizationParams = this.qualifiedSignatureAuthorization;
        int iHashCode2 = (iHashCode + (qualifiedSignatureAuthorizationParams == null ? 0 : qualifiedSignatureAuthorizationParams.hashCode())) * 31;
        PaymentParams paymentParams = this.payment;
        int iHashCode3 = (iHashCode2 + (paymentParams == null ? 0 : paymentParams.hashCode())) * 31;
        CountryDetailsParams countryDetailsParams = this.countryDetails;
        return iHashCode3 + (countryDetailsParams != null ? countryDetailsParams.hashCode() : 0);
    }

    public String toString() {
        return "NotificationsHistoryRecordParameters(trustedProfileAuthorization=" + this.trustedProfileAuthorization + ", qualifiedSignatureAuthorization=" + this.qualifiedSignatureAuthorization + ", payment=" + this.payment + ", countryDetails=" + this.countryDetails + ')';
    }
}
