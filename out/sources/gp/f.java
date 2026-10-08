package gp;

import io.sentry.android.core.c2;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Stack;
import lp.r;
import tp.q;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f75799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private OutputStream f75800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private h f75801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f75802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Stack<r> f75803e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Stack<op.b> f75804f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Stack<op.b> f75805g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final NumberFormat f75806h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final byte[] f75807j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f75808k;

    public f(c cVar, q qVar) {
        this(cVar, qVar, qVar.d().b());
    }

    private bp.i C(op.b bVar) {
        return ((bVar instanceof op.d) || (bVar instanceof op.e)) ? bp.i.J3(bVar.d()) : this.f75801c.c(bVar);
    }

    private void C0(wo.a aVar) throws IOException {
        double[] dArr = new double[6];
        aVar.c(dArr);
        for (int i15 = 0; i15 < 6; i15++) {
            H0((float) dArr[i15]);
        }
    }

    private boolean E(double d15) {
        return d15 < 0.0d || d15 > 1.0d;
    }

    private void O0(bp.i iVar) throws IOException {
        iVar.N3(this.f75800b);
        this.f75800b.write(32);
    }

    private void T0(String str) throws IOException {
        this.f75800b.write(str.getBytes(xp.a.f220412a));
        this.f75800b.write(10);
    }

    private void a0(op.b bVar) {
        if (this.f75804f.isEmpty()) {
            this.f75804f.add(bVar);
        } else {
            Stack<op.b> stack = this.f75804f;
            stack.setElementAt(bVar, stack.size() - 1);
        }
    }

    private void c0(op.b bVar) {
        if (this.f75805g.isEmpty()) {
            this.f75805g.add(bVar);
        } else {
            Stack<op.b> stack = this.f75805g;
            stack.setElementAt(bVar, stack.size() - 1);
        }
    }

    private void u0(String str) throws IOException {
        this.f75800b.write(str.getBytes(xp.a.f220412a));
    }

    public void H() {
        if (!this.f75802d) {
            throw new IllegalStateException("Must call beginText() before newLine()");
        }
        T0("T*");
    }

    protected void H0(float f15) throws IOException {
        if (Float.isInfinite(f15) || Float.isNaN(f15)) {
            throw new IllegalArgumentException(f15 + " is not a finite number");
        }
        int iA = xp.e.a(f15, this.f75806h.getMaximumFractionDigits(), this.f75807j);
        if (iA == -1) {
            u0(this.f75806h.format(f15));
        } else {
            this.f75800b.write(this.f75807j, 0, iA);
        }
        this.f75800b.write(32);
    }

    public void I(float f15, float f16) {
        if (!this.f75802d) {
            throw new IllegalStateException("Error: must call beginText() before newLineAtOffset()");
        }
        H0(f15);
        H0(f16);
        T0("Td");
    }

    public void J() {
        if (this.f75802d) {
            c2.g("PdfBox-Android", "Restoring the graphics state is not allowed within text objects.");
        }
        if (!this.f75803e.isEmpty()) {
            this.f75803e.pop();
        }
        if (!this.f75805g.isEmpty()) {
            this.f75805g.pop();
        }
        if (!this.f75804f.isEmpty()) {
            this.f75804f.pop();
        }
        T0("Q");
    }

    public void K() {
        if (this.f75802d) {
            c2.g("PdfBox-Android", "Saving the graphics state is not allowed within text objects.");
        }
        if (!this.f75803e.isEmpty()) {
            Stack<r> stack = this.f75803e;
            stack.push(stack.peek());
        }
        if (!this.f75805g.isEmpty()) {
            Stack<op.b> stack2 = this.f75805g;
            stack2.push(stack2.peek());
        }
        if (!this.f75804f.isEmpty()) {
            Stack<op.b> stack3 = this.f75804f;
            stack3.push(stack3.peek());
        }
        T0("q");
    }

    public void L(r rVar, float f15) {
        if (this.f75803e.isEmpty()) {
            this.f75803e.add(rVar);
        } else {
            Stack<r> stack = this.f75803e;
            stack.setElementAt(rVar, stack.size() - 1);
        }
        if (rVar.x()) {
            this.f75799a.L().add(rVar);
        }
        O0(this.f75801c.b(rVar));
        H0(f15);
        T0("Tf");
    }

    public void M(float f15) {
        H0(f15);
        T0("TL");
    }

    public void N(float f15) throws IOException {
        H0(f15);
        T0("w");
    }

    public void O(float f15) throws IOException {
        if (E(f15)) {
            throw new IllegalArgumentException("Parameter must be within 0..1, but is " + f15);
        }
        H0(f15);
        T0("g");
        a0(op.d.f148060c);
    }

    public void V(float f15, float f16, float f17) {
        if (E(f15) || E(f16) || E(f17)) {
            throw new IllegalArgumentException("Parameters must be within 0..1, but are " + String.format("(%.2f,%.2f,%.2f)", Float.valueOf(f15), Float.valueOf(f16), Float.valueOf(f17)));
        }
        H0(f15);
        H0(f16);
        H0(f17);
        T0("rg");
        a0(op.e.f148062c);
    }

    public void Z(op.a aVar) throws IOException {
        if (this.f75804f.isEmpty() || this.f75804f.peek() != aVar.a()) {
            O0(C(aVar.a()));
            T0("cs");
            a0(aVar.a());
        }
        for (float f15 : aVar.b()) {
            H0(f15);
        }
        T0("sc");
    }

    public void b(float f15, float f16, float f17, float f18) throws IOException {
        if (this.f75802d) {
            throw new IllegalStateException("Error: addRect is not allowed within a text block.");
        }
        H0(f15);
        H0(f16);
        H0(f17);
        H0(f18);
        T0("re");
    }

    public void b0(op.a aVar) throws IOException {
        if (this.f75805g.isEmpty() || this.f75805g.peek() != aVar.a()) {
            O0(C(aVar.a()));
            T0("CS");
            c0(aVar.a());
        }
        for (float f15 : aVar.b()) {
            H0(f15);
        }
        T0("SC");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f75802d) {
            c2.g("PdfBox-Android", "You did not call endText(), some viewers won't display your text");
        }
        OutputStream outputStream = this.f75800b;
        if (outputStream != null) {
            outputStream.close();
            this.f75800b = null;
        }
    }

    public void d0(String str) {
        n0(str);
        u0(" ");
        T0("Tj");
    }

    public void h() {
        if (this.f75802d) {
            throw new IllegalStateException("Error: Nested beginText() calls are not allowed.");
        }
        T0("BT");
        this.f75802d = true;
    }

    public void m() throws IOException {
        if (this.f75802d) {
            throw new IllegalStateException("Error: clip is not allowed within a text block.");
        }
        T0("W");
        T0("n");
    }

    protected void n0(String str) throws IOException {
        if (!this.f75802d) {
            throw new IllegalStateException("Must call beginText() before showText()");
        }
        if (this.f75803e.isEmpty()) {
            throw new IllegalStateException("Must call setFont() before showText()");
        }
        r rVarPeek = this.f75803e.peek();
        if (rVarPeek.x()) {
            int iCharCount = 0;
            while (iCharCount < str.length()) {
                int iCodePointAt = str.codePointAt(iCharCount);
                rVarPeek.f(iCodePointAt);
                iCharCount += Character.charCount(iCodePointAt);
            }
        }
        fp.b.F1(rVarPeek.h(str), this.f75800b);
    }

    public void p() throws IOException {
        if (this.f75802d) {
            throw new IllegalStateException("Error: closeAndStroke is not allowed within a text block.");
        }
        T0("s");
    }

    public void r(qp.d dVar, float f15, float f16, float f17, float f18) {
        if (this.f75802d) {
            throw new IllegalStateException("Error: drawImage is not allowed within a text block.");
        }
        K();
        t0(new xp.d(new wo.a(f17, 0.0f, 0.0f, f18, f15, f16)));
        O0(this.f75801c.d(dVar));
        T0("Do");
        J();
    }

    public void t0(xp.d dVar) throws IOException {
        if (this.f75802d) {
            c2.g("PdfBox-Android", "Modifying the current transformation matrix is not allowed within text objects.");
        }
        C0(dVar.c());
        T0("cm");
    }

    public void u() {
        if (!this.f75802d) {
            throw new IllegalStateException("Error: You must call beginText() before calling endText.");
        }
        T0("ET");
        this.f75802d = false;
    }

    public void y() throws IOException {
        if (this.f75802d) {
            throw new IllegalStateException("Error: fill is not allowed within a text block.");
        }
        T0("f");
    }

    public f(c cVar, q qVar, OutputStream outputStream) {
        this.f75802d = false;
        this.f75803e = new Stack<>();
        this.f75804f = new Stack<>();
        this.f75805g = new Stack<>();
        NumberFormat numberInstance = NumberFormat.getNumberInstance(Locale.US);
        this.f75806h = numberInstance;
        this.f75807j = new byte[32];
        this.f75808k = false;
        this.f75799a = cVar;
        this.f75800b = outputStream;
        this.f75801c = qVar.g();
        numberInstance.setMaximumFractionDigits(4);
        numberInstance.setGroupingUsed(false);
    }
}
