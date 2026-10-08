package ep;

import bp.m;
import bp.o;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public class i extends ep.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final l f52626e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int[] f52627f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b f52628g;

    private static class b implements Iterator<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long[] f52629a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long[] f52630b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f52631c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f52632d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f52633e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f52634f;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f52633e < this.f52634f;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private b(bp.a aVar) throws IOException {
            this.f52631c = 0;
            this.f52632d = 0L;
            this.f52633e = 0L;
            this.f52634f = 0L;
            long[] jArr = new long[aVar.size() / 2];
            this.f52629a = jArr;
            this.f52630b = new long[jArr.length];
            Iterator<bp.b> it = aVar.iterator();
            int i15 = 0;
            while (it.hasNext()) {
                bp.b next = it.next();
                if (!(next instanceof bp.h)) {
                    throw new IOException("Xref stream must have integer in /Index array");
                }
                long jX3 = ((bp.h) next).X3();
                if (!it.hasNext()) {
                    break;
                }
                bp.b next2 = it.next();
                if (!(next2 instanceof bp.h)) {
                    throw new IOException("Xref stream must have integer in /Index array");
                }
                long jX4 = ((bp.h) next2).X3();
                this.f52629a[i15] = jX3;
                this.f52630b[i15] = jX3 + jX4;
                i15++;
            }
            this.f52633e = this.f52629a[0];
            long[] jArr2 = this.f52630b;
            this.f52632d = jArr2[0];
            this.f52634f = jArr2[i15 - 1];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public Long next() {
            long j15 = this.f52633e;
            if (j15 >= this.f52634f) {
                throw new NoSuchElementException();
            }
            if (j15 < this.f52632d) {
                this.f52633e = 1 + j15;
                return Long.valueOf(j15);
            }
            long[] jArr = this.f52629a;
            int i15 = this.f52631c + 1;
            this.f52631c = i15;
            long j16 = jArr[i15];
            this.f52633e = j16;
            this.f52632d = this.f52630b[i15];
            this.f52633e = 1 + j16;
            return Long.valueOf(j16);
        }
    }

    public i(o oVar, bp.e eVar, l lVar) throws IOException {
        super(new d(oVar.l5()));
        this.f52627f = new int[3];
        this.f52628g = null;
        this.f52582c = eVar;
        this.f52626e = lVar;
        try {
            M(oVar);
        } catch (IOException e15) {
            L();
            throw e15;
        }
    }

    private void L() throws IOException {
        k kVar = this.f52581b;
        if (kVar != null) {
            kVar.close();
        }
        this.f52582c = null;
    }

    private void M(o oVar) throws IOException {
        bp.a aVarJ4 = oVar.j4(bp.i.D9);
        if (aVarJ4 == null) {
            throw new IOException("/W array is missing in Xref stream");
        }
        if (aVarJ4.size() != 3) {
            throw new IOException("Wrong number of values for /W array in XRef: " + Arrays.toString(this.f52627f));
        }
        for (int i15 = 0; i15 < 3; i15++) {
            this.f52627f[i15] = aVarJ4.h4(i15, 0);
        }
        int[] iArr = this.f52627f;
        if (iArr[0] < 0 || iArr[1] < 0 || iArr[2] < 0) {
            throw new IOException("Incorrect /W array in XRef: " + Arrays.toString(this.f52627f));
        }
        bp.a aVarJ5 = oVar.j4(bp.i.f20934y4);
        if (aVarJ5 == null) {
            aVarJ5 = new bp.a();
            aVarJ5.A3(bp.h.f20678g);
            aVarJ5.A3(bp.h.g4(oVar.y4(bp.i.X7, 0)));
        }
        if (aVarJ5.size() != 0 && aVarJ5.size() % 2 != 1) {
            this.f52628g = new b(aVarJ5);
            return;
        }
        throw new IOException("Wrong number of values for /Index array in XRef: " + Arrays.toString(this.f52627f));
    }

    private long O(byte[] bArr, int i15, int i16) {
        long j15 = 0;
        for (int i17 = 0; i17 < i16; i17++) {
            j15 += (((long) bArr[i17 + i15]) & 255) << (((i16 - i17) - 1) * 8);
        }
        return j15;
    }

    public void N() {
        int iO;
        int[] iArr = this.f52627f;
        byte[] bArr = new byte[iArr[0] + iArr[1] + iArr[2]];
        while (!this.f52581b.k0() && this.f52628g.hasNext()) {
            this.f52581b.read(bArr);
            long jLongValue = this.f52628g.next().longValue();
            int i15 = this.f52627f[0];
            int iO2 = i15 == 0 ? 1 : (int) O(bArr, 0, i15);
            if (iO2 != 0) {
                int[] iArr2 = this.f52627f;
                long jO = O(bArr, iArr2[0], iArr2[1]);
                if (iO2 == 1) {
                    int[] iArr3 = this.f52627f;
                    iO = (int) O(bArr, iArr3[0] + iArr3[1], iArr3[2]);
                } else {
                    iO = 0;
                }
                m mVar = new m(jLongValue, iO);
                if (iO2 == 1) {
                    this.f52626e.i(mVar, jO);
                } else {
                    this.f52626e.i(mVar, -jO);
                }
            }
        }
        L();
    }
}
