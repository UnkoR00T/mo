package om3;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: om3.c, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lom3/c;", "", "Lmk3/a;", "vehicleOriginType", "<init>", "(Lmk3/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmk3/a;", "getVehicleOriginType", "()Lmk3/a;", "vehicleregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OnCardClick {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk3.a vehicleOriginType;

    public OnCardClick(mk3.a aVar) {
        this.vehicleOriginType = aVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OnCardClick) && this.vehicleOriginType == ((OnCardClick) other).vehicleOriginType;
    }

    public int hashCode() {
        return this.vehicleOriginType.hashCode();
    }

    public String toString() {
        return "OnCardClick(vehicleOriginType=" + this.vehicleOriginType + ')';
    }
}
