package l70;

import fr.k;
import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: l70.g, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b\u001b\u0010\u001fR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Ll70/g;", "Ll70/c;", "Ll70/a;", "base", "La20/a;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.f37063p, "Ll70/h;", "support", "Ll70/i;", "surface", "<init>", "(Ll70/a;La20/a;Ll70/h;Ll70/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ll70/a;", "c", "()Ll70/a;", "b", "La20/a;", "()La20/a;", "Ll70/h;", "()Ll70/h;", "d", "Ll70/i;", "getSurface", "()Ll70/i;", "theme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DefaultColors implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final a base;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final a20.a neutral;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final h support;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final i surface;

    public DefaultColors() {
        this(null, null, null, null, 15, null);
    }

    @Override // l70.c
    /* JADX INFO: renamed from: a, reason: from getter */
    public a20.a getNeutral() {
        return this.neutral;
    }

    @Override // l70.c
    /* JADX INFO: renamed from: b, reason: from getter */
    public h getSupport() {
        return this.support;
    }

    @Override // l70.c
    /* JADX INFO: renamed from: c, reason: from getter */
    public a getBase() {
        return this.base;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DefaultColors)) {
            return false;
        }
        DefaultColors defaultColors = (DefaultColors) other;
        return t.c(this.base, defaultColors.base) && t.c(this.neutral, defaultColors.neutral) && t.c(this.support, defaultColors.support) && t.c(this.surface, defaultColors.surface);
    }

    @Override // l70.c
    public i getSurface() {
        return this.surface;
    }

    public int hashCode() {
        return (((((this.base.hashCode() * 31) + this.neutral.hashCode()) * 31) + this.support.hashCode()) * 31) + this.surface.hashCode();
    }

    public String toString() {
        return "DefaultColors(base=" + this.base + ", neutral=" + this.neutral + ", support=" + this.support + ", surface=" + this.surface + ')';
    }

    public DefaultColors(a aVar, a20.a aVar2, h hVar, i iVar) {
        this.base = aVar;
        this.neutral = aVar2;
        this.support = hVar;
        this.surface = iVar;
    }

    public /* synthetic */ DefaultColors(a aVar, a20.a aVar2, h hVar, i iVar, int i15, k kVar) {
        this((i15 & 1) != 0 ? f.f116726a : aVar, (i15 & 2) != 0 ? a20.a.b.f2065a : aVar2, (i15 & 4) != 0 ? h.b.f116747a : hVar, (i15 & 8) != 0 ? i.b.f116763a : iVar);
    }
}
