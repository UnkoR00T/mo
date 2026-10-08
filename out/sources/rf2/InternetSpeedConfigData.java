package rf2;

import fr.t;
import j40.DropDownButtonData;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: rf2.a, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lrf2/a;", "", "Lj40/a;", "downlink", "uplink", "<init>", "(Lj40/a;Lj40/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lj40/a;", "()Lj40/a;", "b", "internetaccess_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InternetSpeedConfigData {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f173677c = DropDownButtonData.f99359i;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final DropDownButtonData downlink;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final DropDownButtonData uplink;

    public InternetSpeedConfigData(DropDownButtonData dropDownButtonData, DropDownButtonData dropDownButtonData2) {
        this.downlink = dropDownButtonData;
        this.uplink = dropDownButtonData2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final DropDownButtonData getDownlink() {
        return this.downlink;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final DropDownButtonData getUplink() {
        return this.uplink;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternetSpeedConfigData)) {
            return false;
        }
        InternetSpeedConfigData internetSpeedConfigData = (InternetSpeedConfigData) other;
        return t.c(this.downlink, internetSpeedConfigData.downlink) && t.c(this.uplink, internetSpeedConfigData.uplink);
    }

    public int hashCode() {
        return (this.downlink.hashCode() * 31) + this.uplink.hashCode();
    }

    public String toString() {
        return "InternetSpeedConfigData(downlink=" + this.downlink + ", uplink=" + this.uplink + ')';
    }
}
