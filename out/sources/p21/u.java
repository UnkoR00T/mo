package p21;

import fr.q0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006Bk\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0001\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ(\u0010'\u001a\u00020&2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0082@¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010/\u001a\u00020.2\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u0002022\u0006\u00101\u001a\u00020\u0002H\u0002¢\u0006\u0004\b3\u00104J\u0018\u00107\u001a\u00020&2\u0006\u00106\u001a\u000205H\u0096\u0001¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020&H\u0096\u0001¢\u0006\u0004\b9\u0010:R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010T\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR&\u0010Z\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030U8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR \u0010a\u001a\b\u0012\u0004\u0012\u00020\\0[8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R \u00101\u001a\b\u0012\u0004\u0012\u0002020b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010f¨\u0006g"}, d2 = {"Lp21/u;", "Ll00/g;", "Lp21/d;", "Lp21/a;", "Lp21/e;", "", "Li70/e;", "Lyy/a;", "stateMachineFactory", "Lmx/c;", "labelProvider", "Lk21/m;", "chatBotNavigationDialogMapper", "Lq21/b;", "chatBotRateConversationMapper", "Lib4/c;", "genericDomainErrorMapper", "Le21/a;", "interactor", "Lh21/b;", "checkIfMessageHasPersonalDataUseCase", "globalSnackBarManager", "Lcb4/j;", "dialogVMSFactory", "Lac4/a;", "callActionWithLoaderUC", "Lyw/b;", "accessibilityTalkBackManager", "Lp21/c;", "setupData", "<init>", "(Lyy/a;Lmx/c;Lk21/m;Lq21/b;Lib4/c;Le21/a;Lh21/b;Li70/e;Lcb4/j;Lac4/a;Lyw/b;Lp21/c;)V", "Liy/b0;", "conversationId", "Lg21/f;", "ratingScale", "", "description", "Loq/i0;", "E9", "(Liy/b0;Lg21/f;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Ldx/b$c;", "z9", "()Ldx/b$c;", "Ldx/b;", "domainError", "Ljb4/b;", "x9", "(Ldx/b;)Ljb4/b;", "state", "Lp21/e$a;", "A9", "(Lp21/d;)Lp21/e$a;", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lmx/c;", "c", "Lk21/m;", "d", "Lq21/b;", "e", "Lib4/c;", "f", "Le21/a;", "g", "Lh21/b;", "h", "Li70/e;", "j", "Lcb4/j;", "k", "Lac4/a;", "l", "Lyw/b;", "m", "Lp21/c;", "Lp21/d$c;", "n", "Lp21/d$c;", "initialState", "Lk10/t;", "p", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lp21/a$c;", "q", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "r", "Lmu/p0;", "getState", "()Lmu/p0;", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u extends l00.g<p21.d, p21.a> implements p21.e, zx.d, i70.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k21.m chatBotNavigationDialogMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final q21.b chatBotRateConversationMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final e21.a interactor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final h21.b checkIfMessageHasPersonalDataUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final cb4.j dialogVMSFactory;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUC;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final yw.b accessibilityTalkBackManager;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final p21.d.Screen initialState;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final k10.t<p21.d, p21.a> stateMachine;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final xw.b<p21.a.c> navAction;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final p0<p21.e.Data> state;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f151846e;

        a(tq.e<? super a> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f151846e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<p21.a.c> bVarY1 = u.this.Y1();
                p21.a.c.C3736c c3736c = p21.a.c.C3736c.f151779a;
                this.f151846e = 1;
                if (bVarY1.F(c3736c, this) == objE) {
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

        public final tq.e<i0> M(tq.e<?> eVar) {
            return u.this.new a(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((a) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f151848d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f151849e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f151850f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f151851g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f151852h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f151854k;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f151852h = obj;
            this.f151854k |= PKIFailureInfo.systemUnavail;
            return u.this.E9(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f151855e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ iy.b0 f151857g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ g21.f f151858h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f151859j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(iy.b0 b0Var, g21.f fVar, String str, tq.e<? super c> eVar) {
            super(1, eVar);
            this.f151857g = b0Var;
            this.f151858h = fVar;
            this.f151859j = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f151855e;
            if (i15 == 0) {
                oq.u.b(obj);
                e21.a aVar = u.this.interactor;
                iy.b0 b0Var = this.f151857g;
                g21.f fVar = this.f151858h;
                String str = this.f151859j;
                this.f151855e = 1;
                obj = aVar.d(b0Var, fVar, str, this);
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
            u uVar = u.this;
            if (iVar instanceof dx.i.Left) {
                uVar.d9(new p21.a.ShowError(uVar.z9()));
            } else {
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                uVar.y(new p50.a.DefaultWithIcon(uVar.labelProvider.c(a21.a.V), false, null, null, 14, null));
                uVar.d9(p21.a.b.f151776a);
            }
            return i0.f148189a;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return u.this.new c(this.f151857g, this.f151858h, this.f151859j, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((c) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements mu.g<p21.e.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f151860a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u f151861b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f151862a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ u f151863b;

            /* JADX INFO: renamed from: p21.u$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3738a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f151864d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f151865e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f151866f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f151868h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f151869j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f151870k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f151871l;

                public C3738a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f151864d = obj;
                    this.f151865e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, u uVar) {
                this.f151862a = hVar;
                this.f151863b = uVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3738a c3738a;
                if (eVar instanceof C3738a) {
                    c3738a = (C3738a) eVar;
                    int i15 = c3738a.f151865e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3738a.f151865e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3738a = new C3738a(eVar);
                    }
                } else {
                    c3738a = new C3738a(eVar);
                }
                Object obj2 = c3738a.f151864d;
                Object objE = uq.b.e();
                int i16 = c3738a.f151865e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f151862a;
                    p21.e.Data dataA9 = this.f151863b.A9((p21.d) obj);
                    c3738a.f151866f = vq.j.a(obj);
                    c3738a.f151868h = vq.j.a(c3738a);
                    c3738a.f151869j = vq.j.a(obj);
                    c3738a.f151870k = vq.j.a(hVar);
                    c3738a.f151871l = 0;
                    c3738a.f151865e = 1;
                    if (hVar.F(dataA9, c3738a) == objE) {
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

        public d(mu.g gVar, u uVar) {
            this.f151860a = gVar;
            this.f151861b = uVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super p21.e.Data> hVar, tq.e eVar) {
            Object objA = this.f151860a.a(new a(hVar, this.f151861b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lp21/a$a;", "<unused var>", "Lp21/d$c;", "Loq/i0;", "<anonymous>", "(Lp21/a$a;Lp21/d$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<p21.a.C3734a, p21.d.Screen, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f151872e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f151872e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<p21.a.c> bVarY1 = u.this.Y1();
                p21.a.c.C3735a c3735a = p21.a.c.C3735a.f151777a;
                this.f151872e = 1;
                if (bVarY1.F(c3735a, this) == objE) {
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
        public final Object w(p21.a.C3734a c3734a, p21.d.Screen screen, tq.e<? super i0> eVar) {
            return u.this.new e(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lp21/a$b;", "<unused var>", "Lp21/d$c;", "Loq/i0;", "<anonymous>", "(Lp21/a$b;Lp21/d$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<p21.a.b, p21.d.Screen, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f151874e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f151874e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<p21.a.c> bVarY1 = u.this.Y1();
                p21.a.c.C3736c c3736c = p21.a.c.C3736c.f151779a;
                this.f151874e = 1;
                if (bVarY1.F(c3736c, this) == objE) {
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
        public final Object w(p21.a.b bVar, p21.d.Screen screen, tq.e<? super i0> eVar) {
            return u.this.new f(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lp21/a$d;", "action", "Lk10/c0;", "Lp21/d$c;", "state", "Lk10/l;", "Lp21/d;", "<anonymous>", "(Lp21/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<p21.a.OnCharsLimitReached, k10.c0<p21.d.Screen>, tq.e<? super k10.l<? extends p21.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f151876e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f151877f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f151878g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p21.d.Screen O(p21.a.OnCharsLimitReached onCharsLimitReached, p21.d.Screen screen) {
            return screen.a(p21.d.Data.b(screen.getData(), null, null, onCharsLimitReached.getCharsLimitReached(), null, 11, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final p21.a.OnCharsLimitReached onCharsLimitReached = (p21.a.OnCharsLimitReached) this.f151877f;
            k10.c0 c0Var = (k10.c0) this.f151878g;
            uq.b.e();
            if (this.f151876e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: p21.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.g.O(onCharsLimitReached, (d.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(p21.a.OnCharsLimitReached onCharsLimitReached, k10.c0<p21.d.Screen> c0Var, tq.e<? super k10.l<? extends p21.d>> eVar) {
            g gVar = new g(eVar);
            gVar.f151877f = onCharsLimitReached;
            gVar.f151878g = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lp21/a$h;", "action", "Lk10/c0;", "Lp21/d$c;", "state", "Lk10/l;", "Lp21/d;", "<anonymous>", "(Lp21/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<p21.a.ShowDialog, k10.c0<p21.d.Screen>, tq.e<? super k10.l<? extends p21.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f151879e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f151880f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f151881g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p21.d.Dialog O(u uVar, p21.a.ShowDialog showDialog, p21.d.Screen screen) {
            return new p21.d.Dialog(screen.getData(), uVar.dialogVMSFactory.a(uVar.chatBotNavigationDialogMapper.b(new k21.m.Params(showDialog.getDialogType()))));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final p21.a.ShowDialog showDialog = (p21.a.ShowDialog) this.f151880f;
            k10.c0 c0Var = (k10.c0) this.f151881g;
            uq.b.e();
            if (this.f151879e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final u uVar = u.this;
            return c0Var.d(new er.l() { // from class: p21.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.h.O(uVar, showDialog, (d.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(p21.a.ShowDialog showDialog, k10.c0<p21.d.Screen> c0Var, tq.e<? super k10.l<? extends p21.d>> eVar) {
            h hVar = u.this.new h(eVar);
            hVar.f151880f = showDialog;
            hVar.f151881g = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lp21/a$i;", "action", "Lp21/d$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lp21/a$i;Lp21/d$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<p21.a.ShowError, p21.d.Screen, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f151883e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f151884f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            p21.a.ShowError showError = (p21.a.ShowError) this.f151884f;
            Object objE = uq.b.e();
            int i15 = this.f151883e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<p21.a.c> bVarY1 = u.this.Y1();
                p21.a.c.Error error = new p21.a.c.Error(u.this.x9(showError.getDomainError()));
                this.f151884f = vq.j.a(showError);
                this.f151883e = 1;
                if (bVarY1.F(error, this) == objE) {
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
        public final Object w(p21.a.ShowError showError, p21.d.Screen screen, tq.e<? super i0> eVar) {
            i iVar = u.this.new i(eVar);
            iVar.f151884f = showError;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lp21/a$e;", "action", "Lk10/c0;", "Lp21/d$c;", "state", "Lk10/l;", "Lp21/d;", "<anonymous>", "(Lp21/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<p21.a.OnDescriptionChanged, k10.c0<p21.d.Screen>, tq.e<? super k10.l<? extends p21.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f151886e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f151887f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f151888g;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p21.d.Screen O(p21.a.OnDescriptionChanged onDescriptionChanged, p21.d.Screen screen) {
            return screen.a(p21.d.Data.b(screen.getData(), null, onDescriptionChanged.getDescription(), false, null, 13, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final p21.a.OnDescriptionChanged onDescriptionChanged = (p21.a.OnDescriptionChanged) this.f151887f;
            k10.c0 c0Var = (k10.c0) this.f151888g;
            uq.b.e();
            if (this.f151886e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: p21.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.j.O(onDescriptionChanged, (d.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(p21.a.OnDescriptionChanged onDescriptionChanged, k10.c0<p21.d.Screen> c0Var, tq.e<? super k10.l<? extends p21.d>> eVar) {
            j jVar = new j(eVar);
            jVar.f151887f = onDescriptionChanged;
            jVar.f151888g = c0Var;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lp21/a$g;", "<unused var>", "Lp21/d$c;", "snapshot", "Loq/i0;", "<anonymous>", "(Lp21/a$g;Lp21/d$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<p21.a.g, p21.d.Screen, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f151889e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f151890f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            p21.d.Screen screen = (p21.d.Screen) this.f151890f;
            Object objE = uq.b.e();
            int i15 = this.f151889e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (screen.getData().g()) {
                    u uVar = u.this;
                    iy.b0 conversationId = screen.getData().getConversationId();
                    g21.f ratingScale = screen.getData().getRatingScale();
                    String description = screen.getData().getDescription();
                    this.f151890f = vq.j.a(screen);
                    this.f151889e = 1;
                    if (uVar.E9(conversationId, ratingScale, description, this) == objE) {
                        return objE;
                    }
                } else {
                    u.this.d9(p21.a.b.f151776a);
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
        public final Object w(p21.a.g gVar, p21.d.Screen screen, tq.e<? super i0> eVar) {
            k kVar = u.this.new k(eVar);
            kVar.f151890f = screen;
            return kVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lp21/a$f;", "action", "Lk10/c0;", "Lp21/d$c;", "state", "Lk10/l;", "Lp21/d;", "<anonymous>", "(Lp21/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<p21.a.OnRatingSelected, k10.c0<p21.d.Screen>, tq.e<? super k10.l<? extends p21.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f151892e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f151893f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f151894g;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p21.d.Screen O(p21.a.OnRatingSelected onRatingSelected, p21.d.Screen screen) {
            return screen.a(p21.d.Data.b(screen.getData(), null, null, false, onRatingSelected.getRatingScale(), 7, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final p21.a.OnRatingSelected onRatingSelected = (p21.a.OnRatingSelected) this.f151893f;
            k10.c0 c0Var = (k10.c0) this.f151894g;
            uq.b.e();
            if (this.f151892e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            k10.l lVarB = c0Var.b(new er.l() { // from class: p21.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.l.O(onRatingSelected, (d.Screen) obj2);
                }
            });
            u.this.accessibilityTalkBackManager.a(onRatingSelected.getAccessibilityMessage());
            return lVarB;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(p21.a.OnRatingSelected onRatingSelected, k10.c0<p21.d.Screen> c0Var, tq.e<? super k10.l<? extends p21.d>> eVar) {
            l lVar = u.this.new l(eVar);
            lVar.f151893f = onRatingSelected;
            lVar.f151894g = c0Var;
            return lVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lp21/b;", "<unused var>", "Lk10/c0;", "Lp21/d$b;", "state", "Lk10/l;", "Lp21/d;", "<anonymous>", "(Lp21/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<p21.b, k10.c0<p21.d.Dialog>, tq.e<? super k10.l<? extends p21.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f151896e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f151897f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p21.d.Screen O(p21.d.Dialog dialog) {
            return new p21.d.Screen(dialog.getData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f151897f;
            uq.b.e();
            if (this.f151896e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: p21.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.m.O((d.Dialog) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(p21.b bVar, k10.c0<p21.d.Dialog> c0Var, tq.e<? super k10.l<? extends p21.d>> eVar) {
            m mVar = new m(eVar);
            mVar.f151897f = c0Var;
            return mVar.J(i0.f148189a);
        }
    }

    public u(yy.a aVar, mx.c cVar, k21.m mVar, q21.b bVar, ib4.c cVar2, e21.a aVar2, h21.b bVar2, i70.e eVar, cb4.j jVar, ac4.a aVar3, yw.b bVar3, SetupData setupData) {
        this.labelProvider = cVar;
        this.chatBotNavigationDialogMapper = mVar;
        this.chatBotRateConversationMapper = bVar;
        this.genericDomainErrorMapper = cVar2;
        this.interactor = aVar2;
        this.checkIfMessageHasPersonalDataUseCase = bVar2;
        this.globalSnackBarManager = eVar;
        this.dialogVMSFactory = jVar;
        this.callActionWithLoaderUC = aVar3;
        this.accessibilityTalkBackManager = bVar3;
        this.setupData = setupData;
        p21.d.Screen screen = new p21.d.Screen(new p21.d.Data(setupData.getConversationId(), null, false, null, 14, null));
        this.initialState = screen;
        this.stateMachine = aVar.a(screen, new er.l() { // from class: p21.t
            @Override // er.l
            public final Object b(Object obj) {
                return u.G9(this.f151830a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new d(e9().getState(), this), A9(screen));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p21.e.Data A9(p21.d state) {
        return this.chatBotRateConversationMapper.b(new q21.b.Params(state, new er.l() { // from class: p21.n
            @Override // er.l
            public final Object b(Object obj) {
                return u.B9(this.f151825a, (String) obj);
            }
        }, new er.l() { // from class: p21.o
            @Override // er.l
            public final Object b(Object obj) {
                return u.C9(this.f151826a, ((Boolean) obj).booleanValue());
            }
        }, new er.p() { // from class: p21.p
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return u.D9(this.f151827a, (g21.f) obj, (String) obj2);
            }
        }, b9(p21.a.g.f151784a), b9(p21.a.C3734a.f151775a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(u uVar, String str) {
        uVar.d9(new p21.a.OnDescriptionChanged(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(u uVar, boolean z15) {
        uVar.d9(new p21.a.OnCharsLimitReached(z15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(u uVar, g21.f fVar, String str) {
        uVar.d9(new p21.a.OnRatingSelected(fVar, str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b8, code lost:
    
        if (ac4.a.a(r1, null, r3, r4, 1, null) == r0) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E9(iy.b0 r12, g21.f r13, java.lang.String r14, tq.e<? super oq.i0> r15) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r15 instanceof p21.u.b
            if (r0 == 0) goto L14
            r0 = r15
            p21.u$b r0 = (p21.u.b) r0
            int r1 = r0.f151854k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f151854k = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            p21.u$b r0 = new p21.u$b
            r0.<init>(r15)
            goto L12
        L1a:
            java.lang.Object r15 = r4.f151852h
            java.lang.Object r0 = uq.b.e()
            int r1 = r4.f151854k
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L58
            if (r1 == r3) goto L43
            if (r1 != r2) goto L3b
            java.lang.Object r12 = r4.f151850f
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r12 = r4.f151849e
            g21.f r12 = (g21.f) r12
            java.lang.Object r12 = r4.f151848d
            iy.b0 r12 = (iy.b0) r12
            oq.u.b(r15)
            goto Lbb
        L3b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L43:
            java.lang.Object r12 = r4.f151850f
            r14 = r12
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r12 = r4.f151849e
            r13 = r12
            g21.f r13 = (g21.f) r13
            java.lang.Object r12 = r4.f151848d
            iy.b0 r12 = (iy.b0) r12
            oq.u.b(r15)
        L54:
            r7 = r12
            r8 = r13
            r9 = r14
            goto L71
        L58:
            oq.u.b(r15)
            h21.b r15 = r11.checkIfMessageHasPersonalDataUseCase
            h21.b$a r1 = new h21.b$a
            r1.<init>(r14)
            r4.f151848d = r12
            r4.f151849e = r13
            r4.f151850f = r14
            r4.f151854k = r3
            java.lang.Object r15 = r15.c(r1, r4)
            if (r15 != r0) goto L54
            goto Lba
        L71:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r12 = r15.booleanValue()
            if (r12 == 0) goto L91
            p21.a$h r12 = new p21.a$h
            k21.o$c r13 = new k21.o$c
            int r14 = a21.a.O
            p21.b r15 = p21.b.f151787a
            er.a r15 = r11.b9(r15)
            r13.<init>(r14, r15)
            r12.<init>(r13)
            r11.d9(r12)
            oq.i0 r12 = oq.i0.f148189a
            return r12
        L91:
            ac4.a r1 = r11.callActionWithLoaderUC
            p21.u$c r3 = new p21.u$c
            r10 = 0
            r6 = r11
            r5 = r3
            r5.<init>(r7, r8, r9, r10)
            java.lang.Object r13 = vq.j.a(r7)
            r4.f151848d = r13
            java.lang.Object r13 = vq.j.a(r8)
            r4.f151849e = r13
            java.lang.Object r13 = vq.j.a(r9)
            r4.f151850f = r13
            r4.f151851g = r12
            r4.f151854k = r2
            r2 = 0
            r5 = 1
            r6 = 0
            java.lang.Object r12 = ac4.a.a(r1, r2, r3, r4, r5, r6)
            if (r12 != r0) goto Lbb
        Lba:
            return r0
        Lbb:
            oq.i0 r12 = oq.i0.f148189a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p21.u.E9(iy.b0, g21.f, java.lang.String, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G9(final u uVar, k10.v vVar) {
        vVar.c(q0.c(p21.d.Screen.class), new er.l() { // from class: p21.q
            @Override // er.l
            public final Object b(Object obj) {
                return u.H9(this.f151828a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(p21.d.Dialog.class), new er.l() { // from class: p21.r
            @Override // er.l
            public final Object b(Object obj) {
                return u.I9((k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H9(u uVar, k10.z zVar) {
        e eVar = uVar.new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(p21.a.C3734a.class), oVar, eVar);
        zVar.x(q0.c(p21.a.b.class), oVar, uVar.new f(null));
        zVar.v(q0.c(p21.a.OnCharsLimitReached.class), oVar, new g(null));
        zVar.v(q0.c(p21.a.ShowDialog.class), oVar, uVar.new h(null));
        zVar.x(q0.c(p21.a.ShowError.class), oVar, uVar.new i(null));
        zVar.v(q0.c(p21.a.OnDescriptionChanged.class), oVar, new j(null));
        zVar.x(q0.c(p21.a.g.class), oVar, uVar.new k(null));
        zVar.v(q0.c(p21.a.OnRatingSelected.class), oVar, uVar.new l(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I9(k10.z zVar) {
        m mVar = new m(null);
        zVar.v(q0.c(p21.b.class), k10.o.CANCEL_PREVIOUS, mVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b x9(dx.b domainError) {
        return this.genericDomainErrorMapper.b(new ib4.c.Params(domainError, false, new er.l() { // from class: p21.s
            @Override // er.l
            public final Object b(Object obj) {
                return u.y9(this.f151829a, (ib4.c.b) obj);
            }
        }, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(u uVar, ib4.c.b bVar) {
        if (bVar instanceof ib4.c.b.a.Secondary) {
            i00.a.a(uVar, uVar.new a(null));
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dx.b.Business z9() {
        return new dx.b.Business(null, null, this.labelProvider.c(a21.a.N), null, null, this.labelProvider.c(a21.a.f2114s0), this.labelProvider.c(a21.a.f2125z), 27, null);
    }

    @Override // i70.e
    public void B0() {
        this.globalSnackBarManager.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: F9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }

    @Override // zx.b
    public xw.b<p21.a.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<p21.d, p21.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<p21.e.Data> getState() {
        return this.state;
    }

    @Override // i70.e
    public void y(p50.a snackBarData) {
        this.globalSnackBarManager.y(snackBarData);
    }
}
