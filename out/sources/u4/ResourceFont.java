package u4;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: u4.s0, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B9\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0018\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001b\u0010\u0014R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R \u0010\u000b\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b!\u0010\u0019\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0014¨\u0006%"}, d2 = {"Lu4/s0;", "Lu4/k;", "", "resId", "Lu4/d0;", "weight", "Lu4/y;", "style", "Lu4/c0;", "variationSettings", "Lu4/w;", "loadingStrategy", "<init>", "(ILu4/d0;ILu4/c0;ILfr/k;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "b", "I", "d", "c", "Lu4/d0;", "()Lu4/d0;", "e", "Lu4/c0;", "()Lu4/c0;", "f", "a", "getLoadingStrategy-PKNRLFQ$annotations", "()V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ResourceFont implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int resId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final FontWeight weight;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int style;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final c0 variationSettings;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int loadingStrategy;

    public /* synthetic */ ResourceFont(int i15, FontWeight fontWeight, int i16, c0 c0Var, int i17, fr.k kVar) {
        this(i15, fontWeight, i16, c0Var, i17);
    }

    @Override // u4.k
    /* JADX INFO: renamed from: a, reason: from getter */
    public int getLoadingStrategy() {
        return this.loadingStrategy;
    }

    @Override // u4.k
    /* JADX INFO: renamed from: b, reason: from getter */
    public FontWeight getWeight() {
        return this.weight;
    }

    @Override // u4.k
    /* JADX INFO: renamed from: c, reason: from getter */
    public int getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getResId() {
        return this.resId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final c0 getVariationSettings() {
        return this.variationSettings;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResourceFont)) {
            return false;
        }
        ResourceFont resourceFont = (ResourceFont) other;
        return this.resId == resourceFont.resId && fr.t.c(getWeight(), resourceFont.getWeight()) && y.f(getStyle(), resourceFont.getStyle()) && fr.t.c(this.variationSettings, resourceFont.variationSettings) && w.e(getLoadingStrategy(), resourceFont.getLoadingStrategy());
    }

    public int hashCode() {
        return (((((((this.resId * 31) + getWeight().getWeight()) * 31) + y.g(getStyle())) * 31) + w.f(getLoadingStrategy())) * 31) + this.variationSettings.hashCode();
    }

    public String toString() {
        return "ResourceFont(resId=" + this.resId + ", weight=" + getWeight() + ", style=" + ((Object) y.h(getStyle())) + ", loadingStrategy=" + ((Object) w.g(getLoadingStrategy())) + ')';
    }

    private ResourceFont(int i15, FontWeight fontWeight, int i16, c0 c0Var, int i17) {
        this.resId = i15;
        this.weight = fontWeight;
        this.style = i16;
        this.variationSettings = c0Var;
        this.loadingStrategy = i17;
    }
}
