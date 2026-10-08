package k41;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: k41.c, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ \u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lk41/c;", "", "", "Lk41/b;", "childValidation", "<init>", "(Ljava/util/List;)V", "", "c", "()Z", "a", "(Ljava/util/List;)Lk41/c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "b", "()Ljava/util/List;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ChildDataWithValidation> childValidation;

    /* JADX WARN: Multi-variable type inference failed */
    public State() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final State a(List<ChildDataWithValidation> childValidation) {
        return new State(childValidation);
    }

    public final List<ChildDataWithValidation> b() {
        return this.childValidation;
    }

    public final boolean c() {
        List<ChildDataWithValidation> list = this.childValidation;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((ChildDataWithValidation) it.next()).e()) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof State) && fr.t.c(this.childValidation, ((State) other).childValidation);
    }

    public int hashCode() {
        return this.childValidation.hashCode();
    }

    public String toString() {
        return "State(childValidation=" + this.childValidation + ')';
    }

    public State(List<ChildDataWithValidation> list) {
        this.childValidation = list;
    }

    public /* synthetic */ State(List list, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? pq.v.e(new ChildDataWithValidation(null, null, 3, null)) : list);
    }
}
