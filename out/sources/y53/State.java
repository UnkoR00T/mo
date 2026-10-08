package y53;

import fr.t;
import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: y53.b, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ8\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Ly53/b;", "", "Liy/b0;", "passwordValue", "newPinValue", "pinValue", "Lhz/b;", "validationState", "<init>", "(Liy/b0;Liy/b0;Liy/b0;Lhz/b;)V", "a", "(Liy/b0;Liy/b0;Liy/b0;Lhz/b;)Ly53/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Liy/b0;", "getPasswordValue", "()Liy/b0;", "b", "c", "d", "Lhz/b;", "e", "()Lhz/b;", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f224286e;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 passwordValue;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 newPinValue;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 pinValue;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final hz.b validationState;

    static {
        int i15 = hz.b.f86845b;
        int i16 = b0.f97726c;
        f224286e = i15 | i16 | i16 | i16;
    }

    public State(b0 b0Var, b0 b0Var2, b0 b0Var3, hz.b bVar) {
        this.passwordValue = b0Var;
        this.newPinValue = b0Var2;
        this.pinValue = b0Var3;
        this.validationState = bVar;
    }

    public static /* synthetic */ State b(State state, b0 b0Var, b0 b0Var2, b0 b0Var3, hz.b bVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            b0Var = state.passwordValue;
        }
        if ((i15 & 2) != 0) {
            b0Var2 = state.newPinValue;
        }
        if ((i15 & 4) != 0) {
            b0Var3 = state.pinValue;
        }
        if ((i15 & 8) != 0) {
            bVar = state.validationState;
        }
        return state.a(b0Var, b0Var2, b0Var3, bVar);
    }

    public final State a(b0 passwordValue, b0 newPinValue, b0 pinValue, hz.b validationState) {
        return new State(passwordValue, newPinValue, pinValue, validationState);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b0 getNewPinValue() {
        return this.newPinValue;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b0 getPinValue() {
        return this.pinValue;
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
        return t.c(this.passwordValue, state.passwordValue) && t.c(this.newPinValue, state.newPinValue) && t.c(this.pinValue, state.pinValue) && t.c(this.validationState, state.validationState);
    }

    public int hashCode() {
        return (((((this.passwordValue.hashCode() * 31) + this.newPinValue.hashCode()) * 31) + this.pinValue.hashCode()) * 31) + this.validationState.hashCode();
    }

    public String toString() {
        return "State(passwordValue=" + this.passwordValue + ", newPinValue=" + this.newPinValue + ", pinValue=" + this.pinValue + ", validationState=" + this.validationState + ')';
    }
}
