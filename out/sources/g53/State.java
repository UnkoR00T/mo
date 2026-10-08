package g53;

import fr.t;
import iy.a0;
import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: g53.b, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ8\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lg53/b;", "", "Liy/a0;", "biometricResult", "", "shouldFocusWithKeyboard", "Liy/b0;", "pinValue", "Lhz/b;", "validationState", "<init>", "(Liy/a0;ZLiy/b0;Lhz/b;)V", "a", "(Liy/a0;ZLiy/b0;Lhz/b;)Lg53/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Liy/a0;", "c", "()Liy/a0;", "b", "Z", "e", "()Z", "Liy/b0;", "d", "()Liy/b0;", "Lhz/b;", "f", "()Lhz/b;", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f70741e = (hz.b.f86845b | b0.f97726c) | a0.f97720c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final a0 biometricResult;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean shouldFocusWithKeyboard;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 pinValue;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final hz.b validationState;

    public State() {
        this(null, false, null, null, 15, null);
    }

    public static /* synthetic */ State b(State state, a0 a0Var, boolean z15, b0 b0Var, hz.b bVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            a0Var = state.biometricResult;
        }
        if ((i15 & 2) != 0) {
            z15 = state.shouldFocusWithKeyboard;
        }
        if ((i15 & 4) != 0) {
            b0Var = state.pinValue;
        }
        if ((i15 & 8) != 0) {
            bVar = state.validationState;
        }
        return state.a(a0Var, z15, b0Var, bVar);
    }

    public final State a(a0 biometricResult, boolean shouldFocusWithKeyboard, b0 pinValue, hz.b validationState) {
        return new State(biometricResult, shouldFocusWithKeyboard, pinValue, validationState);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final a0 getBiometricResult() {
        return this.biometricResult;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b0 getPinValue() {
        return this.pinValue;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getShouldFocusWithKeyboard() {
        return this.shouldFocusWithKeyboard;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return t.c(this.biometricResult, state.biometricResult) && this.shouldFocusWithKeyboard == state.shouldFocusWithKeyboard && t.c(this.pinValue, state.pinValue) && t.c(this.validationState, state.validationState);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final hz.b getValidationState() {
        return this.validationState;
    }

    public int hashCode() {
        return (((((this.biometricResult.hashCode() * 31) + Boolean.hashCode(this.shouldFocusWithKeyboard)) * 31) + this.pinValue.hashCode()) * 31) + this.validationState.hashCode();
    }

    public String toString() {
        return "State(biometricResult=" + this.biometricResult + ", shouldFocusWithKeyboard=" + this.shouldFocusWithKeyboard + ", pinValue=" + this.pinValue + ", validationState=" + this.validationState + ')';
    }

    public State(a0 a0Var, boolean z15, b0 b0Var, hz.b bVar) {
        this.biometricResult = a0Var;
        this.shouldFocusWithKeyboard = z15;
        this.pinValue = b0Var;
        this.validationState = bVar;
    }

    public /* synthetic */ State(a0 a0Var, boolean z15, b0 b0Var, hz.b bVar, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? a0.INSTANCE.a() : a0Var, (i15 & 2) != 0 ? false : z15, (i15 & 4) != 0 ? b0.INSTANCE.a() : b0Var, (i15 & 8) != 0 ? hz.b.C2039b.f86846c : bVar);
    }
}
