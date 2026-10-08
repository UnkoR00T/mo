package x1;

import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001c\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001dR\u001b\u0010\"\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010$¨\u0006&"}, d2 = {"Lx1/e1;", "Lx1/c1;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "", "h", "()Z", "Loq/i0;", "b", "()V", "", "token", "Landroid/view/inputmethod/ExtractedText;", "extractedText", "updateExtractedText", "(ILandroid/view/inputmethod/ExtractedText;)V", "selectionStart", "selectionEnd", "compositionStart", "compositionEnd", "a", "(IIII)V", "Landroid/view/inputmethod/CursorAnchorInfo;", "cursorAnchorInfo", "updateCursorAnchorInfo", "(Landroid/view/inputmethod/CursorAnchorInfo;)V", "c", "Landroid/view/View;", "Landroid/view/inputmethod/InputMethodManager;", "Loq/k;", "e", "()Landroid/view/inputmethod/InputMethodManager;", "imm", "Lj6/f0;", "Lj6/f0;", "softwareKeyboardControllerCompat", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e1 implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final View view;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oq.k imm = oq.l.b(oq.o.NONE, new er.a() { // from class: x1.d1
        @Override // er.a
        public final Object a() {
            return e1.f(this.f216322a);
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final j6.f0 softwareKeyboardControllerCompat;

    public e1(View view) {
        this.view = view;
        this.softwareKeyboardControllerCompat = new j6.f0(view);
    }

    private final InputMethodManager e() {
        return (InputMethodManager) this.imm.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InputMethodManager f(e1 e1Var) {
        return (InputMethodManager) e1Var.view.getContext().getSystemService("input_method");
    }

    @Override // x1.c1
    public void a(int selectionStart, int selectionEnd, int compositionStart, int compositionEnd) {
        e().updateSelection(this.view, selectionStart, selectionEnd, compositionStart, compositionEnd);
    }

    @Override // x1.c1
    public void b() {
        e().restartInput(this.view);
    }

    @Override // x1.c1
    public void c() {
        if (Build.VERSION.SDK_INT >= 34) {
            f.f216327a.a(e(), this.view);
        }
    }

    @Override // x1.c1
    public boolean h() {
        return e().isActive(this.view);
    }

    @Override // x1.c1
    public void updateCursorAnchorInfo(CursorAnchorInfo cursorAnchorInfo) {
        e().updateCursorAnchorInfo(this.view, cursorAnchorInfo);
    }

    @Override // x1.c1
    public void updateExtractedText(int token, ExtractedText extractedText) {
        e().updateExtractedText(this.view, token, extractedText);
    }
}
