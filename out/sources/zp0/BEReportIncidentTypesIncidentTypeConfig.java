package zp0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: zp0.o, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Lzp0/o;", "", "", "description", "Lzp0/m;", "type", "<init>", "(Ljava/lang/String;Lzp0/m;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lzp0/m;", "()Lzp0/m;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEReportIncidentTypesIncidentTypeConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEReportIncidentType type;

    public BEReportIncidentTypesIncidentTypeConfig(String str, BEReportIncidentType bEReportIncidentType) {
        this.description = str;
        this.type = bEReportIncidentType;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final BEReportIncidentType getType() {
        return this.type;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEReportIncidentTypesIncidentTypeConfig)) {
            return false;
        }
        BEReportIncidentTypesIncidentTypeConfig bEReportIncidentTypesIncidentTypeConfig = (BEReportIncidentTypesIncidentTypeConfig) other;
        return fr.t.c(this.description, bEReportIncidentTypesIncidentTypeConfig.description) && fr.t.c(this.type, bEReportIncidentTypesIncidentTypeConfig.type);
    }

    public int hashCode() {
        String str = this.description;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "BEReportIncidentTypesIncidentTypeConfig(description=" + this.description + ", type=" + this.type + ")";
    }
}
