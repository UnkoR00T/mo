package qw3;

import android.graphics.Matrix;
import android.graphics.RectF;
import er.l;
import fr.k;
import java.util.Arrays;
import ju.p0;
import mu.b0;
import mu.r0;
import mx.Label;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vq.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u00018B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u001aH\u0002¢\u0006\u0004\b$\u0010%J1\u0010)\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020\u001a2\b\b\u0002\u0010(\u001a\u00020\u0017H\u0002¢\u0006\u0004\b)\u0010*J1\u0010.\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020,2\b\b\u0002\u0010(\u001a\u00020\u0017H\u0002¢\u0006\u0004\b.\u0010/J\u001f\u00100\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0016¢\u0006\u0004\b0\u0010\u001eJ\u001f\u00101\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0016¢\u0006\u0004\b1\u0010\u001eJ\u000f\u00102\u001a\u00020\u000eH\u0016¢\u0006\u0004\b2\u0010\u0010J\u0017\u00103\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\nH\u0016¢\u0006\u0004\b3\u00104J'\u00106\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020,2\u0006\u00105\u001a\u00020,2\u0006\u0010+\u001a\u00020\u001aH\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u000eH\u0016¢\u0006\u0004\b8\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010:R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010;R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020=0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R \u0010E\u001a\b\u0012\u0004\u0012\u00020=0A8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u0010B\u001a\u0004\bC\u0010DR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020F0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010?R \u0010J\u001a\b\u0012\u0004\u0012\u00020F0A8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010B\u001a\u0004\bI\u0010DR \u0010L\u001a\b\u0012\u0004\u0012\u00020\u000b0A8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bK\u0010B\u001a\u0004\b>\u0010DR\u0016\u0010P\u001a\u00020M8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010S\u001a\u00020Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010RR\u0014\u0010U\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010T¨\u0006V"}, d2 = {"Lqw3/e;", "Lqw3/b;", "Lju/p0;", "scope", "Lmx/c;", "labelProvider", "Lmw3/a;", "matrixAnimator", "<init>", "(Lju/p0;Lmx/c;Lmw3/a;)V", "", "Lmx/a;", "r", "(I)Lmx/a;", "Loq/i0;", "m", "()V", "Landroid/graphics/Matrix;", "matrix", "", "imageCorners", "j", "(Landroid/graphics/Matrix;[F)[F", "", "l", "(Landroid/graphics/Matrix;[F)Z", "", "width", "height", "y", "(FF)V", "u", "(Landroid/graphics/Matrix;FF)V", "x", "(Landroid/graphics/Matrix;)V", "angle", "q", "(F)V", "deltaX", "deltaY", "shouldUpdateMatrix", "v", "(Landroid/graphics/Matrix;FFZ)V", "zoom", "Lm3/e;", "centroid", "s", "(Landroid/graphics/Matrix;FJZ)V", "b", "p", "c", "f", "(I)V", "pan", "e", "(JJF)V", "a", "Lju/p0;", "Lmx/c;", "Lmw3/a;", "Lmu/b0;", "Lqw3/i;", "d", "Lmu/b0;", "_state", "Lmu/p0;", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "Lqw3/a;", "_action", "g", "k", "action", "h", "rotateValuePopupInfo", "Landroid/graphics/RectF;", "i", "Landroid/graphics/RectF;", "cropRect", "Lqw3/h;", "Lqw3/h;", "scaleSettings", "Landroid/graphics/Matrix;", "tempMatrix", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@oq.a
public final class e implements qw3.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final a f169157l = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f169158m = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p0 scope;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final mw3.a matrixAnimator;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final b0<State> _state;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<State> state;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final b0<qw3.a> _action;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<qw3.a> action;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<Label> rotateValuePopupInfo;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private RectF cropRect;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private ScaleSettings scaleSettings;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Matrix tempMatrix;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lqw3/e$a;", "", "<init>", "()V", "", "MAX_SCALE_MULTIPLIER", "F", "", "RECT_INDENTS_COUNT", "I", "RIGHT_ANGLE_VALUE", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<Label> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f169170a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f169171b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f169172a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f169173b;

            /* JADX INFO: renamed from: qw3.e$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4276a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f169174d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f169175e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f169176f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f169178h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f169179j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f169180k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f169181l;

                public C4276a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f169174d = obj;
                    this.f169175e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, e eVar) {
                this.f169172a = hVar;
                this.f169173b = eVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4276a c4276a;
                if (eVar instanceof C4276a) {
                    c4276a = (C4276a) eVar;
                    int i15 = c4276a.f169175e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4276a.f169175e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4276a = new C4276a(eVar);
                    }
                } else {
                    c4276a = new C4276a(eVar);
                }
                Object obj2 = c4276a.f169174d;
                Object objE = uq.b.e();
                int i16 = c4276a.f169175e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f169172a;
                    Label labelR = this.f169173b.r(((State) obj).getSliderDegreesValue());
                    c4276a.f169176f = j.a(obj);
                    c4276a.f169178h = j.a(c4276a);
                    c4276a.f169179j = j.a(obj);
                    c4276a.f169180k = j.a(hVar);
                    c4276a.f169181l = 0;
                    c4276a.f169175e = 1;
                    if (hVar.F(labelR, c4276a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public b(mu.g gVar, e eVar) {
            this.f169170a = gVar;
            this.f169171b = eVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super Label> hVar, tq.e eVar) {
            Object objA = this.f169170a.a(new a(hVar, this.f169171b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    public e(p0 p0Var, mx.c cVar, mw3.a aVar) {
        this.scope = p0Var;
        this.labelProvider = cVar;
        this.matrixAnimator = aVar;
        b0<State> b0VarA = r0.a(new State(new Matrix(), 0, new ImageData(null, null, null, null, 15, null)));
        this._state = b0VarA;
        this.state = mu.i.b(b0VarA);
        b0<qw3.a> b0VarA2 = r0.a(qw3.a.INITIAL);
        this._action = b0VarA2;
        this.action = mu.i.b(b0VarA2);
        this.rotateValuePopupInfo = g00.b.a(new b(b0VarA, this), r(0), p0Var);
        this.scaleSettings = new ScaleSettings(0.0f, 0.0f, 3, null);
        this.tempMatrix = new Matrix();
    }

    private final float[] j(Matrix matrix, float[] imageCorners) {
        float fA = yz.c.a(matrix);
        this.tempMatrix.reset();
        this.tempMatrix.setRotate(-fA);
        float[] fArrCopyOf = Arrays.copyOf(imageCorners, imageCorners.length);
        g gVar = g.f169186a;
        RectF rectF = this.cropRect;
        if (rectF == null) {
            rectF = null;
        }
        float[] fArrB = gVar.b(rectF);
        this.tempMatrix.mapPoints(fArrCopyOf);
        this.tempMatrix.mapPoints(fArrB);
        RectF rectFD = gVar.d(fArrCopyOf);
        RectF rectFD2 = gVar.d(fArrB);
        float f15 = rectFD.left - rectFD2.left;
        float f16 = rectFD.top - rectFD2.top;
        float f17 = rectFD.right - rectFD2.right;
        float f18 = rectFD.bottom - rectFD2.bottom;
        if (f15 <= 0.0f) {
            f15 = 0.0f;
        }
        if (f16 <= 0.0f) {
            f16 = 0.0f;
        }
        if (f17 >= 0.0f) {
            f17 = 0.0f;
        }
        if (f18 >= 0.0f) {
            f18 = 0.0f;
        }
        float[] fArr = {f15, f16, f17, f18};
        this.tempMatrix.reset();
        this.tempMatrix.setRotate(fA);
        this.tempMatrix.mapPoints(fArr);
        return fArr;
    }

    private final boolean l(Matrix matrix, float[] imageCorners) {
        Matrix matrix2 = new Matrix();
        matrix2.setRotate(-yz.c.a(matrix));
        float[] fArrCopyOf = Arrays.copyOf(imageCorners, imageCorners.length);
        matrix2.mapPoints(fArrCopyOf);
        g gVar = g.f169186a;
        RectF rectF = this.cropRect;
        if (rectF == null) {
            rectF = null;
        }
        float[] fArrB = gVar.b(rectF);
        matrix2.mapPoints(fArrB);
        return gVar.d(fArrCopyOf).contains(gVar.d(fArrB));
    }

    private final void m() {
        char c15;
        char c16;
        float fMax;
        Matrix matrix = new Matrix(this._state.getValue().getMatrix());
        Matrix matrix2 = new Matrix(this._state.getValue().getMatrix());
        ImageData imageData = this._state.getValue().getImageData();
        float[] corners = imageData.getCorners();
        float[] center = imageData.getCenter();
        if (l(matrix2, corners)) {
            b0<qw3.a> b0Var = this._action;
            while (!b0Var.s(b0Var.getValue(), qw3.a.IDLE)) {
            }
            return;
        }
        float f15 = center[0];
        float f16 = center[1];
        float fB = yz.c.b(matrix2);
        RectF rectF = this.cropRect;
        if (rectF == null) {
            rectF = null;
        }
        float fCenterX = rectF.centerX() - f15;
        RectF rectF2 = this.cropRect;
        if (rectF2 == null) {
            rectF2 = null;
        }
        float fCenterY = rectF2.centerY() - f16;
        this.tempMatrix.reset();
        this.tempMatrix.setTranslate(fCenterX, fCenterY);
        float[] fArrCopyOf = Arrays.copyOf(corners, corners.length);
        this.tempMatrix.mapPoints(fArrCopyOf);
        boolean zL = l(matrix2, fArrCopyOf);
        if (zL) {
            float[] fArrJ = j(matrix2, corners);
            fCenterX = -(fArrJ[0] + fArrJ[2]);
            fCenterY = -(fArrJ[1] + fArrJ[3]);
            fMax = 0.0f;
            c15 = 0;
            c16 = 1;
        } else {
            RectF rectF3 = this.cropRect;
            if (rectF3 == null) {
                rectF3 = null;
            }
            RectF rectF4 = new RectF(rectF3);
            this.tempMatrix.reset();
            c15 = 0;
            this.tempMatrix.setRotate(yz.c.a(matrix2));
            this.tempMatrix.mapRect(rectF4);
            float[] fArrC = g.f169186a.c(corners);
            c16 = 1;
            fMax = (((float) Math.max(rectF4.width() / fArrC[0], rectF4.height() / fArrC[1])) * fB) - fB;
        }
        float f17 = fMax;
        w(this, matrix2, fCenterX - (center[c15] - f15), fCenterY - (center[c16] - f16), false, 8, null);
        if (!zL) {
            float f18 = f17 + fB;
            if (f18 <= this.scaleSettings.c()) {
                float f19 = f18 / fB;
                RectF rectF5 = this.cropRect;
                if (rectF5 == null) {
                    rectF5 = null;
                }
                float fCenterX2 = rectF5.centerX();
                RectF rectF6 = this.cropRect;
                t(this, matrix2, f19, m3.e.e((((long) Float.floatToRawIntBits((rectF6 != null ? rectF6 : null).centerY())) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(fCenterX2)) << 32)), false, 8, null);
            }
        }
        this.matrixAnimator.a(matrix, matrix2, new l() { // from class: qw3.c
            @Override // er.l
            public final Object b(Object obj) {
                return e.n(this.f169155a, (Matrix) obj);
            }
        }, new er.a() { // from class: qw3.d
            @Override // er.a
            public final Object a() {
                return e.o(this.f169156a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(e eVar, Matrix matrix) {
        eVar.x(matrix);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(e eVar) {
        b0<qw3.a> b0Var = eVar._action;
        while (!b0Var.s(b0Var.getValue(), qw3.a.IDLE)) {
        }
        return i0.f148189a;
    }

    private final void q(float angle) {
        Matrix matrix = new Matrix(this._state.getValue().getMatrix());
        RectF rectF = this.cropRect;
        if (rectF == null) {
            rectF = null;
        }
        float fCenterX = rectF.centerX();
        RectF rectF2 = this.cropRect;
        matrix.postRotate(angle, fCenterX, (rectF2 != null ? rectF2 : null).centerY());
        x(matrix);
        b0<qw3.a> b0Var = this._action;
        while (!b0Var.s(b0Var.getValue(), qw3.a.WAITING_FOR_BACK)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Label r(int i15) {
        int i16;
        mx.c cVar = this.labelProvider;
        if (i15 == 0) {
            i16 = bw3.a.B;
        } else {
            i16 = i15 > 0 ? bw3.a.C : bw3.a.A;
        }
        return cVar.e(i16, Integer.valueOf(Math.abs(i15)));
    }

    private final void s(Matrix matrix, float zoom, long centroid, boolean shouldUpdateMatrix) {
        float fB = yz.c.b(matrix) * zoom;
        ScaleSettings scaleSettings = this.scaleSettings;
        float minScale = scaleSettings.getMinScale();
        float maxScale = scaleSettings.getMaxScale();
        if ((zoom <= 1.0f || fB > maxScale) && (zoom >= 1.0f || fB < minScale)) {
            return;
        }
        matrix.postScale(zoom, zoom, Float.intBitsToFloat((int) (centroid >> 32)), Float.intBitsToFloat((int) (centroid & BodyPartID.bodyIdMax)));
        if (shouldUpdateMatrix) {
            x(matrix);
        }
    }

    static /* synthetic */ void t(e eVar, Matrix matrix, float f15, long j15, boolean z15, int i15, Object obj) {
        if ((i15 & 8) != 0) {
            z15 = false;
        }
        eVar.s(matrix, f15, j15, z15);
    }

    private final void u(Matrix matrix, float width, float height) {
        RectF rectF = this.cropRect;
        if (rectF == null) {
            rectF = null;
        }
        float fWidth = rectF.width();
        RectF rectF2 = this.cropRect;
        float fHeight = (rectF2 != null ? rectF2 : null).height();
        float fMax = Math.max(fWidth / width, fHeight / height);
        matrix.reset();
        matrix.postScale(fMax, fMax);
        matrix.postTranslate((fWidth - (width * fMax)) / 2.0f, (fHeight - (height * fMax)) / 2.0f);
        x(matrix);
    }

    private final void v(Matrix matrix, float deltaX, float deltaY, boolean shouldUpdateMatrix) {
        if (deltaX == 0.0f && deltaY == 0.0f) {
            return;
        }
        matrix.postTranslate(deltaX, deltaY);
        if (shouldUpdateMatrix) {
            x(matrix);
        }
    }

    static /* synthetic */ void w(e eVar, Matrix matrix, float f15, float f16, boolean z15, int i15, Object obj) {
        if ((i15 & 8) != 0) {
            z15 = false;
        }
        eVar.v(matrix, f15, f16, z15);
    }

    private final void x(Matrix matrix) {
        ImageData imageData = getState().getValue().getImageData();
        float[] corners = imageData.getCorners();
        float[] center = imageData.getCenter();
        float[] initialCorners = imageData.getInitialCorners();
        float[] initialCenter = imageData.getInitialCenter();
        matrix.mapPoints(corners, initialCorners);
        matrix.mapPoints(center, initialCenter);
        b0<State> b0Var = this._state;
        while (true) {
            State value = b0Var.getValue();
            State state = value;
            float[] fArr = corners;
            float[] fArr2 = center;
            if (b0Var.s(value, State.b(state, matrix, 0, ImageData.f(state.getImageData(), corners, center, null, null, 12, null), 2, null))) {
                return;
            }
            corners = fArr;
            center = fArr2;
        }
    }

    private final void y(float width, float height) {
        RectF rectF = this.cropRect;
        if (rectF == null) {
            rectF = null;
        }
        double dWidth = rectF.width() / width;
        RectF rectF2 = this.cropRect;
        if (rectF2 == null) {
            rectF2 = null;
        }
        float fMin = (float) Math.min(dWidth, rectF2.width() / height);
        RectF rectF3 = this.cropRect;
        if (rectF3 == null) {
            rectF3 = null;
        }
        double dHeight = rectF3.height() / height;
        RectF rectF4 = this.cropRect;
        float fMin2 = (float) Math.min(fMin, (float) Math.min(dHeight, (rectF4 != null ? rectF4 : null).height() / width));
        this.scaleSettings = new ScaleSettings(fMin2, 4.0f * fMin2);
    }

    @Override // qw3.b
    public void a() {
        b0<qw3.a> b0Var = this._action;
        while (!b0Var.s(b0Var.getValue(), qw3.a.WAITING_FOR_BACK)) {
        }
        m();
    }

    @Override // qw3.b
    public void b(float width, float height) {
        this.cropRect = new RectF(0.0f, 0.0f, width, height);
    }

    @Override // qw3.b
    public void c() {
        this.matrixAnimator.cancel();
        b0<qw3.a> b0Var = this._action;
        while (!b0Var.s(b0Var.getValue(), qw3.a.ROTATING)) {
        }
        q(-90.0f);
        m();
    }

    @Override // qw3.b
    public mu.p0<Label> d() {
        return this.rotateValuePopupInfo;
    }

    @Override // qw3.b
    public void e(long centroid, long pan, float zoom) {
        this.matrixAnimator.cancel();
        b0<qw3.a> b0Var = this._action;
        while (!b0Var.s(b0Var.getValue(), qw3.a.TRANSFORM)) {
        }
        v(new Matrix(this._state.getValue().getMatrix()), Float.intBitsToFloat((int) (pan >> 32)), Float.intBitsToFloat((int) (pan & BodyPartID.bodyIdMax)), true);
        s(new Matrix(this._state.getValue().getMatrix()), zoom, centroid, true);
    }

    @Override // qw3.b
    public void f(int angle) {
        this.matrixAnimator.cancel();
        int i15 = (-this._state.getValue().getSliderDegreesValue()) + angle;
        if (i15 == 0) {
            return;
        }
        b0<qw3.a> b0Var = this._action;
        while (!b0Var.s(b0Var.getValue(), qw3.a.ROTATING)) {
        }
        b0<State> b0Var2 = this._state;
        while (true) {
            State value = b0Var2.getValue();
            int i16 = angle;
            if (b0Var2.s(value, State.b(value, null, i16, null, 5, null))) {
                q(i15);
                return;
            }
            angle = i16;
        }
    }

    @Override // qw3.b
    public mu.p0<State> getState() {
        return this.state;
    }

    public mu.p0<qw3.a> k() {
        return this.action;
    }

    public void p(float width, float height) {
        State value;
        State state;
        ImageData imageData;
        g gVar;
        RectF rectF = new RectF(0.0f, 0.0f, width, height);
        b0<State> b0Var = this._state;
        do {
            value = b0Var.getValue();
            state = value;
            imageData = state.getImageData();
            gVar = g.f169186a;
        } while (!b0Var.s(value, State.b(state, null, 0, imageData.e(gVar.b(rectF), gVar.a(rectF), gVar.b(rectF), gVar.a(rectF)), 3, null)));
        y(width, height);
        u(new Matrix(this._state.getValue().getMatrix()), width, height);
    }
}
