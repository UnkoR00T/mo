package ij1;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;
import vi1.ChildParticipant;

/* JADX INFO: renamed from: ij1.c, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lij1/c;", "", "Lij1/f;", "fields", "Ld60/j;", "Lij1/f$b;", "scrollInstance", "<init>", "(Lij1/f;Ld60/j;)V", "", "e", "()Z", "a", "(Lij1/f;Ld60/j;)Lij1/c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lij1/f;", "c", "()Lij1/f;", "b", "Ld60/j;", "d", "()Ld60/j;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final ChooseChildrenFields fields;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final d60.j<ChooseChildrenFields.b> scrollInstance;

    public State(ChooseChildrenFields chooseChildrenFields, d60.j<ChooseChildrenFields.b> jVar) {
        this.fields = chooseChildrenFields;
        this.scrollInstance = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ State b(State state, ChooseChildrenFields chooseChildrenFields, d60.j jVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            chooseChildrenFields = state.fields;
        }
        if ((i15 & 2) != 0) {
            jVar = state.scrollInstance;
        }
        return state.a(chooseChildrenFields, jVar);
    }

    public final State a(ChooseChildrenFields fields, d60.j<ChooseChildrenFields.b> scrollInstance) {
        return new State(fields, scrollInstance);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ChooseChildrenFields getFields() {
        return this.fields;
    }

    public final d60.j<ChooseChildrenFields.b> d() {
        return this.scrollInstance;
    }

    public final boolean e() {
        List<ChildParticipant> listE = this.fields.getChildren().e();
        if ((listE instanceof Collection) && listE.isEmpty()) {
            return true;
        }
        Iterator<T> it = listE.iterator();
        while (it.hasNext()) {
            if (((ChildParticipant) it.next()).getIsAgeValidForTraining()) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return fr.t.c(this.fields, state.fields) && fr.t.c(this.scrollInstance, state.scrollInstance);
    }

    public int hashCode() {
        int iHashCode = this.fields.hashCode() * 31;
        d60.j<ChooseChildrenFields.b> jVar = this.scrollInstance;
        return iHashCode + (jVar == null ? 0 : jVar.hashCode());
    }

    public String toString() {
        return "State(fields=" + this.fields + ", scrollInstance=" + this.scrollInstance + ')';
    }

    public /* synthetic */ State(ChooseChildrenFields chooseChildrenFields, d60.j jVar, int i15, fr.k kVar) {
        this(chooseChildrenFields, (i15 & 2) != 0 ? null : jVar);
    }
}
