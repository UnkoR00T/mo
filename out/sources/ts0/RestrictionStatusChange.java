package ts0;

import iy.b0;
import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ts0.m, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010\r¨\u0006 "}, d2 = {"Lts0/m;", "", "Liy/b0;", "pesel", "Ljava/time/OffsetDateTime;", "changeDate", "Lts0/l;", "status", "", "subject", "<init>", "(Liy/b0;Ljava/time/OffsetDateTime;Lts0/l;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "b", "()Liy/b0;", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "c", "Lts0/l;", "()Lts0/l;", "d", "Ljava/lang/String;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RestrictionStatusChange {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 pesel;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime changeDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final l status;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String subject;

    public RestrictionStatusChange(b0 b0Var, OffsetDateTime offsetDateTime, l lVar, String str) {
        this.pesel = b0Var;
        this.changeDate = offsetDateTime;
        this.status = lVar;
        this.subject = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final OffsetDateTime getChangeDate() {
        return this.changeDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b0 getPesel() {
        return this.pesel;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final l getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSubject() {
        return this.subject;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RestrictionStatusChange)) {
            return false;
        }
        RestrictionStatusChange restrictionStatusChange = (RestrictionStatusChange) other;
        return fr.t.c(this.pesel, restrictionStatusChange.pesel) && fr.t.c(this.changeDate, restrictionStatusChange.changeDate) && this.status == restrictionStatusChange.status && fr.t.c(this.subject, restrictionStatusChange.subject);
    }

    public int hashCode() {
        int iHashCode = this.pesel.hashCode() * 31;
        OffsetDateTime offsetDateTime = this.changeDate;
        int iHashCode2 = (iHashCode + (offsetDateTime == null ? 0 : offsetDateTime.hashCode())) * 31;
        l lVar = this.status;
        int iHashCode3 = (iHashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        String str = this.subject;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "RestrictionStatusChange(pesel=" + this.pesel + ", changeDate=" + this.changeDate + ", status=" + this.status + ", subject=" + this.subject + ")";
    }
}
