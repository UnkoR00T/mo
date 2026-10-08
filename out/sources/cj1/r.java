package cj1;

import fr.q0;
import hj1.SetupData;
import java.util.List;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import zp0.BEUnitDefenceTrainingsByType;
import zp0.BEUserDefenceTrainingRegistration;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007BQ\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\"\u001a\u00020!*\b\u0012\u0004\u0012\u00020 0\u001fH\u0002¢\u0006\u0004\b\"\u0010#J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$H\u0096\u0001¢\u0006\u0004\b&\u0010'J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020(0$H\u0096\u0001¢\u0006\u0004\b)\u0010'J\u0018\u0010-\u001a\u00020,2\u0006\u0010+\u001a\u00020*H\u0096\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020,H\u0096\u0001¢\u0006\u0004\b/\u00100R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0018\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001a\u0010F\u001a\u00020A8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0014\u0010J\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR \u0010Q\u001a\b\u0012\u0004\u0012\u00020L0K8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR&\u0010W\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030R8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0X8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u001a\u0010^\u001a\b\u0012\u0004\u0012\u00020]0$8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b?\u0010'¨\u0006_"}, d2 = {"Lcj1/r;", "Ll00/g;", "Lcj1/b;", "Lcj1/a;", "Lcj1/c;", "", "Lnx/b;", "Li70/n;", "Lyy/a;", "stateMachineFactory", "Lib4/c;", "genericDomainErrorMapper", "Lwi1/c;", "getDashboardUC", "Lac4/a;", "callActionWithLoaderUseCase", "Lhb4/d;", "errorVMSFactory", "La14/w;", "openUrlIntentUseCase", "Ldj1/d;", "mapper", "Loz/q;", "ownerViewLifecycleManager", "snackBarManagerStateHolder", "<init>", "(Lyy/a;Lib4/c;Lwi1/c;Lac4/a;Lhb4/d;La14/w;Ldj1/d;Loz/q;Li70/n;)V", "state", "Lcj1/c$a;", "x9", "(Lcj1/b;)Lcj1/c$a;", "", "Lzp0/s;", "", "w9", "(Ljava/util/List;)Z", "Lmu/g;", "Lnx/c;", "G2", "()Lmu/g;", "Lnx/a;", "x8", "Lp50/a;", "snackBarData", "Loq/i0;", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lib4/c;", "c", "Lwi1/c;", "d", "Lac4/a;", "e", "Lhb4/d;", "f", "La14/w;", "g", "Ldj1/d;", "h", "Loz/q;", "j", "Li70/n;", "Loz/j;", "k", "Loz/j;", "a", "()Loz/j;", "lifecycleConnector", "Lcj1/b$b;", "l", "Lcj1/b$b;", "initialState", "Lxw/b;", "Lcj1/a$c;", "m", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "n", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "p", "Lmu/p0;", "getState", "()Lmu/p0;", "Li70/p;", "snackBarVisibilityState", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r extends l00.g<cj1.b, cj1.a> implements cj1.c, zx.d, nx.b, i70.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final wi1.c getDashboardUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final a14.w openUrlIntentUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final dj1.d mapper;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final oz.q ownerViewLifecycleManager;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final oz.j lifecycleConnector;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final cj1.b.C0707b initialState;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final xw.b<cj1.a.c> navAction;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final k10.t<cj1.b, cj1.a> stateMachine;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final p0<cj1.c.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<cj1.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f27397a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f27398b;

        /* JADX INFO: renamed from: cj1.r$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0711a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f27399a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ r f27400b;

            /* JADX INFO: renamed from: cj1.r$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0712a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f27401d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f27402e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f27403f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f27405h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f27406j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f27407k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f27408l;

                public C0712a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f27401d = obj;
                    this.f27402e |= PKIFailureInfo.systemUnavail;
                    return C0711a.this.F(null, this);
                }
            }

            public C0711a(mu.h hVar, r rVar) {
                this.f27399a = hVar;
                this.f27400b = rVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0712a c0712a;
                if (eVar instanceof C0712a) {
                    c0712a = (C0712a) eVar;
                    int i15 = c0712a.f27402e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0712a.f27402e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0712a = new C0712a(eVar);
                    }
                } else {
                    c0712a = new C0712a(eVar);
                }
                Object obj2 = c0712a.f27401d;
                Object objE = uq.b.e();
                int i16 = c0712a.f27402e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f27399a;
                    cj1.c.a aVarX9 = this.f27400b.x9((cj1.b) obj);
                    c0712a.f27403f = vq.j.a(obj);
                    c0712a.f27405h = vq.j.a(c0712a);
                    c0712a.f27406j = vq.j.a(obj);
                    c0712a.f27407k = vq.j.a(hVar);
                    c0712a.f27408l = 0;
                    c0712a.f27402e = 1;
                    if (hVar.F(aVarX9, c0712a) == objE) {
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

        public a(mu.g gVar, r rVar) {
            this.f27397a = gVar;
            this.f27398b = rVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super cj1.c.a> hVar, tq.e eVar) {
            Object objA = this.f27397a.a(new C0711a(hVar, this.f27398b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcj1/a$a;", "<unused var>", "Lcj1/b;", "Loq/i0;", "<anonymous>", "(Lcj1/a$a;Lcj1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<cj1.a.C0704a, cj1.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f27409e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f27409e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                cj1.a.c.C0705a c0705a = cj1.a.c.C0705a.f27336a;
                this.f27409e = 1;
                if (rVar.F(c0705a, this) == objE) {
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
        public final Object w(cj1.a.C0704a c0704a, cj1.b bVar, tq.e<? super i0> eVar) {
            return r.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcj1/a$b;", "<unused var>", "Lk10/c0;", "Lcj1/b;", "state", "Lk10/l;", "<anonymous>", "(Lcj1/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<cj1.a.b, c0<cj1.b>, tq.e<? super k10.l<? extends cj1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f27411e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f27412f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lcj1/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends cj1.b>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f27414e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ r f27415f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ c0<cj1.b> f27416g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(r rVar, c0<cj1.b> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f27415f = rVar;
                this.f27416g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final cj1.b.Error Y(final r rVar, dx.b bVar, cj1.b bVar2) {
                return new cj1.b.Error(rVar.errorVMSFactory.a(rVar.genericDomainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: cj1.u
                    @Override // er.l
                    public final Object b(Object obj) {
                        return r.c.a.Z(rVar, (ib4.c.b) obj);
                    }
                }, 2, null))));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final i0 Z(r rVar, ib4.c.b bVar) {
                if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                    rVar.d9(cj1.a.C0704a.f27334a);
                } else if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                    rVar.d9(cj1.a.b.f27335a);
                } else {
                    if (!(bVar instanceof ib4.c.b.a)) {
                        throw new oq.p();
                    }
                    rVar.d9(cj1.a.C0704a.f27334a);
                }
                return i0.f148189a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final cj1.b.Initialized a0(vi1.c cVar, cj1.b bVar) {
                return new cj1.b.Initialized(cVar);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f27414e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    wi1.c cVar = this.f27415f.getDashboardUC;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    this.f27414e = 1;
                    obj = cVar.a(c1792a, this);
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
                c0<cj1.b> c0Var = this.f27416g;
                final r rVar = this.f27415f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: cj1.s
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return r.c.a.Y(rVar, bVar, (b) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final vi1.c cVar2 = (vi1.c) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: cj1.t
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return r.c.a.a0(cVar2, (b) obj2);
                    }
                });
            }

            public final tq.e<i0> V(tq.e<?> eVar) {
                return new a(this.f27415f, this.f27416g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends cj1.b>> eVar) {
                return ((a) V(eVar)).J(i0.f148189a);
            }
        }

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f27412f;
            Object objE = uq.b.e();
            int i15 = this.f27411e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = r.this.callActionWithLoaderUseCase;
            a aVar2 = new a(r.this, c0Var, null);
            this.f27412f = vq.j.a(c0Var);
            this.f27411e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(cj1.a.b bVar, c0<cj1.b> c0Var, tq.e<? super k10.l<? extends cj1.b>> eVar) {
            c cVar = r.this.new c(eVar);
            cVar.f27412f = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcj1/b$b;", "state", "Loq/i0;", "<anonymous>", "(Lcj1/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<cj1.b.C0707b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f27417e;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f27417e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            r.this.d9(cj1.a.b.f27335a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(cj1.b.C0707b c0707b, tq.e<? super i0> eVar) {
            return ((d) v(c0707b, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return r.this.new d(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lnx/a;", "viewLifecycle", "Lcj1/b$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lnx/a;Lcj1/b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<nx.a, cj1.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f27419e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f27420f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            nx.a aVar = (nx.a) this.f27420f;
            uq.b.e();
            if (this.f27419e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (aVar == nx.a.STARTED) {
                r.this.d9(cj1.a.e.f27341a);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(nx.a aVar, cj1.b.Initialized initialized, tq.e<? super i0> eVar) {
            e eVar2 = r.this.new e(eVar);
            eVar2.f27420f = aVar;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcj1/a$e;", "<unused var>", "Lk10/c0;", "Lcj1/b$c;", "state", "Lk10/l;", "Lcj1/b;", "<anonymous>", "(Lcj1/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<cj1.a.e, c0<cj1.b.Initialized>, tq.e<? super k10.l<? extends cj1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f27422e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f27423f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final cj1.b.C0707b O(cj1.b.Initialized initialized) {
            return cj1.b.C0707b.f27346a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f27423f;
            uq.b.e();
            if (this.f27422e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: cj1.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.f.O((b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(cj1.a.e eVar, c0<cj1.b.Initialized> c0Var, tq.e<? super k10.l<? extends cj1.b>> eVar2) {
            f fVar = new f(eVar2);
            fVar.f27423f = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcj1/a$h;", "action", "Lcj1/b$c;", "state", "Loq/i0;", "<anonymous>", "(Lcj1/a$h;Lcj1/b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<cj1.a.Register, cj1.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f27424e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f27425f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            cj1.a.Register register = (cj1.a.Register) this.f27425f;
            Object objE = uq.b.e();
            int i15 = this.f27424e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                cj1.a.c.GoToNewRegistration goToNewRegistration = new cj1.a.c.GoToNewRegistration(new SetupData(register.a(), r.this.w9(register.a())));
                this.f27425f = vq.j.a(register);
                this.f27424e = 1;
                if (rVar.F(goToNewRegistration, this) == objE) {
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
        public final Object w(cj1.a.Register register, cj1.b.Initialized initialized, tq.e<? super i0> eVar) {
            g gVar = r.this.new g(eVar);
            gVar.f27425f = register;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcj1/a$g;", "action", "Lcj1/b$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lcj1/a$g;Lcj1/b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<cj1.a.OpenMoreInfoPage, cj1.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f27427e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f27428f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            cj1.a.OpenMoreInfoPage openMoreInfoPage = (cj1.a.OpenMoreInfoPage) this.f27428f;
            Object objE = uq.b.e();
            int i15 = this.f27427e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.w wVar = r.this.openUrlIntentUseCase;
                a14.w.Params params = new a14.w.Params(openMoreInfoPage.getUrl(), false, 2, null);
                this.f27428f = vq.j.a(openMoreInfoPage);
                this.f27427e = 1;
                obj = wVar.c(params, this);
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
            r rVar = r.this;
            if (iVar instanceof dx.i.Left) {
                rVar.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(cj1.a.OpenMoreInfoPage openMoreInfoPage, cj1.b.Initialized initialized, tq.e<? super i0> eVar) {
            h hVar = r.this.new h(eVar);
            hVar.f27428f = openMoreInfoPage;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcj1/a$d;", "action", "Lcj1/b$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lcj1/a$d;Lcj1/b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<cj1.a.d, cj1.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f27430e;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f27430e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                cj1.a.c.C0706c c0706c = cj1.a.c.C0706c.f27338a;
                this.f27430e = 1;
                if (rVar.F(c0706c, this) == objE) {
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
        public final Object w(cj1.a.d dVar, cj1.b.Initialized initialized, tq.e<? super i0> eVar) {
            return r.this.new i(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcj1/a$f;", "action", "Lcj1/b$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lcj1/a$f;Lcj1/b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<cj1.a.OnTrainingClicked, cj1.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f27432e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f27433f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            cj1.a.OnTrainingClicked onTrainingClicked = (cj1.a.OnTrainingClicked) this.f27433f;
            Object objE = uq.b.e();
            int i15 = this.f27432e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                cj1.a.c.GoToDetails goToDetails = new cj1.a.c.GoToDetails(onTrainingClicked.getTraining());
                this.f27433f = vq.j.a(onTrainingClicked);
                this.f27432e = 1;
                if (rVar.F(goToDetails, this) == objE) {
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
        public final Object w(cj1.a.OnTrainingClicked onTrainingClicked, cj1.b.Initialized initialized, tq.e<? super i0> eVar) {
            j jVar = r.this.new j(eVar);
            jVar.f27433f = onTrainingClicked;
            return jVar.J(i0.f148189a);
        }
    }

    public r(yy.a aVar, ib4.c cVar, wi1.c cVar2, ac4.a aVar2, hb4.d dVar, a14.w wVar, dj1.d dVar2, oz.q qVar, i70.n nVar) {
        this.genericDomainErrorMapper = cVar;
        this.getDashboardUC = cVar2;
        this.callActionWithLoaderUseCase = aVar2;
        this.errorVMSFactory = dVar;
        this.openUrlIntentUseCase = wVar;
        this.mapper = dVar2;
        this.ownerViewLifecycleManager = qVar;
        this.snackBarManagerStateHolder = nVar;
        this.lifecycleConnector = qVar;
        cj1.b.C0707b c0707b = cj1.b.C0707b.f27346a;
        this.initialState = c0707b;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(c0707b, new er.l() { // from class: cj1.k
            @Override // er.l
            public final Object b(Object obj) {
                return r.C9(this.f27377a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), x9(c0707b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(r rVar, BEUserDefenceTrainingRegistration bEUserDefenceTrainingRegistration) {
        rVar.d9(new cj1.a.OnTrainingClicked(bEUserDefenceTrainingRegistration));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(final r rVar, k10.v vVar) {
        vVar.c(q0.c(cj1.b.class), new er.l() { // from class: cj1.l
            @Override // er.l
            public final Object b(Object obj) {
                return r.D9(this.f27378a, (z) obj);
            }
        });
        vVar.c(q0.c(cj1.b.C0707b.class), new er.l() { // from class: cj1.m
            @Override // er.l
            public final Object b(Object obj) {
                return r.E9(this.f27379a, (z) obj);
            }
        });
        vVar.c(q0.c(cj1.b.Initialized.class), new er.l() { // from class: cj1.n
            @Override // er.l
            public final Object b(Object obj) {
                return r.F9(this.f27380a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(r rVar, z zVar) {
        b bVar = rVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(cj1.a.C0704a.class), oVar, bVar);
        zVar.v(q0.c(cj1.a.b.class), oVar, rVar.new c(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E9(r rVar, z zVar) {
        zVar.C(rVar.new d(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F9(r rVar, z zVar) {
        k10.k.s(zVar, rVar.x8(), null, rVar.new e(null), 2, null);
        f fVar = new f(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(cj1.a.e.class), oVar, fVar);
        zVar.x(q0.c(cj1.a.Register.class), oVar, rVar.new g(null));
        zVar.x(q0.c(cj1.a.OpenMoreInfoPage.class), oVar, rVar.new h(null));
        zVar.x(q0.c(cj1.a.d.class), oVar, rVar.new i(null));
        zVar.x(q0.c(cj1.a.OnTrainingClicked.class), oVar, rVar.new j(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean w9(List<BEUnitDefenceTrainingsByType> list) {
        return list.size() > 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final cj1.c.a x9(cj1.b state) {
        return this.mapper.b(new dj1.d.Params(state, b9(cj1.a.C0704a.f27334a), new er.l() { // from class: cj1.o
            @Override // er.l
            public final Object b(Object obj) {
                return r.y9(this.f27381a, (List) obj);
            }
        }, new er.l() { // from class: cj1.p
            @Override // er.l
            public final Object b(Object obj) {
                return r.z9(this.f27382a, (String) obj);
            }
        }, new er.l() { // from class: cj1.q
            @Override // er.l
            public final Object b(Object obj) {
                return r.A9(this.f27383a, (BEUserDefenceTrainingRegistration) obj);
            }
        }, b9(cj1.a.d.f27340a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(r rVar, List list) {
        rVar.d9(new cj1.a.Register(list));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(r rVar, String str) {
        rVar.d9(new cj1.a.OpenMoreInfoPage(str));
        return i0.f148189a;
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: B9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // nx.b
    public mu.g<nx.c> G2() {
        return this.ownerViewLifecycleManager.G2();
    }

    @Override // zx.b
    public xw.b<cj1.a.c> Y1() {
        return this.navAction;
    }

    @Override // cj1.c
    /* JADX INFO: renamed from: a, reason: from getter */
    public oz.j getLifecycleConnector() {
        return this.lifecycleConnector;
    }

    @Override // l00.g
    protected k10.t<cj1.b, cj1.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<cj1.c.a> getState() {
        return this.state;
    }

    @Override // i70.n
    public mu.g<i70.p> j() {
        return this.snackBarManagerStateHolder.j();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: v9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(cj1.a.c cVar, tq.e<? super i0> eVar) {
        return super.F(cVar, eVar);
    }

    @Override // nx.b
    public mu.g<nx.a> x8() {
        return this.ownerViewLifecycleManager.x8();
    }

    @Override // i70.n
    public void y(p50.a snackBarData) {
        this.snackBarManagerStateHolder.y(snackBarData);
    }
}
