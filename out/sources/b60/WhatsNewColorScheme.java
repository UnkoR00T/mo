package b60;

import androidx.compose.ui.graphics.Color;
import er.p;
import fr.t;
import p071kotlin.Metadata;
import p076m2.r;

/* JADX INFO: renamed from: b60.a, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\t\u0010\nJH\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006!"}, d2 = {"Lb60/a;", "", "Landroidx/compose/ui/graphics/Color;", "container", "overlay", "progressActive", "progressInactive", "Lkotlin/Function0;", "primaryButton", "<init>", "(JJJJLer/p;Lfr/k;)V", "a", "(JJJJLer/p;)Lb60/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "c", "()J", "b", "d", "f", "g", "e", "Ler/p;", "()Ler/p;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WhatsNewColorScheme {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long container;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long overlay;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long progressActive;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final long progressInactive;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final p<r, Integer, Color> primaryButton;

    public /* synthetic */ WhatsNewColorScheme(long j15, long j16, long j17, long j18, p pVar, fr.k kVar) {
        this(j15, j16, j17, j18, pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WhatsNewColorScheme b(WhatsNewColorScheme whatsNewColorScheme, long j15, long j16, long j17, long j18, p pVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            j15 = whatsNewColorScheme.container;
        }
        long j19 = j15;
        if ((i15 & 2) != 0) {
            j16 = whatsNewColorScheme.overlay;
        }
        return whatsNewColorScheme.a(j19, j16, (i15 & 4) != 0 ? whatsNewColorScheme.progressActive : j17, (i15 & 8) != 0 ? whatsNewColorScheme.progressInactive : j18, (i15 & 16) != 0 ? whatsNewColorScheme.primaryButton : pVar);
    }

    public final WhatsNewColorScheme a(long container, long overlay, long progressActive, long progressInactive, p<? super r, ? super Integer, Color> primaryButton) {
        return new WhatsNewColorScheme(container, overlay, progressActive, progressInactive, primaryButton, null);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getContainer() {
        return this.container;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getOverlay() {
        return this.overlay;
    }

    public final p<r, Integer, Color> e() {
        return this.primaryButton;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WhatsNewColorScheme)) {
            return false;
        }
        WhatsNewColorScheme whatsNewColorScheme = (WhatsNewColorScheme) other;
        return Color.m11equalsimpl0(this.container, whatsNewColorScheme.container) && Color.m11equalsimpl0(this.overlay, whatsNewColorScheme.overlay) && Color.m11equalsimpl0(this.progressActive, whatsNewColorScheme.progressActive) && Color.m11equalsimpl0(this.progressInactive, whatsNewColorScheme.progressInactive) && t.c(this.primaryButton, whatsNewColorScheme.primaryButton);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getProgressActive() {
        return this.progressActive;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getProgressInactive() {
        return this.progressInactive;
    }

    public int hashCode() {
        return (((((((Color.m17hashCodeimpl(this.container) * 31) + Color.m17hashCodeimpl(this.overlay)) * 31) + Color.m17hashCodeimpl(this.progressActive)) * 31) + Color.m17hashCodeimpl(this.progressInactive)) * 31) + this.primaryButton.hashCode();
    }

    public String toString() {
        return "WhatsNewColorScheme(container=" + ((Object) Color.m18toStringimpl(this.container)) + ", overlay=" + ((Object) Color.m18toStringimpl(this.overlay)) + ", progressActive=" + ((Object) Color.m18toStringimpl(this.progressActive)) + ", progressInactive=" + ((Object) Color.m18toStringimpl(this.progressInactive)) + ", primaryButton=" + this.primaryButton + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    private WhatsNewColorScheme(long j15, long j16, long j17, long j18, p<? super r, ? super Integer, Color> pVar) {
        this.container = j15;
        this.overlay = j16;
        this.progressActive = j17;
        this.progressInactive = j18;
        this.primaryButton = pVar;
    }
}
