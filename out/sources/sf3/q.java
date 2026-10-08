package sf3;

import cb4.DialogButtonTextData;
import cb4.DialogData;
import fr.q0;
import iy.b0;
import iy.c0;
import k10.z;
import ki3.ShowLocalizationModel;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import sv0.ProcessId;
import vy.Coordinates;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BK\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b!\u0010\"J\u0013\u0010$\u001a\u00020#*\u00020\u0002H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020 2\u0006\u0010&\u001a\u00020\u0014H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00109\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R&\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030:8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R \u0010F\u001a\b\u0012\u0004\u0012\u00020A0@8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020#0G8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K¨\u0006L"}, d2 = {"Lsf3/q;", "Ll00/g;", "Lsf3/d;", "Lsf3/a;", "Lsf3/e;", "", "Lyy/a;", "stateMachineFactory", "Luf3/a;", "mapper", "Lib4/c;", "domainErrorMapper", "Lbe3/e;", "internalConfirmInitialInfoUC", "Lbe3/g;", "internalRejectInitialInfoUC", "Lmx/c;", "labelProvider", "Lde3/d;", "isWrongStateErrorUC", "Lsf3/c;", "setupData", "<init>", "(Lyy/a;Luf3/a;Lib4/c;Lbe3/e;Lbe3/g;Lmx/c;Lde3/d;Lsf3/c;)V", "Lk10/c0;", "state", "Lk10/l;", "A9", "(Lk10/c0;)Lk10/l;", "Ldx/b;", "domainError", "retryAction", "Loq/i0;", "w9", "(Ldx/b;Lsf3/a;Ltq/e;)Ljava/lang/Object;", "Lsf3/e$a;", "y9", "(Lsf3/d;)Lsf3/e$a;", "data", "D9", "(Lsf3/c;)V", "b", "Luf3/a;", "c", "Lib4/c;", "d", "Lbe3/e;", "e", "Lbe3/g;", "f", "Lmx/c;", "g", "Lde3/d;", "h", "Lsf3/c;", "j", "Lsf3/d;", "initialState", "Lk10/t;", "k", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lsf3/a$b;", "l", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "m", "Lmu/p0;", "getState", "()Lmu/p0;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q extends l00.g<State, sf3.a> implements sf3.e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final uf3.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ib4.c domainErrorMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final be3.e internalConfirmInitialInfoUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final be3.g internalRejectInitialInfoUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final de3.d isWrongStateErrorUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, sf3.a> stateMachine;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final xw.b<sf3.a.b> navAction;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final p0<sf3.e.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<sf3.e.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f181389a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f181390b;

        /* JADX INFO: renamed from: sf3.q$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4665a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f181391a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ q f181392b;

            /* JADX INFO: renamed from: sf3.q$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4666a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f181393d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f181394e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f181395f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f181397h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f181398j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f181399k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f181400l;

                public C4666a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f181393d = obj;
                    this.f181394e |= PKIFailureInfo.systemUnavail;
                    return C4665a.this.F(null, this);
                }
            }

            public C4665a(mu.h hVar, q qVar) {
                this.f181391a = hVar;
                this.f181392b = qVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4666a c4666a;
                if (eVar instanceof C4666a) {
                    c4666a = (C4666a) eVar;
                    int i15 = c4666a.f181394e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4666a.f181394e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4666a = new C4666a(eVar);
                    }
                } else {
                    c4666a = new C4666a(eVar);
                }
                Object obj2 = c4666a.f181393d;
                Object objE = uq.b.e();
                int i16 = c4666a.f181394e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f181391a;
                    sf3.e.Data dataY9 = this.f181392b.y9((State) obj);
                    c4666a.f181395f = vq.j.a(obj);
                    c4666a.f181397h = vq.j.a(c4666a);
                    c4666a.f181398j = vq.j.a(obj);
                    c4666a.f181399k = vq.j.a(hVar);
                    c4666a.f181400l = 0;
                    c4666a.f181394e = 1;
                    if (hVar.F(dataY9, c4666a) == objE) {
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

        public a(mu.g gVar, q qVar) {
            this.f181389a = gVar;
            this.f181390b = qVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super sf3.e.Data> hVar, tq.e eVar) {
            Object objA = this.f181389a.a(new C4665a(hVar, this.f181390b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lsf3/a$e;", "<unused var>", "Lsf3/d;", "state", "Loq/i0;", "<anonymous>", "(Lsf3/a$e;Lsf3/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<sf3.a.e, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f181401e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f181402f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f181403g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f181404h;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f181404h;
            Object objE = uq.b.e();
            int i15 = this.f181403g;
            if (i15 == 0) {
                oq.u.b(obj);
                Coordinates coordinates = state.getData().getCollisionCreatedDescription().getCoordinates();
                b0 localizationDescription = state.getData().getCollisionCreatedDescription().getLocalizationDescription();
                if (coordinates != null) {
                    q qVar = q.this;
                    sf3.a.b.OpenPlace openPlace = new sf3.a.b.OpenPlace(new ShowLocalizationModel(coordinates, c0.e(localizationDescription)));
                    this.f181404h = vq.j.a(state);
                    this.f181401e = vq.j.a(coordinates);
                    this.f181402f = vq.j.a(localizationDescription);
                    this.f181403g = 1;
                    if (qVar.F(openPlace, this) == objE) {
                        return objE;
                    }
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
        public final Object w(sf3.a.e eVar, State state, tq.e<? super i0> eVar2) {
            b bVar = q.this.new b(eVar2);
            bVar.f181404h = state;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lsf3/a$j;", "<unused var>", "Lsf3/d;", "state", "Loq/i0;", "<anonymous>", "(Lsf3/a$j;Lsf3/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<sf3.a.j, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f181406e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f181407f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f181407f;
            Object objE = uq.b.e();
            int i15 = this.f181406e;
            if (i15 == 0) {
                oq.u.b(obj);
                tf3.b contract = q.this.setupData.getContract();
                ProcessId processId = state.getData().getProcessId();
                this.f181407f = vq.j.a(state);
                this.f181406e = 1;
                if (contract.k0(processId, this) == objE) {
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
        public final Object w(sf3.a.j jVar, State state, tq.e<? super i0> eVar) {
            c cVar = q.this.new c(eVar);
            cVar.f181407f = state;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lsf3/a$b;", "action", "Lsf3/d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lsf3/a$b;Lsf3/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<sf3.a.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f181409e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f181410f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            sf3.a.b bVar = (sf3.a.b) this.f181410f;
            Object objE = uq.b.e();
            int i15 = this.f181409e;
            if (i15 == 0) {
                oq.u.b(obj);
                q qVar = q.this;
                this.f181410f = vq.j.a(bVar);
                this.f181409e = 1;
                if (qVar.F(bVar, this) == objE) {
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
        public final Object w(sf3.a.b bVar, State state, tq.e<? super i0> eVar) {
            d dVar = q.this.new d(eVar);
            dVar.f181410f = bVar;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lsf3/a$a;", "<unused var>", "Lsf3/d;", "Loq/i0;", "<anonymous>", "(Lsf3/a$a;Lsf3/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<sf3.a.C4662a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f181412e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f181412e;
            if (i15 == 0) {
                oq.u.b(obj);
                q qVar = q.this;
                sf3.a.b.C4664b c4664b = sf3.a.b.C4664b.f181338a;
                this.f181412e = 1;
                if (qVar.F(c4664b, this) == objE) {
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
        public final Object w(sf3.a.C4662a c4662a, State state, tq.e<? super i0> eVar) {
            return q.this.new e(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lsf3/a$d;", "<unused var>", "Lk10/c0;", "Lsf3/d;", "state", "Lk10/l;", "<anonymous>", "(Lsf3/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<sf3.a.d, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f181414e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f181415f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f181415f;
            uq.b.e();
            if (this.f181414e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return q.this.A9(c0Var);
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(sf3.a.d dVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            f fVar = q.this.new f(eVar);
            fVar.f181415f = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lsf3/a$i;", "action", "Lsf3/d;", "state", "Loq/i0;", "<anonymous>", "(Lsf3/a$i;Lsf3/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<sf3.a.i, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f181417e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f181418f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f181419g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f181420h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f181421j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f181422k;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x009f  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00c2, code lost:
        
            if (r10.w9(r4, r5, r9) == r1) goto L24;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r10) throws java.lang.Throwable {
            /*
                r9 = this;
                java.lang.Object r0 = r9.f181422k
                sf3.d r0 = (sf3.State) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r9.f181421j
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L3b
                if (r2 == r5) goto L37
                if (r2 == r4) goto L2b
                if (r2 != r3) goto L23
                java.lang.Object r0 = r9.f181418f
                dx.b r0 = (dx.b) r0
                java.lang.Object r0 = r9.f181417e
                dx.i r0 = (dx.i) r0
                oq.u.b(r10)
                goto Lc5
            L23:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L2b:
                java.lang.Object r2 = r9.f181418f
                oq.i0 r2 = (oq.i0) r2
                java.lang.Object r2 = r9.f181417e
                dx.i r2 = (dx.i) r2
                oq.u.b(r10)
                goto L99
            L37:
                oq.u.b(r10)
                goto L5c
            L3b:
                oq.u.b(r10)
                sf3.q r10 = sf3.q.this
                be3.e r10 = sf3.q.o9(r10)
                be3.e$a r2 = new be3.e$a
                yd3.a$a r7 = r0.getData()
                sv0.y r7 = r7.getProcessId()
                r2.<init>(r7)
                r9.f181422k = r0
                r9.f181421j = r5
                java.lang.Object r10 = r10.c(r2, r9)
                if (r10 != r1) goto L5c
                goto Lc4
            L5c:
                r2 = r10
                dx.i r2 = (dx.i) r2
                sf3.q r10 = sf3.q.this
                boolean r5 = r2 instanceof dx.i.Right
                if (r5 == 0) goto L99
                r5 = r2
                dx.i$c r5 = (dx.i.Right) r5
                java.lang.Object r5 = r5.b()
                oq.i0 r5 = (oq.i0) r5
                sf3.c r10 = sf3.q.r9(r10)
                tf3.b r10 = r10.getContract()
                yd3.a$a r7 = r0.getData()
                sv0.y r7 = r7.getProcessId()
                java.lang.Object r8 = vq.j.a(r0)
                r9.f181422k = r8
                r9.f181417e = r2
                java.lang.Object r5 = vq.j.a(r5)
                r9.f181418f = r5
                r9.f181419g = r6
                r9.f181420h = r6
                r9.f181421j = r4
                java.lang.Object r10 = r10.D(r7, r9)
                if (r10 != r1) goto L99
                goto Lc4
            L99:
                sf3.q r10 = sf3.q.this
                boolean r4 = r2 instanceof dx.i.Left
                if (r4 == 0) goto Lc5
                r4 = r2
                dx.i$b r4 = (dx.i.Left) r4
                java.lang.Object r4 = r4.b()
                dx.b r4 = (dx.b) r4
                sf3.a$h r5 = sf3.a.h.f181348a
                java.lang.Object r0 = vq.j.a(r0)
                r9.f181422k = r0
                r9.f181417e = r2
                java.lang.Object r0 = vq.j.a(r4)
                r9.f181418f = r0
                r9.f181419g = r6
                r9.f181420h = r6
                r9.f181421j = r3
                java.lang.Object r10 = sf3.q.s9(r10, r4, r5, r9)
                if (r10 != r1) goto Lc5
            Lc4:
                return r1
            Lc5:
                oq.i0 r10 = oq.i0.f148189a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: sf3.q.g.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(sf3.a.i iVar, State state, tq.e<? super i0> eVar) {
            g gVar = q.this.new g(eVar);
            gVar.f181422k = state;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lsf3/a$h;", "<unused var>", "Lsf3/d;", "state", "Loq/i0;", "<anonymous>", "(Lsf3/a$h;Lsf3/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<sf3.a.h, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f181424e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f181425f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f181425f;
            Object objE = uq.b.e();
            int i15 = this.f181424e;
            if (i15 == 0) {
                oq.u.b(obj);
                tf3.b contract = q.this.setupData.getContract();
                ProcessId processId = state.getData().getProcessId();
                this.f181425f = vq.j.a(state);
                this.f181424e = 1;
                if (contract.k0(processId, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            q.this.d9(sf3.a.i.f181349a);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(sf3.a.h hVar, State state, tq.e<? super i0> eVar) {
            h hVar2 = q.this.new h(eVar);
            hVar2.f181425f = state;
            return hVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lsf3/a$c;", "action", "Lk10/c0;", "Lsf3/d;", "state", "Lk10/l;", "<anonymous>", "(Lsf3/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<sf3.a.OnApproveChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f181427e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f181428f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f181429g;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(sf3.a.OnApproveChanged onApproveChanged, State state) {
            return State.b(state, null, onApproveChanged.getIsSelected(), false, null, 9, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final sf3.a.OnApproveChanged onApproveChanged = (sf3.a.OnApproveChanged) this.f181428f;
            k10.c0 c0Var = (k10.c0) this.f181429g;
            uq.b.e();
            if (this.f181427e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: sf3.r
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.i.O(onApproveChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sf3.a.OnApproveChanged onApproveChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            i iVar = new i(eVar);
            iVar.f181428f = onApproveChanged;
            iVar.f181429g = c0Var;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lsf3/a$f;", "<unused var>", "Lsf3/d;", "Loq/i0;", "<anonymous>", "(Lsf3/a$f;Lsf3/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<sf3.a.f, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f181430e;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O() {
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f181430e;
            if (i15 == 0) {
                oq.u.b(obj);
                q qVar = q.this;
                sf3.a.b.ShowDialog showDialog = new sf3.a.b.ShowDialog(new DialogData(cb4.h.b.f24985a, q.this.labelProvider.c(md3.b.R3), q.this.labelProvider.c(md3.b.f125831t3), new DialogButtonTextData(q.this.labelProvider.c(md3.b.S), null, q.this.b9(sf3.a.g.f181347a), 2, null), new DialogButtonTextData(q.this.labelProvider.c(md3.b.T), null, new er.a() { // from class: sf3.s
                    @Override // er.a
                    public final Object a() {
                        return q.j.O();
                    }
                }, 2, null), null, null, 96, null));
                this.f181430e = 1;
                if (qVar.F(showDialog, this) == objE) {
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
        public final Object w(sf3.a.f fVar, State state, tq.e<? super i0> eVar) {
            return q.this.new j(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lsf3/a$g;", "action", "Lsf3/d;", "state", "Loq/i0;", "<anonymous>", "(Lsf3/a$g;Lsf3/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<sf3.a.g, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f181432e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f181433f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f181434g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f181435h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f181436j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f181437k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f181438l;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0087, code lost:
        
            if (r3.w9(r5, r0, r8) == r2) goto L17;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r9) throws java.lang.Throwable {
            /*
                r8 = this;
                java.lang.Object r0 = r8.f181437k
                sf3.a$g r0 = (sf3.a.g) r0
                java.lang.Object r1 = r8.f181438l
                sf3.d r1 = (sf3.State) r1
                java.lang.Object r2 = uq.b.e()
                int r3 = r8.f181436j
                r4 = 2
                r5 = 1
                if (r3 == 0) goto L2e
                if (r3 == r5) goto L2a
                if (r3 != r4) goto L22
                java.lang.Object r0 = r8.f181433f
                dx.b r0 = (dx.b) r0
                java.lang.Object r0 = r8.f181432e
                dx.i r0 = (dx.i) r0
                oq.u.b(r9)
                goto L8a
            L22:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L2a:
                oq.u.b(r9)
                goto L57
            L2e:
                oq.u.b(r9)
                sf3.q r9 = sf3.q.this
                be3.g r9 = sf3.q.p9(r9)
                be3.g$a r3 = new be3.g$a
                yd3.a$a r6 = r1.getData()
                sv0.y r6 = r6.getProcessId()
                sv0.a0 r7 = sv0.a0.DESCRIPTION_REJECTION
                r3.<init>(r6, r7)
                r8.f181437k = r0
                java.lang.Object r6 = vq.j.a(r1)
                r8.f181438l = r6
                r8.f181436j = r5
                java.lang.Object r9 = r9.c(r3, r8)
                if (r9 != r2) goto L57
                goto L89
            L57:
                dx.i r9 = (dx.i) r9
                sf3.q r3 = sf3.q.this
                boolean r5 = r9 instanceof dx.i.Left
                if (r5 == 0) goto L8a
                r5 = r9
                dx.i$b r5 = (dx.i.Left) r5
                java.lang.Object r5 = r5.b()
                dx.b r5 = (dx.b) r5
                java.lang.Object r6 = vq.j.a(r0)
                r8.f181437k = r6
                java.lang.Object r1 = vq.j.a(r1)
                r8.f181438l = r1
                r8.f181432e = r9
                java.lang.Object r9 = vq.j.a(r5)
                r8.f181433f = r9
                r9 = 0
                r8.f181434g = r9
                r8.f181435h = r9
                r8.f181436j = r4
                java.lang.Object r9 = sf3.q.s9(r3, r5, r0, r8)
                if (r9 != r2) goto L8a
            L89:
                return r2
            L8a:
                oq.i0 r9 = oq.i0.f148189a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: sf3.q.k.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(sf3.a.g gVar, State state, tq.e<? super i0> eVar) {
            k kVar = q.this.new k(eVar);
            kVar.f181437k = gVar;
            kVar.f181438l = state;
            return kVar.J(i0.f148189a);
        }
    }

    public q(yy.a aVar, uf3.a aVar2, ib4.c cVar, be3.e eVar, be3.g gVar, mx.c cVar2, de3.d dVar, SetupData setupData) {
        this.mapper = aVar2;
        this.domainErrorMapper = cVar;
        this.internalConfirmInitialInfoUC = eVar;
        this.internalRejectInitialInfoUC = gVar;
        this.labelProvider = cVar2;
        this.isWrongStateErrorUC = dVar;
        this.setupData = setupData;
        State state = new State(setupData.getConfirmationModel(), false, false, null, 8, null);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: sf3.p
            @Override // er.l
            public final Object b(Object obj) {
                return q.E9(this.f181377a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), y9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k10.l<State> A9(k10.c0<State> state) {
        if (!state.a().getIsApproveSelected()) {
            return state.b(new er.l() { // from class: sf3.n
                @Override // er.l
                public final Object b(Object obj) {
                    return q.C9((State) obj);
                }
            });
        }
        d9(sf3.a.i.f181349a);
        return state.b(new er.l() { // from class: sf3.m
            @Override // er.l
            public final Object b(Object obj) {
                return q.B9((State) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State B9(State state) {
        return State.b(state, null, false, false, null, 11, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State C9(State state) {
        return State.b(state, null, false, true, new d60.j(sf3.b.f181351a), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E9(final q qVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: sf3.k
            @Override // er.l
            public final Object b(Object obj) {
                return q.F9(this.f181372a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F9(q qVar, z zVar) {
        c cVar = qVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(sf3.a.j.class), oVar, cVar);
        zVar.x(q0.c(sf3.a.b.class), oVar, qVar.new d(null));
        zVar.x(q0.c(sf3.a.C4662a.class), oVar, qVar.new e(null));
        zVar.v(q0.c(sf3.a.d.class), oVar, qVar.new f(null));
        zVar.x(q0.c(sf3.a.i.class), oVar, qVar.new g(null));
        zVar.x(q0.c(sf3.a.h.class), oVar, qVar.new h(null));
        zVar.v(q0.c(sf3.a.OnApproveChanged.class), oVar, new i(null));
        zVar.x(q0.c(sf3.a.f.class), oVar, qVar.new j(null));
        zVar.x(q0.c(sf3.a.g.class), oVar, qVar.new k(null));
        zVar.x(q0.c(sf3.a.e.class), oVar, qVar.new b(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object w9(final dx.b bVar, final sf3.a aVar, tq.e<? super i0> eVar) {
        Object objF = F(new sf3.a.b.ShowError(this.domainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: sf3.o
            @Override // er.l
            public final Object b(Object obj) {
                return q.x9(this.f181374a, bVar, aVar, (ib4.c.b) obj);
            }
        }, 2, null))), eVar);
        return objF == uq.b.e() ? objF : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(q qVar, dx.b bVar, sf3.a aVar, ib4.c.b bVar2) {
        if (qVar.isWrongStateErrorUC.c(new de3.d.Params(bVar)).booleanValue()) {
            qVar.d9(sf3.a.C4662a.f181336a);
        } else if (fr.t.c(bVar2, ib4.c.b.AbstractC2161b.C2162b.f90860a) || (bVar2 instanceof ib4.c.b.a.Primary)) {
            qVar.d9(aVar);
        } else {
            if (!fr.t.c(bVar2, ib4.c.b.AbstractC2161b.a.f90859a) && !(bVar2 instanceof ib4.c.b.a.Secondary) && !(bVar2 instanceof ib4.c.b.a.Close)) {
                throw new oq.p();
            }
            qVar.d9(sf3.a.C4662a.f181336a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final sf3.e.Data y9(State state) {
        return this.mapper.b(new uf3.a.Params(state, b9(sf3.a.d.f181344a), b9(sf3.a.f.f181346a), b9(sf3.a.e.f181345a), new er.l() { // from class: sf3.l
            @Override // er.l
            public final Object b(Object obj) {
                return q.z9(this.f181373a, ((Boolean) obj).booleanValue());
            }
        }, b9(sf3.a.b.C4663a.f181337a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(q qVar, boolean z15) {
        qVar.d9(new sf3.a.OnApproveChanged(z15));
        return i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: D9, reason: merged with bridge method [inline-methods] */
    public void P5(SetupData data) {
        d9(sf3.a.j.f181350a);
        super.P5(data);
    }

    @Override // zx.b
    public xw.b<sf3.a.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, sf3.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<sf3.e.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: v9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(sf3.a.b bVar, tq.e<? super i0> eVar) {
        return super.F(bVar, eVar);
    }
}
