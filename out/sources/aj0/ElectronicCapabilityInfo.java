package aj0;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: aj0.b, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001d¨\u0006\u001e"}, d2 = {"Laj0/b;", "", "", "title", "description", "", "timeLimitInSeconds", "Laj0/c;", "status", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Laj0/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Ljava/lang/Long;", "getTimeLimitInSeconds", "()Ljava/lang/Long;", "d", "Laj0/c;", "()Laj0/c;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ElectronicCapabilityInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Long timeLimitInSeconds;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final c status;

    public ElectronicCapabilityInfo(String str, String str2, Long l15, c cVar) {
        this.title = str;
        this.description = str2;
        this.timeLimitInSeconds = l15;
        this.status = cVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final c getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ElectronicCapabilityInfo)) {
            return false;
        }
        ElectronicCapabilityInfo electronicCapabilityInfo = (ElectronicCapabilityInfo) other;
        return t.c(this.title, electronicCapabilityInfo.title) && t.c(this.description, electronicCapabilityInfo.description) && t.c(this.timeLimitInSeconds, electronicCapabilityInfo.timeLimitInSeconds) && this.status == electronicCapabilityInfo.status;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l15 = this.timeLimitInSeconds;
        return ((iHashCode2 + (l15 != null ? l15.hashCode() : 0)) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "ElectronicCapabilityInfo(title=" + this.title + ", description=" + this.description + ", timeLimitInSeconds=" + this.timeLimitInSeconds + ", status=" + this.status + ")";
    }
}
