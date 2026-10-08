package bt;

import java.io.IOException;
import java.io.OutputStream;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
class p extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final byte[] f21455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f21456c = 0;

    private class b implements d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f21457a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f21458b;

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(b());
        }

        @Override // bt.d.a
        public byte b() {
            try {
                byte[] bArr = p.this.f21455b;
                int i15 = this.f21457a;
                this.f21457a = i15 + 1;
                return bArr[i15];
            } catch (ArrayIndexOutOfBoundsException e15) {
                throw new NoSuchElementException(e15.getMessage());
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21457a < this.f21458b;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private b() {
            this.f21457a = 0;
            this.f21458b = p.this.size();
        }
    }

    p(byte[] bArr) {
        this.f21455b = bArr;
    }

    static int M(int i15, byte[] bArr, int i16, int i17) {
        for (int i18 = i16; i18 < i16 + i17; i18++) {
            i15 = (i15 * 31) + bArr[i18];
        }
        return i15;
    }

    @Override // bt.d
    public String A(String str) {
        return new String(this.f21455b, L(), size(), str);
    }

    @Override // bt.d
    void E(OutputStream outputStream, int i15, int i16) throws IOException {
        outputStream.write(this.f21455b, L() + i15, i16);
    }

    public byte F(int i15) {
        return this.f21455b[i15];
    }

    boolean G(p pVar, int i15, int i16) {
        if (i16 > pVar.size()) {
            int size = size();
            StringBuilder sb5 = new StringBuilder(40);
            sb5.append("Length too large: ");
            sb5.append(i16);
            sb5.append(size);
            throw new IllegalArgumentException(sb5.toString());
        }
        if (i15 + i16 > pVar.size()) {
            int size2 = pVar.size();
            StringBuilder sb6 = new StringBuilder(59);
            sb6.append("Ran off end of other: ");
            sb6.append(i15);
            sb6.append(", ");
            sb6.append(i16);
            sb6.append(", ");
            sb6.append(size2);
            throw new IllegalArgumentException(sb6.toString());
        }
        byte[] bArr = this.f21455b;
        byte[] bArr2 = pVar.f21455b;
        int iL = L() + i16;
        int iL2 = L();
        int iL3 = pVar.L() + i15;
        while (iL2 < iL) {
            if (bArr[iL2] != bArr2[iL3]) {
                return false;
            }
            iL2++;
            iL3++;
        }
        return true;
    }

    protected int L() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d) || size() != ((d) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof p) {
            return G((p) obj, 0, size());
        }
        if (obj instanceof u) {
            return obj.equals(this);
        }
        String strValueOf = String.valueOf(obj.getClass());
        StringBuilder sb5 = new StringBuilder(strValueOf.length() + 49);
        sb5.append("Has a new type of ByteString been created? Found ");
        sb5.append(strValueOf);
        throw new IllegalArgumentException(sb5.toString());
    }

    public int hashCode() {
        int iV = this.f21456c;
        if (iV == 0) {
            int size = size();
            iV = v(size, 0, size);
            if (iV == 0) {
                iV = 1;
            }
            this.f21456c = iV;
        }
        return iV;
    }

    @Override // bt.d
    protected void l(byte[] bArr, int i15, int i16, int i17) {
        System.arraycopy(this.f21455b, i15, bArr, i16, i17);
    }

    @Override // bt.d
    protected int n() {
        return 0;
    }

    @Override // bt.d
    protected boolean o() {
        return true;
    }

    @Override // bt.d
    public boolean q() {
        int iL = L();
        return y.f(this.f21455b, iL, size() + iL);
    }

    @Override // bt.d, java.lang.Iterable
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public d.a iterator() {
        return new b();
    }

    @Override // bt.d
    public int size() {
        return this.f21455b.length;
    }

    @Override // bt.d
    public e t() {
        return e.g(this);
    }

    @Override // bt.d
    protected int v(int i15, int i16, int i17) {
        return M(i15, this.f21455b, L() + i16, i17);
    }

    @Override // bt.d
    protected int w(int i15, int i16, int i17) {
        int iL = L() + i16;
        return y.g(i15, this.f21455b, iL, i17 + iL);
    }

    @Override // bt.d
    protected int x() {
        return this.f21456c;
    }
}
