package a41;

import fr.q0;
import k10.c0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B3\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR&\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001f8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010+\u001a\b\u0012\u0004\u0012\u00020&0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R \u00101\u001a\b\u0012\u0004\u0012\u00020\u00110,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"La41/t;", "Ll00/g;", "La41/g;", "", "La41/h;", "Lyy/a;", "stateMachineFactory", "Ld41/d;", "mapper", "Lq31/c;", "exitDialogMapper", "Lo31/f;", "validateFacilityNameUC", "Lc41/a;", "contract", "<init>", "(Lyy/a;Ld41/d;Lq31/c;Lo31/f;Lc41/a;)V", "La41/h$a;", "p9", "(La41/g;)La41/h$a;", "b", "Ld41/d;", "c", "Lq31/c;", "d", "Lo31/f;", "e", "Lc41/a;", "f", "La41/g;", "initialState", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "La41/c;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t extends l00.g<State, Object> implements h, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d41.d mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final q31.c exitDialogMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final o31.f validateFacilityNameUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final c41.a contract;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<a41.c> navAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<h.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<h.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f2845a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t f2846b;

        /* JADX INFO: renamed from: a41.t$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0041a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f2847a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ t f2848b;

            /* JADX INFO: renamed from: a41.t$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0042a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f2849d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f2850e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f2851f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f2853h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f2854j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f2855k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f2856l;

                public C0042a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f2849d = obj;
                    this.f2850e |= PKIFailureInfo.systemUnavail;
                    return C0041a.this.F(null, this);
                }
            }

            public C0041a(mu.h hVar, t tVar) {
                this.f2847a = hVar;
                this.f2848b = tVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0042a c0042a;
                if (eVar instanceof C0042a) {
                    c0042a = (C0042a) eVar;
                    int i15 = c0042a.f2850e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0042a.f2850e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0042a = new C0042a(eVar);
                    }
                } else {
                    c0042a = new C0042a(eVar);
                }
                Object obj2 = c0042a.f2849d;
                Object objE = uq.b.e();
                int i16 = c0042a.f2850e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f2847a;
                    h.Data dataP9 = this.f2848b.p9((State) obj);
                    c0042a.f2851f = vq.j.a(obj);
                    c0042a.f2853h = vq.j.a(c0042a);
                    c0042a.f2854j = vq.j.a(obj);
                    c0042a.f2855k = vq.j.a(hVar);
                    c0042a.f2856l = 0;
                    c0042a.f2850e = 1;
                    if (hVar.F(dataP9, c0042a) == objE) {
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

        public a(mu.g gVar, t tVar) {
            this.f2845a = gVar;
            this.f2846b = tVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super h.Data> hVar, tq.e eVar) {
            Object objA = this.f2845a.a(new C0041a(hVar, this.f2846b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"La41/f;", "<unused var>", "La41/g;", "Loq/i0;", "<anonymous>", "(La41/f;La41/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<a41.f, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f2857e;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f2859e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ t f2860f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(t tVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f2860f = tVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f2859e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    xw.b<a41.c> bVarY1 = this.f2860f.Y1();
                    a41.c.b bVar = a41.c.b.f2804a;
                    this.f2859e = 1;
                    if (bVarY1.F(bVar, this) == objE) {
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
                return new a(this.f2860f, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super i0> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(t tVar) {
            i00.a.a(tVar, new a(tVar, null));
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f2857e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<a41.c> bVarY1 = t.this.Y1();
                q31.c cVar = t.this.exitDialogMapper;
                final t tVar = t.this;
                a41.c.ShowDialog showDialog = new a41.c.ShowDialog(cVar.b(new q31.c.Params(new er.a() { // from class: a41.u
                    @Override // er.a
                    public final Object a() {
                        return t.b.O(tVar);
                    }
                })));
                this.f2857e = 1;
                if (bVarY1.F(showDialog, this) == objE) {
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
        public final Object w(a41.f fVar, State state, tq.e<? super i0> eVar) {
            return t.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"La41/a;", "<unused var>", "La41/g;", "Loq/i0;", "<anonymous>", "(La41/a;La41/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<a41.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f2861e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f2861e;
            if (i15 == 0) {
                oq.u.b(obj);
                t tVar = t.this;
                a41.c.a aVar = a41.c.a.f2803a;
                this.f2861e = 1;
                if (tVar.F(aVar, this) == objE) {
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
        public final Object w(a41.a aVar, State state, tq.e<? super i0> eVar) {
            return t.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"La41/e;", "action", "Lk10/c0;", "La41/g;", "state", "Lk10/l;", "<anonymous>", "(La41/e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<SetFacilityName, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f2863e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f2864f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f2865g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(SetFacilityName setFacilityName, State state) {
            return State.b(state, false, false, null, setFacilityName.getFacilityName(), hz.b.C2039b.f86846c, 7, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final SetFacilityName setFacilityName = (SetFacilityName) this.f2864f;
            c0 c0Var = (c0) this.f2865g;
            uq.b.e();
            if (this.f2863e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: a41.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.d.O(setFacilityName, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(SetFacilityName setFacilityName, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f2864f = setFacilityName;
            dVar.f2865g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"La41/b;", "<unused var>", "Lk10/c0;", "La41/g;", "state", "Lk10/l;", "<anonymous>", "(La41/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<a41.b, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f2866e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f2867f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f2868g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f2869h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f2870j;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f2872a;

            static {
                int[] iArr = new int[State.a.values().length];
                try {
                    iArr[State.a.MedicalCenter.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[State.a.Other.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f2872a = iArr;
            }
        }

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State V(State state) {
            return State.b(state, false, true, null, null, null, 29, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State X(hz.g gVar, State state) {
            return State.b(state, false, false, null, null, hz.b.INSTANCE.a(gVar), 15, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x00d1, code lost:
        
            if (r5.F(r6, r7) == r1) goto L32;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 217
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: a41.t.e.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(a41.b bVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = t.this.new e(eVar);
            eVar2.f2870j = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"La41/d;", "action", "Lk10/c0;", "La41/g;", "state", "Lk10/l;", "<anonymous>", "(La41/d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<Select, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f2873e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f2874f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f2875g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(Select select, State state) {
            return State.b(state, false, false, select.getPlaceOfBirth(), null, hz.b.C2039b.f86846c, 9, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final Select select = (Select) this.f2874f;
            c0 c0Var = (c0) this.f2875g;
            uq.b.e();
            if (this.f2873e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: a41.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.f.O(select, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(Select select, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            f fVar = new f(eVar);
            fVar.f2874f = select;
            fVar.f2875g = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    public t(yy.a aVar, d41.d dVar, q31.c cVar, o31.f fVar, c41.a aVar2) {
        State.a aVar3;
        String facilityName;
        this.mapper = dVar;
        this.exitDialogMapper = cVar;
        this.validateFacilityNameUC = fVar;
        this.contract = aVar2;
        boolean zL = aVar2.l();
        c41.a.InterfaceC0617a interfaceC0617aN5 = aVar2.n5();
        if (interfaceC0617aN5 instanceof c41.a.InterfaceC0617a.MedicalCenter) {
            aVar3 = State.a.MedicalCenter;
        } else if (fr.t.c(interfaceC0617aN5, c41.a.InterfaceC0617a.b.f23126a)) {
            aVar3 = State.a.Other;
        } else {
            if (interfaceC0617aN5 != null) {
                throw new oq.p();
            }
            aVar3 = null;
        }
        State.a aVar4 = aVar3;
        c41.a.InterfaceC0617a interfaceC0617aN6 = aVar2.n5();
        if (interfaceC0617aN6 instanceof c41.a.InterfaceC0617a.MedicalCenter) {
            facilityName = ((c41.a.InterfaceC0617a.MedicalCenter) interfaceC0617aN6).getFacilityName();
        } else {
            if (!(interfaceC0617aN6 instanceof c41.a.InterfaceC0617a.b) && interfaceC0617aN6 != null) {
                throw new oq.p();
            }
            facilityName = "";
        }
        State state = new State(zL, false, aVar4, facilityName, null, 18, null);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: a41.s
            @Override // er.l
            public final Object b(Object obj) {
                return t.t9(this.f2836a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), p9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h.Data p9(State state) {
        return this.mapper.b(new d41.d.Params(state, new er.l() { // from class: a41.q
            @Override // er.l
            public final Object b(Object obj) {
                return t.q9(this.f2834a, (State.a) obj);
            }
        }, new er.l() { // from class: a41.r
            @Override // er.l
            public final Object b(Object obj) {
                return t.r9(this.f2835a, (String) obj);
            }
        }, b9(a41.f.f2809a), b9(a41.b.f2801a), b9(a41.a.f2799a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(t tVar, State.a aVar) {
        tVar.d9(new Select(aVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(t tVar, String str) {
        tVar.d9(new SetFacilityName(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(final t tVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: a41.p
            @Override // er.l
            public final Object b(Object obj) {
                return t.u9(this.f2833a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(t tVar, k10.z zVar) {
        b bVar = tVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(a41.f.class), oVar, bVar);
        zVar.x(q0.c(a41.a.class), oVar, tVar.new c(null));
        zVar.v(q0.c(SetFacilityName.class), oVar, new d(null));
        zVar.v(q0.c(a41.b.class), oVar, tVar.new e(null));
        zVar.v(q0.c(Select.class), oVar, new f(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<a41.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<h.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: o9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(a41.c cVar, tq.e<? super i0> eVar) {
        return super.F(cVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: s9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(c41.a aVar) {
        super.P5(aVar);
    }
}
