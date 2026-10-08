package androidx.compose.ui.graphics;

import android.graphics.Shader;
import fr.t;
import n3.f3;
import n3.k2;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u000b\u001a\u00060\tj\u0002`\n2\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R.\u0010!\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Landroidx/compose/ui/graphics/h;", "Landroidx/compose/ui/graphics/c;", "<init>", "()V", "Ln3/f3;", "d", "()Ln3/f3;", "Lm3/k;", "size", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "c", "(J)Landroid/graphics/Shader;", "Ln3/k2;", "p", "", "alpha", "Loq/i0;", "a", "(JLn3/k2;F)V", "Ln3/f3;", "internalTransformShader", "e", "J", "createdSize", "Ln3/g2;", "value", "f", "[F", "getTransform-3i98HWw", "()[F", "setTransform-Q8lPUPs", "([F)V", "transform", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class h extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private f3 internalTransformShader;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private long createdSize;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private float[] transform;

    public h() {
        super(null);
        this.createdSize = m3.k.INSTANCE.a();
    }

    private final f3 d() {
        f3 f3Var = this.internalTransformShader;
        if (f3Var != null) {
            return f3Var;
        }
        f3 f3Var2 = new f3();
        this.internalTransformShader = f3Var2;
        return f3Var2;
    }

    @Override // androidx.compose.ui.graphics.c
    public final void a(long size, k2 p15, float alpha) {
        f3 f3VarD = this.internalTransformShader;
        if (f3VarD == null || !m3.k.f(this.createdSize, size)) {
            if (m3.k.k(size)) {
                this.internalTransformShader = null;
                this.createdSize = m3.k.INSTANCE.a();
                f3VarD = null;
            } else {
                f3VarD = d();
                float[] fArr = this.transform;
                if (fArr != null) {
                    f3VarD.d(fArr);
                }
                f3VarD.c(c(size));
                this.internalTransformShader = f3VarD;
                this.createdSize = size;
            }
        }
        long jB = p15.b();
        Color.Companion companion = Color.INSTANCE;
        if (!Color.m11equalsimpl0(jB, companion.a())) {
            p15.m(companion.a());
        }
        if (!t.c(p15.r(), f3VarD != null ? f3VarD.getShader() : null)) {
            p15.q(f3VarD != null ? f3VarD.getShader() : null);
        }
        if (p15.a() == alpha) {
            return;
        }
        p15.g(alpha);
    }

    public abstract Shader c(long size);
}
