package cv0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: cv0.o, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u0018\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcv0/o;", "", "Lcv0/a;", "applicant", "", "Lcv0/k;", "stages", "Lcv0/f;", "participants", "<init>", "(Lcv0/a;Ljava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcv0/a;", "()Lcv0/a;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "travelabroadservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BETravelRequestModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEApplicant applicant;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<BEStage> stages;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<BEPersonalData> participants;

    public BETravelRequestModel(BEApplicant bEApplicant, List<BEStage> list, List<BEPersonalData> list2) {
        this.applicant = bEApplicant;
        this.stages = list;
        this.participants = list2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BEApplicant getApplicant() {
        return this.applicant;
    }

    public final List<BEPersonalData> b() {
        return this.participants;
    }

    public final List<BEStage> c() {
        return this.stages;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BETravelRequestModel)) {
            return false;
        }
        BETravelRequestModel bETravelRequestModel = (BETravelRequestModel) other;
        return fr.t.c(this.applicant, bETravelRequestModel.applicant) && fr.t.c(this.stages, bETravelRequestModel.stages) && fr.t.c(this.participants, bETravelRequestModel.participants);
    }

    public int hashCode() {
        return (((this.applicant.hashCode() * 31) + this.stages.hashCode()) * 31) + this.participants.hashCode();
    }

    public String toString() {
        return "BETravelRequestModel(applicant=" + this.applicant + ", stages=" + this.stages + ", participants=" + this.participants + ')';
    }
}
