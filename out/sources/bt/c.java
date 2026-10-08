package bt;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
class c extends p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f21383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f21384e;

    private class b implements d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f21385a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f21386b;

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(b());
        }

        @Override // bt.d.a
        public byte b() {
            int i15 = this.f21385a;
            if (i15 >= this.f21386b) {
                throw new NoSuchElementException();
            }
            byte[] bArr = c.this.f21455b;
            this.f21385a = i15 + 1;
            return bArr[i15];
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21385a < this.f21386b;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private b() {
            int iL = c.this.L();
            this.f21385a = iL;
            this.f21386b = iL + c.this.size();
        }
    }

    c(byte[] bArr, int i15, int i16) {
        super(bArr);
        if (i15 < 0) {
            StringBuilder sb5 = new StringBuilder(29);
            sb5.append("Offset too small: ");
            sb5.append(i15);
            throw new IllegalArgumentException(sb5.toString());
        }
        if (i16 < 0) {
            StringBuilder sb6 = new StringBuilder(29);
            sb6.append("Length too small: ");
            sb6.append(i15);
            throw new IllegalArgumentException(sb6.toString());
        }
        if (((long) i15) + ((long) i16) <= bArr.length) {
            this.f21383d = i15;
            this.f21384e = i16;
            return;
        }
        StringBuilder sb7 = new StringBuilder(48);
        sb7.append("Offset+Length too large: ");
        sb7.append(i15);
        sb7.append("+");
        sb7.append(i16);
        throw new IllegalArgumentException(sb7.toString());
    }

    @Override // bt.p
    public byte F(int i15) {
        if (i15 < 0) {
            StringBuilder sb5 = new StringBuilder(28);
            sb5.append("Index too small: ");
            sb5.append(i15);
            throw new ArrayIndexOutOfBoundsException(sb5.toString());
        }
        if (i15 < size()) {
            return this.f21455b[this.f21383d + i15];
        }
        int size = size();
        StringBuilder sb6 = new StringBuilder(41);
        sb6.append("Index too large: ");
        sb6.append(i15);
        sb6.append(", ");
        sb6.append(size);
        throw new ArrayIndexOutOfBoundsException(sb6.toString());
    }

    @Override // bt.p
    protected int L() {
        return this.f21383d;
    }

    @Override // bt.p, bt.d
    protected void l(byte[] bArr, int i15, int i16, int i17) {
        System.arraycopy(this.f21455b, L() + i15, bArr, i16, i17);
    }

    @Override // bt.p, bt.d, java.lang.Iterable
    /* JADX INFO: renamed from: s */
    public d.a iterator() {
        return new b();
    }

    @Override // bt.p, bt.d
    public int size() {
        return this.f21384e;
    }
}
