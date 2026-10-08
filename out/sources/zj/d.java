package zj;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d implements q<Character> {

    private static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final d f235383a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final d f235384b;

        a(d dVar, d dVar2) {
            this.f235383a = (d) p.q(dVar);
            this.f235384b = (d) p.q(dVar2);
        }

        @Override // zj.d, zj.q
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch4) {
            return super.apply(ch4);
        }

        @Override // zj.d
        public boolean n(char c15) {
            return this.f235383a.n(c15) && this.f235384b.n(c15);
        }

        @Override // zj.d
        public String toString() {
            return "CharMatcher.and(" + this.f235383a + ", " + this.f235384b + ")";
        }
    }

    private static final class b extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final d f235385b = new b();

        private b() {
            super("CharMatcher.any()");
        }

        @Override // zj.d
        public d b(d dVar) {
            return (d) p.q(dVar);
        }

        @Override // zj.d
        public int g(CharSequence charSequence) {
            return charSequence.length();
        }

        @Override // zj.d
        public int h(CharSequence charSequence) {
            return charSequence.length() == 0 ? -1 : 0;
        }

        @Override // zj.d
        public int i(CharSequence charSequence, int i15) {
            int length = charSequence.length();
            p.t(i15, length);
            if (i15 == length) {
                return -1;
            }
            return i15;
        }

        @Override // zj.d
        public boolean n(char c15) {
            return true;
        }

        @Override // zj.d
        public boolean o(CharSequence charSequence) {
            p.q(charSequence);
            return true;
        }

        @Override // zj.d
        public boolean p(CharSequence charSequence) {
            return charSequence.length() == 0;
        }

        @Override // zj.d.e, zj.d
        public d q() {
            return d.r();
        }
    }

    private static final class c extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final char[] f235386a;

        public c(CharSequence charSequence) {
            char[] charArray = charSequence.toString().toCharArray();
            this.f235386a = charArray;
            Arrays.sort(charArray);
        }

        @Override // zj.d, zj.q
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch4) {
            return super.apply(ch4);
        }

        @Override // zj.d
        public boolean n(char c15) {
            return Arrays.binarySearch(this.f235386a, c15) >= 0;
        }

        @Override // zj.d
        public String toString() {
            StringBuilder sb5 = new StringBuilder("CharMatcher.anyOf(\"");
            for (char c15 : this.f235386a) {
                sb5.append(d.t(c15));
            }
            sb5.append("\")");
            return sb5.toString();
        }
    }

    /* JADX INFO: renamed from: zj.d$d, reason: collision with other inner class name */
    private static final class C6350d extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final d f235387b = new C6350d();

        C6350d() {
            super("CharMatcher.ascii()");
        }

        @Override // zj.d
        public boolean n(char c15) {
            return c15 <= 127;
        }
    }

    static abstract class e extends d {
        e() {
        }

        @Override // zj.d, zj.q
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch4) {
            return super.apply(ch4);
        }

        @Override // zj.d
        public d q() {
            return new l(this);
        }
    }

    private static final class f extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final char f235388a;

        f(char c15) {
            this.f235388a = c15;
        }

        @Override // zj.d
        public d b(d dVar) {
            return dVar.n(this.f235388a) ? this : d.r();
        }

        @Override // zj.d
        public boolean n(char c15) {
            return c15 == this.f235388a;
        }

        @Override // zj.d.e, zj.d
        public d q() {
            return d.l(this.f235388a);
        }

        @Override // zj.d
        public String toString() {
            return "CharMatcher.is('" + d.t(this.f235388a) + "')";
        }
    }

    private static final class g extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final char f235389a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final char f235390b;

        g(char c15, char c16) {
            this.f235389a = c15;
            this.f235390b = c16;
        }

        @Override // zj.d
        public boolean n(char c15) {
            return c15 == this.f235389a || c15 == this.f235390b;
        }

        @Override // zj.d
        public String toString() {
            return "CharMatcher.anyOf(\"" + d.t(this.f235389a) + d.t(this.f235390b) + "\")";
        }
    }

    private static final class h extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final char f235391a;

        h(char c15) {
            this.f235391a = c15;
        }

        @Override // zj.d
        public d b(d dVar) {
            return dVar.n(this.f235391a) ? super.b(dVar) : dVar;
        }

        @Override // zj.d
        public boolean n(char c15) {
            return c15 != this.f235391a;
        }

        @Override // zj.d.e, zj.d
        public d q() {
            return d.j(this.f235391a);
        }

        @Override // zj.d
        public String toString() {
            return "CharMatcher.isNot('" + d.t(this.f235391a) + "')";
        }
    }

    private static final class i extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final d f235392b = new i();

        private i() {
            super("CharMatcher.javaIsoControl()");
        }

        @Override // zj.d
        public boolean n(char c15) {
            if (c15 > 31) {
                return c15 >= 127 && c15 <= 159;
            }
            return true;
        }
    }

    static abstract class j extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f235393a;

        j(String str) {
            this.f235393a = (String) p.q(str);
        }

        @Override // zj.d
        public final String toString() {
            return this.f235393a;
        }
    }

    private static class k extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final d f235394a;

        k(d dVar) {
            this.f235394a = (d) p.q(dVar);
        }

        @Override // zj.d, zj.q
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch4) {
            return super.apply(ch4);
        }

        @Override // zj.d
        public int g(CharSequence charSequence) {
            return charSequence.length() - this.f235394a.g(charSequence);
        }

        @Override // zj.d
        public boolean n(char c15) {
            return !this.f235394a.n(c15);
        }

        @Override // zj.d
        public boolean o(CharSequence charSequence) {
            return this.f235394a.p(charSequence);
        }

        @Override // zj.d
        public boolean p(CharSequence charSequence) {
            return this.f235394a.o(charSequence);
        }

        @Override // zj.d
        public d q() {
            return this.f235394a;
        }

        @Override // zj.d
        public String toString() {
            return this.f235394a + ".negate()";
        }
    }

    private static class l extends k {
        l(d dVar) {
            super(dVar);
        }
    }

    private static final class m extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final d f235395b = new m();

        private m() {
            super("CharMatcher.none()");
        }

        @Override // zj.d
        public d b(d dVar) {
            p.q(dVar);
            return this;
        }

        @Override // zj.d
        public int g(CharSequence charSequence) {
            p.q(charSequence);
            return 0;
        }

        @Override // zj.d
        public int h(CharSequence charSequence) {
            p.q(charSequence);
            return -1;
        }

        @Override // zj.d
        public int i(CharSequence charSequence, int i15) {
            p.t(i15, charSequence.length());
            return -1;
        }

        @Override // zj.d
        public boolean n(char c15) {
            return false;
        }

        @Override // zj.d
        public boolean o(CharSequence charSequence) {
            return charSequence.length() == 0;
        }

        @Override // zj.d
        public boolean p(CharSequence charSequence) {
            p.q(charSequence);
            return true;
        }

        @Override // zj.d.e, zj.d
        public d q() {
            return d.c();
        }
    }

    static final class n extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final int f235396b = Integer.numberOfLeadingZeros(31);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final d f235397c = new n();

        n() {
            super("CharMatcher.whitespace()");
        }

        @Override // zj.d
        public boolean n(char c15) {
            return "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c15) >>> f235396b) == c15;
        }
    }

    protected d() {
    }

    public static d c() {
        return b.f235385b;
    }

    public static d d(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return r();
        }
        if (length != 1) {
            return length != 2 ? new c(charSequence) : k(charSequence.charAt(0), charSequence.charAt(1));
        }
        return j(charSequence.charAt(0));
    }

    public static d f() {
        return C6350d.f235387b;
    }

    public static d j(char c15) {
        return new f(c15);
    }

    private static g k(char c15, char c16) {
        return new g(c15, c16);
    }

    public static d l(char c15) {
        return new h(c15);
    }

    public static d m() {
        return i.f235392b;
    }

    public static d r() {
        return m.f235395b;
    }

    public static d s(CharSequence charSequence) {
        return d(charSequence).q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String t(char c15) {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i15 = 0; i15 < 4; i15++) {
            cArr[5 - i15] = "0123456789ABCDEF".charAt(c15 & 15);
            c15 = (char) (c15 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public static d u() {
        return n.f235397c;
    }

    public d b(d dVar) {
        return new a(this, dVar);
    }

    @Override // zj.q
    @Deprecated
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean apply(Character ch4) {
        return n(ch4.charValue());
    }

    public int g(CharSequence charSequence) {
        int i15 = 0;
        for (int i16 = 0; i16 < charSequence.length(); i16++) {
            if (n(charSequence.charAt(i16))) {
                i15++;
            }
        }
        return i15;
    }

    public int h(CharSequence charSequence) {
        return i(charSequence, 0);
    }

    public int i(CharSequence charSequence, int i15) {
        int length = charSequence.length();
        p.t(i15, length);
        while (i15 < length) {
            if (n(charSequence.charAt(i15))) {
                return i15;
            }
            i15++;
        }
        return -1;
    }

    public abstract boolean n(char c15);

    public boolean o(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!n(charSequence.charAt(length))) {
                return false;
            }
        }
        return true;
    }

    public boolean p(CharSequence charSequence) {
        return h(charSequence) == -1;
    }

    public d q() {
        return new k(this);
    }

    public String toString() {
        return super.toString();
    }
}
