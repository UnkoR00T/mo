package py1;

import fr.t;
import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: py1.a, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001e\u0010\u001d¨\u0006\u001f"}, d2 = {"Lpy1/a;", "", "Liy/b0;", "can", "Lyw1/a;", "certificateType", "Llw1/a;", "entryDestination", "firstScreenInFlow", "<init>", "(Liy/b0;Lyw1/a;Llw1/a;Llw1/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "()Liy/b0;", "b", "Lyw1/a;", "()Lyw1/a;", "c", "Llw1/a;", "()Llw1/a;", "d", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ResetPinData {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f163228e = b0.f97726c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 can;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final yw1.a certificateType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final lw1.a entryDestination;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final lw1.a firstScreenInFlow;

    public ResetPinData(b0 b0Var, yw1.a aVar, lw1.a aVar2, lw1.a aVar3) {
        this.can = b0Var;
        this.certificateType = aVar;
        this.entryDestination = aVar2;
        this.firstScreenInFlow = aVar3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b0 getCan() {
        return this.can;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final yw1.a getCertificateType() {
        return this.certificateType;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final lw1.a getEntryDestination() {
        return this.entryDestination;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final lw1.a getFirstScreenInFlow() {
        return this.firstScreenInFlow;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResetPinData)) {
            return false;
        }
        ResetPinData resetPinData = (ResetPinData) other;
        return t.c(this.can, resetPinData.can) && this.certificateType == resetPinData.certificateType && t.c(this.entryDestination, resetPinData.entryDestination) && t.c(this.firstScreenInFlow, resetPinData.firstScreenInFlow);
    }

    public int hashCode() {
        int iHashCode = ((this.can.hashCode() * 31) + this.certificateType.hashCode()) * 31;
        lw1.a aVar = this.entryDestination;
        return ((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.firstScreenInFlow.hashCode();
    }

    public String toString() {
        return "ResetPinData(can=" + this.can + ", certificateType=" + this.certificateType + ", entryDestination=" + this.entryDestination + ", firstScreenInFlow=" + this.firstScreenInFlow + ')';
    }
}
