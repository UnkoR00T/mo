package lu2;

import bu2.VerifiedStatus;
import fr.q0;
import iu2.WizardResultData;
import k10.c0;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import ts0.RestrictionVerification;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\u0002*\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u0002*\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u0002*\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R&\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030#8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R \u0010/\u001a\b\u0012\u0004\u0012\u00020*0)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R \u00105\u001a\b\u0012\u0004\u0012\u00020\u0011008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104¨\u00066"}, d2 = {"Llu2/q;", "Ll00/g;", "Llu2/h;", "", "Llu2/i;", "Lyy/a;", "stateMachineFactory", "Lnu2/c;", "mapper", "Liu2/a;", "setupData", "<init>", "(Lyy/a;Lnu2/c;Liu2/a;)V", "p9", "(Liu2/a;)Llu2/h;", "n9", "o9", "Llu2/i$a;", "u9", "(Llu2/h;)Llu2/i$a;", "Loq/i0;", "m9", "()V", "r9", "data", "q9", "(Liu2/a;)V", "b", "Lnu2/c;", "c", "Liu2/a;", "Llu2/h$a;", "d", "Llu2/h$a;", "initialState", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Llu2/e;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q extends l00.g<h, Object> implements i, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final nu2.c mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private WizardResultData setupData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final h.a initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final k10.t<h, Object> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<lu2.e> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<i.a> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f120521a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f120522b;

        static {
            int[] iArr = new int[ts0.l.values().length];
            try {
                iArr[ts0.l.RESTRICTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ts0.l.UNRESTRICTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ts0.l.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f120521a = iArr;
            int[] iArr2 = new int[ts0.q.values().length];
            try {
                iArr2[ts0.q.NOT_FOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ts0.q.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ts0.q.INVALID_INPUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ts0.q.VERIFIED.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            f120522b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<i.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f120523a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f120524b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f120525a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ q f120526b;

            /* JADX INFO: renamed from: lu2.q$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2941a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f120527d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f120528e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f120529f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f120531h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f120532j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f120533k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f120534l;

                public C2941a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f120527d = obj;
                    this.f120528e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, q qVar) {
                this.f120525a = hVar;
                this.f120526b = qVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2941a c2941a;
                if (eVar instanceof C2941a) {
                    c2941a = (C2941a) eVar;
                    int i15 = c2941a.f120528e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2941a.f120528e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2941a = new C2941a(eVar);
                    }
                } else {
                    c2941a = new C2941a(eVar);
                }
                Object obj2 = c2941a.f120527d;
                Object objE = uq.b.e();
                int i16 = c2941a.f120528e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f120525a;
                    i.a aVarU9 = this.f120526b.u9((h) obj);
                    c2941a.f120529f = vq.j.a(obj);
                    c2941a.f120531h = vq.j.a(c2941a);
                    c2941a.f120532j = vq.j.a(obj);
                    c2941a.f120533k = vq.j.a(hVar);
                    c2941a.f120534l = 0;
                    c2941a.f120528e = 1;
                    if (hVar.F(aVarU9, c2941a) == objE) {
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

        public b(mu.g gVar, q qVar) {
            this.f120523a = gVar;
            this.f120524b = qVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super i.a> hVar, tq.e eVar) {
            Object objA = this.f120523a.a(new a(hVar, this.f120524b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Llu2/d;", "<unused var>", "Llu2/h;", "Loq/i0;", "<anonymous>", "(Llu2/d;Llu2/h;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<lu2.d, h, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f120535e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f120535e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<lu2.e> bVarY1 = q.this.Y1();
                lu2.e.a aVar = lu2.e.a.f120486a;
                this.f120535e = 1;
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
        public final Object w(lu2.d dVar, h hVar, tq.e<? super i0> eVar) {
            return q.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Llu2/g;", "<unused var>", "Llu2/h;", "Loq/i0;", "<anonymous>", "(Llu2/g;Llu2/h;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<lu2.g, h, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f120537e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f120537e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<lu2.e> bVarY1 = q.this.Y1();
                lu2.e.b bVar = lu2.e.b.f120487a;
                this.f120537e = 1;
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
        public final Object w(lu2.g gVar, h hVar, tq.e<? super i0> eVar) {
            return q.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Llu2/f;", "action", "Lk10/c0;", "Llu2/h;", "state", "Lk10/l;", "<anonymous>", "(Llu2/f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<SetupData, c0<h>, tq.e<? super k10.l<? extends h>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f120539e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f120540f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f120541g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h O(q qVar, SetupData setupData, h hVar) {
            return qVar.p9(setupData.getWizardResultData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final SetupData setupData = (SetupData) this.f120540f;
            c0 c0Var = (c0) this.f120541g;
            uq.b.e();
            if (this.f120539e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final q qVar = q.this;
            return c0Var.d(new er.l() { // from class: lu2.r
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.e.O(qVar, setupData, (h) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(SetupData setupData, c0<h> c0Var, tq.e<? super k10.l<? extends h>> eVar) {
            e eVar2 = q.this.new e(eVar);
            eVar2.f120540f = setupData;
            eVar2.f120541g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class f extends fr.q implements er.a<i0> {
        f(Object obj) {
            super(0, obj, q.class, "closeScreen", "closeScreen()V", 0);
        }

        public final void E() {
            ((q) this.f66391b).m9();
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
            super(0, obj, q.class, "startAnotherVerification", "startAnotherVerification()V", 0);
        }

        public final void E() {
            ((q) this.f66391b).r9();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            E();
            return i0.f148189a;
        }
    }

    public q(yy.a aVar, nu2.c cVar, WizardResultData wizardResultData) {
        this.mapper = cVar;
        this.setupData = wizardResultData;
        h.a aVar2 = h.a.f120491b;
        this.initialState = aVar2;
        this.stateMachine = aVar.a(aVar2, new er.l() { // from class: lu2.p
            @Override // er.l
            public final Object b(Object obj) {
                return q.s9(this.f120514a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new b(e9().getState(), this), u9(aVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m9() {
        d9(lu2.d.f120485a);
    }

    private final h n9(WizardResultData wizardResultData) {
        ts0.q verificationStatus = wizardResultData.getRestrictionsVerificationList().getVerificationStatus();
        int i15 = verificationStatus == null ? -1 : a.f120522b[verificationStatus.ordinal()];
        if (i15 != -1) {
            if (i15 == 1) {
                return new h.NoData(new h.StateData(wizardResultData));
            }
            if (i15 != 2 && i15 != 3) {
                if (i15 != 4) {
                    throw new oq.p();
                }
                ts0.l lVarC = ((RestrictionVerification) pq.v.l0(wizardResultData.getRestrictionsVerificationList().a())).c();
                int i16 = lVarC == null ? -1 : a.f120521a[lVarC.ordinal()];
                if (i16 != -1) {
                    if (i16 == 1) {
                        return new h.Restricted(new h.StateData(wizardResultData));
                    }
                    if (i16 == 2) {
                        return new h.Unrestricted(new h.StateData(wizardResultData));
                    }
                    if (i16 != 3) {
                        throw new oq.p();
                    }
                }
                return new h.NoData(new h.StateData(wizardResultData));
            }
        }
        return new h.InvalidInputData(new h.StateData(wizardResultData));
    }

    private final h o9(WizardResultData wizardResultData) {
        ts0.q verificationStatus = wizardResultData.getRestrictionsVerificationList().getVerificationStatus();
        int i15 = verificationStatus == null ? -1 : a.f120522b[verificationStatus.ordinal()];
        if (i15 != -1) {
            if (i15 == 1) {
                return new h.NoData(new h.StateData(wizardResultData));
            }
            if (i15 != 2 && i15 != 3) {
                if (i15 == 4) {
                    return new h.StatusAtDate(new h.StateData(wizardResultData));
                }
                throw new oq.p();
            }
        }
        return new h.InvalidInputData(new h.StateData(wizardResultData));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h p9(WizardResultData wizardResultData) {
        VerifiedStatus verifiedStatus = wizardResultData.getSummaryData().getVerifiedStatus();
        return (verifiedStatus != null ? verifiedStatus.getPickedDate() : null) == null ? n9(wizardResultData) : o9(wizardResultData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r9() {
        d9(lu2.g.f120489a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(final q qVar, v vVar) {
        vVar.c(q0.c(h.class), new er.l() { // from class: lu2.o
            @Override // er.l
            public final Object b(Object obj) {
                return q.t9(this.f120513a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(q qVar, z zVar) {
        c cVar = qVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(lu2.d.class), oVar, cVar);
        zVar.x(q0.c(lu2.g.class), oVar, qVar.new d(null));
        zVar.v(q0.c(SetupData.class), oVar, qVar.new e(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i.a u9(h hVar) {
        return this.mapper.b(new nu2.c.Params(hVar, new f(this), new g(this)));
    }

    @Override // zx.b
    public xw.b<lu2.e> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<h, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<i.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: q9, reason: merged with bridge method [inline-methods] */
    public void P5(WizardResultData data) {
        this.setupData = data;
        d9(new SetupData(data));
    }
}
