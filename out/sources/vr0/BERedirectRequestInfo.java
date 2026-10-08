package vr0;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: vr0.k, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u0010R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010¨\u0006\u001e"}, d2 = {"Lvr0/k;", "", "", "headerAccept", "headerUserAgent", "", "javaScriptEnabled", "screenColorDepth", "", "screenHeight", "screenWidth", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;II)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Z", "()Z", "d", "e", "I", "f", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BERedirectRequestInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String headerAccept;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String headerUserAgent;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean javaScriptEnabled;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String screenColorDepth;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final int screenHeight;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final int screenWidth;

    public BERedirectRequestInfo(String str, String str2, boolean z15, String str3, int i15, int i16) {
        this.headerAccept = str;
        this.headerUserAgent = str2;
        this.javaScriptEnabled = z15;
        this.screenColorDepth = str3;
        this.screenHeight = i15;
        this.screenWidth = i16;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getHeaderAccept() {
        return this.headerAccept;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getHeaderUserAgent() {
        return this.headerUserAgent;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getJavaScriptEnabled() {
        return this.javaScriptEnabled;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getScreenColorDepth() {
        return this.screenColorDepth;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getScreenHeight() {
        return this.screenHeight;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BERedirectRequestInfo)) {
            return false;
        }
        BERedirectRequestInfo bERedirectRequestInfo = (BERedirectRequestInfo) other;
        return t.c(this.headerAccept, bERedirectRequestInfo.headerAccept) && t.c(this.headerUserAgent, bERedirectRequestInfo.headerUserAgent) && this.javaScriptEnabled == bERedirectRequestInfo.javaScriptEnabled && t.c(this.screenColorDepth, bERedirectRequestInfo.screenColorDepth) && this.screenHeight == bERedirectRequestInfo.screenHeight && this.screenWidth == bERedirectRequestInfo.screenWidth;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getScreenWidth() {
        return this.screenWidth;
    }

    public int hashCode() {
        return (((((((((this.headerAccept.hashCode() * 31) + this.headerUserAgent.hashCode()) * 31) + Boolean.hashCode(this.javaScriptEnabled)) * 31) + this.screenColorDepth.hashCode()) * 31) + Integer.hashCode(this.screenHeight)) * 31) + Integer.hashCode(this.screenWidth);
    }

    public String toString() {
        return "BERedirectRequestInfo(headerAccept=" + this.headerAccept + ", headerUserAgent=" + this.headerUserAgent + ", javaScriptEnabled=" + this.javaScriptEnabled + ", screenColorDepth=" + this.screenColorDepth + ", screenHeight=" + this.screenHeight + ", screenWidth=" + this.screenWidth + ")";
    }
}
