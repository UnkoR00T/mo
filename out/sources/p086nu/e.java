package p086nu;

import er.p;
import fr.t;
import java.util.ArrayList;
import ju.p0;
import ju.q0;
import ju.r0;
import ju.t0;
import lu.w;
import lu.y;
import mu.g;
import mu.h;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import pq.v;
import tq.i;
import tq.j;
import vq.k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H$¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0015\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H¤@¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010\u0013\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\u001d\u001a\u00020\u00142\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010 \u001a\u0004\u0018\u00010\u001fH\u0014¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010!R\u0014\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010#R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010$R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010&R6\u0010,\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140(\u0012\u0006\u0012\u0004\u0018\u00010)0'8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Lnu/e;", "T", "Lnu/r;", "Ltq/i;", "context", "", "capacity", "Llu/a;", "onBufferOverflow", "<init>", "(Ltq/i;ILlu/a;)V", "Lmu/g;", "i", "()Lmu/g;", "b", "(Ltq/i;ILlu/a;)Lmu/g;", "h", "(Ltq/i;ILlu/a;)Lnu/e;", "Llu/w;", "scope", "Loq/i0;", "g", "(Llu/w;Ltq/e;)Ljava/lang/Object;", "Lju/p0;", "Llu/y;", "l", "(Lju/p0;)Llu/y;", "Lmu/h;", "collector", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "", "d", "()Ljava/lang/String;", "toString", "Ltq/i;", "I", "c", "Llu/a;", "Lkotlin/Function2;", "Ltq/e;", "", "j", "()Ler/p;", "collectToFun", "k", "()I", "produceCapacity", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class e<T> implements r<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final i context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int capacity;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final lu.a onBufferOverflow;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f138711e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f138712f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ h<T> f138713g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ e<T> f138714h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(h<? super T> hVar, e<T> eVar, tq.e<? super a> eVar2) {
            super(2, eVar2);
            this.f138713g = hVar;
            this.f138714h = eVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f138711e;
            if (i15 == 0) {
                u.b(obj);
                p0 p0Var = (p0) this.f138712f;
                h<T> hVar = this.f138713g;
                y<T> yVarL = this.f138714h.l(p0Var);
                this.f138711e = 1;
                if (mu.i.t(hVar, yVarL, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            a aVar = new a(this.f138713g, this.f138714h, eVar);
            aVar.f138712f = obj;
            return aVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Llu/w;", "it", "Loq/i0;", "<anonymous>", "(Llu/w;)V"}, k = 3, mv = {2, 1, 0})
    static final class b extends k implements p<w<? super T>, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f138715e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f138716f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ e<T> f138717g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(e<T> eVar, tq.e<? super b> eVar2) {
            super(2, eVar2);
            this.f138717g = eVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f138715e;
            if (i15 == 0) {
                u.b(obj);
                w<? super T> wVar = (w) this.f138716f;
                e<T> eVar = this.f138717g;
                this.f138715e = 1;
                if (eVar.g(wVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(w<? super T> wVar, tq.e<? super i0> eVar) {
            return ((b) v(wVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            b bVar = new b(this.f138717g, eVar);
            bVar.f138716f = obj;
            return bVar;
        }
    }

    public e(i iVar, int i15, lu.a aVar) {
        this.context = iVar;
        this.capacity = i15;
        this.onBufferOverflow = aVar;
    }

    static /* synthetic */ <T> Object e(e<T> eVar, h<? super T> hVar, tq.e<? super i0> eVar2) {
        Object objE = q0.e(new a(hVar, eVar, null), eVar2);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    @Override // mu.g
    public Object a(h<? super T> hVar, tq.e<? super i0> eVar) {
        return e(this, hVar, eVar);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    @Override // p086nu.r
    public g<T> b(i context, int capacity, lu.a onBufferOverflow) {
        i iVarN0 = context.n0(this.context);
        if (onBufferOverflow == lu.a.SUSPEND) {
            int i15 = this.capacity;
            if (i15 != -3) {
                if (capacity == -3) {
                    capacity = i15;
                } else if (i15 != -2) {
                    if (capacity == -2) {
                        capacity = i15;
                    } else {
                        capacity += i15;
                        if (capacity < 0) {
                            capacity = Integer.MAX_VALUE;
                        }
                    }
                }
            }
            onBufferOverflow = this.onBufferOverflow;
        }
        return (t.c(iVarN0, this.context) && capacity == this.capacity && onBufferOverflow == this.onBufferOverflow) ? this : h(iVarN0, capacity, onBufferOverflow);
    }

    protected String d() {
        return null;
    }

    protected abstract Object g(w<? super T> wVar, tq.e<? super i0> eVar);

    protected abstract e<T> h(i context, int capacity, lu.a onBufferOverflow);

    public g<T> i() {
        return null;
    }

    public final p<w<? super T>, tq.e<? super i0>, Object> j() {
        return new b(this, null);
    }

    public final int k() {
        int i15 = this.capacity;
        if (i15 == -3) {
            return -2;
        }
        return i15;
    }

    public y<T> l(p0 scope) {
        return lu.u.h(scope, this.context, k(), this.onBufferOverflow, r0.ATOMIC, null, j(), 16, null);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strD = d();
        if (strD != null) {
            arrayList.add(strD);
        }
        if (this.context != j.f191408a) {
            arrayList.add("context=" + this.context);
        }
        if (this.capacity != -3) {
            arrayList.add("capacity=" + this.capacity);
        }
        if (this.onBufferOverflow != lu.a.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.onBufferOverflow);
        }
        return t0.a(this) + '[' + v.v0(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
