package dz2;

import ez2.CanSharedData;
import gz2.ConfirmMidSharedData;
import gz2.DeeplinkSharedData;
import gz2.i0;
import iz2.QrScannerSharedData;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: dz2.w, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJB\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010%\u001a\u0004\b!\u0010&R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b#\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Ldz2/w;", "", "Liz2/q;", "qrScannerData", "Lgz2/m;", "confirmMidData", "Lgz2/h0;", "deeplinkData", "Lez2/g;", "canSharedData", "Lgz2/i0;", "entryPoint", "<init>", "(Liz2/q;Lgz2/m;Lgz2/h0;Lez2/g;Lgz2/i0;)V", "a", "(Liz2/q;Lgz2/m;Lgz2/h0;Lez2/g;Lgz2/i0;)Ldz2/w;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Liz2/q;", "g", "()Liz2/q;", "b", "Lgz2/m;", "d", "()Lgz2/m;", "c", "Lgz2/h0;", "e", "()Lgz2/h0;", "Lez2/g;", "()Lez2/g;", "Lgz2/i0;", "f", "()Lgz2/i0;", "qualifiedsignature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final QrScannerSharedData qrScannerData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final ConfirmMidSharedData confirmMidData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final DeeplinkSharedData deeplinkData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final CanSharedData canSharedData;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final i0 entryPoint;

    public State(QrScannerSharedData qrScannerSharedData, ConfirmMidSharedData confirmMidSharedData, DeeplinkSharedData deeplinkSharedData, CanSharedData canSharedData, i0 i0Var) {
        this.qrScannerData = qrScannerSharedData;
        this.confirmMidData = confirmMidSharedData;
        this.deeplinkData = deeplinkSharedData;
        this.canSharedData = canSharedData;
        this.entryPoint = i0Var;
    }

    public static /* synthetic */ State b(State state, QrScannerSharedData qrScannerSharedData, ConfirmMidSharedData confirmMidSharedData, DeeplinkSharedData deeplinkSharedData, CanSharedData canSharedData, i0 i0Var, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            qrScannerSharedData = state.qrScannerData;
        }
        if ((i15 & 2) != 0) {
            confirmMidSharedData = state.confirmMidData;
        }
        if ((i15 & 4) != 0) {
            deeplinkSharedData = state.deeplinkData;
        }
        if ((i15 & 8) != 0) {
            canSharedData = state.canSharedData;
        }
        if ((i15 & 16) != 0) {
            i0Var = state.entryPoint;
        }
        i0 i0Var2 = i0Var;
        DeeplinkSharedData deeplinkSharedData2 = deeplinkSharedData;
        return state.a(qrScannerSharedData, confirmMidSharedData, deeplinkSharedData2, canSharedData, i0Var2);
    }

    public final State a(QrScannerSharedData qrScannerData, ConfirmMidSharedData confirmMidData, DeeplinkSharedData deeplinkData, CanSharedData canSharedData, i0 entryPoint) {
        return new State(qrScannerData, confirmMidData, deeplinkData, canSharedData, entryPoint);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final CanSharedData getCanSharedData() {
        return this.canSharedData;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final ConfirmMidSharedData getConfirmMidData() {
        return this.confirmMidData;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final DeeplinkSharedData getDeeplinkData() {
        return this.deeplinkData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return fr.t.c(this.qrScannerData, state.qrScannerData) && fr.t.c(this.confirmMidData, state.confirmMidData) && fr.t.c(this.deeplinkData, state.deeplinkData) && fr.t.c(this.canSharedData, state.canSharedData) && this.entryPoint == state.entryPoint;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final i0 getEntryPoint() {
        return this.entryPoint;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final QrScannerSharedData getQrScannerData() {
        return this.qrScannerData;
    }

    public int hashCode() {
        return (((((((this.qrScannerData.hashCode() * 31) + this.confirmMidData.hashCode()) * 31) + this.deeplinkData.hashCode()) * 31) + this.canSharedData.hashCode()) * 31) + this.entryPoint.hashCode();
    }

    public String toString() {
        return "State(qrScannerData=" + this.qrScannerData + ", confirmMidData=" + this.confirmMidData + ", deeplinkData=" + this.deeplinkData + ", canSharedData=" + this.canSharedData + ", entryPoint=" + this.entryPoint + ')';
    }
}
