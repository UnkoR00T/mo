package un;

/* JADX INFO: loaded from: classes4.dex */
public class m {
    public static byte[] a(sn.n nVar, byte[] bArr) throws sn.h {
        sn.e eVarA = nVar.A();
        if (eVarA == null) {
            return bArr;
        }
        if (!eVarA.equals(sn.e.f182432b)) {
            throw new sn.h("Unsupported compression algorithm: " + eVarA);
        }
        try {
            return io.g.a(bArr);
        } catch (Exception e15) {
            throw new sn.h("Couldn't compress plain text: " + e15.getMessage(), e15);
        }
    }
}
