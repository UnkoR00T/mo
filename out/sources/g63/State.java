package g63;

import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: g63.c, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJL\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010$\u001a\u0004\b \u0010\u0012R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u0019\u001a\u0004\b(\u0010\u001b¨\u0006)"}, d2 = {"Lg63/c;", "", "", "skipConfirmation", "Li63/a;", "codeMode", "Li63/b;", "type", "", "code", "Lhz/b;", "codeValidationState", "scrollToError", "<init>", "(ZLi63/a;Li63/b;Ljava/lang/String;Lhz/b;Z)V", "a", "(ZLi63/a;Li63/b;Ljava/lang/String;Lhz/b;Z)Lg63/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "g", "()Z", "b", "Li63/a;", "d", "()Li63/a;", "c", "Li63/b;", "h", "()Li63/b;", "Ljava/lang/String;", "e", "Lhz/b;", "()Lhz/b;", "f", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f70943g = hz.b.f86845b | b0.f97726c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean skipConfirmation;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final i63.a codeMode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final i63.b type;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String code;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final hz.b codeValidationState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean scrollToError;

    public State(boolean z15, i63.a aVar, i63.b bVar, String str, hz.b bVar2, boolean z16) {
        this.skipConfirmation = z15;
        this.codeMode = aVar;
        this.type = bVar;
        this.code = str;
        this.codeValidationState = bVar2;
        this.scrollToError = z16;
    }

    public static /* synthetic */ State b(State state, boolean z15, i63.a aVar, i63.b bVar, String str, hz.b bVar2, boolean z16, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = state.skipConfirmation;
        }
        if ((i15 & 2) != 0) {
            aVar = state.codeMode;
        }
        if ((i15 & 4) != 0) {
            bVar = state.type;
        }
        if ((i15 & 8) != 0) {
            str = state.code;
        }
        if ((i15 & 16) != 0) {
            bVar2 = state.codeValidationState;
        }
        if ((i15 & 32) != 0) {
            z16 = state.scrollToError;
        }
        hz.b bVar3 = bVar2;
        boolean z17 = z16;
        return state.a(z15, aVar, bVar, str, bVar3, z17);
    }

    public final State a(boolean skipConfirmation, i63.a codeMode, i63.b type, String code, hz.b codeValidationState, boolean scrollToError) {
        return new State(skipConfirmation, codeMode, type, code, codeValidationState, scrollToError);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final i63.a getCodeMode() {
        return this.codeMode;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final hz.b getCodeValidationState() {
        return this.codeValidationState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return this.skipConfirmation == state.skipConfirmation && this.codeMode == state.codeMode && fr.t.c(this.type, state.type) && fr.t.c(this.code, state.code) && fr.t.c(this.codeValidationState, state.codeValidationState) && this.scrollToError == state.scrollToError;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getScrollToError() {
        return this.scrollToError;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getSkipConfirmation() {
        return this.skipConfirmation;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final i63.b getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.skipConfirmation) * 31) + this.codeMode.hashCode()) * 31) + this.type.hashCode()) * 31) + this.code.hashCode()) * 31) + this.codeValidationState.hashCode()) * 31) + Boolean.hashCode(this.scrollToError);
    }

    public String toString() {
        return "State(skipConfirmation=" + this.skipConfirmation + ", codeMode=" + this.codeMode + ", type=" + this.type + ", code=" + this.code + ", codeValidationState=" + this.codeValidationState + ", scrollToError=" + this.scrollToError + ')';
    }

    public /* synthetic */ State(boolean z15, i63.a aVar, i63.b bVar, String str, hz.b bVar2, boolean z16, int i15, fr.k kVar) {
        this(z15, aVar, bVar, str, (i15 & 16) != 0 ? hz.b.C2039b.f86846c : bVar2, (i15 & 32) != 0 ? false : z16);
    }
}
