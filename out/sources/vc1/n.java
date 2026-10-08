package vc1;

import f00.j0;
import fr.q0;
import k10.c0;
import k10.t;
import k10.v;
import k10.z;
import ld1.CompanyApplicationCitizenData;
import ld1.KnownUserDataModel;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001IBK\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b#\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R \u0010=\u001a\b\u0012\u0004\u0012\u000208078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R&\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030>8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190D8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H¨\u0006J"}, d2 = {"Lvc1/n;", "Ll00/g;", "Lvc1/b;", "Lvc1/a;", "Lvc1/c;", "", "Lyy/a;", "stateMachineFactory", "Lgb1/b;", "interactor", "Lxc1/a;", "mapper", "Lib4/c;", "genericDomainErrorMapper", "Lpx/d;", "remoteLogger", "Lgb1/a;", "companyApplicationContainersInteractor", "Lac4/a;", "callActionWithLoaderUseCase", "Lwc1/a;", "contract", "<init>", "(Lyy/a;Lgb1/b;Lxc1/a;Lib4/c;Lpx/d;Lgb1/a;Lac4/a;Lwc1/a;)V", "state", "Lvc1/c$a;", "A9", "(Lvc1/b;)Lvc1/c$a;", "Ldx/b;", "error", "actionRetry", "Loq/i0;", "y9", "(Ldx/b;Lvc1/a;Ltq/e;)Ljava/lang/Object;", "Ljb4/b;", "w9", "(Ldx/b;)Ljb4/b;", "b", "Lgb1/b;", "c", "Lxc1/a;", "d", "Lib4/c;", "e", "Lpx/d;", "f", "Lgb1/a;", "g", "Lac4/a;", "h", "Lwc1/a;", "Lvc1/b$b;", "j", "Lvc1/b$b;", "initialState", "Lxw/b;", "Lvc1/a$c;", "k", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "l", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "m", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<vc1.b, vc1.a> implements vc1.c, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final gb1.b interactor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final xc1.a mapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final gb1.a companyApplicationContainersInteractor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final wc1.a contract;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final vc1.b.C5383b initialState;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final xw.b<vc1.a.c> navAction;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final t<vc1.b, vc1.a> stateMachine;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final p0<vc1.c.a> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lvc1/n$a;", "Lf00/j0;", "Lwc1/a;", "Lvc1/n;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends j0<wc1.a, n> {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<vc1.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f206070a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f206071b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f206072a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f206073b;

            /* JADX INFO: renamed from: vc1.n$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5385a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f206074d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f206075e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f206076f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f206078h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f206079j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f206080k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f206081l;

                public C5385a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f206074d = obj;
                    this.f206075e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, n nVar) {
                this.f206072a = hVar;
                this.f206073b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5385a c5385a;
                if (eVar instanceof C5385a) {
                    c5385a = (C5385a) eVar;
                    int i15 = c5385a.f206075e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5385a.f206075e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5385a = new C5385a(eVar);
                    }
                } else {
                    c5385a = new C5385a(eVar);
                }
                Object obj2 = c5385a.f206074d;
                Object objE = uq.b.e();
                int i16 = c5385a.f206075e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f206072a;
                    vc1.c.a aVarA9 = this.f206073b.A9((vc1.b) obj);
                    c5385a.f206076f = vq.j.a(obj);
                    c5385a.f206078h = vq.j.a(c5385a);
                    c5385a.f206079j = vq.j.a(obj);
                    c5385a.f206080k = vq.j.a(hVar);
                    c5385a.f206081l = 0;
                    c5385a.f206075e = 1;
                    if (hVar.F(aVarA9, c5385a) == objE) {
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
            this.f206070a = gVar;
            this.f206071b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super vc1.c.a> hVar, tq.e eVar) {
            Object objA = this.f206070a.a(new a(hVar, this.f206071b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lvc1/a$a;", "<unused var>", "Lvc1/b;", "Loq/i0;", "<anonymous>", "(Lvc1/a$a;Lvc1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<vc1.a.C5380a, vc1.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f206082e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f206082e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<vc1.a.c> bVarY1 = n.this.Y1();
                vc1.a.c.C5381a c5381a = vc1.a.c.C5381a.f206031a;
                this.f206082e = 1;
                if (bVarY1.F(c5381a, this) == objE) {
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
        public final Object w(vc1.a.C5380a c5380a, vc1.b bVar, tq.e<? super i0> eVar) {
            return n.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvc1/b$b;", "it", "Loq/i0;", "<anonymous>", "(Lvc1/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<vc1.b.C5383b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f206084e;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f206084e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            n.this.d9(vc1.a.b.f206030a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(vc1.b.C5383b c5383b, tq.e<? super i0> eVar) {
            return ((d) v(c5383b, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return n.this.new d(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lvc1/a$b;", "action", "Lk10/c0;", "Lvc1/b$b;", "state", "Lk10/l;", "Lvc1/b;", "<anonymous>", "(Lvc1/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<vc1.a.b, c0<vc1.b.C5383b>, tq.e<? super k10.l<? extends vc1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f206086e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f206087f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f206088g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f206089h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f206090j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f206091k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f206092l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ z<vc1.b.C5383b, vc1.b, vc1.a> f206094n;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lvc1/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends vc1.b>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f206095e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f206096f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f206097g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f206098h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f206099j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f206100k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ n f206101l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ vc1.a.b f206102m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ c0<vc1.b.C5383b> f206103n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ String f206104p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(n nVar, vc1.a.b bVar, c0<vc1.b.C5383b> c0Var, String str, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f206101l = nVar;
                this.f206102m = bVar;
                this.f206103n = c0Var;
                this.f206104p = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final vc1.b.DataDisplayed V(CompanyApplicationCitizenData companyApplicationCitizenData, String str, vc1.b.C5383b c5383b) {
                return new vc1.b.DataDisplayed(new KnownUserDataModel(companyApplicationCitizenData, str));
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                c0<vc1.b.C5383b> c0Var;
                Object objE = uq.b.e();
                int i15 = this.f206100k;
                if (i15 == 0) {
                    u.b(obj);
                    gb1.b bVar = this.f206101l.interactor;
                    this.f206100k = 1;
                    obj = bVar.a(this);
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
                    c0Var = (c0) this.f206096f;
                    u.b(obj);
                }
                return c0Var.c();
                dx.i iVar = (dx.i) obj;
                n nVar = this.f206101l;
                vc1.a.b bVar2 = this.f206102m;
                c0<vc1.b.C5383b> c0Var2 = this.f206103n;
                final String str = this.f206104p;
                if (!(iVar instanceof dx.i.Left)) {
                    if (!(iVar instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    final CompanyApplicationCitizenData companyApplicationCitizenData = (CompanyApplicationCitizenData) ((dx.i.Right) iVar).b();
                    return c0Var2.d(new er.l() { // from class: vc1.o
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return n.e.a.V(companyApplicationCitizenData, str, (b.C5383b) obj2);
                        }
                    });
                }
                dx.b bVar3 = (dx.b) ((dx.i.Left) iVar).b();
                this.f206095e = vq.j.a(iVar);
                this.f206096f = c0Var2;
                this.f206097g = vq.j.a(bVar3);
                this.f206098h = 0;
                this.f206099j = 0;
                this.f206100k = 2;
                if (nVar.y9(bVar3, bVar2, this) != objE) {
                    c0Var = c0Var2;
                    return c0Var.c();
                }
                return objE;
            }

            public final tq.e<i0> N(tq.e<?> eVar) {
                return new a(this.f206101l, this.f206102m, this.f206103n, this.f206104p, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends vc1.b>> eVar) {
                return ((a) N(eVar)).J(i0.f148189a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(z<vc1.b.C5383b, vc1.b, vc1.a> zVar, tq.e<? super e> eVar) {
            super(3, eVar);
            this.f206094n = zVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x00c1, code lost:
        
            if (r15 == r0) goto L21;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r15) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 205
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: vc1.n.e.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(vc1.a.b bVar, c0<vc1.b.C5383b> c0Var, tq.e<? super k10.l<? extends vc1.b>> eVar) {
            e eVar2 = n.this.new e(this.f206094n, eVar);
            eVar2.f206091k = bVar;
            eVar2.f206092l = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvc1/a$d;", "<unused var>", "Lvc1/b$a;", "state", "Loq/i0;", "<anonymous>", "(Lvc1/a$d;Lvc1/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<vc1.a.d, vc1.b.DataDisplayed, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f206105e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f206106f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
        
            if (r6.F(r2, r5) == r1) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0075, code lost:
        
            if (r6.F(r2, r5) == r1) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0077, code lost:
        
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
                java.lang.Object r0 = r5.f206106f
                vc1.b$a r0 = (vc1.b.DataDisplayed) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r5.f206105e
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
                goto L78
            L1f:
                oq.u.b(r6)
                vc1.n r6 = vc1.n.this
                wc1.a r6 = vc1.n.p9(r6)
                ld1.h r2 = r0.getData()
                r6.N2(r2)
                ld1.h r6 = r0.getData()
                ld1.e r6 = r6.getCitizenData()
                ld1.d r6 = r6.getPermanentAddress()
                if (r6 == 0) goto L54
                vc1.n r6 = vc1.n.this
                xw.b r6 = r6.Y1()
                vc1.a$c$d r2 = vc1.a.c.d.f206034a
                java.lang.Object r0 = vq.j.a(r0)
                r5.f206106f = r0
                r5.f206105e = r4
                java.lang.Object r6 = r6.F(r2, r5)
                if (r6 != r1) goto L78
                goto L77
            L54:
                vc1.n r6 = vc1.n.this
                xw.b r6 = r6.Y1()
                vc1.a$c$b r2 = new vc1.a$c$b
                vc1.n r4 = vc1.n.this
                xc1.a r4 = vc1.n.r9(r4)
                st3.d r4 = r4.e()
                r2.<init>(r4)
                java.lang.Object r0 = vq.j.a(r0)
                r5.f206106f = r0
                r5.f206105e = r3
                java.lang.Object r6 = r6.F(r2, r5)
                if (r6 != r1) goto L78
            L77:
                return r1
            L78:
                oq.i0 r6 = oq.i0.f148189a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: vc1.n.f.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(vc1.a.d dVar, vc1.b.DataDisplayed dataDisplayed, tq.e<? super i0> eVar) {
            f fVar = n.this.new f(eVar);
            fVar.f206106f = dataDisplayed;
            return fVar.J(i0.f148189a);
        }
    }

    public n(yy.a aVar, gb1.b bVar, xc1.a aVar2, ib4.c cVar, px.d dVar, gb1.a aVar3, ac4.a aVar4, wc1.a aVar5) {
        this.interactor = bVar;
        this.mapper = aVar2;
        this.genericDomainErrorMapper = cVar;
        this.remoteLogger = dVar;
        this.companyApplicationContainersInteractor = aVar3;
        this.callActionWithLoaderUseCase = aVar4;
        this.contract = aVar5;
        vc1.b.C5383b c5383b = vc1.b.C5383b.f206037a;
        this.initialState = c5383b;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(c5383b, new er.l() { // from class: vc1.m
            @Override // er.l
            public final Object b(Object obj) {
                return n.B9(this.f206058a, (v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), A9(c5383b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final vc1.c.a A9(vc1.b state) {
        return this.mapper.b(new xc1.a.Params(state, b9(vc1.a.d.f206035a), b9(vc1.a.C5380a.f206029a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(final n nVar, v vVar) {
        vVar.c(q0.c(vc1.b.class), new er.l() { // from class: vc1.h
            @Override // er.l
            public final Object b(Object obj) {
                return n.C9(this.f206052a, (z) obj);
            }
        });
        vVar.c(q0.c(vc1.b.C5383b.class), new er.l() { // from class: vc1.i
            @Override // er.l
            public final Object b(Object obj) {
                return n.D9(this.f206053a, (z) obj);
            }
        });
        vVar.c(q0.c(vc1.b.DataDisplayed.class), new er.l() { // from class: vc1.j
            @Override // er.l
            public final Object b(Object obj) {
                return n.E9(this.f206054a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(n nVar, z zVar) {
        c cVar = nVar.new c(null);
        zVar.x(q0.c(vc1.a.C5380a.class), k10.o.CANCEL_PREVIOUS, cVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(n nVar, z zVar) {
        zVar.C(nVar.new d(null));
        e eVar = nVar.new e(zVar, null);
        zVar.v(q0.c(vc1.a.b.class), k10.o.CANCEL_PREVIOUS, eVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E9(n nVar, z zVar) {
        f fVar = nVar.new f(null);
        zVar.x(q0.c(vc1.a.d.class), k10.o.CANCEL_PREVIOUS, fVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b w9(dx.b error) {
        return this.genericDomainErrorMapper.b(new ib4.c.Params(error, false, new er.l() { // from class: vc1.k
            @Override // er.l
            public final Object b(Object obj) {
                return n.x9(this.f206055a, (ib4.c.b) obj);
            }
        }, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(n nVar, ib4.c.b bVar) {
        if (!(bVar instanceof ib4.c.b.a.Close) && !(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
            throw new oq.p();
        }
        nVar.d9(vc1.a.C5380a.f206029a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object y9(dx.b bVar, final vc1.a aVar, tq.e<? super i0> eVar) {
        Object objF = Y1().F(new vc1.a.c.Error(this.genericDomainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: vc1.l
            @Override // er.l
            public final Object b(Object obj) {
                return n.z9(this.f206056a, aVar, (ib4.c.b) obj);
            }
        }, 2, null))), eVar);
        return objF == uq.b.e() ? objF : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(n nVar, vc1.a aVar, ib4.c.b bVar) {
        if ((bVar instanceof ib4.c.b.a.Primary) || (bVar instanceof ib4.c.b.a.Secondary) || (bVar instanceof ib4.c.b.a.Close) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
            nVar.d9(vc1.a.C5380a.f206029a);
        } else {
            if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                throw new oq.p();
            }
            nVar.d9(aVar);
        }
        return i0.f148189a;
    }

    @Override // zx.b
    public /* bridge */ void P5(Object obj) {
        super.P5(obj);
    }

    @Override // zx.b
    public xw.b<vc1.a.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<vc1.b, vc1.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<vc1.c.a> getState() {
        return this.state;
    }
}
