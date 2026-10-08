package js0;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: js0.r0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0004R\u001a\u0010\u0018\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001a\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u0019\u0010\u0004R\u001a\u0010\u001c\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001b\u0010\u0017R\u001a\u0010!\u001a\u00020\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u001a\u0010#\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0012\u001a\u0004\b\"\u0010\u0004R\u001a\u0010%\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0012\u001a\u0004\b$\u0010\u0004R\u001a\u0010'\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u0012\u001a\u0004\b&\u0010\u0004R\u001a\u0010)\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u0012\u001a\u0004\b(\u0010\u0004¨\u0006*"}, d2 = {"Ljs0/r0;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/math/BigDecimal;", "a", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "amount", "b", "Ljava/lang/String;", "commitmentTypeCode", "Ljava/time/OffsetDateTime;", "c", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "creationTime", "d", "description", "e", "dueDate", "Ljs0/w;", "f", "Ljs0/w;", "()Ljs0/w;", "institutionAddressDTO", "g", "institutionId", "h", "paymentId", "i", "pesel", "j", "title", "paymentservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StampDutyDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("amount")
    private final BigDecimal amount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("commitmentTypeCode")
    private final String commitmentTypeCode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("creationTime")
    private final OffsetDateTime creationTime;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("description")
    private final String description;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("dueDate")
    private final OffsetDateTime dueDate;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("institutionAddressDTO")
    private final InstitutionAddressDto institutionAddressDTO;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("institutionId")
    private final String institutionId;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("paymentId")
    private final String paymentId;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("pesel")
    private final String pesel;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("title")
    private final String title;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCommitmentTypeCode() {
        return this.commitmentTypeCode;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final OffsetDateTime getCreationTime() {
        return this.creationTime;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final OffsetDateTime getDueDate() {
        return this.dueDate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StampDutyDto)) {
            return false;
        }
        StampDutyDto stampDutyDto = (StampDutyDto) other;
        return fr.t.c(this.amount, stampDutyDto.amount) && fr.t.c(this.commitmentTypeCode, stampDutyDto.commitmentTypeCode) && fr.t.c(this.creationTime, stampDutyDto.creationTime) && fr.t.c(this.description, stampDutyDto.description) && fr.t.c(this.dueDate, stampDutyDto.dueDate) && fr.t.c(this.institutionAddressDTO, stampDutyDto.institutionAddressDTO) && fr.t.c(this.institutionId, stampDutyDto.institutionId) && fr.t.c(this.paymentId, stampDutyDto.paymentId) && fr.t.c(this.pesel, stampDutyDto.pesel) && fr.t.c(this.title, stampDutyDto.title);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final InstitutionAddressDto getInstitutionAddressDTO() {
        return this.institutionAddressDTO;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getInstitutionId() {
        return this.institutionId;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getPaymentId() {
        return this.paymentId;
    }

    public int hashCode() {
        return (((((((((((((((((this.amount.hashCode() * 31) + this.commitmentTypeCode.hashCode()) * 31) + this.creationTime.hashCode()) * 31) + this.description.hashCode()) * 31) + this.dueDate.hashCode()) * 31) + this.institutionAddressDTO.hashCode()) * 31) + this.institutionId.hashCode()) * 31) + this.paymentId.hashCode()) * 31) + this.pesel.hashCode()) * 31) + this.title.hashCode();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getPesel() {
        return this.pesel;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public String toString() {
        return "StampDutyDto(amount=" + this.amount + ", commitmentTypeCode=" + this.commitmentTypeCode + ", creationTime=" + this.creationTime + ", description=" + this.description + ", dueDate=" + this.dueDate + ", institutionAddressDTO=" + this.institutionAddressDTO + ", institutionId=" + this.institutionId + ", paymentId=" + this.paymentId + ", pesel=" + this.pesel + ", title=" + this.title + ')';
    }
}
