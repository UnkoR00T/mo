package ry;

import org.bouncycastle.cms.CMSAttributeTableGenerator;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lry/h;", "", "", CMSAttributeTableGenerator.DIGEST, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "b", "c", "d", "e", "f", "g", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum h {
    DIGEST_NONE("NONE"),
    DIGEST_MD5("MD5"),
    DIGEST_SHA1("SHA-1"),
    DIGEST_SHA224("SHA-224"),
    DIGEST_SHA256(XMSSKeyParameters.SHA_256),
    DIGEST_SHA384("SHA-384"),
    DIGEST_SHA512(XMSSKeyParameters.SHA_512);


    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ wq.a f176817j = wq.b.a(b());

    h(String str) {
    }
}
