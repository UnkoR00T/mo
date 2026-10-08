package cf0;

import fr.t;
import java.util.Set;
import java.util.UUID;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: cf0.h, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcf0/h;", "", "Ljava/util/UUID;", "id", "Lcf0/g;", "state", "", "", "tags", "<init>", "(Ljava/util/UUID;Lcf0/g;Ljava/util/Set;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/UUID;", "()Ljava/util/UUID;", "b", "Lcf0/g;", "()Lcf0/g;", "c", "Ljava/util/Set;", "getTags", "()Ljava/util/Set;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WorkerInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final UUID id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final g state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Set<String> tags;

    public WorkerInfo(UUID uuid, g gVar, Set<String> set) {
        this.id = uuid;
        this.state = gVar;
        this.tags = set;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final UUID getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final g getState() {
        return this.state;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WorkerInfo)) {
            return false;
        }
        WorkerInfo workerInfo = (WorkerInfo) other;
        return t.c(this.id, workerInfo.id) && this.state == workerInfo.state && t.c(this.tags, workerInfo.tags);
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + this.state.hashCode()) * 31) + this.tags.hashCode();
    }

    public String toString() {
        return "WorkerInfo(id=" + this.id + ", state=" + this.state + ", tags=" + this.tags + ")";
    }
}
