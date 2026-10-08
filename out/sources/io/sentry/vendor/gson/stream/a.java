package io.sentry.vendor.gson.stream;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class a implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Reader f95873a;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f95881j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f95882k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f95883l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int[] f95884m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String[] f95886p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int[] f95887q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f95874b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final char[] f95875c = new char[1024];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f95876d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f95877e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f95878f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f95879g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f95880h = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f95885n = 1;

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f95884m = iArr;
        iArr[0] = 6;
        this.f95886p = new String[32];
        this.f95887q = new int[32];
        if (reader == null) {
            throw new NullPointerException("in == null");
        }
        this.f95873a = reader;
    }

    private boolean C(char c15) throws IOException {
        if (c15 == '\t' || c15 == '\n' || c15 == '\f' || c15 == '\r' || c15 == ' ') {
            return false;
        }
        if (c15 != '#') {
            if (c15 == ',') {
                return false;
            }
            if (c15 != '/' && c15 != '=') {
                if (c15 == '{' || c15 == '}' || c15 == ':') {
                    return false;
                }
                if (c15 != ';') {
                    switch (c15) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        h();
        return false;
    }

    private int I(boolean z15) throws IOException {
        char[] cArr = this.f95875c;
        int i15 = this.f95876d;
        int i16 = this.f95877e;
        while (true) {
            if (i15 == i16) {
                this.f95876d = i15;
                if (!u(1)) {
                    if (!z15) {
                        return -1;
                    }
                    throw new EOFException("End of input" + E());
                }
                i15 = this.f95876d;
                i16 = this.f95877e;
            }
            int i17 = i15 + 1;
            char c15 = cArr[i15];
            if (c15 == '\n') {
                this.f95878f++;
                this.f95879g = i17;
            } else if (c15 != ' ' && c15 != '\r' && c15 != '\t') {
                if (c15 == '/') {
                    this.f95876d = i17;
                    if (i17 == i16) {
                        this.f95876d = i15;
                        boolean zU = u(2);
                        this.f95876d++;
                        if (!zU) {
                        }
                        return c15;
                    }
                    h();
                    int i18 = this.f95876d;
                    char c16 = cArr[i18];
                    if (c16 == '*') {
                        this.f95876d = i18 + 1;
                        if (!a0("*/")) {
                            throw d0("Unterminated comment");
                        }
                        i15 = this.f95876d + 2;
                        i16 = this.f95877e;
                    } else {
                        if (c16 != '/') {
                            return c15;
                        }
                        this.f95876d = i18 + 1;
                        b0();
                        i15 = this.f95876d;
                        i16 = this.f95877e;
                    }
                } else {
                    if (c15 != '#') {
                        this.f95876d = i17;
                        return c15;
                    }
                    this.f95876d = i17;
                    h();
                    b0();
                    i15 = this.f95876d;
                    i16 = this.f95877e;
                }
            }
            i15 = i17;
        }
    }

    private String K(char c15) throws IOException {
        int i15;
        char[] cArr = this.f95875c;
        StringBuilder sb5 = null;
        do {
            int i16 = this.f95876d;
            int i17 = this.f95877e;
            while (true) {
                int i18 = i17;
                i15 = i16;
                while (true) {
                    if (i16 < i18) {
                        int i19 = i16 + 1;
                        char c16 = cArr[i16];
                        if (c16 == c15) {
                            this.f95876d = i19;
                            int i25 = (i19 - i15) - 1;
                            if (sb5 == null) {
                                return new String(cArr, i15, i25);
                            }
                            sb5.append(cArr, i15, i25);
                            return sb5.toString();
                        }
                        if (c16 == '\\') {
                            this.f95876d = i19;
                            int i26 = i19 - i15;
                            int i27 = i26 - 1;
                            if (sb5 == null) {
                                sb5 = new StringBuilder(Math.max(i26 * 2, 16));
                            }
                            sb5.append(cArr, i15, i27);
                            sb5.append(V());
                            i16 = this.f95876d;
                            i17 = this.f95877e;
                        } else {
                            if (c16 == '\n') {
                                this.f95878f++;
                                this.f95879g = i19;
                            }
                            i16 = i19;
                        }
                    }
                }
            }
            if (sb5 == null) {
                sb5 = new StringBuilder(Math.max((i16 - i15) * 2, 16));
            }
            sb5.append(cArr, i15, i16 - i15);
            this.f95876d = i16;
        } while (u(1));
        throw d0("Unterminated string");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    private String L() throws IOException {
        String string;
        StringBuilder sb5 = null;
        int i15 = 0;
        while (true) {
            int i16 = 0;
            while (true) {
                int i17 = this.f95876d;
                if (i17 + i16 < this.f95877e) {
                    char c15 = this.f95875c[i17 + i16];
                    if (c15 != '\t' && c15 != '\n' && c15 != '\f' && c15 != '\r' && c15 != ' ') {
                        if (c15 != '#') {
                            if (c15 != ',') {
                                if (c15 != '/' && c15 != '=') {
                                    if (c15 != '{' && c15 != '}' && c15 != ':') {
                                        if (c15 != ';') {
                                            switch (c15) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i16++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        h();
                    }
                    i15 = i16;
                } else if (i16 >= this.f95875c.length) {
                    if (sb5 == null) {
                        sb5 = new StringBuilder(Math.max(i16, 16));
                    }
                    sb5.append(this.f95875c, this.f95876d, i16);
                    this.f95876d += i16;
                    if (!u(1)) {
                    }
                } else if (!u(i16 + 1)) {
                    i15 = i16;
                }
                if (sb5 == null) {
                    string = new String(this.f95875c, this.f95876d, i15);
                } else {
                    sb5.append(this.f95875c, this.f95876d, i15);
                    string = sb5.toString();
                }
                this.f95876d += i15;
                return string;
            }
        }
    }

    private int M() {
        String str;
        String str2;
        int i15;
        char c15 = this.f95875c[this.f95876d];
        if (c15 == 't' || c15 == 'T') {
            str = "true";
            str2 = "TRUE";
            i15 = 5;
        } else if (c15 == 'f' || c15 == 'F') {
            str = "false";
            str2 = "FALSE";
            i15 = 6;
        } else {
            if (c15 != 'n' && c15 != 'N') {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i15 = 7;
        }
        int length = str.length();
        for (int i16 = 1; i16 < length; i16++) {
            if (this.f95876d + i16 >= this.f95877e && !u(i16 + 1)) {
                return 0;
            }
            char c16 = this.f95875c[this.f95876d + i16];
            if (c16 != str.charAt(i16) && c16 != str2.charAt(i16)) {
                return 0;
            }
        }
        if ((this.f95876d + length < this.f95877e || u(length + 1)) && C(this.f95875c[this.f95876d + length])) {
            return 0;
        }
        this.f95876d += length;
        this.f95880h = i15;
        return i15;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    /* JADX WARN: Code duplicated, block: B:85:0x00d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x00da  */
    /* JADX WARN: Code duplicated, block: B:91:0x00e1  */
    private int N() {
        char c15;
        int i15;
        char[] cArr = this.f95875c;
        int i16 = this.f95876d;
        int i17 = this.f95877e;
        int i18 = 0;
        int i19 = 0;
        char c16 = 0;
        boolean z15 = false;
        int i25 = 1;
        long j15 = 0;
        while (true) {
            char c17 = 2;
            if (i16 + i19 != i17) {
                c15 = cArr[i16 + i19];
                i15 = i18;
                if (c15 != '+') {
                    if (c15 != 'E' || c15 == 'e') {
                        if (c16 == 2 && c16 != 4) {
                            return i15;
                        }
                        c16 = 5;
                    } else if (c15 == '-') {
                        c17 = 6;
                        if (c16 == 0) {
                            c16 = 1;
                            z15 = true;
                        } else if (c16 != 5) {
                            return i15;
                        }
                    } else if (c15 != '.') {
                        if (c15 < '0' || c15 > '9') {
                            if (!C(c15)) {
                                break;
                            }
                            return i15;
                        }
                        if (c16 == 1 || c16 == 0) {
                            j15 = -(c15 - '0');
                        } else if (c16 == 2) {
                            if (j15 == 0) {
                                return i15;
                            }
                            long j16 = (10 * j15) - ((long) (c15 - '0'));
                            i25 &= (j15 > -922337203685477580L || (j15 == -922337203685477580L && j16 < j15)) ? 1 : i15;
                            j15 = j16;
                        } else if (c16 == 3) {
                            c16 = 4;
                        } else if (c16 == 5 || c16 == 6) {
                            c16 = 7;
                        }
                    } else {
                        if (c16 != 2) {
                            return i15;
                        }
                        c16 = 3;
                    }
                    i19++;
                    i18 = i15;
                } else {
                    c17 = 6;
                    if (c16 != 5) {
                        return i15;
                    }
                }
                c16 = c17;
                i19++;
                i18 = i15;
            } else {
                if (i19 == cArr.length) {
                    return i18;
                }
                if (!u(i19 + 1)) {
                    i15 = i18;
                    break;
                }
                i16 = this.f95876d;
                i17 = this.f95877e;
                c15 = cArr[i16 + i19];
                i15 = i18;
                if (c15 != '+') {
                    if (c15 != 'E') {
                        if (c16 == 2) {
                        }
                        c16 = 5;
                    } else {
                        if (c16 == 2) {
                        }
                        c16 = 5;
                    }
                    i19++;
                    i18 = i15;
                } else {
                    c17 = 6;
                    if (c16 != 5) {
                        return i15;
                    }
                }
                c16 = c17;
                i19++;
                i18 = i15;
            }
        }
        if (c16 == 2 && i25 != 0 && ((j15 != Long.MIN_VALUE || z15) && (j15 != 0 || !z15))) {
            if (!z15) {
                j15 = -j15;
            }
            this.f95881j = j15;
            this.f95876d += i19;
            this.f95880h = 15;
            return 15;
        }
        if (c16 != 2 && c16 != 4 && c16 != 7) {
            return i15;
        }
        this.f95882k = i19;
        this.f95880h = 16;
        return 16;
    }

    private void O(int i15) {
        int i16 = this.f95885n;
        int[] iArr = this.f95884m;
        if (i16 == iArr.length) {
            int i17 = i16 * 2;
            this.f95884m = Arrays.copyOf(iArr, i17);
            this.f95887q = Arrays.copyOf(this.f95887q, i17);
            this.f95886p = (String[]) Arrays.copyOf(this.f95886p, i17);
        }
        int[] iArr2 = this.f95884m;
        int i18 = this.f95885n;
        this.f95885n = i18 + 1;
        iArr2[i18] = i15;
    }

    private char V() throws IOException {
        int i15;
        if (this.f95876d == this.f95877e && !u(1)) {
            throw d0("Unterminated escape sequence");
        }
        char[] cArr = this.f95875c;
        int i16 = this.f95876d;
        int i17 = i16 + 1;
        this.f95876d = i17;
        char c15 = cArr[i16];
        if (c15 == '\n') {
            this.f95878f++;
            this.f95879g = i17;
            return c15;
        }
        if (c15 == '\"' || c15 == '\'' || c15 == '/' || c15 == '\\') {
            return c15;
        }
        if (c15 == 'b') {
            return '\b';
        }
        if (c15 == 'f') {
            return '\f';
        }
        if (c15 == 'n') {
            return '\n';
        }
        if (c15 == 'r') {
            return '\r';
        }
        if (c15 == 't') {
            return '\t';
        }
        if (c15 != 'u') {
            throw d0("Invalid escape sequence");
        }
        if (i16 + 5 > this.f95877e && !u(4)) {
            throw d0("Unterminated escape sequence");
        }
        int i18 = this.f95876d;
        int i19 = i18 + 4;
        char c16 = 0;
        while (i18 < i19) {
            char c17 = this.f95875c[i18];
            char c18 = (char) (c16 << 4);
            if (c17 >= '0' && c17 <= '9') {
                i15 = c17 - '0';
            } else if (c17 >= 'a' && c17 <= 'f') {
                i15 = c17 - 'W';
            } else {
                if (c17 < 'A' || c17 > 'F') {
                    throw new NumberFormatException("\\u" + new String(this.f95875c, this.f95876d, 4));
                }
                i15 = c17 - '7';
            }
            c16 = (char) (c18 + i15);
            i18++;
        }
        this.f95876d += 4;
        return c16;
    }

    private void Z(char c15) throws IOException {
        char[] cArr = this.f95875c;
        do {
            int i15 = this.f95876d;
            int i16 = this.f95877e;
            while (i15 < i16) {
                int i17 = i15 + 1;
                char c16 = cArr[i15];
                if (c16 == c15) {
                    this.f95876d = i17;
                    return;
                }
                if (c16 == '\\') {
                    this.f95876d = i17;
                    V();
                    i15 = this.f95876d;
                    i16 = this.f95877e;
                } else {
                    if (c16 == '\n') {
                        this.f95878f++;
                        this.f95879g = i17;
                    }
                    i15 = i17;
                }
            }
            this.f95876d = i15;
        } while (u(1));
        throw d0("Unterminated string");
    }

    private boolean a0(String str) {
        int length = str.length();
        while (true) {
            if (this.f95876d + length > this.f95877e && !u(length)) {
                return false;
            }
            char[] cArr = this.f95875c;
            int i15 = this.f95876d;
            if (cArr[i15] != '\n') {
                for (int i16 = 0; i16 < length; i16++) {
                    if (this.f95875c[this.f95876d + i16] == str.charAt(i16)) {
                    }
                }
                return true;
            }
            this.f95878f++;
            this.f95879g = i15 + 1;
            this.f95876d++;
        }
    }

    private void b0() {
        char c15;
        do {
            if (this.f95876d >= this.f95877e && !u(1)) {
                return;
            }
            char[] cArr = this.f95875c;
            int i15 = this.f95876d;
            int i16 = i15 + 1;
            this.f95876d = i16;
            c15 = cArr[i15];
            if (c15 == '\n') {
                this.f95878f++;
                this.f95879g = i16;
                return;
            }
        } while (c15 != '\r');
    }

    private void c0() throws IOException {
        do {
            int i15 = 0;
            while (true) {
                int i16 = this.f95876d;
                if (i16 + i15 < this.f95877e) {
                    char c15 = this.f95875c[i16 + i15];
                    if (c15 != '\t' && c15 != '\n' && c15 != '\f' && c15 != '\r' && c15 != ' ') {
                        if (c15 != '#') {
                            if (c15 != ',') {
                                if (c15 != '/' && c15 != '=') {
                                    if (c15 != '{' && c15 != '}' && c15 != ':') {
                                        if (c15 != ';') {
                                            switch (c15) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i15++;
                                                    break;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                        h();
                    }
                    this.f95876d += i15;
                    return;
                }
                this.f95876d = i16 + i15;
            }
        } while (u(1));
    }

    private IOException d0(String str) throws d {
        throw new d(str + E());
    }

    private void h() throws IOException {
        if (!this.f95874b) {
            throw d0("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void m() throws IOException {
        I(true);
        int i15 = this.f95876d;
        int i16 = i15 - 1;
        this.f95876d = i16;
        if (i15 + 4 <= this.f95877e || u(5)) {
            char[] cArr = this.f95875c;
            if (cArr[i16] == ')' && cArr[i15] == ']' && cArr[i15 + 1] == '}' && cArr[i15 + 2] == '\'' && cArr[i15 + 3] == '\n') {
                this.f95876d += 5;
            }
        }
    }

    private boolean u(int i15) throws IOException {
        int i16;
        int i17;
        char[] cArr = this.f95875c;
        int i18 = this.f95879g;
        int i19 = this.f95876d;
        this.f95879g = i18 - i19;
        int i25 = this.f95877e;
        if (i25 != i19) {
            int i26 = i25 - i19;
            this.f95877e = i26;
            System.arraycopy(cArr, i19, cArr, 0, i26);
        } else {
            this.f95877e = 0;
        }
        this.f95876d = 0;
        do {
            Reader reader = this.f95873a;
            int i27 = this.f95877e;
            int i28 = reader.read(cArr, i27, cArr.length - i27);
            if (i28 == -1) {
                return false;
            }
            i16 = this.f95877e + i28;
            this.f95877e = i16;
            if (this.f95878f == 0 && (i17 = this.f95879g) == 0 && i16 > 0 && cArr[0] == 65279) {
                this.f95876d++;
                this.f95879g = i17 + 1;
                i15++;
            }
        } while (i16 < i15);
        return true;
    }

    String E() {
        return " at line " + (this.f95878f + 1) + " column " + ((this.f95876d - this.f95879g) + 1) + " path " + W();
    }

    public void G0() throws IOException {
        int i15 = 0;
        do {
            int iP = this.f95880h;
            if (iP == 0) {
                iP = p();
            }
            if (iP == 3) {
                O(1);
            } else {
                if (iP == 1) {
                    O(3);
                } else if (iP == 4 || iP == 2) {
                    this.f95885n--;
                    i15--;
                } else if (iP == 14 || iP == 10) {
                    c0();
                } else if (iP == 8 || iP == 12) {
                    Z('\'');
                } else if (iP == 9 || iP == 13) {
                    Z('\"');
                } else if (iP == 16) {
                    this.f95876d += this.f95882k;
                }
                this.f95880h = 0;
            }
            i15++;
            this.f95880h = 0;
        } while (i15 != 0);
        int[] iArr = this.f95887q;
        int i16 = this.f95885n;
        int i17 = i16 - 1;
        iArr[i17] = iArr[i17] + 1;
        this.f95886p[i16 - 1] = "null";
    }

    public boolean H() throws IOException {
        int iP = this.f95880h;
        if (iP == 0) {
            iP = p();
        }
        if (iP == 5) {
            this.f95880h = 0;
            int[] iArr = this.f95887q;
            int i15 = this.f95885n - 1;
            iArr[i15] = iArr[i15] + 1;
            return true;
        }
        if (iP == 6) {
            this.f95880h = 0;
            int[] iArr2 = this.f95887q;
            int i16 = this.f95885n - 1;
            iArr2[i16] = iArr2[i16] + 1;
            return false;
        }
        throw new IllegalStateException("Expected a boolean but was " + peek() + E());
    }

    public void J() throws IOException {
        int iP = this.f95880h;
        if (iP == 0) {
            iP = p();
        }
        if (iP == 7) {
            this.f95880h = 0;
            int[] iArr = this.f95887q;
            int i15 = this.f95885n - 1;
            iArr[i15] = iArr[i15] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + peek() + E());
    }

    public String W() {
        StringBuilder sb5 = new StringBuilder();
        sb5.append('$');
        int i15 = this.f95885n;
        for (int i16 = 0; i16 < i15; i16++) {
            int i17 = this.f95884m[i16];
            if (i17 == 1 || i17 == 2) {
                sb5.append('[');
                sb5.append(this.f95887q[i16]);
                sb5.append(']');
            } else if (i17 == 3 || i17 == 4 || i17 == 5) {
                sb5.append('.');
                String str = this.f95886p[i16];
                if (str != null) {
                    sb5.append(str);
                }
            }
        }
        return sb5.toString();
    }

    public void Y() throws IOException {
        int iP = this.f95880h;
        if (iP == 0) {
            iP = p();
        }
        if (iP == 1) {
            O(3);
            this.f95880h = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + peek() + E());
        }
    }

    public void b() throws IOException {
        int iP = this.f95880h;
        if (iP == 0) {
            iP = p();
        }
        if (iP == 3) {
            O(1);
            this.f95887q[this.f95885n - 1] = 0;
            this.f95880h = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + peek() + E());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f95880h = 0;
        this.f95884m[0] = 8;
        this.f95885n = 1;
        this.f95873a.close();
    }

    public final void e0(boolean z15) {
        this.f95874b = z15;
    }

    public void h0() throws IOException {
        int iP = this.f95880h;
        if (iP == 0) {
            iP = p();
        }
        if (iP != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + peek() + E());
        }
        int i15 = this.f95885n;
        int i16 = i15 - 1;
        this.f95885n = i16;
        this.f95886p[i16] = null;
        int[] iArr = this.f95887q;
        int i17 = i15 - 2;
        iArr[i17] = iArr[i17] + 1;
        this.f95880h = 0;
    }

    public String h1() throws IOException {
        String strK;
        int iP = this.f95880h;
        if (iP == 0) {
            iP = p();
        }
        if (iP == 14) {
            strK = L();
        } else if (iP == 12) {
            strK = K('\'');
        } else {
            if (iP != 13) {
                throw new IllegalStateException("Expected a name but was " + peek() + E());
            }
            strK = K('\"');
        }
        this.f95880h = 0;
        this.f95886p[this.f95885n - 1] = strK;
        return strK;
    }

    public double nextDouble() throws IOException {
        int iP = this.f95880h;
        if (iP == 0) {
            iP = p();
        }
        if (iP == 15) {
            this.f95880h = 0;
            int[] iArr = this.f95887q;
            int i15 = this.f95885n - 1;
            iArr[i15] = iArr[i15] + 1;
            return this.f95881j;
        }
        if (iP == 16) {
            this.f95883l = new String(this.f95875c, this.f95876d, this.f95882k);
            this.f95876d += this.f95882k;
        } else if (iP == 8 || iP == 9) {
            this.f95883l = K(iP == 8 ? '\'' : '\"');
        } else if (iP == 10) {
            this.f95883l = L();
        } else if (iP != 11) {
            throw new IllegalStateException("Expected a double but was " + peek() + E());
        }
        this.f95880h = 11;
        double d15 = Double.parseDouble(this.f95883l);
        if (!this.f95874b && (Double.isNaN(d15) || Double.isInfinite(d15))) {
            throw new d("JSON forbids NaN and infinities: " + d15 + E());
        }
        this.f95883l = null;
        this.f95880h = 0;
        int[] iArr2 = this.f95887q;
        int i16 = this.f95885n - 1;
        iArr2[i16] = iArr2[i16] + 1;
        return d15;
    }

    public int nextInt() throws IOException {
        int iP = this.f95880h;
        if (iP == 0) {
            iP = p();
        }
        if (iP == 15) {
            long j15 = this.f95881j;
            int i15 = (int) j15;
            if (j15 == i15) {
                this.f95880h = 0;
                int[] iArr = this.f95887q;
                int i16 = this.f95885n - 1;
                iArr[i16] = iArr[i16] + 1;
                return i15;
            }
            throw new NumberFormatException("Expected an int but was " + this.f95881j + E());
        }
        if (iP == 16) {
            this.f95883l = new String(this.f95875c, this.f95876d, this.f95882k);
            this.f95876d += this.f95882k;
        } else {
            if (iP != 8 && iP != 9 && iP != 10) {
                throw new IllegalStateException("Expected an int but was " + peek() + E());
            }
            if (iP == 10) {
                this.f95883l = L();
            } else {
                this.f95883l = K(iP == 8 ? '\'' : '\"');
            }
            try {
                int i17 = Integer.parseInt(this.f95883l);
                this.f95880h = 0;
                int[] iArr2 = this.f95887q;
                int i18 = this.f95885n - 1;
                iArr2[i18] = iArr2[i18] + 1;
                return i17;
            } catch (NumberFormatException unused) {
            }
        }
        this.f95880h = 11;
        double d15 = Double.parseDouble(this.f95883l);
        int i19 = (int) d15;
        if (i19 != d15) {
            throw new NumberFormatException("Expected an int but was " + this.f95883l + E());
        }
        this.f95883l = null;
        this.f95880h = 0;
        int[] iArr3 = this.f95887q;
        int i25 = this.f95885n - 1;
        iArr3[i25] = iArr3[i25] + 1;
        return i19;
    }

    public long nextLong() throws IOException {
        int iP = this.f95880h;
        if (iP == 0) {
            iP = p();
        }
        if (iP == 15) {
            this.f95880h = 0;
            int[] iArr = this.f95887q;
            int i15 = this.f95885n - 1;
            iArr[i15] = iArr[i15] + 1;
            return this.f95881j;
        }
        if (iP == 16) {
            this.f95883l = new String(this.f95875c, this.f95876d, this.f95882k);
            this.f95876d += this.f95882k;
        } else {
            if (iP != 8 && iP != 9 && iP != 10) {
                throw new IllegalStateException("Expected a long but was " + peek() + E());
            }
            if (iP == 10) {
                this.f95883l = L();
            } else {
                this.f95883l = K(iP == 8 ? '\'' : '\"');
            }
            try {
                long j15 = Long.parseLong(this.f95883l);
                this.f95880h = 0;
                int[] iArr2 = this.f95887q;
                int i16 = this.f95885n - 1;
                iArr2[i16] = iArr2[i16] + 1;
                return j15;
            } catch (NumberFormatException unused) {
            }
        }
        this.f95880h = 11;
        double d15 = Double.parseDouble(this.f95883l);
        long j16 = (long) d15;
        if (j16 != d15) {
            throw new NumberFormatException("Expected a long but was " + this.f95883l + E());
        }
        this.f95883l = null;
        this.f95880h = 0;
        int[] iArr3 = this.f95887q;
        int i17 = this.f95885n - 1;
        iArr3[i17] = iArr3[i17] + 1;
        return j16;
    }

    int p() throws IOException {
        int I;
        int[] iArr = this.f95884m;
        int i15 = this.f95885n;
        int i16 = iArr[i15 - 1];
        if (i16 == 1) {
            iArr[i15 - 1] = 2;
        } else if (i16 == 2) {
            int I2 = I(true);
            if (I2 != 44) {
                if (I2 != 59) {
                    if (I2 != 93) {
                        throw d0("Unterminated array");
                    }
                    this.f95880h = 4;
                    return 4;
                }
                h();
            }
        } else {
            if (i16 == 3 || i16 == 5) {
                iArr[i15 - 1] = 4;
                if (i16 == 5 && (I = I(true)) != 44) {
                    if (I != 59) {
                        if (I != 125) {
                            throw d0("Unterminated object");
                        }
                        this.f95880h = 2;
                        return 2;
                    }
                    h();
                }
                int I3 = I(true);
                if (I3 == 34) {
                    this.f95880h = 13;
                    return 13;
                }
                if (I3 == 39) {
                    h();
                    this.f95880h = 12;
                    return 12;
                }
                if (I3 == 125) {
                    if (i16 == 5) {
                        throw d0("Expected name");
                    }
                    this.f95880h = 2;
                    return 2;
                }
                h();
                this.f95876d--;
                if (!C((char) I3)) {
                    throw d0("Expected name");
                }
                this.f95880h = 14;
                return 14;
            }
            if (i16 == 4) {
                iArr[i15 - 1] = 5;
                int I4 = I(true);
                if (I4 != 58) {
                    if (I4 != 61) {
                        throw d0("Expected ':'");
                    }
                    h();
                    if (this.f95876d < this.f95877e || u(1)) {
                        char[] cArr = this.f95875c;
                        int i17 = this.f95876d;
                        if (cArr[i17] == '>') {
                            this.f95876d = i17 + 1;
                        }
                    }
                }
            } else if (i16 == 6) {
                if (this.f95874b) {
                    m();
                }
                this.f95884m[this.f95885n - 1] = 7;
            } else if (i16 == 7) {
                if (I(false) == -1) {
                    this.f95880h = 17;
                    return 17;
                }
                h();
                this.f95876d--;
            } else if (i16 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int I5 = I(true);
        if (I5 == 34) {
            this.f95880h = 9;
            return 9;
        }
        if (I5 == 39) {
            h();
            this.f95880h = 8;
            return 8;
        }
        if (I5 != 44 && I5 != 59) {
            if (I5 == 91) {
                this.f95880h = 3;
                return 3;
            }
            if (I5 != 93) {
                if (I5 == 123) {
                    this.f95880h = 1;
                    return 1;
                }
                this.f95876d--;
                int iM = M();
                if (iM != 0) {
                    return iM;
                }
                int iN = N();
                if (iN != 0) {
                    return iN;
                }
                if (!C(this.f95875c[this.f95876d])) {
                    throw d0("Expected value");
                }
                h();
                this.f95880h = 10;
                return 10;
            }
            if (i16 == 1) {
                this.f95880h = 4;
                return 4;
            }
        }
        if (i16 != 1 && i16 != 2) {
            throw d0("Unexpected value");
        }
        h();
        this.f95876d--;
        this.f95880h = 7;
        return 7;
    }

    public b peek() throws IOException {
        int iP = this.f95880h;
        if (iP == 0) {
            iP = p();
        }
        switch (iP) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return b.STRING;
            case 12:
            case 13:
            case 14:
                return b.NAME;
            case 15:
            case 16:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public String q2() throws IOException {
        String str;
        int iP = this.f95880h;
        if (iP == 0) {
            iP = p();
        }
        if (iP == 10) {
            str = L();
        } else if (iP == 8) {
            str = K('\'');
        } else if (iP == 9) {
            str = K('\"');
        } else if (iP == 11) {
            str = this.f95883l;
            this.f95883l = null;
        } else if (iP == 15) {
            str = Long.toString(this.f95881j);
        } else {
            if (iP != 16) {
                throw new IllegalStateException("Expected a string but was " + peek() + E());
            }
            str = new String(this.f95875c, this.f95876d, this.f95882k);
            this.f95876d += this.f95882k;
        }
        this.f95880h = 0;
        int[] iArr = this.f95887q;
        int i15 = this.f95885n - 1;
        iArr[i15] = iArr[i15] + 1;
        return str;
    }

    public void r() throws IOException {
        int iP = this.f95880h;
        if (iP == 0) {
            iP = p();
        }
        if (iP != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + peek() + E());
        }
        int i15 = this.f95885n;
        this.f95885n = i15 - 1;
        int[] iArr = this.f95887q;
        int i16 = i15 - 2;
        iArr[i16] = iArr[i16] + 1;
        this.f95880h = 0;
    }

    public String toString() {
        return getClass().getSimpleName() + E();
    }

    public boolean y() throws IOException {
        int iP = this.f95880h;
        if (iP == 0) {
            iP = p();
        }
        return (iP == 2 || iP == 4) ? false : true;
    }
}
