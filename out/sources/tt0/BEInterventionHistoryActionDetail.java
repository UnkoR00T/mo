package tt0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: tt0.c, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0019\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, d2 = {"Ltt0/c;", "", "Lfz/b$c;", "date", "", "description", "sanitaryUnit", "Ltt0/d;", "status", "<init>", "(Lfz/b$c;Ljava/lang/String;Ljava/lang/String;Ltt0/d;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfz/b$c;", "()Lfz/b$c;", "b", "Ljava/lang/String;", "c", "d", "Ltt0/d;", "()Ltt0/d;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEInterventionHistoryActionDetail {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final fz.b.LocalDate date;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sanitaryUnit;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final d status;

    public BEInterventionHistoryActionDetail(fz.b.LocalDate localDate, String str, String str2, d dVar) {
        this.date = localDate;
        this.description = str;
        this.sanitaryUnit = str2;
        this.status = dVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final fz.b.LocalDate getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSanitaryUnit() {
        return this.sanitaryUnit;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final d getStatus() {
        return this.status;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEInterventionHistoryActionDetail)) {
            return false;
        }
        BEInterventionHistoryActionDetail bEInterventionHistoryActionDetail = (BEInterventionHistoryActionDetail) other;
        return fr.t.c(this.date, bEInterventionHistoryActionDetail.date) && fr.t.c(this.description, bEInterventionHistoryActionDetail.description) && fr.t.c(this.sanitaryUnit, bEInterventionHistoryActionDetail.sanitaryUnit) && this.status == bEInterventionHistoryActionDetail.status;
    }

    public int hashCode() {
        return (((((this.date.hashCode() * 31) + this.description.hashCode()) * 31) + this.sanitaryUnit.hashCode()) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "BEInterventionHistoryActionDetail(date=" + this.date + ", description=" + this.description + ", sanitaryUnit=" + this.sanitaryUnit + ", status=" + this.status + ")";
    }
}
