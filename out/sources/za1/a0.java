package za1;

import hb1.SignedBase64Xml;
import ld1.Base64Xml;
import ma1.CompanyRepresentativesResponse;
import ma1.RepresentativeRemovalStatementResponse;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006Bs\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001d\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020\u0002H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010)\u001a\u00020(2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b)\u0010*J\u0018\u0010.\u001a\u00020-2\u0006\u0010,\u001a\u00020+H\u0096\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020-H\u0096\u0001¢\u0006\u0004\b0\u00101R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010M\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR \u0010T\u001a\b\u0012\u0004\u0012\u00020O0N8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR&\u0010Z\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030U8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR \u0010\"\u001a\b\u0012\u0004\u0012\u00020#0[8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u001a\u0010c\u001a\b\u0012\u0004\u0012\u00020a0`8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b@\u0010b¨\u0006d"}, d2 = {"Lza1/a0;", "Ll00/g;", "Lza1/b;", "Lza1/a;", "Lza1/c;", "", "Li70/n;", "Lyy/a;", "stateMachineFactory", "Lac4/a;", "callActionWithLoaderUseCase", "Lab1/b;", "companyRepresentativesScreenMapper", "Lcb4/j;", "dialogVMSFactory", "Lhb4/d;", "errorVMSFactory", "Lib4/c;", "errorMapper", "Lla1/b;", "interactor", "La14/w;", "openUrlIntentUseCase", "Lab1/c;", "removeRepresentativeDialogMapper", "Lse1/d;", "notAdultDialogMapper", "Lmd1/a;", "signBase64XmlUC", "snackBarManagerStateHolder", "Lza1/z;", "contract", "<init>", "(Lyy/a;Lac4/a;Lab1/b;Lcb4/j;Lhb4/d;Lib4/c;Lla1/b;La14/w;Lab1/c;Lse1/d;Lmd1/a;Li70/n;Lza1/z;)V", "state", "Lza1/c$a;", "G9", "(Lza1/b;)Lza1/c$a;", "Ldx/b;", "domainError", "Ljb4/b;", "E9", "(Ldx/b;)Ljb4/b;", "Lp50/a;", "snackBarData", "Loq/i0;", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lac4/a;", "c", "Lab1/b;", "d", "Lcb4/j;", "e", "Lhb4/d;", "f", "Lib4/c;", "g", "Lla1/b;", "h", "La14/w;", "j", "Lab1/c;", "k", "Lse1/d;", "l", "Lmd1/a;", "m", "Li70/n;", "n", "Lza1/z;", "Lza1/b$d;", "p", "Lza1/b$d;", "initialState", "Lxw/b;", "Lza1/a$f;", "q", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "r", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "s", "Lmu/p0;", "getState", "()Lmu/p0;", "Lmu/g;", "Li70/p;", "()Lmu/g;", "snackBarVisibilityState", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a0 extends l00.g<za1.b, za1.a> implements za1.c, zx.d, i70.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ab1.b companyRepresentativesScreenMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final cb4.j dialogVMSFactory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ib4.c errorMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final la1.b interactor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final a14.w openUrlIntentUseCase;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final ab1.c removeRepresentativeDialogMapper;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final se1.d notAdultDialogMapper;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final md1.a signBase64XmlUC;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final SetupData contract;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final za1.b.Loading initialState;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final xw.b<za1.a.f> navAction;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final k10.t<za1.b, za1.a> stateMachine;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<za1.c.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<za1.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f233819a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a0 f233820b;

        /* JADX INFO: renamed from: za1.a0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C6299a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f233821a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a0 f233822b;

            /* JADX INFO: renamed from: za1.a0$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C6300a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f233823d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f233824e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f233825f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f233827h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f233828j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f233829k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f233830l;

                public C6300a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f233823d = obj;
                    this.f233824e |= PKIFailureInfo.systemUnavail;
                    return C6299a.this.F(null, this);
                }
            }

            public C6299a(mu.h hVar, a0 a0Var) {
                this.f233821a = hVar;
                this.f233822b = a0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C6300a c6300a;
                if (eVar instanceof C6300a) {
                    c6300a = (C6300a) eVar;
                    int i15 = c6300a.f233824e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c6300a.f233824e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c6300a = new C6300a(eVar);
                    }
                } else {
                    c6300a = new C6300a(eVar);
                }
                Object obj2 = c6300a.f233823d;
                Object objE = uq.b.e();
                int i16 = c6300a.f233824e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f233821a;
                    za1.c.a aVarG9 = this.f233822b.G9((za1.b) obj);
                    c6300a.f233825f = vq.j.a(obj);
                    c6300a.f233827h = vq.j.a(c6300a);
                    c6300a.f233828j = vq.j.a(obj);
                    c6300a.f233829k = vq.j.a(hVar);
                    c6300a.f233830l = 0;
                    c6300a.f233824e = 1;
                    if (hVar.F(aVarG9, c6300a) == objE) {
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

        public a(mu.g gVar, a0 a0Var) {
            this.f233819a = gVar;
            this.f233820b = a0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super za1.c.a> hVar, tq.e eVar) {
            Object objA = this.f233819a.a(new C6299a(hVar, this.f233820b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lza1/b$d;", "state", "Lk10/l;", "Lza1/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<k10.c0<za1.b.Loading>, tq.e<? super k10.l<? extends za1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f233831e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f233832f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lza1/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends za1.b>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f233834e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ a0 f233835f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<za1.b.Loading> f233836g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(a0 a0Var, k10.c0<za1.b.Loading> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f233835f = a0Var;
                this.f233836g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final za1.b.ErrorInitial X(a0 a0Var, dx.b bVar, k10.c0 c0Var, za1.b.Loading loading) {
                return new za1.b.ErrorInitial(a0Var.errorVMSFactory.a(a0Var.E9(bVar)), ((za1.b.Loading) c0Var.a()).getEntryId());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final za1.b.c.Screen Y(k10.c0 c0Var, CompanyRepresentativesResponse companyRepresentativesResponse, a0 a0Var, za1.b.Loading loading) {
                return new za1.b.c.Screen(((za1.b.Loading) c0Var.a()).getEntryId(), companyRepresentativesResponse.a(), a0Var.contract.getOwnerAdult());
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f233834e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    la1.b bVar = this.f233835f.interactor;
                    String entryId = this.f233836g.a().getEntryId();
                    this.f233834e = 1;
                    obj = bVar.b(entryId, this);
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
                final k10.c0<za1.b.Loading> c0Var = this.f233836g;
                final a0 a0Var = this.f233835f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar2 = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: za1.b0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return a0.b.a.X(a0Var, bVar2, c0Var, (b.Loading) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final CompanyRepresentativesResponse companyRepresentativesResponse = (CompanyRepresentativesResponse) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: za1.c0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return a0.b.a.Y(c0Var, companyRepresentativesResponse, a0Var, (b.Loading) obj2);
                    }
                });
            }

            public final tq.e<oq.i0> O(tq.e<?> eVar) {
                return new a(this.f233835f, this.f233836g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends za1.b>> eVar) {
                return ((a) O(eVar)).J(oq.i0.f148189a);
            }
        }

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f233832f;
            Object objE = uq.b.e();
            int i15 = this.f233831e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = a0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(a0.this, c0Var, null);
            this.f233832f = vq.j.a(c0Var);
            this.f233831e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<za1.b.Loading> c0Var, tq.e<? super k10.l<? extends za1.b>> eVar) {
            return ((b) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            b bVar = a0.this.new b(eVar);
            bVar.f233832f = obj;
            return bVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lza1/a$a;", "<unused var>", "Lza1/b$c$c;", "Loq/i0;", "<anonymous>", "(Lza1/a$a;Lza1/b$c$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<za1.a.C6297a, za1.b.c.Screen, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f233837e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f233837e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<za1.a.f> bVarY1 = a0.this.Y1();
                za1.a.f.C6298a c6298a = za1.a.f.C6298a.f233800a;
                this.f233837e = 1;
                if (bVarY1.F(c6298a, this) == objE) {
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
        public final Object w(za1.a.C6297a c6297a, za1.b.c.Screen screen, tq.e<? super oq.i0> eVar) {
            return a0.this.new c(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lza1/a$g;", "action", "Lza1/b$c$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lza1/a$g;Lza1/b$c$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<za1.a.OpenUrl, za1.b.c.Screen, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f233839e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f233840f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            za1.a.OpenUrl openUrl = (za1.a.OpenUrl) this.f233840f;
            Object objE = uq.b.e();
            int i15 = this.f233839e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.w wVar = a0.this.openUrlIntentUseCase;
                a14.w.Params params = new a14.w.Params(openUrl.getUrl(), false, 2, null);
                this.f233840f = vq.j.a(openUrl);
                this.f233839e = 1;
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
            a0 a0Var = a0.this;
            if (iVar instanceof dx.i.Left) {
                a0Var.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
                new dx.i.Left(oq.i0.f148189a);
            } else if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(za1.a.OpenUrl openUrl, za1.b.c.Screen screen, tq.e<? super oq.i0> eVar) {
            d dVar = a0.this.new d(eVar);
            dVar.f233840f = openUrl;
            return dVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lza1/a$b;", "action", "Lk10/c0;", "Lza1/b$c$c;", "state", "Lk10/l;", "Lza1/b;", "<anonymous>", "(Lza1/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<za1.a.CheckAgeAndShowDialog, k10.c0<za1.b.c.Screen>, tq.e<? super k10.l<? extends za1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f233842e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f233843f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f233844g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final za1.b.c.Dialog V(k10.c0 c0Var, a0 a0Var, za1.a.CheckAgeAndShowDialog checkAgeAndShowDialog, za1.b.c.Screen screen) {
            return new za1.b.c.Dialog(((za1.b.c.Screen) c0Var.a()).getEntryId(), ((za1.b.c.Screen) c0Var.a()).a(), a0Var.dialogVMSFactory.a(a0Var.removeRepresentativeDialogMapper.b(new ab1.c.Params(a0Var.b9(new za1.a.RemoveRepresentative(checkAgeAndShowDialog.getRepresentativeId())), a0Var.b9(za1.a.c.f233797a)))), ((za1.b.c.Screen) c0Var.a()).getOwnerAdult());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final za1.b.c.Dialog X(k10.c0 c0Var, a0 a0Var, za1.b.c.Screen screen) {
            return new za1.b.c.Dialog(((za1.b.c.Screen) c0Var.a()).getEntryId(), ((za1.b.c.Screen) c0Var.a()).a(), a0Var.dialogVMSFactory.a(a0Var.notAdultDialogMapper.b(new se1.d.Params(a0Var.b9(za1.a.c.f233797a)))), ((za1.b.c.Screen) c0Var.a()).getOwnerAdult());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final za1.a.CheckAgeAndShowDialog checkAgeAndShowDialog = (za1.a.CheckAgeAndShowDialog) this.f233843f;
            final k10.c0 c0Var = (k10.c0) this.f233844g;
            uq.b.e();
            if (this.f233842e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            boolean ownerAdult = ((za1.b.c.Screen) c0Var.a()).getOwnerAdult();
            if (ownerAdult) {
                final a0 a0Var = a0.this;
                return c0Var.d(new er.l() { // from class: za1.d0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return a0.e.V(c0Var, a0Var, checkAgeAndShowDialog, (b.c.Screen) obj2);
                    }
                });
            }
            if (ownerAdult) {
                throw new oq.p();
            }
            final a0 a0Var2 = a0.this;
            return c0Var.d(new er.l() { // from class: za1.e0
                @Override // er.l
                public final Object b(Object obj2) {
                    return a0.e.X(c0Var, a0Var2, (b.c.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(za1.a.CheckAgeAndShowDialog checkAgeAndShowDialog, k10.c0<za1.b.c.Screen> c0Var, tq.e<? super k10.l<? extends za1.b>> eVar) {
            e eVar2 = a0.this.new e(eVar);
            eVar2.f233843f = checkAgeAndShowDialog;
            eVar2.f233844g = c0Var;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lza1/a$c;", "<unused var>", "Lk10/c0;", "Lza1/b$c$a;", "state", "Lk10/l;", "Lza1/b;", "<anonymous>", "(Lza1/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<za1.a.c, k10.c0<za1.b.c.Dialog>, tq.e<? super k10.l<? extends za1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f233846e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f233847f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final za1.b.c.Screen O(k10.c0 c0Var, za1.b.c.Dialog dialog) {
            return new za1.b.c.Screen(((za1.b.c.Dialog) c0Var.a()).getEntryId(), ((za1.b.c.Dialog) c0Var.a()).a(), ((za1.b.c.Dialog) c0Var.a()).getOwnerAdult());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f233847f;
            uq.b.e();
            if (this.f233846e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: za1.f0
                @Override // er.l
                public final Object b(Object obj2) {
                    return a0.f.O(c0Var, (b.c.Dialog) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(za1.a.c cVar, k10.c0<za1.b.c.Dialog> c0Var, tq.e<? super k10.l<? extends za1.b>> eVar) {
            f fVar = new f(eVar);
            fVar.f233847f = c0Var;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lza1/a$h;", "action", "Lk10/c0;", "Lza1/b$c$a;", "state", "Lk10/l;", "Lza1/b;", "<anonymous>", "(Lza1/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<za1.a.RemoveRepresentative, k10.c0<za1.b.c.Dialog>, tq.e<? super k10.l<? extends za1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f233848e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f233849f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f233850g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final za1.b.c.RemovingRepresentative O(k10.c0 c0Var, za1.a.RemoveRepresentative removeRepresentative, za1.b.c.Dialog dialog) {
            return new za1.b.c.RemovingRepresentative(((za1.b.c.Dialog) c0Var.a()).getEntryId(), ((za1.b.c.Dialog) c0Var.a()).a(), removeRepresentative.getRepresentativeId(), ((za1.b.c.Dialog) c0Var.a()).getOwnerAdult());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final za1.a.RemoveRepresentative removeRepresentative = (za1.a.RemoveRepresentative) this.f233849f;
            final k10.c0 c0Var = (k10.c0) this.f233850g;
            uq.b.e();
            if (this.f233848e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: za1.g0
                @Override // er.l
                public final Object b(Object obj2) {
                    return a0.g.O(c0Var, removeRepresentative, (b.c.Dialog) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(za1.a.RemoveRepresentative removeRepresentative, k10.c0<za1.b.c.Dialog> c0Var, tq.e<? super k10.l<? extends za1.b>> eVar) {
            g gVar = new g(eVar);
            gVar.f233849f = removeRepresentative;
            gVar.f233850g = c0Var;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lza1/b$c$b;", "state", "Lk10/l;", "Lza1/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.p<k10.c0<za1.b.c.RemovingRepresentative>, tq.e<? super k10.l<? extends za1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f233851e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f233852f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lza1/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends za1.b>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f233854e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ a0 f233855f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<za1.b.c.RemovingRepresentative> f233856g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(a0 a0Var, k10.c0<za1.b.c.RemovingRepresentative> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f233855f = a0Var;
                this.f233856g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final za1.b.ErrorRemovingRepresentative V(a0 a0Var, dx.b bVar, k10.c0 c0Var, za1.b.c.RemovingRepresentative removingRepresentative) {
                return new za1.b.ErrorRemovingRepresentative(((za1.b.c.RemovingRepresentative) c0Var.a()).getOwnerAdult(), a0Var.errorVMSFactory.a(a0Var.E9(bVar)), ((za1.b.c.RemovingRepresentative) c0Var.a()).getEntryId(), ((za1.b.c.RemovingRepresentative) c0Var.a()).a(), ((za1.b.c.RemovingRepresentative) c0Var.a()).getRepresentativeId());
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f233854e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    la1.b bVar = this.f233855f.interactor;
                    String entryId = this.f233856g.a().getEntryId();
                    String representativeId = this.f233856g.a().getRepresentativeId();
                    this.f233854e = 1;
                    obj = bVar.a(entryId, representativeId, this);
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
                final k10.c0<za1.b.c.RemovingRepresentative> c0Var = this.f233856g;
                final a0 a0Var = this.f233855f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar2 = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: za1.h0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return a0.h.a.V(a0Var, bVar2, c0Var, (b.c.RemovingRepresentative) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                a0Var.d9(new za1.a.ModifyRepresentative(((RepresentativeRemovalStatementResponse) ((dx.i.Right) iVar).b()).getStatementXml()));
                return c0Var.c();
            }

            public final tq.e<oq.i0> N(tq.e<?> eVar) {
                return new a(this.f233855f, this.f233856g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends za1.b>> eVar) {
                return ((a) N(eVar)).J(oq.i0.f148189a);
            }
        }

        h(tq.e<? super h> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f233852f;
            Object objE = uq.b.e();
            int i15 = this.f233851e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = a0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(a0.this, c0Var, null);
            this.f233852f = vq.j.a(c0Var);
            this.f233851e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<za1.b.c.RemovingRepresentative> c0Var, tq.e<? super k10.l<? extends za1.b>> eVar) {
            return ((h) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            h hVar = a0.this.new h(eVar);
            hVar.f233852f = obj;
            return hVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lza1/a$e;", "action", "Lk10/c0;", "Lza1/b$c$b;", "state", "Lk10/l;", "Lza1/b;", "<anonymous>", "(Lza1/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<za1.a.ModifyRepresentative, k10.c0<za1.b.c.RemovingRepresentative>, tq.e<? super k10.l<? extends za1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f233857e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f233858f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f233859g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lza1/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends za1.b>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f233861e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f233862f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f233863g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f233864h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f233865j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f233866k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f233867l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ a0 f233868m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ za1.a.ModifyRepresentative f233869n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ k10.c0<za1.b.c.RemovingRepresentative> f233870p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(a0 a0Var, za1.a.ModifyRepresentative modifyRepresentative, k10.c0<za1.b.c.RemovingRepresentative> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f233868m = a0Var;
                this.f233869n = modifyRepresentative;
                this.f233870p = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final za1.b.ErrorRemovingRepresentative Y(a0 a0Var, dx.b bVar, k10.c0 c0Var, za1.b.c.RemovingRepresentative removingRepresentative) {
                return new za1.b.ErrorRemovingRepresentative(((za1.b.c.RemovingRepresentative) c0Var.a()).getOwnerAdult(), a0Var.errorVMSFactory.a(a0Var.E9(bVar)), ((za1.b.c.RemovingRepresentative) c0Var.a()).getEntryId(), ((za1.b.c.RemovingRepresentative) c0Var.a()).a(), ((za1.b.c.RemovingRepresentative) c0Var.a()).getRepresentativeId());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final za1.b.ErrorRemovingRepresentative Z(a0 a0Var, dx.b bVar, k10.c0 c0Var, za1.b.c.RemovingRepresentative removingRepresentative) {
                return new za1.b.ErrorRemovingRepresentative(((za1.b.c.RemovingRepresentative) c0Var.a()).getOwnerAdult(), a0Var.errorVMSFactory.a(a0Var.E9(bVar)), ((za1.b.c.RemovingRepresentative) c0Var.a()).getEntryId(), ((za1.b.c.RemovingRepresentative) c0Var.a()).a(), ((za1.b.c.RemovingRepresentative) c0Var.a()).getRepresentativeId());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final za1.b.RepresentativeRemovedSuccess a0(k10.c0 c0Var, za1.b.c.RemovingRepresentative removingRepresentative) {
                return new za1.b.RepresentativeRemovedSuccess(((za1.b.c.RemovingRepresentative) c0Var.a()).getEntryId());
            }

            /* JADX WARN: Code duplicated, block: B:25:0x00b0  */
            /* JADX WARN: Code duplicated, block: B:27:0x00c2  */
            /* JADX WARN: Code duplicated, block: B:29:0x00c6  */
            /* JADX WARN: Code duplicated, block: B:31:0x00d8  */
            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                final k10.c0<za1.b.c.RemovingRepresentative> c0Var;
                final a0 a0Var;
                dx.i iVar;
                Object objE = uq.b.e();
                int i15 = this.f233867l;
                if (i15 == 0) {
                    oq.u.b(obj);
                    md1.a aVar = this.f233868m.signBase64XmlUC;
                    md1.a.Params params = new md1.a.Params(new Base64Xml(iy.c0.g(this.f233869n.getXmlRequest())));
                    this.f233867l = 1;
                    obj = aVar.d(params, this);
                    if (obj != objE) {
                    }
                    return objE;
                }
                if (i15 == 1) {
                    oq.u.b(obj);
                } else {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0Var = (k10.c0) this.f233863g;
                    a0Var = (a0) this.f233862f;
                    oq.u.b(obj);
                }
                iVar = (dx.i) obj;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: za1.j0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return a0.i.a.Z(a0Var, bVar, c0Var, (b.c.RemovingRepresentative) obj2);
                        }
                    });
                }
                if (iVar instanceof dx.i.Right) {
                    throw new oq.p();
                }
                return c0Var.d(new er.l() { // from class: za1.k0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return a0.i.a.a0(c0Var, (b.c.RemovingRepresentative) obj2);
                    }
                });
                dx.i iVar2 = (dx.i) obj;
                final k10.c0<za1.b.c.RemovingRepresentative> c0Var2 = this.f233870p;
                final a0 a0Var2 = this.f233868m;
                if (iVar2 instanceof dx.i.Left) {
                    final dx.b bVar2 = (dx.b) ((dx.i.Left) iVar2).b();
                    return c0Var2.d(new er.l() { // from class: za1.i0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return a0.i.a.Y(a0Var2, bVar2, c0Var2, (b.c.RemovingRepresentative) obj2);
                        }
                    });
                }
                if (!(iVar2 instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                SignedBase64Xml signedBase64Xml = (SignedBase64Xml) ((dx.i.Right) iVar2).b();
                la1.b bVar3 = a0Var2.interactor;
                String strE = iy.c0.e(signedBase64Xml.getValue());
                this.f233861e = vq.j.a(iVar2);
                this.f233862f = a0Var2;
                this.f233863g = c0Var2;
                this.f233864h = vq.j.a(signedBase64Xml);
                this.f233865j = 0;
                this.f233866k = 0;
                this.f233867l = 2;
                obj = bVar3.c(strE, this);
                if (obj != objE) {
                    c0Var = c0Var2;
                    a0Var = a0Var2;
                    iVar = (dx.i) obj;
                    if (iVar instanceof dx.i.Left) {
                        final dx.b bVar4 = (dx.b) ((dx.i.Left) iVar).b();
                        return c0Var.d(new er.l() { // from class: za1.j0
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return a0.i.a.Z(a0Var, bVar4, c0Var, (b.c.RemovingRepresentative) obj2);
                            }
                        });
                    }
                    if (iVar instanceof dx.i.Right) {
                        throw new oq.p();
                    }
                    return c0Var.d(new er.l() { // from class: za1.k0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return a0.i.a.a0(c0Var, (b.c.RemovingRepresentative) obj2);
                        }
                    });
                }
                return objE;
            }

            public final tq.e<oq.i0> V(tq.e<?> eVar) {
                return new a(this.f233868m, this.f233869n, this.f233870p, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends za1.b>> eVar) {
                return ((a) V(eVar)).J(oq.i0.f148189a);
            }
        }

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            za1.a.ModifyRepresentative modifyRepresentative = (za1.a.ModifyRepresentative) this.f233858f;
            k10.c0 c0Var = (k10.c0) this.f233859g;
            Object objE = uq.b.e();
            int i15 = this.f233857e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = a0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(a0.this, modifyRepresentative, c0Var, null);
            this.f233858f = vq.j.a(modifyRepresentative);
            this.f233859g = vq.j.a(c0Var);
            this.f233857e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(za1.a.ModifyRepresentative modifyRepresentative, k10.c0<za1.b.c.RemovingRepresentative> c0Var, tq.e<? super k10.l<? extends za1.b>> eVar) {
            i iVar = a0.this.new i(eVar);
            iVar.f233858f = modifyRepresentative;
            iVar.f233859g = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lza1/a$a;", "action", "Lk10/c0;", "Lza1/b$e;", "state", "Lk10/l;", "Lza1/b;", "<anonymous>", "(Lza1/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<za1.a.C6297a, k10.c0<za1.b.RepresentativeRemovedSuccess>, tq.e<? super k10.l<? extends za1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f233871e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f233872f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final za1.b.Loading O(k10.c0 c0Var, za1.b.RepresentativeRemovedSuccess representativeRemovedSuccess) {
            return new za1.b.Loading(((za1.b.RepresentativeRemovedSuccess) c0Var.a()).getEntryId());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f233872f;
            uq.b.e();
            if (this.f233871e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: za1.l0
                @Override // er.l
                public final Object b(Object obj2) {
                    return a0.j.O(c0Var, (b.RepresentativeRemovedSuccess) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(za1.a.C6297a c6297a, k10.c0<za1.b.RepresentativeRemovedSuccess> c0Var, tq.e<? super k10.l<? extends za1.b>> eVar) {
            j jVar = new j(eVar);
            jVar.f233872f = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lza1/a$a;", "action", "Lza1/b$a;", "state", "Loq/i0;", "<anonymous>", "(Lza1/a$a;Lza1/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<za1.a.C6297a, za1.b.ErrorInitial, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f233873e;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f233873e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<za1.a.f> bVarY1 = a0.this.Y1();
                za1.a.f.C6298a c6298a = za1.a.f.C6298a.f233800a;
                this.f233873e = 1;
                if (bVarY1.F(c6298a, this) == objE) {
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
        public final Object w(za1.a.C6297a c6297a, za1.b.ErrorInitial errorInitial, tq.e<? super oq.i0> eVar) {
            return a0.this.new k(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lza1/a$d;", "<unused var>", "Lk10/c0;", "Lza1/b$a;", "state", "Lk10/l;", "Lza1/b;", "<anonymous>", "(Lza1/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<za1.a.d, k10.c0<za1.b.ErrorInitial>, tq.e<? super k10.l<? extends za1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f233875e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f233876f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final za1.b.Loading O(k10.c0 c0Var, za1.b.ErrorInitial errorInitial) {
            return new za1.b.Loading(((za1.b.ErrorInitial) c0Var.a()).getEntryId());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f233876f;
            uq.b.e();
            if (this.f233875e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: za1.m0
                @Override // er.l
                public final Object b(Object obj2) {
                    return a0.l.O(c0Var, (b.ErrorInitial) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(za1.a.d dVar, k10.c0<za1.b.ErrorInitial> c0Var, tq.e<? super k10.l<? extends za1.b>> eVar) {
            l lVar = new l(eVar);
            lVar.f233876f = c0Var;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lza1/a$a;", "<unused var>", "Lk10/c0;", "Lza1/b$b;", "state", "Lk10/l;", "Lza1/b;", "<anonymous>", "(Lza1/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<za1.a.C6297a, k10.c0<za1.b.ErrorRemovingRepresentative>, tq.e<? super k10.l<? extends za1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f233877e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f233878f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final za1.b.c.Screen O(k10.c0 c0Var, za1.b.ErrorRemovingRepresentative errorRemovingRepresentative) {
            return new za1.b.c.Screen(((za1.b.ErrorRemovingRepresentative) c0Var.a()).getEntryId(), ((za1.b.ErrorRemovingRepresentative) c0Var.a()).e(), ((za1.b.ErrorRemovingRepresentative) c0Var.a()).getOwnerAdult());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f233878f;
            uq.b.e();
            if (this.f233877e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: za1.n0
                @Override // er.l
                public final Object b(Object obj2) {
                    return a0.m.O(c0Var, (b.ErrorRemovingRepresentative) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(za1.a.C6297a c6297a, k10.c0<za1.b.ErrorRemovingRepresentative> c0Var, tq.e<? super k10.l<? extends za1.b>> eVar) {
            m mVar = new m(eVar);
            mVar.f233878f = c0Var;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lza1/a$d;", "<unused var>", "Lk10/c0;", "Lza1/b$b;", "state", "Lk10/l;", "Lza1/b;", "<anonymous>", "(Lza1/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<za1.a.d, k10.c0<za1.b.ErrorRemovingRepresentative>, tq.e<? super k10.l<? extends za1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f233879e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f233880f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final za1.b.c.RemovingRepresentative O(k10.c0 c0Var, za1.b.ErrorRemovingRepresentative errorRemovingRepresentative) {
            return new za1.b.c.RemovingRepresentative(((za1.b.ErrorRemovingRepresentative) c0Var.a()).getEntryId(), ((za1.b.ErrorRemovingRepresentative) c0Var.a()).e(), ((za1.b.ErrorRemovingRepresentative) c0Var.a()).getRepresentativeId(), ((za1.b.ErrorRemovingRepresentative) c0Var.a()).getOwnerAdult());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f233880f;
            uq.b.e();
            if (this.f233879e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: za1.o0
                @Override // er.l
                public final Object b(Object obj2) {
                    return a0.n.O(c0Var, (b.ErrorRemovingRepresentative) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(za1.a.d dVar, k10.c0<za1.b.ErrorRemovingRepresentative> c0Var, tq.e<? super k10.l<? extends za1.b>> eVar) {
            n nVar = new n(eVar);
            nVar.f233880f = c0Var;
            return nVar.J(oq.i0.f148189a);
        }
    }

    public a0(yy.a aVar, ac4.a aVar2, ab1.b bVar, cb4.j jVar, hb4.d dVar, ib4.c cVar, la1.b bVar2, a14.w wVar, ab1.c cVar2, se1.d dVar2, md1.a aVar3, i70.n nVar, SetupData setupData) {
        this.callActionWithLoaderUseCase = aVar2;
        this.companyRepresentativesScreenMapper = bVar;
        this.dialogVMSFactory = jVar;
        this.errorVMSFactory = dVar;
        this.errorMapper = cVar;
        this.interactor = bVar2;
        this.openUrlIntentUseCase = wVar;
        this.removeRepresentativeDialogMapper = cVar2;
        this.notAdultDialogMapper = dVar2;
        this.signBase64XmlUC = aVar3;
        this.snackBarManagerStateHolder = nVar;
        this.contract = setupData;
        za1.b.Loading loading = new za1.b.Loading(setupData.getEntryId());
        this.initialState = loading;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(loading, new er.l() { // from class: za1.p
            @Override // er.l
            public final Object b(Object obj) {
                return a0.K9(this.f233957a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), G9(loading));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b E9(dx.b domainError) {
        return this.errorMapper.b(new ib4.c.Params(domainError, false, new er.l() { // from class: za1.y
            @Override // er.l
            public final Object b(Object obj) {
                return a0.F9(this.f233967a, (ib4.c.b) obj);
            }
        }, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F9(a0 a0Var, ib4.c.b bVar) {
        if ((bVar instanceof ib4.c.b.a.Primary) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
            a0Var.d9(za1.a.d.f233798a);
        } else {
            if (!(bVar instanceof ib4.c.b.a.Close) && !(bVar instanceof ib4.c.b.a.Secondary) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                throw new oq.p();
            }
            a0Var.d9(za1.a.C6297a.f233795a);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final za1.c.a G9(za1.b state) {
        return this.companyRepresentativesScreenMapper.b(new ab1.b.Params(state, b9(za1.a.C6297a.f233795a), new er.l() { // from class: za1.o
            @Override // er.l
            public final Object b(Object obj) {
                return a0.H9(this.f233955a, (String) obj);
            }
        }, new er.l() { // from class: za1.q
            @Override // er.l
            public final Object b(Object obj) {
                return a0.I9(this.f233958a, (String) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H9(a0 a0Var, String str) {
        a0Var.d9(new za1.a.OpenUrl(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I9(a0 a0Var, String str) {
        a0Var.d9(new za1.a.CheckAgeAndShowDialog(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K9(final a0 a0Var, k10.v vVar) {
        vVar.c(fr.q0.c(za1.b.Loading.class), new er.l() { // from class: za1.r
            @Override // er.l
            public final Object b(Object obj) {
                return a0.L9(this.f233960a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(za1.b.c.Screen.class), new er.l() { // from class: za1.s
            @Override // er.l
            public final Object b(Object obj) {
                return a0.M9(this.f233962a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(za1.b.c.Dialog.class), new er.l() { // from class: za1.t
            @Override // er.l
            public final Object b(Object obj) {
                return a0.N9((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(za1.b.c.RemovingRepresentative.class), new er.l() { // from class: za1.u
            @Override // er.l
            public final Object b(Object obj) {
                return a0.O9(this.f233965a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(za1.b.RepresentativeRemovedSuccess.class), new er.l() { // from class: za1.v
            @Override // er.l
            public final Object b(Object obj) {
                return a0.P9((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(za1.b.ErrorInitial.class), new er.l() { // from class: za1.w
            @Override // er.l
            public final Object b(Object obj) {
                return a0.Q9(this.f233966a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(za1.b.ErrorRemovingRepresentative.class), new er.l() { // from class: za1.x
            @Override // er.l
            public final Object b(Object obj) {
                return a0.R9((k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L9(a0 a0Var, k10.z zVar) {
        zVar.A(a0Var.new b(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M9(a0 a0Var, k10.z zVar) {
        c cVar = a0Var.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(za1.a.C6297a.class), oVar, cVar);
        zVar.x(fr.q0.c(za1.a.OpenUrl.class), oVar, a0Var.new d(null));
        zVar.v(fr.q0.c(za1.a.CheckAgeAndShowDialog.class), oVar, a0Var.new e(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N9(k10.z zVar) {
        f fVar = new f(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(za1.a.c.class), oVar, fVar);
        zVar.v(fr.q0.c(za1.a.RemoveRepresentative.class), oVar, new g(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O9(a0 a0Var, k10.z zVar) {
        zVar.A(a0Var.new h(null));
        i iVar = a0Var.new i(null);
        zVar.v(fr.q0.c(za1.a.ModifyRepresentative.class), k10.o.CANCEL_PREVIOUS, iVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P9(k10.z zVar) {
        j jVar = new j(null);
        zVar.v(fr.q0.c(za1.a.C6297a.class), k10.o.CANCEL_PREVIOUS, jVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q9(a0 a0Var, k10.z zVar) {
        k kVar = a0Var.new k(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(za1.a.C6297a.class), oVar, kVar);
        zVar.v(fr.q0.c(za1.a.d.class), oVar, new l(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R9(k10.z zVar) {
        m mVar = new m(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(za1.a.C6297a.class), oVar, mVar);
        zVar.v(fr.q0.c(za1.a.d.class), oVar, new n(null));
        return oq.i0.f148189a;
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: J9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }

    @Override // zx.b
    public xw.b<za1.a.f> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<za1.b, za1.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<za1.c.a> getState() {
        return this.state;
    }

    @Override // i70.n
    public mu.g<i70.p> j() {
        return this.snackBarManagerStateHolder.j();
    }

    @Override // i70.n
    public void y(p50.a snackBarData) {
        this.snackBarManagerStateHolder.y(snackBarData);
    }
}
