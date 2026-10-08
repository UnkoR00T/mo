package bt;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d implements Iterable<Byte> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f21388a = new p(new byte[0]);

    public interface a extends Iterator<Byte> {
        byte b();
    }

    d() {
    }

    private static d e(Iterator<d> it, int i15) {
        if (i15 == 1) {
            return it.next();
        }
        int i16 = i15 >>> 1;
        return e(it, i16).f(e(it, i15 - i16));
    }

    public static d g(Iterable<d> iterable) {
        Collection arrayList;
        if (iterable instanceof Collection) {
            arrayList = (Collection) iterable;
        } else {
            arrayList = new ArrayList();
            Iterator<d> it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        return arrayList.isEmpty() ? f21388a : e(arrayList.iterator(), arrayList.size());
    }

    public static d h(byte[] bArr) {
        return i(bArr, 0, bArr.length);
    }

    public static d i(byte[] bArr, int i15, int i16) {
        byte[] bArr2 = new byte[i16];
        System.arraycopy(bArr, i15, bArr2, 0, i16);
        return new p(bArr2);
    }

    public static d j(String str) {
        try {
            return new p(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e15) {
            throw new RuntimeException("UTF-8 not supported?", e15);
        }
    }

    public static b u() {
        return new b(128);
    }

    public abstract String A(String str);

    public String B() {
        try {
            return A("UTF-8");
        } catch (UnsupportedEncodingException e15) {
            throw new RuntimeException("UTF-8 not supported?", e15);
        }
    }

    void C(OutputStream outputStream, int i15, int i16) {
        if (i15 < 0) {
            StringBuilder sb5 = new StringBuilder(30);
            sb5.append("Source offset < 0: ");
            sb5.append(i15);
            throw new IndexOutOfBoundsException(sb5.toString());
        }
        if (i16 < 0) {
            StringBuilder sb6 = new StringBuilder(23);
            sb6.append("Length < 0: ");
            sb6.append(i16);
            throw new IndexOutOfBoundsException(sb6.toString());
        }
        int i17 = i15 + i16;
        if (i17 <= size()) {
            if (i16 > 0) {
                E(outputStream, i15, i16);
            }
        } else {
            StringBuilder sb7 = new StringBuilder(39);
            sb7.append("Source end offset exceeded: ");
            sb7.append(i17);
            throw new IndexOutOfBoundsException(sb7.toString());
        }
    }

    abstract void E(OutputStream outputStream, int i15, int i16);

    public d f(d dVar) {
        int size = size();
        int size2 = dVar.size();
        if (((long) size) + ((long) size2) < 2147483647L) {
            return u.M(this, dVar);
        }
        StringBuilder sb5 = new StringBuilder(53);
        sb5.append("ByteString would be too long: ");
        sb5.append(size);
        sb5.append("+");
        sb5.append(size2);
        throw new IllegalArgumentException(sb5.toString());
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void k(byte[] bArr, int i15, int i16, int i17) {
        if (i15 < 0) {
            StringBuilder sb5 = new StringBuilder(30);
            sb5.append("Source offset < 0: ");
            sb5.append(i15);
            throw new IndexOutOfBoundsException(sb5.toString());
        }
        if (i16 < 0) {
            StringBuilder sb6 = new StringBuilder(30);
            sb6.append("Target offset < 0: ");
            sb6.append(i16);
            throw new IndexOutOfBoundsException(sb6.toString());
        }
        if (i17 < 0) {
            StringBuilder sb7 = new StringBuilder(23);
            sb7.append("Length < 0: ");
            sb7.append(i17);
            throw new IndexOutOfBoundsException(sb7.toString());
        }
        int i18 = i15 + i17;
        if (i18 > size()) {
            StringBuilder sb8 = new StringBuilder(34);
            sb8.append("Source end offset < 0: ");
            sb8.append(i18);
            throw new IndexOutOfBoundsException(sb8.toString());
        }
        int i19 = i16 + i17;
        if (i19 <= bArr.length) {
            if (i17 > 0) {
                l(bArr, i15, i16, i17);
            }
        } else {
            StringBuilder sb9 = new StringBuilder(34);
            sb9.append("Target end offset < 0: ");
            sb9.append(i19);
            throw new IndexOutOfBoundsException(sb9.toString());
        }
    }

    protected abstract void l(byte[] bArr, int i15, int i16, int i17);

    protected abstract int n();

    protected abstract boolean o();

    public abstract boolean q();

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: s */
    public abstract a iterator();

    public abstract int size();

    public abstract e t();

    public String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    protected abstract int v(int i15, int i16, int i17);

    protected abstract int w(int i15, int i16, int i17);

    protected abstract int x();

    public byte[] z() {
        int size = size();
        if (size == 0) {
            return j.f21443a;
        }
        byte[] bArr = new byte[size];
        l(bArr, 0, 0, size);
        return bArr;
    }

    public static final class b extends OutputStream {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final byte[] f21389f = new byte[0];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f21390a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<d> f21391b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f21392c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f21393d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f21394e;

        b(int i15) {
            if (i15 < 0) {
                throw new IllegalArgumentException("Buffer size < 0");
            }
            this.f21390a = i15;
            this.f21391b = new ArrayList<>();
            this.f21393d = new byte[i15];
        }

        private byte[] b(byte[] bArr, int i15) {
            byte[] bArr2 = new byte[i15];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i15));
            return bArr2;
        }

        private void h(int i15) {
            this.f21391b.add(new p(this.f21393d));
            int length = this.f21392c + this.f21393d.length;
            this.f21392c = length;
            this.f21393d = new byte[Math.max(this.f21390a, Math.max(i15, length >>> 1))];
            this.f21394e = 0;
        }

        private void m() {
            int i15 = this.f21394e;
            byte[] bArr = this.f21393d;
            if (i15 >= bArr.length) {
                this.f21391b.add(new p(this.f21393d));
                this.f21393d = f21389f;
            } else if (i15 > 0) {
                this.f21391b.add(new p(b(bArr, i15)));
            }
            this.f21392c += this.f21394e;
            this.f21394e = 0;
        }

        public synchronized int p() {
            return this.f21392c + this.f21394e;
        }

        public synchronized d r() {
            m();
            return d.g(this.f21391b);
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(p()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i15) {
            try {
                if (this.f21394e == this.f21393d.length) {
                    h(1);
                }
                byte[] bArr = this.f21393d;
                int i16 = this.f21394e;
                this.f21394e = i16 + 1;
                bArr[i16] = (byte) i15;
            } catch (Throwable th4) {
                throw th4;
            }
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i15, int i16) {
            try {
                byte[] bArr2 = this.f21393d;
                int length = bArr2.length;
                int i17 = this.f21394e;
                if (i16 <= length - i17) {
                    System.arraycopy(bArr, i15, bArr2, i17, i16);
                    this.f21394e += i16;
                } else {
                    int length2 = bArr2.length - i17;
                    System.arraycopy(bArr, i15, bArr2, i17, length2);
                    int i18 = i16 - length2;
                    h(i18);
                    System.arraycopy(bArr, i15 + length2, this.f21393d, 0, i18);
                    this.f21394e = i18;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
