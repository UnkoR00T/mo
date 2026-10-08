package tt0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: tt0.j, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001a\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001b\u0010\u000fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001c\u0010!R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u001e\u0010$¨\u0006%"}, d2 = {"Ltt0/j;", "", "", "category", "categoryName", "initiativeId", "interventionTypeName", "number", "Ltt0/d;", "processingStatus", "Ltt0/e;", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltt0/d;Ltt0/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getCategory", "b", "c", "d", "getInterventionTypeName", "e", "f", "Ltt0/d;", "()Ltt0/d;", "g", "Ltt0/e;", "()Ltt0/e;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEReportedIntervention {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String category;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String categoryName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String initiativeId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String interventionTypeName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String number;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final d processingStatus;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final e type;

    public BEReportedIntervention(String str, String str2, String str3, String str4, String str5, d dVar, e eVar) {
        this.category = str;
        this.categoryName = str2;
        this.initiativeId = str3;
        this.interventionTypeName = str4;
        this.number = str5;
        this.processingStatus = dVar;
        this.type = eVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCategoryName() {
        return this.categoryName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getInitiativeId() {
        return this.initiativeId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final d getProcessingStatus() {
        return this.processingStatus;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final e getType() {
        return this.type;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEReportedIntervention)) {
            return false;
        }
        BEReportedIntervention bEReportedIntervention = (BEReportedIntervention) other;
        return fr.t.c(this.category, bEReportedIntervention.category) && fr.t.c(this.categoryName, bEReportedIntervention.categoryName) && fr.t.c(this.initiativeId, bEReportedIntervention.initiativeId) && fr.t.c(this.interventionTypeName, bEReportedIntervention.interventionTypeName) && fr.t.c(this.number, bEReportedIntervention.number) && this.processingStatus == bEReportedIntervention.processingStatus && this.type == bEReportedIntervention.type;
    }

    public int hashCode() {
        return (((((((((((this.category.hashCode() * 31) + this.categoryName.hashCode()) * 31) + this.initiativeId.hashCode()) * 31) + this.interventionTypeName.hashCode()) * 31) + this.number.hashCode()) * 31) + this.processingStatus.hashCode()) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "BEReportedIntervention(category=" + this.category + ", categoryName=" + this.categoryName + ", initiativeId=" + this.initiativeId + ", interventionTypeName=" + this.interventionTypeName + ", number=" + this.number + ", processingStatus=" + this.processingStatus + ", type=" + this.type + ")";
    }
}
