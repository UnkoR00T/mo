package zl;

import com.google.gson.x;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import wl.h0;
import wl.y;

/* JADX INFO: loaded from: classes4.dex */
public class a implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Reader f235584a;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f235593k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f235594l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f235595m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int[] f235596n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String[] f235598q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int[] f235599r;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private x f235585b = x.LEGACY_STRICT;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f235586c = GF2Field.MASK;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final char[] f235587d = new char[1024];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f235588e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f235589f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f235590g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f235591h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f235592j = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f235597p = 1;

    /* JADX INFO: renamed from: zl.a$a, reason: collision with other inner class name */
    class C6360a extends y {
        C6360a() {
        }

        @Override // wl.y
        public void a(a aVar) throws IOException {
            if (aVar instanceof com.google.gson.internal.bind.b) {
                ((com.google.gson.internal.bind.b) aVar).C1();
                return;
            }
            int iR = aVar.f235592j;
            if (iR == 0) {
                iR = aVar.r();
            }
            if (iR == 13) {
                aVar.f235592j = 9;
            } else if (iR == 12) {
                aVar.f235592j = 8;
            } else {
                if (iR != 14) {
                    throw aVar.Y0("a name");
                }
                aVar.f235592j = 10;
            }
        }
    }

    static {
        y.f214061a = new C6360a();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f235596n = iArr;
        iArr[0] = 6;
        this.f235598q = new String[32];
        this.f235599r = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f235584a = reader;
    }

    private String C(boolean z15) {
        StringBuilder sb5 = new StringBuilder();
        sb5.append('$');
        int i15 = 0;
        while (true) {
            int i16 = this.f235597p;
            if (i15 >= i16) {
                return sb5.toString();
            }
            int i17 = this.f235596n[i15];
            switch (i17) {
                case 1:
                case 2:
                    int i18 = this.f235599r[i15];
                    if (z15 && i18 > 0 && i15 == i16 - 1) {
                        i18--;
                    }
                    sb5.append('[');
                    sb5.append(i18);
                    sb5.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb5.append('.');
                    String str = this.f235598q[i15];
                    if (str != null) {
                        sb5.append(str);
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new AssertionError("Unknown scope value: " + i17);
            }
            i15++;
        }
    }

    private boolean C0(String str) {
        int length = str.length();
        while (true) {
            if (this.f235588e + length > this.f235589f && !y(length)) {
                return false;
            }
            char[] cArr = this.f235587d;
            int i15 = this.f235588e;
            if (cArr[i15] != '\n') {
                for (int i16 = 0; i16 < length; i16++) {
                    if (this.f235587d[this.f235588e + i16] == str.charAt(i16)) {
                    }
                }
                return true;
            }
            this.f235590g++;
            this.f235591h = i15 + 1;
            this.f235588e++;
        }
    }

    private void H0() {
        char c15;
        do {
            if (this.f235588e >= this.f235589f && !y(1)) {
                return;
            }
            char[] cArr = this.f235587d;
            int i15 = this.f235588e;
            int i16 = i15 + 1;
            this.f235588e = i16;
            c15 = cArr[i15];
            if (c15 == '\n') {
                this.f235590g++;
                this.f235591h = i16;
                return;
            }
        } while (c15 != '\r');
    }

    private boolean K(char c15) throws d {
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
        m();
        return false;
    }

    private int N(boolean z15) throws IOException {
        char[] cArr = this.f235587d;
        int i15 = this.f235588e;
        int i16 = this.f235589f;
        while (true) {
            if (i15 == i16) {
                this.f235588e = i15;
                if (!y(1)) {
                    if (!z15) {
                        return -1;
                    }
                    throw new EOFException("End of input" + L());
                }
                i15 = this.f235588e;
                i16 = this.f235589f;
            }
            int i17 = i15 + 1;
            char c15 = cArr[i15];
            if (c15 == '\n') {
                this.f235590g++;
                this.f235591h = i17;
            } else if (c15 != ' ' && c15 != '\r' && c15 != '\t') {
                if (c15 == '/') {
                    this.f235588e = i17;
                    if (i17 == i16) {
                        this.f235588e = i15;
                        boolean zY = y(2);
                        this.f235588e++;
                        if (!zY) {
                        }
                        return c15;
                    }
                    m();
                    int i18 = this.f235588e;
                    char c16 = cArr[i18];
                    if (c16 == '*') {
                        this.f235588e = i18 + 1;
                        if (!C0("*/")) {
                            throw T0("Unterminated comment");
                        }
                        i15 = this.f235588e + 2;
                        i16 = this.f235589f;
                    } else {
                        if (c16 != '/') {
                            return c15;
                        }
                        this.f235588e = i18 + 1;
                        H0();
                        i15 = this.f235588e;
                        i16 = this.f235589f;
                    }
                } else {
                    if (c15 != '#') {
                        this.f235588e = i17;
                        return c15;
                    }
                    this.f235588e = i17;
                    m();
                    H0();
                    i15 = this.f235588e;
                    i16 = this.f235589f;
                }
            }
            i15 = i17;
        }
    }

    private void O0() throws d {
        do {
            int i15 = 0;
            while (true) {
                int i16 = this.f235588e;
                if (i16 + i15 < this.f235589f) {
                    char c15 = this.f235587d[i16 + i15];
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
                        m();
                    }
                    this.f235588e += i15;
                    return;
                }
                this.f235588e = i16 + i15;
            }
        } while (y(1));
    }

    private d T0(String str) throws d {
        throw new d(str + L() + "\nSee " + h0.a("malformed-json"));
    }

    private String V(char c15) throws d {
        int i15;
        char[] cArr = this.f235587d;
        StringBuilder sb5 = null;
        do {
            int i16 = this.f235588e;
            int i17 = this.f235589f;
            while (true) {
                int i18 = i17;
                i15 = i16;
                while (true) {
                    if (i16 < i18) {
                        int i19 = i16 + 1;
                        char c16 = cArr[i16];
                        if (this.f235585b == x.STRICT && c16 < ' ') {
                            throw T0("Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode");
                        }
                        if (c16 == c15) {
                            this.f235588e = i19;
                            int i25 = (i19 - i15) - 1;
                            if (sb5 == null) {
                                return new String(cArr, i15, i25);
                            }
                            sb5.append(cArr, i15, i25);
                            return sb5.toString();
                        }
                        if (c16 == '\\') {
                            this.f235588e = i19;
                            int i26 = i19 - i15;
                            int i27 = i26 - 1;
                            if (sb5 == null) {
                                sb5 = new StringBuilder(Math.max(i26 * 2, 16));
                            }
                            sb5.append(cArr, i15, i27);
                            sb5.append(n0());
                            i16 = this.f235588e;
                            i17 = this.f235589f;
                        } else {
                            if (c16 == '\n') {
                                this.f235590g++;
                                this.f235591h = i19;
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
            this.f235588e = i16;
        } while (y(1));
        throw T0("Unterminated string");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public IllegalStateException Y0(String str) {
        return new IllegalStateException("Expected " + str + " but was " + a0() + L() + "\nSee " + h0.a(a0() == b.NULL ? "adapter-not-null-safe" : "unexpected-json-structure"));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    private String Z() throws d {
        String string;
        StringBuilder sb5 = null;
        int i15 = 0;
        while (true) {
            int i16 = 0;
            while (true) {
                int i17 = this.f235588e;
                if (i17 + i16 < this.f235589f) {
                    char c15 = this.f235587d[i17 + i16];
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
                        m();
                    }
                    i15 = i16;
                } else if (i16 >= this.f235587d.length) {
                    if (sb5 == null) {
                        sb5 = new StringBuilder(Math.max(i16, 16));
                    }
                    sb5.append(this.f235587d, this.f235588e, i16);
                    this.f235588e += i16;
                    if (!y(1)) {
                    }
                } else if (!y(i16 + 1)) {
                    i15 = i16;
                }
                if (sb5 == null) {
                    string = new String(this.f235587d, this.f235588e, i15);
                } else {
                    sb5.append(this.f235587d, this.f235588e, i15);
                    string = sb5.toString();
                }
                this.f235588e += i15;
                return string;
            }
        }
    }

    private int b0() {
        String str;
        String str2;
        int i15;
        char c15 = this.f235587d[this.f235588e];
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
        boolean z15 = this.f235585b != x.STRICT;
        int length = str.length();
        for (int i16 = 0; i16 < length; i16++) {
            if (this.f235588e + i16 >= this.f235589f && !y(i16 + 1)) {
                return 0;
            }
            char c16 = this.f235587d[this.f235588e + i16];
            if (c16 != str.charAt(i16) && (!z15 || c16 != str2.charAt(i16))) {
                return 0;
            }
        }
        if ((this.f235588e + length < this.f235589f || y(length + 1)) && K(this.f235587d[this.f235588e + length])) {
            return 0;
        }
        this.f235588e += length;
        this.f235592j = i15;
        return i15;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    /* JADX WARN: Code duplicated, block: B:85:0x00d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x00da  */
    /* JADX WARN: Code duplicated, block: B:91:0x00e1  */
    private int c0() {
        char c15;
        int i15;
        char[] cArr = this.f235587d;
        int i16 = this.f235588e;
        int i17 = this.f235589f;
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
                            if (!K(c15)) {
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
                if (!y(i19 + 1)) {
                    i15 = i18;
                    break;
                }
                i16 = this.f235588e;
                i17 = this.f235589f;
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
            this.f235593k = j15;
            this.f235588e += i19;
            this.f235592j = 15;
            return 15;
        }
        if (c16 != 2 && c16 != 4 && c16 != 7) {
            return i15;
        }
        this.f235594l = i19;
        this.f235592j = 16;
        return 16;
    }

    private void d0(int i15) throws d {
        int i16 = this.f235597p;
        if (i16 - 1 >= this.f235586c) {
            throw new d("Nesting limit " + this.f235586c + " reached" + L());
        }
        int[] iArr = this.f235596n;
        if (i16 == iArr.length) {
            int i17 = i16 * 2;
            this.f235596n = Arrays.copyOf(iArr, i17);
            this.f235599r = Arrays.copyOf(this.f235599r, i17);
            this.f235598q = (String[]) Arrays.copyOf(this.f235598q, i17);
        }
        int[] iArr2 = this.f235596n;
        int i18 = this.f235597p;
        this.f235597p = i18 + 1;
        iArr2[i18] = i15;
    }

    private void m() throws d {
        if (this.f235585b != x.LENIENT) {
            throw T0("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        }
    }

    private char n0() throws d {
        int i15;
        if (this.f235588e == this.f235589f && !y(1)) {
            throw T0("Unterminated escape sequence");
        }
        char[] cArr = this.f235587d;
        int i16 = this.f235588e;
        int i17 = i16 + 1;
        this.f235588e = i17;
        char c15 = cArr[i16];
        if (c15 != '\n') {
            if (c15 != '\"') {
                if (c15 != '\'') {
                    if (c15 != '/' && c15 != '\\') {
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
                            throw T0("Invalid escape sequence");
                        }
                        if (i16 + 5 > this.f235589f && !y(4)) {
                            throw T0("Unterminated escape sequence");
                        }
                        int i18 = this.f235588e;
                        int i19 = i18 + 4;
                        int i25 = 0;
                        while (i18 < i19) {
                            char c16 = this.f235587d[i18];
                            int i26 = i25 << 4;
                            if (c16 >= '0' && c16 <= '9') {
                                i15 = c16 - '0';
                            } else if (c16 >= 'a' && c16 <= 'f') {
                                i15 = c16 - 'W';
                            } else {
                                if (c16 < 'A' || c16 > 'F') {
                                    throw T0("Malformed Unicode escape \\u" + new String(this.f235587d, this.f235588e, 4));
                                }
                                i15 = c16 - '7';
                            }
                            i25 = i26 + i15;
                            i18++;
                        }
                        this.f235588e += 4;
                        return (char) i25;
                    }
                }
            }
            return c15;
        }
        if (this.f235585b == x.STRICT) {
            throw T0("Cannot escape a newline character in strict mode");
        }
        this.f235590g++;
        this.f235591h = i17;
        if (this.f235585b == x.STRICT) {
            throw T0("Invalid escaped character \"'\" in strict mode");
        }
        return c15;
    }

    private void p() throws IOException {
        N(true);
        int i15 = this.f235588e;
        this.f235588e = i15 - 1;
        if (i15 + 4 <= this.f235589f || y(5)) {
            int i16 = this.f235588e;
            char[] cArr = this.f235587d;
            if (cArr[i16] == ')' && cArr[i16 + 1] == ']' && cArr[i16 + 2] == '}' && cArr[i16 + 3] == '\'' && cArr[i16 + 4] == '\n') {
                this.f235588e = i16 + 5;
            }
        }
    }

    private void u0(char c15) throws d {
        char[] cArr = this.f235587d;
        do {
            int i15 = this.f235588e;
            int i16 = this.f235589f;
            while (i15 < i16) {
                int i17 = i15 + 1;
                char c16 = cArr[i15];
                if (c16 == c15) {
                    this.f235588e = i17;
                    return;
                }
                if (c16 == '\\') {
                    this.f235588e = i17;
                    n0();
                    i15 = this.f235588e;
                    i16 = this.f235589f;
                } else {
                    if (c16 == '\n') {
                        this.f235590g++;
                        this.f235591h = i17;
                    }
                    i15 = i17;
                }
            }
            this.f235588e = i15;
        } while (y(1));
        throw T0("Unterminated string");
    }

    private boolean y(int i15) throws IOException {
        int i16;
        int i17;
        char[] cArr = this.f235587d;
        int i18 = this.f235591h;
        int i19 = this.f235588e;
        this.f235591h = i18 - i19;
        int i25 = this.f235589f;
        if (i25 != i19) {
            int i26 = i25 - i19;
            this.f235589f = i26;
            System.arraycopy(cArr, i19, cArr, 0, i26);
        } else {
            this.f235589f = 0;
        }
        this.f235588e = 0;
        do {
            Reader reader = this.f235584a;
            int i27 = this.f235589f;
            int i28 = reader.read(cArr, i27, cArr.length - i27);
            if (i28 == -1) {
                return false;
            }
            i16 = this.f235589f + i28;
            this.f235589f = i16;
            if (this.f235590g == 0 && (i17 = this.f235591h) == 0 && i16 > 0 && cArr[0] == 65279) {
                this.f235588e++;
                this.f235591h = i17 + 1;
                i15++;
            }
        } while (i16 < i15);
        return true;
    }

    public String E() {
        return C(true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void G0() throws IOException {
        int i15 = 0;
        do {
            int iR = this.f235592j;
            if (iR == 0) {
                iR = r();
            }
            switch (iR) {
                case 1:
                    d0(3);
                    i15++;
                    this.f235592j = 0;
                    break;
                case 2:
                    if (i15 == 0) {
                        this.f235598q[this.f235597p - 1] = null;
                    }
                    this.f235597p--;
                    i15--;
                    this.f235592j = 0;
                    break;
                case 3:
                    d0(1);
                    i15++;
                    this.f235592j = 0;
                    break;
                case 4:
                    this.f235597p--;
                    i15--;
                    this.f235592j = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.f235592j = 0;
                    break;
                case 8:
                    u0('\'');
                    this.f235592j = 0;
                    break;
                case 9:
                    u0('\"');
                    this.f235592j = 0;
                    break;
                case 10:
                    O0();
                    this.f235592j = 0;
                    break;
                case 12:
                    u0('\'');
                    if (i15 == 0) {
                        this.f235598q[this.f235597p - 1] = "<skipped>";
                    }
                    this.f235592j = 0;
                    break;
                case 13:
                    u0('\"');
                    if (i15 == 0) {
                        this.f235598q[this.f235597p - 1] = "<skipped>";
                    }
                    this.f235592j = 0;
                    break;
                case 14:
                    O0();
                    if (i15 == 0) {
                        this.f235598q[this.f235597p - 1] = "<skipped>";
                    }
                    this.f235592j = 0;
                    break;
                case 16:
                    this.f235588e += this.f235594l;
                    this.f235592j = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i15 > 0);
        int[] iArr = this.f235599r;
        int i16 = this.f235597p - 1;
        iArr[i16] = iArr[i16] + 1;
    }

    public final x H() {
        return this.f235585b;
    }

    public boolean I() throws IOException {
        int iR = this.f235592j;
        if (iR == 0) {
            iR = r();
        }
        return (iR == 2 || iR == 4 || iR == 17) ? false : true;
    }

    public final boolean J() {
        return this.f235585b == x.LENIENT;
    }

    String L() {
        return " at line " + (this.f235590g + 1) + " column " + ((this.f235588e - this.f235591h) + 1) + " path " + W();
    }

    public boolean M() throws IOException {
        int iR = this.f235592j;
        if (iR == 0) {
            iR = r();
        }
        if (iR == 5) {
            this.f235592j = 0;
            int[] iArr = this.f235599r;
            int i15 = this.f235597p - 1;
            iArr[i15] = iArr[i15] + 1;
            return true;
        }
        if (iR != 6) {
            throw Y0("a boolean");
        }
        this.f235592j = 0;
        int[] iArr2 = this.f235599r;
        int i16 = this.f235597p - 1;
        iArr2[i16] = iArr2[i16] + 1;
        return false;
    }

    public void O() throws IOException {
        int iR = this.f235592j;
        if (iR == 0) {
            iR = r();
        }
        if (iR != 7) {
            throw Y0("null");
        }
        this.f235592j = 0;
        int[] iArr = this.f235599r;
        int i15 = this.f235597p - 1;
        iArr[i15] = iArr[i15] + 1;
    }

    public String W() {
        return C(false);
    }

    public void Y() throws IOException {
        int iR = this.f235592j;
        if (iR == 0) {
            iR = r();
        }
        if (iR != 1) {
            throw Y0("BEGIN_OBJECT");
        }
        d0(3);
        this.f235592j = 0;
    }

    public b a0() throws IOException {
        int iR = this.f235592j;
        if (iR == 0) {
            iR = r();
        }
        switch (iR) {
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

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f235592j = 0;
        this.f235596n[0] = 8;
        this.f235597p = 1;
        this.f235584a.close();
    }

    public void h() throws IOException {
        int iR = this.f235592j;
        if (iR == 0) {
            iR = r();
        }
        if (iR != 3) {
            throw Y0("BEGIN_ARRAY");
        }
        d0(1);
        this.f235599r[this.f235597p - 1] = 0;
        this.f235592j = 0;
    }

    public void h0() throws IOException {
        int iR = this.f235592j;
        if (iR == 0) {
            iR = r();
        }
        if (iR != 2) {
            throw Y0("END_OBJECT");
        }
        int i15 = this.f235597p;
        int i16 = i15 - 1;
        this.f235597p = i16;
        this.f235598q[i16] = null;
        int[] iArr = this.f235599r;
        int i17 = i15 - 2;
        iArr[i17] = iArr[i17] + 1;
        this.f235592j = 0;
    }

    public String h1() throws IOException {
        String strV;
        int iR = this.f235592j;
        if (iR == 0) {
            iR = r();
        }
        if (iR == 14) {
            strV = Z();
        } else if (iR == 12) {
            strV = V('\'');
        } else {
            if (iR != 13) {
                throw Y0("a name");
            }
            strV = V('\"');
        }
        this.f235592j = 0;
        this.f235598q[this.f235597p - 1] = strV;
        return strV;
    }

    public double nextDouble() throws IOException {
        int iR = this.f235592j;
        if (iR == 0) {
            iR = r();
        }
        if (iR == 15) {
            this.f235592j = 0;
            int[] iArr = this.f235599r;
            int i15 = this.f235597p - 1;
            iArr[i15] = iArr[i15] + 1;
            return this.f235593k;
        }
        if (iR == 16) {
            this.f235595m = new String(this.f235587d, this.f235588e, this.f235594l);
            this.f235588e += this.f235594l;
        } else if (iR == 8 || iR == 9) {
            this.f235595m = V(iR == 8 ? '\'' : '\"');
        } else if (iR == 10) {
            this.f235595m = Z();
        } else if (iR != 11) {
            throw Y0("a double");
        }
        this.f235592j = 11;
        double d15 = Double.parseDouble(this.f235595m);
        if (this.f235585b != x.LENIENT && (Double.isNaN(d15) || Double.isInfinite(d15))) {
            throw T0("JSON forbids NaN and infinities: " + d15);
        }
        this.f235595m = null;
        this.f235592j = 0;
        int[] iArr2 = this.f235599r;
        int i16 = this.f235597p - 1;
        iArr2[i16] = iArr2[i16] + 1;
        return d15;
    }

    public int nextInt() throws IOException {
        int iR = this.f235592j;
        if (iR == 0) {
            iR = r();
        }
        if (iR == 15) {
            long j15 = this.f235593k;
            int i15 = (int) j15;
            if (j15 == i15) {
                this.f235592j = 0;
                int[] iArr = this.f235599r;
                int i16 = this.f235597p - 1;
                iArr[i16] = iArr[i16] + 1;
                return i15;
            }
            throw new NumberFormatException("Expected an int but was " + this.f235593k + L());
        }
        if (iR == 16) {
            this.f235595m = new String(this.f235587d, this.f235588e, this.f235594l);
            this.f235588e += this.f235594l;
        } else {
            if (iR != 8 && iR != 9 && iR != 10) {
                throw Y0("an int");
            }
            if (iR == 10) {
                this.f235595m = Z();
            } else {
                this.f235595m = V(iR == 8 ? '\'' : '\"');
            }
            try {
                int i17 = Integer.parseInt(this.f235595m);
                this.f235592j = 0;
                int[] iArr2 = this.f235599r;
                int i18 = this.f235597p - 1;
                iArr2[i18] = iArr2[i18] + 1;
                return i17;
            } catch (NumberFormatException unused) {
            }
        }
        this.f235592j = 11;
        double d15 = Double.parseDouble(this.f235595m);
        int i19 = (int) d15;
        if (i19 != d15) {
            throw new NumberFormatException("Expected an int but was " + this.f235595m + L());
        }
        this.f235595m = null;
        this.f235592j = 0;
        int[] iArr3 = this.f235599r;
        int i25 = this.f235597p - 1;
        iArr3[i25] = iArr3[i25] + 1;
        return i19;
    }

    public long nextLong() throws IOException {
        int iR = this.f235592j;
        if (iR == 0) {
            iR = r();
        }
        if (iR == 15) {
            this.f235592j = 0;
            int[] iArr = this.f235599r;
            int i15 = this.f235597p - 1;
            iArr[i15] = iArr[i15] + 1;
            return this.f235593k;
        }
        if (iR == 16) {
            this.f235595m = new String(this.f235587d, this.f235588e, this.f235594l);
            this.f235588e += this.f235594l;
        } else {
            if (iR != 8 && iR != 9 && iR != 10) {
                throw Y0("a long");
            }
            if (iR == 10) {
                this.f235595m = Z();
            } else {
                this.f235595m = V(iR == 8 ? '\'' : '\"');
            }
            try {
                long j15 = Long.parseLong(this.f235595m);
                this.f235592j = 0;
                int[] iArr2 = this.f235599r;
                int i16 = this.f235597p - 1;
                iArr2[i16] = iArr2[i16] + 1;
                return j15;
            } catch (NumberFormatException unused) {
            }
        }
        this.f235592j = 11;
        double d15 = Double.parseDouble(this.f235595m);
        long j16 = (long) d15;
        if (j16 != d15) {
            throw new NumberFormatException("Expected a long but was " + this.f235595m + L());
        }
        this.f235595m = null;
        this.f235592j = 0;
        int[] iArr3 = this.f235599r;
        int i17 = this.f235597p - 1;
        iArr3[i17] = iArr3[i17] + 1;
        return j16;
    }

    public String q2() throws IOException {
        String str;
        int iR = this.f235592j;
        if (iR == 0) {
            iR = r();
        }
        if (iR == 10) {
            str = Z();
        } else if (iR == 8) {
            str = V('\'');
        } else if (iR == 9) {
            str = V('\"');
        } else if (iR == 11) {
            str = this.f235595m;
            this.f235595m = null;
        } else if (iR == 15) {
            str = Long.toString(this.f235593k);
        } else {
            if (iR != 16) {
                throw Y0("a string");
            }
            str = new String(this.f235587d, this.f235588e, this.f235594l);
            this.f235588e += this.f235594l;
        }
        this.f235592j = 0;
        int[] iArr = this.f235599r;
        int i15 = this.f235597p - 1;
        iArr[i15] = iArr[i15] + 1;
        return str;
    }

    int r() throws IOException {
        int iN;
        int[] iArr = this.f235596n;
        int i15 = this.f235597p;
        int i16 = iArr[i15 - 1];
        if (i16 == 1) {
            iArr[i15 - 1] = 2;
        } else if (i16 == 2) {
            int iN2 = N(true);
            if (iN2 != 44) {
                if (iN2 != 59) {
                    if (iN2 != 93) {
                        throw T0("Unterminated array");
                    }
                    this.f235592j = 4;
                    return 4;
                }
                m();
            }
        } else {
            if (i16 == 3 || i16 == 5) {
                iArr[i15 - 1] = 4;
                if (i16 == 5 && (iN = N(true)) != 44) {
                    if (iN != 59) {
                        if (iN != 125) {
                            throw T0("Unterminated object");
                        }
                        this.f235592j = 2;
                        return 2;
                    }
                    m();
                }
                int iN3 = N(true);
                if (iN3 == 34) {
                    this.f235592j = 13;
                    return 13;
                }
                if (iN3 == 39) {
                    m();
                    this.f235592j = 12;
                    return 12;
                }
                if (iN3 == 125) {
                    if (i16 == 5) {
                        throw T0("Expected name");
                    }
                    this.f235592j = 2;
                    return 2;
                }
                m();
                this.f235588e--;
                if (!K((char) iN3)) {
                    throw T0("Expected name");
                }
                this.f235592j = 14;
                return 14;
            }
            if (i16 == 4) {
                iArr[i15 - 1] = 5;
                int iN4 = N(true);
                if (iN4 != 58) {
                    if (iN4 != 61) {
                        throw T0("Expected ':'");
                    }
                    m();
                    if (this.f235588e < this.f235589f || y(1)) {
                        char[] cArr = this.f235587d;
                        int i17 = this.f235588e;
                        if (cArr[i17] == '>') {
                            this.f235588e = i17 + 1;
                        }
                    }
                }
            } else if (i16 == 6) {
                if (this.f235585b == x.LENIENT) {
                    p();
                }
                this.f235596n[this.f235597p - 1] = 7;
            } else if (i16 == 7) {
                if (N(false) == -1) {
                    this.f235592j = 17;
                    return 17;
                }
                m();
                this.f235588e--;
            } else if (i16 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iN5 = N(true);
        if (iN5 == 34) {
            this.f235592j = 9;
            return 9;
        }
        if (iN5 == 39) {
            m();
            this.f235592j = 8;
            return 8;
        }
        if (iN5 != 44 && iN5 != 59) {
            if (iN5 == 91) {
                this.f235592j = 3;
                return 3;
            }
            if (iN5 != 93) {
                if (iN5 == 123) {
                    this.f235592j = 1;
                    return 1;
                }
                this.f235588e--;
                int iB0 = b0();
                if (iB0 != 0) {
                    return iB0;
                }
                int iC0 = c0();
                if (iC0 != 0) {
                    return iC0;
                }
                if (!K(this.f235587d[this.f235588e])) {
                    throw T0("Expected value");
                }
                m();
                this.f235592j = 10;
                return 10;
            }
            if (i16 == 1) {
                this.f235592j = 4;
                return 4;
            }
        }
        if (i16 != 1 && i16 != 2) {
            throw T0("Unexpected value");
        }
        m();
        this.f235588e--;
        this.f235592j = 7;
        return 7;
    }

    public final void t0(x xVar) {
        Objects.requireNonNull(xVar);
        this.f235585b = xVar;
    }

    public String toString() {
        return getClass().getSimpleName() + L();
    }

    public void u() throws IOException {
        int iR = this.f235592j;
        if (iR == 0) {
            iR = r();
        }
        if (iR != 4) {
            throw Y0("END_ARRAY");
        }
        int i15 = this.f235597p;
        this.f235597p = i15 - 1;
        int[] iArr = this.f235599r;
        int i16 = i15 - 2;
        iArr[i16] = iArr[i16] + 1;
        this.f235592j = 0;
    }
}
