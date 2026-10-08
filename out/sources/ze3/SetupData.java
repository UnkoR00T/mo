package ze3;

import p071kotlin.Metadata;
import sv0.ProcessId;
import sv0.s0;

/* JADX INFO: renamed from: ze3.b, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, d2 = {"Lze3/b;", "", "Lsv0/y;", "processId", "", "shouldRefreshSavedStatementData", "Lsv0/s0;", "status", "<init>", "(Lsv0/y;ZLsv0/s0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lsv0/y;", "()Lsv0/y;", "b", "Z", "()Z", "c", "Lsv0/s0;", "()Lsv0/s0;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SetupData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProcessId processId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean shouldRefreshSavedStatementData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final s0 status;

    public SetupData(ProcessId processId, boolean z15, s0 s0Var) {
        this.processId = processId;
        this.shouldRefreshSavedStatementData = z15;
        this.status = s0Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ProcessId getProcessId() {
        return this.processId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getShouldRefreshSavedStatementData() {
        return this.shouldRefreshSavedStatementData;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final s0 getStatus() {
        return this.status;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetupData)) {
            return false;
        }
        SetupData setupData = (SetupData) other;
        return fr.t.c(this.processId, setupData.processId) && this.shouldRefreshSavedStatementData == setupData.shouldRefreshSavedStatementData && this.status == setupData.status;
    }

    public int hashCode() {
        return (((this.processId.hashCode() * 31) + Boolean.hashCode(this.shouldRefreshSavedStatementData)) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "SetupData(processId=" + this.processId + ", shouldRefreshSavedStatementData=" + this.shouldRefreshSavedStatementData + ", status=" + this.status + ')';
    }
}
