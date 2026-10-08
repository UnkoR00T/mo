package p076m2;

import er.a;
import er.l;
import lu.z;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H ¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H ¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H ¢\u0006\u0004\b\f\u0010\u0003J1\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\u0012\u0010\u000bJ\u000f\u0010\u0013\u001a\u00020\u0005H ¢\u0006\u0004\b\u0013\u0010\u0003R\u001e\u0010\u0018\u001a\u00060\u0001j\u0002`\u00148\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lm2/l5;", "", "<init>", "()V", "Llu/z;", "Loq/i0;", "channel", "Lkotlin/Function1;", "e", "(Llu/z;)Ler/l;", "a", "(Llu/z;)V", "b", "T", "Lkotlin/Function0;", "block", "g", "(Llu/z;Ler/a;)Ljava/lang/Object;", "f", "c", "Landroidx/compose/runtime/platform/SynchronizedObject;", "Ljava/lang/Object;", "d", "()Ljava/lang/Object;", "lock", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class l5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Object lock = new Object();

    public abstract void a(z<? super i0> channel);

    public abstract void b();

    public abstract void c();

    /* JADX INFO: renamed from: d, reason: from getter */
    protected final Object getLock() {
        return this.lock;
    }

    public abstract l<Object, i0> e(z<? super i0> channel);

    public final void f(z<? super i0> channel) {
        a(channel);
        b();
    }

    public final <T> T g(z<? super i0> channel, a<? extends T> block) {
        c3.l lVarP = c3.l.INSTANCE.p(e(channel));
        a(channel);
        try {
            c3.l lVarL = lVarP.l();
            try {
                T tA = block.a();
                lVarP.s(lVarL);
                lVarP.d();
                b();
                return tA;
            } catch (Throwable th4) {
                lVarP.s(lVarL);
                throw th4;
            }
        } catch (Throwable th5) {
            lVarP.d();
            throw th5;
        }
    }
}
