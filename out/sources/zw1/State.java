package zw1;

import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: zw1.b, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJB\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b#\u0010\"¨\u0006$"}, d2 = {"Lzw1/b;", "", "Lzw1/e;", "newPinScreenData", "Liy/b0;", "newPin", "repeatedNewPin", "Lhz/b;", "newPinValidationState", "repeatedNewPinValidationState", "<init>", "(Lzw1/e;Liy/b0;Liy/b0;Lhz/b;Lhz/b;)V", "a", "(Lzw1/e;Liy/b0;Liy/b0;Lhz/b;Lhz/b;)Lzw1/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lzw1/e;", "d", "()Lzw1/e;", "b", "Liy/b0;", "c", "()Liy/b0;", "f", "Lhz/b;", "e", "()Lhz/b;", "g", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f238128f;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final EdoNewPinScreenData newPinScreenData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 newPin;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 repeatedNewPin;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final hz.b newPinValidationState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final hz.b repeatedNewPinValidationState;

    static {
        int i15 = hz.b.f86845b;
        int i16 = b0.f97726c;
        f238128f = i15 | i16 | i16;
    }

    public State(EdoNewPinScreenData edoNewPinScreenData, b0 b0Var, b0 b0Var2, hz.b bVar, hz.b bVar2) {
        this.newPinScreenData = edoNewPinScreenData;
        this.newPin = b0Var;
        this.repeatedNewPin = b0Var2;
        this.newPinValidationState = bVar;
        this.repeatedNewPinValidationState = bVar2;
    }

    public static /* synthetic */ State b(State state, EdoNewPinScreenData edoNewPinScreenData, b0 b0Var, b0 b0Var2, hz.b bVar, hz.b bVar2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            edoNewPinScreenData = state.newPinScreenData;
        }
        if ((i15 & 2) != 0) {
            b0Var = state.newPin;
        }
        if ((i15 & 4) != 0) {
            b0Var2 = state.repeatedNewPin;
        }
        if ((i15 & 8) != 0) {
            bVar = state.newPinValidationState;
        }
        if ((i15 & 16) != 0) {
            bVar2 = state.repeatedNewPinValidationState;
        }
        hz.b bVar3 = bVar2;
        b0 b0Var3 = b0Var2;
        return state.a(edoNewPinScreenData, b0Var, b0Var3, bVar, bVar3);
    }

    public final State a(EdoNewPinScreenData newPinScreenData, b0 newPin, b0 repeatedNewPin, hz.b newPinValidationState, hz.b repeatedNewPinValidationState) {
        return new State(newPinScreenData, newPin, repeatedNewPin, newPinValidationState, repeatedNewPinValidationState);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b0 getNewPin() {
        return this.newPin;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final EdoNewPinScreenData getNewPinScreenData() {
        return this.newPinScreenData;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final hz.b getNewPinValidationState() {
        return this.newPinValidationState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return fr.t.c(this.newPinScreenData, state.newPinScreenData) && fr.t.c(this.newPin, state.newPin) && fr.t.c(this.repeatedNewPin, state.repeatedNewPin) && fr.t.c(this.newPinValidationState, state.newPinValidationState) && fr.t.c(this.repeatedNewPinValidationState, state.repeatedNewPinValidationState);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final b0 getRepeatedNewPin() {
        return this.repeatedNewPin;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final hz.b getRepeatedNewPinValidationState() {
        return this.repeatedNewPinValidationState;
    }

    public int hashCode() {
        return (((((((this.newPinScreenData.hashCode() * 31) + this.newPin.hashCode()) * 31) + this.repeatedNewPin.hashCode()) * 31) + this.newPinValidationState.hashCode()) * 31) + this.repeatedNewPinValidationState.hashCode();
    }

    public String toString() {
        return "State(newPinScreenData=" + this.newPinScreenData + ", newPin=" + this.newPin + ", repeatedNewPin=" + this.repeatedNewPin + ", newPinValidationState=" + this.newPinValidationState + ", repeatedNewPinValidationState=" + this.repeatedNewPinValidationState + ')';
    }

    public /* synthetic */ State(EdoNewPinScreenData edoNewPinScreenData, b0 b0Var, b0 b0Var2, hz.b bVar, hz.b bVar2, int i15, fr.k kVar) {
        this(edoNewPinScreenData, (i15 & 2) != 0 ? b0.INSTANCE.a() : b0Var, (i15 & 4) != 0 ? b0.INSTANCE.a() : b0Var2, (i15 & 8) != 0 ? hz.b.C2039b.f86846c : bVar, (i15 & 16) != 0 ? hz.b.C2039b.f86846c : bVar2);
    }
}
