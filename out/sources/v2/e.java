package v2;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\b!\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B;\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u001e\u0010\t\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u0015R2\u0010\t\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b0\u00078\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010#\u001a\u00020\f8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010$¨\u0006%"}, d2 = {"Lv2/e;", "K", "V", "T", "", "Lv2/t;", "node", "", "Lv2/u;", "path", "<init>", "(Lv2/t;[Lv2/u;)V", "", "pathIndex", "f", "(I)I", "Loq/i0;", "d", "()V", "a", "c", "()Ljava/lang/Object;", "", "hasNext", "()Z", "next", "[Lv2/u;", "e", "()[Lv2/u;", "b", "I", "getPathLastIndex", "()I", "g", "(I)V", "pathLastIndex", "Z", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class e<K, V, T> implements Iterator<T>, gr.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u<K, V, T>[] path;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int pathLastIndex;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean hasNext = true;

    public e(t<K, V> tVar, u<K, V, T>[] uVarArr) {
        this.path = uVarArr;
        uVarArr[0].k(tVar.getBuffer(), tVar.m() * 2);
        this.pathLastIndex = 0;
        d();
    }

    private final void a() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    private final void d() {
        if (this.path[this.pathLastIndex].f()) {
            return;
        }
        for (int i15 = this.pathLastIndex; -1 < i15; i15--) {
            int iF = f(i15);
            if (iF == -1 && this.path[i15].g()) {
                this.path[i15].i();
                iF = f(i15);
            }
            if (iF != -1) {
                this.pathLastIndex = iF;
                return;
            }
            if (i15 > 0) {
                this.path[i15 - 1].i();
            }
            this.path[i15].k(t.INSTANCE.a().getBuffer(), 0);
        }
        this.hasNext = false;
    }

    private final int f(int pathIndex) {
        if (this.path[pathIndex].f()) {
            return pathIndex;
        }
        if (!this.path[pathIndex].g()) {
            return -1;
        }
        t<? extends K, ? extends V> tVarC = this.path[pathIndex].c();
        if (pathIndex == 6) {
            this.path[pathIndex + 1].k(tVarC.getBuffer(), tVarC.getBuffer().length);
        } else {
            this.path[pathIndex + 1].k(tVarC.getBuffer(), tVarC.m() * 2);
        }
        return f(pathIndex + 1);
    }

    protected final K c() {
        a();
        return this.path[this.pathLastIndex].a();
    }

    protected final u<K, V, T>[] e() {
        return this.path;
    }

    protected final void g(int i15) {
        this.pathLastIndex = i15;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }

    @Override // java.util.Iterator
    public T next() {
        a();
        T next = this.path[this.pathLastIndex].next();
        d();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
