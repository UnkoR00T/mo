package n42;

import p071kotlin.Metadata;
import yr0.BEPaymentDetails;

/* JADX INFO: renamed from: n42.o, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\r\u0010\u0014R\u001a\u0010\u0019\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0004R\u001a\u0010\u001c\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0014R\u0017\u0010 \u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u0012\u0010\u001f¨\u0006!"}, d2 = {"Ln42/o;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lyr0/e;", "a", "Lyr0/e;", "getItem", "()Lyr0/e;", "item", "b", "Z", "()Z", "paymentProcessSucceed", "c", "Ljava/lang/String;", "e", "paymentId", "d", "f", "refreshScreen", "Lhb4/c;", "Lhb4/c;", "()Lhb4/c;", "errorVMS", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Error implements q.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEPaymentDetails item;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean paymentProcessSucceed;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String paymentId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean refreshScreen;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final hb4.c errorVMS;

    @Override // n42.q.a
    /* JADX INFO: renamed from: a, reason: from getter */
    public boolean getPaymentProcessSucceed() {
        return this.paymentProcessSucceed;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final hb4.c getErrorVMS() {
        return this.errorVMS;
    }

    @Override // n42.q
    /* JADX INFO: renamed from: e, reason: from getter */
    public String getPaymentId() {
        return this.paymentId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Error)) {
            return false;
        }
        Error error = (Error) other;
        return fr.t.c(this.item, error.item) && this.paymentProcessSucceed == error.paymentProcessSucceed && fr.t.c(this.paymentId, error.paymentId) && this.refreshScreen == error.refreshScreen && fr.t.c(this.errorVMS, error.errorVMS);
    }

    @Override // n42.q
    /* JADX INFO: renamed from: f, reason: from getter */
    public boolean getRefreshScreen() {
        return this.refreshScreen;
    }

    @Override // n42.q.a
    public BEPaymentDetails getItem() {
        return this.item;
    }

    public int hashCode() {
        return (((((((this.item.hashCode() * 31) + Boolean.hashCode(this.paymentProcessSucceed)) * 31) + this.paymentId.hashCode()) * 31) + Boolean.hashCode(this.refreshScreen)) * 31) + this.errorVMS.hashCode();
    }

    public String toString() {
        return "Error(item=" + this.item + ", paymentProcessSucceed=" + this.paymentProcessSucceed + ", paymentId=" + this.paymentId + ", refreshScreen=" + this.refreshScreen + ", errorVMS=" + this.errorVMS + ')';
    }
}
