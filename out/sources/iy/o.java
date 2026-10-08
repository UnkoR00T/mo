package iy;

import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Liy/o;", "", "", "algorithm", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "getAlgorithm", "()Ljava/lang/String;", "b", "c", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum o {
    SHA_256(XMSSKeyParameters.SHA_256),
    SHA_384("SHA-384");


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ wq.a f97766e = wq.b.a(b());

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String algorithm;

    o(String str) {
        this.algorithm = str;
    }

    public final String getAlgorithm() {
        return this.algorithm;
    }
}
