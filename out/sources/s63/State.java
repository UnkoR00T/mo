package s63;

import iy.b0;
import iy.c0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: s63.c, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJL\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b\t\u0010\"R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b#\u0010\"R\u0017\u0010&\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b$\u0010\"R\u0017\u0010(\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b%\u0010\"¨\u0006)"}, d2 = {"Ls63/c;", "", "Lhz/b;", "emailValidationState", "Liy/b0;", "email", "previousEmail", "", "skipEmailFocusChange", "isSameErrorActive", "scrollToError", "<init>", "(Lhz/b;Liy/b0;Liy/b0;ZZZ)V", "a", "(Lhz/b;Liy/b0;Liy/b0;ZZZ)Ls63/c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lhz/b;", "d", "()Lhz/b;", "b", "Liy/b0;", "c", "()Liy/b0;", "getPreviousEmail", "Z", "getSkipEmailFocusChange", "()Z", "e", "f", "g", "isEmailSameAsPrevious", "h", "isSameError", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f178348i = b0.f97726c | hz.b.f86845b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final hz.b emailValidationState;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 email;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 previousEmail;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean skipEmailFocusChange;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSameErrorActive;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean scrollToError;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean isEmailSameAsPrevious;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean isSameError;

    public State() {
        this(null, null, null, false, false, false, 63, null);
    }

    public static /* synthetic */ State b(State state, hz.b bVar, b0 b0Var, b0 b0Var2, boolean z15, boolean z16, boolean z17, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            bVar = state.emailValidationState;
        }
        if ((i15 & 2) != 0) {
            b0Var = state.email;
        }
        if ((i15 & 4) != 0) {
            b0Var2 = state.previousEmail;
        }
        if ((i15 & 8) != 0) {
            z15 = state.skipEmailFocusChange;
        }
        if ((i15 & 16) != 0) {
            z16 = state.isSameErrorActive;
        }
        if ((i15 & 32) != 0) {
            z17 = state.scrollToError;
        }
        boolean z18 = z16;
        boolean z19 = z17;
        return state.a(bVar, b0Var, b0Var2, z15, z18, z19);
    }

    public final State a(hz.b emailValidationState, b0 email, b0 previousEmail, boolean skipEmailFocusChange, boolean isSameErrorActive, boolean scrollToError) {
        return new State(emailValidationState, email, previousEmail, skipEmailFocusChange, isSameErrorActive, scrollToError);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b0 getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final hz.b getEmailValidationState() {
        return this.emailValidationState;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getScrollToError() {
        return this.scrollToError;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return fr.t.c(this.emailValidationState, state.emailValidationState) && fr.t.c(this.email, state.email) && fr.t.c(this.previousEmail, state.previousEmail) && this.skipEmailFocusChange == state.skipEmailFocusChange && this.isSameErrorActive == state.isSameErrorActive && this.scrollToError == state.scrollToError;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsEmailSameAsPrevious() {
        return this.isEmailSameAsPrevious;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsSameError() {
        return this.isSameError;
    }

    public int hashCode() {
        return (((((((((this.emailValidationState.hashCode() * 31) + this.email.hashCode()) * 31) + this.previousEmail.hashCode()) * 31) + Boolean.hashCode(this.skipEmailFocusChange)) * 31) + Boolean.hashCode(this.isSameErrorActive)) * 31) + Boolean.hashCode(this.scrollToError);
    }

    public String toString() {
        return "State(emailValidationState=" + this.emailValidationState + ", email=" + this.email + ", previousEmail=" + this.previousEmail + ", skipEmailFocusChange=" + this.skipEmailFocusChange + ", isSameErrorActive=" + this.isSameErrorActive + ", scrollToError=" + this.scrollToError + ')';
    }

    public State(hz.b bVar, b0 b0Var, b0 b0Var2, boolean z15, boolean z16, boolean z17) {
        this.emailValidationState = bVar;
        this.email = b0Var;
        this.previousEmail = b0Var2;
        this.skipEmailFocusChange = z15;
        this.isSameErrorActive = z16;
        this.scrollToError = z17;
        boolean zC = fr.t.c(fu.r.u1(c0.e(b0Var)).toString(), c0.e(b0Var2));
        this.isEmailSameAsPrevious = zC;
        this.isSameError = zC && z16;
    }

    public /* synthetic */ State(hz.b bVar, b0 b0Var, b0 b0Var2, boolean z15, boolean z16, boolean z17, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? hz.b.d.f86848c : bVar, (i15 & 2) != 0 ? b0.INSTANCE.a() : b0Var, (i15 & 4) != 0 ? b0.INSTANCE.a() : b0Var2, (i15 & 8) != 0 ? true : z15, (i15 & 16) != 0 ? false : z16, (i15 & 32) != 0 ? false : z17);
    }
}
