package ry;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000f\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000b\u0010\u0015¨\u0006\u0016"}, d2 = {"Lry/p;", "", "", "wrappedKeyAlias", "wrappingKeyAlias", "", "derEncoded", "Liy/h$c;", "algorithm", "<init>", "(Ljava/lang/String;Ljava/lang/String;[BLiy/h$c;)V", "a", "Ljava/lang/String;", "getWrappedKeyAlias", "()Ljava/lang/String;", "b", "c", "[B", "()[B", "d", "Liy/h$c;", "()Liy/h$c;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String wrappedKeyAlias;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String wrappingKeyAlias;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final byte[] derEncoded;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final iy.h.c algorithm;

    public p(String str, String str2, byte[] bArr, iy.h.c cVar) {
        this.wrappedKeyAlias = str;
        this.wrappingKeyAlias = str2;
        this.derEncoded = bArr;
        this.algorithm = cVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final iy.h.c getAlgorithm() {
        return this.algorithm;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final byte[] getDerEncoded() {
        return this.derEncoded;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getWrappingKeyAlias() {
        return this.wrappingKeyAlias;
    }
}
