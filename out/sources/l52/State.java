package l52;

import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: l52.b, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJL\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001e\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b#\u0010\u001d¨\u0006$"}, d2 = {"Ll52/b;", "", "", "firstName", "Lhz/b;", "firstNameValidationState", "lastName", "lastNameValidationState", "Lxw/g;", "pesel", "peselValidationState", "<init>", "(Ljava/lang/String;Lhz/b;Ljava/lang/String;Lhz/b;Liy/b0;Lhz/b;Lfr/k;)V", "a", "(Ljava/lang/String;Lhz/b;Ljava/lang/String;Lhz/b;Liy/b0;Lhz/b;)Ll52/b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "b", "Lhz/b;", "d", "()Lhz/b;", "e", "f", "Liy/b0;", "g", "()Liy/b0;", "h", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f116185g;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String firstName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final hz.b firstNameValidationState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String lastName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final hz.b lastNameValidationState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 pesel;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final hz.b peselValidationState;

    static {
        int i15 = hz.b.f86845b;
        f116185g = i15 | b0.f97726c | i15 | i15;
    }

    public /* synthetic */ State(String str, hz.b bVar, String str2, hz.b bVar2, b0 b0Var, hz.b bVar3, fr.k kVar) {
        this(str, bVar, str2, bVar2, b0Var, bVar3);
    }

    public static /* synthetic */ State b(State state, String str, hz.b bVar, String str2, hz.b bVar2, b0 b0Var, hz.b bVar3, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = state.firstName;
        }
        if ((i15 & 2) != 0) {
            bVar = state.firstNameValidationState;
        }
        if ((i15 & 4) != 0) {
            str2 = state.lastName;
        }
        if ((i15 & 8) != 0) {
            bVar2 = state.lastNameValidationState;
        }
        if ((i15 & 16) != 0) {
            b0Var = state.pesel;
        }
        if ((i15 & 32) != 0) {
            bVar3 = state.peselValidationState;
        }
        b0 b0Var2 = b0Var;
        hz.b bVar4 = bVar3;
        return state.a(str, bVar, str2, bVar2, b0Var2, bVar4);
    }

    public final State a(String firstName, hz.b firstNameValidationState, String lastName, hz.b lastNameValidationState, b0 pesel, hz.b peselValidationState) {
        return new State(firstName, firstNameValidationState, lastName, lastNameValidationState, pesel, peselValidationState, null);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final hz.b getFirstNameValidationState() {
        return this.firstNameValidationState;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return fr.t.c(this.firstName, state.firstName) && fr.t.c(this.firstNameValidationState, state.firstNameValidationState) && fr.t.c(this.lastName, state.lastName) && fr.t.c(this.lastNameValidationState, state.lastNameValidationState) && xw.g.f(this.pesel, state.pesel) && fr.t.c(this.peselValidationState, state.peselValidationState);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final hz.b getLastNameValidationState() {
        return this.lastNameValidationState;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final b0 getPesel() {
        return this.pesel;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final hz.b getPeselValidationState() {
        return this.peselValidationState;
    }

    public int hashCode() {
        return (((((((((this.firstName.hashCode() * 31) + this.firstNameValidationState.hashCode()) * 31) + this.lastName.hashCode()) * 31) + this.lastNameValidationState.hashCode()) * 31) + xw.g.h(this.pesel)) * 31) + this.peselValidationState.hashCode();
    }

    public String toString() {
        return "State(firstName=" + this.firstName + ", firstNameValidationState=" + this.firstNameValidationState + ", lastName=" + this.lastName + ", lastNameValidationState=" + this.lastNameValidationState + ", pesel=" + ((Object) xw.g.i(this.pesel)) + ", peselValidationState=" + this.peselValidationState + ')';
    }

    private State(String str, hz.b bVar, String str2, hz.b bVar2, b0 b0Var, hz.b bVar3) {
        this.firstName = str;
        this.firstNameValidationState = bVar;
        this.lastName = str2;
        this.lastNameValidationState = bVar2;
        this.pesel = b0Var;
        this.peselValidationState = bVar3;
    }
}
