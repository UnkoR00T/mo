package r61;

import fr.q0;
import java.util.List;
import mu.p0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005Bc\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b \u0010!J8\u0010)\u001a\b\u0012\u0004\u0012\u00020(0%2\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\"2\u0006\u0010$\u001a\u00020#2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%H\u0082@¢\u0006\u0004\b)\u0010*J0\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-*\b\u0012\u0004\u0012\u00020+0\"2\u0006\u0010$\u001a\u00020#2\u0006\u0010,\u001a\u00020&H\u0082@¢\u0006\u0004\b/\u00100J(\u00101\u001a\b\u0012\u0004\u0012\u00020\u00020-*\b\u0012\u0004\u0012\u00020+0\"2\u0006\u0010$\u001a\u00020#H\u0082@¢\u0006\u0004\b1\u00102J'\u00103\u001a\b\u0012\u0004\u0012\u00020&0%*\b\u0012\u0004\u0012\u00020+0\"2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b3\u00104J(\u00105\u001a\b\u0012\u0004\u0012\u00020\u00020-*\b\u0012\u0004\u0012\u00020+0\"2\u0006\u0010$\u001a\u00020#H\u0082@¢\u0006\u0004\b5\u00102J(\u00106\u001a\b\u0012\u0004\u0012\u00020\u00020-*\b\u0012\u0004\u0012\u00020+0\"2\u0006\u0010$\u001a\u00020#H\u0082@¢\u0006\u0004\b6\u00102J%\u00109\u001a\b\u0012\u0004\u0012\u00020\u00020-*\u0006\u0012\u0002\b\u00030\"2\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\b9\u0010:J6\u0010;\u001a\b\u0012\u0004\u0012\u00020+0-*\b\u0012\u0004\u0012\u00020+0\"2\u0006\u0010$\u001a\u00020#2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020&0%H\u0082@¢\u0006\u0004\b;\u0010*J\u0017\u0010=\u001a\u00020<2\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\b=\u0010>R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010V\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR \u0010]\u001a\b\u0012\u0004\u0012\u00020X0W8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R&\u0010c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030^8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010h¨\u0006i"}, d2 = {"Lr61/c0;", "Ll00/g;", "Lr61/b;", "Lr61/a;", "Lr61/c;", "", "Lyy/a;", "stateMachineFactory", "Lt61/d;", "mapper", "Lib4/c;", "genericErrorMapper", "Lbc4/k;", "pickPhotoFromCameraWithSizeValidationUseCase", "Lbc4/j;", "pickMultiplePhotosFromGalleryUseCase", "Lbc4/i;", "pickFileWithFilesValidationUC", "Lyw/b;", "accessibilityTalkBackManager", "Lhb4/d;", "errorVMSFactory", "La00/b;", "pickedFileToAndroidMapper", "Lmx/c;", "labelProvider", "Lu61/b;", "contract", "<init>", "(Lyy/a;Lt61/d;Lib4/c;Lbc4/k;Lbc4/j;Lbc4/i;Lyw/b;Lhb4/d;La00/b;Lmx/c;Lu61/b;)V", "state", "Lr61/c$a;", "N9", "(Lr61/b;)Lr61/c$a;", "Lk10/c0;", "Lu61/c;", "attachmentType", "", "Lwx/i;", "pickedFiles", "Ln40/i;", "ea", "(Lk10/c0;Lu61/c;Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "Lr61/b$b$b;", "attachment", "Lk10/l;", "Lr61/b$b;", "U9", "(Lk10/c0;Lu61/c;Lwx/i;Ltq/e;)Ljava/lang/Object;", "da", "(Lk10/c0;Lu61/c;Ltq/e;)Ljava/lang/Object;", "I9", "(Lk10/c0;Lu61/c;)Ljava/util/List;", "T9", "S9", "Ldx/b;", "domainError", "L9", "(Lk10/c0;Ldx/b;)Lk10/l;", "F9", "Lhb4/c;", "J9", "(Ldx/b;)Lhb4/c;", "b", "Lt61/d;", "c", "Lib4/c;", "d", "Lbc4/k;", "e", "Lbc4/j;", "f", "Lbc4/i;", "g", "Lyw/b;", "h", "Lhb4/d;", "j", "La00/b;", "k", "Lmx/c;", "l", "Lu61/b;", "Lr61/b$a$b;", "m", "Lr61/b$a$b;", "initialState", "Lxw/b;", "Lr61/a$e;", "n", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "p", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "q", "Lmu/p0;", "getState", "()Lmu/p0;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c0 extends l00.g<r61.b, r61.a> implements r61.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final t61.d mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericErrorMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final bc4.k pickPhotoFromCameraWithSizeValidationUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final bc4.j pickMultiplePhotosFromGalleryUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final bc4.i pickFileWithFilesValidationUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final yw.b accessibilityTalkBackManager;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final a00.b pickedFileToAndroidMapper;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final u61.b contract;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final r61.b.a.C4382b initialState;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final xw.b<r61.a.e> navAction;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final k10.t<r61.b, r61.a> stateMachine;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final p0<r61.c.a> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f172038a;

        static {
            int[] iArr = new int[u61.c.values().length];
            try {
                iArr[u61.c.GLASSES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u61.c.FACE_COVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f172038a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f172039d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f172040e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f172041f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f172042g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f172043h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f172045k;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f172043h = obj;
            this.f172045k |= PKIFailureInfo.systemUnavail;
            return c0.this.F9(null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f172046d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f172047e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f172048f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f172049g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f172050h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f172051j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f172052k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f172054m;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f172052k = obj;
            this.f172054m |= PKIFailureInfo.systemUnavail;
            return c0.this.S9(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f172055d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f172056e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f172057f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f172058g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f172059h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f172060j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f172061k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f172063m;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f172061k = obj;
            this.f172063m |= PKIFailureInfo.systemUnavail;
            return c0.this.T9(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f172064d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f172065e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f172066f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f172067g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f172068h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f172070k;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f172068h = obj;
            this.f172070k |= PKIFailureInfo.systemUnavail;
            return c0.this.U9(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class f implements mu.g<r61.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f172071a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c0 f172072b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f172073a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ c0 f172074b;

            /* JADX INFO: renamed from: r61.c0$f$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4388a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f172075d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f172076e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f172077f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f172079h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f172080j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f172081k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f172082l;

                public C4388a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f172075d = obj;
                    this.f172076e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, c0 c0Var) {
                this.f172073a = hVar;
                this.f172074b = c0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4388a c4388a;
                if (eVar instanceof C4388a) {
                    c4388a = (C4388a) eVar;
                    int i15 = c4388a.f172076e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4388a.f172076e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4388a = new C4388a(eVar);
                    }
                } else {
                    c4388a = new C4388a(eVar);
                }
                Object obj2 = c4388a.f172075d;
                Object objE = uq.b.e();
                int i16 = c4388a.f172076e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f172073a;
                    r61.c.a aVarN9 = this.f172074b.N9((r61.b) obj);
                    c4388a.f172077f = vq.j.a(obj);
                    c4388a.f172079h = vq.j.a(c4388a);
                    c4388a.f172080j = vq.j.a(obj);
                    c4388a.f172081k = vq.j.a(hVar);
                    c4388a.f172082l = 0;
                    c4388a.f172076e = 1;
                    if (hVar.F(aVarN9, c4388a) == objE) {
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

        public f(mu.g gVar, c0 c0Var) {
            this.f172071a = gVar;
            this.f172072b = c0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super r61.c.a> hVar, tq.e eVar) {
            Object objA = this.f172071a.a(new a(hVar, this.f172072b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr61/a$e;", "action", "Lr61/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lr61/a$e;Lr61/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<r61.a.e, r61.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f172083e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f172084f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            r61.a.e eVar = (r61.a.e) this.f172084f;
            Object objE = uq.b.e();
            int i15 = this.f172083e;
            if (i15 == 0) {
                oq.u.b(obj);
                c0 c0Var = c0.this;
                this.f172084f = vq.j.a(eVar);
                this.f172083e = 1;
                if (c0Var.F(eVar, this) == objE) {
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
        public final Object w(r61.a.e eVar, r61.b bVar, tq.e<? super oq.i0> eVar2) {
            g gVar = c0.this.new g(eVar2);
            gVar.f172084f = eVar;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lr61/b$a;", "state", "Lk10/l;", "Lr61/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.p<k10.c0<r61.b.a>, tq.e<? super k10.l<? extends r61.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f172086e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f172087f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f172088g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f172089h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f172090j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f172091k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f172092l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f172093m;

        h(tq.e<? super h> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final r61.b.AbstractC4383b.Presentation O(r61.b.AbstractC4383b.StateData.FilesData filesData, r61.b.AbstractC4383b.StateData.FilesData filesData2, r61.b.a aVar) {
            return new r61.b.AbstractC4383b.Presentation(new r61.b.AbstractC4383b.StateData(filesData, filesData2, null, null, 12, null));
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0097  */
        /* JADX WARN: Code duplicated, block: B:24:0x009c  */
        /* JADX WARN: Code duplicated, block: B:26:0x009f  */
        /* JADX WARN: Code duplicated, block: B:29:0x00c4  */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            List<wx.i> listA;
            final r61.b.AbstractC4383b.StateData.FilesData filesData;
            List<wx.i> list;
            List<wx.i> list2;
            u61.c cVar;
            u61.b.AttachmentsData attachmentsDataL2;
            List<wx.i> listA2;
            List<wx.i> list3;
            k10.c0 c0Var = (k10.c0) this.f172093m;
            Object objE = uq.b.e();
            int i15 = this.f172092l;
            final r61.b.AbstractC4383b.StateData.FilesData filesData2 = null;
            if (i15 != 0) {
                if (i15 == 1) {
                    list2 = (List) this.f172088g;
                    list = (List) this.f172086e;
                    oq.u.b(obj);
                } else {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list3 = (List) this.f172090j;
                    filesData = (r61.b.AbstractC4383b.StateData.FilesData) this.f172087f;
                    oq.u.b(obj);
                }
                filesData2 = new r61.b.AbstractC4383b.StateData.FilesData(list3, (List) obj, false);
                return c0Var.d(new er.l() { // from class: r61.d0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return c0.h.O(filesData, filesData2, (b.a) obj2);
                    }
                });
            }
            oq.u.b(obj);
            u61.b bVar = c0.this.contract;
            u61.c cVar2 = u61.c.GLASSES;
            u61.b.AttachmentsData attachmentsDataL3 = bVar.L2(cVar2);
            listA = attachmentsDataL3 != null ? attachmentsDataL3.a() : null;
            if (listA == null) {
                filesData = null;
                u61.b bVar2 = c0.this.contract;
                cVar = u61.c.FACE_COVER;
                attachmentsDataL2 = bVar2.L2(cVar);
                if (attachmentsDataL2 != null) {
                    listA2 = attachmentsDataL2.a();
                } else {
                    listA2 = null;
                }
                if (listA2 != null) {
                    c0 c0Var2 = c0.this;
                    this.f172093m = c0Var;
                    this.f172086e = vq.j.a(listA);
                    this.f172087f = filesData;
                    this.f172088g = vq.j.a(listA2);
                    this.f172089h = vq.j.a(listA2);
                    this.f172090j = listA2;
                    this.f172091k = 0;
                    this.f172092l = 2;
                    obj = c0Var2.ea(c0Var, cVar, listA2, this);
                    if (obj != objE) {
                        list3 = listA2;
                        filesData2 = new r61.b.AbstractC4383b.StateData.FilesData(list3, (List) obj, false);
                    }
                }
                return c0Var.d(new er.l() { // from class: r61.d0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return c0.h.O(filesData, filesData2, (b.a) obj2);
                    }
                });
            }
            c0 c0Var3 = c0.this;
            this.f172093m = c0Var;
            this.f172086e = vq.j.a(listA);
            this.f172087f = vq.j.a(listA);
            this.f172088g = listA;
            this.f172091k = 0;
            this.f172092l = 1;
            Object objEa = c0Var3.ea(c0Var, cVar2, listA, this);
            if (objEa != objE) {
                list = listA;
                obj = objEa;
                list2 = list;
            }
            return objE;
            r61.b.AbstractC4383b.StateData.FilesData filesData3 = new r61.b.AbstractC4383b.StateData.FilesData(list2, (List) obj, false);
            listA = list;
            filesData = filesData3;
            u61.b bVar3 = c0.this.contract;
            cVar = u61.c.FACE_COVER;
            attachmentsDataL2 = bVar3.L2(cVar);
            if (attachmentsDataL2 != null) {
                listA2 = attachmentsDataL2.a();
            } else {
                listA2 = null;
            }
            if (listA2 != null) {
                c0 c0Var4 = c0.this;
                this.f172093m = c0Var;
                this.f172086e = vq.j.a(listA);
                this.f172087f = filesData;
                this.f172088g = vq.j.a(listA2);
                this.f172089h = vq.j.a(listA2);
                this.f172090j = listA2;
                this.f172091k = 0;
                this.f172092l = 2;
                obj = c0Var4.ea(c0Var, cVar, listA2, this);
                if (obj != objE) {
                    list3 = listA2;
                    filesData2 = new r61.b.AbstractC4383b.StateData.FilesData(list3, (List) obj, false);
                }
                return objE;
            }
            return c0Var.d(new er.l() { // from class: r61.d0
                @Override // er.l
                public final Object b(Object obj2) {
                    return c0.h.O(filesData, filesData2, (b.a) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<r61.b.a> c0Var, tq.e<? super k10.l<? extends r61.b>> eVar) {
            return ((h) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            h hVar = c0.this.new h(eVar);
            hVar.f172093m = obj;
            return hVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr61/a$a;", "<unused var>", "Lr61/b$b$b;", "state", "Loq/i0;", "<anonymous>", "(Lr61/a$a;Lr61/b$b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<r61.a.C4378a, r61.b.AbstractC4383b.Presentation, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f172095e;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f172095e;
            if (i15 == 0) {
                oq.u.b(obj);
                c0.this.d9(r61.a.j.f171990a);
                c0 c0Var = c0.this;
                r61.a.e.C4379a c4379a = r61.a.e.C4379a.f171980a;
                this.f172095e = 1;
                if (c0Var.F(c4379a, this) == objE) {
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
        public final Object w(r61.a.C4378a c4378a, r61.b.AbstractC4383b.Presentation presentation, tq.e<? super oq.i0> eVar) {
            return c0.this.new i(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr61/a$j;", "<unused var>", "Lr61/b$b$b;", "state", "Loq/i0;", "<anonymous>", "(Lr61/a$j;Lr61/b$b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<r61.a.j, r61.b.AbstractC4383b.Presentation, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f172097e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f172098f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            List<wx.i> listN;
            List<wx.i> listN2;
            r61.b.AbstractC4383b.Presentation presentation = (r61.b.AbstractC4383b.Presentation) this.f172098f;
            uq.b.e();
            if (this.f172097e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            u61.b bVar = c0.this.contract;
            u61.c cVar = u61.c.GLASSES;
            r61.b.AbstractC4383b.StateData.FilesData glassesData = presentation.getStateData().getGlassesData();
            if (glassesData == null || (listN = glassesData.c()) == null) {
                listN = pq.v.n();
            }
            bVar.v1(cVar, new u61.b.AttachmentsData(listN));
            u61.b bVar2 = c0.this.contract;
            u61.c cVar2 = u61.c.FACE_COVER;
            r61.b.AbstractC4383b.StateData.FilesData faceCoverData = presentation.getStateData().getFaceCoverData();
            if (faceCoverData == null || (listN2 = faceCoverData.c()) == null) {
                listN2 = pq.v.n();
            }
            bVar2.v1(cVar2, new u61.b.AttachmentsData(listN2));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(r61.a.j jVar, r61.b.AbstractC4383b.Presentation presentation, tq.e<? super oq.i0> eVar) {
            j jVar2 = c0.this.new j(eVar);
            jVar2.f172098f = presentation;
            return jVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lr61/a$g;", "action", "Lk10/c0;", "Lr61/b$b$b;", "state", "Lk10/l;", "Lr61/b;", "<anonymous>", "(Lr61/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<r61.a.OnBottomSheetActionSelected, k10.c0<r61.b.AbstractC4383b.Presentation>, tq.e<? super k10.l<? extends r61.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f172100e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f172101f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f172102g;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f172104a;

            static {
                int[] iArr = new int[s61.e.values().length];
                try {
                    iArr[s61.e.TAKE_PHOTO.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[s61.e.PICK_PHOTO.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[s61.e.PICK_FILE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f172104a = iArr;
            }
        }

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
        
            if (r8 == r2) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x007e, code lost:
        
            if (r8 == r2) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x009c, code lost:
        
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
                java.lang.Object r0 = r7.f172101f
                r61.a$g r0 = (r61.a.OnBottomSheetActionSelected) r0
                java.lang.Object r1 = r7.f172102g
                k10.c0 r1 = (k10.c0) r1
                java.lang.Object r2 = uq.b.e()
                int r3 = r7.f172100e
                r4 = 3
                r5 = 2
                r6 = 1
                if (r3 == 0) goto L2d
                if (r3 == r6) goto L29
                if (r3 == r5) goto L25
                if (r3 != r4) goto L1d
                oq.u.b(r8)
                goto L5d
            L1d:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L25:
                oq.u.b(r8)
                goto L81
            L29:
                oq.u.b(r8)
                goto L9f
            L2d:
                oq.u.b(r8)
                s61.e r8 = r0.getSelectedOption()
                int[] r3 = r61.c0.k.a.f172104a
                int r8 = r8.ordinal()
                r8 = r3[r8]
                if (r8 == r6) goto L84
                if (r8 == r5) goto L66
                if (r8 != r4) goto L60
                r61.c0 r8 = r61.c0.this
                u61.c r3 = r0.getAttachmentType()
                java.lang.Object r0 = vq.j.a(r0)
                r7.f172101f = r0
                java.lang.Object r0 = vq.j.a(r1)
                r7.f172102g = r0
                r7.f172100e = r4
                java.lang.Object r8 = r61.c0.A9(r8, r1, r3, r7)
                if (r8 != r2) goto L5d
                goto L9e
            L5d:
                k10.l r8 = (k10.l) r8
                return r8
            L60:
                oq.p r8 = new oq.p
                r8.<init>()
                throw r8
            L66:
                r61.c0 r8 = r61.c0.this
                u61.c r3 = r0.getAttachmentType()
                java.lang.Object r0 = vq.j.a(r0)
                r7.f172101f = r0
                java.lang.Object r0 = vq.j.a(r1)
                r7.f172102g = r0
                r7.f172100e = r5
                java.lang.Object r8 = r61.c0.B9(r8, r1, r3, r7)
                if (r8 != r2) goto L81
                goto L9e
            L81:
                k10.l r8 = (k10.l) r8
                return r8
            L84:
                r61.c0 r8 = r61.c0.this
                u61.c r3 = r0.getAttachmentType()
                java.lang.Object r0 = vq.j.a(r0)
                r7.f172101f = r0
                java.lang.Object r0 = vq.j.a(r1)
                r7.f172102g = r0
                r7.f172100e = r6
                java.lang.Object r8 = r61.c0.D9(r8, r1, r3, r7)
                if (r8 != r2) goto L9f
            L9e:
                return r2
            L9f:
                k10.l r8 = (k10.l) r8
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: r61.c0.k.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(r61.a.OnBottomSheetActionSelected onBottomSheetActionSelected, k10.c0<r61.b.AbstractC4383b.Presentation> c0Var, tq.e<? super k10.l<? extends r61.b>> eVar) {
            k kVar = c0.this.new k(eVar);
            kVar.f172101f = onBottomSheetActionSelected;
            kVar.f172102g = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lr61/a$d;", "action", "Lk10/c0;", "Lr61/b$b$b;", "state", "Lk10/l;", "Lr61/b;", "<anonymous>", "(Lr61/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<r61.a.DeleteFile, k10.c0<r61.b.AbstractC4383b.Presentation>, tq.e<? super k10.l<? extends r61.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f172105e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f172106f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f172107g;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            r61.a.DeleteFile deleteFile = (r61.a.DeleteFile) this.f172106f;
            k10.c0 c0Var = (k10.c0) this.f172107g;
            Object objE = uq.b.e();
            int i15 = this.f172105e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            c0 c0Var2 = c0.this;
            u61.c attachmentType = deleteFile.getAttachmentType();
            wx.i pickedFile = deleteFile.getPickedFile();
            this.f172106f = vq.j.a(deleteFile);
            this.f172107g = vq.j.a(c0Var);
            this.f172105e = 1;
            Object objU9 = c0Var2.U9(c0Var, attachmentType, pickedFile, this);
            return objU9 == objE ? objE : objU9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(r61.a.DeleteFile deleteFile, k10.c0<r61.b.AbstractC4383b.Presentation> c0Var, tq.e<? super k10.l<? extends r61.b>> eVar) {
            l lVar = c0.this.new l(eVar);
            lVar.f172106f = deleteFile;
            lVar.f172107g = c0Var;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr61/a$k;", "action", "Lr61/b$b$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lr61/a$k;Lr61/b$b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<r61.a.ShowAttachmentPreview, r61.b.AbstractC4383b.Presentation, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f172109e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f172110f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            r61.a.ShowAttachmentPreview showAttachmentPreview = (r61.a.ShowAttachmentPreview) this.f172110f;
            Object objE = uq.b.e();
            int i15 = this.f172109e;
            if (i15 == 0) {
                oq.u.b(obj);
                c0 c0Var = c0.this;
                r61.a.e.ShowAttachmentPreview showAttachmentPreview2 = new r61.a.e.ShowAttachmentPreview(new dx3.a.Content(showAttachmentPreview.getTitle(), showAttachmentPreview.getFileContent()));
                this.f172110f = vq.j.a(showAttachmentPreview);
                this.f172109e = 1;
                if (c0Var.F(showAttachmentPreview2, this) == objE) {
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
        public final Object w(r61.a.ShowAttachmentPreview showAttachmentPreview, r61.b.AbstractC4383b.Presentation presentation, tq.e<? super oq.i0> eVar) {
            m mVar = c0.this.new m(eVar);
            mVar.f172110f = showAttachmentPreview;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lr61/a$i;", "action", "Lk10/c0;", "Lr61/b$b$b;", "state", "Lk10/l;", "Lr61/b;", "<anonymous>", "(Lr61/a$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<r61.a.OpenBottomSheet, k10.c0<r61.b.AbstractC4383b.Presentation>, tq.e<? super k10.l<? extends r61.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f172112e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f172113f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f172114g;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final r61.b.AbstractC4383b.Presentation O(r61.a.OpenBottomSheet openBottomSheet, r61.b.AbstractC4383b.Presentation presentation) {
            return presentation.a(r61.b.AbstractC4383b.StateData.b(presentation.getStateData(), null, null, g30.v.EXPANDED, openBottomSheet.getData(), 3, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final r61.a.OpenBottomSheet openBottomSheet = (r61.a.OpenBottomSheet) this.f172113f;
            k10.c0 c0Var = (k10.c0) this.f172114g;
            uq.b.e();
            if (this.f172112e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: r61.e0
                @Override // er.l
                public final Object b(Object obj2) {
                    return c0.n.O(openBottomSheet, (b.AbstractC4383b.Presentation) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(r61.a.OpenBottomSheet openBottomSheet, k10.c0<r61.b.AbstractC4383b.Presentation> c0Var, tq.e<? super k10.l<? extends r61.b>> eVar) {
            n nVar = new n(eVar);
            nVar.f172113f = openBottomSheet;
            nVar.f172114g = c0Var;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lr61/a$h;", "action", "Lk10/c0;", "Lr61/b$b$b;", "state", "Lk10/l;", "Lr61/b;", "<anonymous>", "(Lr61/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<r61.a.OnBottomSheetStateChanged, k10.c0<r61.b.AbstractC4383b.Presentation>, tq.e<? super k10.l<? extends r61.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f172115e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f172116f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f172117g;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final r61.b.AbstractC4383b.Presentation O(r61.a.OnBottomSheetStateChanged onBottomSheetStateChanged, k10.c0 c0Var, r61.b.AbstractC4383b.Presentation presentation) {
            r61.b.AbstractC4383b.StateData stateData = presentation.getStateData();
            g30.v state = onBottomSheetStateChanged.getState();
            g30.v state2 = onBottomSheetStateChanged.getState();
            if (state2 == g30.v.HIDDEN) {
                state2 = null;
            }
            return presentation.a(r61.b.AbstractC4383b.StateData.b(stateData, null, null, state, state2 != null ? ((r61.b.AbstractC4383b.Presentation) c0Var.a()).getStateData().getBottomSheetData() : null, 3, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final r61.a.OnBottomSheetStateChanged onBottomSheetStateChanged = (r61.a.OnBottomSheetStateChanged) this.f172116f;
            final k10.c0 c0Var = (k10.c0) this.f172117g;
            uq.b.e();
            if (this.f172115e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: r61.f0
                @Override // er.l
                public final Object b(Object obj2) {
                    return c0.o.O(onBottomSheetStateChanged, c0Var, (b.AbstractC4383b.Presentation) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(r61.a.OnBottomSheetStateChanged onBottomSheetStateChanged, k10.c0<r61.b.AbstractC4383b.Presentation> c0Var, tq.e<? super k10.l<? extends r61.b>> eVar) {
            o oVar = new o(eVar);
            oVar.f172116f = onBottomSheetStateChanged;
            oVar.f172117g = c0Var;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lr61/a$f;", "<unused var>", "Lk10/c0;", "Lr61/b$b$b;", "state", "Lk10/l;", "Lr61/b;", "<anonymous>", "(Lr61/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<r61.a.f, k10.c0<r61.b.AbstractC4383b.Presentation>, tq.e<? super k10.l<? extends r61.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f172118e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f172119f;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final r61.b.AbstractC4383b.Presentation O(r61.b.AbstractC4383b.StateData stateData, r61.b.AbstractC4383b.Presentation presentation) {
            r61.b.AbstractC4383b.StateData.FilesData faceCoverData = stateData.getFaceCoverData();
            r61.b.AbstractC4383b.StateData.FilesData filesDataB = faceCoverData != null ? r61.b.AbstractC4383b.StateData.FilesData.b(faceCoverData, null, null, stateData.getFaceCoverData().c().isEmpty(), 3, null) : null;
            r61.b.AbstractC4383b.StateData.FilesData glassesData = stateData.getGlassesData();
            return presentation.a(r61.b.AbstractC4383b.StateData.b(stateData, glassesData != null ? r61.b.AbstractC4383b.StateData.FilesData.b(glassesData, null, null, stateData.getGlassesData().c().isEmpty(), 3, null) : null, filesDataB, null, null, 12, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            List<wx.i> listC;
            List<wx.i> listC2;
            k10.c0 c0Var = (k10.c0) this.f172119f;
            uq.b.e();
            if (this.f172118e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final r61.b.AbstractC4383b.StateData stateData = ((r61.b.AbstractC4383b.Presentation) c0Var.a()).getStateData();
            c0 c0Var2 = c0.this;
            r61.b.AbstractC4383b.StateData.FilesData glassesData = stateData.getGlassesData();
            boolean zIsEmpty = true;
            if ((glassesData == null || (listC2 = glassesData.c()) == null) ? true : !listC2.isEmpty()) {
                r61.b.AbstractC4383b.StateData.FilesData faceCoverData = stateData.getFaceCoverData();
                if (faceCoverData != null && (listC = faceCoverData.c()) != null) {
                    zIsEmpty = true ^ listC.isEmpty();
                }
                if (zIsEmpty) {
                    c0Var2.d9(r61.a.j.f171990a);
                    if (c0Var2.contract.E2()) {
                        c0Var2.d9(r61.a.e.C4380e.f171984a);
                    } else {
                        c0Var2.d9(r61.a.e.d.f171983a);
                    }
                    return c0Var.c();
                }
            }
            return c0Var.d(new er.l() { // from class: r61.g0
                @Override // er.l
                public final Object b(Object obj2) {
                    return c0.p.O(stateData, (b.AbstractC4383b.Presentation) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(r61.a.f fVar, k10.c0<r61.b.AbstractC4383b.Presentation> c0Var, tq.e<? super k10.l<? extends r61.b>> eVar) {
            p pVar = c0.this.new p(eVar);
            pVar.f172119f = c0Var;
            return pVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr61/a$b;", "<unused var>", "Lr61/b$b$b;", "Loq/i0;", "<anonymous>", "(Lr61/a$b;Lr61/b$b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<r61.a.b, r61.b.AbstractC4383b.Presentation, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f172121e;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f172121e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            c0.this.d9(r61.a.j.f171990a);
            c0.this.d9(r61.a.e.b.f171981a);
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(r61.a.b bVar, r61.b.AbstractC4383b.Presentation presentation, tq.e<? super oq.i0> eVar) {
            return c0.this.new q(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lr61/a$c;", "action", "Lk10/c0;", "Lr61/b$a$a;", "state", "Lk10/l;", "Lr61/b;", "<anonymous>", "(Lr61/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<r61.a.c, k10.c0<r61.b.a.Error>, tq.e<? super k10.l<? extends r61.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f172123e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f172124f;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final r61.b.a.C4382b O(r61.b.a.Error error) {
            return r61.b.a.C4382b.f171995a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f172124f;
            uq.b.e();
            if (this.f172123e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: r61.h0
                @Override // er.l
                public final Object b(Object obj2) {
                    return c0.r.O((b.a.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(r61.a.c cVar, k10.c0<r61.b.a.Error> c0Var, tq.e<? super k10.l<? extends r61.b>> eVar) {
            r rVar = new r(eVar);
            rVar.f172124f = c0Var;
            return rVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lr61/a$c;", "action", "Lk10/c0;", "Lr61/b$b$a;", "state", "Lk10/l;", "Lr61/b;", "<anonymous>", "(Lr61/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<r61.a.c, k10.c0<r61.b.AbstractC4383b.Error>, tq.e<? super k10.l<? extends r61.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f172125e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f172126f;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final r61.b.AbstractC4383b.Presentation O(k10.c0 c0Var, r61.b.AbstractC4383b.Error error) {
            return new r61.b.AbstractC4383b.Presentation(((r61.b.AbstractC4383b.Error) c0Var.a()).getStateData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f172126f;
            uq.b.e();
            if (this.f172125e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: r61.i0
                @Override // er.l
                public final Object b(Object obj2) {
                    return c0.s.O(c0Var, (b.AbstractC4383b.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(r61.a.c cVar, k10.c0<r61.b.AbstractC4383b.Error> c0Var, tq.e<? super k10.l<? extends r61.b>> eVar) {
            s sVar = new s(eVar);
            sVar.f172126f = c0Var;
            return sVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class t extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f172127d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f172128e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f172129f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f172130g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f172131h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f172132j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f172133k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f172134l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f172136n;

        t(tq.e<? super t> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f172134l = obj;
            this.f172136n |= PKIFailureInfo.systemUnavail;
            return c0.this.da(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class u extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f172137d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f172138e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f172139f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f172140g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f172141h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f172142j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f172143k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f172144l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f172145m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f172146n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f172147p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f172148q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f172149r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f172150s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f172151t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f172152v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        /* synthetic */ Object f172153w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f172155y;

        u(tq.e<? super u> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f172153w = obj;
            this.f172155y |= PKIFailureInfo.systemUnavail;
            return c0.this.ea(null, null, null, this);
        }
    }

    public c0(yy.a aVar, t61.d dVar, ib4.c cVar, bc4.k kVar, bc4.j jVar, bc4.i iVar, yw.b bVar, hb4.d dVar2, a00.b bVar2, mx.c cVar2, u61.b bVar3) {
        this.mapper = dVar;
        this.genericErrorMapper = cVar;
        this.pickPhotoFromCameraWithSizeValidationUseCase = kVar;
        this.pickMultiplePhotosFromGalleryUseCase = jVar;
        this.pickFileWithFilesValidationUC = iVar;
        this.accessibilityTalkBackManager = bVar;
        this.errorVMSFactory = dVar2;
        this.pickedFileToAndroidMapper = bVar2;
        this.labelProvider = cVar2;
        this.contract = bVar3;
        r61.b.a.C4382b c4382b = r61.b.a.C4382b.f171995a;
        this.initialState = c4382b;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(c4382b, new er.l() { // from class: r61.s
            @Override // er.l
            public final Object b(Object obj) {
                return c0.X9(this.f172193a, (k10.v) obj);
            }
        });
        this.state = a9(new f(e9().getState(), this), N9(c4382b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object F9(k10.c0<r61.b.AbstractC4383b.Presentation> c0Var, final u61.c cVar, List<? extends wx.i> list, tq.e<? super k10.l<r61.b.AbstractC4383b.Presentation>> eVar) throws Throwable {
        b bVar;
        k10.c0<r61.b.AbstractC4383b.Presentation> c0Var2;
        final List<? extends wx.i> list2;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f172045k;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f172045k = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object obj = bVar.f172043h;
        Object objE = uq.b.e();
        int i16 = bVar.f172045k;
        if (i16 == 0) {
            oq.u.b(obj);
            List listI1 = pq.v.i1(I9(c0Var, cVar));
            listI1.addAll(list);
            List<? extends wx.i> listF1 = pq.v.f1(listI1);
            bVar.f172039d = c0Var;
            bVar.f172040e = cVar;
            bVar.f172041f = vq.j.a(list);
            bVar.f172042g = listF1;
            bVar.f172045k = 1;
            Object objEa = ea(c0Var, cVar, listF1, bVar);
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
            list2 = (List) bVar.f172042g;
            cVar = (u61.c) bVar.f172040e;
            c0Var2 = (k10.c0) bVar.f172039d;
            oq.u.b(obj);
        }
        final List list3 = (List) obj;
        this.contract.v1(cVar, new u61.b.AttachmentsData(list2));
        this.accessibilityTalkBackManager.a(c70.a.f23835a.a().q0().getText());
        return c0Var2.b(new er.l() { // from class: r61.o
            @Override // er.l
            public final Object b(Object obj2) {
                return c0.G9(cVar, list2, list3, (b.AbstractC4383b.Presentation) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r61.b.AbstractC4383b.Presentation G9(u61.c cVar, List list, List list2, r61.b.AbstractC4383b.Presentation presentation) {
        int i15 = a.f172038a[cVar.ordinal()];
        if (i15 == 1) {
            return presentation.a(r61.b.AbstractC4383b.StateData.b(presentation.getStateData(), new r61.b.AbstractC4383b.StateData.FilesData(list, list2, false), null, null, null, 14, null));
        }
        if (i15 == 2) {
            return presentation.a(r61.b.AbstractC4383b.StateData.b(presentation.getStateData(), null, new r61.b.AbstractC4383b.StateData.FilesData(list, list2, false), null, null, 13, null));
        }
        throw new oq.p();
    }

    private final List<wx.i> I9(k10.c0<r61.b.AbstractC4383b.Presentation> c0Var, u61.c cVar) {
        List<wx.i> listC;
        List<wx.i> listC2;
        int i15 = a.f172038a[cVar.ordinal()];
        if (i15 == 1) {
            r61.b.AbstractC4383b.StateData.FilesData glassesData = c0Var.a().getStateData().getGlassesData();
            return (glassesData == null || (listC = glassesData.c()) == null) ? pq.v.n() : listC;
        }
        if (i15 != 2) {
            throw new oq.p();
        }
        r61.b.AbstractC4383b.StateData.FilesData faceCoverData = c0Var.a().getStateData().getFaceCoverData();
        return (faceCoverData == null || (listC2 = faceCoverData.c()) == null) ? pq.v.n() : listC2;
    }

    private final hb4.c J9(dx.b domainError) {
        return this.errorVMSFactory.a(this.genericErrorMapper.b(new ib4.c.Params(domainError, false, new er.l() { // from class: r61.r
            @Override // er.l
            public final Object b(Object obj) {
                return c0.K9(this.f172192a, (ib4.c.b) obj);
            }
        }, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K9(c0 c0Var, ib4.c.b bVar) {
        if ((bVar instanceof ib4.c.b.a.Primary) || (bVar instanceof ib4.c.b.a.Secondary)) {
            c0Var.d9(r61.a.c.f171977a);
        } else if (!(bVar instanceof ib4.c.b.AbstractC2161b.C2162b)) {
            if (!(bVar instanceof ib4.c.b.a.Close) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                throw new oq.p();
            }
            c0Var.d9(r61.a.c.f171977a);
        }
        return oq.i0.f148189a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final k10.l<r61.b> L9(k10.c0<?> c0Var, dx.b bVar) {
        k10.l lVarC;
        k10.l lVarD;
        final dx.b.Business business = bVar instanceof dx.b.Business ? (dx.b.Business) bVar : null;
        if (business != null) {
            dx.b.Business.a type = business.getType();
            if (type == zb4.b.NO_FILE_PICKED || type == zb4.b.NO_PHOTO_PICKED) {
                lVarC = c0Var.c();
            } else {
                lVarD = c0Var.d(new er.l() { // from class: r61.n
                    @Override // er.l
                    public final Object b(Object obj) {
                        return c0.M9(this.f172182a, business, obj);
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
    public static final r61.b M9(c0 c0Var, dx.b.Business business, Object obj) {
        return obj instanceof r61.b.AbstractC4383b.Presentation ? new r61.b.AbstractC4383b.Error(((r61.b.AbstractC4383b.Presentation) obj).getStateData(), c0Var.J9(business)) : new r61.b.a.Error(c0Var.J9(business));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final r61.c.a N9(r61.b state) {
        return this.mapper.b(new t61.d.Params(state, new er.l() { // from class: r61.m
            @Override // er.l
            public final Object b(Object obj) {
                return c0.O9(this.f172181a, (s61.a.SelectOption) obj);
            }
        }, new er.l() { // from class: r61.t
            @Override // er.l
            public final Object b(Object obj) {
                return c0.P9(this.f172194a, (s61.e) obj);
            }
        }, new er.l() { // from class: r61.u
            @Override // er.l
            public final Object b(Object obj) {
                return c0.Q9(this.f172195a, (s61.e) obj);
            }
        }, new er.l() { // from class: r61.v
            @Override // er.l
            public final Object b(Object obj) {
                return c0.R9(this.f172196a, (g30.v) obj);
            }
        }, b9(r61.a.f.f171985a), b9(r61.a.C4378a.f171975a), b9(r61.a.b.f171976a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O9(c0 c0Var, s61.a.SelectOption selectOption) {
        c0Var.d9(new r61.a.OpenBottomSheet(selectOption));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P9(c0 c0Var, s61.e eVar) {
        c0Var.d9(new r61.a.OnBottomSheetActionSelected(u61.c.GLASSES, eVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q9(c0 c0Var, s61.e eVar) {
        c0Var.d9(new r61.a.OnBottomSheetActionSelected(u61.c.FACE_COVER, eVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R9(c0 c0Var, g30.v vVar) {
        c0Var.d9(new r61.a.OnBottomSheetStateChanged(vVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f3, code lost:
    
        if (r12 == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object S9(k10.c0<r61.b.AbstractC4383b.Presentation> r10, u61.c r11, tq.e<? super k10.l<? extends r61.b>> r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r61.c0.S9(k10.c0, u61.c, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f4, code lost:
    
        if (r0 == r2) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object T9(k10.c0<r61.b.AbstractC4383b.Presentation> r15, u61.c r16, tq.e<? super k10.l<? extends r61.b>> r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r61.c0.T9(k10.c0, u61.c, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object U9(k10.c0<r61.b.AbstractC4383b.Presentation> c0Var, final u61.c cVar, wx.i iVar, tq.e<? super k10.l<? extends r61.b.AbstractC4383b>> eVar) throws Throwable {
        e eVar2;
        k10.c0<r61.b.AbstractC4383b.Presentation> c0Var2;
        final List<? extends wx.i> list;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f172070k;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f172070k = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object obj = eVar2.f172068h;
        Object objE = uq.b.e();
        int i16 = eVar2.f172070k;
        if (i16 == 0) {
            oq.u.b(obj);
            List listI1 = pq.v.i1(I9(c0Var, cVar));
            listI1.remove(iVar);
            List<? extends wx.i> listF1 = pq.v.f1(listI1);
            eVar2.f172064d = c0Var;
            eVar2.f172065e = cVar;
            eVar2.f172066f = vq.j.a(iVar);
            eVar2.f172067g = listF1;
            eVar2.f172070k = 1;
            Object objEa = ea(c0Var, cVar, listF1, eVar2);
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
            list = (List) eVar2.f172067g;
            cVar = (u61.c) eVar2.f172065e;
            c0Var2 = (k10.c0) eVar2.f172064d;
            oq.u.b(obj);
        }
        final List list2 = (List) obj;
        this.contract.v1(cVar, new u61.b.AttachmentsData(list));
        return c0Var2.b(new er.l() { // from class: r61.b0
            @Override // er.l
            public final Object b(Object obj2) {
                return c0.V9(cVar, list, list2, (b.AbstractC4383b.Presentation) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r61.b.AbstractC4383b.Presentation V9(u61.c cVar, List list, List list2, r61.b.AbstractC4383b.Presentation presentation) {
        int i15 = a.f172038a[cVar.ordinal()];
        if (i15 == 1) {
            r61.b.AbstractC4383b.StateData stateData = presentation.getStateData();
            r61.b.AbstractC4383b.StateData.FilesData glassesData = presentation.getStateData().getGlassesData();
            return presentation.a(r61.b.AbstractC4383b.StateData.b(stateData, glassesData != null ? r61.b.AbstractC4383b.StateData.FilesData.b(glassesData, list, list2, false, 4, null) : null, null, null, null, 14, null));
        }
        if (i15 != 2) {
            throw new oq.p();
        }
        r61.b.AbstractC4383b.StateData stateData2 = presentation.getStateData();
        r61.b.AbstractC4383b.StateData.FilesData faceCoverData = presentation.getStateData().getFaceCoverData();
        return presentation.a(r61.b.AbstractC4383b.StateData.b(stateData2, null, faceCoverData != null ? r61.b.AbstractC4383b.StateData.FilesData.b(faceCoverData, list, list2, false, 4, null) : null, null, null, 13, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X9(final c0 c0Var, k10.v vVar) {
        vVar.c(q0.c(r61.b.class), new er.l() { // from class: r61.w
            @Override // er.l
            public final Object b(Object obj) {
                return c0.Y9(this.f172197a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(r61.b.a.class), new er.l() { // from class: r61.x
            @Override // er.l
            public final Object b(Object obj) {
                return c0.Z9(this.f172198a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(r61.b.AbstractC4383b.Presentation.class), new er.l() { // from class: r61.y
            @Override // er.l
            public final Object b(Object obj) {
                return c0.aa(this.f172199a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(r61.b.a.Error.class), new er.l() { // from class: r61.z
            @Override // er.l
            public final Object b(Object obj) {
                return c0.ba((k10.z) obj);
            }
        });
        vVar.c(q0.c(r61.b.AbstractC4383b.Error.class), new er.l() { // from class: r61.a0
            @Override // er.l
            public final Object b(Object obj) {
                return c0.ca((k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Y9(c0 c0Var, k10.z zVar) {
        g gVar = c0Var.new g(null);
        zVar.x(q0.c(r61.a.e.class), k10.o.CANCEL_PREVIOUS, gVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Z9(c0 c0Var, k10.z zVar) {
        zVar.A(c0Var.new h(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 aa(c0 c0Var, k10.z zVar) {
        i iVar = c0Var.new i(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(r61.a.C4378a.class), oVar, iVar);
        zVar.x(q0.c(r61.a.j.class), oVar, c0Var.new j(null));
        zVar.v(q0.c(r61.a.OnBottomSheetActionSelected.class), oVar, c0Var.new k(null));
        zVar.v(q0.c(r61.a.DeleteFile.class), oVar, c0Var.new l(null));
        zVar.x(q0.c(r61.a.ShowAttachmentPreview.class), oVar, c0Var.new m(null));
        zVar.v(q0.c(r61.a.OpenBottomSheet.class), oVar, new n(null));
        zVar.v(q0.c(r61.a.OnBottomSheetStateChanged.class), oVar, new o(null));
        zVar.v(q0.c(r61.a.f.class), oVar, c0Var.new p(null));
        zVar.x(q0.c(r61.a.b.class), oVar, c0Var.new q(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ba(k10.z zVar) {
        r rVar = new r(null);
        zVar.v(q0.c(r61.a.c.class), k10.o.CANCEL_PREVIOUS, rVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ca(k10.z zVar) {
        s sVar = new s(null);
        zVar.v(q0.c(r61.a.c.class), k10.o.CANCEL_PREVIOUS, sVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0121, code lost:
    
        if (r1 == r3) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object da(k10.c0<r61.b.AbstractC4383b.Presentation> r18, u61.c r19, tq.e<? super k10.l<? extends r61.b>> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r61.c0.da(k10.c0, u61.c, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x0096  */
    /* JADX WARN: Code duplicated, block: B:19:0x00fa A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:23:0x0108  */
    /* JADX WARN: Code duplicated, block: B:24:0x011c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0125  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00fb -> B:21:0x0102). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object ea(k10.c0<?> r23, u61.c r24, java.util.List<? extends wx.i> r25, tq.e<? super java.util.List<? extends n40.i>> r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r61.c0.ea(k10.c0, u61.c, java.util.List, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 fa(c0 c0Var, wx.i iVar, wx.i.Image image) {
        c0Var.d9(new r61.a.ShowAttachmentPreview(c0Var.labelProvider.c(w51.a.f210442v4), iVar.getFileContent()));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ga(c0 c0Var, u61.c cVar, wx.i iVar) {
        c0Var.d9(new r61.a.DeleteFile(cVar, iVar));
        return oq.i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: H9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(r61.a.e eVar, tq.e<? super oq.i0> eVar2) {
        return super.F(eVar, eVar2);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: W9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(u61.b bVar) {
        super.P5(bVar);
    }

    @Override // zx.b
    public xw.b<r61.a.e> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<r61.b, r61.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<r61.c.a> getState() {
        return this.state;
    }
}
