package p94;

import f00.j0;
import fr.q0;
import j94.PartialBehaviourGrade;
import k10.c0;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u00013B3\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010'\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R&\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030(8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lp94/n;", "Ll00/g;", "Lp94/h;", "Lp94/g;", "Lp94/i;", "", "Lyy/a;", "stateMachineFactory", "Lr94/a;", "mapper", "Lhb4/d;", "errorVMSFactory", "Lib4/c;", "genericDomainErrorMapper", "Lq94/a;", "contract", "<init>", "(Lyy/a;Lr94/a;Lhb4/d;Lib4/c;Lq94/a;)V", "state", "Lp94/i$a;", "q9", "(Lp94/h;)Lp94/i$a;", "b", "Lr94/a;", "c", "Lhb4/d;", "d", "Lib4/c;", "e", "Lq94/a;", "f", "Lp94/h;", "initialState", "Lxw/b;", "Lp94/g$a;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "h", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "schoolbehavior_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<h, g> implements i, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final r94.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final q94.a contract;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final h initialState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<g.a> navAction;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final k10.t<h, g> stateMachine;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<i.a> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lp94/n$a;", "Lf00/j0;", "Lq94/a;", "Lp94/n;", "schoolbehavior_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends j0<q94.a, n> {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<i.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f153748a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f153749b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f153750a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f153751b;

            /* JADX INFO: renamed from: p94.n$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3804a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f153752d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f153753e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f153754f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f153756h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f153757j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f153758k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f153759l;

                public C3804a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f153752d = obj;
                    this.f153753e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, n nVar) {
                this.f153750a = hVar;
                this.f153751b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3804a c3804a;
                if (eVar instanceof C3804a) {
                    c3804a = (C3804a) eVar;
                    int i15 = c3804a.f153753e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3804a.f153753e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3804a = new C3804a(eVar);
                    }
                } else {
                    c3804a = new C3804a(eVar);
                }
                Object obj2 = c3804a.f153752d;
                Object objE = uq.b.e();
                int i16 = c3804a.f153753e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f153750a;
                    i.a aVarQ9 = this.f153751b.q9((h) obj);
                    c3804a.f153754f = vq.j.a(obj);
                    c3804a.f153756h = vq.j.a(c3804a);
                    c3804a.f153757j = vq.j.a(obj);
                    c3804a.f153758k = vq.j.a(hVar);
                    c3804a.f153759l = 0;
                    c3804a.f153753e = 1;
                    if (hVar.F(aVarQ9, c3804a) == objE) {
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
            this.f153748a = gVar;
            this.f153749b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super i.a> hVar, tq.e eVar) {
            Object objA = this.f153748a.a(new a(hVar, this.f153749b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lp94/h$c;", "state", "Lk10/l;", "Lp94/h;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<c0<h.c>, tq.e<? super k10.l<? extends h>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f153760e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f153761f;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h.DisplayingGradeDetails X(PartialBehaviourGrade partialBehaviourGrade, h.c cVar) {
            return new h.DisplayingGradeDetails(partialBehaviourGrade);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h.ErrorLoadingGradeDetails Y(final n nVar, h.c cVar) {
            return new h.ErrorLoadingGradeDetails(nVar.errorVMSFactory.a(nVar.genericDomainErrorMapper.b(new ib4.c.Params(new dx.b.Generic(null, 1, null), false, new er.l() { // from class: p94.q
                @Override // er.l
                public final Object b(Object obj) {
                    return n.c.Z(nVar, (ib4.c.b) obj);
                }
            }))));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 Z(n nVar, ib4.c.b bVar) {
            nVar.d9(g.b.f153726a);
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.l lVarD;
            c0 c0Var = (c0) this.f153761f;
            uq.b.e();
            if (this.f153760e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            final PartialBehaviourGrade partialBehaviourGradeP0 = n.this.contract.p0();
            if (partialBehaviourGradeP0 != null && (lVarD = c0Var.d(new er.l() { // from class: p94.o
                @Override // er.l
                public final Object b(Object obj2) {
                    return n.c.X(partialBehaviourGradeP0, (h.c) obj2);
                }
            })) != null) {
                return lVarD;
            }
            final n nVar = n.this;
            return c0Var.d(new er.l() { // from class: p94.p
                @Override // er.l
                public final Object b(Object obj2) {
                    return n.c.Y(nVar, (h.c) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<h.c> c0Var, tq.e<? super k10.l<? extends h>> eVar) {
            return ((c) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = n.this.new c(eVar);
            cVar.f153761f = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lp94/g$b;", "<unused var>", "Lp94/h$a;", "Loq/i0;", "<anonymous>", "(Lp94/g$b;Lp94/h$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<g.b, h.DisplayingGradeDetails, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f153763e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f153763e;
            if (i15 == 0) {
                u.b(obj);
                n nVar = n.this;
                g.a.C3802a c3802a = g.a.C3802a.f153725a;
                this.f153763e = 1;
                if (nVar.F(c3802a, this) == objE) {
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
        public final Object w(g.b bVar, h.DisplayingGradeDetails displayingGradeDetails, tq.e<? super i0> eVar) {
            return n.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lp94/g$b;", "<unused var>", "Lp94/h$b;", "Loq/i0;", "<anonymous>", "(Lp94/g$b;Lp94/h$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<g.b, h.ErrorLoadingGradeDetails, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f153765e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f153765e;
            if (i15 == 0) {
                u.b(obj);
                n nVar = n.this;
                g.a.C3802a c3802a = g.a.C3802a.f153725a;
                this.f153765e = 1;
                if (nVar.F(c3802a, this) == objE) {
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
        public final Object w(g.b bVar, h.ErrorLoadingGradeDetails errorLoadingGradeDetails, tq.e<? super i0> eVar) {
            return n.this.new e(eVar).J(i0.f148189a);
        }
    }

    public n(yy.a aVar, r94.a aVar2, hb4.d dVar, ib4.c cVar, q94.a aVar3) {
        this.mapper = aVar2;
        this.errorVMSFactory = dVar;
        this.genericDomainErrorMapper = cVar;
        this.contract = aVar3;
        h.c cVar2 = h.c.f153729a;
        this.initialState = cVar2;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(cVar2, new er.l() { // from class: p94.m
            @Override // er.l
            public final Object b(Object obj) {
                return n.s9(this.f153739a, (v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), q9(cVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i.a q9(h state) {
        return this.mapper.b(new r94.a.Params(state, b9(g.b.f153726a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(final n nVar, v vVar) {
        vVar.c(q0.c(h.c.class), new er.l() { // from class: p94.j
            @Override // er.l
            public final Object b(Object obj) {
                return n.t9(this.f153736a, (z) obj);
            }
        });
        vVar.c(q0.c(h.DisplayingGradeDetails.class), new er.l() { // from class: p94.k
            @Override // er.l
            public final Object b(Object obj) {
                return n.u9(this.f153737a, (z) obj);
            }
        });
        vVar.c(q0.c(h.ErrorLoadingGradeDetails.class), new er.l() { // from class: p94.l
            @Override // er.l
            public final Object b(Object obj) {
                return n.v9(this.f153738a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(n nVar, z zVar) {
        zVar.A(nVar.new c(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(n nVar, z zVar) {
        d dVar = nVar.new d(null);
        zVar.x(q0.c(g.b.class), k10.o.CANCEL_PREVIOUS, dVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(n nVar, z zVar) {
        e eVar = nVar.new e(null);
        zVar.x(q0.c(g.b.class), k10.o.CANCEL_PREVIOUS, eVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<g.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<h, g> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<i.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: p9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(g.a aVar, tq.e<? super i0> eVar) {
        return super.F(aVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: r9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
