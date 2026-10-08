package ie;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements ImageHeaderParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final byte[] f91904a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f91905b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    private static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ByteBuffer f91906a;

        a(ByteBuffer byteBuffer) {
            this.f91906a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // ie.m.c
        public int a() {
            return (c() << 8) | c();
        }

        @Override // ie.m.c
        public int b(byte[] bArr, int i15) {
            int iMin = Math.min(i15, this.f91906a.remaining());
            if (iMin == 0) {
                return -1;
            }
            this.f91906a.get(bArr, 0, iMin);
            return iMin;
        }

        @Override // ie.m.c
        public short c() throws c.a {
            if (this.f91906a.remaining() >= 1) {
                return (short) (this.f91906a.get() & 255);
            }
            throw new c.a();
        }

        @Override // ie.m.c
        public long skip(long j15) {
            int iMin = (int) Math.min(this.f91906a.remaining(), j15);
            ByteBuffer byteBuffer = this.f91906a;
            byteBuffer.position(byteBuffer.position() + iMin);
            return iMin;
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ByteBuffer f91907a;

        b(byte[] bArr, int i15) {
            this.f91907a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i15);
        }

        private boolean c(int i15, int i16) {
            return this.f91907a.remaining() - i15 >= i16;
        }

        short a(int i15) {
            if (c(i15, 2)) {
                return this.f91907a.getShort(i15);
            }
            return (short) -1;
        }

        int b(int i15) {
            if (c(i15, 4)) {
                return this.f91907a.getInt(i15);
            }
            return -1;
        }

        int d() {
            return this.f91907a.remaining();
        }

        void e(ByteOrder byteOrder) {
            this.f91907a.order(byteOrder);
        }
    }

    private interface c {

        public static final class a extends IOException {
            a() {
                super("Unexpectedly reached end of a file");
            }
        }

        int a();

        int b(byte[] bArr, int i15);

        short c();

        long skip(long j15);
    }

    private static final class d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InputStream f91908a;

        d(InputStream inputStream) {
            this.f91908a = inputStream;
        }

        @Override // ie.m.c
        public int a() {
            return (c() << 8) | c();
        }

        @Override // ie.m.c
        public int b(byte[] bArr, int i15) throws c.a {
            int i16 = 0;
            int i17 = 0;
            while (i16 < i15 && (i17 = this.f91908a.read(bArr, i16, i15 - i16)) != -1) {
                i16 += i17;
            }
            if (i16 == 0 && i17 == -1) {
                throw new c.a();
            }
            return i16;
        }

        @Override // ie.m.c
        public short c() throws IOException {
            int i15 = this.f91908a.read();
            if (i15 != -1) {
                return (short) i15;
            }
            throw new c.a();
        }

        @Override // ie.m.c
        public long skip(long j15) throws IOException {
            if (j15 < 0) {
                return 0L;
            }
            long j16 = j15;
            while (j16 > 0) {
                long jSkip = this.f91908a.skip(j16);
                if (jSkip <= 0) {
                    if (this.f91908a.read() == -1) {
                        break;
                    }
                    jSkip = 1;
                }
                j16 -= jSkip;
            }
            return j15 - j16;
        }
    }

    private static int e(int i15, int i16) {
        return i15 + 2 + (i16 * 12);
    }

    private int f(c cVar, ce.b bVar) {
        int iJ;
        try {
            if (!h(cVar.a()) || (iJ = j(cVar)) == -1) {
                return -1;
            }
            byte[] bArr = (byte[]) bVar.c(iJ, byte[].class);
            try {
                return l(cVar, bArr, iJ);
            } finally {
                bVar.put(bArr);
            }
        } catch (c.a unused) {
            return -1;
        }
    }

    private ImageHeaderParser.ImageType g(c cVar) {
        try {
            int iA = cVar.a();
            if (iA == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int iC = (iA << 8) | cVar.c();
            if (iC == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int iC2 = (iC << 8) | cVar.c();
            if (iC2 == -1991225785) {
                cVar.skip(21L);
                try {
                    return cVar.c() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (c.a unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (iC2 != 1380533830) {
                return m(cVar, iC2);
            }
            cVar.skip(4L);
            if (((cVar.a() << 16) | cVar.a()) != 1464156752) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int iA2 = (cVar.a() << 16) | cVar.a();
            if ((iA2 & (-256)) != 1448097792) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int i15 = iA2 & GF2Field.MASK;
            if (i15 != 88) {
                if (i15 != 76) {
                    return ImageHeaderParser.ImageType.WEBP;
                }
                cVar.skip(4L);
                return (cVar.c() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            }
            cVar.skip(4L);
            short sC = cVar.c();
            if ((sC & 2) != 0) {
                return ImageHeaderParser.ImageType.ANIMATED_WEBP;
            }
            return (sC & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
        } catch (c.a unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    private static boolean h(int i15) {
        return (i15 & 65496) == 65496 || i15 == 19789 || i15 == 18761;
    }

    private boolean i(byte[] bArr, int i15) {
        boolean z15 = bArr != null && i15 > f91904a.length;
        if (z15) {
            int i16 = 0;
            while (true) {
                byte[] bArr2 = f91904a;
                if (i16 >= bArr2.length) {
                    break;
                }
                if (bArr[i16] != bArr2[i16]) {
                    return false;
                }
                i16++;
            }
        }
        return z15;
    }

    private int j(c cVar) {
        short sC;
        while (cVar.c() == 255 && (sC = cVar.c()) != 218 && sC != 217) {
            int iA = cVar.a() - 2;
            if (sC == 225) {
                return iA;
            }
            long j15 = iA;
            if (cVar.skip(j15) != j15) {
                return -1;
            }
        }
        return -1;
    }

    private static int k(b bVar) {
        short sA;
        int iB;
        int i15;
        int i16;
        short sA2 = bVar.a(6);
        bVar.e(sA2 != 18761 ? sA2 != 19789 ? ByteOrder.BIG_ENDIAN : ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        int iB2 = bVar.b(10) + 6;
        short sA3 = bVar.a(iB2);
        for (int i17 = 0; i17 < sA3; i17++) {
            int iE = e(iB2, i17);
            if (bVar.a(iE) == 274 && (sA = bVar.a(iE + 2)) >= 1 && sA <= 12 && (iB = bVar.b(iE + 4)) >= 0 && (i15 = iB + f91905b[sA]) <= 4 && (i16 = iE + 8) >= 0 && i16 <= bVar.d() && i15 >= 0 && i15 + i16 <= bVar.d()) {
                return bVar.a(i16);
            }
        }
        return -1;
    }

    private int l(c cVar, byte[] bArr, int i15) {
        if (cVar.b(bArr, i15) == i15 && i(bArr, i15)) {
            return k(new b(bArr, i15));
        }
        return -1;
    }

    private ImageHeaderParser.ImageType m(c cVar, int i15) {
        if (((cVar.a() << 16) | cVar.a()) != 1718909296) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int iA = (cVar.a() << 16) | cVar.a();
        if (iA == 1635150195) {
            return ImageHeaderParser.ImageType.ANIMATED_AVIF;
        }
        int i16 = 0;
        boolean z15 = iA == 1635150182;
        cVar.skip(4L);
        int i17 = i15 - 16;
        if (i17 % 4 == 0) {
            while (i16 < 5 && i17 > 0) {
                int iA2 = (cVar.a() << 16) | cVar.a();
                if (iA2 == 1635150195) {
                    return ImageHeaderParser.ImageType.ANIMATED_AVIF;
                }
                if (iA2 == 1635150182) {
                    z15 = true;
                }
                i16++;
                i17 -= 4;
            }
        }
        return z15 ? ImageHeaderParser.ImageType.AVIF : ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int a(ByteBuffer byteBuffer, ce.b bVar) {
        return f(new a((ByteBuffer) ve.k.d(byteBuffer)), (ce.b) ve.k.d(bVar));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType b(ByteBuffer byteBuffer) {
        return g(new a((ByteBuffer) ve.k.d(byteBuffer)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType c(InputStream inputStream) {
        return g(new d((InputStream) ve.k.d(inputStream)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int d(InputStream inputStream, ce.b bVar) {
        return f(new d((InputStream) ve.k.d(inputStream)), (ce.b) ve.k.d(bVar));
    }
}
