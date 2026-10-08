package lw3;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.p016lifecycle.u0;
import fr.q0;
import fx.Rectangle;
import ju.g2;
import jw3.MaskDefinition;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import qw3.State;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 {2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001|B\u0083\u0001\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\b\b\u0001\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J2\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020+*\n\u0012\u0006\b\u0001\u0012\u00020\u00020&2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0082@¢\u0006\u0004\b,\u0010-JD\u00108\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020'062\u0006\u0010(\u001a\u00020'2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0082@¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020;2\u0006\u0010:\u001a\u00020\u0002H\u0002¢\u0006\u0004\b<\u0010=J\u000f\u0010?\u001a\u00020>H\u0014¢\u0006\u0004\b?\u0010@R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010`\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010d\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010h\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR \u0010o\u001a\b\u0012\u0004\u0012\u00020j0i8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR&\u0010u\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030p8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bs\u0010tR \u0010:\u001a\b\u0012\u0004\u0012\u00020;0v8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bw\u0010x\u001a\u0004\by\u0010z¨\u0006}"}, d2 = {"Llw3/x;", "Ll00/g;", "Llw3/c;", "Llw3/a;", "Llw3/d;", "", "Lyy/a;", "stateMachineFactory", "Lpw3/d;", "mapper", "Lb00/c;", "imageConverter", "Lac4/a;", "callActionWithLoaderUseCase", "Liw3/f;", "isFaceValidWithPartOfTheRulesUC", "Lmx/c;", "labelProvider", "Lib4/c;", "genericDomainErrorMapper", "Lpw3/b;", "dialogMapper", "Lgw3/a;", "savePhotoOnDiskUC", "Lfw3/c;", "scaleFaceDetectorResultToContainerUC", "Lfw3/a;", "calculateTargetPhotoDimensionsUC", "Lyz/d;", "singleFaceDetector", "Lyw/b;", "accessibilityTalkBackManager", "Lmw3/a;", "matrixAnimator", "Llw3/b;", "data", "<init>", "(Lyy/a;Lpw3/d;Lb00/c;Lac4/a;Liw3/f;Lmx/c;Lib4/c;Lpw3/b;Lgw3/a;Lfw3/c;Lfw3/a;Lyz/d;Lyw/b;Lmw3/a;Llw3/b;)V", "Lk10/c0;", "Landroid/graphics/Bitmap;", "photo", "Ljw3/b;", "maskDefinition", "Lk10/l;", "D9", "(Lk10/c0;Landroid/graphics/Bitmap;Ljw3/b;Ltq/e;)Ljava/lang/Object;", "Landroid/graphics/RectF;", "photoRect", "Landroid/graphics/Matrix;", "matrix", "Lfx/e;", "maskContainer", "Lfw3/a$c;", "targetPhotoDimensions", "Ldx/i;", "Ldx/b;", "C9", "(Landroid/graphics/Bitmap;Landroid/graphics/RectF;Landroid/graphics/Matrix;Lfx/e;Lfw3/a$c;Ltq/e;)Ljava/lang/Object;", "state", "Llw3/d$a;", "H9", "(Llw3/c;)Llw3/d$a;", "Loq/i0;", "Y8", "()V", "b", "Lpw3/d;", "c", "Lb00/c;", "d", "Lac4/a;", "e", "Liw3/f;", "f", "Lmx/c;", "g", "Lib4/c;", "h", "Lpw3/b;", "j", "Lgw3/a;", "k", "Lfw3/c;", "l", "Lfw3/a;", "m", "Lyz/d;", "n", "Lyw/b;", "p", "Lmw3/a;", "q", "Llw3/b;", "Lqw3/e;", "r", "Lqw3/e;", "adjustmentVMS", "Lyw3/b;", "s", "Lyw3/b;", "faceValidationVMS", "Llw3/c$b;", "t", "Llw3/c$b;", "initialState", "Lxw/b;", "Llw3/a$a;", "v", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "w", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "x", "Lmu/p0;", "getState", "()Lmu/p0;", "y", "a", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class x extends l00.g<lw3.c, lw3.a> implements lw3.d, zx.d {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final a f120942y = new a(null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f120943z = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final pw3.d mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final b00.c imageConverter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final iw3.f isFaceValidWithPartOfTheRulesUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final pw3.b dialogMapper;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final gw3.a savePhotoOnDiskUC;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final fw3.c scaleFaceDetectorResultToContainerUC;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final fw3.a calculateTargetPhotoDimensionsUC;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final yz.d singleFaceDetector;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final yw.b accessibilityTalkBackManager;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final mw3.a matrixAnimator;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final SetupData data;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final qw3.e adjustmentVMS;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final yw3.b faceValidationVMS = new yw3.b(false, 1, null);

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final lw3.c.Measuring initialState;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final xw.b<lw3.a.InterfaceC2951a> navAction;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final k10.t<lw3.c, lw3.a> stateMachine;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final p0<lw3.d.Data> state;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Llw3/x$a;", "", "<init>", "()V", "", "ADJUSTMENT_DEBOUNCE_TIME_MILLIS", "J", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f120964d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f120965e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f120966f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f120967g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f120968h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f120969j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f120970k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f120971l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f120972m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f120973n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f120974p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f120975q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f120977s;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f120975q = obj;
            this.f120977s |= PKIFailureInfo.systemUnavail;
            return x.this.D9(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements mu.g<lw3.d.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f120978a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ x f120979b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f120980a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ x f120981b;

            /* JADX INFO: renamed from: lw3.x$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2955a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f120982d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f120983e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f120984f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f120986h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f120987j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f120988k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f120989l;

                public C2955a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f120982d = obj;
                    this.f120983e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, x xVar) {
                this.f120980a = hVar;
                this.f120981b = xVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2955a c2955a;
                if (eVar instanceof C2955a) {
                    c2955a = (C2955a) eVar;
                    int i15 = c2955a.f120983e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2955a.f120983e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2955a = new C2955a(eVar);
                    }
                } else {
                    c2955a = new C2955a(eVar);
                }
                Object obj2 = c2955a.f120982d;
                Object objE = uq.b.e();
                int i16 = c2955a.f120983e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f120980a;
                    lw3.d.Data dataH9 = this.f120981b.H9((lw3.c) obj);
                    c2955a.f120984f = vq.j.a(obj);
                    c2955a.f120986h = vq.j.a(c2955a);
                    c2955a.f120987j = vq.j.a(obj);
                    c2955a.f120988k = vq.j.a(hVar);
                    c2955a.f120989l = 0;
                    c2955a.f120983e = 1;
                    if (hVar.F(dataH9, c2955a) == objE) {
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

        public c(mu.g gVar, x xVar) {
            this.f120978a = gVar;
            this.f120979b = xVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super lw3.d.Data> hVar, tq.e eVar) {
            Object objA = this.f120978a.a(new a(hVar, this.f120979b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Llw3/a$d;", "<unused var>", "Llw3/c;", "Loq/i0;", "<anonymous>", "(Llw3/a$d;Llw3/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<lw3.a.d, lw3.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f120990e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f120990e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<lw3.a.InterfaceC2951a> bVarY1 = x.this.Y1();
                lw3.a.InterfaceC2951a.C2952a c2952a = lw3.a.InterfaceC2951a.C2952a.f120858a;
                this.f120990e = 1;
                if (bVarY1.F(c2952a, this) == objE) {
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
        public final Object w(lw3.a.d dVar, lw3.c cVar, tq.e<? super i0> eVar) {
            return x.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Llw3/a$g;", "action", "Llw3/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Llw3/a$g;Llw3/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<lw3.a.OnGenericError, lw3.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f120992e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f120993f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(lw3.a.OnGenericError onGenericError, ib4.c.b bVar) {
            onGenericError.a().a();
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final lw3.a.OnGenericError onGenericError = (lw3.a.OnGenericError) this.f120993f;
            Object objE = uq.b.e();
            int i15 = this.f120992e;
            if (i15 == 0) {
                oq.u.b(obj);
                x xVar = x.this;
                lw3.a.InterfaceC2951a.Error error = new lw3.a.InterfaceC2951a.Error(x.this.genericDomainErrorMapper.b(new ib4.c.Params(new dx.b.Generic(null, 1, null), false, new er.l() { // from class: lw3.y
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return x.e.O(onGenericError, (ib4.c.b) obj2);
                    }
                })));
                this.f120993f = vq.j.a(onGenericError);
                this.f120992e = 1;
                if (xVar.F(error, this) == objE) {
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
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(lw3.a.OnGenericError onGenericError, lw3.c cVar, tq.e<? super i0> eVar) {
            e eVar2 = x.this.new e(eVar);
            eVar2.f120993f = onGenericError;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Llw3/a$e;", "<unused var>", "Llw3/c$b;", "Loq/i0;", "<anonymous>", "(Llw3/a$e;Llw3/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<lw3.a.e, lw3.c.Measuring, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f120995e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f120995e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            x.this.d9(lw3.a.d.f120864a);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(lw3.a.e eVar, lw3.c.Measuring measuring, tq.e<? super i0> eVar2) {
            return x.this.new f(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Llw3/a$f;", "action", "Lk10/c0;", "Llw3/c$b;", "state", "Lk10/l;", "Llw3/c;", "<anonymous>", "(Llw3/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<lw3.a.OnContainerChanged, k10.c0<lw3.c.Measuring>, tq.e<? super k10.l<? extends lw3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f120997e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f120998f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f120999g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Llw3/c;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends lw3.c>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f121001e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ x f121002f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<lw3.c.Measuring> f121003g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ lw3.a.OnContainerChanged f121004h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(x xVar, k10.c0<lw3.c.Measuring> c0Var, lw3.a.OnContainerChanged onContainerChanged, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f121002f = xVar;
                this.f121003g = c0Var;
                this.f121004h = onContainerChanged;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f121001e;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                    return obj;
                }
                oq.u.b(obj);
                this.f121002f.adjustmentVMS.p(this.f121002f.data.getPhoto().getWidth(), this.f121002f.data.getPhoto().getHeight());
                x xVar = this.f121002f;
                k10.c0<lw3.c.Measuring> c0Var = this.f121003g;
                Bitmap photo = xVar.data.getPhoto();
                MaskDefinition maskDefinition = new MaskDefinition(this.f121004h.getContainer(), this.f121002f.data.getMaskType());
                this.f121001e = 1;
                Object objD9 = xVar.D9(c0Var, photo, maskDefinition, this);
                return objD9 == objE ? objE : objD9;
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f121002f, this.f121003g, this.f121004h, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends lw3.c>> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            lw3.a.OnContainerChanged onContainerChanged = (lw3.a.OnContainerChanged) this.f120998f;
            k10.c0 c0Var = (k10.c0) this.f120999g;
            Object objE = uq.b.e();
            int i15 = this.f120997e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = x.this.callActionWithLoaderUseCase;
            a aVar2 = new a(x.this, c0Var, onContainerChanged, null);
            this.f120998f = vq.j.a(onContainerChanged);
            this.f120999g = vq.j.a(c0Var);
            this.f120997e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(lw3.a.OnContainerChanged onContainerChanged, k10.c0<lw3.c.Measuring> c0Var, tq.e<? super k10.l<? extends lw3.c>> eVar) {
            g gVar = x.this.new g(eVar);
            gVar.f120998f = onContainerChanged;
            gVar.f120999g = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqw3/a;", "action", "Loq/i0;", "<anonymous>", "(Lqw3/a;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.p<qw3.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f121005e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f121006f;

        h(tq.e<? super h> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            qw3.a aVar = (qw3.a) this.f121006f;
            uq.b.e();
            if (this.f121005e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            x.this.d9(new lw3.a.OnAdjustmentActionChanged(aVar));
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(qw3.a aVar, tq.e<? super i0> eVar) {
            return ((h) v(aVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            h hVar = x.this.new h(eVar);
            hVar.f121006f = obj;
            return hVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lqw3/a;", "<unused var>", "Lk10/c0;", "Llw3/c$a;", "state", "Lk10/l;", "Llw3/c;", "<anonymous>", "(Lqw3/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<qw3.a, k10.c0<lw3.c.Initialized>, tq.e<? super k10.l<? extends lw3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f121008e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f121009f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f121009f;
            Object objE = uq.b.e();
            int i15 = this.f121008e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            x xVar = x.this;
            Bitmap photo = ((lw3.c.Initialized) c0Var.a()).getPhoto();
            MaskDefinition maskDefinition = ((lw3.c.Initialized) c0Var.a()).getMaskDefinition();
            this.f121009f = vq.j.a(c0Var);
            this.f121008e = 1;
            Object objD9 = xVar.D9(c0Var, photo, maskDefinition, this);
            return objD9 == objE ? objE : objD9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(qw3.a aVar, k10.c0<lw3.c.Initialized> c0Var, tq.e<? super k10.l<? extends lw3.c>> eVar) {
            i iVar = x.this.new i(eVar);
            iVar.f121009f = c0Var;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "isFaceValid", "Llw3/c$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(ZLlw3/c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<Boolean, lw3.c.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f121011e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ boolean f121012f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            int i15;
            boolean z15 = this.f121012f;
            uq.b.e();
            if (this.f121011e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            yw.b bVar = x.this.accessibilityTalkBackManager;
            mx.c cVar = x.this.labelProvider;
            if (z15) {
                i15 = bw3.a.f21894s;
            } else {
                if (z15) {
                    throw new oq.p();
                }
                i15 = bw3.a.f21892r;
            }
            bVar.a(cVar.c(i15).getText());
            return i0.f148189a;
        }

        public final Object M(boolean z15, lw3.c.Initialized initialized, tq.e<? super i0> eVar) {
            j jVar = x.this.new j(eVar);
            jVar.f121012f = z15;
            return jVar.J(i0.f148189a);
        }

        @Override // er.q
        public /* bridge */ /* synthetic */ Object w(Boolean bool, lw3.c.Initialized initialized, tq.e<? super i0> eVar) {
            return M(bool.booleanValue(), initialized, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Llw3/a$e;", "<unused var>", "Llw3/c$a;", "state", "Loq/i0;", "<anonymous>", "(Llw3/a$e;Llw3/c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<lw3.a.e, lw3.c.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f121014e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f121015f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            lw3.c.Initialized initialized = (lw3.c.Initialized) this.f121015f;
            Object objE = uq.b.e();
            int i15 = this.f121014e;
            if (i15 == 0) {
                oq.u.b(obj);
                boolean z15 = initialized.getPhotoState() != lw3.c.Initialized.EnumC2953a.INITIAL;
                if (z15) {
                    x xVar = x.this;
                    lw3.a.InterfaceC2951a.Dialog dialog = new lw3.a.InterfaceC2951a.Dialog(x.this.dialogMapper.b(new pw3.b.Params(x.this.b9(lw3.a.d.f120864a))));
                    this.f121015f = vq.j.a(initialized);
                    this.f121014e = 1;
                    if (xVar.F(dialog, this) == objE) {
                        return objE;
                    }
                } else {
                    if (z15) {
                        throw new oq.p();
                    }
                    x.this.d9(lw3.a.d.f120864a);
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
        public final Object w(lw3.a.e eVar, lw3.c.Initialized initialized, tq.e<? super i0> eVar2) {
            k kVar = x.this.new k(eVar2);
            kVar.f121015f = initialized;
            return kVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Llw3/a$c;", "action", "Lk10/c0;", "Llw3/c$a;", "state", "Lk10/l;", "Llw3/c;", "<anonymous>", "(Llw3/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<lw3.a.OnAdjustmentActionChanged, k10.c0<lw3.c.Initialized>, tq.e<? super k10.l<? extends lw3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f121017e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f121018f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f121019g;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f121020a;

            static {
                int[] iArr = new int[qw3.a.values().length];
                try {
                    iArr[qw3.a.INITIAL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[qw3.a.IDLE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[qw3.a.TRANSFORM.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[qw3.a.ROTATING.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[qw3.a.WAITING_FOR_BACK.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f121020a = iArr;
            }
        }

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final lw3.c.Initialized O(lw3.a.OnAdjustmentActionChanged onAdjustmentActionChanged, lw3.c.Initialized initialized) {
            lw3.c.Initialized.EnumC2953a enumC2953a;
            int i15 = a.f121020a[onAdjustmentActionChanged.getAdjustmentAction().ordinal()];
            if (i15 == 1) {
                enumC2953a = lw3.c.Initialized.EnumC2953a.INITIAL;
            } else if (i15 == 2) {
                enumC2953a = lw3.c.Initialized.EnumC2953a.MODIFIED;
            } else {
                if (i15 != 3 && i15 != 4 && i15 != 5) {
                    throw new oq.p();
                }
                enumC2953a = lw3.c.Initialized.EnumC2953a.MODIFYING;
            }
            return lw3.c.Initialized.b(initialized, null, null, enumC2953a, 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final lw3.a.OnAdjustmentActionChanged onAdjustmentActionChanged = (lw3.a.OnAdjustmentActionChanged) this.f121018f;
            k10.c0 c0Var = (k10.c0) this.f121019g;
            uq.b.e();
            if (this.f121017e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: lw3.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.l.O(onAdjustmentActionChanged, (c.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(lw3.a.OnAdjustmentActionChanged onAdjustmentActionChanged, k10.c0<lw3.c.Initialized> c0Var, tq.e<? super k10.l<? extends lw3.c>> eVar) {
            l lVar = new l(eVar);
            lVar.f121018f = onAdjustmentActionChanged;
            lVar.f121019g = c0Var;
            return lVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Llw3/a$f;", "action", "Lk10/c0;", "Llw3/c$a;", "state", "Lk10/l;", "Llw3/c;", "<anonymous>", "(Llw3/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<lw3.a.OnContainerChanged, k10.c0<lw3.c.Initialized>, tq.e<? super k10.l<? extends lw3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f121021e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f121022f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f121023g;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final lw3.c.Initialized O(lw3.a.OnContainerChanged onContainerChanged, x xVar, lw3.c.Initialized initialized) {
            return lw3.c.Initialized.b(initialized, null, new MaskDefinition(onContainerChanged.getContainer(), xVar.data.getMaskType()), null, 5, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final lw3.a.OnContainerChanged onContainerChanged = (lw3.a.OnContainerChanged) this.f121022f;
            k10.c0 c0Var = (k10.c0) this.f121023g;
            uq.b.e();
            if (this.f121021e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (fr.t.c(onContainerChanged.getContainer(), ((lw3.c.Initialized) c0Var.a()).getMaskDefinition().getContainer())) {
                return c0Var.c();
            }
            final x xVar = x.this;
            return c0Var.b(new er.l() { // from class: lw3.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.m.O(onContainerChanged, xVar, (c.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(lw3.a.OnContainerChanged onContainerChanged, k10.c0<lw3.c.Initialized> c0Var, tq.e<? super k10.l<? extends lw3.c>> eVar) {
            m mVar = x.this.new m(eVar);
            mVar.f121022f = onContainerChanged;
            mVar.f121023g = c0Var;
            return mVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Llw3/a$b;", "<unused var>", "Llw3/c$a;", "state", "Loq/i0;", "<anonymous>", "(Llw3/a$b;Llw3/c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<lw3.a.b, lw3.c.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f121025e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f121026f;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f121028e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f121029f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f121030g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f121031h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f121032j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f121033k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f121034l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f121035m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f121036n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f121037p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f121038q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ x f121039r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ lw3.c.Initialized f121040s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(x xVar, lw3.c.Initialized initialized, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f121039r = xVar;
                this.f121040s = initialized;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final i0 V() {
                return i0.f148189a;
            }

            /* JADX WARN: Code duplicated, block: B:29:0x016e  */
            /* JADX WARN: Code duplicated, block: B:31:0x0172  */
            /* JADX WARN: Code duplicated, block: B:33:0x0176  */
            /* JADX WARN: Code duplicated, block: B:36:0x01c5  */
            /* JADX WARN: Code duplicated, block: B:40:0x01cf  */
            /* JADX WARN: Code duplicated, block: B:41:0x01e5  */
            /* JADX WARN: Code duplicated, block: B:43:0x01e9  */
            /* JADX WARN: Code duplicated, block: B:48:0x0244  */
            /* JADX WARN: Code duplicated, block: B:50:0x024a  */
            /* JADX WARN: Code restructure failed: missing block: B:44:0x023e, code lost:
            
                if (r0.F(r2, r19) == r7) goto L45;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r20) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 598
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: lw3.x.n.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<i0> N(tq.e<?> eVar) {
                return new a(this.f121039r, this.f121040s, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super i0> eVar) {
                return ((a) N(eVar)).J(i0.f148189a);
            }
        }

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            lw3.c.Initialized initialized = (lw3.c.Initialized) this.f121026f;
            Object objE = uq.b.e();
            int i15 = this.f121025e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (initialized.getPhotoState() != lw3.c.Initialized.EnumC2953a.MODIFIED) {
                    return i0.f148189a;
                }
                ac4.a aVar = x.this.callActionWithLoaderUseCase;
                a aVar2 = new a(x.this, initialized, null);
                this.f121026f = vq.j.a(initialized);
                this.f121025e = 1;
                if (ac4.a.a(aVar, null, aVar2, this, 1, null) == objE) {
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
        public final Object w(lw3.a.b bVar, lw3.c.Initialized initialized, tq.e<? super i0> eVar) {
            n nVar = x.this.new n(eVar);
            nVar.f121026f = initialized;
            return nVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class o implements mu.g<qw3.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f121041a;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f121042a;

            /* JADX INFO: renamed from: lw3.x$o$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2956a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f121043d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f121044e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f121045f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                Object f121046g;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f121048j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f121049k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f121050l;

                public C2956a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f121043d = obj;
                    this.f121044e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar) {
                this.f121042a = hVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2956a c2956a;
                if (eVar instanceof C2956a) {
                    c2956a = (C2956a) eVar;
                    int i15 = c2956a.f121044e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2956a.f121044e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2956a = new C2956a(eVar);
                    }
                } else {
                    c2956a = new C2956a(eVar);
                }
                Object obj2 = c2956a.f121043d;
                Object objE = uq.b.e();
                int i16 = c2956a.f121044e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f121042a;
                    if (((qw3.a) obj) == qw3.a.IDLE) {
                        c2956a.f121045f = vq.j.a(obj);
                        c2956a.f121046g = vq.j.a(c2956a);
                        c2956a.f121048j = vq.j.a(obj);
                        c2956a.f121049k = vq.j.a(hVar);
                        c2956a.f121050l = 0;
                        c2956a.f121044e = 1;
                        if (hVar.F(obj, c2956a) == objE) {
                            return objE;
                        }
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

        public o(mu.g gVar) {
            this.f121041a = gVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super qw3.a> hVar, tq.e eVar) {
            Object objA = this.f121041a.a(new a(hVar), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    public x(yy.a aVar, pw3.d dVar, b00.c cVar, ac4.a aVar2, iw3.f fVar, mx.c cVar2, ib4.c cVar3, pw3.b bVar, gw3.a aVar3, fw3.c cVar4, fw3.a aVar4, yz.d dVar2, yw.b bVar2, mw3.a aVar5, SetupData setupData) {
        this.mapper = dVar;
        this.imageConverter = cVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.isFaceValidWithPartOfTheRulesUC = fVar;
        this.labelProvider = cVar2;
        this.genericDomainErrorMapper = cVar3;
        this.dialogMapper = bVar;
        this.savePhotoOnDiskUC = aVar3;
        this.scaleFaceDetectorResultToContainerUC = cVar4;
        this.calculateTargetPhotoDimensionsUC = aVar4;
        this.singleFaceDetector = dVar2;
        this.accessibilityTalkBackManager = bVar2;
        this.matrixAnimator = aVar5;
        this.data = setupData;
        this.adjustmentVMS = new qw3.e(u0.a(this), cVar2, aVar5);
        lw3.c.Measuring measuring = new lw3.c.Measuring(setupData.getMaskType());
        this.initialState = measuring;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(measuring, new er.l() { // from class: lw3.w
            @Override // er.l
            public final Object b(Object obj) {
                return x.K9(this.f120941a, (k10.v) obj);
            }
        });
        this.state = a9(new c(e9().getState(), this), H9(measuring));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object C9(Bitmap bitmap, RectF rectF, Matrix matrix, Rectangle rectangle, fw3.a.Result result, tq.e<? super dx.i<? extends dx.b, Bitmap>> eVar) {
        b00.c cVar = this.imageConverter;
        b00.f.Matrix matrix2 = new b00.f.Matrix(matrix);
        int iAbs = (int) Math.abs(rectF.left);
        int iAbs2 = (int) Math.abs(rectF.top);
        int width = (int) rectangle.getWidth();
        int height = (int) rectangle.getHeight();
        Matrix matrix3 = new Matrix();
        matrix3.setScale(result.getWidth() / rectangle.getWidth(), result.getHeight() / rectangle.getHeight());
        i0 i0Var = i0.f148189a;
        return cVar.j(bitmap, pq.v.q(matrix2, new b00.f.Crop(iAbs, iAbs2, width, height, matrix3)), eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:36:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:39:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:41:0x0203  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object D9(k10.c0<? extends lw3.c> c0Var, Bitmap bitmap, MaskDefinition maskDefinition, tq.e<? super k10.l<? extends lw3.c>> eVar) throws Throwable {
        b bVar;
        Matrix matrix;
        MaskDefinition maskDefinition2;
        Bitmap bitmap2;
        float[] fArr;
        k10.c0<? extends lw3.c> c0Var2;
        dx.i iVar;
        float[] fArr2;
        Matrix matrix2;
        int i15;
        final MaskDefinition maskDefinition3;
        Bitmap bitmap3;
        Bitmap bitmap4;
        int i16;
        k10.c0<? extends lw3.c> c0Var3;
        final Bitmap bitmap5;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i17 = bVar.f120977s;
            if ((i17 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f120977s = i17 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        b bVar2 = bVar;
        Object objD = bVar2.f120975q;
        Object objE = uq.b.e();
        int i18 = bVar2.f120977s;
        if (i18 == 0) {
            oq.u.b(objD);
            State value = this.adjustmentVMS.getState().getValue();
            oq.r rVarA = oq.y.a(value.getMatrix(), value.getImageData().g());
            matrix = (Matrix) rVarA.a();
            float[] fArr3 = (float[]) rVarA.b();
            RectF rectFD = qw3.g.f169186a.d(fArr3);
            Rectangle container = maskDefinition.getContainer();
            fw3.a.Result resultB = this.calculateTargetPhotoDimensionsUC.b(new fw3.a.Params(this.data.getRequirements().getMinResolution()));
            bVar2.f120964d = c0Var;
            bVar2.f120965e = bitmap;
            maskDefinition2 = maskDefinition;
            bVar2.f120966f = maskDefinition2;
            bVar2.f120967g = vq.j.a(matrix);
            bVar2.f120968h = vq.j.a(fArr3);
            bVar2.f120977s = 1;
            Object objC9 = C9(bitmap, rectFD, matrix, container, resultB, bVar2);
            if (objC9 != objE) {
                bitmap2 = bitmap;
                objD = objC9;
                fArr = fArr3;
                c0Var2 = c0Var;
            }
            return objE;
        }
        if (i18 == 1) {
            fArr = (float[]) bVar2.f120968h;
            matrix = (Matrix) bVar2.f120967g;
            MaskDefinition maskDefinition4 = (MaskDefinition) bVar2.f120966f;
            bitmap2 = (Bitmap) bVar2.f120965e;
            c0Var2 = (k10.c0) bVar2.f120964d;
            oq.u.b(objD);
            maskDefinition2 = maskDefinition4;
        } else {
            if (i18 == 2) {
                int i19 = bVar2.f120974p;
                int i25 = bVar2.f120973n;
                Bitmap bitmap6 = (Bitmap) bVar2.f120970k;
                dx.i iVar2 = (dx.i) bVar2.f120969j;
                float[] fArr4 = (float[]) bVar2.f120968h;
                Matrix matrix3 = (Matrix) bVar2.f120967g;
                MaskDefinition maskDefinition5 = (MaskDefinition) bVar2.f120966f;
                bitmap3 = (Bitmap) bVar2.f120965e;
                k10.c0<? extends lw3.c> c0Var4 = (k10.c0) bVar2.f120964d;
                oq.u.b(objD);
                i15 = i19;
                maskDefinition3 = maskDefinition5;
                fArr2 = fArr4;
                iVar = iVar2;
                bitmap4 = bitmap6;
                i16 = i25;
                matrix2 = matrix3;
                c0Var2 = c0Var4;
                vx.a aVar = (vx.a) objD;
                Bitmap bitmap7 = bitmap4;
                dx.i iVar3 = iVar;
                vx.a aVarB = this.scaleFaceDetectorResultToContainerUC.b(new fw3.c.Params(aVar, maskDefinition3.getContainer(), false, true));
                iw3.f fVar = this.isFaceValidWithPartOfTheRulesUC;
                iw3.f.Params params = new iw3.f.Params(aVarB, maskDefinition3);
                bVar2.f120964d = c0Var2;
                bVar2.f120965e = bitmap3;
                bVar2.f120966f = maskDefinition3;
                bVar2.f120967g = vq.j.a(matrix2);
                bVar2.f120968h = vq.j.a(fArr2);
                bVar2.f120969j = vq.j.a(iVar3);
                bVar2.f120970k = vq.j.a(bitmap7);
                bVar2.f120971l = vq.j.a(aVar);
                bVar2.f120972m = vq.j.a(aVarB);
                bVar2.f120973n = i16;
                bVar2.f120974p = i15;
                bVar2.f120977s = 3;
                objD = fVar.d(params, bVar2);
                if (objD != objE) {
                    c0Var3 = c0Var2;
                    bitmap5 = bitmap3;
                }
                return objE;
            }
            if (i18 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            maskDefinition3 = (MaskDefinition) bVar2.f120966f;
            bitmap5 = (Bitmap) bVar2.f120965e;
            c0Var3 = (k10.c0) bVar2.f120964d;
            oq.u.b(objD);
        }
        this.faceValidationVMS.b(((Boolean) objD).booleanValue());
        return c0Var3.a() instanceof lw3.c.Measuring ? c0Var3.d(new er.l() { // from class: lw3.v
            @Override // er.l
            public final Object b(Object obj) {
                return x.F9(bitmap5, maskDefinition3, (c) obj);
            }
        }) : c0Var3.c();
        dx.i iVar4 = (dx.i) objD;
        if (iVar4 instanceof dx.i.Left) {
            d9(new lw3.a.OnGenericError(new er.a() { // from class: lw3.u
                @Override // er.a
                public final Object a() {
                    return x.E9();
                }
            }));
            return c0Var2.c();
        }
        if (!(iVar4 instanceof dx.i.Right)) {
            throw new oq.p();
        }
        Bitmap bitmap8 = (Bitmap) ((dx.i.Right) iVar4).b();
        g2.j(bVar2.getContext());
        yz.d dVar = this.singleFaceDetector;
        bVar2.f120964d = c0Var2;
        bVar2.f120965e = bitmap2;
        bVar2.f120966f = maskDefinition2;
        bVar2.f120967g = vq.j.a(matrix);
        bVar2.f120968h = vq.j.a(fArr);
        bVar2.f120969j = vq.j.a(iVar4);
        bVar2.f120970k = vq.j.a(bitmap8);
        bVar2.f120973n = 0;
        bVar2.f120974p = 0;
        bVar2.f120977s = 2;
        Object objA = dVar.a(bitmap8, bVar2);
        if (objA != objE) {
            iVar = iVar4;
            objD = objA;
            fArr2 = fArr;
            matrix2 = matrix;
            i15 = 0;
            maskDefinition3 = maskDefinition2;
            bitmap3 = bitmap2;
            bitmap4 = bitmap8;
            i16 = 0;
            vx.a aVar2 = (vx.a) objD;
            Bitmap bitmap9 = bitmap4;
            dx.i iVar5 = iVar;
            vx.a aVarB2 = this.scaleFaceDetectorResultToContainerUC.b(new fw3.c.Params(aVar2, maskDefinition3.getContainer(), false, true));
            iw3.f fVar2 = this.isFaceValidWithPartOfTheRulesUC;
            iw3.f.Params params2 = new iw3.f.Params(aVarB2, maskDefinition3);
            bVar2.f120964d = c0Var2;
            bVar2.f120965e = bitmap3;
            bVar2.f120966f = maskDefinition3;
            bVar2.f120967g = vq.j.a(matrix2);
            bVar2.f120968h = vq.j.a(fArr2);
            bVar2.f120969j = vq.j.a(iVar5);
            bVar2.f120970k = vq.j.a(bitmap9);
            bVar2.f120971l = vq.j.a(aVar2);
            bVar2.f120972m = vq.j.a(aVarB2);
            bVar2.f120973n = i16;
            bVar2.f120974p = i15;
            bVar2.f120977s = 3;
            objD = fVar2.d(params2, bVar2);
            if (objD != objE) {
                c0Var3 = c0Var2;
                bitmap5 = bitmap3;
                this.faceValidationVMS.b(((Boolean) objD).booleanValue());
                if (c0Var3.a() instanceof lw3.c.Measuring) {
                }
            }
        }
        return objE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E9() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lw3.c.Initialized F9(Bitmap bitmap, MaskDefinition maskDefinition, lw3.c cVar) {
        return new lw3.c.Initialized(bitmap, maskDefinition, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final lw3.d.Data H9(lw3.c state) {
        return this.mapper.b(new pw3.d.Params(this.adjustmentVMS, this.faceValidationVMS, state, new er.l() { // from class: lw3.q
            @Override // er.l
            public final Object b(Object obj) {
                return x.I9(this.f120935a, (Rectangle) obj);
            }
        }, b9(lw3.a.b.f120862a), b9(lw3.a.e.f120865a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I9(x xVar, Rectangle rectangle) {
        xVar.d9(new lw3.a.OnContainerChanged(rectangle));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K9(final x xVar, k10.v vVar) {
        vVar.c(q0.c(lw3.c.class), new er.l() { // from class: lw3.r
            @Override // er.l
            public final Object b(Object obj) {
                return x.L9(this.f120936a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(lw3.c.Measuring.class), new er.l() { // from class: lw3.s
            @Override // er.l
            public final Object b(Object obj) {
                return x.M9(this.f120937a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(lw3.c.Initialized.class), new er.l() { // from class: lw3.t
            @Override // er.l
            public final Object b(Object obj) {
                return x.N9(this.f120938a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L9(x xVar, k10.z zVar) {
        d dVar = xVar.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(lw3.a.d.class), oVar, dVar);
        zVar.x(q0.c(lw3.a.OnGenericError.class), oVar, xVar.new e(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M9(x xVar, k10.z zVar) {
        f fVar = xVar.new f(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(lw3.a.e.class), oVar, fVar);
        zVar.v(q0.c(lw3.a.OnContainerChanged.class), oVar, xVar.new g(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 N9(x xVar, k10.z zVar) {
        k10.k.m(zVar, new o(mu.i.o(mu.i.S(xVar.adjustmentVMS.k(), xVar.new h(null)), 200L)), null, xVar.new i(null), 2, null);
        k10.k.s(zVar, xVar.faceValidationVMS.a(), null, xVar.new j(null), 2, null);
        k kVar = xVar.new k(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(lw3.a.e.class), oVar, kVar);
        zVar.v(q0.c(lw3.a.OnAdjustmentActionChanged.class), oVar, new l(null));
        zVar.v(q0.c(lw3.a.OnContainerChanged.class), oVar, xVar.new m(null));
        zVar.x(q0.c(lw3.a.b.class), oVar, xVar.new n(null));
        return i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: G9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(lw3.a.InterfaceC2951a interfaceC2951a, tq.e<? super i0> eVar) {
        return super.F(interfaceC2951a, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: J9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }

    @Override // zx.b
    public xw.b<lw3.a.InterfaceC2951a> Y1() {
        return this.navAction;
    }

    @Override // androidx.p016lifecycle.t0
    protected void Y8() {
        this.singleFaceDetector.b();
        super.Y8();
    }

    @Override // l00.g
    protected k10.t<lw3.c, lw3.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<lw3.d.Data> getState() {
        return this.state;
    }
}
