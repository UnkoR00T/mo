package h92;

import fr.q0;
import j92.ViolationDescriptionResult;
import java.util.Iterator;
import java.util.Map;
import mu.p0;
import mx.Label;
import oq.i0;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import p071kotlin.Metadata;
import pq.v0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 ]2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001^Bk\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0001\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u0003H\u0082@¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\u00020!2\u0006\u0010 \u001a\u00020\u0003H\u0082@¢\u0006\u0004\b$\u0010#J\u001c\u0010'\u001a\u00020!*\u00020%2\u0006\u0010&\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b'\u0010(J$\u0010-\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0*2\u0006\u0010)\u001a\u00020\u0002H\u0082@¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020/2\u0006\u0010)\u001a\u00020\u0002H\u0002¢\u0006\u0004\b0\u00101R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010J\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR \u0010Q\u001a\b\u0012\u0004\u0012\u00020L0K8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR&\u0010W\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030R8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR \u0010)\u001a\b\u0012\u0004\u0012\u00020/0X8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\¨\u0006_"}, d2 = {"Lh92/r;", "Ll00/g;", "Lh92/b;", "Lh92/a;", "Lh92/c;", "", "Lyy/a;", "stateMachineFactory", "Le82/i;", "checkViolationFormUseCase", "Lbc4/l;", "pickPhotoFromGalleryUseCase", "Lbc4/k;", "takePhotoFromCameraWithSizeValidationUseCase", "Lk92/j;", "violationDescriptionMapper", "Lk92/d;", "violationDescriptionErrorMapper", "Lmx/c;", "labelProvider", "Lac4/a;", "callActionWithLoaderUseCase", "La00/b;", "pickedFileToAndroidMapper", "La14/m;", "goToApplicationDetailsSettingsUseCase", "Lyw/b;", "accessibilityTalkBackManager", "Lj92/a;", "contract", "<init>", "(Lyy/a;Le82/i;Lbc4/l;Lbc4/k;Lk92/j;Lk92/d;Lmx/c;Lac4/a;La00/b;La14/m;Lyw/b;Lj92/a;)V", "fromAction", "Loq/i0;", "S9", "(Lh92/a;Ltq/e;)Ljava/lang/Object;", "O9", "Ldx/b;", "retryAction", "E9", "(Ldx/b;Lh92/a;Ltq/e;)Ljava/lang/Object;", "state", "", "Lc82/a;", "Lhz/g;", "D9", "(Lh92/b;Ltq/e;)Ljava/lang/Object;", "Lh92/c$a;", "G9", "(Lh92/b;)Lh92/c$a;", "b", "Le82/i;", "c", "Lbc4/l;", "d", "Lbc4/k;", "e", "Lk92/j;", "f", "Lk92/d;", "g", "Lmx/c;", "h", "Lac4/a;", "j", "La00/b;", "k", "La14/m;", "l", "Lyw/b;", "m", "Lj92/a;", "n", "Lh92/b;", "initialState", "Lxw/b;", "Lh92/a$f;", "p", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "q", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "r", "Lmu/p0;", "getState", "()Lmu/p0;", "s", "a", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r extends l00.g<State, h92.a> implements h92.c, zx.d {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final a f82082s = new a(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f82083t = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e82.i checkViolationFormUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final bc4.l pickPhotoFromGalleryUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final bc4.k takePhotoFromCameraWithSizeValidationUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final k92.j violationDescriptionMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k92.d violationDescriptionErrorMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final a00.b pickedFileToAndroidMapper;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final a14.m goToApplicationDetailsSettingsUseCase;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final yw.b accessibilityTalkBackManager;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final j92.a contract;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final xw.b<h92.a.f> navAction;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, h92.a> stateMachine;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final p0<h92.c.Data> state;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lh92/r$a;", "", "<init>", "()V", "", "EDIT_ENTITY_NAME_LABEL_TAG", "Ljava/lang/String;", "EDIT_OFFICE_LABEL_TAG", "EDIT_DESCRIPTION_LABEL_TAG", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f82099d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f82100e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f82101f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f82102g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f82103h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f82104j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f82106l;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f82104j = obj;
            this.f82106l |= PKIFailureInfo.systemUnavail;
            return r.this.O9(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements mu.g<h92.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f82107a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f82108b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f82109a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ r f82110b;

            /* JADX INFO: renamed from: h92.r$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1890a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f82111d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f82112e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f82113f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f82115h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f82116j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f82117k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f82118l;

                public C1890a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f82111d = obj;
                    this.f82112e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, r rVar) {
                this.f82109a = hVar;
                this.f82110b = rVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1890a c1890a;
                if (eVar instanceof C1890a) {
                    c1890a = (C1890a) eVar;
                    int i15 = c1890a.f82112e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1890a.f82112e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1890a = new C1890a(eVar);
                    }
                } else {
                    c1890a = new C1890a(eVar);
                }
                Object obj2 = c1890a.f82111d;
                Object objE = uq.b.e();
                int i16 = c1890a.f82112e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f82109a;
                    h92.c.Data dataG9 = this.f82110b.G9((State) obj);
                    c1890a.f82113f = vq.j.a(obj);
                    c1890a.f82115h = vq.j.a(c1890a);
                    c1890a.f82116j = vq.j.a(obj);
                    c1890a.f82117k = vq.j.a(hVar);
                    c1890a.f82118l = 0;
                    c1890a.f82112e = 1;
                    if (hVar.F(dataG9, c1890a) == objE) {
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

        public c(mu.g gVar, r rVar) {
            this.f82107a = gVar;
            this.f82108b = rVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super h92.c.Data> hVar, tq.e eVar) {
            Object objA = this.f82107a.a(new a(hVar, this.f82108b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lh92/a$c;", "action", "Lk10/c0;", "Lh92/b;", "state", "Lk10/l;", "<anonymous>", "(Lh92/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<h92.a.AddOfficeNameAction, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f82119e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f82120f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f82121g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(h92.a.AddOfficeNameAction addOfficeNameAction, State state) {
            return State.b(state, null, new State.FieldState(null, addOfficeNameAction.getOfficeName(), 1, null), null, null, null, null, false, null, 253, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final h92.a.AddOfficeNameAction addOfficeNameAction = (h92.a.AddOfficeNameAction) this.f82120f;
            k10.c0 c0Var = (k10.c0) this.f82121g;
            uq.b.e();
            if (this.f82119e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: h92.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.d.O(addOfficeNameAction, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(h92.a.AddOfficeNameAction addOfficeNameAction, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f82120f = addOfficeNameAction;
            dVar.f82121g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lh92/a$b;", "action", "Lk10/c0;", "Lh92/b;", "state", "Lk10/l;", "<anonymous>", "(Lh92/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<h92.a.AddEntityNameAction, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f82122e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f82123f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f82124g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(h92.a.AddEntityNameAction addEntityNameAction, State state) {
            return State.b(state, null, null, new State.FieldState(null, addEntityNameAction.getEntityName(), 1, null), null, null, null, false, null, 251, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final h92.a.AddEntityNameAction addEntityNameAction = (h92.a.AddEntityNameAction) this.f82123f;
            k10.c0 c0Var = (k10.c0) this.f82124g;
            uq.b.e();
            if (this.f82122e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: h92.t
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.e.O(addEntityNameAction, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(h92.a.AddEntityNameAction addEntityNameAction, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f82123f = addEntityNameAction;
            eVar2.f82124g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lh92/a$a;", "action", "Lk10/c0;", "Lh92/b;", "state", "Lk10/l;", "<anonymous>", "(Lh92/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<h92.a.AddDescriptionAction, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f82125e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f82126f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f82127g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(h92.a.AddDescriptionAction addDescriptionAction, State state) {
            return State.b(state, null, null, null, new State.FieldState(null, addDescriptionAction.getDescription(), 1, null), null, null, false, null, 247, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final h92.a.AddDescriptionAction addDescriptionAction = (h92.a.AddDescriptionAction) this.f82126f;
            k10.c0 c0Var = (k10.c0) this.f82127g;
            uq.b.e();
            if (this.f82125e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: h92.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.f.O(addDescriptionAction, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(h92.a.AddDescriptionAction addDescriptionAction, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            f fVar = new f(eVar);
            fVar.f82126f = addDescriptionAction;
            fVar.f82127g = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lh92/a$o;", "action", "Lk10/c0;", "Lh92/b;", "state", "Lk10/l;", "<anonymous>", "(Lh92/a$o;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<h92.a.SetUpViolationDescriptionAction, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f82128e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f82129f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f82130g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lh92/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends State>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f82132e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ r f82133f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ h92.a.SetUpViolationDescriptionAction f82134g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ k10.c0<State> f82135h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(r rVar, h92.a.SetUpViolationDescriptionAction setUpViolationDescriptionAction, k10.c0<State> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f82133f = rVar;
                this.f82134g = setUpViolationDescriptionAction;
                this.f82135h = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final State V(h92.a.SetUpViolationDescriptionAction setUpViolationDescriptionAction, zz.h hVar, State state) {
                return State.b(state, setUpViolationDescriptionAction.getData().getWasReported(), new State.FieldState(null, setUpViolationDescriptionAction.getData().getOfficeReportedTo(), 1, null), new State.FieldState(null, setUpViolationDescriptionAction.getData().getViolationEntityName(), 1, null), new State.FieldState(null, setUpViolationDescriptionAction.getData().getViolationDescription(), 1, null), new State.FieldState(null, hVar instanceof zz.h.Image ? (zz.h.Image) hVar : null, 1, null), null, false, null, BERTags.FLAGS, null);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f82132e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    a00.b bVar = this.f82133f.pickedFileToAndroidMapper;
                    a00.b.Params params = new a00.b.Params(this.f82134g.getData().getPhoto());
                    this.f82132e = 1;
                    obj = bVar.a(params, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                final zz.h hVar = (zz.h) ((dx.i) obj).a();
                k10.c0<State> c0Var = this.f82135h;
                final h92.a.SetUpViolationDescriptionAction setUpViolationDescriptionAction = this.f82134g;
                return c0Var.b(new er.l() { // from class: h92.v
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return r.g.a.V(setUpViolationDescriptionAction, hVar, (State) obj2);
                    }
                });
            }

            public final tq.e<i0> N(tq.e<?> eVar) {
                return new a(this.f82133f, this.f82134g, this.f82135h, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<State>> eVar) {
                return ((a) N(eVar)).J(i0.f148189a);
            }
        }

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            h92.a.SetUpViolationDescriptionAction setUpViolationDescriptionAction = (h92.a.SetUpViolationDescriptionAction) this.f82129f;
            k10.c0 c0Var = (k10.c0) this.f82130g;
            Object objE = uq.b.e();
            int i15 = this.f82128e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = r.this.callActionWithLoaderUseCase;
            a aVar2 = new a(r.this, setUpViolationDescriptionAction, c0Var, null);
            this.f82129f = vq.j.a(setUpViolationDescriptionAction);
            this.f82130g = vq.j.a(c0Var);
            this.f82128e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(h92.a.SetUpViolationDescriptionAction setUpViolationDescriptionAction, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            g gVar = r.this.new g(eVar);
            gVar.f82129f = setUpViolationDescriptionAction;
            gVar.f82130g = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lh92/a$j;", "action", "Lk10/c0;", "Lh92/b;", "state", "Lk10/l;", "<anonymous>", "(Lh92/a$j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<h92.a.OnFilePicked, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f82136e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f82137f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f82138g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lh92/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends State>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f82140e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f82141f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f82142g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f82143h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f82144j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f82145k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f82146l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f82147m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ r f82148n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ h92.a.OnFilePicked f82149p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ k10.c0<State> f82150q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(r rVar, h92.a.OnFilePicked onFilePicked, k10.c0<State> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f82148n = rVar;
                this.f82149p = onFilePicked;
                this.f82150q = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final State V(zz.h.Image image, State state) {
                return State.b(state, null, null, null, null, new State.FieldState(null, image, 1, null), null, false, null, 239, null);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f82147m;
                if (i15 == 0) {
                    oq.u.b(obj);
                    a00.b bVar = this.f82148n.pickedFileToAndroidMapper;
                    a00.b.Params params = new a00.b.Params(this.f82149p.getPickedFile());
                    this.f82147m = 1;
                    obj = bVar.a(params, this);
                    if (obj != objE) {
                    }
                }
                if (i15 != 1) {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    k10.l lVar = (k10.l) this.f82142g;
                    oq.u.b(obj);
                    return lVar;
                }
                oq.u.b(obj);
                Object right = (dx.i) obj;
                if (!(right instanceof dx.i.Left)) {
                    if (!(right instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    zz.h hVar = (zz.h) ((dx.i.Right) right).b();
                    zz.h.Image image = hVar instanceof zz.h.Image ? (zz.h.Image) hVar : null;
                    right = image != null ? new dx.i.Right(image) : new dx.i.Left(new dx.b.Generic(null, 1, null));
                }
                k10.c0<State> c0Var = this.f82150q;
                r rVar = this.f82148n;
                h92.a.OnFilePicked onFilePicked = this.f82149p;
                if (!(right instanceof dx.i.Left)) {
                    if (!(right instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    final zz.h.Image image2 = (zz.h.Image) ((dx.i.Right) right).b();
                    rVar.accessibilityTalkBackManager.a(c70.a.f23835a.a().q0().getText());
                    return c0Var.b(new er.l() { // from class: h92.w
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return r.h.a.V(image2, (State) obj2);
                        }
                    });
                }
                dx.b bVar2 = (dx.b) ((dx.i.Left) right).b();
                Object objC = c0Var.c();
                h92.a fromAction = onFilePicked.getFromAction();
                this.f82140e = vq.j.a(right);
                this.f82141f = vq.j.a(bVar2);
                this.f82142g = objC;
                this.f82143h = vq.j.a(objC);
                this.f82144j = 0;
                this.f82145k = 0;
                this.f82146l = 0;
                this.f82147m = 2;
                return rVar.E9(bVar2, fromAction, this) == objE ? objE : objC;
            }

            public final tq.e<i0> N(tq.e<?> eVar) {
                return new a(this.f82148n, this.f82149p, this.f82150q, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<State>> eVar) {
                return ((a) N(eVar)).J(i0.f148189a);
            }
        }

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            h92.a.OnFilePicked onFilePicked = (h92.a.OnFilePicked) this.f82137f;
            k10.c0 c0Var = (k10.c0) this.f82138g;
            Object objE = uq.b.e();
            int i15 = this.f82136e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = r.this.callActionWithLoaderUseCase;
            a aVar2 = new a(r.this, onFilePicked, c0Var, null);
            this.f82137f = vq.j.a(onFilePicked);
            this.f82138g = vq.j.a(c0Var);
            this.f82136e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(h92.a.OnFilePicked onFilePicked, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            h hVar = r.this.new h(eVar);
            hVar.f82137f = onFilePicked;
            hVar.f82138g = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lh92/a$m;", "<unused var>", "Lk10/c0;", "Lh92/b;", "state", "Lk10/l;", "<anonymous>", "(Lh92/a$m;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<h92.a.m, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f82151e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f82152f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, null, null, null, null, null, null, false, null, CertificateBody.profileType, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f82152f;
            uq.b.e();
            if (this.f82151e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: h92.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.i.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(h92.a.m mVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            i iVar = new i(eVar);
            iVar.f82152f = c0Var;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lh92/a$g;", "<unused var>", "Lk10/c0;", "Lh92/b;", "state", "Lk10/l;", "<anonymous>", "(Lh92/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<h92.a.g, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f82153e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f82154f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f82155g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f82156h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f82157j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f82158k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f82159l;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(Map map, State state) {
            Object next;
            State.FieldState fieldStateB = State.FieldState.b(state.f(), ((hz.g) v0.j(map, c82.a.OFFICE)).a(), null, 2, null);
            State.FieldState fieldStateB2 = State.FieldState.b(state.d(), ((hz.g) v0.j(map, c82.a.SUBJECT)).a(), null, 2, null);
            State.FieldState fieldStateB3 = State.FieldState.b(state.c(), ((hz.g) v0.j(map, c82.a.DESCRIPTION)).a(), null, 2, null);
            State.FieldState fieldStateB4 = State.FieldState.b(state.e(), ((hz.g) v0.j(map, c82.a.PHOTO)).a(), null, 2, null);
            Iterator it = map.entrySet().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((Map.Entry) next).getValue() instanceof hz.g.Invalid));
            Map.Entry entry = (Map.Entry) next;
            return State.b(state, null, fieldStateB, fieldStateB2, fieldStateB3, fieldStateB4, null, false, entry != null ? (c82.a) entry.getKey() : null, 97, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f82159l;
            Object objE = uq.b.e();
            int i15 = this.f82158k;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                State state = (State) c0Var.a();
                this.f82159l = c0Var;
                this.f82158k = 1;
                obj = rVar.D9(state, this);
                if (obj != objE) {
                }
            }
            if (i15 != 1) {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                k10.l lVar = (k10.l) this.f82154f;
                oq.u.b(obj);
                return lVar;
            }
            oq.u.b(obj);
            r rVar2 = r.this;
            final Map map = (Map) obj;
            if (!map.isEmpty()) {
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    if (((Map.Entry) it.next()).getValue() instanceof hz.g.Invalid) {
                        k10.l lVarB = c0Var.b(new er.l() { // from class: h92.y
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return r.j.O(map, (State) obj2);
                            }
                        });
                        if (((State) c0Var.a()).e().d() == null) {
                            rVar2.accessibilityTalkBackManager.a(rVar2.labelProvider.c(v72.b.f204288q1).getText());
                        }
                        return lVarB;
                    }
                }
            }
            k10.l lVarC = c0Var.c();
            j92.a aVar = rVar2.contract;
            State state2 = (State) c0Var.a();
            fp0.l wasViolationReported = state2.getWasViolationReported();
            Label labelD = state2.f().d();
            Label labelD2 = state2.d().d();
            Label labelD3 = state2.c().d();
            zz.h.Image imageD = state2.e().d();
            if (imageD == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            aVar.J1(new ViolationDescriptionResult.Data(wasViolationReported, labelD, labelD2, labelD3, imageD.a()));
            h92.a.f.b bVar = h92.a.f.b.f82013a;
            this.f82159l = vq.j.a(c0Var);
            this.f82153e = vq.j.a(map);
            this.f82154f = lVarC;
            this.f82155g = vq.j.a(lVarC);
            this.f82156h = 0;
            this.f82157j = 0;
            this.f82158k = 2;
            return rVar2.F(bVar, this) == objE ? objE : lVarC;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(h92.a.g gVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            j jVar = r.this.new j(eVar);
            jVar.f82159l = c0Var;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh92/b;", "it", "Loq/i0;", "<anonymous>", "(Lh92/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.p<State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f82161e;

        k(tq.e<? super k> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f82161e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            ViolationDescriptionResult.Data dataR3 = r.this.contract.R3();
            if (dataR3 != null) {
                r.this.d9(new h92.a.SetUpViolationDescriptionAction(dataR3));
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(State state, tq.e<? super i0> eVar) {
            return ((k) v(state, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return r.this.new k(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lh92/a$e;", "<unused var>", "Lh92/b;", "Loq/i0;", "<anonymous>", "(Lh92/a$e;Lh92/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<h92.a.e, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f82163e;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f82163e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            r.this.goToApplicationDetailsSettingsUseCase.a(gz.b.a.C1792a.f78542a);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(h92.a.e eVar, State state, tq.e<? super i0> eVar2) {
            return r.this.new l(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lh92/a$p;", "action", "Lh92/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lh92/a$p;Lh92/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<h92.a.ShowBottomSheet, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f82165e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f82166f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            h92.a.ShowBottomSheet showBottomSheet = (h92.a.ShowBottomSheet) this.f82166f;
            Object objE = uq.b.e();
            int i15 = this.f82165e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                h92.a.f.ShowBottomSheet showBottomSheet2 = new h92.a.f.ShowBottomSheet(showBottomSheet.getAction());
                this.f82166f = vq.j.a(showBottomSheet);
                this.f82165e = 1;
                if (rVar.F(showBottomSheet2, this) == objE) {
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
        public final Object w(h92.a.ShowBottomSheet showBottomSheet, State state, tq.e<? super i0> eVar) {
            m mVar = r.this.new m(eVar);
            mVar.f82166f = showBottomSheet;
            return mVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lh92/a$h;", "action", "Lh92/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lh92/a$h;Lh92/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<h92.a.OnBottomSheetActionSelected, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f82168e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f82169f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f82171a;

            static {
                int[] iArr = new int[c92.a.b.values().length];
                try {
                    iArr[c92.a.b.TAKE_PHOTO.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[c92.a.b.PICK_PHOTO.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f82171a = iArr;
            }
        }

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
        
            if (r6.O9(r0, r5) == r1) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
        
            if (r6.S9(r0, r5) == r1) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
        
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
                java.lang.Object r0 = r5.f82169f
                h92.a$h r0 = (h92.a.OnBottomSheetActionSelected) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r5.f82168e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L1e
                if (r2 == r4) goto L12
                if (r2 != r3) goto L16
            L12:
                oq.u.b(r6)
                goto L59
            L16:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1e:
                oq.u.b(r6)
                c92.a$b r6 = r0.getSelectedOption()
                int[] r2 = h92.r.n.a.f82171a
                int r6 = r6.ordinal()
                r6 = r2[r6]
                if (r6 == r4) goto L48
                if (r6 != r3) goto L42
                h92.r r6 = h92.r.this
                java.lang.Object r2 = vq.j.a(r0)
                r5.f82169f = r2
                r5.f82168e = r3
                java.lang.Object r6 = h92.r.A9(r6, r0, r5)
                if (r6 != r1) goto L59
                goto L58
            L42:
                oq.p r6 = new oq.p
                r6.<init>()
                throw r6
            L48:
                h92.r r6 = h92.r.this
                java.lang.Object r2 = vq.j.a(r0)
                r5.f82169f = r2
                r5.f82168e = r4
                java.lang.Object r6 = h92.r.B9(r6, r0, r5)
                if (r6 != r1) goto L59
            L58:
                return r1
            L59:
                oq.i0 r6 = oq.i0.f148189a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: h92.r.n.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(h92.a.OnBottomSheetActionSelected onBottomSheetActionSelected, State state, tq.e<? super i0> eVar) {
            n nVar = r.this.new n(eVar);
            nVar.f82169f = onBottomSheetActionSelected;
            return nVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lh92/a$n;", "<unused var>", "Lk10/c0;", "Lh92/b;", "state", "Lk10/l;", "<anonymous>", "(Lh92/a$n;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<h92.a.n, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f82172e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f82173f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, null, null, null, null, null, null, true, null, 191, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f82173f;
            uq.b.e();
            if (this.f82172e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: h92.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.o.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(h92.a.n nVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            o oVar = new o(eVar);
            oVar.f82173f = c0Var;
            return oVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lh92/a$k;", "<unused var>", "Lk10/c0;", "Lh92/b;", "state", "Lk10/l;", "<anonymous>", "(Lh92/a$k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<h92.a.k, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f82174e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f82175f;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, null, null, null, null, null, null, false, null, 191, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f82175f;
            uq.b.e();
            if (this.f82174e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: h92.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.p.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(h92.a.k kVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            p pVar = new p(eVar);
            pVar.f82175f = c0Var;
            return pVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lh92/a$i;", "<unused var>", "Lk10/c0;", "Lh92/b;", "state", "Lk10/l;", "<anonymous>", "(Lh92/a$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<h92.a.i, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f82176e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f82177f;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, null, null, null, null, new State.FieldState(null, null, 1, null), null, false, null, 239, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f82177f;
            uq.b.e();
            if (this.f82176e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: h92.b0
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.q.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(h92.a.i iVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            q qVar = new q(eVar);
            qVar.f82177f = c0Var;
            return qVar.J(i0.f148189a);
        }
    }

    /* JADX INFO: renamed from: h92.r$r, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lh92/a$l;", "action", "Lh92/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lh92/a$l;Lh92/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class C1891r extends vq.k implements er.q<h92.a.OnImageClick, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f82178e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f82179f;

        C1891r(tq.e<? super C1891r> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            h92.a.OnImageClick onImageClick = (h92.a.OnImageClick) this.f82179f;
            Object objE = uq.b.e();
            int i15 = this.f82178e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                h92.a.f.ShowImagePreview showImagePreview = new h92.a.f.ShowImagePreview(onImageClick.getData());
                this.f82179f = vq.j.a(onImageClick);
                this.f82178e = 1;
                if (rVar.F(showImagePreview, this) == objE) {
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
        public final Object w(h92.a.OnImageClick onImageClick, State state, tq.e<? super i0> eVar) {
            C1891r c1891r = r.this.new C1891r(eVar);
            c1891r.f82179f = onImageClick;
            return c1891r.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lh92/a$d;", "action", "Lk10/c0;", "Lh92/b;", "state", "Lk10/l;", "<anonymous>", "(Lh92/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<h92.a.EditWasReportedAction, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f82181e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f82182f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f82183g;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(h92.a.EditWasReportedAction editWasReportedAction, State state) {
            return State.b(state, editWasReportedAction.getWasReported(), State.FieldState.b(state.f(), hz.b.d.f86848c, null, 2, null), null, null, null, null, false, null, 252, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final h92.a.EditWasReportedAction editWasReportedAction = (h92.a.EditWasReportedAction) this.f82182f;
            k10.c0 c0Var = (k10.c0) this.f82183g;
            uq.b.e();
            if (this.f82181e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: h92.c0
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.s.O(editWasReportedAction, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(h92.a.EditWasReportedAction editWasReportedAction, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            s sVar = new s(eVar);
            sVar.f82182f = editWasReportedAction;
            sVar.f82183g = c0Var;
            return sVar.J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class t extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f82184d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f82185e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f82186f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f82187g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f82188h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f82189j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f82191l;

        t(tq.e<? super t> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f82189j = obj;
            this.f82191l |= PKIFailureInfo.systemUnavail;
            return r.this.S9(null, this);
        }
    }

    public r(yy.a aVar, e82.i iVar, bc4.l lVar, bc4.k kVar, k92.j jVar, k92.d dVar, mx.c cVar, ac4.a aVar2, a00.b bVar, a14.m mVar, yw.b bVar2, j92.a aVar3) {
        this.checkViolationFormUseCase = iVar;
        this.pickPhotoFromGalleryUseCase = lVar;
        this.takePhotoFromCameraWithSizeValidationUseCase = kVar;
        this.violationDescriptionMapper = jVar;
        this.violationDescriptionErrorMapper = dVar;
        this.labelProvider = cVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.pickedFileToAndroidMapper = bVar;
        this.goToApplicationDetailsSettingsUseCase = mVar;
        this.accessibilityTalkBackManager = bVar2;
        this.contract = aVar3;
        State state = new State(null, null, null, null, null, null, false, null, GF2Field.MASK, null);
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: h92.q
            @Override // er.l
            public final Object b(Object obj) {
                return r.Q9(this.f82081a, (k10.v) obj);
            }
        });
        this.state = a9(new c(e9().getState(), this), G9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object D9(State state, tq.e<? super Map<c82.a, ? extends hz.g>> eVar) {
        boolean z15;
        Label label;
        e82.i iVar = this.checkViolationFormUseCase;
        boolean z16 = state.getWasViolationReported() == fp0.l.YES;
        Label labelD = state.f().d();
        Label labelD2 = state.d().d();
        Label labelD3 = state.c().d();
        if (state.e().d() != null) {
            label = labelD2;
            z15 = true;
        } else {
            z15 = false;
            label = labelD2;
        }
        return iVar.d(new e82.i.Params(z16, labelD, label, labelD3, z15), eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object E9(dx.b bVar, final h92.a aVar, tq.e<? super i0> eVar) {
        k92.d.b bVarB = this.violationDescriptionErrorMapper.b(new k92.d.Params(bVar, b9(h92.a.e.f82011a), new er.a() { // from class: h92.p
            @Override // er.a
            public final Object a() {
                return r.F9(this.f82079a, aVar);
            }
        }));
        if (bVarB instanceof k92.d.b.Dialog) {
            Object objF = F(new h92.a.f.ShowDialog(((k92.d.b.Dialog) bVarB).getDialogData()), eVar);
            if (objF == uq.b.e()) {
                return objF;
            }
        } else if (bVarB instanceof k92.d.b.Error) {
            Object objF2 = F(new h92.a.f.Error(((k92.d.b.Error) bVarB).getErrorData()), eVar);
            if (objF2 == uq.b.e()) {
                return objF2;
            }
        } else if (!fr.t.c(bVarB, k92.d.b.c.f109235a)) {
            throw new oq.p();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F9(r rVar, h92.a aVar) {
        rVar.d9(aVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h92.c.Data G9(State state) {
        return this.violationDescriptionMapper.b(new k92.j.Params(state, new er.l() { // from class: h92.h
            @Override // er.l
            public final Object b(Object obj) {
                return r.H9(this.f82071a, (String) obj);
            }
        }, new er.l() { // from class: h92.i
            @Override // er.l
            public final Object b(Object obj) {
                return r.I9(this.f82072a, (String) obj);
            }
        }, new er.l() { // from class: h92.j
            @Override // er.l
            public final Object b(Object obj) {
                return r.J9(this.f82073a, (String) obj);
            }
        }, b9(h92.a.g.f82017a), new er.l() { // from class: h92.k
            @Override // er.l
            public final Object b(Object obj) {
                return r.K9(this.f82074a, (fp0.l) obj);
            }
        }, new er.l() { // from class: h92.l
            @Override // er.l
            public final Object b(Object obj) {
                return r.L9(this.f82075a, (dx3.a) obj);
            }
        }, new er.l() { // from class: h92.m
            @Override // er.l
            public final Object b(Object obj) {
                return r.M9(this.f82076a, (c92.a.ChoosePhoto) obj);
            }
        }, new er.l() { // from class: h92.n
            @Override // er.l
            public final Object b(Object obj) {
                return r.N9(this.f82077a, (c92.a.b) obj);
            }
        }, b9(h92.a.i.f82019a), b9(h92.a.n.f82026a), b9(h92.a.k.f82023a), b9(h92.a.m.f82025a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H9(r rVar, String str) {
        rVar.d9(new h92.a.AddOfficeNameAction(mx.b.b(str, "EditOffice")));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I9(r rVar, String str) {
        rVar.d9(new h92.a.AddEntityNameAction(mx.b.b(str, "EditEntityName")));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J9(r rVar, String str) {
        rVar.d9(new h92.a.AddDescriptionAction(mx.b.b(str, "EditDescription")));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K9(r rVar, fp0.l lVar) {
        rVar.d9(new h92.a.EditWasReportedAction(lVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L9(r rVar, dx3.a aVar) {
        rVar.d9(new h92.a.OnImageClick(aVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M9(r rVar, c92.a.ChoosePhoto choosePhoto) {
        rVar.d9(new h92.a.ShowBottomSheet(choosePhoto));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 N9(r rVar, c92.a.b bVar) {
        rVar.d9(new h92.a.OnBottomSheetActionSelected(bVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0096, code lost:
    
        if (E9(r2, r12, r0) == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O9(h92.a r12, tq.e<? super oq.i0> r13) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r13 instanceof h92.r.b
            if (r0 == 0) goto L13
            r0 = r13
            h92.r$b r0 = (h92.r.b) r0
            int r1 = r0.f82106l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f82106l = r1
            goto L18
        L13:
            h92.r$b r0 = new h92.r$b
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f82104j
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f82106l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L49
            if (r2 == r4) goto L41
            if (r2 != r3) goto L39
            java.lang.Object r12 = r0.f82101f
            dx.b r12 = (dx.b) r12
            java.lang.Object r12 = r0.f82100e
            dx.i r12 = (dx.i) r12
            java.lang.Object r12 = r0.f82099d
            h92.a r12 = (h92.a) r12
            oq.u.b(r13)
            goto Lb1
        L39:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L41:
            java.lang.Object r12 = r0.f82099d
            h92.a r12 = (h92.a) r12
            oq.u.b(r13)
            goto L6a
        L49:
            oq.u.b(r13)
            bc4.l r13 = r11.pickPhotoFromGalleryUseCase
            bc4.l$b r5 = new bc4.l$b
            float r2 = b82.a.a()
            java.lang.Float r6 = vq.b.d(r2)
            r9 = 6
            r10 = 0
            r7 = 0
            r8 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            r0.f82099d = r12
            r0.f82106l = r4
            java.lang.Object r13 = r13.c(r5, r0)
            if (r13 != r1) goto L6a
            goto L98
        L6a:
            dx.i r13 = (dx.i) r13
            boolean r2 = r13 instanceof dx.i.Left
            if (r2 == 0) goto L99
            r2 = r13
            dx.i$b r2 = (dx.i.Left) r2
            java.lang.Object r2 = r2.b()
            dx.b r2 = (dx.b) r2
            java.lang.Object r4 = vq.j.a(r12)
            r0.f82099d = r4
            java.lang.Object r13 = vq.j.a(r13)
            r0.f82100e = r13
            java.lang.Object r13 = vq.j.a(r2)
            r0.f82101f = r13
            r13 = 0
            r0.f82102g = r13
            r0.f82103h = r13
            r0.f82106l = r3
            java.lang.Object r12 = r11.E9(r2, r12, r0)
            if (r12 != r1) goto Lb1
        L98:
            return r1
        L99:
            boolean r0 = r13 instanceof dx.i.Right
            if (r0 == 0) goto Lb4
            dx.i$c r13 = (dx.i.Right) r13
            java.lang.Object r13 = r13.b()
            bc4.l$c r13 = (bc4.l.Result) r13
            h92.a$j r0 = new h92.a$j
            wx.i$a r13 = r13.getImageFile()
            r0.<init>(r13, r12)
            r11.d9(r0)
        Lb1:
            oq.i0 r12 = oq.i0.f148189a
            return r12
        Lb4:
            oq.p r12 = new oq.p
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: h92.r.O9(h92.a, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Q9(final r rVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: h92.o
            @Override // er.l
            public final Object b(Object obj) {
                return r.R9(this.f82078a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 R9(r rVar, k10.z zVar) {
        zVar.C(rVar.new k(null));
        l lVar = rVar.new l(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(h92.a.e.class), oVar, lVar);
        zVar.x(q0.c(h92.a.ShowBottomSheet.class), oVar, rVar.new m(null));
        zVar.x(q0.c(h92.a.OnBottomSheetActionSelected.class), oVar, rVar.new n(null));
        zVar.v(q0.c(h92.a.n.class), oVar, new o(null));
        zVar.v(q0.c(h92.a.k.class), oVar, new p(null));
        zVar.v(q0.c(h92.a.i.class), oVar, new q(null));
        zVar.x(q0.c(h92.a.OnImageClick.class), oVar, rVar.new C1891r(null));
        zVar.v(q0.c(h92.a.EditWasReportedAction.class), oVar, new s(null));
        zVar.v(q0.c(h92.a.AddOfficeNameAction.class), oVar, new d(null));
        zVar.v(q0.c(h92.a.AddEntityNameAction.class), oVar, new e(null));
        zVar.v(q0.c(h92.a.AddDescriptionAction.class), oVar, new f(null));
        zVar.v(q0.c(h92.a.SetUpViolationDescriptionAction.class), oVar, rVar.new g(null));
        zVar.v(q0.c(h92.a.OnFilePicked.class), oVar, rVar.new h(null));
        zVar.v(q0.c(h92.a.m.class), oVar, new i(null));
        zVar.v(q0.c(h92.a.g.class), oVar, rVar.new j(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ab, code lost:
    
        if (E9(r6, r4, r2) == r3) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object S9(h92.a r17, tq.e<? super oq.i0> r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h92.r.S9(h92.a, tq.e):java.lang.Object");
    }

    @Override // zx.b
    /* JADX INFO: renamed from: C9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(h92.a.f fVar, tq.e<? super i0> eVar) {
        return super.F(fVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: P9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(j92.a aVar) {
        super.P5(aVar);
    }

    @Override // zx.b
    public xw.b<h92.a.f> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, h92.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<h92.c.Data> getState() {
        return this.state;
    }
}
