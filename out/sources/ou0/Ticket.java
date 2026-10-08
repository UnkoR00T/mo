package ou0;

import fr.t;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ou0.b, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b \u0010'\u001a\u0004\b\u001a\u0010(R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b%\u0010'\u001a\u0004\b\u001d\u0010(R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\u001f\u0010+R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b,\u0010*\u001a\u0004\b-\u0010+¨\u0006."}, d2 = {"Lou0/b;", "", "", "ticketId", "issuer", "numberAndSeries", "Ljava/time/OffsetDateTime;", "issueDate", "Lou0/c;", "ticketType", "Ljava/math/BigDecimal;", "amount", "amountToPay", "", "inExecution", "canBePaid", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/time/OffsetDateTime;Lou0/c;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getTicketId", "b", "e", "c", "f", "d", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "Lou0/c;", "g", "()Lou0/c;", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "h", "Z", "()Z", "i", "getCanBePaid", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Ticket {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String ticketId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String issuer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String numberAndSeries;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime issueDate;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final c ticketType;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final BigDecimal amount;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final BigDecimal amountToPay;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean inExecution;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean canBePaid;

    public Ticket(String str, String str2, String str3, OffsetDateTime offsetDateTime, c cVar, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z15, boolean z16) {
        this.ticketId = str;
        this.issuer = str2;
        this.numberAndSeries = str3;
        this.issueDate = offsetDateTime;
        this.ticketType = cVar;
        this.amount = bigDecimal;
        this.amountToPay = bigDecimal2;
        this.inExecution = z15;
        this.canBePaid = z16;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final BigDecimal getAmountToPay() {
        return this.amountToPay;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getInExecution() {
        return this.inExecution;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final OffsetDateTime getIssueDate() {
        return this.issueDate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getIssuer() {
        return this.issuer;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Ticket)) {
            return false;
        }
        Ticket ticket = (Ticket) other;
        return t.c(this.ticketId, ticket.ticketId) && t.c(this.issuer, ticket.issuer) && t.c(this.numberAndSeries, ticket.numberAndSeries) && t.c(this.issueDate, ticket.issueDate) && this.ticketType == ticket.ticketType && t.c(this.amount, ticket.amount) && t.c(this.amountToPay, ticket.amountToPay) && this.inExecution == ticket.inExecution && this.canBePaid == ticket.canBePaid;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getNumberAndSeries() {
        return this.numberAndSeries;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final c getTicketType() {
        return this.ticketType;
    }

    public int hashCode() {
        int iHashCode = this.ticketId.hashCode() * 31;
        String str = this.issuer;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.numberAndSeries;
        return ((((((((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.issueDate.hashCode()) * 31) + this.ticketType.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.amountToPay.hashCode()) * 31) + Boolean.hashCode(this.inExecution)) * 31) + Boolean.hashCode(this.canBePaid);
    }

    public String toString() {
        return "Ticket(ticketId=" + this.ticketId + ", issuer=" + this.issuer + ", numberAndSeries=" + this.numberAndSeries + ", issueDate=" + this.issueDate + ", ticketType=" + this.ticketType + ", amount=" + this.amount + ", amountToPay=" + this.amountToPay + ", inExecution=" + this.inExecution + ", canBePaid=" + this.canBePaid + ")";
    }
}
