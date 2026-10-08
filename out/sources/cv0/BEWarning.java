package cv0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: cv0.r, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcv0/r;", "", "Lcv0/t;", "type", "", "description", "Lcv0/s;", "warningLevel", "<init>", "(Lcv0/t;Ljava/lang/String;Lcv0/s;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcv0/t;", "b", "()Lcv0/t;", "Ljava/lang/String;", "c", "Lcv0/s;", "()Lcv0/s;", "travelabroadservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEWarning {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final t type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEWarningLevel warningLevel;

    public BEWarning(t tVar, String str, BEWarningLevel bEWarningLevel) {
        this.type = tVar;
        this.description = str;
        this.warningLevel = bEWarningLevel;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final t getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final BEWarningLevel getWarningLevel() {
        return this.warningLevel;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEWarning)) {
            return false;
        }
        BEWarning bEWarning = (BEWarning) other;
        return this.type == bEWarning.type && fr.t.c(this.description, bEWarning.description) && fr.t.c(this.warningLevel, bEWarning.warningLevel);
    }

    public int hashCode() {
        return (((this.type.hashCode() * 31) + this.description.hashCode()) * 31) + this.warningLevel.hashCode();
    }

    public String toString() {
        return "BEWarning(type=" + this.type + ", description=" + this.description + ", warningLevel=" + this.warningLevel + ')';
    }
}
