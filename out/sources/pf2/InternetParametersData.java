package pf2;

import p071kotlin.Metadata;
import zi0.InternetSpeed;

/* JADX INFO: renamed from: pf2.e, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u0019"}, d2 = {"Lpf2/e;", "", "", "upgrade", "Lzi0/g;", "downlink", "uplink", "<init>", "(ZLzi0/g;Lzi0/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "Lzi0/g;", "()Lzi0/g;", "c", "internetaccess_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InternetParametersData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean upgrade;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final InternetSpeed downlink;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final InternetSpeed uplink;

    public InternetParametersData(boolean z15, InternetSpeed internetSpeed, InternetSpeed internetSpeed2) {
        this.upgrade = z15;
        this.downlink = internetSpeed;
        this.uplink = internetSpeed2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InternetSpeed getDownlink() {
        return this.downlink;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getUpgrade() {
        return this.upgrade;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InternetSpeed getUplink() {
        return this.uplink;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternetParametersData)) {
            return false;
        }
        InternetParametersData internetParametersData = (InternetParametersData) other;
        return this.upgrade == internetParametersData.upgrade && fr.t.c(this.downlink, internetParametersData.downlink) && fr.t.c(this.uplink, internetParametersData.uplink);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.upgrade) * 31;
        InternetSpeed internetSpeed = this.downlink;
        int iHashCode2 = (iHashCode + (internetSpeed == null ? 0 : internetSpeed.hashCode())) * 31;
        InternetSpeed internetSpeed2 = this.uplink;
        return iHashCode2 + (internetSpeed2 != null ? internetSpeed2.hashCode() : 0);
    }

    public String toString() {
        return "InternetParametersData(upgrade=" + this.upgrade + ", downlink=" + this.downlink + ", uplink=" + this.uplink + ')';
    }
}
