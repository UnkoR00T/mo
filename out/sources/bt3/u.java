package bt3;

import a14.d0;
import cb4.DialogData;
import cj0.ZusEVisitDepartment;
import cj0.ZusEVisitDetails;
import cj0.ZusEVisitTopic;
import fr.q0;
import iy.b0;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 i2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006:\u0001jBS\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u001cH\u0096\u0001¢\u0006\u0004\b\u001f\u0010 J \u0010$\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b$\u0010%J\u0013\u0010'\u001a\u00020&*\u00020\u0002H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u001cH\u0002¢\u0006\u0004\b)\u0010 J\u000f\u0010*\u001a\u00020\u001cH\u0002¢\u0006\u0004\b*\u0010 J\u000f\u0010+\u001a\u00020\u001cH\u0002¢\u0006\u0004\b+\u0010 J\u000f\u0010,\u001a\u00020\u001cH\u0002¢\u0006\u0004\b,\u0010 J\u000f\u0010-\u001a\u00020\u001cH\u0002¢\u0006\u0004\b-\u0010 J\u000f\u0010.\u001a\u00020\u001cH\u0002¢\u0006\u0004\b.\u0010 J\u000f\u0010/\u001a\u00020\u001cH\u0002¢\u0006\u0004\b/\u0010 J\u0017\u00102\u001a\u00020\u001c2\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b2\u00103J$\u00108\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u001c062\u0006\u00105\u001a\u000204H\u0082@¢\u0006\u0004\b8\u00109J$\u0010:\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u001c062\u0006\u00105\u001a\u000204H\u0082@¢\u0006\u0004\b:\u00109J\u0017\u0010;\u001a\u00020\u001c2\u0006\u0010\"\u001a\u000207H\u0002¢\u0006\u0004\b;\u0010<R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010AR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010O\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR,\u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030P8\u0014X\u0094\u0004¢\u0006\u0012\n\u0004\bQ\u0010R\u0012\u0004\bU\u0010 \u001a\u0004\bS\u0010TR \u0010]\u001a\b\u0012\u0004\u0012\u00020X0W8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R&\u0010d\u001a\b\u0012\u0004\u0012\u00020&0^8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b_\u0010`\u0012\u0004\bc\u0010 \u001a\u0004\ba\u0010bR\u001a\u0010h\u001a\b\u0012\u0004\u0012\u00020f0e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bJ\u0010g¨\u0006k"}, d2 = {"Lbt3/u;", "Ll00/g;", "Lbt3/c;", "Lbt3/a;", "Lbt3/d;", "", "Li70/n;", "Lyy/a;", "stateMachineFactory", "Lnr3/j;", "getZusEVisitDetailsUseCase", "Lnr3/a;", "addVisitToCalendarUseCase", "Lib4/c;", "errorMapper", "Lct3/e;", "screenMapper", "La14/w;", "openUrlIntentUseCase", "La14/d0;", "shareTextIntentUseCase", "snackBarManagerStateHolder", "Lbt3/b;", "setupData", "<init>", "(Lyy/a;Lnr3/j;Lnr3/a;Lib4/c;Lct3/e;La14/w;La14/d0;Li70/n;Lbt3/b;)V", "Lp50/a;", "snackBarData", "Loq/i0;", "y", "(Lp50/a;)V", "B0", "()V", "Ldx/b;", "domainError", "action", "F9", "(Ldx/b;Lbt3/a;Ltq/e;)Ljava/lang/Object;", "Lbt3/d$a;", "I9", "(Lbt3/c;)Lbt3/d$a;", "d", "P9", "C9", "O9", "D9", "H9", "L9", "Lcb4/d;", "dialog", "Q9", "(Lcb4/d;)V", "Liy/b0;", "url", "Ldx/i;", "Ldx/b$c;", "K9", "(Liy/b0;Ltq/e;)Ljava/lang/Object;", "N9", "J9", "(Ldx/b$c;)V", "b", "Lnr3/j;", "c", "Lnr3/a;", "Lib4/c;", "e", "Lct3/e;", "f", "La14/w;", "g", "La14/d0;", "h", "Li70/n;", "j", "Lbt3/b;", "Lbt3/c$b;", "k", "Lbt3/c$b;", "initialState", "Lk10/t;", "l", "Lk10/t;", "e9", "()Lk10/t;", "getStateMachine$annotations", "stateMachine", "Lxw/b;", "Lbt3/a$e;", "m", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "n", "Lmu/p0;", "getState", "()Lmu/p0;", "getState$annotations", "state", "Lmu/g;", "Li70/p;", "()Lmu/g;", "snackBarVisibilityState", "p", "a", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u extends l00.g<bt3.c, a> implements bt3.d, zx.d, i70.n {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f21631q = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final nr3.j getZusEVisitDetailsUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final nr3.a addVisitToCalendarUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ib4.c errorMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ct3.e screenMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final a14.w openUrlIntentUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final d0 shareTextIntentUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final bt3.c.b initialState;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final k10.t<bt3.c, a> stateMachine;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final xw.b<a.e> navAction;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final p0<bt3.d.a> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class b extends fr.q implements er.a<i0> {
        b(Object obj) {
            super(0, obj, u.class, "onBackPressed", "onBackPressed()V", 0);
        }

        public final void E() {
            ((u) this.f66391b).d();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            E();
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class c extends fr.q implements er.a<i0> {
        c(Object obj) {
            super(0, obj, u.class, "showInfo", "showInfo()V", 0);
        }

        public final void E() {
            ((u) this.f66391b).P9();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            E();
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class d extends fr.q implements er.a<i0> {
        d(Object obj) {
            super(0, obj, u.class, "addToCalendar", "addToCalendar()V", 0);
        }

        public final void E() {
            ((u) this.f66391b).C9();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            E();
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class e extends fr.q implements er.a<i0> {
        e(Object obj) {
            super(0, obj, u.class, "shareVisitLink", "shareVisitLink()V", 0);
        }

        public final void E() {
            ((u) this.f66391b).O9();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            E();
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class f extends fr.q implements er.a<i0> {
        f(Object obj) {
            super(0, obj, u.class, "cancelVisit", "cancelVisit()V", 0);
        }

        public final void E() {
            ((u) this.f66391b).D9();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            E();
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class g extends fr.q implements er.a<i0> {
        g(Object obj) {
            super(0, obj, u.class, "joinVisit", "joinVisit()V", 0);
        }

        public final void E() {
            ((u) this.f66391b).H9();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            E();
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class h extends fr.q implements er.a<i0> {
        h(Object obj) {
            super(0, obj, u.class, "redoVisit", "redoVisit()V", 0);
        }

        public final void E() {
            ((u) this.f66391b).L9();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            E();
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class i extends fr.q implements er.l<DialogData, i0> {
        i(Object obj) {
            super(1, obj, u.class, "showNavigationDialog", "showNavigationDialog(Lpl/gov/coi/shared/segment/dialog/contract/DialogData;)V", 0);
        }

        public final void E(DialogData dialogData) {
            ((u) this.f66391b).Q9(dialogData);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(DialogData dialogData) {
            E(dialogData);
            return i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f21644e;

        j(tq.e<? super j> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f21644e;
            if (i15 == 0) {
                oq.u.b(obj);
                u uVar = u.this;
                a.e.C0564a c0564a = a.e.C0564a.f21573a;
                this.f21644e = 1;
                if (uVar.F(c0564a, this) == objE) {
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
            return u.this.new j(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((j) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class k extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f21646d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f21647e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f21649g;

        k(tq.e<? super k> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f21647e = obj;
            this.f21649g |= PKIFailureInfo.systemUnavail;
            return u.this.K9(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class l extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f21650d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f21651e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f21653g;

        l(tq.e<? super l> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f21651e = obj;
            this.f21653g |= PKIFailureInfo.systemUnavail;
            return u.this.N9(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f21654e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ DialogData f21656g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(DialogData dialogData, tq.e<? super m> eVar) {
            super(1, eVar);
            this.f21656g = dialogData;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f21654e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<a.e> bVarY1 = u.this.Y1();
                a.e.ShowNavigationDialog showNavigationDialog = new a.e.ShowNavigationDialog(this.f21656g);
                this.f21654e = 1;
                if (bVarY1.F(showNavigationDialog, this) == objE) {
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
            return u.this.new m(this.f21656g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((m) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class n implements mu.g<bt3.d.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f21657a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u f21658b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f21659a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ u f21660b;

            /* JADX INFO: renamed from: bt3.u$n$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0568a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f21661d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f21662e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f21663f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f21665h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f21666j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f21667k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f21668l;

                public C0568a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f21661d = obj;
                    this.f21662e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, u uVar) {
                this.f21659a = hVar;
                this.f21660b = uVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0568a c0568a;
                if (eVar instanceof C0568a) {
                    c0568a = (C0568a) eVar;
                    int i15 = c0568a.f21662e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0568a.f21662e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0568a = new C0568a(eVar);
                    }
                } else {
                    c0568a = new C0568a(eVar);
                }
                Object obj2 = c0568a.f21661d;
                Object objE = uq.b.e();
                int i16 = c0568a.f21662e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f21659a;
                    bt3.d.a aVarI9 = this.f21660b.I9((bt3.c) obj);
                    c0568a.f21663f = vq.j.a(obj);
                    c0568a.f21665h = vq.j.a(c0568a);
                    c0568a.f21666j = vq.j.a(obj);
                    c0568a.f21667k = vq.j.a(hVar);
                    c0568a.f21668l = 0;
                    c0568a.f21662e = 1;
                    if (hVar.F(aVarI9, c0568a) == objE) {
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

        public n(mu.g gVar, u uVar) {
            this.f21657a = gVar;
            this.f21658b = uVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super bt3.d.a> hVar, tq.e eVar) {
            Object objA = this.f21657a.a(new a(hVar, this.f21658b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lbt3/c$b;", "it", "Loq/i0;", "<anonymous>", "(Lbt3/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.p<bt3.c.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f21669e;

        o(tq.e<? super o> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f21669e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            u.this.d9(a.d.f21572a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(bt3.c.b bVar, tq.e<? super i0> eVar) {
            return ((o) v(bVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return u.this.new o(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lbt3/a$d;", "action", "Lk10/c0;", "Lbt3/c$b;", "state", "Lk10/l;", "Lbt3/c;", "<anonymous>", "(Lbt3/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<a.d, c0<bt3.c.b>, tq.e<? super k10.l<? extends bt3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f21671e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f21672f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f21673g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f21674h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f21675j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f21676k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f21677l;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final bt3.c O(ZusEVisitDetails zusEVisitDetails, u uVar, bt3.c.b bVar) {
            boolean zE = zusEVisitDetails.getStatus().e();
            if (zE) {
                return new bt3.c.Planned(zusEVisitDetails);
            }
            if (zE) {
                throw new oq.p();
            }
            return new bt3.c.Finished(zusEVisitDetails, uVar.setupData.getBookingAvailable());
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0083, code lost:
        
            if (r3.F9(r5, r0, r8) == r2) goto L17;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r9) throws java.lang.Throwable {
            /*
                r8 = this;
                java.lang.Object r0 = r8.f21676k
                bt3.a$d r0 = (bt3.a.d) r0
                java.lang.Object r1 = r8.f21677l
                k10.c0 r1 = (k10.c0) r1
                java.lang.Object r2 = uq.b.e()
                int r3 = r8.f21675j
                r4 = 2
                r5 = 1
                if (r3 == 0) goto L2e
                if (r3 == r5) goto L2a
                if (r3 != r4) goto L22
                java.lang.Object r0 = r8.f21672f
                dx.b r0 = (dx.b) r0
                java.lang.Object r0 = r8.f21671e
                dx.i r0 = (dx.i) r0
                oq.u.b(r9)
                goto L86
            L22:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L2a:
                oq.u.b(r9)
                goto L53
            L2e:
                oq.u.b(r9)
                bt3.u r9 = bt3.u.this
                nr3.j r9 = bt3.u.p9(r9)
                nr3.j$a r3 = new nr3.j$a
                bt3.u r6 = bt3.u.this
                bt3.b r6 = bt3.u.q9(r6)
                long r6 = r6.getVisitId()
                r3.<init>(r6)
                r8.f21676k = r0
                r8.f21677l = r1
                r8.f21675j = r5
                java.lang.Object r9 = r9.e(r3, r8)
                if (r9 != r2) goto L53
                goto L85
            L53:
                dx.i r9 = (dx.i) r9
                bt3.u r3 = bt3.u.this
                boolean r5 = r9 instanceof dx.i.Left
                if (r5 == 0) goto L8b
                r5 = r9
                dx.i$b r5 = (dx.i.Left) r5
                java.lang.Object r5 = r5.b()
                dx.b r5 = (dx.b) r5
                java.lang.Object r6 = vq.j.a(r0)
                r8.f21676k = r6
                r8.f21677l = r1
                java.lang.Object r9 = vq.j.a(r9)
                r8.f21671e = r9
                java.lang.Object r9 = vq.j.a(r5)
                r8.f21672f = r9
                r9 = 0
                r8.f21673g = r9
                r8.f21674h = r9
                r8.f21675j = r4
                java.lang.Object r9 = bt3.u.r9(r3, r5, r0, r8)
                if (r9 != r2) goto L86
            L85:
                return r2
            L86:
                k10.l r9 = r1.c()
                return r9
            L8b:
                boolean r0 = r9 instanceof dx.i.Right
                if (r0 == 0) goto La1
                dx.i$c r9 = (dx.i.Right) r9
                java.lang.Object r9 = r9.b()
                cj0.i r9 = (cj0.ZusEVisitDetails) r9
                bt3.v r0 = new bt3.v
                r0.<init>()
                k10.l r9 = r1.d(r0)
                return r9
            La1:
                oq.p r9 = new oq.p
                r9.<init>()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: bt3.u.p.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.d dVar, c0<bt3.c.b> c0Var, tq.e<? super k10.l<? extends bt3.c>> eVar) {
            p pVar = u.this.new p(eVar);
            pVar.f21676k = dVar;
            pVar.f21677l = c0Var;
            return pVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lbt3/a$h;", "<unused var>", "Lbt3/c$c;", "Loq/i0;", "<anonymous>", "(Lbt3/a$h;Lbt3/c$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<a.h, bt3.c.Planned, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f21679e;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f21679e;
            if (i15 == 0) {
                oq.u.b(obj);
                u uVar = u.this;
                a.e.c cVar = a.e.c.f21575a;
                this.f21679e = 1;
                if (uVar.F(cVar, this) == objE) {
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
        public final Object w(a.h hVar, bt3.c.Planned planned, tq.e<? super i0> eVar) {
            return u.this.new q(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lbt3/a$a;", "<unused var>", "Lbt3/c$c;", "state", "Loq/i0;", "<anonymous>", "(Lbt3/a$a;Lbt3/c$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<a.C0563a, bt3.c.Planned, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f21681e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f21682f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f21683g;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            bt3.c.Planned planned = (bt3.c.Planned) this.f21683g;
            Object objE = uq.b.e();
            int i15 = this.f21682f;
            if (i15 == 0) {
                oq.u.b(obj);
                ZusEVisitDetails details = planned.getDetails();
                nr3.a aVar = u.this.addVisitToCalendarUseCase;
                long jK = ez.d.k(details.getVisitDate().getDate());
                long jK2 = ez.d.k(details.getVisitEndDate().getDate());
                nr3.a.Params params = new nr3.a.Params(details.getTopicDescription(), jK, vq.b.f(jK2), details.getVisitUrl());
                this.f21683g = vq.j.a(planned);
                this.f21681e = vq.j.a(details);
                this.f21682f = 1;
                obj = aVar.d(params, this);
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
            u uVar = u.this;
            if (iVar instanceof dx.i.Left) {
                uVar.J9((dx.b.Business) ((dx.i.Left) iVar).b());
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a.C0563a c0563a, bt3.c.Planned planned, tq.e<? super i0> eVar) {
            r rVar = u.this.new r(eVar);
            rVar.f21683g = planned;
            return rVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lbt3/a$g;", "<unused var>", "Lbt3/c$c;", "state", "Loq/i0;", "<anonymous>", "(Lbt3/a$g;Lbt3/c$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<a.g, bt3.c.Planned, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f21685e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f21686f;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            bt3.c.Planned planned = (bt3.c.Planned) this.f21686f;
            Object objE = uq.b.e();
            int i15 = this.f21685e;
            if (i15 == 0) {
                oq.u.b(obj);
                u uVar = u.this;
                b0 visitUrl = planned.getDetails().getVisitUrl();
                this.f21686f = vq.j.a(planned);
                this.f21685e = 1;
                if (uVar.N9(visitUrl, this) == objE) {
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
        public final Object w(a.g gVar, bt3.c.Planned planned, tq.e<? super i0> eVar) {
            s sVar = u.this.new s(eVar);
            sVar.f21686f = planned;
            return sVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lbt3/a$b;", "<unused var>", "Lbt3/c$c;", "state", "Loq/i0;", "<anonymous>", "(Lbt3/a$b;Lbt3/c$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.q<a.b, bt3.c.Planned, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f21688e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f21689f;

        t(tq.e<? super t> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            bt3.c.Planned planned = (bt3.c.Planned) this.f21689f;
            Object objE = uq.b.e();
            int i15 = this.f21688e;
            if (i15 == 0) {
                oq.u.b(obj);
                u uVar = u.this;
                b0 cancelUrl = planned.getDetails().getCancelUrl();
                this.f21689f = vq.j.a(planned);
                this.f21688e = 1;
                if (uVar.K9(cancelUrl, this) == objE) {
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
        public final Object w(a.b bVar, bt3.c.Planned planned, tq.e<? super i0> eVar) {
            t tVar = u.this.new t(eVar);
            tVar.f21689f = planned;
            return tVar.J(i0.f148189a);
        }
    }

    /* JADX INFO: renamed from: bt3.u$u, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lbt3/a$c;", "<unused var>", "Lbt3/c$c;", "state", "Loq/i0;", "<anonymous>", "(Lbt3/a$c;Lbt3/c$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class C0569u extends vq.k implements er.q<a.c, bt3.c.Planned, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f21691e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f21692f;

        C0569u(tq.e<? super C0569u> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            bt3.c.Planned planned = (bt3.c.Planned) this.f21692f;
            Object objE = uq.b.e();
            int i15 = this.f21691e;
            if (i15 == 0) {
                oq.u.b(obj);
                u uVar = u.this;
                b0 visitUrl = planned.getDetails().getVisitUrl();
                this.f21692f = vq.j.a(planned);
                this.f21691e = 1;
                if (uVar.K9(visitUrl, this) == objE) {
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
        public final Object w(a.c cVar, bt3.c.Planned planned, tq.e<? super i0> eVar) {
            C0569u c0569u = u.this.new C0569u(eVar);
            c0569u.f21692f = planned;
            return c0569u.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lbt3/a$f;", "<unused var>", "Lbt3/c$a;", "state", "Loq/i0;", "<anonymous>", "(Lbt3/a$f;Lbt3/c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class v extends vq.k implements er.q<a.f, bt3.c.Finished, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f21694e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f21695f;

        v(tq.e<? super v> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            bt3.c.Finished finished = (bt3.c.Finished) this.f21695f;
            Object objE = uq.b.e();
            int i15 = this.f21694e;
            if (i15 == 0) {
                oq.u.b(obj);
                u uVar = u.this;
                a.e.RedoVisit redoVisit = new a.e.RedoVisit(new zr3.n.a.RedoVisit(new ZusEVisitTopic(finished.getDetails().getTopicId(), ZusEVisitTopic.a.UNKNOWN, finished.getDetails().getTopicDescription(), ""), new ZusEVisitDepartment(finished.getDetails().getDepartmentId(), mx.b.d(finished.getDetails().getDepartmentDescription(), "departmentDescription").getText(), "", "", "", "")));
                this.f21695f = vq.j.a(finished);
                this.f21694e = 1;
                if (uVar.F(redoVisit, this) == objE) {
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
        public final Object w(a.f fVar, bt3.c.Finished finished, tq.e<? super i0> eVar) {
            v vVar = u.this.new v(eVar);
            vVar.f21695f = finished;
            return vVar.J(i0.f148189a);
        }
    }

    public u(yy.a aVar, nr3.j jVar, nr3.a aVar2, ib4.c cVar, ct3.e eVar, a14.w wVar, d0 d0Var, i70.n nVar, SetupData setupData) {
        this.getZusEVisitDetailsUseCase = jVar;
        this.addVisitToCalendarUseCase = aVar2;
        this.errorMapper = cVar;
        this.screenMapper = eVar;
        this.openUrlIntentUseCase = wVar;
        this.shareTextIntentUseCase = d0Var;
        this.snackBarManagerStateHolder = nVar;
        this.setupData = setupData;
        bt3.c.b bVar = bt3.c.b.f21585a;
        this.initialState = bVar;
        this.stateMachine = aVar.a(bVar, new er.l() { // from class: bt3.t
            @Override // er.l
            public final Object b(Object obj) {
                return u.R9(this.f21629a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new n(e9().getState(), this), I9(bVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C9() {
        d9(a.C0563a.f21569a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D9() {
        d9(a.b.f21570a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object F9(dx.b bVar, final a aVar, tq.e<? super i0> eVar) {
        Object objF = Y1().F(new a.e.Error(this.errorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: bt3.s
            @Override // er.l
            public final Object b(Object obj) {
                return u.G9(this.f21627a, aVar, (ib4.c.b) obj);
            }
        }, 2, null))), eVar);
        return objF == uq.b.e() ? objF : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G9(u uVar, a aVar, ib4.c.b bVar) {
        if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
            uVar.d9(aVar);
        } else if (bVar instanceof ib4.c.b.AbstractC2161b.a) {
            uVar.d();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H9() {
        d9(a.c.f21571a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bt3.d.a I9(bt3.c cVar) {
        return this.screenMapper.b(new ct3.e.Params(cVar, new b(this), new c(this), new d(this), new e(this), new f(this), new g(this), new h(this), new i(this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J9(dx.b.Business domainError) {
        y(new p50.a.DefaultWithIcon(domainError.getMessage(), false, null, null, 14, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object K9(b0 b0Var, tq.e<? super dx.i<dx.b.Business, i0>> eVar) throws Throwable {
        k kVar;
        if (eVar instanceof k) {
            kVar = (k) eVar;
            int i15 = kVar.f21649g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                kVar.f21649g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                kVar = new k(eVar);
            }
        } else {
            kVar = new k(eVar);
        }
        Object objC = kVar.f21647e;
        Object objE = uq.b.e();
        int i16 = kVar.f21649g;
        if (i16 == 0) {
            oq.u.b(objC);
            a14.w wVar = this.openUrlIntentUseCase;
            a14.w.Params params = new a14.w.Params(iy.c0.e(b0Var), false, 2, null);
            kVar.f21646d = vq.j.a(b0Var);
            kVar.f21649g = 1;
            objC = wVar.c(params, kVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objC);
        }
        dx.i iVar = (dx.i) objC;
        if (iVar instanceof dx.i.Left) {
            J9((dx.b.Business) ((dx.i.Left) iVar).b());
        }
        return iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L9() {
        d9(a.f.f21578a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object N9(b0 b0Var, tq.e<? super dx.i<dx.b.Business, i0>> eVar) throws Throwable {
        l lVar;
        if (eVar instanceof l) {
            lVar = (l) eVar;
            int i15 = lVar.f21653g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                lVar.f21653g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                lVar = new l(eVar);
            }
        } else {
            lVar = new l(eVar);
        }
        Object objC = lVar.f21651e;
        Object objE = uq.b.e();
        int i16 = lVar.f21653g;
        if (i16 == 0) {
            oq.u.b(objC);
            d0 d0Var = this.shareTextIntentUseCase;
            d0.Params params = new d0.Params(iy.c0.e(b0Var));
            lVar.f21650d = vq.j.a(b0Var);
            lVar.f21653g = 1;
            objC = d0Var.c(params, lVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objC);
        }
        dx.i iVar = (dx.i) objC;
        if (iVar instanceof dx.i.Left) {
            J9((dx.b.Business) ((dx.i.Left) iVar).b());
        }
        return iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O9() {
        d9(a.g.f21579a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P9() {
        d9(a.h.f21580a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q9(DialogData dialog) {
        i00.a.a(this, new m(dialog, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 R9(final u uVar, k10.v vVar) {
        vVar.c(q0.c(bt3.c.b.class), new er.l() { // from class: bt3.p
            @Override // er.l
            public final Object b(Object obj) {
                return u.S9(this.f21624a, (z) obj);
            }
        });
        vVar.c(q0.c(bt3.c.Planned.class), new er.l() { // from class: bt3.q
            @Override // er.l
            public final Object b(Object obj) {
                return u.T9(this.f21625a, (z) obj);
            }
        });
        vVar.c(q0.c(bt3.c.Finished.class), new er.l() { // from class: bt3.r
            @Override // er.l
            public final Object b(Object obj) {
                return u.U9(this.f21626a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 S9(u uVar, z zVar) {
        zVar.C(uVar.new o(null));
        p pVar = uVar.new p(null);
        zVar.v(q0.c(a.d.class), k10.o.CANCEL_PREVIOUS, pVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 T9(u uVar, z zVar) {
        q qVar = uVar.new q(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(a.h.class), oVar, qVar);
        zVar.x(q0.c(a.C0563a.class), oVar, uVar.new r(null));
        zVar.x(q0.c(a.g.class), oVar, uVar.new s(null));
        zVar.x(q0.c(a.b.class), oVar, uVar.new t(null));
        zVar.x(q0.c(a.c.class), oVar, uVar.new C0569u(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 U9(u uVar, z zVar) {
        v vVar = uVar.new v(null);
        zVar.x(q0.c(a.f.class), k10.o.CANCEL_PREVIOUS, vVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        i00.a.a(this, new j(null));
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: E9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(a.e eVar, tq.e<? super i0> eVar2) {
        return super.F(eVar, eVar2);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: M9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }

    @Override // zx.b
    public xw.b<a.e> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<bt3.c, a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<bt3.d.a> getState() {
        return this.state;
    }

    @Override // i70.n
    public mu.g<i70.p> j() {
        return this.snackBarManagerStateHolder.j();
    }

    @Override // i70.n
    public void y(p50.a snackBarData) {
        this.snackBarManagerStateHolder.y(snackBarData);
    }
}
