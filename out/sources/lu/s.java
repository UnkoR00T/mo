package lu;

import fr.q0;
import oq.i0;
import ou.s0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\"\b\u0002\u0010\n\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\t¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\r\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u000e8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Llu/s;", "E", "Llu/e;", "", "capacity", "Llu/a;", "onBufferOverflow", "Lkotlin/Function1;", "Loq/i0;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(ILlu/a;Ler/l;)V", "element", "", "isSendOp", "Llu/k;", "A1", "(Ljava/lang/Object;Z)Ljava/lang/Object;", "z1", "l", "(Ljava/lang/Object;Ltq/e;)Ljava/lang/Object;", "d", "(Ljava/lang/Object;)Ljava/lang/Object;", "n", "I", "p", "Llu/a;", "D0", "()Z", "isConflatedDropOldest", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class s<E> extends e<E> {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int capacity;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final a onBufferOverflow;

    public s(int i15, a aVar, er.l<? super E, i0> lVar) {
        super(i15, lVar);
        this.capacity = i15;
        this.onBufferOverflow = aVar;
        if (aVar == a.SUSPEND) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + q0.c(e.class).D() + " instead").toString());
        }
        if (i15 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i15 + " was specified").toString());
    }

    private final Object A1(E element, boolean isSendOp) {
        return this.onBufferOverflow == a.DROP_LATEST ? z1(element, isSendOp) : o1(element);
    }

    static /* synthetic */ <E> Object y1(s<E> sVar, E e15, tq.e<? super i0> eVar) throws Throwable {
        s0 s0VarC;
        Object objA1 = sVar.A1(e15, true);
        if (!(objA1 instanceof k.Closed)) {
            return i0.f148189a;
        }
        k.e(objA1);
        er.l<E, i0> lVar = sVar.onUndeliveredElement;
        if (lVar == null || (s0VarC = ou.x.c(lVar, e15, null, 2, null)) == null) {
            throw sVar.p0();
        }
        oq.c.a(s0VarC, sVar.p0());
        throw s0VarC;
    }

    private final Object z1(E element, boolean isSendOp) {
        er.l<E, i0> lVar;
        s0 s0VarC;
        Object objD = super.d(element);
        if (k.j(objD) || k.i(objD)) {
            return objD;
        }
        if (!isSendOp || (lVar = this.onUndeliveredElement) == null || (s0VarC = ou.x.c(lVar, element, null, 2, null)) == null) {
            return k.INSTANCE.c(i0.f148189a);
        }
        throw s0VarC;
    }

    @Override // lu.e
    protected boolean D0() {
        return this.onBufferOverflow == a.DROP_OLDEST;
    }

    @Override // lu.e, lu.z
    public Object d(E element) {
        return A1(element, false);
    }

    @Override // lu.e, lu.z
    public Object l(E e15, tq.e<? super i0> eVar) {
        return y1(this, e15, eVar);
    }
}
