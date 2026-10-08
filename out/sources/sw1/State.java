package sw1;

import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: sw1.b, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lsw1/b;", "", "Lsw1/e;", "canScreenData", "Liy/b0;", "can", "Lhz/b;", "validationState", "<init>", "(Lsw1/e;Liy/b0;Lhz/b;)V", "a", "(Lsw1/e;Liy/b0;Lhz/b;)Lsw1/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lsw1/e;", "d", "()Lsw1/e;", "b", "Liy/b0;", "c", "()Liy/b0;", "Lhz/b;", "e", "()Lhz/b;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f184887d = hz.b.f86845b | b0.f97726c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final EdoCanScreenData canScreenData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 can;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final hz.b validationState;

    public State(EdoCanScreenData edoCanScreenData, b0 b0Var, hz.b bVar) {
        this.canScreenData = edoCanScreenData;
        this.can = b0Var;
        this.validationState = bVar;
    }

    public static /* synthetic */ State b(State state, EdoCanScreenData edoCanScreenData, b0 b0Var, hz.b bVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            edoCanScreenData = state.canScreenData;
        }
        if ((i15 & 2) != 0) {
            b0Var = state.can;
        }
        if ((i15 & 4) != 0) {
            bVar = state.validationState;
        }
        return state.a(edoCanScreenData, b0Var, bVar);
    }

    public final State a(EdoCanScreenData canScreenData, b0 can, hz.b validationState) {
        return new State(canScreenData, can, validationState);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b0 getCan() {
        return this.can;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final EdoCanScreenData getCanScreenData() {
        return this.canScreenData;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final hz.b getValidationState() {
        return this.validationState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return fr.t.c(this.canScreenData, state.canScreenData) && fr.t.c(this.can, state.can) && fr.t.c(this.validationState, state.validationState);
    }

    public int hashCode() {
        return (((this.canScreenData.hashCode() * 31) + this.can.hashCode()) * 31) + this.validationState.hashCode();
    }

    public String toString() {
        return "State(canScreenData=" + this.canScreenData + ", can=" + this.can + ", validationState=" + this.validationState + ')';
    }

    public /* synthetic */ State(EdoCanScreenData edoCanScreenData, b0 b0Var, hz.b bVar, int i15, fr.k kVar) {
        this(edoCanScreenData, (i15 & 2) != 0 ? b0.INSTANCE.a() : b0Var, (i15 & 4) != 0 ? hz.b.C2039b.f86846c : bVar);
    }
}
