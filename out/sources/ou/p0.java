package ou;

import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import ou.q0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u0000*\u0012\b\u0000\u0010\u0003*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0004j\u0002`\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0082\u0010¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0082\u0010¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0011\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0011\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00028\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001a\u001a\u0004\u0018\u00018\u0000H\u0001¢\u0006\u0004\b\u001a\u0010\u0015J\u0017\u0010\t\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\bH\u0001¢\u0006\u0004\b\t\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u001d\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001fR$\u0010$\u001a\u00020\b2\u0006\u0010 \u001a\u00020\b8F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010\fR\u0011\u0010'\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u000b\u0010)\u001a\u00020(8\u0002X\u0082\u0004¨\u0006*"}, d2 = {"Lou/p0;", "Lou/q0;", "", "T", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "<init>", "()V", "", "i", "Loq/i0;", "m", "(I)V", "l", "", "g", "()[Lou/q0;", "j", "n", "(II)V", "f", "()Lou/q0;", "node", "", "h", "(Lou/q0;)Z", "b", "index", "(I)Lou/q0;", "a", "(Lou/q0;)V", "[Lou/q0;", "value", "c", "()I", "k", "size", "e", "()Z", "isEmpty", "Liu/c;", "_size", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class p0<T extends q0 & Comparable<? super T>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f150065b = AtomicIntegerFieldUpdater.newUpdater(p0.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;
    private T[] a;

    private final T[] g() {
        T[] tArr = this.a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new q0[4];
            this.a = tArr2;
            return tArr2;
        }
        if (c() < tArr.length) {
            return tArr;
        }
        T[] tArr3 = (T[]) ((q0[]) Arrays.copyOf(tArr, c() * 2));
        this.a = tArr3;
        return tArr3;
    }

    private final void k(int i15) {
        f150065b.set(this, i15);
    }

    private final void l(int i15) {
        while (true) {
            int i16 = i15 * 2;
            int i17 = i16 + 1;
            if (i17 >= c()) {
                return;
            }
            T[] tArr = this.a;
            int i18 = i16 + 2;
            if (i18 >= c() || ((Comparable) tArr[i18]).compareTo(tArr[i17]) >= 0) {
                i18 = i17;
            }
            if (((Comparable) tArr[i15]).compareTo(tArr[i18]) <= 0) {
                return;
            }
            n(i15, i18);
            i15 = i18;
        }
    }

    private final void m(int i15) {
        while (i15 > 0) {
            T[] tArr = this.a;
            int i16 = (i15 - 1) / 2;
            if (((Comparable) tArr[i16]).compareTo(tArr[i15]) <= 0) {
                return;
            }
            n(i15, i16);
            i15 = i16;
        }
    }

    private final void n(int i15, int j15) {
        T[] tArr = this.a;
        T t15 = tArr[j15];
        T t16 = tArr[i15];
        tArr[i15] = t15;
        tArr[j15] = t16;
        t15.setIndex(i15);
        t16.setIndex(j15);
    }

    public final void a(T node) {
        node.g(this);
        q0[] q0VarArrG = g();
        int iC = c();
        k(iC + 1);
        q0VarArrG[iC] = node;
        node.setIndex(iC);
        m(iC);
    }

    public final T b() {
        T[] tArr = this.a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    public final int c() {
        return f150065b.get(this);
    }

    public final boolean e() {
        return c() == 0;
    }

    public final T f() {
        T t15;
        synchronized (this) {
            t15 = (T) b();
        }
        return t15;
    }

    public final boolean h(T node) {
        boolean z15;
        synchronized (this) {
            if (node.e() == null) {
                z15 = false;
            } else {
                i(node.getIndex());
                z15 = true;
            }
        }
        return z15;
    }

    public final T i(int index) {
        T[] tArr = this.a;
        k(c() - 1);
        if (index < c()) {
            n(index, c());
            int i15 = (index - 1) / 2;
            if (index <= 0 || ((Comparable) tArr[index]).compareTo(tArr[i15]) >= 0) {
                l(index);
            } else {
                n(index, i15);
                m(i15);
            }
        }
        T t15 = tArr[c()];
        t15.g(null);
        t15.setIndex(-1);
        tArr[c()] = null;
        return t15;
    }

    public final T j() {
        T t15;
        synchronized (this) {
            t15 = c() > 0 ? (T) i(0) : null;
        }
        return t15;
    }
}
