package gp2;

import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003Bc\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0001\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010 \u001a\u00020\u001f*\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020\u0002H\u0002¢\u0006\u0004\b$\u0010%J0\u0010*\u001a\b\u0012\u0004\u0012\u00020)0&2\n\u0010\"\u001a\u0006\u0012\u0002\b\u00030\u001d2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&H\u0082@¢\u0006\u0004\b*\u0010+J(\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-*\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010,\u001a\u00020'H\u0082@¢\u0006\u0004\b/\u00100J \u00101\u001a\b\u0012\u0004\u0012\u00020\u00020-*\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0082@¢\u0006\u0004\b1\u00102J \u00103\u001a\b\u0012\u0004\u0012\u00020\u00020-*\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0082@¢\u0006\u0004\b3\u00102J \u00104\u001a\b\u0012\u0004\u0012\u00020\u00020-*\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0082@¢\u0006\u0004\b4\u00102J%\u00107\u001a\b\u0012\u0004\u0012\u00020\u00020-*\u0006\u0012\u0002\b\u00030\u001d2\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b7\u00108J.\u00109\u001a\b\u0012\u0004\u0012\u00020\u001e0-*\b\u0012\u0004\u0012\u00020\u001e0\u001d2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020'0&H\u0082@¢\u0006\u0004\b9\u0010+J\u0017\u0010;\u001a\u00020:2\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b;\u0010<R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010T\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR \u0010[\u001a\b\u0012\u0004\u0012\u00020V0U8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR&\u0010a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\\8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R \u0010\"\u001a\b\u0012\u0004\u0012\u00020#0b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010f¨\u0006g"}, d2 = {"Lgp2/k0;", "Ll00/g;", "Lgp2/l;", "", "Lgp2/m;", "Lyy/a;", "stateMachineFactory", "Lip2/d;", "mapper", "Lib4/c;", "genericErrorMapper", "Lbc4/k;", "pickPhotoFromCameraWithSizeValidationUseCase", "Lbc4/i;", "pickFileUseCase", "Lhb4/d;", "errorVMSFactory", "La00/b;", "pickedFileToAndroidMapper", "Lyw/b;", "accessibilityTalkBackManager", "Lmx/c;", "labelProvider", "Lbc4/j;", "pickMultiplePhotosFromGalleryUseCase", "Lgp2/k;", "setupData", "<init>", "(Lyy/a;Lip2/d;Lib4/c;Lbc4/k;Lbc4/i;Lhb4/d;La00/b;Lyw/b;Lmx/c;Lbc4/j;Lgp2/k;)V", "Lk10/c0;", "Lgp2/l$b$b;", "", "N9", "(Lk10/c0;)Z", "state", "Lgp2/m$a;", "O9", "(Lgp2/l;)Lgp2/m$a;", "", "Lwx/i;", "pickedFiles", "Ln40/i;", "ea", "(Lk10/c0;Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "attachment", "Lk10/l;", "Lgp2/l$b;", "U9", "(Lk10/c0;Lwx/i;Ltq/e;)Ljava/lang/Object;", "da", "(Lk10/c0;Ltq/e;)Ljava/lang/Object;", "T9", "S9", "Ldx/b;", "domainError", "L9", "(Lk10/c0;Ldx/b;)Lk10/l;", "G9", "Lhb4/c;", "J9", "(Ldx/b;)Lhb4/c;", "b", "Lip2/d;", "c", "Lib4/c;", "d", "Lbc4/k;", "e", "Lbc4/i;", "f", "Lhb4/d;", "g", "La00/b;", "h", "Lyw/b;", "j", "Lmx/c;", "k", "Lbc4/j;", "l", "Lgp2/k;", "Lgp2/l$a$b;", "m", "Lgp2/l$a$b;", "initialState", "Lxw/b;", "Lgp2/e;", "n", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "p", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "q", "Lmu/p0;", "getState", "()Lmu/p0;", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k0 extends l00.g<gp2.l, Object> implements gp2.m, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ip2.d mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericErrorMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final bc4.k pickPhotoFromCameraWithSizeValidationUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final bc4.i pickFileUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final a00.b pickedFileToAndroidMapper;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final yw.b accessibilityTalkBackManager;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final bc4.j pickMultiplePhotosFromGalleryUseCase;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final PassportAgreementAttachmentsNavigationParams setupData;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final gp2.l.a.b initialState;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final xw.b<gp2.e> navAction;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final k10.t<gp2.l, Object> stateMachine;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<gp2.m.a> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f75957d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f75958e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f75959f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f75960g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f75962j;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f75960g = obj;
            this.f75962j |= PKIFailureInfo.systemUnavail;
            return k0.this.G9(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f75963d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f75964e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f75965f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f75966g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f75967h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f75968j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f75970l;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f75968j = obj;
            this.f75970l |= PKIFailureInfo.systemUnavail;
            return k0.this.S9(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f75971d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f75972e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f75973f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f75974g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f75975h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f75976j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f75978l;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f75976j = obj;
            this.f75978l |= PKIFailureInfo.systemUnavail;
            return k0.this.T9(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f75979d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f75980e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f75981f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f75982g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f75984j;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f75982g = obj;
            this.f75984j |= PKIFailureInfo.systemUnavail;
            return k0.this.U9(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e implements mu.g<gp2.m.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f75985a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k0 f75986b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f75987a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ k0 f75988b;

            /* JADX INFO: renamed from: gp2.k0$e$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1716a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f75989d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f75990e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f75991f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f75993h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f75994j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f75995k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f75996l;

                public C1716a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f75989d = obj;
                    this.f75990e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, k0 k0Var) {
                this.f75987a = hVar;
                this.f75988b = k0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1716a c1716a;
                if (eVar instanceof C1716a) {
                    c1716a = (C1716a) eVar;
                    int i15 = c1716a.f75990e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1716a.f75990e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1716a = new C1716a(eVar);
                    }
                } else {
                    c1716a = new C1716a(eVar);
                }
                Object obj2 = c1716a.f75989d;
                Object objE = uq.b.e();
                int i16 = c1716a.f75990e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f75987a;
                    gp2.m.a aVarO9 = this.f75988b.O9((gp2.l) obj);
                    c1716a.f75991f = vq.j.a(obj);
                    c1716a.f75993h = vq.j.a(c1716a);
                    c1716a.f75994j = vq.j.a(obj);
                    c1716a.f75995k = vq.j.a(hVar);
                    c1716a.f75996l = 0;
                    c1716a.f75990e = 1;
                    if (hVar.F(aVarO9, c1716a) == objE) {
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

        public e(mu.g gVar, k0 k0Var) {
            this.f75985a = gVar;
            this.f75986b = k0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super gp2.m.a> hVar, tq.e eVar) {
            Object objA = this.f75985a.a(new a(hVar, this.f75986b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lgp2/b;", "<unused var>", "Lgp2/l;", "Loq/i0;", "<anonymous>", "(Lgp2/b;Lgp2/l;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<gp2.b, gp2.l, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f75997e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f75997e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<gp2.e> bVarY1 = k0.this.Y1();
                gp2.e.b bVar = gp2.e.b.f75923a;
                this.f75997e = 1;
                if (bVarY1.F(bVar, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(gp2.b bVar, gp2.l lVar, tq.e<? super oq.i0> eVar) {
            return k0.this.new f(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lgp2/l$a;", "state", "Lk10/l;", "Lgp2/l;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.p<k10.c0<gp2.l.a>, tq.e<? super k10.l<? extends gp2.l>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f75999e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f76000f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f76001g;

        g(tq.e<? super g> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gp2.l.b.Presentation O(List list, List list2, k0 k0Var, gp2.l.a aVar) {
            return new gp2.l.b.Presentation(new gp2.l.b.StateData(list, list2, null, null, false, 12, null), k0Var.setupData.getAttachmentType());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final List<wx.i> list;
            k10.c0 c0Var = (k10.c0) this.f76001g;
            Object objE = uq.b.e();
            int i15 = this.f76000f;
            if (i15 == 0) {
                oq.u.b(obj);
                List<wx.i> listA = k0.this.setupData.getDataContract().x4(k0.this.setupData.getAttachmentType()).a();
                k0 k0Var = k0.this;
                this.f76001g = c0Var;
                this.f75999e = listA;
                this.f76000f = 1;
                Object objEa = k0Var.ea(c0Var, listA, this);
                if (objEa == objE) {
                    return objE;
                }
                list = listA;
                obj = objEa;
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) this.f75999e;
                oq.u.b(obj);
            }
            final List list2 = (List) obj;
            final k0 k0Var2 = k0.this;
            return c0Var.d(new er.l() { // from class: gp2.l0
                @Override // er.l
                public final Object b(Object obj2) {
                    return k0.g.O(list, list2, k0Var2, (l.a) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<gp2.l.a> c0Var, tq.e<? super k10.l<? extends gp2.l>> eVar) {
            return ((g) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            g gVar = k0.this.new g(eVar);
            gVar.f76001g = obj;
            return gVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lgp2/a;", "<unused var>", "Lgp2/l$b$b;", "state", "Loq/i0;", "<anonymous>", "(Lgp2/a;Lgp2/l$b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<gp2.a, gp2.l.b.Presentation, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f76003e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f76004f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            gp2.l.b.Presentation presentation = (gp2.l.b.Presentation) this.f76004f;
            Object objE = uq.b.e();
            int i15 = this.f76003e;
            if (i15 == 0) {
                oq.u.b(obj);
                k0.this.setupData.getDataContract().P2(k0.this.setupData.getAttachmentType(), new jp2.c.AttachmentsData(presentation.getStateData().c()));
                k0 k0Var = k0.this;
                gp2.e.a aVar = gp2.e.a.f75922a;
                this.f76004f = vq.j.a(presentation);
                this.f76003e = 1;
                if (k0Var.F(aVar, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(gp2.a aVar, gp2.l.b.Presentation presentation, tq.e<? super oq.i0> eVar) {
            h hVar = k0.this.new h(eVar);
            hVar.f76004f = presentation;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lgp2/g;", "action", "Lk10/c0;", "Lgp2/l$b$b;", "state", "Lk10/l;", "Lgp2/l;", "<anonymous>", "(Lgp2/g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<OnBottomSheetActionSelected, k10.c0<gp2.l.b.Presentation>, tq.e<? super k10.l<? extends gp2.l>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f76006e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f76007f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f76008g;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f76010a;

            static {
                int[] iArr = new int[hp2.e.values().length];
                try {
                    iArr[hp2.e.TAKE_PHOTO.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[hp2.e.PICK_PHOTO.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[hp2.e.PICK_FILE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f76010a = iArr;
            }
        }

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
        
            if (r8 == r2) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
        
            if (r8 == r2) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0090, code lost:
        
            if (r8 == r2) goto L30;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f76007f
                gp2.g r0 = (gp2.OnBottomSheetActionSelected) r0
                java.lang.Object r1 = r7.f76008g
                k10.c0 r1 = (k10.c0) r1
                java.lang.Object r2 = uq.b.e()
                int r3 = r7.f76006e
                r4 = 3
                r5 = 2
                r6 = 1
                if (r3 == 0) goto L2d
                if (r3 == r6) goto L29
                if (r3 == r5) goto L25
                if (r3 != r4) goto L1d
                oq.u.b(r8)
                goto L59
            L1d:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L25:
                oq.u.b(r8)
                goto L79
            L29:
                oq.u.b(r8)
                goto L93
            L2d:
                oq.u.b(r8)
                hp2.e r8 = r0.getSelectedOption()
                int[] r3 = gp2.k0.i.a.f76010a
                int r8 = r8.ordinal()
                r8 = r3[r8]
                if (r8 == r6) goto L7c
                if (r8 == r5) goto L62
                if (r8 != r4) goto L5c
                gp2.k0 r8 = gp2.k0.this
                java.lang.Object r0 = vq.j.a(r0)
                r7.f76007f = r0
                java.lang.Object r0 = vq.j.a(r1)
                r7.f76008g = r0
                r7.f76006e = r4
                java.lang.Object r8 = gp2.k0.B9(r8, r1, r7)
                if (r8 != r2) goto L59
                goto L92
            L59:
                k10.l r8 = (k10.l) r8
                return r8
            L5c:
                oq.p r8 = new oq.p
                r8.<init>()
                throw r8
            L62:
                gp2.k0 r8 = gp2.k0.this
                java.lang.Object r0 = vq.j.a(r0)
                r7.f76007f = r0
                java.lang.Object r0 = vq.j.a(r1)
                r7.f76008g = r0
                r7.f76006e = r5
                java.lang.Object r8 = gp2.k0.C9(r8, r1, r7)
                if (r8 != r2) goto L79
                goto L92
            L79:
                k10.l r8 = (k10.l) r8
                return r8
            L7c:
                gp2.k0 r8 = gp2.k0.this
                java.lang.Object r0 = vq.j.a(r0)
                r7.f76007f = r0
                java.lang.Object r0 = vq.j.a(r1)
                r7.f76008g = r0
                r7.f76006e = r6
                java.lang.Object r8 = gp2.k0.E9(r8, r1, r7)
                if (r8 != r2) goto L93
            L92:
                return r2
            L93:
                k10.l r8 = (k10.l) r8
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: gp2.k0.i.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OnBottomSheetActionSelected onBottomSheetActionSelected, k10.c0<gp2.l.b.Presentation> c0Var, tq.e<? super k10.l<? extends gp2.l>> eVar) {
            i iVar = k0.this.new i(eVar);
            iVar.f76007f = onBottomSheetActionSelected;
            iVar.f76008g = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lgp2/d;", "action", "Lk10/c0;", "Lgp2/l$b$b;", "state", "Lk10/l;", "Lgp2/l;", "<anonymous>", "(Lgp2/d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<DeleteFile, k10.c0<gp2.l.b.Presentation>, tq.e<? super k10.l<? extends gp2.l>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f76011e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f76012f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f76013g;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            DeleteFile deleteFile = (DeleteFile) this.f76012f;
            k10.c0 c0Var = (k10.c0) this.f76013g;
            Object objE = uq.b.e();
            int i15 = this.f76011e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            k0 k0Var = k0.this;
            wx.i pickedFile = deleteFile.getPickedFile();
            this.f76012f = vq.j.a(deleteFile);
            this.f76013g = vq.j.a(c0Var);
            this.f76011e = 1;
            Object objU9 = k0Var.U9(c0Var, pickedFile, this);
            return objU9 == objE ? objE : objU9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(DeleteFile deleteFile, k10.c0<gp2.l.b.Presentation> c0Var, tq.e<? super k10.l<? extends gp2.l>> eVar) {
            j jVar = k0.this.new j(eVar);
            jVar.f76012f = deleteFile;
            jVar.f76013g = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lgp2/j;", "action", "Lgp2/l$b$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lgp2/j;Lgp2/l$b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<ShowAttachmentPreview, gp2.l.b.Presentation, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f76015e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f76016f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ShowAttachmentPreview showAttachmentPreview = (ShowAttachmentPreview) this.f76016f;
            Object objE = uq.b.e();
            int i15 = this.f76015e;
            if (i15 == 0) {
                oq.u.b(obj);
                k0 k0Var = k0.this;
                gp2.e.ShowAttachmentPreview showAttachmentPreview2 = new gp2.e.ShowAttachmentPreview(new dx3.a.Content(showAttachmentPreview.getTitle(), showAttachmentPreview.getFileContent()));
                this.f76016f = vq.j.a(showAttachmentPreview);
                this.f76015e = 1;
                if (k0Var.F(showAttachmentPreview2, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ShowAttachmentPreview showAttachmentPreview, gp2.l.b.Presentation presentation, tq.e<? super oq.i0> eVar) {
            k kVar = k0.this.new k(eVar);
            kVar.f76016f = showAttachmentPreview;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lgp2/i;", "action", "Lk10/c0;", "Lgp2/l$b$b;", "state", "Lk10/l;", "Lgp2/l;", "<anonymous>", "(Lgp2/i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<OpenBottomSheet, k10.c0<gp2.l.b.Presentation>, tq.e<? super k10.l<? extends gp2.l>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f76018e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f76019f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f76020g;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gp2.l.b.Presentation O(OpenBottomSheet openBottomSheet, gp2.l.b.Presentation presentation) {
            return gp2.l.b.Presentation.b(presentation, gp2.l.b.StateData.b(presentation.getStateData(), null, null, g30.v.EXPANDED, openBottomSheet.getData(), false, 19, null), null, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OpenBottomSheet openBottomSheet = (OpenBottomSheet) this.f76019f;
            k10.c0 c0Var = (k10.c0) this.f76020g;
            uq.b.e();
            if (this.f76018e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: gp2.m0
                @Override // er.l
                public final Object b(Object obj2) {
                    return k0.l.O(openBottomSheet, (l.b.Presentation) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OpenBottomSheet openBottomSheet, k10.c0<gp2.l.b.Presentation> c0Var, tq.e<? super k10.l<? extends gp2.l>> eVar) {
            l lVar = new l(eVar);
            lVar.f76019f = openBottomSheet;
            lVar.f76020g = c0Var;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lgp2/h;", "action", "Lk10/c0;", "Lgp2/l$b$b;", "state", "Lk10/l;", "Lgp2/l;", "<anonymous>", "(Lgp2/h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<OnBottomSheetStateChanged, k10.c0<gp2.l.b.Presentation>, tq.e<? super k10.l<? extends gp2.l>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f76021e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f76022f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f76023g;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gp2.l.b.Presentation O(OnBottomSheetStateChanged onBottomSheetStateChanged, k10.c0 c0Var, gp2.l.b.Presentation presentation) {
            gp2.l.b.StateData stateData = presentation.getStateData();
            g30.v state = onBottomSheetStateChanged.getState();
            g30.v state2 = onBottomSheetStateChanged.getState();
            if (state2 == g30.v.HIDDEN) {
                state2 = null;
            }
            return gp2.l.b.Presentation.b(presentation, gp2.l.b.StateData.b(stateData, null, null, state, state2 != null ? ((gp2.l.b.Presentation) c0Var.a()).getStateData().getBottomSheetData() : null, false, 19, null), null, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnBottomSheetStateChanged onBottomSheetStateChanged = (OnBottomSheetStateChanged) this.f76022f;
            final k10.c0 c0Var = (k10.c0) this.f76023g;
            uq.b.e();
            if (this.f76021e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: gp2.n0
                @Override // er.l
                public final Object b(Object obj2) {
                    return k0.m.O(onBottomSheetStateChanged, c0Var, (l.b.Presentation) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnBottomSheetStateChanged onBottomSheetStateChanged, k10.c0<gp2.l.b.Presentation> c0Var, tq.e<? super k10.l<? extends gp2.l>> eVar) {
            m mVar = new m(eVar);
            mVar.f76022f = onBottomSheetStateChanged;
            mVar.f76023g = c0Var;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lgp2/f;", "<unused var>", "Lk10/c0;", "Lgp2/l$b$b;", "state", "Lk10/l;", "Lgp2/l;", "<anonymous>", "(Lgp2/f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<gp2.f, k10.c0<gp2.l.b.Presentation>, tq.e<? super k10.l<? extends gp2.l>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f76024e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f76025f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gp2.l.b.Presentation O(k10.c0 c0Var, k0 k0Var, gp2.l.b.Presentation presentation) {
            return gp2.l.b.Presentation.b(presentation, gp2.l.b.StateData.b(((gp2.l.b.Presentation) c0Var.a()).getStateData(), null, null, null, null, !k0Var.N9(c0Var), 15, null), null, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f76025f;
            Object objE = uq.b.e();
            int i15 = this.f76024e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (!k0.this.N9(c0Var)) {
                    k0.this.accessibilityTalkBackManager.a(k0.this.labelProvider.c(bp2.a.f21082n).getText());
                    final k0 k0Var = k0.this;
                    return c0Var.d(new er.l() { // from class: gp2.o0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return k0.n.O(c0Var, k0Var, (l.b.Presentation) obj2);
                        }
                    });
                }
                k0.this.setupData.getDataContract().P2(k0.this.setupData.getAttachmentType(), new jp2.c.AttachmentsData(((gp2.l.b.Presentation) c0Var.a()).getStateData().c()));
                k0 k0Var2 = k0.this;
                gp2.e.Next next = new gp2.e.Next(k0.this.setupData.getAttachmentType());
                this.f76025f = c0Var;
                this.f76024e = 1;
                if (k0Var2.F(next, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(gp2.f fVar, k10.c0<gp2.l.b.Presentation> c0Var, tq.e<? super k10.l<? extends gp2.l>> eVar) {
            n nVar = k0.this.new n(eVar);
            nVar.f76025f = c0Var;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lgp2/c;", "action", "Lk10/c0;", "Lgp2/l$a$a;", "state", "Lk10/l;", "Lgp2/l;", "<anonymous>", "(Lgp2/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<gp2.c, k10.c0<gp2.l.a.Error>, tq.e<? super k10.l<? extends gp2.l>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f76027e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f76028f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gp2.l.a.b O(gp2.l.a.Error error) {
            return gp2.l.a.b.f76060a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f76028f;
            uq.b.e();
            if (this.f76027e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: gp2.p0
                @Override // er.l
                public final Object b(Object obj2) {
                    return k0.o.O((l.a.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(gp2.c cVar, k10.c0<gp2.l.a.Error> c0Var, tq.e<? super k10.l<? extends gp2.l>> eVar) {
            o oVar = new o(eVar);
            oVar.f76028f = c0Var;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lgp2/c;", "action", "Lk10/c0;", "Lgp2/l$b$a;", "state", "Lk10/l;", "Lgp2/l;", "<anonymous>", "(Lgp2/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<gp2.c, k10.c0<gp2.l.b.Error>, tq.e<? super k10.l<? extends gp2.l>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f76029e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f76030f;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gp2.l.b.Presentation O(k10.c0 c0Var, k0 k0Var, gp2.l.b.Error error) {
            return new gp2.l.b.Presentation(((gp2.l.b.Error) c0Var.a()).getStateData(), k0Var.setupData.getAttachmentType());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f76030f;
            uq.b.e();
            if (this.f76029e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final k0 k0Var = k0.this;
            return c0Var.d(new er.l() { // from class: gp2.q0
                @Override // er.l
                public final Object b(Object obj2) {
                    return k0.p.O(c0Var, k0Var, (l.b.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(gp2.c cVar, k10.c0<gp2.l.b.Error> c0Var, tq.e<? super k10.l<? extends gp2.l>> eVar) {
            p pVar = k0.this.new p(eVar);
            pVar.f76030f = c0Var;
            return pVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class q extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f76032d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f76033e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f76034f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f76035g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f76036h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f76037j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f76038k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f76040m;

        q(tq.e<? super q> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f76038k = obj;
            this.f76040m |= PKIFailureInfo.systemUnavail;
            return k0.this.da(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class r extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f76041d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f76042e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f76043f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f76044g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f76045h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f76046j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f76047k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f76048l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f76049m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f76050n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f76051p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f76052q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f76053r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f76054s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f76055t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f76056v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f76058x;

        r(tq.e<? super r> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f76056v = obj;
            this.f76058x |= PKIFailureInfo.systemUnavail;
            return k0.this.ea(null, null, this);
        }
    }

    public k0(yy.a aVar, ip2.d dVar, ib4.c cVar, bc4.k kVar, bc4.i iVar, hb4.d dVar2, a00.b bVar, yw.b bVar2, mx.c cVar2, bc4.j jVar, PassportAgreementAttachmentsNavigationParams passportAgreementAttachmentsNavigationParams) {
        this.mapper = dVar;
        this.genericErrorMapper = cVar;
        this.pickPhotoFromCameraWithSizeValidationUseCase = kVar;
        this.pickFileUseCase = iVar;
        this.errorVMSFactory = dVar2;
        this.pickedFileToAndroidMapper = bVar;
        this.accessibilityTalkBackManager = bVar2;
        this.labelProvider = cVar2;
        this.pickMultiplePhotosFromGalleryUseCase = jVar;
        this.setupData = passportAgreementAttachmentsNavigationParams;
        gp2.l.a.b bVar3 = gp2.l.a.b.f76060a;
        this.initialState = bVar3;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(bVar3, new er.l() { // from class: gp2.a0
            @Override // er.l
            public final Object b(Object obj) {
                return k0.X9(this.f75916a, (k10.v) obj);
            }
        });
        this.state = a9(new e(e9().getState(), this), O9(bVar3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object G9(k10.c0<gp2.l.b.Presentation> c0Var, List<? extends wx.i> list, tq.e<? super k10.l<gp2.l.b.Presentation>> eVar) throws Throwable {
        a aVar;
        k10.c0<gp2.l.b.Presentation> c0Var2;
        final List<? extends wx.i> list2;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f75962j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f75962j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f75960g;
        Object objE = uq.b.e();
        int i16 = aVar.f75962j;
        if (i16 == 0) {
            oq.u.b(obj);
            List listI1 = pq.v.i1(c0Var.a().getStateData().c());
            listI1.addAll(list);
            List<? extends wx.i> listF1 = pq.v.f1(listI1);
            aVar.f75957d = c0Var;
            aVar.f75958e = vq.j.a(list);
            aVar.f75959f = listF1;
            aVar.f75962j = 1;
            Object objEa = ea(c0Var, listF1, aVar);
            if (objEa == objE) {
                return objE;
            }
            c0Var2 = c0Var;
            list2 = listF1;
            obj = objEa;
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list2 = (List) aVar.f75959f;
            c0Var2 = (k10.c0) aVar.f75957d;
            oq.u.b(obj);
        }
        final List list3 = (List) obj;
        this.setupData.getDataContract().P2(this.setupData.getAttachmentType(), new jp2.c.AttachmentsData(list2));
        this.accessibilityTalkBackManager.a(c70.a.f23835a.a().q0().getText());
        return c0Var2.b(new er.l() { // from class: gp2.i0
            @Override // er.l
            public final Object b(Object obj2) {
                return k0.H9(list2, list3, (l.b.Presentation) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gp2.l.b.Presentation H9(List list, List list2, gp2.l.b.Presentation presentation) {
        return gp2.l.b.Presentation.b(presentation, gp2.l.b.StateData.b(presentation.getStateData(), list, list2, null, null, false, 12, null), null, 2, null);
    }

    private final hb4.c J9(dx.b domainError) {
        return this.errorVMSFactory.a(this.genericErrorMapper.b(new ib4.c.Params(domainError, false, new er.l() { // from class: gp2.x
            @Override // er.l
            public final Object b(Object obj) {
                return k0.K9(this.f76109a, (ib4.c.b) obj);
            }
        }, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K9(k0 k0Var, ib4.c.b bVar) {
        if ((bVar instanceof ib4.c.b.a.Primary) || (bVar instanceof ib4.c.b.a.Secondary)) {
            k0Var.d9(gp2.c.f75919a);
        } else if (!(bVar instanceof ib4.c.b.AbstractC2161b.C2162b)) {
            if (!(bVar instanceof ib4.c.b.a.Close) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                throw new oq.p();
            }
            k0Var.d9(gp2.c.f75919a);
        }
        return oq.i0.f148189a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final k10.l<gp2.l> L9(k10.c0<?> c0Var, dx.b bVar) {
        k10.l lVarC;
        k10.l lVarD;
        final dx.b.Business business = bVar instanceof dx.b.Business ? (dx.b.Business) bVar : null;
        if (business != null) {
            dx.b.Business.a type = business.getType();
            if (type == zb4.b.NO_FILE_PICKED || type == zb4.b.NO_PHOTO_PICKED) {
                lVarC = c0Var.c();
            } else {
                lVarD = c0Var.d(new er.l() { // from class: gp2.w
                    @Override // er.l
                    public final Object b(Object obj) {
                        return k0.M9(this.f76107a, business, obj);
                    }
                });
            }
            if (lVarC != null) {
                lVarC = lVarD;
                return lVarC;
            }
        }
        lVarC = lVarD;
        return c0Var.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gp2.l M9(k0 k0Var, dx.b.Business business, Object obj) {
        return obj instanceof gp2.l.b.Presentation ? new gp2.l.b.Error(((gp2.l.b.Presentation) obj).getStateData(), k0Var.J9(business)) : new gp2.l.a.Error(k0Var.J9(business));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean N9(k10.c0<gp2.l.b.Presentation> c0Var) {
        return this.setupData.getAttachmentType() == jp2.b.DIPLOMATIC || this.setupData.getAttachmentType() == jp2.b.MSWIA || !c0Var.a().getStateData().c().isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gp2.m.a O9(gp2.l state) {
        return this.mapper.b(new ip2.d.Params(state, this.setupData.getAttachmentType(), new er.l() { // from class: gp2.f0
            @Override // er.l
            public final Object b(Object obj) {
                return k0.P9(this.f75928a, (hp2.a.SelectOption) obj);
            }
        }, new er.l() { // from class: gp2.g0
            @Override // er.l
            public final Object b(Object obj) {
                return k0.Q9(this.f75930a, (hp2.e) obj);
            }
        }, new er.l() { // from class: gp2.h0
            @Override // er.l
            public final Object b(Object obj) {
                return k0.R9(this.f75932a, (g30.v) obj);
            }
        }, b9(gp2.f.f75927a), b9(gp2.a.f75915a), b9(gp2.b.f75917a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P9(k0 k0Var, hp2.a.SelectOption selectOption) {
        k0Var.d9(new OpenBottomSheet(selectOption));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q9(k0 k0Var, hp2.e eVar) {
        k0Var.d9(new OnBottomSheetActionSelected(eVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R9(k0 k0Var, g30.v vVar) {
        k0Var.d9(new OnBottomSheetStateChanged(vVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ef, code lost:
    
        if (r15 == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object S9(k10.c0<gp2.l.b.Presentation> r14, tq.e<? super k10.l<? extends gp2.l>> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gp2.k0.S9(k10.c0, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f8, code lost:
    
        if (r1 == r3) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object T9(k10.c0<gp2.l.b.Presentation> r17, tq.e<? super k10.l<? extends gp2.l>> r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gp2.k0.T9(k10.c0, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object U9(k10.c0<gp2.l.b.Presentation> c0Var, wx.i iVar, tq.e<? super k10.l<? extends gp2.l.b>> eVar) throws Throwable {
        d dVar;
        k10.c0<gp2.l.b.Presentation> c0Var2;
        final List<? extends wx.i> list;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i15 = dVar.f75984j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f75984j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object obj = dVar.f75982g;
        Object objE = uq.b.e();
        int i16 = dVar.f75984j;
        if (i16 == 0) {
            oq.u.b(obj);
            List listI1 = pq.v.i1(c0Var.a().getStateData().c());
            listI1.remove(iVar);
            List<? extends wx.i> listF1 = pq.v.f1(listI1);
            dVar.f75979d = c0Var;
            dVar.f75980e = vq.j.a(iVar);
            dVar.f75981f = listF1;
            dVar.f75984j = 1;
            Object objEa = ea(c0Var, listF1, dVar);
            if (objEa == objE) {
                return objE;
            }
            c0Var2 = c0Var;
            list = listF1;
            obj = objEa;
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) dVar.f75981f;
            c0Var2 = (k10.c0) dVar.f75979d;
            oq.u.b(obj);
        }
        final List list2 = (List) obj;
        this.setupData.getDataContract().P2(this.setupData.getAttachmentType(), new jp2.c.AttachmentsData(list));
        return c0Var2.b(new er.l() { // from class: gp2.j0
            @Override // er.l
            public final Object b(Object obj2) {
                return k0.V9(list, list2, (l.b.Presentation) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gp2.l.b.Presentation V9(List list, List list2, gp2.l.b.Presentation presentation) {
        return gp2.l.b.Presentation.b(presentation, gp2.l.b.StateData.b(presentation.getStateData(), list, list2, null, null, false, 28, null), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X9(final k0 k0Var, k10.v vVar) {
        vVar.c(fr.q0.c(gp2.l.class), new er.l() { // from class: gp2.v
            @Override // er.l
            public final Object b(Object obj) {
                return k0.Y9(this.f76106a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(gp2.l.a.class), new er.l() { // from class: gp2.b0
            @Override // er.l
            public final Object b(Object obj) {
                return k0.Z9(this.f75918a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(gp2.l.b.Presentation.class), new er.l() { // from class: gp2.c0
            @Override // er.l
            public final Object b(Object obj) {
                return k0.aa(this.f75920a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(gp2.l.a.Error.class), new er.l() { // from class: gp2.d0
            @Override // er.l
            public final Object b(Object obj) {
                return k0.ba((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(gp2.l.b.Error.class), new er.l() { // from class: gp2.e0
            @Override // er.l
            public final Object b(Object obj) {
                return k0.ca(this.f75926a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Y9(k0 k0Var, k10.z zVar) {
        f fVar = k0Var.new f(null);
        zVar.x(fr.q0.c(gp2.b.class), k10.o.CANCEL_PREVIOUS, fVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Z9(k0 k0Var, k10.z zVar) {
        zVar.A(k0Var.new g(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 aa(k0 k0Var, k10.z zVar) {
        h hVar = k0Var.new h(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(gp2.a.class), oVar, hVar);
        zVar.v(fr.q0.c(OnBottomSheetActionSelected.class), oVar, k0Var.new i(null));
        zVar.v(fr.q0.c(DeleteFile.class), oVar, k0Var.new j(null));
        zVar.x(fr.q0.c(ShowAttachmentPreview.class), oVar, k0Var.new k(null));
        zVar.v(fr.q0.c(OpenBottomSheet.class), oVar, new l(null));
        zVar.v(fr.q0.c(OnBottomSheetStateChanged.class), oVar, new m(null));
        zVar.v(fr.q0.c(gp2.f.class), oVar, k0Var.new n(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ba(k10.z zVar) {
        o oVar = new o(null);
        zVar.v(fr.q0.c(gp2.c.class), k10.o.CANCEL_PREVIOUS, oVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ca(k0 k0Var, k10.z zVar) {
        p pVar = k0Var.new p(null);
        zVar.v(fr.q0.c(gp2.c.class), k10.o.CANCEL_PREVIOUS, pVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x011a, code lost:
    
        if (r1 == r3) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object da(k10.c0<gp2.l.b.Presentation> r18, tq.e<? super k10.l<? extends gp2.l>> r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gp2.k0.da(k10.c0, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x008e  */
    /* JADX WARN: Code duplicated, block: B:19:0x00ef A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:23:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:24:0x010e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0117  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00f0 -> B:21:0x00f4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object ea(k10.c0<?> r22, java.util.List<? extends wx.i> r23, tq.e<? super java.util.List<? extends n40.i>> r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gp2.k0.ea(k10.c0, java.util.List, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 fa(k0 k0Var, wx.i iVar, wx.i.Image image) {
        k0Var.d9(new ShowAttachmentPreview(k0Var.labelProvider.c(bp2.a.f21106z), iVar.getFileContent()));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ga(k0 k0Var, wx.i iVar) {
        k0Var.d9(new DeleteFile(iVar));
        return oq.i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: I9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(gp2.e eVar, tq.e<? super oq.i0> eVar2) {
        return super.F(eVar, eVar2);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: W9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(PassportAgreementAttachmentsNavigationParams passportAgreementAttachmentsNavigationParams) {
        super.P5(passportAgreementAttachmentsNavigationParams);
    }

    @Override // zx.b
    public xw.b<gp2.e> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<gp2.l, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<gp2.m.a> getState() {
        return this.state;
    }
}
