package gr1;

import fr.q0;
import mx.Label;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B1\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J,\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u00152\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00180\u0012H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ,\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ,\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00130\u00152\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00180\u0012H\u0082@¢\u0006\u0004\b\u001d\u0010\u001aJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R&\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030&8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R \u00102\u001a\b\u0012\u0004\u0012\u00020-0,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R \u0010\u0014\u001a\b\u0012\u0004\u0012\u000204038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108¨\u00069"}, d2 = {"Lgr1/j0;", "Ll00/g;", "Lgr1/d;", "Lgr1/a;", "Lgr1/e;", "", "Lyy/a;", "stateMachineFactory", "Lic4/b;", "nfcEdoEnableReadingUseCase", "Lac4/k;", "nfcDisableReadingUseCase", "Lac4/l;", "nfcMonitorReadingUseCase", "Lgr1/j;", "mapper", "<init>", "(Lyy/a;Lic4/b;Lac4/k;Lac4/l;Lgr1/j;)V", "Lk10/c0;", "Lgr1/d$a;", "state", "Lk10/l;", "J9", "(Lk10/c0;Ltq/e;)Ljava/lang/Object;", "Lgr1/d$b;", "I9", "(Lac4/k;Lk10/c0;Ltq/e;)Ljava/lang/Object;", "M9", "(Lk10/c0;Lic4/b;Ltq/e;)Ljava/lang/Object;", "O9", "Lgr1/j$a;", "A9", "(Lgr1/d;)Lgr1/j$a;", "b", "Lgr1/j;", "c", "Lgr1/d$a;", "initialState", "Lk10/t;", "d", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lgr1/a$d;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "Lgr1/e$a;", "f", "Lmu/p0;", "getState", "()Lmu/p0;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j0 extends l00.g<gr1.d, gr1.a> implements gr1.e, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final gr1.j mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final gr1.d.FillingForm initialState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final k10.t<gr1.d, gr1.a> stateMachine;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<gr1.a.d> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<gr1.e.a> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f76474a;

        static {
            int[] iArr = new int[gr1.c.values().length];
            try {
                iArr[gr1.c.PRESENCE_SIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[gr1.c.AUTHENTICATION_SIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[gr1.c.AUTHORIZATION_SIGN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[gr1.c.READ_ALL_DATA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[gr1.c.READ_ICAO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[gr1.c.READ_PHOTO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[gr1.c.READ_CERTIFICATE_PRESENCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[gr1.c.READ_CERTIFICATE_AUTHENTICATION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[gr1.c.READ_CERTIFICATE_AUTHORIZATION.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[gr1.c.CHANGE_AUTHENTICATION_PIN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[gr1.c.CHANGE_AUTHORIZATION_PIN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[gr1.c.RESET_AUTHENTICATION_PIN.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[gr1.c.RESET_AUTHORIZATION_PIN.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f76474a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f76475d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f76476e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f76478g;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f76476e = obj;
            this.f76478g |= PKIFailureInfo.systemUnavail;
            return j0.this.J9(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f76479d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f76480e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f76481f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f76483h;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f76481f = obj;
            this.f76483h |= PKIFailureInfo.systemUnavail;
            return j0.this.I9(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f76484d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f76485e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f76486f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f76487g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f76488h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f76490k;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f76488h = obj;
            this.f76490k |= PKIFailureInfo.systemUnavail;
            return j0.this.M9(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f76491d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f76492e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f76493f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f76495h;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f76493f = obj;
            this.f76495h |= PKIFailureInfo.systemUnavail;
            return j0.this.O9(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class f implements mu.g<gr1.e.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f76496a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j0 f76497b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f76498a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ j0 f76499b;

            /* JADX INFO: renamed from: gr1.j0$f$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1729a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f76500d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f76501e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f76502f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f76504h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f76505j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f76506k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f76507l;

                public C1729a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f76500d = obj;
                    this.f76501e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, j0 j0Var) {
                this.f76498a = hVar;
                this.f76499b = j0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1729a c1729a;
                if (eVar instanceof C1729a) {
                    c1729a = (C1729a) eVar;
                    int i15 = c1729a.f76501e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1729a.f76501e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1729a = new C1729a(eVar);
                    }
                } else {
                    c1729a = new C1729a(eVar);
                }
                Object obj2 = c1729a.f76500d;
                Object objE = uq.b.e();
                int i16 = c1729a.f76501e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f76498a;
                    gr1.e.a aVarB = this.f76499b.mapper.b(this.f76499b.A9((gr1.d) obj));
                    c1729a.f76502f = vq.j.a(obj);
                    c1729a.f76504h = vq.j.a(c1729a);
                    c1729a.f76505j = vq.j.a(obj);
                    c1729a.f76506k = vq.j.a(hVar);
                    c1729a.f76507l = 0;
                    c1729a.f76501e = 1;
                    if (hVar.F(aVarB, c1729a) == objE) {
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

        public f(mu.g gVar, j0 j0Var) {
            this.f76496a = gVar;
            this.f76497b = j0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super gr1.e.a> hVar, tq.e eVar) {
            Object objA = this.f76496a.a(new a(hVar, this.f76497b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lgr1/a$a;", "action", "Lk10/c0;", "Lgr1/d$a;", "state", "Lk10/l;", "Lgr1/d;", "<anonymous>", "(Lgr1/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<gr1.a.C1725a, k10.c0<gr1.d.FillingForm>, tq.e<? super k10.l<? extends gr1.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f76508e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f76509f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f76509f;
            Object objE = uq.b.e();
            int i15 = this.f76508e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            j0 j0Var = j0.this;
            this.f76509f = vq.j.a(c0Var);
            this.f76508e = 1;
            Object objJ9 = j0Var.J9(c0Var, this);
            return objJ9 == objE ? objE : objJ9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(gr1.a.C1725a c1725a, k10.c0<gr1.d.FillingForm> c0Var, tq.e<? super k10.l<? extends gr1.d>> eVar) {
            g gVar = j0.this.new g(eVar);
            gVar.f76509f = c0Var;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lgr1/a$e;", "action", "Lk10/c0;", "Lgr1/d$a;", "state", "Lk10/l;", "Lgr1/d;", "<anonymous>", "(Lgr1/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<gr1.a.e, k10.c0<gr1.d.FillingForm>, tq.e<? super k10.l<? extends gr1.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f76511e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f76512f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ ic4.b f76514h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(ic4.b bVar, tq.e<? super h> eVar) {
            super(3, eVar);
            this.f76514h = bVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f76512f;
            Object objE = uq.b.e();
            int i15 = this.f76511e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            j0 j0Var = j0.this;
            ic4.b bVar = this.f76514h;
            this.f76512f = vq.j.a(c0Var);
            this.f76511e = 1;
            Object objM9 = j0Var.M9(c0Var, bVar, this);
            return objM9 == objE ? objE : objM9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(gr1.a.e eVar, k10.c0<gr1.d.FillingForm> c0Var, tq.e<? super k10.l<? extends gr1.d>> eVar2) {
            h hVar = j0.this.new h(this.f76514h, eVar2);
            hVar.f76512f = c0Var;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lgr1/a$c;", "action", "Lk10/c0;", "Lgr1/d$a;", "state", "Lk10/l;", "Lgr1/d;", "<anonymous>", "(Lgr1/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<gr1.a.FormDataChanged, k10.c0<gr1.d.FillingForm>, tq.e<? super k10.l<? extends gr1.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f76515e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f76516f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f76517g;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gr1.d.FillingForm O(k10.c0 c0Var, gr1.a.FormDataChanged formDataChanged, gr1.d.FillingForm fillingForm) {
            return gr1.d.FillingForm.c((gr1.d.FillingForm) c0Var.a(), false, formDataChanged.getFormData(), 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final gr1.a.FormDataChanged formDataChanged = (gr1.a.FormDataChanged) this.f76516f;
            final k10.c0 c0Var = (k10.c0) this.f76517g;
            uq.b.e();
            if (this.f76515e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: gr1.k0
                @Override // er.l
                public final Object b(Object obj2) {
                    return j0.i.O(c0Var, formDataChanged, (d.FillingForm) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(gr1.a.FormDataChanged formDataChanged, k10.c0<gr1.d.FillingForm> c0Var, tq.e<? super k10.l<? extends gr1.d>> eVar) {
            i iVar = new i(eVar);
            iVar.f76516f = formDataChanged;
            iVar.f76517g = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lgr1/a$b;", "action", "Lk10/c0;", "Lgr1/d$a;", "state", "Lk10/l;", "Lgr1/d;", "<anonymous>", "(Lgr1/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<gr1.a.BottomSheetVisibilityChanged, k10.c0<gr1.d.FillingForm>, tq.e<? super k10.l<? extends gr1.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f76518e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f76519f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f76520g;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gr1.d.FillingForm O(k10.c0 c0Var, gr1.a.BottomSheetVisibilityChanged bottomSheetVisibilityChanged, gr1.d.FillingForm fillingForm) {
            return gr1.d.FillingForm.c((gr1.d.FillingForm) c0Var.a(), bottomSheetVisibilityChanged.getVisible(), null, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final gr1.a.BottomSheetVisibilityChanged bottomSheetVisibilityChanged = (gr1.a.BottomSheetVisibilityChanged) this.f76519f;
            final k10.c0 c0Var = (k10.c0) this.f76520g;
            uq.b.e();
            if (this.f76518e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: gr1.l0
                @Override // er.l
                public final Object b(Object obj2) {
                    return j0.j.O(c0Var, bottomSheetVisibilityChanged, (d.FillingForm) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(gr1.a.BottomSheetVisibilityChanged bottomSheetVisibilityChanged, k10.c0<gr1.d.FillingForm> c0Var, tq.e<? super k10.l<? extends gr1.d>> eVar) {
            j jVar = new j(eVar);
            jVar.f76519f = bottomSheetVisibilityChanged;
            jVar.f76520g = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcy/c;", "value", "Lk10/c0;", "Lgr1/d$b;", "state", "Lk10/l;", "Lgr1/d;", "<anonymous>", "(Lcy/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<cy.c, k10.c0<gr1.d.NfcScanning>, tq.e<? super k10.l<? extends gr1.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f76521e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f76522f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f76523g;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gr1.d.NfcScanning O(k10.c0 c0Var, cy.c cVar, gr1.d.NfcScanning nfcScanning) {
            return gr1.d.NfcScanning.c((gr1.d.NfcScanning) c0Var.a(), null, pq.v.L0(((gr1.d.NfcScanning) c0Var.a()).d(), pq.v.e(cVar)), 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final cy.c cVar = (cy.c) this.f76522f;
            final k10.c0 c0Var = (k10.c0) this.f76523g;
            uq.b.e();
            if (this.f76521e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: gr1.m0
                @Override // er.l
                public final Object b(Object obj2) {
                    return j0.k.O(c0Var, cVar, (d.NfcScanning) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(cy.c cVar, k10.c0<gr1.d.NfcScanning> c0Var, tq.e<? super k10.l<? extends gr1.d>> eVar) {
            k kVar = new k(eVar);
            kVar.f76522f = cVar;
            kVar.f76523g = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lgr1/a$a;", "action", "Lk10/c0;", "Lgr1/d$b;", "state", "Lk10/l;", "Lgr1/d;", "<anonymous>", "(Lgr1/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<gr1.a.C1725a, k10.c0<gr1.d.NfcScanning>, tq.e<? super k10.l<? extends gr1.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f76524e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f76525f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ ac4.k f76527h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(ac4.k kVar, tq.e<? super l> eVar) {
            super(3, eVar);
            this.f76527h = kVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f76525f;
            Object objE = uq.b.e();
            int i15 = this.f76524e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            j0 j0Var = j0.this;
            ac4.k kVar = this.f76527h;
            this.f76525f = vq.j.a(c0Var);
            this.f76524e = 1;
            Object objI9 = j0Var.I9(kVar, c0Var, this);
            return objI9 == objE ? objE : objI9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(gr1.a.C1725a c1725a, k10.c0<gr1.d.NfcScanning> c0Var, tq.e<? super k10.l<? extends gr1.d>> eVar) {
            l lVar = j0.this.new l(this.f76527h, eVar);
            lVar.f76525f = c0Var;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lgr1/a$f;", "action", "Lk10/c0;", "Lgr1/d$b;", "state", "Lk10/l;", "Lgr1/d;", "<anonymous>", "(Lgr1/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<gr1.a.f, k10.c0<gr1.d.NfcScanning>, tq.e<? super k10.l<? extends gr1.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f76528e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f76529f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ ac4.k f76531h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(ac4.k kVar, tq.e<? super m> eVar) {
            super(3, eVar);
            this.f76531h = kVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f76529f;
            Object objE = uq.b.e();
            int i15 = this.f76528e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            j0 j0Var = j0.this;
            ac4.k kVar = this.f76531h;
            this.f76529f = vq.j.a(c0Var);
            this.f76528e = 1;
            Object objO9 = j0Var.O9(kVar, c0Var, this);
            return objO9 == objE ? objE : objO9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(gr1.a.f fVar, k10.c0<gr1.d.NfcScanning> c0Var, tq.e<? super k10.l<? extends gr1.d>> eVar) {
            m mVar = j0.this.new m(this.f76531h, eVar);
            mVar.f76529f = c0Var;
            return mVar.J(oq.i0.f148189a);
        }
    }

    public j0(yy.a aVar, final ic4.b bVar, final ac4.k kVar, final ac4.l lVar, gr1.j jVar) {
        this.mapper = jVar;
        gr1.d.FillingForm fillingForm = new gr1.d.FillingForm(false, new FormData(gr1.c.READ_ALL_DATA, "", "", "", "", ""));
        this.initialState = fillingForm;
        this.stateMachine = aVar.a(fillingForm, new er.l() { // from class: gr1.v
            @Override // er.l
            public final Object b(Object obj) {
                return j0.R9(this.f76559a, bVar, lVar, kVar, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new f(e9().getState(), this), jVar.b(A9(fillingForm)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gr1.j.Params A9(final gr1.d state) {
        return new gr1.j.Params(state, b9(gr1.a.C1725a.f76375a), new er.l() { // from class: gr1.a0
            @Override // er.l
            public final Object b(Object obj) {
                return j0.B9(this.f76381a, state, (String) obj);
            }
        }, new er.l() { // from class: gr1.b0
            @Override // er.l
            public final Object b(Object obj) {
                return j0.C9(this.f76389a, state, (String) obj);
            }
        }, new er.l() { // from class: gr1.c0
            @Override // er.l
            public final Object b(Object obj) {
                return j0.D9(this.f76408a, state, (String) obj);
            }
        }, new er.l() { // from class: gr1.d0
            @Override // er.l
            public final Object b(Object obj) {
                return j0.E9(this.f76415a, state, (String) obj);
            }
        }, new er.l() { // from class: gr1.e0
            @Override // er.l
            public final Object b(Object obj) {
                return j0.F9(this.f76441a, state, (String) obj);
            }
        }, b9(gr1.a.e.f76379a), b9(gr1.a.f.f76380a), new er.l() { // from class: gr1.f0
            @Override // er.l
            public final Object b(Object obj) {
                return j0.G9(this.f76444a, state, (Label) obj);
            }
        }, new er.l() { // from class: gr1.g0
            @Override // er.l
            public final Object b(Object obj) {
                return j0.H9(this.f76448a, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B9(j0 j0Var, gr1.d dVar, String str) {
        j0Var.d9(new gr1.a.FormDataChanged(FormData.b(dVar.getFormData(), null, str, null, null, null, null, 61, null)));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C9(j0 j0Var, gr1.d dVar, String str) {
        j0Var.d9(new gr1.a.FormDataChanged(FormData.b(dVar.getFormData(), null, null, str, null, null, null, 59, null)));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D9(j0 j0Var, gr1.d dVar, String str) {
        j0Var.d9(new gr1.a.FormDataChanged(FormData.b(dVar.getFormData(), null, null, null, str, null, null, 55, null)));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E9(j0 j0Var, gr1.d dVar, String str) {
        j0Var.d9(new gr1.a.FormDataChanged(FormData.b(dVar.getFormData(), null, null, null, null, str, null, 47, null)));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F9(j0 j0Var, gr1.d dVar, String str) {
        j0Var.d9(new gr1.a.FormDataChanged(FormData.b(dVar.getFormData(), null, null, null, null, null, str, 31, null)));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G9(j0 j0Var, gr1.d dVar, Label label) {
        gr1.c cVarA = gr1.c.INSTANCE.a(label);
        if (cVarA != null) {
            j0Var.d9(new gr1.a.FormDataChanged(FormData.b(dVar.getFormData(), cVarA, null, null, null, null, null, 62, null)));
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H9(j0 j0Var, boolean z15) {
        j0Var.d9(new gr1.a.BottomSheetVisibilityChanged(z15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object I9(ac4.k kVar, k10.c0<gr1.d.NfcScanning> c0Var, tq.e<? super k10.l<gr1.d.FillingForm>> eVar) throws Throwable {
        c cVar;
        final k10.c0<gr1.d.NfcScanning> c0Var2;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f76483h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f76483h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object obj = cVar.f76481f;
        Object objE = uq.b.e();
        int i16 = cVar.f76483h;
        if (i16 == 0) {
            oq.u.b(obj);
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            cVar.f76479d = vq.j.a(kVar);
            cVar.f76480e = c0Var;
            cVar.f76483h = 1;
            if (kVar.c(c1792a, cVar) != objE) {
            }
            return objE;
        }
        if (i16 == 1) {
            c0Var = (k10.c0) cVar.f76480e;
            kVar = (ac4.k) cVar.f76479d;
            oq.u.b(obj);
        } else {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0Var2 = (k10.c0) cVar.f76480e;
            oq.u.b(obj);
        }
        return c0Var2.d(new er.l() { // from class: gr1.x
            @Override // er.l
            public final Object b(Object obj2) {
                return j0.L9(c0Var2, (d.NfcScanning) obj2);
            }
        });
        xw.b<gr1.a.d> bVarY1 = Y1();
        gr1.a.d.C1726a c1726a = gr1.a.d.C1726a.f76378a;
        cVar.f76479d = vq.j.a(kVar);
        cVar.f76480e = c0Var;
        cVar.f76483h = 2;
        if (bVarY1.F(c1726a, cVar) != objE) {
            c0Var2 = c0Var;
            return c0Var2.d(new er.l() { // from class: gr1.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return j0.L9(c0Var2, (d.NfcScanning) obj2);
                }
            });
        }
        return objE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object J9(final k10.c0<gr1.d.FillingForm> c0Var, tq.e<? super k10.l<gr1.d.FillingForm>> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f76478g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f76478g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object obj = bVar.f76476e;
        Object objE = uq.b.e();
        int i16 = bVar.f76478g;
        if (i16 == 0) {
            oq.u.b(obj);
            if (c0Var.a().getBottomSheetVisible()) {
                return c0Var.d(new er.l() { // from class: gr1.y
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return j0.K9(c0Var, (d.FillingForm) obj2);
                    }
                });
            }
            xw.b<gr1.a.d> bVarY1 = Y1();
            gr1.a.d.C1726a c1726a = gr1.a.d.C1726a.f76378a;
            bVar.f76475d = c0Var;
            bVar.f76478g = 1;
            if (bVarY1.F(c1726a, bVar) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0Var = (k10.c0) bVar.f76475d;
            oq.u.b(obj);
        }
        return c0Var.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gr1.d.FillingForm K9(k10.c0 c0Var, gr1.d.FillingForm fillingForm) {
        return gr1.d.FillingForm.c((gr1.d.FillingForm) c0Var.a(), false, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gr1.d.FillingForm L9(k10.c0 c0Var, gr1.d.NfcScanning nfcScanning) {
        return new gr1.d.FillingForm(false, ((gr1.d.NfcScanning) c0Var.a()).getFormData());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:38:0x018e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x018f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object M9(k10.c0<gr1.d.FillingForm> c0Var, ic4.b bVar, tq.e<? super k10.l<? extends gr1.d>> eVar) throws Throwable {
        d dVar;
        Object presenceSign;
        Object authenticationSign;
        Object authorizationSign;
        Object readAllData;
        Object changeAuthenticationPin;
        final k10.c0<gr1.d.FillingForm> c0Var2;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i15 = dVar.f76490k;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f76490k = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object objC = dVar.f76488h;
        Object objE = uq.b.e();
        int i16 = dVar.f76490k;
        if (i16 == 0) {
            oq.u.b(objC);
            FormData formData = c0Var.a().getFormData();
            switch (a.f76474a[formData.getMode().ordinal()]) {
                case 1:
                    presenceSign = new cy.b.a.PresenceSign(formData.getDataToSign(), formData.getCan(), false, 4, null);
                    changeAuthenticationPin = presenceSign;
                    dVar.f76484d = c0Var;
                    dVar.f76485e = vq.j.a(bVar);
                    dVar.f76486f = vq.j.a(formData);
                    dVar.f76487g = vq.j.a(changeAuthenticationPin);
                    dVar.f76490k = 1;
                    objC = bVar.c(changeAuthenticationPin, dVar);
                    if (objC == objE) {
                        return objE;
                    }
                    c0Var2 = c0Var;
                    break;
                case 2:
                    authenticationSign = new cy.b.a.AuthenticationSign(formData.getDataToSign(), formData.getCan(), formData.getPin(), false, 8, null);
                    changeAuthenticationPin = authenticationSign;
                    dVar.f76484d = c0Var;
                    dVar.f76485e = vq.j.a(bVar);
                    dVar.f76486f = vq.j.a(formData);
                    dVar.f76487g = vq.j.a(changeAuthenticationPin);
                    dVar.f76490k = 1;
                    objC = bVar.c(changeAuthenticationPin, dVar);
                    if (objC == objE) {
                        return objE;
                    }
                    c0Var2 = c0Var;
                    break;
                case 3:
                    authorizationSign = new cy.b.a.AuthorizationSign(formData.getDataToSign(), formData.getCan(), formData.getPin(), false, 8, null);
                    changeAuthenticationPin = authorizationSign;
                    dVar.f76484d = c0Var;
                    dVar.f76485e = vq.j.a(bVar);
                    dVar.f76486f = vq.j.a(formData);
                    dVar.f76487g = vq.j.a(changeAuthenticationPin);
                    dVar.f76490k = 1;
                    objC = bVar.c(changeAuthenticationPin, dVar);
                    if (objC == objE) {
                        return objE;
                    }
                    c0Var2 = c0Var;
                    break;
                case 4:
                    readAllData = new cy.b.a.ReadAllData(formData.getCan(), false, 2, null);
                    changeAuthenticationPin = readAllData;
                    dVar.f76484d = c0Var;
                    dVar.f76485e = vq.j.a(bVar);
                    dVar.f76486f = vq.j.a(formData);
                    dVar.f76487g = vq.j.a(changeAuthenticationPin);
                    dVar.f76490k = 1;
                    objC = bVar.c(changeAuthenticationPin, dVar);
                    if (objC == objE) {
                        return objE;
                    }
                    c0Var2 = c0Var;
                    break;
                case 5:
                    readAllData = new cy.b.a.ReadICAO(formData.getCan(), false, 2, null);
                    changeAuthenticationPin = readAllData;
                    dVar.f76484d = c0Var;
                    dVar.f76485e = vq.j.a(bVar);
                    dVar.f76486f = vq.j.a(formData);
                    dVar.f76487g = vq.j.a(changeAuthenticationPin);
                    dVar.f76490k = 1;
                    objC = bVar.c(changeAuthenticationPin, dVar);
                    if (objC == objE) {
                        return objE;
                    }
                    c0Var2 = c0Var;
                    break;
                case 6:
                    readAllData = new cy.b.a.ReadPhoto(formData.getCan(), false, 2, null);
                    changeAuthenticationPin = readAllData;
                    dVar.f76484d = c0Var;
                    dVar.f76485e = vq.j.a(bVar);
                    dVar.f76486f = vq.j.a(formData);
                    dVar.f76487g = vq.j.a(changeAuthenticationPin);
                    dVar.f76490k = 1;
                    objC = bVar.c(changeAuthenticationPin, dVar);
                    if (objC == objE) {
                        return objE;
                    }
                    c0Var2 = c0Var;
                    break;
                case 7:
                    presenceSign = new cy.b.a.ReadCertificate(formData.getCan(), cy.b.a.c.PRESENCE, false, 4, null);
                    changeAuthenticationPin = presenceSign;
                    dVar.f76484d = c0Var;
                    dVar.f76485e = vq.j.a(bVar);
                    dVar.f76486f = vq.j.a(formData);
                    dVar.f76487g = vq.j.a(changeAuthenticationPin);
                    dVar.f76490k = 1;
                    objC = bVar.c(changeAuthenticationPin, dVar);
                    if (objC == objE) {
                        return objE;
                    }
                    c0Var2 = c0Var;
                    break;
                case 8:
                    authenticationSign = new cy.b.a.ReadCertificate(formData.getCan(), cy.b.a.c.AUTHENTICATION, false, 4, null);
                    changeAuthenticationPin = authenticationSign;
                    dVar.f76484d = c0Var;
                    dVar.f76485e = vq.j.a(bVar);
                    dVar.f76486f = vq.j.a(formData);
                    dVar.f76487g = vq.j.a(changeAuthenticationPin);
                    dVar.f76490k = 1;
                    objC = bVar.c(changeAuthenticationPin, dVar);
                    if (objC == objE) {
                        return objE;
                    }
                    c0Var2 = c0Var;
                    break;
                case 9:
                    authorizationSign = new cy.b.a.ReadCertificate(formData.getCan(), cy.b.a.c.AUTHORIZATION, false, 4, null);
                    changeAuthenticationPin = authorizationSign;
                    dVar.f76484d = c0Var;
                    dVar.f76485e = vq.j.a(bVar);
                    dVar.f76486f = vq.j.a(formData);
                    dVar.f76487g = vq.j.a(changeAuthenticationPin);
                    dVar.f76490k = 1;
                    objC = bVar.c(changeAuthenticationPin, dVar);
                    if (objC == objE) {
                        return objE;
                    }
                    c0Var2 = c0Var;
                    break;
                case 10:
                    changeAuthenticationPin = new cy.b.a.ChangeAuthenticationPin(formData.getPin(), formData.getNewPin(), formData.getCan(), false, 8, null);
                    dVar.f76484d = c0Var;
                    dVar.f76485e = vq.j.a(bVar);
                    dVar.f76486f = vq.j.a(formData);
                    dVar.f76487g = vq.j.a(changeAuthenticationPin);
                    dVar.f76490k = 1;
                    objC = bVar.c(changeAuthenticationPin, dVar);
                    if (objC == objE) {
                        return objE;
                    }
                    c0Var2 = c0Var;
                    break;
                case 11:
                    changeAuthenticationPin = new cy.b.a.ChangeAuthorizationPin(formData.getPin(), formData.getNewPin(), formData.getCan(), false, 8, null);
                    dVar.f76484d = c0Var;
                    dVar.f76485e = vq.j.a(bVar);
                    dVar.f76486f = vq.j.a(formData);
                    dVar.f76487g = vq.j.a(changeAuthenticationPin);
                    dVar.f76490k = 1;
                    objC = bVar.c(changeAuthenticationPin, dVar);
                    if (objC == objE) {
                        return objE;
                    }
                    c0Var2 = c0Var;
                    break;
                case 12:
                    changeAuthenticationPin = new cy.b.a.ResetAuthenticationPin(formData.getPuk(), formData.getNewPin(), formData.getCan(), false, 8, null);
                    dVar.f76484d = c0Var;
                    dVar.f76485e = vq.j.a(bVar);
                    dVar.f76486f = vq.j.a(formData);
                    dVar.f76487g = vq.j.a(changeAuthenticationPin);
                    dVar.f76490k = 1;
                    objC = bVar.c(changeAuthenticationPin, dVar);
                    if (objC == objE) {
                        return objE;
                    }
                    c0Var2 = c0Var;
                    break;
                case 13:
                    changeAuthenticationPin = new cy.b.a.ResetAuthorizationPin(formData.getPuk(), formData.getNewPin(), formData.getCan(), false, 8, null);
                    dVar.f76484d = c0Var;
                    dVar.f76485e = vq.j.a(bVar);
                    dVar.f76486f = vq.j.a(formData);
                    dVar.f76487g = vq.j.a(changeAuthenticationPin);
                    dVar.f76490k = 1;
                    objC = bVar.c(changeAuthenticationPin, dVar);
                    if (objC == objE) {
                        return objE;
                    }
                    c0Var2 = c0Var;
                    break;
                default:
                    throw new oq.p();
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0Var2 = (k10.c0) dVar.f76484d;
            oq.u.b(objC);
        }
        dx.i iVar = (dx.i) objC;
        if (iVar instanceof dx.i.Left) {
            return c0Var2.c();
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new oq.p();
        }
        return c0Var2.d(new er.l() { // from class: gr1.w
            @Override // er.l
            public final Object b(Object obj) {
                return j0.N9(c0Var2, (d.FillingForm) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gr1.d.NfcScanning N9(k10.c0 c0Var, gr1.d.FillingForm fillingForm) {
        return new gr1.d.NfcScanning(((gr1.d.FillingForm) c0Var.a()).getFormData(), pq.v.n());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object O9(ac4.k kVar, final k10.c0<gr1.d.NfcScanning> c0Var, tq.e<? super k10.l<gr1.d.FillingForm>> eVar) throws Throwable {
        e eVar2;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f76495h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f76495h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object obj = eVar2.f76493f;
        Object objE = uq.b.e();
        int i16 = eVar2.f76495h;
        if (i16 == 0) {
            oq.u.b(obj);
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            eVar2.f76491d = vq.j.a(kVar);
            eVar2.f76492e = c0Var;
            eVar2.f76495h = 1;
            if (kVar.c(c1792a, eVar2) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0Var = (k10.c0) eVar2.f76492e;
            oq.u.b(obj);
        }
        return c0Var.d(new er.l() { // from class: gr1.z
            @Override // er.l
            public final Object b(Object obj2) {
                return j0.P9(c0Var, (d.NfcScanning) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gr1.d.FillingForm P9(k10.c0 c0Var, gr1.d.NfcScanning nfcScanning) {
        return new gr1.d.FillingForm(false, ((gr1.d.NfcScanning) c0Var.a()).getFormData());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R9(final j0 j0Var, final ic4.b bVar, final ac4.l lVar, final ac4.k kVar, k10.v vVar) {
        vVar.c(q0.c(gr1.d.FillingForm.class), new er.l() { // from class: gr1.h0
            @Override // er.l
            public final Object b(Object obj) {
                return j0.S9(this.f76450a, bVar, (k10.z) obj);
            }
        });
        vVar.c(q0.c(gr1.d.NfcScanning.class), new er.l() { // from class: gr1.i0
            @Override // er.l
            public final Object b(Object obj) {
                return j0.T9(lVar, j0Var, kVar, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S9(j0 j0Var, ic4.b bVar, k10.z zVar) {
        g gVar = j0Var.new g(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(gr1.a.C1725a.class), oVar, gVar);
        zVar.v(q0.c(gr1.a.e.class), oVar, j0Var.new h(bVar, null));
        zVar.v(q0.c(gr1.a.FormDataChanged.class), oVar, new i(null));
        zVar.v(q0.c(gr1.a.BottomSheetVisibilityChanged.class), oVar, new j(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T9(ac4.l lVar, j0 j0Var, ac4.k kVar, k10.z zVar) {
        k10.k.m(zVar, (mu.g) lVar.a(gz.b.a.C1792a.f78542a), null, new k(null), 2, null);
        l lVar2 = j0Var.new l(kVar, null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(gr1.a.C1725a.class), oVar, lVar2);
        zVar.v(q0.c(gr1.a.f.class), oVar, j0Var.new m(kVar, null));
        return oq.i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: Q9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(oq.i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // zx.b
    public xw.b<gr1.a.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<gr1.d, gr1.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<gr1.e.a> getState() {
        return this.state;
    }
}
