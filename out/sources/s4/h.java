package s4;

import fr.k;
import fr.t;
import java.text.BreakIterator;
import java.util.Locale;
import p071kotlin.Metadata;
import r4.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u001f2\u00020\u0001:\u0001\u0018B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u0013J\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u0013J\u0015\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010\u001dJ\u0015\u0010 \u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b \u0010\u001dJ\u0015\u0010!\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b!\u0010\u001dJ\u0015\u0010\"\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010\u001dJ\u0015\u0010#\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b#\u0010\u0013J\u0015\u0010$\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b$\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010(R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010(R\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010*¨\u0006,"}, d2 = {"Ls4/h;", "", "", "charSequence", "", "start", "end", "Ljava/util/Locale;", "locale", "<init>", "(Ljava/lang/CharSequence;IILjava/util/Locale;)V", "offset", "", "getPrevWordBeginningOnTwoWordsBoundary", "b", "(IZ)I", "getNextWordEndOnTwoWordBoundary", "c", "o", "(I)Z", "n", "h", "l", "Loq/i0;", "a", "(I)V", "j", "k", "p", "(I)I", "q", "e", "d", "f", "g", "i", "m", "Ljava/lang/CharSequence;", "getCharSequence", "()Ljava/lang/CharSequence;", "I", "Ljava/text/BreakIterator;", "Ljava/text/BreakIterator;", "iterator", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f177816f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CharSequence charSequence;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int start;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int end;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final BreakIterator iterator;

    /* JADX INFO: renamed from: s4.h$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ls4/h$a;", "", "<init>", "()V", "", "cp", "", "a", "(I)Z", "WINDOW_WIDTH", "I", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final boolean a(int cp4) {
            int type = Character.getType(cp4);
            return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
        }

        private Companion() {
        }
    }

    public h(CharSequence charSequence, int i15, int i16, Locale locale) {
        this.charSequence = charSequence;
        if (!(i15 >= 0 && i15 <= charSequence.length())) {
            w4.a.a("input start index is outside the CharSequence");
        }
        if (!(i16 >= 0 && i16 <= charSequence.length())) {
            w4.a.a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.iterator = wordInstance;
        this.start = Math.max(0, i15 - 50);
        this.end = Math.min(charSequence.length(), i16 + 50);
        wordInstance.setText(new n(charSequence, i15, i16));
    }

    private final void a(int offset) {
        int i15 = this.start;
        boolean z15 = false;
        if (offset <= this.end && i15 <= offset) {
            z15 = true;
        }
        if (z15) {
            return;
        }
        w4.a.a("Invalid offset: " + offset + ". Valid range is [" + this.start + " , " + this.end + ']');
    }

    private final int b(int offset, boolean getPrevWordBeginningOnTwoWordsBoundary) {
        a(offset);
        if (l(offset)) {
            return (!j(offset) || (h(offset) && getPrevWordBeginningOnTwoWordsBoundary)) ? q(offset) : offset;
        }
        if (h(offset)) {
            return q(offset);
        }
        return -1;
    }

    private final int c(int offset, boolean getNextWordEndOnTwoWordBoundary) {
        a(offset);
        if (h(offset)) {
            return (!j(offset) || (l(offset) && getNextWordEndOnTwoWordBoundary)) ? p(offset) : offset;
        }
        if (l(offset)) {
            return p(offset);
        }
        return -1;
    }

    private final boolean h(int offset) {
        int i15 = this.start + 1;
        if (offset > this.end || i15 > offset) {
            return false;
        }
        if (Character.isLetterOrDigit(Character.codePointBefore(this.charSequence, offset))) {
            return true;
        }
        int i16 = offset - 1;
        if (Character.isSurrogate(this.charSequence.charAt(i16))) {
            return true;
        }
        if (!androidx.emoji2.text.e.k()) {
            return false;
        }
        androidx.emoji2.text.e eVarC = androidx.emoji2.text.e.c();
        return eVarC.g() == 1 && eVarC.f(this.charSequence, i16) != -1;
    }

    private final boolean j(int offset) {
        a(offset);
        if (!this.iterator.isBoundary(offset)) {
            return false;
        }
        if (l(offset) && l(offset - 1) && l(offset + 1)) {
            return false;
        }
        return offset <= 0 || offset >= this.charSequence.length() - 1 || !(k(offset) || k(offset + 1));
    }

    private final boolean k(int offset) {
        int i15 = offset - 1;
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(this.charSequence.charAt(i15));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (t.c(unicodeBlockOf, unicodeBlock) && t.c(Character.UnicodeBlock.of(this.charSequence.charAt(offset)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return t.c(Character.UnicodeBlock.of(this.charSequence.charAt(offset)), unicodeBlock) && t.c(Character.UnicodeBlock.of(this.charSequence.charAt(i15)), Character.UnicodeBlock.KATAKANA);
    }

    private final boolean l(int offset) {
        int i15 = this.start;
        if (offset >= this.end || i15 > offset) {
            return false;
        }
        if (Character.isLetterOrDigit(Character.codePointAt(this.charSequence, offset)) || Character.isSurrogate(this.charSequence.charAt(offset))) {
            return true;
        }
        if (!androidx.emoji2.text.e.k()) {
            return false;
        }
        androidx.emoji2.text.e eVarC = androidx.emoji2.text.e.c();
        return eVarC.g() == 1 && eVarC.f(this.charSequence, offset) != -1;
    }

    private final boolean n(int offset) {
        return !m(offset) && i(offset);
    }

    private final boolean o(int offset) {
        return m(offset) && !i(offset);
    }

    public final int d(int offset) {
        return c(offset, true);
    }

    public final int e(int offset) {
        return b(offset, true);
    }

    public final int f(int offset) {
        a(offset);
        while (offset != -1 && !o(offset)) {
            offset = q(offset);
        }
        return offset;
    }

    public final int g(int offset) {
        a(offset);
        while (offset != -1 && !n(offset)) {
            offset = p(offset);
        }
        return offset;
    }

    public final boolean i(int offset) {
        int i15 = this.start + 1;
        if (offset > this.end || i15 > offset) {
            return false;
        }
        return INSTANCE.a(Character.codePointBefore(this.charSequence, offset));
    }

    public final boolean m(int offset) {
        int i15 = this.start;
        if (offset >= this.end || i15 > offset) {
            return false;
        }
        return INSTANCE.a(Character.codePointAt(this.charSequence, offset));
    }

    public final int p(int offset) {
        a(offset);
        int iFollowing = this.iterator.following(offset);
        return (l(iFollowing + (-1)) && l(iFollowing) && !k(iFollowing)) ? p(iFollowing) : iFollowing;
    }

    public final int q(int offset) {
        a(offset);
        int iPreceding = this.iterator.preceding(offset);
        return (l(iPreceding) && h(iPreceding) && !k(iPreceding)) ? q(iPreceding) : iPreceding;
    }
}
