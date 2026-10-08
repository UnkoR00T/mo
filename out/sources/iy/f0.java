package iy;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\tj\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Liy/f0;", "", "", "alias", "provider", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "b", "g", "c", "d", "f", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum f0 {
    ANDROID_CA_STORE("AndroidCAStore", "AndroidCAStore"),
    ANDROID_KEY_STORE("AndroidKeyStore", "AndroidKeyStore"),
    BC_PKCS12_STORE("PKCS12", BouncyCastleProvider.PROVIDER_NAME),
    DEFAULT("", "");


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ wq.a f97744h = wq.b.a(b());

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String alias;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String provider;

    f0(String str, String str2) {
        this.alias = str;
        this.provider = str2;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getAlias() {
        return this.alias;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getProvider() {
        return this.provider;
    }
}
