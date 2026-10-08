package gm0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: gm0.x5, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lgm0/x5;", "", "Lgm0/w5;", "status", "<init>", "(Lgm0/w5;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgm0/w5;", "()Lgm0/w5;", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PhysicalIdCardApplicationStatusResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("status")
    private final w5 status;

    /* JADX WARN: Multi-variable type inference failed */
    public PhysicalIdCardApplicationStatusResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final w5 getStatus() {
        return this.status;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PhysicalIdCardApplicationStatusResponse) && this.status == ((PhysicalIdCardApplicationStatusResponse) other).status;
    }

    public int hashCode() {
        w5 w5Var = this.status;
        if (w5Var == null) {
            return 0;
        }
        return w5Var.hashCode();
    }

    public String toString() {
        return "PhysicalIdCardApplicationStatusResponse(status=" + this.status + ')';
    }

    public PhysicalIdCardApplicationStatusResponse(w5 w5Var) {
        this.status = w5Var;
    }

    public /* synthetic */ PhysicalIdCardApplicationStatusResponse(w5 w5Var, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : w5Var);
    }
}
