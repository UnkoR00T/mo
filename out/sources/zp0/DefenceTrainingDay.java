package zp0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: zp0.w, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lzp0/w;", "", "Lfz/b$f;", "endDate", "startDate", "<init>", "(Lfz/b$f;Lfz/b$f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfz/b$f;", "()Lfz/b$f;", "b", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DefenceTrainingDay {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final fz.b.OffsetDateTime endDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final fz.b.OffsetDateTime startDate;

    public DefenceTrainingDay(fz.b.OffsetDateTime offsetDateTime, fz.b.OffsetDateTime offsetDateTime2) {
        this.endDate = offsetDateTime;
        this.startDate = offsetDateTime2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final fz.b.OffsetDateTime getEndDate() {
        return this.endDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final fz.b.OffsetDateTime getStartDate() {
        return this.startDate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DefenceTrainingDay)) {
            return false;
        }
        DefenceTrainingDay defenceTrainingDay = (DefenceTrainingDay) other;
        return fr.t.c(this.endDate, defenceTrainingDay.endDate) && fr.t.c(this.startDate, defenceTrainingDay.startDate);
    }

    public int hashCode() {
        return (this.endDate.hashCode() * 31) + this.startDate.hashCode();
    }

    public String toString() {
        return "DefenceTrainingDay(endDate=" + this.endDate + ", startDate=" + this.startDate + ")";
    }
}
