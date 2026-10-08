package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.v1;
import g4.l0;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BK\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Landroidx/compose/foundation/layout/c;", "Lg4/l0;", "Landroidx/compose/foundation/layout/f;", "Lc5/h;", "minWidth", "minHeight", "maxWidth", "maxHeight", "", "enforceIncoming", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/v1;", "Loq/i0;", "inspectorInfo", "<init>", "(FFFFZLer/l;Lfr/k;)V", "a", "()Landroidx/compose/foundation/layout/f;", "node", "l", "(Landroidx/compose/foundation/layout/f;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "d", "F", "e", "f", "g", "h", "Z", "i", "Ler/l;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class c extends l0<f> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float minWidth;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float minHeight;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final float maxWidth;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final float maxHeight;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean enforceIncoming;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final er.l<v1, i0> inspectorInfo;

    public /* synthetic */ c(float f15, float f16, float f17, float f18, boolean z15, er.l lVar, fr.k kVar) {
        this(f15, f16, f17, f18, z15, lVar);
    }

    @Override // g4.l0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public f create() {
        return new f(this.minWidth, this.minHeight, this.maxWidth, this.maxHeight, this.enforceIncoming, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof c)) {
            return false;
        }
        c cVar = (c) other;
        return c5.h.p(this.minWidth, cVar.minWidth) && c5.h.p(this.minHeight, cVar.minHeight) && c5.h.p(this.maxWidth, cVar.maxWidth) && c5.h.p(this.maxHeight, cVar.maxHeight) && this.enforceIncoming == cVar.enforceIncoming;
    }

    public int hashCode() {
        return (((((((c5.h.q(this.minWidth) * 31) + c5.h.q(this.minHeight)) * 31) + c5.h.q(this.maxWidth)) * 31) + c5.h.q(this.maxHeight)) * 31) + Boolean.hashCode(this.enforceIncoming);
    }

    @Override // g4.l0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void update(f node) {
        node.u3(this.minWidth);
        node.t3(this.minHeight);
        node.s3(this.maxWidth);
        node.r3(this.maxHeight);
        node.q3(this.enforceIncoming);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private c(float f15, float f16, float f17, float f18, boolean z15, er.l<? super v1, i0> lVar) {
        this.minWidth = f15;
        this.minHeight = f16;
        this.maxWidth = f17;
        this.maxHeight = f18;
        this.enforceIncoming = z15;
        this.inspectorInfo = lVar;
    }

    public /* synthetic */ c(float f15, float f16, float f17, float f18, boolean z15, er.l lVar, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? c5.h.INSTANCE.c() : f15, (i15 & 2) != 0 ? c5.h.INSTANCE.c() : f16, (i15 & 4) != 0 ? c5.h.INSTANCE.c() : f17, (i15 & 8) != 0 ? c5.h.INSTANCE.c() : f18, z15, lVar, null);
    }
}
