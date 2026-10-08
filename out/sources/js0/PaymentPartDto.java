package js0;

import java.math.BigDecimal;
import java.time.LocalDate;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: js0.f0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0004R\u001a\u0010\u001a\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001a\u0010\u001c\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001b\u0010\u0004R\u001a\u0010\u001f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u001e\u0010\u0004R\u001a\u0010\"\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001d\u0010\u0007R\u001a\u0010$\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b \u0010\u0007R\u001a\u0010&\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0012\u001a\u0004\b#\u0010\u0004R\u001c\u0010(\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0012\u001a\u0004\b%\u0010\u0004¨\u0006)"}, d2 = {"Ljs0/f0;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/math/BigDecimal;", "a", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "amount", "b", "Ljava/lang/String;", "currency", "c", "description", "Ljava/time/LocalDate;", "d", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "dueDate", "e", "externalId", "f", "getInstitutionId", "institutionId", "g", "I", "numberOfParts", "h", "partNumber", "i", "paymentId", "j", "reminderPaymentId", "paymentservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PaymentPartDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("amount")
    private final BigDecimal amount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("currency")
    private final String currency;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("description")
    private final String description;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("dueDate")
    private final LocalDate dueDate;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("externalId")
    private final String externalId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("institutionId")
    private final String institutionId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("numberOfParts")
    private final int numberOfParts;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("partNumber")
    private final int partNumber;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("paymentId")
    private final String paymentId;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("reminderPaymentId")
    private final String reminderPaymentId;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final LocalDate getDueDate() {
        return this.dueDate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getExternalId() {
        return this.externalId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentPartDto)) {
            return false;
        }
        PaymentPartDto paymentPartDto = (PaymentPartDto) other;
        return fr.t.c(this.amount, paymentPartDto.amount) && fr.t.c(this.currency, paymentPartDto.currency) && fr.t.c(this.description, paymentPartDto.description) && fr.t.c(this.dueDate, paymentPartDto.dueDate) && fr.t.c(this.externalId, paymentPartDto.externalId) && fr.t.c(this.institutionId, paymentPartDto.institutionId) && this.numberOfParts == paymentPartDto.numberOfParts && this.partNumber == paymentPartDto.partNumber && fr.t.c(this.paymentId, paymentPartDto.paymentId) && fr.t.c(this.reminderPaymentId, paymentPartDto.reminderPaymentId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getNumberOfParts() {
        return this.numberOfParts;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getPartNumber() {
        return this.partNumber;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getPaymentId() {
        return this.paymentId;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((this.amount.hashCode() * 31) + this.currency.hashCode()) * 31) + this.description.hashCode()) * 31) + this.dueDate.hashCode()) * 31) + this.externalId.hashCode()) * 31) + this.institutionId.hashCode()) * 31) + Integer.hashCode(this.numberOfParts)) * 31) + Integer.hashCode(this.partNumber)) * 31) + this.paymentId.hashCode()) * 31;
        String str = this.reminderPaymentId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getReminderPaymentId() {
        return this.reminderPaymentId;
    }

    public String toString() {
        return "PaymentPartDto(amount=" + this.amount + ", currency=" + this.currency + ", description=" + this.description + ", dueDate=" + this.dueDate + ", externalId=" + this.externalId + ", institutionId=" + this.institutionId + ", numberOfParts=" + this.numberOfParts + ", partNumber=" + this.partNumber + ", paymentId=" + this.paymentId + ", reminderPaymentId=" + this.reminderPaymentId + ')';
    }
}
