package h90;

import fr.t;
import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: h90.g, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001:\u0003\u0016\u0018\u0014B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, d2 = {"Lh90/g;", "", "Lh90/g$c;", "trustedProfileAuthorization", "Lh90/g$b;", "qualifiedSignatureAuthorization", "Lh90/g$a;", "payment", "<init>", "(Lh90/g$c;Lh90/g$b;Lh90/g$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lh90/g$c;", "c", "()Lh90/g$c;", "b", "Lh90/g$b;", "()Lh90/g$b;", "Lh90/g$a;", "()Lh90/g$a;", "notificationsservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEPushParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final BETrustedProfileAuthorizationParams trustedProfileAuthorization;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEQualifiedSignatureAuthorizationParams qualifiedSignatureAuthorization;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEPaymentParams payment;

    /* JADX INFO: renamed from: h90.g$a, reason: from toString */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0011"}, d2 = {"Lh90/g$a;", "", "", "paymentId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "notificationsservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BEPaymentParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String paymentId;

        public BEPaymentParams(String str) {
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
            return (other instanceof BEPaymentParams) && t.c(this.paymentId, ((BEPaymentParams) other).paymentId);
        }

        public int hashCode() {
            String str = this.paymentId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "BEPaymentParams(paymentId=" + this.paymentId + ')';
        }
    }

    /* JADX INFO: renamed from: h90.g$b, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0017\u0010\n¨\u0006\u0018"}, d2 = {"Lh90/g$b;", "", "", "authorizationId", "Ljava/time/OffsetDateTime;", "expirationDateTime", "processId", "<init>", "(Ljava/lang/String;Ljava/time/OffsetDateTime;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "c", "notificationsservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BEQualifiedSignatureAuthorizationParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String authorizationId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final OffsetDateTime expirationDateTime;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String processId;

        public BEQualifiedSignatureAuthorizationParams(String str, OffsetDateTime offsetDateTime, String str2) {
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
            if (!(other instanceof BEQualifiedSignatureAuthorizationParams)) {
                return false;
            }
            BEQualifiedSignatureAuthorizationParams bEQualifiedSignatureAuthorizationParams = (BEQualifiedSignatureAuthorizationParams) other;
            return t.c(this.authorizationId, bEQualifiedSignatureAuthorizationParams.authorizationId) && t.c(this.expirationDateTime, bEQualifiedSignatureAuthorizationParams.expirationDateTime) && t.c(this.processId, bEQualifiedSignatureAuthorizationParams.processId);
        }

        public int hashCode() {
            return (((this.authorizationId.hashCode() * 31) + this.expirationDateTime.hashCode()) * 31) + this.processId.hashCode();
        }

        public String toString() {
            return "BEQualifiedSignatureAuthorizationParams(authorizationId=" + this.authorizationId + ", expirationDateTime=" + this.expirationDateTime + ", processId=" + this.processId + ')';
        }
    }

    /* JADX INFO: renamed from: h90.g$c, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Lh90/g$c;", "", "", "authorizationId", "Ljava/time/OffsetDateTime;", "expirationDateTime", "<init>", "(Ljava/lang/String;Ljava/time/OffsetDateTime;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "notificationsservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BETrustedProfileAuthorizationParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String authorizationId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final OffsetDateTime expirationDateTime;

        public BETrustedProfileAuthorizationParams(String str, OffsetDateTime offsetDateTime) {
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
            if (!(other instanceof BETrustedProfileAuthorizationParams)) {
                return false;
            }
            BETrustedProfileAuthorizationParams bETrustedProfileAuthorizationParams = (BETrustedProfileAuthorizationParams) other;
            return t.c(this.authorizationId, bETrustedProfileAuthorizationParams.authorizationId) && t.c(this.expirationDateTime, bETrustedProfileAuthorizationParams.expirationDateTime);
        }

        public int hashCode() {
            return (this.authorizationId.hashCode() * 31) + this.expirationDateTime.hashCode();
        }

        public String toString() {
            return "BETrustedProfileAuthorizationParams(authorizationId=" + this.authorizationId + ", expirationDateTime=" + this.expirationDateTime + ')';
        }
    }

    public BEPushParameters(BETrustedProfileAuthorizationParams bETrustedProfileAuthorizationParams, BEQualifiedSignatureAuthorizationParams bEQualifiedSignatureAuthorizationParams, BEPaymentParams bEPaymentParams) {
        this.trustedProfileAuthorization = bETrustedProfileAuthorizationParams;
        this.qualifiedSignatureAuthorization = bEQualifiedSignatureAuthorizationParams;
        this.payment = bEPaymentParams;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BEPaymentParams getPayment() {
        return this.payment;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final BEQualifiedSignatureAuthorizationParams getQualifiedSignatureAuthorization() {
        return this.qualifiedSignatureAuthorization;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final BETrustedProfileAuthorizationParams getTrustedProfileAuthorization() {
        return this.trustedProfileAuthorization;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEPushParameters)) {
            return false;
        }
        BEPushParameters bEPushParameters = (BEPushParameters) other;
        return t.c(this.trustedProfileAuthorization, bEPushParameters.trustedProfileAuthorization) && t.c(this.qualifiedSignatureAuthorization, bEPushParameters.qualifiedSignatureAuthorization) && t.c(this.payment, bEPushParameters.payment);
    }

    public int hashCode() {
        BETrustedProfileAuthorizationParams bETrustedProfileAuthorizationParams = this.trustedProfileAuthorization;
        int iHashCode = (bETrustedProfileAuthorizationParams == null ? 0 : bETrustedProfileAuthorizationParams.hashCode()) * 31;
        BEQualifiedSignatureAuthorizationParams bEQualifiedSignatureAuthorizationParams = this.qualifiedSignatureAuthorization;
        int iHashCode2 = (iHashCode + (bEQualifiedSignatureAuthorizationParams == null ? 0 : bEQualifiedSignatureAuthorizationParams.hashCode())) * 31;
        BEPaymentParams bEPaymentParams = this.payment;
        return iHashCode2 + (bEPaymentParams != null ? bEPaymentParams.hashCode() : 0);
    }

    public String toString() {
        return "BEPushParameters(trustedProfileAuthorization=" + this.trustedProfileAuthorization + ", qualifiedSignatureAuthorization=" + this.qualifiedSignatureAuthorization + ", payment=" + this.payment + ')';
    }
}
