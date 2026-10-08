package bp;

import java.io.Closeable;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class o extends d implements Closeable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private dp.c f20968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final dp.i f20969e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f20970f;

    class a extends FilterOutputStream {
        a(OutputStream outputStream) {
            super(outputStream);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            o oVar = o.this;
            oVar.W4(i.f20699b5, (int) oVar.f20968d.length());
            o.this.f20970f = false;
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i15, int i16) throws IOException {
            ((FilterOutputStream) this).out.write(bArr, i15, i16);
        }
    }

    class b extends FilterOutputStream {
        b(OutputStream outputStream) {
            super(outputStream);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            o oVar = o.this;
            oVar.W4(i.f20699b5, (int) oVar.f20968d.length());
            o.this.f20970f = false;
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i15, int i16) throws IOException {
            ((FilterOutputStream) this).out.write(bArr, i15, i16);
        }
    }

    public o() {
        this(dp.i.p());
    }

    private void k5() throws IOException {
        dp.c cVar = this.f20968d;
        if (cVar != null && cVar.isClosed()) {
            throw new IOException("COSStream has been closed and cannot be read. Perhaps its enclosing PDDocument has been closed?");
        }
    }

    private void r5(boolean z15) {
        if (this.f20968d == null) {
            if (z15) {
                yo.a.b();
            }
            this.f20968d = this.f20969e.h();
        }
    }

    private List<cp.l> s5() throws IOException {
        bp.b bVarT5 = t5();
        if (bVarT5 instanceof i) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(cp.m.f37223b.a((i) bVarT5));
            return arrayList;
        }
        if (!(bVarT5 instanceof bp.a)) {
            return new ArrayList();
        }
        bp.a aVar = (bp.a) bVarT5;
        ArrayList arrayList2 = new ArrayList(aVar.size());
        for (int i15 = 0; i15 < aVar.size(); i15++) {
            bp.b bVarG4 = aVar.g4(i15);
            if (!(bVarG4 instanceof i)) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("Forbidden type in filter array: ");
                sb5.append(bVarG4 == null ? "null" : bVarG4.getClass().getName());
                throw new IOException(sb5.toString());
            }
            arrayList2.add(cp.m.f37223b.a((i) bVarG4));
        }
        return arrayList2;
    }

    @Override // bp.d, bp.b
    public Object F1(r rVar) {
        return rVar.H(this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        dp.c cVar = this.f20968d;
        if (cVar != null) {
            cVar.close();
        }
    }

    public g l5() {
        return m5(cp.j.f37213g);
    }

    public g m5(cp.j jVar) throws IOException {
        k5();
        if (this.f20970f) {
            throw new IllegalStateException("Cannot read while there is an open stream writer");
        }
        r5(true);
        return g.b(s5(), this, new dp.e(this.f20968d), this.f20969e, jVar);
    }

    public OutputStream n5() {
        return o5(null);
    }

    public OutputStream o5(bp.b bVar) throws IOException {
        k5();
        if (this.f20970f) {
            throw new IllegalStateException("Cannot have more than one open stream writer.");
        }
        if (bVar != null) {
            Y4(i.f20933y3, bVar);
        }
        dp.a.b(this.f20968d);
        this.f20968d = this.f20969e.h();
        n nVar = new n(s5(), this, new dp.f(this.f20968d), this.f20969e);
        this.f20970f = true;
        return new a(nVar);
    }

    public InputStream p5() {
        k5();
        if (this.f20970f) {
            throw new IllegalStateException("Cannot read while there is an open stream writer");
        }
        r5(true);
        return new dp.e(this.f20968d);
    }

    public OutputStream q5() throws IOException {
        k5();
        if (this.f20970f) {
            throw new IllegalStateException("Cannot have more than one open stream writer.");
        }
        dp.a.b(this.f20968d);
        this.f20968d = this.f20969e.h();
        dp.f fVar = new dp.f(this.f20968d);
        this.f20970f = true;
        return new b(fVar);
    }

    public bp.b t5() {
        return p4(i.f20933y3);
    }

    public long u5() {
        if (this.f20970f) {
            throw new IllegalStateException("There is an open OutputStream associated with this COSStream. It must be closed before querying the length of this COSStream.");
        }
        return y4(i.f20699b5, 0);
    }

    public String v5() {
        g gVarL5 = null;
        try {
            gVarL5 = l5();
            return new p(dp.a.e(gVarL5)).J3();
        } catch (IOException unused) {
            return "";
        } finally {
            dp.a.b(gVarL5);
        }
    }

    public o(dp.i iVar) {
        W4(i.f20699b5, 0);
        this.f20969e = iVar == null ? dp.i.p() : iVar;
    }
}
