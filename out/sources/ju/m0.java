package ju;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \t2\u00020\u0001:\u0001\nJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lju/m0;", "Ltq/i$b;", "Ltq/i;", "context", "", "exception", "Loq/i0;", "i1", "(Ltq/i;Ljava/lang/Throwable;)V", "W", "b", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface m0 extends tq.i.b {

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.f105748a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public static <R> R a(m0 m0Var, R r15, er.p<? super R, ? super tq.i.b, ? extends R> pVar) {
            return (R) tq.i.b.a.a(m0Var, r15, pVar);
        }

        public static <E extends tq.i.b> E b(m0 m0Var, tq.i.c<E> cVar) {
            return (E) tq.i.b.a.b(m0Var, cVar);
        }

        public static tq.i c(m0 m0Var, tq.i.c<?> cVar) {
            return tq.i.b.a.c(m0Var, cVar);
        }

        public static tq.i d(m0 m0Var, tq.i iVar) {
            return tq.i.b.a.d(m0Var, iVar);
        }
    }

    /* JADX INFO: renamed from: ju.m0$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lju/m0$b;", "Ltq/i$c;", "Lju/m0;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements tq.i.c<m0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f105748a = new Companion();

        private Companion() {
        }
    }

    void i1(tq.i context, Throwable exception);
}
