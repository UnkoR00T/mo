package zr1;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: zr1.d, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ0\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u0019\u0010\f¨\u0006\u001a"}, d2 = {"Lzr1/d;", "", "", "url", "", "isSending", "result", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "a", "(Ljava/lang/String;ZLjava/lang/String;)Lzr1/d;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "d", "b", "Z", "e", "()Z", "c", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String url;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSending;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String result;

    public State(String str, boolean z15, String str2) {
        this.url = str;
        this.isSending = z15;
        this.result = str2;
    }

    public static /* synthetic */ State b(State state, String str, boolean z15, String str2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = state.url;
        }
        if ((i15 & 2) != 0) {
            z15 = state.isSending;
        }
        if ((i15 & 4) != 0) {
            str2 = state.result;
        }
        return state.a(str, z15, str2);
    }

    public final State a(String url, boolean isSending, String result) {
        return new State(url, isSending, result);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getResult() {
        return this.result;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsSending() {
        return this.isSending;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return fr.t.c(this.url, state.url) && this.isSending == state.isSending && fr.t.c(this.result, state.result);
    }

    public int hashCode() {
        int iHashCode = ((this.url.hashCode() * 31) + Boolean.hashCode(this.isSending)) * 31;
        String str = this.result;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "State(url=" + this.url + ", isSending=" + this.isSending + ", result=" + this.result + ')';
    }
}
