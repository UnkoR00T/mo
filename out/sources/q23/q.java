package q23;

import fr.q0;
import java.util.List;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BC\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R&\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030)8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R \u00105\u001a\b\u0012\u0004\u0012\u0002000/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R \u0010;\u001a\b\u0012\u0004\u0012\u00020\u0016068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:¨\u0006<"}, d2 = {"Lq23/q;", "Ll00/g;", "Lq23/e;", "Lq23/c;", "Lq23/f;", "", "Lyy/a;", "stateMachineFactory", "Lr23/b;", "mapper", "Lac4/a;", "callActionWithLoaderUC", "Lib4/c;", "genericDomainErrorMapper", "Lhb4/d;", "errorVMSFactory", "Lut0/c;", "getReportedInterventionDetailsUC", "Lq23/d;", "setup", "<init>", "(Lyy/a;Lr23/b;Lac4/a;Lib4/c;Lhb4/d;Lut0/c;Lq23/d;)V", "Lq23/f$a;", "s9", "(Lq23/e;)Lq23/f$a;", "b", "Lr23/b;", "c", "Lac4/a;", "d", "Lib4/c;", "e", "Lhb4/d;", "f", "Lut0/c;", "g", "Lq23/d;", "Lq23/e$a;", "h", "Lq23/e$a;", "initialState", "Lk10/t;", "j", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lq23/c$c;", "k", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "l", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q extends l00.g<q23.e, q23.c> implements f, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final r23.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ut0.c getReportedInterventionDetailsUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Setup setup;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final q23.e.a initialState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final k10.t<q23.e, q23.c> stateMachine;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final xw.b<q23.c.InterfaceC4071c> navAction;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final p0<f.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<f.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f163933a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f163934b;

        /* JADX INFO: renamed from: q23.q$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4073a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f163935a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ q f163936b;

            /* JADX INFO: renamed from: q23.q$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4074a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f163937d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f163938e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f163939f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f163941h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f163942j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f163943k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f163944l;

                public C4074a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f163937d = obj;
                    this.f163938e |= PKIFailureInfo.systemUnavail;
                    return C4073a.this.F(null, this);
                }
            }

            public C4073a(mu.h hVar, q qVar) {
                this.f163935a = hVar;
                this.f163936b = qVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4074a c4074a;
                if (eVar instanceof C4074a) {
                    c4074a = (C4074a) eVar;
                    int i15 = c4074a.f163938e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4074a.f163938e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4074a = new C4074a(eVar);
                    }
                } else {
                    c4074a = new C4074a(eVar);
                }
                Object obj2 = c4074a.f163937d;
                Object objE = uq.b.e();
                int i16 = c4074a.f163938e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f163935a;
                    f.a aVarS9 = this.f163936b.s9((q23.e) obj);
                    c4074a.f163939f = vq.j.a(obj);
                    c4074a.f163941h = vq.j.a(c4074a);
                    c4074a.f163942j = vq.j.a(obj);
                    c4074a.f163943k = vq.j.a(hVar);
                    c4074a.f163944l = 0;
                    c4074a.f163938e = 1;
                    if (hVar.F(aVarS9, c4074a) == objE) {
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
            this.f163933a = gVar;
            this.f163934b = qVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super f.a> hVar, tq.e eVar) {
            Object objA = this.f163933a.a(new C4073a(hVar, this.f163934b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lq23/c$c;", "action", "Lq23/e;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lq23/c$c;Lq23/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<q23.c.InterfaceC4071c, q23.e, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f163945e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f163946f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            q23.c.InterfaceC4071c interfaceC4071c = (q23.c.InterfaceC4071c) this.f163946f;
            Object objE = uq.b.e();
            int i15 = this.f163945e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<q23.c.InterfaceC4071c> bVarY1 = q.this.Y1();
                this.f163946f = vq.j.a(interfaceC4071c);
                this.f163945e = 1;
                if (bVarY1.F(interfaceC4071c, this) == objE) {
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
        public final Object w(q23.c.InterfaceC4071c interfaceC4071c, q23.e eVar, tq.e<? super i0> eVar2) {
            b bVar = q.this.new b(eVar2);
            bVar.f163946f = interfaceC4071c;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lq23/e$a;", "state", "Lk10/l;", "Lq23/e;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<c0<q23.e.a>, tq.e<? super k10.l<? extends q23.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f163948e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f163949f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lq23/e;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends q23.e>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f163951e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ q f163952f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ c0<q23.e.a> f163953g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(q qVar, c0<q23.e.a> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f163952f = qVar;
                this.f163953g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final q23.e.LoadingError Y(final q qVar, dx.b bVar, q23.e.a aVar) {
                return new q23.e.LoadingError(qVar.errorVMSFactory.a(qVar.genericDomainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: q23.t
                    @Override // er.l
                    public final Object b(Object obj) {
                        return q.c.a.Z(qVar, (ib4.c.b) obj);
                    }
                }, 2, null))));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final i0 Z(q qVar, ib4.c.b bVar) {
                if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a) || (bVar instanceof ib4.c.b.a.Primary)) {
                    qVar.d9(q23.c.b.f163881a);
                } else {
                    qVar.d9(q23.c.InterfaceC4071c.a.f163882a);
                }
                return i0.f148189a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final q23.e.Screen a0(tt0.l lVar, q23.e.a aVar) {
                return new q23.e.Screen(lVar);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f163951e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    ut0.c cVar = this.f163952f.getReportedInterventionDetailsUC;
                    ut0.c.Params params = new ut0.c.Params(this.f163952f.setup.getId(), this.f163952f.setup.getType());
                    this.f163951e = 1;
                    obj = cVar.c(params, this);
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
                c0<q23.e.a> c0Var = this.f163953g;
                final q qVar = this.f163952f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: q23.r
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return q.c.a.Y(qVar, bVar, (e.a) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final tt0.l lVar = (tt0.l) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: q23.s
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return q.c.a.a0(lVar, (e.a) obj2);
                    }
                });
            }

            public final tq.e<i0> V(tq.e<?> eVar) {
                return new a(this.f163952f, this.f163953g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends q23.e>> eVar) {
                return ((a) V(eVar)).J(i0.f148189a);
            }
        }

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f163949f;
            Object objE = uq.b.e();
            int i15 = this.f163948e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = q.this.callActionWithLoaderUC;
            a aVar2 = new a(q.this, c0Var, null);
            this.f163949f = vq.j.a(c0Var);
            this.f163948e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<q23.e.a> c0Var, tq.e<? super k10.l<? extends q23.e>> eVar) {
            return ((c) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = q.this.new c(eVar);
            cVar.f163949f = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lq23/c$a;", "<unused var>", "Lq23/e$b;", "state", "Loq/i0;", "<anonymous>", "(Lq23/c$a;Lq23/e$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<q23.c.a, q23.e.LoadingError, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f163954e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f163954e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            q.this.d9(q23.c.InterfaceC4071c.a.f163882a);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(q23.c.a aVar, q23.e.LoadingError loadingError, tq.e<? super i0> eVar) {
            return q.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lq23/c$b;", "<unused var>", "Lk10/c0;", "Lq23/e$b;", "state", "Lk10/l;", "Lq23/e;", "<anonymous>", "(Lq23/c$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<q23.c.b, c0<q23.e.LoadingError>, tq.e<? super k10.l<? extends q23.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f163956e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f163957f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q23.e.a O(q23.e.LoadingError loadingError) {
            return q23.e.a.f163886a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f163957f;
            uq.b.e();
            if (this.f163956e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: q23.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.e.O((e.LoadingError) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(q23.c.b bVar, c0<q23.e.LoadingError> c0Var, tq.e<? super k10.l<? extends q23.e>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f163957f = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    public q(yy.a aVar, r23.b bVar, ac4.a aVar2, ib4.c cVar, hb4.d dVar, ut0.c cVar2, Setup setup) {
        this.mapper = bVar;
        this.callActionWithLoaderUC = aVar2;
        this.genericDomainErrorMapper = cVar;
        this.errorVMSFactory = dVar;
        this.getReportedInterventionDetailsUC = cVar2;
        this.setup = setup;
        q23.e.a aVar3 = q23.e.a.f163886a;
        this.initialState = aVar3;
        this.stateMachine = aVar.a(aVar3, new er.l() { // from class: q23.p
            @Override // er.l
            public final Object b(Object obj) {
                return q.v9(this.f163922a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), s9(aVar3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f.a s9(q23.e eVar) {
        return this.mapper.b(new r23.b.Params(eVar, new er.l() { // from class: q23.o
            @Override // er.l
            public final Object b(Object obj) {
                return q.t9(this.f163921a, (List) obj);
            }
        }, b9(q23.c.InterfaceC4071c.a.f163882a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(q qVar, List list) {
        qVar.d9(new q23.c.InterfaceC4071c.OpenHistory(list));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(final q qVar, k10.v vVar) {
        vVar.c(q0.c(q23.e.class), new er.l() { // from class: q23.l
            @Override // er.l
            public final Object b(Object obj) {
                return q.w9(this.f163918a, (z) obj);
            }
        });
        vVar.c(q0.c(q23.e.a.class), new er.l() { // from class: q23.m
            @Override // er.l
            public final Object b(Object obj) {
                return q.x9(this.f163919a, (z) obj);
            }
        });
        vVar.c(q0.c(q23.e.LoadingError.class), new er.l() { // from class: q23.n
            @Override // er.l
            public final Object b(Object obj) {
                return q.y9(this.f163920a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(q qVar, z zVar) {
        b bVar = qVar.new b(null);
        zVar.x(q0.c(q23.c.InterfaceC4071c.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(q qVar, z zVar) {
        zVar.A(qVar.new c(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(q qVar, z zVar) {
        d dVar = qVar.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(q23.c.a.class), oVar, dVar);
        zVar.v(q0.c(q23.c.b.class), oVar, new e(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<q23.c.InterfaceC4071c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<q23.e, q23.c> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<f.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: u9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(Setup setup) {
        super.P5(setup);
    }
}
