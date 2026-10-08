package we1;

import af1.PkdCodeMainSelectionContractData;
import f00.j0;
import fr.q0;
import hb1.BECompanyPkdCode;
import java.util.List;
import k10.c0;
import ld1.CompanyPkdCode;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import xe1.PkdCodeContractData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006:\u0001=BS\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b\"\u0010#J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$H\u0096\u0001¢\u0006\u0004\b&\u0010'J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020(0$H\u0096\u0001¢\u0006\u0004\b)\u0010'R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001a\u0010?\u001a\u00020:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R \u0010F\u001a\b\u0012\u0004\u0012\u00020A0@8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER&\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030G8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0M8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q¨\u0006R"}, d2 = {"Lwe1/r;", "Ll00/g;", "Lwe1/i;", "Lwe1/h;", "Lwe1/j;", "", "Lnx/b;", "Lyy/a;", "stateMachineFactory", "Lib4/c;", "genericDomainErrorMapper", "Lye1/d;", "mapper", "Lye1/a;", "dialogMapper", "Lla1/a;", "interactor", "Lac4/a;", "callActionWithLoaderUseCase", "Loz/q;", "ownerViewLifecycleManager", "Lcb4/j;", "dialogVMSFactory", "Lxe1/a;", "contract", "<init>", "(Lyy/a;Lib4/c;Lye1/d;Lye1/a;Lla1/a;Lac4/a;Loz/q;Lcb4/j;Lxe1/a;)V", "state", "Lwe1/j$a;", "y9", "(Lwe1/i;)Lwe1/j$a;", "Ldx/b;", "domainError", "Ljb4/b;", "w9", "(Ldx/b;)Ljb4/b;", "Lmu/g;", "Lnx/c;", "G2", "()Lmu/g;", "Lnx/a;", "x8", "b", "Lib4/c;", "c", "Lye1/d;", "d", "Lye1/a;", "e", "Lla1/a;", "f", "Lac4/a;", "g", "Loz/q;", "h", "Lcb4/j;", "j", "Lxe1/a;", "Loz/j;", "k", "Loz/j;", "a", "()Loz/j;", "lifecycleConnector", "Lxw/b;", "Lwe1/h$f;", "l", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "m", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "n", "Lmu/p0;", "getState", "()Lmu/p0;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r extends l00.g<we1.i, we1.h> implements we1.j, zx.b, nx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ye1.d mapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ye1.a dialogMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final la1.a interactor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final oz.q ownerViewLifecycleManager;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final cb4.j dialogVMSFactory;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final xe1.a contract;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final oz.j lifecycleConnector;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final xw.b<we1.h.f> navAction = new xw.b<>();

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final k10.t<we1.i, we1.h> stateMachine;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final p0<we1.j.a> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lwe1/r$a;", "Lf00/j0;", "Lxe1/a;", "Lwe1/r;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends j0<xe1.a, r> {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<we1.j.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f212747a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f212748b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f212749a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ r f212750b;

            /* JADX INFO: renamed from: we1.r$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5618a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f212751d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f212752e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f212753f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f212755h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f212756j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f212757k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f212758l;

                public C5618a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f212751d = obj;
                    this.f212752e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, r rVar) {
                this.f212749a = hVar;
                this.f212750b = rVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5618a c5618a;
                if (eVar instanceof C5618a) {
                    c5618a = (C5618a) eVar;
                    int i15 = c5618a.f212752e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5618a.f212752e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5618a = new C5618a(eVar);
                    }
                } else {
                    c5618a = new C5618a(eVar);
                }
                Object obj2 = c5618a.f212751d;
                Object objE = uq.b.e();
                int i16 = c5618a.f212752e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f212749a;
                    we1.j.a aVarY9 = this.f212750b.y9((we1.i) obj);
                    c5618a.f212753f = vq.j.a(obj);
                    c5618a.f212755h = vq.j.a(c5618a);
                    c5618a.f212756j = vq.j.a(obj);
                    c5618a.f212757k = vq.j.a(hVar);
                    c5618a.f212758l = 0;
                    c5618a.f212752e = 1;
                    if (hVar.F(aVarY9, c5618a) == objE) {
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

        public b(mu.g gVar, r rVar) {
            this.f212747a = gVar;
            this.f212748b = rVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super we1.j.a> hVar, tq.e eVar) {
            Object objA = this.f212747a.a(new a(hVar, this.f212748b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lwe1/i$a;", "it", "Loq/i0;", "<anonymous>", "(Lwe1/i$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<we1.i.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f212759e;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f212759e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            r.this.d9(we1.h.c.f212700a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(we1.i.a aVar, tq.e<? super i0> eVar) {
            return ((c) v(aVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return r.this.new c(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lwe1/h$c;", "<unused var>", "Lk10/c0;", "Lwe1/i$a;", "state", "Lk10/l;", "Lwe1/i;", "<anonymous>", "(Lwe1/h$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<we1.h.c, c0<we1.i.a>, tq.e<? super k10.l<? extends we1.i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f212761e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f212762f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lwe1/i;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends we1.i>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f212764e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f212765f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f212766g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f212767h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f212768j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f212769k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ r f212770l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ c0<we1.i.a> f212771m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(r rVar, c0<we1.i.a> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f212770l = rVar;
                this.f212771m = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final we1.i.b.Displayed V(r rVar, BECompanyPkdCode bECompanyPkdCode, we1.i.a aVar) {
                List<CompanyPkdCode> listN;
                PkdCodeContractData pkdCodeContractDataJ0 = rVar.contract.j0();
                if (pkdCodeContractDataJ0 == null || (listN = pkdCodeContractDataJ0.a()) == null) {
                    listN = pq.v.n();
                }
                return new we1.i.b.Displayed(new we1.i.b.StateData(listN, bECompanyPkdCode.a(), null, rVar.contract.H(), 4, null));
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                c0<we1.i.a> c0Var;
                Object objE = uq.b.e();
                int i15 = this.f212769k;
                if (i15 == 0) {
                    oq.u.b(obj);
                    la1.a aVar = this.f212770l.interactor;
                    this.f212769k = 1;
                    obj = aVar.b(this);
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
                    c0Var = (c0) this.f212765f;
                    oq.u.b(obj);
                }
                return c0Var.c();
                dx.i iVar = (dx.i) obj;
                final r rVar = this.f212770l;
                c0<we1.i.a> c0Var2 = this.f212771m;
                if (!(iVar instanceof dx.i.Left)) {
                    if (!(iVar instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    final BECompanyPkdCode bECompanyPkdCode = (BECompanyPkdCode) ((dx.i.Right) iVar).b();
                    return c0Var2.d(new er.l() { // from class: we1.s
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return r.d.a.V(rVar, bECompanyPkdCode, (i.a) obj2);
                        }
                    });
                }
                dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                xw.b<we1.h.f> bVarY1 = rVar.Y1();
                we1.h.f.Error error = new we1.h.f.Error(rVar.w9(bVar));
                this.f212764e = vq.j.a(iVar);
                this.f212765f = c0Var2;
                this.f212766g = vq.j.a(bVar);
                this.f212767h = 0;
                this.f212768j = 0;
                this.f212769k = 2;
                if (bVarY1.F(error, this) != objE) {
                    c0Var = c0Var2;
                    return c0Var.c();
                }
                return objE;
            }

            public final tq.e<i0> N(tq.e<?> eVar) {
                return new a(this.f212770l, this.f212771m, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends we1.i>> eVar) {
                return ((a) N(eVar)).J(i0.f148189a);
            }
        }

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f212762f;
            Object objE = uq.b.e();
            int i15 = this.f212761e;
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
            this.f212762f = vq.j.a(c0Var);
            this.f212761e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(we1.h.c cVar, c0<we1.i.a> c0Var, tq.e<? super k10.l<? extends we1.i>> eVar) {
            d dVar = r.this.new d(eVar);
            dVar.f212762f = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lwe1/h$a;", "<unused var>", "Lwe1/i$a;", "Loq/i0;", "<anonymous>", "(Lwe1/h$a;Lwe1/i$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<we1.h.a, we1.i.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f212772e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f212772e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<we1.h.f> bVarY1 = r.this.Y1();
                we1.h.f.a aVar = we1.h.f.a.f212703a;
                this.f212772e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(we1.h.a aVar, we1.i.a aVar2, tq.e<? super i0> eVar) {
            return r.this.new e(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lwe1/h$h;", "<unused var>", "Lwe1/i$b;", "state", "Loq/i0;", "<anonymous>", "(Lwe1/h$h;Lwe1/i$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<we1.h.C5615h, we1.i.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f212774e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f212775f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            List<CompanyPkdCode> listA;
            CompanyPkdCode companyPkdCode;
            we1.i.b bVar = (we1.i.b) this.f212775f;
            uq.b.e();
            if (this.f212774e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            PkdCodeContractData pkdCodeContractDataJ0 = r.this.contract.j0();
            if (pkdCodeContractDataJ0 != null && (listA = pkdCodeContractDataJ0.a()) != null && (companyPkdCode = (CompanyPkdCode) pq.v.R0(listA)) != null) {
                r.this.contract.f0(new PkdCodeMainSelectionContractData(companyPkdCode));
            }
            r.this.contract.P1(new PkdCodeContractData(bVar.getStateData().e()));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(we1.h.C5615h c5615h, we1.i.b bVar, tq.e<? super i0> eVar) {
            f fVar = r.this.new f(eVar);
            fVar.f212775f = bVar;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lnx/a;", "viewLifecycle", "Lwe1/i$b$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lnx/a;Lwe1/i$b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<nx.a, we1.i.b.Displayed, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f212777e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f212778f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            nx.a aVar = (nx.a) this.f212778f;
            uq.b.e();
            if (this.f212777e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (aVar == nx.a.RESUMED) {
                r.this.d9(we1.h.e.f212702a);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(nx.a aVar, we1.i.b.Displayed displayed, tq.e<? super i0> eVar) {
            g gVar = r.this.new g(eVar);
            gVar.f212778f = aVar;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lwe1/h$e;", "<unused var>", "Lk10/c0;", "Lwe1/i$b$b;", "state", "Lk10/l;", "Lwe1/i;", "<anonymous>", "(Lwe1/h$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<we1.h.e, c0<we1.i.b.Displayed>, tq.e<? super k10.l<? extends we1.i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f212780e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f212781f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final we1.i.b.Displayed O(c0 c0Var, List list, we1.i.b.Displayed displayed) {
            return displayed.a(we1.i.b.StateData.b(((we1.i.b.Displayed) c0Var.a()).getStateData(), list, null, hz.b.C2039b.f86846c, null, 10, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final List<CompanyPkdCode> listA;
            k10.l lVarB;
            final c0 c0Var = (c0) this.f212781f;
            uq.b.e();
            if (this.f212780e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            PkdCodeContractData pkdCodeContractDataJ0 = r.this.contract.j0();
            return (pkdCodeContractDataJ0 == null || (listA = pkdCodeContractDataJ0.a()) == null || (lVarB = c0Var.b(new er.l() { // from class: we1.t
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.h.O(c0Var, listA, (i.b.Displayed) obj2);
                }
            })) == null) ? c0Var.c() : lVarB;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(we1.h.e eVar, c0<we1.i.b.Displayed> c0Var, tq.e<? super k10.l<? extends we1.i>> eVar2) {
            h hVar = r.this.new h(eVar2);
            hVar.f212781f = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lwe1/h$g;", "<unused var>", "Lk10/c0;", "Lwe1/i$b$b;", "state", "Lk10/l;", "Lwe1/i;", "<anonymous>", "(Lwe1/h$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<we1.h.g, c0<we1.i.b.Displayed>, tq.e<? super k10.l<? extends we1.i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f212783e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f212784f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final we1.i.b.Displayed O(c0 c0Var, we1.i.b.Displayed displayed) {
            return displayed.a(we1.i.b.StateData.b(((we1.i.b.Displayed) c0Var.a()).getStateData(), null, null, new hz.b.Invalid(null, 1, null), null, 11, null));
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x006b, code lost:
        
            if (r6.F(r2, r5) == r1) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
        
            if (r6.F(r2, r5) == r1) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
        
            return r1;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f212784f
                k10.c0 r0 = (k10.c0) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r5.f212783e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L1f
                if (r2 == r4) goto L1b
                if (r2 != r3) goto L13
                goto L1b
            L13:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1b:
                oq.u.b(r6)
                goto L81
            L1f:
                oq.u.b(r6)
                java.lang.Object r6 = r0.a()
                we1.i$b$b r6 = (we1.i.b.Displayed) r6
                we1.i$b$c r6 = r6.getStateData()
                java.util.List r6 = r6.e()
                boolean r6 = r6.isEmpty()
                if (r6 == 0) goto L40
                we1.u r6 = new we1.u
                r6.<init>()
                k10.l r6 = r0.b(r6)
                return r6
            L40:
                we1.r r6 = we1.r.this
                we1.h$h r2 = we1.h.C5615h.f212709a
                we1.r.o9(r6, r2)
                java.lang.Object r6 = r0.a()
                we1.i$b$b r6 = (we1.i.b.Displayed) r6
                we1.i$b$c r6 = r6.getStateData()
                java.util.List r6 = r6.e()
                int r6 = r6.size()
                if (r6 != r4) goto L6e
                we1.r r6 = we1.r.this
                xw.b r6 = r6.Y1()
                we1.h$f$c r2 = we1.h.f.c.f212705a
                r5.f212784f = r0
                r5.f212783e = r4
                java.lang.Object r6 = r6.F(r2, r5)
                if (r6 != r1) goto L81
                goto L80
            L6e:
                we1.r r6 = we1.r.this
                xw.b r6 = r6.Y1()
                we1.h$f$d r2 = we1.h.f.d.f212706a
                r5.f212784f = r0
                r5.f212783e = r3
                java.lang.Object r6 = r6.F(r2, r5)
                if (r6 != r1) goto L81
            L80:
                return r1
            L81:
                k10.l r6 = r0.c()
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: we1.r.i.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(we1.h.g gVar, c0<we1.i.b.Displayed> c0Var, tq.e<? super k10.l<? extends we1.i>> eVar) {
            i iVar = r.this.new i(eVar);
            iVar.f212784f = c0Var;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lwe1/h$i;", "action", "Lk10/c0;", "Lwe1/i$b$b;", "state", "Lk10/l;", "Lwe1/i;", "<anonymous>", "(Lwe1/h$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<we1.h.ShowDialog, c0<we1.i.b.Displayed>, tq.e<? super k10.l<? extends we1.i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f212786e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f212787f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f212788g;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final we1.i.b.Dialog O(c0 c0Var, r rVar, we1.h.ShowDialog showDialog, we1.i.b.Displayed displayed) {
            return new we1.i.b.Dialog(((we1.i.b.Displayed) c0Var.a()).getStateData(), rVar.dialogVMSFactory.a(rVar.dialogMapper.b(new ye1.a.Params(showDialog.getDialog(), rVar.b9(we1.h.a.f212698a)))));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final we1.h.ShowDialog showDialog = (we1.h.ShowDialog) this.f212787f;
            final c0 c0Var = (c0) this.f212788g;
            uq.b.e();
            if (this.f212786e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final r rVar = r.this;
            return c0Var.d(new er.l() { // from class: we1.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.j.O(c0Var, rVar, showDialog, (i.b.Displayed) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(we1.h.ShowDialog showDialog, c0<we1.i.b.Displayed> c0Var, tq.e<? super k10.l<? extends we1.i>> eVar) {
            j jVar = r.this.new j(eVar);
            jVar.f212787f = showDialog;
            jVar.f212788g = c0Var;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lwe1/h$d;", "<unused var>", "Lwe1/i$b$b;", "state", "Loq/i0;", "<anonymous>", "(Lwe1/h$d;Lwe1/i$b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<we1.h.d, we1.i.b.Displayed, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f212790e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f212791f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            we1.i.b.Displayed displayed = (we1.i.b.Displayed) this.f212791f;
            Object objE = uq.b.e();
            int i15 = this.f212790e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<we1.h.f> bVarY1 = r.this.Y1();
                we1.h.f.ToSearchScreen toSearchScreen = new we1.h.f.ToSearchScreen(displayed.getStateData().c());
                this.f212791f = vq.j.a(displayed);
                this.f212790e = 1;
                if (bVarY1.F(toSearchScreen, this) == objE) {
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
        public final Object w(we1.h.d dVar, we1.i.b.Displayed displayed, tq.e<? super i0> eVar) {
            k kVar = r.this.new k(eVar);
            kVar.f212791f = displayed;
            return kVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lwe1/h$a;", "<unused var>", "Lwe1/i$b$b;", "Loq/i0;", "<anonymous>", "(Lwe1/h$a;Lwe1/i$b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<we1.h.a, we1.i.b.Displayed, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f212793e;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f212793e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<we1.h.f> bVarY1 = r.this.Y1();
                we1.h.f.a aVar = we1.h.f.a.f212703a;
                this.f212793e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(we1.h.a aVar, we1.i.b.Displayed displayed, tq.e<? super i0> eVar) {
            return r.this.new l(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lwe1/h$a;", "<unused var>", "Lk10/c0;", "Lwe1/i$b$a;", "state", "Lk10/l;", "Lwe1/i;", "<anonymous>", "(Lwe1/h$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<we1.h.a, c0<we1.i.b.Dialog>, tq.e<? super k10.l<? extends we1.i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f212795e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f212796f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final we1.i.b.Displayed O(c0 c0Var, we1.i.b.Dialog dialog) {
            return new we1.i.b.Displayed(((we1.i.b.Dialog) c0Var.a()).getStateData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final c0 c0Var = (c0) this.f212796f;
            uq.b.e();
            if (this.f212795e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: we1.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.m.O(c0Var, (i.b.Dialog) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(we1.h.a aVar, c0<we1.i.b.Dialog> c0Var, tq.e<? super k10.l<? extends we1.i>> eVar) {
            m mVar = new m(eVar);
            mVar.f212796f = c0Var;
            return mVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lwe1/h$b;", "action", "Lk10/c0;", "Lwe1/i$b$a;", "state", "Lk10/l;", "Lwe1/i;", "<anonymous>", "(Lwe1/h$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<we1.h.DeleteUserPkdCode, c0<we1.i.b.Dialog>, tq.e<? super k10.l<? extends we1.i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f212797e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f212798f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f212799g;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final we1.i.b.Displayed O(c0 c0Var, we1.h.DeleteUserPkdCode deleteUserPkdCode, we1.i.b.Dialog dialog) {
            we1.i.b.StateData stateData = ((we1.i.b.Dialog) c0Var.a()).getStateData();
            List listI1 = pq.v.i1(((we1.i.b.Dialog) c0Var.a()).getStateData().e());
            listI1.remove(deleteUserPkdCode.getPkdCode());
            return new we1.i.b.Displayed(we1.i.b.StateData.b(stateData, listI1, null, null, null, 14, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final we1.h.DeleteUserPkdCode deleteUserPkdCode = (we1.h.DeleteUserPkdCode) this.f212798f;
            final c0 c0Var = (c0) this.f212799g;
            uq.b.e();
            if (this.f212797e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            k10.l lVarD = c0Var.d(new er.l() { // from class: we1.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.n.O(c0Var, deleteUserPkdCode, (i.b.Dialog) obj2);
                }
            });
            r rVar = r.this;
            rVar.d9(we1.h.C5615h.f212709a);
            rVar.contract.w4();
            return lVarD;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(we1.h.DeleteUserPkdCode deleteUserPkdCode, c0<we1.i.b.Dialog> c0Var, tq.e<? super k10.l<? extends we1.i>> eVar) {
            n nVar = r.this.new n(eVar);
            nVar.f212798f = deleteUserPkdCode;
            nVar.f212799g = c0Var;
            return nVar.J(i0.f148189a);
        }
    }

    public r(yy.a aVar, ib4.c cVar, ye1.d dVar, ye1.a aVar2, la1.a aVar3, ac4.a aVar4, oz.q qVar, cb4.j jVar, xe1.a aVar5) {
        this.genericDomainErrorMapper = cVar;
        this.mapper = dVar;
        this.dialogMapper = aVar2;
        this.interactor = aVar3;
        this.callActionWithLoaderUseCase = aVar4;
        this.ownerViewLifecycleManager = qVar;
        this.dialogVMSFactory = jVar;
        this.contract = aVar5;
        this.lifecycleConnector = qVar;
        we1.i.a aVar6 = we1.i.a.f212711a;
        this.stateMachine = aVar.a(aVar6, new er.l() { // from class: we1.q
            @Override // er.l
            public final Object b(Object obj) {
                return r.B9(this.f212734a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), y9(aVar6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(final r rVar, k10.v vVar) {
        vVar.c(q0.c(we1.i.a.class), new er.l() { // from class: we1.l
            @Override // er.l
            public final Object b(Object obj) {
                return r.C9(this.f212729a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(we1.i.b.class), new er.l() { // from class: we1.m
            @Override // er.l
            public final Object b(Object obj) {
                return r.D9(this.f212730a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(we1.i.b.Displayed.class), new er.l() { // from class: we1.n
            @Override // er.l
            public final Object b(Object obj) {
                return r.E9(this.f212731a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(we1.i.b.Dialog.class), new er.l() { // from class: we1.o
            @Override // er.l
            public final Object b(Object obj) {
                return r.F9(this.f212732a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(r rVar, k10.z zVar) {
        zVar.C(rVar.new c(null));
        d dVar = rVar.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(we1.h.c.class), oVar, dVar);
        zVar.x(q0.c(we1.h.a.class), oVar, rVar.new e(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(r rVar, k10.z zVar) {
        f fVar = rVar.new f(null);
        zVar.x(q0.c(we1.h.C5615h.class), k10.o.CANCEL_PREVIOUS, fVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E9(r rVar, k10.z zVar) {
        k10.k.s(zVar, rVar.x8(), null, rVar.new g(null), 2, null);
        h hVar = rVar.new h(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(we1.h.e.class), oVar, hVar);
        zVar.v(q0.c(we1.h.g.class), oVar, rVar.new i(null));
        zVar.v(q0.c(we1.h.ShowDialog.class), oVar, rVar.new j(null));
        zVar.x(q0.c(we1.h.d.class), oVar, rVar.new k(null));
        zVar.x(q0.c(we1.h.a.class), oVar, rVar.new l(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F9(r rVar, k10.z zVar) {
        m mVar = new m(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(we1.h.a.class), oVar, mVar);
        zVar.v(q0.c(we1.h.DeleteUserPkdCode.class), oVar, rVar.new n(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b w9(dx.b domainError) {
        return this.genericDomainErrorMapper.b(new ib4.c.Params(domainError, false, new er.l() { // from class: we1.p
            @Override // er.l
            public final Object b(Object obj) {
                return r.x9(this.f212733a, (ib4.c.b) obj);
            }
        }, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(r rVar, ib4.c.b bVar) {
        if (!(bVar instanceof ib4.c.b.a.Close) && !(bVar instanceof ib4.c.b.AbstractC2161b.a) && !(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
            if (!(bVar instanceof ib4.c.b.AbstractC2161b.C2162b)) {
                throw new oq.p();
            }
            rVar.d9(we1.h.c.f212700a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final we1.j.a y9(we1.i state) {
        return this.mapper.b(new ye1.d.Params(state, b9(we1.h.d.f212701a), new er.l() { // from class: we1.k
            @Override // er.l
            public final Object b(Object obj) {
                return r.z9(this.f212728a, (CompanyPkdCode) obj);
            }
        }, b9(we1.h.g.f212708a), b9(we1.h.a.f212698a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(r rVar, CompanyPkdCode companyPkdCode) {
        rVar.d9(new we1.h.ShowDialog(new ye1.b.Delete(rVar.b9(new we1.h.DeleteUserPkdCode(companyPkdCode)))));
        return i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: A9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(we1.j.a aVar) {
        super.P5(aVar);
    }

    @Override // nx.b
    public mu.g<nx.c> G2() {
        return this.ownerViewLifecycleManager.G2();
    }

    @Override // zx.b
    public xw.b<we1.h.f> Y1() {
        return this.navAction;
    }

    @Override // we1.j
    /* JADX INFO: renamed from: a, reason: from getter */
    public oz.j getLifecycleConnector() {
        return this.lifecycleConnector;
    }

    @Override // l00.g
    protected k10.t<we1.i, we1.h> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<we1.j.a> getState() {
        return this.state;
    }

    @Override // nx.b
    public mu.g<nx.a> x8() {
        return this.ownerViewLifecycleManager.x8();
    }
}
