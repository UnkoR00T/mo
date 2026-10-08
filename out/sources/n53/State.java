package n53;

import fr.t;
import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: n53.b, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJB\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Ln53/b;", "", "Liy/b0;", "password", "newPin", "pinValue", "Lhz/b;", "validationState", "", "shouldFocusWithKeyboard", "<init>", "(Liy/b0;Liy/b0;Liy/b0;Lhz/b;Z)V", "a", "(Liy/b0;Liy/b0;Liy/b0;Lhz/b;Z)Ln53/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Liy/b0;", "d", "()Liy/b0;", "b", "c", "e", "Lhz/b;", "g", "()Lhz/b;", "Z", "f", "()Z", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f132252f;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 password;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 newPin;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 pinValue;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final hz.b validationState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean shouldFocusWithKeyboard;

    static {
        int i15 = hz.b.f86845b;
        int i16 = b0.f97726c;
        f132252f = i15 | i16 | i16 | i16;
    }

    public State() {
        this(null, null, null, null, false, 31, null);
    }

    public static /* synthetic */ State b(State state, b0 b0Var, b0 b0Var2, b0 b0Var3, hz.b bVar, boolean z15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            b0Var = state.password;
        }
        if ((i15 & 2) != 0) {
            b0Var2 = state.newPin;
        }
        if ((i15 & 4) != 0) {
            b0Var3 = state.pinValue;
        }
        if ((i15 & 8) != 0) {
            bVar = state.validationState;
        }
        if ((i15 & 16) != 0) {
            z15 = state.shouldFocusWithKeyboard;
        }
        boolean z16 = z15;
        b0 b0Var4 = b0Var3;
        return state.a(b0Var, b0Var2, b0Var4, bVar, z16);
    }

    public final State a(b0 password, b0 newPin, b0 pinValue, hz.b validationState, boolean shouldFocusWithKeyboard) {
        return new State(password, newPin, pinValue, validationState, shouldFocusWithKeyboard);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b0 getNewPin() {
        return this.newPin;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b0 getPassword() {
        return this.password;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final b0 getPinValue() {
        return this.pinValue;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return t.c(this.password, state.password) && t.c(this.newPin, state.newPin) && t.c(this.pinValue, state.pinValue) && t.c(this.validationState, state.validationState) && this.shouldFocusWithKeyboard == state.shouldFocusWithKeyboard;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getShouldFocusWithKeyboard() {
        return this.shouldFocusWithKeyboard;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final hz.b getValidationState() {
        return this.validationState;
    }

    public int hashCode() {
        return (((((((this.password.hashCode() * 31) + this.newPin.hashCode()) * 31) + this.pinValue.hashCode()) * 31) + this.validationState.hashCode()) * 31) + Boolean.hashCode(this.shouldFocusWithKeyboard);
    }

    public String toString() {
        return "State(password=" + this.password + ", newPin=" + this.newPin + ", pinValue=" + this.pinValue + ", validationState=" + this.validationState + ", shouldFocusWithKeyboard=" + this.shouldFocusWithKeyboard + ')';
    }

    public State(b0 b0Var, b0 b0Var2, b0 b0Var3, hz.b bVar, boolean z15) {
        this.password = b0Var;
        this.newPin = b0Var2;
        this.pinValue = b0Var3;
        this.validationState = bVar;
        this.shouldFocusWithKeyboard = z15;
    }

    public /* synthetic */ State(b0 b0Var, b0 b0Var2, b0 b0Var3, hz.b bVar, boolean z15, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? b0.INSTANCE.a() : b0Var, (i15 & 2) != 0 ? b0.INSTANCE.a() : b0Var2, (i15 & 4) != 0 ? b0.INSTANCE.a() : b0Var3, (i15 & 8) != 0 ? hz.b.C2039b.f86846c : bVar, (i15 & 16) != 0 ? true : z15);
    }
}
