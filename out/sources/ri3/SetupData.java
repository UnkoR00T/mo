package ri3;

import p071kotlin.Metadata;
import sv0.AutomaticReportSuccessResponse;
import sv0.ProcessId;
import sv0.s0;

/* JADX INFO: renamed from: ri3.b, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lri3/b;", "", "Lsv0/y;", "processId", "Lsv0/d;", "automaticReportSuccessResponse", "", "providerName", "Lsv0/s0;", "status", "<init>", "(Lsv0/y;Lsv0/d;Ljava/lang/String;Lsv0/s0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsv0/y;", "b", "()Lsv0/y;", "Lsv0/d;", "()Lsv0/d;", "c", "Ljava/lang/String;", "d", "Lsv0/s0;", "getStatus", "()Lsv0/s0;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SetupData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProcessId processId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AutomaticReportSuccessResponse automaticReportSuccessResponse;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String providerName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final s0 status;

    public SetupData(ProcessId processId, AutomaticReportSuccessResponse automaticReportSuccessResponse, String str, s0 s0Var) {
        this.processId = processId;
        this.automaticReportSuccessResponse = automaticReportSuccessResponse;
        this.providerName = str;
        this.status = s0Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AutomaticReportSuccessResponse getAutomaticReportSuccessResponse() {
        return this.automaticReportSuccessResponse;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ProcessId getProcessId() {
        return this.processId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getProviderName() {
        return this.providerName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetupData)) {
            return false;
        }
        SetupData setupData = (SetupData) other;
        return fr.t.c(this.processId, setupData.processId) && fr.t.c(this.automaticReportSuccessResponse, setupData.automaticReportSuccessResponse) && fr.t.c(this.providerName, setupData.providerName) && this.status == setupData.status;
    }

    public int hashCode() {
        return (((((this.processId.hashCode() * 31) + this.automaticReportSuccessResponse.hashCode()) * 31) + this.providerName.hashCode()) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "SetupData(processId=" + this.processId + ", automaticReportSuccessResponse=" + this.automaticReportSuccessResponse + ", providerName=" + this.providerName + ", status=" + this.status + ')';
    }
}
