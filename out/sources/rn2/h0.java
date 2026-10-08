package rn2;

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
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B[\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020 *\b\u0012\u0004\u0012\u00020\u00020\u001fH\u0082@¢\u0006\u0004\b!\u0010\"J \u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020 *\b\u0012\u0004\u0012\u00020\u00020\u001fH\u0082@¢\u0006\u0004\b#\u0010\"J \u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020 *\b\u0012\u0004\u0012\u00020\u00020\u001fH\u0082@¢\u0006\u0004\b$\u0010\"J.\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020 *\b\u0012\u0004\u0012\u00020\u00020\u001f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%H\u0082@¢\u0006\u0004\b(\u0010)J(\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00020 *\b\u0012\u0004\u0012\u00020\u00020\u001f2\u0006\u0010'\u001a\u00020&H\u0082@¢\u0006\u0004\b*\u0010+J\u0019\u0010-\u001a\u00020,*\b\u0012\u0004\u0012\u00020\u00020\u001fH\u0002¢\u0006\u0004\b-\u0010.J\u0013\u00101\u001a\u000200*\u00020/H\u0002¢\u0006\u0004\b1\u00102J\u0013\u00105\u001a\u000204*\u000203H\u0002¢\u0006\u0004\b5\u00106J\u001a\u00107\u001a\u000200*\b\u0012\u0004\u0012\u00020&0%H\u0082@¢\u0006\u0004\b7\u00108J \u0010:\u001a\b\u0012\u0004\u0012\u0002090%*\b\u0012\u0004\u0012\u00020&0%H\u0082@¢\u0006\u0004\b:\u00108R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010O\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR \u0010V\u001a\b\u0012\u0004\u0012\u00020Q0P8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR&\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030W8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0]8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a¨\u0006b"}, d2 = {"Lrn2/h0;", "Ll00/g;", "Lrn2/j;", "", "Lrn2/k;", "Lyy/a;", "stateMachineFactory", "Lrn2/o;", "mapper", "Lbc4/k;", "pickPhotoFromCameraWithSizeValidationUseCase", "Lbc4/j;", "pickMultiplePhotosFromGalleryUseCase", "Lbc4/h;", "pickFileUseCase", "La00/b;", "pickedFileToAndroidMapper", "Lyw/b;", "accessibilityTalkBackManager", "Lmx/c;", "labelProvider", "Lcb4/j;", "dialogVMSFactory", "Lsn2/a;", "contract", "<init>", "(Lyy/a;Lrn2/o;Lbc4/k;Lbc4/j;Lbc4/h;La00/b;Lyw/b;Lmx/c;Lcb4/j;Lsn2/a;)V", "state", "Lrn2/k$a;", "B9", "(Lrn2/j;)Lrn2/k$a;", "Lk10/c0;", "Lk10/l;", "N9", "(Lk10/c0;Ltq/e;)Ljava/lang/Object;", "G9", "F9", "", "Lwx/i;", "attachment", "x9", "(Lk10/c0;Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "I9", "(Lk10/c0;Lwx/i;Ltq/e;)Ljava/lang/Object;", "", "H9", "(Lk10/c0;)F", "Ldx/b;", "Loq/i0;", "A9", "(Ldx/b;)V", "Ldx/b$c;", "Lcb4/d;", "O9", "(Ldx/b$c;)Lcb4/d;", "d0", "(Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "Ln40/i;", "P9", "b", "Lrn2/o;", "c", "Lbc4/k;", "d", "Lbc4/j;", "e", "Lbc4/h;", "f", "La00/b;", "g", "Lyw/b;", "h", "Lmx/c;", "j", "Lcb4/j;", "k", "Lsn2/a;", "l", "Lrn2/j;", "initialState", "Lxw/b;", "Lrn2/d;", "m", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "n", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "p", "Lmu/p0;", "getState", "()Lmu/p0;", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h0 extends l00.g<State, Object> implements rn2.k, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final rn2.o mapper;

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
    private final sn2.a contract;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final xw.b<rn2.d> navAction;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<rn2.k.Data> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f175185d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f175186e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f175187f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f175188g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f175189h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f175191k;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f175189h = obj;
            this.f175191k |= PKIFailureInfo.systemUnavail;
            return h0.this.x9(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f175192d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f175193e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f175194f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f175195g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f175196h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f175197j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f175199l;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f175197j = obj;
            this.f175199l |= PKIFailureInfo.systemUnavail;
            return h0.this.F9(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f175200d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f175201e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f175202f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f175203g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f175204h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f175205j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f175207l;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f175205j = obj;
            this.f175207l |= PKIFailureInfo.systemUnavail;
            return h0.this.G9(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f175208d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f175209e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f175210f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f175211g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f175212h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f175214k;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f175212h = obj;
            this.f175214k |= PKIFailureInfo.systemUnavail;
            return h0.this.I9(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e implements mu.g<rn2.k.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f175215a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h0 f175216b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f175217a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ h0 f175218b;

            /* JADX INFO: renamed from: rn2.h0$e$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4469a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f175219d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f175220e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f175221f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f175223h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f175224j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f175225k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f175226l;

                public C4469a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f175219d = obj;
                    this.f175220e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, h0 h0Var) {
                this.f175217a = hVar;
                this.f175218b = h0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4469a c4469a;
                if (eVar instanceof C4469a) {
                    c4469a = (C4469a) eVar;
                    int i15 = c4469a.f175220e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4469a.f175220e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4469a = new C4469a(eVar);
                    }
                } else {
                    c4469a = new C4469a(eVar);
                }
                Object obj2 = c4469a.f175219d;
                Object objE = uq.b.e();
                int i16 = c4469a.f175220e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f175217a;
                    rn2.k.Data dataB9 = this.f175218b.B9((State) obj);
                    c4469a.f175221f = vq.j.a(obj);
                    c4469a.f175223h = vq.j.a(c4469a);
                    c4469a.f175224j = vq.j.a(obj);
                    c4469a.f175225k = vq.j.a(hVar);
                    c4469a.f175226l = 0;
                    c4469a.f175220e = 1;
                    if (hVar.F(dataB9, c4469a) == objE) {
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
            this.f175215a = gVar;
            this.f175216b = h0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super rn2.k.Data> hVar, tq.e eVar) {
            Object objA = this.f175215a.a(new a(hVar, this.f175216b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lrn2/c;", "<unused var>", "Lk10/c0;", "Lrn2/j;", "state", "Lk10/l;", "<anonymous>", "(Lrn2/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<rn2.c, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f175227e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f175228f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, null, null, null, null, null, 27, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f175228f;
            uq.b.e();
            if (this.f175227e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: rn2.j0
                @Override // er.l
                public final Object b(Object obj2) {
                    return h0.f.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(rn2.c cVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            f fVar = new f(eVar);
            fVar.f175228f = c0Var;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lk10/c0;", "Lrn2/j;", "state", "Lk10/l;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.p<k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f175229e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f175230f;

        g(tq.e<? super g> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(List list, State state) {
            return State.b(state, null, list, null, null, null, 29, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f175230f;
            Object objE = uq.b.e();
            int i15 = this.f175229e;
            if (i15 == 0) {
                oq.u.b(obj);
                h0 h0Var = h0.this;
                List<wx.i> listC = ((State) c0Var.a()).c();
                this.f175230f = c0Var;
                this.f175229e = 1;
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
            return c0Var.b(new er.l() { // from class: rn2.i0
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
            gVar.f175230f = obj;
            return gVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lrn2/d;", "action", "Lrn2/j;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lrn2/d;Lrn2/j;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<rn2.d, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f175232e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f175233f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            rn2.d dVar = (rn2.d) this.f175233f;
            Object objE = uq.b.e();
            int i15 = this.f175232e;
            if (i15 == 0) {
                oq.u.b(obj);
                h0 h0Var = h0.this;
                this.f175233f = vq.j.a(dVar);
                this.f175232e = 1;
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
        public final Object w(rn2.d dVar, State state, tq.e<? super oq.i0> eVar) {
            h hVar = h0.this.new h(eVar);
            hVar.f175233f = dVar;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lrn2/f;", "action", "Lk10/c0;", "Lrn2/j;", "state", "Lk10/l;", "<anonymous>", "(Lrn2/f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<OpenBottomSheet, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f175235e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f175236f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f175237g;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(OpenBottomSheet openBottomSheet, State state) {
            return State.b(state, null, null, null, g30.v.EXPANDED, openBottomSheet.getData(), 7, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OpenBottomSheet openBottomSheet = (OpenBottomSheet) this.f175236f;
            k10.c0 c0Var = (k10.c0) this.f175237g;
            uq.b.e();
            if (this.f175235e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: rn2.k0
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
            iVar.f175236f = openBottomSheet;
            iVar.f175237g = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lrn2/a;", "action", "Lk10/c0;", "Lrn2/j;", "state", "Lk10/l;", "<anonymous>", "(Lrn2/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<ChangeBottomSheetState, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f175238e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f175239f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f175240g;

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
            final ChangeBottomSheetState changeBottomSheetState = (ChangeBottomSheetState) this.f175239f;
            final k10.c0 c0Var = (k10.c0) this.f175240g;
            uq.b.e();
            if (this.f175238e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: rn2.l0
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
            jVar.f175239f = changeBottomSheetState;
            jVar.f175240g = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lrn2/g;", "action", "Lk10/c0;", "Lrn2/j;", "state", "Lk10/l;", "<anonymous>", "(Lrn2/g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<SelectBottomSheetOption, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f175241e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f175242f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f175243g;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f175245a;

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
                f175245a = iArr;
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
                java.lang.Object r0 = r7.f175242f
                rn2.g r0 = (rn2.SelectBottomSheetOption) r0
                java.lang.Object r1 = r7.f175243g
                k10.c0 r1 = (k10.c0) r1
                java.lang.Object r2 = uq.b.e()
                int r3 = r7.f175241e
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
                int[] r3 = rn2.h0.k.a.f175245a
                int r8 = r8.ordinal()
                r8 = r3[r8]
                if (r8 == r6) goto L7c
                if (r8 == r5) goto L62
                if (r8 != r4) goto L5c
                rn2.h0 r8 = rn2.h0.this
                java.lang.Object r0 = vq.j.a(r0)
                r7.f175242f = r0
                java.lang.Object r0 = vq.j.a(r1)
                r7.f175243g = r0
                r7.f175241e = r4
                java.lang.Object r8 = rn2.h0.s9(r8, r1, r7)
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
                rn2.h0 r8 = rn2.h0.this
                java.lang.Object r0 = vq.j.a(r0)
                r7.f175242f = r0
                java.lang.Object r0 = vq.j.a(r1)
                r7.f175243g = r0
                r7.f175241e = r5
                java.lang.Object r8 = rn2.h0.t9(r8, r1, r7)
                if (r8 != r2) goto L79
                goto L92
            L79:
                k10.l r8 = (k10.l) r8
                return r8
            L7c:
                rn2.h0 r8 = rn2.h0.this
                java.lang.Object r0 = vq.j.a(r0)
                r7.f175242f = r0
                java.lang.Object r0 = vq.j.a(r1)
                r7.f175243g = r0
                r7.f175241e = r6
                java.lang.Object r8 = rn2.h0.v9(r8, r1, r7)
                if (r8 != r2) goto L93
            L92:
                return r2
            L93:
                k10.l r8 = (k10.l) r8
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: rn2.h0.k.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(SelectBottomSheetOption selectBottomSheetOption, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            k kVar = h0.this.new k(eVar);
            kVar.f175242f = selectBottomSheetOption;
            kVar.f175243g = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lrn2/b;", "action", "Lk10/c0;", "Lrn2/j;", "state", "Lk10/l;", "<anonymous>", "(Lrn2/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<DeleteFile, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f175246e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f175247f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f175248g;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            DeleteFile deleteFile = (DeleteFile) this.f175247f;
            k10.c0 c0Var = (k10.c0) this.f175248g;
            Object objE = uq.b.e();
            int i15 = this.f175246e;
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
            this.f175247f = vq.j.a(deleteFile);
            this.f175248g = vq.j.a(c0Var);
            this.f175246e = 1;
            Object objI9 = h0Var.I9(c0Var, pickedFile, this);
            return objI9 == objE ? objE : objI9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(DeleteFile deleteFile, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            l lVar = h0.this.new l(eVar);
            lVar.f175247f = deleteFile;
            lVar.f175248g = c0Var;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lrn2/e;", "<unused var>", "Lrn2/j;", "Loq/i0;", "<anonymous>", "(Lrn2/e;Lrn2/j;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<rn2.e, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f175250e;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f175250e;
            if (i15 == 0) {
                oq.u.b(obj);
                h0 h0Var = h0.this;
                rn2.d.C4468d c4468d = rn2.d.C4468d.f175158a;
                this.f175250e = 1;
                if (h0Var.F(c4468d, this) == objE) {
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
        public final Object w(rn2.e eVar, State state, tq.e<? super oq.i0> eVar2) {
            return h0.this.new m(eVar2).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lrn2/h;", "action", "Lrn2/j;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lrn2/h;Lrn2/j;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<ShowAttachmentPreview, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f175252e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f175253f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ShowAttachmentPreview showAttachmentPreview = (ShowAttachmentPreview) this.f175253f;
            Object objE = uq.b.e();
            int i15 = this.f175252e;
            if (i15 == 0) {
                oq.u.b(obj);
                h0 h0Var = h0.this;
                rn2.d.ShowAttachmentPreview showAttachmentPreview2 = new rn2.d.ShowAttachmentPreview(new dx3.a.Content(showAttachmentPreview.getTitle(), showAttachmentPreview.getFileContent()));
                this.f175253f = vq.j.a(showAttachmentPreview);
                this.f175252e = 1;
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
            nVar.f175253f = showAttachmentPreview;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lrn2/i;", "action", "Lk10/c0;", "Lrn2/j;", "state", "Lk10/l;", "<anonymous>", "(Lrn2/i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<ShowDialog, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f175255e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f175256f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f175257g;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(h0 h0Var, ShowDialog showDialog, State state) {
            return State.b(state, null, null, h0Var.dialogVMSFactory.a(showDialog.getDialogData()), null, null, 27, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ShowDialog showDialog = (ShowDialog) this.f175256f;
            k10.c0 c0Var = (k10.c0) this.f175257g;
            uq.b.e();
            if (this.f175255e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final h0 h0Var = h0.this;
            return c0Var.b(new er.l() { // from class: rn2.m0
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
            oVar.f175256f = showDialog;
            oVar.f175257g = c0Var;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class p extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f175259d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f175260e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f175261f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f175262g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f175263h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f175264j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f175265k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f175267m;

        p(tq.e<? super p> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f175265k = obj;
            this.f175267m |= PKIFailureInfo.systemUnavail;
            return h0.this.N9(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class q extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f175268d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f175269e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f175270f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f175271g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f175272h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f175273j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f175274k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f175275l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f175276m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f175277n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f175278p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f175279q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f175280r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f175281s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f175282t;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f175284w;

        q(tq.e<? super q> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f175282t = obj;
            this.f175284w |= PKIFailureInfo.systemUnavail;
            return h0.this.P9(null, this);
        }
    }

    public h0(yy.a aVar, rn2.o oVar, bc4.k kVar, bc4.j jVar, bc4.h hVar, a00.b bVar, yw.b bVar2, mx.c cVar, cb4.j jVar2, sn2.a aVar2) {
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
        this.stateMachine = aVar.a(state, new er.l() { // from class: rn2.g0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.L9(this.f175168a, (k10.v) obj);
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
    public final rn2.k.Data B9(State state) {
        return this.mapper.b(new rn2.o.Params(state, new er.l() { // from class: rn2.y
            @Override // er.l
            public final Object b(Object obj) {
                return h0.C9(this.f175330a, (mm2.a.SelectOption) obj);
            }
        }, new er.l() { // from class: rn2.z
            @Override // er.l
            public final Object b(Object obj) {
                return h0.D9(this.f175331a, (mm2.e) obj);
            }
        }, new er.l() { // from class: rn2.a0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.E9(this.f175149a, (g30.v) obj);
            }
        }, b9(rn2.e.f175161a), b9(rn2.d.a.f175155a), b9(rn2.d.b.f175156a)));
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
    public final java.lang.Object F9(k10.c0<rn2.State> r12, tq.e<? super k10.l<rn2.State>> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rn2.h0.F9(k10.c0, tq.e):java.lang.Object");
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
    public final java.lang.Object G9(k10.c0<rn2.State> r14, tq.e<? super k10.l<rn2.State>> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rn2.h0.G9(k10.c0, tq.e):java.lang.Object");
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
            int i15 = dVar.f175214k;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f175214k = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object obj = dVar.f175212h;
        Object objE = uq.b.e();
        int i16 = dVar.f175214k;
        if (i16 == 0) {
            oq.u.b(obj);
            List listI1 = pq.v.i1(c0Var.a().c());
            listI1.remove(iVar);
            List<? extends wx.i> listF1 = pq.v.f1(listI1);
            dVar.f175208d = c0Var;
            dVar.f175209e = vq.j.a(iVar);
            dVar.f175210f = listF1;
            dVar.f175214k = 1;
            objP9 = P9(listF1, dVar);
            if (objP9 != objE) {
                iVar2 = iVar;
                list = listF1;
            }
            return objE;
        }
        if (i16 == 1) {
            List<? extends wx.i> list3 = (List) dVar.f175210f;
            wx.i iVar3 = (wx.i) dVar.f175209e;
            k10.c0<State> c0Var3 = (k10.c0) dVar.f175208d;
            oq.u.b(obj);
            list = list3;
            c0Var = c0Var3;
            objP9 = obj;
            iVar2 = iVar3;
        } else {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list2 = (List) dVar.f175211g;
            list = (List) dVar.f175210f;
            c0Var2 = (k10.c0) dVar.f175208d;
            oq.u.b(obj);
        }
        return c0Var2.b(new er.l() { // from class: rn2.c0
            @Override // er.l
            public final Object b(Object obj2) {
                return h0.J9(list, list2, (State) obj2);
            }
        });
        List list4 = (List) objP9;
        dVar.f175208d = c0Var;
        dVar.f175209e = vq.j.a(iVar2);
        dVar.f175210f = list;
        dVar.f175211g = list4;
        dVar.f175214k = 2;
        if (d0(list, dVar) != objE) {
            c0Var2 = c0Var;
            list2 = list4;
            return c0Var2.b(new er.l() { // from class: rn2.c0
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
        vVar.c(q0.c(State.class), new er.l() { // from class: rn2.b0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.M9(this.f175151a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M9(h0 h0Var, k10.z zVar) {
        zVar.A(h0Var.new g(null));
        h hVar = h0Var.new h(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(rn2.d.class), oVar, hVar);
        zVar.v(q0.c(OpenBottomSheet.class), oVar, new i(null));
        zVar.v(q0.c(ChangeBottomSheetState.class), oVar, new j(null));
        zVar.v(q0.c(SelectBottomSheetOption.class), oVar, h0Var.new k(null));
        zVar.v(q0.c(DeleteFile.class), oVar, h0Var.new l(null));
        zVar.x(q0.c(rn2.e.class), oVar, h0Var.new m(null));
        zVar.x(q0.c(ShowAttachmentPreview.class), oVar, h0Var.new n(null));
        zVar.v(q0.c(ShowDialog.class), oVar, h0Var.new o(null));
        zVar.v(q0.c(rn2.c.class), oVar, new f(null));
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
    public final java.lang.Object N9(k10.c0<rn2.State> r17, tq.e<? super k10.l<rn2.State>> r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rn2.h0.N9(k10.c0, tq.e):java.lang.Object");
    }

    private final DialogData O9(dx.b.Business business) {
        return new DialogData(cb4.h.b.f24985a, business.getTitle(), business.getMessage(), new DialogButtonTextData(business.getPrimaryActionLabel(), null, b9(rn2.c.f175152a), 2, null), null, null, null, 112, null);
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
        throw new UnsupportedOperationException("Method not decompiled: rn2.h0.P9(java.util.List, tq.e):java.lang.Object");
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
            int i15 = aVar.f175191k;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f175191k = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f175189h;
        Object objE = uq.b.e();
        int i16 = aVar.f175191k;
        if (i16 == 0) {
            oq.u.b(obj);
            List listI1 = pq.v.i1(c0Var.a().c());
            listI1.addAll(list);
            List<? extends wx.i> listF1 = pq.v.f1(listI1);
            aVar.f175185d = c0Var;
            aVar.f175186e = vq.j.a(list);
            aVar.f175187f = listF1;
            aVar.f175191k = 1;
            objP9 = P9(listF1, aVar);
            if (objP9 != objE) {
                list2 = list;
                list3 = listF1;
            }
            return objE;
        }
        if (i16 == 1) {
            List<? extends wx.i> list5 = (List) aVar.f175187f;
            List<? extends wx.i> list6 = (List) aVar.f175186e;
            k10.c0<State> c0Var3 = (k10.c0) aVar.f175185d;
            oq.u.b(obj);
            list3 = list5;
            c0Var = c0Var3;
            objP9 = obj;
            list2 = list6;
        } else {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list4 = (List) aVar.f175188g;
            list3 = (List) aVar.f175187f;
            c0Var2 = (k10.c0) aVar.f175185d;
            oq.u.b(obj);
        }
        this.accessibilityTalkBackManager.a(c70.a.f23835a.a().q0().getText());
        return c0Var2.b(new er.l() { // from class: rn2.d0
            @Override // er.l
            public final Object b(Object obj2) {
                return h0.y9(list3, list4, (State) obj2);
            }
        });
        List list7 = (List) objP9;
        aVar.f175185d = c0Var;
        aVar.f175186e = vq.j.a(list2);
        aVar.f175187f = list3;
        aVar.f175188g = list7;
        aVar.f175191k = 2;
        if (d0(list3, aVar) != objE) {
            c0Var2 = c0Var;
            list4 = list7;
            this.accessibilityTalkBackManager.a(c70.a.f23835a.a().q0().getText());
            return c0Var2.b(new er.l() { // from class: rn2.d0
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
    public /* bridge */ void P5(sn2.a aVar) {
        super.P5(aVar);
    }

    @Override // zx.b
    public xw.b<rn2.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<rn2.k.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: z9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(rn2.d dVar, tq.e<? super oq.i0> eVar) {
        return super.F(dVar, eVar);
    }
}
