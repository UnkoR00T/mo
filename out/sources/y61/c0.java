package y61;

import fr.q0;
import java.util.List;
import mu.p0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B[\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001f\u001a\u00020\u001e*\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010!\u001a\u00020\u001e*\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002¢\u0006\u0004\b!\u0010 J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020\u0002H\u0002¢\u0006\u0004\b$\u0010%J0\u0010*\u001a\b\u0012\u0004\u0012\u00020)0&2\n\u0010\"\u001a\u0006\u0012\u0002\b\u00030\u001c2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&H\u0082@¢\u0006\u0004\b*\u0010+J(\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-*\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010,\u001a\u00020'H\u0082@¢\u0006\u0004\b/\u00100J \u00101\u001a\b\u0012\u0004\u0012\u00020\u00020-*\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0082@¢\u0006\u0004\b1\u00102J \u00103\u001a\b\u0012\u0004\u0012\u00020\u00020-*\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0082@¢\u0006\u0004\b3\u00102J \u00104\u001a\b\u0012\u0004\u0012\u00020\u00020-*\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0082@¢\u0006\u0004\b4\u00102J%\u00107\u001a\b\u0012\u0004\u0012\u00020\u00020-*\u0006\u0012\u0002\b\u00030\u001c2\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b7\u00108J.\u00109\u001a\b\u0012\u0004\u0012\u00020\u001d0-*\b\u0012\u0004\u0012\u00020\u001d0\u001c2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020'0&H\u0082@¢\u0006\u0004\b9\u0010+J!\u0010>\u001a\u0004\u0018\u00010=2\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020\u001eH\u0002¢\u0006\u0004\b>\u0010?J\u0017\u0010A\u001a\u00020@2\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\bA\u0010BR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010X\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR \u0010_\u001a\b\u0012\u0004\u0012\u00020Z0Y8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R&\u0010e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030`8\u0014X\u0094\u0004¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR \u0010\"\u001a\b\u0012\u0004\u0012\u00020#0f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j¨\u0006k"}, d2 = {"Ly61/c0;", "Ll00/g;", "Ly61/c;", "Ly61/a;", "Ly61/d;", "", "Lyy/a;", "stateMachineFactory", "La71/d;", "mapper", "Lib4/c;", "genericErrorMapper", "Lbc4/k;", "pickPhotoFromCameraWithSizeValidationUseCase", "Lbc4/j;", "pickMultiplePhotosFromGalleryUseCase", "Lbc4/i;", "pickFileWithFilesValidationUC", "Lhb4/d;", "errorVMSFactory", "La00/b;", "pickedFileToAndroidMapper", "Lmx/c;", "labelProvider", "Ly61/b;", "setupData", "<init>", "(Lyy/a;La71/d;Lib4/c;Lbc4/k;Lbc4/j;Lbc4/i;Lhb4/d;La00/b;Lmx/c;Ly61/b;)V", "Lk10/c0;", "Ly61/c$b$b;", "", "R9", "(Lk10/c0;)Z", "Q9", "state", "Ly61/d$a;", "S9", "(Ly61/c;)Ly61/d$a;", "", "Lwx/i;", "pickedFiles", "Ln40/i;", "ja", "(Lk10/c0;Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "attachment", "Lk10/l;", "Ly61/c$b;", "Z9", "(Lk10/c0;Lwx/i;Ltq/e;)Ljava/lang/Object;", "ia", "(Lk10/c0;Ltq/e;)Ljava/lang/Object;", "Y9", "X9", "Ldx/b;", "domainError", "O9", "(Lk10/c0;Ldx/b;)Lk10/l;", "I9", "Lb71/b;", "attachmentType", "isStatementChecked", "Ly61/c$b$c$a;", "L9", "(Lb71/b;Z)Ly61/c$b$c$a;", "Lhb4/c;", "M9", "(Ldx/b;)Lhb4/c;", "b", "La71/d;", "c", "Lib4/c;", "d", "Lbc4/k;", "e", "Lbc4/j;", "f", "Lbc4/i;", "g", "Lhb4/d;", "h", "La00/b;", "j", "Lmx/c;", "k", "Ly61/b;", "Ly61/c$a$b;", "l", "Ly61/c$a$b;", "initialState", "Lxw/b;", "Ly61/a$e;", "m", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "n", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "p", "Lmu/p0;", "getState", "()Lmu/p0;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c0 extends l00.g<y61.c, y61.a> implements y61.d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a71.d mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericErrorMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final bc4.k pickPhotoFromCameraWithSizeValidationUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final bc4.j pickMultiplePhotosFromGalleryUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final bc4.i pickFileWithFilesValidationUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final a00.b pickedFileToAndroidMapper;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final ChildPassportApplicationAttachmentsNavigationParams setupData;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final y61.c.a.b initialState;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final xw.b<y61.a.e> navAction;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final k10.t<y61.c, y61.a> stateMachine;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final p0<y61.d.a> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f224468a;

        static {
            int[] iArr = new int[b71.b.values().length];
            try {
                iArr[b71.b.TEMPORARY_REASON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b71.b.SIGNED_CONSENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b71.b.NEW_APPLICATION_MONEY_TRANSFER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b71.b.OTHER_PARENT_UNABLE_TO_CONSENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b71.b.ABROAD_TREATMENT_CONFIRMATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[b71.b.KDR_CONFIRMATION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[b71.b.TECHNICAL_ISSUE_CONFIRMATION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[b71.b.OLD_APPLICATION_MONEY_TRANSFER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f224468a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f224469d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f224470e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f224471f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f224472g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f224474j;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f224472g = obj;
            this.f224474j |= PKIFailureInfo.systemUnavail;
            return c0.this.I9(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f224475d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f224476e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f224477f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f224478g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f224479h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f224480j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f224482l;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f224480j = obj;
            this.f224482l |= PKIFailureInfo.systemUnavail;
            return c0.this.X9(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f224483d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f224484e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f224485f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f224486g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f224487h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f224488j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f224490l;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f224488j = obj;
            this.f224490l |= PKIFailureInfo.systemUnavail;
            return c0.this.Y9(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f224491d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f224492e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f224493f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f224494g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f224496j;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f224494g = obj;
            this.f224496j |= PKIFailureInfo.systemUnavail;
            return c0.this.Z9(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class f implements mu.g<y61.d.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f224497a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c0 f224498b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f224499a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ c0 f224500b;

            /* JADX INFO: renamed from: y61.c0$f$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C6016a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f224501d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f224502e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f224503f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f224505h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f224506j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f224507k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f224508l;

                public C6016a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f224501d = obj;
                    this.f224502e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, c0 c0Var) {
                this.f224499a = hVar;
                this.f224500b = c0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C6016a c6016a;
                if (eVar instanceof C6016a) {
                    c6016a = (C6016a) eVar;
                    int i15 = c6016a.f224502e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c6016a.f224502e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c6016a = new C6016a(eVar);
                    }
                } else {
                    c6016a = new C6016a(eVar);
                }
                Object obj2 = c6016a.f224501d;
                Object objE = uq.b.e();
                int i16 = c6016a.f224502e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f224499a;
                    y61.d.a aVarS9 = this.f224500b.S9((y61.c) obj);
                    c6016a.f224503f = vq.j.a(obj);
                    c6016a.f224505h = vq.j.a(c6016a);
                    c6016a.f224506j = vq.j.a(obj);
                    c6016a.f224507k = vq.j.a(hVar);
                    c6016a.f224508l = 0;
                    c6016a.f224502e = 1;
                    if (hVar.F(aVarS9, c6016a) == objE) {
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
            this.f224497a = gVar;
            this.f224498b = c0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super y61.d.a> hVar, tq.e eVar) {
            Object objA = this.f224497a.a(new a(hVar, this.f224498b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ly61/a$b;", "<unused var>", "Ly61/c;", "Loq/i0;", "<anonymous>", "(Ly61/a$b;Ly61/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<y61.a.b, y61.c, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f224509e;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f224511a;

            static {
                int[] iArr = new int[b71.b.values().length];
                try {
                    iArr[b71.b.TEMPORARY_REASON.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b71.b.SIGNED_CONSENT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[b71.b.OTHER_PARENT_UNABLE_TO_CONSENT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[b71.b.OLD_APPLICATION_MONEY_TRANSFER.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[b71.b.NEW_APPLICATION_MONEY_TRANSFER.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[b71.b.ABROAD_TREATMENT_CONFIRMATION.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[b71.b.KDR_CONFIRMATION.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[b71.b.TECHNICAL_ISSUE_CONFIRMATION.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                f224511a = iArr;
            }
        }

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
        
            if (r5.F(r1, r4) == r0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
        
            if (r5.F(r1, r4) == r0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
        
            return r0;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r5) throws java.lang.Throwable {
            /*
                r4 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r4.f224509e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1a
                if (r1 == r3) goto Le
                if (r1 != r2) goto L12
            Le:
                oq.u.b(r5)
                goto L61
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                oq.u.b(r5)
                y61.c0 r5 = y61.c0.this
                y61.b r5 = y61.c0.y9(r5)
                b71.b r5 = r5.getAttachmentType()
                int[] r1 = y61.c0.g.a.f224511a
                int r5 = r5.ordinal()
                r5 = r1[r5]
                switch(r5) {
                    case 1: goto L50;
                    case 2: goto L38;
                    case 3: goto L38;
                    case 4: goto L38;
                    case 5: goto L38;
                    case 6: goto L38;
                    case 7: goto L38;
                    case 8: goto L38;
                    default: goto L32;
                }
            L32:
                oq.p r5 = new oq.p
                r5.<init>()
                throw r5
            L38:
                y61.c0 r5 = y61.c0.this
                y61.a$j r1 = y61.a.j.f224431a
                y61.c0.x9(r5, r1)
                y61.c0 r5 = y61.c0.this
                xw.b r5 = r5.Y1()
                y61.a$e$c r1 = y61.a.e.c.f224419a
                r4.f224509e = r2
                java.lang.Object r5 = r5.F(r1, r4)
                if (r5 != r0) goto L61
                goto L60
            L50:
                y61.c0 r5 = y61.c0.this
                xw.b r5 = r5.Y1()
                y61.a$e$b r1 = y61.a.e.b.f224418a
                r4.f224509e = r3
                java.lang.Object r5 = r5.F(r1, r4)
                if (r5 != r0) goto L61
            L60:
                return r0
            L61:
                oq.i0 r5 = oq.i0.f148189a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: y61.c0.g.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(y61.a.b bVar, y61.c cVar, tq.e<? super oq.i0> eVar) {
            return c0.this.new g(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Ly61/c$a;", "state", "Lk10/l;", "Ly61/c;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.p<k10.c0<y61.c.a>, tq.e<? super k10.l<? extends y61.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f224512e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f224513f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f224514g;

        h(tq.e<? super h> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final y61.c.b.Presentation O(c0 c0Var, b71.c.AttachmentsData attachmentsData, List list, y61.c.a aVar) {
            return new y61.c.b.Presentation(new y61.c.b.StateData(c0Var.setupData.getAttachmentType(), attachmentsData.a(), list, c0Var.L9(c0Var.setupData.getAttachmentType(), fr.t.c(attachmentsData.getIsStatementChecked(), Boolean.TRUE)), null, null, false, 48, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final b71.c.AttachmentsData attachmentsData;
            k10.c0 c0Var = (k10.c0) this.f224514g;
            Object objE = uq.b.e();
            int i15 = this.f224513f;
            if (i15 == 0) {
                oq.u.b(obj);
                c0.this.setupData.getDataContract().d6(c0.this.setupData.getAttachmentType());
                b71.c.AttachmentsData attachmentsDataK7 = c0.this.setupData.getDataContract().K7(c0.this.setupData.getAttachmentType());
                c0 c0Var2 = c0.this;
                List<wx.i> listA = attachmentsDataK7.a();
                this.f224514g = c0Var;
                this.f224512e = attachmentsDataK7;
                this.f224513f = 1;
                Object objJa = c0Var2.ja(c0Var, listA, this);
                if (objJa == objE) {
                    return objE;
                }
                attachmentsData = attachmentsDataK7;
                obj = objJa;
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                attachmentsData = (b71.c.AttachmentsData) this.f224512e;
                oq.u.b(obj);
            }
            final List list = (List) obj;
            final c0 c0Var3 = c0.this;
            return c0Var.d(new er.l() { // from class: y61.d0
                @Override // er.l
                public final Object b(Object obj2) {
                    return c0.h.O(c0Var3, attachmentsData, list, (c.a) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<y61.c.a> c0Var, tq.e<? super k10.l<? extends y61.c>> eVar) {
            return ((h) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            h hVar = c0.this.new h(eVar);
            hVar.f224514g = obj;
            return hVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ly61/a$a;", "<unused var>", "Ly61/c$b$b;", "Loq/i0;", "<anonymous>", "(Ly61/a$a;Ly61/c$b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<y61.a.C6010a, y61.c.b.Presentation, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f224516e;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f224516e;
            if (i15 == 0) {
                oq.u.b(obj);
                c0.this.d9(y61.a.j.f224431a);
                c0 c0Var = c0.this;
                y61.a.e.C6011a c6011a = y61.a.e.C6011a.f224417a;
                this.f224516e = 1;
                if (c0Var.F(c6011a, this) == objE) {
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
        public final Object w(y61.a.C6010a c6010a, y61.c.b.Presentation presentation, tq.e<? super oq.i0> eVar) {
            return c0.this.new i(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ly61/a$g;", "action", "Lk10/c0;", "Ly61/c$b$b;", "state", "Lk10/l;", "Ly61/c;", "<anonymous>", "(Ly61/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<y61.a.OnBottomSheetActionSelected, k10.c0<y61.c.b.Presentation>, tq.e<? super k10.l<? extends y61.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f224518e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f224519f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f224520g;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f224522a;

            static {
                int[] iArr = new int[z61.e.values().length];
                try {
                    iArr[z61.e.TAKE_PHOTO.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[z61.e.PICK_PHOTO.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[z61.e.PICK_FILE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f224522a = iArr;
            }
        }

        j(tq.e<? super j> eVar) {
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
                java.lang.Object r0 = r7.f224519f
                y61.a$g r0 = (y61.a.OnBottomSheetActionSelected) r0
                java.lang.Object r1 = r7.f224520g
                k10.c0 r1 = (k10.c0) r1
                java.lang.Object r2 = uq.b.e()
                int r3 = r7.f224518e
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
                z61.e r8 = r0.getSelectedOption()
                int[] r3 = y61.c0.j.a.f224522a
                int r8 = r8.ordinal()
                r8 = r3[r8]
                if (r8 == r6) goto L7c
                if (r8 == r5) goto L62
                if (r8 != r4) goto L5c
                y61.c0 r8 = y61.c0.this
                java.lang.Object r0 = vq.j.a(r0)
                r7.f224519f = r0
                java.lang.Object r0 = vq.j.a(r1)
                r7.f224520g = r0
                r7.f224518e = r4
                java.lang.Object r8 = y61.c0.D9(r8, r1, r7)
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
                y61.c0 r8 = y61.c0.this
                java.lang.Object r0 = vq.j.a(r0)
                r7.f224519f = r0
                java.lang.Object r0 = vq.j.a(r1)
                r7.f224520g = r0
                r7.f224518e = r5
                java.lang.Object r8 = y61.c0.E9(r8, r1, r7)
                if (r8 != r2) goto L79
                goto L92
            L79:
                k10.l r8 = (k10.l) r8
                return r8
            L7c:
                y61.c0 r8 = y61.c0.this
                java.lang.Object r0 = vq.j.a(r0)
                r7.f224519f = r0
                java.lang.Object r0 = vq.j.a(r1)
                r7.f224520g = r0
                r7.f224518e = r6
                java.lang.Object r8 = y61.c0.G9(r8, r1, r7)
                if (r8 != r2) goto L93
            L92:
                return r2
            L93:
                k10.l r8 = (k10.l) r8
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: y61.c0.j.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(y61.a.OnBottomSheetActionSelected onBottomSheetActionSelected, k10.c0<y61.c.b.Presentation> c0Var, tq.e<? super k10.l<? extends y61.c>> eVar) {
            j jVar = c0.this.new j(eVar);
            jVar.f224519f = onBottomSheetActionSelected;
            jVar.f224520g = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ly61/a$d;", "action", "Lk10/c0;", "Ly61/c$b$b;", "state", "Lk10/l;", "Ly61/c;", "<anonymous>", "(Ly61/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<y61.a.DeleteFile, k10.c0<y61.c.b.Presentation>, tq.e<? super k10.l<? extends y61.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f224523e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f224524f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f224525g;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            y61.a.DeleteFile deleteFile = (y61.a.DeleteFile) this.f224524f;
            k10.c0 c0Var = (k10.c0) this.f224525g;
            Object objE = uq.b.e();
            int i15 = this.f224523e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            c0 c0Var2 = c0.this;
            wx.i pickedFile = deleteFile.getPickedFile();
            this.f224524f = vq.j.a(deleteFile);
            this.f224525g = vq.j.a(c0Var);
            this.f224523e = 1;
            Object objZ9 = c0Var2.Z9(c0Var, pickedFile, this);
            return objZ9 == objE ? objE : objZ9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(y61.a.DeleteFile deleteFile, k10.c0<y61.c.b.Presentation> c0Var, tq.e<? super k10.l<? extends y61.c>> eVar) {
            k kVar = c0.this.new k(eVar);
            kVar.f224524f = deleteFile;
            kVar.f224525g = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ly61/a$k;", "action", "Ly61/c$b$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ly61/a$k;Ly61/c$b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<y61.a.ShowAttachmentPreview, y61.c.b.Presentation, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f224527e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f224528f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            y61.a.ShowAttachmentPreview showAttachmentPreview = (y61.a.ShowAttachmentPreview) this.f224528f;
            Object objE = uq.b.e();
            int i15 = this.f224527e;
            if (i15 == 0) {
                oq.u.b(obj);
                c0 c0Var = c0.this;
                y61.a.e.ShowAttachmentPreview showAttachmentPreview2 = new y61.a.e.ShowAttachmentPreview(new dx3.a.Content(showAttachmentPreview.getTitle(), showAttachmentPreview.getFileContent()));
                this.f224528f = vq.j.a(showAttachmentPreview);
                this.f224527e = 1;
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
        public final Object w(y61.a.ShowAttachmentPreview showAttachmentPreview, y61.c.b.Presentation presentation, tq.e<? super oq.i0> eVar) {
            l lVar = c0.this.new l(eVar);
            lVar.f224528f = showAttachmentPreview;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ly61/a$i;", "action", "Lk10/c0;", "Ly61/c$b$b;", "state", "Lk10/l;", "Ly61/c;", "<anonymous>", "(Ly61/a$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<y61.a.OpenBottomSheet, k10.c0<y61.c.b.Presentation>, tq.e<? super k10.l<? extends y61.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f224530e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f224531f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f224532g;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final y61.c.b.Presentation O(y61.a.OpenBottomSheet openBottomSheet, y61.c.b.Presentation presentation) {
            return presentation.a(y61.c.b.StateData.b(presentation.getStateData(), null, null, null, null, g30.v.EXPANDED, openBottomSheet.getData(), false, 79, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final y61.a.OpenBottomSheet openBottomSheet = (y61.a.OpenBottomSheet) this.f224531f;
            k10.c0 c0Var = (k10.c0) this.f224532g;
            uq.b.e();
            if (this.f224530e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: y61.e0
                @Override // er.l
                public final Object b(Object obj2) {
                    return c0.m.O(openBottomSheet, (c.b.Presentation) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(y61.a.OpenBottomSheet openBottomSheet, k10.c0<y61.c.b.Presentation> c0Var, tq.e<? super k10.l<? extends y61.c>> eVar) {
            m mVar = new m(eVar);
            mVar.f224531f = openBottomSheet;
            mVar.f224532g = c0Var;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ly61/a$h;", "action", "Lk10/c0;", "Ly61/c$b$b;", "state", "Lk10/l;", "Ly61/c;", "<anonymous>", "(Ly61/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<y61.a.OnBottomSheetStateChanged, k10.c0<y61.c.b.Presentation>, tq.e<? super k10.l<? extends y61.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f224533e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f224534f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f224535g;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final y61.c.b.Presentation O(y61.a.OnBottomSheetStateChanged onBottomSheetStateChanged, k10.c0 c0Var, y61.c.b.Presentation presentation) {
            y61.c.b.StateData stateData = presentation.getStateData();
            g30.v state = onBottomSheetStateChanged.getState();
            g30.v state2 = onBottomSheetStateChanged.getState();
            if (state2 == g30.v.HIDDEN) {
                state2 = null;
            }
            return presentation.a(y61.c.b.StateData.b(stateData, null, null, null, null, state, state2 != null ? ((y61.c.b.Presentation) c0Var.a()).getStateData().getBottomSheetData() : null, false, 79, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final y61.a.OnBottomSheetStateChanged onBottomSheetStateChanged = (y61.a.OnBottomSheetStateChanged) this.f224534f;
            final k10.c0 c0Var = (k10.c0) this.f224535g;
            uq.b.e();
            if (this.f224533e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: y61.f0
                @Override // er.l
                public final Object b(Object obj2) {
                    return c0.n.O(onBottomSheetStateChanged, c0Var, (c.b.Presentation) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(y61.a.OnBottomSheetStateChanged onBottomSheetStateChanged, k10.c0<y61.c.b.Presentation> c0Var, tq.e<? super k10.l<? extends y61.c>> eVar) {
            n nVar = new n(eVar);
            nVar.f224534f = onBottomSheetStateChanged;
            nVar.f224535g = c0Var;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ly61/a$l;", "action", "Lk10/c0;", "Ly61/c$b$b;", "state", "Lk10/l;", "Ly61/c;", "<anonymous>", "(Ly61/a$l;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<y61.a.StatementChecked, k10.c0<y61.c.b.Presentation>, tq.e<? super k10.l<? extends y61.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f224536e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f224537f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f224538g;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final y61.c.b.Presentation O(y61.a.StatementChecked statementChecked, y61.c.b.Presentation presentation) {
            y61.c.b.StateData stateData = presentation.getStateData();
            y61.c.b.StateData.StatementData statementData = presentation.getStateData().getStatementData();
            return presentation.a(y61.c.b.StateData.b(stateData, null, null, null, statementData != null ? statementData.a(statementChecked.getChecked(), false) : null, null, null, false, 119, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final y61.a.StatementChecked statementChecked = (y61.a.StatementChecked) this.f224537f;
            k10.c0 c0Var = (k10.c0) this.f224538g;
            uq.b.e();
            if (this.f224536e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: y61.g0
                @Override // er.l
                public final Object b(Object obj2) {
                    return c0.o.O(statementChecked, (c.b.Presentation) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(y61.a.StatementChecked statementChecked, k10.c0<y61.c.b.Presentation> c0Var, tq.e<? super k10.l<? extends y61.c>> eVar) {
            o oVar = new o(eVar);
            oVar.f224537f = statementChecked;
            oVar.f224538g = c0Var;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ly61/a$f;", "<unused var>", "Lk10/c0;", "Ly61/c$b$b;", "state", "Lk10/l;", "Ly61/c;", "<anonymous>", "(Ly61/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<y61.a.f, k10.c0<y61.c.b.Presentation>, tq.e<? super k10.l<? extends y61.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f224539e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f224540f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f224542a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f224543b;

            static {
                int[] iArr = new int[i61.h.values().length];
                try {
                    iArr[i61.h.WAITING_FOR_A_PASSPORT_PREPARED_IN_POLAND.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f224542a = iArr;
                int[] iArr2 = new int[b71.b.values().length];
                try {
                    iArr2[b71.b.TEMPORARY_REASON.ordinal()] = 1;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr2[b71.b.SIGNED_CONSENT.ordinal()] = 2;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[b71.b.OTHER_PARENT_UNABLE_TO_CONSENT.ordinal()] = 3;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[b71.b.OLD_APPLICATION_MONEY_TRANSFER.ordinal()] = 4;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[b71.b.NEW_APPLICATION_MONEY_TRANSFER.ordinal()] = 5;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr2[b71.b.TECHNICAL_ISSUE_CONFIRMATION.ordinal()] = 6;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr2[b71.b.ABROAD_TREATMENT_CONFIRMATION.ordinal()] = 7;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr2[b71.b.KDR_CONFIRMATION.ordinal()] = 8;
                } catch (NoSuchFieldError unused9) {
                }
                f224543b = iArr2;
            }
        }

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final y61.c.b.Presentation O(k10.c0 c0Var, c0 c0Var2, y61.c.b.Presentation presentation) {
            y61.c.b.StateData stateData = ((y61.c.b.Presentation) c0Var.a()).getStateData();
            boolean z15 = !c0Var2.R9(c0Var);
            y61.c.b.StateData.StatementData statementData = ((y61.c.b.Presentation) c0Var.a()).getStateData().getStatementData();
            return presentation.a(y61.c.b.StateData.b(stateData, null, null, null, statementData != null ? y61.c.b.StateData.StatementData.b(statementData, false, !c0Var2.Q9(c0Var), 1, null) : null, null, null, z15, 55, null));
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
        
            if (r9.F(r2, r8) == r1) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
        
            if (r9.F(r2, r8) == r1) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0087, code lost:
        
            if (r9.F(r2, r8) == r1) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00c3, code lost:
        
            if (r9.F(r2, r8) == r1) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00d6, code lost:
        
            if (r9.F(r2, r8) == r1) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00d8, code lost:
        
            return r1;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r9) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 254
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: y61.c0.p.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(y61.a.f fVar, k10.c0<y61.c.b.Presentation> c0Var, tq.e<? super k10.l<? extends y61.c>> eVar) {
            p pVar = c0.this.new p(eVar);
            pVar.f224540f = c0Var;
            return pVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ly61/a$j;", "<unused var>", "Ly61/c$b$b;", "state", "Loq/i0;", "<anonymous>", "(Ly61/a$j;Ly61/c$b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<y61.a.j, y61.c.b.Presentation, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f224544e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f224545f;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            y61.c.b.Presentation presentation = (y61.c.b.Presentation) this.f224545f;
            uq.b.e();
            if (this.f224544e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            b71.c dataContract = c0.this.setupData.getDataContract();
            b71.b attachmentType = c0.this.setupData.getAttachmentType();
            List<wx.i> listD = presentation.getStateData().d();
            y61.c.b.StateData.StatementData statementData = presentation.getStateData().getStatementData();
            dataContract.b2(attachmentType, new b71.c.AttachmentsData(listD, statementData != null ? vq.b.a(statementData.getIsChecked()) : null));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(y61.a.j jVar, y61.c.b.Presentation presentation, tq.e<? super oq.i0> eVar) {
            q qVar = c0.this.new q(eVar);
            qVar.f224545f = presentation;
            return qVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ly61/a$c;", "<unused var>", "Lk10/c0;", "Ly61/c$a$a;", "state", "Lk10/l;", "Ly61/c;", "<anonymous>", "(Ly61/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<y61.a.c, k10.c0<y61.c.a.Error>, tq.e<? super k10.l<? extends y61.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f224547e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f224548f;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final y61.c.a.b O(y61.c.a.Error error) {
            return y61.c.a.b.f224441a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f224548f;
            uq.b.e();
            if (this.f224547e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: y61.i0
                @Override // er.l
                public final Object b(Object obj2) {
                    return c0.r.O((c.a.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(y61.a.c cVar, k10.c0<y61.c.a.Error> c0Var, tq.e<? super k10.l<? extends y61.c>> eVar) {
            r rVar = new r(eVar);
            rVar.f224548f = c0Var;
            return rVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ly61/a$c;", "<unused var>", "Lk10/c0;", "Ly61/c$b$a;", "state", "Lk10/l;", "Ly61/c;", "<anonymous>", "(Ly61/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<y61.a.c, k10.c0<y61.c.b.Error>, tq.e<? super k10.l<? extends y61.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f224549e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f224550f;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final y61.c.b.Presentation O(k10.c0 c0Var, y61.c.b.Error error) {
            return new y61.c.b.Presentation(((y61.c.b.Error) c0Var.a()).getStateData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f224550f;
            uq.b.e();
            if (this.f224549e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: y61.j0
                @Override // er.l
                public final Object b(Object obj2) {
                    return c0.s.O(c0Var, (c.b.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(y61.a.c cVar, k10.c0<y61.c.b.Error> c0Var, tq.e<? super k10.l<? extends y61.c>> eVar) {
            s sVar = new s(eVar);
            sVar.f224550f = c0Var;
            return sVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class t extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f224551d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f224552e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f224553f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f224554g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f224555h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f224556j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f224557k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f224559m;

        t(tq.e<? super t> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f224557k = obj;
            this.f224559m |= PKIFailureInfo.systemUnavail;
            return c0.this.ia(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class u extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f224560d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f224561e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f224562f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f224563g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f224564h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f224565j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f224566k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f224567l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f224568m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f224569n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f224570p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f224571q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f224572r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f224573s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f224574t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f224575v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f224577x;

        u(tq.e<? super u> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f224575v = obj;
            this.f224577x |= PKIFailureInfo.systemUnavail;
            return c0.this.ja(null, null, this);
        }
    }

    public c0(yy.a aVar, a71.d dVar, ib4.c cVar, bc4.k kVar, bc4.j jVar, bc4.i iVar, hb4.d dVar2, a00.b bVar, mx.c cVar2, ChildPassportApplicationAttachmentsNavigationParams childPassportApplicationAttachmentsNavigationParams) {
        this.mapper = dVar;
        this.genericErrorMapper = cVar;
        this.pickPhotoFromCameraWithSizeValidationUseCase = kVar;
        this.pickMultiplePhotosFromGalleryUseCase = jVar;
        this.pickFileWithFilesValidationUC = iVar;
        this.errorVMSFactory = dVar2;
        this.pickedFileToAndroidMapper = bVar;
        this.labelProvider = cVar2;
        this.setupData = childPassportApplicationAttachmentsNavigationParams;
        y61.c.a.b bVar2 = y61.c.a.b.f224441a;
        this.initialState = bVar2;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(bVar2, new er.l() { // from class: y61.s
            @Override // er.l
            public final Object b(Object obj) {
                return c0.ca(this.f224628a, (k10.v) obj);
            }
        });
        this.state = a9(new f(e9().getState(), this), S9(bVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object I9(k10.c0<y61.c.b.Presentation> c0Var, List<? extends wx.i> list, tq.e<? super k10.l<y61.c.b.Presentation>> eVar) throws Throwable {
        b bVar;
        k10.c0<y61.c.b.Presentation> c0Var2;
        final List<? extends wx.i> list2;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f224474j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f224474j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object obj = bVar.f224472g;
        Object objE = uq.b.e();
        int i16 = bVar.f224474j;
        if (i16 == 0) {
            oq.u.b(obj);
            List listI1 = pq.v.i1(c0Var.a().getStateData().d());
            listI1.addAll(list);
            List<? extends wx.i> listF1 = pq.v.f1(listI1);
            bVar.f224469d = c0Var;
            bVar.f224470e = vq.j.a(list);
            bVar.f224471f = listF1;
            bVar.f224474j = 1;
            Object objJa = ja(c0Var, listF1, bVar);
            if (objJa == objE) {
                return objE;
            }
            c0Var2 = c0Var;
            list2 = listF1;
            obj = objJa;
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list2 = (List) bVar.f224471f;
            c0Var2 = (k10.c0) bVar.f224469d;
            oq.u.b(obj);
        }
        final List list3 = (List) obj;
        b71.c dataContract = this.setupData.getDataContract();
        b71.b attachmentType = this.setupData.getAttachmentType();
        y61.c.b.StateData.StatementData statementData = c0Var2.a().getStateData().getStatementData();
        dataContract.b2(attachmentType, new b71.c.AttachmentsData(list2, statementData != null ? vq.b.a(statementData.getIsChecked()) : null));
        return c0Var2.b(new er.l() { // from class: y61.b0
            @Override // er.l
            public final Object b(Object obj2) {
                return c0.J9(list2, list3, (c.b.Presentation) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y61.c.b.Presentation J9(List list, List list2, y61.c.b.Presentation presentation) {
        return presentation.a(y61.c.b.StateData.b(presentation.getStateData(), null, list, list2, null, null, null, false, 57, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final y61.c.b.StateData.StatementData L9(b71.b attachmentType, boolean isStatementChecked) {
        switch (a.f224468a[attachmentType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return null;
            case 8:
                return new y61.c.b.StateData.StatementData(isStatementChecked, false);
            default:
                throw new oq.p();
        }
    }

    private final hb4.c M9(dx.b domainError) {
        return this.errorVMSFactory.a(this.genericErrorMapper.b(new ib4.c.Params(domainError, false, new er.l() { // from class: y61.r
            @Override // er.l
            public final Object b(Object obj) {
                return c0.N9(this.f224627a, (ib4.c.b) obj);
            }
        }, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N9(c0 c0Var, ib4.c.b bVar) {
        if ((bVar instanceof ib4.c.b.a.Primary) || (bVar instanceof ib4.c.b.a.Secondary)) {
            c0Var.d9(y61.a.c.f224415a);
        } else if (!(bVar instanceof ib4.c.b.AbstractC2161b.C2162b)) {
            if (!(bVar instanceof ib4.c.b.a.Close) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                throw new oq.p();
            }
            c0Var.d9(y61.a.c.f224415a);
        }
        return oq.i0.f148189a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final k10.l<y61.c> O9(k10.c0<?> c0Var, dx.b bVar) {
        k10.l lVarC;
        k10.l lVarD;
        final dx.b.Business business = bVar instanceof dx.b.Business ? (dx.b.Business) bVar : null;
        if (business != null) {
            dx.b.Business.a type = business.getType();
            if (type == zb4.b.NO_FILE_PICKED || type == zb4.b.NO_PHOTO_PICKED) {
                lVarC = c0Var.c();
            } else {
                lVarD = c0Var.d(new er.l() { // from class: y61.n
                    @Override // er.l
                    public final Object b(Object obj) {
                        return c0.P9(this.f224619a, business, obj);
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
    public static final y61.c P9(c0 c0Var, dx.b.Business business, Object obj) {
        return obj instanceof y61.c.b.Presentation ? new y61.c.b.Error(((y61.c.b.Presentation) obj).getStateData(), c0Var.M9(business)) : new y61.c.a.Error(c0Var.M9(business));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean Q9(k10.c0<y61.c.b.Presentation> c0Var) {
        y61.c.b.StateData.StatementData statementData = c0Var.a().getStateData().getStatementData();
        if (statementData != null) {
            return statementData.getIsChecked();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean R9(k10.c0<y61.c.b.Presentation> c0Var) {
        return !c0Var.a().getStateData().d().isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final y61.d.a S9(y61.c state) {
        return this.mapper.b(new a71.d.Params(state, this.setupData.getAttachmentType(), new er.l() { // from class: y61.m
            @Override // er.l
            public final Object b(Object obj) {
                return c0.T9(this.f224617a, (z61.a.SelectOption) obj);
            }
        }, new er.l() { // from class: y61.t
            @Override // er.l
            public final Object b(Object obj) {
                return c0.U9(this.f224629a, (z61.e) obj);
            }
        }, new er.l() { // from class: y61.u
            @Override // er.l
            public final Object b(Object obj) {
                return c0.V9(this.f224630a, (g30.v) obj);
            }
        }, new er.l() { // from class: y61.v
            @Override // er.l
            public final Object b(Object obj) {
                return c0.W9(this.f224631a, ((Boolean) obj).booleanValue());
            }
        }, b9(y61.a.f.f224427a), b9(y61.a.C6010a.f224413a), b9(y61.a.b.f224414a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T9(c0 c0Var, z61.a.SelectOption selectOption) {
        c0Var.d9(new y61.a.OpenBottomSheet(selectOption));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U9(c0 c0Var, z61.e eVar) {
        c0Var.d9(new y61.a.OnBottomSheetActionSelected(eVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V9(c0 c0Var, g30.v vVar) {
        c0Var.d9(new y61.a.OnBottomSheetStateChanged(vVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W9(c0 c0Var, boolean z15) {
        c0Var.d9(new y61.a.StatementChecked(z15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f0, code lost:
    
        if (r14 == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object X9(k10.c0<y61.c.b.Presentation> r13, tq.e<? super k10.l<? extends y61.c>> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y61.c0.X9(k10.c0, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f4, code lost:
    
        if (r15 == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Y9(k10.c0<y61.c.b.Presentation> r14, tq.e<? super k10.l<? extends y61.c>> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y61.c0.Y9(k10.c0, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Z9(k10.c0<y61.c.b.Presentation> c0Var, wx.i iVar, tq.e<? super k10.l<? extends y61.c.b>> eVar) throws Throwable {
        e eVar2;
        k10.c0<y61.c.b.Presentation> c0Var2;
        final List<? extends wx.i> list;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f224496j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f224496j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object obj = eVar2.f224494g;
        Object objE = uq.b.e();
        int i16 = eVar2.f224496j;
        if (i16 == 0) {
            oq.u.b(obj);
            List listI1 = pq.v.i1(c0Var.a().getStateData().d());
            listI1.remove(iVar);
            List<? extends wx.i> listF1 = pq.v.f1(listI1);
            eVar2.f224491d = c0Var;
            eVar2.f224492e = vq.j.a(iVar);
            eVar2.f224493f = listF1;
            eVar2.f224496j = 1;
            Object objJa = ja(c0Var, listF1, eVar2);
            if (objJa == objE) {
                return objE;
            }
            c0Var2 = c0Var;
            list = listF1;
            obj = objJa;
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) eVar2.f224493f;
            c0Var2 = (k10.c0) eVar2.f224491d;
            oq.u.b(obj);
        }
        final List list2 = (List) obj;
        b71.c dataContract = this.setupData.getDataContract();
        b71.b attachmentType = this.setupData.getAttachmentType();
        y61.c.b.StateData.StatementData statementData = c0Var2.a().getStateData().getStatementData();
        dataContract.b2(attachmentType, new b71.c.AttachmentsData(list, statementData != null ? vq.b.a(statementData.getIsChecked()) : null));
        return c0Var2.b(new er.l() { // from class: y61.o
            @Override // er.l
            public final Object b(Object obj2) {
                return c0.aa(list, list2, (c.b.Presentation) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y61.c.b.Presentation aa(List list, List list2, y61.c.b.Presentation presentation) {
        return presentation.a(y61.c.b.StateData.b(presentation.getStateData(), null, list, list2, null, null, null, false, 121, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ca(final c0 c0Var, k10.v vVar) {
        vVar.c(q0.c(y61.c.class), new er.l() { // from class: y61.w
            @Override // er.l
            public final Object b(Object obj) {
                return c0.da(this.f224632a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(y61.c.a.class), new er.l() { // from class: y61.x
            @Override // er.l
            public final Object b(Object obj) {
                return c0.ea(this.f224633a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(y61.c.b.Presentation.class), new er.l() { // from class: y61.y
            @Override // er.l
            public final Object b(Object obj) {
                return c0.fa(this.f224634a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(y61.c.a.Error.class), new er.l() { // from class: y61.z
            @Override // er.l
            public final Object b(Object obj) {
                return c0.ga((k10.z) obj);
            }
        });
        vVar.c(q0.c(y61.c.b.Error.class), new er.l() { // from class: y61.a0
            @Override // er.l
            public final Object b(Object obj) {
                return c0.ha((k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 da(c0 c0Var, k10.z zVar) {
        g gVar = c0Var.new g(null);
        zVar.x(q0.c(y61.a.b.class), k10.o.CANCEL_PREVIOUS, gVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ea(c0 c0Var, k10.z zVar) {
        zVar.A(c0Var.new h(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 fa(c0 c0Var, k10.z zVar) {
        i iVar = c0Var.new i(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(y61.a.C6010a.class), oVar, iVar);
        zVar.v(q0.c(y61.a.OnBottomSheetActionSelected.class), oVar, c0Var.new j(null));
        zVar.v(q0.c(y61.a.DeleteFile.class), oVar, c0Var.new k(null));
        zVar.x(q0.c(y61.a.ShowAttachmentPreview.class), oVar, c0Var.new l(null));
        zVar.v(q0.c(y61.a.OpenBottomSheet.class), oVar, new m(null));
        zVar.v(q0.c(y61.a.OnBottomSheetStateChanged.class), oVar, new n(null));
        zVar.v(q0.c(y61.a.StatementChecked.class), oVar, new o(null));
        zVar.v(q0.c(y61.a.f.class), oVar, c0Var.new p(null));
        zVar.x(q0.c(y61.a.j.class), oVar, c0Var.new q(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ga(k10.z zVar) {
        r rVar = new r(null);
        zVar.v(q0.c(y61.a.c.class), k10.o.CANCEL_PREVIOUS, rVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ha(k10.z zVar) {
        s sVar = new s(null);
        zVar.v(q0.c(y61.a.c.class), k10.o.CANCEL_PREVIOUS, sVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x011b, code lost:
    
        if (r1 == r3) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ia(k10.c0<y61.c.b.Presentation> r18, tq.e<? super k10.l<? extends y61.c>> r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y61.c0.ia(k10.c0, tq.e):java.lang.Object");
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
    public final java.lang.Object ja(k10.c0<?> r22, java.util.List<? extends wx.i> r23, tq.e<? super java.util.List<? extends n40.i>> r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y61.c0.ja(k10.c0, java.util.List, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ka(c0 c0Var, wx.i iVar, wx.i.Image image) {
        c0Var.d9(new y61.a.ShowAttachmentPreview(c0Var.labelProvider.c(w51.a.f210442v4), iVar.getFileContent()));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 la(c0 c0Var, wx.i iVar) {
        c0Var.d9(new y61.a.DeleteFile(iVar));
        return oq.i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: K9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(y61.a.e eVar, tq.e<? super oq.i0> eVar2) {
        return super.F(eVar, eVar2);
    }

    @Override // zx.b
    public xw.b<y61.a.e> Y1() {
        return this.navAction;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: ba, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(ChildPassportApplicationAttachmentsNavigationParams childPassportApplicationAttachmentsNavigationParams) {
        super.P5(childPassportApplicationAttachmentsNavigationParams);
    }

    @Override // l00.g
    protected k10.t<y61.c, y61.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<y61.d.a> getState() {
        return this.state;
    }
}
