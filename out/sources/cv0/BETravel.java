package cv0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: cv0.n, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001a\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b \u0010\u0012R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001d\u0010#R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b!\u0010&R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n8\u0006¢\u0006\f\n\u0004\b\u001c\u0010%\u001a\u0004\b$\u0010&¨\u0006'"}, d2 = {"Lcv0/n;", "", "Lcv0/q;", "uuid", "Lcv0/a;", "applicant", "", "destination", "Lfz/e$a;", "dateRange", "", "Lcv0/k;", "stages", "Lcv0/f;", "travelers", "<init>", "(Ljava/lang/String;Lcv0/a;Ljava/lang/String;Lfz/e$a;Ljava/util/List;Ljava/util/List;Lfr/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "b", "Lcv0/a;", "()Lcv0/a;", "c", "d", "Lfz/e$a;", "()Lfz/e$a;", "e", "Ljava/util/List;", "()Ljava/util/List;", "travelabroadservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BETravel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String uuid;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEApplicant applicant;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String destination;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final fz.e.LocalDate dateRange;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<BEStage> stages;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<BEPersonalData> travelers;

    public /* synthetic */ BETravel(String str, BEApplicant bEApplicant, String str2, fz.e.LocalDate localDate, List list, List list2, fr.k kVar) {
        this(str, bEApplicant, str2, localDate, list, list2);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BEApplicant getApplicant() {
        return this.applicant;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final fz.e.LocalDate getDateRange() {
        return this.dateRange;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDestination() {
        return this.destination;
    }

    public final List<BEStage> d() {
        return this.stages;
    }

    public final List<BEPersonalData> e() {
        return this.travelers;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BETravel)) {
            return false;
        }
        BETravel bETravel = (BETravel) other;
        return q.b(this.uuid, bETravel.uuid) && fr.t.c(this.applicant, bETravel.applicant) && fr.t.c(this.destination, bETravel.destination) && fr.t.c(this.dateRange, bETravel.dateRange) && fr.t.c(this.stages, bETravel.stages) && fr.t.c(this.travelers, bETravel.travelers);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return (((((((((q.c(this.uuid) * 31) + this.applicant.hashCode()) * 31) + this.destination.hashCode()) * 31) + this.dateRange.hashCode()) * 31) + this.stages.hashCode()) * 31) + this.travelers.hashCode();
    }

    public String toString() {
        return "BETravel(uuid=" + ((Object) q.d(this.uuid)) + ", applicant=" + this.applicant + ", destination=" + this.destination + ", dateRange=" + this.dateRange + ", stages=" + this.stages + ", travelers=" + this.travelers + ')';
    }

    private BETravel(String str, BEApplicant bEApplicant, String str2, fz.e.LocalDate localDate, List<BEStage> list, List<BEPersonalData> list2) {
        this.uuid = str;
        this.applicant = bEApplicant;
        this.destination = str2;
        this.dateRange = localDate;
        this.stages = list;
        this.travelers = list2;
    }
}
