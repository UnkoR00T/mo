package zx3;

import by3.BlikRequiredData;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: zx3.i, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lzx3/i;", "", "Lby3/b;", "paymentData", "", "transactionId", "Lnx/c;", "viewVisibility", "<init>", "(Lby3/b;Ljava/lang/String;Lnx/c;)V", "b", "(Lby3/b;Ljava/lang/String;Lnx/c;)Lzx3/i;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lby3/b;", "()Lby3/b;", "Ljava/lang/String;", "d", "c", "Lnx/c;", "e", "()Lnx/c;", "makepayment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class View implements e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final BlikRequiredData paymentData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String transactionId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final nx.c viewVisibility;

    public View(BlikRequiredData blikRequiredData, String str, nx.c cVar) {
        this.paymentData = blikRequiredData;
        this.transactionId = str;
        this.viewVisibility = cVar;
    }

    public static /* synthetic */ View c(View view, BlikRequiredData blikRequiredData, String str, nx.c cVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            blikRequiredData = view.paymentData;
        }
        if ((i15 & 2) != 0) {
            str = view.transactionId;
        }
        if ((i15 & 4) != 0) {
            cVar = view.viewVisibility;
        }
        return view.b(blikRequiredData, str, cVar);
    }

    @Override // zx3.e.a
    /* JADX INFO: renamed from: a, reason: from getter */
    public BlikRequiredData getPaymentData() {
        return this.paymentData;
    }

    public final View b(BlikRequiredData paymentData, String transactionId, nx.c viewVisibility) {
        return new View(paymentData, transactionId, viewVisibility);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public String getTransactionId() {
        return this.transactionId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final nx.c getViewVisibility() {
        return this.viewVisibility;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof View)) {
            return false;
        }
        View view = (View) other;
        return fr.t.c(this.paymentData, view.paymentData) && fr.t.c(this.transactionId, view.transactionId) && this.viewVisibility == view.viewVisibility;
    }

    public int hashCode() {
        return (((this.paymentData.hashCode() * 31) + this.transactionId.hashCode()) * 31) + this.viewVisibility.hashCode();
    }

    public String toString() {
        return "View(paymentData=" + this.paymentData + ", transactionId=" + this.transactionId + ", viewVisibility=" + this.viewVisibility + ')';
    }
}
