package gn;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String[] f74983c = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int[][] f74984d = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[][] f74985e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final int[][] f74986f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f74987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Charset f74988b;

    class a implements Comparator<f> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(f fVar, f fVar2) {
            return fVar.f() - fVar2.f();
        }
    }

    static {
        Class cls = Integer.TYPE;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) cls, 5, 256);
        f74985e = iArr;
        iArr[0][32] = 1;
        for (int i15 = 65; i15 <= 90; i15++) {
            f74985e[0][i15] = i15 - 63;
        }
        f74985e[1][32] = 1;
        for (int i16 = 97; i16 <= 122; i16++) {
            f74985e[1][i16] = i16 - 95;
        }
        f74985e[2][32] = 1;
        for (int i17 = 48; i17 <= 57; i17++) {
            f74985e[2][i17] = i17 - 46;
        }
        int[] iArr2 = f74985e[2];
        iArr2[44] = 12;
        iArr2[46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, CertificateBody.profileType};
        for (int i18 = 0; i18 < 28; i18++) {
            f74985e[3][iArr3[i18]] = i18;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (int i19 = 0; i19 < 31; i19++) {
            int i25 = iArr4[i19];
            if (i25 > 0) {
                f74985e[4][i25] = i19;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) cls, 6, 6);
        f74986f = iArr5;
        for (int[] iArr6 : iArr5) {
            Arrays.fill(iArr6, -1);
        }
        int[][] iArr7 = f74986f;
        iArr7[0][4] = 0;
        int[] iArr8 = iArr7[1];
        iArr8[4] = 0;
        iArr8[0] = 28;
        iArr7[3][4] = 0;
        int[] iArr9 = iArr7[2];
        iArr9[4] = 0;
        iArr9[0] = 15;
    }

    public d(byte[] bArr, Charset charset) {
        this.f74987a = bArr;
        this.f74988b = charset;
    }

    private static Collection<f> b(Iterable<f> iterable) {
        LinkedList linkedList = new LinkedList();
        for (f fVar : iterable) {
            Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    linkedList.addFirst(fVar);
                    break;
                }
                f fVar2 = (f) it.next();
                if (fVar2.h(fVar)) {
                    break;
                }
                if (fVar.h(fVar2)) {
                    it.remove();
                }
            }
        }
        return linkedList;
    }

    private void c(f fVar, int i15, Collection<f> collection) {
        char c15 = (char) (this.f74987a[i15] & 255);
        boolean z15 = f74985e[fVar.g()][c15] > 0;
        f fVarD = null;
        for (int i16 = 0; i16 <= 4; i16++) {
            int i17 = f74985e[i16][c15];
            if (i17 > 0) {
                if (fVarD == null) {
                    fVarD = fVar.d(i15);
                }
                if (!z15 || i16 == fVar.g() || i16 == 2) {
                    collection.add(fVarD.i(i16, i17));
                }
                if (!z15 && f74986f[fVar.g()][i16] >= 0) {
                    collection.add(fVarD.j(i16, i17));
                }
            }
        }
        if (fVar.e() > 0 || f74985e[fVar.g()][c15] == 0) {
            collection.add(fVar.a(i15));
        }
    }

    private static void d(f fVar, int i15, int i16, Collection<f> collection) {
        f fVarD = fVar.d(i15);
        collection.add(fVarD.i(4, i16));
        if (fVar.g() != 4) {
            collection.add(fVarD.j(4, i16));
        }
        if (i16 == 3 || i16 == 4) {
            collection.add(fVarD.i(2, 16 - i16).i(2, 1));
        }
        if (fVar.e() > 0) {
            collection.add(fVar.a(i15).a(i15 + 1));
        }
    }

    private Collection<f> e(Iterable<f> iterable, int i15) {
        LinkedList linkedList = new LinkedList();
        Iterator<f> it = iterable.iterator();
        while (it.hasNext()) {
            c(it.next(), i15, linkedList);
        }
        return b(linkedList);
    }

    private static Collection<f> f(Iterable<f> iterable, int i15, int i16) {
        LinkedList linkedList = new LinkedList();
        Iterator<f> it = iterable.iterator();
        while (it.hasNext()) {
            d(it.next(), i15, i16, linkedList);
        }
        return b(linkedList);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0056  */
    public hn.a a() {
        int i15;
        f fVarB = f.f74992f;
        Charset charset = this.f74988b;
        if (charset != null) {
            hn.c cVarE = hn.c.e(charset);
            if (cVarE == null) {
                throw new IllegalArgumentException("No ECI code for character set " + this.f74988b);
            }
            fVarB = fVarB.b(cVarE.j());
        }
        Collection<f> collectionSingletonList = Collections.singletonList(fVarB);
        int i16 = 0;
        while (true) {
            byte[] bArr = this.f74987a;
            if (i16 >= bArr.length) {
                return ((f) Collections.min(collectionSingletonList, new a())).k(this.f74987a);
            }
            int i17 = i16 + 1;
            byte b15 = i17 < bArr.length ? bArr[i17] : (byte) 0;
            byte b16 = bArr[i16];
            if (b16 != 13) {
                if (b16 != 44) {
                    if (b16 != 46) {
                        if (b16 == 58 && b15 == 32) {
                            i15 = 5;
                        } else {
                            i15 = 0;
                        }
                    } else if (b15 == 32) {
                        i15 = 3;
                    } else {
                        i15 = 0;
                    }
                } else if (b15 == 32) {
                    i15 = 4;
                } else {
                    i15 = 0;
                }
            } else if (b15 == 10) {
                i15 = 2;
            } else {
                i15 = 0;
            }
            if (i15 > 0) {
                collectionSingletonList = f(collectionSingletonList, i16, i15);
                i16 = i17;
            } else {
                collectionSingletonList = e(collectionSingletonList, i16);
            }
            i16++;
        }
    }
}
