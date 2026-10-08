package io.sentry.vendor.gson.stream;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class c implements Closeable, Flushable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String[] f95888k = new String[128];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String[] f95889l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Writer f95890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f95891b = new int[32];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f95892c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f95893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f95894e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f95895f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f95896g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f95897h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f95898j;

    static {
        for (int i15 = 0; i15 <= 31; i15++) {
            f95888k[i15] = String.format("\\u%04x", Integer.valueOf(i15));
        }
        String[] strArr = f95888k;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f95889l = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        L(6);
        this.f95894e = ":";
        this.f95898j = true;
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        this.f95890a = writer;
    }

    private void I() throws IOException {
        if (this.f95893d == null) {
            return;
        }
        this.f95890a.write(10);
        int i15 = this.f95892c;
        for (int i16 = 1; i16 < i15; i16++) {
            this.f95890a.write(this.f95893d);
        }
    }

    private c K(int i15, char c15) throws IOException {
        h();
        L(i15);
        this.f95890a.write(c15);
        return this;
    }

    private void L(int i15) {
        int i16 = this.f95892c;
        int[] iArr = this.f95891b;
        if (i16 == iArr.length) {
            this.f95891b = Arrays.copyOf(iArr, i16 * 2);
        }
        int[] iArr2 = this.f95891b;
        int i17 = this.f95892c;
        this.f95892c = i17 + 1;
        iArr2[i17] = i15;
    }

    private void M(int i15) {
        this.f95891b[this.f95892c - 1] = i15;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    private void O(String str) throws IOException {
        String str2;
        String[] strArr = this.f95896g ? f95889l : f95888k;
        this.f95890a.write(34);
        int length = str.length();
        int i15 = 0;
        for (int i16 = 0; i16 < length; i16++) {
            char cCharAt = str.charAt(i16);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i15 < i16) {
                        this.f95890a.write(str, i15, i16 - i15);
                    }
                    this.f95890a.write(str2);
                    i15 = i16 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i15 < i16) {
                    this.f95890a.write(str, i15, i16 - i15);
                }
                this.f95890a.write(str2);
                i15 = i16 + 1;
            }
        }
        if (i15 < length) {
            this.f95890a.write(str, i15, length - i15);
        }
        this.f95890a.write(34);
    }

    private void b() throws IOException {
        int iPeek = peek();
        if (iPeek == 5) {
            this.f95890a.write(44);
        } else if (iPeek != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        I();
        M(4);
    }

    private void h() throws IOException {
        int iPeek = peek();
        if (iPeek == 1) {
            M(2);
            I();
            return;
        }
        if (iPeek == 2) {
            this.f95890a.append(',');
            I();
        } else {
            if (iPeek == 4) {
                this.f95890a.append((CharSequence) this.f95894e);
                M(5);
                return;
            }
            if (iPeek != 6) {
                if (iPeek != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f95895f) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            M(7);
        }
    }

    private void n0() throws IOException {
        if (this.f95897h != null) {
            b();
            O(this.f95897h);
            this.f95897h = null;
        }
    }

    private int peek() {
        int i15 = this.f95892c;
        if (i15 != 0) {
            return this.f95891b[i15 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private c r(int i15, int i16, char c15) throws IOException {
        int iPeek = peek();
        if (iPeek != i16 && iPeek != i15) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f95897h != null) {
            throw new IllegalStateException("Dangling name: " + this.f95897h);
        }
        this.f95892c--;
        if (iPeek == i16) {
            I();
        }
        this.f95890a.write(c15);
        return this;
    }

    public String C() {
        return this.f95893d;
    }

    public c E(String str) throws IOException {
        if (str == null) {
            return J();
        }
        n0();
        h();
        this.f95890a.append((CharSequence) str);
        return this;
    }

    public c H(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f95897h != null) {
            throw new IllegalStateException();
        }
        if (this.f95892c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f95897h = str;
        return this;
    }

    public c J() throws IOException {
        if (this.f95897h != null) {
            if (!this.f95898j) {
                this.f95897h = null;
                return this;
            }
            n0();
        }
        h();
        this.f95890a.write("null");
        return this;
    }

    public final void N(String str) {
        if (str == null || str.length() == 0) {
            this.f95893d = null;
            this.f95894e = ":";
        } else {
            this.f95893d = str;
            this.f95894e = ": ";
        }
    }

    public c V(double d15) throws IOException {
        n0();
        if (this.f95895f || !(Double.isNaN(d15) || Double.isInfinite(d15))) {
            h();
            this.f95890a.append((CharSequence) Double.toString(d15));
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + d15);
    }

    public c Z(long j15) throws IOException {
        n0();
        h();
        this.f95890a.write(Long.toString(j15));
        return this;
    }

    public c a0(Boolean bool) throws IOException {
        if (bool == null) {
            return J();
        }
        n0();
        h();
        this.f95890a.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public c b0(Number number) throws IOException {
        if (number == null) {
            return J();
        }
        n0();
        String string = number.toString();
        if (this.f95895f || !(string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            h();
            this.f95890a.append((CharSequence) string);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    public c c0(String str) throws IOException {
        if (str == null) {
            return J();
        }
        n0();
        h();
        O(str);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f95890a.close();
        int i15 = this.f95892c;
        if (i15 > 1 || (i15 == 1 && this.f95891b[i15 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f95892c = 0;
    }

    public c d0(boolean z15) throws IOException {
        n0();
        h();
        this.f95890a.write(z15 ? "true" : "false");
        return this;
    }

    public final void e0(boolean z15) {
        this.f95895f = z15;
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f95892c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f95890a.flush();
    }

    public c m() throws IOException {
        n0();
        return K(1, '[');
    }

    public c p() throws IOException {
        n0();
        return K(3, '{');
    }

    public c u() {
        return r(1, 2, ']');
    }

    public c y() {
        return r(3, 5, '}');
    }
}
