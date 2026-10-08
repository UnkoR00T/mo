package v4;

import android.graphics.Matrix;
import android.view.inputmethod.CursorAnchorInfo;
import n3.g2;
import p071kotlin.Metadata;
import q4.TextLayoutResult;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0012\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013JI\u0010 \u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\b0\u001a2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\b¢\u0006\u0004\b\"\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010$R\u0014\u0010&\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010%R\u0016\u0010(\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010'R\u0016\u0010*\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010'R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010'R\u0016\u0010\u000f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010'R\u0016\u0010\u0010\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010'R\u0016\u0010\u0011\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010'R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\"\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\b0\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00108R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010@\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010D\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006E"}, d2 = {"Lv4/f;", "", "La4/i;", "rootPositionCalculator", "Lv4/w;", "inputMethodManager", "<init>", "(La4/i;Lv4/w;)V", "Loq/i0;", "c", "()V", "", "immediate", "monitor", "includeInsertionMarker", "includeCharacterBounds", "includeEditorBounds", "includeLineBounds", "b", "(ZZZZZZ)V", "Lv4/t0;", "textFieldValue", "Lv4/i0;", "offsetMapping", "Lq4/t3;", "textLayoutResult", "Lkotlin/Function1;", "Ln3/g2;", "textFieldToRootTransform", "Lm3/g;", "innerTextFieldBounds", "decorationBoxBounds", "d", "(Lv4/t0;Lv4/i0;Lq4/t3;Ler/l;Lm3/g;Lm3/g;)V", "a", "La4/i;", "Lv4/w;", "Ljava/lang/Object;", "lock", "Z", "monitorEnabled", "e", "hasPendingImmediateRequest", "f", "g", "h", "i", "j", "Lv4/t0;", "k", "Lq4/t3;", "l", "Lv4/i0;", "m", "Ler/l;", "n", "Lm3/g;", "o", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "p", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "builder", "q", "[F", "matrix", "Landroid/graphics/Matrix;", "r", "Landroid/graphics/Matrix;", "androidMatrix", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
@oq.a
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a4.i rootPositionCalculator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final w inputMethodManager;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean monitorEnabled;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean hasPendingImmediateRequest;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean includeInsertionMarker;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean includeCharacterBounds;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean includeEditorBounds;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean includeLineBounds;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private TextFieldValue textFieldValue;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private TextLayoutResult textLayoutResult;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private i0 offsetMapping;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private m3.g innerTextFieldBounds;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private m3.g decorationBoxBounds;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Object lock = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private er.l<? super g2, oq.i0> textFieldToRootTransform = b.f203657b;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final CursorAnchorInfo.Builder builder = new CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final float[] matrix = g2.c(null, 1, null);

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final Matrix androidMatrix = new Matrix();

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ln3/g2;", "it", "Loq/i0;", "c", "([F)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends fr.w implements er.l<g2, oq.i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f203656b = new a();

        a() {
            super(1);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(g2 g2Var) {
            c(g2Var.getValues());
            return oq.i0.f148189a;
        }

        public final void c(float[] fArr) {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ln3/g2;", "it", "Loq/i0;", "c", "([F)V"}, k = 3, mv = {2, 1, 0})
    static final class b extends fr.w implements er.l<g2, oq.i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f203657b = new b();

        b() {
            super(1);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(g2 g2Var) {
            c(g2Var.getValues());
            return oq.i0.f148189a;
        }

        public final void c(float[] fArr) {
        }
    }

    public f(a4.i iVar, w wVar) {
        this.rootPositionCalculator = iVar;
        this.inputMethodManager = wVar;
    }

    private final void c() {
        if (this.inputMethodManager.h()) {
            this.textFieldToRootTransform.b(g2.a(this.matrix));
            this.rootPositionCalculator.y(this.matrix);
            n3.m0.a(this.androidMatrix, this.matrix);
            this.inputMethodManager.updateCursorAnchorInfo(e.b(this.builder, this.textFieldValue, this.offsetMapping, this.textLayoutResult, this.androidMatrix, this.innerTextFieldBounds, this.decorationBoxBounds, this.includeInsertionMarker, this.includeCharacterBounds, this.includeEditorBounds, this.includeLineBounds));
            this.hasPendingImmediateRequest = false;
        }
    }

    public final void a() {
        synchronized (this.lock) {
            this.textFieldValue = null;
            this.offsetMapping = null;
            this.textLayoutResult = null;
            this.textFieldToRootTransform = a.f203656b;
            this.innerTextFieldBounds = null;
            this.decorationBoxBounds = null;
            oq.i0 i0Var = oq.i0.f148189a;
        }
    }

    public final void b(boolean immediate, boolean monitor, boolean includeInsertionMarker, boolean includeCharacterBounds, boolean includeEditorBounds, boolean includeLineBounds) {
        synchronized (this.lock) {
            try {
                this.includeInsertionMarker = includeInsertionMarker;
                this.includeCharacterBounds = includeCharacterBounds;
                this.includeEditorBounds = includeEditorBounds;
                this.includeLineBounds = includeLineBounds;
                if (immediate) {
                    this.hasPendingImmediateRequest = true;
                    if (this.textFieldValue != null) {
                        c();
                    }
                }
                this.monitorEnabled = monitor;
                oq.i0 i0Var = oq.i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final void d(TextFieldValue textFieldValue, i0 offsetMapping, TextLayoutResult textLayoutResult, er.l<? super g2, oq.i0> textFieldToRootTransform, m3.g innerTextFieldBounds, m3.g decorationBoxBounds) {
        synchronized (this.lock) {
            try {
                this.textFieldValue = textFieldValue;
                this.offsetMapping = offsetMapping;
                this.textLayoutResult = textLayoutResult;
                this.textFieldToRootTransform = textFieldToRootTransform;
                this.innerTextFieldBounds = innerTextFieldBounds;
                this.decorationBoxBounds = decorationBoxBounds;
                if (this.hasPendingImmediateRequest || this.monitorEnabled) {
                    c();
                }
                oq.i0 i0Var = oq.i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
