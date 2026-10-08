package py;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\b¨\u0006\r"}, d2 = {"Lpy/n;", "", "", "modulusBits", "<init>", "(Ljava/lang/String;II)V", "a", "I", "e", "()I", "b", "c", "d", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum n {
    STRENGTH_1024(1024),
    STRENGTH_2048(2048),
    STRENGTH_3072(3072),
    STRENGTH_4096(PKIFailureInfo.certConfirmed);


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ wq.a f163189g = wq.b.a(b());

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int modulusBits;

    n(int i15) {
        this.modulusBits = i15;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public int getModulusBits() {
        return this.modulusBits;
    }
}
