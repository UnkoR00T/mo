package js0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: js0.o0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001e\u0010\u000eR\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0010R\u001a\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\u0010¨\u0006$"}, d2 = {"Ljs0/o0;", "", "", "headerAccept", "headerUserAgent", "", "javaScriptEnabled", "screenColorDepth", "", "screenHeight", "screenWidth", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;II)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getHeaderAccept", "b", "getHeaderUserAgent", "c", "Z", "getJavaScriptEnabled", "()Z", "d", "getScreenColorDepth", "e", "I", "getScreenHeight", "f", "getScreenWidth", "paymentservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RedirectRequestInfoDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("headerAccept")
    private final String headerAccept;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("headerUserAgent")
    private final String headerUserAgent;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("javaScriptEnabled")
    private final boolean javaScriptEnabled;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("screenColorDepth")
    private final String screenColorDepth;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("screenHeight")
    private final int screenHeight;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("screenWidth")
    private final int screenWidth;

    public RedirectRequestInfoDto(String str, String str2, boolean z15, String str3, int i15, int i16) {
        this.headerAccept = str;
        this.headerUserAgent = str2;
        this.javaScriptEnabled = z15;
        this.screenColorDepth = str3;
        this.screenHeight = i15;
        this.screenWidth = i16;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RedirectRequestInfoDto)) {
            return false;
        }
        RedirectRequestInfoDto redirectRequestInfoDto = (RedirectRequestInfoDto) other;
        return fr.t.c(this.headerAccept, redirectRequestInfoDto.headerAccept) && fr.t.c(this.headerUserAgent, redirectRequestInfoDto.headerUserAgent) && this.javaScriptEnabled == redirectRequestInfoDto.javaScriptEnabled && fr.t.c(this.screenColorDepth, redirectRequestInfoDto.screenColorDepth) && this.screenHeight == redirectRequestInfoDto.screenHeight && this.screenWidth == redirectRequestInfoDto.screenWidth;
    }

    public int hashCode() {
        return (((((((((this.headerAccept.hashCode() * 31) + this.headerUserAgent.hashCode()) * 31) + Boolean.hashCode(this.javaScriptEnabled)) * 31) + this.screenColorDepth.hashCode()) * 31) + Integer.hashCode(this.screenHeight)) * 31) + Integer.hashCode(this.screenWidth);
    }

    public String toString() {
        return "RedirectRequestInfoDto(headerAccept=" + this.headerAccept + ", headerUserAgent=" + this.headerUserAgent + ", javaScriptEnabled=" + this.javaScriptEnabled + ", screenColorDepth=" + this.screenColorDepth + ", screenHeight=" + this.screenHeight + ", screenWidth=" + this.screenWidth + ')';
    }
}
