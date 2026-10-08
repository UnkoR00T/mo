package bd0;

import androidx.p016lifecycle.u0;
import fr.q0;
import k10.c0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006BI\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0096\u0001¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u001dH\u0096\u0001¢\u0006\u0004\b\"\u0010 R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u00106\u001a\u0002018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R \u0010=\u001a\b\u0012\u0004\u0012\u000208078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R&\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030>8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0D8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H¨\u0006I"}, d2 = {"Lbd0/n;", "Ll00/g;", "Lbd0/h;", "Lbd0/g;", "Lbd0/i;", "", "Lnx/b;", "Lyy/a;", "stateMachineFactory", "Lad0/a;", "mapper", "Lad0/c;", "reactivateDialogMapper", "Lwc0/c;", "getLoginLockTimeLeftInMillisUC", "Lwc0/e;", "resetLoginLockCountsUC", "Loz/q;", "ownerViewLifecycleManager", "Lwc0/b;", "getLoginLockStateUC", "Lqg0/d;", "deactivateAppUC", "<init>", "(Lyy/a;Lad0/a;Lad0/c;Lwc0/c;Lwc0/e;Loz/q;Lwc0/b;Lqg0/d;)V", "state", "Lbd0/i$a;", "r9", "(Lbd0/h;)Lbd0/i$a;", "Lmu/g;", "Lnx/c;", "G2", "()Lmu/g;", "Lnx/a;", "x8", "b", "Lad0/a;", "c", "Lad0/c;", "d", "Lwc0/c;", "e", "Lwc0/e;", "f", "Loz/q;", "g", "Lwc0/b;", "h", "Lqg0/d;", "Loz/j;", "j", "Loz/j;", "a", "()Loz/j;", "lifecycleConnector", "Lxw/b;", "Lbd0/g$b;", "k", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "l", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "m", "Lmu/p0;", "getState", "()Lmu/p0;", "loginlock_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<bd0.h, bd0.g> implements bd0.i, zx.d, nx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ad0.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ad0.c reactivateDialogMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final wc0.c getLoginLockTimeLeftInMillisUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final wc0.e resetLoginLockCountsUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final oz.q ownerViewLifecycleManager;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final wc0.b getLoginLockStateUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final qg0.d deactivateAppUC;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final oz.j lifecycleConnector;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final xw.b<bd0.g.b> navAction;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final t<bd0.h, bd0.g> stateMachine;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final p0<bd0.i.a> state;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<ju.p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f18271e;

        /* JADX INFO: renamed from: bd0.n$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lnx/a;", "viewLifecycle", "Loq/i0;", "<anonymous>", "(Lnx/a;)V"}, k = 3, mv = {2, 2, 0})
        static final class C0460a extends vq.k implements er.p<nx.a, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f18273e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f18274f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            /* synthetic */ Object f18275g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ n f18276h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0460a(n nVar, tq.e<? super C0460a> eVar) {
                super(2, eVar);
                this.f18276h = nVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                n nVar;
                nx.a aVar = (nx.a) this.f18275g;
                Object objE = uq.b.e();
                int i15 = this.f18274f;
                if (i15 == 0) {
                    u.b(obj);
                    if (aVar == nx.a.RESUMED) {
                        n nVar2 = this.f18276h;
                        wc0.c cVar = nVar2.getLoginLockTimeLeftInMillisUC;
                        gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                        this.f18275g = vq.j.a(aVar);
                        this.f18273e = nVar2;
                        this.f18274f = 1;
                        Object objD = cVar.d(c1792a, this);
                        if (objD == objE) {
                            return objE;
                        }
                        nVar = nVar2;
                        obj = objD;
                    }
                    return i0.f148189a;
                }
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nVar = (n) this.f18273e;
                u.b(obj);
                nVar.d9(new bd0.g.RefreshTimer(((gu.b) obj).getRawValue(), null));
                return i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(nx.a aVar, tq.e<? super i0> eVar) {
                return ((C0460a) v(aVar, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                C0460a c0460a = new C0460a(this.f18276h, eVar);
                c0460a.f18275g = obj;
                return c0460a;
            }
        }

        a(tq.e<? super a> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f18271e;
            if (i15 == 0) {
                u.b(obj);
                mu.g gVarS = mu.i.S(n.this.x8(), new C0460a(n.this, null));
                this.f18271e = 1;
                if (mu.i.i(gVarS, this) == objE) {
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
        public final Object B(ju.p0 p0Var, tq.e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return n.this.new a(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<bd0.i.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f18277a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f18278b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f18279a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f18280b;

            /* JADX INFO: renamed from: bd0.n$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0461a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f18281d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f18282e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f18283f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f18285h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f18286j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f18287k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f18288l;

                public C0461a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f18281d = obj;
                    this.f18282e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, n nVar) {
                this.f18279a = hVar;
                this.f18280b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0461a c0461a;
                if (eVar instanceof C0461a) {
                    c0461a = (C0461a) eVar;
                    int i15 = c0461a.f18282e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0461a.f18282e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0461a = new C0461a(eVar);
                    }
                } else {
                    c0461a = new C0461a(eVar);
                }
                Object obj2 = c0461a.f18281d;
                Object objE = uq.b.e();
                int i16 = c0461a.f18282e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f18279a;
                    bd0.i.a aVarR9 = this.f18280b.r9((bd0.h) obj);
                    c0461a.f18283f = vq.j.a(obj);
                    c0461a.f18285h = vq.j.a(c0461a);
                    c0461a.f18286j = vq.j.a(obj);
                    c0461a.f18287k = vq.j.a(hVar);
                    c0461a.f18288l = 0;
                    c0461a.f18282e = 1;
                    if (hVar.F(aVarR9, c0461a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public b(mu.g gVar, n nVar) {
            this.f18277a = gVar;
            this.f18278b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super bd0.i.a> hVar, tq.e eVar) {
            Object objA = this.f18277a.a(new a(hVar, this.f18278b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lbd0/g$b;", "action", "Lbd0/h;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lbd0/g$b;Lbd0/h;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<bd0.g.b, bd0.h, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f18289e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f18290f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            bd0.g.b bVar = (bd0.g.b) this.f18290f;
            Object objE = uq.b.e();
            int i15 = this.f18289e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<bd0.g.b> bVarY1 = n.this.Y1();
                this.f18290f = vq.j.a(bVar);
                this.f18289e = 1;
                if (bVarY1.F(bVar, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(bd0.g.b bVar, bd0.h hVar, tq.e<? super i0> eVar) {
            c cVar = n.this.new c(eVar);
            cVar.f18290f = bVar;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lbd0/h$a;", "state", "Lk10/l;", "Lbd0/h;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<c0<bd0.h.a>, tq.e<? super k10.l<? extends bd0.h>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f18292e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f18293f;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final bd0.h.Initialized O(long j15, n nVar, bd0.h.a aVar) {
            return new bd0.h.Initialized(new bd0.h.TimerData(xc0.a.f217927a.a(), j15, nVar.b9(bd0.g.a.f18236a), null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f18293f;
            Object objE = uq.b.e();
            int i15 = this.f18292e;
            if (i15 == 0) {
                u.b(obj);
                wc0.c cVar = n.this.getLoginLockTimeLeftInMillisUC;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f18293f = c0Var;
                this.f18292e = 1;
                obj = cVar.d(c1792a, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            final long rawValue = ((gu.b) obj).getRawValue();
            final n nVar = n.this;
            return c0Var.d(new er.l() { // from class: bd0.o
                @Override // er.l
                public final Object b(Object obj2) {
                    return n.d.O(rawValue, nVar, (h.a) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<bd0.h.a> c0Var, tq.e<? super k10.l<? extends bd0.h>> eVar) {
            return ((d) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            d dVar = n.this.new d(eVar);
            dVar.f18293f = obj;
            return dVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lwc0/f;", "action", "Lbd0/h$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lwc0/f;Lbd0/h$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<wc0.f, bd0.h.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f18295e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f18296f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            wc0.f fVar = (wc0.f) this.f18296f;
            uq.b.e();
            if (this.f18295e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            if (fVar instanceof wc0.f.Locked) {
                n.this.d9(new bd0.g.RefreshTimer(((wc0.f.Locked) fVar).getTimeLeftInMillis(), null));
            } else {
                if (!fr.t.c(fVar, wc0.f.b.f212064a)) {
                    throw new oq.p();
                }
                n.this.d9(bd0.g.a.f18236a);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(wc0.f fVar, bd0.h.Initialized initialized, tq.e<? super i0> eVar) {
            e eVar2 = n.this.new e(eVar);
            eVar2.f18296f = fVar;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lbd0/g$e;", "<unused var>", "Lbd0/h$b;", "Loq/i0;", "<anonymous>", "(Lbd0/g$e;Lbd0/h$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<bd0.g.e, bd0.h.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f18298e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f18298e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<bd0.g.b> bVarY1 = n.this.Y1();
                bd0.g.b.ShowDialog showDialog = new bd0.g.b.ShowDialog(n.this.reactivateDialogMapper.b(new ad0.c.Params(n.this.b9(bd0.g.c.f18240a))));
                this.f18298e = 1;
                if (bVarY1.F(showDialog, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(bd0.g.e eVar, bd0.h.Initialized initialized, tq.e<? super i0> eVar2) {
            return n.this.new f(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lbd0/g$c;", "<unused var>", "Lbd0/h$b;", "Loq/i0;", "<anonymous>", "(Lbd0/g$c;Lbd0/h$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<bd0.g.c, bd0.h.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f18300e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
        
            if (r6.F(r1, r5) == r0) goto L20;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r5.f18300e
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L25
                if (r1 == r4) goto L21
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                oq.u.b(r6)
                goto L5b
            L15:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1d:
                oq.u.b(r6)
                goto L4a
            L21:
                oq.u.b(r6)
                goto L39
            L25:
                oq.u.b(r6)
                bd0.n r6 = bd0.n.this
                wc0.e r6 = bd0.n.p9(r6)
                gz.b$a$a r1 = gz.b.a.C1792a.f78542a
                r5.f18300e = r4
                java.lang.Object r6 = r6.c(r1, r5)
                if (r6 != r0) goto L39
                goto L5a
            L39:
                bd0.n r6 = bd0.n.this
                qg0.d r6 = bd0.n.m9(r6)
                gz.b$a$a r1 = gz.b.a.C1792a.f78542a
                r5.f18300e = r3
                java.lang.Object r6 = r6.c(r1, r5)
                if (r6 != r0) goto L4a
                goto L5a
            L4a:
                bd0.n r6 = bd0.n.this
                xw.b r6 = r6.Y1()
                bd0.g$b$b r1 = bd0.g.b.C0458b.f18238a
                r5.f18300e = r2
                java.lang.Object r6 = r6.F(r1, r5)
                if (r6 != r0) goto L5b
            L5a:
                return r0
            L5b:
                oq.i0 r6 = oq.i0.f148189a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: bd0.n.g.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(bd0.g.c cVar, bd0.h.Initialized initialized, tq.e<? super i0> eVar) {
            return n.this.new g(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lbd0/g$d;", "action", "Lk10/c0;", "Lbd0/h$b;", "state", "Lk10/l;", "Lbd0/h;", "<anonymous>", "(Lbd0/g$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<bd0.g.RefreshTimer, c0<bd0.h.Initialized>, tq.e<? super k10.l<? extends bd0.h>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f18302e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f18303f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f18304g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final bd0.h.Initialized O(bd0.g.RefreshTimer refreshTimer, bd0.h.Initialized initialized) {
            return initialized.a(bd0.h.TimerData.b(initialized.getTimerData(), 0L, refreshTimer.getTimeLeft(), null, 5, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final bd0.g.RefreshTimer refreshTimer = (bd0.g.RefreshTimer) this.f18303f;
            c0 c0Var = (c0) this.f18304g;
            uq.b.e();
            if (this.f18302e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.b(new er.l() { // from class: bd0.p
                @Override // er.l
                public final Object b(Object obj2) {
                    return n.h.O(refreshTimer, (h.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(bd0.g.RefreshTimer refreshTimer, c0<bd0.h.Initialized> c0Var, tq.e<? super k10.l<? extends bd0.h>> eVar) {
            h hVar = new h(eVar);
            hVar.f18303f = refreshTimer;
            hVar.f18304g = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lbd0/g$a;", "<unused var>", "Lbd0/h$b;", "Loq/i0;", "<anonymous>", "(Lbd0/g$a;Lbd0/h$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<bd0.g.a, bd0.h.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f18305e;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
        
            if (r5.F(r1, r4) == r0) goto L15;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r5) throws java.lang.Throwable {
            /*
                r4 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r4.f18305e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r5)
                goto L43
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                oq.u.b(r5)
                goto L32
            L1e:
                oq.u.b(r5)
                bd0.n r5 = bd0.n.this
                wc0.e r5 = bd0.n.p9(r5)
                gz.b$a$a r1 = gz.b.a.C1792a.f78542a
                r4.f18305e = r3
                java.lang.Object r5 = r5.c(r1, r4)
                if (r5 != r0) goto L32
                goto L42
            L32:
                bd0.n r5 = bd0.n.this
                xw.b r5 = r5.Y1()
                bd0.g$b$c r1 = bd0.g.b.c.f18239a
                r4.f18305e = r2
                java.lang.Object r5 = r5.F(r1, r4)
                if (r5 != r0) goto L43
            L42:
                return r0
            L43:
                oq.i0 r5 = oq.i0.f148189a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: bd0.n.i.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(bd0.g.a aVar, bd0.h.Initialized initialized, tq.e<? super i0> eVar) {
            return n.this.new i(eVar).J(i0.f148189a);
        }
    }

    public n(yy.a aVar, ad0.a aVar2, ad0.c cVar, wc0.c cVar2, wc0.e eVar, oz.q qVar, wc0.b bVar, qg0.d dVar) {
        this.mapper = aVar2;
        this.reactivateDialogMapper = cVar;
        this.getLoginLockTimeLeftInMillisUC = cVar2;
        this.resetLoginLockCountsUC = eVar;
        this.ownerViewLifecycleManager = qVar;
        this.getLoginLockStateUC = bVar;
        this.deactivateAppUC = dVar;
        ju.k.d(u0.a(this), null, null, new a(null), 3, null);
        this.lifecycleConnector = qVar;
        this.navAction = new xw.b<>();
        bd0.h.a aVar3 = bd0.h.a.f18243a;
        this.stateMachine = aVar.a(aVar3, new er.l() { // from class: bd0.j
            @Override // er.l
            public final Object b(Object obj) {
                return n.t9(this.f18256a, (v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), r9(aVar3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bd0.i.a r9(bd0.h state) {
        return this.mapper.b(new ad0.a.Params(state, b9(bd0.g.e.f18242a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(final n nVar, v vVar) {
        vVar.c(q0.c(bd0.h.class), new er.l() { // from class: bd0.k
            @Override // er.l
            public final Object b(Object obj) {
                return n.u9(this.f18257a, (z) obj);
            }
        });
        vVar.c(q0.c(bd0.h.a.class), new er.l() { // from class: bd0.l
            @Override // er.l
            public final Object b(Object obj) {
                return n.v9(this.f18258a, (z) obj);
            }
        });
        vVar.c(q0.c(bd0.h.Initialized.class), new er.l() { // from class: bd0.m
            @Override // er.l
            public final Object b(Object obj) {
                return n.w9(this.f18259a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(n nVar, z zVar) {
        c cVar = nVar.new c(null);
        zVar.x(q0.c(bd0.g.b.class), k10.o.CANCEL_PREVIOUS, cVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(n nVar, z zVar) {
        zVar.A(nVar.new d(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(n nVar, z zVar) {
        k10.k.s(zVar, nVar.getLoginLockStateUC.c(gz.b.a.C1792a.f78542a), null, nVar.new e(null), 2, null);
        f fVar = nVar.new f(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(bd0.g.e.class), oVar, fVar);
        zVar.x(q0.c(bd0.g.c.class), oVar, nVar.new g(null));
        zVar.v(q0.c(bd0.g.RefreshTimer.class), oVar, new h(null));
        zVar.x(q0.c(bd0.g.a.class), oVar, nVar.new i(null));
        return i0.f148189a;
    }

    @Override // nx.b
    public mu.g<nx.c> G2() {
        return this.ownerViewLifecycleManager.G2();
    }

    @Override // zx.b
    public xw.b<bd0.g.b> Y1() {
        return this.navAction;
    }

    @Override // bd0.i
    /* JADX INFO: renamed from: a, reason: from getter */
    public oz.j getLifecycleConnector() {
        return this.lifecycleConnector;
    }

    @Override // l00.g
    protected t<bd0.h, bd0.g> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<bd0.i.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: s9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(bd0.i.a aVar) {
        super.P5(aVar);
    }

    @Override // nx.b
    public mu.g<nx.a> x8() {
        return this.ownerViewLifecycleManager.x8();
    }
}
