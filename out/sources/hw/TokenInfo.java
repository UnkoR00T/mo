package hw;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: hw.f, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001b\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0014\u0010\u000f¨\u0006\u001c"}, d2 = {"Lhw/f;", "", "Lyv/a;", "type", "", "tokenStart", "tokenEnd", "rawIndex", "normIndex", "<init>", "(Lyv/a;IIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lyv/a;", "e", "()Lyv/a;", "b", "I", "d", "c", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final /* data */ class TokenInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final yv.a type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int tokenStart;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int tokenEnd;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int rawIndex;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final int normIndex;

    public TokenInfo(yv.a aVar, int i15, int i16, int i17, int i18) {
        this.type = aVar;
        this.tokenStart = i15;
        this.tokenEnd = i16;
        this.rawIndex = i17;
        this.normIndex = i18;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getNormIndex() {
        return this.normIndex;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getRawIndex() {
        return this.rawIndex;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getTokenEnd() {
        return this.tokenEnd;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getTokenStart() {
        return this.tokenStart;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final yv.a getType() {
        return this.type;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TokenInfo)) {
            return false;
        }
        TokenInfo tokenInfo = (TokenInfo) other;
        return t.c(this.type, tokenInfo.type) && this.tokenStart == tokenInfo.tokenStart && this.tokenEnd == tokenInfo.tokenEnd && this.rawIndex == tokenInfo.rawIndex && this.normIndex == tokenInfo.normIndex;
    }

    public int hashCode() {
        yv.a aVar = this.type;
        return ((((((((aVar == null ? 0 : aVar.hashCode()) * 31) + Integer.hashCode(this.tokenStart)) * 31) + Integer.hashCode(this.tokenEnd)) * 31) + Integer.hashCode(this.rawIndex)) * 31) + Integer.hashCode(this.normIndex);
    }

    public String toString() {
        return "TokenInfo(type=" + this.type + ", tokenStart=" + this.tokenStart + ", tokenEnd=" + this.tokenEnd + ", rawIndex=" + this.rawIndex + ", normIndex=" + this.normIndex + ')';
    }
}
