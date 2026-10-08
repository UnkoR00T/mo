package s51;

import bl0.BEChildBirthRegistration;
import fr.q0;
import mu.p0;
import n31.RegistrationChildrenResult;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BK\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0019\u001a\u00020\u0018*\u00020\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R&\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030,8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R \u00108\u001a\b\u0012\u0004\u0012\u000203028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R \u0010>\u001a\b\u0012\u0004\u0012\u00020\u0018098\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=¨\u0006?"}, d2 = {"Ls51/w;", "Ll00/g;", "Ls51/g;", "Ls51/f;", "Ls51/h;", "", "Lyy/a;", "stateMachineFactory", "Lv51/a;", "mapper", "Lo31/b;", "registerChildrenUseCase", "Lac4/a;", "loaderUseCase", "Lq31/c;", "exitDialogMapper", "Lhb4/d;", "errorVMSFactory", "Lib4/c;", "domainErrorMapper", "Lu51/a;", "contract", "<init>", "(Lyy/a;Lv51/a;Lo31/b;Lac4/a;Lq31/c;Lhb4/d;Lib4/c;Lu51/a;)V", "Ls51/h$a;", "t9", "(Ls51/g;)Ls51/h$a;", "b", "Lv51/a;", "c", "Lo31/b;", "d", "Lac4/a;", "e", "Lq31/c;", "f", "Lhb4/d;", "g", "Lib4/c;", "h", "Lu51/a;", "j", "Ls51/g;", "initialState", "Lk10/t;", "k", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Ls51/f$e;", "l", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "m", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class w extends l00.g<s51.g, s51.f> implements s51.h, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final v51.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final o31.b registerChildrenUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ac4.a loaderUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final q31.c exitDialogMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ib4.c domainErrorMapper;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final u51.a contract;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final s51.g initialState;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final k10.t<s51.g, s51.f> stateMachine;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final xw.b<s51.f.e> navAction;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final p0<s51.h.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<s51.h.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f178112a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w f178113b;

        /* JADX INFO: renamed from: s51.w$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4557a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f178114a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ w f178115b;

            /* JADX INFO: renamed from: s51.w$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4558a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f178116d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f178117e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f178118f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f178120h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f178121j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f178122k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f178123l;

                public C4558a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f178116d = obj;
                    this.f178117e |= PKIFailureInfo.systemUnavail;
                    return C4557a.this.F(null, this);
                }
            }

            public C4557a(mu.h hVar, w wVar) {
                this.f178114a = hVar;
                this.f178115b = wVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4558a c4558a;
                if (eVar instanceof C4558a) {
                    c4558a = (C4558a) eVar;
                    int i15 = c4558a.f178117e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4558a.f178117e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4558a = new C4558a(eVar);
                    }
                } else {
                    c4558a = new C4558a(eVar);
                }
                Object obj2 = c4558a.f178116d;
                Object objE = uq.b.e();
                int i16 = c4558a.f178117e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f178114a;
                    s51.h.a aVarT9 = this.f178115b.t9((s51.g) obj);
                    c4558a.f178118f = vq.j.a(obj);
                    c4558a.f178120h = vq.j.a(c4558a);
                    c4558a.f178121j = vq.j.a(obj);
                    c4558a.f178122k = vq.j.a(hVar);
                    c4558a.f178123l = 0;
                    c4558a.f178117e = 1;
                    if (hVar.F(aVarT9, c4558a) == objE) {
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

        public a(mu.g gVar, w wVar) {
            this.f178112a = gVar;
            this.f178113b = wVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super s51.h.a> hVar, tq.e eVar) {
            Object objA = this.f178112a.a(new C4557a(hVar, this.f178113b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ls51/f$c;", "action", "Ls51/g;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ls51/f$c;Ls51/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<s51.f.HandleError, s51.g, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f178124e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f178125f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(w wVar, iy.b0 b0Var) {
            wVar.d9(s51.f.g.f178062a);
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            s51.f.HandleError handleError = (s51.f.HandleError) this.f178125f;
            Object objE = uq.b.e();
            int i15 = this.f178124e;
            if (i15 == 0) {
                oq.u.b(obj);
                k44.a error = handleError.getError();
                if (error instanceof k44.a.Domain) {
                    w.this.d9(new s51.f.SetError(((k44.a.Domain) handleError.getError()).getDomain()));
                } else {
                    if (!fr.t.c(error, k44.a.b.f108417a)) {
                        throw new oq.p();
                    }
                    xw.b<s51.f.e> bVarY1 = w.this.Y1();
                    final w wVar = w.this;
                    s51.f.e.GoToEdorAuth goToEdorAuth = new s51.f.e.GoToEdorAuth(new mv3.a.EdorAddressRequired(new er.l() { // from class: s51.x
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return w.b.O(wVar, (iy.b0) obj2);
                        }
                    }, null, 2, null));
                    this.f178125f = vq.j.a(handleError);
                    this.f178124e = 1;
                    if (bVarY1.F(goToEdorAuth, this) == objE) {
                        return objE;
                    }
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
        public final Object w(s51.f.HandleError handleError, s51.g gVar, tq.e<? super i0> eVar) {
            b bVar = w.this.new b(eVar);
            bVar.f178125f = handleError;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ls51/f$d;", "action", "Lk10/c0;", "Ls51/g;", "state", "Lk10/l;", "<anonymous>", "(Ls51/f$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<s51.f.HandleResult, k10.c0<s51.g>, tq.e<? super k10.l<? extends s51.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f178127e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f178128f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f178129g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final s51.g.a.Content O(s51.f.HandleResult handleResult, s51.g gVar) {
            return new s51.g.a.Content(handleResult.getSentRegistration(), handleResult.getResult());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final s51.f.HandleResult handleResult = (s51.f.HandleResult) this.f178128f;
            k10.c0 c0Var = (k10.c0) this.f178129g;
            uq.b.e();
            if (this.f178127e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: s51.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return w.c.O(handleResult, (g) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(s51.f.HandleResult handleResult, k10.c0<s51.g> c0Var, tq.e<? super k10.l<? extends s51.g>> eVar) {
            c cVar = new c(eVar);
            cVar.f178128f = handleResult;
            cVar.f178129g = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ls51/f$b;", "<unused var>", "Ls51/g;", "Loq/i0;", "<anonymous>", "(Ls51/f$b;Ls51/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<s51.f.b, s51.g, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f178130e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f178130e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<s51.f.e> bVarY1 = w.this.Y1();
                s51.f.e.b bVar = s51.f.e.b.f178057a;
                this.f178130e = 1;
                if (bVarY1.F(bVar, this) == objE) {
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
        public final Object w(s51.f.b bVar, s51.g gVar, tq.e<? super i0> eVar) {
            return w.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ls51/f$j;", "<unused var>", "Ls51/g;", "Loq/i0;", "<anonymous>", "(Ls51/f$j;Ls51/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<s51.f.j, s51.g, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f178132e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f178132e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<s51.f.e> bVarY1 = w.this.Y1();
                s51.f.e.ShowDialog showDialog = new s51.f.e.ShowDialog(w.this.exitDialogMapper.b(new q31.c.Params(w.this.b9(s51.f.b.f178052a))));
                this.f178132e = 1;
                if (bVarY1.F(showDialog, this) == objE) {
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
        public final Object w(s51.f.j jVar, s51.g gVar, tq.e<? super i0> eVar) {
            return w.this.new e(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ls51/f$a;", "<unused var>", "Ls51/g$b;", "Loq/i0;", "<anonymous>", "(Ls51/f$a;Ls51/g$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<s51.f.a, s51.g.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f178134e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f178134e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<s51.f.e> bVarY1 = w.this.Y1();
                s51.f.e.a aVar = s51.f.e.a.f178056a;
                this.f178134e = 1;
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
        public final Object w(s51.f.a aVar, s51.g.b bVar, tq.e<? super i0> eVar) {
            return w.this.new f(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ls51/f$f;", "<unused var>", "Ls51/g$b;", "Loq/i0;", "<anonymous>", "(Ls51/f$f;Ls51/g$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<s51.f.C4553f, s51.g.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f178136e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f178136e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            w.this.d9(s51.f.j.f178065a);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(s51.f.C4553f c4553f, s51.g.b bVar, tq.e<? super i0> eVar) {
            return w.this.new g(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ls51/f$i;", "<unused var>", "Lk10/c0;", "Ls51/g$b;", "state", "Lk10/l;", "Ls51/g;", "<anonymous>", "(Ls51/f$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<s51.f.i, k10.c0<s51.g.b>, tq.e<? super k10.l<? extends s51.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f178138e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f178139f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final s51.g.b.Content O(w wVar, s51.g.b bVar) {
            return new s51.g.b.Content(wVar.contract.c());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f178139f;
            uq.b.e();
            if (this.f178138e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final w wVar = w.this;
            return c0Var.d(new er.l() { // from class: s51.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return w.h.O(wVar, (g.b) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(s51.f.i iVar, k10.c0<s51.g.b> c0Var, tq.e<? super k10.l<? extends s51.g>> eVar) {
            h hVar = w.this.new h(eVar);
            hVar.f178139f = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ls51/f$h;", "action", "Lk10/c0;", "Ls51/g$b;", "state", "Lk10/l;", "Ls51/g;", "<anonymous>", "(Ls51/f$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<s51.f.SetError, k10.c0<s51.g.b>, tq.e<? super k10.l<? extends s51.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f178141e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f178142f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f178143g;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final s51.g.b.Error V(k10.c0 c0Var, final w wVar, s51.f.SetError setError, s51.g.b bVar) {
            return new s51.g.b.Error(((s51.g.b) c0Var.a()).getSummaryData(), wVar.errorVMSFactory.a(wVar.domainErrorMapper.b(new ib4.c.Params(setError.getDomainError(), false, new er.l() { // from class: s51.b0
                @Override // er.l
                public final Object b(Object obj) {
                    return w.i.X(wVar, (ib4.c.b) obj);
                }
            }, 2, null))));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 X(w wVar, ib4.c.b bVar) {
            if ((bVar instanceof ib4.c.b.a.Primary) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                wVar.d9(s51.f.g.f178062a);
            } else {
                if (!(bVar instanceof ib4.c.b.AbstractC2161b.a) && !(bVar instanceof ib4.c.b.a.Close) && !(bVar instanceof ib4.c.b.a.Secondary)) {
                    throw new oq.p();
                }
                wVar.d9(s51.f.i.f178064a);
            }
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final s51.f.SetError setError = (s51.f.SetError) this.f178142f;
            final k10.c0 c0Var = (k10.c0) this.f178143g;
            uq.b.e();
            if (this.f178141e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final w wVar = w.this;
            return c0Var.d(new er.l() { // from class: s51.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return w.i.V(c0Var, wVar, setError, (g.b) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(s51.f.SetError setError, k10.c0<s51.g.b> c0Var, tq.e<? super k10.l<? extends s51.g>> eVar) {
            i iVar = w.this.new i(eVar);
            iVar.f178142f = setError;
            iVar.f178143g = c0Var;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ls51/f$g;", "<unused var>", "Ls51/g$b;", "state", "Loq/i0;", "<anonymous>", "(Ls51/f$g;Ls51/g$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<s51.f.g, s51.g.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f178145e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f178146f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f178147g;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldx/i;", "Lk44/a;", "Ln31/b;", "<anonymous>", "()Ldx/i;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super dx.i<? extends k44.a, ? extends RegistrationChildrenResult>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f178149e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ w f178150f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ BEChildBirthRegistration f178151g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(w wVar, BEChildBirthRegistration bEChildBirthRegistration, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f178150f = wVar;
                this.f178151g = bEChildBirthRegistration;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f178149e;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                    return obj;
                }
                oq.u.b(obj);
                o31.b bVar = this.f178150f.registerChildrenUseCase;
                o31.b.Params params = new o31.b.Params(this.f178151g, null);
                this.f178149e = 1;
                Object objE2 = bVar.e(params, this);
                return objE2 == objE ? objE : objE2;
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f178150f, this.f178151g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super dx.i<? extends k44.a, RegistrationChildrenResult>> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            j jVar;
            BEChildBirthRegistration bEChildBirthRegistration;
            s51.g.b bVar = (s51.g.b) this.f178147g;
            Object objE = uq.b.e();
            int i15 = this.f178146f;
            if (i15 == 0) {
                oq.u.b(obj);
                BEChildBirthRegistration bEChildBirthRegistrationC = q31.d.c(bVar.getSummaryData());
                ac4.a aVar = w.this.loaderUseCase;
                a aVar2 = new a(w.this, bEChildBirthRegistrationC, null);
                this.f178147g = vq.j.a(bVar);
                this.f178145e = bEChildBirthRegistrationC;
                this.f178146f = 1;
                jVar = this;
                Object objA = ac4.a.a(aVar, null, aVar2, jVar, 1, null);
                if (objA == objE) {
                    return objE;
                }
                bEChildBirthRegistration = bEChildBirthRegistrationC;
                obj = objA;
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bEChildBirthRegistration = (BEChildBirthRegistration) this.f178145e;
                oq.u.b(obj);
                jVar = this;
            }
            dx.i iVar = (dx.i) obj;
            w wVar = w.this;
            if (iVar instanceof dx.i.Right) {
                wVar.d9(new s51.f.HandleResult(bEChildBirthRegistration, (RegistrationChildrenResult) ((dx.i.Right) iVar).b()));
            }
            w wVar2 = w.this;
            if (iVar instanceof dx.i.Left) {
                wVar2.d9(new s51.f.HandleError((k44.a) ((dx.i.Left) iVar).b()));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(s51.f.g gVar, s51.g.b bVar, tq.e<? super i0> eVar) {
            j jVar = w.this.new j(eVar);
            jVar.f178147g = bVar;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ls51/f$f;", "<unused var>", "Ls51/g$a;", "Loq/i0;", "<anonymous>", "(Ls51/f$f;Ls51/g$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<s51.f.C4553f, s51.g.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f178152e;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f178152e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            w.this.d9(s51.f.b.f178052a);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(s51.f.C4553f c4553f, s51.g.a aVar, tq.e<? super i0> eVar) {
            return w.this.new k(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ls51/f$h;", "action", "Lk10/c0;", "Ls51/g$a;", "state", "Lk10/l;", "Ls51/g;", "<anonymous>", "(Ls51/f$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<s51.f.SetError, k10.c0<s51.g.a>, tq.e<? super k10.l<? extends s51.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f178154e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f178155f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f178156g;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final s51.g.a.Error V(final k10.c0 c0Var, final w wVar, s51.f.SetError setError, s51.g.a aVar) {
            return new s51.g.a.Error(((s51.g.a) c0Var.a()).getSentRegistration(), ((s51.g.a) c0Var.a()).getResult(), wVar.errorVMSFactory.a(wVar.domainErrorMapper.b(new ib4.c.Params(setError.getDomainError(), false, new er.l() { // from class: s51.d0
                @Override // er.l
                public final Object b(Object obj) {
                    return w.l.X(wVar, c0Var, (ib4.c.b) obj);
                }
            }, 2, null))));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 X(w wVar, k10.c0 c0Var, ib4.c.b bVar) {
            if ((bVar instanceof ib4.c.b.a.Primary) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                wVar.d9(s51.f.g.f178062a);
            } else {
                if (!(bVar instanceof ib4.c.b.AbstractC2161b.a) && !(bVar instanceof ib4.c.b.a.Close) && !(bVar instanceof ib4.c.b.a.Secondary)) {
                    throw new oq.p();
                }
                wVar.d9(new s51.f.HandleResult(((s51.g.a) c0Var.a()).getSentRegistration(), ((s51.g.a) c0Var.a()).getResult()));
            }
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final s51.f.SetError setError = (s51.f.SetError) this.f178155f;
            final k10.c0 c0Var = (k10.c0) this.f178156g;
            uq.b.e();
            if (this.f178154e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final w wVar = w.this;
            return c0Var.d(new er.l() { // from class: s51.c0
                @Override // er.l
                public final Object b(Object obj2) {
                    return w.l.V(c0Var, wVar, setError, (g.a) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(s51.f.SetError setError, k10.c0<s51.g.a> c0Var, tq.e<? super k10.l<? extends s51.g>> eVar) {
            l lVar = w.this.new l(eVar);
            lVar.f178155f = setError;
            lVar.f178156g = c0Var;
            return lVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ls51/f$g;", "<unused var>", "Ls51/g$a;", "state", "Loq/i0;", "<anonymous>", "(Ls51/f$g;Ls51/g$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<s51.f.g, s51.g.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f178158e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f178159f;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldx/i;", "Lk44/a;", "Ln31/b;", "<anonymous>", "()Ldx/i;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super dx.i<? extends k44.a, ? extends RegistrationChildrenResult>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f178161e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ w f178162f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ s51.g.a f178163g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(w wVar, s51.g.a aVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f178162f = wVar;
                this.f178163g = aVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f178161e;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                    return obj;
                }
                oq.u.b(obj);
                o31.b bVar = this.f178162f.registerChildrenUseCase;
                o31.b.Params params = new o31.b.Params(this.f178163g.getSentRegistration(), this.f178163g.getResult());
                this.f178161e = 1;
                Object objE2 = bVar.e(params, this);
                return objE2 == objE ? objE : objE2;
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f178162f, this.f178163g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super dx.i<? extends k44.a, RegistrationChildrenResult>> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            m mVar;
            s51.g.a aVar = (s51.g.a) this.f178159f;
            Object objE = uq.b.e();
            int i15 = this.f178158e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.a aVar2 = w.this.loaderUseCase;
                a aVar3 = new a(w.this, aVar, null);
                this.f178159f = aVar;
                this.f178158e = 1;
                mVar = this;
                obj = ac4.a.a(aVar2, null, aVar3, mVar, 1, null);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                mVar = this;
            }
            dx.i iVar = (dx.i) obj;
            w wVar = w.this;
            if (iVar instanceof dx.i.Right) {
                wVar.d9(new s51.f.HandleResult(aVar.getSentRegistration(), (RegistrationChildrenResult) ((dx.i.Right) iVar).b()));
            }
            w wVar2 = w.this;
            if (iVar instanceof dx.i.Left) {
                wVar2.d9(new s51.f.HandleError((k44.a) ((dx.i.Left) iVar).b()));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(s51.f.g gVar, s51.g.a aVar, tq.e<? super i0> eVar) {
            m mVar = w.this.new m(eVar);
            mVar.f178159f = aVar;
            return mVar.J(i0.f148189a);
        }
    }

    public w(yy.a aVar, v51.a aVar2, o31.b bVar, ac4.a aVar3, q31.c cVar, hb4.d dVar, ib4.c cVar2, u51.a aVar4) {
        this.mapper = aVar2;
        this.registerChildrenUseCase = bVar;
        this.loaderUseCase = aVar3;
        this.exitDialogMapper = cVar;
        this.errorVMSFactory = dVar;
        this.domainErrorMapper = cVar2;
        this.contract = aVar4;
        s51.g.b.Content content = new s51.g.b.Content(aVar4.c());
        this.initialState = content;
        this.stateMachine = aVar.a(content, new er.l() { // from class: s51.v
            @Override // er.l
            public final Object b(Object obj) {
                return w.v9(this.f178100a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), t9(content));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final s51.h.a t9(s51.g gVar) {
        return this.mapper.b(new v51.a.Params(gVar, b9(s51.f.g.f178062a), b9(s51.f.C4553f.f178061a), b9(s51.f.a.f178051a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(final w wVar, k10.v vVar) {
        vVar.c(q0.c(s51.g.class), new er.l() { // from class: s51.s
            @Override // er.l
            public final Object b(Object obj) {
                return w.w9(this.f178097a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(s51.g.b.class), new er.l() { // from class: s51.t
            @Override // er.l
            public final Object b(Object obj) {
                return w.x9(this.f178098a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(s51.g.a.class), new er.l() { // from class: s51.u
            @Override // er.l
            public final Object b(Object obj) {
                return w.y9(this.f178099a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(w wVar, k10.z zVar) {
        b bVar = wVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(s51.f.HandleError.class), oVar, bVar);
        zVar.v(q0.c(s51.f.HandleResult.class), oVar, new c(null));
        zVar.x(q0.c(s51.f.b.class), oVar, wVar.new d(null));
        zVar.x(q0.c(s51.f.j.class), oVar, wVar.new e(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(w wVar, k10.z zVar) {
        f fVar = wVar.new f(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(s51.f.a.class), oVar, fVar);
        zVar.x(q0.c(s51.f.C4553f.class), oVar, wVar.new g(null));
        zVar.v(q0.c(s51.f.i.class), oVar, wVar.new h(null));
        zVar.v(q0.c(s51.f.SetError.class), oVar, wVar.new i(null));
        zVar.x(q0.c(s51.f.g.class), oVar, wVar.new j(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(w wVar, k10.z zVar) {
        k kVar = wVar.new k(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(s51.f.C4553f.class), oVar, kVar);
        zVar.v(q0.c(s51.f.SetError.class), oVar, wVar.new l(null));
        zVar.x(q0.c(s51.f.g.class), oVar, wVar.new m(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<s51.f.e> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<s51.g, s51.f> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<s51.h.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: u9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(u51.a aVar) {
        super.P5(aVar);
    }
}
