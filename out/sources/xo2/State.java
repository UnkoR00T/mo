package xo2;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: xo2.g, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJB\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001f\u0010\u001e¨\u0006 "}, d2 = {"Lxo2/g;", "", "", "showValidation", "regulationsSwitchChecked", "Lhz/b;", "regulationsSwitchValidationState", "privacyPolicySwitchChecked", "privacyPolicyValidationState", "<init>", "(ZZLhz/b;ZLhz/b;)V", "a", "(ZZLhz/b;ZLhz/b;)Lxo2/g;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "g", "()Z", "b", "e", "c", "Lhz/b;", "f", "()Lhz/b;", "d", "onboarding_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f220210f = hz.b.f86845b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean showValidation;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean regulationsSwitchChecked;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final hz.b regulationsSwitchValidationState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean privacyPolicySwitchChecked;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final hz.b privacyPolicyValidationState;

    public State() {
        this(false, false, null, false, null, 31, null);
    }

    public static /* synthetic */ State b(State state, boolean z15, boolean z16, hz.b bVar, boolean z17, hz.b bVar2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = state.showValidation;
        }
        if ((i15 & 2) != 0) {
            z16 = state.regulationsSwitchChecked;
        }
        if ((i15 & 4) != 0) {
            bVar = state.regulationsSwitchValidationState;
        }
        if ((i15 & 8) != 0) {
            z17 = state.privacyPolicySwitchChecked;
        }
        if ((i15 & 16) != 0) {
            bVar2 = state.privacyPolicyValidationState;
        }
        hz.b bVar3 = bVar2;
        hz.b bVar4 = bVar;
        return state.a(z15, z16, bVar4, z17, bVar3);
    }

    public final State a(boolean showValidation, boolean regulationsSwitchChecked, hz.b regulationsSwitchValidationState, boolean privacyPolicySwitchChecked, hz.b privacyPolicyValidationState) {
        return new State(showValidation, regulationsSwitchChecked, regulationsSwitchValidationState, privacyPolicySwitchChecked, privacyPolicyValidationState);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getPrivacyPolicySwitchChecked() {
        return this.privacyPolicySwitchChecked;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final hz.b getPrivacyPolicyValidationState() {
        return this.privacyPolicyValidationState;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getRegulationsSwitchChecked() {
        return this.regulationsSwitchChecked;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return this.showValidation == state.showValidation && this.regulationsSwitchChecked == state.regulationsSwitchChecked && fr.t.c(this.regulationsSwitchValidationState, state.regulationsSwitchValidationState) && this.privacyPolicySwitchChecked == state.privacyPolicySwitchChecked && fr.t.c(this.privacyPolicyValidationState, state.privacyPolicyValidationState);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final hz.b getRegulationsSwitchValidationState() {
        return this.regulationsSwitchValidationState;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getShowValidation() {
        return this.showValidation;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.showValidation) * 31) + Boolean.hashCode(this.regulationsSwitchChecked)) * 31) + this.regulationsSwitchValidationState.hashCode()) * 31) + Boolean.hashCode(this.privacyPolicySwitchChecked)) * 31) + this.privacyPolicyValidationState.hashCode();
    }

    public String toString() {
        return "State(showValidation=" + this.showValidation + ", regulationsSwitchChecked=" + this.regulationsSwitchChecked + ", regulationsSwitchValidationState=" + this.regulationsSwitchValidationState + ", privacyPolicySwitchChecked=" + this.privacyPolicySwitchChecked + ", privacyPolicyValidationState=" + this.privacyPolicyValidationState + ')';
    }

    public State(boolean z15, boolean z16, hz.b bVar, boolean z17, hz.b bVar2) {
        this.showValidation = z15;
        this.regulationsSwitchChecked = z16;
        this.regulationsSwitchValidationState = bVar;
        this.privacyPolicySwitchChecked = z17;
        this.privacyPolicyValidationState = bVar2;
    }

    public /* synthetic */ State(boolean z15, boolean z16, hz.b bVar, boolean z17, hz.b bVar2, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? false : z15, (i15 & 2) != 0 ? false : z16, (i15 & 4) != 0 ? hz.b.C2039b.f86846c : bVar, (i15 & 8) != 0 ? false : z17, (i15 & 16) != 0 ? hz.b.C2039b.f86846c : bVar2);
    }
}
