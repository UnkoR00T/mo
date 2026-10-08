package fw0;

import java.time.LocalDate;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: fw0.t, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"Lfw0/t;", "", "Ljava/time/LocalDate;", "nextCivilLiabilityInsuranceDate", "registrationDocumentDateOfIssue", "vehicleTechnicalInspectionEndDate", "<init>", "(Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "b", "c", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DatesDataDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("nextCivilLiabilityInsuranceDate")
    private final LocalDate nextCivilLiabilityInsuranceDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("registrationDocumentDateOfIssue")
    private final LocalDate registrationDocumentDateOfIssue;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("vehicleTechnicalInspectionEndDate")
    private final LocalDate vehicleTechnicalInspectionEndDate;

    public DatesDataDto() {
        this(null, null, null, 7, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final LocalDate getNextCivilLiabilityInsuranceDate() {
        return this.nextCivilLiabilityInsuranceDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final LocalDate getRegistrationDocumentDateOfIssue() {
        return this.registrationDocumentDateOfIssue;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final LocalDate getVehicleTechnicalInspectionEndDate() {
        return this.vehicleTechnicalInspectionEndDate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DatesDataDto)) {
            return false;
        }
        DatesDataDto datesDataDto = (DatesDataDto) other;
        return fr.t.c(this.nextCivilLiabilityInsuranceDate, datesDataDto.nextCivilLiabilityInsuranceDate) && fr.t.c(this.registrationDocumentDateOfIssue, datesDataDto.registrationDocumentDateOfIssue) && fr.t.c(this.vehicleTechnicalInspectionEndDate, datesDataDto.vehicleTechnicalInspectionEndDate);
    }

    public int hashCode() {
        LocalDate localDate = this.nextCivilLiabilityInsuranceDate;
        int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
        LocalDate localDate2 = this.registrationDocumentDateOfIssue;
        int iHashCode2 = (iHashCode + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
        LocalDate localDate3 = this.vehicleTechnicalInspectionEndDate;
        return iHashCode2 + (localDate3 != null ? localDate3.hashCode() : 0);
    }

    public String toString() {
        return "DatesDataDto(nextCivilLiabilityInsuranceDate=" + this.nextCivilLiabilityInsuranceDate + ", registrationDocumentDateOfIssue=" + this.registrationDocumentDateOfIssue + ", vehicleTechnicalInspectionEndDate=" + this.vehicleTechnicalInspectionEndDate + ')';
    }

    public DatesDataDto(LocalDate localDate, LocalDate localDate2, LocalDate localDate3) {
        this.nextCivilLiabilityInsuranceDate = localDate;
        this.registrationDocumentDateOfIssue = localDate2;
        this.vehicleTechnicalInspectionEndDate = localDate3;
    }

    public /* synthetic */ DatesDataDto(LocalDate localDate, LocalDate localDate2, LocalDate localDate3, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : localDate, (i15 & 2) != 0 ? null : localDate2, (i15 & 4) != 0 ? null : localDate3);
    }
}
