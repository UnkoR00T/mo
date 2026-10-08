package ej2;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ej2.a, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u0017\u0010\u000b¨\u0006\u001b"}, d2 = {"Lej2/a;", "", "", "timestamp", "Lrq0/b;", "documentType", "", "institutionName", "<init>", "(JLrq0/b;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "c", "()J", "b", "Lrq0/b;", "()Lrq0/b;", "Ljava/lang/String;", "legacy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InstitutionHistoryType {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long timestamp;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final rq0.b documentType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String institutionName;

    public InstitutionHistoryType(long j15, rq0.b bVar, String str) {
        this.timestamp = j15;
        this.documentType = bVar;
        this.institutionName = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final rq0.b getDocumentType() {
        return this.documentType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getInstitutionName() {
        return this.institutionName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstitutionHistoryType)) {
            return false;
        }
        InstitutionHistoryType institutionHistoryType = (InstitutionHistoryType) other;
        return this.timestamp == institutionHistoryType.timestamp && t.c(this.documentType, institutionHistoryType.documentType) && t.c(this.institutionName, institutionHistoryType.institutionName);
    }

    public int hashCode() {
        return (((Long.hashCode(this.timestamp) * 31) + this.documentType.hashCode()) * 31) + this.institutionName.hashCode();
    }

    public String toString() {
        return "InstitutionHistoryType(timestamp=" + this.timestamp + ", documentType=" + this.documentType + ", institutionName=" + this.institutionName + ')';
    }
}
