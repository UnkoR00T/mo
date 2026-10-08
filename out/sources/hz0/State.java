package hz0;

import java.util.List;
import kh0.BEBasicMeasurementPoint;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: hz0.c, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ4\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lhz0/c;", "", "", "Lkh0/c;", "listOfPoints", "", "query", "", "isActive", "<init>", "(Ljava/util/List;Ljava/lang/String;Z)V", "a", "(Ljava/util/List;Ljava/lang/String;Z)Lhz0/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Ljava/lang/String;", "d", "Z", "e", "()Z", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<BEBasicMeasurementPoint> listOfPoints;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String query;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isActive;

    public State(List<BEBasicMeasurementPoint> list, String str, boolean z15) {
        this.listOfPoints = list;
        this.query = str;
        this.isActive = z15;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ State b(State state, List list, String str, boolean z15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            list = state.listOfPoints;
        }
        if ((i15 & 2) != 0) {
            str = state.query;
        }
        if ((i15 & 4) != 0) {
            z15 = state.isActive;
        }
        return state.a(list, str, z15);
    }

    public final State a(List<BEBasicMeasurementPoint> listOfPoints, String query, boolean isActive) {
        return new State(listOfPoints, query, isActive);
    }

    public final List<BEBasicMeasurementPoint> c() {
        return this.listOfPoints;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return fr.t.c(this.listOfPoints, state.listOfPoints) && fr.t.c(this.query, state.query) && this.isActive == state.isActive;
    }

    public int hashCode() {
        return (((this.listOfPoints.hashCode() * 31) + this.query.hashCode()) * 31) + Boolean.hashCode(this.isActive);
    }

    public String toString() {
        return "State(listOfPoints=" + this.listOfPoints + ", query=" + this.query + ", isActive=" + this.isActive + ')';
    }
}
