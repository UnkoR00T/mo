package pm2;

import cb4.DialogButtonTextData;
import cb4.DialogData;
import fr.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import xl2.q5;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B[\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020 *\b\u0012\u0004\u0012\u00020\u00020\u001fH\u0082@¢\u0006\u0004\b!\u0010\"J \u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020 *\b\u0012\u0004\u0012\u00020\u00020\u001fH\u0082@¢\u0006\u0004\b#\u0010\"J \u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020 *\b\u0012\u0004\u0012\u00020\u00020\u001fH\u0082@¢\u0006\u0004\b$\u0010\"J.\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020 *\b\u0012\u0004\u0012\u00020\u00020\u001f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%H\u0082@¢\u0006\u0004\b(\u0010)J(\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00020 *\b\u0012\u0004\u0012\u00020\u00020\u001f2\u0006\u0010'\u001a\u00020&H\u0082@¢\u0006\u0004\b*\u0010+J\u0019\u0010-\u001a\u00020,*\b\u0012\u0004\u0012\u00020\u00020\u001fH\u0002¢\u0006\u0004\b-\u0010.J\u0013\u00101\u001a\u000200*\u00020/H\u0002¢\u0006\u0004\b1\u00102J\u0013\u00105\u001a\u000204*\u000203H\u0002¢\u0006\u0004\b5\u00106J\u001a\u00107\u001a\u000200*\b\u0012\u0004\u0012\u00020&0%H\u0082@¢\u0006\u0004\b7\u00108J \u0010:\u001a\b\u0012\u0004\u0012\u0002090%*\b\u0012\u0004\u0012\u00020&0%H\u0082@¢\u0006\u0004\b:\u00108R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010O\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR \u0010V\u001a\b\u0012\u0004\u0012\u00020Q0P8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR&\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030W8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0]8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a¨\u0006b"}, d2 = {"Lpm2/h0;", "Ll00/g;", "Lpm2/j;", "", "Lpm2/k;", "Lyy/a;", "stateMachineFactory", "Lpm2/o;", "mapper", "Lbc4/k;", "pickPhotoFromCameraWithSizeValidationUseCase", "Lbc4/j;", "pickMultiplePhotosFromGalleryUseCase", "Lbc4/h;", "pickFileUseCase", "La00/b;", "pickedFileToAndroidMapper", "Lyw/b;", "accessibilityTalkBackManager", "Lmx/c;", "labelProvider", "Lcb4/j;", "dialogVMSFactory", "Lqm2/a;", "contract", "<init>", "(Lyy/a;Lpm2/o;Lbc4/k;Lbc4/j;Lbc4/h;La00/b;Lyw/b;Lmx/c;Lcb4/j;Lqm2/a;)V", "state", "Lpm2/k$a;", "B9", "(Lpm2/j;)Lpm2/k$a;", "Lk10/c0;", "Lk10/l;", "N9", "(Lk10/c0;Ltq/e;)Ljava/lang/Object;", "G9", "F9", "", "Lwx/i;", "attachment", "x9", "(Lk10/c0;Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "I9", "(Lk10/c0;Lwx/i;Ltq/e;)Ljava/lang/Object;", "", "H9", "(Lk10/c0;)F", "Ldx/b;", "Loq/i0;", "A9", "(Ldx/b;)V", "Ldx/b$c;", "Lcb4/d;", "O9", "(Ldx/b$c;)Lcb4/d;", "d0", "(Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "Ln40/i;", "P9", "b", "Lpm2/o;", "c", "Lbc4/k;", "d", "Lbc4/j;", "e", "Lbc4/h;", "f", "La00/b;", "g", "Lyw/b;", "h", "Lmx/c;", "j", "Lcb4/j;", "k", "Lqm2/a;", "l", "Lpm2/j;", "initialState", "Lxw/b;", "Lpm2/d;", "m", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "n", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "p", "Lmu/p0;", "getState", "()Lmu/p0;", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h0 extends l00.g<State, Object> implements pm2.k, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final pm2.o mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final bc4.k pickPhotoFromCameraWithSizeValidationUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final bc4.j pickMultiplePhotosFromGalleryUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final bc4.h pickFileUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final a00.b pickedFileToAndroidMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final yw.b accessibilityTalkBackManager;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final cb4.j dialogVMSFactory;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final qm2.a contract;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final xw.b<pm2.d> navAction;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<pm2.k.Data> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f160950d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f160951e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f160952f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f160953g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f160954h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f160956k;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f160954h = obj;
            this.f160956k |= PKIFailureInfo.systemUnavail;
            return h0.this.x9(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f160957d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f160958e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f160959f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f160960g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f160961h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f160962j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f160964l;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f160962j = obj;
            this.f160964l |= PKIFailureInfo.systemUnavail;
            return h0.this.F9(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f160965d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f160966e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f160967f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f160968g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f160969h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f160970j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f160972l;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f160970j = obj;
            this.f160972l |= PKIFailureInfo.systemUnavail;
            return h0.this.G9(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f160973d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f160974e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f160975f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f160976g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f160977h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f160979k;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f160977h = obj;
            this.f160979k |= PKIFailureInfo.systemUnavail;
            return h0.this.I9(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e implements mu.g<pm2.k.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f160980a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h0 f160981b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f160982a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ h0 f160983b;

            /* JADX INFO: renamed from: pm2.h0$e$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3963a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f160984d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f160985e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f160986f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f160988h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f160989j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f160990k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f160991l;

                public C3963a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f160984d = obj;
                    this.f160985e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, h0 h0Var) {
                this.f160982a = hVar;
                this.f160983b = h0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3963a c3963a;
                if (eVar instanceof C3963a) {
                    c3963a = (C3963a) eVar;
                    int i15 = c3963a.f160985e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3963a.f160985e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3963a = new C3963a(eVar);
                    }
                } else {
                    c3963a = new C3963a(eVar);
                }
                Object obj2 = c3963a.f160984d;
                Object objE = uq.b.e();
                int i16 = c3963a.f160985e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f160982a;
                    pm2.k.Data dataB9 = this.f160983b.B9((State) obj);
                    c3963a.f160986f = vq.j.a(obj);
                    c3963a.f160988h = vq.j.a(c3963a);
                    c3963a.f160989j = vq.j.a(obj);
                    c3963a.f160990k = vq.j.a(hVar);
                    c3963a.f160991l = 0;
                    c3963a.f160985e = 1;
                    if (hVar.F(dataB9, c3963a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return oq.i0.f148189a;
            }
        }

        public e(mu.g gVar, h0 h0Var) {
            this.f160980a = gVar;
            this.f160981b = h0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super pm2.k.Data> hVar, tq.e eVar) {
            Object objA = this.f160980a.a(new a(hVar, this.f160981b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lpm2/c;", "<unused var>", "Lk10/c0;", "Lpm2/j;", "state", "Lk10/l;", "<anonymous>", "(Lpm2/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<pm2.c, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f160992e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f160993f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, null, null, null, null, null, 27, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f160993f;
            uq.b.e();
            if (this.f160992e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: pm2.j0
                @Override // er.l
                public final Object b(Object obj2) {
                    return h0.f.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(pm2.c cVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            f fVar = new f(eVar);
            fVar.f160993f = c0Var;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lk10/c0;", "Lpm2/j;", "state", "Lk10/l;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.p<k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f160994e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f160995f;

        g(tq.e<? super g> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(List list, State state) {
            return State.b(state, null, list, null, null, null, 29, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f160995f;
            Object objE = uq.b.e();
            int i15 = this.f160994e;
            if (i15 == 0) {
                oq.u.b(obj);
                h0 h0Var = h0.this;
                List<wx.i> listC = ((State) c0Var.a()).c();
                this.f160995f = c0Var;
                this.f160994e = 1;
                obj = h0Var.P9(listC, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final List list = (List) obj;
            return c0Var.b(new er.l() { // from class: pm2.i0
                @Override // er.l
                public final Object b(Object obj2) {
                    return h0.g.O(list, (State) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            return ((g) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            g gVar = h0.this.new g(eVar);
            gVar.f160995f = obj;
            return gVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpm2/d;", "action", "Lpm2/j;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lpm2/d;Lpm2/j;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<pm2.d, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f160997e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f160998f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            pm2.d dVar = (pm2.d) this.f160998f;
            Object objE = uq.b.e();
            int i15 = this.f160997e;
            if (i15 == 0) {
                oq.u.b(obj);
                h0 h0Var = h0.this;
                this.f160998f = vq.j.a(dVar);
                this.f160997e = 1;
                if (h0Var.F(dVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(pm2.d dVar, State state, tq.e<? super oq.i0> eVar) {
            h hVar = h0.this.new h(eVar);
            hVar.f160998f = dVar;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lpm2/f;", "action", "Lk10/c0;", "Lpm2/j;", "state", "Lk10/l;", "<anonymous>", "(Lpm2/f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<OpenBottomSheet, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f161000e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f161001f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f161002g;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(OpenBottomSheet openBottomSheet, State state) {
            return State.b(state, null, null, null, g30.v.EXPANDED, openBottomSheet.getData(), 7, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OpenBottomSheet openBottomSheet = (OpenBottomSheet) this.f161001f;
            k10.c0 c0Var = (k10.c0) this.f161002g;
            uq.b.e();
            if (this.f161000e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: pm2.k0
                @Override // er.l
                public final Object b(Object obj2) {
                    return h0.i.O(openBottomSheet, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OpenBottomSheet openBottomSheet, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            i iVar = new i(eVar);
            iVar.f161001f = openBottomSheet;
            iVar.f161002g = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lpm2/a;", "action", "Lk10/c0;", "Lpm2/j;", "state", "Lk10/l;", "<anonymous>", "(Lpm2/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<ChangeBottomSheetState, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f161003e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f161004f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f161005g;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(ChangeBottomSheetState changeBottomSheetState, k10.c0 c0Var, State state) {
            g30.v state2 = changeBottomSheetState.getState();
            g30.v state3 = changeBottomSheetState.getState();
            if (state3 == g30.v.HIDDEN) {
                state3 = null;
            }
            return State.b(state, null, null, null, state2, state3 != null ? ((State) c0Var.a()).getBottomSheetData() : null, 7, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ChangeBottomSheetState changeBottomSheetState = (ChangeBottomSheetState) this.f161004f;
            final k10.c0 c0Var = (k10.c0) this.f161005g;
            uq.b.e();
            if (this.f161003e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: pm2.l0
                @Override // er.l
                public final Object b(Object obj2) {
                    return h0.j.O(changeBottomSheetState, c0Var, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ChangeBottomSheetState changeBottomSheetState, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            j jVar = new j(eVar);
            jVar.f161004f = changeBottomSheetState;
            jVar.f161005g = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lpm2/g;", "action", "Lk10/c0;", "Lpm2/j;", "state", "Lk10/l;", "<anonymous>", "(Lpm2/g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<SelectBottomSheetOption, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f161006e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f161007f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f161008g;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f161010a;

            static {
                int[] iArr = new int[mm2.e.values().length];
                try {
                    iArr[mm2.e.TAKE_PHOTO.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[mm2.e.PICK_PHOTO.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[mm2.e.PICK_FILE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f161010a = iArr;
            }
        }

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
        
            if (r8 == r2) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
        
            if (r8 == r2) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0090, code lost:
        
            if (r8 == r2) goto L30;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f161007f
                pm2.g r0 = (pm2.SelectBottomSheetOption) r0
                java.lang.Object r1 = r7.f161008g
                k10.c0 r1 = (k10.c0) r1
                java.lang.Object r2 = uq.b.e()
                int r3 = r7.f161006e
                r4 = 3
                r5 = 2
                r6 = 1
                if (r3 == 0) goto L2d
                if (r3 == r6) goto L29
                if (r3 == r5) goto L25
                if (r3 != r4) goto L1d
                oq.u.b(r8)
                goto L59
            L1d:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L25:
                oq.u.b(r8)
                goto L79
            L29:
                oq.u.b(r8)
                goto L93
            L2d:
                oq.u.b(r8)
                mm2.e r8 = r0.getSelectedOption()
                int[] r3 = pm2.h0.k.a.f161010a
                int r8 = r8.ordinal()
                r8 = r3[r8]
                if (r8 == r6) goto L7c
                if (r8 == r5) goto L62
                if (r8 != r4) goto L5c
                pm2.h0 r8 = pm2.h0.this
                java.lang.Object r0 = vq.j.a(r0)
                r7.f161007f = r0
                java.lang.Object r0 = vq.j.a(r1)
                r7.f161008g = r0
                r7.f161006e = r4
                java.lang.Object r8 = pm2.h0.s9(r8, r1, r7)
                if (r8 != r2) goto L59
                goto L92
            L59:
                k10.l r8 = (k10.l) r8
                return r8
            L5c:
                oq.p r8 = new oq.p
                r8.<init>()
                throw r8
            L62:
                pm2.h0 r8 = pm2.h0.this
                java.lang.Object r0 = vq.j.a(r0)
                r7.f161007f = r0
                java.lang.Object r0 = vq.j.a(r1)
                r7.f161008g = r0
                r7.f161006e = r5
                java.lang.Object r8 = pm2.h0.t9(r8, r1, r7)
                if (r8 != r2) goto L79
                goto L92
            L79:
                k10.l r8 = (k10.l) r8
                return r8
            L7c:
                pm2.h0 r8 = pm2.h0.this
                java.lang.Object r0 = vq.j.a(r0)
                r7.f161007f = r0
                java.lang.Object r0 = vq.j.a(r1)
                r7.f161008g = r0
                r7.f161006e = r6
                java.lang.Object r8 = pm2.h0.v9(r8, r1, r7)
                if (r8 != r2) goto L93
            L92:
                return r2
            L93:
                k10.l r8 = (k10.l) r8
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: pm2.h0.k.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(SelectBottomSheetOption selectBottomSheetOption, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            k kVar = h0.this.new k(eVar);
            kVar.f161007f = selectBottomSheetOption;
            kVar.f161008g = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lpm2/b;", "action", "Lk10/c0;", "Lpm2/j;", "state", "Lk10/l;", "<anonymous>", "(Lpm2/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<DeleteFile, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f161011e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f161012f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f161013g;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            DeleteFile deleteFile = (DeleteFile) this.f161012f;
            k10.c0 c0Var = (k10.c0) this.f161013g;
            Object objE = uq.b.e();
            int i15 = this.f161011e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            h0 h0Var = h0.this;
            wx.i pickedFile = deleteFile.getPickedFile();
            this.f161012f = vq.j.a(deleteFile);
            this.f161013g = vq.j.a(c0Var);
            this.f161011e = 1;
            Object objI9 = h0Var.I9(c0Var, pickedFile, this);
            return objI9 == objE ? objE : objI9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(DeleteFile deleteFile, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            l lVar = h0.this.new l(eVar);
            lVar.f161012f = deleteFile;
            lVar.f161013g = c0Var;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lpm2/e;", "<unused var>", "Lpm2/j;", "Loq/i0;", "<anonymous>", "(Lpm2/e;Lpm2/j;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<pm2.e, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f161015e;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f161015e;
            if (i15 == 0) {
                oq.u.b(obj);
                h0 h0Var = h0.this;
                pm2.d.C3962d c3962d = pm2.d.C3962d.f160923a;
                this.f161015e = 1;
                if (h0Var.F(c3962d, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(pm2.e eVar, State state, tq.e<? super oq.i0> eVar2) {
            return h0.this.new m(eVar2).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpm2/h;", "action", "Lpm2/j;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lpm2/h;Lpm2/j;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<ShowAttachmentPreview, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f161017e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f161018f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ShowAttachmentPreview showAttachmentPreview = (ShowAttachmentPreview) this.f161018f;
            Object objE = uq.b.e();
            int i15 = this.f161017e;
            if (i15 == 0) {
                oq.u.b(obj);
                h0 h0Var = h0.this;
                pm2.d.ShowAttachmentPreview showAttachmentPreview2 = new pm2.d.ShowAttachmentPreview(new dx3.a.Content(showAttachmentPreview.getTitle(), showAttachmentPreview.getFileContent()));
                this.f161018f = vq.j.a(showAttachmentPreview);
                this.f161017e = 1;
                if (h0Var.F(showAttachmentPreview2, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ShowAttachmentPreview showAttachmentPreview, State state, tq.e<? super oq.i0> eVar) {
            n nVar = h0.this.new n(eVar);
            nVar.f161018f = showAttachmentPreview;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lpm2/i;", "action", "Lk10/c0;", "Lpm2/j;", "state", "Lk10/l;", "<anonymous>", "(Lpm2/i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<ShowDialog, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f161020e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f161021f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f161022g;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(h0 h0Var, ShowDialog showDialog, State state) {
            return State.b(state, null, null, h0Var.dialogVMSFactory.a(showDialog.getDialogData()), null, null, 27, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ShowDialog showDialog = (ShowDialog) this.f161021f;
            k10.c0 c0Var = (k10.c0) this.f161022g;
            uq.b.e();
            if (this.f161020e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final h0 h0Var = h0.this;
            return c0Var.b(new er.l() { // from class: pm2.m0
                @Override // er.l
                public final Object b(Object obj2) {
                    return h0.o.O(h0Var, showDialog, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ShowDialog showDialog, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            o oVar = h0.this.new o(eVar);
            oVar.f161021f = showDialog;
            oVar.f161022g = c0Var;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class p extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f161024d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f161025e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f161026f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f161027g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f161028h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f161029j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f161030k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f161032m;

        p(tq.e<? super p> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f161030k = obj;
            this.f161032m |= PKIFailureInfo.systemUnavail;
            return h0.this.N9(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class q extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f161033d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f161034e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f161035f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f161036g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f161037h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f161038j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f161039k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f161040l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f161041m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f161042n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f161043p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f161044q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f161045r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f161046s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f161047t;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f161049w;

        q(tq.e<? super q> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f161047t = obj;
            this.f161049w |= PKIFailureInfo.systemUnavail;
            return h0.this.P9(null, this);
        }
    }

    public h0(yy.a aVar, pm2.o oVar, bc4.k kVar, bc4.j jVar, bc4.h hVar, a00.b bVar, yw.b bVar2, mx.c cVar, cb4.j jVar2, qm2.a aVar2) {
        this.mapper = oVar;
        this.pickPhotoFromCameraWithSizeValidationUseCase = kVar;
        this.pickMultiplePhotosFromGalleryUseCase = jVar;
        this.pickFileUseCase = hVar;
        this.pickedFileToAndroidMapper = bVar;
        this.accessibilityTalkBackManager = bVar2;
        this.labelProvider = cVar;
        this.dialogVMSFactory = jVar2;
        this.contract = aVar2;
        State state = new State(aVar2.h(), pq.v.n(), null, g30.v.HIDDEN, null);
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: pm2.g0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.L9(this.f160933a, (k10.v) obj);
            }
        });
        this.state = a9(new e(e9().getState(), this), B9(state));
    }

    private final void A9(dx.b bVar) {
        dx.b.Business.a type;
        dx.b.Business business = bVar instanceof dx.b.Business ? (dx.b.Business) bVar : null;
        if (business == null || (type = business.getType()) == zb4.b.NO_FILE_PICKED || type == zb4.b.NO_PHOTO_PICKED) {
            return;
        }
        b9(new ShowDialog(O9(business)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final pm2.k.Data B9(State state) {
        return this.mapper.b(new pm2.o.Params(state, new er.l() { // from class: pm2.z
            @Override // er.l
            public final Object b(Object obj) {
                return h0.C9(this.f161097a, (mm2.a.SelectOption) obj);
            }
        }, new er.l() { // from class: pm2.a0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.D9(this.f160914a, (mm2.e) obj);
            }
        }, new er.l() { // from class: pm2.b0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.E9(this.f160916a, (g30.v) obj);
            }
        }, b9(pm2.e.f160926a), b9(pm2.d.a.f160920a), b9(pm2.d.b.f160921a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C9(h0 h0Var, mm2.a.SelectOption selectOption) {
        h0Var.d9(new OpenBottomSheet(selectOption));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D9(h0 h0Var, mm2.e eVar) {
        h0Var.d9(new SelectBottomSheetOption(eVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E9(h0 h0Var, g30.v vVar) {
        h0Var.d9(new ChangeBottomSheetState(vVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e5, code lost:
    
        if (r13 == r1) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object F9(k10.c0<pm2.State> r12, tq.e<? super k10.l<pm2.State>> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pm2.h0.F9(k10.c0, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00cb, code lost:
    
        if (r15 == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G9(k10.c0<pm2.State> r14, tq.e<? super k10.l<pm2.State>> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pm2.h0.G9(k10.c0, tq.e):java.lang.Object");
    }

    private final float H9(k10.c0<State> c0Var) {
        float fB = lm2.a.b();
        List<wx.i> listC = c0Var.a().c();
        ArrayList arrayList = new ArrayList(pq.v.y(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(((wx.i) it.next()).d()));
        }
        return fB - (pq.v.V0(arrayList) * 1000000.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object I9(k10.c0<State> c0Var, wx.i iVar, tq.e<? super k10.l<State>> eVar) throws Throwable {
        d dVar;
        Object objP9;
        wx.i iVar2;
        final List<? extends wx.i> list;
        k10.c0<State> c0Var2;
        final List list2;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i15 = dVar.f160979k;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f160979k = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object obj = dVar.f160977h;
        Object objE = uq.b.e();
        int i16 = dVar.f160979k;
        if (i16 == 0) {
            oq.u.b(obj);
            List listI1 = pq.v.i1(c0Var.a().c());
            listI1.remove(iVar);
            List<? extends wx.i> listF1 = pq.v.f1(listI1);
            dVar.f160973d = c0Var;
            dVar.f160974e = vq.j.a(iVar);
            dVar.f160975f = listF1;
            dVar.f160979k = 1;
            objP9 = P9(listF1, dVar);
            if (objP9 != objE) {
                iVar2 = iVar;
                list = listF1;
            }
            return objE;
        }
        if (i16 == 1) {
            List<? extends wx.i> list3 = (List) dVar.f160975f;
            wx.i iVar3 = (wx.i) dVar.f160974e;
            k10.c0<State> c0Var3 = (k10.c0) dVar.f160973d;
            oq.u.b(obj);
            list = list3;
            c0Var = c0Var3;
            objP9 = obj;
            iVar2 = iVar3;
        } else {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list2 = (List) dVar.f160976g;
            list = (List) dVar.f160975f;
            c0Var2 = (k10.c0) dVar.f160973d;
            oq.u.b(obj);
        }
        return c0Var2.b(new er.l() { // from class: pm2.d0
            @Override // er.l
            public final Object b(Object obj2) {
                return h0.J9(list, list2, (State) obj2);
            }
        });
        List list4 = (List) objP9;
        dVar.f160973d = c0Var;
        dVar.f160974e = vq.j.a(iVar2);
        dVar.f160975f = list;
        dVar.f160976g = list4;
        dVar.f160979k = 2;
        if (d0(list, dVar) != objE) {
            c0Var2 = c0Var;
            list2 = list4;
            return c0Var2.b(new er.l() { // from class: pm2.d0
                @Override // er.l
                public final Object b(Object obj2) {
                    return h0.J9(list, list2, (State) obj2);
                }
            });
        }
        return objE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State J9(List list, List list2, State state) {
        return State.b(state, list, list2, null, null, null, 28, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L9(final h0 h0Var, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: pm2.y
            @Override // er.l
            public final Object b(Object obj) {
                return h0.M9(this.f161096a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M9(h0 h0Var, k10.z zVar) {
        zVar.A(h0Var.new g(null));
        h hVar = h0Var.new h(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(pm2.d.class), oVar, hVar);
        zVar.v(q0.c(OpenBottomSheet.class), oVar, new i(null));
        zVar.v(q0.c(ChangeBottomSheetState.class), oVar, new j(null));
        zVar.v(q0.c(SelectBottomSheetOption.class), oVar, h0Var.new k(null));
        zVar.v(q0.c(DeleteFile.class), oVar, h0Var.new l(null));
        zVar.x(q0.c(pm2.e.class), oVar, h0Var.new m(null));
        zVar.x(q0.c(ShowAttachmentPreview.class), oVar, h0Var.new n(null));
        zVar.v(q0.c(ShowDialog.class), oVar, h0Var.new o(null));
        zVar.v(q0.c(pm2.c.class), oVar, new f(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00de, code lost:
    
        if (r1 == r3) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N9(k10.c0<pm2.State> r17, tq.e<? super k10.l<pm2.State>> r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pm2.h0.N9(k10.c0, tq.e):java.lang.Object");
    }

    private final DialogData O9(dx.b.Business business) {
        return new DialogData(cb4.h.b.f24985a, business.getTitle(), business.getMessage(), new DialogButtonTextData(business.getPrimaryActionLabel(), null, b9(pm2.c.f160917a), 2, null), null, null, null, 112, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x0085  */
    /* JADX WARN: Code duplicated, block: B:19:0x00e5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:23:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:26:0x0140  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00e6 -> B:21:0x00eb). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object P9(java.util.List<? extends wx.i> r29, tq.e<? super java.util.List<? extends n40.i>> r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pm2.h0.P9(java.util.List, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q9(h0 h0Var, wx.i iVar, wx.i.Image image) {
        h0Var.d9(new ShowAttachmentPreview(h0Var.labelProvider.c(q5.f219558m), iVar.getFileContent()));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R9(h0 h0Var, wx.i iVar) {
        h0Var.d9(new DeleteFile(iVar));
        return oq.i0.f148189a;
    }

    private final Object d0(List<? extends wx.i> list, tq.e<? super oq.i0> eVar) {
        Object objD0 = this.contract.d0(list, eVar);
        return objD0 == uq.b.e() ? objD0 : oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object x9(k10.c0<State> c0Var, List<? extends wx.i> list, tq.e<? super k10.l<State>> eVar) throws Throwable {
        a aVar;
        Object objP9;
        List<? extends wx.i> list2;
        final List<? extends wx.i> list3;
        k10.c0<State> c0Var2;
        final List list4;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f160956k;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f160956k = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f160954h;
        Object objE = uq.b.e();
        int i16 = aVar.f160956k;
        if (i16 == 0) {
            oq.u.b(obj);
            List listI1 = pq.v.i1(c0Var.a().c());
            listI1.addAll(list);
            List<? extends wx.i> listF1 = pq.v.f1(listI1);
            aVar.f160950d = c0Var;
            aVar.f160951e = vq.j.a(list);
            aVar.f160952f = listF1;
            aVar.f160956k = 1;
            objP9 = P9(listF1, aVar);
            if (objP9 != objE) {
                list2 = list;
                list3 = listF1;
            }
            return objE;
        }
        if (i16 == 1) {
            List<? extends wx.i> list5 = (List) aVar.f160952f;
            List<? extends wx.i> list6 = (List) aVar.f160951e;
            k10.c0<State> c0Var3 = (k10.c0) aVar.f160950d;
            oq.u.b(obj);
            list3 = list5;
            c0Var = c0Var3;
            objP9 = obj;
            list2 = list6;
        } else {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list4 = (List) aVar.f160953g;
            list3 = (List) aVar.f160952f;
            c0Var2 = (k10.c0) aVar.f160950d;
            oq.u.b(obj);
        }
        this.accessibilityTalkBackManager.a(c70.a.f23835a.a().q0().getText());
        return c0Var2.b(new er.l() { // from class: pm2.c0
            @Override // er.l
            public final Object b(Object obj2) {
                return h0.y9(list3, list4, (State) obj2);
            }
        });
        List list7 = (List) objP9;
        aVar.f160950d = c0Var;
        aVar.f160951e = vq.j.a(list2);
        aVar.f160952f = list3;
        aVar.f160953g = list7;
        aVar.f160956k = 2;
        if (d0(list3, aVar) != objE) {
            c0Var2 = c0Var;
            list4 = list7;
            this.accessibilityTalkBackManager.a(c70.a.f23835a.a().q0().getText());
            return c0Var2.b(new er.l() { // from class: pm2.c0
                @Override // er.l
                public final Object b(Object obj2) {
                    return h0.y9(list3, list4, (State) obj2);
                }
            });
        }
        return objE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State y9(List list, List list2, State state) {
        return State.b(state, list, list2, null, null, null, 28, null);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: K9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(qm2.a aVar) {
        super.P5(aVar);
    }

    @Override // zx.b
    public xw.b<pm2.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<pm2.k.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: z9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(pm2.d dVar, tq.e<? super oq.i0> eVar) {
        return super.F(dVar, eVar);
    }
}
