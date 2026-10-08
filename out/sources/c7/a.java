package c7;

import android.content.res.AssetManager;
import android.location.Location;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import io.sentry.android.core.c2;
import io.sentry.instrumentation.file.h;
import io.sentry.instrumentation.file.l;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes3.dex */
public class a {
    private static final SimpleDateFormat V;
    private static final SimpleDateFormat W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final e[] f23766a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final e[] f23767b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final e[] f23768c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final e[] f23769d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final e[] f23770e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final e f23771f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final e[] f23772g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final e[] f23773h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final e[] f23774i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final e[] f23775j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    static final e[][] f23776k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final e[] f23777l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final HashMap<Integer, e>[] f23778m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private static final HashMap<String, e>[] f23779n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private static final Set<String> f23780o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final HashMap<Integer, Integer> f23781p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private static final Charset f23782q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    static final byte[] f23783r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private static final byte[] f23784s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private static final Pattern f23785t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private static final Pattern f23786u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private static final Pattern f23787v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private static final Pattern f23789w0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f23793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FileDescriptor f23794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AssetManager.AssetInputStream f23795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f23796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f23797e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashMap<String, d>[] f23798f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Set<Integer> f23799g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ByteOrder f23800h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f23801i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f23802j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f23803k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f23804l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f23805m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private byte[] f23806n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f23807o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f23808p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f23809q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f23810r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f23811s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f23812t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private d f23813u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f23814v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final boolean f23788w = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final List<Integer> f23790x = Arrays.asList(1, 6, 3, 8);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final List<Integer> f23791y = Arrays.asList(2, 7, 4, 5);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f23792z = {8, 8, 8};
    public static final int[] A = {4};
    public static final int[] B = {8};
    static final byte[] C = {-1, -40, -1};
    private static final byte[] D = {102, 116, 121, 112};
    private static final byte[] E = {109, 105, 102, 49};
    private static final byte[] F = {104, 101, 105, 99};
    private static final byte[] G = {97, 118, 105, 102};
    private static final byte[] H = {97, 118, 105, 115};
    private static final byte[] I = {79, 76, 89, 77, 80, 0};
    private static final byte[] J = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    private static final byte[] K = {-119, 80, 78, 71, 13, 10, 26, 10};
    static final byte[] L = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);
    private static final byte[] M = {82, 73, 70, 70};
    private static final byte[] N = {87, 69, 66, 80};
    private static final byte[] O = {69, 88, 73, 70};
    private static final byte[] P = {-99, 1, 42};
    private static final byte[] Q = "VP8X".getBytes(Charset.defaultCharset());
    private static final byte[] R = "VP8L".getBytes(Charset.defaultCharset());
    private static final byte[] S = "VP8 ".getBytes(Charset.defaultCharset());
    private static final byte[] T = "ANIM".getBytes(Charset.defaultCharset());
    private static final byte[] U = "ANMF".getBytes(Charset.defaultCharset());
    private static final String[] X = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    private static final int[] Y = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    private static final byte[] Z = {65, 83, 67, 73, 73, 0, 0, 0};

    /* JADX INFO: renamed from: c7.a$a, reason: collision with other inner class name */
    class C0633a extends MediaDataSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f23815a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f23816b;

        C0633a(g gVar) {
            this.f23816b = gVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // android.media.MediaDataSource
        public long getSize() {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j15, byte[] bArr, int i15, int i16) {
            if (i16 == 0) {
                return 0;
            }
            if (j15 < 0) {
                return -1;
            }
            try {
                long j16 = this.f23815a;
                if (j16 != j15) {
                    if (j16 >= 0 && j15 >= j16 + ((long) this.f23816b.available())) {
                        return -1;
                    }
                    this.f23816b.seek(j15);
                    this.f23815a = j15;
                }
                if (i16 > this.f23816b.available()) {
                    i16 = this.f23816b.available();
                }
                int i17 = this.f23816b.read(bArr, i15, i16);
                if (i17 >= 0) {
                    this.f23815a += (long) i17;
                    return i17;
                }
            } catch (IOException unused) {
            }
            this.f23815a = -1L;
            return -1;
        }
    }

    private static class c extends FilterOutputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final DataOutputStream f23823a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ByteOrder f23824b;

        public c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.f23823a = new DataOutputStream(outputStream);
            this.f23824b = byteOrder;
        }

        public void b(ByteOrder byteOrder) {
            this.f23824b = byteOrder;
        }

        public void h(int i15) throws IOException {
            this.f23823a.write(i15);
        }

        public void m(int i15) throws IOException {
            ByteOrder byteOrder = this.f23824b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f23823a.write(i15 & GF2Field.MASK);
                this.f23823a.write((i15 >>> 8) & GF2Field.MASK);
                this.f23823a.write((i15 >>> 16) & GF2Field.MASK);
                this.f23823a.write((i15 >>> 24) & GF2Field.MASK);
                return;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f23823a.write((i15 >>> 24) & GF2Field.MASK);
                this.f23823a.write((i15 >>> 16) & GF2Field.MASK);
                this.f23823a.write((i15 >>> 8) & GF2Field.MASK);
                this.f23823a.write(i15 & GF2Field.MASK);
            }
        }

        public void p(short s15) throws IOException {
            ByteOrder byteOrder = this.f23824b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f23823a.write(s15 & 255);
                this.f23823a.write((s15 >>> 8) & GF2Field.MASK);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f23823a.write((s15 >>> 8) & GF2Field.MASK);
                this.f23823a.write(s15 & 255);
            }
        }

        public void r(long j15) throws IOException {
            if (j15 > BodyPartID.bodyIdMax) {
                throw new IllegalArgumentException("val is larger than the maximum value of a 32-bit unsigned integer");
            }
            m((int) j15);
        }

        public void u(int i15) throws IOException {
            if (i15 > 65535) {
                throw new IllegalArgumentException("val is larger than the maximum value of a 16-bit unsigned integer");
            }
            p((short) i15);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.f23823a.write(bArr);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i15, int i16) throws IOException {
            this.f23823a.write(bArr, i15, i16);
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f23825a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f23826b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f23827c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f23828d;

        d(int i15, int i16, byte[] bArr) {
            this(i15, i16, -1L, bArr);
        }

        public static d a(String str) {
            if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
                return new d(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
            }
            byte[] bytes = str.getBytes(a.f23782q0);
            return new d(1, bytes.length, bytes);
        }

        public static d b(double[] dArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.Y[12] * dArr.length]);
            byteBufferWrap.order(byteOrder);
            for (double d15 : dArr) {
                byteBufferWrap.putDouble(d15);
            }
            return new d(12, dArr.length, byteBufferWrap.array());
        }

        public static d c(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.Y[9] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i15 : iArr) {
                byteBufferWrap.putInt(i15);
            }
            return new d(9, iArr.length, byteBufferWrap.array());
        }

        public static d d(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.Y[10] * fVarArr.length]);
            byteBufferWrap.order(byteOrder);
            for (f fVar : fVarArr) {
                byteBufferWrap.putInt((int) fVar.f23833a);
                byteBufferWrap.putInt((int) fVar.f23834b);
            }
            return new d(10, fVarArr.length, byteBufferWrap.array());
        }

        public static d e(String str) {
            byte[] bytes = (str + (char) 0).getBytes(a.f23782q0);
            return new d(2, bytes.length, bytes);
        }

        public static d f(long j15, ByteOrder byteOrder) {
            return g(new long[]{j15}, byteOrder);
        }

        public static d g(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.Y[4] * jArr.length]);
            byteBufferWrap.order(byteOrder);
            for (long j15 : jArr) {
                byteBufferWrap.putInt((int) j15);
            }
            return new d(4, jArr.length, byteBufferWrap.array());
        }

        public static d h(f fVar, ByteOrder byteOrder) {
            return i(new f[]{fVar}, byteOrder);
        }

        public static d i(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.Y[5] * fVarArr.length]);
            byteBufferWrap.order(byteOrder);
            for (f fVar : fVarArr) {
                byteBufferWrap.putInt((int) fVar.f23833a);
                byteBufferWrap.putInt((int) fVar.f23834b);
            }
            return new d(5, fVarArr.length, byteBufferWrap.array());
        }

        public static d j(int i15, ByteOrder byteOrder) {
            return k(new int[]{i15}, byteOrder);
        }

        public static d k(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.Y[3] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i15 : iArr) {
                byteBufferWrap.putShort((short) i15);
            }
            return new d(3, iArr.length, byteBufferWrap.array());
        }

        public double l(ByteOrder byteOrder) throws Throwable {
            Object objO = o(byteOrder);
            if (objO == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (objO instanceof String) {
                return Double.parseDouble((String) objO);
            }
            if (objO instanceof long[]) {
                long[] jArr = (long[]) objO;
                if (jArr.length == 1) {
                    return jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objO instanceof int[]) {
                int[] iArr = (int[]) objO;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objO instanceof double[]) {
                double[] dArr = (double[]) objO;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objO instanceof f[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            f[] fVarArr = (f[]) objO;
            if (fVarArr.length == 1) {
                return fVarArr[0].a();
            }
            throw new NumberFormatException("There are more than one component");
        }

        public int m(ByteOrder byteOrder) throws Throwable {
            Object objO = o(byteOrder);
            if (objO == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (objO instanceof String) {
                return Integer.parseInt((String) objO);
            }
            if (objO instanceof long[]) {
                long[] jArr = (long[]) objO;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objO instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) objO;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        public String n(ByteOrder byteOrder) throws Throwable {
            Object objO = o(byteOrder);
            if (objO == null) {
                return null;
            }
            if (objO instanceof String) {
                return (String) objO;
            }
            StringBuilder sb5 = new StringBuilder();
            int i15 = 0;
            if (objO instanceof long[]) {
                long[] jArr = (long[]) objO;
                while (i15 < jArr.length) {
                    sb5.append(jArr[i15]);
                    i15++;
                    if (i15 != jArr.length) {
                        sb5.append(",");
                    }
                }
                return sb5.toString();
            }
            if (objO instanceof int[]) {
                int[] iArr = (int[]) objO;
                while (i15 < iArr.length) {
                    sb5.append(iArr[i15]);
                    i15++;
                    if (i15 != iArr.length) {
                        sb5.append(",");
                    }
                }
                return sb5.toString();
            }
            if (objO instanceof double[]) {
                double[] dArr = (double[]) objO;
                while (i15 < dArr.length) {
                    sb5.append(dArr[i15]);
                    i15++;
                    if (i15 != dArr.length) {
                        sb5.append(",");
                    }
                }
                return sb5.toString();
            }
            if (!(objO instanceof f[])) {
                return null;
            }
            f[] fVarArr = (f[]) objO;
            while (i15 < fVarArr.length) {
                sb5.append(fVarArr[i15].f23833a);
                sb5.append('/');
                sb5.append(fVarArr[i15].f23834b);
                i15++;
                if (i15 != fVarArr.length) {
                    sb5.append(",");
                }
            }
            return sb5.toString();
        }

        /* JADX WARN: Code duplicated, block: B:108:0x0163 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:124:? A[SYNTHETIC] */
        /* JADX WARN: Not initialized variable reg: 4, insn: 0x0032: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:18:0x0031 */
        Object o(ByteOrder byteOrder) throws Throwable {
            Throwable th4;
            IOException iOException;
            b bVar;
            InputStream inputStream;
            byte b15;
            byte b16;
            Object str;
            InputStream inputStream2 = null;
            try {
                try {
                    bVar = new b(this.f23828d);
                    try {
                        bVar.r(byteOrder);
                        int length = 0;
                        switch (this.f23825a) {
                            case 1:
                            case 6:
                                byte[] bArr = this.f23828d;
                                if (bArr.length == 1 && (b15 = bArr[0]) >= 0 && b15 <= 1) {
                                    str = new String(new char[]{(char) (b15 + 48)});
                                    break;
                                } else {
                                    String str2 = new String(bArr, a.f23782q0);
                                    try {
                                        bVar.close();
                                        return str2;
                                    } catch (IOException e15) {
                                        c2.f("ExifInterface", "IOException occurred while closing InputStream", e15);
                                        return str2;
                                    }
                                }
                                break;
                            case 2:
                            case 7:
                                if (this.f23826b >= a.Z.length) {
                                    int i15 = 0;
                                    while (true) {
                                        if (i15 >= a.Z.length) {
                                            length = a.Z.length;
                                        } else if (this.f23828d[i15] == a.Z[i15]) {
                                            i15++;
                                        }
                                    }
                                }
                                StringBuilder sb5 = new StringBuilder();
                                while (length < this.f23826b && (b16 = this.f23828d[length]) != 0) {
                                    if (b16 >= 32) {
                                        sb5.append((char) b16);
                                    } else {
                                        sb5.append('?');
                                    }
                                    length++;
                                }
                                str = sb5.toString();
                                break;
                            case 3:
                                int[] iArr = new int[this.f23826b];
                                while (true) {
                                    str = iArr;
                                    if (length < this.f23826b) {
                                        iArr[length] = bVar.readUnsignedShort();
                                        length++;
                                    }
                                }
                                break;
                            case 4:
                                long[] jArr = new long[this.f23826b];
                                while (true) {
                                    str = jArr;
                                    if (length < this.f23826b) {
                                        jArr[length] = bVar.p();
                                        length++;
                                    }
                                }
                                break;
                            case 5:
                                f[] fVarArr = new f[this.f23826b];
                                while (true) {
                                    str = fVarArr;
                                    if (length < this.f23826b) {
                                        fVarArr[length] = new f(bVar.p(), bVar.p(), null);
                                        length++;
                                    }
                                }
                                break;
                            case 8:
                                int[] iArr2 = new int[this.f23826b];
                                while (true) {
                                    str = iArr2;
                                    if (length < this.f23826b) {
                                        iArr2[length] = bVar.readShort();
                                        length++;
                                    }
                                }
                                break;
                            case 9:
                                int[] iArr3 = new int[this.f23826b];
                                while (true) {
                                    str = iArr3;
                                    if (length < this.f23826b) {
                                        iArr3[length] = bVar.readInt();
                                        length++;
                                    }
                                }
                                break;
                            case 10:
                                f[] fVarArr2 = new f[this.f23826b];
                                while (true) {
                                    str = fVarArr2;
                                    if (length < this.f23826b) {
                                        fVarArr2[length] = new f(bVar.readInt(), bVar.readInt(), null);
                                        length++;
                                    }
                                }
                                break;
                            case 11:
                                double[] dArr = new double[this.f23826b];
                                while (true) {
                                    str = dArr;
                                    if (length < this.f23826b) {
                                        dArr[length] = bVar.readFloat();
                                        length++;
                                    }
                                }
                                break;
                            case 12:
                                double[] dArr2 = new double[this.f23826b];
                                while (true) {
                                    str = dArr2;
                                    if (length < this.f23826b) {
                                        dArr2[length] = bVar.readDouble();
                                        length++;
                                    }
                                }
                                break;
                            default:
                                try {
                                    bVar.close();
                                    return null;
                                } catch (IOException e16) {
                                    c2.f("ExifInterface", "IOException occurred while closing InputStream", e16);
                                    return null;
                                }
                        }
                        try {
                            bVar.close();
                            return str;
                        } catch (IOException e17) {
                            c2.f("ExifInterface", "IOException occurred while closing InputStream", e17);
                            return str;
                        }
                    } catch (IOException e18) {
                        iOException = e18;
                        c2.h("ExifInterface", "IOException occurred during reading a value", iOException);
                        if (bVar != null) {
                            try {
                                bVar.close();
                            } catch (IOException e19) {
                                c2.f("ExifInterface", "IOException occurred while closing InputStream", e19);
                            }
                        }
                        return null;
                    }
                } catch (Throwable th5) {
                    th4 = th5;
                    inputStream2 = inputStream;
                    if (inputStream2 != null) {
                        throw th4;
                    }
                    try {
                        inputStream2.close();
                        throw th4;
                    } catch (IOException e25) {
                        c2.f("ExifInterface", "IOException occurred while closing InputStream", e25);
                        throw th4;
                    }
                }
            } catch (IOException e26) {
                iOException = e26;
                bVar = null;
            } catch (Throwable th6) {
                th4 = th6;
                if (inputStream2 != null) {
                    throw th4;
                }
                inputStream2.close();
                throw th4;
            }
        }

        public int p() {
            return a.Y[this.f23825a] * this.f23826b;
        }

        public String toString() {
            return "(" + a.X[this.f23825a] + ", data length:" + this.f23828d.length + ")";
        }

        d(int i15, int i16, long j15, byte[] bArr) {
            this.f23825a = i15;
            this.f23826b = i16;
            this.f23827c = j15;
            this.f23828d = bArr;
        }
    }

    static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f23833a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f23834b;

        /* synthetic */ f(long j15, long j16, C0633a c0633a) {
            this(j15, j16);
        }

        public static f b(double d15) {
            long j15;
            long j16;
            long j17 = 1;
            if (d15 >= 9.223372036854776E18d || d15 <= -9.223372036854776E18d) {
                return new f(d15 > 0.0d ? Long.MAX_VALUE : Long.MIN_VALUE, 1L);
            }
            double dAbs = Math.abs(d15);
            long j18 = 0;
            long j19 = 1;
            double d16 = dAbs;
            long j25 = 0;
            while (true) {
                double d17 = d16 % 1.0d;
                long j26 = (long) (d16 - d17);
                j15 = j25 + (j26 * j17);
                j16 = (j26 * j18) + j19;
                d16 = 1.0d / d17;
                long j27 = j17;
                if (Math.abs(dAbs - (j15 / j16)) <= 1.0E-8d * dAbs) {
                    break;
                }
                j19 = j18;
                j17 = j15;
                j25 = j27;
                j18 = j16;
            }
            if (d15 < 0.0d) {
                j15 = -j15;
            }
            return new f(j15, j16);
        }

        public double a() {
            return this.f23833a / this.f23834b;
        }

        public String toString() {
            return this.f23833a + "/" + this.f23834b;
        }

        private f(long j15, long j16) {
            if (j16 == 0) {
                this.f23833a = 0L;
                this.f23834b = 1L;
            } else {
                this.f23833a = j15;
                this.f23834b = j16;
            }
        }
    }

    static {
        e[] eVarArr = {new e("NewSubfileType", 254, 4), new e("SubfileType", GF2Field.MASK, 4), new e("ImageWidth", 256, 3, 4), new e("ImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("Orientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("SensorTopBorder", 4, 4), new e("SensorLeftBorder", 5, 4), new e("SensorBottomBorder", 6, 4), new e("SensorRightBorder", 7, 4), new e("ISO", 23, 3), new e("JpgFromRaw", 46, 7), new e("Xmp", 700, 1)};
        f23766a0 = eVarArr;
        e[] eVarArr2 = {new e("ExposureTime", 33434, 5), new e("FNumber", 33437, 5), new e("ExposureProgram", 34850, 3), new e("SpectralSensitivity", 34852, 2), new e("PhotographicSensitivity", 34855, 3), new e("OECF", 34856, 7), new e("SensitivityType", 34864, 3), new e("StandardOutputSensitivity", 34865, 4), new e("RecommendedExposureIndex", 34866, 4), new e("ISOSpeed", 34867, 4), new e("ISOSpeedLatitudeyyy", 34868, 4), new e("ISOSpeedLatitudezzz", 34869, 4), new e("ExifVersion", 36864, 2), new e("DateTimeOriginal", 36867, 2), new e("DateTimeDigitized", 36868, 2), new e("OffsetTime", 36880, 2), new e("OffsetTimeOriginal", 36881, 2), new e("OffsetTimeDigitized", 36882, 2), new e("ComponentsConfiguration", 37121, 7), new e("CompressedBitsPerPixel", 37122, 5), new e("ShutterSpeedValue", 37377, 10), new e("ApertureValue", 37378, 5), new e("BrightnessValue", 37379, 10), new e("ExposureBiasValue", 37380, 10), new e("MaxApertureValue", 37381, 5), new e("SubjectDistance", 37382, 5), new e("MeteringMode", 37383, 3), new e("LightSource", 37384, 3), new e("Flash", 37385, 3), new e("FocalLength", 37386, 5), new e("SubjectArea", 37396, 3), new e("MakerNote", 37500, 7), new e("UserComment", 37510, 7), new e("SubSecTime", 37520, 2), new e("SubSecTimeOriginal", 37521, 2), new e("SubSecTimeDigitized", 37522, 2), new e("FlashpixVersion", 40960, 7), new e("ColorSpace", 40961, 3), new e("PixelXDimension", 40962, 3, 4), new e("PixelYDimension", 40963, 3, 4), new e("RelatedSoundFile", 40964, 2), new e("InteroperabilityIFDPointer", 40965, 4), new e("FlashEnergy", 41483, 5), new e("SpatialFrequencyResponse", 41484, 7), new e("FocalPlaneXResolution", 41486, 5), new e("FocalPlaneYResolution", 41487, 5), new e("FocalPlaneResolutionUnit", 41488, 3), new e("SubjectLocation", 41492, 3), new e("ExposureIndex", 41493, 5), new e("SensingMethod", 41495, 3), new e("FileSource", 41728, 7), new e("SceneType", 41729, 7), new e("CFAPattern", 41730, 7), new e("CustomRendered", 41985, 3), new e("ExposureMode", 41986, 3), new e("WhiteBalance", 41987, 3), new e("DigitalZoomRatio", 41988, 5), new e("FocalLengthIn35mmFilm", 41989, 3), new e("SceneCaptureType", 41990, 3), new e("GainControl", 41991, 3), new e("Contrast", 41992, 3), new e("Saturation", 41993, 3), new e("Sharpness", 41994, 3), new e("DeviceSettingDescription", 41995, 7), new e("SubjectDistanceRange", 41996, 3), new e("ImageUniqueID", 42016, 2), new e("CameraOwnerName", 42032, 2), new e("BodySerialNumber", 42033, 2), new e("LensSpecification", 42034, 5), new e("LensMake", 42035, 2), new e("LensModel", 42036, 2), new e("Gamma", 42240, 5), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        f23767b0 = eVarArr2;
        e[] eVarArr3 = {new e("GPSVersionID", 0, 1), new e("GPSLatitudeRef", 1, 2), new e("GPSLatitude", 2, 5, 10), new e("GPSLongitudeRef", 3, 2), new e("GPSLongitude", 4, 5, 10), new e("GPSAltitudeRef", 5, 1), new e("GPSAltitude", 6, 5), new e("GPSTimeStamp", 7, 5), new e("GPSSatellites", 8, 2), new e("GPSStatus", 9, 2), new e("GPSMeasureMode", 10, 2), new e("GPSDOP", 11, 5), new e("GPSSpeedRef", 12, 2), new e("GPSSpeed", 13, 5), new e("GPSTrackRef", 14, 2), new e("GPSTrack", 15, 5), new e("GPSImgDirectionRef", 16, 2), new e("GPSImgDirection", 17, 5), new e("GPSMapDatum", 18, 2), new e("GPSDestLatitudeRef", 19, 2), new e("GPSDestLatitude", 20, 5), new e("GPSDestLongitudeRef", 21, 2), new e("GPSDestLongitude", 22, 5), new e("GPSDestBearingRef", 23, 2), new e("GPSDestBearing", 24, 5), new e("GPSDestDistanceRef", 25, 2), new e("GPSDestDistance", 26, 5), new e("GPSProcessingMethod", 27, 7), new e("GPSAreaInformation", 28, 7), new e("GPSDateStamp", 29, 2), new e("GPSDifferential", 30, 3), new e("GPSHPositioningError", 31, 5)};
        f23768c0 = eVarArr3;
        e[] eVarArr4 = {new e("InteroperabilityIndex", 1, 2)};
        f23769d0 = eVarArr4;
        e[] eVarArr5 = {new e("NewSubfileType", 254, 4), new e("SubfileType", GF2Field.MASK, 4), new e("ThumbnailImageWidth", 256, 3, 4), new e("ThumbnailImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("ThumbnailOrientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        f23770e0 = eVarArr5;
        f23771f0 = new e("StripOffsets", 273, 3);
        e[] eVarArr6 = {new e("ThumbnailImage", 256, 7), new e("CameraSettingsIFDPointer", 8224, 4), new e("ImageProcessingIFDPointer", 8256, 4)};
        f23772g0 = eVarArr6;
        e[] eVarArr7 = {new e("PreviewImageStart", 257, 4), new e("PreviewImageLength", 258, 4)};
        f23773h0 = eVarArr7;
        e[] eVarArr8 = {new e("AspectFrame", 4371, 3)};
        f23774i0 = eVarArr8;
        e[] eVarArr9 = {new e("ColorSpace", 55, 3)};
        f23775j0 = eVarArr9;
        e[][] eVarArr10 = {eVarArr, eVarArr2, eVarArr3, eVarArr4, eVarArr5, eVarArr, eVarArr6, eVarArr7, eVarArr8, eVarArr9};
        f23776k0 = eVarArr10;
        f23777l0 = new e[]{new e("SubIFDPointer", 330, 4), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("InteroperabilityIFDPointer", 40965, 4), new e("CameraSettingsIFDPointer", 8224, 1), new e("ImageProcessingIFDPointer", 8256, 1)};
        f23778m0 = new HashMap[eVarArr10.length];
        f23779n0 = new HashMap[eVarArr10.length];
        f23780o0 = Collections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        f23781p0 = new HashMap<>();
        Charset charsetForName = Charset.forName("US-ASCII");
        f23782q0 = charsetForName;
        f23783r0 = "Exif\u0000\u0000".getBytes(charsetForName);
        f23784s0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        V = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        W = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i15 = 0;
        while (true) {
            e[][] eVarArr11 = f23776k0;
            if (i15 >= eVarArr11.length) {
                HashMap<Integer, Integer> map = f23781p0;
                e[] eVarArr12 = f23777l0;
                map.put(Integer.valueOf(eVarArr12[0].f23829a), 5);
                map.put(Integer.valueOf(eVarArr12[1].f23829a), 1);
                map.put(Integer.valueOf(eVarArr12[2].f23829a), 2);
                map.put(Integer.valueOf(eVarArr12[3].f23829a), 3);
                map.put(Integer.valueOf(eVarArr12[4].f23829a), 7);
                map.put(Integer.valueOf(eVarArr12[5].f23829a), 8);
                f23785t0 = Pattern.compile(".*[1-9].*");
                f23786u0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f23787v0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f23789w0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f23778m0[i15] = new HashMap<>();
            f23779n0[i15] = new HashMap<>();
            for (e eVar : eVarArr11[i15]) {
                f23778m0[i15].put(Integer.valueOf(eVar.f23829a), eVar);
                f23779n0[i15].put(eVar.f23830b, eVar);
            }
            i15++;
        }
    }

    public a(String str) throws Throwable {
        e[][] eVarArr = f23776k0;
        this.f23798f = new HashMap[eVarArr.length];
        this.f23799g = new HashSet(eVarArr.length);
        this.f23800h = ByteOrder.BIG_ENDIAN;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        G(str);
    }

    private void B(b bVar) throws Throwable {
        if (f23788w) {
            Objects.toString(bVar);
        }
        bVar.r(ByteOrder.LITTLE_ENDIAN);
        bVar.u(M.length);
        int i15 = bVar.readInt() + 8;
        byte[] bArr = N;
        bVar.u(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int i16 = bVar.readInt();
                int i17 = length + 8;
                if (Arrays.equals(O, bArr2)) {
                    byte[] bArrCopyOfRange = new byte[i16];
                    bVar.readFully(bArrCopyOfRange);
                    byte[] bArr3 = f23783r0;
                    if (c7.b.f(bArrCopyOfRange, bArr3)) {
                        bArrCopyOfRange = Arrays.copyOfRange(bArrCopyOfRange, bArr3.length, i16);
                    }
                    this.f23808p = i17;
                    X(bArrCopyOfRange, 0);
                    k0(new b(bArrCopyOfRange));
                    return;
                }
                if (i16 % 2 == 1) {
                    i16++;
                }
                length = i17 + i16;
                if (length == i15) {
                    return;
                }
                if (length > i15) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.u(i16);
            } catch (EOFException e15) {
                throw new IOException("Encountered corrupt WebP file.", e15);
            }
        }
    }

    private static int C(int i15) {
        if (i15 != 4) {
            return (i15 == 9 || i15 == 15 || i15 == 12 || i15 == 13) ? 2 : 1;
        }
        return 3;
    }

    private static Pair<Integer, Integer> D(String str) {
        if (str.contains(",")) {
            String[] strArrSplit = str.split(",", -1);
            Pair<Integer, Integer> pairD = D(strArrSplit[0]);
            if (((Integer) pairD.first).intValue() == 2) {
                return pairD;
            }
            for (int i15 = 1; i15 < strArrSplit.length; i15++) {
                Pair<Integer, Integer> pairD2 = D(strArrSplit[i15]);
                int iIntValue = (((Integer) pairD2.first).equals(pairD.first) || ((Integer) pairD2.second).equals(pairD.first)) ? ((Integer) pairD.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairD.second).intValue() == -1 || !(((Integer) pairD2.first).equals(pairD.second) || ((Integer) pairD2.second).equals(pairD.second))) ? -1 : ((Integer) pairD.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair<>(2, -1);
                }
                if (iIntValue == -1) {
                    pairD = new Pair<>(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairD = new Pair<>(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairD;
        }
        if (!str.contains("/")) {
            try {
                try {
                    long j15 = Long.parseLong(str);
                    if (j15 < 0 || j15 > 65535) {
                        return j15 < 0 ? new Pair<>(9, -1) : new Pair<>(4, -1);
                    }
                    return new Pair<>(3, 4);
                } catch (NumberFormatException unused) {
                    return new Pair<>(2, -1);
                }
            } catch (NumberFormatException unused2) {
                Double.parseDouble(str);
                return new Pair<>(12, -1);
            }
        }
        String[] strArrSplit2 = str.split("/", -1);
        if (strArrSplit2.length == 2) {
            try {
                long j16 = (long) Double.parseDouble(strArrSplit2[0]);
                long j17 = (long) Double.parseDouble(strArrSplit2[1]);
                if (j16 >= 0 && j17 >= 0) {
                    if (j16 <= 2147483647L && j17 <= 2147483647L) {
                        return new Pair<>(10, 5);
                    }
                    return new Pair<>(5, -1);
                }
                return new Pair<>(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair<>(2, -1);
    }

    private void E(b bVar, HashMap<String, d> map) throws Throwable {
        d dVar = map.get("JPEGInterchangeFormat");
        d dVar2 = map.get("JPEGInterchangeFormatLength");
        if (dVar == null || dVar2 == null) {
            return;
        }
        int iM = dVar.m(this.f23800h);
        int iM2 = dVar2.m(this.f23800h);
        if (this.f23796d == 7) {
            iM += this.f23809q;
        }
        if (iM <= 0 || iM2 <= 0) {
            return;
        }
        this.f23801i = true;
        if (this.f23793a == null && this.f23795c == null && this.f23794b == null) {
            byte[] bArr = new byte[iM2];
            bVar.u(iM);
            bVar.readFully(bArr);
            this.f23806n = bArr;
        }
        this.f23804l = iM;
        this.f23805m = iM2;
    }

    private void F(b bVar, HashMap<String, d> map) throws IOException {
        d dVar = map.get("StripOffsets");
        d dVar2 = map.get("StripByteCounts");
        if (dVar == null || dVar2 == null) {
            return;
        }
        long[] jArrC = c7.b.c(dVar.o(this.f23800h));
        long[] jArrC2 = c7.b.c(dVar2.o(this.f23800h));
        if (jArrC == null || jArrC.length == 0) {
            c2.g("ExifInterface", "stripOffsets should not be null or have zero length.");
            return;
        }
        if (jArrC2 == null || jArrC2.length == 0) {
            c2.g("ExifInterface", "stripByteCounts should not be null or have zero length.");
            return;
        }
        if (jArrC.length != jArrC2.length) {
            c2.g("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            return;
        }
        long j15 = 0;
        for (long j16 : jArrC2) {
            j15 += j16;
        }
        int i15 = (int) j15;
        byte[] bArr = new byte[i15];
        this.f23803k = true;
        this.f23802j = true;
        this.f23801i = true;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < jArrC.length; i18++) {
            int i19 = (int) jArrC[i18];
            int i25 = (int) jArrC2[i18];
            if (i18 < jArrC.length - 1 && i19 + i25 != jArrC[i18 + 1]) {
                this.f23803k = false;
            }
            int i26 = i19 - i16;
            if (i26 < 0) {
                return;
            }
            try {
                bVar.u(i26);
                int i27 = i16 + i26;
                byte[] bArr2 = new byte[i25];
                bVar.readFully(bArr2);
                i16 = i27 + i25;
                System.arraycopy(bArr2, 0, bArr, i17, i25);
                i17 += i25;
            } catch (EOFException unused) {
                return;
            }
        }
        this.f23806n = bArr;
        if (this.f23803k) {
            this.f23804l = (int) jArrC[0];
            this.f23805m = i15;
        }
    }

    private void G(String str) throws Throwable {
        Throwable th4;
        FileInputStream fileInputStreamC;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        this.f23795c = null;
        this.f23793a = str;
        try {
            fileInputStreamC = h.b.c(new FileInputStream(str), str);
            try {
                if (O(fileInputStreamC.getFD())) {
                    this.f23794b = fileInputStreamC.getFD();
                } else {
                    this.f23794b = null;
                }
                T(fileInputStreamC);
                c7.b.b(fileInputStreamC);
            } catch (Throwable th5) {
                th4 = th5;
                c7.b.b(fileInputStreamC);
                throw th4;
            }
        } catch (Throwable th6) {
            th4 = th6;
            fileInputStreamC = null;
        }
    }

    private int I(byte[] bArr) throws Throwable {
        long j15;
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                long length = bVar2.readInt();
                byte[] bArr2 = new byte[4];
                bVar2.readFully(bArr2);
                if (!Arrays.equals(bArr2, D)) {
                    bVar2.close();
                    return 0;
                }
                if (length == 1) {
                    length = bVar2.readLong();
                    j15 = 16;
                    if (length < 16) {
                        bVar2.close();
                        return 0;
                    }
                } else {
                    j15 = 8;
                }
                if (length > bArr.length) {
                    length = bArr.length;
                }
                long j16 = length - j15;
                if (j16 < 8) {
                    bVar2.close();
                    return 0;
                }
                byte[] bArr3 = new byte[4];
                boolean z15 = false;
                boolean z16 = false;
                boolean z17 = false;
                for (long j17 = 0; j17 < j16 / 4; j17++) {
                    try {
                        bVar2.readFully(bArr3);
                        if (j17 != 1) {
                            if (Arrays.equals(bArr3, E)) {
                                z15 = true;
                            } else if (Arrays.equals(bArr3, F)) {
                                z16 = true;
                            } else if (Arrays.equals(bArr3, G) || Arrays.equals(bArr3, H)) {
                                z17 = true;
                            }
                            if (!z15) {
                                continue;
                            } else {
                                if (z16) {
                                    bVar2.close();
                                    return 12;
                                }
                                if (z17) {
                                    bVar2.close();
                                    return 15;
                                }
                            }
                        }
                    } catch (EOFException unused) {
                        bVar2.close();
                        return 0;
                    }
                }
                bVar2.close();
            } catch (Exception unused2) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
            } catch (Throwable th4) {
                th = th4;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused3) {
        } catch (Throwable th5) {
            th = th5;
        }
        return 0;
    }

    private static boolean J(byte[] bArr) {
        int i15 = 0;
        while (true) {
            byte[] bArr2 = C;
            if (i15 >= bArr2.length) {
                return true;
            }
            if (bArr[i15] != bArr2[i15]) {
                return false;
            }
            i15++;
        }
    }

    private boolean K(byte[] bArr) throws Throwable {
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder byteOrderW = W(bVar2);
                this.f23800h = byteOrderW;
                bVar2.r(byteOrderW);
                short s15 = bVar2.readShort();
                boolean z15 = s15 == 20306 || s15 == 21330;
                bVar2.close();
                return z15;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th4) {
                th = th4;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th5) {
            th = th5;
        }
    }

    private boolean L(byte[] bArr) {
        int i15 = 0;
        while (true) {
            byte[] bArr2 = K;
            if (i15 >= bArr2.length) {
                return true;
            }
            if (bArr[i15] != bArr2[i15]) {
                return false;
            }
            i15++;
        }
    }

    private boolean M(byte[] bArr) {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i15 = 0; i15 < bytes.length; i15++) {
            if (bArr[i15] != bytes[i15]) {
                return false;
            }
        }
        return true;
    }

    private boolean N(byte[] bArr) throws Throwable {
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder byteOrderW = W(bVar2);
                this.f23800h = byteOrderW;
                bVar2.r(byteOrderW);
                boolean z15 = bVar2.readShort() == 85;
                bVar2.close();
                return z15;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th4) {
                th = th4;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th5) {
            th = th5;
        }
    }

    private static boolean O(FileDescriptor fileDescriptor) {
        try {
            Os.lseek(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private boolean P(HashMap<String, d> map) throws Throwable {
        d dVar;
        d dVar2 = map.get("BitsPerSample");
        if (dVar2 == null) {
            return false;
        }
        int[] iArr = (int[]) dVar2.o(this.f23800h);
        int[] iArr2 = f23792z;
        if (Arrays.equals(iArr2, iArr)) {
            return true;
        }
        if (this.f23796d != 3 || (dVar = map.get("PhotometricInterpretation")) == null) {
            return false;
        }
        int iM = dVar.m(this.f23800h);
        return (iM == 1 && Arrays.equals(iArr, B)) || (iM == 6 && Arrays.equals(iArr, iArr2));
    }

    private static boolean Q(int i15) {
        return i15 == 4 || i15 == 13 || i15 == 14;
    }

    private boolean R(HashMap<String, d> map) {
        d dVar = map.get("ImageLength");
        d dVar2 = map.get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            return false;
        }
        return dVar.m(this.f23800h) <= 512 && dVar2.m(this.f23800h) <= 512;
    }

    private boolean S(byte[] bArr) {
        int i15 = 0;
        while (true) {
            byte[] bArr2 = M;
            if (i15 >= bArr2.length) {
                int i16 = 0;
                while (true) {
                    byte[] bArr3 = N;
                    if (i16 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[M.length + i16 + 4] != bArr3[i16]) {
                        return false;
                    }
                    i16++;
                }
            } else {
                if (bArr[i15] != bArr2[i15]) {
                    return false;
                }
                i15++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00af A[Catch: all -> 0x0013, TRY_LEAVE, TryCatch #2 {all -> 0x0013, blocks: (B:3:0x0002, B:5:0x0007, B:12:0x001c, B:14:0x0020, B:15:0x002e, B:17:0x0036, B:19:0x003f, B:38:0x0071, B:25:0x0050, B:32:0x005e, B:35:0x0066, B:36:0x006a, B:37:0x006e, B:39:0x007b, B:41:0x0085, B:44:0x008d, B:47:0x0095, B:50:0x009d, B:55:0x00ab, B:57:0x00af), top: B:66:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    private void T(InputStream inputStream) throws Throwable {
        boolean z15;
        for (int i15 = 0; i15 < f23776k0.length; i15++) {
            try {
                try {
                    this.f23798f[i15] = new HashMap<>();
                } catch (Throwable th4) {
                    e();
                    if (f23788w) {
                        V();
                    }
                    throw th4;
                }
            } catch (IOException e15) {
                e = e15;
                z15 = f23788w;
                if (z15) {
                    c2.h("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                e();
                if (z15) {
                    V();
                    return;
                }
                return;
            } catch (UnsupportedOperationException e16) {
                e = e16;
                z15 = f23788w;
                if (z15) {
                    c2.h("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                e();
                if (z15) {
                    V();
                    return;
                }
                return;
            }
        }
        if (!this.f23797e) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.f23796d = r(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        if (l0(this.f23796d)) {
            g gVar = new g(inputStream);
            if (!this.f23797e) {
                int i16 = this.f23796d;
                if (i16 == 12 || i16 == 15) {
                    o(gVar, i16);
                } else if (i16 == 7) {
                    s(gVar);
                } else if (i16 == 10) {
                    x(gVar);
                } else {
                    v(gVar);
                }
            } else if (!y(gVar)) {
                e();
                if (f23788w) {
                    V();
                    return;
                }
                return;
            }
            gVar.seek(this.f23808p);
            k0(gVar);
        } else {
            b bVar = new b(inputStream);
            int i17 = this.f23796d;
            if (i17 == 4) {
                p(bVar, 0, 0);
            } else if (i17 == 13) {
                t(bVar);
            } else if (i17 == 9) {
                u(bVar);
            } else if (i17 == 14) {
                B(bVar);
            }
        }
        e();
        if (f23788w) {
            V();
        }
    }

    private void U(b bVar) throws IOException {
        ByteOrder byteOrderW = W(bVar);
        this.f23800h = byteOrderW;
        bVar.r(byteOrderW);
        int unsignedShort = bVar.readUnsignedShort();
        int i15 = this.f23796d;
        if (i15 != 7 && i15 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i16 = bVar.readInt();
        if (i16 < 8) {
            throw new IOException("Invalid first Ifd offset: " + i16);
        }
        int i17 = i16 - 8;
        if (i17 > 0) {
            bVar.u(i17);
        }
    }

    private void V() throws Throwable {
        for (int i15 = 0; i15 < this.f23798f.length; i15++) {
            this.f23798f[i15].size();
            for (Map.Entry<String, d> entry : this.f23798f[i15].entrySet()) {
                d value = entry.getValue();
                entry.getKey();
                value.toString();
                value.n(this.f23800h);
            }
        }
    }

    private ByteOrder W(b bVar) throws IOException {
        short s15 = bVar.readShort();
        if (s15 == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s15 == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s15));
    }

    private void X(byte[] bArr, int i15) throws IOException {
        g gVar = new g(bArr);
        U(gVar);
        Y(gVar, i15);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:71:0x015f  */
    /* JADX WARN: Code duplicated, block: B:81:0x019a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x019c  */
    /* JADX WARN: Code duplicated, block: B:84:0x01af  */
    private void Y(g gVar, int i15) throws IOException {
        int i16;
        long j15;
        boolean z15;
        int unsignedShort;
        long jP;
        this.f23799g.add(Integer.valueOf(gVar.h()));
        short s15 = gVar.readShort();
        if (s15 <= 0) {
            return;
        }
        short s16 = 0;
        while (s16 < s15) {
            int unsignedShort2 = gVar.readUnsignedShort();
            int unsignedShort3 = gVar.readUnsignedShort();
            int i17 = gVar.readInt();
            long jH = ((long) gVar.h()) + 4;
            e eVar = f23778m0[i15].get(Integer.valueOf(unsignedShort2));
            boolean z16 = f23788w;
            if (z16) {
                i16 = 4;
                String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i15), Integer.valueOf(unsignedShort2), eVar != null ? eVar.f23830b : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i17));
            } else {
                i16 = 4;
            }
            if (eVar != null && unsignedShort3 > 0) {
                int[] iArr = Y;
                if (unsignedShort3 >= iArr.length) {
                    j15 = 0;
                } else if (eVar.a(unsignedShort3)) {
                    if (unsignedShort3 == 7) {
                        unsignedShort3 = eVar.f23831c;
                    }
                    j15 = ((long) i17) * ((long) iArr[unsignedShort3]);
                    z15 = j15 >= 0 && j15 <= 2147483647L;
                } else {
                    if (z16) {
                        String str = X[unsignedShort3];
                    }
                    j15 = 0;
                }
            } else {
                j15 = 0;
            }
            if (z15) {
                if (j15 > 4) {
                    int i18 = gVar.readInt();
                    if (this.f23796d == 7) {
                        if ("MakerNote".equals(eVar.f23830b)) {
                            this.f23809q = i18;
                        } else if (i15 == 6 && "ThumbnailImage".equals(eVar.f23830b)) {
                            this.f23810r = i18;
                            this.f23811s = i17;
                            d dVarJ = d.j(6, this.f23800h);
                            d dVarF = d.f(this.f23810r, this.f23800h);
                            d dVarF2 = d.f(this.f23811s, this.f23800h);
                            this.f23798f[i16].put("Compression", dVarJ);
                            this.f23798f[i16].put("JPEGInterchangeFormat", dVarF);
                            this.f23798f[i16].put("JPEGInterchangeFormatLength", dVarF2);
                        }
                    }
                    gVar.seek(i18);
                } else {
                    z16 = z16;
                    unsignedShort2 = unsignedShort2;
                }
                Integer num = f23781p0.get(Integer.valueOf(unsignedShort2));
                if (num != null) {
                    if (unsignedShort3 != 3) {
                        if (unsignedShort3 == i16) {
                            jP = gVar.p();
                        } else if (unsignedShort3 == 8) {
                            unsignedShort = gVar.readShort();
                        } else if (unsignedShort3 == 9 || unsignedShort3 == 13) {
                            unsignedShort = gVar.readInt();
                        } else {
                            jP = -1;
                        }
                        if (z16) {
                            String.format("Offset: %d, tagName: %s", Long.valueOf(jP), eVar.f23830b);
                        }
                        if (jP > 0 || (gVar.b() != -1 && jP >= gVar.b())) {
                            if (z16) {
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append("Skip jump into the IFD since its offset is invalid: ");
                                sb5.append(jP);
                                if (gVar.b() != -1) {
                                    gVar.b();
                                }
                            }
                        } else if (!this.f23799g.contains(Integer.valueOf((int) jP))) {
                            gVar.seek(jP);
                            Y(gVar, num.intValue());
                        }
                        gVar.seek(jH);
                    } else {
                        unsignedShort = gVar.readUnsignedShort();
                    }
                    jP = unsignedShort;
                    if (z16) {
                        String.format("Offset: %d, tagName: %s", Long.valueOf(jP), eVar.f23830b);
                    }
                    if (jP > 0) {
                        if (z16) {
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append("Skip jump into the IFD since its offset is invalid: ");
                            sb6.append(jP);
                            if (gVar.b() != -1) {
                                gVar.b();
                            }
                        }
                    } else if (z16) {
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append("Skip jump into the IFD since its offset is invalid: ");
                        sb7.append(jP);
                        if (gVar.b() != -1) {
                            gVar.b();
                        }
                    }
                    gVar.seek(jH);
                } else {
                    int iH = gVar.h() + this.f23808p;
                    byte[] bArr = new byte[(int) j15];
                    gVar.readFully(bArr);
                    d dVar = new d(unsignedShort3, i17, iH, bArr);
                    this.f23798f[i15].put(eVar.f23830b, dVar);
                    if ("DNGVersion".equals(eVar.f23830b)) {
                        this.f23796d = 3;
                    }
                    if ((("Make".equals(eVar.f23830b) || "Model".equals(eVar.f23830b)) && dVar.n(this.f23800h).contains("PENTAX")) || ("Compression".equals(eVar.f23830b) && dVar.m(this.f23800h) == 65535)) {
                        this.f23796d = 8;
                    }
                    if (gVar.h() != jH) {
                        gVar.seek(jH);
                    }
                }
            } else {
                gVar.seek(jH);
                s16 = s16;
            }
            s16 = (short) (s16 + 1);
            s15 = s15;
        }
        int i19 = gVar.readInt();
        if (f23788w) {
            String.format("nextIfdOffset: %d", Integer.valueOf(i19));
        }
        long j16 = i19;
        if (j16 <= 0 || this.f23799g.contains(Integer.valueOf(i19))) {
            return;
        }
        gVar.seek(j16);
        if (this.f23798f[4].isEmpty()) {
            Y(gVar, 4);
        } else if (this.f23798f[5].isEmpty()) {
            Y(gVar, 5);
        }
    }

    private void Z(String str) {
        for (int i15 = 0; i15 < f23776k0.length; i15++) {
            this.f23798f[i15].remove(str);
        }
    }

    private void a0(int i15, String str, String str2) {
        if (this.f23798f[i15].isEmpty() || this.f23798f[i15].get(str) == null) {
            return;
        }
        HashMap<String, d> map = this.f23798f[i15];
        map.put(str2, map.get(str));
        this.f23798f[i15].remove(str);
    }

    private void b0(g gVar, int i15) throws Throwable {
        d dVar = this.f23798f[i15].get("ImageLength");
        d dVar2 = this.f23798f[i15].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            d dVar3 = this.f23798f[i15].get("JPEGInterchangeFormat");
            d dVar4 = this.f23798f[i15].get("JPEGInterchangeFormatLength");
            if (dVar3 == null || dVar4 == null) {
                return;
            }
            int iM = dVar3.m(this.f23800h);
            int iM2 = dVar3.m(this.f23800h);
            gVar.seek(iM);
            byte[] bArr = new byte[iM2];
            gVar.readFully(bArr);
            p(new b(bArr), iM, i15);
        }
    }

    private void d0(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte b15;
        byte[] bArr;
        if (f23788w) {
            Objects.toString(inputStream);
            Objects.toString(outputStream);
        }
        b bVar = new b(inputStream);
        c cVar = new c(outputStream, ByteOrder.BIG_ENDIAN);
        if (bVar.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        cVar.h(-1);
        if (bVar.readByte() != -40) {
            throw new IOException("Invalid marker");
        }
        cVar.h(-40);
        cVar.h(-1);
        cVar.h(-31);
        this.f23808p = q0(cVar);
        if (this.f23813u != null) {
            cVar.write(-1);
            cVar.h(-31);
            byte[] bArr2 = f23784s0;
            cVar.u(bArr2.length + 2 + this.f23813u.f23828d.length);
            cVar.write(bArr2);
            cVar.write(this.f23813u.f23828d);
            this.f23814v = true;
        }
        byte[] bArr3 = new byte[PKIFailureInfo.certConfirmed];
        while (bVar.readByte() == -1) {
            do {
                b15 = bVar.readByte();
            } while (b15 == -1);
            if (b15 == -39 || b15 == -38) {
                cVar.h(-1);
                cVar.h(b15);
                c7.b.d(bVar, cVar);
                return;
            }
            if (b15 != -31) {
                cVar.h(-1);
                cVar.h(b15);
                int unsignedShort = bVar.readUnsignedShort();
                cVar.u(unsignedShort);
                int i15 = unsignedShort - 2;
                if (i15 < 0) {
                    throw new IOException("Invalid length");
                }
                while (i15 > 0) {
                    int i16 = bVar.read(bArr3, 0, Math.min(i15, PKIFailureInfo.certConfirmed));
                    if (i16 < 0) {
                        break;
                    }
                    cVar.write(bArr3, 0, i16);
                    i15 -= i16;
                }
            } else {
                int unsignedShort2 = bVar.readUnsignedShort();
                int length = unsignedShort2 - 2;
                if (length < 0) {
                    throw new IOException("Invalid length");
                }
                byte[] bArr4 = f23784s0;
                if (length >= bArr4.length) {
                    bArr = new byte[bArr4.length];
                } else {
                    byte[] bArr5 = f23783r0;
                    bArr = length >= bArr5.length ? new byte[bArr5.length] : null;
                }
                if (bArr != null) {
                    bVar.readFully(bArr);
                    if (c7.b.f(bArr, f23783r0) || c7.b.f(bArr, bArr4)) {
                        bVar.u(length - bArr.length);
                    }
                }
                cVar.h(-1);
                cVar.h(b15);
                cVar.u(unsignedShort2);
                if (bArr != null) {
                    length -= bArr.length;
                    cVar.write(bArr);
                }
                while (length > 0) {
                    int i17 = bVar.read(bArr3, 0, Math.min(length, PKIFailureInfo.certConfirmed));
                    if (i17 < 0) {
                        break;
                    }
                    cVar.write(bArr3, 0, i17);
                    length -= i17;
                }
            }
        }
        throw new IOException("Invalid marker");
    }

    private void e() {
        String strK = k("DateTimeOriginal");
        if (strK != null && k("DateTime") == null) {
            this.f23798f[0].put("DateTime", d.e(strK));
        }
        if (k("ImageWidth") == null) {
            this.f23798f[0].put("ImageWidth", d.f(0L, this.f23800h));
        }
        if (k("ImageLength") == null) {
            this.f23798f[0].put("ImageLength", d.f(0L, this.f23800h));
        }
        if (k("Orientation") == null) {
            this.f23798f[0].put("Orientation", d.f(0L, this.f23800h));
        }
        if (k("LightSource") == null) {
            this.f23798f[1].put("LightSource", d.f(0L, this.f23800h));
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:19:0x004c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0062 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:32:0x0073  */
    /* JADX WARN: Code duplicated, block: B:38:0x008c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0093  */
    /* JADX WARN: Code duplicated, block: B:42:0x005d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0054 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x003d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x006e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0027 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x005b -> B:10:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private void e0(java.io.InputStream r9, java.io.OutputStream r10) {
        /*
            r8 = this;
            boolean r0 = c7.a.f23788w
            if (r0 == 0) goto La
            java.util.Objects.toString(r9)
            java.util.Objects.toString(r10)
        La:
            c7.a$b r0 = new c7.a$b
            r0.<init>(r9)
            c7.a$c r9 = new c7.a$c
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r9.<init>(r10, r1)
            byte[] r10 = c7.a.K
            int r10 = r10.length
            c7.b.e(r0, r9, r10)
            c7.a$d r10 = r8.f23813u
            r1 = 1
            r2 = 0
            if (r10 != 0) goto L26
            boolean r10 = r8.f23814v
            if (r10 == 0) goto L5b
        L26:
            r10 = r1
        L27:
            if (r1 != 0) goto L30
            if (r10 == 0) goto L2c
            goto L30
        L2c:
            c7.b.d(r0, r9)
            return
        L30:
            int r3 = r0.readInt()
            int r4 = r0.readInt()
            r5 = 1229472850(0x49484452, float:820293.1)
            if (r4 != r5) goto L5d
            r9.m(r3)
            r9.m(r4)
            int r3 = r3 + 4
            c7.b.e(r0, r9, r3)
            int r3 = r8.f23808p
            if (r3 != 0) goto L50
            r8.r0(r9)
            r1 = r2
        L50:
            c7.a$d r3 = r8.f23813u
            if (r3 == 0) goto L27
            boolean r3 = r8.f23814v
            if (r3 != 0) goto L27
            r8.s0(r9)
        L5b:
            r10 = r2
            goto L27
        L5d:
            r5 = 1700284774(0x65584966, float:6.383657E22)
            if (r4 != r5) goto L6e
            if (r1 == 0) goto L6e
            r8.r0(r9)
            int r3 = r3 + 4
            r0.u(r3)
            r1 = r2
            goto L27
        L6e:
            r5 = 1767135348(0x69545874, float:1.6044374E25)
            if (r4 != r5) goto La0
            byte[] r5 = c7.a.L
            int r6 = r5.length
            if (r3 < r6) goto La0
            int r6 = r5.length
            byte[] r7 = new byte[r6]
            r0.readFully(r7)
            int r6 = r3 - r6
            int r6 = r6 + 4
            boolean r5 = java.util.Arrays.equals(r7, r5)
            if (r5 == 0) goto L93
            c7.a$d r10 = r8.f23813u
            if (r10 == 0) goto L8f
            r8.s0(r9)
        L8f:
            r0.u(r6)
            goto L5b
        L93:
            r9.m(r3)
            r9.m(r4)
            r9.write(r7)
            c7.b.e(r0, r9, r6)
            goto L27
        La0:
            r9.m(r3)
            r9.m(r4)
            int r3 = r3 + 4
            c7.b.e(r0, r9, r3)
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: c7.a.e0(java.io.InputStream, java.io.OutputStream):void");
    }

    private String f(double d15) {
        long j15 = (long) d15;
        double d16 = d15 - j15;
        long j16 = (long) (d16 * 60.0d);
        return j15 + "/1," + j16 + "/1," + Math.round((d16 - (j16 / 60.0d)) * 3600.0d * 1.0E7d) + "/10000000";
    }

    /* JADX WARN: Code duplicated, block: B:82:0x01f6 A[Catch: all -> 0x0061, Exception -> 0x0065, TryCatch #5 {Exception -> 0x0065, all -> 0x0061, blocks: (B:7:0x0032, B:9:0x003e, B:11:0x0052, B:12:0x0054, B:80:0x01da, B:82:0x01f6, B:83:0x01ff, B:19:0x0069, B:21:0x0078, B:23:0x0080, B:25:0x0084, B:28:0x0094, B:30:0x009f, B:31:0x00a4, B:32:0x00a6, B:36:0x00b4, B:37:0x00b9, B:38:0x00bd, B:39:0x00c9, B:41:0x00d1, B:45:0x00df, B:47:0x00e7, B:50:0x00ee, B:52:0x00fd, B:54:0x010d, B:69:0x0169, B:71:0x0175, B:72:0x017c, B:74:0x01b6, B:79:0x01d3, B:76:0x01c4, B:78:0x01cc, B:55:0x0121, B:56:0x0128, B:57:0x0129, B:59:0x0133, B:61:0x0139, B:65:0x0152, B:66:0x015a, B:67:0x0161), top: B:98:0x0032 }] */
    private void f0(InputStream inputStream, OutputStream outputStream) throws Throwable {
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int iQ0;
        boolean z15;
        if (f23788w) {
            Objects.toString(inputStream);
            Objects.toString(outputStream);
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        b bVar = new b(inputStream, byteOrder);
        c cVar = new c(outputStream, byteOrder);
        byte[] bArr = M;
        c7.b.e(bVar, cVar, bArr.length);
        int i25 = bVar.readInt();
        byte[] bArr2 = N;
        bVar.u(bArr2.length);
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    c cVar2 = new c(byteArrayOutputStream2, byteOrder);
                    int i26 = this.f23808p;
                    if (i26 == 0) {
                        byte[] bArr3 = new byte[4];
                        bVar.readFully(bArr3);
                        byte[] bArr4 = Q;
                        boolean z16 = true;
                        if (Arrays.equals(bArr3, bArr4)) {
                            int i27 = bVar.readInt();
                            byte[] bArr5 = new byte[i27 % 2 == 1 ? i27 + 1 : i27];
                            bVar.readFully(bArr5);
                            byte b15 = (byte) (bArr5[0] | 8);
                            bArr5[0] = b15;
                            boolean z17 = ((b15 >> 1) & 1) == 1;
                            cVar2.write(bArr4);
                            cVar2.m(i27);
                            cVar2.write(bArr5);
                            if (z17) {
                                h(bVar, cVar2, T, null);
                                while (true) {
                                    byte[] bArr6 = new byte[4];
                                    try {
                                        bVar.readFully(bArr6);
                                        z15 = !Arrays.equals(bArr6, U);
                                    } catch (EOFException unused) {
                                        z15 = true;
                                    }
                                    if (z15) {
                                        break;
                                    } else {
                                        i(bVar, cVar2, bArr6);
                                    }
                                }
                                iQ0 = q0(cVar2);
                            } else {
                                h(bVar, cVar2, S, R);
                                iQ0 = q0(cVar2);
                            }
                        } else {
                            byte[] bArr7 = S;
                            if (Arrays.equals(bArr3, bArr7) || Arrays.equals(bArr3, R)) {
                                int i28 = bVar.readInt();
                                int i29 = i28 % 2 == 1 ? i28 + 1 : i28;
                                byte[] bArr8 = new byte[3];
                                if (Arrays.equals(bArr3, bArr7)) {
                                    bVar.readFully(bArr8);
                                    byte[] bArr9 = new byte[3];
                                    bVar.readFully(bArr9);
                                    if (!Arrays.equals(P, bArr9)) {
                                        throw new IOException("Error checking VP8 signature");
                                    }
                                    i18 = bVar.readInt();
                                    i15 = -1;
                                    i17 = (i18 >> 16) & 16383;
                                    i16 = i29 - 10;
                                    i19 = i18 & 16383;
                                    z16 = false;
                                } else {
                                    i15 = -1;
                                    if (!Arrays.equals(bArr3, R)) {
                                        i16 = i29;
                                        i17 = 0;
                                        i18 = 0;
                                        z16 = false;
                                        i19 = 0;
                                    } else {
                                        if (bVar.readByte() != 47) {
                                            throw new IOException("Error checking VP8L signature");
                                        }
                                        i18 = bVar.readInt();
                                        int i35 = (i18 & 16383) + 1;
                                        int i36 = ((i18 & 268419072) >>> 14) + 1;
                                        if ((i18 & 268435456) == 0) {
                                            z16 = false;
                                        }
                                        i16 = i29 - 5;
                                        i19 = i35;
                                        i17 = i36;
                                    }
                                }
                                cVar2.write(bArr4);
                                cVar2.m(10);
                                byte[] bArr10 = new byte[10];
                                if (z16) {
                                    bArr10[0] = (byte) (bArr10[0] | 16);
                                }
                                bArr10[0] = (byte) (bArr10[0] | 8);
                                int i37 = i19 - 1;
                                int i38 = i17 - 1;
                                bArr10[4] = (byte) i37;
                                bArr10[5] = (byte) (i37 >> 8);
                                bArr10[6] = (byte) (i37 >> 16);
                                bArr10[7] = (byte) i38;
                                bArr10[8] = (byte) (i38 >> 8);
                                bArr10[9] = (byte) (i38 >> 16);
                                cVar2.write(bArr10);
                                cVar2.write(bArr3);
                                cVar2.m(i28);
                                if (Arrays.equals(bArr3, bArr7)) {
                                    cVar2.write(bArr8);
                                    cVar2.write(P);
                                    cVar2.m(i18);
                                } else if (Arrays.equals(bArr3, R)) {
                                    cVar2.write(47);
                                    cVar2.m(i18);
                                }
                                c7.b.e(bVar, cVar2, i16);
                                iQ0 = q0(cVar2);
                            } else {
                                iQ0 = -1;
                                i15 = -1;
                            }
                        }
                        c7.b.e(bVar, cVar2, (i25 + 8) - bVar.h());
                        int size = byteArrayOutputStream2.size();
                        byte[] bArr11 = N;
                        cVar.m(size + bArr11.length);
                        cVar.write(bArr11);
                        if (iQ0 != i15) {
                            this.f23808p = cVar.f23823a.size() + iQ0;
                        }
                        byteArrayOutputStream2.writeTo(cVar);
                        c7.b.d(bVar, cVar);
                        c7.b.b(byteArrayOutputStream2);
                    }
                    c7.b.e(bVar, cVar2, (i26 - ((bArr.length + 4) + bArr2.length)) - 8);
                    bVar.u(4);
                    int i39 = bVar.readInt();
                    if (i39 % 2 != 0) {
                        i39++;
                    }
                    bVar.u(i39);
                    iQ0 = q0(cVar2);
                    i15 = -1;
                    c7.b.e(bVar, cVar2, (i25 + 8) - bVar.h());
                    int size2 = byteArrayOutputStream2.size();
                    byte[] bArr12 = N;
                    cVar.m(size2 + bArr12.length);
                    cVar.write(bArr12);
                    if (iQ0 != i15) {
                        this.f23808p = cVar.f23823a.size() + iQ0;
                    }
                    byteArrayOutputStream2.writeTo(cVar);
                    c7.b.d(bVar, cVar);
                    c7.b.b(byteArrayOutputStream2);
                } catch (Exception e15) {
                    e = e15;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    throw new IOException("Failed to save WebP file", e);
                } catch (Throwable th4) {
                    th = th4;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    c7.b.b(byteArrayOutputStream);
                    throw th;
                }
            } catch (Exception e16) {
                e = e16;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    private static double g(String str, String str2) {
        try {
            String[] strArrSplit = str.split(",", -1);
            String[] strArrSplit2 = strArrSplit[0].split("/", -1);
            double d15 = Double.parseDouble(strArrSplit2[0].trim()) / Double.parseDouble(strArrSplit2[1].trim());
            String[] strArrSplit3 = strArrSplit[1].split("/", -1);
            double d16 = Double.parseDouble(strArrSplit3[0].trim()) / Double.parseDouble(strArrSplit3[1].trim());
            String[] strArrSplit4 = strArrSplit[2].split("/", -1);
            double d17 = d15 + (d16 / 60.0d) + ((Double.parseDouble(strArrSplit4[0].trim()) / Double.parseDouble(strArrSplit4[1].trim())) / 3600.0d);
            if (!str2.equals(ip.a.f96137b) && !str2.equals("W")) {
                if (!str2.equals("N") && !str2.equals("E")) {
                    throw new IllegalArgumentException();
                }
                return d17;
            }
            return -d17;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e15) {
            throw new IllegalArgumentException(e15);
        }
    }

    private void h(b bVar, c cVar, byte[] bArr, byte[] bArr2) throws IOException {
        while (true) {
            byte[] bArr3 = new byte[4];
            bVar.readFully(bArr3);
            i(bVar, cVar, bArr3);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    private void i(b bVar, c cVar, byte[] bArr) throws IOException {
        int i15 = bVar.readInt();
        cVar.write(bArr);
        cVar.m(i15);
        if (i15 % 2 == 1) {
            i15++;
        }
        c7.b.e(bVar, cVar, i15);
    }

    private void k0(b bVar) throws Throwable {
        HashMap<String, d> map = this.f23798f[4];
        d dVar = map.get("Compression");
        if (dVar == null) {
            this.f23807o = 6;
            E(bVar, map);
            return;
        }
        int iM = dVar.m(this.f23800h);
        this.f23807o = iM;
        if (iM != 1) {
            if (iM == 6) {
                E(bVar, map);
                return;
            } else if (iM != 7) {
                return;
            }
        }
        if (P(map)) {
            F(bVar, map);
        }
    }

    private static boolean l0(int i15) {
        return (i15 == 4 || i15 == 9 || i15 == 13 || i15 == 14) ? false : true;
    }

    private void m0(int i15, int i16) throws Throwable {
        if (this.f23798f[i15].isEmpty() || this.f23798f[i16].isEmpty()) {
            return;
        }
        d dVar = this.f23798f[i15].get("ImageLength");
        d dVar2 = this.f23798f[i15].get("ImageWidth");
        d dVar3 = this.f23798f[i16].get("ImageLength");
        d dVar4 = this.f23798f[i16].get("ImageWidth");
        if (dVar == null || dVar2 == null || dVar3 == null || dVar4 == null) {
            return;
        }
        int iM = dVar.m(this.f23800h);
        int iM2 = dVar2.m(this.f23800h);
        int iM3 = dVar3.m(this.f23800h);
        int iM4 = dVar4.m(this.f23800h);
        if (iM >= iM3 || iM2 >= iM4) {
            return;
        }
        HashMap<String, d>[] mapArr = this.f23798f;
        HashMap<String, d> map = mapArr[i15];
        mapArr[i15] = mapArr[i16];
        mapArr[i16] = map;
    }

    private d n(String str) {
        d dVar;
        d dVar2;
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        if ("Xmp".equals(str) && C(this.f23796d) == 2 && (dVar2 = this.f23813u) != null) {
            return dVar2;
        }
        for (int i15 = 0; i15 < f23776k0.length; i15++) {
            d dVar3 = this.f23798f[i15].get(str);
            if (dVar3 != null) {
                return dVar3;
            }
        }
        if (!"Xmp".equals(str) || (dVar = this.f23813u) == null) {
            return null;
        }
        return dVar;
    }

    private static void n0(CRC32 crc32, int i15) {
        crc32.update(i15 >>> 24);
        crc32.update(i15 >>> 16);
        crc32.update(i15 >>> 8);
        crc32.update(i15);
    }

    private void o(g gVar, int i15) {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i16;
        int i17 = Build.VERSION.SDK_INT;
        if (i17 < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIC files is supported from SDK 28 and above");
        }
        if (i15 == 15 && i17 < 31) {
            throw new UnsupportedOperationException("Reading EXIF from AVIF files is supported from SDK 31 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                c7.b.a.a(mediaMetadataRetriever, new C0633a(gVar));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                if (strExtractMetadata != null) {
                    this.f23798f[0].put("ImageWidth", d.j(Integer.parseInt(strExtractMetadata), this.f23800h));
                }
                if (strExtractMetadata3 != null) {
                    this.f23798f[0].put("ImageLength", d.j(Integer.parseInt(strExtractMetadata3), this.f23800h));
                }
                if (strExtractMetadata2 != null) {
                    int i18 = Integer.parseInt(strExtractMetadata2);
                    if (i18 == 90) {
                        i16 = 6;
                    } else if (i18 != 180) {
                        i16 = i18 != 270 ? 1 : 8;
                    } else {
                        i16 = 3;
                    }
                    this.f23798f[0].put("Orientation", d.j(i16, this.f23800h));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i19 = Integer.parseInt(strExtractMetadata4);
                    int i25 = Integer.parseInt(strExtractMetadata5);
                    if (i25 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    gVar.seek(i19);
                    byte[] bArr = new byte[6];
                    gVar.readFully(bArr);
                    int i26 = i19 + 6;
                    int i27 = i25 - 6;
                    if (!Arrays.equals(bArr, f23783r0)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i27];
                    gVar.readFully(bArr2);
                    this.f23808p = i26;
                    X(bArr2, 0);
                }
                String strExtractMetadata8 = mediaMetadataRetriever.extractMetadata(41);
                String strExtractMetadata9 = mediaMetadataRetriever.extractMetadata(42);
                if (strExtractMetadata8 != null && strExtractMetadata9 != null) {
                    int i28 = Integer.parseInt(strExtractMetadata8);
                    int i29 = Integer.parseInt(strExtractMetadata9);
                    long j15 = i28;
                    gVar.seek(j15);
                    byte[] bArr3 = new byte[i29];
                    gVar.readFully(bArr3);
                    this.f23813u = new d(1, i29, j15, bArr3);
                    this.f23814v = true;
                }
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused) {
                }
            } catch (RuntimeException e15) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e15);
            }
        } catch (Throwable th4) {
            try {
                mediaMetadataRetriever.release();
                throw th4;
            } catch (IOException unused2) {
                throw th4;
            }
        }
    }

    private void o0(g gVar, int i15) throws Throwable {
        d dVarJ;
        d dVarJ2;
        d dVar = this.f23798f[i15].get("DefaultCropSize");
        d dVar2 = this.f23798f[i15].get("SensorTopBorder");
        d dVar3 = this.f23798f[i15].get("SensorLeftBorder");
        d dVar4 = this.f23798f[i15].get("SensorBottomBorder");
        d dVar5 = this.f23798f[i15].get("SensorRightBorder");
        if (dVar == null) {
            if (dVar2 == null || dVar3 == null || dVar4 == null || dVar5 == null) {
                b0(gVar, i15);
                return;
            }
            int iM = dVar2.m(this.f23800h);
            int iM2 = dVar4.m(this.f23800h);
            int iM3 = dVar5.m(this.f23800h);
            int iM4 = dVar3.m(this.f23800h);
            if (iM2 <= iM || iM3 <= iM4) {
                return;
            }
            d dVarJ3 = d.j(iM2 - iM, this.f23800h);
            d dVarJ4 = d.j(iM3 - iM4, this.f23800h);
            this.f23798f[i15].put("ImageLength", dVarJ3);
            this.f23798f[i15].put("ImageWidth", dVarJ4);
            return;
        }
        if (dVar.f23825a == 5) {
            f[] fVarArr = (f[]) dVar.o(this.f23800h);
            if (fVarArr == null || fVarArr.length != 2) {
                c2.g("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(fVarArr));
                return;
            }
            dVarJ = d.h(fVarArr[0], this.f23800h);
            dVarJ2 = d.h(fVarArr[1], this.f23800h);
        } else {
            int[] iArr = (int[]) dVar.o(this.f23800h);
            if (iArr == null || iArr.length != 2) {
                c2.g("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                return;
            }
            dVarJ = d.j(iArr[0], this.f23800h);
            dVarJ2 = d.j(iArr[1], this.f23800h);
        }
        this.f23798f[i15].put("ImageWidth", dVarJ);
        this.f23798f[i15].put("ImageLength", dVarJ2);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x006f A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:38:0x0079  */
    /* JADX WARN: Code duplicated, block: B:39:0x007c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0092  */
    /* JADX WARN: Code duplicated, block: B:43:0x0095  */
    /* JADX WARN: Code duplicated, block: B:57:0x0111 A[LOOP:0: B:10:0x0024->B:57:0x0111, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x0061. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0064. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:33:0x0067. Please report as an issue. */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1095)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    private void p(c7.a.b r19, int r20, int r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c7.a.p(c7.a$b, int, int):void");
    }

    private void p0() throws Throwable {
        m0(0, 5);
        m0(0, 4);
        m0(5, 4);
        d dVar = this.f23798f[1].get("PixelXDimension");
        d dVar2 = this.f23798f[1].get("PixelYDimension");
        if (dVar != null && dVar2 != null) {
            this.f23798f[0].put("ImageWidth", dVar);
            this.f23798f[0].put("ImageLength", dVar2);
        }
        if (this.f23798f[4].isEmpty() && R(this.f23798f[5])) {
            HashMap<String, d>[] mapArr = this.f23798f;
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap<>();
        }
        R(this.f23798f[4]);
        a0(0, "ThumbnailOrientation", "Orientation");
        a0(0, "ThumbnailImageLength", "ImageLength");
        a0(0, "ThumbnailImageWidth", "ImageWidth");
        a0(5, "ThumbnailOrientation", "Orientation");
        a0(5, "ThumbnailImageLength", "ImageLength");
        a0(5, "ThumbnailImageWidth", "ImageWidth");
        a0(4, "Orientation", "ThumbnailOrientation");
        a0(4, "ImageLength", "ThumbnailImageLength");
        a0(4, "ImageWidth", "ThumbnailImageWidth");
    }

    private int q0(c cVar) throws IOException {
        long j15;
        e[][] eVarArr = f23776k0;
        int[] iArr = new int[eVarArr.length];
        int[] iArr2 = new int[eVarArr.length];
        for (e eVar : f23777l0) {
            Z(eVar.f23830b);
        }
        if (this.f23801i) {
            if (this.f23802j) {
                Z("StripOffsets");
                Z("StripByteCounts");
            } else {
                Z("JPEGInterchangeFormat");
                Z("JPEGInterchangeFormatLength");
            }
        }
        for (int i15 = 0; i15 < f23776k0.length; i15++) {
            Iterator<Map.Entry<String, d>> it = this.f23798f[i15].entrySet().iterator();
            while (it.hasNext()) {
                if (it.next().getValue() == null) {
                    it.remove();
                }
            }
        }
        long j16 = 0;
        if (!this.f23798f[1].isEmpty()) {
            this.f23798f[0].put(f23777l0[1].f23830b, d.f(0L, this.f23800h));
        }
        if (!this.f23798f[2].isEmpty()) {
            this.f23798f[0].put(f23777l0[2].f23830b, d.f(0L, this.f23800h));
        }
        if (!this.f23798f[3].isEmpty()) {
            this.f23798f[1].put(f23777l0[3].f23830b, d.f(0L, this.f23800h));
        }
        if (this.f23801i) {
            if (this.f23802j) {
                this.f23798f[4].put("StripOffsets", d.j(0, this.f23800h));
                this.f23798f[4].put("StripByteCounts", d.j(this.f23805m, this.f23800h));
            } else {
                this.f23798f[4].put("JPEGInterchangeFormat", d.f(0L, this.f23800h));
                this.f23798f[4].put("JPEGInterchangeFormatLength", d.f(this.f23805m, this.f23800h));
            }
        }
        for (int i16 = 0; i16 < f23776k0.length; i16++) {
            Iterator<Map.Entry<String, d>> it4 = this.f23798f[i16].entrySet().iterator();
            int i17 = 0;
            while (it4.hasNext()) {
                int iP = it4.next().getValue().p();
                if (iP > 4) {
                    i17 += iP;
                }
            }
            iArr2[i16] = iArr2[i16] + i17;
        }
        int size = 8;
        for (int i18 = 0; i18 < f23776k0.length; i18++) {
            if (!this.f23798f[i18].isEmpty()) {
                iArr[i18] = size;
                size += (this.f23798f[i18].size() * 12) + 6 + iArr2[i18];
            }
        }
        if (this.f23801i) {
            if (this.f23802j) {
                this.f23798f[4].put("StripOffsets", d.j(size, this.f23800h));
            } else {
                this.f23798f[4].put("JPEGInterchangeFormat", d.f(size, this.f23800h));
            }
            this.f23804l = size;
            size += this.f23805m;
        }
        if (this.f23796d == 4) {
            size += 8;
        }
        if (f23788w) {
            for (int i19 = 0; i19 < f23776k0.length; i19++) {
                String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i19), Integer.valueOf(iArr[i19]), Integer.valueOf(this.f23798f[i19].size()), Integer.valueOf(iArr2[i19]), Integer.valueOf(size));
            }
        }
        if (!this.f23798f[1].isEmpty()) {
            this.f23798f[0].put(f23777l0[1].f23830b, d.f(iArr[1], this.f23800h));
        }
        if (!this.f23798f[r13].isEmpty()) {
            this.f23798f[0].put(f23777l0[r13].f23830b, d.f(iArr[2], this.f23800h));
        }
        if (!this.f23798f[r14].isEmpty()) {
            this.f23798f[1].put(f23777l0[r14].f23830b, d.f(iArr[3], this.f23800h));
        }
        int i25 = this.f23796d;
        if (i25 == 4) {
            if (size > 65535) {
                throw new IllegalStateException("Size of exif data (" + size + " bytes) exceeds the max size of a JPEG APP1 segment (65536 bytes)");
            }
            cVar.u(size);
            cVar.write(f23783r0);
        } else if (i25 == 13) {
            cVar.m(size);
            cVar.m(1700284774);
        } else if (i25 == 14) {
            cVar.write(O);
            cVar.m(size);
        }
        int size2 = cVar.f23823a.size();
        cVar.p(this.f23800h == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        cVar.b(this.f23800h);
        cVar.u(42);
        cVar.r(8L);
        int i26 = 0;
        while (i26 < f23776k0.length) {
            if (this.f23798f[i26].isEmpty()) {
                j15 = j16;
            } else {
                cVar.u(this.f23798f[i26].size());
                int size3 = iArr[i26] + 2 + (this.f23798f[i26].size() * 12) + 4;
                for (Map.Entry<String, d> entry : this.f23798f[i26].entrySet()) {
                    int i27 = f23779n0[i26].get(entry.getKey()).f23829a;
                    d value = entry.getValue();
                    int iP2 = value.p();
                    cVar.u(i27);
                    cVar.u(value.f23825a);
                    cVar.m(value.f23826b);
                    if (iP2 > 4) {
                        cVar.r(size3);
                        size3 += iP2;
                    } else {
                        cVar.write(value.f23828d);
                        if (iP2 < 4) {
                            while (iP2 < 4) {
                                cVar.h(0);
                                iP2++;
                            }
                        }
                    }
                }
                if (i26 != 0 || this.f23798f[4].isEmpty()) {
                    j15 = 0;
                    cVar.r(0L);
                } else {
                    cVar.r(iArr[4]);
                    j15 = 0;
                }
                Iterator<Map.Entry<String, d>> it5 = this.f23798f[i26].entrySet().iterator();
                while (it5.hasNext()) {
                    byte[] bArr = it5.next().getValue().f23828d;
                    if (bArr.length > 4) {
                        cVar.write(bArr, 0, bArr.length);
                    }
                }
            }
            i26++;
            j16 = j15;
        }
        if (this.f23801i) {
            cVar.write(A());
        }
        if (this.f23796d == 14 && size % 2 == 1) {
            cVar.h(0);
        }
        cVar.b(ByteOrder.BIG_ENDIAN);
        return size2;
    }

    private int r(BufferedInputStream bufferedInputStream) throws Throwable {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (J(bArr)) {
            return 4;
        }
        if (M(bArr)) {
            return 9;
        }
        int I2 = I(bArr);
        if (I2 != 0) {
            return I2;
        }
        if (K(bArr)) {
            return 7;
        }
        if (N(bArr)) {
            return 10;
        }
        if (L(bArr)) {
            return 13;
        }
        return S(bArr) ? 14 : 0;
    }

    private void r0(c cVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f23808p = cVar.f23823a.size() + q0(new c(byteArrayOutputStream, ByteOrder.BIG_ENDIAN));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        cVar.write(byteArray);
        CRC32 crc32 = new CRC32();
        crc32.update(byteArray, 4, byteArray.length - 4);
        cVar.m((int) crc32.getValue());
    }

    private void s(g gVar) throws Throwable {
        int i15;
        int i16;
        v(gVar);
        d dVar = this.f23798f[1].get("MakerNote");
        if (dVar != null) {
            g gVar2 = new g(dVar.f23828d);
            gVar2.r(this.f23800h);
            byte[] bArr = I;
            byte[] bArr2 = new byte[bArr.length];
            gVar2.readFully(bArr2);
            gVar2.seek(0L);
            byte[] bArr3 = J;
            byte[] bArr4 = new byte[bArr3.length];
            gVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                gVar2.seek(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                gVar2.seek(12L);
            }
            Y(gVar2, 6);
            d dVar2 = this.f23798f[7].get("PreviewImageStart");
            d dVar3 = this.f23798f[7].get("PreviewImageLength");
            if (dVar2 != null && dVar3 != null) {
                this.f23798f[5].put("JPEGInterchangeFormat", dVar2);
                this.f23798f[5].put("JPEGInterchangeFormatLength", dVar3);
            }
            d dVar4 = this.f23798f[8].get("AspectFrame");
            if (dVar4 != null) {
                int[] iArr = (int[]) dVar4.o(this.f23800h);
                if (iArr == null || iArr.length != 4) {
                    c2.g("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i17 = iArr[2];
                int i18 = iArr[0];
                if (i17 <= i18 || (i15 = iArr[3]) <= (i16 = iArr[1])) {
                    return;
                }
                int i19 = (i17 - i18) + 1;
                int i25 = (i15 - i16) + 1;
                if (i19 < i25) {
                    int i26 = i19 + i25;
                    i25 = i26 - i25;
                    i19 = i26 - i25;
                }
                d dVarJ = d.j(i19, this.f23800h);
                d dVarJ2 = d.j(i25, this.f23800h);
                this.f23798f[0].put("ImageWidth", dVarJ);
                this.f23798f[0].put("ImageLength", dVarJ2);
            }
        }
    }

    private void s0(c cVar) throws IOException {
        cVar.m(this.f23813u.f23828d.length + 22);
        CRC32 crc32 = new CRC32();
        cVar.m(1767135348);
        n0(crc32, 1767135348);
        byte[] bArr = L;
        cVar.write(bArr);
        crc32.update(bArr);
        cVar.write(this.f23813u.f23828d);
        crc32.update(this.f23813u.f23828d);
        cVar.m((int) crc32.getValue());
        this.f23814v = true;
    }

    private void t(b bVar) throws Throwable {
        if (f23788w) {
            Objects.toString(bVar);
        }
        bVar.r(ByteOrder.BIG_ENDIAN);
        int iH = bVar.h();
        bVar.u(K.length);
        boolean z15 = false;
        boolean z16 = false;
        while (true) {
            if (z15 && z16) {
                break;
            }
            try {
                int i15 = bVar.readInt();
                int i16 = bVar.readInt();
                int iH2 = bVar.h() + i15 + 4;
                if (bVar.h() - iH == 16 && i16 != 1229472850) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                }
                if (i16 == 1229278788) {
                    break;
                }
                if (i16 == 1700284774 && !z15) {
                    this.f23808p = bVar.h() - iH;
                    byte[] bArr = new byte[i15];
                    bVar.readFully(bArr);
                    int i17 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    n0(crc32, i16);
                    crc32.update(bArr);
                    if (((int) crc32.getValue()) != i17) {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i17 + ", calculated CRC value: " + crc32.getValue());
                    }
                    X(bArr, 0);
                    p0();
                    k0(new b(bArr));
                    z15 = true;
                } else if (i16 == 1767135348 && !z16) {
                    byte[] bArr2 = L;
                    if (i15 >= bArr2.length) {
                        int length = bArr2.length;
                        byte[] bArr3 = new byte[length];
                        bVar.readFully(bArr3);
                        if (Arrays.equals(bArr3, bArr2)) {
                            int iH3 = bVar.h() - iH;
                            int i18 = i15 - length;
                            byte[] bArr4 = new byte[i18];
                            bVar.readFully(bArr4);
                            this.f23813u = new d(1, i18, iH3, bArr4);
                            z16 = true;
                        }
                    }
                }
                bVar.u(iH2 - bVar.h());
            } catch (EOFException e15) {
                throw new IOException("Encountered corrupt PNG file.", e15);
            }
        }
        this.f23814v = z16;
    }

    private void u(b bVar) throws Throwable {
        if (f23788w) {
            Objects.toString(bVar);
        }
        bVar.u(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.readFully(bArr);
        bVar.readFully(bArr2);
        bVar.readFully(bArr3);
        int i15 = ByteBuffer.wrap(bArr).getInt();
        int i16 = ByteBuffer.wrap(bArr2).getInt();
        int i17 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i16];
        bVar.u(i15 - bVar.h());
        bVar.readFully(bArr4);
        p(new b(bArr4), i15, 5);
        bVar.u(i17 - bVar.h());
        bVar.r(ByteOrder.BIG_ENDIAN);
        int i18 = bVar.readInt();
        for (int i19 = 0; i19 < i18; i19++) {
            int unsignedShort = bVar.readUnsignedShort();
            int unsignedShort2 = bVar.readUnsignedShort();
            if (unsignedShort == f23771f0.f23829a) {
                short s15 = bVar.readShort();
                short s16 = bVar.readShort();
                d dVarJ = d.j(s15, this.f23800h);
                d dVarJ2 = d.j(s16, this.f23800h);
                this.f23798f[0].put("ImageLength", dVarJ);
                this.f23798f[0].put("ImageWidth", dVarJ2);
                return;
            }
            bVar.u(unsignedShort2);
        }
    }

    private void v(g gVar) throws Throwable {
        d dVar;
        U(gVar);
        Y(gVar, 0);
        o0(gVar, 0);
        o0(gVar, 5);
        o0(gVar, 4);
        p0();
        if (this.f23796d != 8 || (dVar = this.f23798f[1].get("MakerNote")) == null) {
            return;
        }
        g gVar2 = new g(dVar.f23828d);
        gVar2.r(this.f23800h);
        gVar2.u(6);
        Y(gVar2, 9);
        d dVar2 = this.f23798f[9].get("ColorSpace");
        if (dVar2 != null) {
            this.f23798f[1].put("ColorSpace", dVar2);
        }
    }

    private void x(g gVar) throws Throwable {
        if (f23788w) {
            Objects.toString(gVar);
        }
        v(gVar);
        d dVar = this.f23798f[0].get("JpgFromRaw");
        if (dVar != null) {
            p(new b(dVar.f23828d), (int) dVar.f23827c, 5);
        }
        d dVar2 = this.f23798f[0].get("ISO");
        d dVar3 = this.f23798f[1].get("PhotographicSensitivity");
        if (dVar2 == null || dVar3 != null) {
            return;
        }
        this.f23798f[1].put("PhotographicSensitivity", dVar2);
    }

    private boolean y(g gVar) throws IOException {
        byte[] bArr = f23783r0;
        byte[] bArr2 = new byte[bArr.length];
        gVar.readFully(bArr2);
        if (!Arrays.equals(bArr2, bArr)) {
            c2.g("ExifInterface", "Given data is not EXIF-only.");
            return false;
        }
        byte[] bArrM = gVar.m();
        this.f23808p = bArr.length;
        X(bArrM, 0);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0090  */
    /* JADX WARN: Code duplicated, block: B:57:? A[SYNTHETIC] */
    public byte[] A() throws Throwable {
        Throwable th4;
        FileDescriptor fileDescriptor;
        InputStream inputStreamB;
        Throwable th5;
        InputStream inputStream = null;
        if (!this.f23801i) {
            return null;
        }
        byte[] bArr = this.f23806n;
        if (bArr != null) {
            return bArr;
        }
        try {
            inputStreamB = this.f23795c;
            if (inputStreamB != null) {
                try {
                    if (!inputStreamB.markSupported()) {
                        c7.b.b(inputStreamB);
                        return null;
                    }
                    inputStreamB.reset();
                    fileDescriptor = null;
                } catch (Exception unused) {
                    fileDescriptor = null;
                } catch (Throwable th6) {
                    inputStream = inputStreamB;
                    th4 = th6;
                    fileDescriptor = null;
                    c7.b.b(inputStream);
                    if (fileDescriptor == null) {
                        throw th4;
                    }
                    c7.b.a(fileDescriptor);
                    throw th4;
                }
                c7.b.b(inputStreamB);
                if (fileDescriptor != null) {
                    c7.b.a(fileDescriptor);
                }
                return null;
            }
            if (this.f23793a != null) {
                String str = this.f23793a;
                inputStreamB = h.b.c(new FileInputStream(str), str);
                fileDescriptor = null;
            } else {
                FileDescriptor fileDescriptorDup = Os.dup(this.f23794b);
                try {
                    Os.lseek(fileDescriptorDup, 0L, OsConstants.SEEK_SET);
                    fileDescriptor = fileDescriptorDup;
                    inputStreamB = h.b.b(new FileInputStream(fileDescriptorDup), fileDescriptorDup);
                } catch (Exception unused2) {
                    fileDescriptor = fileDescriptorDup;
                    inputStreamB = null;
                } catch (Throwable th7) {
                    th5 = th7;
                    fileDescriptor = fileDescriptorDup;
                    th4 = th5;
                    c7.b.b(inputStream);
                    if (fileDescriptor == null) {
                        throw th4;
                    }
                    c7.b.a(fileDescriptor);
                    throw th4;
                }
            }
            try {
                if (inputStreamB == null) {
                    throw new FileNotFoundException();
                }
                b bVar = new b(inputStreamB);
                bVar.u(this.f23804l + this.f23808p);
                byte[] bArr2 = new byte[this.f23805m];
                bVar.readFully(bArr2);
                this.f23806n = bArr2;
                c7.b.b(inputStreamB);
                if (fileDescriptor != null) {
                    c7.b.a(fileDescriptor);
                }
                return bArr2;
            } catch (Exception unused3) {
            } catch (Throwable th8) {
                th5 = th8;
                inputStream = inputStreamB;
                th4 = th5;
                c7.b.b(inputStream);
                if (fileDescriptor == null) {
                    throw th4;
                }
                c7.b.a(fileDescriptor);
                throw th4;
            }
        } catch (Exception unused4) {
            inputStreamB = null;
            fileDescriptor = null;
        } catch (Throwable th9) {
            th4 = th9;
            fileDescriptor = null;
        }
    }

    public boolean H() {
        int iM = m("Orientation", 1);
        return iM == 2 || iM == 7 || iM == 4 || iM == 5;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x010d A[Catch: all -> 0x011a, Exception -> 0x011c, TryCatch #14 {Exception -> 0x011c, all -> 0x011a, blocks: (B:67:0x0100, B:69:0x010d, B:76:0x0131, B:75:0x011e), top: B:121:0x0100 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x011e A[Catch: all -> 0x011a, Exception -> 0x011c, TryCatch #14 {Exception -> 0x011c, all -> 0x011a, blocks: (B:67:0x0100, B:69:0x010d, B:76:0x0131, B:75:0x011e), top: B:121:0x0100 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0170  */
    public void c0() throws Throwable {
        FileOutputStream fileOutputStreamA;
        FileInputStream fileInputStreamB;
        FileOutputStream fileOutputStream;
        Exception exc;
        FileOutputStream fileOutputStreamC;
        FileOutputStream fileOutputStreamC2;
        if (!Q(this.f23796d)) {
            throw new IOException("ExifInterface only supports saving attributes for JPEG, PNG, and WebP formats.");
        }
        if (this.f23794b == null && this.f23793a == null) {
            throw new IOException("ExifInterface does not support saving attributes for the current input.");
        }
        if (this.f23801i && this.f23802j && !this.f23803k) {
            throw new IOException("ExifInterface does not support saving attributes when the image file has non-consecutive thumbnail strips");
        }
        this.f23812t = true;
        this.f23806n = z();
        InputStream inputStreamA = null;
        try {
            File fileCreateTempFile = File.createTempFile("temp", "tmp");
            if (this.f23793a != null) {
                String str = this.f23793a;
                fileInputStreamB = h.b.c(new FileInputStream(str), str);
            } else {
                Os.lseek(this.f23794b, 0L, OsConstants.SEEK_SET);
                FileDescriptor fileDescriptor = this.f23794b;
                fileInputStreamB = h.b.b(new FileInputStream(fileDescriptor), fileDescriptor);
            }
            try {
                fileOutputStreamA = l.b.a(new FileOutputStream(fileCreateTempFile), fileCreateTempFile);
                try {
                    c7.b.d(fileInputStreamB, fileOutputStreamA);
                    c7.b.b(fileInputStreamB);
                    c7.b.b(fileOutputStreamA);
                    try {
                        try {
                            try {
                                FileInputStream fileInputStreamA = h.b.a(new FileInputStream(fileCreateTempFile), fileCreateTempFile);
                                try {
                                    if (this.f23793a != null) {
                                        String str2 = this.f23793a;
                                        fileOutputStreamC = l.b.d(new FileOutputStream(str2), str2);
                                    } else {
                                        Os.lseek(this.f23794b, 0L, OsConstants.SEEK_SET);
                                        FileDescriptor fileDescriptor2 = this.f23794b;
                                        fileOutputStreamC = l.b.c(new FileOutputStream(fileDescriptor2), fileDescriptor2);
                                    }
                                    try {
                                        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStreamA);
                                        try {
                                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStreamC);
                                            try {
                                                int i15 = this.f23796d;
                                                if (i15 == 4) {
                                                    d0(bufferedInputStream, bufferedOutputStream);
                                                } else if (i15 == 13) {
                                                    e0(bufferedInputStream, bufferedOutputStream);
                                                } else if (i15 == 14) {
                                                    f0(bufferedInputStream, bufferedOutputStream);
                                                }
                                                c7.b.b(bufferedInputStream);
                                                c7.b.b(bufferedOutputStream);
                                                fileCreateTempFile.delete();
                                                this.f23806n = null;
                                            } catch (Exception e15) {
                                                exc = e15;
                                                inputStreamA = fileInputStreamA;
                                                try {
                                                    inputStreamA = h.b.a(new FileInputStream(fileCreateTempFile), fileCreateTempFile);
                                                    if (this.f23793a != null) {
                                                        String str3 = this.f23793a;
                                                        fileOutputStreamC2 = l.b.d(new FileOutputStream(str3), str3);
                                                    } else {
                                                        Os.lseek(this.f23794b, 0L, OsConstants.SEEK_SET);
                                                        FileDescriptor fileDescriptor3 = this.f23794b;
                                                        fileOutputStreamC2 = l.b.c(new FileOutputStream(fileDescriptor3), fileDescriptor3);
                                                    }
                                                    fileOutputStreamC = fileOutputStreamC2;
                                                    c7.b.d(inputStreamA, fileOutputStreamC);
                                                    c7.b.b(inputStreamA);
                                                    c7.b.b(fileOutputStreamC);
                                                    throw new IOException("Failed to save new file", exc);
                                                } catch (Exception e16) {
                                                    try {
                                                        throw new IOException("Failed to save new file. Original file is stored in " + fileCreateTempFile.getAbsolutePath(), e16);
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        c7.b.b(inputStreamA);
                                                        c7.b.b(fileOutputStreamC);
                                                        throw th;
                                                    }
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    c7.b.b(inputStreamA);
                                                    c7.b.b(fileOutputStreamC);
                                                    throw th;
                                                }
                                            }
                                        } catch (Exception e17) {
                                            inputStreamA = fileInputStreamA;
                                            exc = e17;
                                        } catch (Throwable th6) {
                                            th = th6;
                                            inputStreamA = bufferedInputStream;
                                            c7.b.b(inputStreamA);
                                            c7.b.b(0);
                                            if (0 == 0) {
                                                fileCreateTempFile.delete();
                                            }
                                            throw th;
                                        }
                                    } catch (Exception e18) {
                                        inputStreamA = fileInputStreamA;
                                        exc = e18;
                                    }
                                } catch (Exception e19) {
                                    e = e19;
                                    fileOutputStream = null;
                                    inputStreamA = fileInputStreamA;
                                    exc = e;
                                    fileOutputStreamC = fileOutputStream;
                                    inputStreamA = h.b.a(new FileInputStream(fileCreateTempFile), fileCreateTempFile);
                                    if (this.f23793a != null) {
                                        String str4 = this.f23793a;
                                        fileOutputStreamC2 = l.b.d(new FileOutputStream(str4), str4);
                                    } else {
                                        Os.lseek(this.f23794b, 0L, OsConstants.SEEK_SET);
                                        FileDescriptor fileDescriptor4 = this.f23794b;
                                        fileOutputStreamC2 = l.b.c(new FileOutputStream(fileDescriptor4), fileDescriptor4);
                                    }
                                    fileOutputStreamC = fileOutputStreamC2;
                                    c7.b.d(inputStreamA, fileOutputStreamC);
                                    c7.b.b(inputStreamA);
                                    c7.b.b(fileOutputStreamC);
                                    throw new IOException("Failed to save new file", exc);
                                }
                            } catch (Throwable th7) {
                                th = th7;
                            }
                        } catch (Exception e25) {
                            e = e25;
                            fileOutputStream = null;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        c7.b.b(inputStreamA);
                        c7.b.b(0);
                        if (0 == 0) {
                            fileCreateTempFile.delete();
                        }
                        throw th;
                    }
                } catch (Exception e26) {
                    e = e26;
                    inputStreamA = fileInputStreamB;
                    try {
                        throw new IOException("Failed to copy original file to temp file", e);
                    } catch (Throwable th9) {
                        th = th9;
                        c7.b.b(inputStreamA);
                        c7.b.b(fileOutputStreamA);
                        throw th;
                    }
                } catch (Throwable th10) {
                    th = th10;
                    inputStreamA = fileInputStreamB;
                    c7.b.b(inputStreamA);
                    c7.b.b(fileOutputStreamA);
                    throw th;
                }
            } catch (Exception e27) {
                e = e27;
                fileOutputStreamA = null;
            } catch (Throwable th11) {
                th = th11;
                fileOutputStreamA = null;
            }
        } catch (Exception e28) {
            e = e28;
            fileOutputStreamA = null;
        } catch (Throwable th12) {
            th = th12;
            fileOutputStreamA = null;
        }
    }

    public void g0(double d15) {
        String str = d15 >= 0.0d ? com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.f37012h1 : "1";
        h0("GPSAltitude", f.b(Math.abs(d15)).toString());
        h0("GPSAltitudeRef", str);
    }

    public void h0(String str, String str2) {
        e eVar;
        int i15;
        int i16;
        String str3 = str;
        String strReplaceAll = str2;
        if (str3 == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str3)) {
            str3 = "PhotographicSensitivity";
        }
        int i17 = 1;
        if (strReplaceAll != null) {
            if (f23780o0.contains(str3) && !strReplaceAll.contains("/")) {
                try {
                    strReplaceAll = f.b(Double.parseDouble(strReplaceAll)).toString();
                } catch (NumberFormatException unused) {
                    c2.g("ExifInterface", "Invalid value for " + str3 + " : " + strReplaceAll);
                    return;
                }
            } else if (str3.equals("GPSTimeStamp")) {
                Matcher matcher = f23786u0.matcher(strReplaceAll);
                if (!matcher.find()) {
                    c2.g("ExifInterface", "Invalid value for " + str3 + " : " + strReplaceAll);
                    return;
                }
                strReplaceAll = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
            } else if ("DateTime".equals(str3) || "DateTimeOriginal".equals(str3) || "DateTimeDigitized".equals(str3)) {
                boolean zFind = f23787v0.matcher(strReplaceAll).find();
                boolean zFind2 = f23789w0.matcher(strReplaceAll).find();
                if (strReplaceAll.length() != 19 || (!zFind && !zFind2)) {
                    c2.g("ExifInterface", "Invalid value for " + str3 + " : " + strReplaceAll);
                    return;
                }
                if (zFind2) {
                    strReplaceAll = strReplaceAll.replaceAll("-", ":");
                }
            }
        }
        if ("Xmp".equals(str3)) {
            boolean z15 = this.f23798f[0].containsKey("Xmp") || this.f23798f[5].containsKey("Xmp");
            int iC = C(this.f23796d);
            if ((iC == 2 && (this.f23813u != null || !z15)) || (iC == 3 && !z15)) {
                this.f23813u = strReplaceAll != null ? d.a(strReplaceAll) : null;
                return;
            }
        }
        int i18 = 0;
        while (i18 < f23776k0.length) {
            if ((i18 != 4 || this.f23801i) && (eVar = f23779n0[i18].get(str3)) != null) {
                if (strReplaceAll != null) {
                    Pair<Integer, Integer> pairD = D(strReplaceAll);
                    if (eVar.f23831c == ((Integer) pairD.first).intValue() || eVar.f23831c == ((Integer) pairD.second).intValue()) {
                        i15 = eVar.f23831c;
                    } else {
                        int i19 = eVar.f23832d;
                        if (i19 == -1 || !(i19 == ((Integer) pairD.first).intValue() || eVar.f23832d == ((Integer) pairD.second).intValue())) {
                            int i25 = eVar.f23831c;
                            if (i25 == i17 || i25 == 7 || i25 == 2) {
                                i15 = i25;
                            } else if (f23788w) {
                                String[] strArr = X;
                                String str4 = strArr[eVar.f23831c];
                                if (eVar.f23832d != -1) {
                                    StringBuilder sb5 = new StringBuilder();
                                    sb5.append(", ");
                                    sb5.append(strArr[eVar.f23832d]);
                                }
                                String str5 = strArr[((Integer) pairD.first).intValue()];
                                if (((Integer) pairD.second).intValue() != -1) {
                                    StringBuilder sb6 = new StringBuilder();
                                    sb6.append(", ");
                                    sb6.append(strArr[((Integer) pairD.second).intValue()]);
                                }
                            }
                        } else {
                            i15 = eVar.f23832d;
                        }
                    }
                    switch (i15) {
                        case 1:
                            i16 = i17;
                            this.f23798f[i18].put(str3, d.a(strReplaceAll));
                            continue;
                        case 2:
                        case 7:
                            i16 = i17;
                            this.f23798f[i18].put(str3, d.e(strReplaceAll));
                            continue;
                        case 3:
                            i16 = i17;
                            String[] strArrSplit = strReplaceAll.split(",", -1);
                            int[] iArr = new int[strArrSplit.length];
                            for (int i26 = 0; i26 < strArrSplit.length; i26++) {
                                iArr[i26] = Integer.parseInt(strArrSplit[i26]);
                            }
                            this.f23798f[i18].put(str3, d.k(iArr, this.f23800h));
                            continue;
                        case 4:
                            i16 = i17;
                            String[] strArrSplit2 = strReplaceAll.split(",", -1);
                            long[] jArr = new long[strArrSplit2.length];
                            for (int i27 = 0; i27 < strArrSplit2.length; i27++) {
                                jArr[i27] = Long.parseLong(strArrSplit2[i27]);
                            }
                            this.f23798f[i18].put(str3, d.g(jArr, this.f23800h));
                            continue;
                        case 5:
                            i16 = i17;
                            String[] strArrSplit3 = strReplaceAll.split(",", -1);
                            f[] fVarArr = new f[strArrSplit3.length];
                            for (int i28 = 0; i28 < strArrSplit3.length; i28++) {
                                String[] strArrSplit4 = strArrSplit3[i28].split("/", -1);
                                fVarArr[i28] = new f((long) Double.parseDouble(strArrSplit4[0]), (long) Double.parseDouble(strArrSplit4[i16]), null);
                            }
                            this.f23798f[i18].put(str3, d.i(fVarArr, this.f23800h));
                            continue;
                        case 9:
                            i16 = i17;
                            String[] strArrSplit5 = strReplaceAll.split(",", -1);
                            int[] iArr2 = new int[strArrSplit5.length];
                            for (int i29 = 0; i29 < strArrSplit5.length; i29++) {
                                iArr2[i29] = Integer.parseInt(strArrSplit5[i29]);
                            }
                            this.f23798f[i18].put(str3, d.c(iArr2, this.f23800h));
                            continue;
                        case 10:
                            String[] strArrSplit6 = strReplaceAll.split(",", -1);
                            f[] fVarArr2 = new f[strArrSplit6.length];
                            int i35 = 0;
                            while (i35 < strArrSplit6.length) {
                                String[] strArrSplit7 = strArrSplit6[i35].split("/", -1);
                                fVarArr2[i35] = new f((long) Double.parseDouble(strArrSplit7[0]), (long) Double.parseDouble(strArrSplit7[i17]), null);
                                i35++;
                                i17 = i17;
                                strArrSplit6 = strArrSplit6;
                            }
                            i16 = i17;
                            this.f23798f[i18].put(str3, d.d(fVarArr2, this.f23800h));
                            continue;
                        case 12:
                            String[] strArrSplit8 = strReplaceAll.split(",", -1);
                            double[] dArr = new double[strArrSplit8.length];
                            for (int i36 = 0; i36 < strArrSplit8.length; i36++) {
                                dArr[i36] = Double.parseDouble(strArrSplit8[i36]);
                            }
                            this.f23798f[i18].put(str3, d.b(dArr, this.f23800h));
                            break;
                    }
                } else {
                    this.f23798f[i18].remove(str3);
                }
                i16 = i17;
            } else {
                i16 = i17;
            }
            i18++;
            i17 = i16;
        }
    }

    public void i0(Location location) {
        if (location == null) {
            return;
        }
        h0("GPSProcessingMethod", location.getProvider());
        j0(location.getLatitude(), location.getLongitude());
        g0(location.getAltitude());
        h0("GPSSpeedRef", "K");
        h0("GPSSpeed", f.b((location.getSpeed() * TimeUnit.HOURS.toSeconds(1L)) / 1000.0f).toString());
        String[] strArrSplit = V.format(new Date(location.getTime())).split("\\s+", -1);
        h0("GPSDateStamp", strArrSplit[0]);
        h0("GPSTimeStamp", strArrSplit[1]);
    }

    public double j(double d15) {
        double dL = l("GPSAltitude", -1.0d);
        int iM = m("GPSAltitudeRef", -1);
        if (dL < 0.0d || iM < 0) {
            return d15;
        }
        return dL * ((double) (iM != 1 ? 1 : -1));
    }

    public void j0(double d15, double d16) {
        if (d15 < -90.0d || d15 > 90.0d || Double.isNaN(d15)) {
            throw new IllegalArgumentException("Latitude value " + d15 + " is not valid.");
        }
        if (d16 < -180.0d || d16 > 180.0d || Double.isNaN(d16)) {
            throw new IllegalArgumentException("Longitude value " + d16 + " is not valid.");
        }
        h0("GPSLatitudeRef", d15 >= 0.0d ? "N" : ip.a.f96137b);
        h0("GPSLatitude", f(Math.abs(d15)));
        h0("GPSLongitudeRef", d16 >= 0.0d ? "E" : "W");
        h0("GPSLongitude", f(Math.abs(d16)));
    }

    public String k(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d dVarN = n(str);
        if (dVarN == null) {
            return null;
        }
        if (!str.equals("GPSTimeStamp")) {
            if (!f23780o0.contains(str)) {
                return dVarN.n(this.f23800h);
            }
            try {
                return Double.toString(dVarN.l(this.f23800h));
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        int i15 = dVarN.f23825a;
        if (i15 != 5 && i15 != 10) {
            c2.g("ExifInterface", "GPS Timestamp format is not rational. format=" + dVarN.f23825a);
            return null;
        }
        f[] fVarArr = (f[]) dVarN.o(this.f23800h);
        if (fVarArr == null || fVarArr.length != 3) {
            c2.g("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(fVarArr));
            return null;
        }
        f fVar = fVarArr[0];
        Integer numValueOf = Integer.valueOf((int) (fVar.f23833a / fVar.f23834b));
        f fVar2 = fVarArr[1];
        Integer numValueOf2 = Integer.valueOf((int) (fVar2.f23833a / fVar2.f23834b));
        f fVar3 = fVarArr[2];
        return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (fVar3.f23833a / fVar3.f23834b)));
    }

    public double l(String str, double d15) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d dVarN = n(str);
        if (dVarN != null) {
            try {
                return dVarN.l(this.f23800h);
            } catch (NumberFormatException unused) {
            }
        }
        return d15;
    }

    public int m(String str, int i15) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d dVarN = n(str);
        if (dVarN != null) {
            try {
                return dVarN.m(this.f23800h);
            } catch (NumberFormatException unused) {
            }
        }
        return i15;
    }

    public double[] q() {
        String strK = k("GPSLatitude");
        String strK2 = k("GPSLatitudeRef");
        String strK3 = k("GPSLongitude");
        String strK4 = k("GPSLongitudeRef");
        if (strK == null || strK2 == null || strK3 == null || strK4 == null) {
            return null;
        }
        try {
            return new double[]{g(strK, strK2), g(strK3, strK4)};
        } catch (IllegalArgumentException unused) {
            c2.g("ExifInterface", "Latitude/longitude values are not parsable. " + String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", strK, strK2, strK3, strK4));
            return null;
        }
    }

    public int w() {
        switch (m("Orientation", 1)) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    public byte[] z() {
        int i15 = this.f23807o;
        if (i15 == 6 || i15 == 7) {
            return A();
        }
        return null;
    }

    private static class b extends InputStream implements DataInput {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final DataInputStream f23818a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected int f23819b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ByteOrder f23820c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f23821d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f23822e;

        b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
            this.f23822e = bArr.length;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f23818a.available();
        }

        public int b() {
            return this.f23822e;
        }

        public int h() {
            return this.f23819b;
        }

        public byte[] m() throws IOException {
            byte[] bArrCopyOf = new byte[1024];
            int i15 = 0;
            while (true) {
                if (i15 == bArrCopyOf.length) {
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length * 2);
                }
                int i16 = this.f23818a.read(bArrCopyOf, i15, bArrCopyOf.length - i15);
                if (i16 == -1) {
                    return Arrays.copyOf(bArrCopyOf, i15);
                }
                i15 += i16;
                this.f23819b += i16;
            }
        }

        @Override // java.io.InputStream
        public void mark(int i15) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        public long p() {
            return ((long) readInt()) & BodyPartID.bodyIdMax;
        }

        public void r(ByteOrder byteOrder) {
            this.f23820c = byteOrder;
        }

        @Override // java.io.InputStream
        public int read() {
            this.f23819b++;
            return this.f23818a.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() {
            this.f23819b++;
            return this.f23818a.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() throws IOException {
            this.f23819b++;
            int i15 = this.f23818a.read();
            if (i15 >= 0) {
                return (byte) i15;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() {
            this.f23819b += 2;
            return this.f23818a.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i15, int i16) throws IOException {
            this.f23819b += i16;
            this.f23818a.readFully(bArr, i15, i16);
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
            this.f23819b += 4;
            int i15 = this.f23818a.read();
            int i16 = this.f23818a.read();
            int i17 = this.f23818a.read();
            int i18 = this.f23818a.read();
            if ((i15 | i16 | i17 | i18) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f23820c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (i18 << 24) + (i17 << 16) + (i16 << 8) + i15;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (i15 << 24) + (i16 << 16) + (i17 << 8) + i18;
            }
            throw new IOException("Invalid byte order: " + this.f23820c);
        }

        @Override // java.io.DataInput
        public String readLine() {
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
            this.f23819b += 8;
            int i15 = this.f23818a.read();
            int i16 = this.f23818a.read();
            int i17 = this.f23818a.read();
            int i18 = this.f23818a.read();
            int i19 = this.f23818a.read();
            int i25 = this.f23818a.read();
            int i26 = this.f23818a.read();
            int i27 = this.f23818a.read();
            if ((i15 | i16 | i17 | i18 | i19 | i25 | i26 | i27) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f23820c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (((long) i27) << 56) + (((long) i26) << 48) + (((long) i25) << 40) + (((long) i19) << 32) + (((long) i18) << 24) + (((long) i17) << 16) + (((long) i16) << 8) + ((long) i15);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (((long) i15) << 56) + (((long) i16) << 48) + (((long) i17) << 40) + (((long) i18) << 32) + (((long) i19) << 24) + (((long) i25) << 16) + (((long) i26) << 8) + ((long) i27);
            }
            throw new IOException("Invalid byte order: " + this.f23820c);
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
            this.f23819b += 2;
            int i15 = this.f23818a.read();
            int i16 = this.f23818a.read();
            if ((i15 | i16) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f23820c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (short) ((i16 << 8) + i15);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (short) ((i15 << 8) + i16);
            }
            throw new IOException("Invalid byte order: " + this.f23820c);
        }

        @Override // java.io.DataInput
        public String readUTF() {
            this.f23819b += 2;
            return this.f23818a.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() {
            this.f23819b++;
            return this.f23818a.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
            this.f23819b += 2;
            int i15 = this.f23818a.read();
            int i16 = this.f23818a.read();
            if ((i15 | i16) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f23820c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (i16 << 8) + i15;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (i15 << 8) + i16;
            }
            throw new IOException("Invalid byte order: " + this.f23820c);
        }

        @Override // java.io.InputStream
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public int skipBytes(int i15) {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        public void u(int i15) throws IOException {
            int i16 = 0;
            while (i16 < i15) {
                int i17 = i15 - i16;
                int iSkip = (int) this.f23818a.skip(i17);
                if (iSkip <= 0) {
                    if (this.f23821d == null) {
                        this.f23821d = new byte[PKIFailureInfo.certRevoked];
                    }
                    iSkip = this.f23818a.read(this.f23821d, 0, Math.min(PKIFailureInfo.certRevoked, i17));
                    if (iSkip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i15 + " bytes.");
                    }
                }
                i16 += iSkip;
            }
            this.f23819b += i16;
        }

        b(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i15, int i16) throws IOException {
            int i17 = this.f23818a.read(bArr, i15, i16);
            this.f23819b += i17;
            return i17;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            this.f23819b += bArr.length;
            this.f23818a.readFully(bArr);
        }

        b(InputStream inputStream, ByteOrder byteOrder) {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f23818a = dataInputStream;
            dataInputStream.mark(0);
            this.f23819b = 0;
            this.f23820c = byteOrder;
            this.f23822e = inputStream instanceof b ? ((b) inputStream).b() : -1;
        }
    }

    private static class g extends b {
        g(byte[] bArr) {
            super(bArr);
            this.f23818a.mark(Integer.MAX_VALUE);
        }

        public void seek(long j15) throws IOException {
            int i15 = this.f23819b;
            if (i15 > j15) {
                this.f23819b = 0;
                this.f23818a.reset();
            } else {
                j15 -= (long) i15;
            }
            u((int) j15);
        }

        g(InputStream inputStream) {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f23818a.mark(Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    private static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f23829a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f23830b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f23831c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f23832d;

        e(String str, int i15, int i16) {
            this.f23830b = str;
            this.f23829a = i15;
            this.f23831c = i16;
            this.f23832d = -1;
        }

        boolean a(int i15) {
            int i16;
            int i17 = this.f23831c;
            if (i17 == 7 || i15 == 7 || i17 == i15 || (i16 = this.f23832d) == i15) {
                return true;
            }
            if ((i17 == 4 || i16 == 4) && i15 == 3) {
                return true;
            }
            if ((i17 == 9 || i16 == 9) && i15 == 8) {
                return true;
            }
            return (i17 == 12 || i16 == 12) && i15 == 11;
        }

        e(String str, int i15, int i16, int i17) {
            this.f23830b = str;
            this.f23829a = i15;
            this.f23831c = i16;
            this.f23832d = i17;
        }
    }

    public a(InputStream inputStream) {
        this(inputStream, 0);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004f  */
    public a(InputStream inputStream, int i15) throws Throwable {
        e[][] eVarArr = f23776k0;
        this.f23798f = new HashMap[eVarArr.length];
        this.f23799g = new HashSet(eVarArr.length);
        this.f23800h = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.f23793a = null;
            boolean z15 = i15 == 1;
            this.f23797e = z15;
            if (z15) {
                this.f23795c = null;
                this.f23794b = null;
            } else if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f23795c = (AssetManager.AssetInputStream) inputStream;
                this.f23794b = null;
            } else if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                if (O(fileInputStream.getFD())) {
                    this.f23795c = null;
                    this.f23794b = fileInputStream.getFD();
                } else {
                    this.f23795c = null;
                    this.f23794b = null;
                }
            } else {
                this.f23795c = null;
                this.f23794b = null;
            }
            T(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }
}
