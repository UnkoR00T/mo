package mo3;

import co3.InstitutionDataModel;
import co3.QrCodeData;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lmo3/b;", "", "b", "a", "d", "c", "Lmo3/b$a;", "Lmo3/b$b;", "Lmo3/b$c;", "Lmo3/b$d;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {

    /* JADX INFO: renamed from: mo3.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lmo3/b$a;", "Lmo3/b;", "", "qrCode", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Deeplink implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String qrCode;

        public Deeplink(String str) {
            this.qrCode = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getQrCode() {
            return this.qrCode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Deeplink) && fr.t.c(this.qrCode, ((Deeplink) other).qrCode);
        }

        public int hashCode() {
            return this.qrCode.hashCode();
        }

        public String toString() {
            return "Deeplink(qrCode=" + this.qrCode + ')';
        }
    }

    /* JADX INFO: renamed from: mo3.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lmo3/b$b;", "Lmo3/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C3144b implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C3144b f127206a = new C3144b();

        private C3144b() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof C3144b);
        }

        public int hashCode() {
            return -1301872898;
        }

        public String toString() {
            return "Initial";
        }
    }

    /* JADX INFO: renamed from: mo3.b$c, reason: from toString */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b%\u0010&R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b%\u0010'\u001a\u0004\b \u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+¨\u0006,"}, d2 = {"Lmo3/b$c;", "Lmo3/b;", "", "entity", "Lco3/c;", "institutionData", "Lco3/e;", "qrCodeData", "Lk34/g;", "selectedDocument", "", "Lco3/q;", "listOfVerificationDataType", "Lco3/n;", "subDocument", "<init>", "(Ljava/lang/String;Lco3/c;Lco3/e;Lk34/g;Ljava/util/List;Lco3/n;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lco3/c;", "()Lco3/c;", "c", "Lco3/e;", "d", "()Lco3/e;", "Lk34/g;", "e", "()Lk34/g;", "Ljava/util/List;", "()Ljava/util/List;", "f", "Lco3/n;", "()Lco3/n;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String entity;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final InstitutionDataModel institutionData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final QrCodeData qrCodeData;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final k34.g selectedDocument;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<co3.q> listOfVerificationDataType;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final co3.n subDocument;

        /* JADX WARN: Multi-variable type inference failed */
        public Initialized(String str, InstitutionDataModel institutionDataModel, QrCodeData qrCodeData, k34.g gVar, List<? extends co3.q> list, co3.n nVar) {
            this.entity = str;
            this.institutionData = institutionDataModel;
            this.qrCodeData = qrCodeData;
            this.selectedDocument = gVar;
            this.listOfVerificationDataType = list;
            this.subDocument = nVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getEntity() {
            return this.entity;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final InstitutionDataModel getInstitutionData() {
            return this.institutionData;
        }

        public final List<co3.q> c() {
            return this.listOfVerificationDataType;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final QrCodeData getQrCodeData() {
            return this.qrCodeData;
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
            return fr.t.c(this.entity, initialized.entity) && fr.t.c(this.institutionData, initialized.institutionData) && fr.t.c(this.qrCodeData, initialized.qrCodeData) && fr.t.c(this.selectedDocument, initialized.selectedDocument) && fr.t.c(this.listOfVerificationDataType, initialized.listOfVerificationDataType) && fr.t.c(this.subDocument, initialized.subDocument);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final co3.n getSubDocument() {
            return this.subDocument;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.entity.hashCode() * 31) + this.institutionData.hashCode()) * 31) + this.qrCodeData.hashCode()) * 31) + this.selectedDocument.hashCode()) * 31) + this.listOfVerificationDataType.hashCode()) * 31;
            co3.n nVar = this.subDocument;
            return iHashCode + (nVar == null ? 0 : nVar.hashCode());
        }

        public String toString() {
            return "Initialized(entity=" + this.entity + ", institutionData=" + this.institutionData + ", qrCodeData=" + this.qrCodeData + ", selectedDocument=" + this.selectedDocument + ", listOfVerificationDataType=" + this.listOfVerificationDataType + ", subDocument=" + this.subDocument + ')';
        }
    }

    /* JADX INFO: renamed from: mo3.b$d, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lmo3/b$d;", "Lmo3/b;", "Lco3/e;", "qrCodeData", "<init>", "(Lco3/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lco3/e;", "()Lco3/e;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
