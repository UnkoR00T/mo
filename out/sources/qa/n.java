package qa;

import ju.p0;
import oa.g0;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0018B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012B\b\u0002\u0010\u000b\u001a<\b\u0001\u0012\u0018\u0012\u0016\b\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0006j\b\u0012\u0002\b\u0003\u0018\u0001`\n¢\u0006\u0004\b\f\u0010\rJB\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\"\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bRN\u0010\u000b\u001a<\b\u0001\u0012\u0018\u0012\u0016\b\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0006j\b\u0012\u0002\b\u0003\u0018\u0001`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Lqa/n;", "Lqa/c;", "Lya/c;", "driver", "", "fileName", "Lkotlin/Function2;", "Lkotlin/Function1;", "Ltq/e;", "", "Landroidx/room/coroutines/TransactionWrapper;", "transactionWrapper", "<init>", "(Lya/c;Ljava/lang/String;Ler/p;)V", "R", "", "isReadOnly", "Loa/g0;", "block", "u2", "(ZLer/p;Ltq/e;)Ljava/lang/Object;", "Loq/i0;", "close", "()V", "a", "Lya/c;", "b", "Ljava/lang/String;", "c", "Ler/p;", "Loq/k;", "Lya/b;", "d", "Loq/k;", "connection", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ya.c driver;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String fileName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final er.p<er.l<? super tq.e<Object>, ? extends Object>, tq.e<Object>, Object> transactionWrapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final oq.k<ya.b> connection = oq.l.a(new er.a() { // from class: qa.m
        @Override // er.a
        public final Object a() {
            return n.h(this.f165490a);
        }
    });

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lqa/n$a;", "Ltq/i$b;", "Lqa/l;", "connectionWrapper", "<init>", "(Lqa/l;)V", "a", "Lqa/l;", "()Lqa/l;", "Ltq/i$c;", "getKey", "()Ltq/i$c;", "key", "b", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a implements tq.i.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final l connectionWrapper;

        /* JADX INFO: renamed from: qa.n$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lqa/n$a$a;", "Ltq/i$c;", "Lqa/n$a;", "<init>", "()V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion implements tq.i.c<a> {
            public /* synthetic */ Companion(fr.k kVar) {
                this();
            }

            private Companion() {
            }
        }

        public a(l lVar) {
            this.connectionWrapper = lVar;
        }

        @Override // tq.i
        public tq.i D1(tq.i.c<?> cVar) {
            return tq.i.b.a.c(this, cVar);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final l getConnectionWrapper() {
            return this.connectionWrapper;
        }

        @Override // tq.i.b
        public tq.i.c<a> getKey() {
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

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Lju/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    static final class b<R> extends vq.k implements er.p<p0, tq.e<? super R>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f165497e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ er.p<g0, tq.e<? super R>, Object> f165498f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ l f165499g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(er.p<? super g0, ? super tq.e<? super R>, ? extends Object> pVar, l lVar, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f165498f = pVar;
            this.f165499g = lVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f165497e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            er.p<g0, tq.e<? super R>, Object> pVar = this.f165498f;
            l lVar = this.f165499g;
            this.f165497e = 1;
            Object objB = pVar.B(lVar, this);
            return objB == objE ? objE : objB;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super R> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new b(this.f165498f, this.f165499g, eVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n(ya.c cVar, String str, er.p<? super er.l<? super tq.e<Object>, ? extends Object>, ? super tq.e<Object>, ? extends Object> pVar) {
        this.driver = cVar;
        this.fileName = str;
        this.transactionWrapper = pVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ya.b h(n nVar) {
        return nVar.driver.a(nVar.fileName);
    }

    @Override // qa.c, java.lang.AutoCloseable
    public void close() {
        if (this.connection.c()) {
            this.connection.getValue().close();
        }
    }

    @Override // qa.c
    public <R> Object u2(boolean z15, er.p<? super g0, ? super tq.e<? super R>, ? extends Object> pVar, tq.e<? super R> eVar) {
        a aVar = (a) eVar.getContext().m(a.INSTANCE);
        l connectionWrapper = aVar != null ? aVar.getConnectionWrapper() : null;
        if (connectionWrapper != null) {
            return pVar.B(connectionWrapper, eVar);
        }
        l lVar = new l(this.transactionWrapper, this.connection.getValue());
        return ju.i.g(new a(lVar), new b(pVar, lVar, null), eVar);
    }
}
