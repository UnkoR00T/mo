package ws3;

import cj0.ZusEVisitDepartment;
import fr.q0;
import mr3.UserDocumentData;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import ss3.SummaryData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00032\u00020\u0005BC\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0017H\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001d\u001a\u00020\u001c*\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010!\u001a\u00020 *\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u0013\u0010%\u001a\u00020$*\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u0013\u0010(\u001a\u00020'*\u00020\u0002H\u0002¢\u0006\u0004\b(\u0010)J\u001b\u0010-\u001a\u00020,*\u00020#2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0017H\u0002¢\u0006\u0004\b/\u0010\u001bJ\u0017\u00101\u001a\u00020\u00172\u0006\u00100\u001a\u00020$H\u0002¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0017H\u0002¢\u0006\u0004\b3\u0010\u001bJ\u000f\u00104\u001a\u00020\u0017H\u0002¢\u0006\u0004\b4\u0010\u001bJ\u000f\u00105\u001a\u00020\u0017H\u0002¢\u0006\u0004\b5\u0010\u001bJ\u000f\u00106\u001a\u00020\u0017H\u0002¢\u0006\u0004\b6\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010;R\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR,\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030D8\u0014X\u0094\u0004¢\u0006\u0012\n\u0004\bE\u0010F\u0012\u0004\bI\u0010\u001b\u001a\u0004\bG\u0010HR \u0010Q\u001a\b\u0012\u0004\u0012\u00020L0K8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR&\u0010X\u001a\b\u0012\u0004\u0012\u00020'0R8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bS\u0010T\u0012\u0004\bW\u0010\u001b\u001a\u0004\bU\u0010VR\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020Z0Y8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bM\u0010[¨\u0006]"}, d2 = {"Lws3/v;", "Ll00/g;", "Lws3/h;", "", "Lws3/i;", "Li70/n;", "Lyy/a;", "stateMachineFactory", "Lnr3/b;", "bookZusEVisitWithLoaderUseCase", "Lxs3/b;", "screenMapper", "Lib4/c;", "errorMapper", "snackBarManagerStateHolder", "Llr3/a;", "zusVisitContainersInteractor", "Lws3/g;", "setupData", "<init>", "(Lyy/a;Lnr3/b;Lxs3/b;Lib4/c;Li70/n;Llr3/a;Lws3/g;)V", "Lp50/a;", "snackBarData", "Loq/i0;", "y", "(Lp50/a;)V", "B0", "()V", "Lws3/h$b;", "M9", "(Lws3/h$b;)Lws3/h$b;", "Lss3/b;", "", "x9", "(Lss3/b;)Ljava/lang/String;", "Ldx/b;", "", "z9", "(Ldx/b;)Z", "Lws3/i$a;", "C9", "(Lws3/h;)Lws3/i$a;", "Lys3/a;", "errorEntry", "Ljb4/b;", "B9", "(Ldx/b;Lys3/a;)Ljb4/b;", "d", "isChecked", "E9", "(Z)V", "F9", "w9", "L9", "A9", "b", "Lnr3/b;", "c", "Lxs3/b;", "Lib4/c;", "e", "Li70/n;", "f", "Llr3/a;", "Lws3/h$a;", "g", "Lws3/h$a;", "initialState", "Lk10/t;", "h", "Lk10/t;", "e9", "()Lk10/t;", "getStateMachine$annotations", "stateMachine", "Lxw/b;", "Lws3/c;", "j", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "getState$annotations", "state", "Lmu/g;", "Li70/p;", "()Lmu/g;", "snackBarVisibilityState", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v extends l00.g<ws3.h, Object> implements ws3.i, zx.d, i70.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final nr3.b bookZusEVisitWithLoaderUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final xs3.b screenMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ib4.c errorMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final lr3.a zusVisitContainersInteractor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ws3.h.a initialState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final k10.t<ws3.h, Object> stateMachine;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ws3.c> navAction;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p0<ws3.i.a> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f214991a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f214992b;

        static {
            int[] iArr = new int[ss3.a.values().length];
            try {
                iArr[ss3.a.NEW_VISIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ss3.a.INITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ss3.a.REDO_VISIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f214991a = iArr;
            int[] iArr2 = new int[ys3.a.values().length];
            try {
                iArr2[ys3.a.LOAD_DATA.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ys3.a.BOOK_VISIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ys3.a.BOOK_VISIT_BAD_REQUEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f214992b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class b extends fr.q implements er.a<i0> {
        b(Object obj) {
            super(0, obj, v.class, "onMoreClick", "onMoreClick()V", 0);
        }

        public final void E() {
            ((v) this.f66391b).F9();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            E();
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class c extends fr.q implements er.l<Boolean, i0> {
        c(Object obj) {
            super(1, obj, v.class, "onCheckBoxChange", "onCheckBoxChange(Z)V", 0);
        }

        public final void E(boolean z15) {
            ((v) this.f66391b).E9(z15);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(Boolean bool) {
            E(bool.booleanValue());
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class d extends fr.q implements er.a<i0> {
        d(Object obj) {
            super(0, obj, v.class, "bookVisit", "bookVisit()V", 0);
        }

        public final void E() {
            ((v) this.f66391b).w9();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            E();
            return i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f214993e;

        e(tq.e<? super e> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f214993e;
            if (i15 == 0) {
                oq.u.b(obj);
                v vVar = v.this;
                ws3.c.a aVar = ws3.c.a.f214921a;
                this.f214993e = 1;
                if (vVar.F(aVar, this) == objE) {
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
            return v.this.new e(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((e) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class f implements mu.g<ws3.i.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f214995a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ v f214996b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f214997a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ v f214998b;

            /* JADX INFO: renamed from: ws3.v$f$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5708a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f214999d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f215000e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f215001f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f215003h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f215004j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f215005k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f215006l;

                public C5708a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f214999d = obj;
                    this.f215000e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, v vVar) {
                this.f214997a = hVar;
                this.f214998b = vVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5708a c5708a;
                if (eVar instanceof C5708a) {
                    c5708a = (C5708a) eVar;
                    int i15 = c5708a.f215000e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5708a.f215000e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5708a = new C5708a(eVar);
                    }
                } else {
                    c5708a = new C5708a(eVar);
                }
                Object obj2 = c5708a.f214999d;
                Object objE = uq.b.e();
                int i16 = c5708a.f215000e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f214997a;
                    ws3.i.a aVarC9 = this.f214998b.C9((ws3.h) obj);
                    c5708a.f215001f = vq.j.a(obj);
                    c5708a.f215003h = vq.j.a(c5708a);
                    c5708a.f215004j = vq.j.a(obj);
                    c5708a.f215005k = vq.j.a(hVar);
                    c5708a.f215006l = 0;
                    c5708a.f215000e = 1;
                    if (hVar.F(aVarC9, c5708a) == objE) {
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

        public f(mu.g gVar, v vVar) {
            this.f214995a = gVar;
            this.f214996b = vVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super ws3.i.a> hVar, tq.e eVar) {
            Object objA = this.f214995a.a(new a(hVar, this.f214996b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lws3/h$a;", "it", "Loq/i0;", "<anonymous>", "(Lws3/h$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.p<ws3.h.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f215007e;

        g(tq.e<? super g> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f215007e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            v.this.A9();
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ws3.h.a aVar, tq.e<? super i0> eVar) {
            return ((g) v(aVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return v.this.new g(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lws3/b;", "<unused var>", "Lk10/c0;", "Lws3/h;", "state", "Lk10/l;", "<anonymous>", "(Lws3/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<ws3.b, k10.c0<ws3.h>, tq.e<? super k10.l<? extends ws3.h>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f215009e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f215010f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f215011g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f215012h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f215013j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f215014k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ SetupData f215016m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(SetupData setupData, tq.e<? super h> eVar) {
            super(3, eVar);
            this.f215016m = setupData;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ws3.h.Initialized O(SetupData setupData, UserDocumentData userDocumentData, ws3.h hVar) {
            return new ws3.h.Initialized(setupData.getSummaryData(), userDocumentData, false, false, false, false, 60, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0075, code lost:
        
            if (r2.F(r5, r7) == r1) goto L17;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f215014k
                k10.c0 r0 = (k10.c0) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r7.f215013j
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L2a
                if (r2 == r4) goto L26
                if (r2 != r3) goto L1e
                java.lang.Object r1 = r7.f215010f
                dx.b r1 = (dx.b) r1
                java.lang.Object r1 = r7.f215009e
                dx.i r1 = (dx.i) r1
                oq.u.b(r8)
                goto L78
            L1e:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L26:
                oq.u.b(r8)
                goto L3e
            L2a:
                oq.u.b(r8)
                ws3.v r8 = ws3.v.this
                lr3.a r8 = ws3.v.o9(r8)
                r7.f215014k = r0
                r7.f215013j = r4
                java.lang.Object r8 = r8.a(r7)
                if (r8 != r1) goto L3e
                goto L77
            L3e:
                dx.i r8 = (dx.i) r8
                ws3.v r2 = ws3.v.this
                ws3.g r4 = r7.f215016m
                boolean r5 = r8 instanceof dx.i.Left
                if (r5 == 0) goto L7d
                r4 = r8
                dx.i$b r4 = (dx.i.Left) r4
                java.lang.Object r4 = r4.b()
                dx.b r4 = (dx.b) r4
                ws3.c$b r5 = new ws3.c$b
                ys3.a r6 = ys3.a.LOAD_DATA
                jb4.b r6 = ws3.v.r9(r2, r4, r6)
                r5.<init>(r6)
                r7.f215014k = r0
                java.lang.Object r8 = vq.j.a(r8)
                r7.f215009e = r8
                java.lang.Object r8 = vq.j.a(r4)
                r7.f215010f = r8
                r8 = 0
                r7.f215011g = r8
                r7.f215012h = r8
                r7.f215013j = r3
                java.lang.Object r8 = r2.F(r5, r7)
                if (r8 != r1) goto L78
            L77:
                return r1
            L78:
                k10.l r8 = r0.c()
                return r8
            L7d:
                boolean r1 = r8 instanceof dx.i.Right
                if (r1 == 0) goto L93
                dx.i$c r8 = (dx.i.Right) r8
                java.lang.Object r8 = r8.b()
                mr3.a r8 = (mr3.UserDocumentData) r8
                ws3.w r1 = new ws3.w
                r1.<init>()
                k10.l r8 = r0.d(r1)
                return r8
            L93:
                oq.p r8 = new oq.p
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: ws3.v.h.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ws3.b bVar, k10.c0<ws3.h> c0Var, tq.e<? super k10.l<? extends ws3.h>> eVar) {
            h hVar = v.this.new h(this.f215016m, eVar);
            hVar.f215014k = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lws3/f;", "event", "Lk10/c0;", "Lws3/h$b;", "state", "Lk10/l;", "Lws3/h;", "<anonymous>", "(Lws3/f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<StatementChecked, k10.c0<ws3.h.Initialized>, tq.e<? super k10.l<? extends ws3.h>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f215017e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f215018f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f215019g;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ws3.h.Initialized O(v vVar, StatementChecked statementChecked, ws3.h.Initialized initialized) {
            return vVar.M9(ws3.h.Initialized.b(initialized, null, null, statementChecked.getIsChecked(), false, false, false, 43, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final StatementChecked statementChecked = (StatementChecked) this.f215018f;
            k10.c0 c0Var = (k10.c0) this.f215019g;
            uq.b.e();
            if (this.f215017e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final v vVar = v.this;
            return c0Var.b(new er.l() { // from class: ws3.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return v.i.O(vVar, statementChecked, (h.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(StatementChecked statementChecked, k10.c0<ws3.h.Initialized> c0Var, tq.e<? super k10.l<? extends ws3.h>> eVar) {
            i iVar = v.this.new i(eVar);
            iVar.f215018f = statementChecked;
            iVar.f215019g = c0Var;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lws3/d;", "<unused var>", "Lws3/h$b;", "Loq/i0;", "<anonymous>", "(Lws3/d;Lws3/h$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<ws3.d, ws3.h.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f215021e;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f215021e;
            if (i15 == 0) {
                oq.u.b(obj);
                v vVar = v.this;
                ws3.c.d dVar = ws3.c.d.f214924a;
                this.f215021e = 1;
                if (vVar.F(dVar, this) == objE) {
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
        public final Object w(ws3.d dVar, ws3.h.Initialized initialized, tq.e<? super i0> eVar) {
            return v.this.new j(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lws3/e;", "<unused var>", "Lk10/c0;", "Lws3/h$b;", "state", "Lk10/l;", "Lws3/h;", "<anonymous>", "(Lws3/e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<ws3.e, k10.c0<ws3.h.Initialized>, tq.e<? super k10.l<? extends ws3.h>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f215023e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f215024f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ws3.h.Initialized O(k10.c0 c0Var, ws3.h.Initialized initialized) {
            return ws3.h.Initialized.b((ws3.h.Initialized) c0Var.a(), null, null, false, false, false, false, 31, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f215024f;
            uq.b.e();
            if (this.f215023e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ws3.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return v.k.O(c0Var, (h.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ws3.e eVar, k10.c0<ws3.h.Initialized> c0Var, tq.e<? super k10.l<? extends ws3.h>> eVar2) {
            k kVar = new k(eVar2);
            kVar.f215024f = c0Var;
            return kVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lws3/a;", "<unused var>", "Lk10/c0;", "Lws3/h$b;", "state", "Lk10/l;", "Lws3/h;", "<anonymous>", "(Lws3/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<ws3.a, k10.c0<ws3.h.Initialized>, tq.e<? super k10.l<? extends ws3.h>>, Object> {
        int A;
        int B;
        /* synthetic */ Object C;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f215025e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f215026f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f215027g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f215028h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f215029j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f215030k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f215031l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f215032m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f215033n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f215034p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f215035q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f215036r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f215037s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f215038t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f215039v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f215040w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f215041x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f215042y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f215043z;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ws3.h.Initialized O(ws3.h.Initialized initialized, ws3.h.Initialized initialized2) {
            return ws3.h.Initialized.b(initialized, null, null, false, false, true, true, 15, null);
        }

        /* JADX WARN: Code duplicated, block: B:151:0x034c  */
        /* JADX WARN: Code duplicated, block: B:154:0x0362 A[Catch: Exception -> 0x03db, c -> 0x03df, CancellationException -> 0x03e3, TRY_LEAVE, TryCatch #8 {c -> 0x03df, CancellationException -> 0x03e3, Exception -> 0x03db, blocks: (B:152:0x035a, B:154:0x0362), top: B:218:0x035a }] */
        /* JADX WARN: Code duplicated, block: B:159:0x03ca  */
        /* JADX WARN: Code duplicated, block: B:173:0x03e7  */
        /* JADX WARN: Code duplicated, block: B:185:0x0428  */
        /* JADX WARN: Code duplicated, block: B:188:0x0439  */
        /* JADX WARN: Code duplicated, block: B:189:0x0447  */
        /* JADX WARN: Code duplicated, block: B:191:0x044b  */
        /* JADX WARN: Code duplicated, block: B:195:0x045d  */
        /* JADX WARN: Code duplicated, block: B:197:0x046f  */
        /* JADX WARN: Code duplicated, block: B:198:0x0472 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:199:0x0474  */
        /* JADX WARN: Code duplicated, block: B:203:0x04ad  */
        /* JADX WARN: Code duplicated, block: B:207:0x04b8  */
        /* JADX WARN: Code duplicated, block: B:57:0x0161  */
        /* JADX WARN: Code duplicated, block: B:73:0x019c  */
        /* JADX WARN: Code restructure failed: missing block: B:201:0x04aa, code lost:
        
            if (r0.F(r6, r36) == r3) goto L202;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v24 */
        /* JADX WARN: Type inference failed for: r0v27, types: [int] */
        /* JADX WARN: Type inference failed for: r0v63 */
        /* JADX WARN: Type inference failed for: r6v10 */
        /* JADX WARN: Type inference failed for: r6v11, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r6v19 */
        /* JADX WARN: Type inference failed for: r9v15 */
        /* JADX WARN: Type inference failed for: r9v18, types: [int] */
        /* JADX WARN: Type inference failed for: r9v21 */
        /* JADX WARN: Type inference failed for: r9v6 */
        /* JADX WARN: Type inference failed for: r9v7, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r9v8 */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r37) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1215
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ws3.v.l.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ws3.a aVar, k10.c0<ws3.h.Initialized> c0Var, tq.e<? super k10.l<? extends ws3.h>> eVar) {
            l lVar = v.this.new l(eVar);
            lVar.C = c0Var;
            return lVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f215044e;

        m(tq.e<? super m> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f215044e;
            if (i15 == 0) {
                oq.u.b(obj);
                v vVar = v.this;
                ws3.c.e eVar = ws3.c.e.f214925a;
                this.f215044e = 1;
                if (vVar.F(eVar, this) == objE) {
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
            return v.this.new m(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((m) M(eVar)).J(i0.f148189a);
        }
    }

    public v(yy.a aVar, nr3.b bVar, xs3.b bVar2, ib4.c cVar, i70.n nVar, lr3.a aVar2, final SetupData setupData) {
        this.bookZusEVisitWithLoaderUseCase = bVar;
        this.screenMapper = bVar2;
        this.errorMapper = cVar;
        this.snackBarManagerStateHolder = nVar;
        this.zusVisitContainersInteractor = aVar2;
        ws3.h.a aVar3 = ws3.h.a.f214931a;
        this.initialState = aVar3;
        this.stateMachine = aVar.a(aVar3, new er.l() { // from class: ws3.u
            @Override // er.l
            public final Object b(Object obj) {
                return v.H9(this.f214980a, setupData, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new f(e9().getState(), this), C9(aVar3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A9() {
        d9(ws3.b.f214919a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b B9(dx.b bVar, final ys3.a aVar) {
        return this.errorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: ws3.t
            @Override // er.l
            public final Object b(Object obj) {
                return v.D9(aVar, this, (ib4.c.b) obj);
            }
        }, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ws3.i.a C9(ws3.h hVar) {
        return this.screenMapper.b(new xs3.b.Params(hVar, new d(this), new b(this), new c(this), b9(ws3.e.f214928a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(ys3.a aVar, v vVar, ib4.c.b bVar) {
        if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
            int i15 = a.f214992b[aVar.ordinal()];
            if (i15 == 1) {
                vVar.A9();
            } else if (i15 == 2) {
                vVar.w9();
            } else {
                if (i15 != 3) {
                    throw new oq.p();
                }
                vVar.L9();
            }
        } else if ((bVar instanceof ib4.c.b.AbstractC2161b.a) && a.f214992b[aVar.ordinal()] == 1) {
            vVar.d();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E9(boolean isChecked) {
        d9(new StatementChecked(isChecked));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F9() {
        d9(ws3.d.f214927a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H9(final v vVar, final SetupData setupData, k10.v vVar2) {
        vVar2.c(q0.c(ws3.h.a.class), new er.l() { // from class: ws3.q
            @Override // er.l
            public final Object b(Object obj) {
                return v.I9(this.f214974a, (k10.z) obj);
            }
        });
        vVar2.c(q0.c(ws3.h.class), new er.l() { // from class: ws3.r
            @Override // er.l
            public final Object b(Object obj) {
                return v.J9(this.f214975a, setupData, (k10.z) obj);
            }
        });
        vVar2.c(q0.c(ws3.h.Initialized.class), new er.l() { // from class: ws3.s
            @Override // er.l
            public final Object b(Object obj) {
                return v.K9(this.f214977a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I9(v vVar, k10.z zVar) {
        zVar.C(vVar.new g(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J9(v vVar, SetupData setupData, k10.z zVar) {
        h hVar = vVar.new h(setupData, null);
        zVar.v(q0.c(ws3.b.class), k10.o.CANCEL_PREVIOUS, hVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K9(v vVar, k10.z zVar) {
        i iVar = vVar.new i(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(StatementChecked.class), oVar, iVar);
        zVar.x(q0.c(ws3.d.class), oVar, vVar.new j(null));
        zVar.v(q0.c(ws3.e.class), oVar, new k(null));
        zVar.v(q0.c(ws3.a.class), oVar, vVar.new l(null));
        return i0.f148189a;
    }

    private final void L9() {
        i00.a.a(this, new m(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ws3.h.Initialized M9(ws3.h.Initialized initialized) {
        return ws3.h.Initialized.b(initialized, null, null, false, !initialized.getIsStatementAccepted(), false, false, 55, null);
    }

    private final void d() {
        i00.a.a(this, new e(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w9() {
        d9(ws3.a.f214918a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String x9(SummaryData summaryData) {
        String name;
        ZusEVisitDepartment department = summaryData.getDepartment();
        if (department == null) {
            return "";
        }
        int i15 = a.f214991a[summaryData.getNewVisitState().ordinal()];
        if (i15 == 1 || i15 == 2) {
            name = department.getName() + ", " + department.getPostcode() + ' ' + department.getCity() + ", " + department.getStreet() + ' ' + department.getBuildingNumber();
        } else {
            if (i15 != 3) {
                throw new oq.p();
            }
            name = department.getName();
        }
        return name == null ? "" : name;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean z9(dx.b bVar) {
        return (bVar instanceof dx.b.g.Http) && ((dx.b.g.Http) bVar).getCode() == dx.b.g.Http.a.BAD_REQUEST;
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: G9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }

    @Override // zx.b
    public xw.b<ws3.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<ws3.h, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<ws3.i.a> getState() {
        return this.state;
    }

    @Override // i70.n
    public mu.g<i70.p> j() {
        return this.snackBarManagerStateHolder.j();
    }

    @Override // i70.n
    public void y(p50.a snackBarData) {
        this.snackBarManagerStateHolder.y(snackBarData);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: y9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(ws3.c cVar, tq.e<? super i0> eVar) {
        return super.F(cVar, eVar);
    }
}
