package e10;

import android.security.keystore.WrappedKeyEntry;
import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c {
    public static /* synthetic */ WrappedKeyEntry a(byte[] bArr, String str, String str2, AlgorithmParameterSpec algorithmParameterSpec) {
        return new WrappedKeyEntry(bArr, str, str2, algorithmParameterSpec);
    }
}
