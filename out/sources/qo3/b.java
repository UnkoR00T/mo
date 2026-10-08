package qo3;

import co3.QrCodeData;
import java.util.List;
import k34.a0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lqo3/b;", "", "a", "c", "b", "Lqo3/b$a;", "Lqo3/b$b;", "Lqo3/b$c;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lqo3/b$a;", "Lqo3/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f167724a = new a();

        private a() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return 948015146;
        }

        public String toString() {
            return "Initial";
        }
    }

    /* JADX INFO: renamed from: qo3.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b\u001d\u0010\u0014R%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b&\u0010(\u001a\u0004\b \u0010)R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u001f\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b+\u0010-\u001a\u0004\b!\u0010.¨\u0006/"}, d2 = {"Lqo3/b$b;", "Lqo3/b;", "", "sessionUuid", "encodedCertificate", "Loq/r;", "Lk34/a0;", "scope", "Lk34/g;", "selectedDocument", "", "Lco3/q;", "listOfVerificationDataType", "Lco3/n;", "subDocument", "Lco3/e;", "qrCodeData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Loq/r;Lk34/g;Ljava/util/List;Lco3/n;Lco3/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "b", "c", "Loq/r;", "d", "()Loq/r;", "Lk34/g;", "e", "()Lk34/g;", "Ljava/util/List;", "()Ljava/util/List;", "Lco3/n;", "g", "()Lco3/n;", "Lco3/e;", "()Lco3/e;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String sessionUuid;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String encodedCertificate;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final oq.r<a0, a0> scope;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final k34.g selectedDocument;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<co3.q> listOfVerificationDataType;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final co3.n subDocument;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final QrCodeData qrCodeData;

        /* JADX WARN: Multi-variable type inference failed */
        public Initialized(String str, String str2, oq.r<? extends a0, ? extends a0> rVar, k34.g gVar, List<? extends co3.q> list, co3.n nVar, QrCodeData qrCodeData) {
            this.sessionUuid = str;
            this.encodedCertificate = str2;
            this.scope = rVar;
            this.selectedDocument = gVar;
            this.listOfVerificationDataType = list;
            this.subDocument = nVar;
            this.qrCodeData = qrCodeData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getEncodedCertificate() {
            return this.encodedCertificate;
        }

        public final List<co3.q> b() {
            return this.listOfVerificationDataType;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final QrCodeData getQrCodeData() {
            return this.qrCodeData;
        }

        public final oq.r<a0, a0> d() {
            return this.scope;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final k34.g getSelectedDocument() {
            return this.selectedDocument;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialized)) {
                return false;
            }
            Initialized initialized = (Initialized) other;
            return fr.t.c(this.sessionUuid, initialized.sessionUuid) && fr.t.c(this.encodedCertificate, initialized.encodedCertificate) && fr.t.c(this.scope, initialized.scope) && fr.t.c(this.selectedDocument, initialized.selectedDocument) && fr.t.c(this.listOfVerificationDataType, initialized.listOfVerificationDataType) && fr.t.c(this.subDocument, initialized.subDocument) && fr.t.c(this.qrCodeData, initialized.qrCodeData);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getSessionUuid() {
            return this.sessionUuid;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final co3.n getSubDocument() {
            return this.subDocument;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.sessionUuid.hashCode() * 31) + this.encodedCertificate.hashCode()) * 31) + this.scope.hashCode()) * 31) + this.selectedDocument.hashCode()) * 31) + this.listOfVerificationDataType.hashCode()) * 31;
            co3.n nVar = this.subDocument;
            return ((iHashCode + (nVar == null ? 0 : nVar.hashCode())) * 31) + this.qrCodeData.hashCode();
        }

        public String toString() {
            return "Initialized(sessionUuid=" + this.sessionUuid + ", encodedCertificate=" + this.encodedCertificate + ", scope=" + this.scope + ", selectedDocument=" + this.selectedDocument + ", listOfVerificationDataType=" + this.listOfVerificationDataType + ", subDocument=" + this.subDocument + ", qrCodeData=" + this.qrCodeData + ')';
        }
    }

    /* JADX INFO: renamed from: qo3.b$c, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lqo3/b$c;", "Lqo3/b;", "Lco3/e;", "qrCodeData", "<init>", "(Lco3/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lco3/e;", "()Lco3/e;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Loading implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final QrCodeData qrCodeData;

        public Loading(QrCodeData qrCodeData) {
            this.qrCodeData = qrCodeData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final QrCodeData getQrCodeData() {
            return this.qrCodeData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loading) && fr.t.c(this.qrCodeData, ((Loading) other).qrCodeData);
        }

        public int hashCode() {
            return this.qrCodeData.hashCode();
        }

        public String toString() {
            return "Loading(qrCodeData=" + this.qrCodeData + ')';
        }
    }
}
