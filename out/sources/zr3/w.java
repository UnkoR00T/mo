package zr3;

import cb4.DialogData;
import cj0.BookedZusEVisitSummary;
import fr.q0;
import mu.p0;
import mu.r0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import p096or3.a1;
import p096or3.b1;
import p096or3.c1;
import p096or3.d1;
import p096or3.f1;
import p096or3.g1;
import p096or3.x0;
import p096or3.y0;
import p096or3.z0;
import ss3.SummaryData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B#\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010 \u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J\u0013\u0010#\u001a\u00020\"*\u00020\u0002H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00102\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0010H\u0002¢\u0006\u0004\b)\u0010\u0018J\u000f\u0010*\u001a\u00020\u0010H\u0002¢\u0006\u0004\b*\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0014\u00106\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R,\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003078\u0014X\u0094\u0004¢\u0006\u0012\n\u0004\b8\u00109\u0012\u0004\b<\u0010\u0018\u001a\u0004\b:\u0010;R \u0010D\u001a\b\u0012\u0004\u0012\u00020?0>8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR \u0010G\u001a\b\u0012\u0004\u0012\u00020E0>8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010A\u001a\u0004\b@\u0010CR&\u0010N\u001a\b\u0012\u0004\u0012\u00020\"0H8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bI\u0010J\u0012\u0004\bM\u0010\u0018\u001a\u0004\bK\u0010L¨\u0006O"}, d2 = {"Lzr3/w;", "Ll00/g;", "Lzr3/o;", "", "Lzr3/p;", "Lzr3/n;", "Lyy/a;", "stateMachineFactory", "Lrs3/d;", "screenMapper", "Lzr3/n$a;", "setupData", "<init>", "(Lyy/a;Lrs3/d;Lzr3/n$a;)V", "Lss3/b;", "summaryData", "Loq/i0;", "A7", "(Lss3/b;)V", "Lcj0/e;", "bookedData", "I8", "(Lcj0/e;)V", "f7", "()V", "", "route", "P4", "(Ljava/lang/String;)V", "", "backNavigationVisible", "topContentVisible", "q9", "(Lzr3/o;ZZ)Lzr3/o;", "Lzr3/p$a;", "p9", "(Lzr3/o;)Lzr3/p$a;", "Lcb4/d;", "dialog", "t9", "(Lcb4/d;)V", "A", "close", "b", "Lrs3/d;", "c", "Lzr3/n$a;", "Lmu/b0;", "d", "Lmu/b0;", "o9", "()Lmu/b0;", "e", "Lzr3/o;", "initialState", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "getStateMachine$annotations", "stateMachine", "Lxw/b;", "Lzr3/m;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lzr3/m$b;", "h", "nestedNavAction", "Lmu/p0;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "getState$annotations", "state", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class w extends l00.g<State, Object> implements zr3.p, zr3.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final rs3.d screenMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final zr3.n.a setupData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final mu.b0<SummaryData> summaryData = r0.a(new SummaryData(null, null, null, 0, null, null, false, null, null, null, 1023, null));

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<zr3.m> navAction;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<zr3.m.b> nestedNavAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<zr3.p.Data> state;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f236567e;

        a(tq.e<? super a> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f236567e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<zr3.m.b> bVarG = w.this.g();
                zr3.m.b.a aVar = zr3.m.b.a.f236534a;
                this.f236567e = 1;
                if (bVarG.F(aVar, this) == objE) {
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
            return w.this.new a(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((a) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f236569e;

        b(tq.e<? super b> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f236569e;
            if (i15 == 0) {
                oq.u.b(obj);
                w wVar = w.this;
                zr3.m.a aVar = zr3.m.a.f236533a;
                this.f236569e = 1;
                if (wVar.F(aVar, this) == objE) {
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
            return w.this.new b(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((b) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class c extends fr.q implements er.a<oq.i0> {
        c(Object obj) {
            super(0, obj, w.class, "close", "close()V", 0);
        }

        public final void E() {
            ((w) this.f66391b).close();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ oq.i0 a() {
            E();
            return oq.i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class d extends fr.q implements er.a<oq.i0> {
        d(Object obj) {
            super(0, obj, w.class, "back", "back()V", 0);
        }

        public final void E() {
            ((w) this.f66391b).A();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ oq.i0 a() {
            E();
            return oq.i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class e extends fr.q implements er.l<DialogData, oq.i0> {
        e(Object obj) {
            super(1, obj, w.class, "showExitDialog", "showExitDialog(Lpl/gov/coi/shared/segment/dialog/contract/DialogData;)V", 0);
        }

        public final void E(DialogData dialogData) {
            ((w) this.f66391b).t9(dialogData);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(DialogData dialogData) {
            E(dialogData);
            return oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f236571e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ DialogData f236573g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(DialogData dialogData, tq.e<? super f> eVar) {
            super(1, eVar);
            this.f236573g = dialogData;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f236571e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<zr3.m.b> bVarG = w.this.g();
                zr3.m.b.ShowExitDialog showExitDialog = new zr3.m.b.ShowExitDialog(this.f236573g);
                this.f236571e = 1;
                if (bVarG.F(showExitDialog, this) == objE) {
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
            return w.this.new f(this.f236573g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((f) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class g implements mu.g<zr3.p.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f236574a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w f236575b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f236576a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ w f236577b;

            /* JADX INFO: renamed from: zr3.w$g$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C6396a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f236578d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f236579e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f236580f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f236582h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f236583j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f236584k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f236585l;

                public C6396a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f236578d = obj;
                    this.f236579e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, w wVar) {
                this.f236576a = hVar;
                this.f236577b = wVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C6396a c6396a;
                if (eVar instanceof C6396a) {
                    c6396a = (C6396a) eVar;
                    int i15 = c6396a.f236579e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c6396a.f236579e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c6396a = new C6396a(eVar);
                    }
                } else {
                    c6396a = new C6396a(eVar);
                }
                Object obj2 = c6396a.f236578d;
                Object objE = uq.b.e();
                int i16 = c6396a.f236579e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f236576a;
                    zr3.p.Data dataP9 = this.f236577b.p9((State) obj);
                    c6396a.f236580f = vq.j.a(obj);
                    c6396a.f236582h = vq.j.a(c6396a);
                    c6396a.f236583j = vq.j.a(obj);
                    c6396a.f236584k = vq.j.a(hVar);
                    c6396a.f236585l = 0;
                    c6396a.f236579e = 1;
                    if (hVar.F(dataP9, c6396a) == objE) {
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

        public g(mu.g gVar, w wVar) {
            this.f236574a = gVar;
            this.f236575b = wVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super zr3.p.Data> hVar, tq.e eVar) {
            Object objA = this.f236574a.a(new a(hVar, this.f236575b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lzr3/k;", "<unused var>", "Lk10/c0;", "Lzr3/o;", "state", "Lk10/l;", "<anonymous>", "(Lzr3/k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<zr3.k, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f236586e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f236587f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(w wVar, State state) {
            return w.r9(wVar, state, false, false, 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f236587f;
            uq.b.e();
            if (this.f236586e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final w wVar = w.this;
            return c0Var.b(new er.l() { // from class: zr3.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return w.h.O(wVar, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(zr3.k kVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            h hVar = w.this.new h(eVar);
            hVar.f236587f = c0Var;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lzr3/o;", "it", "Loq/i0;", "<anonymous>", "(Lzr3/o;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.p<State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f236589e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f236590f;

        i(tq.e<? super i> eVar) {
            super(2, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x007b, code lost:
        
            if (r2.F(r3, r19) == r1) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00e8, code lost:
        
            if (r4.F(r5, r19) == r1) goto L24;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r20) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 244
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: zr3.w.i.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(State state, tq.e<? super oq.i0> eVar) {
            return ((i) v(state, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return w.this.new i(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lzr3/l;", "<unused var>", "Lk10/c0;", "Lzr3/o;", "state", "Lk10/l;", "<anonymous>", "(Lzr3/l;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<zr3.l, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f236592e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f236593f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(w wVar, State state) {
            return w.r9(wVar, state, false, false, 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f236593f;
            uq.b.e();
            if (this.f236592e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final w wVar = w.this;
            return c0Var.b(new er.l() { // from class: zr3.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return w.j.O(wVar, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(zr3.l lVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            j jVar = w.this.new j(eVar);
            jVar.f236593f = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lzr3/i;", "<unused var>", "Lk10/c0;", "Lzr3/o;", "state", "Lk10/l;", "<anonymous>", "(Lzr3/i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<zr3.i, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f236595e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f236596f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(w wVar, State state) {
            return w.r9(wVar, state, false, false, 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f236596f;
            uq.b.e();
            if (this.f236595e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final w wVar = w.this;
            return c0Var.b(new er.l() { // from class: zr3.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return w.k.O(wVar, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(zr3.i iVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            k kVar = w.this.new k(eVar);
            kVar.f236596f = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lzr3/g;", "<unused var>", "Lk10/c0;", "Lzr3/o;", "state", "Lk10/l;", "<anonymous>", "(Lzr3/g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<zr3.g, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f236598e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f236599f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(w wVar, State state) {
            return w.r9(wVar, state, false, false, 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f236599f;
            uq.b.e();
            if (this.f236598e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final w wVar = w.this;
            return c0Var.b(new er.l() { // from class: zr3.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return w.l.O(wVar, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(zr3.g gVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            l lVar = w.this.new l(eVar);
            lVar.f236599f = c0Var;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lzr3/h;", "<unused var>", "Lk10/c0;", "Lzr3/o;", "state", "Lk10/l;", "<anonymous>", "(Lzr3/h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<zr3.h, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f236601e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f236602f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(w wVar, State state) {
            return w.r9(wVar, state, false, false, 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f236602f;
            uq.b.e();
            if (this.f236601e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final w wVar = w.this;
            return c0Var.b(new er.l() { // from class: zr3.b0
                @Override // er.l
                public final Object b(Object obj2) {
                    return w.m.O(wVar, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(zr3.h hVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            m mVar = w.this.new m(eVar);
            mVar.f236602f = c0Var;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lzr3/f;", "<unused var>", "Lk10/c0;", "Lzr3/o;", "state", "Lk10/l;", "<anonymous>", "(Lzr3/f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<zr3.f, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f236604e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f236605f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, false, false, 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f236605f;
            uq.b.e();
            if (this.f236604e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: zr3.c0
                @Override // er.l
                public final Object b(Object obj2) {
                    return w.n.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(zr3.f fVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            n nVar = new n(eVar);
            nVar.f236605f = c0Var;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lzr3/e;", "<unused var>", "Lk10/c0;", "Lzr3/o;", "state", "Lk10/l;", "<anonymous>", "(Lzr3/e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<zr3.e, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f236606e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f236607f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(w wVar, State state) {
            return w.r9(wVar, state, false, false, 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f236607f;
            uq.b.e();
            if (this.f236606e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final w wVar = w.this;
            return c0Var.b(new er.l() { // from class: zr3.d0
                @Override // er.l
                public final Object b(Object obj2) {
                    return w.o.O(wVar, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(zr3.e eVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar2) {
            o oVar = w.this.new o(eVar2);
            oVar.f236607f = c0Var;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lzr3/d;", "<unused var>", "Lk10/c0;", "Lzr3/o;", "state", "Lk10/l;", "<anonymous>", "(Lzr3/d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<zr3.d, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f236609e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f236610f;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(w wVar, State state) {
            return w.r9(wVar, state, wVar.c().getValue().getNewVisitState() == ss3.a.NEW_VISIT, false, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f236610f;
            uq.b.e();
            if (this.f236609e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final w wVar = w.this;
            return c0Var.b(new er.l() { // from class: zr3.e0
                @Override // er.l
                public final Object b(Object obj2) {
                    return w.p.O(wVar, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(zr3.d dVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            p pVar = w.this.new p(eVar);
            pVar.f236610f = c0Var;
            return pVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lzr3/j;", "<unused var>", "Lk10/c0;", "Lzr3/o;", "state", "Lk10/l;", "<anonymous>", "(Lzr3/j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<zr3.j, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f236612e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f236613f;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(w wVar, State state) {
            return w.r9(wVar, state, false, false, 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f236613f;
            uq.b.e();
            if (this.f236612e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final w wVar = w.this;
            return c0Var.b(new er.l() { // from class: zr3.f0
                @Override // er.l
                public final Object b(Object obj2) {
                    return w.q.O(wVar, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(zr3.j jVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            q qVar = w.this.new q(eVar);
            qVar.f236613f = c0Var;
            return qVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f236615e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ BookedZusEVisitSummary f236617g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(BookedZusEVisitSummary bookedZusEVisitSummary, tq.e<? super r> eVar) {
            super(1, eVar);
            this.f236617g = bookedZusEVisitSummary;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f236615e;
            if (i15 == 0) {
                oq.u.b(obj);
                w wVar = w.this;
                zr3.m.ToOutro toOutro = new zr3.m.ToOutro(this.f236617g);
                this.f236615e = 1;
                if (wVar.F(toOutro, this) == objE) {
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
            return w.this.new r(this.f236617g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((r) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f236618e;

        s(tq.e<? super s> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f236618e;
            if (i15 == 0) {
                oq.u.b(obj);
                w wVar = w.this;
                zr3.m.d dVar = zr3.m.d.f236538a;
                this.f236618e = 1;
                if (wVar.F(dVar, this) == objE) {
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
            return w.this.new s(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((s) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f236620e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ SummaryData f236622g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(SummaryData summaryData, tq.e<? super t> eVar) {
            super(1, eVar);
            this.f236622g = summaryData;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f236620e;
            if (i15 == 0) {
                oq.u.b(obj);
                mu.b0<SummaryData> b0VarC = w.this.c();
                SummaryData summaryData = this.f236622g;
                this.f236620e = 1;
                if (b0VarC.F(summaryData, this) == objE) {
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
            return w.this.new t(this.f236622g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((t) M(eVar)).J(oq.i0.f148189a);
        }
    }

    public w(yy.a aVar, rs3.d dVar, zr3.n.a aVar2) {
        this.screenMapper = dVar;
        this.setupData = aVar2;
        State state = new State(false, false, 3, null);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: zr3.v
            @Override // er.l
            public final Object b(Object obj) {
                return w.u9(this.f236558a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.nestedNavAction = new xw.b<>();
        this.state = a9(new g(e9().getState(), this), p9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A() {
        i00.a.a(this, new a(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void close() {
        i00.a.a(this, new b(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zr3.p.Data p9(State state) {
        return this.screenMapper.b(new rs3.d.Params(state, c().getValue().getNewVisitState(), new c(this), new d(this), new e(this)));
    }

    private final State q9(State state, boolean z15, boolean z16) {
        return state.a(z15, z16);
    }

    static /* synthetic */ State r9(w wVar, State state, boolean z15, boolean z16, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = true;
        }
        if ((i15 & 2) != 0) {
            z16 = true;
        }
        return wVar.q9(state, z15, z16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t9(DialogData dialog) {
        i00.a.a(this, new f(dialog, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u9(final w wVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: zr3.u
            @Override // er.l
            public final Object b(Object obj) {
                return w.v9(this.f236557a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v9(w wVar, k10.z zVar) {
        zVar.C(wVar.new i(null));
        j jVar = wVar.new j(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(zr3.l.class), oVar, jVar);
        zVar.v(q0.c(zr3.i.class), oVar, wVar.new k(null));
        zVar.v(q0.c(zr3.g.class), oVar, wVar.new l(null));
        zVar.v(q0.c(zr3.h.class), oVar, wVar.new m(null));
        zVar.v(q0.c(zr3.f.class), oVar, new n(null));
        zVar.v(q0.c(zr3.e.class), oVar, wVar.new o(null));
        zVar.v(q0.c(zr3.d.class), oVar, wVar.new p(null));
        zVar.v(q0.c(zr3.j.class), oVar, wVar.new q(null));
        zVar.v(q0.c(zr3.k.class), oVar, wVar.new h(null));
        return oq.i0.f148189a;
    }

    @Override // zr3.n
    public void A7(SummaryData summaryData) {
        i00.a.a(this, new t(summaryData, null));
    }

    @Override // zr3.n
    public void I8(BookedZusEVisitSummary bookedData) {
        i00.a.a(this, new r(bookedData, null));
    }

    @Override // zr3.n
    public void P4(String route) {
        if (fr.t.c(route, c1.f148631a.getRoute())) {
            d9(zr3.l.f236532a);
            return;
        }
        if (fr.t.c(route, b1.f148623a.getRoute())) {
            d9(zr3.i.f236528a);
            return;
        }
        if (fr.t.c(route, z0.f148837a.getRoute())) {
            d9(zr3.g.f236525a);
            return;
        }
        if (fr.t.c(route, a1.f148619a.getRoute())) {
            d9(zr3.h.f236526a);
            return;
        }
        if (fr.t.c(route, y0.f148833a.getRoute())) {
            d9(zr3.e.f236521a);
            return;
        }
        if (fr.t.c(route, d1.f148639a.getRoute())) {
            d9(zr3.f.f236523a);
            return;
        }
        if (fr.t.c(route, x0.f148825a.getRoute())) {
            d9(zr3.d.f236519a);
        } else if (fr.t.c(route, f1.f148662a.getRoute())) {
            d9(zr3.j.f236530a);
        } else if (fr.t.c(route, g1.f148672a.getRoute())) {
            d9(zr3.k.f236531a);
        }
    }

    @Override // zx.b
    public xw.b<zr3.m> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // zr3.n
    public void f7() {
        i00.a.a(this, new s(null));
    }

    @Override // zr3.n
    public xw.b<zr3.m.b> g() {
        return this.nestedNavAction;
    }

    @Override // l00.e
    public p0<zr3.p.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: n9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(zr3.m mVar, tq.e<? super oq.i0> eVar) {
        return super.F(mVar, eVar);
    }

    @Override // zr3.n
    /* JADX INFO: renamed from: o9, reason: merged with bridge method [inline-methods] */
    public mu.b0<SummaryData> c() {
        return this.summaryData;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: s9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(zr3.n.a aVar) {
        super.P5(aVar);
    }
}
