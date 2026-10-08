package dx2;

import fr.q0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005Bk\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0001\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u001e\u0010$\u001a\u0004\u0018\u00010#*\u00020 2\u0006\u0010\"\u001a\u00020!H\u0082@¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020\u0002H\u0002¢\u0006\u0004\b(\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010B\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR \u0010I\u001a\b\u0012\u0004\u0012\u00020D0C8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR&\u0010O\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030J8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR \u0010&\u001a\b\u0012\u0004\u0012\u00020'0P8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T¨\u0006U"}, d2 = {"Ldx2/t;", "Ll00/g;", "Ldx2/b;", "Ldx2/a;", "Ldx2/c;", "", "Lyy/a;", "stateMachineFactory", "Lfx2/d;", "mapper", "Lmx/c;", "labelProvider", "Lbc4/k;", "takePhotoWithSizeValidationUseCase", "Liw2/n;", "filePickerErrorMapper", "Lbc4/l;", "pickPhotoFromGalleryUseCase", "Lbc4/h;", "pickFileUseCase", "Lac4/a;", "callActionWithLoaderUseCase", "La00/b;", "pickedFileToAndroidMapper", "La14/m;", "goToApplicationDetailsSettingsUseCase", "Lyw/b;", "accessibilityTalkBackManager", "Lex2/a;", "contract", "<init>", "(Lyy/a;Lfx2/d;Lmx/c;Lbc4/k;Liw2/n;Lbc4/l;Lbc4/h;Lac4/a;La00/b;La14/m;Lyw/b;Lex2/a;)V", "Ldx/b;", "Ldx2/a$i;", "fromAction", "Loq/i0;", "A9", "(Ldx/b;Ldx2/a$i;Ltq/e;)Ljava/lang/Object;", "state", "Ldx2/c$a;", "D9", "(Ldx2/b;)Ldx2/c$a;", "b", "Lfx2/d;", "c", "Lmx/c;", "d", "Lbc4/k;", "e", "Liw2/n;", "f", "Lbc4/l;", "g", "Lbc4/h;", "h", "Lac4/a;", "j", "La00/b;", "k", "La14/m;", "l", "Lyw/b;", "m", "Lex2/a;", "n", "Ldx2/b;", "initialState", "Lxw/b;", "Ldx2/a$b;", "p", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "q", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "r", "Lmu/p0;", "getState", "()Lmu/p0;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t extends l00.g<State, dx2.a> implements dx2.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final fx2.d mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final bc4.k takePhotoWithSizeValidationUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final iw2.n filePickerErrorMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final bc4.l pickPhotoFromGalleryUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final bc4.h pickFileUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final a00.b pickedFileToAndroidMapper;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final a14.m goToApplicationDetailsSettingsUseCase;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final yw.b accessibilityTalkBackManager;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final ex2.a contract;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final xw.b<dx2.a.b> navAction;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, dx2.a> stateMachine;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final p0<dx2.c.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<dx2.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f45410a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t f45411b;

        /* JADX INFO: renamed from: dx2.t$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C1044a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f45412a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ t f45413b;

            /* JADX INFO: renamed from: dx2.t$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1045a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f45414d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f45415e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f45416f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f45418h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f45419j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f45420k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f45421l;

                public C1045a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f45414d = obj;
                    this.f45415e |= PKIFailureInfo.systemUnavail;
                    return C1044a.this.F(null, this);
                }
            }

            public C1044a(mu.h hVar, t tVar) {
                this.f45412a = hVar;
                this.f45413b = tVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1045a c1045a;
                if (eVar instanceof C1045a) {
                    c1045a = (C1045a) eVar;
                    int i15 = c1045a.f45415e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1045a.f45415e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1045a = new C1045a(eVar);
                    }
                } else {
                    c1045a = new C1045a(eVar);
                }
                Object obj2 = c1045a.f45414d;
                Object objE = uq.b.e();
                int i16 = c1045a.f45415e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f45412a;
                    dx2.c.Data dataD9 = this.f45413b.D9((State) obj);
                    c1045a.f45416f = vq.j.a(obj);
                    c1045a.f45418h = vq.j.a(c1045a);
                    c1045a.f45419j = vq.j.a(obj);
                    c1045a.f45420k = vq.j.a(hVar);
                    c1045a.f45421l = 0;
                    c1045a.f45415e = 1;
                    if (hVar.F(dataD9, c1045a) == objE) {
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

        public a(mu.g gVar, t tVar) {
            this.f45410a = gVar;
            this.f45411b = tVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super dx2.c.Data> hVar, tq.e eVar) {
            Object objA = this.f45410a.a(new C1044a(hVar, this.f45411b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lk10/c0;", "Ldx2/b;", "state", "Lk10/l;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f45422e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f45423f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Ldx2/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends State>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f45425e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f45426f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f45427g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ t f45428h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ k10.c0<State> f45429j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(t tVar, k10.c0<State> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f45428h = tVar;
                this.f45429j = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final State V(zz.h hVar, State state) {
                return State.b(state, hVar, false, false, null, 14, null);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                final zz.h hVar;
                Object objE = uq.b.e();
                int i15 = this.f45427g;
                if (i15 == 0) {
                    oq.u.b(obj);
                    wx.i iVarR = this.f45428h.contract.r();
                    if (iVarR != null) {
                        a00.b bVar = this.f45428h.pickedFileToAndroidMapper;
                        a00.b.Params params = new a00.b.Params(iVarR);
                        this.f45425e = vq.j.a(iVarR);
                        this.f45426f = 0;
                        this.f45427g = 1;
                        obj = bVar.a(params, this);
                        if (obj == objE) {
                            return objE;
                        }
                    } else {
                        hVar = null;
                    }
                    return this.f45429j.b(new er.l() { // from class: dx2.u
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return t.b.a.V(hVar, (State) obj2);
                        }
                    });
                }
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                hVar = (zz.h) ((dx.i) obj).a();
                return this.f45429j.b(new er.l() { // from class: dx2.u
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return t.b.a.V(hVar, (State) obj2);
                    }
                });
            }

            public final tq.e<i0> N(tq.e<?> eVar) {
                return new a(this.f45428h, this.f45429j, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<State>> eVar) {
                return ((a) N(eVar)).J(i0.f148189a);
            }
        }

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f45423f;
            Object objE = uq.b.e();
            int i15 = this.f45422e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = t.this.callActionWithLoaderUseCase;
            a aVar2 = new a(t.this, c0Var, null);
            this.f45423f = vq.j.a(c0Var);
            this.f45422e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            return ((b) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            b bVar = t.this.new b(eVar);
            bVar.f45423f = obj;
            return bVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ldx2/a$j;", "<unused var>", "Lk10/c0;", "Ldx2/b;", "state", "Lk10/l;", "<anonymous>", "(Ldx2/a$j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<dx2.a.j, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f45430e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f45431f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, null, false, false, null, 11, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f45431f;
            uq.b.e();
            if (this.f45430e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: dx2.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.c.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(dx2.a.j jVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            c cVar = new c(eVar);
            cVar.f45431f = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ldx2/a$g;", "action", "Ldx2/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ldx2/a$g;Ldx2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<dx2.a.OnImageClick, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f45432e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f45433f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            dx2.a.OnImageClick onImageClick = (dx2.a.OnImageClick) this.f45433f;
            Object objE = uq.b.e();
            int i15 = this.f45432e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<dx2.a.b> bVarY1 = t.this.Y1();
                dx2.a.b.ShowImagePreview showImagePreview = new dx2.a.b.ShowImagePreview(onImageClick.getData());
                this.f45433f = vq.j.a(onImageClick);
                this.f45432e = 1;
                if (bVarY1.F(showImagePreview, this) == objE) {
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
        public final Object w(dx2.a.OnImageClick onImageClick, State state, tq.e<? super i0> eVar) {
            d dVar = t.this.new d(eVar);
            dVar.f45433f = onImageClick;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ldx2/a$c;", "<unused var>", "Lk10/c0;", "Ldx2/b;", "state", "Lk10/l;", "<anonymous>", "(Ldx2/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<dx2.a.c, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f45435e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f45436f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f45437g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f45438h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f45439j;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f45441a;

            static {
                int[] iArr = new int[g30.v.values().length];
                try {
                    iArr[g30.v.EXPANDED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f45441a = iArr;
            }
        }

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, null, false, false, g30.v.HIDDEN, 7, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f45439j;
            Object objE = uq.b.e();
            int i15 = this.f45438h;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                k10.l lVar = (k10.l) this.f45435e;
                oq.u.b(obj);
                return lVar;
            }
            oq.u.b(obj);
            if (a.f45441a[((State) c0Var.a()).getBottomSheetValue().ordinal()] == 1) {
                return c0Var.b(new er.l() { // from class: dx2.w
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return t.e.O((State) obj2);
                    }
                });
            }
            k10.l lVarC = c0Var.c();
            t tVar = t.this;
            dx2.a.b.C1042a c1042a = dx2.a.b.C1042a.f45338a;
            this.f45439j = vq.j.a(c0Var);
            this.f45435e = lVarC;
            this.f45436f = vq.j.a(lVarC);
            this.f45437g = 0;
            this.f45438h = 1;
            return tVar.F(c1042a, this) == objE ? objE : lVarC;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(dx2.a.c cVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = t.this.new e(eVar);
            eVar2.f45439j = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ldx2/a$k;", "<unused var>", "Ldx2/b;", "Loq/i0;", "<anonymous>", "(Ldx2/a$k;Ldx2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<dx2.a.k, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f45442e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f45442e;
            if (i15 == 0) {
                oq.u.b(obj);
                t tVar = t.this;
                dx2.a.b.C1043b c1043b = dx2.a.b.C1043b.f45339a;
                this.f45442e = 1;
                if (tVar.F(c1043b, this) == objE) {
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
        public final Object w(dx2.a.k kVar, State state, tq.e<? super i0> eVar) {
            return t.this.new f(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ldx2/a$a;", "<unused var>", "Ldx2/b;", "Loq/i0;", "<anonymous>", "(Ldx2/a$a;Ldx2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<dx2.a.C1041a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f45444e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f45444e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            t.this.goToApplicationDetailsSettingsUseCase.a(gz.b.a.C1792a.f78542a);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(dx2.a.C1041a c1041a, State state, tq.e<? super i0> eVar) {
            return t.this.new g(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ldx2/a$d;", "action", "Lk10/c0;", "Ldx2/b;", "state", "Lk10/l;", "<anonymous>", "(Ldx2/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<dx2.a.OnBottomSheetStateChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f45446e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f45447f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f45448g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(dx2.a.OnBottomSheetStateChanged onBottomSheetStateChanged, State state) {
            return State.b(state, null, false, false, onBottomSheetStateChanged.getValue(), 7, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final dx2.a.OnBottomSheetStateChanged onBottomSheetStateChanged = (dx2.a.OnBottomSheetStateChanged) this.f45447f;
            k10.c0 c0Var = (k10.c0) this.f45448g;
            uq.b.e();
            if (this.f45446e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: dx2.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.h.O(onBottomSheetStateChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(dx2.a.OnBottomSheetStateChanged onBottomSheetStateChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            h hVar = new h(eVar);
            hVar.f45447f = onBottomSheetStateChanged;
            hVar.f45448g = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ldx2/a$i;", "action", "Ldx2/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ldx2/a$i;Ldx2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<dx2.a.OnPickerActionSelected, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f45449e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f45450f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f45451g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f45452h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f45453j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f45454k;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f45456a;

            static {
                int[] iArr = new int[cx2.a.values().length];
                try {
                    iArr[cx2.a.TAKE_PHOTO.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[cx2.a.PICK_PHOTO.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[cx2.a.PICK_FILE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f45456a = iArr;
            }
        }

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0076  */
        /* JADX WARN: Code duplicated, block: B:23:0x00a0  */
        /* JADX WARN: Code duplicated, block: B:25:0x00a4  */
        /* JADX WARN: Code duplicated, block: B:26:0x00ba  */
        /* JADX WARN: Code duplicated, block: B:35:0x0117  */
        /* JADX WARN: Code duplicated, block: B:38:0x0141  */
        /* JADX WARN: Code duplicated, block: B:40:0x0145  */
        /* JADX WARN: Code duplicated, block: B:41:0x015b  */
        /* JADX WARN: Code duplicated, block: B:48:0x019e  */
        /* JADX WARN: Code duplicated, block: B:51:0x01c6  */
        /* JADX WARN: Code duplicated, block: B:53:0x01ca  */
        /* JADX WARN: Code duplicated, block: B:56:0x01e1  */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x009c, code lost:
        
            if (r2.A9(r3, r0, r14) == r1) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x013d, code lost:
        
            if (r2.A9(r3, r0, r14) == r1) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x01c3, code lost:
        
            if (r2.A9(r5, r0, r14) == r1) goto L50;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r15) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 506
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: dx2.t.i.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(dx2.a.OnPickerActionSelected onPickerActionSelected, State state, tq.e<? super i0> eVar) {
            i iVar = t.this.new i(eVar);
            iVar.f45454k = onPickerActionSelected;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ldx2/a$f;", "action", "Lk10/c0;", "Ldx2/b;", "state", "Lk10/l;", "<anonymous>", "(Ldx2/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<dx2.a.OnFilePicked, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f45457e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f45458f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f45459g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Ldx2/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends State>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f45461e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f45462f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f45463g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f45464h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f45465j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f45466k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f45467l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f45468m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ t f45469n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ dx2.a.OnFilePicked f45470p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ k10.c0<State> f45471q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(t tVar, dx2.a.OnFilePicked onFilePicked, k10.c0<State> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f45469n = tVar;
                this.f45470p = onFilePicked;
                this.f45471q = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final State V(zz.h hVar, State state) {
                return State.b(state, hVar, true, false, null, 12, null);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f45468m;
                if (i15 == 0) {
                    oq.u.b(obj);
                    a00.b bVar = this.f45469n.pickedFileToAndroidMapper;
                    a00.b.Params params = new a00.b.Params(this.f45470p.getPickedFile());
                    this.f45468m = 1;
                    obj = bVar.a(params, this);
                    if (obj != objE) {
                    }
                }
                if (i15 != 1) {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    k10.l lVar = (k10.l) this.f45463g;
                    oq.u.b(obj);
                    return lVar;
                }
                oq.u.b(obj);
                dx.i iVar = (dx.i) obj;
                k10.c0<State> c0Var = this.f45471q;
                t tVar = this.f45469n;
                dx2.a.OnFilePicked onFilePicked = this.f45470p;
                if (!(iVar instanceof dx.i.Left)) {
                    if (!(iVar instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    final zz.h hVar = (zz.h) ((dx.i.Right) iVar).b();
                    tVar.accessibilityTalkBackManager.a(c70.a.f23835a.a().q0().getText());
                    return c0Var.b(new er.l() { // from class: dx2.y
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return t.j.a.V(hVar, (State) obj2);
                        }
                    });
                }
                dx.b bVar2 = (dx.b) ((dx.i.Left) iVar).b();
                Object objC = c0Var.c();
                dx2.a.OnPickerActionSelected fromAction = onFilePicked.getFromAction();
                this.f45461e = vq.j.a(iVar);
                this.f45462f = vq.j.a(bVar2);
                this.f45463g = objC;
                this.f45464h = vq.j.a(objC);
                this.f45465j = 0;
                this.f45466k = 0;
                this.f45467l = 0;
                this.f45468m = 2;
                return tVar.A9(bVar2, fromAction, this) == objE ? objE : objC;
            }

            public final tq.e<i0> N(tq.e<?> eVar) {
                return new a(this.f45469n, this.f45470p, this.f45471q, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<State>> eVar) {
                return ((a) N(eVar)).J(i0.f148189a);
            }
        }

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            dx2.a.OnFilePicked onFilePicked = (dx2.a.OnFilePicked) this.f45458f;
            k10.c0 c0Var = (k10.c0) this.f45459g;
            Object objE = uq.b.e();
            int i15 = this.f45457e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = t.this.callActionWithLoaderUseCase;
            a aVar2 = new a(t.this, onFilePicked, c0Var, null);
            this.f45458f = vq.j.a(onFilePicked);
            this.f45459g = vq.j.a(c0Var);
            this.f45457e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(dx2.a.OnFilePicked onFilePicked, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            j jVar = t.this.new j(eVar);
            jVar.f45458f = onFilePicked;
            jVar.f45459g = c0Var;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ldx2/a$e;", "<unused var>", "Lk10/c0;", "Ldx2/b;", "state", "Lk10/l;", "<anonymous>", "(Ldx2/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<dx2.a.e, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f45472e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f45473f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, null, false, false, null, 14, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f45473f;
            uq.b.e();
            if (this.f45472e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: dx2.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.k.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(dx2.a.e eVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar2) {
            k kVar = new k(eVar2);
            kVar.f45473f = c0Var;
            return kVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ldx2/a$h;", "<unused var>", "Lk10/c0;", "Ldx2/b;", "state", "Lk10/l;", "<anonymous>", "(Ldx2/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<dx2.a.h, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f45474e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f45475f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f45476g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f45477h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f45478j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f45479k;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, null, false, true, null, 9, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f45479k;
            Object objE = uq.b.e();
            int i15 = this.f45478j;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                k10.l lVar = (k10.l) this.f45475f;
                oq.u.b(obj);
                return lVar;
            }
            oq.u.b(obj);
            zz.h pickedFile = ((State) c0Var.a()).getPickedFile();
            if (pickedFile == null) {
                t.this.accessibilityTalkBackManager.a(t.this.labelProvider.c(gv2.a.B).getText());
                return c0Var.b(new er.l() { // from class: dx2.a0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return t.l.O((State) obj2);
                    }
                });
            }
            k10.l lVarC = c0Var.c();
            t tVar = t.this;
            tVar.contract.l(pickedFile.getFile());
            xw.b<dx2.a.b> bVarY1 = tVar.Y1();
            dx2.a.b.c cVar = dx2.a.b.c.f45340a;
            this.f45479k = vq.j.a(c0Var);
            this.f45474e = vq.j.a(pickedFile);
            this.f45475f = lVarC;
            this.f45476g = vq.j.a(lVarC);
            this.f45477h = 0;
            this.f45478j = 1;
            return bVarY1.F(cVar, this) == objE ? objE : lVarC;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(dx2.a.h hVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            l lVar = t.this.new l(eVar);
            lVar.f45479k = c0Var;
            return lVar.J(i0.f148189a);
        }
    }

    public t(yy.a aVar, fx2.d dVar, mx.c cVar, bc4.k kVar, iw2.n nVar, bc4.l lVar, bc4.h hVar, ac4.a aVar2, a00.b bVar, a14.m mVar, yw.b bVar2, ex2.a aVar3) {
        this.mapper = dVar;
        this.labelProvider = cVar;
        this.takePhotoWithSizeValidationUseCase = kVar;
        this.filePickerErrorMapper = nVar;
        this.pickPhotoFromGalleryUseCase = lVar;
        this.pickFileUseCase = hVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.pickedFileToAndroidMapper = bVar;
        this.goToApplicationDetailsSettingsUseCase = mVar;
        this.accessibilityTalkBackManager = bVar2;
        this.contract = aVar3;
        State state = new State(null, false, false, null, 15, null);
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: dx2.s
            @Override // er.l
            public final Object b(Object obj) {
                return t.I9(this.f45394a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), D9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object A9(dx.b bVar, final dx2.a.OnPickerActionSelected onPickerActionSelected, tq.e<? super i0> eVar) {
        iw2.n.a fileOrPhotoPicker;
        iw2.n nVar = this.filePickerErrorMapper;
        boolean z15 = onPickerActionSelected.getSelectedOption() == cx2.a.TAKE_PHOTO;
        if (z15) {
            fileOrPhotoPicker = new iw2.n.a.Camera(bVar, new er.a() { // from class: dx2.q
                @Override // er.a
                public final Object a() {
                    return t.B9(this.f45390a, onPickerActionSelected);
                }
            }, b9(dx2.a.C1041a.f45337a));
        } else {
            if (z15) {
                throw new oq.p();
            }
            fileOrPhotoPicker = new iw2.n.a.FileOrPhotoPicker(bVar, new er.a() { // from class: dx2.r
                @Override // er.a
                public final Object a() {
                    return t.C9(this.f45392a, onPickerActionSelected);
                }
            });
        }
        iw2.n.b bVarB = nVar.b(fileOrPhotoPicker);
        if (bVarB == null) {
            return null;
        }
        if (bVarB instanceof iw2.n.b.Dialog) {
            Object objF = F(new dx2.a.b.ShowDialog(((iw2.n.b.Dialog) bVarB).getDialogData()), eVar);
            if (objF == uq.b.e()) {
                return objF;
            }
        } else {
            if (!(bVarB instanceof iw2.n.b.FullPage)) {
                throw new oq.p();
            }
            Object objF2 = F(new dx2.a.b.ShowError(((iw2.n.b.FullPage) bVarB).getData()), eVar);
            if (objF2 == uq.b.e()) {
                return objF2;
            }
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(t tVar, dx2.a.OnPickerActionSelected onPickerActionSelected) {
        tVar.d9(onPickerActionSelected);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(t tVar, dx2.a.OnPickerActionSelected onPickerActionSelected) {
        tVar.d9(onPickerActionSelected);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dx2.c.Data D9(State state) {
        return this.mapper.b(new fx2.d.Params(state, new er.l() { // from class: dx2.m
            @Override // er.l
            public final Object b(Object obj) {
                return t.E9(this.f45386a, (g30.v) obj);
            }
        }, new er.l() { // from class: dx2.n
            @Override // er.l
            public final Object b(Object obj) {
                return t.F9(this.f45387a, (cx2.a) obj);
            }
        }, new er.l() { // from class: dx2.o
            @Override // er.l
            public final Object b(Object obj) {
                return t.G9(this.f45388a, (dx3.a) obj);
            }
        }, b9(dx2.a.e.f45346a), b9(dx2.a.j.f45352a), b9(dx2.a.h.f45350a), b9(dx2.a.c.f45344a), b9(dx2.a.k.f45353a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E9(t tVar, g30.v vVar) {
        tVar.d9(new dx2.a.OnBottomSheetStateChanged(vVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F9(t tVar, cx2.a aVar) {
        tVar.d9(new dx2.a.OnPickerActionSelected(aVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G9(t tVar, dx3.a aVar) {
        tVar.d9(new dx2.a.OnImageClick(aVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I9(final t tVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: dx2.p
            @Override // er.l
            public final Object b(Object obj) {
                return t.J9(this.f45389a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J9(t tVar, k10.z zVar) {
        zVar.A(tVar.new b(null));
        e eVar = tVar.new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(dx2.a.c.class), oVar, eVar);
        zVar.x(q0.c(dx2.a.k.class), oVar, tVar.new f(null));
        zVar.x(q0.c(dx2.a.C1041a.class), oVar, tVar.new g(null));
        zVar.v(q0.c(dx2.a.OnBottomSheetStateChanged.class), oVar, new h(null));
        zVar.x(q0.c(dx2.a.OnPickerActionSelected.class), oVar, tVar.new i(null));
        zVar.v(q0.c(dx2.a.OnFilePicked.class), oVar, tVar.new j(null));
        zVar.v(q0.c(dx2.a.e.class), oVar, new k(null));
        zVar.v(q0.c(dx2.a.h.class), oVar, tVar.new l(null));
        zVar.v(q0.c(dx2.a.j.class), oVar, new c(null));
        zVar.x(q0.c(dx2.a.OnImageClick.class), oVar, tVar.new d(null));
        return i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: H9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(ex2.a aVar) {
        super.P5(aVar);
    }

    @Override // zx.b
    public xw.b<dx2.a.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, dx2.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<dx2.c.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: z9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(dx2.a.b bVar, tq.e<? super i0> eVar) {
        return super.F(bVar, eVar);
    }
}
