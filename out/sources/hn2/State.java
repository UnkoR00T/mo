package hn2;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: hn2.d, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lhn2/d;", "", "", "maliciousWebsiteAddress", "Lhz/b;", "validationState", "<init>", "(Ljava/lang/String;Lhz/b;)V", "a", "(Ljava/lang/String;Lhz/b;)Lhn2/d;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "b", "Lhz/b;", "d", "()Lhz/b;", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f85859c = hz.b.f86845b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String maliciousWebsiteAddress;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final hz.b validationState;

    public State(String str, hz.b bVar) {
        this.maliciousWebsiteAddress = str;
        this.validationState = bVar;
    }

    public static /* synthetic */ State b(State state, String str, hz.b bVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = state.maliciousWebsiteAddress;
        }
        if ((i15 & 2) != 0) {
            bVar = state.validationState;
        }
        return state.a(str, bVar);
    }

    public final State a(String maliciousWebsiteAddress, hz.b validationState) {
        return new State(maliciousWebsiteAddress, validationState);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getMaliciousWebsiteAddress() {
        return this.maliciousWebsiteAddress;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
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
        return fr.t.c(this.maliciousWebsiteAddress, state.maliciousWebsiteAddress) && fr.t.c(this.validationState, state.validationState);
    }

    public int hashCode() {
        return (this.maliciousWebsiteAddress.hashCode() * 31) + this.validationState.hashCode();
    }

    public String toString() {
        return "State(maliciousWebsiteAddress=" + this.maliciousWebsiteAddress + ", validationState=" + this.validationState + ')';
    }
}
