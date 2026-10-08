package v4;

import n3.g2;
import p071kotlin.Metadata;
import q4.TextLayoutResult;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJI\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\b0\u00162\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001e\u001a\u00020\u0010¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0011\u0010%\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\"\u0010$¨\u0006&"}, d2 = {"Lv4/b1;", "", "Lv4/v0;", "textInputService", "Lv4/m0;", "platformTextInputService", "<init>", "(Lv4/v0;Lv4/m0;)V", "Loq/i0;", "a", "()V", "Lm3/g;", "rect", "", "c", "(Lm3/g;)Z", "Lv4/t0;", "textFieldValue", "Lv4/i0;", "offsetMapping", "Lq4/t3;", "textLayoutResult", "Lkotlin/Function1;", "Ln3/g2;", "textFieldToRootTransform", "innerTextFieldBounds", "decorationBoxBounds", "e", "(Lv4/t0;Lv4/i0;Lq4/t3;Ler/l;Lm3/g;Lm3/g;)Z", "oldValue", "newValue", "d", "(Lv4/t0;Lv4/t0;)Z", "Lv4/v0;", "b", "Lv4/m0;", "()Z", "isOpen", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
@oq.a
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v0 textInputService;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final m0 platformTextInputService;

    public b1(v0 v0Var, m0 m0Var) {
        this.textInputService = v0Var;
        this.platformTextInputService = m0Var;
    }

    public final void a() {
        this.textInputService.g(this);
    }

    public final boolean b() {
        return fr.t.c(this.textInputService.a(), this);
    }

    public final boolean c(m3.g rect) {
        boolean zB = b();
        if (zB) {
            this.platformTextInputService.e(rect);
        }
        return zB;
    }

    public final boolean d(TextFieldValue oldValue, TextFieldValue newValue) {
        boolean zB = b();
        if (zB) {
            this.platformTextInputService.d(oldValue, newValue);
        }
        return zB;
    }

    public final boolean e(TextFieldValue textFieldValue, i0 offsetMapping, TextLayoutResult textLayoutResult, er.l<? super g2, oq.i0> textFieldToRootTransform, m3.g innerTextFieldBounds, m3.g decorationBoxBounds) {
        boolean zB = b();
        if (zB) {
            this.platformTextInputService.h(textFieldValue, offsetMapping, textLayoutResult, textFieldToRootTransform, innerTextFieldBounds, decorationBoxBounds);
        }
        return zB;
    }
}
