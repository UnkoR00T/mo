package rn0;

import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: rn0.z, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0018\u001a\u0004\b\u0015\u0010\u0019¨\u0006\u001a"}, d2 = {"Lrn0/z;", "", "", "grade", "Ljava/time/OffsetDateTime;", "createdAt", "", "descriptive", "<init>", "(Ljava/lang/String;Ljava/time/OffsetDateTime;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "Z", "()Z", "educationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEPreviousGrade {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String grade;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime createdAt;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean descriptive;

    public BEPreviousGrade(String str, OffsetDateTime offsetDateTime, boolean z15) {
        this.grade = str;
        this.createdAt = offsetDateTime;
        this.descriptive = z15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getDescriptive() {
        return this.descriptive;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getGrade() {
        return this.grade;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEPreviousGrade)) {
            return false;
        }
        BEPreviousGrade bEPreviousGrade = (BEPreviousGrade) other;
        return fr.t.c(this.grade, bEPreviousGrade.grade) && fr.t.c(this.createdAt, bEPreviousGrade.createdAt) && this.descriptive == bEPreviousGrade.descriptive;
    }

    public int hashCode() {
        return (((this.grade.hashCode() * 31) + this.createdAt.hashCode()) * 31) + Boolean.hashCode(this.descriptive);
    }

    public String toString() {
        return "BEPreviousGrade(grade=" + this.grade + ", createdAt=" + this.createdAt + ", descriptive=" + this.descriptive + ')';
    }
}
