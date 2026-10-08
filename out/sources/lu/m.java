package lu;

import java.util.concurrent.atomic.AtomicReferenceArray;
import ju.k3;
import oq.i0;
import ou.b0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u0002B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0001\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0001\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0013\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0018\u0010\u0014J!\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b\u0019\u0010\u0010J+\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\f\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010 \u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b \u0010!J)\u0010&\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u001d\u0010)\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u001c¢\u0006\u0004\b)\u0010*R\u001c\u0010-\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00102\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0013\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\r8\u0002X\u0082\u0004¨\u00064"}, d2 = {"Llu/m;", "E", "Lou/b0;", "", "id", "prev", "Llu/e;", "channel", "", "pointers", "<init>", "(JLlu/m;Llu/e;I)V", "index", "", "value", "Loq/i0;", "(ILjava/lang/Object;)V", "element", "G", "A", "(I)Ljava/lang/Object;", ip.a.f96138c, "w", "(I)V", "B", "F", "from", "to", "", "v", "(ILjava/lang/Object;Ljava/lang/Object;)Z", "update", "x", "(ILjava/lang/Object;)Ljava/lang/Object;", "", "cause", "Ltq/i;", "context", "s", "(ILjava/lang/Throwable;Ltq/i;)V", "receiver", "C", "(IZ)V", "e", "Llu/e;", "_channel", "y", "()Llu/e;", "r", "()I", "numberOfSlots", "data", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m<E> extends b0<m<E>> {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final e<E> _channel;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final /* synthetic */ AtomicReferenceArray f120469f;

    public m(long j15, m<E> mVar, e<E> eVar, int i15) {
        super(j15, mVar, i15);
        this._channel = eVar;
        this.f120469f = new AtomicReferenceArray(f.f120441b * 2);
    }

    private final void E(int index, Object value) {
        getF120469f().set(index * 2, value);
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    private final /* synthetic */ AtomicReferenceArray getF120469f() {
        return this.f120469f;
    }

    public final E A(int index) {
        return (E) getF120469f().get(index * 2);
    }

    public final Object B(int index) {
        return getF120469f().get((index * 2) + 1);
    }

    public final void C(int index, boolean receiver) {
        if (receiver) {
            y().x1((this.id * ((long) f.f120441b)) + ((long) index));
        }
        t();
    }

    public final E D(int index) {
        E eA = A(index);
        w(index);
        return eA;
    }

    public final void F(int index, Object value) {
        getF120469f().set((index * 2) + 1, value);
    }

    public final void G(int index, E element) {
        E(index, element);
    }

    @Override // ou.b0
    public int r() {
        return f.f120441b;
    }

    @Override // ou.b0
    public void s(int index, Throwable cause, tq.i context) {
        er.l<E, i0> lVar;
        er.l<E, i0> lVar2;
        int i15 = f.f120441b;
        boolean z15 = index >= i15;
        if (z15) {
            index -= i15;
        }
        E eA = A(index);
        while (true) {
            Object objB = B(index);
            if ((objB instanceof k3) || (objB instanceof WaiterEB)) {
                if (v(index, objB, z15 ? f.f120449j : f.f120450k)) {
                    w(index);
                    C(index, !z15);
                    if (!z15 || (lVar = y().onUndeliveredElement) == null) {
                        return;
                    }
                    ou.x.a(lVar, eA, context);
                    return;
                }
            } else {
                if (objB == f.f120449j || objB == f.f120450k) {
                    break;
                }
                if (objB != f.f120446g && objB != f.f120445f) {
                    if (objB == f.f120448i || objB == f.f120443d || objB == f.z()) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + objB).toString());
                }
            }
        }
        w(index);
        if (!z15 || (lVar2 = y().onUndeliveredElement) == null) {
            return;
        }
        ou.x.a(lVar2, eA, context);
    }

    public final boolean v(int index, Object from, Object to4) {
        return l.a(getF120469f(), (index * 2) + 1, from, to4);
    }

    public final void w(int index) {
        E(index, null);
    }

    public final Object x(int index, Object update) {
        return getF120469f().getAndSet((index * 2) + 1, update);
    }

    public final e<E> y() {
        return this._channel;
    }
}
