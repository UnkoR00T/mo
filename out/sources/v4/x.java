package v4;

import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u001f\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001eR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010%¨\u0006'"}, d2 = {"Lv4/x;", "Lv4/w;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "", "h", "()Z", "Loq/i0;", "b", "()V", "c", "d", "", "token", "Landroid/view/inputmethod/ExtractedText;", "extractedText", "updateExtractedText", "(ILandroid/view/inputmethod/ExtractedText;)V", "selectionStart", "selectionEnd", "compositionStart", "compositionEnd", "a", "(IIII)V", "Landroid/view/inputmethod/CursorAnchorInfo;", "cursorAnchorInfo", "updateCursorAnchorInfo", "(Landroid/view/inputmethod/CursorAnchorInfo;)V", "Landroid/view/View;", "Landroid/view/inputmethod/InputMethodManager;", "Loq/k;", "f", "()Landroid/view/inputmethod/InputMethodManager;", "imm", "Lj6/f0;", "Lj6/f0;", "softwareKeyboardControllerCompat", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
@oq.a
public final class x implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final View view;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oq.k imm = oq.l.b(oq.o.NONE, new a());

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final j6.f0 softwareKeyboardControllerCompat;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/view/inputmethod/InputMethodManager;", "c", "()Landroid/view/inputmethod/InputMethodManager;"}, k = 3, mv = {2, 1, 0})
    static final class a extends fr.w implements er.a<InputMethodManager> {
        a() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final InputMethodManager a() {
            return (InputMethodManager) x.this.view.getContext().getSystemService("input_method");
        }
    }

    public x(View view) {
        this.view = view;
        this.softwareKeyboardControllerCompat = new j6.f0(view);
    }

    private final InputMethodManager f() {
        return (InputMethodManager) this.imm.getValue();
    }

    @Override // v4.w
    public void a(int selectionStart, int selectionEnd, int compositionStart, int compositionEnd) {
        f().updateSelection(this.view, selectionStart, selectionEnd, compositionStart, compositionEnd);
    }

    @Override // v4.w
    public void b() {
        f().restartInput(this.view);
    }

    @Override // v4.w
    public void c() {
        this.softwareKeyboardControllerCompat.b();
    }

    @Override // v4.w
    public void d() {
        this.softwareKeyboardControllerCompat.a();
    }

    @Override // v4.w
    public boolean h() {
        return f().isActive(this.view);
    }

    @Override // v4.w
    public void updateCursorAnchorInfo(CursorAnchorInfo cursorAnchorInfo) {
        f().updateCursorAnchorInfo(this.view, cursorAnchorInfo);
    }

    @Override // v4.w
    public void updateExtractedText(int token, ExtractedText extractedText) {
        f().updateExtractedText(this.view, token, extractedText);
    }
}
