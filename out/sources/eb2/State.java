package eb2;

import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: eb2.f, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Leb2/f;", "", "Liy/b0;", "applicationNumber", "Lhz/b;", "validationState", "", "scrollToField", "<init>", "(Liy/b0;Lhz/b;Z)V", "a", "(Liy/b0;Lhz/b;Z)Leb2/f;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Liy/b0;", "c", "()Liy/b0;", "b", "Lhz/b;", "e", "()Lhz/b;", "Z", "d", "()Z", "idcardcollecting_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f49201d = hz.b.f86845b | b0.f97726c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 applicationNumber;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final hz.b validationState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean scrollToField;

    public State() {
        this(null, null, false, 7, null);
    }

    public static /* synthetic */ State b(State state, b0 b0Var, hz.b bVar, boolean z15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            b0Var = state.applicationNumber;
        }
        if ((i15 & 2) != 0) {
            bVar = state.validationState;
        }
        if ((i15 & 4) != 0) {
            z15 = state.scrollToField;
        }
        return state.a(b0Var, bVar, z15);
    }

    public final State a(b0 applicationNumber, hz.b validationState, boolean scrollToField) {
        return new State(applicationNumber, validationState, scrollToField);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b0 getApplicationNumber() {
        return this.applicationNumber;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getScrollToField() {
        return this.scrollToField;
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
        return fr.t.c(this.applicationNumber, state.applicationNumber) && fr.t.c(this.validationState, state.validationState) && this.scrollToField == state.scrollToField;
    }

    public int hashCode() {
        return (((this.applicationNumber.hashCode() * 31) + this.validationState.hashCode()) * 31) + Boolean.hashCode(this.scrollToField);
    }

    public String toString() {
        return "State(applicationNumber=" + this.applicationNumber + ", validationState=" + this.validationState + ", scrollToField=" + this.scrollToField + ')';
    }

    public State(b0 b0Var, hz.b bVar, boolean z15) {
        this.applicationNumber = b0Var;
        this.validationState = bVar;
        this.scrollToField = z15;
    }

    public /* synthetic */ State(b0 b0Var, hz.b bVar, boolean z15, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? b0.INSTANCE.a() : b0Var, (i15 & 2) != 0 ? hz.b.d.f86848c : bVar, (i15 & 4) != 0 ? false : z15);
    }
}
