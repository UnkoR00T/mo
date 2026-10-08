package jy3;

import p071kotlin.Metadata;
import qx3.MakePaymentInitialData;

/* JADX INFO: renamed from: jy3.i, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0014\u0010 ¨\u0006!"}, d2 = {"Ljy3/i;", "", "Lqx3/d;", "makePaymentInitialData", "", "isGooglePayRemoteFlagActive", "isGooglePayReady", "Lhb4/c;", "errorVMS", "<init>", "(Lqx3/d;ZZLhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lqx3/d;", "W", "()Lqx3/d;", "b", "Z", "Y", "()Z", "c", "X", "d", "Lhb4/c;", "()Lhb4/c;", "makepayment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Error implements e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final MakePaymentInitialData makePaymentInitialData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isGooglePayRemoteFlagActive;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isGooglePayReady;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final hb4.c errorVMS;

    public Error(MakePaymentInitialData makePaymentInitialData, boolean z15, boolean z16, hb4.c cVar) {
        this.makePaymentInitialData = makePaymentInitialData;
        this.isGooglePayRemoteFlagActive = z15;
        this.isGooglePayReady = z16;
        this.errorVMS = cVar;
    }

    @Override // jy3.e.a
    /* JADX INFO: renamed from: W, reason: from getter */
    public MakePaymentInitialData getMakePaymentInitialData() {
        return this.makePaymentInitialData;
    }

    @Override // jy3.e.a
    /* JADX INFO: renamed from: X, reason: from getter */
    public boolean getIsGooglePayReady() {
        return this.isGooglePayReady;
    }

    @Override // jy3.e.a
    /* JADX INFO: renamed from: Y, reason: from getter */
    public boolean getIsGooglePayRemoteFlagActive() {
        return this.isGooglePayRemoteFlagActive;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final hb4.c getErrorVMS() {
        return this.errorVMS;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Error)) {
            return false;
        }
        Error error = (Error) other;
        return fr.t.c(this.makePaymentInitialData, error.makePaymentInitialData) && this.isGooglePayRemoteFlagActive == error.isGooglePayRemoteFlagActive && this.isGooglePayReady == error.isGooglePayReady && fr.t.c(this.errorVMS, error.errorVMS);
    }

    public int hashCode() {
        return (((((this.makePaymentInitialData.hashCode() * 31) + Boolean.hashCode(this.isGooglePayRemoteFlagActive)) * 31) + Boolean.hashCode(this.isGooglePayReady)) * 31) + this.errorVMS.hashCode();
    }

    public String toString() {
        return "Error(makePaymentInitialData=" + this.makePaymentInitialData + ", isGooglePayRemoteFlagActive=" + this.isGooglePayRemoteFlagActive + ", isGooglePayReady=" + this.isGooglePayReady + ", errorVMS=" + this.errorVMS + ')';
    }
}
