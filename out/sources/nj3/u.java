package nj3;

import fr.q0;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.Locale;
import ju.g1;
import mj3.AbroadListPayload;
import mu.p0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pj3.VehicleIdentificationPayload;
import tj3.VehicleHistoryPayload;
import uv0.VehicleHistoryAbroadWrapper;
import uv0.VehicleHistoryWrapper;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BS\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ9\u0010)\u001a\u00020(2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\b\u0010'\u001a\u0004\u0018\u00010&H\u0002¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R&\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030?8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR \u0010K\u001a\b\u0012\u0004\u0012\u00020F0E8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0L8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P¨\u0006Q"}, d2 = {"Lnj3/u;", "Ll00/g;", "Lnj3/e;", "Lnj3/a;", "Lnj3/f;", "", "Loj3/f;", "vehicleHistoryVerificationFormMapper", "Lyy/a;", "stateMachineFactory", "Ln03/a;", "checkPlateNumberCorrectUC", "Lcj3/a;", "checkVinCorrectUseCase", "Lbw0/a;", "getVehicleHistoryAbroadUseCase", "Lcj3/c;", "getVehicleHistoryOrVehicleHistoryAbroadUseCase", "Lac4/a;", "callActionWithLoaderUseCase", "Lqj3/e;", "genericDomainErrorMapper", "Lnj3/c;", "setupData", "<init>", "(Loj3/f;Lyy/a;Ln03/a;Lcj3/a;Lbw0/a;Lcj3/c;Lac4/a;Lqj3/e;Lnj3/c;)V", "state", "Lnj3/f$b;", "y9", "(Lnj3/e;)Lnj3/f$b;", "Ldx/b;", "error", "Luv0/d;", "plate", "Luv0/v;", "vin", "", "skipForm", "Ljava/time/LocalDate;", "firstRegistrationDate", "Ljb4/b;", "v9", "(Ldx/b;Ljava/lang/String;Liy/b0;ZLjava/time/LocalDate;)Ljb4/b;", "b", "Loj3/f;", "c", "Ln03/a;", "d", "Lcj3/a;", "e", "Lbw0/a;", "f", "Lcj3/c;", "g", "Lac4/a;", "h", "Lqj3/e;", "j", "Lnj3/c;", "Lnj3/e$b;", "k", "Lnj3/e$b;", "initialState", "Lk10/t;", "l", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lnj3/a$g;", "m", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "n", "Lmu/p0;", "getState", "()Lmu/p0;", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u extends l00.g<nj3.e, nj3.a> implements nj3.f, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oj3.f vehicleHistoryVerificationFormMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final n03.a checkPlateNumberCorrectUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final cj3.a checkVinCorrectUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final bw0.a getVehicleHistoryAbroadUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final cj3.c getVehicleHistoryOrVehicleHistoryAbroadUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final qj3.e genericDomainErrorMapper;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final nj3.e.b initialState;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final k10.t<nj3.e, nj3.a> stateMachine;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final xw.b<nj3.a.g> navAction;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final p0<nj3.f.b> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements er.l<uv0.d, oq.i0> {
        a() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(uv0.d dVar) {
            c(dVar.getValue());
            return oq.i0.f148189a;
        }

        public final void c(String str) {
            u.this.d9(new nj3.a.CheckPlate(uv0.d.c(str.toUpperCase(Locale.ROOT)), true, null));
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements er.l<uv0.d, oq.i0> {
        b() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(uv0.d dVar) {
            c(dVar.getValue());
            return oq.i0.f148189a;
        }

        public final void c(String str) {
            u.this.d9(new nj3.a.CheckPlate(uv0.d.c(str.toUpperCase(Locale.ROOT)), false, 2, null));
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements er.l<uv0.v, oq.i0> {
        c() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(uv0.v vVar) {
            c(vVar.getValue());
            return oq.i0.f148189a;
        }

        public final void c(iy.b0 b0Var) {
            u.this.d9(new nj3.a.CheckVin(uv0.v.d(iy.c0.e(b0Var).toUpperCase(Locale.ROOT)), false, null));
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d implements er.q<uv0.d, uv0.v, LocalDate, oq.i0> {
        d() {
        }

        public final void c(String str, iy.b0 b0Var, LocalDate localDate) {
            u uVar = u.this;
            Locale locale = Locale.ROOT;
            uVar.d9(new nj3.a.Check(uv0.d.c(str.toUpperCase(locale)), uv0.v.d(iy.c0.e(b0Var).toUpperCase(locale)), false, localDate, 4, null));
        }

        @Override // er.q
        public /* bridge */ /* synthetic */ oq.i0 w(uv0.d dVar, uv0.v vVar, LocalDate localDate) {
            c(dVar.getValue(), vVar.getValue(), localDate);
            return oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e implements mu.g<nj3.f.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f136955a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u f136956b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f136957a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ u f136958b;

            /* JADX INFO: renamed from: nj3.u$e$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3377a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f136959d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f136960e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f136961f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f136963h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f136964j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f136965k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f136966l;

                public C3377a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f136959d = obj;
                    this.f136960e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, u uVar) {
                this.f136957a = hVar;
                this.f136958b = uVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3377a c3377a;
                if (eVar instanceof C3377a) {
                    c3377a = (C3377a) eVar;
                    int i15 = c3377a.f136960e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3377a.f136960e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3377a = new C3377a(eVar);
                    }
                } else {
                    c3377a = new C3377a(eVar);
                }
                Object obj2 = c3377a.f136959d;
                Object objE = uq.b.e();
                int i16 = c3377a.f136960e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f136957a;
                    nj3.f.b bVarY9 = this.f136958b.y9((nj3.e) obj);
                    c3377a.f136961f = vq.j.a(obj);
                    c3377a.f136963h = vq.j.a(c3377a);
                    c3377a.f136964j = vq.j.a(obj);
                    c3377a.f136965k = vq.j.a(hVar);
                    c3377a.f136966l = 0;
                    c3377a.f136960e = 1;
                    if (hVar.F(bVarY9, c3377a) == objE) {
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

        public e(mu.g gVar, u uVar) {
            this.f136955a = gVar;
            this.f136956b = uVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super nj3.f.b> hVar, tq.e eVar) {
            Object objA = this.f136955a.a(new a(hVar, this.f136956b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lnj3/e$b;", "state", "Lk10/l;", "Lnj3/e;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.p<k10.c0<nj3.e.b>, tq.e<? super k10.l<? extends nj3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f136967e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f136968f;

        f(tq.e<? super f> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final nj3.e.Initialized O(u uVar, nj3.e.b bVar) {
            VehicleIdentificationPayload payloadData = uVar.setupData.getPayloadData();
            String plate = payloadData != null ? payloadData.getPlate() : uv0.d.INSTANCE.a();
            VehicleIdentificationPayload payloadData2 = uVar.setupData.getPayloadData();
            iy.b0 vin = payloadData2 != null ? payloadData2.getVin() : uv0.v.INSTANCE.a();
            VehicleIdentificationPayload payloadData3 = uVar.setupData.getPayloadData();
            return new nj3.e.Initialized(plate, vin, null, false, false, false, false, false, false, new RegistrationState(payloadData3 != null ? payloadData3.getFirstRegistrationDate() : null, false, 2, null), 508, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f136968f;
            uq.b.e();
            if (this.f136967e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final u uVar = u.this;
            k10.l lVarD = c0Var.d(new er.l() { // from class: nj3.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.f.O(uVar, (e.b) obj2);
                }
            });
            u uVar2 = u.this;
            VehicleIdentificationPayload payloadData = uVar2.setupData.getPayloadData();
            if (payloadData != null) {
                if (!uv0.d.g(payloadData.getPlate()) || !uv0.v.h(payloadData.getVin()) || !payloadData.getSkipForm()) {
                    payloadData = null;
                }
                if (payloadData != null) {
                    uVar2.d9(new nj3.a.Check(payloadData.getPlate(), payloadData.getVin(), true, payloadData.getFirstRegistrationDate(), null));
                }
            }
            return lVarD;
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<nj3.e.b> c0Var, tq.e<? super k10.l<? extends nj3.e>> eVar) {
            return ((f) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            f fVar = u.this.new f(eVar);
            fVar.f136968f = obj;
            return fVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lnj3/a$k;", "<unused var>", "Lnj3/e$a;", "state", "Loq/i0;", "<anonymous>", "(Lnj3/a$k;Lnj3/e$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<nj3.a.k, nj3.e.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f136970e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f136971f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 O(u uVar, LocalDate localDate) {
            uVar.d9(new nj3.a.OnRegistrationDateChange(localDate));
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            nj3.e.Initialized initialized = (nj3.e.Initialized) this.f136971f;
            Object objE = uq.b.e();
            int i15 = this.f136970e;
            if (i15 == 0) {
                oq.u.b(obj);
                u uVar = u.this;
                LocalDate date = initialized.getRegistrationState().getDate();
                if (date == null) {
                    date = LocalDate.now();
                }
                LocalDate localDate = ZonedDateTime.now().toLocalDate();
                final u uVar2 = u.this;
                nj3.a.g.ShowDatePicker showDatePicker = new nj3.a.g.ShowDatePicker(date, localDate, new er.l() { // from class: nj3.x
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return u.g.O(uVar2, (LocalDate) obj2);
                    }
                });
                this.f136971f = vq.j.a(initialized);
                this.f136970e = 1;
                if (uVar.F(showDatePicker, this) == objE) {
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
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(nj3.a.k kVar, nj3.e.Initialized initialized, tq.e<? super oq.i0> eVar) {
            g gVar = u.this.new g(eVar);
            gVar.f136971f = initialized;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lnj3/a$j;", "action", "Lk10/c0;", "Lnj3/e$a;", "state", "Lk10/l;", "Lnj3/e;", "<anonymous>", "(Lnj3/a$j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<nj3.a.OnRegistrationDateChange, k10.c0<nj3.e.Initialized>, tq.e<? super k10.l<? extends nj3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f136973e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f136974f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f136975g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final nj3.e.Initialized O(nj3.a.OnRegistrationDateChange onRegistrationDateChange, nj3.e.Initialized initialized) {
            return nj3.e.Initialized.b(initialized, null, null, null, false, false, false, false, false, false, initialized.getRegistrationState().a(onRegistrationDateChange.getNewDate(), true), 511, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final nj3.a.OnRegistrationDateChange onRegistrationDateChange = (nj3.a.OnRegistrationDateChange) this.f136974f;
            k10.c0 c0Var = (k10.c0) this.f136975g;
            uq.b.e();
            if (this.f136973e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: nj3.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.h.O(onRegistrationDateChange, (e.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(nj3.a.OnRegistrationDateChange onRegistrationDateChange, k10.c0<nj3.e.Initialized> c0Var, tq.e<? super k10.l<? extends nj3.e>> eVar) {
            h hVar = new h(eVar);
            hVar.f136974f = onRegistrationDateChange;
            hVar.f136975g = c0Var;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lnj3/e$a;", "state", "Lk10/l;", "Lnj3/e;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.p<k10.c0<nj3.e.Initialized>, tq.e<? super k10.l<? extends nj3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f136976e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f136977f;

        i(tq.e<? super i> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final nj3.e.Initialized O(u uVar, nj3.e.Initialized initialized) {
            return nj3.e.Initialized.b(initialized, null, null, null, false, false, false, false, false, uVar.setupData.getPayloadData().getSkipForm(), null, 767, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f136977f;
            uq.b.e();
            if (this.f136976e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (u.this.setupData.getPayloadData() == null) {
                return c0Var.c();
            }
            final u uVar = u.this;
            return c0Var.b(new er.l() { // from class: nj3.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.i.O(uVar, (e.Initialized) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<nj3.e.Initialized> c0Var, tq.e<? super k10.l<? extends nj3.e>> eVar) {
            return ((i) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            i iVar = u.this.new i(eVar);
            iVar.f136977f = obj;
            return iVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lnj3/a$a;", "<unused var>", "Lnj3/e$a;", "Loq/i0;", "<anonymous>", "(Lnj3/a$a;Lnj3/e$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<nj3.a.C3374a, nj3.e.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f136979e;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f136979e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<nj3.a.g> bVarY1 = u.this.Y1();
                nj3.a.g.b bVar = nj3.a.g.b.f136867a;
                this.f136979e = 1;
                if (bVarY1.F(bVar, this) == objE) {
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
        public final Object w(nj3.a.C3374a c3374a, nj3.e.Initialized initialized, tq.e<? super oq.i0> eVar) {
            return u.this.new j(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lnj3/a$c;", "action", "Lk10/c0;", "Lnj3/e$a;", "state", "Lk10/l;", "Lnj3/e;", "<anonymous>", "(Lnj3/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<nj3.a.CheckPlate, k10.c0<nj3.e.Initialized>, tq.e<? super k10.l<? extends nj3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f136981e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f136982f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f136983g;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final nj3.e.Initialized O(nj3.a.CheckPlate checkPlate, m03.a aVar, nj3.e.Initialized initialized) {
            return nj3.e.Initialized.b(initialized, checkPlate.getPlateNumber(), null, aVar, false, !aVar.e() || initialized.getWasPlateVerified() || checkPlate.getForceWasVerified(), false, false, false, false, null, 1002, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final nj3.a.CheckPlate checkPlate = (nj3.a.CheckPlate) this.f136982f;
            k10.c0 c0Var = (k10.c0) this.f136983g;
            Object objE = uq.b.e();
            int i15 = this.f136981e;
            if (i15 == 0) {
                oq.u.b(obj);
                n03.a aVar = u.this.checkPlateNumberCorrectUC;
                n03.a.Params params = new n03.a.Params(bj3.a.a(checkPlate.getPlateNumber()), ((nj3.e.Initialized) c0Var.a()).getWasPlateVerified() || checkPlate.getForceWasVerified(), null);
                this.f136982f = checkPlate;
                this.f136983g = c0Var;
                this.f136981e = 1;
                obj = aVar.c(params, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final m03.a aVar2 = (m03.a) obj;
            return c0Var.b(new er.l() { // from class: nj3.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.k.O(checkPlate, aVar2, (e.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(nj3.a.CheckPlate checkPlate, k10.c0<nj3.e.Initialized> c0Var, tq.e<? super k10.l<? extends nj3.e>> eVar) {
            k kVar = u.this.new k(eVar);
            kVar.f136982f = checkPlate;
            kVar.f136983g = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lnj3/a$h;", "<unused var>", "Lk10/c0;", "Lnj3/e$a;", "state", "Lk10/l;", "Lnj3/e;", "<anonymous>", "(Lnj3/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<nj3.a.h, k10.c0<nj3.e.Initialized>, tq.e<? super k10.l<? extends nj3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f136985e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f136986f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final nj3.e.Initialized O(nj3.e.Initialized initialized) {
            return nj3.e.Initialized.b(initialized, null, null, null, false, false, false, false, false, false, null, 959, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f136986f;
            uq.b.e();
            if (this.f136985e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: nj3.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.l.O((e.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(nj3.a.h hVar, k10.c0<nj3.e.Initialized> c0Var, tq.e<? super k10.l<? extends nj3.e>> eVar) {
            l lVar = new l(eVar);
            lVar.f136986f = c0Var;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lnj3/a$d;", "action", "Lk10/c0;", "Lnj3/e$a;", "state", "Lk10/l;", "Lnj3/e;", "<anonymous>", "(Lnj3/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<nj3.a.CheckVin, k10.c0<nj3.e.Initialized>, tq.e<? super k10.l<? extends nj3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f136987e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f136988f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f136989g;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final nj3.e.Initialized O(nj3.a.CheckVin checkVin, boolean z15, nj3.e.Initialized initialized) {
            return nj3.e.Initialized.b(initialized, null, checkVin.getVinNumber(), null, z15, false, !z15 || initialized.getWasVinVerified() || checkVin.getForceWasVerified(), false, false, false, null, 981, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final nj3.a.CheckVin checkVin = (nj3.a.CheckVin) this.f136988f;
            k10.c0 c0Var = (k10.c0) this.f136989g;
            Object objE = uq.b.e();
            int i15 = this.f136987e;
            if (i15 == 0) {
                oq.u.b(obj);
                cj3.a aVar = u.this.checkVinCorrectUseCase;
                cj3.a.C0713a c0713a = new cj3.a.C0713a(checkVin.getVinNumber(), ((nj3.e.Initialized) c0Var.a()).getWasVinVerified() || checkVin.getForceWasVerified(), null);
                this.f136988f = checkVin;
                this.f136989g = c0Var;
                this.f136987e = 1;
                obj = aVar.d(c0713a, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final boolean zBooleanValue = ((Boolean) obj).booleanValue();
            return c0Var.b(new er.l() { // from class: nj3.b0
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.m.O(checkVin, zBooleanValue, (e.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(nj3.a.CheckVin checkVin, k10.c0<nj3.e.Initialized> c0Var, tq.e<? super k10.l<? extends nj3.e>> eVar) {
            m mVar = u.this.new m(eVar);
            mVar.f136988f = checkVin;
            mVar.f136989g = c0Var;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lnj3/a$i;", "<unused var>", "Lk10/c0;", "Lnj3/e$a;", "state", "Lk10/l;", "Lnj3/e;", "<anonymous>", "(Lnj3/a$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<nj3.a.i, k10.c0<nj3.e.Initialized>, tq.e<? super k10.l<? extends nj3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f136991e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f136992f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final nj3.e.Initialized O(nj3.e.Initialized initialized) {
            return nj3.e.Initialized.b(initialized, null, null, null, false, false, false, false, false, false, null, 895, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f136992f;
            uq.b.e();
            if (this.f136991e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: nj3.c0
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.n.O((e.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(nj3.a.i iVar, k10.c0<nj3.e.Initialized> c0Var, tq.e<? super k10.l<? extends nj3.e>> eVar) {
            n nVar = new n(eVar);
            nVar.f136992f = c0Var;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lnj3/a$f;", "action", "Lk10/c0;", "Lnj3/e$a;", "state", "Lk10/l;", "Lnj3/e;", "<anonymous>", "(Lnj3/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<nj3.a.GetAbroad, k10.c0<nj3.e.Initialized>, tq.e<? super k10.l<? extends nj3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f136993e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f136994f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f136995g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lnj3/e$a;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends nj3.e.Initialized>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f136997e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f136998f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f136999g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f137000h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f137001j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f137002k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f137003l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f137004m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ u f137005n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ nj3.a.GetAbroad f137006p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ k10.c0<nj3.e.Initialized> f137007q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(u uVar, nj3.a.GetAbroad getAbroad, k10.c0<nj3.e.Initialized> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f137005n = uVar;
                this.f137006p = getAbroad;
                this.f137007q = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final nj3.e.Initialized X(nj3.e.Initialized initialized) {
                return new nj3.e.Initialized(null, null, null, false, false, false, false, false, false, new RegistrationState(null, false, 3, null), 511, null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final nj3.e.Initialized Y(nj3.e.Initialized initialized) {
                return new nj3.e.Initialized(null, null, null, false, false, false, false, false, false, new RegistrationState(null, false, 3, null), 511, null);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                nj3.a.g abroad;
                k10.c0<nj3.e.Initialized> c0Var;
                k10.c0<nj3.e.Initialized> c0Var2;
                Object objE = uq.b.e();
                int i15 = this.f137004m;
                if (i15 == 0) {
                    oq.u.b(obj);
                    bw0.a aVar = this.f137005n.getVehicleHistoryAbroadUseCase;
                    bw0.a.Params params = new bw0.a.Params(this.f137006p.getPlate(), this.f137006p.getVin(), this.f137006p.getFirstRegistrationDate(), null);
                    this.f137004m = 1;
                    obj = aVar.c(params, this);
                    if (obj != objE) {
                    }
                    return objE;
                }
                if (i15 != 1) {
                    if (i15 == 2) {
                        c0Var2 = (k10.c0) this.f136998f;
                        oq.u.b(obj);
                        return c0Var2.b(new er.l() { // from class: nj3.d0
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return u.o.a.X((e.Initialized) obj2);
                            }
                        });
                    }
                    if (i15 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0Var = (k10.c0) this.f136998f;
                    oq.u.b(obj);
                    return c0Var.b(new er.l() { // from class: nj3.e0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return u.o.a.Y((e.Initialized) obj2);
                        }
                    });
                }
                oq.u.b(obj);
                dx.i iVar = (dx.i) obj;
                u uVar = this.f137005n;
                nj3.a.GetAbroad getAbroad = this.f137006p;
                k10.c0<nj3.e.Initialized> c0Var3 = this.f137007q;
                if (iVar instanceof dx.i.Left) {
                    dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    xw.b<nj3.a.g> bVarY1 = uVar.Y1();
                    nj3.a.g.Error error = new nj3.a.g.Error(uVar.v9(bVar, getAbroad.getPlate(), getAbroad.getVin(), getAbroad.getSkipForm(), getAbroad.getFirstRegistrationDate()));
                    this.f136997e = vq.j.a(iVar);
                    this.f136998f = c0Var3;
                    this.f136999g = vq.j.a(bVar);
                    this.f137001j = 0;
                    this.f137002k = 0;
                    this.f137004m = 2;
                    if (bVarY1.F(error, this) != objE) {
                        c0Var2 = c0Var3;
                        return c0Var2.b(new er.l() { // from class: nj3.d0
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return u.o.a.X((e.Initialized) obj2);
                            }
                        });
                    }
                } else {
                    if (!(iVar instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    uv0.o oVar = (uv0.o) ((dx.i.Right) iVar).b();
                    if (oVar instanceof uv0.h) {
                        abroad = new nj3.a.g.Empty(nj3.b.JUST_ABROAD_MISSING);
                    } else {
                        if (!(oVar instanceof VehicleHistoryAbroadWrapper)) {
                            throw new oq.p();
                        }
                        abroad = new nj3.a.g.Abroad(new AbroadListPayload(false, true, false, ((VehicleHistoryAbroadWrapper) oVar).getVehicleHistoryAbroad()));
                    }
                    xw.b<nj3.a.g> bVarY2 = uVar.Y1();
                    this.f136997e = vq.j.a(iVar);
                    this.f136998f = c0Var3;
                    this.f136999g = vq.j.a(oVar);
                    this.f137000h = vq.j.a(abroad);
                    this.f137001j = 0;
                    this.f137002k = 0;
                    this.f137003l = 0;
                    this.f137004m = 3;
                    if (bVarY2.F(abroad, this) != objE) {
                        c0Var = c0Var3;
                        return c0Var.b(new er.l() { // from class: nj3.e0
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return u.o.a.Y((e.Initialized) obj2);
                            }
                        });
                    }
                }
                return objE;
            }

            public final tq.e<oq.i0> O(tq.e<?> eVar) {
                return new a(this.f137005n, this.f137006p, this.f137007q, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<nj3.e.Initialized>> eVar) {
                return ((a) O(eVar)).J(oq.i0.f148189a);
            }
        }

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            nj3.a.GetAbroad getAbroad = (nj3.a.GetAbroad) this.f136994f;
            k10.c0 c0Var = (k10.c0) this.f136995g;
            Object objE = uq.b.e();
            int i15 = this.f136993e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = u.this.callActionWithLoaderUseCase;
            a aVar2 = new a(u.this, getAbroad, c0Var, null);
            this.f136994f = vq.j.a(getAbroad);
            this.f136995g = vq.j.a(c0Var);
            this.f136993e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(nj3.a.GetAbroad getAbroad, k10.c0<nj3.e.Initialized> c0Var, tq.e<? super k10.l<? extends nj3.e>> eVar) {
            o oVar = u.this.new o(eVar);
            oVar.f136994f = getAbroad;
            oVar.f136995g = c0Var;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lnj3/a$b;", "action", "Lk10/c0;", "Lnj3/e$a;", "state", "Lk10/l;", "Lnj3/e;", "<anonymous>", "(Lnj3/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<nj3.a.Check, k10.c0<nj3.e.Initialized>, tq.e<? super k10.l<? extends nj3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f137008e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f137009f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f137010g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f137011h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f137012j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f137013k;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lnj3/e;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends nj3.e>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f137015e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f137016f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f137017g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f137018h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f137019j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f137020k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f137021l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f137022m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f137023n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ u f137024p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ nj3.a.Check f137025q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ k10.c0<nj3.e.Initialized> f137026r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(u uVar, nj3.a.Check check, k10.c0<nj3.e.Initialized> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f137024p = uVar;
                this.f137025q = check;
                this.f137026r = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final nj3.e.Initialized X(nj3.e.Initialized initialized) {
                return new nj3.e.Initialized(null, null, null, false, false, false, false, false, false, new RegistrationState(null, false, 3, null), 511, null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final nj3.e.Initialized Y(uv0.s sVar, nj3.a.Check check, k10.c0 c0Var, nj3.e.Initialized initialized) {
                return sVar.getIsEmpty() ? new nj3.e.Initialized(check.getPlateNumber(), check.getVin(), null, false, false, false, false, false, false, RegistrationState.b(((nj3.e.Initialized) c0Var.a()).getRegistrationState(), check.getFirstRegistrationDate(), false, 2, null), 508, null) : new nj3.e.Initialized(null, null, null, false, false, false, false, false, false, new RegistrationState(null, false, 3, null), 511, null);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objC;
                nj3.a.g empty;
                final uv0.s sVar;
                final nj3.a.Check check;
                final k10.c0<nj3.e.Initialized> c0Var;
                dx.b bVar;
                k10.c0<nj3.e.Initialized> c0Var2;
                Object objE = uq.b.e();
                int i15 = this.f137023n;
                if (i15 == 0) {
                    oq.u.b(obj);
                    cj3.c cVar = this.f137024p.getVehicleHistoryOrVehicleHistoryAbroadUseCase;
                    cj3.c.Params params = new cj3.c.Params(this.f137025q.getPlateNumber(), this.f137025q.getVin(), this.f137025q.getFirstRegistrationDate(), null);
                    this.f137023n = 1;
                    objC = cVar.c(params, this);
                    if (objC != objE) {
                    }
                    return objE;
                }
                if (i15 != 1) {
                    if (i15 == 2) {
                        bVar = (dx.b) this.f137017g;
                        c0Var2 = (k10.c0) this.f137016f;
                        oq.u.b(obj);
                        return ((bVar instanceof dx.b.Business) || !(((dx.b.Business) bVar).getType() instanceof vv0.a)) ? c0Var2.b(new er.l() { // from class: nj3.g0
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return u.p.a.X((e.Initialized) obj2);
                            }
                        }) : c0Var2.c();
                    }
                    if (i15 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sVar = (uv0.s) this.f137018h;
                    c0Var = (k10.c0) this.f137017g;
                    check = (nj3.a.Check) this.f137016f;
                    oq.u.b(obj);
                    return c0Var.b(new er.l() { // from class: nj3.h0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return u.p.a.Y(sVar, check, c0Var, (e.Initialized) obj2);
                        }
                    });
                }
                oq.u.b(obj);
                objC = obj;
                dx.i iVar = (dx.i) objC;
                u uVar = this.f137024p;
                nj3.a.Check check2 = this.f137025q;
                k10.c0<nj3.e.Initialized> c0Var3 = this.f137026r;
                if (iVar instanceof dx.i.Left) {
                    dx.b bVar2 = (dx.b) ((dx.i.Left) iVar).b();
                    xw.b<nj3.a.g> bVarY1 = uVar.Y1();
                    nj3.a.g.Error error = new nj3.a.g.Error(uVar.v9(bVar2, check2.getPlateNumber(), check2.getVin(), check2.getSkipForm(), check2.getFirstRegistrationDate()));
                    this.f137015e = vq.j.a(iVar);
                    this.f137016f = c0Var3;
                    this.f137017g = bVar2;
                    this.f137020k = 0;
                    this.f137021l = 0;
                    this.f137023n = 2;
                    if (bVarY1.F(error, this) != objE) {
                        bVar = bVar2;
                        c0Var2 = c0Var3;
                        if (bVar instanceof dx.b.Business) {
                        }
                    }
                } else {
                    if (!(iVar instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    uv0.s sVar2 = (uv0.s) ((dx.i.Right) iVar).b();
                    if (sVar2 instanceof VehicleHistoryAbroadWrapper) {
                        empty = new nj3.a.g.Abroad(new AbroadListPayload(true, true, check2.getSkipForm(), ((VehicleHistoryAbroadWrapper) sVar2).getVehicleHistoryAbroad()));
                    } else if (sVar2 instanceof VehicleHistoryWrapper) {
                        empty = new nj3.a.g.Details(new VehicleHistoryPayload(check2.getPlateNumber(), check2.getVin(), ((VehicleHistoryWrapper) sVar2).getVehicleHistory(), check2.getSkipForm(), check2.getFirstRegistrationDate(), null));
                    } else if (sVar2 instanceof uv0.h) {
                        empty = new nj3.a.g.Empty(nj3.b.BOTH_MISSING);
                    } else {
                        if (!(sVar2 instanceof uv0.i)) {
                            throw new oq.p();
                        }
                        empty = new nj3.a.g.Empty(nj3.b.LOCAL_EMPTY_ABROAD_ERROR);
                    }
                    xw.b<nj3.a.g> bVarY2 = uVar.Y1();
                    this.f137015e = vq.j.a(iVar);
                    this.f137016f = check2;
                    this.f137017g = c0Var3;
                    this.f137018h = sVar2;
                    this.f137019j = vq.j.a(empty);
                    this.f137020k = 0;
                    this.f137021l = 0;
                    this.f137022m = 0;
                    this.f137023n = 3;
                    if (bVarY2.F(empty, this) != objE) {
                        sVar = sVar2;
                        check = check2;
                        c0Var = c0Var3;
                        return c0Var.b(new er.l() { // from class: nj3.h0
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return u.p.a.Y(sVar, check, c0Var, (e.Initialized) obj2);
                            }
                        });
                    }
                }
                return objE;
            }

            public final tq.e<oq.i0> O(tq.e<?> eVar) {
                return new a(this.f137024p, this.f137025q, this.f137026r, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends nj3.e>> eVar) {
                return ((a) O(eVar)).J(oq.i0.f148189a);
            }
        }

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final nj3.e.Initialized O(m03.a aVar, boolean z15, boolean z16, nj3.e.Initialized initialized) {
            return nj3.e.Initialized.b(initialized, null, null, aVar, z15, true, true, false, false, false, RegistrationState.b(initialized.getRegistrationState(), null, z16, 1, null), 451, null);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0087  */
        /* JADX WARN: Type inference failed for: r7v0 */
        /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r7v2 */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final m03.a aVar;
            final boolean zBooleanValue;
            final ?? r15;
            nj3.a.Check check = (nj3.a.Check) this.f137012j;
            k10.c0 c0Var = (k10.c0) this.f137013k;
            Object objE = uq.b.e();
            int i15 = this.f137011h;
            if (i15 == 0) {
                oq.u.b(obj);
                n03.a aVar2 = u.this.checkPlateNumberCorrectUC;
                n03.a.Params params = new n03.a.Params(bj3.a.a(check.getPlateNumber()), true, null);
                this.f137012j = check;
                this.f137013k = c0Var;
                this.f137011h = 1;
                obj = aVar2.c(params, this);
                if (obj != objE) {
                }
            }
            if (i15 == 1) {
                oq.u.b(obj);
            } else {
                if (i15 != 2) {
                    if (i15 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                    return obj;
                }
                aVar = (m03.a) this.f137008e;
                oq.u.b(obj);
            }
            zBooleanValue = ((Boolean) obj).booleanValue();
            r15 = check.getFirstRegistrationDate() == null ? 0 : 1;
            if (aVar.e() || !zBooleanValue || r15 == 0) {
                return c0Var.b(new er.l() { // from class: nj3.f0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return u.p.O(aVar, zBooleanValue, r15, (e.Initialized) obj2);
                    }
                });
            }
            ac4.a aVar3 = u.this.callActionWithLoaderUseCase;
            ju.l0 l0VarB = g1.b();
            a aVar4 = new a(u.this, check, c0Var, null);
            this.f137012j = vq.j.a(check);
            this.f137013k = vq.j.a(c0Var);
            this.f137008e = vq.j.a(aVar);
            this.f137009f = zBooleanValue;
            this.f137010g = r15;
            this.f137011h = 3;
            Object objB = aVar3.b(l0VarB, aVar4, this);
            return objB == objE ? objE : objB;
            aVar = (m03.a) obj;
            cj3.a aVar5 = u.this.checkVinCorrectUseCase;
            cj3.a.C0713a c0713a = new cj3.a.C0713a(check.getVin(), true, null);
            this.f137012j = check;
            this.f137013k = c0Var;
            this.f137008e = aVar;
            this.f137011h = 2;
            obj = aVar5.d(c0713a, this);
            if (obj != objE) {
                zBooleanValue = ((Boolean) obj).booleanValue();
                if (check.getFirstRegistrationDate() == null) {
                }
                if (aVar.e()) {
                }
                return c0Var.b(new er.l() { // from class: nj3.f0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return u.p.O(aVar, zBooleanValue, r15, (e.Initialized) obj2);
                    }
                });
            }
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(nj3.a.Check check, k10.c0<nj3.e.Initialized> c0Var, tq.e<? super k10.l<? extends nj3.e>> eVar) {
            p pVar = u.this.new p(eVar);
            pVar.f137012j = check;
            pVar.f137013k = c0Var;
            return pVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lnj3/a$e;", "<unused var>", "Lk10/c0;", "Lnj3/e$a;", "state", "Lk10/l;", "Lnj3/e;", "<anonymous>", "(Lnj3/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<nj3.a.e, k10.c0<nj3.e.Initialized>, tq.e<? super k10.l<? extends nj3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f137027e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f137028f;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final nj3.e.Initialized O(nj3.e.Initialized initialized) {
            return new nj3.e.Initialized(null, null, null, false, false, false, false, false, false, new RegistrationState(null, false, 3, null), 511, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f137028f;
            uq.b.e();
            if (this.f137027e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: nj3.i0
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.q.O((e.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(nj3.a.e eVar, k10.c0<nj3.e.Initialized> c0Var, tq.e<? super k10.l<? extends nj3.e>> eVar2) {
            q qVar = new q(eVar2);
            qVar.f137028f = c0Var;
            return qVar.J(oq.i0.f148189a);
        }
    }

    public u(oj3.f fVar, yy.a aVar, n03.a aVar2, cj3.a aVar3, bw0.a aVar4, cj3.c cVar, ac4.a aVar5, qj3.e eVar, SetupData setupData) {
        this.vehicleHistoryVerificationFormMapper = fVar;
        this.checkPlateNumberCorrectUC = aVar2;
        this.checkVinCorrectUseCase = aVar3;
        this.getVehicleHistoryAbroadUseCase = aVar4;
        this.getVehicleHistoryOrVehicleHistoryAbroadUseCase = cVar;
        this.callActionWithLoaderUseCase = aVar5;
        this.genericDomainErrorMapper = eVar;
        this.setupData = setupData;
        nj3.e.b bVar = nj3.e.b.f136898a;
        this.initialState = bVar;
        this.stateMachine = aVar.a(bVar, new er.l() { // from class: nj3.t
            @Override // er.l
            public final Object b(Object obj) {
                return u.C9(this.f136938a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new e(e9().getState(), this), y9(bVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A9(u uVar) {
        uVar.d9(nj3.a.i.f136875a);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C9(final u uVar, k10.v vVar) {
        vVar.c(q0.c(nj3.e.b.class), new er.l() { // from class: nj3.q
            @Override // er.l
            public final Object b(Object obj) {
                return u.D9(this.f136931a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(nj3.e.Initialized.class), new er.l() { // from class: nj3.r
            @Override // er.l
            public final Object b(Object obj) {
                return u.E9(this.f136932a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D9(u uVar, k10.z zVar) {
        zVar.A(uVar.new f(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E9(u uVar, k10.z zVar) {
        zVar.A(uVar.new i(null));
        j jVar = uVar.new j(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(nj3.a.C3374a.class), oVar, jVar);
        zVar.v(q0.c(nj3.a.CheckPlate.class), oVar, uVar.new k(null));
        zVar.v(q0.c(nj3.a.h.class), oVar, new l(null));
        zVar.v(q0.c(nj3.a.CheckVin.class), oVar, uVar.new m(null));
        zVar.v(q0.c(nj3.a.i.class), oVar, new n(null));
        zVar.v(q0.c(nj3.a.GetAbroad.class), oVar, uVar.new o(null));
        zVar.v(q0.c(nj3.a.Check.class), oVar, uVar.new p(null));
        zVar.v(q0.c(nj3.a.e.class), oVar, new q(null));
        zVar.x(q0.c(nj3.a.k.class), oVar, uVar.new g(null));
        zVar.v(q0.c(nj3.a.OnRegistrationDateChange.class), oVar, new h(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b v9(dx.b error, final String plate, final iy.b0 vin, final boolean skipForm, final LocalDate firstRegistrationDate) {
        return this.genericDomainErrorMapper.b(new ib4.c.Params(error, false, new er.l() { // from class: nj3.s
            @Override // er.l
            public final Object b(Object obj) {
                return u.w9(this.f136933a, plate, vin, skipForm, firstRegistrationDate, (ib4.c.b) obj);
            }
        }, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w9(u uVar, String str, iy.b0 b0Var, boolean z15, LocalDate localDate, ib4.c.b bVar) {
        nj3.a getAbroad;
        if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
            Locale locale = Locale.ROOT;
            getAbroad = new nj3.a.Check(uv0.d.c(str.toUpperCase(locale)), uv0.v.d(iy.c0.e(b0Var).toUpperCase(locale)), z15, localDate, null);
        } else if (bVar instanceof ib4.c.b.a.Primary) {
            getAbroad = new nj3.a.GetAbroad(str, b0Var, z15, localDate, null);
        } else {
            getAbroad = z15 ? nj3.a.C3374a.f136851a : nj3.a.e.f136861a;
        }
        uVar.d9(getAbroad);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final nj3.f.b y9(nj3.e state) {
        return this.vehicleHistoryVerificationFormMapper.b(new oj3.f.Params(state, b9(nj3.a.C3374a.f136851a), new a(), new er.a() { // from class: nj3.o
            @Override // er.a
            public final Object a() {
                return u.z9(this.f136929a);
            }
        }, new b(), new c(), new er.a() { // from class: nj3.p
            @Override // er.a
            public final Object a() {
                return u.A9(this.f136930a);
            }
        }, new d(), b9(nj3.a.k.f136877a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z9(u uVar) {
        uVar.d9(nj3.a.h.f136874a);
        return oq.i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: B9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }

    @Override // zx.b
    public xw.b<nj3.a.g> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<nj3.e, nj3.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<nj3.f.b> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: x9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(nj3.a.g gVar, tq.e<? super oq.i0> eVar) {
        return super.F(gVar, eVar);
    }
}
