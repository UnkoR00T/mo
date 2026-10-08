package iw;

import fu.r;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001d\u0010\u0011\u001a\b\u0018\u00010\rR\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0012"}, d2 = {"Liw/d;", "", "", "text", "<init>", "(Ljava/lang/CharSequence;)V", "a", "Ljava/lang/CharSequence;", "", "", "b", "Ljava/util/List;", "lines", "Liw/d$a;", "c", "Liw/d$a;", "()Liw/d$a;", "startPosition", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CharSequence text;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<String> lines;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a startPosition;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\r\n\u0002\b\u0010\n\u0002\u0010\f\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\b\u0018\u00010\u0000R\u00020\f2\b\b\u0002\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\b\u0018\u00010\u0000R\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0017\u0010\u001e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001b\u0010\nR\u0011\u0010\"\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010$\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b#\u0010\u0018R\u0011\u0010&\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b%\u0010\u0018R\u0013\u0010(\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b'\u0010\u0012R\u0011\u0010*\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b)\u0010\u0018R\u0011\u0010+\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010!R\u0013\u0010-\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b,\u0010\nR\u0013\u0010/\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b.\u0010\nR\u0011\u00102\u001a\u0002008F¢\u0006\u0006\u001a\u0004\b\u001a\u00101¨\u00063"}, d2 = {"Liw/d$a;", "", "", "lineN", "localPos", "globalPos", "<init>", "(Liw/d;III)V", "", "toString", "()Ljava/lang/String;", "delta", "Liw/d;", "m", "(I)Liw/d$a;", "l", "()Liw/d$a;", "a", "()Ljava/lang/Integer;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "I", "b", "c", "d", "Ljava/lang/String;", "currentLine", "", "j", "()Ljava/lang/CharSequence;", "originalText", "h", "offset", "i", "offsetInCurrentLine", "f", "nextLineOffset", "g", "nextLineOrEofOffset", "currentLineFromPosition", "e", "nextLine", "k", "prevLine", "", "()C", "char", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int lineN;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int localPos;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int globalPos;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final String currentLine;

        public a(int i15, int i16, int i17) {
            this.lineN = i15;
            this.localPos = i16;
            this.globalPos = i17;
            String str = (String) d.this.lines.get(i15);
            this.currentLine = str;
            hw.a aVar = hw.a.f86718a;
            if (!(i16 >= -1 && i16 < str.length())) {
                throw new yv.d("");
            }
        }

        public static /* synthetic */ a n(a aVar, int i15, int i16, Object obj) {
            if ((i16 & 1) != 0) {
                i15 = 1;
            }
            return aVar.m(i15);
        }

        public final Integer a() {
            String str = this.currentLine;
            for (int iMax = Math.max(this.localPos, 0); iMax < str.length(); iMax++) {
                char cCharAt = str.charAt(iMax);
                if (cCharAt != ' ' && cCharAt != '\t') {
                    return Integer.valueOf(iMax - this.localPos);
                }
            }
            return null;
        }

        public final char b() {
            return d.this.text.charAt(this.globalPos);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getCurrentLine() {
            return this.currentLine;
        }

        public final CharSequence d() {
            return this.currentLine.substring(getLocalPos());
        }

        public final String e() {
            if (this.lineN + 1 < d.this.lines.size()) {
                return (String) d.this.lines.get(this.lineN + 1);
            }
            return null;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return other != null && other.getClass() == a.class && this.globalPos == ((a) other).globalPos;
        }

        public final Integer f() {
            if (this.lineN + 1 < d.this.lines.size()) {
                return Integer.valueOf(this.globalPos + (this.currentLine.length() - this.localPos));
            }
            return null;
        }

        public final int g() {
            return this.globalPos + (this.currentLine.length() - this.localPos);
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final int getGlobalPos() {
            return this.globalPos;
        }

        public int hashCode() {
            return this.globalPos;
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final int getLocalPos() {
            return this.localPos;
        }

        public final CharSequence j() {
            return d.this.text;
        }

        public final String k() {
            if (this.lineN > 0) {
                return (String) d.this.lines.get(this.lineN - 1);
            }
            return null;
        }

        public final a l() {
            Integer numF = f();
            if (numF != null) {
                return m(numF.intValue() - getGlobalPos());
            }
            return null;
        }

        public final a m(int delta) {
            a aVar = this;
            while (delta != 0) {
                if (aVar.localPos + delta < aVar.currentLine.length()) {
                    return d.this.new a(aVar.lineN, aVar.localPos + delta, aVar.globalPos + delta);
                }
                if (aVar.f() == null) {
                    return null;
                }
                int length = aVar.currentLine.length() - aVar.localPos;
                delta -= length;
                aVar = d.this.new a(aVar.lineN + 1, -1, aVar.globalPos + length);
            }
            return aVar;
        }

        public String toString() {
            String strSubstring;
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Position: '");
            int i15 = this.localPos;
            if (i15 == -1) {
                strSubstring = "\\n" + this.currentLine;
            } else {
                strSubstring = this.currentLine.substring(i15);
            }
            sb5.append(strSubstring);
            sb5.append('\'');
            return sb5.toString();
        }
    }

    public d(CharSequence charSequence) {
        this.text = charSequence;
        this.lines = r.U0(charSequence, new char[]{'\n'}, false, 0, 6, null);
        this.startPosition = charSequence.length() > 0 ? a.n(new a(0, -1, -1), 0, 1, null) : null;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final a getStartPosition() {
        return this.startPosition;
    }
}
