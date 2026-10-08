package c02;

import fr.t;
import p071kotlin.Metadata;
import un0.AvailableElectionSupport;

/* JADX INFO: renamed from: c02.d, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lc02/d;", "", "Lun0/a;", "availableElectionSupport", "Lun0/n;", "trustedProfileStatus", "<init>", "(Lun0/a;Lun0/n;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lun0/a;", "()Lun0/a;", "b", "Lun0/n;", "()Lun0/n;", "electoralsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SetupData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AvailableElectionSupport availableElectionSupport;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final un0.n trustedProfileStatus;

    public SetupData(AvailableElectionSupport availableElectionSupport, un0.n nVar) {
        this.availableElectionSupport = availableElectionSupport;
        this.trustedProfileStatus = nVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AvailableElectionSupport getAvailableElectionSupport() {
        return this.availableElectionSupport;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final un0.n getTrustedProfileStatus() {
        return this.trustedProfileStatus;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetupData)) {
            return false;
        }
        SetupData setupData = (SetupData) other;
        return t.c(this.availableElectionSupport, setupData.availableElectionSupport) && this.trustedProfileStatus == setupData.trustedProfileStatus;
    }

    public int hashCode() {
        return (this.availableElectionSupport.hashCode() * 31) + this.trustedProfileStatus.hashCode();
    }

    public String toString() {
        return "SetupData(availableElectionSupport=" + this.availableElectionSupport + ", trustedProfileStatus=" + this.trustedProfileStatus + ')';
    }
}
