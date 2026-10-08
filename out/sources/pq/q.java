package pq;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import p071kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000n\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010\u0019\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0018\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u001a%\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002*\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\u000e\u001a\u00020\u0006*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000f\u001aS\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a9\u0010\u0017\u001a\u00020\u0016*\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u00162\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a9\u0010\u0019\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a9\u0010\u001c\u001a\u00020\u001b*\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\u001b2\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a9\u0010\u001e\u001a\u00020\t*\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a9\u0010!\u001a\u00020 *\u00020 2\u0006\u0010\u0010\u001a\u00020 2\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u0006H\u0007¢\u0006\u0004\b!\u0010\"\u001a5\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0001¢\u0006\u0004\b#\u0010$\u001a#\u0010%\u001a\u00020\u0016*\u00020\u00162\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0001¢\u0006\u0004\b%\u0010&\u001a#\u0010'\u001a\u00020\t*\u00020\t2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0001¢\u0006\u0004\b'\u0010(\u001a9\u0010*\u001a\u00020)\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000b\u001a\u00028\u00002\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b*\u0010+\u001a-\u0010-\u001a\u00020)*\u00020\u00162\u0006\u0010\u000b\u001a\u00020,2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b-\u0010.\u001a-\u0010/\u001a\u00020)*\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b/\u00100\u001a-\u00102\u001a\u00020)*\u00020\u001b2\u0006\u0010\u000b\u001a\u0002012\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b2\u00103\u001a-\u00106\u001a\u00020)*\u0002042\u0006\u0010\u000b\u001a\u0002052\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b6\u00107\u001a.\u00108\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b8\u00109\u001a\u001c\u0010:\u001a\u00020\u0016*\u00020\u00162\u0006\u0010\u000b\u001a\u00020,H\u0086\u0002¢\u0006\u0004\b:\u0010;\u001a\u001c\u0010<\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b<\u0010=\u001a6\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u0010>\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001H\u0086\u0002¢\u0006\u0004\b?\u0010@\u001a\u001c\u0010A\u001a\u00020\u0016*\u00020\u00162\u0006\u0010>\u001a\u00020\u0016H\u0086\u0002¢\u0006\u0004\bA\u0010B\u001a\u001c\u0010C\u001a\u00020\u0005*\u00020\u00052\u0006\u0010>\u001a\u00020\u0005H\u0086\u0002¢\u0006\u0004\bC\u0010D\u001a\u001c\u0010E\u001a\u00020\u001b*\u00020\u001b2\u0006\u0010>\u001a\u00020\u001bH\u0086\u0002¢\u0006\u0004\bE\u0010F\u001a\u001c\u0010G\u001a\u00020\t*\u00020\t2\u0006\u0010>\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\bG\u0010H\u001a\u001c\u0010I\u001a\u000204*\u0002042\u0006\u0010>\u001a\u000204H\u0086\u0002¢\u0006\u0004\bI\u0010J\u001a\u0011\u0010K\u001a\u00020)*\u00020\u0005¢\u0006\u0004\bK\u0010L\u001a\u001f\u0010M\u001a\u00020)\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\bM\u0010N\u001a%\u0010O\u001a\u00020)*\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0006¢\u0006\u0004\bO\u0010P\u001a;\u0010T\u001a\u00020)\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u001a\u0010S\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000Qj\n\u0012\u0006\b\u0000\u0012\u00028\u0000`R¢\u0006\u0004\bT\u0010U\u001aO\u0010\u0000\u001a\u00020)\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u001a\u0010S\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000Qj\n\u0012\u0006\b\u0000\u0012\u00028\u0000`R2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u0000\u0010V\u001a\u0017\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001*\u00020\u0005¢\u0006\u0004\bW\u0010X\u001a\u0017\u0010Y\u001a\b\u0012\u0004\u0012\u0002010\u0001*\u00020\u001b¢\u0006\u0004\bY\u0010Z\u001a\u0017\u0010[\u001a\b\u0012\u0004\u0012\u00020\n0\u0001*\u00020\t¢\u0006\u0004\b[\u0010\\\u001a\u0017\u0010]\u001a\b\u0012\u0004\u0012\u0002050\u0001*\u000204¢\u0006\u0004\b]\u0010^¨\u0006_"}, d2 = {"T", "", "", "f", "([Ljava/lang/Object;)Ljava/util/List;", "", "", "e", "([I)Ljava/util/List;", "", "", "element", "fromIndex", "toIndex", "g", "([FFII)I", "destination", "destinationOffset", "startIndex", "endIndex", "n", "([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;", "", "i", "([B[BIII)[B", "l", "([I[IIII)[I", "", "m", "([J[JIII)[J", "k", "([F[FIII)[F", "", "j", "([C[CIII)[C", "v", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "t", "([BII)[B", "u", "([FII)[F", "Loq/i0;", "z", "([Ljava/lang/Object;Ljava/lang/Object;II)V", "", "w", "([BBII)V", "x", "([IIII)V", "", "y", "([JJII)V", "", "", "A", "([ZZII)V", "M", "([Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;", "G", "([BB)[B", "J", "([II)[I", "elements", "N", "([Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "([B[B)[B", "K", "([I[I)[I", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "([J[J)[J", "I", "([F[F)[F", "O", "([Z[Z)[Z", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "([I)V", "R", "([Ljava/lang/Object;)V", "Q", "([III)V", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", ip.a.f96137b, "([Ljava/lang/Object;Ljava/util/Comparator;)V", "([Ljava/lang/Object;Ljava/util/Comparator;II)V", "W", "([I)[Ljava/lang/Integer;", "X", "([J)[Ljava/lang/Long;", "V", "([F)[Ljava/lang/Float;", "U", "([Z)[Ljava/lang/Boolean;", "kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/collections/ArraysKt")
public class q extends p {

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"pq/q$a", "Lpq/d;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "isEmpty", "()Z", "element", "h", "(I)Z", "index", "i", "(I)Ljava/lang/Integer;", "k", "(I)I", "n", "f", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends d<Integer> implements RandomAccess {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int[] f161730b;

        a(int[] iArr) {
            this.f161730b = iArr;
        }

        @Override // pq.b, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Integer) {
                return h(((Number) obj).intValue());
            }
            return false;
        }

        @Override // pq.b
        /* JADX INFO: renamed from: f */
        public int get_size() {
            return this.f161730b.length;
        }

        public boolean h(int element) {
            return s.d0(this.f161730b, element);
        }

        @Override // pq.d, java.util.List
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Integer get(int index) {
            return Integer.valueOf(this.f161730b[index]);
        }

        @Override // pq.d, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Integer) {
                return k(((Number) obj).intValue());
            }
            return -1;
        }

        @Override // pq.b, java.util.Collection
        public boolean isEmpty() {
            return this.f161730b.length == 0;
        }

        public int k(int element) {
            return s.B0(this.f161730b, element);
        }

        @Override // pq.d, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Integer) {
                return n(((Number) obj).intValue());
            }
            return -1;
        }

        public int n(int element) {
            return s.N0(this.f161730b, element);
        }
    }

    public static final void A(boolean[] zArr, boolean z15, int i15, int i16) {
        Arrays.fill(zArr, i15, i16, z15);
    }

    public static /* synthetic */ void B(byte[] bArr, byte b15, int i15, int i16, int i17, Object obj) {
        if ((i17 & 2) != 0) {
            i15 = 0;
        }
        if ((i17 & 4) != 0) {
            i16 = bArr.length;
        }
        w(bArr, b15, i15, i16);
    }

    public static /* synthetic */ void C(int[] iArr, int i15, int i16, int i17, int i18, Object obj) {
        if ((i18 & 2) != 0) {
            i16 = 0;
        }
        if ((i18 & 4) != 0) {
            i17 = iArr.length;
        }
        x(iArr, i15, i16, i17);
    }

    public static /* synthetic */ void D(long[] jArr, long j15, int i15, int i16, int i17, Object obj) {
        if ((i17 & 2) != 0) {
            i15 = 0;
        }
        if ((i17 & 4) != 0) {
            i16 = jArr.length;
        }
        y(jArr, j15, i15, i16);
    }

    public static /* synthetic */ void E(Object[] objArr, Object obj, int i15, int i16, int i17, Object obj2) {
        if ((i17 & 2) != 0) {
            i15 = 0;
        }
        if ((i17 & 4) != 0) {
            i16 = objArr.length;
        }
        z(objArr, obj, i15, i16);
    }

    public static /* synthetic */ void F(boolean[] zArr, boolean z15, int i15, int i16, int i17, Object obj) {
        if ((i17 & 2) != 0) {
            i15 = 0;
        }
        if ((i17 & 4) != 0) {
            i16 = zArr.length;
        }
        A(zArr, z15, i15, i16);
    }

    public static byte[] G(byte[] bArr, byte b15) {
        int length = bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + 1);
        bArrCopyOf[length] = b15;
        return bArrCopyOf;
    }

    public static byte[] H(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(bArr2, 0, bArrCopyOf, length, length2);
        return bArrCopyOf;
    }

    public static float[] I(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        int length2 = fArr2.length;
        float[] fArrCopyOf = Arrays.copyOf(fArr, length + length2);
        System.arraycopy(fArr2, 0, fArrCopyOf, length, length2);
        return fArrCopyOf;
    }

    public static int[] J(int[] iArr, int i15) {
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
        iArrCopyOf[length] = i15;
        return iArrCopyOf;
    }

    public static int[] K(int[] iArr, int[] iArr2) {
        int length = iArr.length;
        int length2 = iArr2.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(iArr2, 0, iArrCopyOf, length, length2);
        return iArrCopyOf;
    }

    public static long[] L(long[] jArr, long[] jArr2) {
        int length = jArr.length;
        int length2 = jArr2.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, length + length2);
        System.arraycopy(jArr2, 0, jArrCopyOf, length, length2);
        return jArrCopyOf;
    }

    public static <T> T[] M(T[] tArr, T t15) {
        int length = tArr.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, length + 1);
        tArr2[length] = t15;
        return tArr2;
    }

    public static <T> T[] N(T[] tArr, T[] tArr2) {
        int length = tArr.length;
        int length2 = tArr2.length;
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, length + length2);
        System.arraycopy(tArr2, 0, tArr3, length, length2);
        return tArr3;
    }

    public static boolean[] O(boolean[] zArr, boolean[] zArr2) {
        int length = zArr.length;
        int length2 = zArr2.length;
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + length2);
        System.arraycopy(zArr2, 0, zArrCopyOf, length, length2);
        return zArrCopyOf;
    }

    public static void P(int[] iArr) {
        if (iArr.length > 1) {
            Arrays.sort(iArr);
        }
    }

    public static void Q(int[] iArr, int i15, int i16) {
        Arrays.sort(iArr, i15, i16);
    }

    public static final <T> void R(T[] tArr) {
        if (tArr.length > 1) {
            Arrays.sort(tArr);
        }
    }

    public static <T> void S(T[] tArr, Comparator<? super T> comparator) {
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }

    public static <T> void T(T[] tArr, Comparator<? super T> comparator, int i15, int i16) {
        Arrays.sort(tArr, i15, i16, comparator);
    }

    public static Boolean[] U(boolean[] zArr) {
        Boolean[] boolArr = new Boolean[zArr.length];
        int length = zArr.length;
        for (int i15 = 0; i15 < length; i15++) {
            boolArr[i15] = Boolean.valueOf(zArr[i15]);
        }
        return boolArr;
    }

    public static Float[] V(float[] fArr) {
        Float[] fArr2 = new Float[fArr.length];
        int length = fArr.length;
        for (int i15 = 0; i15 < length; i15++) {
            fArr2[i15] = Float.valueOf(fArr[i15]);
        }
        return fArr2;
    }

    public static Integer[] W(int[] iArr) {
        Integer[] numArr = new Integer[iArr.length];
        int length = iArr.length;
        for (int i15 = 0; i15 < length; i15++) {
            numArr[i15] = Integer.valueOf(iArr[i15]);
        }
        return numArr;
    }

    public static Long[] X(long[] jArr) {
        Long[] lArr = new Long[jArr.length];
        int length = jArr.length;
        for (int i15 = 0; i15 < length; i15++) {
            lArr[i15] = Long.valueOf(jArr[i15]);
        }
        return lArr;
    }

    public static List<Integer> e(int[] iArr) {
        return new a(iArr);
    }

    public static <T> List<T> f(T[] tArr) {
        return t.a(tArr);
    }

    public static final int g(float[] fArr, float f15, int i15, int i16) {
        return Arrays.binarySearch(fArr, i15, i16, f15);
    }

    public static /* synthetic */ int h(float[] fArr, float f15, int i15, int i16, int i17, Object obj) {
        if ((i17 & 2) != 0) {
            i15 = 0;
        }
        if ((i17 & 4) != 0) {
            i16 = fArr.length;
        }
        return g(fArr, f15, i15, i16);
    }

    public static byte[] i(byte[] bArr, byte[] bArr2, int i15, int i16, int i17) {
        System.arraycopy(bArr, i16, bArr2, i15, i17 - i16);
        return bArr2;
    }

    public static char[] j(char[] cArr, char[] cArr2, int i15, int i16, int i17) {
        System.arraycopy(cArr, i16, cArr2, i15, i17 - i16);
        return cArr2;
    }

    public static float[] k(float[] fArr, float[] fArr2, int i15, int i16, int i17) {
        System.arraycopy(fArr, i16, fArr2, i15, i17 - i16);
        return fArr2;
    }

    public static int[] l(int[] iArr, int[] iArr2, int i15, int i16, int i17) {
        System.arraycopy(iArr, i16, iArr2, i15, i17 - i16);
        return iArr2;
    }

    public static long[] m(long[] jArr, long[] jArr2, int i15, int i16, int i17) {
        System.arraycopy(jArr, i16, jArr2, i15, i17 - i16);
        return jArr2;
    }

    public static <T> T[] n(T[] tArr, T[] tArr2, int i15, int i16, int i17) {
        System.arraycopy(tArr, i16, tArr2, i15, i17 - i16);
        return tArr2;
    }

    public static /* synthetic */ byte[] o(byte[] bArr, byte[] bArr2, int i15, int i16, int i17, int i18, Object obj) {
        if ((i18 & 2) != 0) {
            i15 = 0;
        }
        if ((i18 & 4) != 0) {
            i16 = 0;
        }
        if ((i18 & 8) != 0) {
            i17 = bArr.length;
        }
        return i(bArr, bArr2, i15, i16, i17);
    }

    public static /* synthetic */ float[] p(float[] fArr, float[] fArr2, int i15, int i16, int i17, int i18, Object obj) {
        if ((i18 & 2) != 0) {
            i15 = 0;
        }
        if ((i18 & 4) != 0) {
            i16 = 0;
        }
        if ((i18 & 8) != 0) {
            i17 = fArr.length;
        }
        return k(fArr, fArr2, i15, i16, i17);
    }

    public static /* synthetic */ int[] q(int[] iArr, int[] iArr2, int i15, int i16, int i17, int i18, Object obj) {
        if ((i18 & 2) != 0) {
            i15 = 0;
        }
        if ((i18 & 4) != 0) {
            i16 = 0;
        }
        if ((i18 & 8) != 0) {
            i17 = iArr.length;
        }
        return l(iArr, iArr2, i15, i16, i17);
    }

    public static /* synthetic */ long[] r(long[] jArr, long[] jArr2, int i15, int i16, int i17, int i18, Object obj) {
        if ((i18 & 2) != 0) {
            i15 = 0;
        }
        if ((i18 & 4) != 0) {
            i16 = 0;
        }
        if ((i18 & 8) != 0) {
            i17 = jArr.length;
        }
        return m(jArr, jArr2, i15, i16, i17);
    }

    public static /* synthetic */ Object[] s(Object[] objArr, Object[] objArr2, int i15, int i16, int i17, int i18, Object obj) {
        if ((i18 & 2) != 0) {
            i15 = 0;
        }
        if ((i18 & 4) != 0) {
            i16 = 0;
        }
        if ((i18 & 8) != 0) {
            i17 = objArr.length;
        }
        return n(objArr, objArr2, i15, i16, i17);
    }

    public static byte[] t(byte[] bArr, int i15, int i16) {
        o.c(i16, bArr.length);
        return Arrays.copyOfRange(bArr, i15, i16);
    }

    public static float[] u(float[] fArr, int i15, int i16) {
        o.c(i16, fArr.length);
        return Arrays.copyOfRange(fArr, i15, i16);
    }

    public static <T> T[] v(T[] tArr, int i15, int i16) {
        o.c(i16, tArr.length);
        return (T[]) Arrays.copyOfRange(tArr, i15, i16);
    }

    public static final void w(byte[] bArr, byte b15, int i15, int i16) {
        Arrays.fill(bArr, i15, i16, b15);
    }

    public static final void x(int[] iArr, int i15, int i16, int i17) {
        Arrays.fill(iArr, i16, i17, i15);
    }

    public static void y(long[] jArr, long j15, int i15, int i16) {
        Arrays.fill(jArr, i15, i16, j15);
    }

    public static <T> void z(T[] tArr, T t15, int i15, int i16) {
        Arrays.fill(tArr, i15, i16, t15);
    }
}
