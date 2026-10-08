package iy;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\nJ/\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\b2\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Liy/a;", "", "", "data", "Lry/b;", "flag", "Ldx/i;", "Ldx/b;", "", "h", "(Ljava/lang/String;Lry/b;)Ldx/i;", "b", "([BLry/b;)Ldx/i;", "Lry/a;", "g", "(Liy/b0;Lry/b;)Ldx/i;", "d", "([BLry/b;)Ljava/lang/String;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    static /* synthetic */ dx.i a(a aVar, byte[] bArr, ry.b bVar, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
        }
        if ((i15 & 2) != 0) {
            bVar = ry.b.NO_WRAP;
        }
        return aVar.b(bArr, bVar);
    }

    static /* synthetic */ dx.i c(a aVar, String str, ry.b bVar, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
        }
        if ((i15 & 2) != 0) {
            bVar = ry.b.NO_WRAP;
        }
        return aVar.h(str, bVar);
    }

    static /* synthetic */ String e(a aVar, byte[] bArr, ry.b bVar, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encode");
        }
        if ((i15 & 2) != 0) {
            bVar = ry.b.NO_WRAP;
        }
        return aVar.d(bArr, bVar);
    }

    static /* synthetic */ dx.i f(a aVar, b0 b0Var, ry.b bVar, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode-RcCcF6w");
        }
        if ((i15 & 2) != 0) {
            bVar = ry.b.NO_WRAP;
        }
        return aVar.g(b0Var, bVar);
    }

    dx.i<dx.b, byte[]> b(byte[] data, ry.b flag);

    String d(byte[] data, ry.b flag);

    dx.i<dx.b, byte[]> g(b0 data, ry.b flag);

    dx.i<dx.b, byte[]> h(String data, ry.b flag);
}
