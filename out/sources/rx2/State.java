package rx2;

import al0.b0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: rx2.b, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ8\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001d\u0010\u001b¨\u0006\u001e"}, d2 = {"Lrx2/b;", "", "Lal0/b0;", "data", "", "isStatementChecked", "showStatementError", "scrollToStatement", "<init>", "(Lal0/b0;ZZZ)V", "a", "(Lal0/b0;ZZZ)Lrx2/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lal0/b0;", "c", "()Lal0/b0;", "b", "Z", "f", "()Z", "e", "d", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 data;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isStatementChecked;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean showStatementError;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean scrollToStatement;

    public State(b0 b0Var, boolean z15, boolean z16, boolean z17) {
        this.data = b0Var;
        this.isStatementChecked = z15;
        this.showStatementError = z16;
        this.scrollToStatement = z17;
    }

    public static /* synthetic */ State b(State state, b0 b0Var, boolean z15, boolean z16, boolean z17, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            b0Var = state.data;
        }
        if ((i15 & 2) != 0) {
            z15 = state.isStatementChecked;
        }
        if ((i15 & 4) != 0) {
            z16 = state.showStatementError;
        }
        if ((i15 & 8) != 0) {
            z17 = state.scrollToStatement;
        }
        return state.a(b0Var, z15, z16, z17);
    }

    public final State a(b0 data, boolean isStatementChecked, boolean showStatementError, boolean scrollToStatement) {
        return new State(data, isStatementChecked, showStatementError, scrollToStatement);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b0 getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getScrollToStatement() {
        return this.scrollToStatement;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getShowStatementError() {
        return this.showStatementError;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return fr.t.c(this.data, state.data) && this.isStatementChecked == state.isStatementChecked && this.showStatementError == state.showStatementError && this.scrollToStatement == state.scrollToStatement;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsStatementChecked() {
        return this.isStatementChecked;
    }

    public int hashCode() {
        return (((((this.data.hashCode() * 31) + Boolean.hashCode(this.isStatementChecked)) * 31) + Boolean.hashCode(this.showStatementError)) * 31) + Boolean.hashCode(this.scrollToStatement);
    }

    public String toString() {
        return "State(data=" + this.data + ", isStatementChecked=" + this.isStatementChecked + ", showStatementError=" + this.showStatementError + ", scrollToStatement=" + this.scrollToStatement + ')';
    }

    public /* synthetic */ State(b0 b0Var, boolean z15, boolean z16, boolean z17, int i15, fr.k kVar) {
        this(b0Var, (i15 & 2) != 0 ? false : z15, (i15 & 4) != 0 ? false : z16, (i15 & 8) != 0 ? false : z17);
    }
}
