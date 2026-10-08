package f3;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0007\u001a\u00028\u00002\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0002\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001e¨\u0006!"}, d2 = {"Lf3/g;", "Lf3/m;", "outer", "inner", "<init>", "(Lf3/m;Lf3/m;)V", "R", "initial", "Lkotlin/Function2;", "Lf3/m$b;", "operation", "b", "(Ljava/lang/Object;Ler/p;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "predicate", "d", "(Ler/l;)Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lf3/m;", "l", "()Lf3/m;", "e", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g implements m {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final m outer;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final m inner;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "acc", "Lf3/m$b;", "element", "c", "(Ljava/lang/String;Lf3/m$b;)Ljava/lang/String;"}, k = 3, mv = {2, 1, 0})
    static final class a extends fr.w implements er.p<String, m.b, String> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f58722b = new a();

        a() {
            super(2);
        }

        @Override // er.p
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final String B(String str, m.b bVar) {
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    public g(m mVar, m mVar2) {
        this.outer = mVar;
        this.inner = mVar2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final m getInner() {
        return this.inner;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f3.m
    public <R> R b(R initial, er.p<? super R, ? super m.b, ? extends R> operation) {
        return (R) this.inner.b(this.outer.b(initial, operation), operation);
    }

    @Override // f3.m
    public boolean d(er.l<? super m.b, Boolean> predicate) {
        return this.outer.d(predicate) && this.inner.d(predicate);
    }

    public boolean equals(Object other) {
        if (!(other instanceof g)) {
            return false;
        }
        g gVar = (g) other;
        return fr.t.c(this.outer, gVar.outer) && fr.t.c(this.inner, gVar.inner);
    }

    public int hashCode() {
        return this.outer.hashCode() + (this.inner.hashCode() * 31);
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final m getOuter() {
        return this.outer;
    }

    public String toString() {
        return '[' + ((String) b("", a.f58722b)) + ']';
    }
}
