package ly2;

import fr.q0;
import k10.c0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006B[\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0096\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\"H\u0096\u0001¢\u0006\u0004\b%\u0010&R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R&\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003098\u0014X\u0094\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R \u0010E\u001a\b\u0012\u0004\u0012\u00020@0?8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0F8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0018\u0010O\u001a\u00020L*\u00020K8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0018\u0010S\u001a\u00020P*\u00020L8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010R¨\u0006T"}, d2 = {"Lly2/s;", "Ll00/g;", "Lly2/f;", "Lly2/a;", "Lly2/g;", "", "Li70/e;", "Lyy/a;", "stateMachineFactory", "Lmy2/c;", "mapper", "Lmy2/b;", "errorMapper", "Ljj0/b;", "hasTrustedProfileUseCase", "Lac4/a;", "callActionWithLoaderUseCase", "globalSnackBarManager", "Ll44/e;", "getUserEdorAddressUC", "Lhb4/d;", "errorVMSFactory", "Liv2/a;", "isDocumentPhotoFeatureFlagActiveUC", "Llv2/a;", "applicationOwner", "<init>", "(Lyy/a;Lmy2/c;Lmy2/b;Ljj0/b;Lac4/a;Li70/e;Ll44/e;Lhb4/d;Liv2/a;Llv2/a;)V", "state", "Lly2/g$a;", "x9", "(Lly2/f;)Lly2/g$a;", "Lp50/a;", "snackBarData", "Loq/i0;", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lmy2/c;", "c", "Lmy2/b;", "d", "Ljj0/b;", "e", "Lac4/a;", "f", "Li70/e;", "g", "Ll44/e;", "h", "Lhb4/d;", "Lly2/f$b;", "j", "Lly2/f$b;", "initialState", "Lk10/t;", "k", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lly2/a$e;", "l", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "m", "Lmu/p0;", "getState", "()Lmu/p0;", "Ldx/b;", "Lmy2/b$a;", "v9", "(Ldx/b;)Lmy2/b$a;", "genericErrorParams", "Lhb4/c;", "w9", "(Lmy2/b$a;)Lhb4/c;", "vmsAdapter", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s extends l00.g<ly2.f, ly2.a> implements ly2.g, zx.d, i70.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final my2.c mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final my2.b errorMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final jj0.b hasTrustedProfileUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final l44.e getUserEdorAddressUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final ly2.f.Initialized initialState;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final k10.t<ly2.f, ly2.a> stateMachine;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ly2.a.e> navAction;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final p0<ly2.g.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<ly2.g.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f121537a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ s f121538b;

        /* JADX INFO: renamed from: ly2.s$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2977a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f121539a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ s f121540b;

            /* JADX INFO: renamed from: ly2.s$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2978a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f121541d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f121542e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f121543f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f121545h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f121546j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f121547k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f121548l;

                public C2978a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f121541d = obj;
                    this.f121542e |= PKIFailureInfo.systemUnavail;
                    return C2977a.this.F(null, this);
                }
            }

            public C2977a(mu.h hVar, s sVar) {
                this.f121539a = hVar;
                this.f121540b = sVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2978a c2978a;
                if (eVar instanceof C2978a) {
                    c2978a = (C2978a) eVar;
                    int i15 = c2978a.f121542e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2978a.f121542e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2978a = new C2978a(eVar);
                    }
                } else {
                    c2978a = new C2978a(eVar);
                }
                Object obj2 = c2978a.f121541d;
                Object objE = uq.b.e();
                int i16 = c2978a.f121542e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f121539a;
                    ly2.g.a aVarX9 = this.f121540b.x9((ly2.f) obj);
                    c2978a.f121543f = vq.j.a(obj);
                    c2978a.f121545h = vq.j.a(c2978a);
                    c2978a.f121546j = vq.j.a(obj);
                    c2978a.f121547k = vq.j.a(hVar);
                    c2978a.f121548l = 0;
                    c2978a.f121542e = 1;
                    if (hVar.F(aVarX9, c2978a) == objE) {
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

        public a(mu.g gVar, s sVar) {
            this.f121537a = gVar;
            this.f121538b = sVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super ly2.g.a> hVar, tq.e eVar) {
            Object objA = this.f121537a.a(new C2977a(hVar, this.f121538b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lly2/a$b;", "<unused var>", "Lly2/f;", "Loq/i0;", "<anonymous>", "(Lly2/a$b;Lly2/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<ly2.a.b, ly2.f, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f121549e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f121549e;
            if (i15 == 0) {
                oq.u.b(obj);
                s sVar = s.this;
                ly2.a.e.C2974a c2974a = ly2.a.e.C2974a.f121482a;
                this.f121549e = 1;
                if (sVar.F(c2974a, this) == objE) {
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
        public final Object w(ly2.a.b bVar, ly2.f fVar, tq.e<? super i0> eVar) {
            return s.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lly2/a$a;", "<unused var>", "Lly2/f;", "Loq/i0;", "<anonymous>", "(Lly2/a$a;Lly2/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<ly2.a.C2973a, ly2.f, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f121551e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f121551e;
            if (i15 == 0) {
                oq.u.b(obj);
                s sVar = s.this;
                ly2.a.e.c cVar = ly2.a.e.c.f121484a;
                this.f121551e = 1;
                if (sVar.F(cVar, this) == objE) {
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
        public final Object w(ly2.a.C2973a c2973a, ly2.f fVar, tq.e<? super i0> eVar) {
            return s.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lly2/a$c;", "<unused var>", "Lly2/f$d;", "Loq/i0;", "<anonymous>", "(Lly2/a$c;Lly2/f$d;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<ly2.a.c, ly2.f.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f121553e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f121553e;
            if (i15 == 0) {
                oq.u.b(obj);
                s sVar = s.this;
                ly2.a.e.d dVar = ly2.a.e.d.f121485a;
                this.f121553e = 1;
                if (sVar.F(dVar, this) == objE) {
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
        public final Object w(ly2.a.c cVar, ly2.f.d dVar, tq.e<? super i0> eVar) {
            return s.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lly2/a$f;", "<unused var>", "Lk10/c0;", "Lly2/f$d;", "state", "Lk10/l;", "Lly2/f;", "<anonymous>", "(Lly2/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<ly2.a.f, c0<ly2.f.d>, tq.e<? super k10.l<? extends ly2.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f121555e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f121556f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ lv2.a f121557g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(lv2.a aVar, tq.e<? super e> eVar) {
            super(3, eVar);
            this.f121557g = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Checking O(lv2.a aVar, ly2.f.d dVar) {
            return new Checking(aVar, dVar.getIsIdentityPhotoFeatureEnabled());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f121556f;
            uq.b.e();
            if (this.f121555e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final lv2.a aVar = this.f121557g;
            return c0Var.d(new er.l() { // from class: ly2.t
                @Override // er.l
                public final Object b(Object obj2) {
                    return s.e.O(aVar, (f.d) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ly2.a.f fVar, c0<ly2.f.d> c0Var, tq.e<? super k10.l<? extends ly2.f>> eVar) {
            e eVar2 = new e(this.f121557g, eVar);
            eVar2.f121556f = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lly2/d;", "state", "Lk10/l;", "Lly2/f;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.p<c0<Checking>, tq.e<? super k10.l<? extends ly2.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f121558e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f121559f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ lv2.a f121561h;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lly2/f;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends ly2.f>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f121562e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ s f121563f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ c0<Checking> f121564g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ lv2.a f121565h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(s sVar, c0<Checking> c0Var, lv2.a aVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f121563f = sVar;
                this.f121564g = c0Var;
                this.f121565h = aVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Error Y(s sVar, dx.b bVar, lv2.a aVar, Checking checking) {
                return new Error(sVar.w9(sVar.v9(bVar)), aVar, checking.getIsIdentityPhotoFeatureEnabled());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ly2.f.InitializedWithTrustedProfile Z(lv2.a aVar, Checking checking) {
                return new ly2.f.InitializedWithTrustedProfile(aVar, checking.getIsIdentityPhotoFeatureEnabled());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Error a0(s sVar, lv2.a aVar, Checking checking) {
                return new Error(sVar.w9(new my2.b.Params(ny2.a.b.f139693a, sVar.b9(ly2.c.f121493a), sVar.b9(ly2.b.f121491a))), aVar, checking.getIsIdentityPhotoFeatureEnabled());
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f121562e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    jj0.b bVar = this.f121563f.hasTrustedProfileUseCase;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    this.f121562e = 1;
                    obj = bVar.c(c1792a, this);
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
                c0<Checking> c0Var = this.f121564g;
                final s sVar = this.f121563f;
                final lv2.a aVar = this.f121565h;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar2 = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: ly2.u
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return s.f.a.Y(sVar, bVar2, aVar, (Checking) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                boolean zBooleanValue = ((Boolean) ((dx.i.Right) iVar).b()).booleanValue();
                if (zBooleanValue) {
                    return c0Var.d(new er.l() { // from class: ly2.v
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return s.f.a.Z(aVar, (Checking) obj2);
                        }
                    });
                }
                if (zBooleanValue) {
                    throw new oq.p();
                }
                return c0Var.d(new er.l() { // from class: ly2.w
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return s.f.a.a0(sVar, aVar, (Checking) obj2);
                    }
                });
            }

            public final tq.e<i0> V(tq.e<?> eVar) {
                return new a(this.f121563f, this.f121564g, this.f121565h, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends ly2.f>> eVar) {
                return ((a) V(eVar)).J(i0.f148189a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(lv2.a aVar, tq.e<? super f> eVar) {
            super(2, eVar);
            this.f121561h = aVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f121559f;
            Object objE = uq.b.e();
            int i15 = this.f121558e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = s.this.callActionWithLoaderUseCase;
            a aVar2 = new a(s.this, c0Var, this.f121561h, null);
            this.f121559f = vq.j.a(c0Var);
            this.f121558e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<Checking> c0Var, tq.e<? super k10.l<? extends ly2.f>> eVar) {
            return ((f) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            f fVar = s.this.new f(this.f121561h, eVar);
            fVar.f121559f = obj;
            return fVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lly2/c;", "<unused var>", "Lk10/c0;", "Lly2/e;", "state", "Lk10/l;", "Lly2/f;", "<anonymous>", "(Lly2/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<ly2.c, c0<Error>, tq.e<? super k10.l<? extends ly2.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f121566e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f121567f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ lv2.a f121568g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(lv2.a aVar, tq.e<? super g> eVar) {
            super(3, eVar);
            this.f121568g = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Checking O(lv2.a aVar, Error error) {
            return new Checking(aVar, error.getIsIdentityPhotoFeatureEnabled());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f121567f;
            uq.b.e();
            if (this.f121566e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final lv2.a aVar = this.f121568g;
            return c0Var.d(new er.l() { // from class: ly2.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return s.g.O(aVar, (Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ly2.c cVar, c0<Error> c0Var, tq.e<? super k10.l<? extends ly2.f>> eVar) {
            g gVar = new g(this.f121568g, eVar);
            gVar.f121567f = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lly2/b;", "<unused var>", "Lly2/e;", "Loq/i0;", "<anonymous>", "(Lly2/b;Lly2/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<ly2.b, Error, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f121569e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f121569e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            s.this.d9(ly2.a.b.f121478a);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ly2.b bVar, Error error, tq.e<? super i0> eVar) {
            return s.this.new h(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lly2/f$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lly2/f$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.p<ly2.f.InitializedWithTrustedProfile, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f121571e;

        i(tq.e<? super i> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(s sVar, iy.b0 b0Var) {
            sVar.d9(new ly2.a.GoToWizard(b0Var));
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f121571e;
            if (i15 == 0) {
                oq.u.b(obj);
                iy.b0 b0VarA = s.this.getUserEdorAddressUC.a(gz.b.a.C1792a.f78542a);
                if (b0VarA != null) {
                    s.this.d9(new ly2.a.GoToWizard(b0VarA));
                } else {
                    s sVar = s.this;
                    final s sVar2 = s.this;
                    ly2.a.e.EdorAuth edorAuth = new ly2.a.e.EdorAuth(new mv3.a.EdorAddressRequired(new er.l() { // from class: ly2.y
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return s.i.O(sVar2, (iy.b0) obj2);
                        }
                    }, null, 2, null));
                    this.f121571e = 1;
                    if (sVar.F(edorAuth, this) == objE) {
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

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(ly2.f.InitializedWithTrustedProfile initializedWithTrustedProfile, tq.e<? super i0> eVar) {
            return ((i) v(initializedWithTrustedProfile, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return s.this.new i(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lly2/a$d;", "action", "Lly2/f$c;", "state", "Loq/i0;", "<anonymous>", "(Lly2/a$d;Lly2/f$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<ly2.a.GoToWizard, ly2.f.InitializedWithTrustedProfile, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f121573e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f121574f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f121575g;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ly2.a.GoToWizard goToWizard = (ly2.a.GoToWizard) this.f121574f;
            ly2.f.InitializedWithTrustedProfile initializedWithTrustedProfile = (ly2.f.InitializedWithTrustedProfile) this.f121575g;
            Object objE = uq.b.e();
            int i15 = this.f121573e;
            if (i15 == 0) {
                oq.u.b(obj);
                s sVar = s.this;
                ly2.a.e.GoToWizard goToWizard2 = new ly2.a.e.GoToWizard(initializedWithTrustedProfile.getIsIdentityPhotoFeatureEnabled(), goToWizard.getUserEdorAddress());
                this.f121574f = vq.j.a(goToWizard);
                this.f121575g = vq.j.a(initializedWithTrustedProfile);
                this.f121573e = 1;
                if (sVar.F(goToWizard2, this) == objE) {
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
        public final Object w(ly2.a.GoToWizard goToWizard, ly2.f.InitializedWithTrustedProfile initializedWithTrustedProfile, tq.e<? super i0> eVar) {
            j jVar = s.this.new j(eVar);
            jVar.f121574f = goToWizard;
            jVar.f121575g = initializedWithTrustedProfile;
            return jVar.J(i0.f148189a);
        }
    }

    public s(yy.a aVar, my2.c cVar, my2.b bVar, jj0.b bVar2, ac4.a aVar2, i70.e eVar, l44.e eVar2, hb4.d dVar, iv2.a aVar3, final lv2.a aVar4) {
        this.mapper = cVar;
        this.errorMapper = bVar;
        this.hasTrustedProfileUseCase = bVar2;
        this.callActionWithLoaderUseCase = aVar2;
        this.globalSnackBarManager = eVar;
        this.getUserEdorAddressUC = eVar2;
        this.errorVMSFactory = dVar;
        ly2.f.Initialized initialized = new ly2.f.Initialized(aVar4, aVar3.a(gz.b.a.C1792a.f78542a).booleanValue());
        this.initialState = initialized;
        this.stateMachine = aVar.a(initialized, new er.l() { // from class: ly2.r
            @Override // er.l
            public final Object b(Object obj) {
                return s.z9(this.f121524a, aVar4, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), x9(initialized));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(s sVar, k10.z zVar) {
        b bVar = sVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(ly2.a.b.class), oVar, bVar);
        zVar.x(q0.c(ly2.a.C2973a.class), oVar, sVar.new c(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(s sVar, lv2.a aVar, k10.z zVar) {
        d dVar = sVar.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(ly2.a.c.class), oVar, dVar);
        zVar.v(q0.c(ly2.a.f.class), oVar, new e(aVar, null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(s sVar, lv2.a aVar, k10.z zVar) {
        zVar.A(sVar.new f(aVar, null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(lv2.a aVar, s sVar, k10.z zVar) {
        g gVar = new g(aVar, null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(ly2.c.class), oVar, gVar);
        zVar.x(q0.c(ly2.b.class), oVar, sVar.new h(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E9(s sVar, k10.z zVar) {
        zVar.C(sVar.new i(null));
        j jVar = sVar.new j(null);
        zVar.x(q0.c(ly2.a.GoToWizard.class), k10.o.CANCEL_PREVIOUS, jVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final my2.b.Params v9(dx.b bVar) {
        return new my2.b.Params(new ny2.a.Generic(bVar), b9(ly2.c.f121493a), b9(ly2.b.f121491a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hb4.c w9(my2.b.Params params) {
        return this.errorVMSFactory.a(this.errorMapper.b(params));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ly2.g.a x9(ly2.f state) {
        my2.c cVar = this.mapper;
        ly2.a.C2973a c2973a = ly2.a.C2973a.f121477a;
        return cVar.b(new my2.c.Params(state, b9(c2973a), b9(ly2.a.c.f121479a), b9(c2973a), b9(ly2.a.f.f121489a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(final s sVar, final lv2.a aVar, k10.v vVar) {
        vVar.c(q0.c(ly2.f.class), new er.l() { // from class: ly2.m
            @Override // er.l
            public final Object b(Object obj) {
                return s.A9(this.f121516a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(ly2.f.d.class), new er.l() { // from class: ly2.n
            @Override // er.l
            public final Object b(Object obj) {
                return s.B9(this.f121517a, aVar, (k10.z) obj);
            }
        });
        vVar.c(q0.c(Checking.class), new er.l() { // from class: ly2.o
            @Override // er.l
            public final Object b(Object obj) {
                return s.C9(this.f121519a, aVar, (k10.z) obj);
            }
        });
        vVar.c(q0.c(Error.class), new er.l() { // from class: ly2.p
            @Override // er.l
            public final Object b(Object obj) {
                return s.D9(aVar, sVar, (k10.z) obj);
            }
        });
        vVar.c(q0.c(ly2.f.InitializedWithTrustedProfile.class), new er.l() { // from class: ly2.q
            @Override // er.l
            public final Object b(Object obj) {
                return s.E9(this.f121523a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    @Override // i70.e
    public void B0() {
        this.globalSnackBarManager.B0();
    }

    @Override // zx.b
    public xw.b<ly2.a.e> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<ly2.f, ly2.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<ly2.g.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: u9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(ly2.a.e eVar, tq.e<? super i0> eVar2) {
        return super.F(eVar, eVar2);
    }

    @Override // i70.e
    public void y(p50.a snackBarData) {
        this.globalSnackBarManager.y(snackBarData);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: y9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(lv2.a aVar) {
        super.P5(aVar);
    }
}
