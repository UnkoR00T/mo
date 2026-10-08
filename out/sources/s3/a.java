package s3;

import androidx.compose.ui.graphics.shadow.DropShadowPainter;
import androidx.compose.ui.graphics.shadow.InnerShadowPainter;
import c5.t;
import fr.k;
import n3.t2;
import n3.y2;
import oq.i0;
import p071kotlin.Metadata;
import r0.t0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001&B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u0006j\u0002`\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ7\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\"2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010\u0005R*\u0010(\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006j\u0004\u0018\u0001`\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010'R*\u0010)\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f\u0018\u00010\u0006j\u0004\u0018\u0001`\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010'R\u0018\u0010+\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010*¨\u0006,"}, d2 = {"Ls3/a;", "", "Landroidx/compose/ui/graphics/shadow/a;", "Landroidx/compose/ui/graphics/shadow/b;", "<init>", "()V", "Lr0/t0;", "Ls3/a$a;", "Ls3/e;", "Landroidx/compose/ui/graphics/shadow/DropShadowCache;", "f", "()Lr0/t0;", "Ls3/f;", "Landroidx/compose/ui/graphics/shadow/InnerShadowCache;", "g", "h", "()Ls3/a$a;", "Ln3/y2;", "shape", "Lm3/k;", "size", "Lc5/t;", "layoutDirection", "Lc5/d;", "density", "Ls3/g;", "shadow", "b", "(Ln3/y2;JLc5/t;Lc5/d;Ls3/g;)Ls3/e;", "c", "(Ln3/y2;JLc5/t;Lc5/d;Ls3/g;)Ls3/f;", "Landroidx/compose/ui/graphics/shadow/DropShadowPainter;", "d", "(Ln3/y2;Ls3/g;)Landroidx/compose/ui/graphics/shadow/DropShadowPainter;", "Landroidx/compose/ui/graphics/shadow/InnerShadowPainter;", "e", "(Ln3/y2;Ls3/g;)Landroidx/compose/ui/graphics/shadow/InnerShadowPainter;", "Loq/i0;", "a", "Lr0/t0;", "dropShadowCache", "innerShadowCache", "Ls3/a$a;", "shadowKey", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class a implements h, androidx.compose.ui.graphics.shadow.a, androidx.compose.ui.graphics.shadow.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private t0<ShadowKey, e> dropShadowCache;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private t0<ShadowKey, f> innerShadowCache;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private ShadowKey shadowKey;

    /* JADX INFO: renamed from: s3.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJD\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010+\u001a\u0004\b,\u0010-\"\u0004\b%\u0010.R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b/\u00103¨\u00064"}, d2 = {"Ls3/a$a;", "", "Ln3/y2;", "shape", "Lm3/k;", "size", "Lc5/t;", "layoutDirection", "", "density", "Ls3/g;", "shadow", "<init>", "(Ln3/y2;JLc5/t;FLs3/g;Lfr/k;)V", "a", "(Ln3/y2;JLc5/t;FLs3/g;)Ls3/a$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ln3/y2;", "getShape", "()Ln3/y2;", "f", "(Ln3/y2;)V", "b", "J", "getSize-NH-jbRc", "()J", "g", "(J)V", "c", "Lc5/t;", "getLayoutDirection", "()Lc5/t;", "d", "(Lc5/t;)V", "F", "getDensity", "()F", "(F)V", "e", "Ls3/g;", "getShadow", "()Ls3/g;", "(Ls3/g;)V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ShadowKey {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private y2 shape;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private long size;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private t layoutDirection;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private float density;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private Shadow shadow;

        public /* synthetic */ ShadowKey(y2 y2Var, long j15, t tVar, float f15, Shadow shadow, k kVar) {
            this(y2Var, j15, tVar, f15, shadow);
        }

        public static /* synthetic */ ShadowKey b(ShadowKey shadowKey, y2 y2Var, long j15, t tVar, float f15, Shadow shadow, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                y2Var = shadowKey.shape;
            }
            if ((i15 & 2) != 0) {
                j15 = shadowKey.size;
            }
            if ((i15 & 4) != 0) {
                tVar = shadowKey.layoutDirection;
            }
            if ((i15 & 8) != 0) {
                f15 = shadowKey.density;
            }
            if ((i15 & 16) != 0) {
                shadow = shadowKey.shadow;
            }
            Shadow shadow2 = shadow;
            t tVar2 = tVar;
            return shadowKey.a(y2Var, j15, tVar2, f15, shadow2);
        }

        public final ShadowKey a(y2 shape, long size, t layoutDirection, float density, Shadow shadow) {
            return new ShadowKey(shape, size, layoutDirection, density, shadow, null);
        }

        public final void c(float f15) {
            this.density = f15;
        }

        public final void d(t tVar) {
            this.layoutDirection = tVar;
        }

        public final void e(Shadow shadow) {
            this.shadow = shadow;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShadowKey)) {
                return false;
            }
            ShadowKey shadowKey = (ShadowKey) other;
            return fr.t.c(this.shape, shadowKey.shape) && m3.k.f(this.size, shadowKey.size) && this.layoutDirection == shadowKey.layoutDirection && Float.compare(this.density, shadowKey.density) == 0 && fr.t.c(this.shadow, shadowKey.shadow);
        }

        public final void f(y2 y2Var) {
            this.shape = y2Var;
        }

        public final void g(long j15) {
            this.size = j15;
        }

        public int hashCode() {
            int iHashCode = ((((((this.shape.hashCode() * 31) + m3.k.j(this.size)) * 31) + this.layoutDirection.hashCode()) * 31) + Float.hashCode(this.density)) * 31;
            Shadow shadow = this.shadow;
            return iHashCode + (shadow == null ? 0 : shadow.hashCode());
        }

        public String toString() {
            return "ShadowKey(shape=" + this.shape + ", size=" + ((Object) m3.k.l(this.size)) + ", layoutDirection=" + this.layoutDirection + ", density=" + this.density + ", shadow=" + this.shadow + ')';
        }

        private ShadowKey(y2 y2Var, long j15, t tVar, float f15, Shadow shadow) {
            this.shape = y2Var;
            this.size = j15;
            this.layoutDirection = tVar;
            this.density = f15;
            this.shadow = shadow;
        }

        public /* synthetic */ ShadowKey(y2 y2Var, long j15, t tVar, float f15, Shadow shadow, int i15, k kVar) {
            this((i15 & 1) != 0 ? t2.a() : y2Var, (i15 & 2) != 0 ? m3.k.INSTANCE.b() : j15, (i15 & 4) != 0 ? t.Ltr : tVar, (i15 & 8) != 0 ? 1.0f : f15, (i15 & 16) != 0 ? null : shadow, null);
        }
    }

    private final t0<ShadowKey, e> f() {
        t0<ShadowKey, e> t0Var = this.dropShadowCache;
        if (t0Var != null) {
            return t0Var;
        }
        t0<ShadowKey, e> t0Var2 = new t0<>(0, 1, null);
        this.dropShadowCache = t0Var2;
        return t0Var2;
    }

    private final t0<ShadowKey, f> g() {
        t0<ShadowKey, f> t0Var = this.innerShadowCache;
        if (t0Var != null) {
            return t0Var;
        }
        t0<ShadowKey, f> t0Var2 = new t0<>(0, 1, null);
        this.innerShadowCache = t0Var2;
        return t0Var2;
    }

    private final ShadowKey h() {
        ShadowKey shadowKey = this.shadowKey;
        if (shadowKey != null) {
            return shadowKey;
        }
        ShadowKey shadowKey2 = new ShadowKey(null, 0L, null, 0.0f, null, 31, null);
        this.shadowKey = shadowKey2;
        return shadowKey2;
    }

    @Override // s3.h
    public void a() {
        synchronized (this) {
            try {
                t0<ShadowKey, e> t0Var = this.dropShadowCache;
                if (t0Var != null) {
                    t0Var.k();
                }
                t0<ShadowKey, f> t0Var2 = this.innerShadowCache;
                if (t0Var2 != null) {
                    t0Var2.k();
                }
                this.shadowKey = null;
                i0 i0Var = i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // androidx.compose.ui.graphics.shadow.a
    public e b(y2 shape, long size, t layoutDirection, c5.d density, Shadow shadow) {
        e eVarE;
        synchronized (this) {
            ShadowKey shadowKeyH = h();
            shadowKeyH.f(shape);
            shadowKeyH.g(size);
            shadowKeyH.d(layoutDirection);
            shadowKeyH.c(density.getDensity());
            shadowKeyH.e(shadow.a());
            eVarE = f().e(shadowKeyH);
            if (eVarE == null) {
                e eVar = new e(shadow, shape.a(size, layoutDirection, density));
                f().x(ShadowKey.b(shadowKeyH, null, 0L, null, 0.0f, null, 31, null), eVar);
                eVarE = eVar;
            }
        }
        return eVarE;
    }

    @Override // androidx.compose.ui.graphics.shadow.b
    public f c(y2 shape, long size, t layoutDirection, c5.d density, Shadow shadow) {
        f fVarE;
        synchronized (this) {
            ShadowKey shadowKeyH = h();
            shadowKeyH.f(shape);
            shadowKeyH.g(size);
            shadowKeyH.d(layoutDirection);
            shadowKeyH.c(density.getDensity());
            shadowKeyH.e(shadow);
            fVarE = g().e(shadowKeyH);
            if (fVarE == null) {
                f fVar = new f(shadow, shape.a(size, layoutDirection, density));
                g().x(ShadowKey.b(shadowKeyH, null, 0L, null, 0.0f, null, 31, null), fVar);
                fVarE = fVar;
            }
        }
        return fVarE;
    }

    @Override // s3.h
    public DropShadowPainter d(y2 shape, Shadow shadow) {
        return new DropShadowPainter(shape, shadow, this);
    }

    @Override // s3.h
    public InnerShadowPainter e(y2 shape, Shadow shadow) {
        return new InnerShadowPainter(shape, shadow, this);
    }
}
