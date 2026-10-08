package e22;

import a14.w;
import eo0.BEDictionaryAdditionalInformation;
import eo0.y0;
import fr.q0;
import k10.c0;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003BC\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0017\u0010)\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R&\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030*8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R \u00106\u001a\b\u0012\u0004\u0012\u000201008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u0016078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;¨\u0006<"}, d2 = {"Le22/o;", "Ll00/g;", "Le22/f;", "", "Le22/g;", "Lyy/a;", "stateMachineFactory", "Lf22/c;", "chooseMessageTypeMapper", "Lp02/n;", "getComplainAdditionalInformationUC", "Lx02/b;", "addRecipientWithServiceTypeValidationUC", "La14/w;", "openUrlIntentUseCase", "Li70/e;", "globalSnackBarManager", "Lm22/h;", "messageWizardContract", "<init>", "(Lyy/a;Lf22/c;Lp02/n;Lx02/b;La14/w;Li70/e;Lm22/h;)V", "state", "Le22/g$a;", "q9", "(Le22/f;)Le22/g$a;", "b", "Lf22/c;", "c", "Lp02/n;", "d", "Lx02/b;", "e", "La14/w;", "f", "Li70/e;", "g", "Lm22/h;", "h", "Le22/f;", "getInitialState", "()Le22/f;", "initialState", "Lk10/t;", "j", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Le22/d;", "k", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "l", "Lmu/p0;", "getState", "()Lmu/p0;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o extends l00.g<State, Object> implements g, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f22.c chooseMessageTypeMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p02.n getComplainAdditionalInformationUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final x02.b addRecipientWithServiceTypeValidationUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final w openUrlIntentUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final m22.h messageWizardContract;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final xw.b<e22.d> navAction;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final p0<g.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<g.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f46967a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f46968b;

        /* JADX INFO: renamed from: e22.o$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C1070a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f46969a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ o f46970b;

            /* JADX INFO: renamed from: e22.o$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1071a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f46971d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f46972e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f46973f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f46975h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f46976j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f46977k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f46978l;

                public C1071a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f46971d = obj;
                    this.f46972e |= PKIFailureInfo.systemUnavail;
                    return C1070a.this.F(null, this);
                }
            }

            public C1070a(mu.h hVar, o oVar) {
                this.f46969a = hVar;
                this.f46970b = oVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1071a c1071a;
                if (eVar instanceof C1071a) {
                    c1071a = (C1071a) eVar;
                    int i15 = c1071a.f46972e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1071a.f46972e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1071a = new C1071a(eVar);
                    }
                } else {
                    c1071a = new C1071a(eVar);
                }
                Object obj2 = c1071a.f46971d;
                Object objE = uq.b.e();
                int i16 = c1071a.f46972e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f46969a;
                    g.Data dataQ9 = this.f46970b.q9((State) obj);
                    c1071a.f46973f = vq.j.a(obj);
                    c1071a.f46975h = vq.j.a(c1071a);
                    c1071a.f46976j = vq.j.a(obj);
                    c1071a.f46977k = vq.j.a(hVar);
                    c1071a.f46978l = 0;
                    c1071a.f46972e = 1;
                    if (hVar.F(dataQ9, c1071a) == objE) {
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
            this.f46967a = gVar;
            this.f46968b = oVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super g.Data> hVar, tq.e eVar) {
            Object objA = this.f46967a.a(new C1070a(hVar, this.f46968b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lk10/c0;", "Le22/f;", "state", "Lk10/l;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f46979e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f46980f;

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State V(State state) {
            return state.a(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State X(BEDictionaryAdditionalInformation bEDictionaryAdditionalInformation, State state) {
            return state.a(bEDictionaryAdditionalInformation);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f46980f;
            Object objE = uq.b.e();
            int i15 = this.f46979e;
            if (i15 == 0) {
                oq.u.b(obj);
                p02.n nVar = o.this.getComplainAdditionalInformationUC;
                p02.n.Params params = new p02.n.Params(eo0.f.MESSAGE_TYPE_MESSAGE);
                this.f46980f = c0Var;
                this.f46979e = 1;
                obj = nVar.e(params, this);
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
            if (iVar instanceof dx.i.Left) {
                return c0Var.b(new er.l() { // from class: e22.p
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return o.b.V((State) obj2);
                    }
                });
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            final BEDictionaryAdditionalInformation bEDictionaryAdditionalInformation = (BEDictionaryAdditionalInformation) ((dx.i.Right) iVar).b();
            return c0Var.b(new er.l() { // from class: e22.q
                @Override // er.l
                public final Object b(Object obj2) {
                    return o.b.X(bEDictionaryAdditionalInformation, (State) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            return ((b) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            b bVar = o.this.new b(eVar);
            bVar.f46980f = obj;
            return bVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Le22/b;", "<unused var>", "Le22/f;", "Loq/i0;", "<anonymous>", "(Le22/b;Le22/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<e22.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f46982e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f46982e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<e22.d> bVarY1 = o.this.Y1();
                e22.d.a aVar = e22.d.a.f46941a;
                this.f46982e = 1;
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
        public final Object w(e22.b bVar, State state, tq.e<? super i0> eVar) {
            return o.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Le22/c;", "<unused var>", "Lk10/c0;", "Le22/f;", "state", "Lk10/l;", "<anonymous>", "(Le22/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<e22.c, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f46984e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f46985f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return state.a(null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f46985f;
            uq.b.e();
            if (this.f46984e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: e22.r
                @Override // er.l
                public final Object b(Object obj2) {
                    return o.d.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(e22.c cVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f46985f = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Le22/e;", "action", "Le22/f;", "<unused var>", "Loq/i0;", "<anonymous>", "(Le22/e;Le22/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<OpenUrl, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f46986e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f46987f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OpenUrl openUrl = (OpenUrl) this.f46987f;
            Object objE = uq.b.e();
            int i15 = this.f46986e;
            if (i15 == 0) {
                oq.u.b(obj);
                w wVar = o.this.openUrlIntentUseCase;
                w.Params params = new w.Params(openUrl.getUrl(), false, 2, null);
                this.f46987f = vq.j.a(openUrl);
                this.f46986e = 1;
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
            o oVar = o.this;
            if (iVar instanceof dx.i.Left) {
                oVar.globalSnackBarManager.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
                new dx.i.Left(i0.f148189a);
            } else if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OpenUrl openUrl, State state, tq.e<? super i0> eVar) {
            e eVar2 = o.this.new e(eVar);
            eVar2.f46987f = openUrl;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Le22/a;", "action", "Le22/f;", "<unused var>", "Loq/i0;", "<anonymous>", "(Le22/a;Le22/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<ChooseMessageType, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f46989e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f46990f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f46991g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f46992h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f46993j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f46994k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f46995l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f46996m;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0084  */
        /* JADX WARN: Code duplicated, block: B:21:0x008d  */
        /* JADX WARN: Code duplicated, block: B:23:0x0091  */
        /* JADX WARN: Code duplicated, block: B:25:0x009e  */
        /* JADX WARN: Code duplicated, block: B:28:0x00cb  */
        /* JADX WARN: Code duplicated, block: B:31:0x00d4  */
        /* JADX WARN: Code duplicated, block: B:33:0x00da  */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00c8, code lost:
        
            if (r6.F(r8, r10) == r1) goto L27;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r11) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 227
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: e22.o.f.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ChooseMessageType chooseMessageType, State state, tq.e<? super i0> eVar) {
            f fVar = o.this.new f(eVar);
            fVar.f46996m = chooseMessageType;
            return fVar.J(i0.f148189a);
        }
    }

    public o(yy.a aVar, f22.c cVar, p02.n nVar, x02.b bVar, w wVar, i70.e eVar, m22.h hVar) {
        this.chooseMessageTypeMapper = cVar;
        this.getComplainAdditionalInformationUC = nVar;
        this.addRecipientWithServiceTypeValidationUC = bVar;
        this.openUrlIntentUseCase = wVar;
        this.globalSnackBarManager = eVar;
        this.messageWizardContract = hVar;
        State state = new State(null, 1, null);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: e22.n
            @Override // er.l
            public final Object b(Object obj) {
                return o.u9(this.f46956a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), q9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g.Data q9(State state) {
        return this.chooseMessageTypeMapper.b(new f22.c.Params(state, b9(e22.b.f46939a), new er.l() { // from class: e22.l
            @Override // er.l
            public final Object b(Object obj) {
                return o.r9(this.f46954a, (y0) obj);
            }
        }, new er.l() { // from class: e22.m
            @Override // er.l
            public final Object b(Object obj) {
                return o.s9(this.f46955a, (String) obj);
            }
        }, b9(e22.c.f46940a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(o oVar, y0 y0Var) {
        oVar.d9(new ChooseMessageType(y0Var));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(o oVar, String str) {
        oVar.d9(new OpenUrl(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(final o oVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: e22.k
            @Override // er.l
            public final Object b(Object obj) {
                return o.v9(this.f46953a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(o oVar, z zVar) {
        zVar.A(oVar.new b(null));
        c cVar = oVar.new c(null);
        k10.o oVar2 = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(e22.b.class), oVar2, cVar);
        zVar.v(q0.c(e22.c.class), oVar2, new d(null));
        zVar.x(q0.c(OpenUrl.class), oVar2, oVar.new e(null));
        zVar.x(q0.c(ChooseMessageType.class), oVar2, oVar.new f(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<e22.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<g.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: t9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(m22.h hVar) {
        super.P5(hVar);
    }
}
