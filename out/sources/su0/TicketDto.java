package su0;

import fr.t;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: renamed from: su0.a, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\u0015R\u001a\u0010\u001d\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001a\u0010!\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0004R\u001a\u0010'\u001a\u00020\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010(\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b\u001e\u0010\u0004R\u001c\u0010)\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b#\u0010\u0004¨\u0006*"}, d2 = {"Lsu0/a;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/math/BigDecimal;", "a", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "amount", "b", "amountToPay", "c", "Z", "()Z", "canBePaid", "d", "inExecution", "Ljava/time/OffsetDateTime;", "e", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "issueDate", "f", "Ljava/lang/String;", "h", "ticketId", "Lsu0/b;", "g", "Lsu0/b;", "i", "()Lsu0/b;", "ticketType", "issuer", "numberAndSeries", "taxservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TicketDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @c("amount")
    private final BigDecimal amount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @c("amountToPay")
    private final BigDecimal amountToPay;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @c("canBePaid")
    private final boolean canBePaid;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @c("inExecution")
    private final boolean inExecution;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @c("issueDate")
    private final OffsetDateTime issueDate;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @c("ticketId")
    private final String ticketId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @c("ticketType")
    private final b ticketType;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @c("issuer")
    private final String issuer;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    @c("numberAndSeries")
    private final String numberAndSeries;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final BigDecimal getAmountToPay() {
        return this.amountToPay;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getCanBePaid() {
        return this.canBePaid;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getInExecution() {
        return this.inExecution;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final OffsetDateTime getIssueDate() {
        return this.issueDate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TicketDto)) {
            return false;
        }
        TicketDto ticketDto = (TicketDto) other;
        return t.c(this.amount, ticketDto.amount) && t.c(this.amountToPay, ticketDto.amountToPay) && this.canBePaid == ticketDto.canBePaid && this.inExecution == ticketDto.inExecution && t.c(this.issueDate, ticketDto.issueDate) && t.c(this.ticketId, ticketDto.ticketId) && this.ticketType == ticketDto.ticketType && t.c(this.issuer, ticketDto.issuer) && t.c(this.numberAndSeries, ticketDto.numberAndSeries);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getIssuer() {
        return this.issuer;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getNumberAndSeries() {
        return this.numberAndSeries;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getTicketId() {
        return this.ticketId;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.amount.hashCode() * 31) + this.amountToPay.hashCode()) * 31) + Boolean.hashCode(this.canBePaid)) * 31) + Boolean.hashCode(this.inExecution)) * 31) + this.issueDate.hashCode()) * 31) + this.ticketId.hashCode()) * 31) + this.ticketType.hashCode()) * 31;
        String str = this.issuer;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.numberAndSeries;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final b getTicketType() {
        return this.ticketType;
    }

    public String toString() {
        return "TicketDto(amount=" + this.amount + ", amountToPay=" + this.amountToPay + ", canBePaid=" + this.canBePaid + ", inExecution=" + this.inExecution + ", issueDate=" + this.issueDate + ", ticketId=" + this.ticketId + ", ticketType=" + this.ticketType + ", issuer=" + this.issuer + ", numberAndSeries=" + this.numberAndSeries + ')';
    }
}
