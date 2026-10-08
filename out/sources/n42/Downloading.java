package n42;

import p071kotlin.Metadata;
import yr0.BEPaymentDetails;

/* JADX INFO: renamed from: n42.g, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\b\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u0019¨\u0006\u001f"}, d2 = {"Ln42/g;", "", "Lyr0/e;", "item", "", "paymentProcessSucceed", "", "paymentId", "refreshScreen", "<init>", "(Lyr0/e;ZLjava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lyr0/e;", "getItem", "()Lyr0/e;", "b", "Z", "()Z", "c", "Ljava/lang/String;", "e", "d", "f", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Downloading implements q.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEPaymentDetails item;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean paymentProcessSucceed;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String paymentId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean refreshScreen;

    public Downloading(BEPaymentDetails bEPaymentDetails, boolean z15, String str, boolean z16) {
        this.item = bEPaymentDetails;
        this.paymentProcessSucceed = z15;
        this.paymentId = str;
        this.refreshScreen = z16;
    }

    @Override // n42.q.a
    /* JADX INFO: renamed from: a, reason: from getter */
    public boolean getPaymentProcessSucceed() {
        return this.paymentProcessSucceed;
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
        if (!(other instanceof Downloading)) {
            return false;
        }
        Downloading downloading = (Downloading) other;
        return fr.t.c(this.item, downloading.item) && this.paymentProcessSucceed == downloading.paymentProcessSucceed && fr.t.c(this.paymentId, downloading.paymentId) && this.refreshScreen == downloading.refreshScreen;
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
        return (((((this.item.hashCode() * 31) + Boolean.hashCode(this.paymentProcessSucceed)) * 31) + this.paymentId.hashCode()) * 31) + Boolean.hashCode(this.refreshScreen);
    }

    public String toString() {
        return "Downloading(item=" + this.item + ", paymentProcessSucceed=" + this.paymentProcessSucceed + ", paymentId=" + this.paymentId + ", refreshScreen=" + this.refreshScreen + ')';
    }
}
