package androidx.compose.ui.graphics;

import n3.f2;
import n3.k2;
import n3.o1;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.j, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001c\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001b\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Landroidx/compose/ui/graphics/j;", "Landroidx/compose/ui/graphics/c;", "Ln3/f2;", "Landroidx/compose/ui/graphics/Color;", "value", "<init>", "(JLfr/k;)V", "Lm3/k;", "size", "Ln3/k2;", "p", "", "alpha", "Loq/i0;", "a", "(JLn3/k2;F)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "t", "b", "(Ljava/lang/Object;F)Ljava/lang/Object;", "d", "J", "c", "()J", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SolidColor extends c implements f2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final long value;

    public /* synthetic */ SolidColor(long j15, fr.k kVar) {
        this(j15);
    }

    @Override // androidx.compose.ui.graphics.c
    public void a(long size, k2 p15, float alpha) {
        long jM9copywmQWz5c$default;
        p15.g(1.0f);
        if (alpha == 1.0f) {
            jM9copywmQWz5c$default = this.value;
        } else {
            long j15 = this.value;
            jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(j15, Color.m12getAlphaimpl(j15) * alpha, 0.0f, 0.0f, 0.0f, 14, null);
        }
        p15.m(jM9copywmQWz5c$default);
        if (p15.getInternalShader() != null) {
            p15.q(null);
        }
    }

    @Override // n3.f2
    public Object b(Object other, float t15) {
        fr.k kVar = null;
        if (other == null) {
            other = new SolidColor(Color.INSTANCE.g(), kVar);
        }
        if (other instanceof SolidColor) {
            return new SolidColor(o1.h(this.value, ((SolidColor) other).value, t15), kVar);
        }
        return null;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getValue() {
        return this.value;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SolidColor) && Color.m11equalsimpl0(this.value, ((SolidColor) other).value);
    }

    public int hashCode() {
        return Color.m17hashCodeimpl(this.value);
    }

    public String toString() {
        return "SolidColor(value=" + ((Object) Color.m18toStringimpl(this.value)) + ')';
    }

    private SolidColor(long j15) {
        super(null);
        this.value = j15;
    }
}
