package bo;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import yn.q;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends ho.c {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Writer f20479t = new a();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final q f20480v = new q("closed");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final List<yn.l> f20481q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f20482r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private yn.l f20483s;

    class a extends Writer {
        a() {
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i15, int i16) {
            throw new AssertionError();
        }
    }

    public h() {
        super(f20479t);
        this.f20481q = new ArrayList();
        this.f20483s = yn.n.f228069a;
    }

    private yn.l d1() {
        List<yn.l> list = this.f20481q;
        return list.get(list.size() - 1);
    }

    private void i1(yn.l lVar) {
        if (this.f20482r != null) {
            if (!lVar.i() || E()) {
                ((yn.o) d1()).l(this.f20482r, lVar);
            }
            this.f20482r = null;
            return;
        }
        if (this.f20481q.isEmpty()) {
            this.f20483s = lVar;
            return;
        }
        yn.l lVarD1 = d1();
        if (!(lVarD1 instanceof yn.i)) {
            throw new IllegalStateException();
        }
        ((yn.i) lVarD1).l(lVar);
    }

    @Override // ho.c
    public ho.c C() {
        if (this.f20481q.isEmpty() || this.f20482r != null) {
            throw new IllegalStateException();
        }
        if (!(d1() instanceof yn.o)) {
            throw new IllegalStateException();
        }
        List<yn.l> list = this.f20481q;
        list.remove(list.size() - 1);
        return this;
    }

    @Override // ho.c
    public ho.c C0(Number number) {
        if (number == null) {
            return M();
        }
        if (!J()) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        i1(new q(number));
        return this;
    }

    @Override // ho.c
    public ho.c H0(String str) {
        if (str == null) {
            return M();
        }
        i1(new q(str));
        return this;
    }

    @Override // ho.c
    public ho.c K(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f20481q.isEmpty() || this.f20482r != null) {
            throw new IllegalStateException("Did not expect a name");
        }
        if (!(d1() instanceof yn.o)) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f20482r = str;
        return this;
    }

    @Override // ho.c
    public ho.c M() {
        i1(yn.n.f228069a);
        return this;
    }

    @Override // ho.c
    public ho.c O0(boolean z15) {
        i1(new q(Boolean.valueOf(z15)));
        return this;
    }

    public yn.l Y0() {
        if (this.f20481q.isEmpty()) {
            return this.f20483s;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f20481q);
    }

    @Override // ho.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.f20481q.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.f20481q.add(f20480v);
    }

    @Override // ho.c, java.io.Flushable
    public void flush() {
    }

    @Override // ho.c
    public ho.c n0(double d15) {
        if (J() || !(Double.isNaN(d15) || Double.isInfinite(d15))) {
            i1(new q(Double.valueOf(d15)));
            return this;
        }
        throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d15);
    }

    @Override // ho.c
    public ho.c p() {
        yn.i iVar = new yn.i();
        i1(iVar);
        this.f20481q.add(iVar);
        return this;
    }

    @Override // ho.c
    public ho.c r() {
        yn.o oVar = new yn.o();
        i1(oVar);
        this.f20481q.add(oVar);
        return this;
    }

    @Override // ho.c
    public ho.c t0(long j15) {
        i1(new q(Long.valueOf(j15)));
        return this;
    }

    @Override // ho.c
    public ho.c u0(Boolean bool) {
        if (bool == null) {
            return M();
        }
        i1(new q(bool));
        return this;
    }

    @Override // ho.c
    public ho.c y() {
        if (this.f20481q.isEmpty() || this.f20482r != null) {
            throw new IllegalStateException();
        }
        if (!(d1() instanceof yn.i)) {
            throw new IllegalStateException();
        }
        List<yn.l> list = this.f20481q;
        list.remove(list.size() - 1);
        return this;
    }
}
