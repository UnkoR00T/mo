package wd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected static final Comparator<byte[]> f212183e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<byte[]> f212184a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<byte[]> f212185b = new ArrayList(64);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f212186c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f212187d;

    class a implements Comparator<byte[]> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    }

    public c(int i15) {
        this.f212187d = i15;
    }

    private synchronized void c() {
        while (this.f212186c > this.f212187d) {
            byte[] bArrRemove = this.f212184a.remove(0);
            this.f212185b.remove(bArrRemove);
            this.f212186c -= bArrRemove.length;
        }
    }

    public synchronized byte[] a(int i15) {
        for (int i16 = 0; i16 < this.f212185b.size(); i16++) {
            byte[] bArr = this.f212185b.get(i16);
            if (bArr.length >= i15) {
                this.f212186c -= bArr.length;
                this.f212185b.remove(i16);
                this.f212184a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i15];
    }

    public synchronized void b(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f212187d) {
                this.f212184a.add(bArr);
                int iBinarySearch = Collections.binarySearch(this.f212185b, bArr, f212183e);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                this.f212185b.add(iBinarySearch, bArr);
                this.f212186c += bArr.length;
                c();
            }
        }
    }
}
