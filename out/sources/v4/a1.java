package v4;

import android.view.Choreographer;
import android.view.inputmethod.EditorInfo;
import java.util.concurrent.Executor;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import q4.z3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a#\u0010\b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroid/view/inputmethod/EditorInfo;", "Loq/i0;", "i", "(Landroid/view/inputmethod/EditorInfo;)V", "Lv4/u;", "imeOptions", "Lv4/t0;", "textFieldValue", "h", "(Landroid/view/inputmethod/EditorInfo;Lv4/u;Lv4/t0;)V", "Landroid/view/Choreographer;", "Ljava/util/concurrent/Executor;", "d", "(Landroid/view/Choreographer;)Ljava/util/concurrent/Executor;", "", "bits", "flag", "", "g", "(II)Z", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a1 {
    public static final Executor d(final Choreographer choreographer) {
        return new Executor() { // from class: v4.y0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                a1.e(choreographer, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Choreographer choreographer, final Runnable runnable) {
        choreographer.postFrameCallback(new Choreographer.FrameCallback() { // from class: v4.z0
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j15) {
                a1.f(runnable, j15);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Runnable runnable, long j15) {
        runnable.run();
    }

    private static final boolean g(int i15, int i16) {
        return (i15 & i16) == i16;
    }

    public static final void h(EditorInfo editorInfo, ImeOptions imeOptions, TextFieldValue textFieldValue) {
        int imeAction = imeOptions.getImeAction();
        t.Companion companion = t.INSTANCE;
        int i15 = 6;
        if (t.m(imeAction, companion.a())) {
            if (!imeOptions.getSingleLine()) {
                i15 = 0;
            }
        } else if (t.m(imeAction, companion.e())) {
            i15 = 1;
        } else if (t.m(imeAction, companion.c())) {
            i15 = 2;
        } else if (t.m(imeAction, companion.d())) {
            i15 = 5;
        } else if (t.m(imeAction, companion.f())) {
            i15 = 7;
        } else if (t.m(imeAction, companion.g())) {
            i15 = 3;
        } else if (t.m(imeAction, companion.h())) {
            i15 = 4;
        } else if (!t.m(imeAction, companion.b())) {
            throw new IllegalStateException("invalid ImeAction");
        }
        editorInfo.imeOptions = i15;
        imeOptions.g();
        int keyboardType = imeOptions.getKeyboardType();
        a0.Companion companion2 = a0.INSTANCE;
        if (a0.n(keyboardType, companion2.h())) {
            editorInfo.inputType = 1;
        } else if (a0.n(keyboardType, companion2.a())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= PKIFailureInfo.systemUnavail;
        } else if (a0.n(keyboardType, companion2.d())) {
            editorInfo.inputType = 2;
        } else if (a0.n(keyboardType, companion2.g())) {
            editorInfo.inputType = 3;
        } else if (a0.n(keyboardType, companion2.j())) {
            editorInfo.inputType = 17;
        } else if (a0.n(keyboardType, companion2.c())) {
            editorInfo.inputType = 33;
        } else if (a0.n(keyboardType, companion2.f())) {
            editorInfo.inputType = 129;
        } else if (a0.n(keyboardType, companion2.e())) {
            editorInfo.inputType = 18;
        } else {
            if (!a0.n(keyboardType, companion2.b())) {
                throw new IllegalStateException("Invalid Keyboard Type");
            }
            editorInfo.inputType = 8194;
        }
        if (!imeOptions.getSingleLine() && g(editorInfo.inputType, 1)) {
            editorInfo.inputType |= PKIFailureInfo.unsupportedVersion;
            if (t.m(imeOptions.getImeAction(), companion.a())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (g(editorInfo.inputType, 1)) {
            int capitalization = imeOptions.getCapitalization();
            z.Companion companion3 = z.INSTANCE;
            if (z.i(capitalization, companion3.a())) {
                editorInfo.inputType |= PKIFailureInfo.certConfirmed;
            } else if (z.i(capitalization, companion3.e())) {
                editorInfo.inputType |= PKIFailureInfo.certRevoked;
            } else if (z.i(capitalization, companion3.c())) {
                editorInfo.inputType |= 16384;
            }
            if (imeOptions.getAutoCorrect()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = z3.n(textFieldValue.getSelection());
        editorInfo.initialSelEnd = z3.i(textFieldValue.getSelection());
        m6.a.e(editorInfo, textFieldValue.m());
        editorInfo.imeOptions |= 33554432;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(EditorInfo editorInfo) {
        if (androidx.emoji2.text.e.k()) {
            androidx.emoji2.text.e.c().x(editorInfo);
        }
    }
}
