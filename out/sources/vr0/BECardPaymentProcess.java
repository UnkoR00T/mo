package vr0;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: vr0.b, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, d2 = {"Lvr0/b;", "", "", "transactionId", "Lvr0/j;", "redirectRequest", "<init>", "(Ljava/lang/String;Lvr0/j;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lvr0/j;", "()Lvr0/j;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BECardPaymentProcess {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String transactionId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final BERedirect redirectRequest;

    public BECardPaymentProcess(String str, BERedirect bERedirect) {
        this.transactionId = str;
        this.redirectRequest = bERedirect;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BERedirect getRedirectRequest() {
        return this.redirectRequest;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BECardPaymentProcess)) {
            return false;
        }
        BECardPaymentProcess bECardPaymentProcess = (BECardPaymentProcess) other;
        return t.c(this.transactionId, bECardPaymentProcess.transactionId) && t.c(this.redirectRequest, bECardPaymentProcess.redirectRequest);
    }

    public int hashCode() {
        return (this.transactionId.hashCode() * 31) + this.redirectRequest.hashCode();
    }

    public String toString() {
        return "BECardPaymentProcess(transactionId=" + this.transactionId + ", redirectRequest=" + this.redirectRequest + ")";
    }
}
