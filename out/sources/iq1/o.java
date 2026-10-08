package iq1;

import fr.q0;
import java.time.LocalDate;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B!\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R&\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001a8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010+\u001a\b\u0012\u0004\u0012\u00020&0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Liq1/o;", "Ll00/g;", "Liq1/z;", "Liq1/w;", "Liq1/a0;", "", "Lyy/a;", "stateMachineFactory", "Liq1/i;", "mapper", "Lez/a;", "currentTimeProvider", "<init>", "(Lyy/a;Liq1/i;Lez/a;)V", "state", "Liq1/a0$a;", "n9", "(Liq1/z;)Liq1/a0$a;", "b", "Liq1/i;", "getMapper", "()Liq1/i;", "c", "Lez/a;", "m9", "()Lez/a;", "Lk10/t;", "d", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "e", "Lmu/p0;", "getState", "()Lmu/p0;", "Lxw/b;", "Liq1/w$c;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o extends l00.g<State, w> implements a0, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, w> stateMachine;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p0<a0.Data> state = a9(new a(e9().getState(), this), n9(new State(null, null, null, null, null, null, null, null, GF2Field.MASK, null)));

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<w.c> navAction = new xw.b<>();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<a0.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f96438a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f96439b;

        /* JADX INFO: renamed from: iq1.o$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2250a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f96440a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ o f96441b;

            /* JADX INFO: renamed from: iq1.o$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2251a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f96442d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f96443e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f96444f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f96446h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f96447j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f96448k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f96449l;

                public C2251a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f96442d = obj;
                    this.f96443e |= PKIFailureInfo.systemUnavail;
                    return C2250a.this.F(null, this);
                }
            }

            public C2250a(mu.h hVar, o oVar) {
                this.f96440a = hVar;
                this.f96441b = oVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2251a c2251a;
                if (eVar instanceof C2251a) {
                    c2251a = (C2251a) eVar;
                    int i15 = c2251a.f96443e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2251a.f96443e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2251a = new C2251a(eVar);
                    }
                } else {
                    c2251a = new C2251a(eVar);
                }
                Object obj2 = c2251a.f96442d;
                Object objE = uq.b.e();
                int i16 = c2251a.f96443e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f96440a;
                    a0.Data dataN9 = this.f96441b.n9((State) obj);
                    c2251a.f96444f = vq.j.a(obj);
                    c2251a.f96446h = vq.j.a(c2251a);
                    c2251a.f96447j = vq.j.a(obj);
                    c2251a.f96448k = vq.j.a(hVar);
                    c2251a.f96449l = 0;
                    c2251a.f96443e = 1;
                    if (hVar.F(dataN9, c2251a) == objE) {
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

        public a(mu.g gVar, o oVar) {
            this.f96438a = gVar;
            this.f96439b = oVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super a0.Data> hVar, tq.e eVar) {
            Object objA = this.f96438a.a(new C2250a(hVar, this.f96439b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Liq1/w$d;", "action", "Lk10/c0;", "Liq1/z;", "state", "Lk10/l;", "<anonymous>", "(Liq1/w$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<w.SetDate, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f96450e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f96451f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f96452g;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f96453a;

            static {
                int[] iArr = new int[c0.b.values().length];
                try {
                    iArr[c0.b.ENABLED_PLACEHOLDER.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[c0.b.ENABLED_SELECTED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[c0.b.ERROR_PLACEHOLDER.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[c0.b.ERROR_SELECTED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f96453a = iArr;
            }
        }

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(w.SetDate setDate, State state) {
            int i15 = a.f96453a[setDate.getField().ordinal()];
            if (i15 == 1) {
                return State.b(state, state.getSingleEnabledPlaceholder().a(setDate.getDate()), null, null, null, null, null, null, null, 254, null);
            }
            if (i15 == 2) {
                return State.b(state, null, null, state.getSingleEnabledSelected().a(setDate.getDate()), null, null, null, null, null, 251, null);
            }
            if (i15 == 3) {
                return State.b(state, null, null, null, null, state.getSingleErrorPlaceholder().a(setDate.getDate()), null, null, null, 239, null);
            }
            if (i15 == 4) {
                return State.b(state, null, null, null, null, null, null, state.getSingleErrorSelected().a(setDate.getDate()), null, 191, null);
            }
            throw new oq.p();
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final w.SetDate setDate = (w.SetDate) this.f96451f;
            k10.c0 c0Var = (k10.c0) this.f96452g;
            uq.b.e();
            if (this.f96450e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: iq1.p
                @Override // er.l
                public final Object b(Object obj2) {
                    return o.b.O(setDate, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(w.SetDate setDate, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            b bVar = new b(eVar);
            bVar.f96451f = setDate;
            bVar.f96452g = c0Var;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Liq1/w$e;", "action", "Lk10/c0;", "Liq1/z;", "state", "Lk10/l;", "<anonymous>", "(Liq1/w$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<w.SetRange, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f96454e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f96455f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f96456g;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f96457a;

            static {
                int[] iArr = new int[c0.a.values().length];
                try {
                    iArr[c0.a.ENABLED_PLACEHOLDER.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[c0.a.ENABLED_SELECTED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[c0.a.ERROR_PLACEHOLDER.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[c0.a.ERROR_SELECTED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f96457a = iArr;
            }
        }

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(w.SetRange setRange, State state) {
            int i15 = a.f96457a[setRange.getField().ordinal()];
            if (i15 == 1) {
                return State.b(state, null, state.getRangeEnabledPlaceholder().a(setRange.getRange()), null, null, null, null, null, null, 253, null);
            }
            if (i15 == 2) {
                return State.b(state, null, null, null, state.getRangeEnabledSelected().a(setRange.getRange()), null, null, null, null, 247, null);
            }
            if (i15 == 3) {
                return State.b(state, null, null, null, null, null, state.getRangeErrorPlaceholder().a(setRange.getRange()), null, null, 223, null);
            }
            if (i15 == 4) {
                return State.b(state, null, null, null, null, null, null, null, state.getRangeErrorSelected().a(setRange.getRange()), CertificateBody.profileType, null);
            }
            throw new oq.p();
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final w.SetRange setRange = (w.SetRange) this.f96455f;
            k10.c0 c0Var = (k10.c0) this.f96456g;
            uq.b.e();
            if (this.f96454e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: iq1.q
                @Override // er.l
                public final Object b(Object obj2) {
                    return o.c.O(setRange, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(w.SetRange setRange, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            c cVar = new c(eVar);
            cVar.f96455f = setRange;
            cVar.f96456g = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Liq1/w$a;", "<unused var>", "Liq1/z;", "Loq/i0;", "<anonymous>", "(Liq1/w$a;Liq1/z;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<w.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f96458e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f96458e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<w.c> bVarY1 = o.this.Y1();
                w.c.a aVar = w.c.a.f96474a;
                this.f96458e = 1;
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
        public final Object w(w.a aVar, State state, tq.e<? super i0> eVar) {
            return o.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Liq1/w$b;", "action", "Liq1/z;", "state", "Loq/i0;", "<anonymous>", "(Liq1/w$b;Liq1/z;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<w.DatePickerClick, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f96460e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f96461f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f96462g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 V(o oVar, w.DatePickerClick datePickerClick, LocalDate localDate) {
            oVar.d9(new w.SetDate(localDate, (c0.b) datePickerClick.getField()));
            return i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 X(o oVar, w.DatePickerClick datePickerClick, fz.e.LocalDate localDate) {
            oVar.d9(new w.SetRange(localDate, (c0.a) datePickerClick.getField()));
            return i0.f148189a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0071, code lost:
        
            if (r15.F(r3, r14) == r2) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00ae, code lost:
        
            if (r15.F(r3, r14) == r2) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00b0, code lost:
        
            return r2;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r15) throws java.lang.Throwable {
            /*
                r14 = this;
                java.lang.Object r0 = r14.f96461f
                iq1.w$b r0 = (iq1.w.DatePickerClick) r0
                java.lang.Object r1 = r14.f96462g
                iq1.z r1 = (iq1.State) r1
                java.lang.Object r2 = uq.b.e()
                int r3 = r14.f96460e
                r4 = 2
                r5 = 1
                if (r3 == 0) goto L24
                if (r3 == r5) goto L1f
                if (r3 != r4) goto L17
                goto L1f
            L17:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L1f:
                oq.u.b(r15)
                goto Lb1
            L24:
                oq.u.b(r15)
                iq1.c0 r15 = r0.getField()
                boolean r3 = r15 instanceof iq1.c0.b
                if (r3 == 0) goto L74
                iq1.o r15 = iq1.o.this
                iq1.w$c$b r3 = new iq1.w$c$b
                uw.j$b r6 = new uw.j$b
                iq1.c0 r4 = r0.getField()
                iq1.c0$b r4 = (iq1.c0.b) r4
                java.time.LocalDate r4 = r1.c(r4)
                if (r4 != 0) goto L4b
                iq1.o r4 = iq1.o.this
                ez.a r4 = r4.getCurrentTimeProvider()
                java.time.LocalDate r4 = r4.c()
            L4b:
                r8 = r4
                iq1.o r4 = iq1.o.this
                iq1.r r9 = new iq1.r
                r9.<init>()
                r12 = 25
                r13 = 0
                r7 = 0
                r10 = 0
                r11 = 0
                r6.<init>(r7, r8, r9, r10, r11, r12, r13)
                r3.<init>(r6)
                java.lang.Object r0 = vq.j.a(r0)
                r14.f96461f = r0
                java.lang.Object r0 = vq.j.a(r1)
                r14.f96462g = r0
                r14.f96460e = r5
                java.lang.Object r15 = r15.F(r3, r14)
                if (r15 != r2) goto Lb1
                goto Lb0
            L74:
                boolean r15 = r15 instanceof iq1.c0.a
                if (r15 == 0) goto Lb4
                iq1.o r15 = iq1.o.this
                iq1.w$c$b r3 = new iq1.w$c$b
                uw.j$a r5 = new uw.j$a
                iq1.c0 r6 = r0.getField()
                iq1.c0$a r6 = (iq1.c0.a) r6
                fz.e$a r7 = r1.d(r6)
                iq1.o r6 = iq1.o.this
                iq1.s r9 = new iq1.s
                r9.<init>()
                r12 = 53
                r13 = 0
                r6 = 0
                r8 = 0
                r10 = 0
                r11 = 0
                r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
                r3.<init>(r5)
                java.lang.Object r0 = vq.j.a(r0)
                r14.f96461f = r0
                java.lang.Object r0 = vq.j.a(r1)
                r14.f96462g = r0
                r14.f96460e = r4
                java.lang.Object r15 = r15.F(r3, r14)
                if (r15 != r2) goto Lb1
            Lb0:
                return r2
            Lb1:
                oq.i0 r15 = oq.i0.f148189a
                return r15
            Lb4:
                oq.p r15 = new oq.p
                r15.<init>()
                throw r15
            */
            throw new UnsupportedOperationException("Method not decompiled: iq1.o.e.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(w.DatePickerClick datePickerClick, State state, tq.e<? super i0> eVar) {
            e eVar2 = o.this.new e(eVar);
            eVar2.f96461f = datePickerClick;
            eVar2.f96462g = state;
            return eVar2.J(i0.f148189a);
        }
    }

    public o(yy.a aVar, i iVar, ez.a aVar2) {
        this.mapper = iVar;
        this.currentTimeProvider = aVar2;
        this.stateMachine = aVar.a(new State(null, null, null, null, null, null, null, null, GF2Field.MASK, null), new er.l() { // from class: iq1.l
            @Override // er.l
            public final Object b(Object obj) {
                return o.q9(this.f96430a, (k10.v) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a0.Data n9(State state) {
        return this.mapper.b(new i.Params(state, new er.l() { // from class: iq1.n
            @Override // er.l
            public final Object b(Object obj) {
                return o.o9(this.f96432a, (c0) obj);
            }
        }, b9(w.a.f96472a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(o oVar, c0 c0Var) {
        oVar.d9(new w.DatePickerClick(c0Var));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(final o oVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: iq1.m
            @Override // er.l
            public final Object b(Object obj) {
                return o.r9(this.f96431a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(o oVar, k10.z zVar) {
        b bVar = new b(null);
        k10.o oVar2 = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(w.SetDate.class), oVar2, bVar);
        zVar.v(q0.c(w.SetRange.class), oVar2, new c(null));
        zVar.x(q0.c(w.a.class), oVar2, oVar.new d(null));
        zVar.x(q0.c(w.DatePickerClick.class), oVar2, oVar.new e(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<w.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, w> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<a0.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: l9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(w.c cVar, tq.e<? super i0> eVar) {
        return super.F(cVar, eVar);
    }

    /* JADX INFO: renamed from: m9, reason: from getter */
    public final ez.a getCurrentTimeProvider() {
        return this.currentTimeProvider;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: p9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
