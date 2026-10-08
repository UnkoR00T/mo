package jy3;

import p071kotlin.Metadata;
import qx3.MakePaymentInitialData;

/* JADX INFO: renamed from: jy3.h, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001a¨\u0006\u001d"}, d2 = {"Ljy3/h;", "Ljy3/e$a;", "Lqx3/d;", "makePaymentInitialData", "", "isGooglePayReady", "isGooglePayRemoteFlagActive", "<init>", "(Lqx3/d;ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lqx3/d;", "W", "()Lqx3/d;", "b", "Z", "X", "()Z", "c", "Y", "makepayment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Displayed implements e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final MakePaymentInitialData makePaymentInitialData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isGooglePayReady;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isGooglePayRemoteFlagActive;

    public Displayed(MakePaymentInitialData makePaymentInitialData, boolean z15, boolean z16) {
        this.makePaymentInitialData = makePaymentInitialData;
        this.isGooglePayReady = z15;
        this.isGooglePayRemoteFlagActive = z16;
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

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Displayed)) {
            return false;
        }
        Displayed displayed = (Displayed) other;
        return fr.t.c(this.makePaymentInitialData, displayed.makePaymentInitialData) && this.isGooglePayReady == displayed.isGooglePayReady && this.isGooglePayRemoteFlagActive == displayed.isGooglePayRemoteFlagActive;
    }

    public int hashCode() {
        return (((this.makePaymentInitialData.hashCode() * 31) + Boolean.hashCode(this.isGooglePayReady)) * 31) + Boolean.hashCode(this.isGooglePayRemoteFlagActive);
    }

    public String toString() {
        return "Displayed(makePaymentInitialData=" + this.makePaymentInitialData + ", isGooglePayReady=" + this.isGooglePayReady + ", isGooglePayRemoteFlagActive=" + this.isGooglePayRemoteFlagActive + ')';
    }
}
