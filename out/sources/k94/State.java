package k94;

import j94.PartialBehaviourGrade;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: k94.q, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ2\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lk94/q;", "", "Lh94/a;", "featureConfig", "", "studentId", "Lj94/f;", "selectedGrade", "<init>", "(Lh94/a;Ljava/lang/String;Lj94/f;)V", "a", "(Lh94/a;Ljava/lang/String;Lj94/f;)Lk94/q;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lh94/a;", "c", "()Lh94/a;", "b", "Ljava/lang/String;", "e", "Lj94/f;", "d", "()Lj94/f;", "schoolbehavior_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final h94.a featureConfig;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String studentId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final PartialBehaviourGrade selectedGrade;

    public State(h94.a aVar, String str, PartialBehaviourGrade partialBehaviourGrade) {
        this.featureConfig = aVar;
        this.studentId = str;
        this.selectedGrade = partialBehaviourGrade;
    }

    public static /* synthetic */ State b(State state, h94.a aVar, String str, PartialBehaviourGrade partialBehaviourGrade, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            aVar = state.featureConfig;
        }
        if ((i15 & 2) != 0) {
            str = state.studentId;
        }
        if ((i15 & 4) != 0) {
            partialBehaviourGrade = state.selectedGrade;
        }
        return state.a(aVar, str, partialBehaviourGrade);
    }

    public final State a(h94.a featureConfig, String studentId, PartialBehaviourGrade selectedGrade) {
        return new State(featureConfig, studentId, selectedGrade);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final h94.a getFeatureConfig() {
        return this.featureConfig;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final PartialBehaviourGrade getSelectedGrade() {
        return this.selectedGrade;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getStudentId() {
        return this.studentId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return this.featureConfig == state.featureConfig && fr.t.c(this.studentId, state.studentId) && fr.t.c(this.selectedGrade, state.selectedGrade);
    }

    public int hashCode() {
        int iHashCode = this.featureConfig.hashCode() * 31;
        String str = this.studentId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        PartialBehaviourGrade partialBehaviourGrade = this.selectedGrade;
        return iHashCode2 + (partialBehaviourGrade != null ? partialBehaviourGrade.hashCode() : 0);
    }

    public String toString() {
        return "State(featureConfig=" + this.featureConfig + ", studentId=" + this.studentId + ", selectedGrade=" + this.selectedGrade + ')';
    }

    public /* synthetic */ State(h94.a aVar, String str, PartialBehaviourGrade partialBehaviourGrade, int i15, fr.k kVar) {
        this(aVar, str, (i15 & 4) != 0 ? null : partialBehaviourGrade);
    }
}
