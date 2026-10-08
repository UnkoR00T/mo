package ky3;

import by3.BlikRequiredData;
import p071kotlin.Metadata;
import ur0.BEAlias;

/* JADX INFO: renamed from: ky3.f, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0017\u0010\u001c¨\u0006\u001d"}, d2 = {"Lky3/f;", "", "Lby3/b;", "paymentData", "Lur0/a;", "selectedAlias", "Lhb4/c;", "errorVMS", "<init>", "(Lby3/b;Lur0/a;Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lby3/b;", "()Lby3/b;", "b", "Lur0/a;", "c", "()Lur0/a;", "Lhb4/c;", "()Lhb4/c;", "makepayment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Error implements e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final BlikRequiredData paymentData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEAlias selectedAlias;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final hb4.c errorVMS;

    public Error(BlikRequiredData blikRequiredData, BEAlias bEAlias, hb4.c cVar) {
        this.paymentData = blikRequiredData;
        this.selectedAlias = bEAlias;
        this.errorVMS = cVar;
    }

    @Override // ky3.e.a
    /* JADX INFO: renamed from: a, reason: from getter */
    public BlikRequiredData getPaymentData() {
        return this.paymentData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final hb4.c getErrorVMS() {
        return this.errorVMS;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public BEAlias getSelectedAlias() {
        return this.selectedAlias;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Error)) {
            return false;
        }
        Error error = (Error) other;
        return fr.t.c(this.paymentData, error.paymentData) && fr.t.c(this.selectedAlias, error.selectedAlias) && fr.t.c(this.errorVMS, error.errorVMS);
    }

    public int hashCode() {
        return (((this.paymentData.hashCode() * 31) + this.selectedAlias.hashCode()) * 31) + this.errorVMS.hashCode();
    }

    public String toString() {
        return "Error(paymentData=" + this.paymentData + ", selectedAlias=" + this.selectedAlias + ", errorVMS=" + this.errorVMS + ')';
    }
}
