package oa;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Loa/c0;", "Ltq/i$b;", "Ltq/f;", "transactionDispatcher", "<init>", "(Ltq/f;)V", "a", "Ltq/f;", "()Ltq/f;", "Ltq/i$c;", "getKey", "()Ltq/i$c;", "key", "b", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c0 implements tq.i.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final tq.f transactionDispatcher;

    /* JADX INFO: renamed from: oa.c0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Loa/c0$a;", "Ltq/i$c;", "Loa/c0;", "<init>", "()V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements tq.i.c<c0> {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        private Companion() {
        }
    }

    public c0(tq.f fVar) {
        this.transactionDispatcher = fVar;
    }

    @Override // tq.i
    public tq.i D1(tq.i.c<?> cVar) {
        return tq.i.b.a.c(this, cVar);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final tq.f getTransactionDispatcher() {
        return this.transactionDispatcher;
    }

    @Override // tq.i.b
    public tq.i.c<c0> getKey() {
        return INSTANCE;
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
