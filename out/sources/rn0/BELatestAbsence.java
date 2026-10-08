package rn0;

import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: rn0.s, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u001b\u0010\u000eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0016\u0010 ¨\u0006!"}, d2 = {"Lrn0/s;", "", "", "title", "subject", "Ljava/time/OffsetDateTime;", "fromTime", "toTime", "semesterId", "Lrn0/b;", "attendanceStatus", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/time/OffsetDateTime;Ljava/time/OffsetDateTime;Ljava/lang/String;Lrn0/b;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "d", "c", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "f", "Lrn0/b;", "()Lrn0/b;", "educationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BELatestAbsence {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String subject;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime fromTime;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime toTime;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String semesterId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final b attendanceStatus;

    public BELatestAbsence(String str, String str2, OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, String str3, b bVar) {
        this.title = str;
        this.subject = str2;
        this.fromTime = offsetDateTime;
        this.toTime = offsetDateTime2;
        this.semesterId = str3;
        this.attendanceStatus = bVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b getAttendanceStatus() {
        return this.attendanceStatus;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final OffsetDateTime getFromTime() {
        return this.fromTime;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSemesterId() {
        return this.semesterId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSubject() {
        return this.subject;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BELatestAbsence)) {
            return false;
        }
        BELatestAbsence bELatestAbsence = (BELatestAbsence) other;
        return fr.t.c(this.title, bELatestAbsence.title) && fr.t.c(this.subject, bELatestAbsence.subject) && fr.t.c(this.fromTime, bELatestAbsence.fromTime) && fr.t.c(this.toTime, bELatestAbsence.toTime) && fr.t.c(this.semesterId, bELatestAbsence.semesterId) && this.attendanceStatus == bELatestAbsence.attendanceStatus;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final OffsetDateTime getToTime() {
        return this.toTime;
    }

    public int hashCode() {
        return (((((((((this.title.hashCode() * 31) + this.subject.hashCode()) * 31) + this.fromTime.hashCode()) * 31) + this.toTime.hashCode()) * 31) + this.semesterId.hashCode()) * 31) + this.attendanceStatus.hashCode();
    }

    public String toString() {
        return "BELatestAbsence(title=" + this.title + ", subject=" + this.subject + ", fromTime=" + this.fromTime + ", toTime=" + this.toTime + ", semesterId=" + this.semesterId + ", attendanceStatus=" + this.attendanceStatus + ')';
    }
}
