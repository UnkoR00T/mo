package u4;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: u4.x0, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000b\u0010\fJF\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010 \u001a\u0004\b!\u0010\u0014R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b\"\u0010\u0014R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lu4/x0;", "", "Lu4/l;", "fontFamily", "Lu4/d0;", "fontWeight", "Lu4/y;", "fontStyle", "Lu4/z;", "fontSynthesis", "resourceLoaderCacheKey", "<init>", "(Lu4/l;Lu4/d0;IILjava/lang/Object;Lfr/k;)V", "a", "(Lu4/l;Lu4/d0;IILjava/lang/Object;)Lu4/x0;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lu4/l;", "c", "()Lu4/l;", "b", "Lu4/d0;", "f", "()Lu4/d0;", "I", "d", "e", "Ljava/lang/Object;", "getResourceLoaderCacheKey", "()Ljava/lang/Object;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class TypefaceRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final l fontFamily;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final FontWeight fontWeight;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int fontStyle;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int fontSynthesis;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Object resourceLoaderCacheKey;

    public /* synthetic */ TypefaceRequest(l lVar, FontWeight fontWeight, int i15, int i16, Object obj, fr.k kVar) {
        this(lVar, fontWeight, i15, i16, obj);
    }

    public static /* synthetic */ TypefaceRequest b(TypefaceRequest typefaceRequest, l lVar, FontWeight fontWeight, int i15, int i16, Object obj, int i17, Object obj2) {
        if ((i17 & 1) != 0) {
            lVar = typefaceRequest.fontFamily;
        }
        if ((i17 & 2) != 0) {
            fontWeight = typefaceRequest.fontWeight;
        }
        if ((i17 & 4) != 0) {
            i15 = typefaceRequest.fontStyle;
        }
        if ((i17 & 8) != 0) {
            i16 = typefaceRequest.fontSynthesis;
        }
        if ((i17 & 16) != 0) {
            obj = typefaceRequest.resourceLoaderCacheKey;
        }
        Object obj3 = obj;
        int i18 = i15;
        return typefaceRequest.a(lVar, fontWeight, i18, i16, obj3);
    }

    public final TypefaceRequest a(l fontFamily, FontWeight fontWeight, int fontStyle, int fontSynthesis, Object resourceLoaderCacheKey) {
        return new TypefaceRequest(fontFamily, fontWeight, fontStyle, fontSynthesis, resourceLoaderCacheKey, null);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final l getFontFamily() {
        return this.fontFamily;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getFontStyle() {
        return this.fontStyle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getFontSynthesis() {
        return this.fontSynthesis;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TypefaceRequest)) {
            return false;
        }
        TypefaceRequest typefaceRequest = (TypefaceRequest) other;
        return fr.t.c(this.fontFamily, typefaceRequest.fontFamily) && fr.t.c(this.fontWeight, typefaceRequest.fontWeight) && y.f(this.fontStyle, typefaceRequest.fontStyle) && z.h(this.fontSynthesis, typefaceRequest.fontSynthesis) && fr.t.c(this.resourceLoaderCacheKey, typefaceRequest.resourceLoaderCacheKey);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }

    public int hashCode() {
        l lVar = this.fontFamily;
        int iHashCode = (((((((lVar == null ? 0 : lVar.hashCode()) * 31) + this.fontWeight.getWeight()) * 31) + y.g(this.fontStyle)) * 31) + z.i(this.fontSynthesis)) * 31;
        Object obj = this.resourceLoaderCacheKey;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        return "TypefaceRequest(fontFamily=" + this.fontFamily + ", fontWeight=" + this.fontWeight + ", fontStyle=" + ((Object) y.h(this.fontStyle)) + ", fontSynthesis=" + ((Object) z.l(this.fontSynthesis)) + ", resourceLoaderCacheKey=" + this.resourceLoaderCacheKey + ')';
    }

    private TypefaceRequest(l lVar, FontWeight fontWeight, int i15, int i16, Object obj) {
        this.fontFamily = lVar;
        this.fontWeight = fontWeight;
        this.fontStyle = i15;
        this.fontSynthesis = i16;
        this.resourceLoaderCacheKey = obj;
    }
}
