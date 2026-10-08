package qx0;

import fr.q0;
import iq0.AnonymousFeatureFlag;
import iq0.AnonymousFeatureFlags;
import java.util.Iterator;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00032\u00020\u0005B9\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0018H\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0010\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R&\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030'8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R \u00103\u001a\b\u0012\u0004\u0012\u00020.0-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R \u00109\u001a\b\u0012\u0004\u0012\u00020\u0013048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020;0:8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b5\u0010<¨\u0006>"}, d2 = {"Lqx0/r;", "Ll00/g;", "Lqx0/l;", "", "Lqx0/m;", "Li70/n;", "Lyy/a;", "stateMachineFactory", "Lrx0/a;", "documentRegulationsScreenMapper", "Lc54/b;", "isFeatureEnabledUseCase", "Ljq0/h;", "loadAnonymousFeatureFlagsUseCase", "Lac4/a;", "callActionWithLoaderUseCase", "snackBarManagerStateHolder", "<init>", "(Lyy/a;Lrx0/a;Lc54/b;Ljq0/h;Lac4/a;Li70/n;)V", "Lqx0/m$a;", "o9", "()Lqx0/m$a;", "Lp50/a;", "snackBarData", "Loq/i0;", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lrx0/a;", "c", "Lc54/b;", "d", "Ljq0/h;", "e", "Lac4/a;", "f", "Li70/n;", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lqx0/j;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "Lmu/g;", "Li70/p;", "()Lmu/g;", "snackBarVisibilityState", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r extends l00.g<State, Object> implements m, zx.d, i70.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final rx0.a documentRegulationsScreenMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c54.b isFeatureEnabledUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final jq0.h loadAnonymousFeatureFlagsUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<j> navAction = new xw.b<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<m.Data> state = a9(new a(e9().getState(), this), o9());

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<m.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f169228a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f169229b;

        /* JADX INFO: renamed from: qx0.r$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4277a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f169230a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ r f169231b;

            /* JADX INFO: renamed from: qx0.r$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4278a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f169232d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f169233e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f169234f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f169236h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f169237j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f169238k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f169239l;

                public C4278a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f169232d = obj;
                    this.f169233e |= PKIFailureInfo.systemUnavail;
                    return C4277a.this.F(null, this);
                }
            }

            public C4277a(mu.h hVar, r rVar) {
                this.f169230a = hVar;
                this.f169231b = rVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4278a c4278a;
                if (eVar instanceof C4278a) {
                    c4278a = (C4278a) eVar;
                    int i15 = c4278a.f169233e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4278a.f169233e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4278a = new C4278a(eVar);
                    }
                } else {
                    c4278a = new C4278a(eVar);
                }
                Object obj2 = c4278a.f169232d;
                Object objE = uq.b.e();
                int i16 = c4278a.f169233e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f169230a;
                    m.Data dataO9 = this.f169231b.o9();
                    c4278a.f169234f = vq.j.a(obj);
                    c4278a.f169236h = vq.j.a(c4278a);
                    c4278a.f169237j = vq.j.a(obj);
                    c4278a.f169238k = vq.j.a(hVar);
                    c4278a.f169239l = 0;
                    c4278a.f169233e = 1;
                    if (hVar.F(dataO9, c4278a) == objE) {
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

        public a(mu.g gVar, r rVar) {
            this.f169228a = gVar;
            this.f169229b = rVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super m.Data> hVar, tq.e eVar) {
            Object objA = this.f169228a.a(new C4277a(hVar, this.f169229b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lk10/c0;", "Lqx0/l;", "state", "Lk10/l;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f169240e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f169241f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lqx0/l;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends State>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f169243e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ r f169244f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ c0<State> f169245g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(r rVar, c0<State> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f169244f = rVar;
                this.f169245g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final State V(c0 c0Var, AnonymousFeatureFlags anonymousFeatureFlags, State state) {
                return ((State) c0Var.a()).a(anonymousFeatureFlags.a());
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f169243e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    jq0.h hVar = this.f169244f.loadAnonymousFeatureFlagsUseCase;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    this.f169243e = 1;
                    obj = hVar.c(c1792a, this);
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
                final c0<State> c0Var = this.f169245g;
                if (iVar instanceof dx.i.Left) {
                    return c0Var.c();
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final AnonymousFeatureFlags anonymousFeatureFlags = (AnonymousFeatureFlags) ((dx.i.Right) iVar).b();
                return c0Var.b(new er.l() { // from class: qx0.s
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return r.b.a.V(c0Var, anonymousFeatureFlags, (State) obj2);
                    }
                });
            }

            public final tq.e<i0> N(tq.e<?> eVar) {
                return new a(this.f169244f, this.f169245g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<State>> eVar) {
                return ((a) N(eVar)).J(i0.f148189a);
            }
        }

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f169241f;
            Object objE = uq.b.e();
            int i15 = this.f169240e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = r.this.callActionWithLoaderUseCase;
            a aVar2 = new a(r.this, c0Var, null);
            this.f169241f = vq.j.a(c0Var);
            this.f169240e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            return ((b) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            b bVar = r.this.new b(eVar);
            bVar.f169241f = obj;
            return bVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lqx0/k;", "<unused var>", "Lqx0/l;", "state", "Loq/i0;", "<anonymous>", "(Lqx0/k;Lqx0/l;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<k, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f169246e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f169247f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f169248g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v10 */
        /* JADX WARN: Type inference failed for: r8v4 */
        /* JADX WARN: Type inference failed for: r8v5, types: [int] */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object next;
            State state = (State) this.f169248g;
            Object objE = uq.b.e();
            int i15 = this.f169247f;
            if (i15 == 0) {
                oq.u.b(obj);
                Iterator it = state.b().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((AnonymousFeatureFlag) next).getType() != iq0.e.ACTIVATION_BY_ELECTRONIC_ID);
                AnonymousFeatureFlag anonymousFeatureFlag = (AnonymousFeatureFlag) next;
                ?? featureActive = anonymousFeatureFlag != null ? anonymousFeatureFlag.getFeatureActive() : 0;
                xw.b<j> bVarY1 = r.this.Y1();
                j toConfirmationMethods = (r.this.isFeatureEnabledUseCase.a(b54.c.NEW_OFFICE_ACTIVATION).booleanValue() || featureActive != 0) ? new j.ToConfirmationMethods(new ix0.f.Flags(state.b())) : j.d.f169207a;
                this.f169248g = vq.j.a(state);
                this.f169246e = featureActive;
                this.f169247f = 1;
                if (bVarY1.F(toConfirmationMethods, this) == objE) {
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
        public final Object w(k kVar, State state, tq.e<? super i0> eVar) {
            c cVar = r.this.new c(eVar);
            cVar.f169248g = state;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lqx0/h;", "<unused var>", "Lqx0/l;", "Loq/i0;", "<anonymous>", "(Lqx0/h;Lqx0/l;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<h, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f169250e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f169250e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<j> bVarY1 = r.this.Y1();
                j.c cVar = j.c.f169206a;
                this.f169250e = 1;
                if (bVarY1.F(cVar, this) == objE) {
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
        public final Object w(h hVar, State state, tq.e<? super i0> eVar) {
            return r.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lqx0/i;", "<unused var>", "Lqx0/l;", "Loq/i0;", "<anonymous>", "(Lqx0/i;Lqx0/l;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<i, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f169252e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f169252e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<j> bVarY1 = r.this.Y1();
                j.a aVar = j.a.f169205a;
                this.f169252e = 1;
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
        public final Object w(i iVar, State state, tq.e<? super i0> eVar) {
            return r.this.new e(eVar).J(i0.f148189a);
        }
    }

    public r(yy.a aVar, rx0.a aVar2, c54.b bVar, jq0.h hVar, ac4.a aVar3, i70.n nVar) {
        this.documentRegulationsScreenMapper = aVar2;
        this.isFeatureEnabledUseCase = bVar;
        this.loadAnonymousFeatureFlagsUseCase = hVar;
        this.callActionWithLoaderUseCase = aVar3;
        this.snackBarManagerStateHolder = nVar;
        this.stateMachine = aVar.a(new State(null, 1, null), new er.l() { // from class: qx0.n
            @Override // er.l
            public final Object b(Object obj) {
                return r.q9(this.f169216a, (k10.v) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m.Data o9() {
        return this.documentRegulationsScreenMapper.b(new rx0.a.Params(b9(h.f169203a), b9(k.f169209a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(final r rVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: qx0.o
            @Override // er.l
            public final Object b(Object obj) {
                return r.r9(this.f169217a, (z) obj);
            }
        });
        vVar.c(q0.c(State.class), new er.l() { // from class: qx0.p
            @Override // er.l
            public final Object b(Object obj) {
                return r.s9(this.f169218a, (z) obj);
            }
        });
        vVar.c(q0.c(State.class), new er.l() { // from class: qx0.q
            @Override // er.l
            public final Object b(Object obj) {
                return r.t9(this.f169219a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(r rVar, z zVar) {
        zVar.A(rVar.new b(null));
        c cVar = rVar.new c(null);
        zVar.x(q0.c(k.class), k10.o.CANCEL_PREVIOUS, cVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(r rVar, z zVar) {
        d dVar = rVar.new d(null);
        zVar.x(q0.c(h.class), k10.o.CANCEL_PREVIOUS, dVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(r rVar, z zVar) {
        e eVar = rVar.new e(null);
        zVar.x(q0.c(i.class), k10.o.CANCEL_PREVIOUS, eVar);
        return i0.f148189a;
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    public xw.b<j> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<m.Data> getState() {
        return this.state;
    }

    @Override // i70.n
    public mu.g<i70.p> j() {
        return this.snackBarManagerStateHolder.j();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: p9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // i70.n
    public void y(p50.a snackBarData) {
        this.snackBarManagerStateHolder.y(snackBarData);
    }
}
