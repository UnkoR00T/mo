package to1;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: to1.g, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\n¨\u0006\u0016"}, d2 = {"Lto1/g;", "", "", "observedIds", "lastLog", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "(Ljava/lang/String;Ljava/lang/String;)Lto1/g;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "d", "b", "c", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String observedIds;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String lastLog;

    /* JADX WARN: Multi-variable type inference failed */
    public State() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ State b(State state, String str, String str2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = state.observedIds;
        }
        if ((i15 & 2) != 0) {
            str2 = state.lastLog;
        }
        return state.a(str, str2);
    }

    public final State a(String observedIds, String lastLog) {
        return new State(observedIds, lastLog);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getLastLog() {
        return this.lastLog;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getObservedIds() {
        return this.observedIds;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return fr.t.c(this.observedIds, state.observedIds) && fr.t.c(this.lastLog, state.lastLog);
    }

    public int hashCode() {
        return (this.observedIds.hashCode() * 31) + this.lastLog.hashCode();
    }

    public String toString() {
        return "State(observedIds=" + this.observedIds + ", lastLog=" + this.lastLog + ')';
    }

    public State(String str, String str2) {
        this.observedIds = str;
        this.lastLog = str2;
    }

    public /* synthetic */ State(String str, String str2, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? "" : str, (i15 & 2) != 0 ? "" : str2);
    }
}
