package be4;

import cb4.DialogButtonTextData;
import cb4.DialogData;
import fr.q0;
import jl0.BEPassportAgreementDetails;
import k10.c0;
import k10.z;
import mu.p0;
import mx.Label;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B[\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R \u0010<\u001a\b\u0012\u0004\u0012\u000207068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R&\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030=8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0C8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G¨\u0006H"}, d2 = {"Lbe4/n;", "Ll00/g;", "Lbe4/c;", "Lbe4/a;", "Lbe4/d;", "", "Lac4/a;", "callActionWithLoaderUseCase", "Ltl0/a;", "getPassportAgreementDetailsUC", "Lzd4/a;", "withdrawPassportAgreementUC", "Li70/e;", "snackBarManager", "Lde4/a;", "mapper", "Lib4/c;", "genericErrorMapper", "Lhb4/d;", "errorVMSFactory", "Lmx/c;", "labelProvider", "Lbe4/b;", "setupData", "Lyy/a;", "stateMachineFactory", "<init>", "(Lac4/a;Ltl0/a;Lzd4/a;Li70/e;Lde4/a;Lib4/c;Lhb4/d;Lmx/c;Lbe4/b;Lyy/a;)V", "state", "Lbe4/d$a;", "w9", "(Lbe4/c;)Lbe4/d$a;", "b", "Lac4/a;", "c", "Ltl0/a;", "d", "Lzd4/a;", "e", "Li70/e;", "f", "Lde4/a;", "g", "Lib4/c;", "h", "Lhb4/d;", "j", "Lmx/c;", "k", "Lbe4/b;", "Lbe4/c$b;", "l", "Lbe4/c$b;", "initialState", "Lxw/b;", "Lbe4/a$b;", "m", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "n", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "p", "Lmu/p0;", "getState", "()Lmu/p0;", "passportagreementmanagement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<be4.c, be4.a> implements be4.d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final tl0.a getPassportAgreementDetailsUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final zd4.a withdrawPassportAgreementUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final i70.e snackBarManager;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final de4.a mapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericErrorMapper;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final be4.c.b initialState;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final xw.b<be4.a.b> navAction;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final k10.t<be4.c, be4.a> stateMachine;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final p0<be4.d.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<be4.d.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f19048a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f19049b;

        /* JADX INFO: renamed from: be4.n$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0480a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f19050a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f19051b;

            /* JADX INFO: renamed from: be4.n$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0481a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f19052d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f19053e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f19054f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f19056h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f19057j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f19058k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f19059l;

                public C0481a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f19052d = obj;
                    this.f19053e |= PKIFailureInfo.systemUnavail;
                    return C0480a.this.F(null, this);
                }
            }

            public C0480a(mu.h hVar, n nVar) {
                this.f19050a = hVar;
                this.f19051b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0481a c0481a;
                if (eVar instanceof C0481a) {
                    c0481a = (C0481a) eVar;
                    int i15 = c0481a.f19053e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0481a.f19053e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0481a = new C0481a(eVar);
                    }
                } else {
                    c0481a = new C0481a(eVar);
                }
                Object obj2 = c0481a.f19052d;
                Object objE = uq.b.e();
                int i16 = c0481a.f19053e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f19050a;
                    be4.d.a aVarW9 = this.f19051b.w9((be4.c) obj);
                    c0481a.f19054f = vq.j.a(obj);
                    c0481a.f19056h = vq.j.a(c0481a);
                    c0481a.f19057j = vq.j.a(obj);
                    c0481a.f19058k = vq.j.a(hVar);
                    c0481a.f19059l = 0;
                    c0481a.f19053e = 1;
                    if (hVar.F(aVarW9, c0481a) == objE) {
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

        public a(mu.g gVar, n nVar) {
            this.f19048a = gVar;
            this.f19049b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super be4.d.a> hVar, tq.e eVar) {
            Object objA = this.f19048a.a(new C0480a(hVar, this.f19049b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lbe4/a$a;", "<unused var>", "Lbe4/c;", "Loq/i0;", "<anonymous>", "(Lbe4/a$a;Lbe4/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<be4.a.C0475a, be4.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f19060e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f19060e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<be4.a.b> bVarY1 = n.this.Y1();
                be4.a.b.C0476a c0476a = be4.a.b.C0476a.f19002a;
                this.f19060e = 1;
                if (bVarY1.F(c0476a, this) == objE) {
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
        public final Object w(be4.a.C0475a c0475a, be4.c cVar, tq.e<? super i0> eVar) {
            return n.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lbe4/c$b;", "state", "Lk10/l;", "Lbe4/c;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<c0<be4.c.b>, tq.e<? super k10.l<? extends be4.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f19062e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f19063f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lbe4/c;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends be4.c>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f19065e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ n f19066f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ c0<be4.c.b> f19067g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(n nVar, c0<be4.c.b> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f19066f = nVar;
                this.f19067g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final be4.c.Error Y(final n nVar, dx.b bVar, be4.c.b bVar2) {
                return new be4.c.Error(nVar.errorVMSFactory.a(nVar.genericErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: be4.q
                    @Override // er.l
                    public final Object b(Object obj) {
                        return n.c.a.Z(nVar, (ib4.c.b) obj);
                    }
                }, 2, null))));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final i0 Z(n nVar, ib4.c.b bVar) {
                if (!(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
                    if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
                        nVar.d9(be4.a.c.f19005a);
                    } else {
                        if (!(bVar instanceof ib4.c.b.a.Close) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                            throw new oq.p();
                        }
                        nVar.d9(be4.a.C0475a.f19001a);
                    }
                }
                return i0.f148189a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final be4.c.Initialized a0(BEPassportAgreementDetails bEPassportAgreementDetails, be4.c.b bVar) {
                return new be4.c.Initialized(bEPassportAgreementDetails, false);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f19065e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    tl0.a aVar = this.f19066f.getPassportAgreementDetailsUC;
                    tl0.a.Params params = new tl0.a.Params(this.f19066f.setupData.getAgreementId());
                    this.f19065e = 1;
                    obj = aVar.c(params, this);
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
                c0<be4.c.b> c0Var = this.f19067g;
                final n nVar = this.f19066f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: be4.o
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return n.c.a.Y(nVar, bVar, (c.b) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final BEPassportAgreementDetails bEPassportAgreementDetails = (BEPassportAgreementDetails) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: be4.p
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return n.c.a.a0(bEPassportAgreementDetails, (c.b) obj2);
                    }
                });
            }

            public final tq.e<i0> V(tq.e<?> eVar) {
                return new a(this.f19066f, this.f19067g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends be4.c>> eVar) {
                return ((a) V(eVar)).J(i0.f148189a);
            }
        }

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f19063f;
            Object objE = uq.b.e();
            int i15 = this.f19062e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = n.this.callActionWithLoaderUseCase;
            a aVar2 = new a(n.this, c0Var, null);
            this.f19063f = vq.j.a(c0Var);
            this.f19062e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<be4.c.b> c0Var, tq.e<? super k10.l<? extends be4.c>> eVar) {
            return ((c) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = n.this.new c(eVar);
            cVar.f19063f = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lbe4/a$d;", "<unused var>", "Lbe4/c$c;", "state", "Loq/i0;", "<anonymous>", "(Lbe4/a$d;Lbe4/c$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<be4.a.d, be4.c.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f19068e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 V(n nVar) {
            nVar.d9(be4.a.e.f19007a);
            return i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 X() {
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f19068e;
            if (i15 == 0) {
                oq.u.b(obj);
                n nVar = n.this;
                cb4.h.b bVar = cb4.h.b.f24985a;
                Label labelC = n.this.labelProvider.c(oq2.a.f148240i0);
                Label labelC2 = n.this.labelProvider.c(oq2.a.f148238h0);
                Label labelC3 = n.this.labelProvider.c(oq2.a.f148242j0);
                cb4.a.C0668a c0668a = cb4.a.C0668a.f24967a;
                final n nVar2 = n.this;
                be4.a.b.ShowDialog showDialog = new be4.a.b.ShowDialog(new DialogData(bVar, labelC, labelC2, new DialogButtonTextData(labelC3, c0668a, new er.a() { // from class: be4.r
                    @Override // er.a
                    public final Object a() {
                        return n.d.V(nVar2);
                    }
                }), new DialogButtonTextData(n.this.labelProvider.c(oq2.a.f148237h), null, new er.a() { // from class: be4.s
                    @Override // er.a
                    public final Object a() {
                        return n.d.X();
                    }
                }, 2, null), null, null, 96, null));
                this.f19068e = 1;
                if (nVar.F(showDialog, this) == objE) {
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
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(be4.a.d dVar, be4.c.Initialized initialized, tq.e<? super i0> eVar) {
            return n.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lbe4/a$e;", "<unused var>", "Lbe4/c$c;", "state", "Loq/i0;", "<anonymous>", "(Lbe4/a$e;Lbe4/c$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<be4.a.e, be4.c.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f19070e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f19071f;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f19073e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f19074f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f19075g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f19076h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f19077j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ n f19078k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ be4.c.Initialized f19079l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(n nVar, be4.c.Initialized initialized, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f19078k = nVar;
                this.f19079l = initialized;
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x00b7, code lost:
            
                if (r1.F(r4, r12) == r0) goto L20;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r13) throws java.lang.Throwable {
                /*
                    r12 = this;
                    java.lang.Object r0 = uq.b.e()
                    int r1 = r12.f19077j
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L27
                    if (r1 == r3) goto L23
                    if (r1 != r2) goto L1b
                    java.lang.Object r0 = r12.f19074f
                    oq.i0 r0 = (oq.i0) r0
                    java.lang.Object r0 = r12.f19073e
                    dx.i r0 = (dx.i) r0
                    oq.u.b(r13)
                    goto Lba
                L1b:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r0)
                    throw r13
                L23:
                    oq.u.b(r13)
                    goto L48
                L27:
                    oq.u.b(r13)
                    be4.n r13 = r12.f19078k
                    zd4.a r13 = be4.n.t9(r13)
                    zd4.a$a r1 = new zd4.a$a
                    be4.c$c r4 = r12.f19079l
                    jl0.c r4 = r4.getPassportAgreementDetails()
                    java.lang.String r4 = r4.getMobywatelAgreementId()
                    r1.<init>(r4)
                    r12.f19077j = r3
                    java.lang.Object r13 = r13.e(r1, r12)
                    if (r13 != r0) goto L48
                    goto Lb9
                L48:
                    dx.i r13 = (dx.i) r13
                    be4.n r1 = r12.f19078k
                    boolean r3 = r13 instanceof dx.i.Left
                    if (r3 == 0) goto L75
                    dx.i$b r13 = (dx.i.Left) r13
                    java.lang.Object r13 = r13.b()
                    dx.b r13 = (dx.b) r13
                    i70.e r13 = be4.n.s9(r1)
                    p50.a$b r2 = new p50.a$b
                    mx.c r0 = be4.n.q9(r1)
                    int r1 = oq2.a.f148244k0
                    mx.a r3 = r0.c(r1)
                    r7 = 14
                    r8 = 0
                    r4 = 0
                    r5 = 0
                    r6 = 0
                    r2.<init>(r3, r4, r5, r6, r7, r8)
                    r13.y(r2)
                    goto Lba
                L75:
                    boolean r3 = r13 instanceof dx.i.Right
                    if (r3 == 0) goto Lbd
                    r3 = r13
                    dx.i$c r3 = (dx.i.Right) r3
                    java.lang.Object r3 = r3.b()
                    oq.i0 r3 = (oq.i0) r3
                    i70.e r4 = be4.n.s9(r1)
                    p50.a$b r5 = new p50.a$b
                    mx.c r6 = be4.n.q9(r1)
                    int r7 = oq2.a.f148246l0
                    mx.a r6 = r6.c(r7)
                    r10 = 14
                    r11 = 0
                    r7 = 0
                    r8 = 0
                    r9 = 0
                    r5.<init>(r6, r7, r8, r9, r10, r11)
                    r4.y(r5)
                    be4.a$b$b r4 = be4.a.b.C0477b.f19003a
                    java.lang.Object r13 = vq.j.a(r13)
                    r12.f19073e = r13
                    java.lang.Object r13 = vq.j.a(r3)
                    r12.f19074f = r13
                    r13 = 0
                    r12.f19075g = r13
                    r12.f19076h = r13
                    r12.f19077j = r2
                    java.lang.Object r13 = r1.F(r4, r12)
                    if (r13 != r0) goto Lba
                Lb9:
                    return r0
                Lba:
                    oq.i0 r13 = oq.i0.f148189a
                    return r13
                Lbd:
                    oq.p r13 = new oq.p
                    r13.<init>()
                    throw r13
                */
                throw new UnsupportedOperationException("Method not decompiled: be4.n.e.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f19078k, this.f19079l, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super i0> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            be4.c.Initialized initialized = (be4.c.Initialized) this.f19071f;
            Object objE = uq.b.e();
            int i15 = this.f19070e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.a aVar = n.this.callActionWithLoaderUseCase;
                a aVar2 = new a(n.this, initialized, null);
                this.f19071f = vq.j.a(initialized);
                this.f19070e = 1;
                if (ac4.a.a(aVar, null, aVar2, this, 1, null) == objE) {
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
        public final Object w(be4.a.e eVar, be4.c.Initialized initialized, tq.e<? super i0> eVar2) {
            e eVar3 = n.this.new e(eVar2);
            eVar3.f19071f = initialized;
            return eVar3.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lbe4/a$c;", "<unused var>", "Lk10/c0;", "Lbe4/c$a;", "state", "Lk10/l;", "Lbe4/c;", "<anonymous>", "(Lbe4/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<be4.a.c, c0<be4.c.Error>, tq.e<? super k10.l<? extends be4.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f19080e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f19081f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final be4.c.b O(be4.c.Error error) {
            return be4.c.b.f19010a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f19081f;
            uq.b.e();
            if (this.f19080e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: be4.t
                @Override // er.l
                public final Object b(Object obj2) {
                    return n.f.O((c.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(be4.a.c cVar, c0<be4.c.Error> c0Var, tq.e<? super k10.l<? extends be4.c>> eVar) {
            f fVar = new f(eVar);
            fVar.f19081f = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    public n(ac4.a aVar, tl0.a aVar2, zd4.a aVar3, i70.e eVar, de4.a aVar4, ib4.c cVar, hb4.d dVar, mx.c cVar2, SetupData setupData, yy.a aVar5) {
        this.callActionWithLoaderUseCase = aVar;
        this.getPassportAgreementDetailsUC = aVar2;
        this.withdrawPassportAgreementUC = aVar3;
        this.snackBarManager = eVar;
        this.mapper = aVar4;
        this.genericErrorMapper = cVar;
        this.errorVMSFactory = dVar;
        this.labelProvider = cVar2;
        this.setupData = setupData;
        be4.c.b bVar = be4.c.b.f19010a;
        this.initialState = bVar;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar5.a(bVar, new er.l() { // from class: be4.m
            @Override // er.l
            public final Object b(Object obj) {
                return n.y9(this.f19034a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), w9(bVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(n nVar, z zVar) {
        zVar.A(nVar.new c(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(n nVar, z zVar) {
        d dVar = nVar.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(be4.a.d.class), oVar, dVar);
        zVar.x(q0.c(be4.a.e.class), oVar, nVar.new e(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(z zVar) {
        f fVar = new f(null);
        zVar.v(q0.c(be4.a.c.class), k10.o.CANCEL_PREVIOUS, fVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final be4.d.a w9(be4.c state) {
        return this.mapper.b(new de4.a.Params(state, b9(be4.a.d.f19006a), b9(be4.a.C0475a.f19001a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(final n nVar, k10.v vVar) {
        vVar.c(q0.c(be4.c.class), new er.l() { // from class: be4.i
            @Override // er.l
            public final Object b(Object obj) {
                return n.z9(this.f19031a, (z) obj);
            }
        });
        vVar.c(q0.c(be4.c.b.class), new er.l() { // from class: be4.j
            @Override // er.l
            public final Object b(Object obj) {
                return n.A9(this.f19032a, (z) obj);
            }
        });
        vVar.c(q0.c(be4.c.Initialized.class), new er.l() { // from class: be4.k
            @Override // er.l
            public final Object b(Object obj) {
                return n.B9(this.f19033a, (z) obj);
            }
        });
        vVar.c(q0.c(be4.c.Error.class), new er.l() { // from class: be4.l
            @Override // er.l
            public final Object b(Object obj) {
                return n.C9((z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(n nVar, z zVar) {
        b bVar = nVar.new b(null);
        zVar.x(q0.c(be4.a.C0475a.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<be4.a.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<be4.c, be4.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<be4.d.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: v9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(be4.a.b bVar, tq.e<? super i0> eVar) {
        return super.F(bVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: x9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }
}
