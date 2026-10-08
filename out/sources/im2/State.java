package im2;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: im2.b, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJN\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0011R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b$\u0010#\u001a\u0004\b \u0010%¨\u0006&"}, d2 = {"Lim2/b;", "", "Lkm2/b;", "processType", "", "isAnonymous", "consentChecked", "", "email", "Lhz/b;", "emailValidationState", "consentValidationState", "<init>", "(Lkm2/b;ZZLjava/lang/String;Lhz/b;Lhz/b;)V", "a", "(Lkm2/b;ZZLjava/lang/String;Lhz/b;Lhz/b;)Lim2/b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lkm2/b;", "g", "()Lkm2/b;", "b", "Z", "h", "()Z", "c", "d", "Ljava/lang/String;", "e", "Lhz/b;", "f", "()Lhz/b;", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f93348g = hz.b.f86845b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final km2.b processType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAnonymous;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean consentChecked;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String email;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final hz.b emailValidationState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final hz.b consentValidationState;

    public State(km2.b bVar, boolean z15, boolean z16, String str, hz.b bVar2, hz.b bVar3) {
        this.processType = bVar;
        this.isAnonymous = z15;
        this.consentChecked = z16;
        this.email = str;
        this.emailValidationState = bVar2;
        this.consentValidationState = bVar3;
    }

    public static /* synthetic */ State b(State state, km2.b bVar, boolean z15, boolean z16, String str, hz.b bVar2, hz.b bVar3, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            bVar = state.processType;
        }
        if ((i15 & 2) != 0) {
            z15 = state.isAnonymous;
        }
        if ((i15 & 4) != 0) {
            z16 = state.consentChecked;
        }
        if ((i15 & 8) != 0) {
            str = state.email;
        }
        if ((i15 & 16) != 0) {
            bVar2 = state.emailValidationState;
        }
        if ((i15 & 32) != 0) {
            bVar3 = state.consentValidationState;
        }
        hz.b bVar4 = bVar2;
        hz.b bVar5 = bVar3;
        return state.a(bVar, z15, z16, str, bVar4, bVar5);
    }

    public final State a(km2.b processType, boolean isAnonymous, boolean consentChecked, String email, hz.b emailValidationState, hz.b consentValidationState) {
        return new State(processType, isAnonymous, consentChecked, email, emailValidationState, consentValidationState);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getConsentChecked() {
        return this.consentChecked;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final hz.b getConsentValidationState() {
        return this.consentValidationState;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return this.processType == state.processType && this.isAnonymous == state.isAnonymous && this.consentChecked == state.consentChecked && fr.t.c(this.email, state.email) && fr.t.c(this.emailValidationState, state.emailValidationState) && fr.t.c(this.consentValidationState, state.consentValidationState);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final hz.b getEmailValidationState() {
        return this.emailValidationState;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final km2.b getProcessType() {
        return this.processType;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsAnonymous() {
        return this.isAnonymous;
    }

    public int hashCode() {
        int iHashCode = ((((this.processType.hashCode() * 31) + Boolean.hashCode(this.isAnonymous)) * 31) + Boolean.hashCode(this.consentChecked)) * 31;
        String str = this.email;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.emailValidationState.hashCode()) * 31) + this.consentValidationState.hashCode();
    }

    public String toString() {
        return "State(processType=" + this.processType + ", isAnonymous=" + this.isAnonymous + ", consentChecked=" + this.consentChecked + ", email=" + this.email + ", emailValidationState=" + this.emailValidationState + ", consentValidationState=" + this.consentValidationState + ')';
    }
}
