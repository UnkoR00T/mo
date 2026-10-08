package a43;

import fr.q0;
import java.util.Comparator;
import java.util.List;
import k10.c0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tt0.BEReportedInterventionGroup;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006BA\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\u0017*\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001aH\u0096\u0001¢\u0006\u0004\b\u001f\u0010\u001dR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00105\u001a\u0002008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R&\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003068\u0014X\u0094\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R \u0010B\u001a\b\u0012\u0004\u0012\u00020=0<8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR \u0010H\u001a\b\u0012\u0004\u0012\u00020\u00170C8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G¨\u0006I"}, d2 = {"La43/q;", "Ll00/g;", "La43/b;", "La43/a;", "La43/c;", "Lnx/b;", "", "Lyy/a;", "stateMachineFactory", "Lut0/d;", "getReportedInterventions", "Lhb4/d;", "errorVMSFactory", "Lac4/a;", "loaderUseCase", "Lib4/c;", "domainErrorMapper", "Lb43/b;", "mapper", "Loz/q;", "ownerViewLifecycleManager", "<init>", "(Lyy/a;Lut0/d;Lhb4/d;Lac4/a;Lib4/c;Lb43/b;Loz/q;)V", "La43/c$a;", "s9", "(La43/b;)La43/c$a;", "Lmu/g;", "Lnx/c;", "G2", "()Lmu/g;", "Lnx/a;", "x8", "b", "Lut0/d;", "c", "Lhb4/d;", "d", "Lac4/a;", "e", "Lib4/c;", "f", "Lb43/b;", "g", "Loz/q;", "La43/b$c;", "h", "La43/b$c;", "initialState", "Loz/j;", "j", "Loz/j;", "a", "()Loz/j;", "lifecycleConnector", "Lk10/t;", "k", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "La43/a$b;", "l", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "m", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q extends l00.g<a43.b, a43.a> implements a43.c, nx.b, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ut0.d getReportedInterventions;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ac4.a loaderUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ib4.c domainErrorMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final b43.b mapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final oz.q ownerViewLifecycleManager;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final a43.b.c initialState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final oz.j lifecycleConnector;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final k10.t<a43.b, a43.a> stateMachine;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final xw.b<a43.a.b> navAction;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final p0<a43.c.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<a43.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f2936a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f2937b;

        /* JADX INFO: renamed from: a43.q$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0052a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f2938a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ q f2939b;

            /* JADX INFO: renamed from: a43.q$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0053a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f2940d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f2941e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f2942f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f2944h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f2945j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f2946k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f2947l;

                public C0053a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f2940d = obj;
                    this.f2941e |= PKIFailureInfo.systemUnavail;
                    return C0052a.this.F(null, this);
                }
            }

            public C0052a(mu.h hVar, q qVar) {
                this.f2938a = hVar;
                this.f2939b = qVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0053a c0053a;
                if (eVar instanceof C0053a) {
                    c0053a = (C0053a) eVar;
                    int i15 = c0053a.f2941e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0053a.f2941e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0053a = new C0053a(eVar);
                    }
                } else {
                    c0053a = new C0053a(eVar);
                }
                Object obj2 = c0053a.f2940d;
                Object objE = uq.b.e();
                int i16 = c0053a.f2941e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f2938a;
                    a43.c.a aVarS9 = this.f2939b.s9((a43.b) obj);
                    c0053a.f2942f = vq.j.a(obj);
                    c0053a.f2944h = vq.j.a(c0053a);
                    c0053a.f2945j = vq.j.a(obj);
                    c0053a.f2946k = vq.j.a(hVar);
                    c0053a.f2947l = 0;
                    c0053a.f2941e = 1;
                    if (hVar.F(aVarS9, c0053a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public a(mu.g gVar, q qVar) {
            this.f2936a = gVar;
            this.f2937b = qVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super a43.c.a> hVar, tq.e eVar) {
            Object objA = this.f2936a.a(new C0052a(hVar, this.f2937b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"La43/a$b;", "action", "La43/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(La43/a$b;La43/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<a43.a.b, a43.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f2948e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f2949f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            a43.a.b bVar = (a43.a.b) this.f2949f;
            Object objE = uq.b.e();
            int i15 = this.f2948e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<a43.a.b> bVarY1 = q.this.Y1();
                this.f2949f = vq.j.a(bVar);
                this.f2948e = 1;
                if (bVarY1.F(bVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a43.a.b bVar, a43.b bVar2, tq.e<? super i0> eVar) {
            b bVar3 = q.this.new b(eVar);
            bVar3.f2949f = bVar;
            return bVar3.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "La43/b$c;", "state", "Lk10/l;", "La43/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<c0<a43.b.c>, tq.e<? super k10.l<? extends a43.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f2951e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f2952f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "La43/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends a43.b>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f2954e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ q f2955f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ c0<a43.b.c> f2956g;

            /* JADX INFO: renamed from: a43.q$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0054a<T> implements Comparator {
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t15, T t16) {
                    return sq.a.e(((BEReportedInterventionGroup) t16).getCreatedAt().getDate(), ((BEReportedInterventionGroup) t15).getCreatedAt().getDate());
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(q qVar, c0<a43.b.c> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f2955f = qVar;
                this.f2956g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final a43.b.Error Y(final q qVar, dx.b bVar, a43.b.c cVar) {
                return new a43.b.Error(qVar.errorVMSFactory.a(qVar.domainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: a43.t
                    @Override // er.l
                    public final Object b(Object obj) {
                        return q.c.a.Z(qVar, (ib4.c.b) obj);
                    }
                }, 2, null))));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final i0 Z(q qVar, ib4.c.b bVar) {
                if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                    qVar.d9(a43.a.C0043a.f2890a);
                } else {
                    qVar.d9(a43.a.b.C0044a.f2891a);
                }
                return i0.f148189a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final a43.b.Content a0(List list, a43.b.c cVar) {
                return new a43.b.Content(pq.v.U0(list, new C0054a()));
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f2954e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    ut0.d dVar = this.f2955f.getReportedInterventions;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    this.f2954e = 1;
                    obj = dVar.c(c1792a, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                dx.i iVar = (dx.i) obj;
                c0<a43.b.c> c0Var = this.f2956g;
                final q qVar = this.f2955f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: a43.r
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return q.c.a.Y(qVar, bVar, (b.c) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final List list = (List) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: a43.s
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return q.c.a.a0(list, (b.c) obj2);
                    }
                });
            }

            public final tq.e<i0> V(tq.e<?> eVar) {
                return new a(this.f2955f, this.f2956g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends a43.b>> eVar) {
                return ((a) V(eVar)).J(i0.f148189a);
            }
        }

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f2952f;
            Object objE = uq.b.e();
            int i15 = this.f2951e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = q.this.loaderUseCase;
            a aVar2 = new a(q.this, c0Var, null);
            this.f2952f = vq.j.a(c0Var);
            this.f2951e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<a43.b.c> c0Var, tq.e<? super k10.l<? extends a43.b>> eVar) {
            return ((c) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = q.this.new c(eVar);
            cVar.f2952f = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"La43/a$c;", "action", "Lk10/c0;", "La43/b$c;", "state", "Lk10/l;", "La43/b;", "<anonymous>", "(La43/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<a43.a.SetError, c0<a43.b.c>, tq.e<? super k10.l<? extends a43.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f2957e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f2958f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f2959g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final a43.b.Error V(final q qVar, a43.a.SetError setError, a43.b.c cVar) {
            return new a43.b.Error(qVar.errorVMSFactory.a(qVar.domainErrorMapper.b(new ib4.c.Params(setError.getError(), false, new er.l() { // from class: a43.v
                @Override // er.l
                public final Object b(Object obj) {
                    return q.d.X(qVar, (ib4.c.b) obj);
                }
            }, 2, null))));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 X(q qVar, ib4.c.b bVar) {
            if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                qVar.d9(a43.a.C0043a.f2890a);
            } else {
                qVar.d9(a43.a.b.C0044a.f2891a);
            }
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final a43.a.SetError setError = (a43.a.SetError) this.f2958f;
            c0 c0Var = (c0) this.f2959g;
            uq.b.e();
            if (this.f2957e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final q qVar = q.this;
            return c0Var.d(new er.l() { // from class: a43.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.d.V(qVar, setError, (b.c) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(a43.a.SetError setError, c0<a43.b.c> c0Var, tq.e<? super k10.l<? extends a43.b>> eVar) {
            d dVar = q.this.new d(eVar);
            dVar.f2958f = setError;
            dVar.f2959g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"La43/a$a;", "<unused var>", "Lk10/c0;", "La43/b$b;", "state", "Lk10/l;", "La43/b;", "<anonymous>", "(La43/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<a43.a.C0043a, c0<a43.b.Error>, tq.e<? super k10.l<? extends a43.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f2961e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f2962f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final a43.b.c O(a43.b.Error error) {
            return a43.b.c.f2899a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f2962f;
            uq.b.e();
            if (this.f2961e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: a43.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.e.O((b.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a43.a.C0043a c0043a, c0<a43.b.Error> c0Var, tq.e<? super k10.l<? extends a43.b>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f2962f = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lnx/a;", "viewLifecycle", "Lk10/c0;", "La43/b$a;", "state", "Lk10/l;", "La43/b;", "<anonymous>", "(Lnx/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<nx.a, c0<a43.b.Content>, tq.e<? super k10.l<? extends a43.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f2963e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f2964f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f2965g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final a43.b.c O(a43.b.Content content) {
            return a43.b.c.f2899a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            nx.a aVar = (nx.a) this.f2964f;
            c0 c0Var = (c0) this.f2965g;
            uq.b.e();
            if (this.f2963e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return aVar == nx.a.STARTED ? c0Var.d(new er.l() { // from class: a43.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.f.O((b.Content) obj2);
                }
            }) : c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(nx.a aVar, c0<a43.b.Content> c0Var, tq.e<? super k10.l<? extends a43.b>> eVar) {
            f fVar = new f(eVar);
            fVar.f2964f = aVar;
            fVar.f2965g = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    public q(yy.a aVar, ut0.d dVar, hb4.d dVar2, ac4.a aVar2, ib4.c cVar, b43.b bVar, oz.q qVar) {
        this.getReportedInterventions = dVar;
        this.errorVMSFactory = dVar2;
        this.loaderUseCase = aVar2;
        this.domainErrorMapper = cVar;
        this.mapper = bVar;
        this.ownerViewLifecycleManager = qVar;
        a43.b.c cVar2 = a43.b.c.f2899a;
        this.initialState = cVar2;
        this.lifecycleConnector = qVar;
        this.stateMachine = aVar.a(cVar2, new er.l() { // from class: a43.k
            @Override // er.l
            public final Object b(Object obj) {
                return q.v9(this.f2920a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), s9(cVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a43.c.a s9(a43.b bVar) {
        return this.mapper.b(new b43.b.Params(bVar, b9(a43.a.b.c.f2894a), new er.p() { // from class: a43.p
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return q.t9(this.f2924a, (String) obj, (tt0.e) obj2);
            }
        }, b9(a43.a.b.C0044a.f2891a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(q qVar, String str, tt0.e eVar) {
        qVar.d9(new a43.a.b.GoToDetails(str, eVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(final q qVar, k10.v vVar) {
        vVar.c(q0.c(a43.b.class), new er.l() { // from class: a43.l
            @Override // er.l
            public final Object b(Object obj) {
                return q.w9(this.f2921a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(a43.b.c.class), new er.l() { // from class: a43.m
            @Override // er.l
            public final Object b(Object obj) {
                return q.x9(this.f2922a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(a43.b.Error.class), new er.l() { // from class: a43.n
            @Override // er.l
            public final Object b(Object obj) {
                return q.y9((k10.z) obj);
            }
        });
        vVar.c(q0.c(a43.b.Content.class), new er.l() { // from class: a43.o
            @Override // er.l
            public final Object b(Object obj) {
                return q.z9(this.f2923a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(q qVar, k10.z zVar) {
        b bVar = qVar.new b(null);
        zVar.x(q0.c(a43.a.b.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(q qVar, k10.z zVar) {
        zVar.A(qVar.new c(null));
        d dVar = qVar.new d(null);
        zVar.v(q0.c(a43.a.SetError.class), k10.o.CANCEL_PREVIOUS, dVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(k10.z zVar) {
        e eVar = new e(null);
        zVar.v(q0.c(a43.a.C0043a.class), k10.o.CANCEL_PREVIOUS, eVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(q qVar, k10.z zVar) {
        k10.k.m(zVar, mu.i.r(qVar.x8(), 1), null, new f(null), 2, null);
        return i0.f148189a;
    }

    @Override // nx.b
    public mu.g<nx.c> G2() {
        return this.ownerViewLifecycleManager.G2();
    }

    @Override // zx.b
    public xw.b<a43.a.b> Y1() {
        return this.navAction;
    }

    @Override // a43.c
    /* JADX INFO: renamed from: a, reason: from getter */
    public oz.j getLifecycleConnector() {
        return this.lifecycleConnector;
    }

    @Override // l00.g
    protected k10.t<a43.b, a43.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<a43.c.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: u9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // nx.b
    public mu.g<nx.a> x8() {
        return this.ownerViewLifecycleManager.x8();
    }
}
