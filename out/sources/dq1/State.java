package dq1;

import java.util.ArrayList;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: dq1.z, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Ldq1/z;", "", "", "Ldq1/b0;", "files", "", "showError", "<init>", "(Ljava/util/List;Z)V", "a", "(Ljava/util/List;Z)Ldq1/z;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Z", "d", "()Z", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<b0> files;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean showError;

    /* JADX WARN: Multi-variable type inference failed */
    public State() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ State b(State state, List list, boolean z15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            list = state.files;
        }
        if ((i15 & 2) != 0) {
            z15 = state.showError;
        }
        return state.a(list, z15);
    }

    public final State a(List<b0> files, boolean showError) {
        return new State(files, showError);
    }

    public final List<b0> c() {
        return this.files;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getShowError() {
        return this.showError;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return fr.t.c(this.files, state.files) && this.showError == state.showError;
    }

    public int hashCode() {
        return (this.files.hashCode() * 31) + Boolean.hashCode(this.showError);
    }

    public String toString() {
        return "State(files=" + this.files + ", showError=" + this.showError + ')';
    }

    public State(List<b0> list, boolean z15) {
        this.files = list;
        this.showError = z15;
    }

    public /* synthetic */ State(List list, boolean z15, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? new ArrayList() : list, (i15 & 2) != 0 ? false : z15);
    }
}
