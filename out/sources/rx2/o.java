package rx2;

import al0.BEGenerateXmlResponse;
import fr.q0;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006Bc\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b \u0010!J\u0018\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\"H\u0096\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020$H\u0096\u0001¢\u0006\u0004\b'\u0010(R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0014\u0010A\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R,\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030B8\u0014X\u0094\u0004¢\u0006\u0012\n\u0004\bC\u0010D\u0012\u0004\bG\u0010(\u001a\u0004\bE\u0010FR \u0010O\u001a\b\u0012\u0004\u0012\u00020J0I8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0P8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T¨\u0006U"}, d2 = {"Lrx2/o;", "Ll00/g;", "Lrx2/b;", "Lrx2/a;", "Lrx2/c;", "", "Li70/e;", "Lyy/a;", "stateMachineFactory", "Ltx2/l;", "mapper", "globalSnackBarManager", "Lac4/a;", "callActionWithLoaderUseCase", "Lvv2/a;", "generateApplicationXmlUC", "Lwz3/j;", "signBase64XmlUC", "Lvv2/b;", "submitXmlWithTokenUC", "Lib4/c;", "genericDomainErrorMapper", "Lyw/b;", "accessibilityTalkBackManager", "Lmx/c;", "labelProvider", "Lsx2/a;", "contract", "<init>", "(Lyy/a;Ltx2/l;Li70/e;Lac4/a;Lvv2/a;Lwz3/j;Lvv2/b;Lib4/c;Lyw/b;Lmx/c;Lsx2/a;)V", "state", "Lrx2/c$a;", "w9", "(Lrx2/b;)Lrx2/c$a;", "Lp50/a;", "snackBarData", "Loq/i0;", "y", "(Lp50/a;)V", "B0", "()V", "b", "Ltx2/l;", "c", "Li70/e;", "d", "Lac4/a;", "e", "Lvv2/a;", "f", "Lwz3/j;", "g", "Lvv2/b;", "h", "Lib4/c;", "j", "Lyw/b;", "k", "Lmx/c;", "l", "Lsx2/a;", "v9", "()Lsx2/a;", "m", "Lrx2/b;", "initialState", "Lk10/t;", "n", "Lk10/t;", "e9", "()Lk10/t;", "getStateMachine$annotations", "stateMachine", "Lxw/b;", "Lrx2/a$c;", "p", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "q", "Lmu/p0;", "getState", "()Lmu/p0;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o extends l00.g<State, rx2.a> implements rx2.c, zx.d, i70.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final tx2.l mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final vv2.a generateApplicationXmlUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final wz3.j signBase64XmlUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final vv2.b submitXmlWithTokenUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final yw.b accessibilityTalkBackManager;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final sx2.a contract;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, rx2.a> stateMachine;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final xw.b<rx2.a.c> navAction;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final p0<rx2.c.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<rx2.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f176720a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f176721b;

        /* JADX INFO: renamed from: rx2.o$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4512a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f176722a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ o f176723b;

            /* JADX INFO: renamed from: rx2.o$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4513a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f176724d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f176725e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f176726f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f176728h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f176729j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f176730k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f176731l;

                public C4513a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f176724d = obj;
                    this.f176725e |= PKIFailureInfo.systemUnavail;
                    return C4512a.this.F(null, this);
                }
            }

            public C4512a(mu.h hVar, o oVar) {
                this.f176722a = hVar;
                this.f176723b = oVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4513a c4513a;
                if (eVar instanceof C4513a) {
                    c4513a = (C4513a) eVar;
                    int i15 = c4513a.f176725e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4513a.f176725e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4513a = new C4513a(eVar);
                    }
                } else {
                    c4513a = new C4513a(eVar);
                }
                Object obj2 = c4513a.f176724d;
                Object objE = uq.b.e();
                int i16 = c4513a.f176725e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f176722a;
                    rx2.c.Data dataW9 = this.f176723b.w9((State) obj);
                    c4513a.f176726f = vq.j.a(obj);
                    c4513a.f176728h = vq.j.a(c4513a);
                    c4513a.f176729j = vq.j.a(obj);
                    c4513a.f176730k = vq.j.a(hVar);
                    c4513a.f176731l = 0;
                    c4513a.f176725e = 1;
                    if (hVar.F(dataW9, c4513a) == objE) {
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

        public a(mu.g gVar, o oVar) {
            this.f176720a = gVar;
            this.f176721b = oVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super rx2.c.Data> hVar, tq.e eVar) {
            Object objA = this.f176720a.a(new C4512a(hVar, this.f176721b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lrx2/a$d;", "<unused var>", "Lrx2/b;", "Loq/i0;", "<anonymous>", "(Lrx2/a$d;Lrx2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<rx2.a.d, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f176732e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f176732e;
            if (i15 == 0) {
                oq.u.b(obj);
                o oVar = o.this;
                rx2.a.c.C4510a c4510a = rx2.a.c.C4510a.f176660a;
                this.f176732e = 1;
                if (oVar.F(c4510a, this) == objE) {
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
        public final Object w(rx2.a.d dVar, State state, tq.e<? super i0> eVar) {
            return o.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lrx2/a$g;", "<unused var>", "Lrx2/b;", "Loq/i0;", "<anonymous>", "(Lrx2/a$g;Lrx2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<rx2.a.g, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f176734e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f176734e;
            if (i15 == 0) {
                oq.u.b(obj);
                o oVar = o.this;
                rx2.a.c.b bVar = rx2.a.c.b.f176661a;
                this.f176734e = 1;
                if (oVar.F(bVar, this) == objE) {
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
        public final Object w(rx2.a.g gVar, State state, tq.e<? super i0> eVar) {
            return o.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lrx2/a$a;", "action", "Lk10/c0;", "Lrx2/b;", "state", "Lk10/l;", "<anonymous>", "(Lrx2/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<rx2.a.GenerateXml, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f176736e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f176737f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f176738g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lrx2/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends State>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f176740e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ o f176741f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ c0<State> f176742g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ rx2.a.GenerateXml f176743h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(o oVar, c0<State> c0Var, rx2.a.GenerateXml generateXml, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f176741f = oVar;
                this.f176742g = c0Var;
                this.f176743h = generateXml;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f176740e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    vv2.a aVar = this.f176741f.generateApplicationXmlUC;
                    vv2.a.Params params = new vv2.a.Params(this.f176742g.a().getData(), this.f176743h.getOwnerWithAge());
                    this.f176740e = 1;
                    obj = aVar.f(params, this);
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
                o oVar = this.f176741f;
                rx2.a.GenerateXml generateXml = this.f176743h;
                if (iVar instanceof dx.i.Left) {
                    oVar.d9(new rx2.a.OnError((k44.a) ((dx.i.Left) iVar).b(), generateXml, generateXml.getOwnerWithAge()));
                } else {
                    if (!(iVar instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    oVar.d9(new rx2.a.SubmitXml((BEGenerateXmlResponse) ((dx.i.Right) iVar).b(), generateXml.getOwnerWithAge()));
                }
                return this.f176742g.c();
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f176741f, this.f176742g, this.f176743h, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<State>> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, null, false, true, true, 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            rx2.a.GenerateXml generateXml = (rx2.a.GenerateXml) this.f176737f;
            c0 c0Var = (c0) this.f176738g;
            Object objE = uq.b.e();
            int i15 = this.f176736e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            if (!((State) c0Var.a()).getIsStatementChecked()) {
                o.this.accessibilityTalkBackManager.a(o.this.labelProvider.c(gv2.a.f77256g0).getText());
                return c0Var.b(new er.l() { // from class: rx2.p
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return o.d.O((State) obj2);
                    }
                });
            }
            ac4.a aVar = o.this.callActionWithLoaderUseCase;
            a aVar2 = new a(o.this, c0Var, generateXml, null);
            this.f176737f = vq.j.a(generateXml);
            this.f176738g = vq.j.a(c0Var);
            this.f176736e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(rx2.a.GenerateXml generateXml, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = o.this.new d(eVar);
            dVar.f176737f = generateXml;
            dVar.f176738g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lrx2/a$i;", "action", "Lrx2/b;", "state", "Loq/i0;", "<anonymous>", "(Lrx2/a$i;Lrx2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<rx2.a.SubmitXml, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f176744e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f176745f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f176746g;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f176748e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f176749f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f176750g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f176751h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f176752j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ o f176753k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ rx2.a.SubmitXml f176754l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ State f176755m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(o oVar, rx2.a.SubmitXml submitXml, State state, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f176753k = oVar;
                this.f176754l = submitXml;
                this.f176755m = state;
            }

            /* JADX WARN: Code duplicated, block: B:31:0x00e0  */
            /* JADX WARN: Code duplicated, block: B:32:0x00f5  */
            /* JADX WARN: Code duplicated, block: B:34:0x00f9  */
            /* JADX WARN: Code duplicated, block: B:39:0x0127  */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x00d3, code lost:
            
                if (r2 == r1) goto L36;
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x0121, code lost:
            
                if (r4.F(r8, r17) == r1) goto L36;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r18) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 313
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: rx2.o.e.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f176753k, this.f176754l, this.f176755m, eVar);
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
            rx2.a.SubmitXml submitXml = (rx2.a.SubmitXml) this.f176745f;
            State state = (State) this.f176746g;
            Object objE = uq.b.e();
            int i15 = this.f176744e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.a aVar = o.this.callActionWithLoaderUseCase;
                a aVar2 = new a(o.this, submitXml, state, null);
                this.f176745f = vq.j.a(submitXml);
                this.f176746g = vq.j.a(state);
                this.f176744e = 1;
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
        public final Object w(rx2.a.SubmitXml submitXml, State state, tq.e<? super i0> eVar) {
            e eVar2 = o.this.new e(eVar);
            eVar2.f176745f = submitXml;
            eVar2.f176746g = state;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lrx2/a$h;", "action", "Lk10/c0;", "Lrx2/b;", "state", "Lk10/l;", "<anonymous>", "(Lrx2/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<rx2.a.OnStatementChecked, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f176756e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f176757f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f176758g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(rx2.a.OnStatementChecked onStatementChecked, State state) {
            return State.b(state, null, onStatementChecked.getChecked(), false, false, 9, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final rx2.a.OnStatementChecked onStatementChecked = (rx2.a.OnStatementChecked) this.f176757f;
            c0 c0Var = (c0) this.f176758g;
            uq.b.e();
            if (this.f176756e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: rx2.q
                @Override // er.l
                public final Object b(Object obj2) {
                    return o.f.O(onStatementChecked, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(rx2.a.OnStatementChecked onStatementChecked, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            f fVar = new f(eVar);
            fVar.f176757f = onStatementChecked;
            fVar.f176758g = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lrx2/a$f;", "<unused var>", "Lk10/c0;", "Lrx2/b;", "state", "Lk10/l;", "<anonymous>", "(Lrx2/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<rx2.a.f, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f176759e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f176760f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, null, false, false, false, 7, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f176760f;
            uq.b.e();
            if (this.f176759e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: rx2.r
                @Override // er.l
                public final Object b(Object obj2) {
                    return o.g.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(rx2.a.f fVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            g gVar = new g(eVar);
            gVar.f176760f = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lrx2/a$e;", "action", "Lrx2/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lrx2/a$e;Lrx2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<rx2.a.OnError, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f176761e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f176762f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f176763g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(o oVar, rx2.a.OnError onError, ib4.c.b bVar) {
            if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                oVar.d9(onError.getRetryAction());
            }
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final rx2.a.OnError onError = (rx2.a.OnError) this.f176763g;
            Object objE = uq.b.e();
            int i15 = this.f176762f;
            if (i15 == 0) {
                oq.u.b(obj);
                k44.a error = onError.getError();
                if (error instanceof k44.a.Domain) {
                    xw.b<rx2.a.c> bVarY1 = o.this.Y1();
                    ib4.c cVar = o.this.genericDomainErrorMapper;
                    dx.b domain = ((k44.a.Domain) error).getDomain();
                    final o oVar = o.this;
                    rx2.a.c.GoToError goToError = new rx2.a.c.GoToError(cVar.b(new ib4.c.Params(domain, false, new er.l() { // from class: rx2.s
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return o.h.O(oVar, onError, (ib4.c.b) obj2);
                        }
                    }, 2, null)));
                    this.f176763g = vq.j.a(onError);
                    this.f176761e = vq.j.a(error);
                    this.f176762f = 1;
                    if (bVarY1.F(goToError, this) == objE) {
                        return objE;
                    }
                } else {
                    if (!fr.t.c(error, k44.a.b.f108417a)) {
                        throw new oq.p();
                    }
                    o.this.d9(new rx2.a.GoToEdorAuth(onError.getRetryAction()));
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
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(rx2.a.OnError onError, State state, tq.e<? super i0> eVar) {
            h hVar = o.this.new h(eVar);
            hVar.f176763g = onError;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lrx2/a$b;", "action", "Lrx2/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lrx2/a$b;Lrx2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<rx2.a.GoToEdorAuth, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f176765e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f176766f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            rx2.a.GoToEdorAuth goToEdorAuth = (rx2.a.GoToEdorAuth) this.f176766f;
            Object objE = uq.b.e();
            int i15 = this.f176765e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<rx2.a.c> bVarY1 = o.this.Y1();
                rx2.a.c.GoToEdorAuth goToEdorAuth2 = new rx2.a.c.GoToEdorAuth(o.this.b9(goToEdorAuth.getRetryAction()));
                this.f176766f = vq.j.a(goToEdorAuth);
                this.f176765e = 1;
                if (bVarY1.F(goToEdorAuth2, this) == objE) {
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
        public final Object w(rx2.a.GoToEdorAuth goToEdorAuth, State state, tq.e<? super i0> eVar) {
            i iVar = o.this.new i(eVar);
            iVar.f176766f = goToEdorAuth;
            return iVar.J(i0.f148189a);
        }
    }

    public o(yy.a aVar, tx2.l lVar, i70.e eVar, ac4.a aVar2, vv2.a aVar3, wz3.j jVar, vv2.b bVar, ib4.c cVar, yw.b bVar2, mx.c cVar2, sx2.a aVar4) {
        this.mapper = lVar;
        this.globalSnackBarManager = eVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.generateApplicationXmlUC = aVar3;
        this.signBase64XmlUC = jVar;
        this.submitXmlWithTokenUC = bVar;
        this.genericDomainErrorMapper = cVar;
        this.accessibilityTalkBackManager = bVar2;
        this.labelProvider = cVar2;
        this.contract = aVar4;
        State state = new State(aVar4.c(), false, false, false, 14, null);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: rx2.n
            @Override // er.l
            public final Object b(Object obj) {
                return o.A9(this.f176705a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), w9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(final o oVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: rx2.m
            @Override // er.l
            public final Object b(Object obj) {
                return o.B9(this.f176704a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(o oVar, z zVar) {
        b bVar = oVar.new b(null);
        k10.o oVar2 = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(rx2.a.d.class), oVar2, bVar);
        zVar.x(q0.c(rx2.a.g.class), oVar2, oVar.new c(null));
        zVar.v(q0.c(rx2.a.GenerateXml.class), oVar2, oVar.new d(null));
        zVar.x(q0.c(rx2.a.SubmitXml.class), oVar2, oVar.new e(null));
        zVar.v(q0.c(rx2.a.OnStatementChecked.class), oVar2, new f(null));
        zVar.v(q0.c(rx2.a.f.class), oVar2, new g(null));
        zVar.x(q0.c(rx2.a.OnError.class), oVar2, oVar.new h(null));
        zVar.x(q0.c(rx2.a.GoToEdorAuth.class), oVar2, oVar.new i(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final rx2.c.Data w9(State state) {
        return this.mapper.b(new tx2.l.Params(state, new er.l() { // from class: rx2.k
            @Override // er.l
            public final Object b(Object obj) {
                return o.x9(this.f176702a, (al0.g) obj);
            }
        }, new er.l() { // from class: rx2.l
            @Override // er.l
            public final Object b(Object obj) {
                return o.y9(this.f176703a, ((Boolean) obj).booleanValue());
            }
        }, b9(rx2.a.f.f176669a), b9(rx2.a.d.f176665a), b9(rx2.a.g.f176670a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(o oVar, al0.g gVar) {
        oVar.d9(new rx2.a.GenerateXml(gVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(o oVar, boolean z15) {
        oVar.d9(new rx2.a.OnStatementChecked(z15));
        return i0.f148189a;
    }

    @Override // i70.e
    public void B0() {
        this.globalSnackBarManager.B0();
    }

    @Override // zx.b
    public xw.b<rx2.a.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, rx2.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<rx2.c.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: u9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(rx2.a.c cVar, tq.e<? super i0> eVar) {
        return super.F(cVar, eVar);
    }

    /* JADX INFO: renamed from: v9, reason: from getter */
    public final sx2.a getContract() {
        return this.contract;
    }

    @Override // i70.e
    public void y(p50.a snackBarData) {
        this.globalSnackBarManager.y(snackBarData);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: z9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(sx2.a aVar) {
        super.P5(aVar);
    }
}
