package zr0;

import fr.t;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: zr0.e, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\u0013R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010 \u001a\u0004\b/\u0010\u0013R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b0\u0010 \u001a\u0004\b\u001b\u0010\u0013R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u0010 \u001a\u0004\b2\u0010\u0013R\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b3\u0010 \u001a\u0004\b4\u0010\u0013¨\u00065"}, d2 = {"Lzr0/e;", "", "Ljava/math/BigDecimal;", "amount", "", "commitmentTypeCode", "Ljava/time/OffsetDateTime;", "creationTime", "description", "dueDate", "Lzr0/d;", "institutionAddress", "institutionId", "paymentId", "pesel", "title", "<init>", "(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/time/OffsetDateTime;Ljava/lang/String;Ljava/time/OffsetDateTime;Lzr0/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/math/BigDecimal;", "getAmount", "()Ljava/math/BigDecimal;", "b", "Ljava/lang/String;", "getCommitmentTypeCode", "c", "Ljava/time/OffsetDateTime;", "getCreationTime", "()Ljava/time/OffsetDateTime;", "d", "getDescription", "e", "getDueDate", "f", "Lzr0/d;", "getInstitutionAddress", "()Lzr0/d;", "g", "getInstitutionId", "h", "i", "getPesel", "j", "getTitle", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEStampDuty {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final BigDecimal amount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String commitmentTypeCode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime creationTime;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime dueDate;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEInstitutionAddress institutionAddress;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String institutionId;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String paymentId;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pesel;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    public BEStampDuty(BigDecimal bigDecimal, String str, OffsetDateTime offsetDateTime, String str2, OffsetDateTime offsetDateTime2, BEInstitutionAddress bEInstitutionAddress, String str3, String str4, String str5, String str6) {
        this.amount = bigDecimal;
        this.commitmentTypeCode = str;
        this.creationTime = offsetDateTime;
        this.description = str2;
        this.dueDate = offsetDateTime2;
        this.institutionAddress = bEInstitutionAddress;
        this.institutionId = str3;
        this.paymentId = str4;
        this.pesel = str5;
        this.title = str6;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getPaymentId() {
        return this.paymentId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEStampDuty)) {
            return false;
        }
        BEStampDuty bEStampDuty = (BEStampDuty) other;
        return t.c(this.amount, bEStampDuty.amount) && t.c(this.commitmentTypeCode, bEStampDuty.commitmentTypeCode) && t.c(this.creationTime, bEStampDuty.creationTime) && t.c(this.description, bEStampDuty.description) && t.c(this.dueDate, bEStampDuty.dueDate) && t.c(this.institutionAddress, bEStampDuty.institutionAddress) && t.c(this.institutionId, bEStampDuty.institutionId) && t.c(this.paymentId, bEStampDuty.paymentId) && t.c(this.pesel, bEStampDuty.pesel) && t.c(this.title, bEStampDuty.title);
    }

    public int hashCode() {
        return (((((((((((((((((this.amount.hashCode() * 31) + this.commitmentTypeCode.hashCode()) * 31) + this.creationTime.hashCode()) * 31) + this.description.hashCode()) * 31) + this.dueDate.hashCode()) * 31) + this.institutionAddress.hashCode()) * 31) + this.institutionId.hashCode()) * 31) + this.paymentId.hashCode()) * 31) + this.pesel.hashCode()) * 31) + this.title.hashCode();
    }

    public String toString() {
        return "BEStampDuty(amount=" + this.amount + ", commitmentTypeCode=" + this.commitmentTypeCode + ", creationTime=" + this.creationTime + ", description=" + this.description + ", dueDate=" + this.dueDate + ", institutionAddress=" + this.institutionAddress + ", institutionId=" + this.institutionId + ", paymentId=" + this.paymentId + ", pesel=" + this.pesel + ", title=" + this.title + ")";
    }
}
