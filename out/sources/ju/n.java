package ju;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002JO\u0010\f\u001a\u0004\u0018\u00010\u0005\"\b\b\u0001\u0010\u0003*\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052 \u0010\u000b\u001a\u001c\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007H'¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\bH'¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0005H'¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001b\u001a\u00020\n2\u0018\u0010\u001a\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\n0\u0018j\u0002`\u0019H&¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u0003\u001a\u00020\n*\u00020\u001d2\u0006\u0010\u0004\u001a\u00028\u0000H'¢\u0006\u0004\b\u0003\u0010\u001eJC\u0010\u0001\u001a\u00020\n\"\b\b\u0001\u0010\u0003*\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u00012 \u0010\u000b\u001a\u001c\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007H&¢\u0006\u0004\b\u0001\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010!¨\u0006%"}, d2 = {"Lju/n;", "T", "Ltq/e;", "R", "value", "", "idempotent", "Lkotlin/Function3;", "", "Ltq/i;", "Loq/i0;", "onCancellation", "U", "(Ljava/lang/Object;Ljava/lang/Object;Ler/q;)Ljava/lang/Object;", "exception", "G", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "token", "W", "(Ljava/lang/Object;)V", "cause", "", "Q", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "Lkotlinx/coroutines/CompletionHandler;", "handler", "E", "(Ler/l;)V", "Lju/l0;", "(Lju/l0;Ljava/lang/Object;)V", "(Ljava/lang/Object;Ler/q;)V", "h", "()Z", "isActive", "r", "isCompleted", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface n<T> extends tq.e<T> {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ boolean a(n nVar, Throwable th4, int i15, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i15 & 1) != 0) {
                th4 = null;
            }
            return nVar.Q(th4);
        }
    }

    void E(er.l<? super Throwable, oq.i0> handler);

    Object G(Throwable exception);

    boolean Q(Throwable cause);

    void R(l0 l0Var, T t15);

    <R extends T> void T(R value, er.q<? super Throwable, ? super R, ? super tq.i, oq.i0> onCancellation);

    <R extends T> Object U(R value, Object idempotent, er.q<? super Throwable, ? super R, ? super tq.i, oq.i0> onCancellation);

    void W(Object token);

    boolean h();

    boolean r();
}
