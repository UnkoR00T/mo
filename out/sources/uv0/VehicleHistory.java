package uv0;

import iy.b0;
import java.math.BigDecimal;
import java.time.LocalDate;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: uv0.m, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001:\u0004\u0016\u001b\u0019\u001dB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010 \u001a\u0004\b\u001d\u0010!¨\u0006\""}, d2 = {"Luv0/m;", "", "Luv0/m$a;", "basicData", "Luv0/m$d;", "technicalData", "Luv0/m$b;", "documentData", "Luv0/m$c;", "homologationData", "<init>", "(Luv0/m$a;Luv0/m$d;Luv0/m$b;Luv0/m$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Luv0/m$a;", "()Luv0/m$a;", "b", "Luv0/m$d;", "d", "()Luv0/m$d;", "c", "Luv0/m$b;", "()Luv0/m$b;", "Luv0/m$c;", "()Luv0/m$c;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VehicleHistory {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final BasicData basicData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final TechnicalData technicalData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Document documentData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final HomologationData homologationData;

    /* JADX INFO: renamed from: uv0.m$a, reason: from toString */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0014R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\"\u001a\u0004\b%\u0010$R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b&\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0019\u001a\u0004\b\u001a\u0010\u0012R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u0019\u001a\u0004\b\u001e\u0010\u0012R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u0019\u001a\u0004\b!\u0010\u0012¨\u0006'"}, d2 = {"Luv0/m$a;", "", "", "description", "Luv0/v;", "vin", "", "yearOfProduction", "", "isCivilLiabilityInsurance", "isLost", "isTemporarilyWithdrawnFromCirculation", "odometerState", "registrationStatus", "vehicleTechnicalInspection", "<init>", "(Ljava/lang/String;Liy/b0;IZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfr/k;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Liy/b0;", "e", "()Liy/b0;", "c", "I", "f", "d", "Z", "g", "()Z", "h", "i", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BasicData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String description;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 vin;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final int yearOfProduction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isCivilLiabilityInsurance;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isLost;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isTemporarilyWithdrawnFromCirculation;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final String odometerState;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final String registrationStatus;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final String vehicleTechnicalInspection;

        public /* synthetic */ BasicData(String str, b0 b0Var, int i15, boolean z15, boolean z16, boolean z17, String str2, String str3, String str4, fr.k kVar) {
            this(str, b0Var, i15, z15, z16, z17, str2, str3, str4);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getOdometerState() {
            return this.odometerState;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getRegistrationStatus() {
            return this.registrationStatus;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getVehicleTechnicalInspection() {
            return this.vehicleTechnicalInspection;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final b0 getVin() {
            return this.vin;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BasicData)) {
                return false;
            }
            BasicData basicData = (BasicData) other;
            return fr.t.c(this.description, basicData.description) && v.f(this.vin, basicData.vin) && this.yearOfProduction == basicData.yearOfProduction && this.isCivilLiabilityInsurance == basicData.isCivilLiabilityInsurance && this.isLost == basicData.isLost && this.isTemporarilyWithdrawnFromCirculation == basicData.isTemporarilyWithdrawnFromCirculation && fr.t.c(this.odometerState, basicData.odometerState) && fr.t.c(this.registrationStatus, basicData.registrationStatus) && fr.t.c(this.vehicleTechnicalInspection, basicData.vehicleTechnicalInspection);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getYearOfProduction() {
            return this.yearOfProduction;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getIsCivilLiabilityInsurance() {
            return this.isCivilLiabilityInsurance;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean getIsLost() {
            return this.isLost;
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.description.hashCode() * 31) + v.g(this.vin)) * 31) + Integer.hashCode(this.yearOfProduction)) * 31) + Boolean.hashCode(this.isCivilLiabilityInsurance)) * 31) + Boolean.hashCode(this.isLost)) * 31) + Boolean.hashCode(this.isTemporarilyWithdrawnFromCirculation)) * 31;
            String str = this.odometerState;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.registrationStatus;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.vehicleTechnicalInspection;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final boolean getIsTemporarilyWithdrawnFromCirculation() {
            return this.isTemporarilyWithdrawnFromCirculation;
        }

        public String toString() {
            return "BasicData(description=" + this.description + ", vin=" + v.i(this.vin) + ", yearOfProduction=" + this.yearOfProduction + ", isCivilLiabilityInsurance=" + this.isCivilLiabilityInsurance + ", isLost=" + this.isLost + ", isTemporarilyWithdrawnFromCirculation=" + this.isTemporarilyWithdrawnFromCirculation + ", odometerState=" + this.odometerState + ", registrationStatus=" + this.registrationStatus + ", vehicleTechnicalInspection=" + this.vehicleTechnicalInspection + ")";
        }

        private BasicData(String str, b0 b0Var, int i15, boolean z15, boolean z16, boolean z17, String str2, String str3, String str4) {
            this.description = str;
            this.vin = b0Var;
            this.yearOfProduction = i15;
            this.isCivilLiabilityInsurance = z15;
            this.isLost = z16;
            this.isTemporarilyWithdrawnFromCirculation = z17;
            this.odometerState = str2;
            this.registrationStatus = str3;
            this.vehicleTechnicalInspection = str4;
        }
    }

    /* JADX INFO: renamed from: uv0.m$b, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0015\u0010\n¨\u0006\u0018"}, d2 = {"Luv0/m$b;", "", "Ljava/time/LocalDate;", "registrationDocumentDateOfIssue", "", "type", "state", "<init>", "(Ljava/time/LocalDate;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "b", "Ljava/lang/String;", "c", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Document {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocalDate registrationDocumentDateOfIssue;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String type;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String state;

        public Document(LocalDate localDate, String str, String str2) {
            this.registrationDocumentDateOfIssue = localDate;
            this.type = str;
            this.state = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final LocalDate getRegistrationDocumentDateOfIssue() {
            return this.registrationDocumentDateOfIssue;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getState() {
            return this.state;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Document)) {
                return false;
            }
            Document document = (Document) other;
            return fr.t.c(this.registrationDocumentDateOfIssue, document.registrationDocumentDateOfIssue) && fr.t.c(this.type, document.type) && fr.t.c(this.state, document.state);
        }

        public int hashCode() {
            LocalDate localDate = this.registrationDocumentDateOfIssue;
            int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
            String str = this.type;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.state;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Document(registrationDocumentDateOfIssue=" + this.registrationDocumentDateOfIssue + ", type=" + this.type + ", state=" + this.state + ")";
        }
    }

    /* JADX INFO: renamed from: uv0.m$c, reason: from toString */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u000bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0018\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0016\u0010\u000b¨\u0006\u0019"}, d2 = {"Luv0/m$c;", "", "", "certificateNumber", "category", "version", "variant", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "e", "d", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class HomologationData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String certificateNumber;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String category;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String version;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String variant;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String type;

        public HomologationData(String str, String str2, String str3, String str4, String str5) {
            this.certificateNumber = str;
            this.category = str2;
            this.version = str3;
            this.variant = str4;
            this.type = str5;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCategory() {
            return this.category;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCertificateNumber() {
            return this.certificateNumber;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getVariant() {
            return this.variant;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HomologationData)) {
                return false;
            }
            HomologationData homologationData = (HomologationData) other;
            return fr.t.c(this.certificateNumber, homologationData.certificateNumber) && fr.t.c(this.category, homologationData.category) && fr.t.c(this.version, homologationData.version) && fr.t.c(this.variant, homologationData.variant) && fr.t.c(this.type, homologationData.type);
        }

        public int hashCode() {
            String str = this.certificateNumber;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.category;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.version;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.variant;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.type;
            return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        }

        public String toString() {
            return "HomologationData(certificateNumber=" + this.certificateNumber + ", category=" + this.category + ", version=" + this.version + ", variant=" + this.variant + ", type=" + this.type + ")";
        }
    }

    /* JADX INFO: renamed from: uv0.m$d, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b,\b\u0086\b\u0018\u00002\u00020\u0001:\u0001&Bá\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b0\u0010/\u001a\u0004\b2\u00101R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b3\u0010/\u001a\u0004\b4\u00101R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b5\u0010/\u001a\u0004\b6\u00101R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b,\u0010/\u001a\u0004\b7\u00101R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b8\u0010/\u001a\u0004\b9\u00101R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b:\u0010/\u001a\u0004\b;\u00101R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b9\u0010+\u001a\u0004\b:\u0010-R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b7\u0010/\u001a\u0004\b<\u00101R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b;\u0010/\u001a\u0004\b=\u00101R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b>\u0010/\u001a\u0004\b>\u00101R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b=\u0010+\u001a\u0004\b?\u0010-R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b@\u0010/\u001a\u0004\bA\u00101R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b4\u0010B\u001a\u0004\b8\u0010 R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b6\u0010+\u001a\u0004\b3\u0010-R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b<\u0010B\u001a\u0004\b5\u0010 R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bA\u0010+\u001a\u0004\b.\u0010-R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b?\u0010B\u001a\u0004\b@\u0010 R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b(\u0010C\u001a\u0004\b&\u0010DR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\bE\u0010C\u001a\u0004\b*\u0010D¨\u0006F"}, d2 = {"Luv0/m$d;", "", "", "isEuroNorm", "Ljava/math/BigDecimal;", "enginePower", "", "curbWeight", "maxCurbWeight", "permissibleGrossWeight", "permissibleTotalPayload", "maxTrailerWeightWithBrake", "maxTrailerWeightNoBrake", "numberOfAxles", "maxAxleLoad", "totalNumberOfSeats", "numberOfStandingPlaces", "numberOfSeats", "wheelbase", "trackOfWheels", "", "fuelType", "emissionLevelCO2", "emissionLevelEuro", "averageFuelConsumption", "odometerState", "Luv0/m$d$a;", "alternativeFuel", "alternativeFuel2", "<init>", "(ZLjava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Luv0/m$d$a;Luv0/m$d$a;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "u", "()Z", "b", "Ljava/math/BigDecimal;", "g", "()Ljava/math/BigDecimal;", "c", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "getMaxCurbWeight", "e", "p", "f", "q", "k", "h", "j", "i", "l", "r", "n", "m", "t", "o", "s", "Ljava/lang/String;", "Luv0/m$d$a;", "()Luv0/m$d$a;", "v", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TechnicalData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isEuroNorm;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final BigDecimal enginePower;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer curbWeight;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer maxCurbWeight;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer permissibleGrossWeight;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer permissibleTotalPayload;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer maxTrailerWeightWithBrake;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer maxTrailerWeightNoBrake;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer numberOfAxles;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final BigDecimal maxAxleLoad;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer totalNumberOfSeats;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer numberOfStandingPlaces;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer numberOfSeats;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final BigDecimal wheelbase;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer trackOfWheels;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        private final String fuelType;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        private final BigDecimal emissionLevelCO2;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
        private final String emissionLevelEuro;

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
        private final BigDecimal averageFuelConsumption;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
        private final String odometerState;

        /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
        private final AlternativeFuel alternativeFuel;

        /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
        private final AlternativeFuel alternativeFuel2;

        /* JADX INFO: renamed from: uv0.m$d$a, reason: from toString */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Luv0/m$d$a;", "", "", "type", "Ljava/math/BigDecimal;", "averageFuelConsumption", "averageCO2Emission", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class AlternativeFuel {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String type;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final BigDecimal averageFuelConsumption;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final BigDecimal averageCO2Emission;

            public AlternativeFuel(String str, BigDecimal bigDecimal, BigDecimal bigDecimal2) {
                this.type = str;
                this.averageFuelConsumption = bigDecimal;
                this.averageCO2Emission = bigDecimal2;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final BigDecimal getAverageCO2Emission() {
                return this.averageCO2Emission;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final BigDecimal getAverageFuelConsumption() {
                return this.averageFuelConsumption;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getType() {
                return this.type;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AlternativeFuel)) {
                    return false;
                }
                AlternativeFuel alternativeFuel = (AlternativeFuel) other;
                return fr.t.c(this.type, alternativeFuel.type) && fr.t.c(this.averageFuelConsumption, alternativeFuel.averageFuelConsumption) && fr.t.c(this.averageCO2Emission, alternativeFuel.averageCO2Emission);
            }

            public int hashCode() {
                int iHashCode = this.type.hashCode() * 31;
                BigDecimal bigDecimal = this.averageFuelConsumption;
                int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
                BigDecimal bigDecimal2 = this.averageCO2Emission;
                return iHashCode2 + (bigDecimal2 != null ? bigDecimal2.hashCode() : 0);
            }

            public String toString() {
                return "AlternativeFuel(type=" + this.type + ", averageFuelConsumption=" + this.averageFuelConsumption + ", averageCO2Emission=" + this.averageCO2Emission + ")";
            }
        }

        public TechnicalData(boolean z15, BigDecimal bigDecimal, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, BigDecimal bigDecimal2, Integer num8, Integer num9, Integer num10, BigDecimal bigDecimal3, Integer num11, String str, BigDecimal bigDecimal4, String str2, BigDecimal bigDecimal5, String str3, AlternativeFuel alternativeFuel, AlternativeFuel alternativeFuel2) {
            this.isEuroNorm = z15;
            this.enginePower = bigDecimal;
            this.curbWeight = num;
            this.maxCurbWeight = num2;
            this.permissibleGrossWeight = num3;
            this.permissibleTotalPayload = num4;
            this.maxTrailerWeightWithBrake = num5;
            this.maxTrailerWeightNoBrake = num6;
            this.numberOfAxles = num7;
            this.maxAxleLoad = bigDecimal2;
            this.totalNumberOfSeats = num8;
            this.numberOfStandingPlaces = num9;
            this.numberOfSeats = num10;
            this.wheelbase = bigDecimal3;
            this.trackOfWheels = num11;
            this.fuelType = str;
            this.emissionLevelCO2 = bigDecimal4;
            this.emissionLevelEuro = str2;
            this.averageFuelConsumption = bigDecimal5;
            this.odometerState = str3;
            this.alternativeFuel = alternativeFuel;
            this.alternativeFuel2 = alternativeFuel2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AlternativeFuel getAlternativeFuel() {
            return this.alternativeFuel;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final AlternativeFuel getAlternativeFuel2() {
            return this.alternativeFuel2;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final BigDecimal getAverageFuelConsumption() {
            return this.averageFuelConsumption;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Integer getCurbWeight() {
            return this.curbWeight;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final BigDecimal getEmissionLevelCO2() {
            return this.emissionLevelCO2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TechnicalData)) {
                return false;
            }
            TechnicalData technicalData = (TechnicalData) other;
            return this.isEuroNorm == technicalData.isEuroNorm && fr.t.c(this.enginePower, technicalData.enginePower) && fr.t.c(this.curbWeight, technicalData.curbWeight) && fr.t.c(this.maxCurbWeight, technicalData.maxCurbWeight) && fr.t.c(this.permissibleGrossWeight, technicalData.permissibleGrossWeight) && fr.t.c(this.permissibleTotalPayload, technicalData.permissibleTotalPayload) && fr.t.c(this.maxTrailerWeightWithBrake, technicalData.maxTrailerWeightWithBrake) && fr.t.c(this.maxTrailerWeightNoBrake, technicalData.maxTrailerWeightNoBrake) && fr.t.c(this.numberOfAxles, technicalData.numberOfAxles) && fr.t.c(this.maxAxleLoad, technicalData.maxAxleLoad) && fr.t.c(this.totalNumberOfSeats, technicalData.totalNumberOfSeats) && fr.t.c(this.numberOfStandingPlaces, technicalData.numberOfStandingPlaces) && fr.t.c(this.numberOfSeats, technicalData.numberOfSeats) && fr.t.c(this.wheelbase, technicalData.wheelbase) && fr.t.c(this.trackOfWheels, technicalData.trackOfWheels) && fr.t.c(this.fuelType, technicalData.fuelType) && fr.t.c(this.emissionLevelCO2, technicalData.emissionLevelCO2) && fr.t.c(this.emissionLevelEuro, technicalData.emissionLevelEuro) && fr.t.c(this.averageFuelConsumption, technicalData.averageFuelConsumption) && fr.t.c(this.odometerState, technicalData.odometerState) && fr.t.c(this.alternativeFuel, technicalData.alternativeFuel) && fr.t.c(this.alternativeFuel2, technicalData.alternativeFuel2);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getEmissionLevelEuro() {
            return this.emissionLevelEuro;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final BigDecimal getEnginePower() {
            return this.enginePower;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getFuelType() {
            return this.fuelType;
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.isEuroNorm) * 31;
            BigDecimal bigDecimal = this.enginePower;
            int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
            Integer num = this.curbWeight;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.maxCurbWeight;
            int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.permissibleGrossWeight;
            int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.permissibleTotalPayload;
            int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Integer num5 = this.maxTrailerWeightWithBrake;
            int iHashCode7 = (iHashCode6 + (num5 == null ? 0 : num5.hashCode())) * 31;
            Integer num6 = this.maxTrailerWeightNoBrake;
            int iHashCode8 = (iHashCode7 + (num6 == null ? 0 : num6.hashCode())) * 31;
            Integer num7 = this.numberOfAxles;
            int iHashCode9 = (iHashCode8 + (num7 == null ? 0 : num7.hashCode())) * 31;
            BigDecimal bigDecimal2 = this.maxAxleLoad;
            int iHashCode10 = (iHashCode9 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
            Integer num8 = this.totalNumberOfSeats;
            int iHashCode11 = (iHashCode10 + (num8 == null ? 0 : num8.hashCode())) * 31;
            Integer num9 = this.numberOfStandingPlaces;
            int iHashCode12 = (iHashCode11 + (num9 == null ? 0 : num9.hashCode())) * 31;
            Integer num10 = this.numberOfSeats;
            int iHashCode13 = (iHashCode12 + (num10 == null ? 0 : num10.hashCode())) * 31;
            BigDecimal bigDecimal3 = this.wheelbase;
            int iHashCode14 = (iHashCode13 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
            Integer num11 = this.trackOfWheels;
            int iHashCode15 = (iHashCode14 + (num11 == null ? 0 : num11.hashCode())) * 31;
            String str = this.fuelType;
            int iHashCode16 = (iHashCode15 + (str == null ? 0 : str.hashCode())) * 31;
            BigDecimal bigDecimal4 = this.emissionLevelCO2;
            int iHashCode17 = (iHashCode16 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
            String str2 = this.emissionLevelEuro;
            int iHashCode18 = (iHashCode17 + (str2 == null ? 0 : str2.hashCode())) * 31;
            BigDecimal bigDecimal5 = this.averageFuelConsumption;
            int iHashCode19 = (iHashCode18 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
            String str3 = this.odometerState;
            int iHashCode20 = (iHashCode19 + (str3 == null ? 0 : str3.hashCode())) * 31;
            AlternativeFuel alternativeFuel = this.alternativeFuel;
            int iHashCode21 = (iHashCode20 + (alternativeFuel == null ? 0 : alternativeFuel.hashCode())) * 31;
            AlternativeFuel alternativeFuel2 = this.alternativeFuel2;
            return iHashCode21 + (alternativeFuel2 != null ? alternativeFuel2.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final BigDecimal getMaxAxleLoad() {
            return this.maxAxleLoad;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final Integer getMaxTrailerWeightNoBrake() {
            return this.maxTrailerWeightNoBrake;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final Integer getMaxTrailerWeightWithBrake() {
            return this.maxTrailerWeightWithBrake;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final Integer getNumberOfAxles() {
            return this.numberOfAxles;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final Integer getNumberOfSeats() {
            return this.numberOfSeats;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final Integer getNumberOfStandingPlaces() {
            return this.numberOfStandingPlaces;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final String getOdometerState() {
            return this.odometerState;
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public final Integer getPermissibleGrossWeight() {
            return this.permissibleGrossWeight;
        }

        /* JADX INFO: renamed from: q, reason: from getter */
        public final Integer getPermissibleTotalPayload() {
            return this.permissibleTotalPayload;
        }

        /* JADX INFO: renamed from: r, reason: from getter */
        public final Integer getTotalNumberOfSeats() {
            return this.totalNumberOfSeats;
        }

        /* JADX INFO: renamed from: s, reason: from getter */
        public final Integer getTrackOfWheels() {
            return this.trackOfWheels;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final BigDecimal getWheelbase() {
            return this.wheelbase;
        }

        public String toString() {
            return "TechnicalData(isEuroNorm=" + this.isEuroNorm + ", enginePower=" + this.enginePower + ", curbWeight=" + this.curbWeight + ", maxCurbWeight=" + this.maxCurbWeight + ", permissibleGrossWeight=" + this.permissibleGrossWeight + ", permissibleTotalPayload=" + this.permissibleTotalPayload + ", maxTrailerWeightWithBrake=" + this.maxTrailerWeightWithBrake + ", maxTrailerWeightNoBrake=" + this.maxTrailerWeightNoBrake + ", numberOfAxles=" + this.numberOfAxles + ", maxAxleLoad=" + this.maxAxleLoad + ", totalNumberOfSeats=" + this.totalNumberOfSeats + ", numberOfStandingPlaces=" + this.numberOfStandingPlaces + ", numberOfSeats=" + this.numberOfSeats + ", wheelbase=" + this.wheelbase + ", trackOfWheels=" + this.trackOfWheels + ", fuelType=" + this.fuelType + ", emissionLevelCO2=" + this.emissionLevelCO2 + ", emissionLevelEuro=" + this.emissionLevelEuro + ", averageFuelConsumption=" + this.averageFuelConsumption + ", odometerState=" + this.odometerState + ", alternativeFuel=" + this.alternativeFuel + ", alternativeFuel2=" + this.alternativeFuel2 + ")";
        }

        /* JADX INFO: renamed from: u, reason: from getter */
        public final boolean getIsEuroNorm() {
            return this.isEuroNorm;
        }
    }

    public VehicleHistory(BasicData basicData, TechnicalData technicalData, Document document, HomologationData homologationData) {
        this.basicData = basicData;
        this.technicalData = technicalData;
        this.documentData = document;
        this.homologationData = homologationData;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BasicData getBasicData() {
        return this.basicData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Document getDocumentData() {
        return this.documentData;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final HomologationData getHomologationData() {
        return this.homologationData;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TechnicalData getTechnicalData() {
        return this.technicalData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VehicleHistory)) {
            return false;
        }
        VehicleHistory vehicleHistory = (VehicleHistory) other;
        return fr.t.c(this.basicData, vehicleHistory.basicData) && fr.t.c(this.technicalData, vehicleHistory.technicalData) && fr.t.c(this.documentData, vehicleHistory.documentData) && fr.t.c(this.homologationData, vehicleHistory.homologationData);
    }

    public int hashCode() {
        return (((((this.basicData.hashCode() * 31) + this.technicalData.hashCode()) * 31) + this.documentData.hashCode()) * 31) + this.homologationData.hashCode();
    }

    public String toString() {
        return "VehicleHistory(basicData=" + this.basicData + ", technicalData=" + this.technicalData + ", documentData=" + this.documentData + ", homologationData=" + this.homologationData + ")";
    }
}
