package x7;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import w7.b0;
import zj.p;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f217242a;

        private b(e eVar, d dVar) throws c {
            int i15 = dVar.f217243a;
            p.d(i15 == 6 || i15 == 3);
            byte[] bArr = new byte[Math.min(4, dVar.f217244b.remaining())];
            dVar.f217244b.asReadOnlyBuffer().get(bArr);
            b0 b0Var = new b0(bArr);
            h.f(eVar.f217245a);
            if (b0Var.g()) {
                this.f217242a = false;
                return;
            }
            int iH = b0Var.h(2);
            boolean zG = b0Var.g();
            h.f(eVar.f217246b);
            if (!zG) {
                this.f217242a = true;
                return;
            }
            boolean zG2 = (iH == 3 || iH == 0) ? true : b0Var.g();
            b0Var.q();
            h.f(!eVar.f217248d);
            if (b0Var.g()) {
                h.f(!eVar.f217249e);
                b0Var.q();
            }
            h.f(eVar.f217247c);
            if (iH != 3) {
                b0Var.q();
            }
            b0Var.r(eVar.f217250f);
            if (iH != 2 && iH != 0 && !zG2) {
                b0Var.r(3);
            }
            this.f217242a = ((iH == 3 || iH == 0) ? GF2Field.MASK : b0Var.h(8)) != 0;
        }

        public static b b(e eVar, d dVar) {
            try {
                return new b(eVar, dVar);
            } catch (c unused) {
                return null;
            }
        }

        public boolean a() {
            return this.f217242a;
        }
    }

    private static class c extends Exception {
        private c() {
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f217243a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ByteBuffer f217244b;

        private d(int i15, ByteBuffer byteBuffer) {
            this.f217243a = i15;
            this.f217244b = byteBuffer;
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f217245a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f217246b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f217247c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f217248d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f217249e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f217250f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f217251g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f217252h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f217253i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f217254j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f217255k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f217256l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final boolean f217257m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final boolean f217258n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final boolean f217259o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final boolean f217260p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final int f217261q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final byte f217262r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final byte f217263s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final byte f217264t;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v4, types: [int] */
        /* JADX WARN: Type inference failed for: r8v5 */
        /* JADX WARN: Type inference failed for: r8v6 */
        private e(d dVar) {
            int iH;
            int iH2;
            boolean zG;
            ?? r15;
            p.d(dVar.f217243a == 1);
            byte[] bArr = new byte[dVar.f217244b.remaining()];
            dVar.f217244b.asReadOnlyBuffer().get(bArr);
            b0 b0Var = new b0(bArr);
            this.f217251g = b0Var.h(3);
            b0Var.q();
            boolean zG2 = b0Var.g();
            this.f217245a = zG2;
            if (zG2) {
                iH2 = b0Var.h(5);
                this.f217246b = false;
                this.f217254j = false;
                r15 = 0;
                iH = 0;
            } else {
                if (b0Var.g()) {
                    b(b0Var);
                    boolean zG3 = b0Var.g();
                    this.f217246b = zG3;
                    if (zG3) {
                        b0Var.r(47);
                    }
                } else {
                    this.f217246b = false;
                }
                this.f217254j = b0Var.g();
                int iH3 = b0Var.h(5);
                int iH4 = 0;
                int i15 = 0;
                boolean z15 = false;
                iH = 0;
                while (i15 <= iH3) {
                    b0Var.r(12);
                    if (i15 == 0) {
                        iH4 = b0Var.h(5);
                        if (iH4 > 7) {
                            zG = z15;
                            zG = b0Var.g();
                        }
                    } else if (b0Var.h(5) > 7) {
                        zG = z15;
                        b0Var.q();
                        zG = z15;
                    }
                    zG = z15;
                    zG = z15;
                    if (this.f217246b) {
                        b0Var.q();
                    }
                    if (this.f217254j && b0Var.g()) {
                        if (i15 == 0) {
                            iH = b0Var.h(4);
                        } else {
                            b0Var.r(4);
                        }
                    }
                    i15++;
                    z15 = zG;
                }
                iH2 = iH4;
                r15 = z15;
            }
            int iH5 = b0Var.h(4);
            int iH6 = b0Var.h(4);
            b0Var.r(iH5 + 1);
            b0Var.r(iH6 + 1);
            if (this.f217245a) {
                this.f217247c = false;
            } else {
                this.f217247c = b0Var.g();
            }
            if (this.f217247c) {
                b0Var.r(4);
                b0Var.r(3);
            }
            b0Var.r(3);
            if (this.f217245a) {
                this.f217249e = true;
                this.f217248d = true;
                this.f217250f = 0;
            } else {
                b0Var.r(4);
                boolean zG4 = b0Var.g();
                if (zG4) {
                    b0Var.r(2);
                }
                if (b0Var.g()) {
                    this.f217248d = true;
                } else {
                    this.f217248d = b0Var.g();
                }
                if (!this.f217248d || b0Var.g()) {
                    this.f217249e = true;
                } else {
                    this.f217249e = b0Var.g();
                }
                if (zG4) {
                    this.f217250f = b0Var.h(3) + 1;
                } else {
                    this.f217250f = 0;
                }
            }
            this.f217252h = iH2;
            this.f217253i = r15;
            this.f217255k = iH;
            b0Var.r(3);
            boolean zG5 = b0Var.g();
            this.f217256l = zG5;
            if (this.f217251g == 2 && zG5) {
                this.f217257m = b0Var.g();
            } else {
                this.f217257m = false;
            }
            if (this.f217251g != 1) {
                this.f217258n = b0Var.g();
            } else {
                this.f217258n = false;
            }
            if (b0Var.g()) {
                this.f217262r = (byte) b0Var.h(8);
                this.f217263s = (byte) b0Var.h(8);
                this.f217264t = (byte) b0Var.h(8);
            } else {
                this.f217262r = (byte) 0;
                this.f217263s = (byte) 0;
                this.f217264t = (byte) 0;
            }
            if (this.f217258n) {
                b0Var.q();
                this.f217259o = false;
                this.f217260p = false;
                this.f217261q = 0;
            } else if (this.f217262r == 1 && this.f217263s == 13 && this.f217264t == 0) {
                this.f217259o = false;
                this.f217260p = false;
                this.f217261q = 0;
            } else {
                b0Var.q();
                int i16 = this.f217251g;
                if (i16 == 0) {
                    this.f217259o = true;
                    this.f217260p = true;
                } else if (i16 == 1) {
                    this.f217259o = false;
                    this.f217260p = false;
                } else if (this.f217257m) {
                    boolean zG6 = b0Var.g();
                    this.f217259o = zG6;
                    if (zG6) {
                        this.f217260p = b0Var.g();
                    } else {
                        this.f217260p = false;
                    }
                } else {
                    this.f217259o = true;
                    this.f217260p = false;
                }
                if (this.f217259o && this.f217260p) {
                    this.f217261q = b0Var.h(2);
                } else {
                    this.f217261q = 0;
                }
            }
            b0Var.q();
        }

        public static e a(d dVar) {
            try {
                return new e(dVar);
            } catch (c unused) {
                return null;
            }
        }

        private static void b(b0 b0Var) {
            b0Var.r(64);
            if (b0Var.g()) {
                h.d(b0Var);
            }
        }
    }

    private static int c(ByteBuffer byteBuffer) {
        int i15 = 0;
        for (int i16 = 0; i16 < 8; i16++) {
            byte b15 = byteBuffer.get();
            i15 |= (b15 & 127) << (i16 * 7);
            if ((b15 & 128) == 0) {
                return i15;
            }
        }
        return i15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(b0 b0Var) {
        int i15 = 0;
        while (!b0Var.g()) {
            i15++;
        }
        if (i15 < 32) {
            b0Var.r(i15);
        }
    }

    public static List<d> e(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (byteBufferAsReadOnlyBuffer.hasRemaining()) {
            try {
                byte b15 = byteBufferAsReadOnlyBuffer.get();
                int i15 = (b15 >> 3) & 15;
                if (((b15 >> 2) & 1) != 0) {
                    byteBufferAsReadOnlyBuffer.get();
                }
                int iC = ((b15 >> 1) & 1) != 0 ? c(byteBufferAsReadOnlyBuffer) : byteBufferAsReadOnlyBuffer.remaining();
                if (byteBufferAsReadOnlyBuffer.position() + iC > byteBufferAsReadOnlyBuffer.limit()) {
                    break;
                }
                ByteBuffer byteBufferDuplicate = byteBufferAsReadOnlyBuffer.duplicate();
                byteBufferDuplicate.limit(byteBufferAsReadOnlyBuffer.position() + iC);
                arrayList.add(new d(i15, byteBufferDuplicate));
                byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + iC);
            } catch (BufferUnderflowException unused) {
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(boolean z15) throws c {
        if (z15) {
            throw new c();
        }
    }
}
