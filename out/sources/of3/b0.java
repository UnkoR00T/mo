package of3;

import fr.q0;
import gg3.DescriptionPreparationWaitingModel;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.chrono.ChronoLocalDateTime;
import java.util.concurrent.CancellationException;
import mu.p0;
import mx.Label;
import n70.TimeResult;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import rf3.CollisionDataFields;
import sv0.NewVehicleCollisionDescription;
import sv0.ProcessId;
import tv0.BEVehicleCollisionDescriptionConception;
import vy.Coordinates;
import ww.NavigationTimePickerDialogData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BS\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ$\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0!2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0082@¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u001bH\u0082@¢\u0006\u0004\b$\u0010%J\u001f\u0010*\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)0'*\u00020&H\u0002¢\u0006\u0004\b*\u0010+J,\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001f0!2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010-\u001a\u00020,H\u0082@¢\u0006\u0004\b.\u0010/J,\u00102\u001a\b\u0012\u0004\u0012\u00020\u001f0!2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u00101\u001a\u000200H\u0082@¢\u0006\u0004\b2\u00103J(\u00106\u001a\b\u0012\u0004\u0012\u00020\u001f0!*\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u00105\u001a\u000204H\u0082@¢\u0006\u0004\b6\u00107J\u0019\u0010;\u001a\u00020:2\b\u00109\u001a\u0004\u0018\u000108H\u0002¢\u0006\u0004\b;\u0010<J\u0017\u0010?\u001a\u00020:2\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\b?\u0010@J\u001f\u0010C\u001a\u00020:2\u0006\u0010-\u001a\u00020A2\u0006\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bC\u0010DJ\u0013\u0010F\u001a\u00020E*\u00020\u0002H\u0002¢\u0006\u0004\bF\u0010GR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010[\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR&\u0010a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\\8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R \u0010h\u001a\b\u0012\u0004\u0012\u00020c0b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR \u0010 \u001a\b\u0012\u0004\u0012\u00020E0i8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m¨\u0006n"}, d2 = {"Lof3/b0;", "Ll00/g;", "Lof3/b;", "Lof3/a;", "Lof3/c;", "", "Lyy/a;", "stateMachineFactory", "Lqf3/d;", "mapper", "Lae3/y;", "validDescriptionUseCase", "Lmx/c;", "labelProvider", "Law0/e0;", "sendDescriptionUC", "Lac4/a;", "withLoaderUseCase", "Lib4/c;", "domainErrorMapper", "Lez/a;", "currentTimeProvider", "Lpf3/a;", "contract", "<init>", "(Lyy/a;Lqf3/d;Lae3/y;Lmx/c;Law0/e0;Lac4/a;Lib4/c;Lez/a;Lpf3/a;)V", "data", "Loq/i0;", "V9", "(Lpf3/a;)V", "Lk10/c0;", "Lof3/b$b;", "state", "Lk10/l;", "G9", "(Lk10/c0;Ltq/e;)Ljava/lang/Object;", "J9", "(Ltq/e;)Ljava/lang/Object;", "Ltv0/i;", "Ldx/i;", "Ldx/b;", "Lsv0/w;", "aa", "(Ltv0/i;)Ldx/i;", "Lfz/b$c;", "crashDate", "M9", "(Lk10/c0;Lfz/b$c;Ltq/e;)Ljava/lang/Object;", "Lfz/b$g;", "crashTime", "S9", "(Lk10/c0;Lfz/b$g;Ltq/e;)Ljava/lang/Object;", "Lof3/a$e;", "action", "P9", "(Lk10/c0;Lof3/a$e;Ltq/e;)Ljava/lang/Object;", "Ltv0/i$a;", "location", "Lhz/b;", "da", "(Ltv0/i$a;)Lhz/b;", "Liy/b0;", "description", "ca", "(Liy/b0;)Lhz/b;", "Lfz/b$d;", "maxDate", "ba", "(Lfz/b$d;Lfz/b$d;)Lhz/b;", "Lof3/c$a;", "K9", "(Lof3/b;)Lof3/c$a;", "b", "Lqf3/d;", "c", "Lae3/y;", "d", "Lmx/c;", "e", "Law0/e0;", "f", "Lac4/a;", "g", "Lib4/c;", "h", "Lez/a;", "j", "Lpf3/a;", "Lof3/b$a;", "k", "Lof3/b$a;", "initialState", "Lk10/t;", "l", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lof3/a$b;", "m", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "n", "Lmu/p0;", "getState", "()Lmu/p0;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b0 extends l00.g<of3.b, of3.a> implements of3.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final qf3.d mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ae3.y validDescriptionUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final aw0.e0 sendDescriptionUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ac4.a withLoaderUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ib4.c domainErrorMapper;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final pf3.a contract;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final of3.b.a initialState;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final k10.t<of3.b, of3.a> stateMachine;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final xw.b<of3.a.b> navAction;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final p0<of3.c.a> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f145197d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f145198e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f145199f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f145200g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f145201h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f145202j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f145203k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f145205m;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f145203k = obj;
            this.f145205m |= PKIFailureInfo.systemUnavail;
            return b0.this.G9(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldx/i;", "Ldx/b;", "Lsv0/w;", "<anonymous>", "()Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super dx.i<? extends dx.b, ? extends NewVehicleCollisionDescription>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f145206e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f145207f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f145208g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f145209h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f145210j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f145211k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f145212l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f145213m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f145214n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f145215p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f145216q;

        b(tq.e<? super b> eVar) {
            super(1, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 V(b0 b0Var, ib4.c.b bVar) {
            if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                b0Var.d9(of3.a.C3602a.f145159a);
            }
            return oq.i0.f148189a;
        }

        /* JADX WARN: Code duplicated, block: B:47:0x0139 A[PHI: r0
          0x0139: PHI (r0v12 dx.i) = (r0v11 dx.i), (r0v11 dx.i), (r0v22 dx.i) binds: [B:43:0x0103, B:45:0x0136, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:49:0x013f  */
        /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Not initialized variable reg: 7, insn: 0x00d2: INVOKE (r8 I:java.util.List) = (r7 I:java.lang.Object) STATIC call: px.c.a(java.lang.Object):java.util.List A[MD:(java.lang.Object):java.util.List<px.a$a> (m)], block:B:35:0x00d2 */
        /* JADX WARN: Type inference failed for: r7v0, types: [dx.j, java.lang.Object] */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            dx.i left;
            ?? A;
            Object objB;
            dx.i iVar;
            final b0 b0Var;
            of3.a.b.ShowError showError;
            ex.b aVar;
            NewVehicleCollisionDescription newVehicleCollisionDescription;
            Object objE = uq.b.e();
            int i15 = this.f145216q;
            try {
                try {
                    if (i15 == 0) {
                        oq.u.b(obj);
                        b0 b0Var2 = b0.this;
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        aVar = new ex.a();
                        NewVehicleCollisionDescription newVehicleCollisionDescription2 = (NewVehicleCollisionDescription) aVar.a(b0Var2.aa(b0Var2.contract.w1()));
                        aw0.e0 e0Var = b0Var2.sendDescriptionUC;
                        aw0.e0.Params params = new aw0.e0.Params(newVehicleCollisionDescription2);
                        this.f145211k = jVarA;
                        this.f145212l = vq.j.a(aVar);
                        this.f145213m = vq.j.a(aVar);
                        this.f145214n = newVehicleCollisionDescription2;
                        this.f145215p = aVar;
                        this.f145206e = 0;
                        this.f145207f = 0;
                        this.f145208g = 0;
                        this.f145209h = 0;
                        this.f145210j = 0;
                        this.f145216q = 1;
                        obj = e0Var.c(params, this);
                        if (obj != objE) {
                            newVehicleCollisionDescription = newVehicleCollisionDescription2;
                        }
                        return objE;
                    }
                    if (i15 == 1) {
                        aVar = (ex.b) this.f145215p;
                        newVehicleCollisionDescription = (NewVehicleCollisionDescription) this.f145214n;
                        try {
                            oq.u.b(obj);
                        } catch (CancellationException e15) {
                            throw e15;
                        }
                    } else {
                        if (i15 != 2) {
                            if (i15 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            dx.i iVar2 = (dx.i) this.f145211k;
                            oq.u.b(obj);
                            return iVar2;
                        }
                        iVar = (dx.i) this.f145211k;
                        oq.u.b(obj);
                    }
                    b0Var = b0.this;
                    if (!(iVar instanceof dx.i.Left)) {
                        return iVar;
                    }
                    dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    showError = new of3.a.b.ShowError(b0Var.domainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: of3.c0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return b0.b.V(b0Var, (ib4.c.b) obj2);
                        }
                    }, 2, null)));
                    this.f145211k = iVar;
                    this.f145212l = vq.j.a(bVar);
                    this.f145213m = null;
                    this.f145214n = null;
                    this.f145215p = null;
                    this.f145206e = 0;
                    this.f145207f = 0;
                    this.f145216q = 3;
                    if (b0Var.F(showError, this) == objE) {
                        return objE;
                    }
                    return iVar;
                    aVar.a((dx.i) obj);
                    left = new dx.i.Right(newVehicleCollisionDescription);
                } catch (Exception e16) {
                    px.f fVar = px.f.f163100a;
                    String message = e16.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e16, px.c.a(A));
                    dx.i iVarA = A.a(e16);
                    if (iVarA instanceof dx.i.Left) {
                        objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                    } else {
                        if (!(iVarA instanceof dx.i.Right)) {
                            throw new oq.p();
                        }
                        objB = ((dx.i.Right) iVarA).b();
                    }
                    left = new dx.i.Left(objB);
                }
            } catch (ex.c e17) {
                left = new dx.i.Left((dx.b) ex.d.a(e17));
            } catch (CancellationException e18) {
                throw e18;
            }
            iVar = left;
            b0 b0Var3 = b0.this;
            if (iVar instanceof dx.i.Right) {
                NewVehicleCollisionDescription newVehicleCollisionDescription3 = (NewVehicleCollisionDescription) ((dx.i.Right) iVar).b();
                of3.a.b.GoToWaitingScreen goToWaitingScreen = new of3.a.b.GoToWaitingScreen(new DescriptionPreparationWaitingModel(newVehicleCollisionDescription3.getProcessId(), sv0.o.ME, false));
                this.f145211k = iVar;
                this.f145212l = vq.j.a(newVehicleCollisionDescription3);
                this.f145213m = null;
                this.f145214n = null;
                this.f145215p = null;
                this.f145206e = 0;
                this.f145207f = 0;
                this.f145216q = 2;
                if (b0Var3.F(goToWaitingScreen, this) != objE) {
                    b0Var = b0.this;
                    if (!(iVar instanceof dx.i.Left)) {
                        return iVar;
                    }
                    dx.b bVar2 = (dx.b) ((dx.i.Left) iVar).b();
                    showError = new of3.a.b.ShowError(b0Var.domainErrorMapper.b(new ib4.c.Params(bVar2, false, new er.l() { // from class: of3.c0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return b0.b.V(b0Var, (ib4.c.b) obj2);
                        }
                    }, 2, null)));
                    this.f145211k = iVar;
                    this.f145212l = vq.j.a(bVar2);
                    this.f145213m = null;
                    this.f145214n = null;
                    this.f145215p = null;
                    this.f145206e = 0;
                    this.f145207f = 0;
                    this.f145216q = 3;
                    if (b0Var.F(showError, this) == objE) {
                        return iVar;
                    }
                }
            } else {
                b0Var = b0.this;
                if (!(iVar instanceof dx.i.Left)) {
                    return iVar;
                }
                dx.b bVar3 = (dx.b) ((dx.i.Left) iVar).b();
                showError = new of3.a.b.ShowError(b0Var.domainErrorMapper.b(new ib4.c.Params(bVar3, false, new er.l() { // from class: of3.c0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return b0.b.V(b0Var, (ib4.c.b) obj2);
                    }
                }, 2, null)));
                this.f145211k = iVar;
                this.f145212l = vq.j.a(bVar3);
                this.f145213m = null;
                this.f145214n = null;
                this.f145215p = null;
                this.f145206e = 0;
                this.f145207f = 0;
                this.f145216q = 3;
                if (b0Var.F(showError, this) == objE) {
                    return iVar;
                }
            }
            return objE;
        }

        public final tq.e<oq.i0> N(tq.e<?> eVar) {
            return b0.this.new b(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super dx.i<? extends dx.b, NewVehicleCollisionDescription>> eVar) {
            return ((b) N(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f145218d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f145219e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f145220f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f145221g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f145222h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f145224k;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f145222h = obj;
            this.f145224k |= PKIFailureInfo.systemUnavail;
            return b0.this.M9(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f145225d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f145226e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f145227f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f145229h;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f145227f = obj;
            this.f145229h |= PKIFailureInfo.systemUnavail;
            return b0.this.P9(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f145230d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f145231e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f145232f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f145233g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f145235j;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f145233g = obj;
            this.f145235j |= PKIFailureInfo.systemUnavail;
            return b0.this.S9(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f145236e;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ b0 f145238a;

            a(b0 b0Var) {
                this.f145238a = b0Var;
            }

            @Override // mu.h
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object F(BEVehicleCollisionDescriptionConception bEVehicleCollisionDescriptionConception, tq.e<? super oq.i0> eVar) {
                this.f145238a.d9(new of3.a.OnSummaryDataChanged(bEVehicleCollisionDescriptionConception));
                return oq.i0.f148189a;
            }
        }

        f(tq.e<? super f> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f145236e;
            if (i15 == 0) {
                oq.u.b(obj);
                mu.g<BEVehicleCollisionDescriptionConception> description = b0.this.contract.getDescription();
                a aVar = new a(b0.this);
                this.f145236e = 1;
                if (description.a(aVar, this) == objE) {
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

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return b0.this.new f(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((f) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class g implements mu.g<of3.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f145239a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b0 f145240b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f145241a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ b0 f145242b;

            /* JADX INFO: renamed from: of3.b0$g$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3606a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f145243d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f145244e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f145245f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f145247h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f145248j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f145249k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f145250l;

                public C3606a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f145243d = obj;
                    this.f145244e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, b0 b0Var) {
                this.f145241a = hVar;
                this.f145242b = b0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3606a c3606a;
                if (eVar instanceof C3606a) {
                    c3606a = (C3606a) eVar;
                    int i15 = c3606a.f145244e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3606a.f145244e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3606a = new C3606a(eVar);
                    }
                } else {
                    c3606a = new C3606a(eVar);
                }
                Object obj2 = c3606a.f145243d;
                Object objE = uq.b.e();
                int i16 = c3606a.f145244e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f145241a;
                    of3.c.a aVarK9 = this.f145242b.K9((of3.b) obj);
                    c3606a.f145245f = vq.j.a(obj);
                    c3606a.f145247h = vq.j.a(c3606a);
                    c3606a.f145248j = vq.j.a(obj);
                    c3606a.f145249k = vq.j.a(hVar);
                    c3606a.f145250l = 0;
                    c3606a.f145244e = 1;
                    if (hVar.F(aVarK9, c3606a) == objE) {
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

        public g(mu.g gVar, b0 b0Var) {
            this.f145239a = gVar;
            this.f145240b = b0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super of3.c.a> hVar, tq.e eVar) {
            Object objA = this.f145239a.a(new a(hVar, this.f145240b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lof3/a$b;", "action", "Lof3/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lof3/a$b;Lof3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<of3.a.b, of3.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f145251e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f145252f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            of3.a.b bVar = (of3.a.b) this.f145252f;
            Object objE = uq.b.e();
            int i15 = this.f145251e;
            if (i15 == 0) {
                oq.u.b(obj);
                b0 b0Var = b0.this;
                this.f145252f = vq.j.a(bVar);
                this.f145251e = 1;
                if (b0Var.F(bVar, this) == objE) {
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
        public final Object w(of3.a.b bVar, of3.b bVar2, tq.e<? super oq.i0> eVar) {
            h hVar = b0.this.new h(eVar);
            hVar.f145252f = bVar;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lof3/a$g;", "action", "Lk10/c0;", "Lof3/b$a;", "state", "Lk10/l;", "Lof3/b;", "<anonymous>", "(Lof3/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<of3.a.OnSummaryDataChanged, k10.c0<of3.b.a>, tq.e<? super k10.l<? extends of3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f145254e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f145255f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f145256g;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final of3.b.Initialized O(LocalDateTime localDateTime, of3.a.OnSummaryDataChanged onSummaryDataChanged, of3.b.a aVar) {
            return new of3.b.Initialized(new fz.b.LocalDateTime(localDateTime), new fz.b.LocalDateTime(localDateTime.minusDays(30L)), new CollisionDataFields(new CollisionDataFields.InterfaceC4433a.DateTime(CollisionDataFields.b.CRASH_DATE, null, onSummaryDataChanged.getDescription().getDate(), 2, null), new CollisionDataFields.InterfaceC4433a.Location(CollisionDataFields.b.CRASH_LOCATION, null, onSummaryDataChanged.getDescription().getAddress(), 2, null), new CollisionDataFields.InterfaceC4433a.Input(CollisionDataFields.b.CRASH_DESCRIPTION, null, onSummaryDataChanged.getDescription().getDescription(), 2, null)), null, 8, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final of3.a.OnSummaryDataChanged onSummaryDataChanged = (of3.a.OnSummaryDataChanged) this.f145255f;
            k10.c0 c0Var = (k10.c0) this.f145256g;
            uq.b.e();
            if (this.f145254e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final LocalDateTime localDateTimeI = b0.this.currentTimeProvider.i();
            return c0Var.d(new er.l() { // from class: of3.d0
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.i.O(localDateTimeI, onSummaryDataChanged, (b.a) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(of3.a.OnSummaryDataChanged onSummaryDataChanged, k10.c0<of3.b.a> c0Var, tq.e<? super k10.l<? extends of3.b>> eVar) {
            i iVar = b0.this.new i(eVar);
            iVar.f145255f = onSummaryDataChanged;
            iVar.f145256g = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lof3/a$g;", "action", "Lk10/c0;", "Lof3/b$b;", "state", "Lk10/l;", "Lof3/b;", "<anonymous>", "(Lof3/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<of3.a.OnSummaryDataChanged, k10.c0<of3.b.Initialized>, tq.e<? super k10.l<? extends of3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f145258e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f145259f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f145260g;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final of3.b.Initialized O(CollisionDataFields collisionDataFields, CollisionDataFields.InterfaceC4433a.DateTime dateTime, of3.a.OnSummaryDataChanged onSummaryDataChanged, CollisionDataFields.InterfaceC4433a.Location location, CollisionDataFields.InterfaceC4433a.Input input, of3.b.Initialized initialized) {
            return of3.b.Initialized.b(initialized, null, null, collisionDataFields.a(CollisionDataFields.InterfaceC4433a.DateTime.d(dateTime, null, null, onSummaryDataChanged.getDescription().getDate(), 3, null), CollisionDataFields.InterfaceC4433a.Location.d(location, null, null, onSummaryDataChanged.getDescription().getAddress(), 3, null), CollisionDataFields.InterfaceC4433a.Input.d(input, null, null, onSummaryDataChanged.getDescription().getDescription(), 3, null)), null, 11, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final of3.a.OnSummaryDataChanged onSummaryDataChanged = (of3.a.OnSummaryDataChanged) this.f145259f;
            k10.c0 c0Var = (k10.c0) this.f145260g;
            uq.b.e();
            if (this.f145258e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final CollisionDataFields collisionDataFields = ((of3.b.Initialized) c0Var.a()).getCollisionDataFields();
            final CollisionDataFields.InterfaceC4433a.DateTime crashDateField = collisionDataFields.getCrashDateField();
            final CollisionDataFields.InterfaceC4433a.Location crashLocationField = collisionDataFields.getCrashLocationField();
            final CollisionDataFields.InterfaceC4433a.Input crashDescriptionField = collisionDataFields.getCrashDescriptionField();
            return c0Var.b(new er.l() { // from class: of3.e0
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.j.O(collisionDataFields, crashDateField, onSummaryDataChanged, crashLocationField, crashDescriptionField, (b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(of3.a.OnSummaryDataChanged onSummaryDataChanged, k10.c0<of3.b.Initialized> c0Var, tq.e<? super k10.l<? extends of3.b>> eVar) {
            j jVar = new j(eVar);
            jVar.f145259f = onSummaryDataChanged;
            jVar.f145260g = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lof3/a$d;", "action", "Lk10/c0;", "Lof3/b$b;", "state", "Lk10/l;", "Lof3/b;", "<anonymous>", "(Lof3/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<of3.a.OnDayChanged, k10.c0<of3.b.Initialized>, tq.e<? super k10.l<? extends of3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f145261e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f145262f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f145263g;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            of3.a.OnDayChanged onDayChanged = (of3.a.OnDayChanged) this.f145262f;
            k10.c0 c0Var = (k10.c0) this.f145263g;
            Object objE = uq.b.e();
            int i15 = this.f145261e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            b0 b0Var = b0.this;
            fz.b.LocalDate crashDate = onDayChanged.getCrashDate();
            this.f145262f = vq.j.a(onDayChanged);
            this.f145263g = vq.j.a(c0Var);
            this.f145261e = 1;
            Object objM9 = b0Var.M9(c0Var, crashDate, this);
            return objM9 == objE ? objE : objM9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(of3.a.OnDayChanged onDayChanged, k10.c0<of3.b.Initialized> c0Var, tq.e<? super k10.l<? extends of3.b>> eVar) {
            k kVar = b0.this.new k(eVar);
            kVar.f145262f = onDayChanged;
            kVar.f145263g = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lof3/a$h;", "action", "Lk10/c0;", "Lof3/b$b;", "state", "Lk10/l;", "Lof3/b;", "<anonymous>", "(Lof3/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<of3.a.OnTimeChanged, k10.c0<of3.b.Initialized>, tq.e<? super k10.l<? extends of3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f145265e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f145266f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f145267g;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            of3.a.OnTimeChanged onTimeChanged = (of3.a.OnTimeChanged) this.f145266f;
            k10.c0 c0Var = (k10.c0) this.f145267g;
            Object objE = uq.b.e();
            int i15 = this.f145265e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            b0 b0Var = b0.this;
            fz.b.OffsetTime crashTime = onTimeChanged.getCrashTime();
            this.f145266f = vq.j.a(onTimeChanged);
            this.f145267g = vq.j.a(c0Var);
            this.f145265e = 1;
            Object objS9 = b0Var.S9(c0Var, crashTime, this);
            return objS9 == objE ? objE : objS9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(of3.a.OnTimeChanged onTimeChanged, k10.c0<of3.b.Initialized> c0Var, tq.e<? super k10.l<? extends of3.b>> eVar) {
            l lVar = b0.this.new l(eVar);
            lVar.f145266f = onTimeChanged;
            lVar.f145267g = c0Var;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lof3/a$e;", "action", "Lk10/c0;", "Lof3/b$b;", "state", "Lk10/l;", "Lof3/b;", "<anonymous>", "(Lof3/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<of3.a.OnDescriptionChanged, k10.c0<of3.b.Initialized>, tq.e<? super k10.l<? extends of3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f145269e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f145270f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f145271g;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            of3.a.OnDescriptionChanged onDescriptionChanged = (of3.a.OnDescriptionChanged) this.f145270f;
            k10.c0 c0Var = (k10.c0) this.f145271g;
            Object objE = uq.b.e();
            int i15 = this.f145269e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            b0 b0Var = b0.this;
            this.f145270f = vq.j.a(onDescriptionChanged);
            this.f145271g = vq.j.a(c0Var);
            this.f145269e = 1;
            Object objP9 = b0Var.P9(c0Var, onDescriptionChanged, this);
            return objP9 == objE ? objE : objP9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(of3.a.OnDescriptionChanged onDescriptionChanged, k10.c0<of3.b.Initialized> c0Var, tq.e<? super k10.l<? extends of3.b>> eVar) {
            m mVar = b0.this.new m(eVar);
            mVar.f145270f = onDescriptionChanged;
            mVar.f145271g = c0Var;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lof3/a$a;", "<unused var>", "Lk10/c0;", "Lof3/b$b;", "state", "Lk10/l;", "Lof3/b;", "<anonymous>", "(Lof3/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<of3.a.C3602a, k10.c0<of3.b.Initialized>, tq.e<? super k10.l<? extends of3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f145273e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f145274f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f145274f;
            Object objE = uq.b.e();
            int i15 = this.f145273e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            b0 b0Var = b0.this;
            this.f145274f = vq.j.a(c0Var);
            this.f145273e = 1;
            Object objG9 = b0Var.G9(c0Var, this);
            return objG9 == objE ? objE : objG9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(of3.a.C3602a c3602a, k10.c0<of3.b.Initialized> c0Var, tq.e<? super k10.l<? extends of3.b>> eVar) {
            n nVar = b0.this.new n(eVar);
            nVar.f145274f = c0Var;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lof3/a$c;", "<unused var>", "Lof3/b$b;", "state", "Loq/i0;", "<anonymous>", "(Lof3/a$c;Lof3/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<of3.a.c, of3.b.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f145276e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f145277f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 O(b0 b0Var, fz.b.LocalDate localDate) {
            b0Var.d9(new of3.a.OnDayChanged(localDate));
            return oq.i0.f148189a;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [java.time.ZonedDateTime] */
        /* JADX WARN: Type inference failed for: r4v3, types: [java.time.ZonedDateTime] */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            of3.b.Initialized initialized = (of3.b.Initialized) this.f145277f;
            Object objE = uq.b.e();
            int i15 = this.f145276e;
            if (i15 == 0) {
                oq.u.b(obj);
                b0 b0Var = b0.this;
                LocalDate localDate = initialized.getMinDate().getDate().atZone(ZoneId.systemDefault()).toLocalDate();
                LocalDate localDate2 = initialized.getMaxDate().getDate().atZone(ZoneId.systemDefault()).toLocalDate();
                fz.b.LocalDate localDateH = ez.d.h(initialized.getCollisionDataFields().getCrashDateField().getDateType());
                final b0 b0Var2 = b0.this;
                of3.a.b.ShowDataPicker showDataPicker = new of3.a.b.ShowDataPicker(localDateH, localDate, localDate2, new er.l() { // from class: of3.f0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return b0.o.O(b0Var2, (fz.b.LocalDate) obj2);
                    }
                });
                this.f145277f = vq.j.a(initialized);
                this.f145276e = 1;
                if (b0Var.F(showDataPicker, this) == objE) {
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
        public final Object w(of3.a.c cVar, of3.b.Initialized initialized, tq.e<? super oq.i0> eVar) {
            o oVar = b0.this.new o(eVar);
            oVar.f145277f = initialized;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lof3/a$f;", "<unused var>", "Lk10/c0;", "Lof3/b$b;", "state", "Lk10/l;", "Lof3/b;", "<anonymous>", "(Lof3/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<of3.a.f, k10.c0<of3.b.Initialized>, tq.e<? super k10.l<? extends of3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f145279e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f145280f;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final of3.b.Initialized O(of3.b.Initialized initialized) {
            return of3.b.Initialized.b(initialized, null, null, CollisionDataFields.b(initialized.getCollisionDataFields(), null, CollisionDataFields.InterfaceC4433a.Location.d(initialized.getCollisionDataFields().getCrashLocationField(), null, hz.b.C2039b.f86846c, null, 5, null), null, 5, null), null, 11, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f145280f;
            Object objE = uq.b.e();
            int i15 = this.f145279e;
            if (i15 == 0) {
                oq.u.b(obj);
                b0 b0Var = b0.this;
                of3.a.b.C3604b c3604b = of3.a.b.C3604b.f145161a;
                this.f145280f = c0Var;
                this.f145279e = 1;
                if (b0Var.F(c3604b, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.b(new er.l() { // from class: of3.g0
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.p.O((b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(of3.a.f fVar, k10.c0<of3.b.Initialized> c0Var, tq.e<? super k10.l<? extends of3.b>> eVar) {
            p pVar = b0.this.new p(eVar);
            pVar.f145280f = c0Var;
            return pVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lof3/a$i;", "<unused var>", "Lof3/b$b;", "state", "Loq/i0;", "<anonymous>", "(Lof3/a$i;Lof3/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<of3.a.i, of3.b.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f145282e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f145283f;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 O(b0 b0Var, TimeResult timeResult) {
            b0Var.d9(new of3.a.OnTimeChanged(timeResult.a()));
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            of3.b.Initialized initialized = (of3.b.Initialized) this.f145283f;
            Object objE = uq.b.e();
            int i15 = this.f145282e;
            if (i15 == 0) {
                oq.u.b(obj);
                b0 b0Var = b0.this;
                Label labelC = b0.this.labelProvider.c(md3.b.f125743i3);
                int hour = initialized.getCollisionDataFields().getCrashDateField().getDateType().getDate().getHour();
                int minute = initialized.getCollisionDataFields().getCrashDateField().getDateType().getDate().getMinute();
                Label labelC2 = b0.this.labelProvider.c(md3.b.f125739i);
                Label labelC3 = b0.this.labelProvider.c(md3.b.f125699d);
                final b0 b0Var2 = b0.this;
                of3.a.b.ShowTimePicker showTimePicker = new of3.a.b.ShowTimePicker(new NavigationTimePickerDialogData(labelC, hour, minute, labelC2, labelC3, new er.l() { // from class: of3.h0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return b0.q.O(b0Var2, (TimeResult) obj2);
                    }
                }));
                this.f145283f = vq.j.a(initialized);
                this.f145282e = 1;
                if (b0Var.F(showTimePicker, this) == objE) {
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
        public final Object w(of3.a.i iVar, of3.b.Initialized initialized, tq.e<? super oq.i0> eVar) {
            q qVar = b0.this.new q(eVar);
            qVar.f145283f = initialized;
            return qVar.J(oq.i0.f148189a);
        }
    }

    public b0(yy.a aVar, qf3.d dVar, ae3.y yVar, mx.c cVar, aw0.e0 e0Var, ac4.a aVar2, ib4.c cVar2, ez.a aVar3, pf3.a aVar4) {
        this.mapper = dVar;
        this.validDescriptionUseCase = yVar;
        this.labelProvider = cVar;
        this.sendDescriptionUC = e0Var;
        this.withLoaderUseCase = aVar2;
        this.domainErrorMapper = cVar2;
        this.currentTimeProvider = aVar3;
        this.contract = aVar4;
        of3.b.a aVar5 = of3.b.a.f145180a;
        this.initialState = aVar5;
        this.stateMachine = aVar.a(aVar5, new er.l() { // from class: of3.r
            @Override // er.l
            public final Object b(Object obj) {
                return b0.W9(this.f145322a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new g(e9().getState(), this), K9(aVar5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object G9(k10.c0<of3.b.Initialized> c0Var, tq.e<? super k10.l<of3.b.Initialized>> eVar) throws Throwable {
        a aVar;
        CollisionDataFields collisionDataFields;
        CollisionDataFields.InterfaceC4433a.DateTime crashDateField;
        final of3.b.Initialized initializedB;
        k10.c0<of3.b.Initialized> c0Var2;
        CollisionDataFields.InterfaceC4433a.Location location;
        CollisionDataFields.InterfaceC4433a.Input input;
        k10.c0<of3.b.Initialized> c0Var3;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f145205m;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f145205m = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f145203k;
        Object objE = uq.b.e();
        int i16 = aVar.f145205m;
        if (i16 != 0) {
            if (i16 == 1) {
                initializedB = (of3.b.Initialized) aVar.f145202j;
                input = (CollisionDataFields.InterfaceC4433a.Input) aVar.f145201h;
                location = (CollisionDataFields.InterfaceC4433a.Location) aVar.f145200g;
                CollisionDataFields.InterfaceC4433a.DateTime dateTime = (CollisionDataFields.InterfaceC4433a.DateTime) aVar.f145199f;
                collisionDataFields = (CollisionDataFields) aVar.f145198e;
                k10.c0<of3.b.Initialized> c0Var4 = (k10.c0) aVar.f145197d;
                oq.u.b(obj);
                crashDateField = dateTime;
                c0Var2 = c0Var4;
            } else {
                if (i16 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0Var3 = (k10.c0) aVar.f145197d;
                oq.u.b(obj);
            }
            return c0Var3.c();
        }
        oq.u.b(obj);
        collisionDataFields = c0Var.a().getCollisionDataFields();
        crashDateField = collisionDataFields.getCrashDateField();
        CollisionDataFields.InterfaceC4433a.Location crashLocationField = collisionDataFields.getCrashLocationField();
        final CollisionDataFields.InterfaceC4433a.Input inputD = CollisionDataFields.InterfaceC4433a.Input.d(collisionDataFields.getCrashDescriptionField(), null, null, iy.c0.g(dz.e.c(dz.e.e(iy.c0.e(collisionDataFields.getCrashDescriptionField().getValue())))), 3, null);
        initializedB = of3.b.Initialized.b(c0Var.a(), null, null, collisionDataFields.a(CollisionDataFields.InterfaceC4433a.DateTime.d(crashDateField, null, ba(crashDateField.getDateType(), c0Var.a().getMaxDate()), null, 5, null), CollisionDataFields.InterfaceC4433a.Location.d(crashLocationField, null, da(crashLocationField.getLocation()), null, 5, null), CollisionDataFields.InterfaceC4433a.Input.d(inputD, null, ca(inputD.getValue()), null, 5, null)), null, 11, null);
        pf3.a aVar2 = this.contract;
        er.l<? super BEVehicleCollisionDescriptionConception, BEVehicleCollisionDescriptionConception> lVar = new er.l() { // from class: of3.p
            @Override // er.l
            public final Object b(Object obj2) {
                return b0.H9(inputD, (BEVehicleCollisionDescriptionConception) obj2);
            }
        };
        c0Var2 = c0Var;
        aVar.f145197d = c0Var2;
        aVar.f145198e = vq.j.a(collisionDataFields);
        aVar.f145199f = vq.j.a(crashDateField);
        aVar.f145200g = vq.j.a(crashLocationField);
        aVar.f145201h = vq.j.a(inputD);
        aVar.f145202j = initializedB;
        aVar.f145205m = 1;
        if (aVar2.D4(lVar, aVar) != objE) {
            location = crashLocationField;
            input = inputD;
        }
        return objE;
        if (!initializedB.getCollisionDataFields().h()) {
            return c0Var2.b(new er.l() { // from class: of3.q
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.I9(initializedB, (b.Initialized) obj2);
                }
            });
        }
        aVar.f145197d = c0Var2;
        aVar.f145198e = vq.j.a(collisionDataFields);
        aVar.f145199f = vq.j.a(crashDateField);
        aVar.f145200g = vq.j.a(location);
        aVar.f145201h = vq.j.a(input);
        aVar.f145202j = vq.j.a(initializedB);
        aVar.f145205m = 2;
        if (J9(aVar) != objE) {
            c0Var3 = c0Var2;
            return c0Var3.c();
        }
        return objE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BEVehicleCollisionDescriptionConception H9(CollisionDataFields.InterfaceC4433a.Input input, BEVehicleCollisionDescriptionConception bEVehicleCollisionDescriptionConception) {
        return BEVehicleCollisionDescriptionConception.b(bEVehicleCollisionDescriptionConception, null, null, input.getValue(), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final of3.b.Initialized I9(of3.b.Initialized initialized, of3.b.Initialized initialized2) {
        CollisionDataFields.b bVarG = initialized.getCollisionDataFields().g();
        return of3.b.Initialized.b(initialized, null, null, null, bVarG != null ? new d60.j(bVarG) : null, 7, null);
    }

    private final Object J9(tq.e<? super oq.i0> eVar) {
        Object objA = ac4.a.a(this.withLoaderUseCase, null, new b(null), eVar, 1, null);
        return objA == uq.b.e() ? objA : oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final of3.c.a K9(of3.b bVar) {
        return this.mapper.b(new qf3.d.Params(bVar, b9(of3.a.C3602a.f145159a), b9(of3.a.c.f145170a), b9(of3.a.i.f145179a), b9(of3.a.f.f145175a), new er.l() { // from class: of3.u
            @Override // er.l
            public final Object b(Object obj) {
                return b0.L9(this.f145325a, (iy.b0) obj);
            }
        }, b9(of3.a.b.C3603a.f145160a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L9(b0 b0Var, iy.b0 b0Var2) {
        b0Var.d9(new of3.a.OnDescriptionChanged(b0Var2));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object M9(k10.c0<of3.b.Initialized> c0Var, fz.b.LocalDate localDate, tq.e<? super k10.l<of3.b.Initialized>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f145224k;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f145224k = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object obj = cVar.f145222h;
        Object objE = uq.b.e();
        int i16 = cVar.f145224k;
        if (i16 == 0) {
            oq.u.b(obj);
            LocalTime localTime = c0Var.a().getCollisionDataFields().getCrashDateField().getDateType().getDate().toLocalTime();
            final fz.b.LocalDateTime localDateTime = new fz.b.LocalDateTime(localDate.getDate().atTime(localTime));
            pf3.a aVar = this.contract;
            er.l<? super BEVehicleCollisionDescriptionConception, BEVehicleCollisionDescriptionConception> lVar = new er.l() { // from class: of3.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.N9(localDateTime, (BEVehicleCollisionDescriptionConception) obj2);
                }
            };
            cVar.f145218d = c0Var;
            cVar.f145219e = vq.j.a(localDate);
            cVar.f145220f = vq.j.a(localTime);
            cVar.f145221g = vq.j.a(localDateTime);
            cVar.f145224k = 1;
            if (aVar.D4(lVar, cVar) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0Var = (k10.c0) cVar.f145218d;
            oq.u.b(obj);
        }
        return c0Var.b(new er.l() { // from class: of3.y
            @Override // er.l
            public final Object b(Object obj2) {
                return b0.O9((b.Initialized) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BEVehicleCollisionDescriptionConception N9(fz.b.LocalDateTime localDateTime, BEVehicleCollisionDescriptionConception bEVehicleCollisionDescriptionConception) {
        return BEVehicleCollisionDescriptionConception.b(bEVehicleCollisionDescriptionConception, localDateTime, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final of3.b.Initialized O9(of3.b.Initialized initialized) {
        return of3.b.Initialized.b(initialized, null, null, CollisionDataFields.b(initialized.getCollisionDataFields(), CollisionDataFields.InterfaceC4433a.DateTime.d(initialized.getCollisionDataFields().getCrashDateField(), null, hz.b.C2039b.f86846c, null, 5, null), null, null, 6, null), null, 11, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object P9(k10.c0<of3.b.Initialized> c0Var, final of3.a.OnDescriptionChanged onDescriptionChanged, tq.e<? super k10.l<of3.b.Initialized>> eVar) throws Throwable {
        d dVar;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i15 = dVar.f145229h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f145229h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object obj = dVar.f145227f;
        Object objE = uq.b.e();
        int i16 = dVar.f145229h;
        if (i16 == 0) {
            oq.u.b(obj);
            pf3.a aVar = this.contract;
            er.l<? super BEVehicleCollisionDescriptionConception, BEVehicleCollisionDescriptionConception> lVar = new er.l() { // from class: of3.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.Q9(onDescriptionChanged, (BEVehicleCollisionDescriptionConception) obj2);
                }
            };
            dVar.f145225d = c0Var;
            dVar.f145226e = vq.j.a(onDescriptionChanged);
            dVar.f145229h = 1;
            if (aVar.D4(lVar, dVar) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0Var = (k10.c0) dVar.f145225d;
            oq.u.b(obj);
        }
        return c0Var.b(new er.l() { // from class: of3.w
            @Override // er.l
            public final Object b(Object obj2) {
                return b0.R9((b.Initialized) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BEVehicleCollisionDescriptionConception Q9(of3.a.OnDescriptionChanged onDescriptionChanged, BEVehicleCollisionDescriptionConception bEVehicleCollisionDescriptionConception) {
        return BEVehicleCollisionDescriptionConception.b(bEVehicleCollisionDescriptionConception, null, null, onDescriptionChanged.getDescription(), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final of3.b.Initialized R9(of3.b.Initialized initialized) {
        return of3.b.Initialized.b(initialized, null, null, CollisionDataFields.b(initialized.getCollisionDataFields(), null, null, CollisionDataFields.InterfaceC4433a.Input.d(initialized.getCollisionDataFields().getCrashDescriptionField(), null, hz.b.C2039b.f86846c, null, 5, null), 3, null), null, 11, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object S9(k10.c0<of3.b.Initialized> c0Var, fz.b.OffsetTime offsetTime, tq.e<? super k10.l<of3.b.Initialized>> eVar) throws Throwable {
        e eVar2;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f145235j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f145235j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object obj = eVar2.f145233g;
        Object objE = uq.b.e();
        int i16 = eVar2.f145235j;
        if (i16 == 0) {
            oq.u.b(obj);
            final fz.b.LocalDateTime localDateTime = new fz.b.LocalDateTime(c0Var.a().getCollisionDataFields().getCrashDateField().getDateType().getDate().withSecond(offsetTime.getDate().getSecond()).withMinute(offsetTime.getDate().getMinute()).withHour(offsetTime.getDate().getHour()));
            pf3.a aVar = this.contract;
            er.l<? super BEVehicleCollisionDescriptionConception, BEVehicleCollisionDescriptionConception> lVar = new er.l() { // from class: of3.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.T9(localDateTime, (BEVehicleCollisionDescriptionConception) obj2);
                }
            };
            eVar2.f145230d = c0Var;
            eVar2.f145231e = vq.j.a(offsetTime);
            eVar2.f145232f = vq.j.a(localDateTime);
            eVar2.f145235j = 1;
            if (aVar.D4(lVar, eVar2) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0Var = (k10.c0) eVar2.f145230d;
            oq.u.b(obj);
        }
        return c0Var.b(new er.l() { // from class: of3.a0
            @Override // er.l
            public final Object b(Object obj2) {
                return b0.U9((b.Initialized) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BEVehicleCollisionDescriptionConception T9(fz.b.LocalDateTime localDateTime, BEVehicleCollisionDescriptionConception bEVehicleCollisionDescriptionConception) {
        return BEVehicleCollisionDescriptionConception.b(bEVehicleCollisionDescriptionConception, localDateTime, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final of3.b.Initialized U9(of3.b.Initialized initialized) {
        return of3.b.Initialized.b(initialized, null, null, CollisionDataFields.b(initialized.getCollisionDataFields(), CollisionDataFields.InterfaceC4433a.DateTime.d(initialized.getCollisionDataFields().getCrashDateField(), null, hz.b.C2039b.f86846c, null, 5, null), null, null, 6, null), null, 11, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W9(final b0 b0Var, k10.v vVar) {
        vVar.c(q0.c(of3.b.class), new er.l() { // from class: of3.o
            @Override // er.l
            public final Object b(Object obj) {
                return b0.X9(this.f145319a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(of3.b.a.class), new er.l() { // from class: of3.s
            @Override // er.l
            public final Object b(Object obj) {
                return b0.Y9(this.f145323a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(of3.b.Initialized.class), new er.l() { // from class: of3.t
            @Override // er.l
            public final Object b(Object obj) {
                return b0.Z9(this.f145324a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X9(b0 b0Var, k10.z zVar) {
        h hVar = b0Var.new h(null);
        zVar.x(q0.c(of3.a.b.class), k10.o.CANCEL_PREVIOUS, hVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Y9(b0 b0Var, k10.z zVar) {
        i iVar = b0Var.new i(null);
        zVar.v(q0.c(of3.a.OnSummaryDataChanged.class), k10.o.CANCEL_PREVIOUS, iVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Z9(b0 b0Var, k10.z zVar) {
        j jVar = new j(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(of3.a.OnSummaryDataChanged.class), oVar, jVar);
        zVar.v(q0.c(of3.a.OnDayChanged.class), oVar, b0Var.new k(null));
        zVar.v(q0.c(of3.a.OnTimeChanged.class), oVar, b0Var.new l(null));
        zVar.v(q0.c(of3.a.OnDescriptionChanged.class), oVar, b0Var.new m(null));
        zVar.v(q0.c(of3.a.C3602a.class), oVar, b0Var.new n(null));
        zVar.x(q0.c(of3.a.c.class), oVar, b0Var.new o(null));
        zVar.v(q0.c(of3.a.f.class), oVar, b0Var.new p(null));
        zVar.x(q0.c(of3.a.i.class), oVar, b0Var.new q(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dx.i<dx.b, NewVehicleCollisionDescription> aa(BEVehicleCollisionDescriptionConception bEVehicleCollisionDescriptionConception) {
        Object objB;
        String strG;
        Coordinates coordinatesB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ProcessId processId = (ProcessId) new ex.a().a(this.contract.e());
                    fz.b.LocalDateTime date = bEVehicleCollisionDescriptionConception.getDate();
                    iy.b0 description = bEVehicleCollisionDescriptionConception.getDescription();
                    BEVehicleCollisionDescriptionConception.LocationDetails address = bEVehicleCollisionDescriptionConception.getAddress();
                    if (address == null || (strG = address.g()) == null) {
                        strG = "";
                    }
                    iy.b0 b0VarG = iy.c0.g(strG);
                    BEVehicleCollisionDescriptionConception.LocationDetails address2 = bEVehicleCollisionDescriptionConception.getAddress();
                    if (address2 == null || (coordinatesB = address2.getCoordinates()) == null) {
                        coordinatesB = t04.b.f186822a.b();
                    }
                    return new dx.i.Right(new NewVehicleCollisionDescription(processId, date, description, b0VarG, coordinatesB));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
            String message = e18.getMessage();
            fVar.d(message != null ? message : "", e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof dx.i.Left) {
                objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
            } else {
                if (!(objA instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                objB = ((dx.i.Right) objA).b();
            }
            return new dx.i.Left(objB);
        }
    }

    private final hz.b ba(fz.b.LocalDateTime crashDate, fz.b.LocalDateTime maxDate) {
        boolean z15 = crashDate.getDate().compareTo((ChronoLocalDateTime<?>) maxDate.getDate()) < 0;
        if (z15) {
            return hz.b.d.f86848c;
        }
        if (z15) {
            throw new oq.p();
        }
        return new hz.b.Invalid(this.labelProvider.c(md3.b.C3));
    }

    private final hz.b ca(iy.b0 description) {
        return hz.b.INSTANCE.a(this.validDescriptionUseCase.b(new ae3.y.Param(description)));
    }

    private final hz.b da(BEVehicleCollisionDescriptionConception.LocationDetails location) {
        boolean z15 = location == null;
        if (z15) {
            return new hz.b.Invalid(this.labelProvider.c(md3.b.f125863x3));
        }
        if (z15) {
            throw new oq.p();
        }
        return hz.b.d.f86848c;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: F9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(of3.a.b bVar, tq.e<? super oq.i0> eVar) {
        return super.F(bVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: V9, reason: merged with bridge method [inline-methods] */
    public void P5(pf3.a data) {
        i00.a.a(this, new f(null));
    }

    @Override // zx.b
    public xw.b<of3.a.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<of3.b, of3.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<of3.c.a> getState() {
        return this.state;
    }
}
