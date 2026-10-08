package p079n1;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.r2;
import c5.d;
import c5.h;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import er.l;
import ip.a;
import l3.o;
import n3.k2;
import n3.o0;
import oq.i0;
import p036e4.b0;
import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.c6;
import p076m2.d4;
import pq.v;
import q4.TextStyle;
import q4.e;
import q4.z3;
import v4.TextFieldValue;
import v4.b1;
import v4.m;
import v4.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJi\u0010!\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u00106\u001a\u0002018\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R$\u0010>\u001a\u0004\u0018\u0001078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R+\u0010E\u001a\u00020\n2\u0006\u0010?\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010\f\"\u0004\bC\u0010DR+\u0010L\u001a\u00020F2\u0006\u0010?\u001a\u00020F8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bG\u0010A\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u0018\u0010O\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010NR\u001c\u0010S\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010Q0P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010AR$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR+\u0010^\u001a\u00020Y2\u0006\u0010?\u001a\u00020Y8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bZ\u0010A\u001a\u0004\bG\u0010[\"\u0004\b\\\u0010]R+\u0010a\u001a\u00020\n2\u0006\u0010?\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b/\u0010A\u001a\u0004\b_\u0010\f\"\u0004\b`\u0010DR+\u0010e\u001a\u00020\n2\u0006\u0010?\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bb\u0010A\u001a\u0004\bc\u0010\f\"\u0004\bd\u0010DR+\u0010i\u001a\u00020\n2\u0006\u0010?\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bf\u0010A\u001a\u0004\bg\u0010\f\"\u0004\bh\u0010DR+\u0010l\u001a\u00020\n2\u0006\u0010?\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bH\u0010A\u001a\u0004\bj\u0010\f\"\u0004\bk\u0010DR$\u0010q\u001a\u00020\n2\u0006\u0010m\u001a\u00020\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010\fR+\u0010u\u001a\u00020\n2\u0006\u0010?\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\br\u0010A\u001a\u0004\bs\u0010\f\"\u0004\bt\u0010DR\u0014\u0010y\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR+\u0010{\u001a\u00020\n2\u0006\u0010?\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b4\u0010A\u001a\u0004\b8\u0010\f\"\u0004\bz\u0010DR+\u0010~\u001a\u00020\n2\u0006\u0010?\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b|\u0010A\u001a\u0004\bZ\u0010\f\"\u0004\b}\u0010DR$\u0010\u0081\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R%\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00178\u0006¢\u0006\u000e\n\u0005\bj\u0010\u0080\u0001\u001a\u0005\bw\u0010\u0082\u0001R'\u0010\u0084\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u0083\u0001\u0012\u0004\u0012\u00020\u00190\u00178\u0006¢\u0006\u000e\n\u0005\b_\u0010\u0080\u0001\u001a\u0005\bn\u0010\u0082\u0001R'\u0010\u0085\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u0083\u0001\u0012\u0004\u0012\u00020\n0\u00178\u0006¢\u0006\u000e\n\u0005\bg\u0010\u0080\u0001\u001a\u0005\br\u0010\u0082\u0001R\u001b\u0010\u0089\u0001\u001a\u00030\u0086\u00018\u0006¢\u0006\u000e\n\u0005\bc\u0010\u0087\u0001\u001a\u0005\bR\u0010\u0088\u0001R&\u0010 \u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b%\u0010\u008a\u0001\u001a\u0005\b|\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R1\u0010\u0090\u0001\u001a\u00030\u008e\u00012\u0007\u0010?\u001a\u00030\u008e\u00018F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0004\bU\u0010A\u001a\u0005\b\u007f\u0010\u008b\u0001\"\u0006\b\u008f\u0001\u0010\u008d\u0001R1\u0010\u0091\u0001\u001a\u00030\u008e\u00012\u0007\u0010?\u001a\u00030\u008e\u00018F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0004\b\u000b\u0010A\u001a\u0005\b@\u0010\u008b\u0001\"\u0006\b\u008a\u0001\u0010\u008d\u0001R,\u0010\u0095\u0001\u001a\u0004\u0018\u00010M2\b\u0010m\u001a\u0004\u0018\u00010M8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\bb\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001R,\u0010\u0099\u0001\u001a\u0004\u0018\u00010Q2\b\u0010m\u001a\u0004\u0018\u00010Q8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\bf\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001¨\u0006\u009a\u0001"}, d2 = {"Ln1/s3;", "", "Ln1/j4;", "textDelegate", "Lm2/d4;", "recomposeScope", "Landroidx/compose/ui/platform/r2;", "keyboardController", "<init>", "(Ln1/j4;Lm2/d4;Landroidx/compose/ui/platform/r2;)V", "", "B", "()Z", "Lq4/e;", "untransformedText", "visualText", "Lq4/b4;", "textStyle", "softWrap", "Lc5/d;", "density", "Lu4/l$b;", "fontFamilyResolver", "Lkotlin/Function1;", "Lv4/t0;", "Loq/i0;", "onValueChange", "Ln1/l3;", "keyboardActions", "Ll3/o;", "focusManager", "Landroidx/compose/ui/graphics/Color;", "selectionBackgroundColor", "X", "(Lq4/e;Lq4/e;Lq4/b4;ZLc5/d;Lu4/l$b;Ler/l;Ln1/l3;Ll3/o;J)V", "a", "Ln1/j4;", "z", "()Ln1/j4;", "setTextDelegate", "(Ln1/j4;)V", "b", "Lm2/d4;", "getRecomposeScope", "()Lm2/d4;", "c", "Landroidx/compose/ui/platform/r2;", "l", "()Landroidx/compose/ui/platform/r2;", "Lv4/m;", "d", "Lv4/m;", "s", "()Lv4/m;", "processor", "Lv4/b1;", "e", "Lv4/b1;", "j", "()Lv4/b1;", "N", "(Lv4/b1;)V", "inputSession", "<set-?>", "f", "Lm2/a3;", "h", i.f37094u, "(Z)V", "hasFocus", "Lc5/h;", "g", "o", "()F", "R", "(F)V", "minHeightForSingleLineField", "Le4/b0;", "Le4/b0;", "_layoutCoordinates", "Lm2/a3;", "Ln1/k6;", "i", "layoutResultState", "Lq4/e;", "A", "()Lq4/e;", "setUntransformedText", "(Lq4/e;)V", "Ln1/r2;", "k", "()Ln1/r2;", "K", "(Ln1/r2;)V", "handleState", "w", "U", "showFloatingToolbar", "m", "y", "W", "showSelectionHandleStart", "n", "x", "V", "showSelectionHandleEnd", "v", "T", "showCursorHandle", "value", "p", "Z", a.f96138c, "isLayoutResultStale", "q", "C", "M", "isInTouchMode", "Ln1/j3;", "r", "Ln1/j3;", "keyboardActionRunner", "I", "autofillHighlightOn", "t", "O", "justAutofilled", "u", "Ler/l;", "onValueChangeOriginal", "()Ler/l;", "Lv4/t;", "onImeActionPerformed", "onImeActionPerformedWithResult", "Ln3/k2;", "Ln3/k2;", "()Ln3/k2;", "highlightPaint", "J", "()J", "setSelectionBackgroundColor-8_81llA", "(J)V", "Lq4/z3;", a.f96137b, "selectionPreviewHighlightRange", "deletionPreviewHighlightRange", "()Le4/b0;", i.f37086m, "(Le4/b0;)V", "layoutCoordinates", "()Ln1/k6;", "Q", "(Ln1/k6;)V", "layoutResult", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s3 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final a3 selectionPreviewHighlightRange;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final a3 deletionPreviewHighlightRange;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private j4 textDelegate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d4 recomposeScope;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final r2 keyboardController;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final m processor = new m();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private b1 inputSession;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final a3 hasFocus;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final a3 minHeightForSingleLineField;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private b0 _layoutCoordinates;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final a3<k6> layoutResultState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private e untransformedText;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final a3 handleState;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final a3 showFloatingToolbar;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final a3 showSelectionHandleStart;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final a3 showSelectionHandleEnd;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final a3 showCursorHandle;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean isLayoutResultStale;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final a3 isInTouchMode;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final j3 keyboardActionRunner;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final a3 autofillHighlightOn;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final a3 justAutofilled;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private l<? super TextFieldValue, i0> onValueChangeOriginal;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final l<TextFieldValue, i0> onValueChange;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final l<t, i0> onImeActionPerformed;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final l<t, Boolean> onImeActionPerformedWithResult;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final k2 highlightPaint;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private long selectionBackgroundColor;

    public s3(j4 j4Var, d4 d4Var, r2 r2Var) {
        this.textDelegate = j4Var;
        this.recomposeScope = d4Var;
        this.keyboardController = r2Var;
        Boolean bool = Boolean.FALSE;
        this.hasFocus = c6.e(bool, null, 2, null);
        this.minHeightForSingleLineField = c6.e(h.j(h.n(0)), null, 2, null);
        this.layoutResultState = c6.e(null, null, 2, null);
        this.handleState = c6.e(r2.None, null, 2, null);
        this.showFloatingToolbar = c6.e(bool, null, 2, null);
        this.showSelectionHandleStart = c6.e(bool, null, 2, null);
        this.showSelectionHandleEnd = c6.e(bool, null, 2, null);
        this.showCursorHandle = c6.e(bool, null, 2, null);
        this.isLayoutResultStale = true;
        this.isInTouchMode = c6.e(Boolean.TRUE, null, 2, null);
        this.keyboardActionRunner = new j3(r2Var);
        this.autofillHighlightOn = c6.e(bool, null, 2, null);
        this.justAutofilled = c6.e(bool, null, 2, null);
        this.onValueChangeOriginal = new l() { // from class: n1.o3
            @Override // er.l
            public final Object b(Object obj) {
                return s3.H((TextFieldValue) obj);
            }
        };
        this.onValueChange = new l() { // from class: n1.p3
            @Override // er.l
            public final Object b(Object obj) {
                return s3.G(this.f130316a, (TextFieldValue) obj);
            }
        };
        this.onImeActionPerformed = new l() { // from class: n1.q3
            @Override // er.l
            public final Object b(Object obj) {
                return s3.E(this.f130329a, (t) obj);
            }
        };
        this.onImeActionPerformedWithResult = new l() { // from class: n1.r3
            @Override // er.l
            public final Object b(Object obj) {
                return Boolean.valueOf(s3.F(this.f130350a, (t) obj));
            }
        };
        this.highlightPaint = o0.a();
        this.selectionBackgroundColor = Color.INSTANCE.h();
        z3.Companion companion = z3.INSTANCE;
        this.selectionPreviewHighlightRange = c6.e(z3.b(companion.a()), null, 2, null);
        this.deletionPreviewHighlightRange = c6.e(z3.b(companion.a()), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E(s3 s3Var, t tVar) {
        s3Var.keyboardActionRunner.d(tVar.getValue());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean F(s3 s3Var, t tVar) {
        return s3Var.keyboardActionRunner.d(tVar.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G(s3 s3Var, TextFieldValue textFieldValue) {
        String strM = textFieldValue.m();
        e eVar = s3Var.untransformedText;
        if (!fr.t.c(strM, eVar != null ? eVar.getText() : null)) {
            s3Var.K(r2.None);
            if (s3Var.k()) {
                s3Var.O(false);
            } else {
                s3Var.I(false);
            }
        }
        z3.Companion companion = z3.INSTANCE;
        s3Var.S(companion.a());
        s3Var.J(companion.a());
        s3Var.onValueChangeOriginal.b(textFieldValue);
        s3Var.recomposeScope.invalidate();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H(TextFieldValue textFieldValue) {
        return i0.f148189a;
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final e getUntransformedText() {
        return this.untransformedText;
    }

    public final boolean B() {
        return (z3.h(u()) && z3.h(f())) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean C() {
        return ((Boolean) this.isInTouchMode.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final boolean getIsLayoutResultStale() {
        return this.isLayoutResultStale;
    }

    public final void I(boolean z15) {
        this.autofillHighlightOn.setValue(Boolean.valueOf(z15));
    }

    public final void J(long j15) {
        this.deletionPreviewHighlightRange.setValue(z3.b(j15));
    }

    public final void K(r2 r2Var) {
        this.handleState.setValue(r2Var);
    }

    public final void L(boolean z15) {
        this.hasFocus.setValue(Boolean.valueOf(z15));
    }

    public final void M(boolean z15) {
        this.isInTouchMode.setValue(Boolean.valueOf(z15));
    }

    public final void N(b1 b1Var) {
        this.inputSession = b1Var;
    }

    public final void O(boolean z15) {
        this.justAutofilled.setValue(Boolean.valueOf(z15));
    }

    public final void P(b0 b0Var) {
        this._layoutCoordinates = b0Var;
    }

    public final void Q(k6 k6Var) {
        this.layoutResultState.setValue(k6Var);
        this.isLayoutResultStale = false;
    }

    public final void R(float f15) {
        this.minHeightForSingleLineField.setValue(h.j(f15));
    }

    public final void S(long j15) {
        this.selectionPreviewHighlightRange.setValue(z3.b(j15));
    }

    public final void T(boolean z15) {
        this.showCursorHandle.setValue(Boolean.valueOf(z15));
    }

    public final void U(boolean z15) {
        this.showFloatingToolbar.setValue(Boolean.valueOf(z15));
    }

    public final void V(boolean z15) {
        this.showSelectionHandleEnd.setValue(Boolean.valueOf(z15));
    }

    public final void W(boolean z15) {
        this.showSelectionHandleStart.setValue(Boolean.valueOf(z15));
    }

    public final void X(e untransformedText, e visualText, TextStyle textStyle, boolean softWrap, d density, u4.l.b fontFamilyResolver, l<? super TextFieldValue, i0> onValueChange, l3 keyboardActions, o focusManager, long selectionBackgroundColor) {
        this.onValueChangeOriginal = onValueChange;
        this.selectionBackgroundColor = selectionBackgroundColor;
        j3 j3Var = this.keyboardActionRunner;
        j3Var.f(keyboardActions);
        j3Var.e(focusManager);
        this.untransformedText = untransformedText;
        j4 j4VarC = k4.c(this.textDelegate, visualText, textStyle, density, fontFamilyResolver, softWrap, 0, 0, 0, v.n(), 448, null);
        if (this.textDelegate != j4VarC) {
            this.isLayoutResultStale = true;
        }
        this.textDelegate = j4VarC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean e() {
        return ((Boolean) this.autofillHighlightOn.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long f() {
        return ((z3) this.deletionPreviewHighlightRange.getValue()).getPackedValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final r2 g() {
        return (r2) this.handleState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean h() {
        return ((Boolean) this.hasFocus.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final k2 getHighlightPaint() {
        return this.highlightPaint;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final b1 getInputSession() {
        return this.inputSession;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean k() {
        return ((Boolean) this.justAutofilled.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final r2 getKeyboardController() {
        return this.keyboardController;
    }

    public final b0 m() {
        b0 b0Var = this._layoutCoordinates;
        if (b0Var == null || !b0Var.c()) {
            return null;
        }
        return b0Var;
    }

    public final k6 n() {
        return this.layoutResultState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float o() {
        return ((h) this.minHeightForSingleLineField.getValue()).getValue();
    }

    public final l<t, i0> p() {
        return this.onImeActionPerformed;
    }

    public final l<t, Boolean> q() {
        return this.onImeActionPerformedWithResult;
    }

    public final l<TextFieldValue, i0> r() {
        return this.onValueChange;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final m getProcessor() {
        return this.processor;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final long getSelectionBackgroundColor() {
        return this.selectionBackgroundColor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long u() {
        return ((z3) this.selectionPreviewHighlightRange.getValue()).getPackedValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean v() {
        return ((Boolean) this.showCursorHandle.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean w() {
        return ((Boolean) this.showFloatingToolbar.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean x() {
        return ((Boolean) this.showSelectionHandleEnd.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean y() {
        return ((Boolean) this.showSelectionHandleStart.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final j4 getTextDelegate() {
        return this.textDelegate;
    }
}
