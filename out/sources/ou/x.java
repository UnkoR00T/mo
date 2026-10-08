package ou;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aE\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u0000*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00032\u0006\u0010\u0004\u001a\u00028\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a?\u0010\u000b\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f**\b\u0000\u0010\r\u001a\u0004\b\u0000\u0010\u0000\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u000e"}, d2 = {"E", "Lkotlin/Function1;", "Loq/i0;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "element", "Lou/s0;", "undeliveredElementException", "b", "(Ler/l;Ljava/lang/Object;Lou/s0;)Lou/s0;", "Ltq/i;", "context", "a", "(Ler/l;Ljava/lang/Object;Ltq/i;)V", "OnUndeliveredElement", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class x {
    public static final <E> void a(er.l<? super E, oq.i0> lVar, E e15, tq.i iVar) {
        s0 s0VarB = b(lVar, e15, null);
        if (s0VarB != null) {
            ju.n0.a(iVar, s0VarB);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> s0 b(er.l<? super E, oq.i0> lVar, E e15, s0 s0Var) {
        try {
            lVar.b(e15);
            return s0Var;
        } catch (Throwable th4) {
            if (s0Var != null && s0Var.getCause() != th4) {
                oq.c.a(s0Var, th4);
                return s0Var;
            }
            return new s0("Exception in undelivered element handler for " + e15, th4);
        }
    }

    public static /* synthetic */ s0 c(er.l lVar, Object obj, s0 s0Var, int i15, Object obj2) {
        if ((i15 & 2) != 0) {
            s0Var = null;
        }
        return b(lVar, obj, s0Var);
    }
}
