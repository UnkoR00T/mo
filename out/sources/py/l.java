package py;

import oq.i0;
import p071kotlin.Metadata;
import ry.p;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\r\u001a\u00020\u0002H&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lpy/l;", "", "", "keyAlias", "", "derEncodedKey", "Lpy/j;", "wrappingKeySpec", "Ldx/i;", "Ldx/b;", "Loq/i0;", "b", "(Ljava/lang/String;[BLpy/j;)Ldx/i;", "wrappedKeyAlias", "Lry/p;", "a", "(Ljava/lang/String;)Ldx/i;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface l {
    dx.i<dx.b, p> a(String wrappedKeyAlias);

    dx.i<dx.b, i0> b(String keyAlias, byte[] derEncodedKey, KeyStoreKeySpec wrappingKeySpec);
}
