package ke3;

import ae3.f0;
import ae3.h0;
import cb4.DialogButtonTextData;
import cb4.DialogData;
import fr.q0;
import iy.b0;
import java.util.Locale;
import k10.c0;
import me3.AddVehicleManualFields;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import sv0.ProcessId;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00032\u00020\u0005Bc\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0001\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u0002*\u00020\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020)2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b*\u0010+J\u0013\u0010-\u001a\u00020,*\u00020\u0002H\u0002¢\u0006\u0004\b-\u0010.J\u0018\u00101\u001a\u00020\u001f2\u0006\u00100\u001a\u00020/H\u0096\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u001fH\u0096\u0001¢\u0006\u0004\b3\u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u0016\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010H\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR&\u0010N\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030I8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR \u0010U\u001a\b\u0012\u0004\u0012\u00020P0O8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR \u0010[\u001a\b\u0012\u0004\u0012\u00020,0V8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z¨\u0006\\"}, d2 = {"Lke3/t;", "Ll00/g;", "Lke3/f;", "", "Lke3/g;", "Li70/e;", "Lyy/a;", "stateMachineFactory", "Lmx/c;", "labelProvider", "Lle3/c;", "mapper", "Lib4/c;", "genericDomainErrorMapper", "Lae3/f0;", "validVehicleRegistrationNumberUC", "Lae3/h0;", "validVehicleVinUC", "Lac4/a;", "loaderUseCase", "Law0/y;", "getVehicleUC", "globalSnackBarManager", "Lvm3/a;", "vehicleTypeMapper", "Lsv0/y;", "processId", "<init>", "(Lyy/a;Lmx/c;Lle3/c;Lib4/c;Lae3/f0;Lae3/h0;Lac4/a;Law0/y;Li70/e;Lvm3/a;Lsv0/y;)V", "H9", "(Lke3/f;)Lke3/f;", "Loq/i0;", "E9", "()V", "Ldx/b;", "error", "z9", "(Ldx/b;)V", "Lke3/c$c;", "x9", "()Lke3/c$c;", "Lke3/c$b;", "v9", "(Ldx/b;)Lke3/c$b;", "Lke3/g$a;", "A9", "(Lke3/f;)Lke3/g$a;", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "b", "Lmx/c;", "c", "Lle3/c;", "d", "Lib4/c;", "e", "Lae3/f0;", "f", "Lae3/h0;", "g", "Lac4/a;", "h", "Law0/y;", "j", "Li70/e;", "k", "Lvm3/a;", "l", "Lke3/f;", "initialState", "Lk10/t;", "m", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lke3/c;", "n", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "p", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t extends l00.g<State, Object> implements g, zx.d, i70.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final le3.c mapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final f0 validVehicleRegistrationNumberUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final h0 validVehicleVinUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ac4.a loaderUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final aw0.y getVehicleUC;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final vm3.a vehicleTypeMapper;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ke3.c> navAction;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final p0<g.Data> state;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f110378e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ dx.b f110380g;

        /* JADX INFO: renamed from: ke3.t$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C2644a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f110381a;

            static {
                int[] iArr = new int[dx.b.g.Http.a.values().length];
                try {
                    iArr[dx.b.g.Http.a.BAD_REQUEST.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[dx.b.g.Http.a.NOT_FOUND.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f110381a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(dx.b bVar, tq.e<? super a> eVar) {
            super(1, eVar);
            this.f110380g = bVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ke3.c cVarX9;
            Object objE = uq.b.e();
            int i15 = this.f110378e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ke3.c> bVarY1 = t.this.Y1();
                dx.b bVar = this.f110380g;
                if (bVar instanceof dx.b.g.Http) {
                    int i16 = C2644a.f110381a[((dx.b.g.Http) bVar).getCode().ordinal()];
                    cVarX9 = (i16 == 1 || i16 == 2) ? t.this.x9() : t.this.v9(this.f110380g);
                } else {
                    cVarX9 = bVar instanceof dx.b.g.c ? t.this.x9() : t.this.v9(bVar);
                }
                this.f110378e = 1;
                if (bVarY1.F(cVarX9, this) == objE) {
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

        public final tq.e<i0> M(tq.e<?> eVar) {
            return t.this.new a(this.f110380g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((a) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<g.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f110382a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t f110383b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f110384a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ t f110385b;

            /* JADX INFO: renamed from: ke3.t$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2645a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f110386d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f110387e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f110388f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f110390h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f110391j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f110392k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f110393l;

                public C2645a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f110386d = obj;
                    this.f110387e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, t tVar) {
                this.f110384a = hVar;
                this.f110385b = tVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2645a c2645a;
                if (eVar instanceof C2645a) {
                    c2645a = (C2645a) eVar;
                    int i15 = c2645a.f110387e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2645a.f110387e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2645a = new C2645a(eVar);
                    }
                } else {
                    c2645a = new C2645a(eVar);
                }
                Object obj2 = c2645a.f110386d;
                Object objE = uq.b.e();
                int i16 = c2645a.f110387e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f110384a;
                    g.Data dataA9 = this.f110385b.A9((State) obj);
                    c2645a.f110388f = vq.j.a(obj);
                    c2645a.f110390h = vq.j.a(c2645a);
                    c2645a.f110391j = vq.j.a(obj);
                    c2645a.f110392k = vq.j.a(hVar);
                    c2645a.f110393l = 0;
                    c2645a.f110387e = 1;
                    if (hVar.F(dataA9, c2645a) == objE) {
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
            this.f110382a = gVar;
            this.f110383b = tVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super g.Data> hVar, tq.e eVar) {
            Object objA = this.f110382a.a(new a(hVar, this.f110383b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lke3/b;", "<unused var>", "Lke3/f;", "Loq/i0;", "<anonymous>", "(Lke3/b;Lke3/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<ke3.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f110394e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f110394e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ke3.c> bVarY1 = t.this.Y1();
                ke3.c.a aVar = ke3.c.a.f110333a;
                this.f110394e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(ke3.b bVar, State state, tq.e<? super i0> eVar) {
            return t.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lke3/d;", "action", "Lk10/c0;", "Lke3/f;", "state", "Lk10/l;", "<anonymous>", "(Lke3/d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<RegistrationNumberChanged, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f110396e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f110397f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f110398g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(c0 c0Var, RegistrationNumberChanged registrationNumberChanged, State state) {
            AddVehicleManualFields addVehicleManualFields = ((State) c0Var.a()).getAddVehicleManualFields();
            return State.b(state, AddVehicleManualFields.b(addVehicleManualFields, AddVehicleManualFields.Data.b(addVehicleManualFields.getRegistrationNumberField(), null, hz.b.C2039b.f86846c, iy.c0.g(iy.c0.e(registrationNumberChanged.getRegistrationNumber()).toUpperCase(Locale.ROOT)), 1, null), null, 2, null), null, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final RegistrationNumberChanged registrationNumberChanged = (RegistrationNumberChanged) this.f110397f;
            final c0 c0Var = (c0) this.f110398g;
            uq.b.e();
            if (this.f110396e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ke3.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.d.O(c0Var, registrationNumberChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(RegistrationNumberChanged registrationNumberChanged, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f110397f = registrationNumberChanged;
            dVar.f110398g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lke3/e;", "action", "Lk10/c0;", "Lke3/f;", "state", "Lk10/l;", "<anonymous>", "(Lke3/e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<VinChanged, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f110399e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f110400f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f110401g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(c0 c0Var, VinChanged vinChanged, State state) {
            AddVehicleManualFields addVehicleManualFields = ((State) c0Var.a()).getAddVehicleManualFields();
            return State.b(state, AddVehicleManualFields.b(addVehicleManualFields, null, AddVehicleManualFields.Data.b(addVehicleManualFields.getVinNumberField(), null, hz.b.C2039b.f86846c, iy.c0.g(iy.c0.e(vinChanged.getVin()).toUpperCase(Locale.ROOT)), 1, null), 1, null), null, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final VinChanged vinChanged = (VinChanged) this.f110400f;
            final c0 c0Var = (c0) this.f110401g;
            uq.b.e();
            if (this.f110399e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ke3.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.e.O(c0Var, vinChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(VinChanged vinChanged, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f110400f = vinChanged;
            eVar2.f110401g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lke3/a;", "<unused var>", "Lk10/c0;", "Lke3/f;", "state", "Lk10/l;", "<anonymous>", "(Lke3/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<ke3.a, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f110402e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f110403f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f110404g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ ProcessId f110406j;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f110407e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f110408f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f110409g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f110410h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f110411j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f110412k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ t f110413l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ State f110414m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ ProcessId f110415n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(t tVar, State state, ProcessId processId, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f110413l = tVar;
                this.f110414m = state;
                this.f110415n = processId;
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x00b2, code lost:
            
                if (r1.F(r5, r7) == r0) goto L20;
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
                    int r1 = r7.f110412k
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L2b
                    if (r1 == r3) goto L27
                    if (r1 != r2) goto L1f
                    java.lang.Object r0 = r7.f110409g
                    tv0.k r0 = (tv0.BEVehicleDataWithType) r0
                    java.lang.Object r0 = r7.f110408f
                    sv0.e r0 = (sv0.BEVehicleData) r0
                    java.lang.Object r0 = r7.f110407e
                    dx.i r0 = (dx.i) r0
                    oq.u.b(r8)
                    goto Lb5
                L1f:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L27:
                    oq.u.b(r8)
                    goto L60
                L2b:
                    oq.u.b(r8)
                    ke3.t r8 = r7.f110413l
                    aw0.y r8 = ke3.t.o9(r8)
                    aw0.y$a r1 = new aw0.y$a
                    ke3.f r4 = r7.f110414m
                    me3.a r4 = r4.getAddVehicleManualFields()
                    me3.a$a r4 = r4.getRegistrationNumberField()
                    iy.b0 r4 = r4.getValue()
                    ke3.f r5 = r7.f110414m
                    me3.a r5 = r5.getAddVehicleManualFields()
                    me3.a$a r5 = r5.getVinNumberField()
                    iy.b0 r5 = r5.getValue()
                    sv0.y r6 = r7.f110415n
                    r1.<init>(r4, r5, r6)
                    r7.f110412k = r3
                    java.lang.Object r8 = r8.c(r1, r7)
                    if (r8 != r0) goto L60
                    goto Lb4
                L60:
                    dx.i r8 = (dx.i) r8
                    ke3.t r1 = r7.f110413l
                    boolean r3 = r8 instanceof dx.i.Left
                    if (r3 == 0) goto L74
                    dx.i$b r8 = (dx.i.Left) r8
                    java.lang.Object r8 = r8.b()
                    dx.b r8 = (dx.b) r8
                    ke3.t.r9(r1, r8)
                    goto Lb5
                L74:
                    boolean r3 = r8 instanceof dx.i.Right
                    if (r3 == 0) goto Lb8
                    r3 = r8
                    dx.i$c r3 = (dx.i.Right) r3
                    java.lang.Object r3 = r3.b()
                    sv0.e r3 = (sv0.BEVehicleData) r3
                    vm3.a r4 = ke3.t.q9(r1)
                    tv0.k r4 = xd3.a.c(r3, r4)
                    ke3.t.t9(r1)
                    xw.b r1 = r1.Y1()
                    ke3.c$d r5 = new ke3.c$d
                    r5.<init>(r4)
                    java.lang.Object r8 = vq.j.a(r8)
                    r7.f110407e = r8
                    java.lang.Object r8 = vq.j.a(r3)
                    r7.f110408f = r8
                    java.lang.Object r8 = vq.j.a(r4)
                    r7.f110409g = r8
                    r8 = 0
                    r7.f110410h = r8
                    r7.f110411j = r8
                    r7.f110412k = r2
                    java.lang.Object r8 = r1.F(r5, r7)
                    if (r8 != r0) goto Lb5
                Lb4:
                    return r0
                Lb5:
                    oq.i0 r8 = oq.i0.f148189a
                    return r8
                Lb8:
                    oq.p r8 = new oq.p
                    r8.<init>()
                    throw r8
                */
                throw new UnsupportedOperationException("Method not decompiled: ke3.t.f.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f110413l, this.f110414m, this.f110415n, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super i0> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(ProcessId processId, tq.e<? super f> eVar) {
            super(3, eVar);
            this.f110406j = processId;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state, State state2) {
            AddVehicleManualFields.b bVarD = state.getAddVehicleManualFields().d();
            return State.b(state, null, bVarD != null ? new d60.j(bVarD) : null, 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f110404g;
            Object objE = uq.b.e();
            int i15 = this.f110403f;
            if (i15 == 0) {
                oq.u.b(obj);
                final State stateH9 = t.this.H9((State) c0Var.a());
                if (!stateH9.getAddVehicleManualFields().g()) {
                    return c0Var.b(new er.l() { // from class: ke3.w
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return t.f.O(stateH9, (State) obj2);
                        }
                    });
                }
                ac4.a aVar = t.this.loaderUseCase;
                a aVar2 = new a(t.this, stateH9, this.f110406j, null);
                this.f110404g = c0Var;
                this.f110402e = vq.j.a(stateH9);
                this.f110403f = 1;
                if (ac4.a.a(aVar, null, aVar2, this, 1, null) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ke3.a aVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            f fVar = t.this.new f(this.f110406j, eVar);
            fVar.f110404g = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    public t(yy.a aVar, mx.c cVar, le3.c cVar2, ib4.c cVar3, f0 f0Var, h0 h0Var, ac4.a aVar2, aw0.y yVar, i70.e eVar, vm3.a aVar3, final ProcessId processId) {
        this.labelProvider = cVar;
        this.mapper = cVar2;
        this.genericDomainErrorMapper = cVar3;
        this.validVehicleRegistrationNumberUC = f0Var;
        this.validVehicleVinUC = h0Var;
        this.loaderUseCase = aVar2;
        this.getVehicleUC = yVar;
        this.globalSnackBarManager = eVar;
        this.vehicleTypeMapper = aVar3;
        AddVehicleManualFields.b bVar = AddVehicleManualFields.b.REGISTRATION_NUMBER;
        b0.Companion companion = b0.INSTANCE;
        State state = new State(new AddVehicleManualFields(new AddVehicleManualFields.Data(bVar, null, companion.a(), 2, null), new AddVehicleManualFields.Data(AddVehicleManualFields.b.VIN_NUMBER, null, companion.a(), 2, null)), null, 2, null);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: ke3.s
            @Override // er.l
            public final Object b(Object obj) {
                return t.F9(this.f110363a, processId, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new b(e9().getState(), this), A9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g.Data A9(State state) {
        return this.mapper.b(new le3.c.Params(state, new er.l() { // from class: ke3.n
            @Override // er.l
            public final Object b(Object obj) {
                return t.B9(this.f110358a, (b0) obj);
            }
        }, new er.l() { // from class: ke3.o
            @Override // er.l
            public final Object b(Object obj) {
                return t.C9(this.f110359a, (b0) obj);
            }
        }, b9(ke3.a.f110331a), b9(ke3.b.f110332a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(t tVar, b0 b0Var) {
        tVar.d9(new RegistrationNumberChanged(b0Var));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(t tVar, b0 b0Var) {
        tVar.d9(new VinChanged(b0Var));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E9() {
        y(new p50.a.Default(this.labelProvider.c(md3.b.f125834t6), false, null, 6, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F9(final t tVar, final ProcessId processId, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: ke3.p
            @Override // er.l
            public final Object b(Object obj) {
                return t.G9(this.f110360a, processId, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G9(t tVar, ProcessId processId, k10.z zVar) {
        c cVar = tVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(ke3.b.class), oVar, cVar);
        zVar.v(q0.c(RegistrationNumberChanged.class), oVar, new d(null));
        zVar.v(q0.c(VinChanged.class), oVar, new e(null));
        zVar.v(q0.c(ke3.a.class), oVar, tVar.new f(processId, null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final State H9(State state) {
        AddVehicleManualFields addVehicleManualFields = state.getAddVehicleManualFields();
        AddVehicleManualFields.Data registrationNumberField = addVehicleManualFields.getRegistrationNumberField();
        hz.b.Companion companion = hz.b.INSTANCE;
        AddVehicleManualFields.Data dataB = AddVehicleManualFields.Data.b(registrationNumberField, null, companion.a(this.validVehicleRegistrationNumberUC.b(new f0.Params(registrationNumberField.getValue()))), null, 5, null);
        AddVehicleManualFields.Data vinNumberField = addVehicleManualFields.getVinNumberField();
        return State.b(state, addVehicleManualFields.a(dataB, AddVehicleManualFields.Data.b(vinNumberField, null, companion.a(this.validVehicleVinUC.e(new h0.Params(vinNumberField.getValue()))), null, 5, null)), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ke3.c.Error v9(dx.b error) {
        return new ke3.c.Error(this.genericDomainErrorMapper.b(new ib4.c.Params(error, false, new er.l() { // from class: ke3.r
            @Override // er.l
            public final Object b(Object obj) {
                return t.w9(this.f110362a, (ib4.c.b) obj);
            }
        }, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(t tVar, ib4.c.b bVar) {
        if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
            tVar.d9(ke3.a.f110331a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ke3.c.ShowNavigationDialog x9() {
        mx.c cVar = this.labelProvider;
        return new ke3.c.ShowNavigationDialog(new DialogData(cb4.h.b.f24985a, cVar.c(md3.b.f125805q1), cVar.c(md3.b.f125797p1), new DialogButtonTextData(cVar.c(md3.b.f125731h), null, new er.a() { // from class: ke3.q
            @Override // er.a
            public final Object a() {
                return t.y9();
            }
        }, 2, null), null, null, null, 112, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z9(dx.b error) {
        i00.a.a(this, new a(error, null));
    }

    @Override // i70.e
    public void B0() {
        this.globalSnackBarManager.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: D9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(ProcessId processId) {
        super.P5(processId);
    }

    @Override // zx.b
    public xw.b<ke3.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<g.Data> getState() {
        return this.state;
    }

    @Override // i70.e
    public void y(p50.a snackBarData) {
        this.globalSnackBarManager.y(snackBarData);
    }
}
