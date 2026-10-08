package g2;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: renamed from: g2.f, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0003\u0010\u0014R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lg2/f;", "", "", "isTabletop", "", "Lg2/e;", "hingeList", "<init>", "(ZLjava/util/List;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Z", "()Z", "b", "Ljava/util/List;", "getHingeList", "()Ljava/util/List;", "adaptive"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Posture {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isTabletop;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<HingeInfo> hingeList;

    public Posture(boolean z15, List<HingeInfo> list) {
        this.isTabletop = z15;
        this.hingeList = list;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Posture)) {
            return false;
        }
        Posture posture = (Posture) other;
        return this.isTabletop == posture.isTabletop && t.c(this.hingeList, posture.hingeList);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.isTabletop) * 31) + this.hingeList.hashCode();
    }

    public String toString() {
        return "Posture(isTabletop=" + this.isTabletop + ", hinges=[" + v.v0(this.hingeList, ", ", null, null, 0, null, null, 62, null) + "])";
    }
}
