package dv3;

import fr.t;
import o20.s2;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: dv3.c, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Ldv3/c;", "", "Lbv3/c;", "setupData", "Ldv3/r;", "animationsState", "Lo20/s2;", "documentVMS", "<init>", "(Lbv3/c;Ldv3/r;Lo20/s2;)V", "a", "(Lbv3/c;Ldv3/r;Lo20/s2;)Ldv3/c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbv3/c;", "e", "()Lbv3/c;", "b", "Ldv3/r;", "c", "()Ldv3/r;", "Lo20/s2;", "d", "()Lo20/s2;", "documentcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final bv3.c setupData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final r animationsState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final s2 documentVMS;

    public State(bv3.c cVar, r rVar, s2 s2Var) {
        this.setupData = cVar;
        this.animationsState = rVar;
        this.documentVMS = s2Var;
    }

    public static /* synthetic */ State b(State state, bv3.c cVar, r rVar, s2 s2Var, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            cVar = state.setupData;
        }
        if ((i15 & 2) != 0) {
            rVar = state.animationsState;
        }
        if ((i15 & 4) != 0) {
            s2Var = state.documentVMS;
        }
        return state.a(cVar, rVar, s2Var);
    }

    public final State a(bv3.c setupData, r animationsState, s2 documentVMS) {
        return new State(setupData, animationsState, documentVMS);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final r getAnimationsState() {
        return this.animationsState;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final s2 getDocumentVMS() {
        return this.documentVMS;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final bv3.c getSetupData() {
        return this.setupData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return t.c(this.setupData, state.setupData) && t.c(this.animationsState, state.animationsState) && t.c(this.documentVMS, state.documentVMS);
    }

    public int hashCode() {
        return (((this.setupData.hashCode() * 31) + this.animationsState.hashCode()) * 31) + this.documentVMS.hashCode();
    }

    public String toString() {
        return "State(setupData=" + this.setupData + ", animationsState=" + this.animationsState + ", documentVMS=" + this.documentVMS + ')';
    }
}
