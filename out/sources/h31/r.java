package h31;

import fr.q0;
import java.time.LocalDate;
import java.time.ZoneOffset;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import wv0.RequestedInsuranceData;
import wv0.VehicleInsuranceVerificationData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 D2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001EBI\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R \u00108\u001a\b\u0012\u0004\u0012\u000203028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R&\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003098\u0014X\u0094\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0?8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C¨\u0006F"}, d2 = {"Lh31/r;", "Ll00/g;", "Lh31/d;", "Lh31/c;", "Lh31/e;", "", "Lyy/a;", "stateMachineFactory", "Li31/c;", "mapper", "Lcw0/a;", "checkVehicleInsuranceStatusUC", "Lez/a;", "timeProvider", "Lx21/d;", "validateRequestedInsuranceDataUC", "Lac4/a;", "callActionWithLoaderUC", "Lib4/c;", "genericDomainErrorMapper", "Lhb4/d;", "errorVMSFactory", "<init>", "(Lyy/a;Li31/c;Lcw0/a;Lez/a;Lx21/d;Lac4/a;Lib4/c;Lhb4/d;)V", "Lh31/d$b$a;", "Lwv0/c$a;", "E9", "(Lh31/d$b$a;)Lwv0/c$a;", "state", "Lh31/e$a;", "w9", "(Lh31/d;)Lh31/e$a;", "b", "Li31/c;", "c", "Lcw0/a;", "d", "Lez/a;", "e", "Lx21/d;", "f", "Lac4/a;", "g", "Lib4/c;", "h", "Lhb4/d;", "Lh31/d$d;", "j", "Lh31/d$d;", "initialState", "Lxw/b;", "Lh31/c$a;", "k", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "l", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "m", "Lmu/p0;", "getState", "()Lmu/p0;", "n", "a", "checkvehicleinsurance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r extends l00.g<h31.d, h31.c> implements h31.e, zx.d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final a f80427n = new a(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f80428p = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i31.c mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final cw0.a checkVehicleInsuranceStatusUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ez.a timeProvider;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final x21.d validateRequestedInsuranceDataUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final h31.d.Screen initialState;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final xw.b<h31.c.a> navAction;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final k10.t<h31.d, h31.c> stateMachine;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final p0<h31.e.a> state;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lh31/r$a;", "", "<init>", "()V", "", "ALLOWED_YEARS_RANGE", "J", "checkvehicleinsurance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f80440a;

        static {
            int[] iArr = new int[w21.a.values().length];
            try {
                iArr[w21.a.PLATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w21.a.VIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[w21.a.INSURANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f80440a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements mu.g<h31.e.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f80441a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f80442b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f80443a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ r f80444b;

            /* JADX INFO: renamed from: h31.r$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1836a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f80445d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f80446e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f80447f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f80449h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f80450j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f80451k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f80452l;

                public C1836a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f80445d = obj;
                    this.f80446e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, r rVar) {
                this.f80443a = hVar;
                this.f80444b = rVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1836a c1836a;
                if (eVar instanceof C1836a) {
                    c1836a = (C1836a) eVar;
                    int i15 = c1836a.f80446e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1836a.f80446e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1836a = new C1836a(eVar);
                    }
                } else {
                    c1836a = new C1836a(eVar);
                }
                Object obj2 = c1836a.f80445d;
                Object objE = uq.b.e();
                int i16 = c1836a.f80446e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f80443a;
                    h31.e.a aVarW9 = this.f80444b.w9((h31.d) obj);
                    c1836a.f80447f = vq.j.a(obj);
                    c1836a.f80449h = vq.j.a(c1836a);
                    c1836a.f80450j = vq.j.a(obj);
                    c1836a.f80451k = vq.j.a(hVar);
                    c1836a.f80452l = 0;
                    c1836a.f80446e = 1;
                    if (hVar.F(aVarW9, c1836a) == objE) {
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
            this.f80441a = gVar;
            this.f80442b = rVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super h31.e.a> hVar, tq.e eVar) {
            Object objA = this.f80441a.a(new a(hVar, this.f80442b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lh31/c$h;", "action", "Lk10/c0;", "Lh31/d$d;", "state", "Lk10/l;", "Lh31/d;", "<anonymous>", "(Lh31/c$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<h31.c.OnTypeChanged, k10.c0<h31.d.Screen>, tq.e<? super k10.l<? extends h31.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f80453e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f80454f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f80455g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h31.d.Screen O(h31.c.OnTypeChanged onTypeChanged, h31.d.Screen screen) {
            return screen.a(h31.d.Data.b(screen.getData(), new h31.d.Data.Input(onTypeChanged.getType(), null, null, 6, null), null, false, 6, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final h31.c.OnTypeChanged onTypeChanged = (h31.c.OnTypeChanged) this.f80454f;
            k10.c0 c0Var = (k10.c0) this.f80455g;
            uq.b.e();
            if (this.f80453e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: h31.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.d.O(onTypeChanged, (d.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(h31.c.OnTypeChanged onTypeChanged, k10.c0<h31.d.Screen> c0Var, tq.e<? super k10.l<? extends h31.d>> eVar) {
            d dVar = new d(eVar);
            dVar.f80454f = onTypeChanged;
            dVar.f80455g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lh31/c$e;", "action", "Lk10/c0;", "Lh31/d$d;", "state", "Lk10/l;", "Lh31/d;", "<anonymous>", "(Lh31/c$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<h31.c.OnInputChanged, k10.c0<h31.d.Screen>, tq.e<? super k10.l<? extends h31.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f80456e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f80457f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f80458g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h31.d.Screen O(h31.c.OnInputChanged onInputChanged, h31.d.Screen screen) {
            return screen.a(h31.d.Data.b(screen.getData(), h31.d.Data.Input.b(screen.getData().getInput(), null, onInputChanged.getValue(), hz.b.d.f86848c, 1, null), null, false, 6, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final h31.c.OnInputChanged onInputChanged = (h31.c.OnInputChanged) this.f80457f;
            k10.c0 c0Var = (k10.c0) this.f80458g;
            uq.b.e();
            if (this.f80456e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: h31.t
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.e.O(onInputChanged, (d.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(h31.c.OnInputChanged onInputChanged, k10.c0<h31.d.Screen> c0Var, tq.e<? super k10.l<? extends h31.d>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f80457f = onInputChanged;
            eVar2.f80458g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lh31/c$d;", "<unused var>", "Lh31/d$d;", "state", "Loq/i0;", "<anonymous>", "(Lh31/c$d;Lh31/d$d;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<h31.c.d, h31.d.Screen, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f80459e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f80460f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f80461g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(r rVar, LocalDate localDate) {
            rVar.d9(new h31.c.OnDateChanged(new fz.b.OffsetDateTime(localDate.atStartOfDay(ZoneOffset.UTC).toOffsetDateTime())));
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            h31.d.Screen screen = (h31.d.Screen) this.f80461g;
            Object objE = uq.b.e();
            int i15 = this.f80460f;
            if (i15 == 0) {
                oq.u.b(obj);
                LocalDate localDateC = r.this.timeProvider.c();
                r rVar = r.this;
                fz.b.OffsetDateTime date = screen.getData().getDate();
                LocalDate localDateOf = LocalDate.of(date.getDate().getYear(), date.getDate().getMonth(), date.getDate().getDayOfMonth());
                final r rVar2 = r.this;
                h31.c.a.DatePicker datePicker = new h31.c.a.DatePicker(new uw.j.Single(null, localDateOf, new er.l() { // from class: h31.u
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return r.f.O(rVar2, (LocalDate) obj2);
                    }
                }, localDateC.minusYears(21L), localDateC, 1, null));
                this.f80461g = vq.j.a(screen);
                this.f80459e = vq.j.a(localDateC);
                this.f80460f = 1;
                if (rVar.F(datePicker, this) == objE) {
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
        public final Object w(h31.c.d dVar, h31.d.Screen screen, tq.e<? super i0> eVar) {
            f fVar = r.this.new f(eVar);
            fVar.f80461g = screen;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lh31/c$c;", "action", "Lk10/c0;", "Lh31/d$d;", "state", "Lk10/l;", "Lh31/d;", "<anonymous>", "(Lh31/c$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<h31.c.OnDateChanged, k10.c0<h31.d.Screen>, tq.e<? super k10.l<? extends h31.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f80463e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f80464f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f80465g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h31.d.Screen O(h31.c.OnDateChanged onDateChanged, h31.d.Screen screen) {
            return screen.a(h31.d.Data.b(screen.getData(), null, onDateChanged.getDate(), false, 5, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final h31.c.OnDateChanged onDateChanged = (h31.c.OnDateChanged) this.f80464f;
            k10.c0 c0Var = (k10.c0) this.f80465g;
            uq.b.e();
            if (this.f80463e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: h31.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.g.O(onDateChanged, (d.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(h31.c.OnDateChanged onDateChanged, k10.c0<h31.d.Screen> c0Var, tq.e<? super k10.l<? extends h31.d>> eVar) {
            g gVar = new g(eVar);
            gVar.f80464f = onDateChanged;
            gVar.f80465g = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lh31/c$g;", "<unused var>", "Lk10/c0;", "Lh31/d$d;", "state", "Lk10/l;", "Lh31/d;", "<anonymous>", "(Lh31/c$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<h31.c.g, k10.c0<h31.d.Screen>, tq.e<? super k10.l<? extends h31.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f80466e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f80467f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h31.d.Screen O(h31.d.Screen screen) {
            return screen.a(h31.d.Data.b(screen.getData(), null, null, false, 3, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f80467f;
            uq.b.e();
            if (this.f80466e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: h31.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.h.O((d.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(h31.c.g gVar, k10.c0<h31.d.Screen> c0Var, tq.e<? super k10.l<? extends h31.d>> eVar) {
            h hVar = new h(eVar);
            hVar.f80467f = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lh31/c$b;", "<unused var>", "Lh31/d$d;", "Loq/i0;", "<anonymous>", "(Lh31/c$b;Lh31/d$d;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<h31.c.b, h31.d.Screen, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f80468e;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f80468e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                h31.c.a.C1829a c1829a = h31.c.a.C1829a.f80366a;
                this.f80468e = 1;
                if (rVar.F(c1829a, this) == objE) {
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
        public final Object w(h31.c.b bVar, h31.d.Screen screen, tq.e<? super i0> eVar) {
            return r.this.new i(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lh31/c$f;", "<unused var>", "Lk10/c0;", "Lh31/d$d;", "state", "Lk10/l;", "Lh31/d;", "<anonymous>", "(Lh31/c$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<h31.c.f, k10.c0<h31.d.Screen>, tq.e<? super k10.l<? extends h31.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f80470e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f80471f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h31.d.Screen V(hz.g gVar, h31.d.Screen screen) {
            return screen.a(h31.d.Data.b(screen.getData(), h31.d.Data.Input.b(screen.getData().getInput(), null, null, hz.b.INSTANCE.a(gVar), 3, null), null, true, 2, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h31.d.CheckVehicleInsurance X(h31.d.Screen screen) {
            return new h31.d.CheckVehicleInsurance(screen.getData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f80471f;
            uq.b.e();
            if (this.f80470e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final hz.g gVarB = r.this.validateRequestedInsuranceDataUC.b(new x21.d.Params(((h31.d.Screen) c0Var.a()).getData().getInput().getType(), ((h31.d.Screen) c0Var.a()).getData().getInput().getValue()));
            if (gVarB instanceof hz.g.Invalid) {
                return c0Var.b(new er.l() { // from class: h31.x
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return r.j.V(gVarB, (d.Screen) obj2);
                    }
                });
            }
            if (fr.t.c(gVarB, hz.g.b.f86853b)) {
                return c0Var.d(new er.l() { // from class: h31.y
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return r.j.X((d.Screen) obj2);
                    }
                });
            }
            throw new oq.p();
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(h31.c.f fVar, k10.c0<h31.d.Screen> c0Var, tq.e<? super k10.l<? extends h31.d>> eVar) {
            j jVar = r.this.new j(eVar);
            jVar.f80471f = c0Var;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lh31/d$a;", "state", "Lk10/l;", "Lh31/d;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.p<k10.c0<h31.d.CheckVehicleInsurance>, tq.e<? super k10.l<? extends h31.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f80473e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f80474f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lh31/d;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends h31.d>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f80476e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f80477f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f80478g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f80479h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f80480j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f80481k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ r f80482l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ k10.c0<h31.d.CheckVehicleInsurance> f80483m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(r rVar, k10.c0<h31.d.CheckVehicleInsurance> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f80482l = rVar;
                this.f80483m = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final h31.d.Error Y(final r rVar, dx.b bVar, h31.d.CheckVehicleInsurance checkVehicleInsurance) {
                return new h31.d.Error(checkVehicleInsurance.getData(), rVar.errorVMSFactory.a(rVar.genericDomainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: h31.b0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return r.k.a.Z(rVar, (ib4.c.b) obj);
                    }
                }, 2, null))));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final i0 Z(r rVar, ib4.c.b bVar) {
                if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                    rVar.d9(h31.b.f80364a);
                } else {
                    if (!(bVar instanceof ib4.c.b.a) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                        throw new oq.p();
                    }
                    rVar.d9(h31.a.f80363a);
                }
                return i0.f148189a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final h31.d.Screen a0(h31.d.CheckVehicleInsurance checkVehicleInsurance) {
                return new h31.d.Screen(checkVehicleInsurance.getData());
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                k10.c0<h31.d.CheckVehicleInsurance> c0Var;
                Object objE = uq.b.e();
                int i15 = this.f80481k;
                if (i15 == 0) {
                    oq.u.b(obj);
                    cw0.a aVar = this.f80482l.checkVehicleInsuranceStatusUC;
                    cw0.a.Params params = new cw0.a.Params(new RequestedInsuranceData(this.f80483m.a().getData().getDate(), this.f80482l.E9(this.f80483m.a().getData().getInput())));
                    this.f80481k = 1;
                    obj = aVar.c(params, this);
                    if (obj != objE) {
                    }
                    return objE;
                }
                if (i15 == 1) {
                    oq.u.b(obj);
                } else {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0Var = (k10.c0) this.f80477f;
                    oq.u.b(obj);
                }
                return c0Var.d(new er.l() { // from class: h31.a0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return r.k.a.a0((d.CheckVehicleInsurance) obj2);
                    }
                });
                dx.i iVar = (dx.i) obj;
                k10.c0<h31.d.CheckVehicleInsurance> c0Var2 = this.f80483m;
                final r rVar = this.f80482l;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var2.d(new er.l() { // from class: h31.z
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return r.k.a.Y(rVar, bVar, (d.CheckVehicleInsurance) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                VehicleInsuranceVerificationData vehicleInsuranceVerificationData = (VehicleInsuranceVerificationData) ((dx.i.Right) iVar).b();
                h31.c.a.Next next = new h31.c.a.Next(new VehicleInsuranceVerificationData(vehicleInsuranceVerificationData.getInsuranceVerificationDate(), vehicleInsuranceVerificationData.getVehicleIdentifier(), vehicleInsuranceVerificationData.b(), vehicleInsuranceVerificationData.getQueryUuid(), vehicleInsuranceVerificationData.getTopAlertData()));
                this.f80476e = vq.j.a(iVar);
                this.f80477f = c0Var2;
                this.f80478g = vq.j.a(vehicleInsuranceVerificationData);
                this.f80479h = 0;
                this.f80480j = 0;
                this.f80481k = 2;
                if (rVar.F(next, this) != objE) {
                    c0Var = c0Var2;
                    return c0Var.d(new er.l() { // from class: h31.a0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return r.k.a.a0((d.CheckVehicleInsurance) obj2);
                        }
                    });
                }
                return objE;
            }

            public final tq.e<i0> V(tq.e<?> eVar) {
                return new a(this.f80482l, this.f80483m, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends h31.d>> eVar) {
                return ((a) V(eVar)).J(i0.f148189a);
            }
        }

        k(tq.e<? super k> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f80474f;
            Object objE = uq.b.e();
            int i15 = this.f80473e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = r.this.callActionWithLoaderUC;
            a aVar2 = new a(r.this, c0Var, null);
            this.f80474f = vq.j.a(c0Var);
            this.f80473e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<h31.d.CheckVehicleInsurance> c0Var, tq.e<? super k10.l<? extends h31.d>> eVar) {
            return ((k) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            k kVar = r.this.new k(eVar);
            kVar.f80474f = obj;
            return kVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lh31/b;", "<unused var>", "Lk10/c0;", "Lh31/d$c;", "state", "Lk10/l;", "Lh31/d;", "<anonymous>", "(Lh31/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<h31.b, k10.c0<h31.d.Error>, tq.e<? super k10.l<? extends h31.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f80484e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f80485f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h31.d.CheckVehicleInsurance O(h31.d.Error error) {
            return new h31.d.CheckVehicleInsurance(error.getData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f80485f;
            uq.b.e();
            if (this.f80484e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: h31.c0
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.l.O((d.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(h31.b bVar, k10.c0<h31.d.Error> c0Var, tq.e<? super k10.l<? extends h31.d>> eVar) {
            l lVar = new l(eVar);
            lVar.f80485f = c0Var;
            return lVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lh31/a;", "<unused var>", "Lk10/c0;", "Lh31/d$c;", "state", "Lk10/l;", "Lh31/d;", "<anonymous>", "(Lh31/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<h31.a, k10.c0<h31.d.Error>, tq.e<? super k10.l<? extends h31.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f80486e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f80487f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h31.d.Screen O(h31.d.Error error) {
            return new h31.d.Screen(error.getData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f80487f;
            uq.b.e();
            if (this.f80486e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: h31.d0
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.m.O((d.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(h31.a aVar, k10.c0<h31.d.Error> c0Var, tq.e<? super k10.l<? extends h31.d>> eVar) {
            m mVar = new m(eVar);
            mVar.f80487f = c0Var;
            return mVar.J(i0.f148189a);
        }
    }

    public r(yy.a aVar, i31.c cVar, cw0.a aVar2, ez.a aVar3, x21.d dVar, ac4.a aVar4, ib4.c cVar2, hb4.d dVar2) {
        this.mapper = cVar;
        this.checkVehicleInsuranceStatusUC = aVar2;
        this.timeProvider = aVar3;
        this.validateRequestedInsuranceDataUC = dVar;
        this.callActionWithLoaderUC = aVar4;
        this.genericDomainErrorMapper = cVar2;
        this.errorVMSFactory = dVar2;
        h31.d.Screen screen = new h31.d.Screen(new h31.d.Data(null, new fz.b.OffsetDateTime(aVar3.c().atStartOfDay(ZoneOffset.UTC).toOffsetDateTime()), false, 5, null));
        this.initialState = screen;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(screen, new er.l() { // from class: h31.l
            @Override // er.l
            public final Object b(Object obj) {
                return r.A9(this.f80422a, (k10.v) obj);
            }
        });
        this.state = a9(new c(e9().getState(), this), w9(screen));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(final r rVar, k10.v vVar) {
        vVar.c(q0.c(h31.d.Screen.class), new er.l() { // from class: h31.m
            @Override // er.l
            public final Object b(Object obj) {
                return r.B9(this.f80423a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(h31.d.CheckVehicleInsurance.class), new er.l() { // from class: h31.n
            @Override // er.l
            public final Object b(Object obj) {
                return r.C9(this.f80424a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(h31.d.Error.class), new er.l() { // from class: h31.o
            @Override // er.l
            public final Object b(Object obj) {
                return r.D9((k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(r rVar, k10.z zVar) {
        d dVar = new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(h31.c.OnTypeChanged.class), oVar, dVar);
        zVar.v(q0.c(h31.c.OnInputChanged.class), oVar, new e(null));
        zVar.x(q0.c(h31.c.d.class), oVar, rVar.new f(null));
        zVar.v(q0.c(h31.c.OnDateChanged.class), oVar, new g(null));
        zVar.v(q0.c(h31.c.g.class), oVar, new h(null));
        zVar.x(q0.c(h31.c.b.class), oVar, rVar.new i(null));
        zVar.v(q0.c(h31.c.f.class), oVar, rVar.new j(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(r rVar, k10.z zVar) {
        zVar.A(rVar.new k(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(k10.z zVar) {
        l lVar = new l(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(h31.b.class), oVar, lVar);
        zVar.v(q0.c(h31.a.class), oVar, new m(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RequestedInsuranceData.a E9(h31.d.Data.Input input) {
        int i15 = b.f80440a[input.getType().ordinal()];
        if (i15 == 1) {
            return new RequestedInsuranceData.a.Plate(uv0.d.c(iy.c0.e(input.getValue())), null);
        }
        if (i15 == 2) {
            return new RequestedInsuranceData.a.Vehicle(uv0.v.c(input.getValue()), null);
        }
        if (i15 == 3) {
            return new RequestedInsuranceData.a.Insurance(input.getValue());
        }
        throw new oq.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h31.e.a w9(h31.d state) {
        return this.mapper.b(new i31.c.Params(state, new er.l() { // from class: h31.p
            @Override // er.l
            public final Object b(Object obj) {
                return r.x9(this.f80425a, (w21.a) obj);
            }
        }, new er.l() { // from class: h31.q
            @Override // er.l
            public final Object b(Object obj) {
                return r.y9(this.f80426a, (iy.b0) obj);
            }
        }, b9(h31.c.d.f80372a), b9(h31.c.g.f80376a), b9(h31.c.b.f80369a), b9(h31.c.f.f80375a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(r rVar, w21.a aVar) {
        rVar.d9(new h31.c.OnTypeChanged(aVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(r rVar, iy.b0 b0Var) {
        rVar.d9(new h31.c.OnInputChanged(b0Var));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<h31.c.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<h31.d, h31.c> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<h31.e.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: v9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(h31.c.a aVar, tq.e<? super i0> eVar) {
        return super.F(aVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: z9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
