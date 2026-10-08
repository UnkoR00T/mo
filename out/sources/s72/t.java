package s72;

import fr.q0;
import java.util.List;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vy.Coordinates;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006B\u0081\u0001\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010\u001f\u001a\u00020\u0006\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020\u0002H\u0002¢\u0006\u0004\b(\u0010)J$\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020+2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00020*H\u0082@¢\u0006\u0004\b,\u0010-J\u0018\u00101\u001a\u0002002\u0006\u0010/\u001a\u00020.H\u0096\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u000200H\u0096\u0001¢\u0006\u0004\b3\u00104R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u001f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010S\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR \u0010Z\u001a\b\u0012\u0004\u0012\u00020U0T8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR&\u0010`\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030[8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R \u0010&\u001a\b\u0012\u0004\u0012\u00020'0a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e¨\u0006f"}, d2 = {"Ls72/t;", "Ll00/g;", "Ls72/b;", "Ls72/a;", "Ls72/c;", "", "Li70/e;", "Lyy/a;", "stateMachineFactory", "Lt72/f;", "mapper", "Lt72/e;", "dialogMapper", "Li14/b;", "getGpsCurrentStatus", "Li14/d;", "isGpsEnabledUseCase", "Li14/a;", "checkGpsPermissionGrantedUseCase", "Li14/e;", "requestPreciseLocationUseCase", "Li14/c;", "getPreciseLocationUseCase", "Lc72/a;", "interactor", "Lib4/c;", "genericDomainErrorMapper", "Luy/d;", "gpsManager", "Lmx/c;", "labelProvider", "globalSnackBarManager", "La14/m;", "goToApplicationDetailsSettingsUseCase", "La14/n;", "goToDeviceLocationSettingsUseCase", "<init>", "(Lyy/a;Lt72/f;Lt72/e;Li14/b;Li14/d;Li14/a;Li14/e;Li14/c;Lc72/a;Lib4/c;Luy/d;Lmx/c;Li70/e;La14/m;La14/n;)V", "state", "Ls72/c$a;", "B9", "(Ls72/b;)Ls72/c$a;", "Lk10/c0;", "Lk10/l;", "E9", "(Lk10/c0;Ltq/e;)Ljava/lang/Object;", "Lp50/a;", "snackBarData", "Loq/i0;", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lt72/f;", "c", "Lt72/e;", "d", "Li14/b;", "e", "Li14/d;", "f", "Li14/a;", "g", "Li14/e;", "h", "Li14/c;", "j", "Lc72/a;", "k", "Lib4/c;", "l", "Luy/d;", "m", "Lmx/c;", "n", "Li70/e;", "p", "La14/m;", "q", "La14/n;", "r", "Ls72/b;", "initialState", "Lxw/b;", "Ls72/a$f;", "s", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "t", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "v", "Lmu/p0;", "getState", "()Lmu/p0;", "floodalert_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t extends l00.g<State, s72.a> implements s72.c, zx.d, i70.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final t72.f mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final t72.e dialogMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final i14.b getGpsCurrentStatus;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final i14.d isGpsEnabledUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final i14.a checkGpsPermissionGrantedUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final i14.e requestPreciseLocationUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final i14.c getPreciseLocationUseCase;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final c72.a interactor;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final uy.d gpsManager;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final a14.m goToApplicationDetailsSettingsUseCase;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final a14.n goToDeviceLocationSettingsUseCase;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final xw.b<s72.a.f> navAction;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, s72.a> stateMachine;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final p0<s72.c.Data> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f178801d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f178802e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f178803f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f178804g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f178806j;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f178804g = obj;
            this.f178806j |= PKIFailureInfo.systemUnavail;
            return t.this.E9(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<s72.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f178807a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t f178808b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f178809a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ t f178810b;

            /* JADX INFO: renamed from: s72.t$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4590a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f178811d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f178812e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f178813f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f178815h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f178816j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f178817k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f178818l;

                public C4590a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f178811d = obj;
                    this.f178812e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, t tVar) {
                this.f178809a = hVar;
                this.f178810b = tVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4590a c4590a;
                if (eVar instanceof C4590a) {
                    c4590a = (C4590a) eVar;
                    int i15 = c4590a.f178812e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4590a.f178812e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4590a = new C4590a(eVar);
                    }
                } else {
                    c4590a = new C4590a(eVar);
                }
                Object obj2 = c4590a.f178811d;
                Object objE = uq.b.e();
                int i16 = c4590a.f178812e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f178809a;
                    s72.c.Data dataB9 = this.f178810b.B9((State) obj);
                    c4590a.f178813f = vq.j.a(obj);
                    c4590a.f178815h = vq.j.a(c4590a);
                    c4590a.f178816j = vq.j.a(obj);
                    c4590a.f178817k = vq.j.a(hVar);
                    c4590a.f178818l = 0;
                    c4590a.f178812e = 1;
                    if (hVar.F(dataB9, c4590a) == objE) {
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

        public b(mu.g gVar, t tVar) {
            this.f178807a = gVar;
            this.f178808b = tVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super s72.c.Data> hVar, tq.e eVar) {
            Object objA = this.f178807a.a(new a(hVar, this.f178808b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ls72/a$c;", "<unused var>", "Ls72/b;", "Loq/i0;", "<anonymous>", "(Ls72/a$c;Ls72/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<s72.a.c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f178819e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f178820f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
        
            if (r1.c(r3, r4) == r0) goto L17;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r5) throws java.lang.Throwable {
            /*
                r4 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r4.f178820f
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r5)
                goto L56
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                oq.u.b(r5)
                goto L32
            L1e:
                oq.u.b(r5)
                s72.t r5 = s72.t.this
                i14.d r5 = s72.t.y9(r5)
                gz.b$a$a r1 = gz.b.a.C1792a.f78542a
                r4.f178820f = r3
                java.lang.Object r5 = r5.c(r1, r4)
                if (r5 != r0) goto L32
                goto L4c
            L32:
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 != 0) goto L4d
                s72.t r1 = s72.t.this
                a14.n r1 = s72.t.u9(r1)
                gz.b$a$a r3 = gz.b.a.C1792a.f78542a
                r4.f178819e = r5
                r4.f178820f = r2
                java.lang.Object r5 = r1.c(r3, r4)
                if (r5 != r0) goto L56
            L4c:
                return r0
            L4d:
                s72.t r5 = s72.t.this
                s72.a$e r0 = s72.a.e.f178723a
                s72.t.o9(r5, r0)
                oq.i0 r5 = oq.i0.f148189a
            L56:
                oq.i0 r5 = oq.i0.f148189a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: s72.t.c.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(s72.a.c cVar, State state, tq.e<? super i0> eVar) {
            return t.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "isGpsActive", "Lk10/c0;", "Ls72/b;", "state", "Lk10/l;", "<anonymous>", "(ZLk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<Boolean, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f178822e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ boolean f178823f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f178824g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(boolean z15, State state) {
            return State.b(state, null, z15, false, null, null, 29, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final boolean z15 = this.f178823f;
            k10.c0 c0Var = (k10.c0) this.f178824g;
            uq.b.e();
            if (this.f178822e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: s72.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.d.O(z15, (State) obj2);
                }
            });
        }

        public final Object N(boolean z15, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f178823f = z15;
            dVar.f178824g = c0Var;
            return dVar.J(i0.f148189a);
        }

        @Override // er.q
        public /* bridge */ /* synthetic */ Object w(Boolean bool, k10.c0<State> c0Var, tq.e<? super k10.l<? extends State>> eVar) {
            return N(bool.booleanValue(), c0Var, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ls72/a$l;", "<unused var>", "Lk10/c0;", "Ls72/b;", "state", "Lk10/l;", "<anonymous>", "(Ls72/a$l;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<s72.a.l, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f178825e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f178826f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f178827g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f178828h;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(Coordinates coordinates, boolean z15, boolean z16, State state) {
            return State.b(state, coordinates, z15, z16, null, null, 24, null);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0080  */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final boolean z15;
            boolean zBooleanValue;
            Object objC;
            final boolean z16;
            k10.c0 c0Var = (k10.c0) this.f178828h;
            Object objE = uq.b.e();
            int i15 = this.f178827g;
            if (i15 == 0) {
                oq.u.b(obj);
                i14.a aVar = t.this.checkGpsPermissionGrantedUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f178828h = c0Var;
                this.f178827g = 1;
                obj = aVar.c(c1792a, this);
                if (obj != objE) {
                }
                return objE;
            }
            if (i15 == 1) {
                oq.u.b(obj);
            } else {
                if (i15 == 2) {
                    z15 = this.f178825e;
                    oq.u.b(obj);
                    zBooleanValue = ((Boolean) obj).booleanValue();
                    i14.c cVar = t.this.getPreciseLocationUseCase;
                    gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
                    this.f178828h = c0Var;
                    this.f178825e = z15;
                    this.f178826f = zBooleanValue;
                    this.f178827g = 3;
                    objC = cVar.c(c1792a2, this);
                    if (objC != objE) {
                        z16 = zBooleanValue;
                        obj = objC;
                    }
                    return objE;
                }
                if (i15 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z16 = this.f178826f;
                z15 = this.f178825e;
                oq.u.b(obj);
            }
            final Coordinates coordinates = (Coordinates) obj;
            return c0Var.b(new er.l() { // from class: s72.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.e.O(coordinates, z16, z15, (State) obj2);
                }
            });
            boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
            i14.d dVar = t.this.isGpsEnabledUseCase;
            gz.b.a.C1792a c1792a3 = gz.b.a.C1792a.f78542a;
            this.f178828h = c0Var;
            this.f178825e = zBooleanValue2;
            this.f178827g = 2;
            Object objC2 = dVar.c(c1792a3, this);
            if (objC2 != objE) {
                z15 = zBooleanValue2;
                obj = objC2;
                zBooleanValue = ((Boolean) obj).booleanValue();
                i14.c cVar2 = t.this.getPreciseLocationUseCase;
                gz.b.a.C1792a c1792a4 = gz.b.a.C1792a.f78542a;
                this.f178828h = c0Var;
                this.f178825e = z15;
                this.f178826f = zBooleanValue;
                this.f178827g = 3;
                objC = cVar2.c(c1792a4, this);
                if (objC != objE) {
                    z16 = zBooleanValue;
                    obj = objC;
                    final Coordinates coordinates2 = (Coordinates) obj;
                    return c0Var.b(new er.l() { // from class: s72.v
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return t.e.O(coordinates2, z16, z15, (State) obj2);
                        }
                    });
                }
            }
            return objE;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(s72.a.l lVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = t.this.new e(eVar);
            eVar2.f178828h = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ls72/a$k;", "<unused var>", "Ls72/b;", "Loq/i0;", "<anonymous>", "(Ls72/a$k;Ls72/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<s72.a.k, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f178830e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f178830e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<s72.a.f> bVarY1 = t.this.Y1();
                s72.a.f.d dVar = s72.a.f.d.f178728a;
                this.f178830e = 1;
                if (bVarY1.F(dVar, this) == objE) {
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
        public final Object w(s72.a.k kVar, State state, tq.e<? super i0> eVar) {
            return t.this.new f(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ls72/b;", "it", "Loq/i0;", "<anonymous>", "(Ls72/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.p<State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f178832e;

        g(tq.e<? super g> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f178832e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            t.this.d9(s72.a.h.f178731a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(State state, tq.e<? super i0> eVar) {
            return ((g) v(state, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return t.this.new g(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ls72/a$h;", "action", "Ls72/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ls72/a$h;Ls72/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<s72.a.h, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f178834e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f178835f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            s72.a.h hVar = (s72.a.h) this.f178835f;
            Object objE = uq.b.e();
            int i15 = this.f178834e;
            if (i15 == 0) {
                oq.u.b(obj);
                c72.a aVar = t.this.interactor;
                this.f178835f = hVar;
                this.f178834e = 1;
                obj = aVar.b(this);
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
            t tVar = t.this;
            if (iVar instanceof dx.i.Left) {
                tVar.d9(new s72.a.Error((dx.b) ((dx.i.Left) iVar).b(), hVar));
                tVar.d9(new s72.a.SetupData(null));
            } else {
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                tVar.d9(new s72.a.SetupData((List) ((dx.i.Right) iVar).b()));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(s72.a.h hVar, State state, tq.e<? super i0> eVar) {
            h hVar2 = t.this.new h(eVar);
            hVar2.f178835f = hVar;
            return hVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ls72/a$i;", "action", "Lk10/c0;", "Ls72/b;", "state", "Lk10/l;", "<anonymous>", "(Ls72/a$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<s72.a.SetupData, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f178837e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f178838f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f178839g;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State X(s72.a.SetupData setupData, Coordinates coordinates, State state) {
            return State.b(state, coordinates, true, true, null, setupData.a(), 8, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State Y(s72.a.SetupData setupData, State state) {
            return State.b(state, null, false, false, null, setupData.a(), 13, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State Z(s72.a.SetupData setupData, State state) {
            return State.b(state, null, false, false, null, setupData.a(), 11, null);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x006c  */
        /* JADX WARN: Code duplicated, block: B:27:0x008d  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x007e, code lost:
        
            if (r8 == r2) goto L24;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f178838f
                s72.a$i r0 = (s72.a.SetupData) r0
                java.lang.Object r1 = r7.f178839g
                k10.c0 r1 = (k10.c0) r1
                java.lang.Object r2 = uq.b.e()
                int r3 = r7.f178837e
                r4 = 3
                r5 = 2
                r6 = 1
                if (r3 == 0) goto L2d
                if (r3 == r6) goto L29
                if (r3 == r5) goto L25
                if (r3 != r4) goto L1d
                oq.u.b(r8)
                goto L81
            L1d:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L25:
                oq.u.b(r8)
                goto L64
            L29:
                oq.u.b(r8)
                goto L45
            L2d:
                oq.u.b(r8)
                s72.t r8 = s72.t.this
                i14.e r8 = s72.t.x9(r8)
                gz.b$a$a r3 = gz.b.a.C1792a.f78542a
                r7.f178838f = r0
                r7.f178839g = r1
                r7.f178837e = r6
                java.lang.Object r8 = r8.c(r3, r7)
                if (r8 != r2) goto L45
                goto L80
            L45:
                x04.a r8 = (x04.a) r8
                x04.a$a r3 = x04.a.C5758a.f216293a
                boolean r3 = fr.t.c(r8, r3)
                if (r3 == 0) goto Lab
                s72.t r8 = s72.t.this
                i14.d r8 = s72.t.y9(r8)
                gz.b$a$a r3 = gz.b.a.C1792a.f78542a
                r7.f178838f = r0
                r7.f178839g = r1
                r7.f178837e = r5
                java.lang.Object r8 = r8.c(r3, r7)
                if (r8 != r2) goto L64
                goto L80
            L64:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 == 0) goto L8d
                s72.t r8 = s72.t.this
                i14.c r8 = s72.t.s9(r8)
                gz.b$a$a r3 = gz.b.a.C1792a.f78542a
                r7.f178838f = r0
                r7.f178839g = r1
                r7.f178837e = r4
                java.lang.Object r8 = r8.c(r3, r7)
                if (r8 != r2) goto L81
            L80:
                return r2
            L81:
                vy.c r8 = (vy.Coordinates) r8
                s72.w r2 = new s72.w
                r2.<init>()
                k10.l r8 = r1.b(r2)
                return r8
            L8d:
                s72.t r8 = s72.t.this
                s72.a$g r2 = new s72.a$g
                u72.a r3 = u72.a.GPS_DISABLED_DIALOG
                s72.t r4 = s72.t.this
                s72.a$c r5 = s72.a.c.f178721a
                er.a r4 = s72.t.n9(r4, r5)
                r2.<init>(r3, r4)
                s72.t.o9(r8, r2)
                s72.x r8 = new s72.x
                r8.<init>()
                k10.l r8 = r1.b(r8)
                return r8
            Lab:
                x04.a$b r2 = x04.a.b.f216294a
                boolean r8 = fr.t.c(r8, r2)
                if (r8 == 0) goto Lbd
                s72.y r8 = new s72.y
                r8.<init>()
                k10.l r8 = r1.b(r8)
                return r8
            Lbd:
                oq.p r8 = new oq.p
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: s72.t.i.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public final Object w(s72.a.SetupData setupData, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            i iVar = t.this.new i(eVar);
            iVar.f178838f = setupData;
            iVar.f178839g = c0Var;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ls72/a$a;", "<unused var>", "Ls72/b;", "Loq/i0;", "<anonymous>", "(Ls72/a$a;Ls72/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<s72.a.C4588a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f178841e;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f178841e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<s72.a.f> bVarY1 = t.this.Y1();
                s72.a.f.C4589a c4589a = s72.a.f.C4589a.f178724a;
                this.f178841e = 1;
                if (bVarY1.F(c4589a, this) == objE) {
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
        public final Object w(s72.a.C4588a c4588a, State state, tq.e<? super i0> eVar) {
            return t.this.new j(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ls72/a$e;", "<unused var>", "Lk10/c0;", "Ls72/b;", "state", "Lk10/l;", "<anonymous>", "(Ls72/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<s72.a.e, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f178843e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f178844f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f178844f;
            Object objE = uq.b.e();
            int i15 = this.f178843e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            t tVar = t.this;
            this.f178844f = vq.j.a(c0Var);
            this.f178843e = 1;
            Object objE9 = tVar.E9(c0Var, this);
            return objE9 == objE ? objE : objE9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(s72.a.e eVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar2) {
            k kVar = t.this.new k(eVar2);
            kVar.f178844f = c0Var;
            return kVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ls72/a$b;", "action", "Ls72/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ls72/a$b;Ls72/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<s72.a.Error, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f178846e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f178847f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(t tVar, s72.a.Error error, ib4.c.b bVar) {
            if ((bVar instanceof ib4.c.b.a.Close) || (bVar instanceof ib4.c.b.a.Primary) || (bVar instanceof ib4.c.b.a.Secondary) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                tVar.d9(s72.a.C4588a.f178718a);
            } else {
                if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                    throw new oq.p();
                }
                tVar.d9(error.getRetryAction());
            }
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final s72.a.Error error = (s72.a.Error) this.f178847f;
            Object objE = uq.b.e();
            int i15 = this.f178846e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<s72.a.f> bVarY1 = t.this.Y1();
                ib4.c cVar = t.this.genericDomainErrorMapper;
                dx.b domainError = error.getDomainError();
                final t tVar = t.this;
                s72.a.f.Error error2 = new s72.a.f.Error(cVar.b(new ib4.c.Params(domainError, false, new er.l() { // from class: s72.z
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return t.l.O(tVar, error, (ib4.c.b) obj2);
                    }
                }, 2, null)));
                this.f178847f = vq.j.a(error);
                this.f178846e = 1;
                if (bVarY1.F(error2, this) == objE) {
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
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(s72.a.Error error, State state, tq.e<? super i0> eVar) {
            l lVar = t.this.new l(eVar);
            lVar.f178847f = error;
            return lVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ls72/a$g;", "action", "Ls72/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ls72/a$g;Ls72/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<s72.a.OpenGpsDialog, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f178849e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f178850f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            s72.a.OpenGpsDialog openGpsDialog = (s72.a.OpenGpsDialog) this.f178850f;
            Object objE = uq.b.e();
            int i15 = this.f178849e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<s72.a.f> bVarY1 = t.this.Y1();
                s72.a.f.OpenGpsDialog openGpsDialog2 = new s72.a.f.OpenGpsDialog(t.this.dialogMapper.b(new t72.e.Params(openGpsDialog.getDialogType(), openGpsDialog.b())));
                this.f178850f = vq.j.a(openGpsDialog);
                this.f178849e = 1;
                if (bVarY1.F(openGpsDialog2, this) == objE) {
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
        public final Object w(s72.a.OpenGpsDialog openGpsDialog, State state, tq.e<? super i0> eVar) {
            m mVar = t.this.new m(eVar);
            mVar.f178850f = openGpsDialog;
            return mVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ls72/a$d;", "<unused var>", "Ls72/b;", "Loq/i0;", "<anonymous>", "(Ls72/a$d;Ls72/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<s72.a.d, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f178852e;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f178852e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            dx.i<? extends dx.b.Business, ? extends i0> iVarA = t.this.goToApplicationDetailsSettingsUseCase.a(gz.b.a.C1792a.f78542a);
            t tVar = t.this;
            if (iVarA instanceof dx.i.Left) {
                tVar.d9(new s72.a.ShowSnackBar(tVar.labelProvider.c(a72.c.f4060t0)));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(s72.a.d dVar, State state, tq.e<? super i0> eVar) {
            return t.this.new n(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ls72/a$j;", "action", "Ls72/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ls72/a$j;Ls72/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<s72.a.ShowSnackBar, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f178854e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f178855f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            s72.a.ShowSnackBar showSnackBar = (s72.a.ShowSnackBar) this.f178855f;
            uq.b.e();
            if (this.f178854e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            t.this.y(new p50.a.DefaultWithIcon(showSnackBar.getMessageLabel(), false, null, null, 14, null));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(s72.a.ShowSnackBar showSnackBar, State state, tq.e<? super i0> eVar) {
            o oVar = t.this.new o(eVar);
            oVar.f178855f = showSnackBar;
            return oVar.J(i0.f148189a);
        }
    }

    public t(yy.a aVar, t72.f fVar, t72.e eVar, i14.b bVar, i14.d dVar, i14.a aVar2, i14.e eVar2, i14.c cVar, c72.a aVar3, ib4.c cVar2, uy.d dVar2, mx.c cVar3, i70.e eVar3, a14.m mVar, a14.n nVar) {
        this.mapper = fVar;
        this.dialogMapper = eVar;
        this.getGpsCurrentStatus = bVar;
        this.isGpsEnabledUseCase = dVar;
        this.checkGpsPermissionGrantedUseCase = aVar2;
        this.requestPreciseLocationUseCase = eVar2;
        this.getPreciseLocationUseCase = cVar;
        this.interactor = aVar3;
        this.genericDomainErrorMapper = cVar2;
        this.gpsManager = dVar2;
        this.labelProvider = cVar3;
        this.globalSnackBarManager = eVar3;
        this.goToApplicationDetailsSettingsUseCase = mVar;
        this.goToDeviceLocationSettingsUseCase = nVar;
        State state = new State(null, false, false, null, null, 31, null);
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: s72.m
            @Override // er.l
            public final Object b(Object obj) {
                return t.J9(this.f178776a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), B9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final s72.c.Data B9(State state) {
        return this.mapper.b(new t72.f.Params(state, b9(s72.a.C4588a.f178718a), new er.a() { // from class: s72.n
            @Override // er.a
            public final Object a() {
                return t.C9(this.f178777a);
            }
        }, new er.a() { // from class: s72.o
            @Override // er.a
            public final Object a() {
                return t.D9(this.f178778a);
            }
        }, b9(s72.a.e.f178723a), b9(s72.a.k.f178734a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(t tVar) {
        tVar.gpsManager.a();
        tVar.d9(s72.a.l.f178735a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(t tVar) {
        tVar.gpsManager.e();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:31:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object E9(k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) throws Throwable {
        a aVar;
        boolean z15;
        boolean zBooleanValue;
        Object objC;
        k10.c0<State> c0Var2;
        final boolean z16;
        final boolean z17;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f178806j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f178806j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC2 = aVar.f178804g;
        Object objE = uq.b.e();
        int i16 = aVar.f178806j;
        if (i16 == 0) {
            oq.u.b(objC2);
            i14.a aVar2 = this.checkGpsPermissionGrantedUseCase;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            aVar.f178801d = c0Var;
            aVar.f178806j = 1;
            objC2 = aVar2.c(c1792a, aVar);
            if (objC2 != objE) {
            }
            return objE;
        }
        if (i16 == 1) {
            c0Var = (k10.c0) aVar.f178801d;
            oq.u.b(objC2);
        } else {
            if (i16 == 2) {
                boolean z18 = aVar.f178802e;
                k10.c0<State> c0Var3 = (k10.c0) aVar.f178801d;
                oq.u.b(objC2);
                z15 = z18;
                c0Var = c0Var3;
                zBooleanValue = ((Boolean) objC2).booleanValue();
                if (!zBooleanValue) {
                    d9(new s72.a.OpenGpsDialog(u72.a.GPS_DISABLED_DIALOG, b9(s72.a.c.f178721a)));
                    return c0Var.b(new er.l() { // from class: s72.r
                        @Override // er.l
                        public final Object b(Object obj) {
                            return t.G9((State) obj);
                        }
                    });
                }
                if (zBooleanValue && z15 && c0Var.a().getUserCurrentPosition() == null) {
                    d9(new s72.a.ShowSnackBar(this.labelProvider.c(a72.c.f4023b)));
                }
                i14.c cVar = this.getPreciseLocationUseCase;
                gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
                aVar.f178801d = c0Var;
                aVar.f178802e = z15;
                aVar.f178803f = zBooleanValue;
                aVar.f178806j = 3;
                objC = cVar.c(c1792a2, aVar);
                if (objC != objE) {
                    c0Var2 = c0Var;
                    z16 = zBooleanValue;
                    objC2 = objC;
                    z17 = z15;
                }
                return objE;
            }
            if (i16 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z16 = aVar.f178803f;
            z17 = aVar.f178802e;
            c0Var2 = (k10.c0) aVar.f178801d;
            oq.u.b(objC2);
        }
        final Coordinates coordinates = (Coordinates) objC2;
        return c0Var2.b(new er.l() { // from class: s72.s
            @Override // er.l
            public final Object b(Object obj) {
                return t.H9(coordinates, z16, z17, (State) obj);
            }
        });
        boolean zBooleanValue2 = ((Boolean) objC2).booleanValue();
        if (!zBooleanValue2) {
            d9(new s72.a.OpenGpsDialog(u72.a.GPS_PERMISSION_DIALOG, b9(s72.a.d.f178722a)));
            return c0Var.b(new er.l() { // from class: s72.q
                @Override // er.l
                public final Object b(Object obj) {
                    return t.F9((State) obj);
                }
            });
        }
        i14.d dVar = this.isGpsEnabledUseCase;
        gz.b.a.C1792a c1792a3 = gz.b.a.C1792a.f78542a;
        aVar.f178801d = c0Var;
        aVar.f178802e = zBooleanValue2;
        aVar.f178806j = 2;
        Object objC3 = dVar.c(c1792a3, aVar);
        if (objC3 != objE) {
            z15 = zBooleanValue2;
            objC2 = objC3;
            zBooleanValue = ((Boolean) objC2).booleanValue();
            if (!zBooleanValue) {
                d9(new s72.a.OpenGpsDialog(u72.a.GPS_DISABLED_DIALOG, b9(s72.a.c.f178721a)));
                return c0Var.b(new er.l() { // from class: s72.r
                    @Override // er.l
                    public final Object b(Object obj) {
                        return t.G9((State) obj);
                    }
                });
            }
            if (zBooleanValue) {
                d9(new s72.a.ShowSnackBar(this.labelProvider.c(a72.c.f4023b)));
            }
            i14.c cVar2 = this.getPreciseLocationUseCase;
            gz.b.a.C1792a c1792a4 = gz.b.a.C1792a.f78542a;
            aVar.f178801d = c0Var;
            aVar.f178802e = z15;
            aVar.f178803f = zBooleanValue;
            aVar.f178806j = 3;
            objC = cVar2.c(c1792a4, aVar);
            if (objC != objE) {
                c0Var2 = c0Var;
                z16 = zBooleanValue;
                objC2 = objC;
                z17 = z15;
                final Coordinates coordinates2 = (Coordinates) objC2;
                return c0Var2.b(new er.l() { // from class: s72.s
                    @Override // er.l
                    public final Object b(Object obj) {
                        return t.H9(coordinates2, z16, z17, (State) obj);
                    }
                });
            }
        }
        return objE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State F9(State state) {
        return State.b(state, null, false, false, null, null, 27, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State G9(State state) {
        return State.b(state, null, false, false, null, null, 29, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State H9(Coordinates coordinates, boolean z15, boolean z16, State state) {
        return State.b(state, coordinates, z15, z16, coordinates, null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J9(final t tVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: s72.p
            @Override // er.l
            public final Object b(Object obj) {
                return t.K9(this.f178779a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K9(t tVar, k10.z zVar) {
        zVar.C(tVar.new g(null));
        h hVar = tVar.new h(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(s72.a.h.class), oVar, hVar);
        zVar.v(q0.c(s72.a.SetupData.class), oVar, tVar.new i(null));
        zVar.x(q0.c(s72.a.C4588a.class), oVar, tVar.new j(null));
        zVar.v(q0.c(s72.a.e.class), oVar, tVar.new k(null));
        zVar.x(q0.c(s72.a.Error.class), oVar, tVar.new l(null));
        zVar.x(q0.c(s72.a.OpenGpsDialog.class), oVar, tVar.new m(null));
        zVar.x(q0.c(s72.a.d.class), oVar, tVar.new n(null));
        zVar.x(q0.c(s72.a.ShowSnackBar.class), oVar, tVar.new o(null));
        zVar.x(q0.c(s72.a.c.class), oVar, tVar.new c(null));
        k10.k.m(zVar, mu.i.p((mu.g) tVar.getGpsCurrentStatus.a(gz.b.a.C1792a.f78542a)), null, new d(null), 2, null);
        zVar.v(q0.c(s72.a.l.class), oVar, tVar.new e(null));
        zVar.x(q0.c(s72.a.k.class), oVar, tVar.new f(null));
        return i0.f148189a;
    }

    @Override // i70.e
    public void B0() {
        this.globalSnackBarManager.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: I9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // zx.b
    public xw.b<s72.a.f> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, s72.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<s72.c.Data> getState() {
        return this.state;
    }

    @Override // i70.e
    public void y(p50.a snackBarData) {
        this.globalSnackBarManager.y(snackBarData);
    }
}
