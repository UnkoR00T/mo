package yr0;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: yr0.o, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0016\u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\"\u001a\u0004\b\u001f\u0010#¨\u0006$"}, d2 = {"Lyr0/o;", "", "Lyr0/d;", "paymentCounterType", "", "nextPaymentDescription", "Lyr0/m;", "nextPaymentStatus", "Lfz/b$c;", "nextPaymentDate", "", "paymentCounter", "<init>", "(Lyr0/d;Ljava/lang/String;Lyr0/m;Lfz/b$c;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lyr0/d;", "e", "()Lyr0/d;", "b", "Ljava/lang/String;", "c", "Lyr0/m;", "()Lyr0/m;", "d", "Lfz/b$c;", "()Lfz/b$c;", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEPaymentWidgetData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final d paymentCounterType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String nextPaymentDescription;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final m nextPaymentStatus;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final fz.b.LocalDate nextPaymentDate;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer paymentCounter;

    public BEPaymentWidgetData(d dVar, String str, m mVar, fz.b.LocalDate localDate, Integer num) {
        this.paymentCounterType = dVar;
        this.nextPaymentDescription = str;
        this.nextPaymentStatus = mVar;
        this.nextPaymentDate = localDate;
        this.paymentCounter = num;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final fz.b.LocalDate getNextPaymentDate() {
        return this.nextPaymentDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getNextPaymentDescription() {
        return this.nextPaymentDescription;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final m getNextPaymentStatus() {
        return this.nextPaymentStatus;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getPaymentCounter() {
        return this.paymentCounter;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final d getPaymentCounterType() {
        return this.paymentCounterType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEPaymentWidgetData)) {
            return false;
        }
        BEPaymentWidgetData bEPaymentWidgetData = (BEPaymentWidgetData) other;
        return this.paymentCounterType == bEPaymentWidgetData.paymentCounterType && t.c(this.nextPaymentDescription, bEPaymentWidgetData.nextPaymentDescription) && this.nextPaymentStatus == bEPaymentWidgetData.nextPaymentStatus && t.c(this.nextPaymentDate, bEPaymentWidgetData.nextPaymentDate) && t.c(this.paymentCounter, bEPaymentWidgetData.paymentCounter);
    }

    public int hashCode() {
        int iHashCode = ((((((this.paymentCounterType.hashCode() * 31) + this.nextPaymentDescription.hashCode()) * 31) + this.nextPaymentStatus.hashCode()) * 31) + this.nextPaymentDate.hashCode()) * 31;
        Integer num = this.paymentCounter;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "BEPaymentWidgetData(paymentCounterType=" + this.paymentCounterType + ", nextPaymentDescription=" + this.nextPaymentDescription + ", nextPaymentStatus=" + this.nextPaymentStatus + ", nextPaymentDate=" + this.nextPaymentDate + ", paymentCounter=" + this.paymentCounter + ")";
    }
}
