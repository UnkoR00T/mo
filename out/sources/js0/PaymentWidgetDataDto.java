package js0;

import java.time.LocalDate;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: js0.j0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0004R\u001a\u0010\u0018\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010!\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b\u001a\u0010 ¨\u0006\""}, d2 = {"Ljs0/j0;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/time/LocalDate;", "a", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "nextPaymentDate", "b", "Ljava/lang/String;", "nextPaymentDescription", "Ljs0/g0;", "c", "Ljs0/g0;", "()Ljs0/g0;", "nextPaymentStatus", "Ljs0/a0;", "d", "Ljs0/a0;", "e", "()Ljs0/a0;", "paymentCounterType", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "paymentCounter", "paymentservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PaymentWidgetDataDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("nextPaymentDate")
    private final LocalDate nextPaymentDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("nextPaymentDescription")
    private final String nextPaymentDescription;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("nextPaymentStatus")
    private final g0 nextPaymentStatus;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("paymentCounterType")
    private final a0 paymentCounterType;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("paymentCounter")
    private final Integer paymentCounter;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final LocalDate getNextPaymentDate() {
        return this.nextPaymentDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getNextPaymentDescription() {
        return this.nextPaymentDescription;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final g0 getNextPaymentStatus() {
        return this.nextPaymentStatus;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getPaymentCounter() {
        return this.paymentCounter;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final a0 getPaymentCounterType() {
        return this.paymentCounterType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentWidgetDataDto)) {
            return false;
        }
        PaymentWidgetDataDto paymentWidgetDataDto = (PaymentWidgetDataDto) other;
        return fr.t.c(this.nextPaymentDate, paymentWidgetDataDto.nextPaymentDate) && fr.t.c(this.nextPaymentDescription, paymentWidgetDataDto.nextPaymentDescription) && this.nextPaymentStatus == paymentWidgetDataDto.nextPaymentStatus && this.paymentCounterType == paymentWidgetDataDto.paymentCounterType && fr.t.c(this.paymentCounter, paymentWidgetDataDto.paymentCounter);
    }

    public int hashCode() {
        int iHashCode = ((((((this.nextPaymentDate.hashCode() * 31) + this.nextPaymentDescription.hashCode()) * 31) + this.nextPaymentStatus.hashCode()) * 31) + this.paymentCounterType.hashCode()) * 31;
        Integer num = this.paymentCounter;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "PaymentWidgetDataDto(nextPaymentDate=" + this.nextPaymentDate + ", nextPaymentDescription=" + this.nextPaymentDescription + ", nextPaymentStatus=" + this.nextPaymentStatus + ", paymentCounterType=" + this.paymentCounterType + ", paymentCounter=" + this.paymentCounter + ')';
    }
}
