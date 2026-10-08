package ic;

import java.util.Arrays;
import java.util.Map;
import oq.y;
import pq.v;
import pq.v0;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f90889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public jc.b f90890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f90891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f90892d;

    public m() {
        byte[] bArr = new byte[2];
        for (int i15 = 0; i15 < 2; i15++) {
            bArr[i15] = 28;
        }
        this.f90889a = bArr;
        this.f90890b = new jc.b(new byte[0], null, (byte) 0, 0, null);
        this.f90891c = v0.l(y.a(Arrays.toString(new byte[]{4, 0, 127, 0, 7, 2, 2, 4, 2, 1}), "GM-3DES-CBC-CBC"), y.a(Arrays.toString(new byte[]{4, 0, 127, 0, 7, 2, 2, 4, 2, 2}), "GM-AES-CBC-CMAC-128"), y.a(Arrays.toString(new byte[]{4, 0, 127, 0, 7, 2, 2, 4, 2, 3}), "GM-AES-CBC-CMAC-192"), y.a(Arrays.toString(new byte[]{4, 0, 127, 0, 7, 2, 2, 4, 2, 4}), "GM-AES-CBC-CMAC-256"), y.a(Arrays.toString(new byte[]{4, 0, 127, 0, 7, 2, 2, 4, 6, 2}), "CAM-AES-CBC-CMAC-128"), y.a(Arrays.toString(new byte[]{4, 0, 127, 0, 7, 2, 2, 4, 6, 3}), "CAM-AES-CBC-CMAC-192"), y.a(Arrays.toString(new byte[]{4, 0, 127, 0, 7, 2, 2, 4, 6, 4}), "CAM-AES-CBC-CMAC-256"));
        this.f90892d = v0.l(y.a(10, "NIST P-224 (secp224r1)"), y.a(12, "NIST P-256 (secp256r1)"), y.a(15, "NIST P-384 (secp384r1)"), y.a(18, "NIST P-521 (secp521r1)"), y.a(11, "BrainpoolP224r1"), y.a(13, "BrainpoolP256r1"), y.a(14, "BrainpoolP320r1"), y.a(16, "BrainpoolP384r1"), y.a(17, "BrainpoolP512r1"));
    }

    @Override // ic.q
    public final byte[] b() {
        return this.f90889a;
    }

    @Override // ic.q
    public final void d(byte[] bArr) {
        byte[] bArrA1 = v.a1(v.X0(pq.n.i0(bArr, 6), 10));
        String str = (String) this.f90891c.get(Arrays.toString(bArrA1));
        byte b15 = bArr[19];
        byte b16 = bArr[21];
        this.f90890b = new jc.b(bArrA1, str, b15, b16, (String) this.f90892d.get(Integer.valueOf(b16)));
        Arrays.copyOf(bArr, bArr.length);
    }

    @Override // ic.q
    public final String getName() {
        return "EF.CardAccess";
    }
}
