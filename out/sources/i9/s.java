package i9;

import java.nio.ByteBuffer;
import java.util.UUID;
import w7.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class s {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f90471a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f90472b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f90473c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final UUID[] f90474d;

        a(UUID uuid, int i15, byte[] bArr, UUID[] uuidArr) {
            this.f90471a = uuid;
            this.f90472b = i15;
            this.f90473c = bArr;
            this.f90474d = uuidArr;
        }
    }

    public static byte[] a(UUID uuid, byte[] bArr) {
        return b(uuid, null, bArr);
    }

    public static byte[] b(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr == null || bArr.length == 0) {
            byteBufferAllocate.putInt(0);
        } else {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    public static boolean c(byte[] bArr) {
        return d(bArr) != null;
    }

    public static a d(byte[] bArr) {
        UUID[] uuidArr;
        c0 c0Var = new c0(bArr);
        if (c0Var.j() < 32) {
            return null;
        }
        c0Var.f0(0);
        int iA = c0Var.a();
        int iZ = c0Var.z();
        if (iZ != iA) {
            w7.t.h("PsshAtomUtil", "Advertised atom size (" + iZ + ") does not match buffer size: " + iA);
            return null;
        }
        int iZ2 = c0Var.z();
        if (iZ2 != 1886614376) {
            w7.t.h("PsshAtomUtil", "Atom type is not pssh: " + iZ2);
            return null;
        }
        int iQ = b.q(c0Var.z());
        if (iQ > 1) {
            w7.t.h("PsshAtomUtil", "Unsupported pssh version: " + iQ);
            return null;
        }
        UUID uuid = new UUID(c0Var.J(), c0Var.J());
        if (iQ == 1) {
            int iU = c0Var.U();
            uuidArr = new UUID[iU];
            for (int i15 = 0; i15 < iU; i15++) {
                uuidArr[i15] = new UUID(c0Var.J(), c0Var.J());
            }
        } else {
            uuidArr = null;
        }
        int iU2 = c0Var.U();
        int iA2 = c0Var.a();
        if (iU2 == iA2) {
            byte[] bArr2 = new byte[iU2];
            c0Var.u(bArr2, 0, iU2);
            return new a(uuid, iQ, bArr2, uuidArr);
        }
        w7.t.h("PsshAtomUtil", "Atom data size (" + iU2 + ") does not match the bytes left: " + iA2);
        return null;
    }

    public static byte[] e(byte[] bArr, UUID uuid) {
        a aVarD = d(bArr);
        if (aVarD == null) {
            return null;
        }
        if (uuid.equals(aVarD.f90471a)) {
            return aVarD.f90473c;
        }
        w7.t.h("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + aVarD.f90471a + ".");
        return null;
    }

    public static UUID f(byte[] bArr) {
        a aVarD = d(bArr);
        if (aVarD == null) {
            return null;
        }
        return aVarD.f90471a;
    }

    public static int g(byte[] bArr) {
        a aVarD = d(bArr);
        if (aVarD == null) {
            return -1;
        }
        return aVarD.f90472b;
    }
}
