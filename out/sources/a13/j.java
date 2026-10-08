package a13;

import ac4.r;
import er.q;
import fr.q0;
import k10.c0;
import k10.o;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import x03.SetupData;
import z03.SafeBusPlatePayload;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B7\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR&\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030 8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010,\u001a\b\u0012\u0004\u0012\u00020'0&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00062"}, d2 = {"La13/j;", "Ll00/g;", "La13/b;", "La13/a;", "La13/c;", "", "Lyy/a;", "stateMachineFactory", "Lq03/e;", "findPlateNumberUseCase", "Lb13/a;", "safeBusPlateScannerMapper", "Lsz/d;", "cameraPreviewViewConnector", "Lac4/r;", "", "scanCameraUseCase", "<init>", "(Lyy/a;Lq03/e;Lb13/a;Lsz/d;Lac4/r;)V", "state", "La13/c$a;", "l9", "(La13/b;)La13/c$a;", "b", "Lq03/e;", "c", "Lb13/a;", "d", "Lac4/r;", "e", "La13/b;", "initialState", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "La13/a$b;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "safebus_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j extends l00.g<State, a13.a> implements a13.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q03.e findPlateNumberUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final b13.a safeBusPlateScannerMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final r<String> scanCameraUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t<State, a13.a> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<a13.a.b> navAction;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<a13.c.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<a13.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f1300a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f1301b;

        /* JADX INFO: renamed from: a13.j$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0015a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f1302a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ j f1303b;

            /* JADX INFO: renamed from: a13.j$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0016a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f1304d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f1305e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f1306f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f1308h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f1309j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f1310k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f1311l;

                public C0016a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f1304d = obj;
                    this.f1305e |= PKIFailureInfo.systemUnavail;
                    return C0015a.this.F(null, this);
                }
            }

            public C0015a(mu.h hVar, j jVar) {
                this.f1302a = hVar;
                this.f1303b = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0016a c0016a;
                if (eVar instanceof C0016a) {
                    c0016a = (C0016a) eVar;
                    int i15 = c0016a.f1305e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0016a.f1305e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0016a = new C0016a(eVar);
                    }
                } else {
                    c0016a = new C0016a(eVar);
                }
                Object obj2 = c0016a.f1304d;
                Object objE = uq.b.e();
                int i16 = c0016a.f1305e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f1302a;
                    a13.c.Data dataL9 = this.f1303b.l9((State) obj);
                    c0016a.f1306f = vq.j.a(obj);
                    c0016a.f1308h = vq.j.a(c0016a);
                    c0016a.f1309j = vq.j.a(obj);
                    c0016a.f1310k = vq.j.a(hVar);
                    c0016a.f1311l = 0;
                    c0016a.f1305e = 1;
                    if (hVar.F(dataL9, c0016a) == objE) {
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

        public a(mu.g gVar, j jVar) {
            this.f1300a = gVar;
            this.f1301b = jVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super a13.c.Data> hVar, tq.e eVar) {
            Object objA = this.f1300a.a(new C0015a(hVar, this.f1301b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"La13/a$a;", "<unused var>", "La13/b;", "Loq/i0;", "<anonymous>", "(La13/a$a;La13/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<a13.a.C0012a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f1312e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f1312e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<a13.a.b> bVarY1 = j.this.Y1();
                a13.a.b.C0013a c0013a = a13.a.b.C0013a.f1268a;
                this.f1312e = 1;
                if (bVarY1.F(c0013a, this) == objE) {
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
        public final Object w(a13.a.C0012a c0012a, State state, tq.e<? super i0> eVar) {
            return j.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"La13/a$c;", "action", "La13/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(La13/a$c;La13/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<a13.a.PlateAccept, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f1314e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f1315f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            a13.a.PlateAccept plateAccept = (a13.a.PlateAccept) this.f1315f;
            Object objE = uq.b.e();
            int i15 = this.f1314e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<a13.a.b> bVarY1 = j.this.Y1();
                String plate = plateAccept.getPlate();
                StringBuilder sb5 = new StringBuilder();
                for (int i16 = 0; i16 < plate.length(); i16++) {
                    char cCharAt = plate.charAt(i16);
                    if (!fu.a.c(cCharAt)) {
                        sb5.append(cCharAt);
                    }
                }
                a13.a.b.BackWithResult backWithResult = new a13.a.b.BackWithResult(new SetupData(new SafeBusPlatePayload(uv0.d.c(sb5.toString()), null)));
                this.f1315f = vq.j.a(plateAccept);
                this.f1314e = 1;
                if (bVarY1.F(backWithResult, this) == objE) {
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
        public final Object w(a13.a.PlateAccept plateAccept, State state, tq.e<? super i0> eVar) {
            c cVar = j.this.new c(eVar);
            cVar.f1315f = plateAccept;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ldx/i;", "Ldx/b;", "", "data", "La13/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ldx/i;La13/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements q<dx.i<? extends dx.b, ? extends String>, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f1317e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f1318f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            dx.i iVar = (dx.i) this.f1318f;
            uq.b.e();
            if (this.f1317e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            if (iVar instanceof dx.i.Right) {
                j.this.d9(new a13.a.PlateScanned((String) ((dx.i.Right) iVar).b()));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(dx.i<? extends dx.b, String> iVar, State state, tq.e<? super i0> eVar) {
            d dVar = j.this.new d(eVar);
            dVar.f1318f = iVar;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"La13/a$d;", "action", "Lk10/c0;", "La13/b;", "state", "Lk10/l;", "<anonymous>", "(La13/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements q<a13.a.PlateScanned, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f1320e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f1321f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f1322g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(String str, State state) {
            return State.b(state, str, null, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.l lVarB;
            a13.a.PlateScanned plateScanned = (a13.a.PlateScanned) this.f1321f;
            c0 c0Var = (c0) this.f1322g;
            Object objE = uq.b.e();
            int i15 = this.f1320e;
            if (i15 == 0) {
                u.b(obj);
                q03.e eVar = j.this.findPlateNumberUseCase;
                q03.e.Params params = new q03.e.Params(plateScanned.getOcrText());
                this.f1321f = vq.j.a(plateScanned);
                this.f1322g = c0Var;
                this.f1320e = 1;
                obj = eVar.d(params, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            uv0.d dVar = (uv0.d) obj;
            final String value = dVar != null ? dVar.getValue() : null;
            return (value == null || (lVarB = c0Var.b(new er.l() { // from class: a13.k
                @Override // er.l
                public final Object b(Object obj2) {
                    return j.e.O(value, (State) obj2);
                }
            })) == null) ? c0Var.c() : lVarB;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a13.a.PlateScanned plateScanned, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = j.this.new e(eVar);
            eVar2.f1321f = plateScanned;
            eVar2.f1322g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    public j(yy.a aVar, q03.e eVar, b13.a aVar2, sz.d dVar, r<String> rVar) {
        this.findPlateNumberUseCase = eVar;
        this.safeBusPlateScannerMapper = aVar2;
        this.scanCameraUseCase = rVar;
        State state = new State(null, dVar, 1, null);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: a13.h
            @Override // er.l
            public final Object b(Object obj) {
                return j.n9(this.f1291a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), l9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a13.c.Data l9(State state) {
        return this.safeBusPlateScannerMapper.b(new b13.a.Params(state, b9(a13.a.C0012a.f1267a), b9(new a13.a.PlateAccept(state.getPlate(), null))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(final j jVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: a13.i
            @Override // er.l
            public final Object b(Object obj) {
                return j.o9(this.f1292a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(j jVar, z zVar) {
        b bVar = jVar.new b(null);
        o oVar = o.CANCEL_PREVIOUS;
        zVar.x(q0.c(a13.a.C0012a.class), oVar, bVar);
        zVar.x(q0.c(a13.a.PlateAccept.class), oVar, jVar.new c(null));
        k10.k.s(zVar, (mu.g) jVar.scanCameraUseCase.a(new sx.b.Analyzer(sx.d.BACK, 0.0f, sx.e.c.f185178a, 2, null)), null, jVar.new d(null), 2, null);
        zVar.v(q0.c(a13.a.PlateScanned.class), oVar, jVar.new e(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<a13.a.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, a13.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<a13.c.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: m9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
