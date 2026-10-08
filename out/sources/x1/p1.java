package x1;

import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import androidx.compose.ui.platform.f3;
import androidx.compose.ui.platform.i2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import n3.g2;
import p071kotlin.Metadata;
import p079n1.s3;
import q4.TextLayoutResult;
import q4.z3;
import v4.ImeOptions;
import v4.TextFieldValue;
import z1.c2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJU\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0018\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u000e2\u0006\u0010!\u001a\u00020\u000e¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J5\u0010/\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020$2\u0006\u0010.\u001a\u00020$¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R(\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u00060\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\"\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00060\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00108R\u0018\u0010=\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010A\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010E\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR$\u0010J\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\"\u0010Q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0N0M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u001b\u0010V\u001a\u00020R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010S\u001a\u0004\bT\u0010UR$\u0010]\u001a\u0004\u0018\u00010W8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bT\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u0014\u0010`\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010_¨\u0006a"}, d2 = {"Lx1/p1;", "Landroidx/compose/ui/platform/i2;", "Landroid/view/View;", "view", "Lkotlin/Function1;", "Ln3/g2;", "Loq/i0;", "localToScreen", "Lx1/c1;", "inputMethodManager", "<init>", "(Landroid/view/View;Ler/l;Lx1/c1;)V", "p", "()V", "Lv4/t0;", "value", "Lx1/k1$a;", "textInputNode", "Lv4/u;", "imeOptions", "", "Lv4/j;", "onEditCommand", "Lv4/t;", "onImeActionPerformed", "q", "(Lv4/t0;Lx1/k1$a;Lv4/u;Ler/l;Ler/l;)V", "Landroid/view/inputmethod/EditorInfo;", "outAttributes", "Lx1/s1;", "k", "(Landroid/view/inputmethod/EditorInfo;)Lx1/s1;", "oldValue", "newValue", "r", "(Lv4/t0;Lv4/t0;)V", "Lm3/g;", "rect", "m", "(Lm3/g;)V", "textFieldValue", "Lv4/i0;", "offsetMapping", "Lq4/t3;", "textLayoutResult", "innerTextFieldBounds", "decorationBoxBounds", "s", "(Lv4/t0;Lv4/i0;Lq4/t3;Lm3/g;Lm3/g;)V", "a", "Landroid/view/View;", "getView", "()Landroid/view/View;", "b", "Lx1/c1;", "c", "Ler/l;", "d", "Ln1/s3;", "e", "Ln1/s3;", "legacyTextFieldState", "Lz1/c2;", "f", "Lz1/c2;", "textFieldSelectionManager", "Landroidx/compose/ui/platform/f3;", "g", "Landroidx/compose/ui/platform/f3;", "viewConfiguration", "h", "Lv4/t0;", "getState", "()Lv4/t0;", "state", "i", "Lv4/u;", "", "Ljava/lang/ref/WeakReference;", "j", "Ljava/util/List;", "ics", "Landroid/view/inputmethod/BaseInputConnection;", "Loq/k;", "l", "()Landroid/view/inputmethod/BaseInputConnection;", "baseInputConnection", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "getFocusedRect$foundation", "()Landroid/graphics/Rect;", "setFocusedRect$foundation", "(Landroid/graphics/Rect;)V", "focusedRect", "Lx1/j1;", "Lx1/j1;", "cursorAnchorInfoController", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p1 implements i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final View view;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c1 inputMethodManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private s3 legacyTextFieldState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private c2 textFieldSelectionManager;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private f3 viewConfiguration;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private Rect focusedRect;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final j1 cursorAnchorInfoController;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private er.l<? super List<? extends v4.j>, oq.i0> onEditCommand = new er.l() { // from class: x1.m1
        @Override // er.l
        public final Object b(Object obj) {
            return p1.n((List) obj);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private er.l<? super v4.t, oq.i0> onImeActionPerformed = new er.l() { // from class: x1.n1
        @Override // er.l
        public final Object b(Object obj) {
            return p1.o((v4.t) obj);
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private TextFieldValue state = new TextFieldValue("", z3.INSTANCE.a(), (z3) null, 4, (fr.k) null);

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private ImeOptions imeOptions = ImeOptions.INSTANCE.a();

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private List<WeakReference<s1>> ics = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final oq.k baseInputConnection = oq.l.b(oq.o.NONE, new er.a() { // from class: x1.o1
        @Override // er.a
        public final Object a() {
            return p1.j(this.f216376a);
        }
    });

    @Metadata(d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ?\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"x1/p1$a", "Lx1/b1;", "", "Lv4/j;", "editCommands", "Loq/i0;", "d", "(Ljava/util/List;)V", "Lv4/t;", "imeAction", "c", "(I)V", "Landroid/view/KeyEvent;", "event", "a", "(Landroid/view/KeyEvent;)V", "", "immediate", "monitor", "includeInsertionMarker", "includeCharacterBounds", "includeEditorBounds", "includeLineBounds", "b", "(ZZZZZZ)V", "Lx1/s1;", "inputConnection", "e", "(Lx1/s1;)V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements b1 {
        a() {
        }

        @Override // x1.b1
        public void a(KeyEvent event) {
            p1.this.l().sendKeyEvent(event);
        }

        @Override // x1.b1
        public void b(boolean immediate, boolean monitor, boolean includeInsertionMarker, boolean includeCharacterBounds, boolean includeEditorBounds, boolean includeLineBounds) {
            p1.this.cursorAnchorInfoController.b(immediate, monitor, includeInsertionMarker, includeCharacterBounds, includeEditorBounds, includeLineBounds);
        }

        @Override // x1.b1
        public void c(int imeAction) {
            p1.this.onImeActionPerformed.b(v4.t.j(imeAction));
        }

        @Override // x1.b1
        public void d(List<? extends v4.j> editCommands) {
            p1.this.onEditCommand.b(editCommands);
        }

        @Override // x1.b1
        public void e(s1 inputConnection) {
            int size = p1.this.ics.size();
            for (int i15 = 0; i15 < size; i15++) {
                if (fr.t.c(((WeakReference) p1.this.ics.get(i15)).get(), inputConnection)) {
                    p1.this.ics.remove(i15);
                    return;
                }
            }
        }
    }

    public p1(View view, er.l<? super g2, oq.i0> lVar, c1 c1Var) {
        this.view = view;
        this.inputMethodManager = c1Var;
        this.cursorAnchorInfoController = new j1(lVar, c1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseInputConnection j(p1 p1Var) {
        return new BaseInputConnection(p1Var.view, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseInputConnection l() {
        return (BaseInputConnection) this.baseInputConnection.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(List list) {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(v4.t tVar) {
        return oq.i0.f148189a;
    }

    private final void p() {
        this.inputMethodManager.b();
    }

    @Override // androidx.compose.ui.platform.i2
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public s1 a(EditorInfo outAttributes) {
        i0.c(outAttributes, this.state.m(), this.state.getSelection(), this.imeOptions, null, 8, null);
        l1.d(outAttributes);
        s1 s1Var = new s1(this.state, new a(), this.imeOptions.getAutoCorrect(), this.legacyTextFieldState, this.textFieldSelectionManager, this.viewConfiguration);
        this.ics.add(new WeakReference<>(s1Var));
        return s1Var;
    }

    public final void m(m3.g rect) {
        Rect rect2;
        this.focusedRect = new Rect(hr.a.d(rect.getLeft()), hr.a.d(rect.getTop()), hr.a.d(rect.getRight()), hr.a.d(rect.getBottom()));
        if (!this.ics.isEmpty() || (rect2 = this.focusedRect) == null) {
            return;
        }
        this.view.requestRectangleOnScreen(new Rect(rect2));
    }

    public final void q(TextFieldValue value, k1.a textInputNode, ImeOptions imeOptions, er.l<? super List<? extends v4.j>, oq.i0> onEditCommand, er.l<? super v4.t, oq.i0> onImeActionPerformed) {
        this.state = value;
        this.imeOptions = imeOptions;
        this.onEditCommand = onEditCommand;
        this.onImeActionPerformed = onImeActionPerformed;
        this.legacyTextFieldState = textInputNode != null ? textInputNode.getLegacyTextFieldState() : null;
        this.textFieldSelectionManager = textInputNode != null ? textInputNode.getTextFieldSelectionManager() : null;
        this.viewConfiguration = textInputNode != null ? textInputNode.getViewConfiguration() : null;
    }

    public final void r(TextFieldValue oldValue, TextFieldValue newValue) {
        boolean z15 = (z3.g(this.state.getSelection(), newValue.getSelection()) && fr.t.c(this.state.getComposition(), newValue.getComposition())) ? false : true;
        this.state = newValue;
        int size = this.ics.size();
        for (int i15 = 0; i15 < size; i15++) {
            s1 s1Var = this.ics.get(i15).get();
            if (s1Var != null) {
                s1Var.h(newValue);
            }
        }
        this.cursorAnchorInfoController.a();
        if (fr.t.c(oldValue, newValue)) {
            if (z15) {
                c1 c1Var = this.inputMethodManager;
                int iL = z3.l(newValue.getSelection());
                int iK = z3.k(newValue.getSelection());
                z3 composition = this.state.getComposition();
                int iL2 = composition != null ? z3.l(composition.getPackedValue()) : -1;
                z3 composition2 = this.state.getComposition();
                c1Var.a(iL, iK, iL2, composition2 != null ? z3.k(composition2.getPackedValue()) : -1);
                return;
            }
            return;
        }
        if (oldValue != null && (!fr.t.c(oldValue.m(), newValue.m()) || (z3.g(oldValue.getSelection(), newValue.getSelection()) && !fr.t.c(oldValue.getComposition(), newValue.getComposition())))) {
            p();
            return;
        }
        int size2 = this.ics.size();
        for (int i16 = 0; i16 < size2; i16++) {
            s1 s1Var2 = this.ics.get(i16).get();
            if (s1Var2 != null) {
                s1Var2.i(this.state, this.inputMethodManager);
            }
        }
    }

    public final void s(TextFieldValue textFieldValue, v4.i0 offsetMapping, TextLayoutResult textLayoutResult, m3.g innerTextFieldBounds, m3.g decorationBoxBounds) {
        this.cursorAnchorInfoController.d(textFieldValue, offsetMapping, textLayoutResult, innerTextFieldBounds, decorationBoxBounds);
    }
}
