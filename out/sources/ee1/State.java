package ee1;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: ee1.g, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lee1/g;", "", "Lwx/i$b;", "pickedFile", "", "validated", "<init>", "(Lwx/i$b;Z)V", "a", "(Lwx/i$b;Z)Lee1/g;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lwx/i$b;", "c", "()Lwx/i$b;", "b", "Z", "d", "()Z", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f49600c = wx.i.Regular.f215742c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final wx.i.Regular pickedFile;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean validated;

    /* JADX WARN: Multi-variable type inference failed */
    public State() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ State b(State state, wx.i.Regular regular, boolean z15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            regular = state.pickedFile;
        }
        if ((i15 & 2) != 0) {
            z15 = state.validated;
        }
        return state.a(regular, z15);
    }

    public final State a(wx.i.Regular pickedFile, boolean validated) {
        return new State(pickedFile, validated);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final wx.i.Regular getPickedFile() {
        return this.pickedFile;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getValidated() {
        return this.validated;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return fr.t.c(this.pickedFile, state.pickedFile) && this.validated == state.validated;
    }

    public int hashCode() {
        wx.i.Regular regular = this.pickedFile;
        return ((regular == null ? 0 : regular.hashCode()) * 31) + Boolean.hashCode(this.validated);
    }

    public String toString() {
        return "State(pickedFile=" + this.pickedFile + ", validated=" + this.validated + ')';
    }

    public State(wx.i.Regular regular, boolean z15) {
        this.pickedFile = regular;
        this.validated = z15;
    }

    public /* synthetic */ State(wx.i.Regular regular, boolean z15, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : regular, (i15 & 2) != 0 ? false : z15);
    }
}
