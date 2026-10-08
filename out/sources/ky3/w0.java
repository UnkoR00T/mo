package ky3;

import by3.BlikRequiredData;
import ju.g2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import ur0.BEAlias;
import ur0.BEStartPaymentResult;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 a2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001HBc\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010+\u001a\u00020*2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020.2\u0006\u0010-\u001a\u00020\u001aH\u0016¢\u0006\u0004\b/\u00100R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u001a\u0010J\u001a\u00020E8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0014\u0010N\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR&\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030O8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0U8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR \u0010`\u001a\b\u0012\u0004\u0012\u00020[0Z8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_¨\u0006b"}, d2 = {"Lky3/w0;", "Ll00/g;", "Lky3/e;", "Lky3/a;", "Lky3/j;", "", "Lyy/a;", "stateMachineFactory", "Lky3/s;", "mapper", "Lib4/c;", "genericErrorMapper", "Lay3/c;", "paymentBlikDialogsMapper", "Lvx3/b;", "startOneClickPaymentUseCase", "Lr44/a;", "consumeOneClickPaymentInfoAlertUC", "Lhb4/d;", "errorVMSFactory", "Loz/q;", "ownerViewLifecycleManager", "Lez/g;", "ticker", "Lbs0/b;", "getBlikTransactionUseCase", "Lky3/b;", "setupData", "<init>", "(Lyy/a;Lky3/s;Lib4/c;Lay3/c;Lvx3/b;Lr44/a;Lhb4/d;Loz/q;Lez/g;Lbs0/b;Lky3/b;)V", "state", "Lky3/j$a;", "J9", "(Lky3/e;)Lky3/j$a;", "Ldx/b;", "domainError", "Lhb4/c;", "G9", "(Ldx/b;)Lhb4/c;", "", "aliasOnListId", "selectedAliasId", "", "I9", "(Ljava/lang/String;Ljava/lang/String;)Z", "data", "Loq/i0;", "P9", "(Lky3/b;)V", "b", "Lky3/s;", "c", "Lib4/c;", "d", "Lay3/c;", "e", "Lvx3/b;", "f", "Lr44/a;", "g", "Lhb4/d;", "h", "Loz/q;", "j", "Lez/g;", "k", "Lbs0/b;", "l", "Lky3/b;", "Loz/j;", "m", "Loz/j;", "a", "()Loz/j;", "lifecycleConnector", "Lky3/d;", "n", "Lky3/d;", "initialState", "Lk10/t;", "p", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "q", "Lmu/p0;", "getState", "()Lmu/p0;", "Lxw/b;", "Lky3/a$i;", "r", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "s", "makepayment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class w0 extends l00.g<ky3.e, a> implements ky3.j, zx.d {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f113351t = 8;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final long f113352v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final long f113353w;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ky3.s mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericErrorMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ay3.c paymentBlikDialogsMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final vx3.b startOneClickPaymentUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final r44.a consumeOneClickPaymentInfoAlertUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final oz.q ownerViewLifecycleManager;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final ez.g ticker;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final bs0.b getBlikTransactionUseCase;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private OneClickSetupData setupData;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final oz.j lifecycleConnector;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final ky3.d initialState;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final k10.t<ky3.e, a> stateMachine;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<ky3.j.a> state;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final xw.b<a.i> navAction;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lky3/a$q;", "<unused var>", "Lky3/i;", "Loq/i0;", "<anonymous>", "(Lky3/a$q;Lky3/i;)V"}, k = 3, mv = {2, 2, 0})
    static final class a0 extends vq.k implements er.q<a.q, View, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f113369e;

        a0(tq.e<? super a0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f113369e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<a.i> bVarY1 = w0.this.Y1();
                a.i.ToInterruptionDialog toInterruptionDialog = new a.i.ToInterruptionDialog(w0.this.paymentBlikDialogsMapper.b(new ay3.c.Params(w0.this.b9(a.C2749a.f113224a))));
                this.f113369e = 1;
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
        public final Object w(a.q qVar, View view, tq.e<? super oq.i0> eVar) {
            return w0.this.new a0(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class b extends fr.q implements er.p<String, String, Boolean> {
        b(Object obj) {
            super(2, obj, w0.class, "isAliasSelected", "isAliasSelected(Ljava/lang/String;Ljava/lang/String;)Z", 0);
        }

        @Override // er.p
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public final Boolean B(String str, String str2) {
            return Boolean.valueOf(((w0) this.f66391b).I9(str, str2));
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lky3/a$d;", "<unused var>", "Lk10/c0;", "Lky3/h;", "state", "Lk10/l;", "Lky3/e;", "<anonymous>", "(Lky3/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b0 extends vq.k implements er.q<a.d, k10.c0<Error>, tq.e<? super k10.l<? extends ky3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f113371e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f113372f;

        b0(tq.e<? super b0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final View O(k10.c0 c0Var, Error error) {
            return new View(((Error) c0Var.a()).getPaymentData(), ((Error) c0Var.a()).getTransactionId(), nx.c.FOREGROUND);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f113372f;
            uq.b.e();
            if (this.f113371e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ky3.k1
                @Override // er.l
                public final Object b(Object obj2) {
                    return w0.b0.O(c0Var, (Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.d dVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends ky3.e>> eVar) {
            b0 b0Var = new b0(eVar);
            b0Var.f113372f = c0Var;
            return b0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements mu.g<ky3.j.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f113373a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w0 f113374b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f113375a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ w0 f113376b;

            /* JADX INFO: renamed from: ky3.w0$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2753a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f113377d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f113378e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f113379f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f113381h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f113382j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f113383k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f113384l;

                public C2753a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f113377d = obj;
                    this.f113378e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, w0 w0Var) {
                this.f113375a = hVar;
                this.f113376b = w0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2753a c2753a;
                if (eVar instanceof C2753a) {
                    c2753a = (C2753a) eVar;
                    int i15 = c2753a.f113378e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2753a.f113378e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2753a = new C2753a(eVar);
                    }
                } else {
                    c2753a = new C2753a(eVar);
                }
                Object obj2 = c2753a.f113377d;
                Object objE = uq.b.e();
                int i16 = c2753a.f113378e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f113375a;
                    ky3.j.a aVarJ9 = this.f113376b.J9((ky3.e) obj);
                    c2753a.f113379f = vq.j.a(obj);
                    c2753a.f113381h = vq.j.a(c2753a);
                    c2753a.f113382j = vq.j.a(obj);
                    c2753a.f113383k = vq.j.a(hVar);
                    c2753a.f113384l = 0;
                    c2753a.f113378e = 1;
                    if (hVar.F(aVarJ9, c2753a) == objE) {
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

        public c(mu.g gVar, w0 w0Var) {
            this.f113373a = gVar;
            this.f113374b = w0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super ky3.j.a> hVar, tq.e eVar) {
            Object objA = this.f113373a.a(new a(hVar, this.f113374b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lky3/a$c;", "<unused var>", "Lky3/h;", "Loq/i0;", "<anonymous>", "(Lky3/a$c;Lky3/h;)V"}, k = 3, mv = {2, 2, 0})
    static final class c0 extends vq.k implements er.q<a.c, Error, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f113385e;

        c0(tq.e<? super c0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f113385e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<a.i> bVarY1 = w0.this.Y1();
                a.i.C2750a c2750a = a.i.C2750a.f113232a;
                this.f113385e = 1;
                if (bVarY1.F(c2750a, this) == objE) {
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
            return w0.this.new c0(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lky3/a$a;", "<unused var>", "Lky3/e;", "Loq/i0;", "<anonymous>", "(Lky3/a$a;Lky3/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<a.C2749a, ky3.e, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f113387e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f113387e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<a.i> bVarY1 = w0.this.Y1();
                a.i.C2750a c2750a = a.i.C2750a.f113232a;
                this.f113387e = 1;
                if (bVarY1.F(c2750a, this) == objE) {
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
        public final Object w(a.C2749a c2749a, ky3.e eVar, tq.e<? super oq.i0> eVar2) {
            return w0.this.new d(eVar2).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lky3/a$o;", "action", "Lk10/c0;", "Lky3/d;", "state", "Lk10/l;", "Lky3/e;", "<anonymous>", "(Lky3/a$o;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<a.Setup, k10.c0<ky3.d>, tq.e<? super k10.l<? extends ky3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f113389e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f113390f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f113391g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Error V(w0 w0Var, dx.b bVar, ky3.d dVar) {
            return new Error(w0Var.G9(bVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ky3.e.a.Aliases X(a.Setup setup, boolean z15, ky3.d dVar) {
            return new ky3.e.a.Aliases(setup.getOneClickRequiredData().getBlikRequiredData(), setup.getOneClickRequiredData().a(), (BEAlias) pq.v.l0(setup.getOneClickRequiredData().a()), z15, g30.v.HIDDEN);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final a.Setup setup = (a.Setup) this.f113390f;
            k10.c0 c0Var = (k10.c0) this.f113391g;
            Object objE = uq.b.e();
            int i15 = this.f113389e;
            if (i15 == 0) {
                oq.u.b(obj);
                r44.a aVar = w0.this.consumeOneClickPaymentInfoAlertUC;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f113390f = setup;
                this.f113391g = c0Var;
                this.f113389e = 1;
                obj = aVar.c(c1792a, this);
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
            final w0 w0Var = w0.this;
            if (iVar instanceof dx.i.Left) {
                final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                return c0Var.d(new er.l() { // from class: ky3.x0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return w0.e.V(w0Var, bVar, (d) obj2);
                    }
                });
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            final boolean zBooleanValue = ((Boolean) ((dx.i.Right) iVar).b()).booleanValue();
            return c0Var.d(new er.l() { // from class: ky3.y0
                @Override // er.l
                public final Object b(Object obj2) {
                    return w0.e.X(setup, zBooleanValue, (d) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(a.Setup setup, k10.c0<ky3.d> c0Var, tq.e<? super k10.l<? extends ky3.e>> eVar) {
            e eVar2 = w0.this.new e(eVar);
            eVar2.f113390f = setup;
            eVar2.f113391g = c0Var;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lky3/a$d;", "<unused var>", "Lk10/c0;", "Lky3/c;", "state", "Lk10/l;", "Lky3/e;", "<anonymous>", "(Lky3/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<a.d, k10.c0<Error>, tq.e<? super k10.l<? extends ky3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f113393e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f113394f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ky3.d O(Error error) {
            return ky3.d.f113257a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f113394f;
            uq.b.e();
            if (this.f113393e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ky3.z0
                @Override // er.l
                public final Object b(Object obj2) {
                    return w0.f.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.d dVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends ky3.e>> eVar) {
            f fVar = new f(eVar);
            fVar.f113394f = c0Var;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lky3/a$c;", "<unused var>", "Lky3/c;", "Loq/i0;", "<anonymous>", "(Lky3/a$c;Lky3/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<a.c, Error, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f113395e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f113395e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<a.i> bVarY1 = w0.this.Y1();
                a.i.C2750a c2750a = a.i.C2750a.f113232a;
                this.f113395e = 1;
                if (bVarY1.F(c2750a, this) == objE) {
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
            return w0.this.new g(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lky3/a$p;", "action", "Lky3/e$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lky3/a$p;Lky3/e$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<a.ToBlik, ky3.e.a, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f113397e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f113398f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            a.ToBlik toBlik = (a.ToBlik) this.f113398f;
            Object objE = uq.b.e();
            int i15 = this.f113397e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (pq.v.n0(toBlik.getPaymentData().c()) != null) {
                    xw.b<a.i> bVarY1 = w0.this.Y1();
                    a.i.ToBlik toBlik2 = new a.i.ToBlik(toBlik.getPaymentData());
                    this.f113398f = vq.j.a(toBlik);
                    this.f113397e = 1;
                    if (bVarY1.F(toBlik2, this) == objE) {
                        return objE;
                    }
                } else {
                    w0.this.d9(new a.HandleInitializedError(new dx.b.Parsing(null, 1, null)));
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
        public final Object w(a.ToBlik toBlik, ky3.e.a aVar, tq.e<? super oq.i0> eVar) {
            h hVar = w0.this.new h(eVar);
            hVar.f113398f = toBlik;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lky3/a$g;", "action", "Lky3/e$a;", "state", "Loq/i0;", "<anonymous>", "(Lky3/a$g;Lky3/e$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<a.HandleInitializedError, ky3.e.a, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f113400e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f113401f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f113402g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f113403h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f113404j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f113405k;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            a.HandleInitializedError handleInitializedError = (a.HandleInitializedError) this.f113404j;
            ky3.e.a aVar = (ky3.e.a) this.f113405k;
            Object objE = uq.b.e();
            int i15 = this.f113403h;
            if (i15 == 0) {
                oq.u.b(obj);
                dx.b domainError = handleInitializedError.getDomainError();
                if (domainError instanceof dx.b.Business) {
                    dx.b.Business business = (dx.b.Business) domainError;
                    if (business.getType() == ur0.d.ALIAS_ERROR) {
                        BlikRequiredData paymentData = aVar.getPaymentData();
                        xw.b<a.i> bVarY1 = w0.this.Y1();
                        a.i.GoToResult goToResult = new a.i.GoToResult(new my3.f.b.a.Alias(paymentData.c(), paymentData.getPaymentPackageId(), business.getTitle(), business.getMessage(), paymentData.getSourcePaymentId(), mx.b.b(paymentData.getTitle(), "paymentTitle"), mx.b.b(paymentData.getAmountWithCurrency(), "paymentAmount")));
                        this.f113404j = vq.j.a(handleInitializedError);
                        this.f113405k = vq.j.a(aVar);
                        this.f113400e = vq.j.a(domainError);
                        this.f113401f = vq.j.a(paymentData);
                        this.f113402g = 0;
                        this.f113403h = 1;
                        if (bVarY1.F(goToResult, this) == objE) {
                            return objE;
                        }
                    } else {
                        w0.this.d9(new a.SetOwnError(domainError));
                    }
                } else {
                    w0.this.d9(new a.SetOwnError(domainError));
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
        public final Object w(a.HandleInitializedError handleInitializedError, ky3.e.a aVar, tq.e<? super oq.i0> eVar) {
            i iVar = w0.this.new i(eVar);
            iVar.f113404j = handleInitializedError;
            iVar.f113405k = aVar;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lky3/a$f;", "<unused var>", "Lk10/c0;", "Lky3/e$a$a;", "state", "Lk10/l;", "Lky3/e;", "<anonymous>", "(Lky3/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<a.f, k10.c0<ky3.e.a.Aliases>, tq.e<? super k10.l<? extends ky3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f113407e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f113408f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ky3.e.a.Aliases O(ky3.e.a.Aliases aliases) {
            return ky3.e.a.Aliases.c(aliases, null, null, null, false, g30.v.HIDDEN, 15, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f113408f;
            Object objE = uq.b.e();
            int i15 = this.f113407e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (((ky3.e.a.Aliases) c0Var.a()).getBottomSheetState() != g30.v.HIDDEN) {
                    return c0Var.d(new er.l() { // from class: ky3.a1
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return w0.j.O((e.a.Aliases) obj2);
                        }
                    });
                }
                xw.b<a.i> bVarY1 = w0.this.Y1();
                a.i.b bVar = a.i.b.f113233a;
                this.f113408f = c0Var;
                this.f113407e = 1;
                if (bVarY1.F(bVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.f fVar, k10.c0<ky3.e.a.Aliases> c0Var, tq.e<? super k10.l<? extends ky3.e>> eVar) {
            j jVar = w0.this.new j(eVar);
            jVar.f113408f = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lky3/a$k;", "action", "Lk10/c0;", "Lky3/e$a$a;", "state", "Lk10/l;", "Lky3/e;", "<anonymous>", "(Lky3/a$k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<a.PayWithOneClick, k10.c0<ky3.e.a.Aliases>, tq.e<? super k10.l<? extends ky3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f113410e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f113411f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f113412g;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final View O(a.PayWithOneClick payWithOneClick, ky3.e.a.Aliases aliases) {
            return new View(aliases.getPaymentData(), payWithOneClick.getSelectedAlias());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final a.PayWithOneClick payWithOneClick = (a.PayWithOneClick) this.f113411f;
            k10.c0 c0Var = (k10.c0) this.f113412g;
            uq.b.e();
            if (this.f113410e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ky3.b1
                @Override // er.l
                public final Object b(Object obj2) {
                    return w0.k.O(payWithOneClick, (e.a.Aliases) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.PayWithOneClick payWithOneClick, k10.c0<ky3.e.a.Aliases> c0Var, tq.e<? super k10.l<? extends ky3.e>> eVar) {
            k kVar = new k(eVar);
            kVar.f113411f = payWithOneClick;
            kVar.f113412g = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lky3/a$m;", "action", "Lk10/c0;", "Lky3/e$a$a;", "state", "Lk10/l;", "Lky3/e;", "<anonymous>", "(Lky3/a$m;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<a.SelectAlias, k10.c0<ky3.e.a.Aliases>, tq.e<? super k10.l<? extends ky3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f113413e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f113414f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f113415g;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ky3.e.a.Aliases O(a.SelectAlias selectAlias, ky3.e.a.Aliases aliases) {
            return ky3.e.a.Aliases.c(aliases, null, null, selectAlias.getSelectedAlias(), false, null, 27, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final a.SelectAlias selectAlias = (a.SelectAlias) this.f113414f;
            k10.c0 c0Var = (k10.c0) this.f113415g;
            uq.b.e();
            if (this.f113413e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ky3.c1
                @Override // er.l
                public final Object b(Object obj2) {
                    return w0.l.O(selectAlias, (e.a.Aliases) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.SelectAlias selectAlias, k10.c0<ky3.e.a.Aliases> c0Var, tq.e<? super k10.l<? extends ky3.e>> eVar) {
            l lVar = new l(eVar);
            lVar.f113414f = selectAlias;
            lVar.f113415g = c0Var;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lky3/a$h;", "<unused var>", "Lk10/c0;", "Lky3/e$a$a;", "state", "Lk10/l;", "Lky3/e;", "<anonymous>", "(Lky3/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<a.h, k10.c0<ky3.e.a.Aliases>, tq.e<? super k10.l<? extends ky3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f113416e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f113417f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ky3.e.a.Aliases O(ky3.e.a.Aliases aliases) {
            return ky3.e.a.Aliases.c(aliases, null, null, null, false, null, 23, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f113417f;
            uq.b.e();
            if (this.f113416e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ky3.d1
                @Override // er.l
                public final Object b(Object obj2) {
                    return w0.m.O((e.a.Aliases) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.h hVar, k10.c0<ky3.e.a.Aliases> c0Var, tq.e<? super k10.l<? extends ky3.e>> eVar) {
            m mVar = new m(eVar);
            mVar.f113417f = c0Var;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lky3/a$b;", "action", "Lk10/c0;", "Lky3/e$a$a;", "state", "Lk10/l;", "Lky3/e;", "<anonymous>", "(Lky3/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<a.BottomSheetVisibilityChanged, k10.c0<ky3.e.a.Aliases>, tq.e<? super k10.l<? extends ky3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f113418e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f113419f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f113420g;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ky3.e.a.Aliases O(a.BottomSheetVisibilityChanged bottomSheetVisibilityChanged, ky3.e.a.Aliases aliases) {
            return ky3.e.a.Aliases.c(aliases, null, null, null, false, bottomSheetVisibilityChanged.getBottomSheetStateValue(), 15, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final a.BottomSheetVisibilityChanged bottomSheetVisibilityChanged = (a.BottomSheetVisibilityChanged) this.f113419f;
            k10.c0 c0Var = (k10.c0) this.f113420g;
            uq.b.e();
            if (this.f113418e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ky3.e1
                @Override // er.l
                public final Object b(Object obj2) {
                    return w0.n.O(bottomSheetVisibilityChanged, (e.a.Aliases) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.BottomSheetVisibilityChanged bottomSheetVisibilityChanged, k10.c0<ky3.e.a.Aliases> c0Var, tq.e<? super k10.l<? extends ky3.e>> eVar) {
            n nVar = new n(eVar);
            nVar.f113419f = bottomSheetVisibilityChanged;
            nVar.f113420g = c0Var;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lky3/a$f;", "<unused var>", "Lky3/g;", "Loq/i0;", "<anonymous>", "(Lky3/a$f;Lky3/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<a.f, View, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f113421e;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f113421e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<a.i> bVarY1 = w0.this.Y1();
                a.i.b bVar = a.i.b.f113233a;
                this.f113421e = 1;
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
        public final Object w(a.f fVar, View view, tq.e<? super oq.i0> eVar) {
            return w0.this.new o(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lky3/a$n;", "action", "Lk10/c0;", "Lky3/g;", "state", "Lk10/l;", "Lky3/e;", "<anonymous>", "(Lky3/a$n;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<a.SetOwnError, k10.c0<View>, tq.e<? super k10.l<? extends ky3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f113423e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f113424f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f113425g;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Error O(k10.c0 c0Var, w0 w0Var, a.SetOwnError setOwnError, View view) {
            return new Error(((View) c0Var.a()).getPaymentData(), ((View) c0Var.a()).getSelectedAlias(), w0Var.G9(setOwnError.getDomainError()));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final a.SetOwnError setOwnError = (a.SetOwnError) this.f113424f;
            final k10.c0 c0Var = (k10.c0) this.f113425g;
            uq.b.e();
            if (this.f113423e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final w0 w0Var = w0.this;
            return c0Var.d(new er.l() { // from class: ky3.f1
                @Override // er.l
                public final Object b(Object obj2) {
                    return w0.p.O(c0Var, w0Var, setOwnError, (View) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.SetOwnError setOwnError, k10.c0<View> c0Var, tq.e<? super k10.l<? extends ky3.e>> eVar) {
            p pVar = w0.this.new p(eVar);
            pVar.f113424f = setOwnError;
            pVar.f113425g = c0Var;
            return pVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lky3/g;", "it", "Loq/i0;", "<anonymous>", "(Lky3/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.p<View, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f113427e;

        q(tq.e<? super q> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f113427e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            w0.this.d9(a.l.f113241a);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(View view, tq.e<? super oq.i0> eVar) {
            return ((q) v(view, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return w0.this.new q(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lky3/a$l;", "<unused var>", "Lk10/c0;", "Lky3/g;", "state", "Lk10/l;", "Lky3/e;", "<anonymous>", "(Lky3/a$l;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<a.l, k10.c0<View>, tq.e<? super k10.l<? extends ky3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f113429e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f113430f;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final View O(BEStartPaymentResult bEStartPaymentResult, View view) {
            return new View(view.getPaymentData(), bEStartPaymentResult.getTransactionId(), nx.c.FOREGROUND);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f113430f;
            Object objE = uq.b.e();
            int i15 = this.f113429e;
            if (i15 == 0) {
                oq.u.b(obj);
                vx3.b bVar = w0.this.startOneClickPaymentUseCase;
                bs0.c.Params params = new bs0.c.Params(((View) c0Var.a()).getPaymentData().c(), ((View) c0Var.a()).getSelectedAlias(), ((View) c0Var.a()).getPaymentData().getPaymentPackageId());
                this.f113430f = c0Var;
                this.f113429e = 1;
                obj = bVar.e(params, this);
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
            w0 w0Var = w0.this;
            if (iVar instanceof dx.i.Left) {
                w0Var.d9(new a.HandleInitializedError((dx.b) ((dx.i.Left) iVar).b()));
                return c0Var.c();
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            final BEStartPaymentResult bEStartPaymentResult = (BEStartPaymentResult) ((dx.i.Right) iVar).b();
            return c0Var.d(new er.l() { // from class: ky3.g1
                @Override // er.l
                public final Object b(Object obj2) {
                    return w0.r.O(bEStartPaymentResult, (View) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.l lVar, k10.c0<View> c0Var, tq.e<? super k10.l<? extends ky3.e>> eVar) {
            r rVar = w0.this.new r(eVar);
            rVar.f113430f = c0Var;
            return rVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lky3/a$q;", "<unused var>", "Lky3/g;", "Loq/i0;", "<anonymous>", "(Lky3/a$q;Lky3/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<a.q, View, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f113432e;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f113432e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<a.i> bVarY1 = w0.this.Y1();
                a.i.ToInterruptionDialog toInterruptionDialog = new a.i.ToInterruptionDialog(w0.this.paymentBlikDialogsMapper.b(new ay3.c.Params(w0.this.b9(a.C2749a.f113224a))));
                this.f113432e = 1;
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
        public final Object w(a.q qVar, View view, tq.e<? super oq.i0> eVar) {
            return w0.this.new s(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lky3/a$d;", "<unused var>", "Lk10/c0;", "Lky3/f;", "state", "Lk10/l;", "Lky3/e;", "<anonymous>", "(Lky3/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.q<a.d, k10.c0<Error>, tq.e<? super k10.l<? extends ky3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f113434e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f113435f;

        t(tq.e<? super t> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final View O(k10.c0 c0Var, Error error) {
            return new View(((Error) c0Var.a()).getPaymentData(), ((Error) c0Var.a()).getSelectedAlias());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f113435f;
            uq.b.e();
            if (this.f113434e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ky3.h1
                @Override // er.l
                public final Object b(Object obj2) {
                    return w0.t.O(c0Var, (Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.d dVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends ky3.e>> eVar) {
            t tVar = new t(eVar);
            tVar.f113435f = c0Var;
            return tVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lky3/a$c;", "<unused var>", "Lky3/f;", "Loq/i0;", "<anonymous>", "(Lky3/a$c;Lky3/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class u extends vq.k implements er.q<a.c, Error, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f113436e;

        u(tq.e<? super u> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f113436e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<a.i> bVarY1 = w0.this.Y1();
                a.i.C2750a c2750a = a.i.C2750a.f113232a;
                this.f113436e = 1;
                if (bVarY1.F(c2750a, this) == objE) {
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
            return w0.this.new u(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lky3/a$f;", "<unused var>", "Lky3/i;", "Loq/i0;", "<anonymous>", "(Lky3/a$f;Lky3/i;)V"}, k = 3, mv = {2, 2, 0})
    static final class v extends vq.k implements er.q<a.f, View, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f113438e;

        v(tq.e<? super v> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f113438e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<a.i> bVarY1 = w0.this.Y1();
                a.i.b bVar = a.i.b.f113233a;
                this.f113438e = 1;
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
        public final Object w(a.f fVar, View view, tq.e<? super oq.i0> eVar) {
            return w0.this.new v(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lky3/a$n;", "action", "Lk10/c0;", "Lky3/i;", "state", "Lk10/l;", "Lky3/e;", "<anonymous>", "(Lky3/a$n;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class w extends vq.k implements er.q<a.SetOwnError, k10.c0<View>, tq.e<? super k10.l<? extends ky3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f113440e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f113441f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f113442g;

        w(tq.e<? super w> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Error O(k10.c0 c0Var, w0 w0Var, a.SetOwnError setOwnError, View view) {
            return new Error(((View) c0Var.a()).getPaymentData(), ((View) c0Var.a()).getTransactionId(), w0Var.G9(setOwnError.getDomainError()));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final a.SetOwnError setOwnError = (a.SetOwnError) this.f113441f;
            final k10.c0 c0Var = (k10.c0) this.f113442g;
            uq.b.e();
            if (this.f113440e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final w0 w0Var = w0.this;
            return c0Var.d(new er.l() { // from class: ky3.i1
                @Override // er.l
                public final Object b(Object obj2) {
                    return w0.w.O(c0Var, w0Var, setOwnError, (View) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.SetOwnError setOwnError, k10.c0<View> c0Var, tq.e<? super k10.l<? extends ky3.e>> eVar) {
            w wVar = w0.this.new w(eVar);
            wVar.f113441f = setOwnError;
            wVar.f113442g = c0Var;
            return wVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lnx/c;", "viewVisibility", "Lk10/c0;", "Lky3/i;", "state", "Lk10/l;", "Lky3/e;", "<anonymous>", "(Lnx/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class x extends vq.k implements er.q<nx.c, k10.c0<View>, tq.e<? super k10.l<? extends ky3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f113444e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f113445f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f113446g;

        x(tq.e<? super x> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final View O(nx.c cVar, View view) {
            return View.c(view, null, null, cVar, 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final nx.c cVar = (nx.c) this.f113445f;
            k10.c0 c0Var = (k10.c0) this.f113446g;
            uq.b.e();
            if (this.f113444e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ky3.j1
                @Override // er.l
                public final Object b(Object obj2) {
                    return w0.x.O(cVar, (View) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(nx.c cVar, k10.c0<View> c0Var, tq.e<? super k10.l<? extends ky3.e>> eVar) {
            x xVar = new x(eVar);
            xVar.f113445f = cVar;
            xVar.f113446g = c0Var;
            return xVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lgu/b;", "timePassed", "Lky3/i;", "state", "Loq/i0;", "<anonymous>", "(Lgu/b;Lky3/i;)V"}, k = 3, mv = {2, 2, 0})
    static final class y extends vq.k implements er.q<gu.b, View, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f113447e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ long f113448f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f113449g;

        y(tq.e<? super y> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            long j15 = this.f113448f;
            View view = (View) this.f113449g;
            Object objE = uq.b.e();
            int i15 = this.f113447e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (view.getViewVisibility() == nx.c.FOREGROUND && g2.n(getContext())) {
                    if (gu.b.q(j15, w0.f113353w) < 0) {
                        w0.this.d9(a.e.f113228a);
                    } else {
                        xw.b<a.i> bVarY1 = w0.this.Y1();
                        a.i.GoToResult goToResult = new a.i.GoToResult(new my3.f.b.PaymentInProcessing(view.getPaymentData().getSourcePaymentId(), mx.b.b(view.getPaymentData().getTitle(), "paymentTitle"), mx.b.b(view.getPaymentData().getAmountWithCurrency(), "paymentAmount")));
                        this.f113449g = vq.j.a(view);
                        this.f113448f = j15;
                        this.f113447e = 1;
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
            y yVar = w0.this.new y(eVar);
            yVar.f113448f = j15;
            yVar.f113449g = view;
            return yVar.J(oq.i0.f148189a);
        }

        @Override // er.q
        public /* bridge */ /* synthetic */ Object w(gu.b bVar, View view, tq.e<? super oq.i0> eVar) {
            return M(bVar.getRawValue(), view, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lky3/a$e;", "<unused var>", "Lky3/i;", "state", "Loq/i0;", "<anonymous>", "(Lky3/a$e;Lky3/i;)V"}, k = 3, mv = {2, 2, 0})
    static final class z extends vq.k implements er.q<ky3.a.e, View, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f113451e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f113452f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f113453g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f113454h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f113455j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f113456k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f113457l;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f113459a;

            static {
                int[] iArr = new int[ur0.c.values().length];
                try {
                    iArr[ur0.c.INVALID_BLIK_ALIAS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ur0.c.UNKNOWN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f113459a = iArr;
            }
        }

        z(tq.e<? super z> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:53:0x019d  */
        /* JADX WARN: Code duplicated, block: B:54:0x01a4  */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x011b, code lost:
        
            if (r10.F(r12, r25) == r2) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x01ed, code lost:
        
            if (r3.F(r5, r25) == r2) goto L58;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r26) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 511
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ky3.w0.z.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ky3.a.e eVar, View view, tq.e<? super oq.i0> eVar2) {
            z zVar = w0.this.new z(eVar2);
            zVar.f113457l = view;
            return zVar.J(oq.i0.f148189a);
        }
    }

    static {
        gu.b.Companion companion = gu.b.INSTANCE;
        f113352v = gu.d.q(5, gu.e.SECONDS);
        f113353w = gu.d.q(1, gu.e.MINUTES);
    }

    public w0(yy.a aVar, ky3.s sVar, ib4.c cVar, ay3.c cVar2, vx3.b bVar, r44.a aVar2, hb4.d dVar, oz.q qVar, ez.g gVar, bs0.b bVar2, OneClickSetupData oneClickSetupData) {
        this.mapper = sVar;
        this.genericErrorMapper = cVar;
        this.paymentBlikDialogsMapper = cVar2;
        this.startOneClickPaymentUseCase = bVar;
        this.consumeOneClickPaymentInfoAlertUC = aVar2;
        this.errorVMSFactory = dVar;
        this.ownerViewLifecycleManager = qVar;
        this.ticker = gVar;
        this.getBlikTransactionUseCase = bVar2;
        this.setupData = oneClickSetupData;
        this.lifecycleConnector = qVar;
        ky3.d dVar2 = ky3.d.f113257a;
        this.initialState = dVar2;
        this.stateMachine = aVar.a(dVar2, new er.l() { // from class: ky3.m0
            @Override // er.l
            public final Object b(Object obj) {
                return w0.Q9(this.f113315a, (k10.v) obj);
            }
        });
        this.state = a9(new c(e9().getState(), this), J9(dVar2));
        this.navAction = new xw.b<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hb4.c G9(dx.b domainError) {
        return this.errorVMSFactory.a(this.genericErrorMapper.b(new ib4.c.Params(domainError, this.setupData.getPaymentSuccessResultType() != rx3.a.PAYMENT_AS_STEP_IN_PROCESS, new er.l() { // from class: ky3.l0
            @Override // er.l
            public final Object b(Object obj) {
                return w0.H9(this.f113313a, (ib4.c.b) obj);
            }
        })));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H9(w0 w0Var, ib4.c.b bVar) {
        if (!(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
            if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
                w0Var.d9(a.d.f113227a);
            } else {
                if (!(bVar instanceof ib4.c.b.a.Close) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                    throw new oq.p();
                }
                w0Var.d9(a.c.f113226a);
            }
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean I9(String aliasOnListId, String selectedAliasId) {
        return fr.t.c(aliasOnListId, selectedAliasId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ky3.j.a J9(ky3.e state) {
        ky3.s sVar = this.mapper;
        er.a<oq.i0> aVarB9 = b9(a.q.f113246a);
        return sVar.b(new ky3.s.Params(state, b9(a.f.f113229a), new er.l() { // from class: ky3.v0
            @Override // er.l
            public final Object b(Object obj) {
                return w0.K9(this.f113347a, (String) obj);
            }
        }, aVarB9, new er.l() { // from class: ky3.h0
            @Override // er.l
            public final Object b(Object obj) {
                return w0.L9(this.f113279a, (BEAlias) obj);
            }
        }, new er.l() { // from class: ky3.i0
            @Override // er.l
            public final Object b(Object obj) {
                return w0.M9(this.f113284a, (BlikRequiredData) obj);
            }
        }, new er.l() { // from class: ky3.j0
            @Override // er.l
            public final Object b(Object obj) {
                return w0.N9(this.f113306a, (BEAlias) obj);
            }
        }, new b(this), b9(a.h.f113231a), new er.l() { // from class: ky3.k0
            @Override // er.l
            public final Object b(Object obj) {
                return w0.O9(this.f113309a, (g30.v) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K9(w0 w0Var, String str) {
        w0Var.d9(new a.OnBlikCodeChanged(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L9(w0 w0Var, BEAlias bEAlias) {
        w0Var.d9(new a.PayWithOneClick(bEAlias));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M9(w0 w0Var, BlikRequiredData blikRequiredData) {
        w0Var.d9(new a.ToBlik(blikRequiredData));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N9(w0 w0Var, BEAlias bEAlias) {
        w0Var.d9(new a.SelectAlias(bEAlias));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O9(w0 w0Var, g30.v vVar) {
        w0Var.d9(new a.BottomSheetVisibilityChanged(vVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q9(final w0 w0Var, k10.v vVar) {
        vVar.c(fr.q0.c(ky3.e.class), new er.l() { // from class: ky3.g0
            @Override // er.l
            public final Object b(Object obj) {
                return w0.R9(this.f113274a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(ky3.d.class), new er.l() { // from class: ky3.n0
            @Override // er.l
            public final Object b(Object obj) {
                return w0.S9(this.f113318a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Error.class), new er.l() { // from class: ky3.o0
            @Override // er.l
            public final Object b(Object obj) {
                return w0.T9(this.f113321a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(ky3.e.a.class), new er.l() { // from class: ky3.p0
            @Override // er.l
            public final Object b(Object obj) {
                return w0.U9(this.f113323a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(ky3.e.a.Aliases.class), new er.l() { // from class: ky3.q0
            @Override // er.l
            public final Object b(Object obj) {
                return w0.V9(this.f113325a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(View.class), new er.l() { // from class: ky3.r0
            @Override // er.l
            public final Object b(Object obj) {
                return w0.W9(this.f113327a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Error.class), new er.l() { // from class: ky3.s0
            @Override // er.l
            public final Object b(Object obj) {
                return w0.X9(this.f113340a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(View.class), new er.l() { // from class: ky3.t0
            @Override // er.l
            public final Object b(Object obj) {
                return w0.Y9(this.f113342a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Error.class), new er.l() { // from class: ky3.u0
            @Override // er.l
            public final Object b(Object obj) {
                return w0.Z9(this.f113344a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R9(w0 w0Var, k10.z zVar) {
        d dVar = w0Var.new d(null);
        zVar.x(fr.q0.c(a.C2749a.class), k10.o.CANCEL_PREVIOUS, dVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S9(w0 w0Var, k10.z zVar) {
        e eVar = w0Var.new e(null);
        zVar.v(fr.q0.c(a.Setup.class), k10.o.CANCEL_PREVIOUS, eVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T9(w0 w0Var, k10.z zVar) {
        f fVar = new f(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(a.d.class), oVar, fVar);
        zVar.x(fr.q0.c(a.c.class), oVar, w0Var.new g(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U9(w0 w0Var, k10.z zVar) {
        h hVar = w0Var.new h(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(a.ToBlik.class), oVar, hVar);
        zVar.x(fr.q0.c(a.HandleInitializedError.class), oVar, w0Var.new i(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V9(w0 w0Var, k10.z zVar) {
        j jVar = w0Var.new j(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(a.f.class), oVar, jVar);
        zVar.v(fr.q0.c(a.PayWithOneClick.class), oVar, new k(null));
        zVar.v(fr.q0.c(a.SelectAlias.class), oVar, new l(null));
        zVar.v(fr.q0.c(a.h.class), oVar, new m(null));
        zVar.v(fr.q0.c(a.BottomSheetVisibilityChanged.class), oVar, new n(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W9(w0 w0Var, k10.z zVar) {
        o oVar = w0Var.new o(null);
        k10.o oVar2 = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(a.f.class), oVar2, oVar);
        zVar.v(fr.q0.c(a.SetOwnError.class), oVar2, w0Var.new p(null));
        zVar.C(w0Var.new q(null));
        zVar.v(fr.q0.c(a.l.class), oVar2, w0Var.new r(null));
        zVar.x(fr.q0.c(a.q.class), oVar2, w0Var.new s(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X9(w0 w0Var, k10.z zVar) {
        t tVar = new t(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(a.d.class), oVar, tVar);
        zVar.x(fr.q0.c(a.c.class), oVar, w0Var.new u(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Y9(w0 w0Var, k10.z zVar) {
        v vVar = w0Var.new v(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(a.f.class), oVar, vVar);
        zVar.v(fr.q0.c(a.SetOwnError.class), oVar, w0Var.new w(null));
        k10.k.m(zVar, w0Var.ownerViewLifecycleManager.G2(), null, new x(null), 2, null);
        k10.k.s(zVar, w0Var.ticker.a(f113352v), null, w0Var.new y(null), 2, null);
        zVar.x(fr.q0.c(a.e.class), oVar, w0Var.new z(null));
        zVar.x(fr.q0.c(a.q.class), oVar, w0Var.new a0(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Z9(w0 w0Var, k10.z zVar) {
        b0 b0Var = new b0(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(a.d.class), oVar, b0Var);
        zVar.x(fr.q0.c(a.c.class), oVar, w0Var.new c0(null));
        return oq.i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: P9, reason: merged with bridge method [inline-methods] */
    public void P5(OneClickSetupData data) {
        this.setupData = data;
        d9(new a.Setup(data.getOneClickRequiredData()));
    }

    @Override // zx.b
    public xw.b<a.i> Y1() {
        return this.navAction;
    }

    @Override // ky3.j
    /* JADX INFO: renamed from: a, reason: from getter */
    public oz.j getLifecycleConnector() {
        return this.lifecycleConnector;
    }

    @Override // l00.g
    protected k10.t<ky3.e, a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<ky3.j.a> getState() {
        return this.state;
    }
}
