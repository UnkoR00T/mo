package zl;

import com.google.gson.e;
import com.google.gson.x;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public class c implements Closeable, Flushable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Pattern f235611m = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String[] f235612n = new String[128];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String[] f235613p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Writer f235614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f235615b = new int[32];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f235616c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private e f235617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f235618e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f235619f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f235620g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private x f235621h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f235622j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f235623k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f235624l;

    static {
        for (int i15 = 0; i15 <= 31; i15++) {
            f235612n[i15] = String.format("\\u%04x", Integer.valueOf(i15));
        }
        String[] strArr = f235612n;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f235613p = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        O(6);
        this.f235621h = x.LEGACY_STRICT;
        this.f235624l = true;
        Objects.requireNonNull(writer, "out == null");
        this.f235614a = writer;
        Z(e.f36643d);
    }

    private void L() throws IOException {
        if (this.f235620g) {
            return;
        }
        this.f235614a.write(this.f235617d.b());
        int i15 = this.f235616c;
        for (int i16 = 1; i16 < i15; i16++) {
            this.f235614a.write(this.f235617d.a());
        }
    }

    private c N(int i15, char c15) throws IOException {
        m();
        O(i15);
        this.f235614a.write(c15);
        return this;
    }

    private void O(int i15) {
        int i16 = this.f235616c;
        int[] iArr = this.f235615b;
        if (i16 == iArr.length) {
            this.f235615b = Arrays.copyOf(iArr, i16 * 2);
        }
        int[] iArr2 = this.f235615b;
        int i17 = this.f235616c;
        this.f235616c = i17 + 1;
        iArr2[i17] = i15;
    }

    private void T0() throws IOException {
        if (this.f235623k != null) {
            h();
            d0(this.f235623k);
            this.f235623k = null;
        }
    }

    private void V(int i15) {
        this.f235615b[this.f235616c - 1] = i15;
    }

    private static boolean b(Class<? extends Number> cls) {
        return cls == Integer.class || cls == Long.class || cls == Byte.class || cls == Short.class || cls == BigDecimal.class || cls == BigInteger.class || cls == AtomicInteger.class || cls == AtomicLong.class;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    private void d0(String str) throws IOException {
        String str2;
        String[] strArr = this.f235622j ? f235613p : f235612n;
        this.f235614a.write(34);
        int length = str.length();
        int i15 = 0;
        for (int i16 = 0; i16 < length; i16++) {
            char cCharAt = str.charAt(i16);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i15 < i16) {
                        this.f235614a.write(str, i15, i16 - i15);
                    }
                    this.f235614a.write(str2);
                    i15 = i16 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i15 < i16) {
                    this.f235614a.write(str, i15, i16 - i15);
                }
                this.f235614a.write(str2);
                i15 = i16 + 1;
            }
        }
        if (i15 < length) {
            this.f235614a.write(str, i15, length - i15);
        }
        this.f235614a.write(34);
    }

    private void h() throws IOException {
        int iPeek = peek();
        if (iPeek == 5) {
            this.f235614a.write(this.f235619f);
        } else if (iPeek != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        L();
        V(4);
    }

    private void m() throws IOException {
        int iPeek = peek();
        if (iPeek == 1) {
            V(2);
            L();
            return;
        }
        if (iPeek == 2) {
            this.f235614a.append((CharSequence) this.f235619f);
            L();
        } else {
            if (iPeek == 4) {
                this.f235614a.append((CharSequence) this.f235618e);
                V(5);
                return;
            }
            if (iPeek != 6) {
                if (iPeek != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.f235621h != x.LENIENT) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            V(7);
        }
    }

    private int peek() {
        int i15 = this.f235616c;
        if (i15 != 0) {
            return this.f235615b[i15 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private c u(int i15, int i16, char c15) throws IOException {
        int iPeek = peek();
        if (iPeek != i16 && iPeek != i15) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f235623k != null) {
            throw new IllegalStateException("Dangling name: " + this.f235623k);
        }
        this.f235616c--;
        if (iPeek == i16) {
            L();
        }
        this.f235614a.write(c15);
        return this;
    }

    public c C() {
        return u(3, 5, '}');
    }

    public c C0(Number number) throws IOException {
        if (number == null) {
            return M();
        }
        T0();
        String string = number.toString();
        Class<?> cls = number.getClass();
        if (!b(cls)) {
            if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                if (this.f235621h != x.LENIENT) {
                    throw new IllegalArgumentException("Numeric values must be finite, but was " + string);
                }
            } else if (cls != Float.class && cls != Double.class && !f235611m.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        }
        m();
        this.f235614a.append((CharSequence) string);
        return this;
    }

    public final boolean E() {
        return this.f235624l;
    }

    public final x H() {
        return this.f235621h;
    }

    public c H0(String str) throws IOException {
        if (str == null) {
            return M();
        }
        T0();
        m();
        d0(str);
        return this;
    }

    public final boolean I() {
        return this.f235622j;
    }

    public boolean J() {
        return this.f235621h == x.LENIENT;
    }

    public c K(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f235623k != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        }
        int iPeek = peek();
        if (iPeek != 3 && iPeek != 5) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f235623k = str;
        return this;
    }

    public c M() throws IOException {
        if (this.f235623k != null) {
            if (!this.f235624l) {
                this.f235623k = null;
                return this;
            }
            T0();
        }
        m();
        this.f235614a.write("null");
        return this;
    }

    public c O0(boolean z15) throws IOException {
        T0();
        m();
        this.f235614a.write(z15 ? "true" : "false");
        return this;
    }

    public final void Z(e eVar) {
        Objects.requireNonNull(eVar);
        this.f235617d = eVar;
        this.f235619f = ",";
        if (eVar.c()) {
            this.f235618e = ": ";
            if (this.f235617d.b().isEmpty()) {
                this.f235619f = ", ";
            }
        } else {
            this.f235618e = ":";
        }
        this.f235620g = this.f235617d.b().isEmpty() && this.f235617d.a().isEmpty();
    }

    public final void a0(boolean z15) {
        this.f235622j = z15;
    }

    public final void b0(boolean z15) {
        this.f235624l = z15;
    }

    public final void c0(x xVar) {
        Objects.requireNonNull(xVar);
        this.f235621h = xVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f235614a.close();
        int i15 = this.f235616c;
        if (i15 > 1 || (i15 == 1 && this.f235615b[i15 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f235616c = 0;
    }

    public void flush() throws IOException {
        if (this.f235616c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f235614a.flush();
    }

    public c n0(double d15) throws IOException {
        T0();
        if (this.f235621h == x.LENIENT || !(Double.isNaN(d15) || Double.isInfinite(d15))) {
            m();
            this.f235614a.append((CharSequence) Double.toString(d15));
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + d15);
    }

    public c p() throws IOException {
        T0();
        return N(1, '[');
    }

    public c r() throws IOException {
        T0();
        return N(3, '{');
    }

    public c t0(long j15) throws IOException {
        T0();
        m();
        this.f235614a.write(Long.toString(j15));
        return this;
    }

    public c u0(Boolean bool) throws IOException {
        if (bool == null) {
            return M();
        }
        T0();
        m();
        this.f235614a.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public c y() {
        return u(1, 2, ']');
    }
}
