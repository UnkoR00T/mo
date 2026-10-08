package w0;

import android.content.Context;
import androidx.compose.ui.graphics.Color;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lw0/e;", "Lw0/h2;", "Landroid/content/Context;", "context", "Lc5/d;", "density", "Landroidx/compose/ui/graphics/Color;", "glowColor", "Ld1/d3;", "glowDrawPadding", "<init>", "(Landroid/content/Context;Lc5/d;JLd1/d3;Lfr/k;)V", "Lw0/g2;", "a", "()Lw0/g2;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/content/Context;", "b", "Lc5/d;", "c", "J", "d", "Ld1/d3;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class e implements h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c5.d density;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long glowColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final d1.d3 glowDrawPadding;

    public /* synthetic */ e(Context context, c5.d dVar, long j15, d1.d3 d3Var, fr.k kVar) {
        this(context, dVar, j15, d3Var);
    }

    @Override // w0.h2
    public g2 a() {
        return new d(this.context, this.density, this.glowColor, this.glowDrawPadding, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!fr.t.c(e.class, other != null ? other.getClass() : null)) {
            return false;
        }
        e eVar = (e) other;
        return fr.t.c(this.context, eVar.context) && fr.t.c(this.density, eVar.density) && Color.m11equalsimpl0(this.glowColor, eVar.glowColor) && fr.t.c(this.glowDrawPadding, eVar.glowDrawPadding);
    }

    public int hashCode() {
        return (((((this.context.hashCode() * 31) + this.density.hashCode()) * 31) + Color.m17hashCodeimpl(this.glowColor)) * 31) + this.glowDrawPadding.hashCode();
    }

    private e(Context context, c5.d dVar, long j15, d1.d3 d3Var) {
        this.context = context;
        this.density = dVar;
        this.glowColor = j15;
        this.glowDrawPadding = d3Var;
    }
}
