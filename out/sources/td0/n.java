package td0;

import fr.q0;
import iy.b0;
import k10.c0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BI\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R \u00100\u001a\b\u0012\u0004\u0012\u00020+0*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R&\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003018\u0014X\u0094\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u0019078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;¨\u0006<"}, d2 = {"Ltd0/n;", "Ll00/g;", "Ltd0/b;", "Ltd0/a;", "Ltd0/c;", "", "Lyy/a;", "stateMachineFactory", "Lqd0/b;", "validateRepeatedPinUC", "Lqd0/c;", "validateSetPinUC", "Lud0/e;", "mapper", "Lib4/c;", "errorMapper", "Lhb4/d;", "errorVMSFactory", "Lac4/a;", "callActionWithLoaderUseCase", "Lqg0/e;", "generateAppActivationKeysUC", "<init>", "(Lyy/a;Lqd0/b;Lqd0/c;Lud0/e;Lib4/c;Lhb4/d;Lac4/a;Lqg0/e;)V", "state", "Ltd0/c$a;", "t9", "(Ltd0/b;)Ltd0/c$a;", "b", "Lqd0/b;", "c", "Lqd0/c;", "d", "Lud0/e;", "e", "Lib4/c;", "f", "Lhb4/d;", "g", "Lac4/a;", "h", "Lqg0/e;", "Lxw/b;", "Ltd0/a$c;", "j", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "k", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "l", "Lmu/p0;", "getState", "()Lmu/p0;", "setpin_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<td0.b, td0.a> implements td0.c, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final qd0.b validateRepeatedPinUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final qd0.c validateSetPinUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ud0.e mapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ib4.c errorMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final qg0.e generateAppActivationKeysUC;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final k10.t<td0.b, td0.a> stateMachine;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final xw.b<td0.a.c> navAction = new xw.b<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final p0<td0.c.a> state = a9(new a(e9().getState(), this), t9(new td0.b.SetPin(null, null, 3, null)));

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<td0.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f189689a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f189690b;

        /* JADX INFO: renamed from: td0.n$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4934a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f189691a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f189692b;

            /* JADX INFO: renamed from: td0.n$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4935a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f189693d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f189694e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f189695f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f189697h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f189698j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f189699k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f189700l;

                public C4935a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f189693d = obj;
                    this.f189694e |= PKIFailureInfo.systemUnavail;
                    return C4934a.this.F(null, this);
                }
            }

            public C4934a(mu.h hVar, n nVar) {
                this.f189691a = hVar;
                this.f189692b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4935a c4935a;
                if (eVar instanceof C4935a) {
                    c4935a = (C4935a) eVar;
                    int i15 = c4935a.f189694e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4935a.f189694e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4935a = new C4935a(eVar);
                    }
                } else {
                    c4935a = new C4935a(eVar);
                }
                Object obj2 = c4935a.f189693d;
                Object objE = uq.b.e();
                int i16 = c4935a.f189694e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f189691a;
                    td0.c.a aVarT9 = this.f189692b.t9((td0.b) obj);
                    c4935a.f189695f = vq.j.a(obj);
                    c4935a.f189697h = vq.j.a(c4935a);
                    c4935a.f189698j = vq.j.a(obj);
                    c4935a.f189699k = vq.j.a(hVar);
                    c4935a.f189700l = 0;
                    c4935a.f189694e = 1;
                    if (hVar.F(aVarT9, c4935a) == objE) {
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

        public a(mu.g gVar, n nVar) {
            this.f189689a = gVar;
            this.f189690b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super td0.c.a> hVar, tq.e eVar) {
            Object objA = this.f189689a.a(new C4934a(hVar, this.f189690b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ltd0/a$d;", "action", "Lk10/c0;", "Ltd0/b$c;", "state", "Lk10/l;", "Ltd0/b;", "<anonymous>", "(Ltd0/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<td0.a.OnPinChanged, c0<td0.b.SetPin>, tq.e<? super k10.l<? extends td0.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f189701e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f189702f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f189703g;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final td0.b.SetPin X(td0.a.OnPinChanged onPinChanged, td0.b.SetPin setPin) {
            return td0.b.SetPin.b(setPin, onPinChanged.getPinValue(), null, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final td0.b.SetPin Y(hz.g gVar, td0.b.SetPin setPin) {
            return setPin.a(b0.INSTANCE.a(), hz.b.INSTANCE.a(gVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final td0.b.RepeatPin Z(td0.a.OnPinChanged onPinChanged, td0.b.SetPin setPin) {
            return new td0.b.RepeatPin(onPinChanged.getPinValue(), b0.INSTANCE.a(), null, 4, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final td0.a.OnPinChanged onPinChanged = (td0.a.OnPinChanged) this.f189702f;
            c0 c0Var = (c0) this.f189703g;
            Object objE = uq.b.e();
            int i15 = this.f189701e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (onPinChanged.getPinValue().getData().length < 6) {
                    return c0Var.b(new er.l() { // from class: td0.o
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return n.b.X(onPinChanged, (b.SetPin) obj2);
                        }
                    });
                }
                qd0.c cVar = n.this.validateSetPinUC;
                qd0.c.Params params = new qd0.c.Params(onPinChanged.getPinValue());
                this.f189702f = onPinChanged;
                this.f189703g = c0Var;
                this.f189701e = 1;
                obj = cVar.d(params, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final hz.g gVar = (hz.g) obj;
            if (gVar instanceof hz.g.Invalid) {
                return c0Var.b(new er.l() { // from class: td0.p
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return n.b.Y(gVar, (b.SetPin) obj2);
                    }
                });
            }
            if (fr.t.c(gVar, hz.g.b.f86853b)) {
                return c0Var.d(new er.l() { // from class: td0.q
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return n.b.Z(onPinChanged, (b.SetPin) obj2);
                    }
                });
            }
            throw new oq.p();
        }

        @Override // er.q
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public final Object w(td0.a.OnPinChanged onPinChanged, c0<td0.b.SetPin> c0Var, tq.e<? super k10.l<? extends td0.b>> eVar) {
            b bVar = n.this.new b(eVar);
            bVar.f189702f = onPinChanged;
            bVar.f189703g = c0Var;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltd0/a$a;", "<unused var>", "Ltd0/b$c;", "Loq/i0;", "<anonymous>", "(Ltd0/a$a;Ltd0/b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<td0.a.C4929a, td0.b.SetPin, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f189705e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f189705e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<td0.a.c> bVarY1 = n.this.Y1();
                td0.a.c.C4930a c4930a = td0.a.c.C4930a.f189649a;
                this.f189705e = 1;
                if (bVarY1.F(c4930a, this) == objE) {
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
        public final Object w(td0.a.C4929a c4929a, td0.b.SetPin setPin, tq.e<? super i0> eVar) {
            return n.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ltd0/a$d;", "action", "Lk10/c0;", "Ltd0/b$b;", "state", "Lk10/l;", "Ltd0/b;", "<anonymous>", "(Ltd0/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<td0.a.OnPinChanged, c0<td0.b.RepeatPin>, tq.e<? super k10.l<? extends td0.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f189707e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f189708f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f189709g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final td0.b.RepeatPin X(td0.a.OnPinChanged onPinChanged, td0.b.RepeatPin repeatPin) {
            return td0.b.RepeatPin.b(repeatPin, null, onPinChanged.getPinValue(), hz.b.C2039b.f86846c, 1, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final td0.b.RepeatPin Y(hz.g gVar, td0.b.RepeatPin repeatPin) {
            return td0.b.RepeatPin.b(repeatPin, null, b0.INSTANCE.a(), hz.b.INSTANCE.a(gVar), 1, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final td0.b.RepeatPin Z(td0.a.OnPinChanged onPinChanged, td0.b.RepeatPin repeatPin) {
            return td0.b.RepeatPin.b(repeatPin, null, onPinChanged.getPinValue(), null, 5, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final td0.a.OnPinChanged onPinChanged = (td0.a.OnPinChanged) this.f189708f;
            c0 c0Var = (c0) this.f189709g;
            Object objE = uq.b.e();
            int i15 = this.f189707e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (onPinChanged.getPinValue().getData().length < 6) {
                    return c0Var.b(new er.l() { // from class: td0.r
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return n.d.X(onPinChanged, (b.RepeatPin) obj2);
                        }
                    });
                }
                qd0.b bVar = n.this.validateRepeatedPinUC;
                qd0.b.Params params = new qd0.b.Params(((td0.b.RepeatPin) c0Var.a()).getPinValue(), onPinChanged.getPinValue());
                this.f189708f = onPinChanged;
                this.f189709g = c0Var;
                this.f189707e = 1;
                obj = bVar.e(params, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            n nVar = n.this;
            final hz.g gVar = (hz.g) obj;
            if (gVar instanceof hz.g.Invalid) {
                return c0Var.b(new er.l() { // from class: td0.s
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return n.d.Y(gVar, (b.RepeatPin) obj2);
                    }
                });
            }
            if (!fr.t.c(gVar, hz.g.b.f86853b)) {
                throw new oq.p();
            }
            nVar.d9(new td0.a.GenerateUserKeys(onPinChanged.getPinValue()));
            return c0Var.b(new er.l() { // from class: td0.t
                @Override // er.l
                public final Object b(Object obj2) {
                    return n.d.Z(onPinChanged, (b.RepeatPin) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public final Object w(td0.a.OnPinChanged onPinChanged, c0<td0.b.RepeatPin> c0Var, tq.e<? super k10.l<? extends td0.b>> eVar) {
            d dVar = n.this.new d(eVar);
            dVar.f189708f = onPinChanged;
            dVar.f189709g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ltd0/a$b;", "action", "Lk10/c0;", "Ltd0/b$b;", "state", "Lk10/l;", "Ltd0/b;", "<anonymous>", "(Ltd0/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<td0.a.GenerateUserKeys, c0<td0.b.RepeatPin>, tq.e<? super k10.l<? extends td0.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f189711e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f189712f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f189713g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Ltd0/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends td0.b>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f189715e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f189716f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f189717g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f189718h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f189719j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f189720k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ n f189721l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ td0.a.GenerateUserKeys f189722m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ c0<td0.b.RepeatPin> f189723n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(n nVar, td0.a.GenerateUserKeys generateUserKeys, c0<td0.b.RepeatPin> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f189721l = nVar;
                this.f189722m = generateUserKeys;
                this.f189723n = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final td0.b.Error X(final n nVar, dx.b bVar, td0.b.RepeatPin repeatPin) {
                return new td0.b.Error(nVar.errorVMSFactory.a(nVar.errorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: td0.v
                    @Override // er.l
                    public final Object b(Object obj) {
                        return n.e.a.Y(nVar, (ib4.c.b) obj);
                    }
                }, 2, null))));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final i0 Y(n nVar, ib4.c.b bVar) {
                if ((bVar instanceof ib4.c.b.a.Close) || (bVar instanceof ib4.c.b.a.Secondary)) {
                    nVar.d9(td0.a.C4929a.f189646a);
                } else if (bVar instanceof ib4.c.b.a.Primary) {
                    nVar.d9(td0.a.e.f189654a);
                } else if (!(bVar instanceof ib4.c.b.AbstractC2161b)) {
                    throw new oq.p();
                }
                return i0.f148189a;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                c0<td0.b.RepeatPin> c0Var;
                Object objE = uq.b.e();
                int i15 = this.f189720k;
                if (i15 == 0) {
                    oq.u.b(obj);
                    qg0.e eVar = this.f189721l.generateAppActivationKeysUC;
                    qg0.e.Params params = new qg0.e.Params(this.f189722m.getPinValue());
                    this.f189720k = 1;
                    obj = eVar.c(params, this);
                    if (obj != objE) {
                    }
                    return objE;
                }
                if (i15 == 1) {
                    oq.u.b(obj);
                } else {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0Var = (c0) this.f189716f;
                    oq.u.b(obj);
                }
                return c0Var.c();
                dx.i iVar = (dx.i) obj;
                c0<td0.b.RepeatPin> c0Var2 = this.f189723n;
                final n nVar = this.f189721l;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var2.d(new er.l() { // from class: td0.u
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return n.e.a.X(nVar, bVar, (b.RepeatPin) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                i0 i0Var = (i0) ((dx.i.Right) iVar).b();
                xw.b<td0.a.c> bVarY1 = nVar.Y1();
                td0.a.c.b bVar2 = td0.a.c.b.f189650a;
                this.f189715e = vq.j.a(iVar);
                this.f189716f = c0Var2;
                this.f189717g = vq.j.a(i0Var);
                this.f189718h = 0;
                this.f189719j = 0;
                this.f189720k = 2;
                if (bVarY1.F(bVar2, this) != objE) {
                    c0Var = c0Var2;
                    return c0Var.c();
                }
                return objE;
            }

            public final tq.e<i0> O(tq.e<?> eVar) {
                return new a(this.f189721l, this.f189722m, this.f189723n, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends td0.b>> eVar) {
                return ((a) O(eVar)).J(i0.f148189a);
            }
        }

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            td0.a.GenerateUserKeys generateUserKeys = (td0.a.GenerateUserKeys) this.f189712f;
            c0 c0Var = (c0) this.f189713g;
            Object objE = uq.b.e();
            int i15 = this.f189711e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = n.this.callActionWithLoaderUseCase;
            a aVar2 = new a(n.this, generateUserKeys, c0Var, null);
            this.f189712f = vq.j.a(generateUserKeys);
            this.f189713g = vq.j.a(c0Var);
            this.f189711e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(td0.a.GenerateUserKeys generateUserKeys, c0<td0.b.RepeatPin> c0Var, tq.e<? super k10.l<? extends td0.b>> eVar) {
            e eVar2 = n.this.new e(eVar);
            eVar2.f189712f = generateUserKeys;
            eVar2.f189713g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ltd0/a$a;", "<unused var>", "Lk10/c0;", "Ltd0/b$b;", "state", "Lk10/l;", "Ltd0/b;", "<anonymous>", "(Ltd0/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<td0.a.C4929a, c0<td0.b.RepeatPin>, tq.e<? super k10.l<? extends td0.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f189724e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f189725f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final td0.b.SetPin O(td0.b.RepeatPin repeatPin) {
            return new td0.b.SetPin(b0.INSTANCE.a(), null, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f189725f;
            uq.b.e();
            if (this.f189724e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: td0.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return n.f.O((b.RepeatPin) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(td0.a.C4929a c4929a, c0<td0.b.RepeatPin> c0Var, tq.e<? super k10.l<? extends td0.b>> eVar) {
            f fVar = new f(eVar);
            fVar.f189725f = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ltd0/a$e;", "<unused var>", "Lk10/c0;", "Ltd0/b$a;", "state", "Lk10/l;", "Ltd0/b;", "<anonymous>", "(Ltd0/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<td0.a.e, c0<td0.b.Error>, tq.e<? super k10.l<? extends td0.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f189726e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f189727f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final td0.b.SetPin O(td0.b.Error error) {
            return new td0.b.SetPin(null, null, 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f189727f;
            uq.b.e();
            if (this.f189726e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: td0.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return n.g.O((b.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(td0.a.e eVar, c0<td0.b.Error> c0Var, tq.e<? super k10.l<? extends td0.b>> eVar2) {
            g gVar = new g(eVar2);
            gVar.f189727f = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltd0/a$a;", "<unused var>", "Ltd0/b$a;", "Loq/i0;", "<anonymous>", "(Ltd0/a$a;Ltd0/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<td0.a.C4929a, td0.b.Error, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f189728e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f189728e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<td0.a.c> bVarY1 = n.this.Y1();
                td0.a.c.C4931c c4931c = td0.a.c.C4931c.f189651a;
                this.f189728e = 1;
                if (bVarY1.F(c4931c, this) == objE) {
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
        public final Object w(td0.a.C4929a c4929a, td0.b.Error error, tq.e<? super i0> eVar) {
            return n.this.new h(eVar).J(i0.f148189a);
        }
    }

    public n(yy.a aVar, qd0.b bVar, qd0.c cVar, ud0.e eVar, ib4.c cVar2, hb4.d dVar, ac4.a aVar2, qg0.e eVar2) {
        this.validateRepeatedPinUC = bVar;
        this.validateSetPinUC = cVar;
        this.mapper = eVar;
        this.errorMapper = cVar2;
        this.errorVMSFactory = dVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.generateAppActivationKeysUC = eVar2;
        this.stateMachine = aVar.a(new td0.b.SetPin(null, null, 3, null), new er.l() { // from class: td0.i
            @Override // er.l
            public final Object b(Object obj) {
                return n.w9(this.f189674a, (k10.v) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final td0.c.a t9(td0.b state) {
        return this.mapper.b(new ud0.e.Params(state, new er.l() { // from class: td0.j
            @Override // er.l
            public final Object b(Object obj) {
                return n.u9(this.f189675a, (b0) obj);
            }
        }, b9(td0.a.C4929a.f189646a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(n nVar, b0 b0Var) {
        nVar.d9(new td0.a.OnPinChanged(b0Var));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(final n nVar, k10.v vVar) {
        vVar.c(q0.c(td0.b.SetPin.class), new er.l() { // from class: td0.k
            @Override // er.l
            public final Object b(Object obj) {
                return n.x9(this.f189676a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(td0.b.RepeatPin.class), new er.l() { // from class: td0.l
            @Override // er.l
            public final Object b(Object obj) {
                return n.y9(this.f189677a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(td0.b.Error.class), new er.l() { // from class: td0.m
            @Override // er.l
            public final Object b(Object obj) {
                return n.z9(this.f189678a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(n nVar, k10.z zVar) {
        b bVar = nVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(td0.a.OnPinChanged.class), oVar, bVar);
        zVar.x(q0.c(td0.a.C4929a.class), oVar, nVar.new c(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(n nVar, k10.z zVar) {
        d dVar = nVar.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(td0.a.OnPinChanged.class), oVar, dVar);
        zVar.v(q0.c(td0.a.GenerateUserKeys.class), oVar, nVar.new e(null));
        zVar.v(q0.c(td0.a.C4929a.class), oVar, new f(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(n nVar, k10.z zVar) {
        g gVar = new g(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(td0.a.e.class), oVar, gVar);
        zVar.x(q0.c(td0.a.C4929a.class), oVar, nVar.new h(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<td0.a.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<td0.b, td0.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<td0.c.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: v9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
