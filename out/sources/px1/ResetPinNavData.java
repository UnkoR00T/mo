package px1;

import fr.t;
import iy.b0;
import p071kotlin.Metadata;
import py1.ResetPinData;

/* JADX INFO: renamed from: px1.a, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016¨\u0006\u0017"}, d2 = {"Lpx1/a;", "", "Lpy1/a;", "resetPinData", "", "popDestination", "<init>", "(Lpy1/a;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lpy1/a;", "b", "()Lpy1/a;", "Z", "()Z", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ResetPinNavData {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f163108c = b0.f97726c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final ResetPinData resetPinData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean popDestination;

    public ResetPinNavData(ResetPinData resetPinData, boolean z15) {
        this.resetPinData = resetPinData;
        this.popDestination = z15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getPopDestination() {
        return this.popDestination;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ResetPinData getResetPinData() {
        return this.resetPinData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResetPinNavData)) {
            return false;
        }
        ResetPinNavData resetPinNavData = (ResetPinNavData) other;
        return t.c(this.resetPinData, resetPinNavData.resetPinData) && this.popDestination == resetPinNavData.popDestination;
    }

    public int hashCode() {
        return (this.resetPinData.hashCode() * 31) + Boolean.hashCode(this.popDestination);
    }

    public String toString() {
        return "ResetPinNavData(resetPinData=" + this.resetPinData + ", popDestination=" + this.popDestination + ')';
    }
}
