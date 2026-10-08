package b63;

import fr.t;
import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: b63.b, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lb63/b;", "", "Liy/b0;", "password", "pin", "Ld63/d;", "selectLoginMethodType", "<init>", "(Liy/b0;Liy/b0;Ld63/d;)V", "a", "(Liy/b0;Liy/b0;Ld63/d;)Lb63/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Liy/b0;", "c", "()Liy/b0;", "b", "d", "Ld63/d;", "e", "()Ld63/d;", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f16895d = b0.f97726c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 password;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 pin;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final d63.d selectLoginMethodType;

    public State(b0 b0Var, b0 b0Var2, d63.d dVar) {
        this.password = b0Var;
        this.pin = b0Var2;
        this.selectLoginMethodType = dVar;
    }

    public static /* synthetic */ State b(State state, b0 b0Var, b0 b0Var2, d63.d dVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            b0Var = state.password;
        }
        if ((i15 & 2) != 0) {
            b0Var2 = state.pin;
        }
        if ((i15 & 4) != 0) {
            dVar = state.selectLoginMethodType;
        }
        return state.a(b0Var, b0Var2, dVar);
    }

    public final State a(b0 password, b0 pin, d63.d selectLoginMethodType) {
        return new State(password, pin, selectLoginMethodType);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b0 getPassword() {
        return this.password;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b0 getPin() {
        return this.pin;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final d63.d getSelectLoginMethodType() {
        return this.selectLoginMethodType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return t.c(this.password, state.password) && t.c(this.pin, state.pin) && this.selectLoginMethodType == state.selectLoginMethodType;
    }

    public int hashCode() {
        return (((this.password.hashCode() * 31) + this.pin.hashCode()) * 31) + this.selectLoginMethodType.hashCode();
    }

    public String toString() {
        return "State(password=" + this.password + ", pin=" + this.pin + ", selectLoginMethodType=" + this.selectLoginMethodType + ')';
    }

    public /* synthetic */ State(b0 b0Var, b0 b0Var2, d63.d dVar, int i15, fr.k kVar) {
        this(b0Var, b0Var2, (i15 & 4) != 0 ? d63.d.NONE : dVar);
    }
}
