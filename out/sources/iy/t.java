package iy;

import java.io.InputStream;
import java.security.KeyStore;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J;\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Liy/t;", "", "Liy/f0;", "storeType", "Ljava/io/InputStream;", "inputStream", "", "charArray", "Ldx/i;", "Ldx/b;", "Ljava/security/KeyStore;", "b", "(Liy/f0;Ljava/io/InputStream;[C)Ldx/i;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface t {
    static /* synthetic */ dx.i a(t tVar, f0 f0Var, InputStream inputStream, char[] cArr, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: load");
        }
        if ((i15 & 2) != 0) {
            inputStream = null;
        }
        if ((i15 & 4) != 0) {
            cArr = null;
        }
        return tVar.b(f0Var, inputStream, cArr);
    }

    dx.i<dx.b, KeyStore> b(f0 storeType, InputStream inputStream, char[] charArray);
}
