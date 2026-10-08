package k33;

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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B3\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR&\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001f8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010+\u001a\b\u0012\u0004\u0012\u00020&0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R \u00101\u001a\b\u0012\u0004\u0012\u00020\u00120,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Lk33/n;", "Ll00/g;", "Lk33/b;", "Lk33/a;", "Lk33/c;", "", "Lyy/a;", "stateMachineFactory", "Ll33/a;", "mapper", "Lcb4/j;", "dialogVMSFactory", "Lp23/b;", "newReportExitDialogMapper", "Lk33/d;", "contract", "<init>", "(Lyy/a;Ll33/a;Lcb4/j;Lp23/b;Lk33/d;)V", "Lk33/c$a;", "p9", "(Lk33/b;)Lk33/c$a;", "b", "Ll33/a;", "c", "Lcb4/j;", "d", "Lp23/b;", "Lk33/b$b;", "e", "Lk33/b$b;", "initialState", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lk33/a$b;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<k33.b, k33.a> implements k33.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l33.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final cb4.j dialogVMSFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p23.b newReportExitDialogMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final k33.b.C2567b initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t<k33.b, k33.a> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<k33.a.b> navAction;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<k33.c.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<k33.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f107815a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f107816b;

        /* JADX INFO: renamed from: k33.n$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2568a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f107817a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f107818b;

            /* JADX INFO: renamed from: k33.n$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2569a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f107819d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f107820e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f107821f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f107823h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f107824j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f107825k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f107826l;

                public C2569a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f107819d = obj;
                    this.f107820e |= PKIFailureInfo.systemUnavail;
                    return C2568a.this.F(null, this);
                }
            }

            public C2568a(mu.h hVar, n nVar) {
                this.f107817a = hVar;
                this.f107818b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2569a c2569a;
                if (eVar instanceof C2569a) {
                    c2569a = (C2569a) eVar;
                    int i15 = c2569a.f107820e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2569a.f107820e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2569a = new C2569a(eVar);
                    }
                } else {
                    c2569a = new C2569a(eVar);
                }
                Object obj2 = c2569a.f107819d;
                Object objE = uq.b.e();
                int i16 = c2569a.f107820e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f107817a;
                    k33.c.Data dataP9 = this.f107818b.p9((k33.b) obj);
                    c2569a.f107821f = vq.j.a(obj);
                    c2569a.f107823h = vq.j.a(c2569a);
                    c2569a.f107824j = vq.j.a(obj);
                    c2569a.f107825k = vq.j.a(hVar);
                    c2569a.f107826l = 0;
                    c2569a.f107820e = 1;
                    if (hVar.F(dataP9, c2569a) == objE) {
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

        public a(mu.g gVar, n nVar) {
            this.f107815a = gVar;
            this.f107816b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super k33.c.Data> hVar, tq.e eVar) {
            Object objA = this.f107815a.a(new C2568a(hVar, this.f107816b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk33/a$b;", "action", "Lk33/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lk33/a$b;Lk33/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<k33.a.b, k33.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f107827e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f107828f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k33.a.b bVar = (k33.a.b) this.f107828f;
            Object objE = uq.b.e();
            int i15 = this.f107827e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<k33.a.b> bVarY1 = n.this.Y1();
                this.f107828f = vq.j.a(bVar);
                this.f107827e = 1;
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
        public final Object w(k33.a.b bVar, k33.b bVar2, tq.e<? super i0> eVar) {
            b bVar3 = n.this.new b(eVar);
            bVar3.f107828f = bVar;
            return bVar3.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lk33/a$d;", "<unused var>", "Lk33/b$b;", "Loq/i0;", "<anonymous>", "(Lk33/a$d;Lk33/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<k33.a.d, k33.b.C2567b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f107830e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ k33.d f107831f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ n f107832g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(k33.d dVar, n nVar, tq.e<? super c> eVar) {
            super(3, eVar);
            this.f107831f = dVar;
            this.f107832g = nVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f107830e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            this.f107831f.c3();
            this.f107832g.d9(k33.a.b.d.f107787a);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(k33.a.d dVar, k33.b.C2567b c2567b, tq.e<? super i0> eVar) {
            return new c(this.f107831f, this.f107832g, eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lk33/a$c;", "<unused var>", "Lk10/c0;", "Lk33/b$b;", "state", "Lk10/l;", "Lk33/b;", "<anonymous>", "(Lk33/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<k33.a.c, c0<k33.b.C2567b>, tq.e<? super k10.l<? extends k33.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f107833e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f107834f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final k33.b.Dialog O(n nVar, k33.b.C2567b c2567b) {
            return new k33.b.Dialog(nVar.dialogVMSFactory.a(nVar.newReportExitDialogMapper.b(new p23.b.Params(nVar.b9(k33.a.b.C2566b.f107785a), nVar.b9(k33.a.C2564a.f107783a)))));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f107834f;
            uq.b.e();
            if (this.f107833e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            final n nVar = n.this;
            return c0Var.d(new er.l() { // from class: k33.o
                @Override // er.l
                public final Object b(Object obj2) {
                    return n.d.O(nVar, (b.C2567b) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(k33.a.c cVar, c0<k33.b.C2567b> c0Var, tq.e<? super k10.l<? extends k33.b>> eVar) {
            d dVar = n.this.new d(eVar);
            dVar.f107834f = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lk33/a$a;", "<unused var>", "Lk10/c0;", "Lk33/b$a;", "state", "Lk10/l;", "Lk33/b;", "<anonymous>", "(Lk33/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<k33.a.C2564a, c0<k33.b.Dialog>, tq.e<? super k10.l<? extends k33.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f107836e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f107837f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final k33.b.C2567b O(k33.b.Dialog dialog) {
            return k33.b.C2567b.f107791a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f107837f;
            uq.b.e();
            if (this.f107836e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.d(new er.l() { // from class: k33.p
                @Override // er.l
                public final Object b(Object obj2) {
                    return n.e.O((b.Dialog) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(k33.a.C2564a c2564a, c0<k33.b.Dialog> c0Var, tq.e<? super k10.l<? extends k33.b>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f107837f = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    public n(yy.a aVar, l33.a aVar2, cb4.j jVar, p23.b bVar, final k33.d dVar) {
        this.mapper = aVar2;
        this.dialogVMSFactory = jVar;
        this.newReportExitDialogMapper = bVar;
        k33.b.C2567b c2567b = k33.b.C2567b.f107791a;
        this.initialState = c2567b;
        this.stateMachine = aVar.a(c2567b, new er.l() { // from class: k33.m
            @Override // er.l
            public final Object b(Object obj) {
                return n.r9(this.f107806a, dVar, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), p9(c2567b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k33.c.Data p9(k33.b bVar) {
        return this.mapper.b(new l33.a.Params(bVar, b9(k33.a.b.c.f107786a), b9(k33.a.d.f107789a), b9(k33.a.b.C2565a.f107784a), b9(k33.a.c.f107788a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(final n nVar, final k33.d dVar, v vVar) {
        vVar.c(q0.c(k33.b.class), new er.l() { // from class: k33.j
            @Override // er.l
            public final Object b(Object obj) {
                return n.s9(this.f107803a, (z) obj);
            }
        });
        vVar.c(q0.c(k33.b.C2567b.class), new er.l() { // from class: k33.k
            @Override // er.l
            public final Object b(Object obj) {
                return n.t9(dVar, nVar, (z) obj);
            }
        });
        vVar.c(q0.c(k33.b.Dialog.class), new er.l() { // from class: k33.l
            @Override // er.l
            public final Object b(Object obj) {
                return n.u9((z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(n nVar, z zVar) {
        b bVar = nVar.new b(null);
        zVar.x(q0.c(k33.a.b.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(k33.d dVar, n nVar, z zVar) {
        c cVar = new c(dVar, nVar, null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(k33.a.d.class), oVar, cVar);
        zVar.v(q0.c(k33.a.c.class), oVar, nVar.new d(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(z zVar) {
        e eVar = new e(null);
        zVar.v(q0.c(k33.a.C2564a.class), k10.o.CANCEL_PREVIOUS, eVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<k33.a.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<k33.b, k33.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<k33.c.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: q9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(k33.d dVar) {
        super.P5(dVar);
    }
}
