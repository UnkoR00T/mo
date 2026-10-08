package ua3;

import a14.w;
import fr.q0;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import v93.Contact;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003BS\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0082@¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020\u0002H\u0002¢\u0006\u0004\b#\u0010$R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00105\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R \u0010<\u001a\b\u0012\u0004\u0012\u000207068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R&\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030=8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR \u0010!\u001a\b\u0012\u0004\u0012\u00020\"0C8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G¨\u0006H"}, d2 = {"Lua3/r;", "Ll00/g;", "Lua3/g;", "", "Lua3/h;", "Lyy/a;", "stateMachineFactory", "Lva3/b;", "mapper", "La14/g;", "dialIntentUC", "La14/d;", "copyToClipboardUC", "La14/w;", "openUrlIntentUC", "La14/o;", "goToMapIntentUC", "Lmx/c;", "labelProvider", "Li70/e;", "snackBarManager", "Lua3/f;", "data", "<init>", "(Lyy/a;Lva3/b;La14/g;La14/d;La14/w;La14/o;Lmx/c;Li70/e;Lua3/f;)V", "", "value", "", "labelResId", "Ldx/i$c;", "Loq/i0;", "p9", "(Ljava/lang/String;ILtq/e;)Ljava/lang/Object;", "state", "Lua3/h$a;", "r9", "(Lua3/g;)Lua3/h$a;", "b", "Lva3/b;", "c", "La14/g;", "d", "La14/d;", "e", "La14/w;", "f", "La14/o;", "g", "Lmx/c;", "h", "Li70/e;", "j", "Lua3/g;", "initialState", "Lxw/b;", "Lua3/c;", "k", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "l", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "m", "Lmu/p0;", "getState", "()Lmu/p0;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r extends l00.g<State, Object> implements h, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final va3.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a14.g dialIntentUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final a14.d copyToClipboardUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final w openUrlIntentUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final a14.o goToMapIntentUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final i70.e snackBarManager;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ua3.c> navAction;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final p0<h.Data> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f196853d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f196854e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f196855f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f196857h;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f196855f = obj;
            this.f196857h |= PKIFailureInfo.systemUnavail;
            return r.this.p9(null, 0, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<h.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f196858a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f196859b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f196860a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ r f196861b;

            /* JADX INFO: renamed from: ua3.r$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5121a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f196862d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f196863e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f196864f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f196866h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f196867j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f196868k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f196869l;

                public C5121a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f196862d = obj;
                    this.f196863e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, r rVar) {
                this.f196860a = hVar;
                this.f196861b = rVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5121a c5121a;
                if (eVar instanceof C5121a) {
                    c5121a = (C5121a) eVar;
                    int i15 = c5121a.f196863e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5121a.f196863e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5121a = new C5121a(eVar);
                    }
                } else {
                    c5121a = new C5121a(eVar);
                }
                Object obj2 = c5121a.f196862d;
                Object objE = uq.b.e();
                int i16 = c5121a.f196863e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f196860a;
                    h.Data dataR9 = this.f196861b.r9((State) obj);
                    c5121a.f196864f = vq.j.a(obj);
                    c5121a.f196866h = vq.j.a(c5121a);
                    c5121a.f196867j = vq.j.a(obj);
                    c5121a.f196868k = vq.j.a(hVar);
                    c5121a.f196869l = 0;
                    c5121a.f196863e = 1;
                    if (hVar.F(dataR9, c5121a) == objE) {
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

        public b(mu.g gVar, r rVar) {
            this.f196858a = gVar;
            this.f196859b = rVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super h.Data> hVar, tq.e eVar) {
            Object objA = this.f196858a.a(new a(hVar, this.f196859b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lua3/d;", "<unused var>", "Lua3/g;", "Loq/i0;", "<anonymous>", "(Lua3/d;Lua3/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<ua3.d, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f196870e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f196870e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                ua3.c.a aVar = ua3.c.a.f196823a;
                this.f196870e = 1;
                if (rVar.F(aVar, this) == objE) {
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
        public final Object w(ua3.d dVar, State state, tq.e<? super i0> eVar) {
            return r.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lua3/e;", "action", "Lua3/g;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lua3/e;Lua3/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<OnClick, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f196872e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f196873f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f196874g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f196875h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f196876j;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f196878a;

            static {
                int[] iArr = new int[Contact.EnumC5364a.values().length];
                try {
                    iArr[Contact.EnumC5364a.LOCATION.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Contact.EnumC5364a.URL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Contact.EnumC5364a.PHONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Contact.EnumC5364a.EMAIL.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Contact.EnumC5364a.OTHER.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f196878a = iArr;
            }
        }

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            r rVar;
            dx.i iVar;
            OnClick onClick = (OnClick) this.f196876j;
            Object objE = uq.b.e();
            int i15 = this.f196875h;
            if (i15 == 0) {
                oq.u.b(obj);
                Contact contact = onClick.getContact();
                r rVar2 = r.this;
                int i16 = a.f196878a[contact.getType().ordinal()];
                if (i16 == 1) {
                    a14.o oVar = rVar2.goToMapIntentUC;
                    a14.o.a.ByAddress byAddress = new a14.o.a.ByAddress(contact.getValue());
                    this.f196876j = vq.j.a(onClick);
                    this.f196872e = rVar2;
                    this.f196873f = vq.j.a(contact);
                    this.f196874g = 0;
                    this.f196875h = 1;
                    obj = oVar.c(byAddress, this);
                    if (obj != objE) {
                        rVar = rVar2;
                        iVar = (dx.i) obj;
                    }
                } else if (i16 == 2) {
                    w wVar = rVar2.openUrlIntentUC;
                    w.Params params = new w.Params(contact.getValue(), false, 2, null);
                    this.f196876j = vq.j.a(onClick);
                    this.f196872e = rVar2;
                    this.f196873f = vq.j.a(contact);
                    this.f196874g = 0;
                    this.f196875h = 2;
                    obj = wVar.c(params, this);
                    if (obj != objE) {
                        rVar = rVar2;
                        iVar = (dx.i) obj;
                    }
                } else if (i16 == 3) {
                    a14.g gVar = rVar2.dialIntentUC;
                    a14.g.Params params2 = new a14.g.Params(contact.getValue());
                    this.f196876j = vq.j.a(onClick);
                    this.f196872e = rVar2;
                    this.f196873f = vq.j.a(contact);
                    this.f196874g = 0;
                    this.f196875h = 3;
                    obj = gVar.c(params2, this);
                    if (obj != objE) {
                        rVar = rVar2;
                        iVar = (dx.i) obj;
                    }
                } else if (i16 == 4) {
                    String value = contact.getValue();
                    int i17 = r93.a.f172518u;
                    this.f196876j = vq.j.a(onClick);
                    this.f196872e = rVar2;
                    this.f196873f = vq.j.a(contact);
                    this.f196874g = 0;
                    this.f196875h = 4;
                    obj = rVar2.p9(value, i17, this);
                    if (obj != objE) {
                        rVar = rVar2;
                        iVar = (dx.i) obj;
                    }
                } else {
                    if (i16 != 5) {
                        throw new oq.p();
                    }
                    String value2 = contact.getValue();
                    int i18 = r93.a.f172488k;
                    this.f196876j = vq.j.a(onClick);
                    this.f196872e = rVar2;
                    this.f196873f = vq.j.a(contact);
                    this.f196874g = 0;
                    this.f196875h = 5;
                    obj = rVar2.p9(value2, i18, this);
                    if (obj != objE) {
                        rVar = rVar2;
                        iVar = (dx.i) obj;
                    }
                }
                return objE;
            }
            if (i15 == 1) {
                rVar = (r) this.f196872e;
                oq.u.b(obj);
                iVar = (dx.i) obj;
            } else if (i15 == 2) {
                rVar = (r) this.f196872e;
                oq.u.b(obj);
                iVar = (dx.i) obj;
            } else if (i15 == 3) {
                rVar = (r) this.f196872e;
                oq.u.b(obj);
                iVar = (dx.i) obj;
            } else if (i15 == 4) {
                rVar = (r) this.f196872e;
                oq.u.b(obj);
                iVar = (dx.i) obj;
            } else {
                if (i15 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                rVar = (r) this.f196872e;
                oq.u.b(obj);
                iVar = (dx.i) obj;
            }
            if (iVar instanceof dx.i.Left) {
                rVar.snackBarManager.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OnClick onClick, State state, tq.e<? super i0> eVar) {
            d dVar = r.this.new d(eVar);
            dVar.f196876j = onClick;
            return dVar.J(i0.f148189a);
        }
    }

    public r(yy.a aVar, va3.b bVar, a14.g gVar, a14.d dVar, w wVar, a14.o oVar, mx.c cVar, i70.e eVar, SetupData setupData) {
        this.mapper = bVar;
        this.dialIntentUC = gVar;
        this.copyToClipboardUC = dVar;
        this.openUrlIntentUC = wVar;
        this.goToMapIntentUC = oVar;
        this.labelProvider = cVar;
        this.snackBarManager = eVar;
        State state = new State(setupData.a());
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: ua3.q
            @Override // er.l
            public final Object b(Object obj) {
                return r.u9(this.f196841a, (v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), r9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object p9(String str, int i15, tq.e<? super dx.i.Right<i0>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i16 = aVar.f196857h;
            if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f196857h = i16 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f196855f;
        Object objE = uq.b.e();
        int i17 = aVar.f196857h;
        if (i17 == 0) {
            oq.u.b(obj);
            a14.d dVar = this.copyToClipboardUC;
            a14.d.Params params = new a14.d.Params(str, this.labelProvider.c(i15));
            aVar.f196853d = vq.j.a(str);
            aVar.f196854e = i15;
            aVar.f196857h = 1;
            if (dVar.c(params, aVar) == objE) {
                return objE;
            }
        } else {
            if (i17 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
        }
        i0 i0Var = i0.f148189a;
        return new dx.i.Right(i0.f148189a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h.Data r9(State state) {
        return this.mapper.b(new va3.b.Params(state, new er.l() { // from class: ua3.p
            @Override // er.l
            public final Object b(Object obj) {
                return r.s9(this.f196840a, (Contact) obj);
            }
        }, b9(ua3.d.f196824a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(r rVar, Contact contact) {
        rVar.d9(new OnClick(contact));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(final r rVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: ua3.o
            @Override // er.l
            public final Object b(Object obj) {
                return r.v9(this.f196839a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(r rVar, z zVar) {
        c cVar = rVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(ua3.d.class), oVar, cVar);
        zVar.x(q0.c(OnClick.class), oVar, rVar.new d(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<ua3.c> Y1() {
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
    /* JADX INFO: renamed from: q9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(ua3.c cVar, tq.e<? super i0> eVar) {
        return super.F(cVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: t9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }
}
