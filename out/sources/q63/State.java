package q63;

import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: q63.c, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJd\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b\"\u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b\n\u0010%R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b(\u0010%R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b$\u0010*\u001a\u0004\b&\u0010+R\u0017\u0010,\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b)\u0010%R\u0017\u0010.\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b-\u0010#\u001a\u0004\b-\u0010%¨\u0006/"}, d2 = {"Lq63/c;", "", "Lhz/b;", "emailValidationState", "Liy/b0;", "email", "previousEmail", "", "isGdprCheckboxChecked", "isGdprCheckboxVisible", "isSameErrorActive", "showCheckBoxValidationError", "Lq63/c0;", "scrollToError", "<init>", "(Lhz/b;Liy/b0;Liy/b0;ZZZZLq63/c0;)V", "a", "(Lhz/b;Liy/b0;Liy/b0;ZZZZLq63/c0;)Lq63/c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lhz/b;", "d", "()Lhz/b;", "b", "Liy/b0;", "c", "()Liy/b0;", "getPreviousEmail", "Z", "h", "()Z", "e", "i", "f", "g", "Lq63/c0;", "()Lq63/c0;", "isEmailSameAsPrevious", "j", "isSameError", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f165045k = iy.b0.f97726c | hz.b.f86845b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final hz.b emailValidationState;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 email;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 previousEmail;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isGdprCheckboxChecked;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isGdprCheckboxVisible;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSameErrorActive;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean showCheckBoxValidationError;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final c0 scrollToError;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean isEmailSameAsPrevious;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final boolean isSameError;

    public State() {
        this(null, null, null, false, false, false, false, null, GF2Field.MASK, null);
    }

    public static /* synthetic */ State b(State state, hz.b bVar, iy.b0 b0Var, iy.b0 b0Var2, boolean z15, boolean z16, boolean z17, boolean z18, c0 c0Var, int i15, Object obj) {
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
            z15 = state.isGdprCheckboxChecked;
        }
        if ((i15 & 16) != 0) {
            z16 = state.isGdprCheckboxVisible;
        }
        if ((i15 & 32) != 0) {
            z17 = state.isSameErrorActive;
        }
        if ((i15 & 64) != 0) {
            z18 = state.showCheckBoxValidationError;
        }
        if ((i15 & 128) != 0) {
            c0Var = state.scrollToError;
        }
        boolean z19 = z18;
        c0 c0Var2 = c0Var;
        boolean z25 = z16;
        boolean z26 = z17;
        return state.a(bVar, b0Var, b0Var2, z15, z25, z26, z19, c0Var2);
    }

    public final State a(hz.b emailValidationState, iy.b0 email, iy.b0 previousEmail, boolean isGdprCheckboxChecked, boolean isGdprCheckboxVisible, boolean isSameErrorActive, boolean showCheckBoxValidationError, c0 scrollToError) {
        return new State(emailValidationState, email, previousEmail, isGdprCheckboxChecked, isGdprCheckboxVisible, isSameErrorActive, showCheckBoxValidationError, scrollToError);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final iy.b0 getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final hz.b getEmailValidationState() {
        return this.emailValidationState;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final c0 getScrollToError() {
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
        return fr.t.c(this.emailValidationState, state.emailValidationState) && fr.t.c(this.email, state.email) && fr.t.c(this.previousEmail, state.previousEmail) && this.isGdprCheckboxChecked == state.isGdprCheckboxChecked && this.isGdprCheckboxVisible == state.isGdprCheckboxVisible && this.isSameErrorActive == state.isSameErrorActive && this.showCheckBoxValidationError == state.showCheckBoxValidationError && this.scrollToError == state.scrollToError;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getShowCheckBoxValidationError() {
        return this.showCheckBoxValidationError;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsEmailSameAsPrevious() {
        return this.isEmailSameAsPrevious;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsGdprCheckboxChecked() {
        return this.isGdprCheckboxChecked;
    }

    public int hashCode() {
        int iHashCode = ((this.emailValidationState.hashCode() * 31) + this.email.hashCode()) * 31;
        iy.b0 b0Var = this.previousEmail;
        int iHashCode2 = (((((((((iHashCode + (b0Var == null ? 0 : b0Var.hashCode())) * 31) + Boolean.hashCode(this.isGdprCheckboxChecked)) * 31) + Boolean.hashCode(this.isGdprCheckboxVisible)) * 31) + Boolean.hashCode(this.isSameErrorActive)) * 31) + Boolean.hashCode(this.showCheckBoxValidationError)) * 31;
        c0 c0Var = this.scrollToError;
        return iHashCode2 + (c0Var != null ? c0Var.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsGdprCheckboxVisible() {
        return this.isGdprCheckboxVisible;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getIsSameError() {
        return this.isSameError;
    }

    public String toString() {
        return "State(emailValidationState=" + this.emailValidationState + ", email=" + this.email + ", previousEmail=" + this.previousEmail + ", isGdprCheckboxChecked=" + this.isGdprCheckboxChecked + ", isGdprCheckboxVisible=" + this.isGdprCheckboxVisible + ", isSameErrorActive=" + this.isSameErrorActive + ", showCheckBoxValidationError=" + this.showCheckBoxValidationError + ", scrollToError=" + this.scrollToError + ')';
    }

    public State(hz.b bVar, iy.b0 b0Var, iy.b0 b0Var2, boolean z15, boolean z16, boolean z17, boolean z18, c0 c0Var) {
        this.emailValidationState = bVar;
        this.email = b0Var;
        this.previousEmail = b0Var2;
        this.isGdprCheckboxChecked = z15;
        this.isGdprCheckboxVisible = z16;
        this.isSameErrorActive = z17;
        this.showCheckBoxValidationError = z18;
        this.scrollToError = c0Var;
        boolean zC = fr.t.c(fu.r.u1(iy.c0.e(b0Var)).toString(), b0Var2 != null ? iy.c0.e(b0Var2) : null);
        this.isEmailSameAsPrevious = zC;
        this.isSameError = zC && z17;
    }

    public /* synthetic */ State(hz.b bVar, iy.b0 b0Var, iy.b0 b0Var2, boolean z15, boolean z16, boolean z17, boolean z18, c0 c0Var, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? hz.b.d.f86848c : bVar, (i15 & 2) != 0 ? iy.b0.INSTANCE.a() : b0Var, (i15 & 4) != 0 ? null : b0Var2, (i15 & 8) != 0 ? false : z15, (i15 & 16) != 0 ? false : z16, (i15 & 32) != 0 ? false : z17, (i15 & 64) != 0 ? false : z18, (i15 & 128) != 0 ? null : c0Var);
    }
}
