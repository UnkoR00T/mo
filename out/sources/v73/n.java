package v73;

import fr.q0;
import h64.u;
import iy.b0;
import k10.c0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import y73.ActivateCodeSetupData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005Bc\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\u0002H\u0002¢\u0006\u0004\b%\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010=\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R&\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030>8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR \u0010J\u001a\b\u0012\u0004\u0012\u00020E0D8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR \u0010#\u001a\b\u0012\u0004\u0012\u00020$0K8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O¨\u0006P"}, d2 = {"Lv73/n;", "Ll00/g;", "Lv73/b;", "Lv73/a;", "Lv73/c;", "", "Lyy/a;", "stateMachineFactory", "Lx73/b;", "activateCodeMapper", "Lr73/b;", "validateActivationCodeUseCase", "Lt73/a;", "markPackageAsDownloadedUC", "Lac4/a;", "callActionWithLoaderUseCase", "Lh64/u;", "refreshServicesUseCase", "Lw73/b;", "activateCodeDomainErrorMapper", "Ls73/a;", "studentSchoolCardActivationContainersInteractor", "Ls54/k;", "setLocalNotificationUseCase", "Lpx/d;", "remoteLogger", "Ly73/a;", "setupData", "<init>", "(Lyy/a;Lx73/b;Lr73/b;Lt73/a;Lac4/a;Lh64/u;Lw73/b;Ls73/a;Ls54/k;Lpx/d;Ly73/a;)V", "Ldx/b;", "error", "Ljb4/b;", "v9", "(Ldx/b;)Ljb4/b;", "state", "Lv73/c$a;", "x9", "(Lv73/b;)Lv73/c$a;", "b", "Lx73/b;", "c", "Lr73/b;", "d", "Lt73/a;", "e", "Lac4/a;", "f", "Lh64/u;", "g", "Lw73/b;", "h", "Ls73/a;", "j", "Ls54/k;", "k", "Lpx/d;", "l", "Ly73/a;", "m", "Lv73/b;", "initialState", "Lk10/t;", "n", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lv73/a$d;", "p", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "q", "Lmu/p0;", "getState", "()Lmu/p0;", "studentschoolcardactivation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<State, v73.a> implements v73.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final x73.b activateCodeMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final r73.b validateActivationCodeUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final t73.a markPackageAsDownloadedUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final u refreshServicesUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final w73.b activateCodeDomainErrorMapper;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final s73.a studentSchoolCardActivationContainersInteractor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final s54.k setLocalNotificationUseCase;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final ActivateCodeSetupData setupData;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final t<State, v73.a> stateMachine;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final xw.b<v73.a.d> navAction;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final p0<v73.c.Data> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements er.l<p73.a, i0> {
        a() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(p73.a aVar) {
            c(aVar.getValue());
            return i0.f148189a;
        }

        public final void c(b0 b0Var) {
            n.this.d9(new v73.a.VerifyCode(b0Var, null));
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<v73.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f204361a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f204362b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f204363a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f204364b;

            /* JADX INFO: renamed from: v73.n$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5331a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f204365d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f204366e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f204367f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f204369h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f204370j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f204371k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f204372l;

                public C5331a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f204365d = obj;
                    this.f204366e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, n nVar) {
                this.f204363a = hVar;
                this.f204364b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5331a c5331a;
                if (eVar instanceof C5331a) {
                    c5331a = (C5331a) eVar;
                    int i15 = c5331a.f204366e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5331a.f204366e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5331a = new C5331a(eVar);
                    }
                } else {
                    c5331a = new C5331a(eVar);
                }
                Object obj2 = c5331a.f204365d;
                Object objE = uq.b.e();
                int i16 = c5331a.f204366e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f204363a;
                    v73.c.Data dataX9 = this.f204364b.x9((State) obj);
                    c5331a.f204367f = vq.j.a(obj);
                    c5331a.f204369h = vq.j.a(c5331a);
                    c5331a.f204370j = vq.j.a(obj);
                    c5331a.f204371k = vq.j.a(hVar);
                    c5331a.f204372l = 0;
                    c5331a.f204366e = 1;
                    if (hVar.F(dataX9, c5331a) == objE) {
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

        public b(mu.g gVar, n nVar) {
            this.f204361a = gVar;
            this.f204362b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super v73.c.Data> hVar, tq.e eVar) {
            Object objA = this.f204361a.a(new a(hVar, this.f204362b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lv73/a$b;", "<unused var>", "Lv73/b;", "Loq/i0;", "<anonymous>", "(Lv73/a$b;Lv73/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<v73.a.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f204373e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f204373e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<v73.a.d> bVarY1 = n.this.Y1();
                v73.a.d.C5330a c5330a = v73.a.d.C5330a.f204320a;
                this.f204373e = 1;
                if (bVarY1.F(c5330a, this) == objE) {
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
        public final Object w(v73.a.b bVar, State state, tq.e<? super i0> eVar) {
            return n.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lv73/a$c;", "<unused var>", "Lv73/b;", "Loq/i0;", "<anonymous>", "(Lv73/a$c;Lv73/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<v73.a.c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f204375e;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f204377a;

            static {
                int[] iArr = new int[fp0.e.values().length];
                try {
                    iArr[fp0.e.STUDENT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f204377a = iArr;
            }
        }

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
        
            if (r8.F(r1, r7) == r0) goto L22;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r7.f204375e
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L25
                if (r1 == r4) goto L21
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                oq.u.b(r8)
                goto L78
            L15:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1d:
                oq.u.b(r8)
                goto L67
            L21:
                oq.u.b(r8)
                goto L3d
            L25:
                oq.u.b(r8)
                v73.n r8 = v73.n.this
                h64.u r8 = v73.n.o9(r8)
                h64.u$a r1 = new h64.u$a
                r5 = 0
                r1.<init>(r5)
                r7.f204375e = r4
                java.lang.Object r8 = r8.c(r1, r7)
                if (r8 != r0) goto L3d
                goto L77
            L3d:
                v73.n r8 = v73.n.this
                s54.k r8 = v73.n.q9(r8)
                s54.k$a r1 = new s54.k$a
                v73.n r5 = v73.n.this
                y73.a r5 = v73.n.r9(r5)
                fp0.e r5 = r5.getInstitution()
                int[] r6 = v73.n.d.a.f204377a
                int r5 = r5.ordinal()
                r5 = r6[r5]
                if (r5 != r4) goto L7b
                rq0.b$d r4 = rq0.b.d.STUDENT_CARD
                r1.<init>(r4)
                r7.f204375e = r3
                java.lang.Object r8 = r8.c(r1, r7)
                if (r8 != r0) goto L67
                goto L77
            L67:
                v73.n r8 = v73.n.this
                xw.b r8 = r8.Y1()
                v73.a$d$b r1 = v73.a.d.b.f204321a
                r7.f204375e = r2
                java.lang.Object r8 = r8.F(r1, r7)
                if (r8 != r0) goto L78
            L77:
                return r0
            L78:
                oq.i0 r8 = oq.i0.f148189a
                return r8
            L7b:
                oq.p r8 = new oq.p
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: v73.n.d.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(v73.a.c cVar, State state, tq.e<? super i0> eVar) {
            return n.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lv73/a$a;", "action", "Lk10/c0;", "Lv73/b;", "state", "Lk10/l;", "<anonymous>", "(Lv73/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<v73.a.ActivationCodeChange, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f204378e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f204379f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f204380g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(v73.a.ActivationCodeChange activationCodeChange, State state) {
            return State.b(state, activationCodeChange.getActivationCode(), null, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final v73.a.ActivationCodeChange activationCodeChange = (v73.a.ActivationCodeChange) this.f204379f;
            c0 c0Var = (c0) this.f204380g;
            uq.b.e();
            if (this.f204378e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: v73.o
                @Override // er.l
                public final Object b(Object obj2) {
                    return n.e.O(activationCodeChange, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(v73.a.ActivationCodeChange activationCodeChange, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f204379f = activationCodeChange;
            eVar2.f204380g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lv73/a$e;", "action", "Lk10/c0;", "Lv73/b;", "state", "Lk10/l;", "<anonymous>", "(Lv73/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<v73.a.VerifyCode, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f204381e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f204382f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f204383g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f204384h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ z<State, State, v73.a> f204386k;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f204387e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f204388f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f204389g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f204390h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f204391j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f204392k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f204393l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ n f204394m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ v73.a.VerifyCode f204395n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ z<State, State, v73.a> f204396p;

            /* JADX INFO: renamed from: v73.n$f$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final /* synthetic */ class C5332a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f204397a;

                static {
                    int[] iArr = new int[fp0.e.values().length];
                    try {
                        iArr[fp0.e.STUDENT.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    f204397a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(n nVar, v73.a.VerifyCode verifyCode, z<State, State, v73.a> zVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f204394m = nVar;
                this.f204395n = verifyCode;
                this.f204396p = zVar;
            }

            /* JADX WARN: Code duplicated, block: B:35:0x016a  */
            /* JADX WARN: Code duplicated, block: B:38:0x0172  */
            /* JADX WARN: Code duplicated, block: B:39:0x01a6  */
            /* JADX WARN: Code duplicated, block: B:41:0x01aa  */
            /* JADX WARN: Code duplicated, block: B:44:0x01ba  */
            /* JADX WARN: Instruction removed from duplicated block: B:38:0x0172, please report this as an issue */
            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                dx.i iVar;
                n nVar;
                z<State, State, v73.a> zVar;
                int i15;
                i0 i0Var;
                int i16;
                z<State, State, v73.a> zVar2;
                Object objH;
                z<State, State, v73.a> zVar3;
                dx.i iVar2;
                Object objE = uq.b.e();
                int i17 = this.f204393l;
                if (i17 == 0) {
                    oq.u.b(obj);
                    if (C5332a.f204397a[this.f204394m.setupData.getInstitution().ordinal()] != 1) {
                        throw new oq.p();
                    }
                    s73.a aVar = this.f204394m.studentSchoolCardActivationContainersInteractor;
                    b0 activationCode = this.f204395n.getActivationCode();
                    String packageData = this.f204394m.setupData.getPackageData();
                    this.f204393l = 1;
                    obj = aVar.d(packageData, activationCode, this);
                    if (obj != objE) {
                    }
                    return objE;
                }
                if (i17 != 1) {
                    if (i17 == 2) {
                        zVar2 = (z) this.f204389g;
                        nVar = (n) this.f204388f;
                        oq.u.b(obj);
                        px.b.y5(nVar.remoteLogger, nVar.setupData.getInstitution().name() + " activation", null, px.c.a(zVar2), 2, null);
                        return i0.f148189a;
                    }
                    if (i17 == 3) {
                        int i18 = this.f204392k;
                        i16 = this.f204391j;
                        i0Var = (i0) this.f204390h;
                        z<State, State, v73.a> zVar4 = (z) this.f204389g;
                        n nVar2 = (n) this.f204388f;
                        iVar = (dx.i) this.f204387e;
                        oq.u.b(obj);
                        i15 = i18;
                        nVar = nVar2;
                        zVar = zVar4;
                        t73.a aVar2 = nVar.markPackageAsDownloadedUC;
                        t73.a.Params params = new t73.a.Params(nVar.setupData.getQrCode(), null);
                        this.f204387e = vq.j.a(iVar);
                        this.f204388f = nVar;
                        this.f204389g = zVar;
                        this.f204390h = vq.j.a(i0Var);
                        this.f204391j = i16;
                        this.f204392k = i15;
                        this.f204393l = 4;
                        objH = aVar2.h(params, this);
                        if (objH != objE) {
                            zVar3 = zVar;
                            obj = objH;
                        }
                        return objE;
                    }
                    if (i17 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zVar3 = (z) this.f204389g;
                    nVar = (n) this.f204388f;
                    oq.u.b(obj);
                    iVar2 = (dx.i) obj;
                    if (iVar2 instanceof dx.i.Left) {
                        px.b.y5(nVar.remoteLogger, nVar.setupData.getInstitution().name() + " package downloaded", null, px.c.a(zVar3), 2, null);
                    } else {
                        if (iVar2 instanceof dx.i.Right) {
                            throw new oq.p();
                        }
                        nVar.d9(v73.a.c.f204319a);
                    }
                    return i0.f148189a;
                }
                oq.u.b(obj);
                iVar = (dx.i) obj;
                nVar = this.f204394m;
                zVar = this.f204396p;
                i15 = 0;
                if (iVar instanceof dx.i.Left) {
                    dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    xw.b<v73.a.d> bVarY1 = nVar.Y1();
                    v73.a.d.GoToError goToError = new v73.a.d.GoToError(nVar.v9(bVar));
                    this.f204387e = vq.j.a(iVar);
                    this.f204388f = nVar;
                    this.f204389g = zVar;
                    this.f204390h = vq.j.a(bVar);
                    this.f204391j = 0;
                    this.f204392k = 0;
                    this.f204393l = 2;
                    if (bVarY1.F(goToError, this) != objE) {
                        zVar2 = zVar;
                        px.b.y5(nVar.remoteLogger, nVar.setupData.getInstitution().name() + " activation", null, px.c.a(zVar2), 2, null);
                        return i0.f148189a;
                    }
                } else {
                    if (!(iVar instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    i0Var = (i0) ((dx.i.Right) iVar).b();
                    s73.a aVar3 = nVar.studentSchoolCardActivationContainersInteractor;
                    this.f204387e = vq.j.a(iVar);
                    this.f204388f = nVar;
                    this.f204389g = zVar;
                    this.f204390h = vq.j.a(i0Var);
                    this.f204391j = 0;
                    this.f204392k = 0;
                    this.f204393l = 3;
                    if (aVar3.c(this) != objE) {
                        i16 = 0;
                        t73.a aVar4 = nVar.markPackageAsDownloadedUC;
                        t73.a.Params params2 = new t73.a.Params(nVar.setupData.getQrCode(), null);
                        this.f204387e = vq.j.a(iVar);
                        this.f204388f = nVar;
                        this.f204389g = zVar;
                        this.f204390h = vq.j.a(i0Var);
                        this.f204391j = i16;
                        this.f204392k = i15;
                        this.f204393l = 4;
                        objH = aVar4.h(params2, this);
                        if (objH != objE) {
                            zVar3 = zVar;
                            obj = objH;
                            iVar2 = (dx.i) obj;
                            if (iVar2 instanceof dx.i.Left) {
                                px.b.y5(nVar.remoteLogger, nVar.setupData.getInstitution().name() + " package downloaded", null, px.c.a(zVar3), 2, null);
                            } else {
                                if (iVar2 instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                nVar.d9(v73.a.c.f204319a);
                            }
                            return i0.f148189a;
                        }
                    }
                }
                return objE;
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f204394m, this.f204395n, this.f204396p, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super i0> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(z<State, State, v73.a> zVar, tq.e<? super f> eVar) {
            super(3, eVar);
            this.f204386k = zVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(v73.a.VerifyCode verifyCode, hz.b bVar, State state) {
            return state.a(verifyCode.getActivationCode(), bVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final hz.b bVarB;
            hz.b bVar;
            final v73.a.VerifyCode verifyCode = (v73.a.VerifyCode) this.f204383g;
            c0 c0Var = (c0) this.f204384h;
            Object objE = uq.b.e();
            int i15 = this.f204382f;
            if (i15 == 0) {
                oq.u.b(obj);
                bVarB = n.this.validateActivationCodeUseCase.b(verifyCode.getActivationCode());
                if (bVarB instanceof hz.b.d) {
                    ac4.a aVar = n.this.callActionWithLoaderUseCase;
                    a aVar2 = new a(n.this, verifyCode, this.f204386k, null);
                    this.f204383g = verifyCode;
                    this.f204384h = c0Var;
                    this.f204381e = bVarB;
                    this.f204382f = 1;
                    if (ac4.a.a(aVar, null, aVar2, this, 1, null) == objE) {
                        return objE;
                    }
                    bVar = bVarB;
                }
                return c0Var.b(new er.l() { // from class: v73.p
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return n.f.O(verifyCode, bVarB, (State) obj2);
                    }
                });
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = (hz.b) this.f204381e;
            oq.u.b(obj);
            bVarB = bVar;
            return c0Var.b(new er.l() { // from class: v73.p
                @Override // er.l
                public final Object b(Object obj2) {
                    return n.f.O(verifyCode, bVarB, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(v73.a.VerifyCode verifyCode, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            f fVar = n.this.new f(this.f204386k, eVar);
            fVar.f204383g = verifyCode;
            fVar.f204384h = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    public n(yy.a aVar, x73.b bVar, r73.b bVar2, t73.a aVar2, ac4.a aVar3, u uVar, w73.b bVar3, s73.a aVar4, s54.k kVar, px.d dVar, ActivateCodeSetupData activateCodeSetupData) {
        this.activateCodeMapper = bVar;
        this.validateActivationCodeUseCase = bVar2;
        this.markPackageAsDownloadedUC = aVar2;
        this.callActionWithLoaderUseCase = aVar3;
        this.refreshServicesUseCase = uVar;
        this.activateCodeDomainErrorMapper = bVar3;
        this.studentSchoolCardActivationContainersInteractor = aVar4;
        this.setLocalNotificationUseCase = kVar;
        this.remoteLogger = dVar;
        this.setupData = activateCodeSetupData;
        State state = new State(null, null, 3, null);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: v73.m
            @Override // er.l
            public final Object b(Object obj) {
                return n.A9(this.f204345a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new b(e9().getState(), this), x9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(final n nVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: v73.j
            @Override // er.l
            public final Object b(Object obj) {
                return n.B9(this.f204342a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(n nVar, z zVar) {
        c cVar = nVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(v73.a.b.class), oVar, cVar);
        zVar.x(q0.c(v73.a.c.class), oVar, nVar.new d(null));
        zVar.v(q0.c(v73.a.ActivationCodeChange.class), oVar, new e(null));
        zVar.v(q0.c(v73.a.VerifyCode.class), oVar, nVar.new f(zVar, null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b v9(dx.b error) {
        return this.activateCodeDomainErrorMapper.b(new ib4.c.Params(error, false, new er.l() { // from class: v73.l
            @Override // er.l
            public final Object b(Object obj) {
                return n.w9(this.f204344a, (ib4.c.b) obj);
            }
        }, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(n nVar, ib4.c.b bVar) {
        if (!(bVar instanceof ib4.c.b.a) || ((ib4.c.b.a) bVar).getType() != o73.e.DIFFERENT_REFRESHED_PESEL) {
            bVar = null;
        }
        if (bVar != null) {
            nVar.d9(v73.a.b.f204318a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final v73.c.Data x9(State state) {
        return this.activateCodeMapper.b(new x73.b.Params(state, b9(v73.a.b.f204318a), new er.l() { // from class: v73.k
            @Override // er.l
            public final Object b(Object obj) {
                return n.y9(this.f204343a, (String) obj);
            }
        }, new a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(n nVar, String str) {
        nVar.d9(new v73.a.ActivationCodeChange(p73.a.c(iy.c0.g(str)), null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<v73.a.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, v73.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<v73.c.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: z9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(ActivateCodeSetupData activateCodeSetupData) {
        super.P5(activateCodeSetupData);
    }
}
