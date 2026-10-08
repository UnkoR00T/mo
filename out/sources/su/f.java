package su;

import er.q;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ju.k3;
import ju.l0;
import ju.n;
import ju.p;
import ju.r;
import ju.t0;
import oq.i0;
import ou.b0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002:\u0001#B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0082@¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u000bJ\u001a\u0010\u0010\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096@¢\u0006\u0004\b\u0010\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017RR\u0010\u001e\u001a@\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\f0\u00180\u0018j\u0002`\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001dR\u0014\u0010!\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0013\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\"8\u0002X\u0082\u0004¨\u0006$"}, d2 = {"Lsu/f;", "Lsu/j;", "Lsu/a;", "", "locked", "<init>", "(Z)V", "", "owner", "", "B", "(Ljava/lang/Object;)I", "Loq/i0;", ip.a.f96138c, "(Ljava/lang/Object;Ltq/e;)Ljava/lang/Object;", "G", "h", "m", "(Ljava/lang/Object;)Z", "r", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "Lkotlin/Function3;", "Lru/k;", "", "Ltq/i;", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "Ler/q;", "onSelectCancellationUnlockConstructor", "p", "()Z", "isLocked", "Liu/e;", "a", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class f extends j implements su.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f184340j = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "owner$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final q<ru.k<?>, Object, Object, q<Throwable, Object, tq.i, i0>> onSelectCancellationUnlockConstructor;
    private volatile /* synthetic */ Object owner$volatile;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001f\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJO\u0010\u0011\u001a\u0004\u0018\u00010\u0006\"\b\b\u0000\u0010\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00028\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u00062 \u0010\u0010\u001a\u001c\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012JC\u0010\u0013\u001a\u00020\u0002\"\b\b\u0000\u0010\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00028\u00002 \u0010\u0010\u001a\u001c\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\u000eH\u0097\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0006H\u0097\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000eH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ*\u0010\"\u001a\u00020\u00022\u0018\u0010!\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00020\u001fj\u0002` H\u0096\u0001¢\u0006\u0004\b\"\u0010#J$\u0010(\u001a\u00020\u00022\n\u0010%\u001a\u0006\u0012\u0002\b\u00030$2\u0006\u0010'\u001a\u00020&H\u0096\u0001¢\u0006\u0004\b(\u0010)J\u001c\u0010+\u001a\u00020\u0002*\u00020*2\u0006\u0010\u000b\u001a\u00020\u0002H\u0097\u0001¢\u0006\u0004\b+\u0010,J\u001e\u0010/\u001a\u00020\u00022\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00020-H\u0096\u0001¢\u0006\u0004\b/\u0010\u001aR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00106\u001a\u00020\u001c8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u00108\u001a\u00020\u001c8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b7\u00105R\u0014\u0010;\u001a\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006<"}, d2 = {"Lsu/f$a;", "Lju/n;", "Loq/i0;", "Lju/k3;", "Lju/p;", "cont", "", "owner", "<init>", "(Lsu/f;Lju/p;Ljava/lang/Object;)V", "R", "value", "idempotent", "Lkotlin/Function3;", "", "Ltq/i;", "onCancellation", "j", "(Loq/i0;Ljava/lang/Object;Ler/q;)Ljava/lang/Object;", "d", "(Loq/i0;Ler/q;)V", "exception", "G", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "token", "W", "(Ljava/lang/Object;)V", "cause", "", "Q", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "Lkotlinx/coroutines/CompletionHandler;", "handler", "E", "(Ler/l;)V", "Lou/b0;", "segment", "", "index", "g", "(Lou/b0;I)V", "Lju/l0;", "f", "(Lju/l0;Loq/i0;)V", "Loq/t;", "result", "i", "a", "Lju/p;", "b", "Ljava/lang/Object;", "h", "()Z", "isActive", "r", "isCompleted", "c", "()Ltq/i;", "context", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    final class a implements n<i0>, k3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final p<i0> cont;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final Object owner;

        /* JADX WARN: Multi-variable type inference failed */
        public a(p<? super i0> pVar, Object obj) {
            this.cont = pVar;
            this.owner = obj;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 e(f fVar, a aVar, Throwable th4) {
            fVar.r(aVar.owner);
            return i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 k(f fVar, a aVar, Throwable th4, i0 i0Var, tq.i iVar) {
            f.A().set(fVar, aVar.owner);
            fVar.r(aVar.owner);
            return i0.f148189a;
        }

        @Override // ju.n
        public void E(er.l<? super Throwable, i0> handler) {
            this.cont.E(handler);
        }

        @Override // ju.n
        public Object G(Throwable exception) {
            return this.cont.G(exception);
        }

        @Override // ju.n
        public boolean Q(Throwable cause) {
            return this.cont.Q(cause);
        }

        @Override // ju.n
        public void W(Object token) {
            this.cont.W(token);
        }

        @Override // tq.e
        /* JADX INFO: renamed from: c */
        public tq.i getContext() {
            return this.cont.getContext();
        }

        @Override // ju.n
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public <R extends i0> void T(R value, q<? super Throwable, ? super R, ? super tq.i, i0> onCancellation) {
            f.A().set(f.this, this.owner);
            p<i0> pVar = this.cont;
            final f fVar = f.this;
            pVar.P(value, new er.l() { // from class: su.e
                @Override // er.l
                public final Object b(Object obj) {
                    return f.a.e(fVar, this, (Throwable) obj);
                }
            });
        }

        @Override // ju.n
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void R(l0 l0Var, i0 i0Var) {
            this.cont.R(l0Var, i0Var);
        }

        @Override // ju.k3
        public void g(b0<?> segment, int index) {
            this.cont.g(segment, index);
        }

        @Override // ju.n
        public boolean h() {
            return this.cont.h();
        }

        @Override // tq.e
        public void i(Object result) {
            this.cont.i(result);
        }

        @Override // ju.n
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public <R extends i0> Object U(R value, Object idempotent, q<? super Throwable, ? super R, ? super tq.i, i0> onCancellation) {
            final f fVar = f.this;
            Object objU = this.cont.U(value, idempotent, new q() { // from class: su.d
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return f.a.k(fVar, this, (Throwable) obj, (i0) obj2, (tq.i) obj3);
                }
            });
            if (objU != null) {
                f.A().set(f.this, this.owner);
            }
            return objU;
        }

        @Override // ju.n
        public boolean r() {
            return this.cont.r();
        }
    }

    public f(boolean z15) {
        super(1, z15 ? 1 : 0);
        this.owner$volatile = z15 ? null : g.f184345a;
        this.onSelectCancellationUnlockConstructor = new q() { // from class: su.b
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return f.E(this.f184333a, (ru.k) obj, obj2, obj3);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater A() {
        return f184340j;
    }

    private final int B(Object owner) {
        while (p()) {
            Object obj = f184340j.get(this);
            if (obj != g.f184345a) {
                return obj == owner ? 1 : 2;
            }
        }
        return 0;
    }

    static /* synthetic */ Object C(f fVar, Object obj, tq.e<? super i0> eVar) {
        Object objD;
        return (!fVar.m(obj) && (objD = fVar.D(obj, eVar)) == uq.b.e()) ? objD : i0.f148189a;
    }

    private final Object D(Object obj, tq.e<? super i0> eVar) {
        p pVarB = r.b(uq.b.c(eVar));
        try {
            f(new a(pVarB, obj));
            Object objX = pVarB.x();
            if (objX == uq.b.e()) {
                vq.g.c(eVar);
            }
            return objX == uq.b.e() ? objX : i0.f148189a;
        } catch (Throwable th4) {
            pVarB.N();
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q E(final f fVar, ru.k kVar, final Object obj, Object obj2) {
        return new q() { // from class: su.c
            @Override // er.q
            public final Object w(Object obj3, Object obj4, Object obj5) {
                return f.F(this.f184334a, obj, (Throwable) obj3, obj4, (tq.i) obj5);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F(f fVar, Object obj, Throwable th4, Object obj2, tq.i iVar) {
        fVar.r(obj);
        return i0.f148189a;
    }

    private final int G(Object owner) {
        while (!u()) {
            if (owner == null) {
                return 1;
            }
            int iB = B(owner);
            if (iB == 1) {
                return 2;
            }
            if (iB == 2) {
                return 1;
            }
        }
        f184340j.set(this, owner);
        return 0;
    }

    @Override // su.a
    public Object h(Object obj, tq.e<? super i0> eVar) {
        return C(this, obj, eVar);
    }

    @Override // su.a
    public boolean m(Object owner) {
        int iG = G(owner);
        if (iG == 0) {
            return true;
        }
        if (iG == 1) {
            return false;
        }
        if (iG != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + owner).toString());
    }

    @Override // su.a
    public boolean p() {
        return a() == 0;
    }

    @Override // su.a
    public void r(Object owner) {
        while (p()) {
            Object obj = f184340j.get(this);
            if (obj != g.f184345a) {
                if (obj != owner && owner != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj + ", but " + owner + " is expected").toString());
                }
                if (androidx.concurrent.futures.b.a(f184340j, this, obj, g.f184345a)) {
                    b();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public String toString() {
        return "Mutex@" + t0.b(this) + "[isLocked=" + p() + ",owner=" + f184340j.get(this) + ']';
    }
}
