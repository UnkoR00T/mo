package h6;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final g f81185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f81186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f81187f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final a f81188g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final a f81189h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f81190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f81191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f81192c;

    /* JADX INFO: renamed from: h6.a$a, reason: collision with other inner class name */
    public static final class C1871a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f81193a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f81194b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private g f81195c;

        public C1871a() {
            c(a.e(Locale.getDefault()));
        }

        private static a b(boolean z15) {
            return z15 ? a.f81189h : a.f81188g;
        }

        private void c(boolean z15) {
            this.f81193a = z15;
            this.f81195c = a.f81185d;
            this.f81194b = 2;
        }

        public a a() {
            return (this.f81194b == 2 && this.f81195c == a.f81185d) ? b(this.f81193a) : new a(this.f81193a, this.f81194b, this.f81195c);
        }
    }

    private static class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final byte[] f81196f = new byte[1792];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final CharSequence f81197a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f81198b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f81199c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f81200d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private char f81201e;

        static {
            for (int i15 = 0; i15 < 1792; i15++) {
                f81196f[i15] = Character.getDirectionality(i15);
            }
        }

        b(CharSequence charSequence, boolean z15) {
            this.f81197a = charSequence;
            this.f81198b = z15;
            this.f81199c = charSequence.length();
        }

        private static byte c(char c15) {
            return c15 < 1792 ? f81196f[c15] : Character.getDirectionality(c15);
        }

        private byte f() {
            char cCharAt;
            int i15 = this.f81200d;
            do {
                int i16 = this.f81200d;
                if (i16 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f81197a;
                int i17 = i16 - 1;
                this.f81200d = i17;
                cCharAt = charSequence.charAt(i17);
                this.f81201e = cCharAt;
                if (cCharAt == '&') {
                    return (byte) 12;
                }
            } while (cCharAt != ';');
            this.f81200d = i15;
            this.f81201e = ';';
            return (byte) 13;
        }

        private byte g() {
            char cCharAt;
            do {
                int i15 = this.f81200d;
                if (i15 >= this.f81199c) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f81197a;
                this.f81200d = i15 + 1;
                cCharAt = charSequence.charAt(i15);
                this.f81201e = cCharAt;
            } while (cCharAt != ';');
            return (byte) 12;
        }

        private byte h() {
            char cCharAt;
            int i15 = this.f81200d;
            while (true) {
                int i16 = this.f81200d;
                if (i16 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f81197a;
                int i17 = i16 - 1;
                this.f81200d = i17;
                char cCharAt2 = charSequence.charAt(i17);
                this.f81201e = cCharAt2;
                if (cCharAt2 == '<') {
                    return (byte) 12;
                }
                if (cCharAt2 == '>') {
                    break;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i18 = this.f81200d;
                        if (i18 <= 0) {
                            break;
                        }
                        CharSequence charSequence2 = this.f81197a;
                        int i19 = i18 - 1;
                        this.f81200d = i19;
                        cCharAt = charSequence2.charAt(i19);
                        this.f81201e = cCharAt;
                    } while (cCharAt != cCharAt2);
                }
            }
            this.f81200d = i15;
            this.f81201e = '>';
            return (byte) 13;
        }

        private byte i() {
            char cCharAt;
            int i15 = this.f81200d;
            while (true) {
                int i16 = this.f81200d;
                if (i16 >= this.f81199c) {
                    this.f81200d = i15;
                    this.f81201e = '<';
                    return (byte) 13;
                }
                CharSequence charSequence = this.f81197a;
                this.f81200d = i16 + 1;
                char cCharAt2 = charSequence.charAt(i16);
                this.f81201e = cCharAt2;
                if (cCharAt2 == '>') {
                    return (byte) 12;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i17 = this.f81200d;
                        if (i17 >= this.f81199c) {
                            break;
                        }
                        CharSequence charSequence2 = this.f81197a;
                        this.f81200d = i17 + 1;
                        cCharAt = charSequence2.charAt(i17);
                        this.f81201e = cCharAt;
                    } while (cCharAt != cCharAt2);
                }
            }
        }

        byte a() {
            char cCharAt = this.f81197a.charAt(this.f81200d - 1);
            this.f81201e = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(this.f81197a, this.f81200d);
                this.f81200d -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.f81200d--;
            byte bC = c(this.f81201e);
            if (!this.f81198b) {
                return bC;
            }
            char c15 = this.f81201e;
            if (c15 == '>') {
                return h();
            }
            return c15 == ';' ? f() : bC;
        }

        byte b() {
            char cCharAt = this.f81197a.charAt(this.f81200d);
            this.f81201e = cCharAt;
            if (Character.isHighSurrogate(cCharAt)) {
                int iCodePointAt = Character.codePointAt(this.f81197a, this.f81200d);
                this.f81200d += Character.charCount(iCodePointAt);
                return Character.getDirectionality(iCodePointAt);
            }
            this.f81200d++;
            byte bC = c(this.f81201e);
            if (!this.f81198b) {
                return bC;
            }
            char c15 = this.f81201e;
            if (c15 == '<') {
                return i();
            }
            return c15 == '&' ? g() : bC;
        }

        int d() {
            this.f81200d = 0;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            while (this.f81200d < this.f81199c && i15 == 0) {
                byte b15 = b();
                if (b15 != 0) {
                    if (b15 == 1 || b15 == 2) {
                        if (i17 == 0) {
                            return 1;
                        }
                    } else if (b15 != 9) {
                        switch (b15) {
                            case 14:
                            case 15:
                                i17++;
                                i16 = -1;
                                continue;
                            case 16:
                            case 17:
                                i17++;
                                i16 = 1;
                                continue;
                            case 18:
                                i17--;
                                i16 = 0;
                                continue;
                        }
                    }
                } else if (i17 == 0) {
                    return -1;
                }
                i15 = i17;
            }
            if (i15 == 0) {
                return 0;
            }
            if (i16 != 0) {
                return i16;
            }
            while (this.f81200d > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i15 == i17) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i15 == i17) {
                            return 1;
                        }
                        break;
                    case 18:
                        i17++;
                        continue;
                    default:
                        continue;
                }
                i17--;
            }
            return 0;
        }

        int e() {
            this.f81200d = this.f81199c;
            int i15 = 0;
            while (true) {
                int i16 = i15;
                while (this.f81200d > 0) {
                    byte bA = a();
                    if (bA == 0) {
                        if (i15 == 0) {
                            return -1;
                        }
                        if (i16 == 0) {
                        }
                    } else if (bA == 1 || bA == 2) {
                        if (i15 == 0) {
                            return 1;
                        }
                        if (i16 == 0) {
                        }
                    } else if (bA != 9) {
                        switch (bA) {
                            case 14:
                            case 15:
                                if (i16 == i15) {
                                    return -1;
                                }
                                i15--;
                                break;
                            case 16:
                            case 17:
                                if (i16 == i15) {
                                    return 1;
                                }
                                i15--;
                                break;
                            case 18:
                                i15++;
                                break;
                            default:
                                if (i16 != 0) {
                                }
                                break;
                        }
                    } else {
                        continue;
                    }
                }
                return 0;
            }
        }
    }

    static {
        g gVar = h.f81217c;
        f81185d = gVar;
        f81186e = Character.toString((char) 8206);
        f81187f = Character.toString((char) 8207);
        f81188g = new a(false, 2, gVar);
        f81189h = new a(true, 2, gVar);
    }

    a(boolean z15, int i15, g gVar) {
        this.f81190a = z15;
        this.f81191b = i15;
        this.f81192c = gVar;
    }

    private static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    private static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static a c() {
        return new C1871a().a();
    }

    static boolean e(Locale locale) {
        return i.a(locale) == 1;
    }

    private String f(CharSequence charSequence, g gVar) {
        boolean zIsRtl = gVar.isRtl(charSequence, 0, charSequence.length());
        if (!this.f81190a && (zIsRtl || b(charSequence) == 1)) {
            return f81186e;
        }
        if (this.f81190a) {
            return (!zIsRtl || b(charSequence) == -1) ? f81187f : "";
        }
        return "";
    }

    private String g(CharSequence charSequence, g gVar) {
        boolean zIsRtl = gVar.isRtl(charSequence, 0, charSequence.length());
        if (!this.f81190a && (zIsRtl || a(charSequence) == 1)) {
            return f81186e;
        }
        if (this.f81190a) {
            return (!zIsRtl || a(charSequence) == -1) ? f81187f : "";
        }
        return "";
    }

    public boolean d() {
        return (this.f81191b & 2) != 0;
    }

    public CharSequence h(CharSequence charSequence) {
        return i(charSequence, this.f81192c, true);
    }

    public CharSequence i(CharSequence charSequence, g gVar, boolean z15) {
        if (charSequence == null) {
            return null;
        }
        boolean zIsRtl = gVar.isRtl(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (d() && z15) {
            spannableStringBuilder.append((CharSequence) g(charSequence, zIsRtl ? h.f81216b : h.f81215a));
        }
        if (zIsRtl != this.f81190a) {
            spannableStringBuilder.append(zIsRtl ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z15) {
            spannableStringBuilder.append((CharSequence) f(charSequence, zIsRtl ? h.f81216b : h.f81215a));
        }
        return spannableStringBuilder;
    }

    public String j(String str) {
        return k(str, this.f81192c, true);
    }

    public String k(String str, g gVar, boolean z15) {
        if (str == null) {
            return null;
        }
        return i(str, gVar, z15).toString();
    }
}
