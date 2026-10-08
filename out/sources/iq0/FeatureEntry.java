package iq0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: iq0.t, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0013\u0010\u001b¨\u0006\u001c"}, d2 = {"Liq0/t;", "", "", "name", "Liq0/v;", "type", "Liq0/g0;", "temporaryInterruption", "<init>", "(Ljava/lang/String;Liq0/v;Liq0/g0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getName", "b", "Liq0/v;", "()Liq0/v;", "c", "Liq0/g0;", "()Liq0/g0;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FeatureEntry {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final v type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final TemporaryInterruption temporaryInterruption;

    public FeatureEntry(String str, v vVar, TemporaryInterruption temporaryInterruption) {
        this.name = str;
        this.type = vVar;
        this.temporaryInterruption = temporaryInterruption;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TemporaryInterruption getTemporaryInterruption() {
        return this.temporaryInterruption;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final v getType() {
        return this.type;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeatureEntry)) {
            return false;
        }
        FeatureEntry featureEntry = (FeatureEntry) other;
        return fr.t.c(this.name, featureEntry.name) && this.type == featureEntry.type && fr.t.c(this.temporaryInterruption, featureEntry.temporaryInterruption);
    }

    public int hashCode() {
        int iHashCode = ((this.name.hashCode() * 31) + this.type.hashCode()) * 31;
        TemporaryInterruption temporaryInterruption = this.temporaryInterruption;
        return iHashCode + (temporaryInterruption == null ? 0 : temporaryInterruption.hashCode());
    }

    public String toString() {
        return "FeatureEntry(name=" + this.name + ", type=" + this.type + ", temporaryInterruption=" + this.temporaryInterruption + ")";
    }
}
