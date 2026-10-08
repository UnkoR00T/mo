package bw1;

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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006BS\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b!\u0010\"J\u0018\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0096\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020%H\u0096\u0001¢\u0006\u0004\b(\u0010)R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R&\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030>8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR \u0010J\u001a\b\u0012\u0004\u0012\u00020E0D8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0K8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O¨\u0006P"}, d2 = {"Lbw1/n;", "Ll00/g;", "Lbw1/c;", "Lbw1/a;", "Lbw1/d;", "", "Li70/e;", "Lyy/a;", "stateMachineFactory", "Lcw1/a;", "mapper", "Lhb4/d;", "errorVMSFactory", "Lib4/c;", "genericDomainErrorMapper", "Lov1/a;", "downloadDiplomaDocumentUC", "Lac4/n;", "openUriIntentUseCase", "globalSnackBarManager", "Lmx/c;", "labelProvider", "Lbw1/b;", "setupData", "<init>", "(Lyy/a;Lcw1/a;Lhb4/d;Lib4/c;Lov1/a;Lac4/n;Li70/e;Lmx/c;Lbw1/b;)V", "Ldx/b;", "domainError", "Lhb4/c;", "t9", "(Ldx/b;)Lhb4/c;", "state", "Lbw1/d$a;", "v9", "(Lbw1/c;)Lbw1/d$a;", "Lp50/a;", "snackBarData", "Loq/i0;", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lcw1/a;", "c", "Lhb4/d;", "d", "Lib4/c;", "e", "Lov1/a;", "f", "Lac4/n;", "g", "Li70/e;", "h", "Lmx/c;", "j", "Lbw1/b;", "Lbw1/c$a;", "k", "Lbw1/c$a;", "initialState", "Lk10/t;", "l", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lbw1/a$a;", "m", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "n", "Lmu/p0;", "getState", "()Lmu/p0;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<bw1.c, bw1.a> implements bw1.d, zx.d, i70.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final cw1.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ov1.a downloadDiplomaDocumentUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ac4.n openUriIntentUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final bw1.c.a initialState;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final t<bw1.c, bw1.a> stateMachine;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final xw.b<bw1.a.InterfaceC0575a> navAction;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final p0<bw1.d.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<bw1.d.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f21826a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f21827b;

        /* JADX INFO: renamed from: bw1.n$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0578a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f21828a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f21829b;

            /* JADX INFO: renamed from: bw1.n$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0579a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f21830d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f21831e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f21832f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f21834h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f21835j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f21836k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f21837l;

                public C0579a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f21830d = obj;
                    this.f21831e |= PKIFailureInfo.systemUnavail;
                    return C0578a.this.F(null, this);
                }
            }

            public C0578a(mu.h hVar, n nVar) {
                this.f21828a = hVar;
                this.f21829b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0579a c0579a;
                if (eVar instanceof C0579a) {
                    c0579a = (C0579a) eVar;
                    int i15 = c0579a.f21831e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0579a.f21831e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0579a = new C0579a(eVar);
                    }
                } else {
                    c0579a = new C0579a(eVar);
                }
                Object obj2 = c0579a.f21830d;
                Object objE = uq.b.e();
                int i16 = c0579a.f21831e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f21828a;
                    bw1.d.a aVarV9 = this.f21829b.v9((bw1.c) obj);
                    c0579a.f21832f = vq.j.a(obj);
                    c0579a.f21834h = vq.j.a(c0579a);
                    c0579a.f21835j = vq.j.a(obj);
                    c0579a.f21836k = vq.j.a(hVar);
                    c0579a.f21837l = 0;
                    c0579a.f21831e = 1;
                    if (hVar.F(aVarV9, c0579a) == objE) {
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
            this.f21826a = gVar;
            this.f21827b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super bw1.d.a> hVar, tq.e eVar) {
            Object objA = this.f21826a.a(new C0578a(hVar, this.f21827b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lbw1/a$a;", "action", "Lbw1/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lbw1/a$a;Lbw1/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<bw1.a.InterfaceC0575a, bw1.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f21838e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f21839f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            bw1.a.InterfaceC0575a interfaceC0575a = (bw1.a.InterfaceC0575a) this.f21839f;
            Object objE = uq.b.e();
            int i15 = this.f21838e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<bw1.a.InterfaceC0575a> bVarY1 = n.this.Y1();
                this.f21839f = vq.j.a(interfaceC0575a);
                this.f21838e = 1;
                if (bVarY1.F(interfaceC0575a, this) == objE) {
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
        public final Object w(bw1.a.InterfaceC0575a interfaceC0575a, bw1.c cVar, tq.e<? super i0> eVar) {
            b bVar = n.this.new b(eVar);
            bVar.f21839f = interfaceC0575a;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lbw1/a$b;", "<unused var>", "Lk10/c0;", "Lbw1/c$b;", "state", "Lk10/l;", "Lbw1/c;", "<anonymous>", "(Lbw1/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<bw1.a.b, c0<bw1.c.Error>, tq.e<? super k10.l<? extends bw1.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f21841e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f21842f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final bw1.c.a O(bw1.c.Error error) {
            return bw1.c.a.f21796a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f21842f;
            uq.b.e();
            if (this.f21841e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.d(new er.l() { // from class: bw1.o
                @Override // er.l
                public final Object b(Object obj2) {
                    return n.c.O((c.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(bw1.a.b bVar, c0<bw1.c.Error> c0Var, tq.e<? super k10.l<? extends bw1.c>> eVar) {
            c cVar = new c(eVar);
            cVar.f21842f = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lbw1/c$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lbw1/c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<bw1.c.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f21843e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f21844f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f21845g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f21846h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f21847j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f21848k;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x00b2  */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            n nVar;
            dx.i iVar;
            Object objE = uq.b.e();
            int i15 = this.f21848k;
            if (i15 == 0) {
                u.b(obj);
                ov1.a aVar = n.this.downloadDiplomaDocumentUC;
                ov1.a.Params params = new ov1.a.Params(n.this.setupData.getDiplomaType(), n.this.setupData.getDiplomaSubtype(), n.this.setupData.getDiplomaUuid());
                this.f21848k = 1;
                obj = aVar.c(params, this);
                if (obj != objE) {
                }
                return objE;
            }
            if (i15 == 1) {
                u.b(obj);
            } else {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nVar = (n) this.f21844f;
                u.b(obj);
            }
            iVar = (dx.i) obj;
            if (iVar instanceof dx.i.Left) {
                nVar.globalSnackBarManager.y(new p50.a.Default(nVar.labelProvider.c(dv1.a.f44639i), false, null, 6, null));
            }
            nVar.d9(bw1.a.InterfaceC0575a.C0576a.f21790a);
            return i0.f148189a;
            dx.i iVar2 = (dx.i) obj;
            n nVar2 = n.this;
            if (!(iVar2 instanceof dx.i.Left)) {
                if (!(iVar2 instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                String str = (String) ((dx.i.Right) iVar2).b();
                ac4.n nVar3 = nVar2.openUriIntentUseCase;
                ac4.n.Params params2 = new ac4.n.Params(str);
                this.f21843e = vq.j.a(iVar2);
                this.f21844f = nVar2;
                this.f21845g = vq.j.a(str);
                this.f21846h = 0;
                this.f21847j = 0;
                this.f21848k = 2;
                obj = nVar3.c(params2, this);
                if (obj != objE) {
                    nVar = nVar2;
                    iVar = (dx.i) obj;
                    if (iVar instanceof dx.i.Left) {
                        nVar.globalSnackBarManager.y(new p50.a.Default(nVar.labelProvider.c(dv1.a.f44639i), false, null, 6, null));
                    }
                    nVar.d9(bw1.a.InterfaceC0575a.C0576a.f21790a);
                }
                return objE;
            }
            nVar2.d9(new bw1.a.SetLoadError((dx.b) ((dx.i.Left) iVar2).b()));
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(bw1.c.a aVar, tq.e<? super i0> eVar) {
            return ((d) v(aVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return n.this.new d(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lbw1/a$c;", "action", "Lk10/c0;", "Lbw1/c$a;", "state", "Lk10/l;", "Lbw1/c;", "<anonymous>", "(Lbw1/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<bw1.a.SetLoadError, c0<bw1.c.a>, tq.e<? super k10.l<? extends bw1.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f21850e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f21851f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f21852g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final bw1.c.Error O(n nVar, bw1.a.SetLoadError setLoadError, bw1.c.a aVar) {
            return new bw1.c.Error(nVar.t9(setLoadError.getError()));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final bw1.a.SetLoadError setLoadError = (bw1.a.SetLoadError) this.f21851f;
            c0 c0Var = (c0) this.f21852g;
            uq.b.e();
            if (this.f21850e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            final n nVar = n.this;
            return c0Var.d(new er.l() { // from class: bw1.p
                @Override // er.l
                public final Object b(Object obj2) {
                    return n.e.O(nVar, setLoadError, (c.a) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(bw1.a.SetLoadError setLoadError, c0<bw1.c.a> c0Var, tq.e<? super k10.l<? extends bw1.c>> eVar) {
            e eVar2 = n.this.new e(eVar);
            eVar2.f21851f = setLoadError;
            eVar2.f21852g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    public n(yy.a aVar, cw1.a aVar2, hb4.d dVar, ib4.c cVar, ov1.a aVar3, ac4.n nVar, i70.e eVar, mx.c cVar2, SetupData setupData) {
        this.mapper = aVar2;
        this.errorVMSFactory = dVar;
        this.genericDomainErrorMapper = cVar;
        this.downloadDiplomaDocumentUC = aVar3;
        this.openUriIntentUseCase = nVar;
        this.globalSnackBarManager = eVar;
        this.labelProvider = cVar2;
        this.setupData = setupData;
        bw1.c.a aVar4 = bw1.c.a.f21796a;
        this.initialState = aVar4;
        this.stateMachine = aVar.a(aVar4, new er.l() { // from class: bw1.m
            @Override // er.l
            public final Object b(Object obj) {
                return n.x9(this.f21813a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), v9(aVar4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(n nVar, z zVar) {
        zVar.C(nVar.new d(null));
        e eVar = nVar.new e(null);
        zVar.v(q0.c(bw1.a.SetLoadError.class), k10.o.CANCEL_PREVIOUS, eVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hb4.c t9(dx.b domainError) {
        return this.errorVMSFactory.a(this.genericDomainErrorMapper.b(new ib4.c.Params(domainError, false, new er.l() { // from class: bw1.l
            @Override // er.l
            public final Object b(Object obj) {
                return n.u9(this.f21812a, (ib4.c.b) obj);
            }
        }, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(n nVar, ib4.c.b bVar) {
        if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a) || (bVar instanceof ib4.c.b.a.Primary)) {
            nVar.d9(bw1.a.b.f21791a);
        } else {
            nVar.d9(bw1.a.InterfaceC0575a.C0576a.f21790a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bw1.d.a v9(bw1.c state) {
        return this.mapper.b(new cw1.a.Params(state, b9(bw1.a.InterfaceC0575a.C0576a.f21790a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(final n nVar, v vVar) {
        vVar.c(q0.c(bw1.c.class), new er.l() { // from class: bw1.i
            @Override // er.l
            public final Object b(Object obj) {
                return n.y9(this.f21810a, (z) obj);
            }
        });
        vVar.c(q0.c(bw1.c.Error.class), new er.l() { // from class: bw1.j
            @Override // er.l
            public final Object b(Object obj) {
                return n.z9((z) obj);
            }
        });
        vVar.c(q0.c(bw1.c.a.class), new er.l() { // from class: bw1.k
            @Override // er.l
            public final Object b(Object obj) {
                return n.A9(this.f21811a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(n nVar, z zVar) {
        b bVar = nVar.new b(null);
        zVar.x(q0.c(bw1.a.InterfaceC0575a.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(z zVar) {
        c cVar = new c(null);
        zVar.v(q0.c(bw1.a.b.class), k10.o.CANCEL_PREVIOUS, cVar);
        return i0.f148189a;
    }

    @Override // i70.e
    public void B0() {
        this.globalSnackBarManager.B0();
    }

    @Override // zx.b
    public xw.b<bw1.a.InterfaceC0575a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<bw1.c, bw1.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<bw1.d.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: w9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }

    @Override // i70.e
    public void y(p50.a snackBarData) {
        this.globalSnackBarManager.y(snackBarData);
    }
}
