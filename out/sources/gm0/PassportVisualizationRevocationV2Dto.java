package gm0;

import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: gm0.o5, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lgm0/o5;", "", "Ljava/time/OffsetDateTime;", "revocationDate", "Lgm0/k5;", "revocationReason", "<init>", "(Ljava/time/OffsetDateTime;Lgm0/k5;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "b", "Lgm0/k5;", "()Lgm0/k5;", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PassportVisualizationRevocationV2Dto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("revocationDate")
    private final OffsetDateTime revocationDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("revocationReason")
    private final k5 revocationReason;

    /* JADX WARN: Multi-variable type inference failed */
    public PassportVisualizationRevocationV2Dto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final OffsetDateTime getRevocationDate() {
        return this.revocationDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final k5 getRevocationReason() {
        return this.revocationReason;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassportVisualizationRevocationV2Dto)) {
            return false;
        }
        PassportVisualizationRevocationV2Dto passportVisualizationRevocationV2Dto = (PassportVisualizationRevocationV2Dto) other;
        return fr.t.c(this.revocationDate, passportVisualizationRevocationV2Dto.revocationDate) && this.revocationReason == passportVisualizationRevocationV2Dto.revocationReason;
    }

    public int hashCode() {
        OffsetDateTime offsetDateTime = this.revocationDate;
        int iHashCode = (offsetDateTime == null ? 0 : offsetDateTime.hashCode()) * 31;
        k5 k5Var = this.revocationReason;
        return iHashCode + (k5Var != null ? k5Var.hashCode() : 0);
    }

    public String toString() {
        return "PassportVisualizationRevocationV2Dto(revocationDate=" + this.revocationDate + ", revocationReason=" + this.revocationReason + ')';
    }

    public PassportVisualizationRevocationV2Dto(OffsetDateTime offsetDateTime, k5 k5Var) {
        this.revocationDate = offsetDateTime;
        this.revocationReason = k5Var;
    }

    public /* synthetic */ PassportVisualizationRevocationV2Dto(OffsetDateTime offsetDateTime, k5 k5Var, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : offsetDateTime, (i15 & 2) != 0 ? null : k5Var);
    }
}
