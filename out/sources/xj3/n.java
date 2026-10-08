package xj3;

import fr.q0;
import iy.b0;
import java.time.LocalDate;
import ju.g1;
import ju.l0;
import k10.t;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tj3.VehicleHistoryPayload;
import uv0.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BK\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J9\u0010#\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020\u0002H\u0002¢\u0006\u0004\b'\u0010(R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00103\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R&\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003048\u0014X\u0094\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R \u0010@\u001a\b\u0012\u0004\u0012\u00020;0:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R \u0010%\u001a\b\u0012\u0004\u0012\u00020&0A8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E¨\u0006F"}, d2 = {"Lxj3/n;", "Ll00/g;", "Lxj3/c;", "Lxj3/b;", "Lxj3/d;", "", "Lyy/a;", "stateMachineFactory", "Lbw0/b;", "getVehicleHistoryTimelineUseCase", "Lbw0/a;", "getVehicleHistoryAbroadUseCase", "Lac4/a;", "callActionWithLoaderUseCase", "Lbk3/c;", "vehicleHistoryVerifiedMapper", "Lqj3/e;", "genericDomainErrorMapper", "Lf01/b;", "launchNativeRatingUC", "Ltj3/d;", "payload", "<init>", "(Lyy/a;Lbw0/b;Lbw0/a;Lac4/a;Lbk3/c;Lqj3/e;Lf01/b;Ltj3/d;)V", "Ldx/b;", "error", "Lck3/a;", "type", "Luv0/d;", "plate", "Luv0/v;", "vin", "Ljava/time/LocalDate;", "firstRegistrationDate", "Lxj3/b$e$c;", "n9", "(Ldx/b;Lck3/a;Ljava/lang/String;Liy/b0;Ljava/time/LocalDate;)Lxj3/b$e$c;", "state", "Lxj3/d$a;", "p9", "(Lxj3/c;)Lxj3/d$a;", "b", "Lbk3/c;", "c", "Lqj3/e;", "d", "Lf01/b;", "e", "Ltj3/d;", "f", "Lxj3/c;", "initialState", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lxj3/b$e;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<State, xj3.b> implements xj3.d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final bk3.c vehicleHistoryVerifiedMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final qj3.e genericDomainErrorMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final f01.b launchNativeRatingUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final VehicleHistoryPayload payload;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final t<State, xj3.b> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<xj3.b.e> navAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<xj3.d.Data> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f219191a;

        static {
            int[] iArr = new int[ck3.a.values().length];
            try {
                iArr[ck3.a.GET_ABROAD_DATA_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ck3.a.GET_TIMELINE_DATA_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ck3.a.CEPIK_SERVICE_NOT_AVAILABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ck3.a.ALL_ABROAD_SERVICES_NOT_AVAILABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ck3.a.CEPIK_TIMELINE_SERVICE_NOT_AVAILABLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f219191a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements er.q<uv0.d, v, LocalDate, i0> {
        b() {
        }

        public final void c(String str, b0 b0Var, LocalDate localDate) {
            n.this.d9(new xj3.b.Timeline(str, b0Var, localDate, null));
        }

        @Override // er.q
        public /* bridge */ /* synthetic */ i0 w(uv0.d dVar, v vVar, LocalDate localDate) {
            c(dVar.getValue(), vVar.getValue(), localDate);
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements er.q<uv0.d, v, LocalDate, i0> {
        c() {
        }

        public final void c(String str, b0 b0Var, LocalDate localDate) {
            n.this.d9(new xj3.b.AbroadData(str, b0Var, localDate, null));
        }

        @Override // er.q
        public /* bridge */ /* synthetic */ i0 w(uv0.d dVar, v vVar, LocalDate localDate) {
            c(dVar.getValue(), vVar.getValue(), localDate);
            return i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements mu.g<xj3.d.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f219194a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f219195b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f219196a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f219197b;

            /* JADX INFO: renamed from: xj3.n$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5860a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f219198d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f219199e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f219200f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f219202h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f219203j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f219204k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f219205l;

                public C5860a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f219198d = obj;
                    this.f219199e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, n nVar) {
                this.f219196a = hVar;
                this.f219197b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5860a c5860a;
                if (eVar instanceof C5860a) {
                    c5860a = (C5860a) eVar;
                    int i15 = c5860a.f219199e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5860a.f219199e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5860a = new C5860a(eVar);
                    }
                } else {
                    c5860a = new C5860a(eVar);
                }
                Object obj2 = c5860a.f219198d;
                Object objE = uq.b.e();
                int i16 = c5860a.f219199e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f219196a;
                    xj3.d.Data dataP9 = this.f219197b.p9((State) obj);
                    c5860a.f219200f = vq.j.a(obj);
                    c5860a.f219202h = vq.j.a(c5860a);
                    c5860a.f219203j = vq.j.a(obj);
                    c5860a.f219204k = vq.j.a(hVar);
                    c5860a.f219205l = 0;
                    c5860a.f219199e = 1;
                    if (hVar.F(dataP9, c5860a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public d(mu.g gVar, n nVar) {
            this.f219194a = gVar;
            this.f219195b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super xj3.d.Data> hVar, tq.e eVar) {
            Object objA = this.f219194a.a(new a(hVar, this.f219195b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxj3/b$b;", "<unused var>", "Lxj3/c;", "Loq/i0;", "<anonymous>", "(Lxj3/b$b;Lxj3/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<xj3.b.C5857b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f219206e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
        
            if (r5.c(r1, r4) == r0) goto L15;
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
                int r1 = r4.f219206e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r5)
                goto L43
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
                xj3.n r5 = xj3.n.this
                xw.b r5 = r5.Y1()
                xj3.b$e$b r1 = xj3.b.e.C5858b.f219136a
                r4.f219206e = r3
                java.lang.Object r5 = r5.F(r1, r4)
                if (r5 != r0) goto L32
                goto L42
            L32:
                xj3.n r5 = xj3.n.this
                f01.b r5 = xj3.n.l9(r5)
                gz.b$a$a r1 = gz.b.a.C1792a.f78542a
                r4.f219206e = r2
                java.lang.Object r5 = r5.c(r1, r4)
                if (r5 != r0) goto L43
            L42:
                return r0
            L43:
                oq.i0 r5 = oq.i0.f148189a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: xj3.n.e.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(xj3.b.C5857b c5857b, State state, tq.e<? super i0> eVar) {
            return n.this.new e(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxj3/b$d;", "<unused var>", "Lxj3/c;", "Loq/i0;", "<anonymous>", "(Lxj3/b$d;Lxj3/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<xj3.b.d, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f219208e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f219208e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<xj3.b.e> bVarY1 = n.this.Y1();
                xj3.b.e.C5859e c5859e = xj3.b.e.C5859e.f219139a;
                this.f219208e = 1;
                if (bVarY1.F(c5859e, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(xj3.b.d dVar, State state, tq.e<? super i0> eVar) {
            return n.this.new f(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxj3/b$c;", "<unused var>", "Lxj3/c;", "Loq/i0;", "<anonymous>", "(Lxj3/b$c;Lxj3/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<xj3.b.c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f219210e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f219210e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<xj3.b.e> bVarY1 = n.this.Y1();
                xj3.b.e.d dVar = xj3.b.e.d.f219138a;
                this.f219210e = 1;
                if (bVarY1.F(dVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(xj3.b.c cVar, State state, tq.e<? super i0> eVar) {
            return n.this.new g(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lxj3/b$f;", "action", "Lxj3/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lxj3/b$f;Lxj3/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<xj3.b.Timeline, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f219212e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f219213f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ac4.a f219214g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ bw0.b f219215h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ n f219216j;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f219217e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f219218f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f219219g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f219220h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f219221j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ bw0.b f219222k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ xj3.b.Timeline f219223l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ n f219224m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(bw0.b bVar, xj3.b.Timeline timeline, n nVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f219222k = bVar;
                this.f219223l = timeline;
                this.f219224m = nVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x0097, code lost:
            
                if (r2.F(r1, r11) == r0) goto L25;
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x00cb, code lost:
            
                if (r3.F(r4, r11) == r0) goto L25;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r12) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 215
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: xj3.n.h.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f219222k, this.f219223l, this.f219224m, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super i0> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(ac4.a aVar, bw0.b bVar, n nVar, tq.e<? super h> eVar) {
            super(3, eVar);
            this.f219214g = aVar;
            this.f219215h = bVar;
            this.f219216j = nVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            xj3.b.Timeline timeline = (xj3.b.Timeline) this.f219213f;
            Object objE = uq.b.e();
            int i15 = this.f219212e;
            if (i15 == 0) {
                u.b(obj);
                ac4.a aVar = this.f219214g;
                l0 l0VarB = g1.b();
                a aVar2 = new a(this.f219215h, timeline, this.f219216j, null);
                this.f219213f = vq.j.a(timeline);
                this.f219212e = 1;
                if (aVar.b(l0VarB, aVar2, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(xj3.b.Timeline timeline, State state, tq.e<? super i0> eVar) {
            h hVar = new h(this.f219214g, this.f219215h, this.f219216j, eVar);
            hVar.f219213f = timeline;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lxj3/b$a;", "action", "Lxj3/c;", "state", "Loq/i0;", "<anonymous>", "(Lxj3/b$a;Lxj3/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<xj3.b.AbroadData, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f219225e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f219226f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f219227g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ ac4.a f219228h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ bw0.a f219229j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ n f219230k;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f219231e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f219232f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f219233g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f219234h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f219235j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f219236k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f219237l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ bw0.a f219238m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ xj3.b.AbroadData f219239n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ n f219240p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ State f219241q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(bw0.a aVar, xj3.b.AbroadData abroadData, n nVar, State state, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f219238m = aVar;
                this.f219239n = abroadData;
                this.f219240p = nVar;
                this.f219241q = state;
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x009d, code lost:
            
                if (r2.F(r1, r11) == r0) goto L31;
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x00ef, code lost:
            
                if (r4.F(r3, r11) == r0) goto L31;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r12) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 257
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: xj3.n.i.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f219238m, this.f219239n, this.f219240p, this.f219241q, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super i0> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(ac4.a aVar, bw0.a aVar2, n nVar, tq.e<? super i> eVar) {
            super(3, eVar);
            this.f219228h = aVar;
            this.f219229j = aVar2;
            this.f219230k = nVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            xj3.b.AbroadData abroadData = (xj3.b.AbroadData) this.f219226f;
            State state = (State) this.f219227g;
            Object objE = uq.b.e();
            int i15 = this.f219225e;
            if (i15 == 0) {
                u.b(obj);
                ac4.a aVar = this.f219228h;
                l0 l0VarB = g1.b();
                a aVar2 = new a(this.f219229j, abroadData, this.f219230k, state, null);
                this.f219226f = vq.j.a(abroadData);
                this.f219227g = vq.j.a(state);
                this.f219225e = 1;
                if (aVar.b(l0VarB, aVar2, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(xj3.b.AbroadData abroadData, State state, tq.e<? super i0> eVar) {
            i iVar = new i(this.f219228h, this.f219229j, this.f219230k, eVar);
            iVar.f219226f = abroadData;
            iVar.f219227g = state;
            return iVar.J(i0.f148189a);
        }
    }

    public n(yy.a aVar, final bw0.b bVar, final bw0.a aVar2, final ac4.a aVar3, bk3.c cVar, qj3.e eVar, f01.b bVar2, VehicleHistoryPayload vehicleHistoryPayload) {
        this.vehicleHistoryVerifiedMapper = cVar;
        this.genericDomainErrorMapper = eVar;
        this.launchNativeRatingUC = bVar2;
        this.payload = vehicleHistoryPayload;
        State state = new State(vehicleHistoryPayload.getPlate(), vehicleHistoryPayload.getVin(), vehicleHistoryPayload.getSkipForm(), vehicleHistoryPayload.getVehicleHistory(), vehicleHistoryPayload.getFirstRegistrationDate(), null);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: xj3.m
            @Override // er.l
            public final Object b(Object obj) {
                return n.r9(this.f219179a, aVar3, bVar, aVar2, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new d(e9().getState(), this), p9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final xj3.b.e.Error n9(dx.b error, final ck3.a type, final String plate, final b0 vin, final LocalDate firstRegistrationDate) {
        return new xj3.b.e.Error(this.genericDomainErrorMapper.b(new ib4.c.Params(error, false, new er.l() { // from class: xj3.l
            @Override // er.l
            public final Object b(Object obj) {
                return n.o9(type, this, plate, vin, firstRegistrationDate, (ib4.c.b) obj);
            }
        }, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(ck3.a aVar, n nVar, String str, b0 b0Var, LocalDate localDate, ib4.c.b bVar) {
        if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
            int i15 = a.f219191a[aVar.ordinal()];
            if (i15 == 1) {
                nVar.d9(new xj3.b.AbroadData(str, b0Var, localDate, null));
            } else if (i15 == 2) {
                nVar.d9(new xj3.b.Timeline(str, b0Var, localDate, null));
            } else if (i15 != 3 && i15 != 4 && i15 != 5) {
                throw new oq.p();
            }
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final xj3.d.Data p9(State state) {
        bk3.c cVar = this.vehicleHistoryVerifiedMapper;
        er.a<i0> aVarB9 = b9(xj3.b.C5857b.f219132a);
        er.a<i0> aVarB10 = b9(xj3.b.c.f219133a);
        return cVar.b(new bk3.c.Params(state, aVarB9, new b(), new c(), b9(xj3.b.d.f219134a), aVarB10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(final n nVar, final ac4.a aVar, final bw0.b bVar, final bw0.a aVar2, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: xj3.k
            @Override // er.l
            public final Object b(Object obj) {
                return n.s9(this.f219170a, aVar, bVar, aVar2, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(n nVar, ac4.a aVar, bw0.b bVar, bw0.a aVar2, z zVar) {
        e eVar = nVar.new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(xj3.b.C5857b.class), oVar, eVar);
        zVar.x(q0.c(xj3.b.d.class), oVar, nVar.new f(null));
        zVar.x(q0.c(xj3.b.c.class), oVar, nVar.new g(null));
        zVar.x(q0.c(xj3.b.Timeline.class), oVar, new h(aVar, bVar, nVar, null));
        zVar.x(q0.c(xj3.b.AbroadData.class), oVar, new i(aVar, aVar2, nVar, null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<xj3.b.e> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, xj3.b> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<xj3.d.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: q9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(VehicleHistoryPayload vehicleHistoryPayload) {
        super.P5(vehicleHistoryPayload);
    }
}
