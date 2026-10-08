package i22;

import cb4.DialogData;
import eo0.y0;
import fr.q0;
import k10.c0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import mx.Label;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import st3.AddressFormData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B;\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0019\u001a\u00020\u0018*\u00020\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R&\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030*8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R \u00106\u001a\b\u0012\u0004\u0012\u000201008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R \u0010<\u001a\b\u0012\u0004\u0012\u00020\u0018078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;¨\u0006="}, d2 = {"Li22/n;", "Ll00/g;", "Li22/c;", "Li22/a;", "Li22/d;", "", "Lyy/a;", "stateMachineFactory", "Lj22/c;", "mapper", "Lc12/g;", "dialogMapper", "Lmx/c;", "labelProvider", "Lx02/d;", "getMessageServiceTypeUC", "Lm22/h;", "messageWizardContract", "<init>", "(Lyy/a;Lj22/c;Lc12/g;Lmx/c;Lx02/d;Lm22/h;)V", "Li22/b;", "Loq/i0;", "s9", "(Li22/b;)V", "Li22/d$a;", "q9", "(Li22/c;)Li22/d$a;", "b", "Lj22/c;", "c", "Lc12/g;", "d", "Lmx/c;", "e", "Lx02/d;", "f", "Lm22/h;", "p9", "()Lm22/h;", "g", "Li22/c;", "initialState", "Lk10/t;", "h", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Li22/a$b;", "j", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<State, i22.a> implements i22.d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j22.c mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c12.g dialogMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final x02.d getMessageServiceTypeUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final m22.h messageWizardContract;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final t<State, i22.a> stateMachine;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final xw.b<i22.a.b> navAction;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p0<i22.d.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<i22.d.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f88524a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f88525b;

        /* JADX INFO: renamed from: i22.n$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2087a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f88526a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f88527b;

            /* JADX INFO: renamed from: i22.n$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2088a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f88528d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f88529e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f88530f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f88532h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f88533j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f88534k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f88535l;

                public C2088a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f88528d = obj;
                    this.f88529e |= PKIFailureInfo.systemUnavail;
                    return C2087a.this.F(null, this);
                }
            }

            public C2087a(mu.h hVar, n nVar) {
                this.f88526a = hVar;
                this.f88527b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2088a c2088a;
                if (eVar instanceof C2088a) {
                    c2088a = (C2088a) eVar;
                    int i15 = c2088a.f88529e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2088a.f88529e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2088a = new C2088a(eVar);
                    }
                } else {
                    c2088a = new C2088a(eVar);
                }
                Object obj2 = c2088a.f88528d;
                Object objE = uq.b.e();
                int i16 = c2088a.f88529e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f88526a;
                    i22.d.Data dataQ9 = this.f88527b.q9((State) obj);
                    c2088a.f88530f = vq.j.a(obj);
                    c2088a.f88532h = vq.j.a(c2088a);
                    c2088a.f88533j = vq.j.a(obj);
                    c2088a.f88534k = vq.j.a(hVar);
                    c2088a.f88535l = 0;
                    c2088a.f88529e = 1;
                    if (hVar.F(dataQ9, c2088a) == objE) {
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

        public a(mu.g gVar, n nVar) {
            this.f88524a = gVar;
            this.f88525b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super i22.d.Data> hVar, tq.e eVar) {
            Object objA = this.f88524a.a(new C2087a(hVar, this.f88525b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Li22/a$f;", "action", "Lk10/c0;", "Li22/c;", "state", "Lk10/l;", "<anonymous>", "(Li22/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<i22.a.Select, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f88536e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f88537f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f88538g;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(i22.a.Select select, State state) {
            return state.a(select.getSelectedMethod());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final i22.a.Select select = (i22.a.Select) this.f88537f;
            c0 c0Var = (c0) this.f88538g;
            uq.b.e();
            if (this.f88536e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.b(new er.l() { // from class: i22.o
                @Override // er.l
                public final Object b(Object obj2) {
                    return n.b.O(select, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(i22.a.Select select, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            b bVar = new b(eVar);
            bVar.f88537f = select;
            bVar.f88538g = c0Var;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Li22/a$d;", "<unused var>", "Li22/c;", "Loq/i0;", "<anonymous>", "(Li22/a$d;Li22/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<i22.a.d, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f88539e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f88539e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<i22.a.b> bVarY1 = n.this.Y1();
                i22.a.b.c cVar = i22.a.b.c.f88484a;
                this.f88539e = 1;
                if (bVarY1.F(cVar, this) == objE) {
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
        public final Object w(i22.a.d dVar, State state, tq.e<? super i0> eVar) {
            return n.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Li22/a$a;", "<unused var>", "Li22/c;", "state", "Loq/i0;", "<anonymous>", "(Li22/a$a;Li22/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<i22.a.C2084a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f88541e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f88542f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f88542f;
            Object objE = uq.b.e();
            int i15 = this.f88541e;
            if (i15 == 0) {
                u.b(obj);
                n.this.s9(state.getSelectedMethod());
                xw.b<i22.a.b> bVarY1 = n.this.Y1();
                i22.a.b.C2085a c2085a = i22.a.b.C2085a.f88482a;
                this.f88542f = vq.j.a(state);
                this.f88541e = 1;
                if (bVarY1.F(c2085a, this) == objE) {
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
        public final Object w(i22.a.C2084a c2084a, State state, tq.e<? super i0> eVar) {
            d dVar = n.this.new d(eVar);
            dVar.f88542f = state;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Li22/a$c;", "<unused var>", "Li22/c;", "state", "Loq/i0;", "<anonymous>", "(Li22/a$c;Li22/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<i22.a.c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f88544e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f88545f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f88547a;

            static {
                int[] iArr = new int[i22.b.values().length];
                try {
                    iArr[i22.b.EPUAP.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[i22.b.MAILING_ADDRESS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f88547a = iArr;
            }
        }

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            i22.a.b goToCorrespondenceAddress;
            State state = (State) this.f88545f;
            Object objE = uq.b.e();
            int i15 = this.f88544e;
            if (i15 == 0) {
                u.b(obj);
                n.this.s9(state.getSelectedMethod());
                xw.b<i22.a.b> bVarY1 = n.this.Y1();
                int i16 = a.f88547a[state.getSelectedMethod().ordinal()];
                if (i16 == 1) {
                    goToCorrespondenceAddress = i22.a.b.d.f88485a;
                } else {
                    if (i16 != 2) {
                        throw new oq.p();
                    }
                    Label labelC = n.this.labelProvider.c(e02.a.f46553j2);
                    Label labelC2 = n.this.labelProvider.c(e02.a.f46547i2);
                    o02.b.CorrespondenceAddress correspondenceAddressY0 = n.this.getMessageWizardContract().y0();
                    goToCorrespondenceAddress = new i22.a.b.GoToCorrespondenceAddress(new AddressFormData(null, true, labelC2, labelC, null, null, correspondenceAddressY0 != null ? correspondenceAddressY0.getAddressData() : null, 49, null));
                }
                this.f88545f = vq.j.a(state);
                this.f88544e = 1;
                if (bVarY1.F(goToCorrespondenceAddress, this) == objE) {
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
        public final Object w(i22.a.c cVar, State state, tq.e<? super i0> eVar) {
            e eVar2 = n.this.new e(eVar);
            eVar2.f88545f = state;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Li22/a$e;", "<unused var>", "Li22/c;", "Loq/i0;", "<anonymous>", "(Li22/a$e;Li22/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<i22.a.e, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f88548e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f88548e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<i22.a.b> bVarY1 = n.this.Y1();
                i22.a.b.e eVar = i22.a.b.e.f88486a;
                this.f88548e = 1;
                if (bVarY1.F(eVar, this) == objE) {
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
        public final Object w(i22.a.e eVar, State state, tq.e<? super i0> eVar2) {
            return n.this.new f(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Li22/a$g;", "<unused var>", "Li22/c;", "Loq/i0;", "<anonymous>", "(Li22/a$g;Li22/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<i22.a.g, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f88550e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f88551f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f88552g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f88553h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f88554j;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f88554j;
            if (i15 == 0) {
                u.b(obj);
                y0 y0VarB = n.this.getMessageServiceTypeUC.b(new x02.d.Params(n.this.getMessageWizardContract(), n.this.getMessageWizardContract()));
                n nVar = n.this;
                DialogData dialogDataB = nVar.dialogMapper.b(new c12.g.Params(nVar.b9(i22.a.e.f88490a), y0VarB, null, 4, null));
                xw.b<i22.a.b> bVarY1 = nVar.Y1();
                i22.a.b.ShowDialog showDialog = new i22.a.b.ShowDialog(dialogDataB);
                this.f88550e = vq.j.a(y0VarB);
                this.f88551f = vq.j.a(dialogDataB);
                this.f88552g = 0;
                this.f88553h = 0;
                this.f88554j = 1;
                if (bVarY1.F(showDialog, this) == objE) {
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
        public final Object w(i22.a.g gVar, State state, tq.e<? super i0> eVar) {
            return n.this.new g(eVar).J(i0.f148189a);
        }
    }

    public n(yy.a aVar, j22.c cVar, c12.g gVar, mx.c cVar2, x02.d dVar, m22.h hVar) {
        i22.b method;
        this.mapper = cVar;
        this.dialogMapper = gVar;
        this.labelProvider = cVar2;
        this.getMessageServiceTypeUC = dVar;
        this.messageWizardContract = hVar;
        o02.b.ContactMethod contactMethodT7 = hVar.T7();
        State state = new State((contactMethodT7 == null || (method = contactMethodT7.getMethod()) == null) ? i22.b.EPUAP : method);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: i22.m
            @Override // er.l
            public final Object b(Object obj) {
                return n.u9(this.f88514a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), q9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i22.d.Data q9(State state) {
        j22.c cVar = this.mapper;
        er.a<i0> aVarB9 = b9(i22.a.c.f88488a);
        er.a<i0> aVarB10 = b9(i22.a.C2084a.f88481a);
        return cVar.b(new j22.c.Params(state, new er.l() { // from class: i22.l
            @Override // er.l
            public final Object b(Object obj) {
                return n.r9(this.f88513a, (b) obj);
            }
        }, aVarB9, b9(i22.a.g.f88492a), aVarB10, b9(i22.a.d.f88489a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(n nVar, i22.b bVar) {
        nVar.d9(new i22.a.Select(bVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s9(i22.b bVar) {
        this.messageWizardContract.N3(new o02.b.ContactMethod(bVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(final n nVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: i22.k
            @Override // er.l
            public final Object b(Object obj) {
                return n.v9(this.f88512a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(n nVar, z zVar) {
        b bVar = new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(i22.a.Select.class), oVar, bVar);
        zVar.x(q0.c(i22.a.d.class), oVar, nVar.new c(null));
        zVar.x(q0.c(i22.a.C2084a.class), oVar, nVar.new d(null));
        zVar.x(q0.c(i22.a.c.class), oVar, nVar.new e(null));
        zVar.x(q0.c(i22.a.e.class), oVar, nVar.new f(null));
        zVar.x(q0.c(i22.a.g.class), oVar, nVar.new g(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<i22.a.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, i22.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<i22.d.Data> getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: p9, reason: from getter */
    public final m22.h getMessageWizardContract() {
        return this.messageWizardContract;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: t9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(m22.h hVar) {
        super.P5(hVar);
    }
}
