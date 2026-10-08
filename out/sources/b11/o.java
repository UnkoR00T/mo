package b11;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018À\u0006\u0003"}, d2 = {"Lb11/o;", "", "d", "c", "k", "f", "i", "h", "e", "g", "j", "a", "b", "Lb11/o$a;", "Lb11/o$b;", "Lb11/o$c;", "Lb11/o$d;", "Lb11/o$e;", "Lb11/o$f;", "Lb11/o$g;", "Lb11/o$h;", "Lb11/o$i;", "Lb11/o$j;", "Lb11/o$k;", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface o {

    /* JADX INFO: renamed from: b11.o$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lb11/o$a;", "Lb11/o;", "Leo2/a;", "data", "<init>", "(Leo2/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Leo2/a;", "()Leo2/a;", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AlreadyConfirmed implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final eo2.a data;

        public AlreadyConfirmed(eo2.a aVar) {
            this.data = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final eo2.a getData() {
            return this.data;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AlreadyConfirmed) && fr.t.c(this.data, ((AlreadyConfirmed) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "AlreadyConfirmed(data=" + this.data + ')';
        }
    }

    /* JADX INFO: renamed from: b11.o$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lb11/o$b;", "Lb11/o;", "Leo2/a;", "data", "<init>", "(Leo2/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Leo2/a;", "()Leo2/a;", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AlreadyRejected implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final eo2.a data;

        public AlreadyRejected(eo2.a aVar) {
            this.data = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final eo2.a getData() {
            return this.data;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AlreadyRejected) && fr.t.c(this.data, ((AlreadyRejected) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "AlreadyRejected(data=" + this.data + ')';
        }
    }

    /* JADX INFO: renamed from: b11.o$c, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lb11/o$c;", "Lb11/o;", "Leo2/a$a;", "data", "<init>", "(Leo2/a$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Leo2/a$a;", "()Leo2/a$a;", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CheckQualifiedSignatureAuthStatus implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final eo2.a.QualifiedSignatureConfirmationData data;

        public CheckQualifiedSignatureAuthStatus(eo2.a.QualifiedSignatureConfirmationData qualifiedSignatureConfirmationData) {
            this.data = qualifiedSignatureConfirmationData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final eo2.a.QualifiedSignatureConfirmationData getData() {
            return this.data;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CheckQualifiedSignatureAuthStatus) && fr.t.c(this.data, ((CheckQualifiedSignatureAuthStatus) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "CheckQualifiedSignatureAuthStatus(data=" + this.data + ')';
        }
    }

    /* JADX INFO: renamed from: b11.o$d, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lb11/o$d;", "Lb11/o;", "Leo2/a$b;", "data", "<init>", "(Leo2/a$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Leo2/a$b;", "()Leo2/a$b;", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CheckTrustedProfileAuthStatus implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final eo2.a.TrustedProfileConfirmationData data;

        public CheckTrustedProfileAuthStatus(eo2.a.TrustedProfileConfirmationData trustedProfileConfirmationData) {
            this.data = trustedProfileConfirmationData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final eo2.a.TrustedProfileConfirmationData getData() {
            return this.data;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CheckTrustedProfileAuthStatus) && fr.t.c(this.data, ((CheckTrustedProfileAuthStatus) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "CheckTrustedProfileAuthStatus(data=" + this.data + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lb11/o$e;", "Lb11/o;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class e implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f16051a = new e();

        private e() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof e);
        }

        public int hashCode() {
            return -585078634;
        }

        public String toString() {
            return "ConfirmedSuccess";
        }
    }

    /* JADX INFO: renamed from: b11.o$f, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u001d\u0010\u001c¨\u0006\u001e"}, d2 = {"Lb11/o$f;", "Lb11/o;", "Leo2/a$a;", "data", "", "remainingTimeInSeconds", "validityPeriodInSeconds", "<init>", "(Leo2/a$a;JJ)V", "a", "(Leo2/a$a;JJ)Lb11/o$f;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Leo2/a$a;", "c", "()Leo2/a$a;", "b", "J", "d", "()J", "e", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class QualifiedSignatureAuth implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final eo2.a.QualifiedSignatureConfirmationData data;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final long remainingTimeInSeconds;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final long validityPeriodInSeconds;

        public QualifiedSignatureAuth(eo2.a.QualifiedSignatureConfirmationData qualifiedSignatureConfirmationData, long j15, long j16) {
            this.data = qualifiedSignatureConfirmationData;
            this.remainingTimeInSeconds = j15;
            this.validityPeriodInSeconds = j16;
        }

        public static /* synthetic */ QualifiedSignatureAuth b(QualifiedSignatureAuth qualifiedSignatureAuth, eo2.a.QualifiedSignatureConfirmationData qualifiedSignatureConfirmationData, long j15, long j16, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                qualifiedSignatureConfirmationData = qualifiedSignatureAuth.data;
            }
            if ((i15 & 2) != 0) {
                j15 = qualifiedSignatureAuth.remainingTimeInSeconds;
            }
            if ((i15 & 4) != 0) {
                j16 = qualifiedSignatureAuth.validityPeriodInSeconds;
            }
            return qualifiedSignatureAuth.a(qualifiedSignatureConfirmationData, j15, j16);
        }

        public final QualifiedSignatureAuth a(eo2.a.QualifiedSignatureConfirmationData data, long remainingTimeInSeconds, long validityPeriodInSeconds) {
            return new QualifiedSignatureAuth(data, remainingTimeInSeconds, validityPeriodInSeconds);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final eo2.a.QualifiedSignatureConfirmationData getData() {
            return this.data;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final long getRemainingTimeInSeconds() {
            return this.remainingTimeInSeconds;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final long getValidityPeriodInSeconds() {
            return this.validityPeriodInSeconds;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QualifiedSignatureAuth)) {
                return false;
            }
            QualifiedSignatureAuth qualifiedSignatureAuth = (QualifiedSignatureAuth) other;
            return fr.t.c(this.data, qualifiedSignatureAuth.data) && this.remainingTimeInSeconds == qualifiedSignatureAuth.remainingTimeInSeconds && this.validityPeriodInSeconds == qualifiedSignatureAuth.validityPeriodInSeconds;
        }

        public int hashCode() {
            return (((this.data.hashCode() * 31) + Long.hashCode(this.remainingTimeInSeconds)) * 31) + Long.hashCode(this.validityPeriodInSeconds);
        }

        public String toString() {
            return "QualifiedSignatureAuth(data=" + this.data + ", remainingTimeInSeconds=" + this.remainingTimeInSeconds + ", validityPeriodInSeconds=" + this.validityPeriodInSeconds + ')';
        }
    }

    /* JADX INFO: renamed from: b11.o$g, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lb11/o$g;", "Lb11/o;", "", "redirectUrl", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class QualifiedSignatureConfirmedSuccess implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String redirectUrl;

        public QualifiedSignatureConfirmedSuccess(String str) {
            this.redirectUrl = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getRedirectUrl() {
            return this.redirectUrl;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof QualifiedSignatureConfirmedSuccess) && fr.t.c(this.redirectUrl, ((QualifiedSignatureConfirmedSuccess) other).redirectUrl);
        }

        public int hashCode() {
            String str = this.redirectUrl;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "QualifiedSignatureConfirmedSuccess(redirectUrl=" + this.redirectUrl + ')';
        }
    }

    /* JADX INFO: renamed from: b11.o$h, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lb11/o$h;", "Lb11/o;", "", "redirectUrl", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class QualifiedSignatureRejectedSuccess implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String redirectUrl;

        public QualifiedSignatureRejectedSuccess(String str) {
            this.redirectUrl = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getRedirectUrl() {
            return this.redirectUrl;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof QualifiedSignatureRejectedSuccess) && fr.t.c(this.redirectUrl, ((QualifiedSignatureRejectedSuccess) other).redirectUrl);
        }

        public int hashCode() {
            String str = this.redirectUrl;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "QualifiedSignatureRejectedSuccess(redirectUrl=" + this.redirectUrl + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lb11/o$i;", "Lb11/o;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class i implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f16057a = new i();

        private i() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof i);
        }

        public int hashCode() {
            return 122906227;
        }

        public String toString() {
            return "RejectedSuccess";
        }
    }

    /* JADX INFO: renamed from: b11.o$j, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lb11/o$j;", "Lb11/o;", "Leo2/a;", "data", "<init>", "(Leo2/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Leo2/a;", "()Leo2/a;", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TimeExpired implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final eo2.a data;

        public TimeExpired(eo2.a aVar) {
            this.data = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final eo2.a getData() {
            return this.data;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TimeExpired) && fr.t.c(this.data, ((TimeExpired) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "TimeExpired(data=" + this.data + ')';
        }
    }

    /* JADX INFO: renamed from: b11.o$k, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u001d\u0010\u001c¨\u0006\u001e"}, d2 = {"Lb11/o$k;", "Lb11/o;", "Leo2/a$b;", "data", "", "remainingTimeInSeconds", "validityPeriodInSeconds", "<init>", "(Leo2/a$b;JJ)V", "a", "(Leo2/a$b;JJ)Lb11/o$k;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Leo2/a$b;", "c", "()Leo2/a$b;", "b", "J", "d", "()J", "e", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TrustedProfileAuth implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final eo2.a.TrustedProfileConfirmationData data;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final long remainingTimeInSeconds;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final long validityPeriodInSeconds;

        public TrustedProfileAuth(eo2.a.TrustedProfileConfirmationData trustedProfileConfirmationData, long j15, long j16) {
            this.data = trustedProfileConfirmationData;
            this.remainingTimeInSeconds = j15;
            this.validityPeriodInSeconds = j16;
        }

        public static /* synthetic */ TrustedProfileAuth b(TrustedProfileAuth trustedProfileAuth, eo2.a.TrustedProfileConfirmationData trustedProfileConfirmationData, long j15, long j16, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                trustedProfileConfirmationData = trustedProfileAuth.data;
            }
            if ((i15 & 2) != 0) {
                j15 = trustedProfileAuth.remainingTimeInSeconds;
            }
            if ((i15 & 4) != 0) {
                j16 = trustedProfileAuth.validityPeriodInSeconds;
            }
            return trustedProfileAuth.a(trustedProfileConfirmationData, j15, j16);
        }

        public final TrustedProfileAuth a(eo2.a.TrustedProfileConfirmationData data, long remainingTimeInSeconds, long validityPeriodInSeconds) {
            return new TrustedProfileAuth(data, remainingTimeInSeconds, validityPeriodInSeconds);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final eo2.a.TrustedProfileConfirmationData getData() {
            return this.data;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final long getRemainingTimeInSeconds() {
            return this.remainingTimeInSeconds;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final long getValidityPeriodInSeconds() {
            return this.validityPeriodInSeconds;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrustedProfileAuth)) {
                return false;
            }
            TrustedProfileAuth trustedProfileAuth = (TrustedProfileAuth) other;
            return fr.t.c(this.data, trustedProfileAuth.data) && this.remainingTimeInSeconds == trustedProfileAuth.remainingTimeInSeconds && this.validityPeriodInSeconds == trustedProfileAuth.validityPeriodInSeconds;
        }

        public int hashCode() {
            return (((this.data.hashCode() * 31) + Long.hashCode(this.remainingTimeInSeconds)) * 31) + Long.hashCode(this.validityPeriodInSeconds);
        }

        public String toString() {
            return "TrustedProfileAuth(data=" + this.data + ", remainingTimeInSeconds=" + this.remainingTimeInSeconds + ", validityPeriodInSeconds=" + this.validityPeriodInSeconds + ')';
        }
    }
}
