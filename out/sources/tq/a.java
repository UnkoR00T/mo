package tq;

import er.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ltq/a;", "Ltq/i$b;", "Ltq/i$c;", "key", "<init>", "(Ltq/i$c;)V", "a", "Ltq/i$c;", "getKey", "()Ltq/i$c;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a implements i.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i.c<?> key;

    public a(i.c<?> cVar) {
        this.key = cVar;
    }

    @Override // tq.i
    public /* bridge */ i D1(i.c<?> cVar) {
        return i.b.a.c(this, cVar);
    }

    @Override // tq.i.b
    public i.c<?> getKey() {
        return this.key;
    }

    @Override // tq.i.b, tq.i
    public /* bridge */ <E extends i.b> E m(i.c<E> cVar) {
        return (E) i.b.a.b(this, cVar);
    }

    @Override // tq.i
    public /* bridge */ i n0(i iVar) {
        return i.b.a.d(this, iVar);
    }

    @Override // tq.i
    public /* bridge */ <R> R s1(R r15, p<? super R, ? super i.b, ? extends R> pVar) {
        return (R) i.b.a.a(this, r15, pVar);
    }
}
