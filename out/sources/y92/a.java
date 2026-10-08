package y92;

import fr.k;
import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0006\nB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Ly92/a;", "", "", "timestamp", "<init>", "(J)V", "a", "J", "getTimestamp", "()J", "b", "Ly92/a$a;", "Ly92/a$b;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long timestamp;

    /* JADX INFO: renamed from: y92.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010\u0014R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010\u0014R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b*\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010!\u001a\u0004\b(\u0010\u0016R\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b \u0010\u0014R\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010$\u001a\u0004\b&\u0010\u0014R\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b#\u0010\u0014R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b\u001c\u0010-¨\u0006."}, d2 = {"Ly92/a$a;", "Ly92/a;", "", "timestamp", "", "scope", "", "institutionName", "purposeName", "url", "cardId", "institutionId", "institutionCertificateDn", "institutionCertificateSn", "institutionCertificateIssuer", "Lrq0/b;", "documentType", "<init>", "(JILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrq0/b;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "J", "j", "()J", "c", "I", "i", "d", "Ljava/lang/String;", "g", "e", "h", "f", "k", "a", "l", "Lrq0/b;", "()Lrq0/b;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Institutions extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final long timestamp;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final int scope;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String institutionName;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String purposeName;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String url;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final int cardId;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final int institutionId;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final String institutionCertificateDn;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final String institutionCertificateSn;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final String institutionCertificateIssuer;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final rq0.b documentType;

        public Institutions(long j15, int i15, String str, String str2, String str3, int i16, int i17, String str4, String str5, String str6, rq0.b bVar) {
            super(j15, null);
            this.timestamp = j15;
            this.scope = i15;
            this.institutionName = str;
            this.purposeName = str2;
            this.url = str3;
            this.cardId = i16;
            this.institutionId = i17;
            this.institutionCertificateDn = str4;
            this.institutionCertificateSn = str5;
            this.institutionCertificateIssuer = str6;
            this.documentType = bVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getCardId() {
            return this.cardId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final rq0.b getDocumentType() {
            return this.documentType;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getInstitutionCertificateDn() {
            return this.institutionCertificateDn;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getInstitutionCertificateIssuer() {
            return this.institutionCertificateIssuer;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getInstitutionCertificateSn() {
            return this.institutionCertificateSn;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Institutions)) {
                return false;
            }
            Institutions institutions = (Institutions) other;
            return this.timestamp == institutions.timestamp && this.scope == institutions.scope && t.c(this.institutionName, institutions.institutionName) && t.c(this.purposeName, institutions.purposeName) && t.c(this.url, institutions.url) && this.cardId == institutions.cardId && this.institutionId == institutions.institutionId && t.c(this.institutionCertificateDn, institutions.institutionCertificateDn) && t.c(this.institutionCertificateSn, institutions.institutionCertificateSn) && t.c(this.institutionCertificateIssuer, institutions.institutionCertificateIssuer) && t.c(this.documentType, institutions.documentType);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getInstitutionId() {
            return this.institutionId;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getInstitutionName() {
            return this.institutionName;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getPurposeName() {
            return this.purposeName;
        }

        public int hashCode() {
            return (((((((((((((((((((Long.hashCode(this.timestamp) * 31) + Integer.hashCode(this.scope)) * 31) + this.institutionName.hashCode()) * 31) + this.purposeName.hashCode()) * 31) + this.url.hashCode()) * 31) + Integer.hashCode(this.cardId)) * 31) + Integer.hashCode(this.institutionId)) * 31) + this.institutionCertificateDn.hashCode()) * 31) + this.institutionCertificateSn.hashCode()) * 31) + this.institutionCertificateIssuer.hashCode()) * 31) + this.documentType.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final int getScope() {
            return this.scope;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public long getTimestamp() {
            return this.timestamp;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public String toString() {
            return "Institutions(timestamp=" + this.timestamp + ", scope=" + this.scope + ", institutionName=" + this.institutionName + ", purposeName=" + this.purposeName + ", url=" + this.url + ", cardId=" + this.cardId + ", institutionId=" + this.institutionId + ", institutionCertificateDn=" + this.institutionCertificateDn + ", institutionCertificateSn=" + this.institutionCertificateSn + ", institutionCertificateIssuer=" + this.institutionCertificateIssuer + ", documentType=" + this.documentType + ")";
        }
    }

    /* JADX INFO: renamed from: y92.a$b, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Ly92/a$b;", "Ly92/a;", "", "timestamp", "", "purpose", "Lrq0/b;", "documentType", "<init>", "(JLjava/lang/String;Lrq0/b;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "J", "c", "()J", "Ljava/lang/String;", "d", "Lrq0/b;", "a", "()Lrq0/b;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Verification extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final long timestamp;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String purpose;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final rq0.b documentType;

        public Verification(long j15, String str, rq0.b bVar) {
            super(j15, null);
            this.timestamp = j15;
            this.purpose = str;
            this.documentType = bVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final rq0.b getDocumentType() {
            return this.documentType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getPurpose() {
            return this.purpose;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public long getTimestamp() {
            return this.timestamp;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Verification)) {
                return false;
            }
            Verification verification = (Verification) other;
            return this.timestamp == verification.timestamp && t.c(this.purpose, verification.purpose) && t.c(this.documentType, verification.documentType);
        }

        public int hashCode() {
            return (((Long.hashCode(this.timestamp) * 31) + this.purpose.hashCode()) * 31) + this.documentType.hashCode();
        }

        public String toString() {
            return "Verification(timestamp=" + this.timestamp + ", purpose=" + this.purpose + ", documentType=" + this.documentType + ")";
        }
    }

    public /* synthetic */ a(long j15, k kVar) {
        this(j15);
    }

    private a(long j15) {
        this.timestamp = j15;
    }
}
