package ju;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lju/a3;", ip.a.f96137b, "Ltq/i$b;", "Ltq/i;", "context", "M", "(Ltq/i;)Ljava/lang/Object;", "oldState", "Loq/i0;", "C1", "(Ltq/i;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface a3<S> extends tq.i.b {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public static <S, R> R a(a3<S> a3Var, R r15, er.p<? super R, ? super tq.i.b, ? extends R> pVar) {
            return (R) tq.i.b.a.a(a3Var, r15, pVar);
        }

        public static <S, E extends tq.i.b> E b(a3<S> a3Var, tq.i.c<E> cVar) {
            return (E) tq.i.b.a.b(a3Var, cVar);
        }

        public static <S> tq.i c(a3<S> a3Var, tq.i.c<?> cVar) {
            return tq.i.b.a.c(a3Var, cVar);
        }

        public static <S> tq.i d(a3<S> a3Var, tq.i iVar) {
            return tq.i.b.a.d(a3Var, iVar);
        }
    }

    void C1(tq.i context, S oldState);

    S M(tq.i context);
}
