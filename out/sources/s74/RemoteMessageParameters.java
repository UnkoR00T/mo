package s74;

import fr.t;
import java.io.Serializable;
import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: s74.d, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001:\u0004\u0019\u001c\u0017\u001eB7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010!\u001a\u0004\b\u0017\u0010\"¨\u0006#"}, d2 = {"Ls74/d;", "Ljava/io/Serializable;", "Ls74/d$b;", "payment", "Ls74/d$d;", "trustedProfileAuthorization", "Ls74/d$a;", "qualifiedSignatureAuthorization", "Ls74/d$c;", "countryDetails", "<init>", "(Ls74/d$b;Ls74/d$d;Ls74/d$a;Ls74/d$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ls74/d$b;", "b", "()Ls74/d$b;", "Ls74/d$d;", "d", "()Ls74/d$d;", "c", "Ls74/d$a;", "()Ls74/d$a;", "Ls74/d$c;", "()Ls74/d$c;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RemoteMessageParameters implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final PaymentParameters payment;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final TrustedProfileAuthorizationParameters trustedProfileAuthorization;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final ExternalQualifiedSignatureAuthorization qualifiedSignatureAuthorization;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final TravelAdvisoryParameters countryDetails;

    /* JADX INFO: renamed from: s74.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0018\u0010\n¨\u0006\u0019"}, d2 = {"Ls74/d$a;", "Ljava/io/Serializable;", "", "authorizationId", "Ljava/time/OffsetDateTime;", "expirationDateTime", "processId", "<init>", "(Ljava/lang/String;Ljava/time/OffsetDateTime;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "c", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExternalQualifiedSignatureAuthorization implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String authorizationId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final OffsetDateTime expirationDateTime;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String processId;

        public ExternalQualifiedSignatureAuthorization(String str, OffsetDateTime offsetDateTime, String str2) {
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
            if (!(other instanceof ExternalQualifiedSignatureAuthorization)) {
                return false;
            }
            ExternalQualifiedSignatureAuthorization externalQualifiedSignatureAuthorization = (ExternalQualifiedSignatureAuthorization) other;
            return t.c(this.authorizationId, externalQualifiedSignatureAuthorization.authorizationId) && t.c(this.expirationDateTime, externalQualifiedSignatureAuthorization.expirationDateTime) && t.c(this.processId, externalQualifiedSignatureAuthorization.processId);
        }

        public int hashCode() {
            return (((this.authorizationId.hashCode() * 31) + this.expirationDateTime.hashCode()) * 31) + this.processId.hashCode();
        }

        public String toString() {
            return "ExternalQualifiedSignatureAuthorization(authorizationId=" + this.authorizationId + ", expirationDateTime=" + this.expirationDateTime + ", processId=" + this.processId + ")";
        }
    }

    /* JADX INFO: renamed from: s74.d$b, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Ls74/d$b;", "Ljava/io/Serializable;", "", "paymentId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PaymentParameters implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String paymentId;

        public PaymentParameters(String str) {
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
            return (other instanceof PaymentParameters) && t.c(this.paymentId, ((PaymentParameters) other).paymentId);
        }

        public int hashCode() {
            String str = this.paymentId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "PaymentParameters(paymentId=" + this.paymentId + ")";
        }
    }

    /* JADX INFO: renamed from: s74.d$c, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Ls74/d$c;", "Ljava/io/Serializable;", "", "countryIso", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TravelAdvisoryParameters implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String countryIso;

        public TravelAdvisoryParameters(String str) {
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
            return (other instanceof TravelAdvisoryParameters) && t.c(this.countryIso, ((TravelAdvisoryParameters) other).countryIso);
        }

        public int hashCode() {
            String str = this.countryIso;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "TravelAdvisoryParameters(countryIso=" + this.countryIso + ")";
        }
    }

    /* JADX INFO: renamed from: s74.d$d, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Ls74/d$d;", "Ljava/io/Serializable;", "", "authorizationId", "Ljava/time/OffsetDateTime;", "expirationDateTime", "<init>", "(Ljava/lang/String;Ljava/time/OffsetDateTime;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TrustedProfileAuthorizationParameters implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String authorizationId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final OffsetDateTime expirationDateTime;

        public TrustedProfileAuthorizationParameters(String str, OffsetDateTime offsetDateTime) {
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
            if (!(other instanceof TrustedProfileAuthorizationParameters)) {
                return false;
            }
            TrustedProfileAuthorizationParameters trustedProfileAuthorizationParameters = (TrustedProfileAuthorizationParameters) other;
            return t.c(this.authorizationId, trustedProfileAuthorizationParameters.authorizationId) && t.c(this.expirationDateTime, trustedProfileAuthorizationParameters.expirationDateTime);
        }

        public int hashCode() {
            return (this.authorizationId.hashCode() * 31) + this.expirationDateTime.hashCode();
        }

        public String toString() {
            return "TrustedProfileAuthorizationParameters(authorizationId=" + this.authorizationId + ", expirationDateTime=" + this.expirationDateTime + ")";
        }
    }

    public RemoteMessageParameters(PaymentParameters paymentParameters, TrustedProfileAuthorizationParameters trustedProfileAuthorizationParameters, ExternalQualifiedSignatureAuthorization externalQualifiedSignatureAuthorization, TravelAdvisoryParameters travelAdvisoryParameters) {
        this.payment = paymentParameters;
        this.trustedProfileAuthorization = trustedProfileAuthorizationParameters;
        this.qualifiedSignatureAuthorization = externalQualifiedSignatureAuthorization;
        this.countryDetails = travelAdvisoryParameters;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TravelAdvisoryParameters getCountryDetails() {
        return this.countryDetails;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final PaymentParameters getPayment() {
        return this.payment;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ExternalQualifiedSignatureAuthorization getQualifiedSignatureAuthorization() {
        return this.qualifiedSignatureAuthorization;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TrustedProfileAuthorizationParameters getTrustedProfileAuthorization() {
        return this.trustedProfileAuthorization;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemoteMessageParameters)) {
            return false;
        }
        RemoteMessageParameters remoteMessageParameters = (RemoteMessageParameters) other;
        return t.c(this.payment, remoteMessageParameters.payment) && t.c(this.trustedProfileAuthorization, remoteMessageParameters.trustedProfileAuthorization) && t.c(this.qualifiedSignatureAuthorization, remoteMessageParameters.qualifiedSignatureAuthorization) && t.c(this.countryDetails, remoteMessageParameters.countryDetails);
    }

    public int hashCode() {
        PaymentParameters paymentParameters = this.payment;
        int iHashCode = (paymentParameters == null ? 0 : paymentParameters.hashCode()) * 31;
        TrustedProfileAuthorizationParameters trustedProfileAuthorizationParameters = this.trustedProfileAuthorization;
        int iHashCode2 = (iHashCode + (trustedProfileAuthorizationParameters == null ? 0 : trustedProfileAuthorizationParameters.hashCode())) * 31;
        ExternalQualifiedSignatureAuthorization externalQualifiedSignatureAuthorization = this.qualifiedSignatureAuthorization;
        int iHashCode3 = (iHashCode2 + (externalQualifiedSignatureAuthorization == null ? 0 : externalQualifiedSignatureAuthorization.hashCode())) * 31;
        TravelAdvisoryParameters travelAdvisoryParameters = this.countryDetails;
        return iHashCode3 + (travelAdvisoryParameters != null ? travelAdvisoryParameters.hashCode() : 0);
    }

    public String toString() {
        return "RemoteMessageParameters(payment=" + this.payment + ", trustedProfileAuthorization=" + this.trustedProfileAuthorization + ", qualifiedSignatureAuthorization=" + this.qualifiedSignatureAuthorization + ", countryDetails=" + this.countryDetails + ")";
    }
}
