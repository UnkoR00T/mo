package x1;

import android.view.inputmethod.EditorInfo;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import q4.z3;
import v4.ImeOptions;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a=\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroid/view/inputmethod/EditorInfo;", "", "text", "Lq4/z3;", "selection", "Lv4/u;", "imeOptions", "", "", "contentMimeTypes", "Loq/i0;", "b", "(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;JLv4/u;[Ljava/lang/String;)V", "", "bits", "flag", "", "a", "(II)Z", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class i0 {
    private static final boolean a(int i15, int i16) {
        return (i15 & i16) == i16;
    }

    public static final void b(EditorInfo editorInfo, CharSequence charSequence, long j15, ImeOptions imeOptions, String[] strArr) {
        int imeAction = imeOptions.getImeAction();
        v4.t.Companion companion = v4.t.INSTANCE;
        int i15 = 3;
        int i16 = 6;
        if (v4.t.m(imeAction, companion.a())) {
            if (!imeOptions.getSingleLine()) {
                i16 = 0;
            }
        } else if (v4.t.m(imeAction, companion.e())) {
            i16 = 1;
        } else if (v4.t.m(imeAction, companion.c())) {
            i16 = 2;
        } else if (v4.t.m(imeAction, companion.d())) {
            i16 = 5;
        } else if (v4.t.m(imeAction, companion.f())) {
            i16 = 7;
        } else if (v4.t.m(imeAction, companion.g())) {
            i16 = 3;
        } else if (v4.t.m(imeAction, companion.h())) {
            i16 = 4;
        } else if (!v4.t.m(imeAction, companion.b())) {
            throw new IllegalStateException("invalid ImeAction");
        }
        editorInfo.imeOptions = i16;
        imeOptions.g();
        q1.f216393a.a(editorInfo, imeOptions.getHintLocales());
        int keyboardType = imeOptions.getKeyboardType();
        v4.a0.Companion companion2 = v4.a0.INSTANCE;
        if (v4.a0.n(keyboardType, companion2.h())) {
            i15 = 1;
        } else if (v4.a0.n(keyboardType, companion2.a())) {
            editorInfo.imeOptions |= PKIFailureInfo.systemUnavail;
            i15 = 1;
        } else if (v4.a0.n(keyboardType, companion2.d())) {
            i15 = 2;
        } else if (!v4.a0.n(keyboardType, companion2.g())) {
            if (v4.a0.n(keyboardType, companion2.j())) {
                i15 = 17;
            } else if (v4.a0.n(keyboardType, companion2.c())) {
                i15 = 33;
            } else if (v4.a0.n(keyboardType, companion2.f())) {
                i15 = 129;
            } else if (v4.a0.n(keyboardType, companion2.e())) {
                i15 = 18;
            } else {
                if (!v4.a0.n(keyboardType, companion2.b())) {
                    throw new IllegalStateException("Invalid Keyboard Type");
                }
                i15 = 8194;
            }
        }
        editorInfo.inputType = i15;
        if (!imeOptions.getSingleLine() && a(editorInfo.inputType, 1)) {
            editorInfo.inputType |= PKIFailureInfo.unsupportedVersion;
            if (v4.t.m(imeOptions.getImeAction(), companion.a())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (a(editorInfo.inputType, 1)) {
            int capitalization = imeOptions.getCapitalization();
            v4.z.Companion companion3 = v4.z.INSTANCE;
            if (v4.z.i(capitalization, companion3.a())) {
                editorInfo.inputType |= PKIFailureInfo.certConfirmed;
            } else if (v4.z.i(capitalization, companion3.e())) {
                editorInfo.inputType |= PKIFailureInfo.certRevoked;
            } else if (v4.z.i(capitalization, companion3.c())) {
                editorInfo.inputType |= 16384;
            }
            if (imeOptions.getAutoCorrect()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = z3.n(j15);
        editorInfo.initialSelEnd = z3.i(j15);
        m6.a.e(editorInfo, charSequence);
        if (strArr != null) {
            m6.a.c(editorInfo, strArr);
        }
        editorInfo.imeOptions |= 33554432;
        if (!v1.d.a() || v4.a0.n(imeOptions.getKeyboardType(), companion2.f()) || v4.a0.n(imeOptions.getKeyboardType(), companion2.e())) {
            m6.a.f(editorInfo, false);
        } else {
            m6.a.f(editorInfo, true);
            h0.f216348a.a(editorInfo);
        }
    }

    public static /* synthetic */ void c(EditorInfo editorInfo, CharSequence charSequence, long j15, ImeOptions imeOptions, String[] strArr, int i15, Object obj) {
        if ((i15 & 8) != 0) {
            strArr = null;
        }
        b(editorInfo, charSequence, j15, imeOptions, strArr);
    }
}
