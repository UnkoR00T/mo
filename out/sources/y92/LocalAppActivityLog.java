package y92;

import fr.t;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: y92.d, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u0017\u0010$R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u001b\u0010\u0012¨\u0006'"}, d2 = {"Ly92/d;", "", "", "timestamp", "Ly92/f;", "type", "Ly92/e;", "level", "Lmx/a;", "description", "", "iconId", "<init>", "(JLy92/f;Ly92/e;Lmx/a;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "c", "()J", "b", "Ly92/f;", "getType", "()Ly92/f;", "Ly92/e;", "getLevel", "()Ly92/e;", "d", "Lmx/a;", "()Lmx/a;", "e", "I", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LocalAppActivityLog {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long timestamp;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final f type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final e level;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label description;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final int iconId;

    public LocalAppActivityLog(long j15, f fVar, e eVar, Label label, int i15) {
        this.timestamp = j15;
        this.type = fVar;
        this.level = eVar;
        this.description = label;
        this.iconId = i15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Label getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getIconId() {
        return this.iconId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalAppActivityLog)) {
            return false;
        }
        LocalAppActivityLog localAppActivityLog = (LocalAppActivityLog) other;
        return this.timestamp == localAppActivityLog.timestamp && this.type == localAppActivityLog.type && this.level == localAppActivityLog.level && t.c(this.description, localAppActivityLog.description) && this.iconId == localAppActivityLog.iconId;
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.timestamp) * 31) + this.type.hashCode()) * 31) + this.level.hashCode()) * 31) + this.description.hashCode()) * 31) + Integer.hashCode(this.iconId);
    }

    public String toString() {
        return "LocalAppActivityLog(timestamp=" + this.timestamp + ", type=" + this.type + ", level=" + this.level + ", description=" + this.description + ", iconId=" + this.iconId + ")";
    }
}
