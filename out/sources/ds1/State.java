package ds1;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: ds1.f, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\n¨\u0006\u0016"}, d2 = {"Lds1/f;", "", "", "currentAppVersion", "inputValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "(Ljava/lang/String;Ljava/lang/String;)Lds1/f;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "b", "d", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String currentAppVersion;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String inputValue;

    public State(String str, String str2) {
        this.currentAppVersion = str;
        this.inputValue = str2;
    }

    public static /* synthetic */ State b(State state, String str, String str2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = state.currentAppVersion;
        }
        if ((i15 & 2) != 0) {
            str2 = state.inputValue;
        }
        return state.a(str, str2);
    }

    public final State a(String currentAppVersion, String inputValue) {
        return new State(currentAppVersion, inputValue);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCurrentAppVersion() {
        return this.currentAppVersion;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getInputValue() {
        return this.inputValue;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return fr.t.c(this.currentAppVersion, state.currentAppVersion) && fr.t.c(this.inputValue, state.inputValue);
    }

    public int hashCode() {
        return (this.currentAppVersion.hashCode() * 31) + this.inputValue.hashCode();
    }

    public String toString() {
        return "State(currentAppVersion=" + this.currentAppVersion + ", inputValue=" + this.inputValue + ')';
    }
}
