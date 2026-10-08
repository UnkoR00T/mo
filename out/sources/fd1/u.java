package fd1;

import de1.IncomeTaxExceededAddFileModel;
import de1.KrusData;
import f00.j0;
import fr.q0;
import jb1.CompanyApplication;
import jb4.PayloadErrorData;
import jd1.OpenCompanyWizardData;
import ld1.StatementAttachment;
import mu.p0;
import mx.Label;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001fB{\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\b\u0001\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020\u0002H\u0002¢\u0006\u0004\b&\u0010'J\u0018\u0010+\u001a\u00020*2\u0006\u0010)\u001a\u00020(H\u0082@¢\u0006\u0004\b+\u0010,J\u0014\u0010.\u001a\u00020**\u00020-H\u0082@¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u0002002\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b1\u00102J\u0015\u00104\u001a\u0004\u0018\u000103*\u00020(H\u0002¢\u0006\u0004\b4\u00105R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010S\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR \u0010Z\u001a\b\u0012\u0004\u0012\u00020U0T8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR&\u0010`\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030[8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R \u0010$\u001a\b\u0012\u0004\u0012\u00020%0a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e¨\u0006g"}, d2 = {"Lfd1/u;", "Ll00/g;", "Lfd1/b;", "Lfd1/a;", "Lfd1/c;", "", "Lyy/a;", "stateMachineFactory", "Lgd1/o;", "mapper", "Lgd1/b;", "summaryStatusEntryDataMapper", "Lac4/n;", "openUriIntentUseCase", "Lac4/a;", "callActionWithLoaderUseCase", "Lgb1/b;", "interactor", "Lmd1/a;", "signBase64XmlUC", "Lbc4/f;", "getFileFromUriUseCase", "Liy/a;", "base64Coder", "Lgd1/c;", "companyApplicationMapper", "Lgd1/n;", "errorMapper", "Lpx/d;", "remoteLogger", "Lmx/c;", "labelProvider", "Ljd1/a;", "contract", "<init>", "(Lyy/a;Lgd1/o;Lgd1/b;Lac4/n;Lac4/a;Lgb1/b;Lmd1/a;Lbc4/f;Liy/a;Lgd1/c;Lgd1/n;Lpx/d;Lmx/c;Ljd1/a;)V", "state", "Lfd1/c$a;", "H9", "(Lfd1/b;)Lfd1/c$a;", "Ldx/b;", "domainError", "Loq/i0;", "G9", "(Ldx/b;Ltq/e;)Ljava/lang/Object;", "Lgd1/n$b;", "E9", "(Lgd1/n$b;Ltq/e;)Ljava/lang/Object;", "", "C9", "(Ldx/b;)Z", "", "D9", "(Ldx/b;)Ljava/lang/Throwable;", "b", "Lgd1/o;", "c", "Lgd1/b;", "d", "Lac4/n;", "e", "Lac4/a;", "f", "Lgb1/b;", "g", "Lmd1/a;", "h", "Lbc4/f;", "j", "Liy/a;", "k", "Lgd1/c;", "l", "Lgd1/n;", "m", "Lpx/d;", "n", "Lmx/c;", "p", "Ljd1/a;", "Lfd1/b$a;", "q", "Lfd1/b$a;", "initialState", "Lxw/b;", "Lfd1/a$e;", "r", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "s", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "t", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u extends l00.g<fd1.b, fd1.a> implements fd1.c, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final gd1.o mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final gd1.b summaryStatusEntryDataMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ac4.n openUriIntentUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final gb1.b interactor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final md1.a signBase64XmlUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final bc4.f getFileFromUriUseCase;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final gd1.c companyApplicationMapper;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final gd1.n errorMapper;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final OpenCompanyWizardData contract;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final fd1.b.Initialized initialState;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final xw.b<fd1.a.e> navAction;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final k10.t<fd1.b, fd1.a> stateMachine;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final p0<fd1.c.a> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lfd1/u$a;", "Lf00/j0;", "Ljd1/a;", "Lfd1/u;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends j0<OpenCompanyWizardData, u> {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<fd1.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f61479a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u f61480b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f61481a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ u f61482b;

            /* JADX INFO: renamed from: fd1.u$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1393a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f61483d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f61484e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f61485f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f61487h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f61488j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f61489k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f61490l;

                public C1393a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f61483d = obj;
                    this.f61484e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, u uVar) {
                this.f61481a = hVar;
                this.f61482b = uVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1393a c1393a;
                if (eVar instanceof C1393a) {
                    c1393a = (C1393a) eVar;
                    int i15 = c1393a.f61484e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1393a.f61484e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1393a = new C1393a(eVar);
                    }
                } else {
                    c1393a = new C1393a(eVar);
                }
                Object obj2 = c1393a.f61483d;
                Object objE = uq.b.e();
                int i16 = c1393a.f61484e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f61481a;
                    fd1.c.a aVarH9 = this.f61482b.H9((fd1.b) obj);
                    c1393a.f61485f = vq.j.a(obj);
                    c1393a.f61487h = vq.j.a(c1393a);
                    c1393a.f61488j = vq.j.a(obj);
                    c1393a.f61489k = vq.j.a(hVar);
                    c1393a.f61490l = 0;
                    c1393a.f61484e = 1;
                    if (hVar.F(aVarH9, c1393a) == objE) {
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

        public b(mu.g gVar, u uVar) {
            this.f61479a = gVar;
            this.f61480b = uVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super fd1.c.a> hVar, tq.e eVar) {
            Object objA = this.f61479a.a(new a(hVar, this.f61480b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lfd1/a$e;", "action", "Lfd1/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lfd1/a$e;Lfd1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<fd1.a.e, fd1.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f61491e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f61492f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            fd1.a.e eVar = (fd1.a.e) this.f61492f;
            Object objE = uq.b.e();
            int i15 = this.f61491e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<fd1.a.e> bVarY1 = u.this.Y1();
                this.f61492f = vq.j.a(eVar);
                this.f61491e = 1;
                if (bVarY1.F(eVar, this) == objE) {
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
        public final Object w(fd1.a.e eVar, fd1.b bVar, tq.e<? super i0> eVar2) {
            c cVar = u.this.new c(eVar2);
            cVar.f61492f = eVar;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lfd1/b$a;", "state", "Lk10/l;", "Lfd1/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<k10.c0<fd1.b.Initialized>, tq.e<? super k10.l<? extends fd1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f61494e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f61495f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f61496g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f61497h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f61498j;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final fd1.b.Initialized O(u uVar, bc4.f.Result result, fd1.b.Initialized initialized) {
            return fd1.b.Initialized.b(initialized, null, new StatementAttachment(iy.a.e(uVar.base64Coder, result.getFile().getFileContent().getBytes(), null, 2, null), result.getFile().getMetadata().getName(), result.getFile().getMetadata().getExtension()), 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            IncomeTaxExceededAddFileModel incomeTaxExceededAddFileModel;
            final u uVar;
            k10.l lVarB;
            k10.c0 c0Var = (k10.c0) this.f61498j;
            Object objE = uq.b.e();
            int i15 = this.f61497h;
            if (i15 == 0) {
                oq.u.b(obj);
                KrusData krusData = ((fd1.b.Initialized) c0Var.a()).getSummaryData().getKrusData();
                if (krusData != null && (incomeTaxExceededAddFileModel = krusData.getIncomeTaxExceededAddFileModel()) != null) {
                    u uVar2 = u.this;
                    bc4.f fVar = uVar2.getFileFromUriUseCase;
                    bc4.f.Params params = new bc4.f.Params(incomeTaxExceededAddFileModel.getUri());
                    this.f61498j = c0Var;
                    this.f61494e = uVar2;
                    this.f61495f = vq.j.a(incomeTaxExceededAddFileModel);
                    this.f61496g = 0;
                    this.f61497h = 1;
                    obj = fVar.c(params, this);
                    if (obj == objE) {
                        return objE;
                    }
                    uVar = uVar2;
                }
                return c0Var.c();
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uVar = (u) this.f61494e;
            oq.u.b(obj);
            dx.i iVar = (dx.i) obj;
            if (iVar instanceof dx.i.Left) {
                lVarB = c0Var.c();
            } else {
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final bc4.f.Result result = (bc4.f.Result) ((dx.i.Right) iVar).b();
                lVarB = c0Var.b(new er.l() { // from class: fd1.v
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return u.d.O(uVar, result, (b.Initialized) obj2);
                    }
                });
            }
            if (lVarB != null) {
                return lVarB;
            }
            return c0Var.c();
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<fd1.b.Initialized> c0Var, tq.e<? super k10.l<? extends fd1.b>> eVar) {
            return ((d) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            d dVar = u.this.new d(eVar);
            dVar.f61498j = obj;
            return dVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lfd1/a$a;", "<unused var>", "Lfd1/b$a;", "Loq/i0;", "<anonymous>", "(Lfd1/a$a;Lfd1/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<fd1.a.C1387a, fd1.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f61500e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f61500e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<fd1.a.e> bVarY1 = u.this.Y1();
                fd1.a.e.C1388a c1388a = fd1.a.e.C1388a.f61391a;
                this.f61500e = 1;
                if (bVarY1.F(c1388a, this) == objE) {
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
        public final Object w(fd1.a.C1387a c1387a, fd1.b.Initialized initialized, tq.e<? super i0> eVar) {
            return u.this.new e(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lfd1/a$d;", "<unused var>", "Lk10/c0;", "Lfd1/b$a;", "state", "Lk10/l;", "Lfd1/b;", "<anonymous>", "(Lfd1/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<fd1.a.d, k10.c0<fd1.b.Initialized>, tq.e<? super k10.l<? extends fd1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f61502e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f61503f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final fd1.b.YourData O(k10.c0 c0Var, fd1.b.Initialized initialized) {
            return new fd1.b.YourData(((fd1.b.Initialized) c0Var.a()).getSummaryData(), ((fd1.b.Initialized) c0Var.a()).getAttachment());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f61503f;
            uq.b.e();
            if (this.f61502e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: fd1.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.f.O(c0Var, (b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(fd1.a.d dVar, k10.c0<fd1.b.Initialized> c0Var, tq.e<? super k10.l<? extends fd1.b>> eVar) {
            f fVar = new f(eVar);
            fVar.f61503f = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lfd1/a$c;", "<unused var>", "Lk10/c0;", "Lfd1/b$a;", "state", "Lk10/l;", "Lfd1/b;", "<anonymous>", "(Lfd1/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<fd1.a.c, k10.c0<fd1.b.Initialized>, tq.e<? super k10.l<? extends fd1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f61504e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f61505f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final fd1.b.Pkd O(k10.c0 c0Var, fd1.b.Initialized initialized) {
            return new fd1.b.Pkd(((fd1.b.Initialized) c0Var.a()).getSummaryData(), ((fd1.b.Initialized) c0Var.a()).getAttachment());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f61505f;
            uq.b.e();
            if (this.f61504e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: fd1.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.g.O(c0Var, (b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(fd1.a.c cVar, k10.c0<fd1.b.Initialized> c0Var, tq.e<? super k10.l<? extends fd1.b>> eVar) {
            g gVar = new g(eVar);
            gVar.f61505f = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lfd1/a$g;", "<unused var>", "Lfd1/b$a;", "stateSnapshot", "Loq/i0;", "<anonymous>", "(Lfd1/a$g;Lfd1/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<fd1.a.g, fd1.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f61506e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f61507f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f61508g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f61509h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f61510j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f61511k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f61512l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f61513m;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0080  */
        /* JADX WARN: Code duplicated, block: B:25:0x00b5  */
        /* JADX WARN: Code duplicated, block: B:27:0x00b9  */
        /* JADX WARN: Code duplicated, block: B:28:0x00c2  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00b2, code lost:
        
            if (r6.E9(r8, r9) == r1) goto L24;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r10) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 203
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: fd1.u.h.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(fd1.a.g gVar, fd1.b.Initialized initialized, tq.e<? super i0> eVar) {
            h hVar = u.this.new h(eVar);
            hVar.f61513m = initialized;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lfd1/a$f;", "<unused var>", "Lk10/c0;", "Lfd1/b$a;", "state", "Lk10/l;", "Lfd1/b;", "<anonymous>", "(Lfd1/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<fd1.a.f, k10.c0<fd1.b.Initialized>, tq.e<? super k10.l<? extends fd1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f61515e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f61516f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f61516f;
            uq.b.e();
            if (this.f61515e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            u.this.d9(fd1.a.b.f61388a);
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(fd1.a.f fVar, k10.c0<fd1.b.Initialized> c0Var, tq.e<? super k10.l<? extends fd1.b>> eVar) {
            i iVar = u.this.new i(eVar);
            iVar.f61516f = c0Var;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lfd1/a$b;", "<unused var>", "Lfd1/b$a;", "stateSnapshot", "Loq/i0;", "<anonymous>", "(Lfd1/a$b;Lfd1/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<fd1.a.b, fd1.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f61518e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f61519f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f61520g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f61521h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f61522j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f61523k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ k10.z<fd1.b.Initialized, fd1.b, fd1.a> f61525m;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f61526e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f61527f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f61528g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f61529h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f61530j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ u f61531k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ CompanyApplication f61532l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(u uVar, CompanyApplication companyApplication, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f61531k = uVar;
                this.f61532l = companyApplication;
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x0062, code lost:
            
                if (r1.G9(r3, r4) == r0) goto L17;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r5) throws java.lang.Throwable {
                /*
                    r4 = this;
                    java.lang.Object r0 = uq.b.e()
                    int r1 = r4.f61530j
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L26
                    if (r1 == r3) goto L22
                    if (r1 != r2) goto L1a
                    java.lang.Object r0 = r4.f61527f
                    dx.b r0 = (dx.b) r0
                    java.lang.Object r0 = r4.f61526e
                    dx.i r0 = (dx.i) r0
                    oq.u.b(r5)
                    goto L7d
                L1a:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L22:
                    oq.u.b(r5)
                    goto L3a
                L26:
                    oq.u.b(r5)
                    fd1.u r5 = r4.f61531k
                    gb1.b r5 = fd1.u.u9(r5)
                    jb1.c r1 = r4.f61532l
                    r4.f61530j = r3
                    java.lang.Object r5 = r5.c(r1, r4)
                    if (r5 != r0) goto L3a
                    goto L64
                L3a:
                    dx.i r5 = (dx.i) r5
                    fd1.u r1 = r4.f61531k
                    boolean r3 = r5 instanceof dx.i.Left
                    if (r3 == 0) goto L65
                    r3 = r5
                    dx.i$b r3 = (dx.i.Left) r3
                    java.lang.Object r3 = r3.b()
                    dx.b r3 = (dx.b) r3
                    java.lang.Object r5 = vq.j.a(r5)
                    r4.f61526e = r5
                    java.lang.Object r5 = vq.j.a(r3)
                    r4.f61527f = r5
                    r5 = 0
                    r4.f61528g = r5
                    r4.f61529h = r5
                    r4.f61530j = r2
                    java.lang.Object r5 = fd1.u.A9(r1, r3, r4)
                    if (r5 != r0) goto L7d
                L64:
                    return r0
                L65:
                    boolean r0 = r5 instanceof dx.i.Right
                    if (r0 == 0) goto L80
                    dx.i$c r5 = (dx.i.Right) r5
                    java.lang.Object r5 = r5.b()
                    ld1.a r5 = (ld1.ApplicationXml) r5
                    fd1.a$h r0 = new fd1.a$h
                    java.lang.String r5 = r5.getApplicationXml()
                    r0.<init>(r5)
                    fd1.u.n9(r1, r0)
                L7d:
                    oq.i0 r5 = oq.i0.f148189a
                    return r5
                L80:
                    oq.p r5 = new oq.p
                    r5.<init>()
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: fd1.u.j.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f61531k, this.f61532l, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super i0> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(k10.z<fd1.b.Initialized, fd1.b, fd1.a> zVar, tq.e<? super j> eVar) {
            super(3, eVar);
            this.f61525m = zVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x00b6, code lost:
        
            if (r5.E9(r2, r15) == r6) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00f1, code lost:
        
            if (ac4.a.a(r0, null, r8, r15, 1, null) == r6) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00f3, code lost:
        
            return r6;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r16) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 253
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: fd1.u.j.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(fd1.a.b bVar, fd1.b.Initialized initialized, tq.e<? super i0> eVar) {
            j jVar = u.this.new j(this.f61525m, eVar);
            jVar.f61523k = initialized;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lfd1/a$h;", "action", "Lfd1/b$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lfd1/a$h;Lfd1/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<fd1.a.SendApplication, fd1.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f61533e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f61534f;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f61536e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f61537f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f61538g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f61539h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f61540j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f61541k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f61542l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f61543m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f61544n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ u f61545p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ fd1.a.SendApplication f61546q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(u uVar, fd1.a.SendApplication sendApplication, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f61545p = uVar;
                this.f61546q = sendApplication;
            }

            /* JADX WARN: Code duplicated, block: B:18:0x007b  */
            /* JADX WARN: Code duplicated, block: B:21:0x009f  */
            /* JADX WARN: Code duplicated, block: B:23:0x00a3  */
            /* JADX WARN: Code duplicated, block: B:26:0x00d6  */
            /* JADX WARN: Code duplicated, block: B:29:0x00de  */
            /* JADX WARN: Code duplicated, block: B:31:0x00ed  */
            /* JADX WARN: Code duplicated, block: B:34:0x0118 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:35:0x011a  */
            /* JADX WARN: Code duplicated, block: B:38:0x0160  */
            /* JADX WARN: Code duplicated, block: B:40:0x0166  */
            /* JADX WARN: Code duplicated, block: B:42:0x016a  */
            /* JADX WARN: Code duplicated, block: B:47:0x01bc  */
            /* JADX WARN: Code duplicated, block: B:49:0x01c2  */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x009b, code lost:
            
                if (r6.G9(r14, r13) == r0) goto L44;
             */
            /* JADX WARN: Code restructure failed: missing block: B:32:0x0114, code lost:
            
                if (r6.G9(r8, r13) == r0) goto L44;
             */
            /* JADX WARN: Code restructure failed: missing block: B:36:0x015d, code lost:
            
                if (r2.F(r9, r13) == r0) goto L44;
             */
            /* JADX WARN: Code restructure failed: missing block: B:43:0x01b6, code lost:
            
                if (r8.F(r9, r13) == r0) goto L44;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r14) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 474
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: fd1.u.k.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f61545p, this.f61546q, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super i0> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            fd1.a.SendApplication sendApplication = (fd1.a.SendApplication) this.f61534f;
            Object objE = uq.b.e();
            int i15 = this.f61533e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.a aVar = u.this.callActionWithLoaderUseCase;
                a aVar2 = new a(u.this, sendApplication, null);
                this.f61534f = vq.j.a(sendApplication);
                this.f61533e = 1;
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
        public final Object w(fd1.a.SendApplication sendApplication, fd1.b.Initialized initialized, tq.e<? super i0> eVar) {
            k kVar = u.this.new k(eVar);
            kVar.f61534f = sendApplication;
            return kVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lfd1/a$a;", "<unused var>", "Lk10/c0;", "Lfd1/b$c;", "state", "Lk10/l;", "Lfd1/b;", "<anonymous>", "(Lfd1/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<fd1.a.C1387a, k10.c0<fd1.b.YourData>, tq.e<? super k10.l<? extends fd1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f61547e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f61548f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final fd1.b.Initialized O(k10.c0 c0Var, fd1.b.YourData yourData) {
            return new fd1.b.Initialized(((fd1.b.YourData) c0Var.a()).getSummaryData(), ((fd1.b.YourData) c0Var.a()).getAttachment());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f61548f;
            uq.b.e();
            if (this.f61547e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: fd1.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.l.O(c0Var, (b.YourData) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(fd1.a.C1387a c1387a, k10.c0<fd1.b.YourData> c0Var, tq.e<? super k10.l<? extends fd1.b>> eVar) {
            l lVar = new l(eVar);
            lVar.f61548f = c0Var;
            return lVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lfd1/a$a;", "<unused var>", "Lk10/c0;", "Lfd1/b$b;", "state", "Lk10/l;", "Lfd1/b;", "<anonymous>", "(Lfd1/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<fd1.a.C1387a, k10.c0<fd1.b.Pkd>, tq.e<? super k10.l<? extends fd1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f61549e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f61550f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final fd1.b.Initialized O(k10.c0 c0Var, fd1.b.Pkd pkd) {
            return new fd1.b.Initialized(((fd1.b.Pkd) c0Var.a()).getSummaryData(), ((fd1.b.Pkd) c0Var.a()).getAttachment());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f61550f;
            uq.b.e();
            if (this.f61549e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: fd1.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.m.O(c0Var, (b.Pkd) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(fd1.a.C1387a c1387a, k10.c0<fd1.b.Pkd> c0Var, tq.e<? super k10.l<? extends fd1.b>> eVar) {
            m mVar = new m(eVar);
            mVar.f61550f = c0Var;
            return mVar.J(i0.f148189a);
        }
    }

    public u(yy.a aVar, gd1.o oVar, gd1.b bVar, ac4.n nVar, ac4.a aVar2, gb1.b bVar2, md1.a aVar3, bc4.f fVar, iy.a aVar4, gd1.c cVar, gd1.n nVar2, px.d dVar, mx.c cVar2, OpenCompanyWizardData openCompanyWizardData) {
        this.mapper = oVar;
        this.summaryStatusEntryDataMapper = bVar;
        this.openUriIntentUseCase = nVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.interactor = bVar2;
        this.signBase64XmlUC = aVar3;
        this.getFileFromUriUseCase = fVar;
        this.base64Coder = aVar4;
        this.companyApplicationMapper = cVar;
        this.errorMapper = nVar2;
        this.remoteLogger = dVar;
        this.labelProvider = cVar2;
        this.contract = openCompanyWizardData;
        fd1.b.Initialized initialized = new fd1.b.Initialized(openCompanyWizardData, null);
        this.initialState = initialized;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(initialized, new er.l() { // from class: fd1.t
            @Override // er.l
            public final Object b(Object obj) {
                return u.J9(this.f61461a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), H9(initialized));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean C9(dx.b domainError) {
        dx.b.g.Http http = domainError instanceof dx.b.g.Http ? (dx.b.g.Http) domainError : null;
        PayloadErrorData payloadErrorData = http != null ? (PayloadErrorData) http.b() : null;
        String code = payloadErrorData != null ? payloadErrorData.getCode() : null;
        return fr.t.c(code, "APPLICATION_ORDER_FAILED") || fr.t.c(code, "DIGITAL_SIGNATURE_COMMUNICATION");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Throwable D9(dx.b bVar) {
        if (bVar instanceof dx.b.Generic) {
            return ((dx.b.Generic) bVar).getE();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object E9(gd1.n.b bVar, tq.e<? super i0> eVar) {
        Object objF = Y1().F(new fd1.a.e.Error(this.errorMapper.b(new gd1.n.Params(bVar, b9(fd1.a.b.f61388a), new er.l() { // from class: fd1.s
            @Override // er.l
            public final Object b(Object obj) {
                return u.F9(this.f61460a, (String) obj);
            }
        }, b9(fd1.a.e.b.f61392a)))), eVar);
        return objF == uq.b.e() ? objF : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F9(u uVar, String str) {
        uVar.b9(new fd1.a.SendApplication(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object G9(dx.b bVar, tq.e<? super i0> eVar) {
        Label labelC;
        Label labelC2;
        String message;
        String title;
        if (!(bVar instanceof dx.b.g.Http)) {
            Object objE9 = E9(new gd1.n.b.GenerateXml(bVar), eVar);
            return objE9 == uq.b.e() ? objE9 : i0.f148189a;
        }
        PayloadErrorData payloadErrorData = (PayloadErrorData) ((dx.b.g.Http) bVar).b();
        String code = payloadErrorData != null ? payloadErrorData.getCode() : null;
        if (!fr.t.c(code, "APPLICATION_ORDER_FAILED") && !fr.t.c(code, "DIGITAL_SIGNATURE_COMMUNICATION")) {
            Object objE10 = E9(new gd1.n.b.GenerateXml(bVar), eVar);
            return objE10 == uq.b.e() ? objE10 : i0.f148189a;
        }
        dx.b.f fVar = dx.b.f.FAILURE;
        dx.b.g.Http http = (dx.b.g.Http) bVar;
        PayloadErrorData payloadErrorData2 = (PayloadErrorData) http.b();
        if (payloadErrorData2 == null || (title = payloadErrorData2.getTitle()) == null || (labelC = mx.b.b(title, "errorTitle")) == null) {
            labelC = Label.INSTANCE.c();
        }
        Label label = labelC;
        PayloadErrorData payloadErrorData3 = (PayloadErrorData) http.b();
        if (payloadErrorData3 == null || (message = payloadErrorData3.getMessage()) == null || (labelC2 = mx.b.b(message, "errorMessage")) == null) {
            labelC2 = Label.INSTANCE.c();
        }
        Object objE11 = E9(new gd1.n.b.BusinessError(new dx.b.Business(null, fVar, label, labelC2, null, this.labelProvider.c(ha1.a.f82387e0), this.labelProvider.c(ha1.a.f82450m), 17, null)), eVar);
        return objE11 == uq.b.e() ? objE11 : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fd1.c.a H9(fd1.b state) {
        return this.mapper.b(new gd1.o.Params(state, b9(fd1.a.g.f61398a), b9(fd1.a.d.f61390a), b9(fd1.a.c.f61389a), b9(fd1.a.f.f61397a), b9(fd1.a.C1387a.f61387a), b9(fd1.a.e.c.f61393a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J9(final u uVar, k10.v vVar) {
        vVar.c(q0.c(fd1.b.class), new er.l() { // from class: fd1.o
            @Override // er.l
            public final Object b(Object obj) {
                return u.K9(this.f61458a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(fd1.b.Initialized.class), new er.l() { // from class: fd1.p
            @Override // er.l
            public final Object b(Object obj) {
                return u.L9(this.f61459a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(fd1.b.YourData.class), new er.l() { // from class: fd1.q
            @Override // er.l
            public final Object b(Object obj) {
                return u.M9((k10.z) obj);
            }
        });
        vVar.c(q0.c(fd1.b.Pkd.class), new er.l() { // from class: fd1.r
            @Override // er.l
            public final Object b(Object obj) {
                return u.N9((k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K9(u uVar, k10.z zVar) {
        c cVar = uVar.new c(null);
        zVar.x(q0.c(fd1.a.e.class), k10.o.CANCEL_PREVIOUS, cVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L9(u uVar, k10.z zVar) {
        zVar.A(uVar.new d(null));
        e eVar = uVar.new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(fd1.a.C1387a.class), oVar, eVar);
        zVar.v(q0.c(fd1.a.d.class), oVar, new f(null));
        zVar.v(q0.c(fd1.a.c.class), oVar, new g(null));
        zVar.x(q0.c(fd1.a.g.class), oVar, uVar.new h(null));
        zVar.v(q0.c(fd1.a.f.class), oVar, uVar.new i(null));
        zVar.x(q0.c(fd1.a.b.class), oVar, uVar.new j(zVar, null));
        zVar.x(q0.c(fd1.a.SendApplication.class), oVar, uVar.new k(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M9(k10.z zVar) {
        l lVar = new l(null);
        zVar.v(q0.c(fd1.a.C1387a.class), k10.o.CANCEL_PREVIOUS, lVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 N9(k10.z zVar) {
        m mVar = new m(null);
        zVar.v(q0.c(fd1.a.C1387a.class), k10.o.CANCEL_PREVIOUS, mVar);
        return i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: I9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // zx.b
    public xw.b<fd1.a.e> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<fd1.b, fd1.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<fd1.c.a> getState() {
        return this.state;
    }
}
