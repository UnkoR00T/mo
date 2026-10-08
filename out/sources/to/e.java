package to;

import io.sentry.android.core.c2;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteBuffer f191220a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f191222c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f191221b = i(null);

    e(byte[] bArr) {
        this.f191220a = ByteBuffer.wrap(bArr);
    }

    private char a() throws IOException {
        try {
            return (char) this.f191220a.get();
        } catch (BufferUnderflowException unused) {
            throw new IOException("Premature end of buffer reached");
        }
    }

    private b e(int i15) throws IOException {
        try {
            this.f191220a.get();
            byte[] bArr = new byte[i15];
            this.f191220a.get(bArr);
            return new b(bArr, b.f191177m);
        } catch (BufferUnderflowException unused) {
            throw new IOException("Premature end of buffer reached");
        }
    }

    private String f() {
        char cA;
        StringBuilder sb5 = new StringBuilder();
        while (this.f191220a.hasRemaining() && (cA = a()) != '\r' && cA != '\n') {
            sb5.append(cA);
        }
        return sb5.toString();
    }

    private String g() throws IOException {
        StringBuilder sb5 = new StringBuilder();
        while (this.f191220a.hasRemaining()) {
            this.f191220a.mark();
            char cA = a();
            if (Character.isWhitespace(cA) || cA == '(' || cA == ')' || cA == '<' || cA == '>' || cA == '[' || cA == ']' || cA == '{' || cA == '}' || cA == '/' || cA == '%') {
                this.f191220a.reset();
                break;
            }
            sb5.append(cA);
        }
        if (sb5.length() == 0) {
            return null;
        }
        return sb5.toString();
    }

    private b h() throws IOException {
        StringBuilder sb5 = new StringBuilder();
        while (this.f191220a.hasRemaining()) {
            char cA = a();
            if (cA == '\n' || cA == '\r') {
                sb5.append("\n");
            } else if (cA == '\\') {
                char cA2 = a();
                if (cA2 == '(') {
                    sb5.append('(');
                } else if (cA2 == ')') {
                    sb5.append(')');
                } else if (cA2 == '\\') {
                    sb5.append('\\');
                } else if (cA2 == 'b') {
                    sb5.append('\b');
                } else if (cA2 == 'f') {
                    sb5.append('\f');
                } else if (cA2 == 'n' || cA2 == 'r') {
                    sb5.append("\n");
                } else if (cA2 == 't') {
                    sb5.append('\t');
                }
                if (Character.isDigit(cA2)) {
                    try {
                        sb5.append((char) Integer.parseInt(String.valueOf(new char[]{cA2, a(), a()}), 8));
                    } catch (NumberFormatException e15) {
                        throw new IOException(e15);
                    }
                } else {
                    continue;
                }
            } else if (cA == '(') {
                this.f191222c++;
                sb5.append('(');
            } else if (cA != ')') {
                sb5.append(cA);
            } else {
                if (this.f191222c == 0) {
                    return new b(sb5.toString(), b.f191168d);
                }
                sb5.append(')');
                this.f191222c--;
            }
        }
        return null;
    }

    private b i(b bVar) throws IOException {
        boolean z15;
        do {
            z15 = false;
            while (this.f191220a.hasRemaining()) {
                char cA = a();
                if (cA == '%') {
                    f();
                } else {
                    if (cA == '(') {
                        return h();
                    }
                    if (cA == ')') {
                        throw new IOException("unexpected closing parenthesis");
                    }
                    if (cA == '[') {
                        return new b(cA, b.f191173i);
                    }
                    if (cA == '{') {
                        return new b(cA, b.f191175k);
                    }
                    if (cA == ']') {
                        return new b(cA, b.f191174j);
                    }
                    if (cA == '}') {
                        return new b(cA, b.f191176l);
                    }
                    if (cA == '/') {
                        String strG = g();
                        if (strG != null) {
                            return new b(strG, b.f191170f);
                        }
                        throw new a("Could not read token at position " + this.f191220a.position());
                    }
                    if (cA == '<') {
                        if (a() == cA) {
                            return new b("<<", b.f191178n);
                        }
                        ByteBuffer byteBuffer = this.f191220a;
                        byteBuffer.position(byteBuffer.position() - 1);
                        return new b(cA, b.f191169e);
                    }
                    if (cA == '>') {
                        if (a() == cA) {
                            return new b(">>", b.f191179o);
                        }
                        ByteBuffer byteBuffer2 = this.f191220a;
                        byteBuffer2.position(byteBuffer2.position() - 1);
                        return new b(cA, b.f191169e);
                    }
                    if (!Character.isWhitespace(cA)) {
                        if (cA != 0) {
                            ByteBuffer byteBuffer3 = this.f191220a;
                            byteBuffer3.position(byteBuffer3.position() - 1);
                            b bVarJ = j();
                            if (bVarJ != null) {
                                return bVarJ;
                            }
                            String strG2 = g();
                            if (strG2 == null) {
                                throw new a("Could not read token at position " + this.f191220a.position());
                            }
                            if (!strG2.equals("RD") && !strG2.equals("-|")) {
                                return new b(strG2, b.f191169e);
                            }
                            if (bVar == null || bVar.d() != b.f191172h) {
                                throw new IOException("expected INTEGER before -| or RD");
                            }
                            return e(bVar.f());
                        }
                        c2.g("PdfBox-Android", "NULL byte in font, skipped");
                    }
                    z15 = true;
                }
            }
        } while (z15);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0084  */
    /* JADX WARN: Code duplicated, block: B:33:0x0094 A[LOOP:1: B:31:0x008e->B:33:0x0094, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c3 A[LOOP:2: B:42:0x00bd->B:44:0x00c3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x0114  */
    /* JADX WARN: Code duplicated, block: B:55:0x0120  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private b j() throws IOException {
        char cA;
        StringBuilder sb5;
        char cA2;
        char cA3;
        this.f191220a.mark();
        StringBuilder sb6 = new StringBuilder();
        char cA4 = a();
        boolean z15 = false;
        if (cA4 == '+' || cA4 == '-') {
            sb6.append(cA4);
            cA4 = a();
        }
        while (Character.isDigit(cA4)) {
            sb6.append(cA4);
            cA4 = a();
            z15 = true;
        }
        if (cA4 != '.') {
            if (cA4 == '#') {
                StringBuilder sb7 = new StringBuilder();
                cA = a();
                sb5 = sb6;
                sb6 = sb7;
            } else {
                if (sb6.length() == 0 || !z15) {
                    this.f191220a.reset();
                    return null;
                }
                if (cA4 != 'e' && cA4 != 'E') {
                    ByteBuffer byteBuffer = this.f191220a;
                    byteBuffer.position(byteBuffer.position() - 1);
                    return new b(sb6.toString(), b.f191172h);
                }
            }
            if (Character.isDigit(cA)) {
                sb6.append(cA);
                cA = a();
            } else if (cA != 'e' && cA != 'E') {
                this.f191220a.reset();
                return null;
            }
            while (Character.isDigit(cA)) {
                sb6.append(cA);
                cA = a();
            }
            if (cA != 'E' || cA == 'e') {
                sb6.append(cA);
                cA2 = a();
                if (cA2 == '-') {
                    sb6.append(cA2);
                    cA2 = a();
                }
                if (!Character.isDigit(cA2)) {
                    this.f191220a.reset();
                    return null;
                }
                sb6.append(cA2);
                cA3 = a();
                while (Character.isDigit(cA3)) {
                    sb6.append(cA3);
                    cA3 = a();
                }
            }
            ByteBuffer byteBuffer2 = this.f191220a;
            byteBuffer2.position(byteBuffer2.position() - 1);
            if (sb5 != null) {
                try {
                } catch (NumberFormatException e15) {
                    throw new IOException("Invalid number '" + sb6.toString() + "'", e15);
                }
            }
        }
        sb6.append(cA4);
        cA4 = a();
        cA = cA4;
        sb5 = null;
        if (Character.isDigit(cA)) {
            sb6.append(cA);
            cA = a();
        } else if (cA != 'e') {
            this.f191220a.reset();
            return null;
        }
        while (Character.isDigit(cA)) {
            sb6.append(cA);
            cA = a();
        }
        if (cA != 'E') {
            sb6.append(cA);
            cA2 = a();
            if (cA2 == '-') {
                sb6.append(cA2);
                cA2 = a();
            }
            if (!Character.isDigit(cA2)) {
                this.f191220a.reset();
                return null;
            }
            sb6.append(cA2);
            cA3 = a();
            while (Character.isDigit(cA3)) {
                sb6.append(cA3);
                cA3 = a();
            }
        } else {
            sb6.append(cA);
            cA2 = a();
            if (cA2 == '-') {
                sb6.append(cA2);
                cA2 = a();
            }
            if (!Character.isDigit(cA2)) {
                this.f191220a.reset();
                return null;
            }
            sb6.append(cA2);
            cA3 = a();
            while (Character.isDigit(cA3)) {
                sb6.append(cA3);
                cA3 = a();
            }
        }
        ByteBuffer byteBuffer3 = this.f191220a;
        byteBuffer3.position(byteBuffer3.position() - 1);
        return sb5 != null ? new b(Integer.toString(Integer.parseInt(sb6.toString(), Integer.parseInt(sb5.toString()))), b.f191172h) : new b(sb6.toString(), b.f191171g);
    }

    public b b() {
        b bVar = this.f191221b;
        this.f191221b = i(bVar);
        return bVar;
    }

    public boolean c(b.a aVar) {
        b bVar = this.f191221b;
        return bVar != null && bVar.d() == aVar;
    }

    public b d() {
        return this.f191221b;
    }
}
