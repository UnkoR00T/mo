package y71;

import fr.t;
import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: y71.c, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ8\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001d\u0010\u001c¨\u0006\u001f"}, d2 = {"Ly71/c;", "", "Ld81/b;", "splitType", "Liy/b0;", "topLine", "originalBottomLine", "modifiedBottomLine", "<init>", "(Ld81/b;Liy/b0;Liy/b0;Liy/b0;)V", "a", "(Ld81/b;Liy/b0;Liy/b0;Liy/b0;)Ly71/c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ld81/b;", "e", "()Ld81/b;", "b", "Liy/b0;", "f", "()Liy/b0;", "c", "d", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f225216e = b0.f97726c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final d81.b splitType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 topLine;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 originalBottomLine;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 modifiedBottomLine;

    public State(d81.b bVar, b0 b0Var, b0 b0Var2, b0 b0Var3) {
        this.splitType = bVar;
        this.topLine = b0Var;
        this.originalBottomLine = b0Var2;
        this.modifiedBottomLine = b0Var3;
    }

    public static /* synthetic */ State b(State state, d81.b bVar, b0 b0Var, b0 b0Var2, b0 b0Var3, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            bVar = state.splitType;
        }
        if ((i15 & 2) != 0) {
            b0Var = state.topLine;
        }
        if ((i15 & 4) != 0) {
            b0Var2 = state.originalBottomLine;
        }
        if ((i15 & 8) != 0) {
            b0Var3 = state.modifiedBottomLine;
        }
        return state.a(bVar, b0Var, b0Var2, b0Var3);
    }

    public final State a(d81.b splitType, b0 topLine, b0 originalBottomLine, b0 modifiedBottomLine) {
        return new State(splitType, topLine, originalBottomLine, modifiedBottomLine);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b0 getModifiedBottomLine() {
        return this.modifiedBottomLine;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b0 getOriginalBottomLine() {
        return this.originalBottomLine;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final d81.b getSplitType() {
        return this.splitType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return this.splitType == state.splitType && t.c(this.topLine, state.topLine) && t.c(this.originalBottomLine, state.originalBottomLine) && t.c(this.modifiedBottomLine, state.modifiedBottomLine);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final b0 getTopLine() {
        return this.topLine;
    }

    public int hashCode() {
        return (((((this.splitType.hashCode() * 31) + this.topLine.hashCode()) * 31) + this.originalBottomLine.hashCode()) * 31) + this.modifiedBottomLine.hashCode();
    }

    public String toString() {
        return "State(splitType=" + this.splitType + ", topLine=" + this.topLine + ", originalBottomLine=" + this.originalBottomLine + ", modifiedBottomLine=" + this.modifiedBottomLine + ')';
    }
}
