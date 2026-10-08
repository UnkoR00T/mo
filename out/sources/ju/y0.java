package ju;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\tj\u0002`\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lju/y0;", "", "", "timeMillis", "Lju/n;", "Loq/i0;", "continuation", "E", "(JLju/n;)V", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Ltq/i;", "context", "Lju/i1;", "O0", "(JLjava/lang/Runnable;Ltq/i;)Lju/i1;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface y0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public static i1 a(y0 y0Var, long j15, Runnable runnable, tq.i iVar) {
            return v0.a().O0(j15, runnable, iVar);
        }
    }

    void E(long timeMillis, n<? super oq.i0> continuation);

    i1 O0(long timeMillis, Runnable block, tq.i context);
}
