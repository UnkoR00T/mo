package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import java.util.Arrays;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.emoji2.text.e.j f12280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f12281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.emoji2.text.e.InterfaceC0261e f12282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f12283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int[] f12284e;

    private static final class a {
        static int a(CharSequence charSequence, int i15, int i16) {
            int length = charSequence.length();
            if (i15 < 0 || length < i15 || i16 < 0) {
                return -1;
            }
            while (true) {
                boolean z15 = false;
                while (i16 != 0) {
                    i15--;
                    if (i15 < 0) {
                        return z15 ? -1 : 0;
                    }
                    char cCharAt = charSequence.charAt(i15);
                    if (z15) {
                        if (!Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        i16--;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i16--;
                    } else {
                        if (Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        z15 = true;
                    }
                }
                return i15;
            }
        }

        static int b(CharSequence charSequence, int i15, int i16) {
            int length = charSequence.length();
            if (i15 < 0 || length < i15 || i16 < 0) {
                return -1;
            }
            while (true) {
                boolean z15 = false;
                while (i16 != 0) {
                    if (i15 >= length) {
                        if (z15) {
                            return -1;
                        }
                        return length;
                    }
                    char cCharAt = charSequence.charAt(i15);
                    if (z15) {
                        if (!Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i16--;
                        i15++;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i16--;
                        i15++;
                    } else {
                        if (Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i15++;
                        z15 = true;
                    }
                }
                return i15;
            }
        }
    }

    private static class b implements c<q> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public q f12285a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.emoji2.text.e.j f12286b;

        b(q qVar, androidx.emoji2.text.e.j jVar) {
            this.f12285a = qVar;
            this.f12286b = jVar;
        }

        @Override // androidx.emoji2.text.h.c
        public boolean b(CharSequence charSequence, int i15, int i16, o oVar) {
            if (oVar.k()) {
                return true;
            }
            if (this.f12285a == null) {
                this.f12285a = new q(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
            }
            this.f12285a.setSpan(this.f12286b.a(oVar), i15, i16, 33);
            return true;
        }

        @Override // androidx.emoji2.text.h.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public q a() {
            return this.f12285a;
        }
    }

    private interface c<T> {
        T a();

        boolean b(CharSequence charSequence, int i15, int i16, o oVar);
    }

    private static class d implements c<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f12287a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f12288b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f12289c = -1;

        d(int i15) {
            this.f12287a = i15;
        }

        @Override // androidx.emoji2.text.h.c
        public boolean b(CharSequence charSequence, int i15, int i16, o oVar) {
            int i17 = this.f12287a;
            if (i15 > i17 || i17 >= i16) {
                return i16 <= i17;
            }
            this.f12288b = i15;
            this.f12289c = i16;
            return false;
        }

        @Override // androidx.emoji2.text.h.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public d a() {
            return this;
        }
    }

    private static class e implements c<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f12290a;

        e(String str) {
            this.f12290a = str;
        }

        @Override // androidx.emoji2.text.h.c
        public boolean b(CharSequence charSequence, int i15, int i16, o oVar) {
            if (!TextUtils.equals(charSequence.subSequence(i15, i16), this.f12290a)) {
                return true;
            }
            oVar.l(true);
            return false;
        }

        @Override // androidx.emoji2.text.h.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public e a() {
            return this;
        }
    }

    static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f12291a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final m.a f12292b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private m.a f12293c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private m.a f12294d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f12295e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f12296f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f12297g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int[] f12298h;

        f(m.a aVar, boolean z15, int[] iArr) {
            this.f12292b = aVar;
            this.f12293c = aVar;
            this.f12297g = z15;
            this.f12298h = iArr;
        }

        private static boolean d(int i15) {
            return i15 == 65039;
        }

        private static boolean f(int i15) {
            return i15 == 65038;
        }

        private int g() {
            this.f12291a = 1;
            this.f12293c = this.f12292b;
            this.f12296f = 0;
            return 1;
        }

        private boolean h() {
            if (this.f12293c.b().j() || d(this.f12295e)) {
                return true;
            }
            if (this.f12297g) {
                if (this.f12298h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f12298h, this.f12293c.b().b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        int a(int i15) {
            m.a aVarA = this.f12293c.a(i15);
            int iG = 2;
            if (this.f12291a != 2) {
                if (aVarA == null) {
                    iG = g();
                } else {
                    this.f12291a = 2;
                    this.f12293c = aVarA;
                    this.f12296f = 1;
                }
            } else if (aVarA != null) {
                this.f12293c = aVarA;
                this.f12296f++;
            } else if (f(i15)) {
                iG = g();
            } else if (!d(i15)) {
                if (this.f12293c.b() != null) {
                    iG = 3;
                    if (this.f12296f != 1 || h()) {
                        this.f12294d = this.f12293c;
                        g();
                    } else {
                        iG = g();
                    }
                } else {
                    iG = g();
                }
            }
            this.f12295e = i15;
            return iG;
        }

        o b() {
            return this.f12293c.b();
        }

        o c() {
            return this.f12294d.b();
        }

        boolean e() {
            if (this.f12291a != 2 || this.f12293c.b() == null) {
                return false;
            }
            return this.f12296f > 1 || h();
        }
    }

    h(m mVar, androidx.emoji2.text.e.j jVar, androidx.emoji2.text.e.InterfaceC0261e interfaceC0261e, boolean z15, int[] iArr, Set<int[]> set) {
        this.f12280a = jVar;
        this.f12281b = mVar;
        this.f12282c = interfaceC0261e;
        this.f12283d = z15;
        this.f12284e = iArr;
        i(set);
    }

    private static boolean a(Editable editable, KeyEvent keyEvent, boolean z15) {
        i[] iVarArr;
        if (h(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!g(selectionStart, selectionEnd) && (iVarArr = (i[]) editable.getSpans(selectionStart, selectionEnd, i.class)) != null && iVarArr.length > 0) {
            for (i iVar : iVarArr) {
                int spanStart = editable.getSpanStart(iVar);
                int spanEnd = editable.getSpanEnd(iVar);
                if ((z15 && spanStart == selectionStart) || ((!z15 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    static boolean d(InputConnection inputConnection, Editable editable, int i15, int i16, boolean z15) {
        int iMax;
        int iMin;
        if (editable != null && inputConnection != null && i15 >= 0 && i16 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (g(selectionStart, selectionEnd)) {
                return false;
            }
            if (z15) {
                iMax = a.a(editable, selectionStart, Math.max(i15, 0));
                iMin = a.b(editable, selectionEnd, Math.max(i16, 0));
                if (iMax == -1 || iMin == -1) {
                    return false;
                }
            } else {
                iMax = Math.max(selectionStart - i15, 0);
                iMin = Math.min(selectionEnd + i16, editable.length());
            }
            i[] iVarArr = (i[]) editable.getSpans(iMax, iMin, i.class);
            if (iVarArr != null && iVarArr.length > 0) {
                for (i iVar : iVarArr) {
                    int spanStart = editable.getSpanStart(iVar);
                    int spanEnd = editable.getSpanEnd(iVar);
                    iMax = Math.min(spanStart, iMax);
                    iMin = Math.max(spanEnd, iMin);
                }
                int iMax2 = Math.max(iMax, 0);
                int iMin2 = Math.min(iMin, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(iMax2, iMin2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    static boolean e(Editable editable, int i15, KeyEvent keyEvent) {
        boolean zA;
        if (i15 != 67) {
            zA = i15 != 112 ? false : a(editable, keyEvent, true);
        } else {
            zA = a(editable, keyEvent, false);
        }
        if (!zA) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    private boolean f(CharSequence charSequence, int i15, int i16, o oVar) {
        if (oVar.d() == 0) {
            oVar.m(this.f12282c.a(charSequence, i15, i16, oVar.h()));
        }
        return oVar.d() == 2;
    }

    private static boolean g(int i15, int i16) {
        return i15 == -1 || i16 == -1 || i15 != i16;
    }

    private static boolean h(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    private void i(Set<int[]> set) {
        if (set.isEmpty()) {
            return;
        }
        for (int[] iArr : set) {
            String str = new String(iArr, 0, iArr.length);
            k(str, 0, str.length(), 1, true, new e(str));
        }
    }

    private <T> T k(CharSequence charSequence, int i15, int i16, int i17, boolean z15, c<T> cVar) {
        int iCharCount;
        f fVar = new f(this.f12281b.f(), this.f12283d, this.f12284e);
        int i18 = 0;
        boolean zB = true;
        int iCodePointAt = Character.codePointAt(charSequence, i15);
        loop0: while (true) {
            iCharCount = i15;
            while (true) {
                if (i15 >= i16 || i18 >= i17 || !zB) {
                    break loop0;
                }
                int iA = fVar.a(iCodePointAt);
                if (iA == 1) {
                    iCharCount += Character.charCount(Character.codePointAt(charSequence, iCharCount));
                    if (iCharCount < i16) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                    i15 = iCharCount;
                } else if (iA == 2) {
                    i15 += Character.charCount(iCodePointAt);
                    if (i15 < i16) {
                        iCodePointAt = Character.codePointAt(charSequence, i15);
                    }
                } else if (iA != 3) {
                }
            }
            if (z15 || !f(charSequence, iCharCount, i15, fVar.c())) {
                zB = cVar.b(charSequence, iCharCount, i15, fVar.c());
                i18++;
            }
        }
        if (fVar.e() && i18 < i17 && zB && (z15 || !f(charSequence, iCharCount, i15, fVar.b()))) {
            cVar.b(charSequence, iCharCount, i15, fVar.b());
        }
        return cVar.a();
    }

    int b(CharSequence charSequence, int i15) {
        if (i15 < 0 || i15 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            i[] iVarArr = (i[]) spanned.getSpans(i15, i15 + 1, i.class);
            if (iVarArr.length > 0) {
                return spanned.getSpanEnd(iVarArr[0]);
            }
        }
        return ((d) k(charSequence, Math.max(0, i15 - 16), Math.min(charSequence.length(), i15 + 16), Integer.MAX_VALUE, true, new d(i15))).f12289c;
    }

    int c(CharSequence charSequence, int i15) {
        if (i15 < 0 || i15 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            i[] iVarArr = (i[]) spanned.getSpans(i15, i15 + 1, i.class);
            if (iVarArr.length > 0) {
                return spanned.getSpanStart(iVarArr[0]);
            }
        }
        return ((d) k(charSequence, Math.max(0, i15 - 16), Math.min(charSequence.length(), i15 + 16), Integer.MAX_VALUE, true, new d(i15))).f12288b;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004b A[Catch: all -> 0x002a, TryCatch #2 {all -> 0x002a, blocks: (B:7:0x000e, B:10:0x0013, B:12:0x0017, B:14:0x0024, B:22:0x003c, B:24:0x0044, B:26:0x0047, B:28:0x004b, B:30:0x0057, B:31:0x005a, B:41:0x0078), top: B:70:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0057 A[Catch: all -> 0x002a, TryCatch #2 {all -> 0x002a, blocks: (B:7:0x000e, B:10:0x0013, B:12:0x0017, B:14:0x0024, B:22:0x003c, B:24:0x0044, B:26:0x0047, B:28:0x004b, B:30:0x0057, B:31:0x005a, B:41:0x0078), top: B:70:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:64:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:73:? A[SYNTHETIC] */
    CharSequence j(CharSequence charSequence, int i15, int i16, int i17, boolean z15) throws Throwable {
        q qVar;
        CharSequence charSequence2;
        Throwable th4;
        int i18;
        int i19;
        n nVar;
        i[] iVarArr;
        int i25;
        int spanStart;
        boolean z16 = charSequence instanceof n;
        if (z16) {
            ((n) charSequence).a();
        }
        if (z16) {
            qVar = new q((Spannable) charSequence);
            if (qVar != null) {
                for (i iVar : iVarArr) {
                    spanStart = qVar.getSpanStart(iVar);
                    int spanEnd = qVar.getSpanEnd(iVar);
                    if (spanStart != i16) {
                        qVar.removeSpan(iVar);
                    }
                    i15 = Math.min(spanStart, i15);
                    i16 = Math.max(spanEnd, i16);
                }
            }
            i18 = i15;
            i19 = i16;
            if (i18 == i19) {
                charSequence2 = charSequence;
                if (!z16) {
                    return charSequence2;
                }
                nVar = (n) charSequence2;
                nVar.d();
            } else {
                charSequence2 = charSequence;
                if (!z16) {
                    return charSequence2;
                }
                nVar = (n) charSequence2;
                nVar.d();
            }
            return charSequence2;
        }
        try {
            if (charSequence instanceof Spannable) {
                try {
                    qVar = new q((Spannable) charSequence);
                } catch (Throwable th5) {
                    th = th5;
                    charSequence2 = charSequence;
                    th4 = th;
                    if (!z16) {
                        throw th4;
                    }
                    ((n) charSequence2).d();
                    throw th4;
                }
            } else {
                qVar = (!(charSequence instanceof Spanned) || ((Spanned) charSequence).nextSpanTransition(i15 + (-1), i16 + 1, i.class) > i16) ? null : new q(charSequence);
            }
            if (qVar != null && (iVarArr = (i[]) qVar.getSpans(i15, i16, i.class)) != null && iVarArr.length > 0) {
                while (i25 < r5) {
                    spanStart = qVar.getSpanStart(iVar);
                    int spanEnd2 = qVar.getSpanEnd(iVar);
                    if (spanStart != i16) {
                        qVar.removeSpan(iVar);
                    }
                    i15 = Math.min(spanStart, i15);
                    i16 = Math.max(spanEnd2, i16);
                }
            }
            i18 = i15;
            i19 = i16;
            if (i18 == i19 && i18 < charSequence.length()) {
                if (i17 != Integer.MAX_VALUE && qVar != null) {
                    i17 -= ((i[]) qVar.getSpans(0, qVar.length(), i.class)).length;
                }
                charSequence2 = charSequence;
                try {
                    q qVar2 = (q) k(charSequence2, i18, i19, i17, z15, new b(qVar, this.f12280a));
                    if (qVar2 == null) {
                        if (z16) {
                            nVar = (n) charSequence2;
                        }
                        return charSequence2;
                    }
                    Spannable spannableB = qVar2.b();
                    if (z16) {
                        ((n) charSequence2).d();
                    }
                    return spannableB;
                } catch (Throwable th6) {
                    th = th6;
                    th4 = th;
                    if (!z16) {
                        throw th4;
                    }
                    ((n) charSequence2).d();
                    throw th4;
                }
            }
            charSequence2 = charSequence;
            if (!z16) {
                return charSequence2;
            }
            nVar = (n) charSequence2;
            nVar.d();
            return charSequence2;
        } catch (Throwable th7) {
            th4 = th7;
            charSequence2 = charSequence;
        }
        if (!z16) {
            throw th4;
        }
        ((n) charSequence2).d();
        throw th4;
    }
}
