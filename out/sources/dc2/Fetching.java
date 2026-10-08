package dc2;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: dc2.f, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Ldc2/f;", "Ldc2/d$d;", "", "isTheftEnabled", "Lhl0/c;", "selectedReason", "<init>", "(ZLhl0/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "Lhl0/c;", "c", "()Lhl0/c;", "identitycardinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Fetching implements d.InterfaceC0902d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isTheftEnabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final hl0.c selectedReason;

    public Fetching(boolean z15, hl0.c cVar) {
        this.isTheftEnabled = z15;
        this.selectedReason = cVar;
    }

    @Override // dc2.d.InterfaceC0902d
    /* JADX INFO: renamed from: b, reason: from getter */
    public boolean getIsTheftEnabled() {
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
        if (!(other instanceof Fetching)) {
            return false;
        }
        Fetching fetching = (Fetching) other;
        return this.isTheftEnabled == fetching.isTheftEnabled && this.selectedReason == fetching.selectedReason;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.isTheftEnabled) * 31) + this.selectedReason.hashCode();
    }

    public String toString() {
        return "Fetching(isTheftEnabled=" + this.isTheftEnabled + ", selectedReason=" + this.selectedReason + ')';
    }
}
