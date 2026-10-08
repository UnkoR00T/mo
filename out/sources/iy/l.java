package iy;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J-\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Liy/l;", "", "", "data", "Liy/o;", "hashAlgorithm", "Ldx/i;", "Ldx/b;", "b", "([BLiy/o;)Ldx/i;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface l {
    static /* synthetic */ dx.i a(l lVar, byte[] bArr, o oVar, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: hash");
        }
        if ((i15 & 2) != 0) {
            oVar = o.SHA_256;
        }
        return lVar.b(bArr, oVar);
    }

    dx.i<dx.b, byte[]> b(byte[] data, o hashAlgorithm);
}
