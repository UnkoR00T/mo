package com.google.gson.internal.bind;

import com.google.gson.i;
import com.google.gson.l;
import com.google.gson.n;
import com.google.gson.o;
import com.google.gson.r;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends zl.c {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Writer f36836t = new a();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final r f36837v = new r("closed");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final List<l> f36838q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f36839r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private l f36840s;

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

    public c() {
        super(f36836t);
        this.f36838q = new ArrayList();
        this.f36840s = n.f36856a;
    }

    private l d1() {
        List<l> list = this.f36838q;
        return list.get(list.size() - 1);
    }

    private void i1(l lVar) {
        if (this.f36839r != null) {
            if (!lVar.k() || E()) {
                ((o) d1()).o(this.f36839r, lVar);
            }
            this.f36839r = null;
            return;
        }
        if (this.f36838q.isEmpty()) {
            this.f36840s = lVar;
            return;
        }
        l lVarD1 = d1();
        if (!(lVarD1 instanceof i)) {
            throw new IllegalStateException();
        }
        ((i) lVarD1).o(lVar);
    }

    @Override // zl.c
    public zl.c C() {
        if (this.f36838q.isEmpty() || this.f36839r != null) {
            throw new IllegalStateException();
        }
        if (!(d1() instanceof o)) {
            throw new IllegalStateException();
        }
        List<l> list = this.f36838q;
        list.remove(list.size() - 1);
        return this;
    }

    @Override // zl.c
    public zl.c C0(Number number) {
        if (number == null) {
            return M();
        }
        if (!J()) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        i1(new r(number));
        return this;
    }

    @Override // zl.c
    public zl.c H0(String str) {
        if (str == null) {
            return M();
        }
        i1(new r(str));
        return this;
    }

    @Override // zl.c
    public zl.c K(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f36838q.isEmpty() || this.f36839r != null) {
            throw new IllegalStateException("Did not expect a name");
        }
        if (!(d1() instanceof o)) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f36839r = str;
        return this;
    }

    @Override // zl.c
    public zl.c M() {
        i1(n.f36856a);
        return this;
    }

    @Override // zl.c
    public zl.c O0(boolean z15) {
        i1(new r(Boolean.valueOf(z15)));
        return this;
    }

    public l Y0() {
        if (this.f36838q.isEmpty()) {
            return this.f36840s;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f36838q);
    }

    @Override // zl.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.f36838q.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.f36838q.add(f36837v);
    }

    @Override // zl.c, java.io.Flushable
    public void flush() {
    }

    @Override // zl.c
    public zl.c n0(double d15) {
        if (J() || !(Double.isNaN(d15) || Double.isInfinite(d15))) {
            i1(new r(Double.valueOf(d15)));
            return this;
        }
        throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d15);
    }

    @Override // zl.c
    public zl.c p() {
        i iVar = new i();
        i1(iVar);
        this.f36838q.add(iVar);
        return this;
    }

    @Override // zl.c
    public zl.c r() {
        o oVar = new o();
        i1(oVar);
        this.f36838q.add(oVar);
        return this;
    }

    @Override // zl.c
    public zl.c t0(long j15) {
        i1(new r(Long.valueOf(j15)));
        return this;
    }

    @Override // zl.c
    public zl.c u0(Boolean bool) {
        if (bool == null) {
            return M();
        }
        i1(new r(bool));
        return this;
    }

    @Override // zl.c
    public zl.c y() {
        if (this.f36838q.isEmpty() || this.f36839r != null) {
            throw new IllegalStateException();
        }
        if (!(d1() instanceof i)) {
            throw new IllegalStateException();
        }
        List<l> list = this.f36838q;
        list.remove(list.size() - 1);
        return this;
    }
}
