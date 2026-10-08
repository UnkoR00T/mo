package jt3;

import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: jt3.b0, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0004¨\u0006\u0018"}, d2 = {"Ljt3/b0;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/time/OffsetDateTime;", "a", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "createdAt", "b", "Z", "()Z", "descriptive", "c", "Ljava/lang/String;", "grade", "educationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PreviousGradeEntryDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("createdAt")
    private final OffsetDateTime createdAt;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("descriptive")
    private final boolean descriptive;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("grade")
    private final String grade;

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
        if (!(other instanceof PreviousGradeEntryDto)) {
            return false;
        }
        PreviousGradeEntryDto previousGradeEntryDto = (PreviousGradeEntryDto) other;
        return fr.t.c(this.createdAt, previousGradeEntryDto.createdAt) && this.descriptive == previousGradeEntryDto.descriptive && fr.t.c(this.grade, previousGradeEntryDto.grade);
    }

    public int hashCode() {
        return (((this.createdAt.hashCode() * 31) + Boolean.hashCode(this.descriptive)) * 31) + this.grade.hashCode();
    }

    public String toString() {
        return "PreviousGradeEntryDto(createdAt=" + this.createdAt + ", descriptive=" + this.descriptive + ", grade=" + this.grade + ')';
    }
}
