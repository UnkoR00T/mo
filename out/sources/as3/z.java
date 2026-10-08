package as3;

import cb4.DialogData;
import cj0.ZusEVisitDepartment;
import cj0.ZusEVisitTopic;
import fr.q0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import ss3.SummaryData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003:\u0001PBC\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001e\u001a\u00020\u001d*\u00020\u0002H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020 H\u0002¢\u0006\u0004\b%\u0010#J\u000f\u0010&\u001a\u00020\u001aH\u0002¢\u0006\u0004\b&\u0010\u001cJ\u000f\u0010'\u001a\u00020\u001aH\u0002¢\u0006\u0004\b'\u0010\u001cJ\u0017\u0010*\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u00100R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R,\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030;8\u0014X\u0094\u0004¢\u0006\u0012\n\u0004\b<\u0010=\u0012\u0004\b@\u0010\u001c\u001a\u0004\b>\u0010?R \u0010H\u001a\b\u0012\u0004\u0012\u00020C0B8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR&\u0010O\u001a\b\u0012\u0004\u0012\u00020\u001d0I8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bJ\u0010K\u0012\u0004\bN\u0010\u001c\u001a\u0004\bL\u0010M¨\u0006Q"}, d2 = {"Las3/z;", "Ll00/g;", "Las3/e;", "", "Las3/f;", "Lyy/a;", "stateMachineFactory", "Lnr3/i;", "getZusEVisitDepartmentTermsUseCase", "Lez/e;", "dateFormatter", "Lib4/c;", "errorMapper", "Lbs3/c;", "screenMapper", "Lmx/c;", "labelProvider", "Lss3/b;", "summaryData", "<init>", "(Lyy/a;Lnr3/i;Lez/e;Lib4/c;Lbs3/c;Lmx/c;Lss3/b;)V", "Ldx/b;", "domainError", "Ljb4/b;", "z9", "(Ldx/b;)Ljb4/b;", "Loq/i0;", "x9", "()V", "Las3/f$a;", "y9", "(Las3/e;)Las3/f$a;", "", "termIndex", "D9", "(I)V", "hourIndex", "C9", "d", "B9", "Lcb4/d;", "dialog", "F9", "(Lcb4/d;)V", "b", "Lnr3/i;", "c", "Lez/e;", "Lib4/c;", "e", "Lbs3/c;", "f", "Lmx/c;", "g", "Lss3/b;", "Las3/e$a;", "h", "Las3/e$a;", "initialState", "Lk10/t;", "j", "Lk10/t;", "e9", "()Lk10/t;", "getStateMachine$annotations", "stateMachine", "Lxw/b;", "Las3/b;", "k", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "l", "Lmu/p0;", "getState", "()Lmu/p0;", "getState$annotations", "state", "a", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class z extends l00.g<as3.e, Object> implements as3.f, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final nr3.i getZusEVisitDepartmentTermsUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ib4.c errorMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final bs3.c screenMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final SummaryData summaryData;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final as3.e.a initialState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final k10.t<as3.e, Object> stateMachine;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final xw.b<as3.b> navAction;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final p0<as3.f.a> state;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Las3/z$a;", "Ldx/b$c$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a implements dx.b.Business.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f14419a = new a();

        private a() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return 401261144;
        }

        public String toString() {
            return "ZusDepartmentNoAvailableTerms";
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class b extends fr.q implements er.l<Integer, i0> {
        b(Object obj) {
            super(1, obj, z.class, "onSelectTerm", "onSelectTerm(I)V", 0);
        }

        public final void E(int i15) {
            ((z) this.f66391b).D9(i15);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(Integer num) {
            E(num.intValue());
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class c extends fr.q implements er.l<Integer, i0> {
        c(Object obj) {
            super(1, obj, z.class, "onHourClick", "onHourClick(I)V", 0);
        }

        public final void E(int i15) {
            ((z) this.f66391b).C9(i15);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(Integer num) {
            E(num.intValue());
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class d extends fr.q implements er.l<DialogData, i0> {
        d(Object obj) {
            super(1, obj, z.class, "showExitDialog", "showExitDialog(Lpl/gov/coi/shared/segment/dialog/contract/DialogData;)V", 0);
        }

        public final void E(DialogData dialogData) {
            ((z) this.f66391b).F9(dialogData);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(DialogData dialogData) {
            E(dialogData);
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class e extends fr.q implements er.a<i0> {
        e(Object obj) {
            super(0, obj, z.class, "onClose", "onClose()V", 0);
        }

        public final void E() {
            ((z) this.f66391b).B9();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            E();
            return i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f14420e;

        f(tq.e<? super f> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f14420e;
            if (i15 == 0) {
                oq.u.b(obj);
                z zVar = z.this;
                as3.b.a aVar = as3.b.a.f14334a;
                this.f14420e = 1;
                if (zVar.F(aVar, this) == objE) {
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
            return z.this.new f(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((f) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f14422e;

        g(tq.e<? super g> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f14422e;
            if (i15 == 0) {
                oq.u.b(obj);
                z zVar = z.this;
                as3.b.C0312b c0312b = as3.b.C0312b.f14335a;
                this.f14422e = 1;
                if (zVar.F(c0312b, this) == objE) {
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
            return z.this.new g(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((g) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f14424e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ DialogData f14426g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(DialogData dialogData, tq.e<? super h> eVar) {
            super(1, eVar);
            this.f14426g = dialogData;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f14424e;
            if (i15 == 0) {
                oq.u.b(obj);
                z zVar = z.this;
                as3.b.ShowExitDialog showExitDialog = new as3.b.ShowExitDialog(this.f14426g);
                this.f14424e = 1;
                if (zVar.F(showExitDialog, this) == objE) {
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
            return z.this.new h(this.f14426g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((h) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class i implements mu.g<as3.f.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f14427a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ z f14428b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f14429a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ z f14430b;

            /* JADX INFO: renamed from: as3.z$i$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0316a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f14431d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f14432e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f14433f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f14435h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f14436j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f14437k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f14438l;

                public C0316a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f14431d = obj;
                    this.f14432e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, z zVar) {
                this.f14429a = hVar;
                this.f14430b = zVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0316a c0316a;
                if (eVar instanceof C0316a) {
                    c0316a = (C0316a) eVar;
                    int i15 = c0316a.f14432e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0316a.f14432e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0316a = new C0316a(eVar);
                    }
                } else {
                    c0316a = new C0316a(eVar);
                }
                Object obj2 = c0316a.f14431d;
                Object objE = uq.b.e();
                int i16 = c0316a.f14432e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f14429a;
                    as3.f.a aVarY9 = this.f14430b.y9((as3.e) obj);
                    c0316a.f14433f = vq.j.a(obj);
                    c0316a.f14435h = vq.j.a(c0316a);
                    c0316a.f14436j = vq.j.a(obj);
                    c0316a.f14437k = vq.j.a(hVar);
                    c0316a.f14438l = 0;
                    c0316a.f14432e = 1;
                    if (hVar.F(aVarY9, c0316a) == objE) {
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

        public i(mu.g gVar, z zVar) {
            this.f14427a = gVar;
            this.f14428b = zVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super as3.f.a> hVar, tq.e eVar) {
            Object objA = this.f14427a.a(new a(hVar, this.f14428b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Las3/a;", "event", "Lk10/c0;", "Las3/e;", "state", "Lk10/l;", "<anonymous>", "(Las3/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<LoadTerms, k10.c0<as3.e>, tq.e<? super k10.l<? extends as3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f14439e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f14440f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f14441g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f14442h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f14443j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f14444k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f14445l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f14446m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f14447n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f14448p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f14449q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f14450r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f14451s;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final as3.e.LoadedTerms O(as3.e.LoadedTerms loadedTerms, as3.e eVar) {
            return loadedTerms;
        }

        /* JADX WARN: Code restructure failed: missing block: B:71:0x01bf, code lost:
        
            if (r5.F(r9, r22) == r4) goto L72;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r23) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 490
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: as3.z.j.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(LoadTerms loadTerms, k10.c0<as3.e> c0Var, tq.e<? super k10.l<? extends as3.e>> eVar) {
            j jVar = z.this.new j(eVar);
            jVar.f14450r = loadTerms;
            jVar.f14451s = c0Var;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Las3/e$a;", "it", "Loq/i0;", "<anonymous>", "(Las3/e$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.p<as3.e.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f14453e;

        k(tq.e<? super k> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f14453e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            z.this.x9();
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(as3.e.a aVar, tq.e<? super i0> eVar) {
            return ((k) v(aVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return z.this.new k(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Las3/c;", "event", "Lk10/c0;", "Las3/e$b;", "state", "Lk10/l;", "Las3/e;", "<anonymous>", "(Las3/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<SelectTerm, k10.c0<as3.e.LoadedTerms>, tq.e<? super k10.l<? extends as3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f14455e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f14456f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f14457g;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final as3.e.LoadedTerms O(k10.c0 c0Var, SelectTerm selectTerm, as3.e.LoadedTerms loadedTerms) {
            return as3.e.LoadedTerms.b((as3.e.LoadedTerms) c0Var.a(), null, selectTerm.getTermIndex(), 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final SelectTerm selectTerm = (SelectTerm) this.f14456f;
            final k10.c0 c0Var = (k10.c0) this.f14457g;
            uq.b.e();
            if (this.f14455e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: as3.b0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.l.O(c0Var, selectTerm, (e.LoadedTerms) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(SelectTerm selectTerm, k10.c0<as3.e.LoadedTerms> c0Var, tq.e<? super k10.l<? extends as3.e>> eVar) {
            l lVar = new l(eVar);
            lVar.f14456f = selectTerm;
            lVar.f14457g = c0Var;
            return lVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Las3/d;", "event", "Las3/e$b;", "state", "Loq/i0;", "<anonymous>", "(Las3/d;Las3/e$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<ToPersonalData, as3.e.LoadedTerms, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f14458e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f14459f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f14460g;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ToPersonalData toPersonalData = (ToPersonalData) this.f14459f;
            as3.e.LoadedTerms loadedTerms = (as3.e.LoadedTerms) this.f14460g;
            Object objE = uq.b.e();
            int i15 = this.f14458e;
            if (i15 == 0) {
                oq.u.b(obj);
                z zVar = z.this;
                as3.b.EnterPersonalData enterPersonalData = new as3.b.EnterPersonalData(loadedTerms.d().get(loadedTerms.getSelectedTermIndex()), toPersonalData.getHourIndex());
                this.f14459f = vq.j.a(toPersonalData);
                this.f14460g = vq.j.a(loadedTerms);
                this.f14458e = 1;
                if (zVar.F(enterPersonalData, this) == objE) {
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
        public final Object w(ToPersonalData toPersonalData, as3.e.LoadedTerms loadedTerms, tq.e<? super i0> eVar) {
            m mVar = z.this.new m(eVar);
            mVar.f14459f = toPersonalData;
            mVar.f14460g = loadedTerms;
            return mVar.J(i0.f148189a);
        }
    }

    public z(yy.a aVar, nr3.i iVar, ez.e eVar, ib4.c cVar, bs3.c cVar2, mx.c cVar3, SummaryData summaryData) {
        this.getZusEVisitDepartmentTermsUseCase = iVar;
        this.dateFormatter = eVar;
        this.errorMapper = cVar;
        this.screenMapper = cVar2;
        this.labelProvider = cVar3;
        this.summaryData = summaryData;
        as3.e.a aVar2 = as3.e.a.f14345a;
        this.initialState = aVar2;
        this.stateMachine = aVar.a(aVar2, new er.l() { // from class: as3.y
            @Override // er.l
            public final Object b(Object obj) {
                return z.G9(this.f14408a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new i(e9().getState(), this), y9(aVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(z zVar, ib4.c.b bVar) {
        if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
            zVar.x9();
        } else if (bVar instanceof ib4.c.b.a.Primary) {
            if (fr.t.c(((ib4.c.b.a.Primary) bVar).getType(), a.f14419a)) {
                zVar.d();
            } else {
                zVar.x9();
            }
        } else {
            if (!(bVar instanceof ib4.c.b.AbstractC2161b.a) && !(bVar instanceof ib4.c.b.a.Secondary) && !(bVar instanceof ib4.c.b.a.Close)) {
                throw new oq.p();
            }
            zVar.d();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B9() {
        i00.a.a(this, new g(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C9(int hourIndex) {
        d9(new ToPersonalData(hourIndex));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D9(int termIndex) {
        d9(new SelectTerm(termIndex));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F9(DialogData dialog) {
        i00.a.a(this, new h(dialog, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G9(final z zVar, k10.v vVar) {
        vVar.c(q0.c(as3.e.class), new er.l() { // from class: as3.u
            @Override // er.l
            public final Object b(Object obj) {
                return z.H9(this.f14404a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(as3.e.a.class), new er.l() { // from class: as3.v
            @Override // er.l
            public final Object b(Object obj) {
                return z.I9(this.f14405a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(as3.e.LoadedTerms.class), new er.l() { // from class: as3.w
            @Override // er.l
            public final Object b(Object obj) {
                return z.J9(this.f14406a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H9(z zVar, k10.z zVar2) {
        j jVar = zVar.new j(null);
        zVar2.v(q0.c(LoadTerms.class), k10.o.CANCEL_PREVIOUS, jVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I9(z zVar, k10.z zVar2) {
        zVar2.C(zVar.new k(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J9(z zVar, k10.z zVar2) {
        l lVar = new l(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar2.v(q0.c(SelectTerm.class), oVar, lVar);
        zVar2.x(q0.c(ToPersonalData.class), oVar, zVar.new m(null));
        return i0.f148189a;
    }

    private final void d() {
        i00.a.a(this, new f(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x9() {
        String id5;
        boolean useAlternativeTopicId = this.summaryData.getUseAlternativeTopicId();
        if (useAlternativeTopicId) {
            id5 = this.summaryData.getAlternativeTopicId();
        } else {
            if (useAlternativeTopicId) {
                throw new oq.p();
            }
            ZusEVisitTopic topic = this.summaryData.getTopic();
            id5 = topic != null ? topic.getId() : null;
        }
        ZusEVisitDepartment department = this.summaryData.getDepartment();
        d9(new LoadTerms(department != null ? Long.valueOf(department.getId()) : null, id5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final as3.f.a y9(as3.e eVar) {
        return this.screenMapper.b(new bs3.c.Params(eVar, new b(this), new c(this), new d(this), new e(this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b z9(dx.b domainError) {
        return this.errorMapper.b(new ib4.c.Params(domainError, false, new er.l() { // from class: as3.x
            @Override // er.l
            public final Object b(Object obj) {
                return z.A9(this.f14407a, (ib4.c.b) obj);
            }
        }, 2, null));
    }

    @Override // zx.b
    /* JADX INFO: renamed from: E9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SummaryData summaryData) {
        super.P5(summaryData);
    }

    @Override // zx.b
    public xw.b<as3.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<as3.e, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<as3.f.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: w9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(as3.b bVar, tq.e<? super i0> eVar) {
        return super.F(bVar, eVar);
    }
}
