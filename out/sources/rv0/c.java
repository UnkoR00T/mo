package rv0;

import fr.k;
import fr.t;
import iy.b0;
import java.time.LocalDate;
import p071kotlin.Metadata;
import uv0.d;
import uv0.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001:\u0005\u000e\u0013\u0016\u0011\u0018B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0011\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0018\u0010\u001c¨\u0006\u001d"}, d2 = {"Lrv0/c;", "", "Lrv0/c$a;", "basicData", "Lrv0/c$c;", "homologationData", "Lrv0/c$e;", "technicalData", "Lrv0/c$b;", "datesData", "Lrv0/c$d;", "statusData", "<init>", "(Lrv0/c$a;Lrv0/c$c;Lrv0/c$e;Lrv0/c$b;Lrv0/c$d;)V", "a", "Lrv0/c$a;", "()Lrv0/c$a;", "b", "Lrv0/c$c;", "c", "()Lrv0/c$c;", "Lrv0/c$e;", "e", "()Lrv0/c$e;", "d", "Lrv0/c$b;", "()Lrv0/c$b;", "Lrv0/c$d;", "()Lrv0/c$d;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final BasicData basicData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final HomologationData homologationData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final TechnicalData technicalData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final DatesData datesData;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final StatusData statusData;

    /* JADX INFO: renamed from: rv0.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001d\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001e\u0010\u000fR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b\u001f\u0010\u000fR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0018\u001a\u0004\b \u0010\u000fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u0019\u0010\u000f¨\u0006!"}, d2 = {"Lrv0/c$a;", "", "", "brand", "Luv0/v;", "vin", "Luv0/d;", "plateNumber", "productionYear", "registrationAuthorityCode", "type", "model", "<init>", "(Ljava/lang/String;Liy/b0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfr/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Liy/b0;", "g", "()Liy/b0;", "c", "d", "e", "f", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BasicData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String brand;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 vin;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String plateNumber;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String productionYear;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String registrationAuthorityCode;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String type;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final String model;

        public /* synthetic */ BasicData(String str, b0 b0Var, String str2, String str3, String str4, String str5, String str6, k kVar) {
            this(str, b0Var, str2, str3, str4, str5, str6);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getBrand() {
            return this.brand;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getModel() {
            return this.model;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getPlateNumber() {
            return this.plateNumber;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getProductionYear() {
            return this.productionYear;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getRegistrationAuthorityCode() {
            return this.registrationAuthorityCode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BasicData)) {
                return false;
            }
            BasicData basicData = (BasicData) other;
            return t.c(this.brand, basicData.brand) && v.f(this.vin, basicData.vin) && d.e(this.plateNumber, basicData.plateNumber) && t.c(this.productionYear, basicData.productionYear) && t.c(this.registrationAuthorityCode, basicData.registrationAuthorityCode) && t.c(this.type, basicData.type) && t.c(this.model, basicData.model);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final b0 getVin() {
            return this.vin;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.brand.hashCode() * 31) + v.g(this.vin)) * 31) + d.f(this.plateNumber)) * 31) + this.productionYear.hashCode()) * 31) + this.registrationAuthorityCode.hashCode()) * 31;
            String str = this.type;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.model;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "BasicData(brand=" + this.brand + ", vin=" + v.i(this.vin) + ", plateNumber=" + d.h(this.plateNumber) + ", productionYear=" + this.productionYear + ", registrationAuthorityCode=" + this.registrationAuthorityCode + ", type=" + this.type + ", model=" + this.model + ")";
        }

        private BasicData(String str, b0 b0Var, String str2, String str3, String str4, String str5, String str6) {
            this.brand = str;
            this.vin = b0Var;
            this.plateNumber = str2;
            this.productionYear = str3;
            this.registrationAuthorityCode = str4;
            this.type = str5;
            this.model = str6;
        }
    }

    /* JADX INFO: renamed from: rv0.c$b, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Lrv0/c$b;", "", "Ljava/time/LocalDate;", "registrationDocumentIssueDate", "nextCivilLiabilityInsuranceDate", "vehicleTechnicalInspectionEndDate", "<init>", "(Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/LocalDate;", "b", "()Ljava/time/LocalDate;", "c", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DatesData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocalDate registrationDocumentIssueDate;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocalDate nextCivilLiabilityInsuranceDate;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocalDate vehicleTechnicalInspectionEndDate;

        public DatesData(LocalDate localDate, LocalDate localDate2, LocalDate localDate3) {
            this.registrationDocumentIssueDate = localDate;
            this.nextCivilLiabilityInsuranceDate = localDate2;
            this.vehicleTechnicalInspectionEndDate = localDate3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final LocalDate getNextCivilLiabilityInsuranceDate() {
            return this.nextCivilLiabilityInsuranceDate;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final LocalDate getRegistrationDocumentIssueDate() {
            return this.registrationDocumentIssueDate;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final LocalDate getVehicleTechnicalInspectionEndDate() {
            return this.vehicleTechnicalInspectionEndDate;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DatesData)) {
                return false;
            }
            DatesData datesData = (DatesData) other;
            return t.c(this.registrationDocumentIssueDate, datesData.registrationDocumentIssueDate) && t.c(this.nextCivilLiabilityInsuranceDate, datesData.nextCivilLiabilityInsuranceDate) && t.c(this.vehicleTechnicalInspectionEndDate, datesData.vehicleTechnicalInspectionEndDate);
        }

        public int hashCode() {
            LocalDate localDate = this.registrationDocumentIssueDate;
            int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
            LocalDate localDate2 = this.nextCivilLiabilityInsuranceDate;
            int iHashCode2 = (iHashCode + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
            LocalDate localDate3 = this.vehicleTechnicalInspectionEndDate;
            return iHashCode2 + (localDate3 != null ? localDate3.hashCode() : 0);
        }

        public String toString() {
            return "DatesData(registrationDocumentIssueDate=" + this.registrationDocumentIssueDate + ", nextCivilLiabilityInsuranceDate=" + this.nextCivilLiabilityInsuranceDate + ", vehicleTechnicalInspectionEndDate=" + this.vehicleTechnicalInspectionEndDate + ")";
        }
    }

    /* JADX INFO: renamed from: rv0.c$c, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\n¨\u0006\u0017"}, d2 = {"Lrv0/c$c;", "", "", "category", "version", "certificateNumber", "variant", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "d", "c", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class HomologationData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String category;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String version;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String certificateNumber;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String variant;

        public HomologationData(String str, String str2, String str3, String str4) {
            this.category = str;
            this.version = str2;
            this.certificateNumber = str3;
            this.variant = str4;
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
        public final String getVariant() {
            return this.variant;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
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
            return t.c(this.category, homologationData.category) && t.c(this.version, homologationData.version) && t.c(this.certificateNumber, homologationData.certificateNumber) && t.c(this.variant, homologationData.variant);
        }

        public int hashCode() {
            String str = this.category;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.version;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.certificateNumber;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.variant;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            return "HomologationData(category=" + this.category + ", version=" + this.version + ", certificateNumber=" + this.certificateNumber + ", variant=" + this.variant + ")";
        }
    }

    /* JADX INFO: renamed from: rv0.c$d, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001a\u0010\u001d¨\u0006\u001e"}, d2 = {"Lrv0/c$d;", "", "", "civilLiabilityInsurance", "Lrv0/a;", "registrationStatus", "isTechnicalInspectionValid", "Lrv0/b;", "reportStatus", "<init>", "(ZLrv0/a;ZLrv0/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "Lrv0/a;", "()Lrv0/a;", "c", "d", "Lrv0/b;", "()Lrv0/b;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StatusData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean civilLiabilityInsurance;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final a registrationStatus;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isTechnicalInspectionValid;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final b reportStatus;

        public StatusData(boolean z15, a aVar, boolean z16, b bVar) {
            this.civilLiabilityInsurance = z15;
            this.registrationStatus = aVar;
            this.isTechnicalInspectionValid = z16;
            this.reportStatus = bVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getCivilLiabilityInsurance() {
            return this.civilLiabilityInsurance;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final a getRegistrationStatus() {
            return this.registrationStatus;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final b getReportStatus() {
            return this.reportStatus;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getIsTechnicalInspectionValid() {
            return this.isTechnicalInspectionValid;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StatusData)) {
                return false;
            }
            StatusData statusData = (StatusData) other;
            return this.civilLiabilityInsurance == statusData.civilLiabilityInsurance && this.registrationStatus == statusData.registrationStatus && this.isTechnicalInspectionValid == statusData.isTechnicalInspectionValid && this.reportStatus == statusData.reportStatus;
        }

        public int hashCode() {
            return (((((Boolean.hashCode(this.civilLiabilityInsurance) * 31) + this.registrationStatus.hashCode()) * 31) + Boolean.hashCode(this.isTechnicalInspectionValid)) * 31) + this.reportStatus.hashCode();
        }

        public String toString() {
            return "StatusData(civilLiabilityInsurance=" + this.civilLiabilityInsurance + ", registrationStatus=" + this.registrationStatus + ", isTechnicalInspectionValid=" + this.isTechnicalInspectionValid + ", reportStatus=" + this.reportStatus + ")";
        }
    }

    /* JADX INFO: renamed from: rv0.c$e, reason: from toString */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0019\u001a\u0004\b!\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u0018\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\"\u001a\u0004\b#\u0010\u0011R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0019\u001a\u0004\b \u0010\u001bR\u0019\u0010\r\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b$\u0010\u0011¨\u0006%"}, d2 = {"Lrv0/c$e;", "", "", "totalSeatsNumber", "seatsNumber", "standingPlacesNumber", "curbWeight", "permissibleGrossWeight", "axlesNumber", "lastRegisteredMeterOneReading", "", "unitOfMeterOne", "lastRegisteredMeterTwoReading", "unitOfMeterTwo", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "h", "()Ljava/lang/Integer;", "b", "f", "c", "g", "d", "e", "Ljava/lang/String;", "i", "j", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TechnicalData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer totalSeatsNumber;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer seatsNumber;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer standingPlacesNumber;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer curbWeight;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer permissibleGrossWeight;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer axlesNumber;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer lastRegisteredMeterOneReading;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final String unitOfMeterOne;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer lastRegisteredMeterTwoReading;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final String unitOfMeterTwo;

        public TechnicalData(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, String str, Integer num8, String str2) {
            this.totalSeatsNumber = num;
            this.seatsNumber = num2;
            this.standingPlacesNumber = num3;
            this.curbWeight = num4;
            this.permissibleGrossWeight = num5;
            this.axlesNumber = num6;
            this.lastRegisteredMeterOneReading = num7;
            this.unitOfMeterOne = str;
            this.lastRegisteredMeterTwoReading = num8;
            this.unitOfMeterTwo = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Integer getAxlesNumber() {
            return this.axlesNumber;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Integer getCurbWeight() {
            return this.curbWeight;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Integer getLastRegisteredMeterOneReading() {
            return this.lastRegisteredMeterOneReading;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Integer getLastRegisteredMeterTwoReading() {
            return this.lastRegisteredMeterTwoReading;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Integer getPermissibleGrossWeight() {
            return this.permissibleGrossWeight;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TechnicalData)) {
                return false;
            }
            TechnicalData technicalData = (TechnicalData) other;
            return t.c(this.totalSeatsNumber, technicalData.totalSeatsNumber) && t.c(this.seatsNumber, technicalData.seatsNumber) && t.c(this.standingPlacesNumber, technicalData.standingPlacesNumber) && t.c(this.curbWeight, technicalData.curbWeight) && t.c(this.permissibleGrossWeight, technicalData.permissibleGrossWeight) && t.c(this.axlesNumber, technicalData.axlesNumber) && t.c(this.lastRegisteredMeterOneReading, technicalData.lastRegisteredMeterOneReading) && t.c(this.unitOfMeterOne, technicalData.unitOfMeterOne) && t.c(this.lastRegisteredMeterTwoReading, technicalData.lastRegisteredMeterTwoReading) && t.c(this.unitOfMeterTwo, technicalData.unitOfMeterTwo);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final Integer getSeatsNumber() {
            return this.seatsNumber;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final Integer getStandingPlacesNumber() {
            return this.standingPlacesNumber;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final Integer getTotalSeatsNumber() {
            return this.totalSeatsNumber;
        }

        public int hashCode() {
            Integer num = this.totalSeatsNumber;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.seatsNumber;
            int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.standingPlacesNumber;
            int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.curbWeight;
            int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Integer num5 = this.permissibleGrossWeight;
            int iHashCode5 = (iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
            Integer num6 = this.axlesNumber;
            int iHashCode6 = (iHashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
            Integer num7 = this.lastRegisteredMeterOneReading;
            int iHashCode7 = (iHashCode6 + (num7 == null ? 0 : num7.hashCode())) * 31;
            String str = this.unitOfMeterOne;
            int iHashCode8 = (iHashCode7 + (str == null ? 0 : str.hashCode())) * 31;
            Integer num8 = this.lastRegisteredMeterTwoReading;
            int iHashCode9 = (iHashCode8 + (num8 == null ? 0 : num8.hashCode())) * 31;
            String str2 = this.unitOfMeterTwo;
            return iHashCode9 + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getUnitOfMeterOne() {
            return this.unitOfMeterOne;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getUnitOfMeterTwo() {
            return this.unitOfMeterTwo;
        }

        public String toString() {
            return "TechnicalData(totalSeatsNumber=" + this.totalSeatsNumber + ", seatsNumber=" + this.seatsNumber + ", standingPlacesNumber=" + this.standingPlacesNumber + ", curbWeight=" + this.curbWeight + ", permissibleGrossWeight=" + this.permissibleGrossWeight + ", axlesNumber=" + this.axlesNumber + ", lastRegisteredMeterOneReading=" + this.lastRegisteredMeterOneReading + ", unitOfMeterOne=" + this.unitOfMeterOne + ", lastRegisteredMeterTwoReading=" + this.lastRegisteredMeterTwoReading + ", unitOfMeterTwo=" + this.unitOfMeterTwo + ")";
        }
    }

    public c(BasicData basicData, HomologationData homologationData, TechnicalData technicalData, DatesData datesData, StatusData statusData) {
        this.basicData = basicData;
        this.homologationData = homologationData;
        this.technicalData = technicalData;
        this.datesData = datesData;
        this.statusData = statusData;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BasicData getBasicData() {
        return this.basicData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final DatesData getDatesData() {
        return this.datesData;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final HomologationData getHomologationData() {
        return this.homologationData;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final StatusData getStatusData() {
        return this.statusData;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TechnicalData getTechnicalData() {
        return this.technicalData;
    }
}
