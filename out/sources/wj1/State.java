package wj1;

import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: wj1.c, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lwj1/c;", "", "Lwj1/e;", "fields", "Ld60/j;", "Lwj1/e$b;", "scrollInstance", "<init>", "(Lwj1/e;Ld60/j;)V", "a", "(Lwj1/e;Ld60/j;)Lwj1/c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lwj1/e;", "b", "()Lwj1/e;", "Ld60/j;", "c", "()Ld60/j;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f213766c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final WriteChildFields fields;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final d60.j<WriteChildFields.b> scrollInstance;

    static {
        int i15 = b0.f97726c;
        int i16 = hz.b.f86845b;
        f213766c = i15 | i15 | i16 | i15 | i16 | i16;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public State() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final State a(WriteChildFields fields, d60.j<WriteChildFields.b> scrollInstance) {
        return new State(fields, scrollInstance);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final WriteChildFields getFields() {
        return this.fields;
    }

    public final d60.j<WriteChildFields.b> c() {
        return this.scrollInstance;
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
        d60.j<WriteChildFields.b> jVar = this.scrollInstance;
        return iHashCode + (jVar == null ? 0 : jVar.hashCode());
    }

    public String toString() {
        return "State(fields=" + this.fields + ", scrollInstance=" + this.scrollInstance + ')';
    }

    public State(WriteChildFields writeChildFields, d60.j<WriteChildFields.b> jVar) {
        this.fields = writeChildFields;
        this.scrollInstance = jVar;
    }

    public /* synthetic */ State(WriteChildFields writeChildFields, d60.j jVar, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? new WriteChildFields(null, null, null, 7, null) : writeChildFields, (i15 & 2) != 0 ? null : jVar);
    }
}
