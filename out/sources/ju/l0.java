package ju;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001#B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H&¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0017¢\u0006\u0004\b\u0018\u0010\u0017J'\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0004\b\u0000\u0010\u00192\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\u00152\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u001a¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\fH\u0016¢\u0006\u0004\b \u0010!¨\u0006$"}, d2 = {"Lju/l0;", "Ltq/a;", "Ltq/f;", "<init>", "()V", "Ltq/i;", "context", "", "P1", "(Ltq/i;)Z", "", "parallelism", "", "name", "S1", "(ILjava/lang/String;)Lju/l0;", "Q1", "(I)Lju/l0;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Loq/i0;", "F1", "(Ltq/i;Ljava/lang/Runnable;)V", "K1", "T", "Ltq/e;", "continuation", "O", "(Ltq/e;)Ltq/e;", "K", "(Ltq/e;)V", "toString", "()Ljava/lang/String;", "b", "a", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class l0 extends tq.a implements tq.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: ju.l0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lju/l0$a;", "Ltq/b;", "Ltq/f;", "Lju/l0;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion extends tq.b<tq.f, l0> {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final l0 d(tq.i.b bVar) {
            if (bVar instanceof l0) {
                return (l0) bVar;
            }
            return null;
        }

        private Companion() {
            super(tq.f.INSTANCE, new er.l() { // from class: ju.k0
                @Override // er.l
                public final Object b(Object obj) {
                    return l0.Companion.d((tq.i.b) obj);
                }
            });
        }
    }

    public l0() {
        super(tq.f.INSTANCE);
    }

    public static /* synthetic */ l0 T1(l0 l0Var, int i15, String str, int i16, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: limitedParallelism");
        }
        if ((i16 & 2) != 0) {
            str = null;
        }
        return l0Var.S1(i15, str);
    }

    @Override // tq.a, tq.i
    public tq.i D1(tq.i.c<?> cVar) {
        return tq.f.a.b(this, cVar);
    }

    public abstract void F1(tq.i context, Runnable block);

    @Override // tq.f
    public final void K(tq.e<?> continuation) {
        ((ou.i) continuation).t();
    }

    public void K1(tq.i context, Runnable block) {
        ou.j.c(this, context, block);
    }

    @Override // tq.f
    public final <T> tq.e<T> O(tq.e<? super T> continuation) {
        return new ou.i(this, continuation);
    }

    public boolean P1(tq.i context) {
        return true;
    }

    @oq.a
    public /* synthetic */ l0 Q1(int parallelism) {
        return S1(parallelism, null);
    }

    public l0 S1(int parallelism, String name) {
        ou.m.a(parallelism);
        return new ou.l(this, parallelism, name);
    }

    @Override // tq.a, tq.i.b, tq.i
    public <E extends tq.i.b> E m(tq.i.c<E> cVar) {
        return (E) tq.f.a.a(this, cVar);
    }

    public String toString() {
        return t0.a(this) + '@' + t0.b(this);
    }
}
