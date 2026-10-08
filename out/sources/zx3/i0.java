package zx3;

import jb4.PayloadErrorData;
import ju.g2;
import mx.Label;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import ur0.BEStartPaymentResult;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \\2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006:\u0001CB[\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0001\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020\u0002H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020\u0019H\u0016¢\u0006\u0004\b(\u0010)J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*H\u0096\u0001¢\u0006\u0004\b,\u0010-R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001a\u0010E\u001a\u00020@8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR&\u0010O\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030J8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR \u0010V\u001a\b\u0012\u0004\u0012\u00020Q0P8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR \u0010\"\u001a\b\u0012\u0004\u0012\u00020#0W8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[¨\u0006]"}, d2 = {"Lzx3/i0;", "Ll00/g;", "Lzx3/e;", "Lzx3/a;", "Lzx3/j;", "", "Lnx/b;", "Lyy/a;", "stateMachineFactory", "Lhb4/d;", "errorVMSFactory", "Lbs0/d;", "startPaymentUseCase", "Lay3/e;", "paymentBlikMapper", "Lib4/c;", "genericErrorMapper", "Lay3/c;", "paymentBlikDialogsMapper", "Loz/q;", "ownerViewLifecycleManager", "Lez/g;", "ticker", "Lbs0/b;", "getBlikTransactionUseCase", "Lzx3/b;", "setupData", "<init>", "(Lyy/a;Lhb4/d;Lbs0/d;Lay3/e;Lib4/c;Lay3/c;Loz/q;Lez/g;Lbs0/b;Lzx3/b;)V", "Ldx/b;", "domainError", "Lhb4/c;", "B9", "(Ldx/b;)Lhb4/c;", "state", "Lzx3/j$a;", "D9", "(Lzx3/e;)Lzx3/j$a;", "data", "Loq/i0;", "G9", "(Lzx3/b;)V", "Lmu/g;", "Lnx/c;", "G2", "()Lmu/g;", "b", "Lhb4/d;", "c", "Lbs0/d;", "d", "Lay3/e;", "e", "Lib4/c;", "f", "Lay3/c;", "g", "Loz/q;", "h", "Lez/g;", "j", "Lbs0/b;", "k", "Lzx3/b;", "Loz/j;", "l", "Loz/j;", "a", "()Loz/j;", "lifecycleConnector", "Lzx3/d;", "m", "Lzx3/d;", "initialState", "Lk10/t;", "n", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lzx3/a$h;", "p", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "q", "Lmu/p0;", "getState", "()Lmu/p0;", "r", "makepayment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i0 extends l00.g<zx3.e, a> implements zx3.j, zx.d, nx.b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f238349s = 8;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f238350t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final long f238351v;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final bs0.d startPaymentUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ay3.e paymentBlikMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericErrorMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ay3.c paymentBlikDialogsMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final oz.q ownerViewLifecycleManager;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ez.g ticker;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final bs0.b getBlikTransactionUseCase;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final PaymentBlikSetupData setupData;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final oz.j lifecycleConnector;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final View initialState;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final k10.t<zx3.e, a> stateMachine;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final xw.b<a.h> navAction;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<zx3.j.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<zx3.j.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f238366a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i0 f238367b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f238368a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ i0 f238369b;

            /* JADX INFO: renamed from: zx3.i0$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C6443a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f238370d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f238371e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f238372f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f238374h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f238375j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f238376k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f238377l;

                public C6443a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f238370d = obj;
                    this.f238371e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, i0 i0Var) {
                this.f238368a = hVar;
                this.f238369b = i0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C6443a c6443a;
                if (eVar instanceof C6443a) {
                    c6443a = (C6443a) eVar;
                    int i15 = c6443a.f238371e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c6443a.f238371e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c6443a = new C6443a(eVar);
                    }
                } else {
                    c6443a = new C6443a(eVar);
                }
                Object obj2 = c6443a.f238370d;
                Object objE = uq.b.e();
                int i16 = c6443a.f238371e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f238368a;
                    zx3.j.a aVarD9 = this.f238369b.D9((zx3.e) obj);
                    c6443a.f238372f = vq.j.a(obj);
                    c6443a.f238374h = vq.j.a(c6443a);
                    c6443a.f238375j = vq.j.a(obj);
                    c6443a.f238376k = vq.j.a(hVar);
                    c6443a.f238377l = 0;
                    c6443a.f238371e = 1;
                    if (hVar.F(aVarD9, c6443a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return oq.i0.f148189a;
            }
        }

        public b(mu.g gVar, i0 i0Var) {
            this.f238366a = gVar;
            this.f238367b = i0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super zx3.j.a> hVar, tq.e eVar) {
            Object objA = this.f238366a.a(new a(hVar, this.f238367b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lzx3/a$a;", "<unused var>", "Lzx3/e;", "Loq/i0;", "<anonymous>", "(Lzx3/a$a;Lzx3/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<a.C6440a, zx3.e, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f238378e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f238378e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<a.h> bVarY1 = i0.this.Y1();
                a.h.C6441a c6441a = a.h.C6441a.f238311a;
                this.f238378e = 1;
                if (bVarY1.F(c6441a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a.C6440a c6440a, zx3.e eVar, tq.e<? super oq.i0> eVar2) {
            return i0.this.new c(eVar2).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lzx3/a$e;", "<unused var>", "Lzx3/e;", "Loq/i0;", "<anonymous>", "(Lzx3/a$e;Lzx3/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<a.e, zx3.e, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f238380e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f238380e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<a.h> bVarY1 = i0.this.Y1();
                a.h.b bVar = a.h.b.f238312a;
                this.f238380e = 1;
                if (bVarY1.F(bVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a.e eVar, zx3.e eVar2, tq.e<? super oq.i0> eVar3) {
            return i0.this.new d(eVar3).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzx3/a$m;", "action", "Lk10/c0;", "Lzx3/d;", "state", "Lk10/l;", "Lzx3/e;", "<anonymous>", "(Lzx3/a$m;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<a.Setup, k10.c0<View>, tq.e<? super k10.l<? extends zx3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f238382e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f238383f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f238384g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final zx3.e.a.BlikCode V(a.Setup setup, View view) {
            return new zx3.e.a.BlikCode(setup.getPaymentData(), "", by3.a.DEFAULT);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Error X(i0 i0Var, View view) {
            return new Error(i0Var.B9(new dx.b.Generic(null, 1, null)));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final a.Setup setup = (a.Setup) this.f238383f;
            k10.c0 c0Var = (k10.c0) this.f238384g;
            uq.b.e();
            if (this.f238382e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (pq.v.n0(setup.getPaymentData().c()) != null) {
                return c0Var.d(new er.l() { // from class: zx3.j0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return i0.e.V(setup, (View) obj2);
                    }
                });
            }
            final i0 i0Var = i0.this;
            return c0Var.d(new er.l() { // from class: zx3.k0
                @Override // er.l
                public final Object b(Object obj2) {
                    return i0.e.X(i0Var, (View) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(a.Setup setup, k10.c0<View> c0Var, tq.e<? super k10.l<? extends zx3.e>> eVar) {
            e eVar2 = i0.this.new e(eVar);
            eVar2.f238383f = setup;
            eVar2.f238384g = c0Var;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lzx3/a$b;", "<unused var>", "Lzx3/c;", "Loq/i0;", "<anonymous>", "(Lzx3/a$b;Lzx3/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<a.b, Error, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f238386e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f238386e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<a.h> bVarY1 = i0.this.Y1();
                a.h.C6441a c6441a = a.h.C6441a.f238311a;
                this.f238386e = 1;
                if (bVarY1.F(c6441a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a.b bVar, Error error, tq.e<? super oq.i0> eVar) {
            return i0.this.new f(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lzx3/a$c;", "<unused var>", "Lzx3/c;", "Loq/i0;", "<anonymous>", "(Lzx3/a$c;Lzx3/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<a.c, Error, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f238388e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f238388e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<a.h> bVarY1 = i0.this.Y1();
                a.h.C6441a c6441a = a.h.C6441a.f238311a;
                this.f238388e = 1;
                if (bVarY1.F(c6441a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a.c cVar, Error error, tq.e<? super oq.i0> eVar) {
            return i0.this.new g(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lzx3/a$f;", "action", "Lzx3/e$a;", "state", "Loq/i0;", "<anonymous>", "(Lzx3/a$f;Lzx3/e$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<a.HandleInitializedError, zx3.e.a, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f238390e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f238391f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f238392g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f238393h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f238394j;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            String message;
            String title;
            a.HandleInitializedError handleInitializedError = (a.HandleInitializedError) this.f238393h;
            zx3.e.a aVar = (zx3.e.a) this.f238394j;
            Object objE = uq.b.e();
            int i15 = this.f238392g;
            if (i15 == 0) {
                oq.u.b(obj);
                dx.b domainError = handleInitializedError.getDomainError();
                if (domainError instanceof dx.b.g.Http) {
                    PayloadErrorData payloadErrorData = (PayloadErrorData) ((dx.b.g.Http) domainError).b();
                    xw.b<a.h> bVarY1 = i0.this.Y1();
                    Label labelB = null;
                    Label labelB2 = (payloadErrorData == null || (title = payloadErrorData.getTitle()) == null) ? null : mx.b.b(title, "title");
                    if (payloadErrorData != null && (message = payloadErrorData.getMessage()) != null) {
                        labelB = mx.b.b(message, "message");
                    }
                    a.h.GoToResult goToResult = new a.h.GoToResult(new my3.f.b.a.Generic(labelB2, labelB, aVar.getPaymentData().getSourcePaymentId(), mx.b.b(aVar.getPaymentData().getTitle(), "paymentTitle"), mx.b.b(aVar.getPaymentData().getAmountWithCurrency(), "paymentAmount")));
                    this.f238393h = vq.j.a(handleInitializedError);
                    this.f238394j = vq.j.a(aVar);
                    this.f238390e = vq.j.a(domainError);
                    this.f238391f = vq.j.a(payloadErrorData);
                    this.f238392g = 1;
                    if (bVarY1.F(goToResult, this) == objE) {
                        return objE;
                    }
                } else {
                    i0.this.d9(new a.SetOwnError(domainError));
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a.HandleInitializedError handleInitializedError, zx3.e.a aVar, tq.e<? super oq.i0> eVar) {
            h hVar = i0.this.new h(eVar);
            hVar.f238393h = handleInitializedError;
            hVar.f238394j = aVar;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzx3/a$j;", "action", "Lk10/c0;", "Lzx3/e$a$a;", "state", "Lk10/l;", "Lzx3/e;", "<anonymous>", "(Lzx3/a$j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<a.Pay, k10.c0<zx3.e.a.BlikCode>, tq.e<? super k10.l<? extends zx3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f238396e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f238397f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f238398g;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final zx3.e.a.BlikCode X(zx3.e.a.BlikCode blikCode) {
            return zx3.e.a.BlikCode.c(blikCode, null, null, by3.a.EMPTY, 3, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final View Y(a.Pay pay, zx3.e.a.BlikCode blikCode) {
            return new View(blikCode.getPaymentData(), pay.getBlikCode());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final zx3.e.a.BlikCode Z(zx3.e.a.BlikCode blikCode) {
            return zx3.e.a.BlikCode.c(blikCode, null, null, by3.a.WRONG_LENGTH, 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final a.Pay pay = (a.Pay) this.f238397f;
            k10.c0 c0Var = (k10.c0) this.f238398g;
            uq.b.e();
            if (this.f238396e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            int length = pay.getBlikCode().length();
            if (length != 0) {
                return length != 6 ? c0Var.b(new er.l() { // from class: zx3.n0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return i0.i.Z((e.a.BlikCode) obj2);
                    }
                }) : c0Var.d(new er.l() { // from class: zx3.m0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return i0.i.Y(pay, (e.a.BlikCode) obj2);
                    }
                });
            }
            return c0Var.b(new er.l() { // from class: zx3.l0
                @Override // er.l
                public final Object b(Object obj2) {
                    return i0.i.X((e.a.BlikCode) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public final Object w(a.Pay pay, k10.c0<zx3.e.a.BlikCode> c0Var, tq.e<? super k10.l<? extends zx3.e>> eVar) {
            i iVar = new i(eVar);
            iVar.f238397f = pay;
            iVar.f238398g = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzx3/a$i;", "action", "Lk10/c0;", "Lzx3/e$a$a;", "state", "Lk10/l;", "Lzx3/e;", "<anonymous>", "(Lzx3/a$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<a.OnBlikCodeChanged, k10.c0<zx3.e.a.BlikCode>, tq.e<? super k10.l<? extends zx3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f238399e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f238400f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f238401g;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final zx3.e.a.BlikCode O(a.OnBlikCodeChanged onBlikCodeChanged, zx3.e.a.BlikCode blikCode) {
            return zx3.e.a.BlikCode.c(blikCode, null, onBlikCodeChanged.getBlikCode(), by3.a.DEFAULT, 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final a.OnBlikCodeChanged onBlikCodeChanged = (a.OnBlikCodeChanged) this.f238400f;
            k10.c0 c0Var = (k10.c0) this.f238401g;
            uq.b.e();
            if (this.f238399e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: zx3.o0
                @Override // er.l
                public final Object b(Object obj2) {
                    return i0.j.O(onBlikCodeChanged, (e.a.BlikCode) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.OnBlikCodeChanged onBlikCodeChanged, k10.c0<zx3.e.a.BlikCode> c0Var, tq.e<? super k10.l<? extends zx3.e>> eVar) {
            j jVar = new j(eVar);
            jVar.f238400f = onBlikCodeChanged;
            jVar.f238401g = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lzx3/g;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lzx3/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.p<View, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f238402e;

        k(tq.e<? super k> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f238402e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            i0.this.d9(a.k.f238319a);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(View view, tq.e<? super oq.i0> eVar) {
            return ((k) v(view, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return i0.this.new k(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lzx3/a$g;", "<unused var>", "Lzx3/g;", "Loq/i0;", "<anonymous>", "(Lzx3/a$g;Lzx3/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<a.g, View, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f238404e;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f238404e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<a.h> bVarY1 = i0.this.Y1();
                a.h.e eVar = a.h.e.f238314a;
                this.f238404e = 1;
                if (bVarY1.F(eVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a.g gVar, View view, tq.e<? super oq.i0> eVar) {
            return i0.this.new l(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzx3/a$l;", "action", "Lk10/c0;", "Lzx3/g;", "state", "Lk10/l;", "Lzx3/e;", "<anonymous>", "(Lzx3/a$l;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<a.SetOwnError, k10.c0<View>, tq.e<? super k10.l<? extends zx3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f238406e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f238407f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f238408g;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Error O(i0 i0Var, a.SetOwnError setOwnError, View view) {
            return new Error(view.getPaymentData(), view.getBlikCode(), i0Var.B9(setOwnError.getDomainError()));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final a.SetOwnError setOwnError = (a.SetOwnError) this.f238407f;
            k10.c0 c0Var = (k10.c0) this.f238408g;
            uq.b.e();
            if (this.f238406e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final i0 i0Var = i0.this;
            return c0Var.d(new er.l() { // from class: zx3.p0
                @Override // er.l
                public final Object b(Object obj2) {
                    return i0.m.O(i0Var, setOwnError, (View) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.SetOwnError setOwnError, k10.c0<View> c0Var, tq.e<? super k10.l<? extends zx3.e>> eVar) {
            m mVar = i0.this.new m(eVar);
            mVar.f238407f = setOwnError;
            mVar.f238408g = c0Var;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzx3/a$k;", "<unused var>", "Lk10/c0;", "Lzx3/g;", "state", "Lk10/l;", "Lzx3/e;", "<anonymous>", "(Lzx3/a$k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<a.k, k10.c0<View>, tq.e<? super k10.l<? extends zx3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f238410e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f238411f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final View O(BEStartPaymentResult bEStartPaymentResult, View view) {
            return new View(view.getPaymentData(), bEStartPaymentResult.getTransactionId(), nx.c.FOREGROUND);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f238411f;
            Object objE = uq.b.e();
            int i15 = this.f238410e;
            if (i15 == 0) {
                oq.u.b(obj);
                bs0.d dVar = i0.this.startPaymentUseCase;
                bs0.d.Params params = new bs0.d.Params(((View) c0Var.a()).getPaymentData().c(), ((View) c0Var.a()).getBlikCode(), ((View) c0Var.a()).getPaymentData().getPaymentPackageId());
                this.f238411f = c0Var;
                this.f238410e = 1;
                obj = dVar.c(params, this);
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
            i0 i0Var = i0.this;
            if (iVar instanceof dx.i.Left) {
                i0Var.d9(new a.HandleInitializedError((dx.b) ((dx.i.Left) iVar).b()));
                return c0Var.c();
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            final BEStartPaymentResult bEStartPaymentResult = (BEStartPaymentResult) ((dx.i.Right) iVar).b();
            return c0Var.d(new er.l() { // from class: zx3.q0
                @Override // er.l
                public final Object b(Object obj2) {
                    return i0.n.O(bEStartPaymentResult, (View) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.k kVar, k10.c0<View> c0Var, tq.e<? super k10.l<? extends zx3.e>> eVar) {
            n nVar = i0.this.new n(eVar);
            nVar.f238411f = c0Var;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lzx3/a$n;", "<unused var>", "Lzx3/g;", "Loq/i0;", "<anonymous>", "(Lzx3/a$n;Lzx3/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<a.n, View, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f238413e;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f238413e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<a.h> bVarY1 = i0.this.Y1();
                a.h.ToInterruptionDialog toInterruptionDialog = new a.h.ToInterruptionDialog(i0.this.paymentBlikDialogsMapper.b(new ay3.c.Params(i0.this.b9(a.C6440a.f238304a))));
                this.f238413e = 1;
                if (bVarY1.F(toInterruptionDialog, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a.n nVar, View view, tq.e<? super oq.i0> eVar) {
            return i0.this.new o(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzx3/a$c;", "<unused var>", "Lk10/c0;", "Lzx3/f;", "state", "Lk10/l;", "Lzx3/e;", "<anonymous>", "(Lzx3/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<a.c, k10.c0<Error>, tq.e<? super k10.l<? extends zx3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f238415e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f238416f;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final View O(Error error) {
            return new View(error.getPaymentData(), error.getBlikCode());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f238416f;
            uq.b.e();
            if (this.f238415e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: zx3.r0
                @Override // er.l
                public final Object b(Object obj2) {
                    return i0.p.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.c cVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends zx3.e>> eVar) {
            p pVar = new p(eVar);
            pVar.f238416f = c0Var;
            return pVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lzx3/a$b;", "<unused var>", "Lzx3/f;", "state", "Loq/i0;", "<anonymous>", "(Lzx3/a$b;Lzx3/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<a.b, Error, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f238417e;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f238417e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<a.h> bVarY1 = i0.this.Y1();
                a.h.C6441a c6441a = a.h.C6441a.f238311a;
                this.f238417e = 1;
                if (bVarY1.F(c6441a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a.b bVar, Error error, tq.e<? super oq.i0> eVar) {
            return i0.this.new q(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzx3/a$l;", "action", "Lk10/c0;", "Lzx3/i;", "state", "Lk10/l;", "Lzx3/e;", "<anonymous>", "(Lzx3/a$l;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<a.SetOwnError, k10.c0<View>, tq.e<? super k10.l<? extends zx3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f238419e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f238420f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f238421g;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Error O(i0 i0Var, a.SetOwnError setOwnError, View view) {
            return new Error(view.getPaymentData(), view.getTransactionId(), i0Var.B9(setOwnError.getDomainError()));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final a.SetOwnError setOwnError = (a.SetOwnError) this.f238420f;
            k10.c0 c0Var = (k10.c0) this.f238421g;
            uq.b.e();
            if (this.f238419e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final i0 i0Var = i0.this;
            return c0Var.d(new er.l() { // from class: zx3.s0
                @Override // er.l
                public final Object b(Object obj2) {
                    return i0.r.O(i0Var, setOwnError, (View) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.SetOwnError setOwnError, k10.c0<View> c0Var, tq.e<? super k10.l<? extends zx3.e>> eVar) {
            r rVar = i0.this.new r(eVar);
            rVar.f238420f = setOwnError;
            rVar.f238421g = c0Var;
            return rVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lnx/c;", "viewVisibility", "Lk10/c0;", "Lzx3/i;", "state", "Lk10/l;", "Lzx3/e;", "<anonymous>", "(Lnx/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<nx.c, k10.c0<View>, tq.e<? super k10.l<? extends zx3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f238423e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f238424f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f238425g;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final View O(nx.c cVar, View view) {
            return View.c(view, null, null, cVar, 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final nx.c cVar = (nx.c) this.f238424f;
            k10.c0 c0Var = (k10.c0) this.f238425g;
            uq.b.e();
            if (this.f238423e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: zx3.t0
                @Override // er.l
                public final Object b(Object obj2) {
                    return i0.s.O(cVar, (View) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(nx.c cVar, k10.c0<View> c0Var, tq.e<? super k10.l<? extends zx3.e>> eVar) {
            s sVar = new s(eVar);
            sVar.f238424f = cVar;
            sVar.f238425g = c0Var;
            return sVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lgu/b;", "timePassed", "Lzx3/i;", "state", "Loq/i0;", "<anonymous>", "(Lgu/b;Lzx3/i;)V"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.q<gu.b, View, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f238426e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ long f238427f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f238428g;

        t(tq.e<? super t> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            long j15 = this.f238427f;
            View view = (View) this.f238428g;
            Object objE = uq.b.e();
            int i15 = this.f238426e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (view.getViewVisibility() == nx.c.FOREGROUND && g2.n(getContext())) {
                    if (gu.b.q(j15, i0.f238351v) < 0) {
                        i0.this.d9(a.d.f238307a);
                    } else {
                        xw.b<a.h> bVarY1 = i0.this.Y1();
                        a.h.GoToResult goToResult = new a.h.GoToResult(new my3.f.b.PaymentInProcessing(view.getPaymentData().getSourcePaymentId(), mx.b.b(view.getPaymentData().getTitle(), "paymentTitle"), mx.b.b(view.getPaymentData().getAmountWithCurrency(), "paymentAmount")));
                        this.f238428g = vq.j.a(view);
                        this.f238427f = j15;
                        this.f238426e = 1;
                        if (bVarY1.F(goToResult, this) == objE) {
                            return objE;
                        }
                    }
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        public final Object M(long j15, View view, tq.e<? super oq.i0> eVar) {
            t tVar = i0.this.new t(eVar);
            tVar.f238427f = j15;
            tVar.f238428g = view;
            return tVar.J(oq.i0.f148189a);
        }

        @Override // er.q
        public /* bridge */ /* synthetic */ Object w(gu.b bVar, View view, tq.e<? super oq.i0> eVar) {
            return M(bVar.getRawValue(), view, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lzx3/a$g;", "<unused var>", "Lzx3/i;", "Loq/i0;", "<anonymous>", "(Lzx3/a$g;Lzx3/i;)V"}, k = 3, mv = {2, 2, 0})
    static final class u extends vq.k implements er.q<a.g, View, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f238430e;

        u(tq.e<? super u> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f238430e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<a.h> bVarY1 = i0.this.Y1();
                a.h.e eVar = a.h.e.f238314a;
                this.f238430e = 1;
                if (bVarY1.F(eVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a.g gVar, View view, tq.e<? super oq.i0> eVar) {
            return i0.this.new u(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lzx3/a$n;", "<unused var>", "Lzx3/i;", "Loq/i0;", "<anonymous>", "(Lzx3/a$n;Lzx3/i;)V"}, k = 3, mv = {2, 2, 0})
    static final class v extends vq.k implements er.q<a.n, View, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f238432e;

        v(tq.e<? super v> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f238432e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<a.h> bVarY1 = i0.this.Y1();
                a.h.ToInterruptionDialog toInterruptionDialog = new a.h.ToInterruptionDialog(i0.this.paymentBlikDialogsMapper.b(new ay3.c.Params(i0.this.b9(a.C6440a.f238304a))));
                this.f238432e = 1;
                if (bVarY1.F(toInterruptionDialog, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a.n nVar, View view, tq.e<? super oq.i0> eVar) {
            return i0.this.new v(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lzx3/a$d;", "<unused var>", "Lzx3/i;", "state", "Loq/i0;", "<anonymous>", "(Lzx3/a$d;Lzx3/i;)V"}, k = 3, mv = {2, 2, 0})
    static final class w extends vq.k implements er.q<a.d, View, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f238434e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f238435f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f238436g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f238437h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f238438j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f238439k;

        w(tq.e<? super w> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x00d8, code lost:
        
            if (r4.F(r6, r18) == r2) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x013d, code lost:
        
            if (r5.F(r6, r18) == r2) goto L36;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r19) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 335
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: zx3.i0.w.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a.d dVar, View view, tq.e<? super oq.i0> eVar) {
            w wVar = i0.this.new w(eVar);
            wVar.f238439k = view;
            return wVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzx3/a$c;", "<unused var>", "Lk10/c0;", "Lzx3/h;", "state", "Lk10/l;", "Lzx3/e;", "<anonymous>", "(Lzx3/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class x extends vq.k implements er.q<a.c, k10.c0<Error>, tq.e<? super k10.l<? extends zx3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f238441e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f238442f;

        x(tq.e<? super x> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final View O(Error error) {
            return new View(error.getPaymentData(), error.getTransactionId(), nx.c.FOREGROUND);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f238442f;
            uq.b.e();
            if (this.f238441e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: zx3.u0
                @Override // er.l
                public final Object b(Object obj2) {
                    return i0.x.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.c cVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends zx3.e>> eVar) {
            x xVar = new x(eVar);
            xVar.f238442f = c0Var;
            return xVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lzx3/a$b;", "<unused var>", "Lzx3/h;", "Loq/i0;", "<anonymous>", "(Lzx3/a$b;Lzx3/h;)V"}, k = 3, mv = {2, 2, 0})
    static final class y extends vq.k implements er.q<a.b, Error, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f238443e;

        y(tq.e<? super y> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f238443e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<a.h> bVarY1 = i0.this.Y1();
                a.h.C6441a c6441a = a.h.C6441a.f238311a;
                this.f238443e = 1;
                if (bVarY1.F(c6441a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a.b bVar, Error error, tq.e<? super oq.i0> eVar) {
            return i0.this.new y(eVar).J(oq.i0.f148189a);
        }
    }

    static {
        gu.b.Companion companion = gu.b.INSTANCE;
        f238350t = gu.d.q(5, gu.e.SECONDS);
        f238351v = gu.d.q(1, gu.e.MINUTES);
    }

    public i0(yy.a aVar, hb4.d dVar, bs0.d dVar2, ay3.e eVar, ib4.c cVar, ay3.c cVar2, oz.q qVar, ez.g gVar, bs0.b bVar, PaymentBlikSetupData paymentBlikSetupData) {
        this.errorVMSFactory = dVar;
        this.startPaymentUseCase = dVar2;
        this.paymentBlikMapper = eVar;
        this.genericErrorMapper = cVar;
        this.paymentBlikDialogsMapper = cVar2;
        this.ownerViewLifecycleManager = qVar;
        this.ticker = gVar;
        this.getBlikTransactionUseCase = bVar;
        this.setupData = paymentBlikSetupData;
        this.lifecycleConnector = qVar;
        View view = new View(paymentBlikSetupData.getBlikRequiredData());
        this.initialState = view;
        this.stateMachine = aVar.a(view, new er.l() { // from class: zx3.y
            @Override // er.l
            public final Object b(Object obj) {
                return i0.H9(this.f238483a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new b(e9().getState(), this), D9(view));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hb4.c B9(dx.b domainError) {
        return this.errorVMSFactory.a(this.genericErrorMapper.b(new ib4.c.Params(domainError, this.setupData.getPaymentSuccessResultType() != rx3.a.PAYMENT_AS_STEP_IN_PROCESS, new er.l() { // from class: zx3.x
            @Override // er.l
            public final Object b(Object obj) {
                return i0.C9(this.f238481a, (ib4.c.b) obj);
            }
        })));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C9(i0 i0Var, ib4.c.b bVar) {
        if (!(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
            if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
                i0Var.d9(a.c.f238306a);
            } else {
                if (!(bVar instanceof ib4.c.b.a.Close) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                    throw new oq.p();
                }
                i0Var.d9(a.b.f238305a);
            }
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zx3.j.a D9(zx3.e state) {
        return this.paymentBlikMapper.b(new ay3.e.Params(state, b9(a.e.f238308a), new er.l() { // from class: zx3.h0
            @Override // er.l
            public final Object b(Object obj) {
                return i0.E9(this.f238344a, (String) obj);
            }
        }, new er.l() { // from class: zx3.w
            @Override // er.l
            public final Object b(Object obj) {
                return i0.F9(this.f238479a, (String) obj);
            }
        }, b9(a.n.f238322a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E9(i0 i0Var, String str) {
        i0Var.d9(new a.OnBlikCodeChanged(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F9(i0 i0Var, String str) {
        i0Var.d9(new a.Pay(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H9(final i0 i0Var, k10.v vVar) {
        vVar.c(fr.q0.c(zx3.e.class), new er.l() { // from class: zx3.v
            @Override // er.l
            public final Object b(Object obj) {
                return i0.I9(this.f238478a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(View.class), new er.l() { // from class: zx3.z
            @Override // er.l
            public final Object b(Object obj) {
                return i0.J9(this.f238484a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Error.class), new er.l() { // from class: zx3.a0
            @Override // er.l
            public final Object b(Object obj) {
                return i0.K9(this.f238323a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(zx3.e.a.class), new er.l() { // from class: zx3.b0
            @Override // er.l
            public final Object b(Object obj) {
                return i0.L9(this.f238326a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(zx3.e.a.BlikCode.class), new er.l() { // from class: zx3.c0
            @Override // er.l
            public final Object b(Object obj) {
                return i0.M9((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(View.class), new er.l() { // from class: zx3.d0
            @Override // er.l
            public final Object b(Object obj) {
                return i0.N9(this.f238329a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Error.class), new er.l() { // from class: zx3.e0
            @Override // er.l
            public final Object b(Object obj) {
                return i0.O9(this.f238333a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(View.class), new er.l() { // from class: zx3.f0
            @Override // er.l
            public final Object b(Object obj) {
                return i0.P9(this.f238337a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Error.class), new er.l() { // from class: zx3.g0
            @Override // er.l
            public final Object b(Object obj) {
                return i0.Q9(this.f238340a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I9(i0 i0Var, k10.z zVar) {
        c cVar = i0Var.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(a.C6440a.class), oVar, cVar);
        zVar.x(fr.q0.c(a.e.class), oVar, i0Var.new d(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J9(i0 i0Var, k10.z zVar) {
        e eVar = i0Var.new e(null);
        zVar.v(fr.q0.c(a.Setup.class), k10.o.CANCEL_PREVIOUS, eVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K9(i0 i0Var, k10.z zVar) {
        f fVar = i0Var.new f(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(a.b.class), oVar, fVar);
        zVar.x(fr.q0.c(a.c.class), oVar, i0Var.new g(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L9(i0 i0Var, k10.z zVar) {
        h hVar = i0Var.new h(null);
        zVar.x(fr.q0.c(a.HandleInitializedError.class), k10.o.CANCEL_PREVIOUS, hVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M9(k10.z zVar) {
        i iVar = new i(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(a.Pay.class), oVar, iVar);
        zVar.v(fr.q0.c(a.OnBlikCodeChanged.class), oVar, new j(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N9(i0 i0Var, k10.z zVar) {
        zVar.C(i0Var.new k(null));
        l lVar = i0Var.new l(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(a.g.class), oVar, lVar);
        zVar.v(fr.q0.c(a.SetOwnError.class), oVar, i0Var.new m(null));
        zVar.v(fr.q0.c(a.k.class), oVar, i0Var.new n(null));
        zVar.x(fr.q0.c(a.n.class), oVar, i0Var.new o(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O9(i0 i0Var, k10.z zVar) {
        p pVar = new p(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(a.c.class), oVar, pVar);
        zVar.x(fr.q0.c(a.b.class), oVar, i0Var.new q(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P9(i0 i0Var, k10.z zVar) {
        r rVar = i0Var.new r(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(a.SetOwnError.class), oVar, rVar);
        k10.k.m(zVar, i0Var.ownerViewLifecycleManager.G2(), null, new s(null), 2, null);
        k10.k.s(zVar, i0Var.ticker.a(f238350t), null, i0Var.new t(null), 2, null);
        zVar.x(fr.q0.c(a.g.class), oVar, i0Var.new u(null));
        zVar.x(fr.q0.c(a.n.class), oVar, i0Var.new v(null));
        zVar.x(fr.q0.c(a.d.class), oVar, i0Var.new w(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q9(i0 i0Var, k10.z zVar) {
        x xVar = new x(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(a.c.class), oVar, xVar);
        zVar.x(fr.q0.c(a.b.class), oVar, i0Var.new y(null));
        return oq.i0.f148189a;
    }

    @Override // nx.b
    public mu.g<nx.c> G2() {
        return this.ownerViewLifecycleManager.G2();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: G9, reason: merged with bridge method [inline-methods] */
    public void P5(PaymentBlikSetupData data) {
        d9(new a.Setup(data.getBlikRequiredData()));
    }

    @Override // zx.b
    public xw.b<a.h> Y1() {
        return this.navAction;
    }

    @Override // zx3.j
    /* JADX INFO: renamed from: a, reason: from getter */
    public oz.j getLifecycleConnector() {
        return this.lifecycleConnector;
    }

    @Override // l00.g
    protected k10.t<zx3.e, a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<zx3.j.a> getState() {
        return this.state;
    }
}
