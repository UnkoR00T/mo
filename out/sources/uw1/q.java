package uw1;

import aj0.ElectronicCapabilityData;
import fr.q0;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BA\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ,\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00192\u0006\u0010\u001e\u001a\u00020\u001d2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0082@¢\u0006\u0004\b \u0010!J,\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\u00192\u0006\u0010\u001e\u001a\u00020\"2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0082@¢\u0006\u0004\b#\u0010$J,\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00020\u00192\u0006\u0010\u001e\u001a\u00020%2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0082@¢\u0006\u0004\b&\u0010'J\u0017\u0010+\u001a\u00020*2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b+\u0010,R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R&\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003058\u0014X\u0094\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R \u0010A\u001a\b\u0012\u0004\u0012\u00020<0;8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020C0B8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G¨\u0006H"}, d2 = {"Luw1/q;", "Ll00/g;", "Luw1/b;", "Luw1/a;", "Luw1/c;", "", "Lyy/a;", "stateMachineFactory", "Lvw1/a;", "mapper", "Lwx1/a;", "welcomePageMapper", "Lib4/c;", "genericDomainErrorMapper", "Lhb4/d;", "errorVMSFactory", "Lij0/a;", "getElectronicCapabilityDataUseCase", "Lac4/a;", "callActionWithLoaderUseCase", "<init>", "(Lyy/a;Lvw1/a;Lwx1/a;Lib4/c;Lhb4/d;Lij0/a;Lac4/a;)V", "Lk10/c0;", "Luw1/b$c;", "state", "Lk10/l;", "Luw1/b$b;", "D9", "(Lk10/c0;Ltq/e;)Ljava/lang/Object;", "Luw1/a$b;", "action", "Luw1/b$d;", "z9", "(Luw1/a$b;Lk10/c0;Ltq/e;)Ljava/lang/Object;", "Luw1/a$a;", "x9", "(Luw1/a$a;Lk10/c0;Ltq/e;)Ljava/lang/Object;", "Luw1/a$c;", "B9", "(Luw1/a$c;Lk10/c0;Ltq/e;)Ljava/lang/Object;", "Lww1/a;", "serviceType", "Loq/i0;", "F9", "(Lww1/a;)V", "b", "Lib4/c;", "c", "Lhb4/d;", "d", "Lij0/a;", "e", "Lac4/a;", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Luw1/a$g;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "Luw1/c$a;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q extends l00.g<uw1.b, uw1.a> implements uw1.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ij0.a getElectronicCapabilityDataUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k10.t<uw1.b, uw1.a> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<uw1.a.g> navAction = new xw.b<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<uw1.c.a> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f201918a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f201919b;

        static {
            int[] iArr = new int[aj0.c.values().length];
            try {
                iArr[aj0.c.AVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f201918a = iArr;
            int[] iArr2 = new int[aj0.e.values().length];
            try {
                iArr2[aj0.e.AVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            f201919b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f201920d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f201921e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f201922f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f201924h;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f201922f = obj;
            this.f201924h |= PKIFailureInfo.systemUnavail;
            return q.this.x9(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f201925d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f201926e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f201927f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f201929h;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f201927f = obj;
            this.f201929h |= PKIFailureInfo.systemUnavail;
            return q.this.z9(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f201930d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f201931e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f201932f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f201934h;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f201932f = obj;
            this.f201934h |= PKIFailureInfo.systemUnavail;
            return q.this.B9(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Luw1/b$b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.l<tq.e<? super k10.l<? extends uw1.b.Error>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f201935e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ c0<uw1.b.GettingStatus> f201937g;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f201938a;

            static {
                int[] iArr = new int[ww1.a.values().length];
                try {
                    iArr[ww1.a.DOCUMENT_SIGNING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ww1.a.PIN_CHANGE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ww1.a.ELECTRONIC_LAYER_SETTINGS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f201938a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(c0<uw1.b.GettingStatus> c0Var, tq.e<? super e> eVar) {
            super(1, eVar);
            this.f201937g = c0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final uw1.b.Error X(c0 c0Var, final q qVar, dx.b bVar, uw1.b.GettingStatus gettingStatus) {
            return new uw1.b.Error(((uw1.b.GettingStatus) c0Var.a()).getServiceType(), qVar.errorVMSFactory.a(qVar.genericDomainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: uw1.s
                @Override // er.l
                public final Object b(Object obj) {
                    return q.e.Y(qVar, (ib4.c.b) obj);
                }
            }, 2, null))));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 Y(q qVar, ib4.c.b bVar) {
            if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                qVar.d9(uw1.a.d.f201876a);
            } else if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                qVar.d9(uw1.a.e.f201877a);
            } else {
                if (!(bVar instanceof ib4.c.b.a)) {
                    throw new oq.p();
                }
                qVar.d9(uw1.a.d.f201876a);
            }
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f201935e;
            if (i15 == 0) {
                oq.u.b(obj);
                ij0.a aVar = q.this.getElectronicCapabilityDataUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f201935e = 1;
                obj = aVar.c(c1792a, this);
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
            final c0<uw1.b.GettingStatus> c0Var = this.f201937g;
            final q qVar = q.this;
            if (iVar instanceof dx.i.Left) {
                final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                return c0Var.d(new er.l() { // from class: uw1.r
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return q.e.X(c0Var, qVar, bVar, (b.GettingStatus) obj2);
                    }
                });
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            ElectronicCapabilityData electronicCapabilityData = (ElectronicCapabilityData) ((dx.i.Right) iVar).b();
            int i16 = a.f201938a[c0Var.a().getServiceType().ordinal()];
            if (i16 == 1) {
                qVar.d9(new uw1.a.CheckDocumentSigningStatus(electronicCapabilityData));
            } else if (i16 == 2) {
                qVar.d9(new uw1.a.CheckChangePinStatus(electronicCapabilityData));
            } else {
                if (i16 != 3) {
                    throw new oq.p();
                }
                qVar.d9(new uw1.a.CheckElectronicLayerSettingsStatus(electronicCapabilityData));
            }
            return c0Var.c();
        }

        public final tq.e<i0> O(tq.e<?> eVar) {
            return q.this.new e(this.f201937g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super k10.l<uw1.b.Error>> eVar) {
            return ((e) O(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class f implements mu.g<uw1.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f201939a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ vw1.a f201940b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ q f201941c;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f201942a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ vw1.a f201943b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ q f201944c;

            /* JADX INFO: renamed from: uw1.q$f$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5249a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f201945d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f201946e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f201947f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f201949h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f201950j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f201951k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f201952l;

                public C5249a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f201945d = obj;
                    this.f201946e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, vw1.a aVar, q qVar) {
                this.f201942a = hVar;
                this.f201943b = aVar;
                this.f201944c = qVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5249a c5249a;
                if (eVar instanceof C5249a) {
                    c5249a = (C5249a) eVar;
                    int i15 = c5249a.f201946e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5249a.f201946e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5249a = new C5249a(eVar);
                    }
                } else {
                    c5249a = new C5249a(eVar);
                }
                Object obj2 = c5249a.f201945d;
                Object objE = uq.b.e();
                int i16 = c5249a.f201946e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f201942a;
                    uw1.c.a aVarB = this.f201943b.b(new vw1.a.Params((uw1.b) obj, this.f201944c.b9(uw1.a.d.f201876a), this.f201944c.b9(uw1.a.f.f201878a)));
                    c5249a.f201947f = vq.j.a(obj);
                    c5249a.f201949h = vq.j.a(c5249a);
                    c5249a.f201950j = vq.j.a(obj);
                    c5249a.f201951k = vq.j.a(hVar);
                    c5249a.f201952l = 0;
                    c5249a.f201946e = 1;
                    if (hVar.F(aVarB, c5249a) == objE) {
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

        public f(mu.g gVar, vw1.a aVar, q qVar) {
            this.f201939a = gVar;
            this.f201940b = aVar;
            this.f201941c = qVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super uw1.c.a> hVar, tq.e eVar) {
            Object objA = this.f201939a.a(new a(hVar, this.f201940b, this.f201941c), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Luw1/a$d;", "<unused var>", "Luw1/b;", "Loq/i0;", "<anonymous>", "(Luw1/a$d;Luw1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<uw1.a.d, uw1.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f201953e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f201953e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<uw1.a.g> bVarY1 = q.this.Y1();
                uw1.a.g.C5245a c5245a = uw1.a.g.C5245a.f201879a;
                this.f201953e = 1;
                if (bVarY1.F(c5245a, this) == objE) {
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
        public final Object w(uw1.a.d dVar, uw1.b bVar, tq.e<? super i0> eVar) {
            return q.this.new g(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Luw1/a$f;", "<unused var>", "Luw1/b;", "Loq/i0;", "<anonymous>", "(Luw1/a$f;Luw1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<uw1.a.f, uw1.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f201955e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ wx1.a f201957g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(wx1.a aVar, tq.e<? super h> eVar) {
            super(3, eVar);
            this.f201957g = aVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f201955e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<uw1.a.g> bVarY1 = q.this.Y1();
                uw1.a.g.GoToFaq goToFaq = new uw1.a.g.GoToFaq(this.f201957g.e());
                this.f201955e = 1;
                if (bVarY1.F(goToFaq, this) == objE) {
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
        public final Object w(uw1.a.f fVar, uw1.b bVar, tq.e<? super i0> eVar) {
            return q.this.new h(this.f201957g, eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Luw1/a$h;", "action", "Lk10/c0;", "Luw1/b$a;", "state", "Lk10/l;", "Luw1/b;", "<anonymous>", "(Luw1/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<uw1.a.Setup, c0<uw1.b.a>, tq.e<? super k10.l<? extends uw1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f201958e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f201959f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f201960g;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final uw1.b.GettingStatus O(uw1.a.Setup setup, uw1.b.a aVar) {
            return new uw1.b.GettingStatus(setup.getServiceType());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final uw1.a.Setup setup = (uw1.a.Setup) this.f201959f;
            c0 c0Var = (c0) this.f201960g;
            uq.b.e();
            if (this.f201958e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: uw1.t
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.i.O(setup, (b.a) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(uw1.a.Setup setup, c0<uw1.b.a> c0Var, tq.e<? super k10.l<? extends uw1.b>> eVar) {
            i iVar = new i(eVar);
            iVar.f201959f = setup;
            iVar.f201960g = c0Var;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Luw1/b$c;", "state", "Lk10/l;", "Luw1/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.p<c0<uw1.b.GettingStatus>, tq.e<? super k10.l<? extends uw1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f201961e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f201962f;

        j(tq.e<? super j> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f201962f;
            Object objE = uq.b.e();
            int i15 = this.f201961e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            q qVar = q.this;
            this.f201962f = vq.j.a(c0Var);
            this.f201961e = 1;
            Object objD9 = qVar.D9(c0Var, this);
            return objD9 == objE ? objE : objD9;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<uw1.b.GettingStatus> c0Var, tq.e<? super k10.l<? extends uw1.b>> eVar) {
            return ((j) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            j jVar = q.this.new j(eVar);
            jVar.f201962f = obj;
            return jVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Luw1/a$b;", "action", "Lk10/c0;", "Luw1/b$c;", "state", "Lk10/l;", "Luw1/b;", "<anonymous>", "(Luw1/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<uw1.a.CheckDocumentSigningStatus, c0<uw1.b.GettingStatus>, tq.e<? super k10.l<? extends uw1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f201964e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f201965f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f201966g;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uw1.a.CheckDocumentSigningStatus checkDocumentSigningStatus = (uw1.a.CheckDocumentSigningStatus) this.f201965f;
            c0 c0Var = (c0) this.f201966g;
            Object objE = uq.b.e();
            int i15 = this.f201964e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            q qVar = q.this;
            this.f201965f = vq.j.a(checkDocumentSigningStatus);
            this.f201966g = vq.j.a(c0Var);
            this.f201964e = 1;
            Object objZ9 = qVar.z9(checkDocumentSigningStatus, c0Var, this);
            return objZ9 == objE ? objE : objZ9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(uw1.a.CheckDocumentSigningStatus checkDocumentSigningStatus, c0<uw1.b.GettingStatus> c0Var, tq.e<? super k10.l<? extends uw1.b>> eVar) {
            k kVar = q.this.new k(eVar);
            kVar.f201965f = checkDocumentSigningStatus;
            kVar.f201966g = c0Var;
            return kVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Luw1/a$a;", "action", "Lk10/c0;", "Luw1/b$c;", "state", "Lk10/l;", "Luw1/b;", "<anonymous>", "(Luw1/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<uw1.a.CheckChangePinStatus, c0<uw1.b.GettingStatus>, tq.e<? super k10.l<? extends uw1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f201968e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f201969f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f201970g;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uw1.a.CheckChangePinStatus checkChangePinStatus = (uw1.a.CheckChangePinStatus) this.f201969f;
            c0 c0Var = (c0) this.f201970g;
            Object objE = uq.b.e();
            int i15 = this.f201968e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            q qVar = q.this;
            this.f201969f = vq.j.a(checkChangePinStatus);
            this.f201970g = vq.j.a(c0Var);
            this.f201968e = 1;
            Object objX9 = qVar.x9(checkChangePinStatus, c0Var, this);
            return objX9 == objE ? objE : objX9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(uw1.a.CheckChangePinStatus checkChangePinStatus, c0<uw1.b.GettingStatus> c0Var, tq.e<? super k10.l<? extends uw1.b>> eVar) {
            l lVar = q.this.new l(eVar);
            lVar.f201969f = checkChangePinStatus;
            lVar.f201970g = c0Var;
            return lVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Luw1/a$c;", "action", "Lk10/c0;", "Luw1/b$c;", "state", "Lk10/l;", "Luw1/b;", "<anonymous>", "(Luw1/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<uw1.a.CheckElectronicLayerSettingsStatus, c0<uw1.b.GettingStatus>, tq.e<? super k10.l<? extends uw1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f201972e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f201973f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f201974g;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uw1.a.CheckElectronicLayerSettingsStatus checkElectronicLayerSettingsStatus = (uw1.a.CheckElectronicLayerSettingsStatus) this.f201973f;
            c0 c0Var = (c0) this.f201974g;
            Object objE = uq.b.e();
            int i15 = this.f201972e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            q qVar = q.this;
            this.f201973f = vq.j.a(checkElectronicLayerSettingsStatus);
            this.f201974g = vq.j.a(c0Var);
            this.f201972e = 1;
            Object objB9 = qVar.B9(checkElectronicLayerSettingsStatus, c0Var, this);
            return objB9 == objE ? objE : objB9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(uw1.a.CheckElectronicLayerSettingsStatus checkElectronicLayerSettingsStatus, c0<uw1.b.GettingStatus> c0Var, tq.e<? super k10.l<? extends uw1.b>> eVar) {
            m mVar = q.this.new m(eVar);
            mVar.f201973f = checkElectronicLayerSettingsStatus;
            mVar.f201974g = c0Var;
            return mVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Luw1/a$e;", "action", "Lk10/c0;", "Luw1/b$b;", "state", "Lk10/l;", "Luw1/b;", "<anonymous>", "(Luw1/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<uw1.a.e, c0<uw1.b.Error>, tq.e<? super k10.l<? extends uw1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f201976e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f201977f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final uw1.b.GettingStatus O(c0 c0Var, uw1.b.Error error) {
            return new uw1.b.GettingStatus(((uw1.b.Error) c0Var.a()).getServiceType());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final c0 c0Var = (c0) this.f201977f;
            uq.b.e();
            if (this.f201976e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: uw1.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.n.O(c0Var, (b.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(uw1.a.e eVar, c0<uw1.b.Error> c0Var, tq.e<? super k10.l<? extends uw1.b>> eVar2) {
            n nVar = new n(eVar2);
            nVar.f201977f = c0Var;
            return nVar.J(i0.f148189a);
        }
    }

    public q(yy.a aVar, vw1.a aVar2, final wx1.a aVar3, ib4.c cVar, hb4.d dVar, ij0.a aVar4, ac4.a aVar5) {
        this.genericDomainErrorMapper = cVar;
        this.errorVMSFactory = dVar;
        this.getElectronicCapabilityDataUseCase = aVar4;
        this.callActionWithLoaderUseCase = aVar5;
        this.stateMachine = aVar.a(uw1.b.a.f201885a, new er.l() { // from class: uw1.i
            @Override // er.l
            public final Object b(Object obj) {
                return q.G9(this.f201903a, aVar3, (k10.v) obj);
            }
        });
        this.state = a9(new f(e9().getState(), aVar2, this), uw1.c.a.C5247a.f201891a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final uw1.b.StatusUnavailable A9(uw1.a.CheckDocumentSigningStatus checkDocumentSigningStatus, uw1.b.GettingStatus gettingStatus) {
        return new uw1.b.StatusUnavailable(gettingStatus.getServiceType(), checkDocumentSigningStatus.getCapabilityData());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object B9(final uw1.a.CheckElectronicLayerSettingsStatus checkElectronicLayerSettingsStatus, c0<uw1.b.GettingStatus> c0Var, tq.e<? super k10.l<? extends uw1.b>> eVar) throws Throwable {
        d dVar;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i15 = dVar.f201934h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f201934h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object obj = dVar.f201932f;
        Object objE = uq.b.e();
        int i16 = dVar.f201934h;
        if (i16 == 0) {
            oq.u.b(obj);
            if (a.f201919b[checkElectronicLayerSettingsStatus.getCapabilityData().getElectronicLayerSettings().getStatus().ordinal()] != 1) {
                return c0Var.d(new er.l() { // from class: uw1.n
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return q.C9(checkElectronicLayerSettingsStatus, (b.GettingStatus) obj2);
                    }
                });
            }
            xw.b<uw1.a.g> bVarY1 = Y1();
            uw1.a.g.b bVar = uw1.a.g.b.f201880a;
            dVar.f201930d = vq.j.a(checkElectronicLayerSettingsStatus);
            dVar.f201931e = c0Var;
            dVar.f201934h = 1;
            if (bVarY1.F(bVar, dVar) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0Var = (c0) dVar.f201931e;
            oq.u.b(obj);
        }
        return c0Var.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final uw1.b.StatusUnavailable C9(uw1.a.CheckElectronicLayerSettingsStatus checkElectronicLayerSettingsStatus, uw1.b.GettingStatus gettingStatus) {
        return new uw1.b.StatusUnavailable(gettingStatus.getServiceType(), checkElectronicLayerSettingsStatus.getCapabilityData());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object D9(c0<uw1.b.GettingStatus> c0Var, tq.e<? super k10.l<uw1.b.Error>> eVar) {
        return ac4.a.a(this.callActionWithLoaderUseCase, null, new e(c0Var, null), eVar, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G9(final q qVar, final wx1.a aVar, k10.v vVar) {
        vVar.c(q0.c(uw1.b.class), new er.l() { // from class: uw1.j
            @Override // er.l
            public final Object b(Object obj) {
                return q.H9(this.f201905a, aVar, (z) obj);
            }
        });
        vVar.c(q0.c(uw1.b.a.class), new er.l() { // from class: uw1.k
            @Override // er.l
            public final Object b(Object obj) {
                return q.I9((z) obj);
            }
        });
        vVar.c(q0.c(uw1.b.GettingStatus.class), new er.l() { // from class: uw1.l
            @Override // er.l
            public final Object b(Object obj) {
                return q.J9(this.f201907a, (z) obj);
            }
        });
        vVar.c(q0.c(uw1.b.Error.class), new er.l() { // from class: uw1.m
            @Override // er.l
            public final Object b(Object obj) {
                return q.K9((z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H9(q qVar, wx1.a aVar, z zVar) {
        g gVar = qVar.new g(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(uw1.a.d.class), oVar, gVar);
        zVar.x(q0.c(uw1.a.f.class), oVar, qVar.new h(aVar, null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I9(z zVar) {
        i iVar = new i(null);
        zVar.v(q0.c(uw1.a.Setup.class), k10.o.CANCEL_PREVIOUS, iVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J9(q qVar, z zVar) {
        zVar.A(qVar.new j(null));
        k kVar = qVar.new k(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(uw1.a.CheckDocumentSigningStatus.class), oVar, kVar);
        zVar.v(q0.c(uw1.a.CheckChangePinStatus.class), oVar, qVar.new l(null));
        zVar.v(q0.c(uw1.a.CheckElectronicLayerSettingsStatus.class), oVar, qVar.new m(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K9(z zVar) {
        n nVar = new n(null);
        zVar.v(q0.c(uw1.a.e.class), k10.o.CANCEL_PREVIOUS, nVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object x9(final uw1.a.CheckChangePinStatus checkChangePinStatus, c0<uw1.b.GettingStatus> c0Var, tq.e<? super k10.l<? extends uw1.b>> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f201924h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f201924h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object obj = bVar.f201922f;
        Object objE = uq.b.e();
        int i16 = bVar.f201924h;
        if (i16 == 0) {
            oq.u.b(obj);
            if (a.f201919b[checkChangePinStatus.getCapabilityData().getElectronicLayerSettings().getStatus().ordinal()] != 1) {
                return c0Var.d(new er.l() { // from class: uw1.p
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return q.y9(checkChangePinStatus, (b.GettingStatus) obj2);
                    }
                });
            }
            xw.b<uw1.a.g> bVarY1 = Y1();
            uw1.a.g.d dVar = uw1.a.g.d.f201882a;
            bVar.f201920d = vq.j.a(checkChangePinStatus);
            bVar.f201921e = c0Var;
            bVar.f201924h = 1;
            if (bVarY1.F(dVar, bVar) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0Var = (c0) bVar.f201921e;
            oq.u.b(obj);
        }
        return c0Var.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final uw1.b.StatusUnavailable y9(uw1.a.CheckChangePinStatus checkChangePinStatus, uw1.b.GettingStatus gettingStatus) {
        return new uw1.b.StatusUnavailable(gettingStatus.getServiceType(), checkChangePinStatus.getCapabilityData());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object z9(final uw1.a.CheckDocumentSigningStatus checkDocumentSigningStatus, c0<uw1.b.GettingStatus> c0Var, tq.e<? super k10.l<uw1.b.StatusUnavailable>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f201929h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f201929h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object obj = cVar.f201927f;
        Object objE = uq.b.e();
        int i16 = cVar.f201929h;
        if (i16 == 0) {
            oq.u.b(obj);
            if (a.f201918a[checkDocumentSigningStatus.getCapabilityData().getSignatureInfo().getStatus().ordinal()] != 1) {
                return c0Var.d(new er.l() { // from class: uw1.o
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return q.A9(checkDocumentSigningStatus, (b.GettingStatus) obj2);
                    }
                });
            }
            xw.b<uw1.a.g> bVarY1 = Y1();
            uw1.a.g.e eVar2 = uw1.a.g.e.f201883a;
            cVar.f201925d = vq.j.a(checkDocumentSigningStatus);
            cVar.f201926e = c0Var;
            cVar.f201929h = 1;
            if (bVarY1.F(eVar2, cVar) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0Var = (c0) cVar.f201926e;
            oq.u.b(obj);
        }
        return c0Var.c();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: E9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }

    public void F9(ww1.a serviceType) {
        d9(new uw1.a.Setup(serviceType));
    }

    @Override // zx.b
    public xw.b<uw1.a.g> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<uw1.b, uw1.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<uw1.c.a> getState() {
        return this.state;
    }
}
