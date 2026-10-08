package cj0;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: cj0.j, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\rR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001e\u001a\u0004\b\u0018\u0010\u001f¨\u0006 "}, d2 = {"Lcj0/j;", "", "", "id", "Lfz/b$f;", "visitDate", "", "topicDescription", "Lcj0/o;", "status", "<init>", "(JLfz/b$f;Ljava/lang/String;Lcj0/o;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "b", "Lfz/b$f;", "d", "()Lfz/b$f;", "c", "Ljava/lang/String;", "Lcj0/o;", "()Lcj0/o;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ZusEVisitGroupSummary {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final fz.b.OffsetDateTime visitDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String topicDescription;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final o status;

    public ZusEVisitGroupSummary(long j15, fz.b.OffsetDateTime offsetDateTime, String str, o oVar) {
        this.id = j15;
        this.visitDate = offsetDateTime;
        this.topicDescription = str;
        this.status = oVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final o getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTopicDescription() {
        return this.topicDescription;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final fz.b.OffsetDateTime getVisitDate() {
        return this.visitDate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ZusEVisitGroupSummary)) {
            return false;
        }
        ZusEVisitGroupSummary zusEVisitGroupSummary = (ZusEVisitGroupSummary) other;
        return this.id == zusEVisitGroupSummary.id && t.c(this.visitDate, zusEVisitGroupSummary.visitDate) && t.c(this.topicDescription, zusEVisitGroupSummary.topicDescription) && this.status == zusEVisitGroupSummary.status;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.id) * 31) + this.visitDate.hashCode()) * 31) + this.topicDescription.hashCode()) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "ZusEVisitGroupSummary(id=" + this.id + ", visitDate=" + this.visitDate + ", topicDescription=" + this.topicDescription + ", status=" + this.status + ")";
    }
}
