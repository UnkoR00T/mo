package b92;

import fp0.ApplicantDetails;
import fp0.SummaryData;
import fr.q0;
import j92.ViolationDescriptionResult;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import w04.LocationDetails;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B3\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010!\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u001fH\u0096\u0001¢\u0006\u0004\b!\u0010\"J\u0018\u0010$\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020#H\u0096\u0001¢\u0006\u0004\b$\u0010%J\u0018\u0010'\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020&H\u0096\u0001¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020*2\u0006\u0010)\u001a\u00020\u0002H\u0002¢\u0006\u0004\b+\u0010,R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R \u0010;\u001a\b\u0012\u0004\u0012\u000206058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R \u0010?\u001a\b\u0012\u0004\u0012\u00020<058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u00108\u001a\u0004\b>\u0010:R\u0014\u0010B\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR,\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030C8\u0014X\u0094\u0004¢\u0006\u0012\n\u0004\bD\u0010E\u0012\u0004\bH\u0010I\u001a\u0004\bF\u0010GR&\u0010)\u001a\b\u0012\u0004\u0012\u00020*0K8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bL\u0010M\u0012\u0004\bP\u0010I\u001a\u0004\bN\u0010OR\u001c\u0010V\u001a\u00020Q8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u0016\u0010Y\u001a\u0004\u0018\u00010#8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0016\u0010\\\u001a\u0004\u0018\u00010&8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u001c\u0010b\u001a\u00020]8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u0014\u0010e\u001a\u00020c8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b-\u0010d¨\u0006f"}, d2 = {"Lb92/y;", "Ll00/g;", "Lb92/f;", "Lb92/d;", "Lb92/l;", "Lb92/g;", "Lb92/e;", "Lb92/i;", "Ld92/j;", "mapper", "Ld92/e;", "reportViolationWizardExitDialogMapper", "Lb92/k$a;", "dataSourceContractFactory", "Lyy/a;", "stateMachineFactory", "Lb92/e$a;", "setupData", "<init>", "(Ld92/j;Ld92/e;Lb92/k$a;Lyy/a;Lb92/e$a;)V", "action", "Loq/i0;", "V7", "(Lb92/d;)V", "Lc92/a;", "data", "q9", "(Lc92/a;)V", "Ldx3/a;", "s9", "(Ldx3/a;)V", "Lfp0/m;", "tag", "s8", "(Lfp0/m;)V", "Lfp0/a;", "d3", "(Lfp0/a;)V", "Lj92/b$a;", "J1", "(Lj92/b$a;)V", "state", "Lb92/g$a;", "o9", "(Lb92/f;)Lb92/g$a;", "c", "Ld92/j;", "d", "Ld92/e;", "e", "Lb92/k$a;", "f", "Lb92/e$a;", "Lxw/b;", "Lb92/d$c;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lb92/d$c$a;", "h", "g4", "backNavigation", "j", "Lb92/f;", "initialState", "Lk10/t;", "k", "Lk10/t;", "e9", "()Lk10/t;", "getStateMachine$annotations", "()V", "stateMachine", "Lmu/p0;", "l", "Lmu/p0;", "getState", "()Lmu/p0;", "getState$annotations", "Lw04/c;", "Z4", "()Lw04/c;", "P8", "(Lw04/c;)V", "locationDetails", "Z5", "()Lfp0/a;", "applicantDetails", "R3", "()Lj92/b$a;", "violationDescriptionData", "Lfp0/k;", "v7", "()Lfp0/k;", "t3", "(Lfp0/k;)V", "violationTypeTag", "Lfp0/j;", "()Lfp0/j;", "summaryData", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class y extends l00.g<State, b92.d> implements l, b92.g, b92.e, b92.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ k f17661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final d92.j mapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final d92.e reportViolationWizardExitDialogMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final k.a dataSourceContractFactory;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final b92.e.SetupData setupData;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<b92.d.c> navAction = new xw.b<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<b92.d.c.a> backNavigation = new xw.b<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, b92.d> stateMachine;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final p0<b92.g.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<b92.g.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f17671a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ y f17672b;

        /* JADX INFO: renamed from: b92.y$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0430a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f17673a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ y f17674b;

            /* JADX INFO: renamed from: b92.y$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0431a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f17675d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f17676e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f17677f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f17679h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f17680j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f17681k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f17682l;

                public C0431a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f17675d = obj;
                    this.f17676e |= PKIFailureInfo.systemUnavail;
                    return C0430a.this.F(null, this);
                }
            }

            public C0430a(mu.h hVar, y yVar) {
                this.f17673a = hVar;
                this.f17674b = yVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0431a c0431a;
                if (eVar instanceof C0431a) {
                    c0431a = (C0431a) eVar;
                    int i15 = c0431a.f17676e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0431a.f17676e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0431a = new C0431a(eVar);
                    }
                } else {
                    c0431a = new C0431a(eVar);
                }
                Object obj2 = c0431a.f17675d;
                Object objE = uq.b.e();
                int i16 = c0431a.f17676e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f17673a;
                    b92.g.Data dataO9 = this.f17674b.o9((State) obj);
                    c0431a.f17677f = vq.j.a(obj);
                    c0431a.f17679h = vq.j.a(c0431a);
                    c0431a.f17680j = vq.j.a(obj);
                    c0431a.f17681k = vq.j.a(hVar);
                    c0431a.f17682l = 0;
                    c0431a.f17676e = 1;
                    if (hVar.F(dataO9, c0431a) == objE) {
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

        public a(mu.g gVar, y yVar) {
            this.f17671a = gVar;
            this.f17672b = yVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super b92.g.Data> hVar, tq.e eVar) {
            Object objA = this.f17671a.a(new C0430a(hVar, this.f17672b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lb92/d$a;", "<unused var>", "Lb92/f;", "Loq/i0;", "<anonymous>", "(Lb92/d$a;Lb92/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<b92.d.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f17683e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f17683e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<b92.d.c.a> bVarG4 = y.this.g4();
                b92.d.c.a aVar = b92.d.c.a.f17614a;
                this.f17683e = 1;
                if (bVarG4.F(aVar, this) == objE) {
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
        public final Object w(b92.d.a aVar, State state, tq.e<? super i0> eVar) {
            return y.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lb92/d$b;", "<unused var>", "Lb92/f;", "Loq/i0;", "<anonymous>", "(Lb92/d$b;Lb92/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<b92.d.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f17685e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f17685e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<b92.d.c> bVarY1 = y.this.Y1();
                b92.d.c.b bVar = b92.d.c.b.f17615a;
                this.f17685e = 1;
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(b92.d.b bVar, State state, tq.e<? super i0> eVar) {
            return y.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lb92/d$i;", "action", "Lb92/f;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lb92/d$i;Lb92/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<b92.d.ToOutro, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f17687e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f17688f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            b92.d.ToOutro toOutro = (b92.d.ToOutro) this.f17688f;
            Object objE = uq.b.e();
            int i15 = this.f17687e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<b92.d.c> bVarY1 = y.this.Y1();
                b92.d.c.ToOutro toOutro2 = new b92.d.c.ToOutro(toOutro.getReportNumber());
                this.f17688f = vq.j.a(toOutro);
                this.f17687e = 1;
                if (bVarY1.F(toOutro2, this) == objE) {
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
        public final Object w(b92.d.ToOutro toOutro, State state, tq.e<? super i0> eVar) {
            d dVar = y.this.new d(eVar);
            dVar.f17688f = toOutro;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lb92/d$f;", "<unused var>", "Lb92/f;", "Loq/i0;", "<anonymous>", "(Lb92/d$f;Lb92/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<b92.d.f, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f17690e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f17690e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<b92.d.c> bVarY1 = y.this.Y1();
                b92.d.c.ShowExitDialog showExitDialog = new b92.d.c.ShowExitDialog(y.this.reportViolationWizardExitDialogMapper.b(new d92.e.Params(y.this.b9(b92.d.b.f17613a))));
                this.f17690e = 1;
                if (bVarY1.F(showExitDialog, this) == objE) {
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
        public final Object w(b92.d.f fVar, State state, tq.e<? super i0> eVar) {
            return y.this.new e(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lb92/d$g;", "<unused var>", "Lb92/f;", "Loq/i0;", "<anonymous>", "(Lb92/d$g;Lb92/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<b92.d.g, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f17692e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f17692e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<b92.d.c> bVarY1 = y.this.Y1();
                b92.d.c.e eVar = b92.d.c.e.f17618a;
                this.f17692e = 1;
                if (bVarY1.F(eVar, this) == objE) {
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
        public final Object w(b92.d.g gVar, State state, tq.e<? super i0> eVar) {
            return y.this.new f(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lb92/d$e;", "action", "Lk10/c0;", "Lb92/f;", "state", "Lk10/l;", "<anonymous>", "(Lb92/d$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<b92.d.OpenBottomSheet, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f17694e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f17695f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f17696g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(b92.d.OpenBottomSheet openBottomSheet, State state) {
            return state.a(g30.v.EXPANDED, openBottomSheet.getData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final b92.d.OpenBottomSheet openBottomSheet = (b92.d.OpenBottomSheet) this.f17695f;
            k10.c0 c0Var = (k10.c0) this.f17696g;
            uq.b.e();
            if (this.f17694e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: b92.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return y.g.O(openBottomSheet, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(b92.d.OpenBottomSheet openBottomSheet, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            g gVar = new g(eVar);
            gVar.f17695f = openBottomSheet;
            gVar.f17696g = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lb92/d$d;", "action", "Lk10/c0;", "Lb92/f;", "state", "Lk10/l;", "<anonymous>", "(Lb92/d$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<b92.d.OnBottomSheetChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f17697e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f17698f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f17699g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(b92.d.OnBottomSheetChanged onBottomSheetChanged, k10.c0 c0Var, State state) {
            g30.v state2 = onBottomSheetChanged.getState();
            g30.v state3 = onBottomSheetChanged.getState();
            if (state3 == g30.v.HIDDEN) {
                state3 = null;
            }
            return state.a(state2, state3 != null ? ((State) c0Var.a()).getBottomSheetAction() : null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final b92.d.OnBottomSheetChanged onBottomSheetChanged = (b92.d.OnBottomSheetChanged) this.f17698f;
            final k10.c0 c0Var = (k10.c0) this.f17699g;
            uq.b.e();
            if (this.f17697e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: b92.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return y.h.O(onBottomSheetChanged, c0Var, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(b92.d.OnBottomSheetChanged onBottomSheetChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            h hVar = new h(eVar);
            hVar.f17698f = onBottomSheetChanged;
            hVar.f17699g = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lb92/d$h;", "action", "Lb92/f;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lb92/d$h;Lb92/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<b92.d.ShowImagePreview, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f17700e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f17701f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            b92.d.ShowImagePreview showImagePreview = (b92.d.ShowImagePreview) this.f17701f;
            Object objE = uq.b.e();
            int i15 = this.f17700e;
            if (i15 == 0) {
                oq.u.b(obj);
                y yVar = y.this;
                b92.d.c.ShowImagePreview showImagePreview2 = new b92.d.c.ShowImagePreview(showImagePreview.getData());
                this.f17701f = vq.j.a(showImagePreview);
                this.f17700e = 1;
                if (yVar.F(showImagePreview2, this) == objE) {
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
        public final Object w(b92.d.ShowImagePreview showImagePreview, State state, tq.e<? super i0> eVar) {
            i iVar = y.this.new i(eVar);
            iVar.f17701f = showImagePreview;
            return iVar.J(i0.f148189a);
        }
    }

    public y(d92.j jVar, d92.e eVar, k.a aVar, yy.a aVar2, b92.e.SetupData setupData) {
        this.f17661b = aVar.a(setupData.getViolationTypeTag());
        this.mapper = jVar;
        this.reportViolationWizardExitDialogMapper = eVar;
        this.dataSourceContractFactory = aVar;
        this.setupData = setupData;
        State state = new State(null, null, 3, null);
        this.initialState = state;
        this.stateMachine = aVar2.a(state, new er.l() { // from class: b92.x
            @Override // er.l
            public final Object b(Object obj) {
                return y.t9(this.f17660a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), o9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b92.g.Data o9(State state) {
        d92.j jVar = this.mapper;
        er.a<i0> aVarB9 = b9(b92.d.a.f17612a);
        return jVar.b(new d92.j.Params(state, new er.l() { // from class: b92.w
            @Override // er.l
            public final Object b(Object obj) {
                return y.p9(this.f17659a, (g30.v) obj);
            }
        }, b9(b92.d.f.f17622a), aVarB9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(y yVar, g30.v vVar) {
        yVar.d9(new b92.d.OnBottomSheetChanged(vVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(final y yVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: b92.u
            @Override // er.l
            public final Object b(Object obj) {
                return y.u9(this.f17657a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(State.class), new er.l() { // from class: b92.v
            @Override // er.l
            public final Object b(Object obj) {
                return y.v9(this.f17658a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(y yVar, k10.z zVar) {
        b bVar = yVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(b92.d.a.class), oVar, bVar);
        zVar.x(q0.c(b92.d.b.class), oVar, yVar.new c(null));
        zVar.x(q0.c(b92.d.ToOutro.class), oVar, yVar.new d(null));
        zVar.x(q0.c(b92.d.f.class), oVar, yVar.new e(null));
        zVar.x(q0.c(b92.d.g.class), oVar, yVar.new f(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(y yVar, k10.z zVar) {
        g gVar = new g(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(b92.d.OpenBottomSheet.class), oVar, gVar);
        zVar.v(q0.c(b92.d.OnBottomSheetChanged.class), oVar, new h(null));
        zVar.x(q0.c(b92.d.ShowImagePreview.class), oVar, yVar.new i(null));
        return i0.f148189a;
    }

    @Override // j92.a
    public void J1(ViolationDescriptionResult.Data data) {
        this.f17661b.J1(data);
    }

    @Override // t82.a
    public void P8(LocationDetails locationDetails) {
        this.f17661b.P8(locationDetails);
    }

    @Override // j92.a
    public ViolationDescriptionResult.Data R3() {
        return this.f17661b.R3();
    }

    @Override // b92.l
    public void V7(b92.d action) {
        d9(action);
    }

    @Override // zx.b
    public xw.b<b92.d.c> Y1() {
        return this.navAction;
    }

    @Override // t82.a
    public LocationDetails Z4() {
        return this.f17661b.Z4();
    }

    @Override // k82.a
    public ApplicantDetails Z5() {
        return this.f17661b.Z5();
    }

    @Override // f92.a
    public SummaryData c() {
        return this.f17661b.c();
    }

    @Override // k82.a
    public void d3(ApplicantDetails data) {
        this.f17661b.d3(data);
    }

    @Override // l00.g
    protected k10.t<State, b92.d> e9() {
        return this.stateMachine;
    }

    @Override // b92.e
    public xw.b<b92.d.c.a> g4() {
        return this.backNavigation;
    }

    @Override // l00.e
    public p0<b92.g.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: n9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(b92.d.c cVar, tq.e<? super i0> eVar) {
        return super.F(cVar, eVar);
    }

    public final void q9(c92.a data) {
        d9(new b92.d.OpenBottomSheet(data));
    }

    @Override // zx.b
    /* JADX INFO: renamed from: r9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(b92.e.SetupData setupData) {
        super.P5(setupData);
    }

    @Override // q92.a
    public void s8(fp0.m tag) {
        this.f17661b.s8(tag);
    }

    public final void s9(dx3.a data) {
        d9(new b92.d.ShowImagePreview(data));
    }

    @Override // n92.a
    public void t3(fp0.k kVar) {
        this.f17661b.t3(kVar);
    }

    @Override // n92.a
    public fp0.k v7() {
        return this.f17661b.v7();
    }
}
