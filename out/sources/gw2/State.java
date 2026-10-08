package gw2;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: gw2.m, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, d2 = {"Lgw2/m;", "", "Lgw2/n;", "coveringFaceState", "glassesState", "Lgw2/l;", "bottomSheetState", "<init>", "(Lgw2/n;Lgw2/n;Lgw2/l;)V", "a", "(Lgw2/n;Lgw2/n;Lgw2/l;)Lgw2/m;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lgw2/n;", "d", "()Lgw2/n;", "b", "e", "c", "Lgw2/l;", "()Lgw2/l;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final UploaderState coveringFaceState;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final UploaderState glassesState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final l bottomSheetState;

    public State(UploaderState uploaderState, UploaderState uploaderState2, l lVar) {
        this.coveringFaceState = uploaderState;
        this.glassesState = uploaderState2;
        this.bottomSheetState = lVar;
    }

    public static /* synthetic */ State b(State state, UploaderState uploaderState, UploaderState uploaderState2, l lVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            uploaderState = state.coveringFaceState;
        }
        if ((i15 & 2) != 0) {
            uploaderState2 = state.glassesState;
        }
        if ((i15 & 4) != 0) {
            lVar = state.bottomSheetState;
        }
        return state.a(uploaderState, uploaderState2, lVar);
    }

    public final State a(UploaderState coveringFaceState, UploaderState glassesState, l bottomSheetState) {
        return new State(coveringFaceState, glassesState, bottomSheetState);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final l getBottomSheetState() {
        return this.bottomSheetState;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final UploaderState getCoveringFaceState() {
        return this.coveringFaceState;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final UploaderState getGlassesState() {
        return this.glassesState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return fr.t.c(this.coveringFaceState, state.coveringFaceState) && fr.t.c(this.glassesState, state.glassesState) && fr.t.c(this.bottomSheetState, state.bottomSheetState);
    }

    public int hashCode() {
        return (((this.coveringFaceState.hashCode() * 31) + this.glassesState.hashCode()) * 31) + this.bottomSheetState.hashCode();
    }

    public String toString() {
        return "State(coveringFaceState=" + this.coveringFaceState + ", glassesState=" + this.glassesState + ", bottomSheetState=" + this.bottomSheetState + ')';
    }

    public /* synthetic */ State(UploaderState uploaderState, UploaderState uploaderState2, l lVar, int i15, fr.k kVar) {
        this(uploaderState, uploaderState2, (i15 & 4) != 0 ? l.a.f78005a : lVar);
    }
}
