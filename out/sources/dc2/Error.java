package dc2;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: dc2.e, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, d2 = {"Ldc2/e;", "Ldc2/d$a;", "Lhb4/c;", "vmsAdapter", "", "isTheftEnabled", "Lhl0/c;", "selectedReason", "<init>", "(Lhb4/c;ZLhl0/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "b", "Z", "()Z", "c", "Lhl0/c;", "()Lhl0/c;", "identitycardinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Error implements d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final hb4.c vmsAdapter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isTheftEnabled;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final hl0.c selectedReason;

    public Error(hb4.c cVar, boolean z15, hl0.c cVar2) {
        this.vmsAdapter = cVar;
        this.isTheftEnabled = z15;
        this.selectedReason = cVar2;
    }

    @Override // dc2.d.a
    /* JADX INFO: renamed from: a, reason: from getter */
    public hb4.c getVmsAdapter() {
        return this.vmsAdapter;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsTheftEnabled() {
        return this.isTheftEnabled;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final hl0.c getSelectedReason() {
        return this.selectedReason;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Error)) {
            return false;
        }
        Error error = (Error) other;
        return fr.t.c(this.vmsAdapter, error.vmsAdapter) && this.isTheftEnabled == error.isTheftEnabled && this.selectedReason == error.selectedReason;
    }

    public int hashCode() {
        return (((this.vmsAdapter.hashCode() * 31) + Boolean.hashCode(this.isTheftEnabled)) * 31) + this.selectedReason.hashCode();
    }

    public String toString() {
        return "Error(vmsAdapter=" + this.vmsAdapter + ", isTheftEnabled=" + this.isTheftEnabled + ", selectedReason=" + this.selectedReason + ')';
    }
}
