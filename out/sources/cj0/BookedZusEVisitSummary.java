package cj0;

import fr.t;
import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: cj0.e, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010 \u001a\u0004\b\u001e\u0010\u000fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b\u0017\u0010\u000f¨\u0006$"}, d2 = {"Lcj0/e;", "", "", "id", "Lfz/b$f;", "visitDate", "visitEndDate", "", "topic", "Liy/b0;", "visitUrl", "departmentDescription", "<init>", "(JLfz/b$f;Lfz/b$f;Ljava/lang/String;Liy/b0;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "b", "()J", "Lfz/b$f;", "d", "()Lfz/b$f;", "c", "e", "Ljava/lang/String;", "Liy/b0;", "f", "()Liy/b0;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BookedZusEVisitSummary {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final fz.b.OffsetDateTime visitDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final fz.b.OffsetDateTime visitEndDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String topic;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 visitUrl;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String departmentDescription;

    public BookedZusEVisitSummary(long j15, fz.b.OffsetDateTime offsetDateTime, fz.b.OffsetDateTime offsetDateTime2, String str, b0 b0Var, String str2) {
        this.id = j15;
        this.visitDate = offsetDateTime;
        this.visitEndDate = offsetDateTime2;
        this.topic = str;
        this.visitUrl = b0Var;
        this.departmentDescription = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDepartmentDescription() {
        return this.departmentDescription;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTopic() {
        return this.topic;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final fz.b.OffsetDateTime getVisitDate() {
        return this.visitDate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final fz.b.OffsetDateTime getVisitEndDate() {
        return this.visitEndDate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BookedZusEVisitSummary)) {
            return false;
        }
        BookedZusEVisitSummary bookedZusEVisitSummary = (BookedZusEVisitSummary) other;
        return this.id == bookedZusEVisitSummary.id && t.c(this.visitDate, bookedZusEVisitSummary.visitDate) && t.c(this.visitEndDate, bookedZusEVisitSummary.visitEndDate) && t.c(this.topic, bookedZusEVisitSummary.topic) && t.c(this.visitUrl, bookedZusEVisitSummary.visitUrl) && t.c(this.departmentDescription, bookedZusEVisitSummary.departmentDescription);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final b0 getVisitUrl() {
        return this.visitUrl;
    }

    public int hashCode() {
        int iHashCode = ((((((((Long.hashCode(this.id) * 31) + this.visitDate.hashCode()) * 31) + this.visitEndDate.hashCode()) * 31) + this.topic.hashCode()) * 31) + this.visitUrl.hashCode()) * 31;
        String str = this.departmentDescription;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "BookedZusEVisitSummary(id=" + this.id + ", visitDate=" + this.visitDate + ", visitEndDate=" + this.visitEndDate + ", topic=" + this.topic + ", visitUrl=" + this.visitUrl + ", departmentDescription=" + this.departmentDescription + ")";
    }
}
