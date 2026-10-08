package m94;

import j94.BehaviorSemesterDetails;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: m94.b, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0001\tB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001c\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lm94/b;", "", "", "selectedSemesterId", "", "Lj94/a;", "allSemesters", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "a", "(Ljava/lang/String;Ljava/util/List;)Lm94/b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "e", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "d", "()Lj94/a;", "selectedSemester", "schoolbehavior_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BehaviorListData {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f124853d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String selectedSemesterId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<BehaviorSemesterDetails> allSemesters;

    /* JADX INFO: renamed from: m94.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lm94/b$a;", "", "<init>", "()V", "Lj94/b$c;", "semesters", "Lm94/b;", "a", "(Lj94/b$c;)Lm94/b;", "schoolbehavior_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final BehaviorListData a(j94.b.Semesters semesters) {
            String id5 = semesters.getCurrentSemester().getId();
            List listC = pq.v.c();
            listC.add(semesters.getCurrentSemester());
            listC.addAll(semesters.b());
            return new BehaviorListData(id5, pq.v.a(listC));
        }

        private Companion() {
        }
    }

    public BehaviorListData(String str, List<BehaviorSemesterDetails> list) {
        this.selectedSemesterId = str;
        this.allSemesters = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BehaviorListData b(BehaviorListData behaviorListData, String str, List list, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = behaviorListData.selectedSemesterId;
        }
        if ((i15 & 2) != 0) {
            list = behaviorListData.allSemesters;
        }
        return behaviorListData.a(str, list);
    }

    public final BehaviorListData a(String selectedSemesterId, List<BehaviorSemesterDetails> allSemesters) {
        return new BehaviorListData(selectedSemesterId, allSemesters);
    }

    public final List<BehaviorSemesterDetails> c() {
        return this.allSemesters;
    }

    public final BehaviorSemesterDetails d() {
        Object next;
        Iterator<T> it = this.allSemesters.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!fr.t.c(((BehaviorSemesterDetails) next).getId(), this.selectedSemesterId));
        if (next != null) {
            return (BehaviorSemesterDetails) next;
        }
        throw new IllegalArgumentException(("No details for selected semester " + this.selectedSemesterId).toString());
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSelectedSemesterId() {
        return this.selectedSemesterId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BehaviorListData)) {
            return false;
        }
        BehaviorListData behaviorListData = (BehaviorListData) other;
        return fr.t.c(this.selectedSemesterId, behaviorListData.selectedSemesterId) && fr.t.c(this.allSemesters, behaviorListData.allSemesters);
    }

    public int hashCode() {
        return (this.selectedSemesterId.hashCode() * 31) + this.allSemesters.hashCode();
    }

    public String toString() {
        return "BehaviorListData(selectedSemesterId=" + this.selectedSemesterId + ", allSemesters=" + this.allSemesters + ')';
    }
}
