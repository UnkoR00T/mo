package j94;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: j94.a, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\u001a\u0010\"¨\u0006#"}, d2 = {"Lj94/a;", "", "", "id", "title", "Lj94/d;", "finalGrade", "", "Lj94/f;", "partialGrades", "Lj94/c;", "gradeInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lj94/d;Ljava/util/List;Lj94/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "e", "Lj94/d;", "()Lj94/d;", "d", "Ljava/util/List;", "()Ljava/util/List;", "Lj94/c;", "()Lj94/c;", "schoolbehavior_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BehaviorSemesterDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final FinalBehaviourGrade finalGrade;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<PartialBehaviourGrade> partialGrades;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final BehaviourGradeInfo gradeInfo;

    public BehaviorSemesterDetails(String str, String str2, FinalBehaviourGrade finalBehaviourGrade, List<PartialBehaviourGrade> list, BehaviourGradeInfo behaviourGradeInfo) {
        this.id = str;
        this.title = str2;
        this.finalGrade = finalBehaviourGrade;
        this.partialGrades = list;
        this.gradeInfo = behaviourGradeInfo;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final FinalBehaviourGrade getFinalGrade() {
        return this.finalGrade;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final BehaviourGradeInfo getGradeInfo() {
        return this.gradeInfo;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final List<PartialBehaviourGrade> d() {
        return this.partialGrades;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BehaviorSemesterDetails)) {
            return false;
        }
        BehaviorSemesterDetails behaviorSemesterDetails = (BehaviorSemesterDetails) other;
        return t.c(this.id, behaviorSemesterDetails.id) && t.c(this.title, behaviorSemesterDetails.title) && t.c(this.finalGrade, behaviorSemesterDetails.finalGrade) && t.c(this.partialGrades, behaviorSemesterDetails.partialGrades) && t.c(this.gradeInfo, behaviorSemesterDetails.gradeInfo);
    }

    public int hashCode() {
        int iHashCode = ((this.id.hashCode() * 31) + this.title.hashCode()) * 31;
        FinalBehaviourGrade finalBehaviourGrade = this.finalGrade;
        int iHashCode2 = (((iHashCode + (finalBehaviourGrade == null ? 0 : finalBehaviourGrade.hashCode())) * 31) + this.partialGrades.hashCode()) * 31;
        BehaviourGradeInfo behaviourGradeInfo = this.gradeInfo;
        return iHashCode2 + (behaviourGradeInfo != null ? behaviourGradeInfo.hashCode() : 0);
    }

    public String toString() {
        return "BehaviorSemesterDetails(id=" + this.id + ", title=" + this.title + ", finalGrade=" + this.finalGrade + ", partialGrades=" + this.partialGrades + ", gradeInfo=" + this.gradeInfo + ')';
    }
}
