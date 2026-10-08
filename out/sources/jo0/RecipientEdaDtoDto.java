package jo0;

import java.time.LocalDate;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: jo0.n1, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\f\u0010\u0016R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u0010\u0010\u001aR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\r\u001a\u0004\b\u001d\u0010\u0004R\u001c\u0010#\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"¨\u0006$"}, d2 = {"Ljo0/n1;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "recipientEda", "b", "e", "serviceCategoryDescription", "Ljo0/o;", "c", "Ljo0/o;", "()Ljo0/o;", "additionalServiceOw", "Ljava/time/LocalDate;", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "dateOfEnteringToBAE", "dateOfRemovalFromBAE", "f", "warningMessage", "Ljo0/b2;", "g", "Ljo0/b2;", "()Ljo0/b2;", "warningType", "electronicdeliveryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RecipientEdaDtoDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("recipientEda")
    private final String recipientEda;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("serviceCategoryDescription")
    private final String serviceCategoryDescription;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("additionalServiceOw")
    private final BaeSearchAdditionalServiceOwDtoDto additionalServiceOw;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("dateOfEnteringToBAE")
    private final LocalDate dateOfEnteringToBAE;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("dateOfRemovalFromBAE")
    private final LocalDate dateOfRemovalFromBAE;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("warningMessage")
    private final String warningMessage;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("warningType")
    private final b2 warningType;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BaeSearchAdditionalServiceOwDtoDto getAdditionalServiceOw() {
        return this.additionalServiceOw;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final LocalDate getDateOfEnteringToBAE() {
        return this.dateOfEnteringToBAE;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final LocalDate getDateOfRemovalFromBAE() {
        return this.dateOfRemovalFromBAE;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getRecipientEda() {
        return this.recipientEda;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getServiceCategoryDescription() {
        return this.serviceCategoryDescription;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecipientEdaDtoDto)) {
            return false;
        }
        RecipientEdaDtoDto recipientEdaDtoDto = (RecipientEdaDtoDto) other;
        return fr.t.c(this.recipientEda, recipientEdaDtoDto.recipientEda) && fr.t.c(this.serviceCategoryDescription, recipientEdaDtoDto.serviceCategoryDescription) && fr.t.c(this.additionalServiceOw, recipientEdaDtoDto.additionalServiceOw) && fr.t.c(this.dateOfEnteringToBAE, recipientEdaDtoDto.dateOfEnteringToBAE) && fr.t.c(this.dateOfRemovalFromBAE, recipientEdaDtoDto.dateOfRemovalFromBAE) && fr.t.c(this.warningMessage, recipientEdaDtoDto.warningMessage) && this.warningType == recipientEdaDtoDto.warningType;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getWarningMessage() {
        return this.warningMessage;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final b2 getWarningType() {
        return this.warningType;
    }

    public int hashCode() {
        int iHashCode = ((this.recipientEda.hashCode() * 31) + this.serviceCategoryDescription.hashCode()) * 31;
        BaeSearchAdditionalServiceOwDtoDto baeSearchAdditionalServiceOwDtoDto = this.additionalServiceOw;
        int iHashCode2 = (iHashCode + (baeSearchAdditionalServiceOwDtoDto == null ? 0 : baeSearchAdditionalServiceOwDtoDto.hashCode())) * 31;
        LocalDate localDate = this.dateOfEnteringToBAE;
        int iHashCode3 = (iHashCode2 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.dateOfRemovalFromBAE;
        int iHashCode4 = (iHashCode3 + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
        String str = this.warningMessage;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        b2 b2Var = this.warningType;
        return iHashCode5 + (b2Var != null ? b2Var.hashCode() : 0);
    }

    public String toString() {
        return "RecipientEdaDtoDto(recipientEda=" + this.recipientEda + ", serviceCategoryDescription=" + this.serviceCategoryDescription + ", additionalServiceOw=" + this.additionalServiceOw + ", dateOfEnteringToBAE=" + this.dateOfEnteringToBAE + ", dateOfRemovalFromBAE=" + this.dateOfRemovalFromBAE + ", warningMessage=" + this.warningMessage + ", warningType=" + this.warningType + ')';
    }
}
