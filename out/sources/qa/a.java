package qa;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\u000e¨\u0006\u000f"}, d2 = {"Lqa/a;", "Ltq/i$b;", "Ltq/i$c;", "key", "Lqa/p;", "connectionWrapper", "<init>", "(Ltq/i$c;Lqa/p;)V", "a", "Ltq/i$c;", "getKey", "()Ltq/i$c;", "b", "Lqa/p;", "()Lqa/p;", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class a implements tq.i.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final tq.i.c<a> key;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p connectionWrapper;

    public a(tq.i.c<a> cVar, p pVar) {
        this.key = cVar;
        this.connectionWrapper = pVar;
    }

    @Override // tq.i
    public tq.i D1(tq.i.c<?> cVar) {
        return tq.i.b.a.c(this, cVar);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final p getConnectionWrapper() {
        return this.connectionWrapper;
    }

    @Override // tq.i.b
    public tq.i.c<a> getKey() {
        return this.key;
    }

    @Override // tq.i.b, tq.i
    public <E extends tq.i.b> E m(tq.i.c<E> cVar) {
        return (E) tq.i.b.a.b(this, cVar);
    }

    @Override // tq.i
    public tq.i n0(tq.i iVar) {
        return tq.i.b.a.d(this, iVar);
    }

    @Override // tq.i
    public <R> R s1(R r15, er.p<? super R, ? super tq.i.b, ? extends R> pVar) {
        return (R) tq.i.b.a.a(this, r15, pVar);
    }
}
