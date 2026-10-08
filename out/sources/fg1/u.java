package fg1;

import f00.j0;
import fr.q0;
import java.util.ArrayList;
import java.util.List;
import k10.c0;
import ld1.CompanyPkdCode;
import ma1.CompanyCategory;
import ma1.CompanyData;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pf1.CompanyManagementApplication;
import qg1.CompanySuspensionWizardData;
import xe1.PkdCodeContractData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001\\Bs\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0001\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020\u0002H\u0002¢\u0006\u0004\b$\u0010%J\u0014\u0010(\u001a\u00020'*\u00020&H\u0082@¢\u0006\u0004\b(\u0010)J\u0015\u0010,\u001a\u0004\u0018\u00010+*\u00020*H\u0002¢\u0006\u0004\b,\u0010-R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER \u0010L\u001a\b\u0012\u0004\u0012\u00020G0F8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0014\u0010P\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR&\u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030Q8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR \u0010\"\u001a\b\u0012\u0004\u0012\u00020#0W8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[¨\u0006]"}, d2 = {"Lfg1/u;", "Ll00/g;", "Lfg1/m;", "Lfg1/l;", "Lfg1/n;", "", "Lyy/a;", "stateMachineFactory", "Lac4/n;", "openUriIntentUseCase", "Lac4/a;", "callActionWithLoaderUseCase", "Lof1/b;", "interactor", "Lmd1/a;", "signBase64XmlUC", "Lbc4/f;", "getFileFromUriUseCase", "Liy/a;", "base64Coder", "Lgg1/a;", "companyManagementApplicationMapper", "Lgg1/k;", "errorMapper", "Lpx/d;", "remoteLogger", "Lgg1/l;", "mapper", "Lgg1/c;", "summaryStatusEntryDataMapper", "Lqg1/a;", "contract", "<init>", "(Lyy/a;Lac4/n;Lac4/a;Lof1/b;Lmd1/a;Lbc4/f;Liy/a;Lgg1/a;Lgg1/k;Lpx/d;Lgg1/l;Lgg1/c;Lqg1/a;)V", "state", "Lfg1/n$a;", "F9", "(Lfg1/m;)Lfg1/n$a;", "Lgg1/k$c;", "Loq/i0;", "D9", "(Lgg1/k$c;Ltq/e;)Ljava/lang/Object;", "Ldx/b;", "", "C9", "(Ldx/b;)Ljava/lang/Throwable;", "b", "Lac4/n;", "c", "Lac4/a;", "d", "Lof1/b;", "e", "Lmd1/a;", "f", "Lbc4/f;", "g", "Liy/a;", "h", "Lgg1/a;", "j", "Lgg1/k;", "k", "Lpx/d;", "l", "Lgg1/l;", "m", "Lgg1/c;", "n", "Lqg1/a;", "Lxw/b;", "Lfg1/l$e;", "p", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lfg1/m$a;", "q", "Lfg1/m$a;", "initialState", "Lk10/t;", "r", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "s", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u extends l00.g<m, fg1.l> implements n, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ac4.n openUriIntentUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final of1.b interactor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final md1.a signBase64XmlUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final bc4.f getFileFromUriUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final gg1.a companyManagementApplicationMapper;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final gg1.k errorMapper;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final gg1.l mapper;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final gg1.c summaryStatusEntryDataMapper;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final CompanySuspensionWizardData contract;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final xw.b<fg1.l.e> navAction = new xw.b<>();

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final m.Initialized initialState;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final k10.t<m, fg1.l> stateMachine;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final p0<n.a> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lfg1/u$a;", "Lf00/j0;", "Lqg1/a;", "Lfg1/u;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends j0<CompanySuspensionWizardData, u> {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<n.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f62829a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u f62830b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f62831a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ u f62832b;

            /* JADX INFO: renamed from: fg1.u$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1416a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f62833d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f62834e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f62835f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f62837h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f62838j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f62839k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f62840l;

                public C1416a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f62833d = obj;
                    this.f62834e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, u uVar) {
                this.f62831a = hVar;
                this.f62832b = uVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1416a c1416a;
                if (eVar instanceof C1416a) {
                    c1416a = (C1416a) eVar;
                    int i15 = c1416a.f62834e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1416a.f62834e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1416a = new C1416a(eVar);
                    }
                } else {
                    c1416a = new C1416a(eVar);
                }
                Object obj2 = c1416a.f62833d;
                Object objE = uq.b.e();
                int i16 = c1416a.f62834e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f62831a;
                    n.a aVarF9 = this.f62832b.F9((m) obj);
                    c1416a.f62835f = vq.j.a(obj);
                    c1416a.f62837h = vq.j.a(c1416a);
                    c1416a.f62838j = vq.j.a(obj);
                    c1416a.f62839k = vq.j.a(hVar);
                    c1416a.f62840l = 0;
                    c1416a.f62834e = 1;
                    if (hVar.F(aVarF9, c1416a) == objE) {
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
            this.f62829a = gVar;
            this.f62830b = uVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super n.a> hVar, tq.e eVar) {
            Object objA = this.f62829a.a(new a(hVar, this.f62830b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lfg1/l$e;", "action", "Lfg1/m;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lfg1/l$e;Lfg1/m;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<fg1.l.e, m, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f62841e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f62842f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            fg1.l.e eVar = (fg1.l.e) this.f62842f;
            Object objE = uq.b.e();
            int i15 = this.f62841e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<fg1.l.e> bVarY1 = u.this.Y1();
                this.f62842f = vq.j.a(eVar);
                this.f62841e = 1;
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
        public final Object w(fg1.l.e eVar, m mVar, tq.e<? super i0> eVar2) {
            c cVar = u.this.new c(eVar2);
            cVar.f62842f = eVar;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lfg1/l$a;", "<unused var>", "Lfg1/m$a;", "Loq/i0;", "<anonymous>", "(Lfg1/l$a;Lfg1/m$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<fg1.l.a, m.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f62844e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f62844e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<fg1.l.e> bVarY1 = u.this.Y1();
                fg1.l.e.a aVar = fg1.l.e.a.f62768a;
                this.f62844e = 1;
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
        public final Object w(fg1.l.a aVar, m.Initialized initialized, tq.e<? super i0> eVar) {
            return u.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lfg1/l$d;", "<unused var>", "Lk10/c0;", "Lfg1/m$a;", "state", "Lk10/l;", "Lfg1/m;", "<anonymous>", "(Lfg1/l$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<fg1.l.d, c0<m.Initialized>, tq.e<? super k10.l<? extends m>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f62846e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f62847f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m.UserData O(c0 c0Var, m.Initialized initialized) {
            return new m.UserData(((m.Initialized) c0Var.a()).getData().getSuspensionPeriod().getKnownUserDataModel().getCitizenData(), ((m.Initialized) c0Var.a()).getData().getSuspensionPeriod().getKnownUserDataModel().getMIdCardNumber());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final c0 c0Var = (c0) this.f62847f;
            uq.b.e();
            if (this.f62846e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: fg1.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.e.O(c0Var, (m.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(fg1.l.d dVar, c0<m.Initialized> c0Var, tq.e<? super k10.l<? extends m>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f62847f = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lfg1/l$c;", "<unused var>", "Lk10/c0;", "Lfg1/m$a;", "state", "Lk10/l;", "Lfg1/m;", "<anonymous>", "(Lfg1/l$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<fg1.l.c, c0<m.Initialized>, tq.e<? super k10.l<? extends m>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f62848e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f62849f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m.Pkd O(c0 c0Var, m.Initialized initialized) {
            List<CompanyCategory> listL;
            List<CompanyPkdCode> listA;
            PkdCodeContractData pkdCodeContractData = ((m.Initialized) c0Var.a()).getData().getPkdCodeContractData();
            if (pkdCodeContractData == null || (listA = pkdCodeContractData.a()) == null) {
                CompanyData companyData = ((m.Initialized) c0Var.a()).getData().getCompanyDetailsContractData().getCompanyData();
                listL = companyData != null ? companyData.l() : null;
            } else {
                List<CompanyPkdCode> list = listA;
                listL = new ArrayList<>(pq.v.y(list, 10));
                for (CompanyPkdCode companyPkdCode : list) {
                    listL.add(new CompanyCategory(companyPkdCode.getCode(), companyPkdCode.getName()));
                }
            }
            return new m.Pkd(listL);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final c0 c0Var = (c0) this.f62849f;
            uq.b.e();
            if (this.f62848e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: fg1.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.f.O(c0Var, (m.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(fg1.l.c cVar, c0<m.Initialized> c0Var, tq.e<? super k10.l<? extends m>> eVar) {
            f fVar = new f(eVar);
            fVar.f62849f = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lfg1/l$g;", "<unused var>", "Lfg1/m$a;", "state", "Loq/i0;", "<anonymous>", "(Lfg1/l$g;Lfg1/m$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<fg1.l.g, m.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f62850e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f62851f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f62852g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f62853h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f62854j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f62855k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f62856l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f62857m;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0080  */
        /* JADX WARN: Code duplicated, block: B:25:0x00b5  */
        /* JADX WARN: Code duplicated, block: B:27:0x00b9  */
        /* JADX WARN: Code duplicated, block: B:28:0x00c2  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00b2, code lost:
        
            if (r6.D9(r8, r9) == r1) goto L24;
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
            throw new UnsupportedOperationException("Method not decompiled: fg1.u.g.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(fg1.l.g gVar, m.Initialized initialized, tq.e<? super i0> eVar) {
            g gVar2 = u.this.new g(eVar);
            gVar2.f62857m = initialized;
            return gVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lfg1/l$f;", "<unused var>", "Lk10/c0;", "Lfg1/m$a;", "state", "Lk10/l;", "Lfg1/m;", "<anonymous>", "(Lfg1/l$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<fg1.l.f, c0<m.Initialized>, tq.e<? super k10.l<? extends m>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f62859e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f62860f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f62860f;
            uq.b.e();
            if (this.f62859e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            u.this.d9(fg1.l.b.f62765a);
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(fg1.l.f fVar, c0<m.Initialized> c0Var, tq.e<? super k10.l<? extends m>> eVar) {
            h hVar = u.this.new h(eVar);
            hVar.f62860f = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lfg1/l$b;", "<unused var>", "Lfg1/m$a;", "stateSnapshot", "Loq/i0;", "<anonymous>", "(Lfg1/l$b;Lfg1/m$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<fg1.l.b, m.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f62862e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f62863f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f62864g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f62865h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f62866j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f62867k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f62868l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ k10.z<m.Initialized, m, fg1.l> f62870n;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f62871e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f62872f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f62873g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f62874h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f62875j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ u f62876k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ CompanyManagementApplication f62877l;

            /* JADX INFO: renamed from: fg1.u$i$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final /* synthetic */ class C1417a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f62878a;

                static {
                    int[] iArr = new int[ma1.l.values().length];
                    try {
                        iArr[ma1.l.SUSPEND_COMPANY.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ma1.l.RESUME_COMPANY.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    f62878a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(u uVar, CompanyManagementApplication companyManagementApplication, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f62876k = uVar;
                this.f62877l = companyManagementApplication;
            }

            /* JADX WARN: Code duplicated, block: B:21:0x006a  */
            /* JADX WARN: Code duplicated, block: B:24:0x0094  */
            /* JADX WARN: Code duplicated, block: B:26:0x0098  */
            /* JADX WARN: Code duplicated, block: B:27:0x00ad  */
            /* JADX WARN: Code duplicated, block: B:36:0x00d2  */
            /* JADX WARN: Code duplicated, block: B:39:0x00fc  */
            /* JADX WARN: Code duplicated, block: B:41:0x0100  */
            /* JADX WARN: Code duplicated, block: B:44:0x0117  */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x0091, code lost:
            
                if (r1.D9(r4, r7) == r0) goto L38;
             */
            /* JADX WARN: Code restructure failed: missing block: B:37:0x00f9, code lost:
            
                if (r1.D9(r3, r7) == r0) goto L38;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 285
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: fg1.u.i.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f62876k, this.f62877l, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super i0> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(k10.z<m.Initialized, m, fg1.l> zVar, tq.e<? super i> eVar) {
            super(3, eVar);
            this.f62870n = zVar;
        }

        /* JADX WARN: Code duplicated, block: B:33:0x00ea  */
        /* JADX WARN: Code duplicated, block: B:35:0x0107  */
        /* JADX WARN: Code duplicated, block: B:39:0x0147  */
        /* JADX WARN: Code duplicated, block: B:41:0x014b  */
        /* JADX WARN: Code duplicated, block: B:46:0x0189  */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0077, code lost:
        
            if (r15 == r1) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0144, code lost:
        
            if (r2.D9(r7, r14) == r1) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0183, code lost:
        
            if (ac4.a.a(r8, null, r10, r14, 1, null) == r1) goto L43;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r15) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 399
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: fg1.u.i.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(fg1.l.b bVar, m.Initialized initialized, tq.e<? super i0> eVar) {
            i iVar = u.this.new i(this.f62870n, eVar);
            iVar.f62868l = initialized;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lfg1/l$h;", "action", "Lfg1/m$a;", "stateSnapshot", "Loq/i0;", "<anonymous>", "(Lfg1/l$h;Lfg1/m$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<fg1.l.SendApplication, m.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f62879e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f62880f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f62881g;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f62883e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f62884f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f62885g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f62886h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f62887j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f62888k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f62889l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f62890m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f62891n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ u f62892p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ fg1.l.SendApplication f62893q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ m.Initialized f62894r;

            /* JADX INFO: renamed from: fg1.u$j$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final /* synthetic */ class C1418a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f62895a;

                static {
                    int[] iArr = new int[ma1.l.values().length];
                    try {
                        iArr[ma1.l.SUSPEND_COMPANY.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ma1.l.RESUME_COMPANY.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    f62895a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(u uVar, fg1.l.SendApplication sendApplication, m.Initialized initialized, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f62892p = uVar;
                this.f62893q = sendApplication;
                this.f62894r = initialized;
            }

            /* JADX WARN: Code duplicated, block: B:19:0x009c  */
            /* JADX WARN: Code duplicated, block: B:22:0x00c7  */
            /* JADX WARN: Code duplicated, block: B:24:0x00cb  */
            /* JADX WARN: Code duplicated, block: B:26:0x00eb A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:27:0x00ed  */
            /* JADX WARN: Code duplicated, block: B:30:0x011d  */
            /* JADX WARN: Code duplicated, block: B:33:0x0125  */
            /* JADX WARN: Code duplicated, block: B:35:0x0138  */
            /* JADX WARN: Code duplicated, block: B:38:0x016c A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:39:0x016e  */
            /* JADX WARN: Code duplicated, block: B:42:0x01b8  */
            /* JADX WARN: Code duplicated, block: B:44:0x01be  */
            /* JADX WARN: Code duplicated, block: B:46:0x01c2  */
            /* JADX WARN: Code duplicated, block: B:49:0x0213  */
            /* JADX WARN: Code duplicated, block: B:51:0x0219  */
            /* JADX WARN: Code duplicated, block: B:53:0x021f  */
            /* JADX WARN: Code duplicated, block: B:56:0x024f  */
            /* JADX WARN: Code duplicated, block: B:59:0x0257  */
            /* JADX WARN: Code duplicated, block: B:61:0x026a  */
            /* JADX WARN: Code duplicated, block: B:64:0x029d A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:65:0x029f  */
            /* JADX WARN: Code duplicated, block: B:68:0x02e7  */
            /* JADX WARN: Code duplicated, block: B:70:0x02ed  */
            /* JADX WARN: Code duplicated, block: B:72:0x02f1  */
            /* JADX WARN: Code duplicated, block: B:77:0x0343  */
            /* JADX WARN: Code duplicated, block: B:79:0x0349  */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x00c3, code lost:
            
                if (r8.D9(r2, r14) == r0) goto L74;
             */
            /* JADX WARN: Code restructure failed: missing block: B:36:0x0168, code lost:
            
                if (r8.D9(r3, r14) == r0) goto L74;
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x01b4, code lost:
            
                if (r3.F(r10, r14) == r0) goto L74;
             */
            /* JADX WARN: Code restructure failed: missing block: B:47:0x020f, code lost:
            
                if (r10.F(r11, r14) == r0) goto L74;
             */
            /* JADX WARN: Code restructure failed: missing block: B:62:0x0299, code lost:
            
                if (r8.D9(r3, r14) == r0) goto L74;
             */
            /* JADX WARN: Code restructure failed: missing block: B:66:0x02e4, code lost:
            
                if (r3.F(r10, r14) == r0) goto L74;
             */
            /* JADX WARN: Code restructure failed: missing block: B:73:0x033d, code lost:
            
                if (r10.F(r11, r14) == r0) goto L74;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r15) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 874
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: fg1.u.j.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f62892p, this.f62893q, this.f62894r, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super i0> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            fg1.l.SendApplication sendApplication = (fg1.l.SendApplication) this.f62880f;
            m.Initialized initialized = (m.Initialized) this.f62881g;
            Object objE = uq.b.e();
            int i15 = this.f62879e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.a aVar = u.this.callActionWithLoaderUseCase;
                a aVar2 = new a(u.this, sendApplication, initialized, null);
                this.f62880f = vq.j.a(sendApplication);
                this.f62881g = vq.j.a(initialized);
                this.f62879e = 1;
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
        public final Object w(fg1.l.SendApplication sendApplication, m.Initialized initialized, tq.e<? super i0> eVar) {
            j jVar = u.this.new j(eVar);
            jVar.f62880f = sendApplication;
            jVar.f62881g = initialized;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lfg1/l$a;", "<unused var>", "Lk10/c0;", "Lfg1/m$c;", "state", "Lk10/l;", "Lfg1/m;", "<anonymous>", "(Lfg1/l$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<fg1.l.a, c0<m.UserData>, tq.e<? super k10.l<? extends m>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f62896e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f62897f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m.Initialized O(u uVar, m.UserData userData) {
            return uVar.initialState;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f62897f;
            uq.b.e();
            if (this.f62896e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final u uVar = u.this;
            return c0Var.d(new er.l() { // from class: fg1.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.k.O(uVar, (m.UserData) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(fg1.l.a aVar, c0<m.UserData> c0Var, tq.e<? super k10.l<? extends m>> eVar) {
            k kVar = u.this.new k(eVar);
            kVar.f62897f = c0Var;
            return kVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lfg1/l$a;", "<unused var>", "Lk10/c0;", "Lfg1/m$b;", "state", "Lk10/l;", "Lfg1/m;", "<anonymous>", "(Lfg1/l$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<fg1.l.a, c0<m.Pkd>, tq.e<? super k10.l<? extends m>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f62899e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f62900f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m.Initialized O(u uVar, m.Pkd pkd) {
            return uVar.initialState;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f62900f;
            uq.b.e();
            if (this.f62899e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final u uVar = u.this;
            return c0Var.d(new er.l() { // from class: fg1.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.l.O(uVar, (m.Pkd) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(fg1.l.a aVar, c0<m.Pkd> c0Var, tq.e<? super k10.l<? extends m>> eVar) {
            l lVar = u.this.new l(eVar);
            lVar.f62900f = c0Var;
            return lVar.J(i0.f148189a);
        }
    }

    public u(yy.a aVar, ac4.n nVar, ac4.a aVar2, of1.b bVar, md1.a aVar3, bc4.f fVar, iy.a aVar4, gg1.a aVar5, gg1.k kVar, px.d dVar, gg1.l lVar, gg1.c cVar, CompanySuspensionWizardData companySuspensionWizardData) {
        this.openUriIntentUseCase = nVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.interactor = bVar;
        this.signBase64XmlUC = aVar3;
        this.getFileFromUriUseCase = fVar;
        this.base64Coder = aVar4;
        this.companyManagementApplicationMapper = aVar5;
        this.errorMapper = kVar;
        this.remoteLogger = dVar;
        this.mapper = lVar;
        this.summaryStatusEntryDataMapper = cVar;
        this.contract = companySuspensionWizardData;
        m.Initialized initialized = new m.Initialized(companySuspensionWizardData);
        this.initialState = initialized;
        this.stateMachine = aVar.a(initialized, new er.l() { // from class: fg1.t
            @Override // er.l
            public final Object b(Object obj) {
                return u.H9(this.f62812a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), F9(initialized));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Throwable C9(dx.b bVar) {
        dx.b.Generic generic = bVar instanceof dx.b.Generic ? (dx.b.Generic) bVar : null;
        if (generic != null) {
            return generic.getE();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object D9(gg1.k.c cVar, tq.e<? super i0> eVar) {
        Object objF = Y1().F(new fg1.l.e.Error(this.errorMapper.b(new gg1.k.Params(cVar, b9(fg1.l.b.f62765a), new er.l() { // from class: fg1.s
            @Override // er.l
            public final Object b(Object obj) {
                return u.E9(this.f62811a, (String) obj);
            }
        }, b9(fg1.l.e.b.f62769a)))), eVar);
        return objF == uq.b.e() ? objF : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E9(u uVar, String str) {
        uVar.d9(new fg1.l.SendApplication(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n.a F9(m state) {
        return this.mapper.b(new gg1.l.Params(state, b9(fg1.l.g.f62773a), b9(fg1.l.d.f62767a), b9(fg1.l.c.f62766a), b9(fg1.l.a.f62764a), b9(fg1.l.f.f62772a), b9(fg1.l.e.b.f62769a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H9(final u uVar, k10.v vVar) {
        vVar.c(q0.c(m.class), new er.l() { // from class: fg1.o
            @Override // er.l
            public final Object b(Object obj) {
                return u.I9(this.f62807a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(m.Initialized.class), new er.l() { // from class: fg1.p
            @Override // er.l
            public final Object b(Object obj) {
                return u.J9(this.f62808a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(m.UserData.class), new er.l() { // from class: fg1.q
            @Override // er.l
            public final Object b(Object obj) {
                return u.K9(this.f62809a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(m.Pkd.class), new er.l() { // from class: fg1.r
            @Override // er.l
            public final Object b(Object obj) {
                return u.L9(this.f62810a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I9(u uVar, k10.z zVar) {
        c cVar = uVar.new c(null);
        zVar.x(q0.c(fg1.l.e.class), k10.o.CANCEL_PREVIOUS, cVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J9(u uVar, k10.z zVar) {
        d dVar = uVar.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(fg1.l.a.class), oVar, dVar);
        zVar.v(q0.c(fg1.l.d.class), oVar, new e(null));
        zVar.v(q0.c(fg1.l.c.class), oVar, new f(null));
        zVar.x(q0.c(fg1.l.g.class), oVar, uVar.new g(null));
        zVar.v(q0.c(fg1.l.f.class), oVar, uVar.new h(null));
        zVar.x(q0.c(fg1.l.b.class), oVar, uVar.new i(zVar, null));
        zVar.x(q0.c(fg1.l.SendApplication.class), oVar, uVar.new j(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K9(u uVar, k10.z zVar) {
        k kVar = uVar.new k(null);
        zVar.v(q0.c(fg1.l.a.class), k10.o.CANCEL_PREVIOUS, kVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L9(u uVar, k10.z zVar) {
        l lVar = uVar.new l(null);
        zVar.v(q0.c(fg1.l.a.class), k10.o.CANCEL_PREVIOUS, lVar);
        return i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: G9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(n.a aVar) {
        super.P5(aVar);
    }

    @Override // zx.b
    public xw.b<fg1.l.e> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<m, fg1.l> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<n.a> getState() {
        return this.state;
    }
}
