package qa0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: qa0.b, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lqa0/b;", "", "Lcb4/i;", "dialogVMSAdapter", "Lpb4/e;", "biometricStatus", "<init>", "(Lcb4/i;Lpb4/e;)V", "a", "(Lcb4/i;Lpb4/e;)Lqa0/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcb4/i;", "d", "()Lcb4/i;", "b", "Lpb4/e;", "c", "()Lpb4/e;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final cb4.i dialogVMSAdapter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final pb4.e biometricStatus;

    /* JADX WARN: Multi-variable type inference failed */
    public State() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ State b(State state, cb4.i iVar, pb4.e eVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            iVar = state.dialogVMSAdapter;
        }
        if ((i15 & 2) != 0) {
            eVar = state.biometricStatus;
        }
        return state.a(iVar, eVar);
    }

    public final State a(cb4.i dialogVMSAdapter, pb4.e biometricStatus) {
        return new State(dialogVMSAdapter, biometricStatus);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final pb4.e getBiometricStatus() {
        return this.biometricStatus;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final cb4.i getDialogVMSAdapter() {
        return this.dialogVMSAdapter;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return fr.t.c(this.dialogVMSAdapter, state.dialogVMSAdapter) && fr.t.c(this.biometricStatus, state.biometricStatus);
    }

    public int hashCode() {
        cb4.i iVar = this.dialogVMSAdapter;
        return ((iVar == null ? 0 : iVar.hashCode()) * 31) + this.biometricStatus.hashCode();
    }

    public String toString() {
        return "State(dialogVMSAdapter=" + this.dialogVMSAdapter + ", biometricStatus=" + this.biometricStatus + ')';
    }

    public State(cb4.i iVar, pb4.e eVar) {
        this.dialogVMSAdapter = iVar;
        this.biometricStatus = eVar;
    }

    public /* synthetic */ State(cb4.i iVar, pb4.e eVar, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : iVar, (i15 & 2) != 0 ? pb4.e.a.C3815a.f154090a : eVar);
    }
}
