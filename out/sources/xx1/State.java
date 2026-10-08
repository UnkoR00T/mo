package xx1;

import dx1.EdoPinScreenData;
import p071kotlin.Metadata;
import sw1.EdoCanScreenData;

/* JADX INFO: renamed from: xx1.u, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ8\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b!\u0010\u001d¨\u0006\""}, d2 = {"Lxx1/u;", "", "Lsw1/e;", "canScreenData", "Liy/b0;", "can", "Ldx1/e;", "pinScreenData", "pin", "<init>", "(Lsw1/e;Liy/b0;Ldx1/e;Liy/b0;)V", "a", "(Lsw1/e;Liy/b0;Ldx1/e;Liy/b0;)Lxx1/u;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lsw1/e;", "d", "()Lsw1/e;", "b", "Liy/b0;", "c", "()Liy/b0;", "Ldx1/e;", "f", "()Ldx1/e;", "e", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f221834e = iy.b0.f97726c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final EdoCanScreenData canScreenData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 can;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final EdoPinScreenData pinScreenData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 pin;

    public State(EdoCanScreenData edoCanScreenData, iy.b0 b0Var, EdoPinScreenData edoPinScreenData, iy.b0 b0Var2) {
        this.canScreenData = edoCanScreenData;
        this.can = b0Var;
        this.pinScreenData = edoPinScreenData;
        this.pin = b0Var2;
    }

    public static /* synthetic */ State b(State state, EdoCanScreenData edoCanScreenData, iy.b0 b0Var, EdoPinScreenData edoPinScreenData, iy.b0 b0Var2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            edoCanScreenData = state.canScreenData;
        }
        if ((i15 & 2) != 0) {
            b0Var = state.can;
        }
        if ((i15 & 4) != 0) {
            edoPinScreenData = state.pinScreenData;
        }
        if ((i15 & 8) != 0) {
            b0Var2 = state.pin;
        }
        return state.a(edoCanScreenData, b0Var, edoPinScreenData, b0Var2);
    }

    public final State a(EdoCanScreenData canScreenData, iy.b0 can, EdoPinScreenData pinScreenData, iy.b0 pin) {
        return new State(canScreenData, can, pinScreenData, pin);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final iy.b0 getCan() {
        return this.can;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final EdoCanScreenData getCanScreenData() {
        return this.canScreenData;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final iy.b0 getPin() {
        return this.pin;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return fr.t.c(this.canScreenData, state.canScreenData) && fr.t.c(this.can, state.can) && fr.t.c(this.pinScreenData, state.pinScreenData) && fr.t.c(this.pin, state.pin);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final EdoPinScreenData getPinScreenData() {
        return this.pinScreenData;
    }

    public int hashCode() {
        return (((((this.canScreenData.hashCode() * 31) + this.can.hashCode()) * 31) + this.pinScreenData.hashCode()) * 31) + this.pin.hashCode();
    }

    public String toString() {
        return "State(canScreenData=" + this.canScreenData + ", can=" + this.can + ", pinScreenData=" + this.pinScreenData + ", pin=" + this.pin + ')';
    }

    public /* synthetic */ State(EdoCanScreenData edoCanScreenData, iy.b0 b0Var, EdoPinScreenData edoPinScreenData, iy.b0 b0Var2, int i15, fr.k kVar) {
        this(edoCanScreenData, (i15 & 2) != 0 ? iy.b0.INSTANCE.a() : b0Var, edoPinScreenData, (i15 & 8) != 0 ? iy.b0.INSTANCE.a() : b0Var2);
    }
}
