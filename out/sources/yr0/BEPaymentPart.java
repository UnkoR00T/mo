package yr0;

import fr.t;
import java.math.BigDecimal;
import java.time.LocalDate;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: yr0.k, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u001e\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u0012R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\"\u0010\u0014R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b&\u0010%\u001a\u0004\b$\u0010\u0014R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b&\u0010\u0012R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b(\u0010\u001d\u001a\u0004\b'\u0010\u0012¨\u0006)"}, d2 = {"Lyr0/k;", "", "Ljava/math/BigDecimal;", "amount", "", "currency", "description", "Ljava/time/LocalDate;", "dueDate", "externalId", "", "numberOfParts", "partNumber", "paymentId", "reminderPaymentId", "<init>", "(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/time/LocalDate;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "b", "Ljava/lang/String;", "c", "d", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "e", "getExternalId", "f", "I", "g", "h", "i", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEPaymentPart {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final BigDecimal amount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String currency;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate dueDate;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String externalId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final int numberOfParts;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final int partNumber;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String paymentId;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String reminderPaymentId;

    public BEPaymentPart(BigDecimal bigDecimal, String str, String str2, LocalDate localDate, String str3, int i15, int i16, String str4, String str5) {
        this.amount = bigDecimal;
        this.currency = str;
        this.description = str2;
        this.dueDate = localDate;
        this.externalId = str3;
        this.numberOfParts = i15;
        this.partNumber = i16;
        this.paymentId = str4;
        this.reminderPaymentId = str5;
    }

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
    public final int getNumberOfParts() {
        return this.numberOfParts;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEPaymentPart)) {
            return false;
        }
        BEPaymentPart bEPaymentPart = (BEPaymentPart) other;
        return t.c(this.amount, bEPaymentPart.amount) && t.c(this.currency, bEPaymentPart.currency) && t.c(this.description, bEPaymentPart.description) && t.c(this.dueDate, bEPaymentPart.dueDate) && t.c(this.externalId, bEPaymentPart.externalId) && this.numberOfParts == bEPaymentPart.numberOfParts && this.partNumber == bEPaymentPart.partNumber && t.c(this.paymentId, bEPaymentPart.paymentId) && t.c(this.reminderPaymentId, bEPaymentPart.reminderPaymentId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getPartNumber() {
        return this.partNumber;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getPaymentId() {
        return this.paymentId;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getReminderPaymentId() {
        return this.reminderPaymentId;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((this.amount.hashCode() * 31) + this.currency.hashCode()) * 31) + this.description.hashCode()) * 31) + this.dueDate.hashCode()) * 31) + this.externalId.hashCode()) * 31) + Integer.hashCode(this.numberOfParts)) * 31) + Integer.hashCode(this.partNumber)) * 31) + this.paymentId.hashCode()) * 31;
        String str = this.reminderPaymentId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "BEPaymentPart(amount=" + this.amount + ", currency=" + this.currency + ", description=" + this.description + ", dueDate=" + this.dueDate + ", externalId=" + this.externalId + ", numberOfParts=" + this.numberOfParts + ", partNumber=" + this.partNumber + ", paymentId=" + this.paymentId + ", reminderPaymentId=" + this.reminderPaymentId + ")";
    }
}
