package bc1;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: bc1.e, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lbc1/e;", "", "Lkb1/a;", "companyPlaceAnswer", "Lhb1/c;", "homeAddress", "<init>", "(Lkb1/a;Lhb1/c;)V", "a", "(Lkb1/a;Lhb1/c;)Lbc1/e;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkb1/a;", "c", "()Lkb1/a;", "b", "Lhb1/c;", "d", "()Lhb1/c;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final kb1.a companyPlaceAnswer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final hb1.c homeAddress;

    public State(kb1.a aVar, hb1.c cVar) {
        this.companyPlaceAnswer = aVar;
        this.homeAddress = cVar;
    }

    public static /* synthetic */ State b(State state, kb1.a aVar, hb1.c cVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            aVar = state.companyPlaceAnswer;
        }
        if ((i15 & 2) != 0) {
            cVar = state.homeAddress;
        }
        return state.a(aVar, cVar);
    }

    public final State a(kb1.a companyPlaceAnswer, hb1.c homeAddress) {
        return new State(companyPlaceAnswer, homeAddress);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final kb1.a getCompanyPlaceAnswer() {
        return this.companyPlaceAnswer;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final hb1.c getHomeAddress() {
        return this.homeAddress;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return this.companyPlaceAnswer == state.companyPlaceAnswer && t.c(this.homeAddress, state.homeAddress);
    }

    public int hashCode() {
        kb1.a aVar = this.companyPlaceAnswer;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        hb1.c cVar = this.homeAddress;
        return iHashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    public String toString() {
        return "State(companyPlaceAnswer=" + this.companyPlaceAnswer + ", homeAddress=" + this.homeAddress + ')';
    }
}
