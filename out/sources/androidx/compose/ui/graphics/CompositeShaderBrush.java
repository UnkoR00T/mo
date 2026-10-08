package androidx.compose.ui.graphics;

import android.graphics.Shader;
import fr.t;
import n3.a1;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.e, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\f\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0015¨\u0006\""}, d2 = {"Landroidx/compose/ui/graphics/e;", "Landroidx/compose/ui/graphics/h;", "dstBrush", "srcBrush", "Ln3/a1;", "blendMode", "<init>", "(Landroidx/compose/ui/graphics/h;Landroidx/compose/ui/graphics/h;ILfr/k;)V", "Lm3/k;", "size", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "c", "(J)Landroid/graphics/Shader;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "g", "Landroidx/compose/ui/graphics/h;", "getDstBrush", "()Landroidx/compose/ui/graphics/h;", "h", "e", "i", "I", "getBlendMode-0nO6VwU", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CompositeShaderBrush extends h {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final h dstBrush;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final h srcBrush;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final int blendMode;

    public /* synthetic */ CompositeShaderBrush(h hVar, h hVar2, int i15, fr.k kVar) {
        this(hVar, hVar2, i15);
    }

    @Override // androidx.compose.ui.graphics.h
    public Shader c(long size) {
        return i.a(this.dstBrush.c(size), this.srcBrush.c(size), this.blendMode);
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final h getSrcBrush() {
        return this.srcBrush;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompositeShaderBrush)) {
            return false;
        }
        CompositeShaderBrush compositeShaderBrush = (CompositeShaderBrush) other;
        return t.c(this.dstBrush, compositeShaderBrush.dstBrush) && t.c(this.srcBrush, compositeShaderBrush.srcBrush) && a1.E(this.blendMode, compositeShaderBrush.blendMode);
    }

    public int hashCode() {
        return (((this.dstBrush.hashCode() * 31) + this.srcBrush.hashCode()) * 31) + a1.F(this.blendMode);
    }

    public String toString() {
        return "CompositeShaderBrush(dstBrush=" + this.dstBrush + ", srcBrush=" + this.srcBrush + ", blendMode=" + ((Object) a1.G(this.blendMode)) + ')';
    }

    private CompositeShaderBrush(h hVar, h hVar2, int i15) {
        this.dstBrush = hVar;
        this.srcBrush = hVar2;
        this.blendMode = i15;
    }
}
