package b5;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\b`\u0018\u0000 \u00112\u00020\u0001:\u0002\t\u0011J\u0017\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\u0006\u001a\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Lb5/p;", "", "other", "d", "(Lb5/p;)Lb5/p;", "Lkotlin/Function0;", "f", "(Ler/a;)Lb5/p;", "Landroidx/compose/ui/graphics/Color;", "b", "()J", "color", "Landroidx/compose/ui/graphics/c;", "h", "()Landroidx/compose/ui/graphics/c;", "brush", "", "a", "()F", "alpha", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f16646a;

    /* JADX INFO: renamed from: b5.p$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lb5/p$a;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Color;", "color", "Lb5/p;", "b", "(J)Lb5/p;", "Landroidx/compose/ui/graphics/c;", "brush", "", "alpha", "a", "(Landroidx/compose/ui/graphics/c;F)Lb5/p;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f16646a = new Companion();

        private Companion() {
        }

        public final p a(androidx.compose.ui.graphics.c brush, float alpha) {
            if (brush == null) {
                return b.f16647b;
            }
            if (brush instanceof SolidColor) {
                return b(m.c(((SolidColor) brush).getValue(), alpha));
            }
            if (brush instanceof androidx.compose.ui.graphics.h) {
                return new BrushStyle((androidx.compose.ui.graphics.h) brush, alpha);
            }
            throw new oq.p();
        }

        public final p b(long color) {
            return color != 16 ? new ColorStyle(color, null) : b.f16647b;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lb5/p$b;", "Lb5/p;", "<init>", "()V", "Landroidx/compose/ui/graphics/Color;", "b", "()J", "color", "Landroidx/compose/ui/graphics/c;", "h", "()Landroidx/compose/ui/graphics/c;", "brush", "", "a", "()F", "alpha", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f16647b = new b();

        private b() {
        }

        @Override // b5.p
        /* JADX INFO: renamed from: a */
        public float getAlpha() {
            return Float.NaN;
        }

        @Override // b5.p
        /* JADX INFO: renamed from: b */
        public long getValue() {
            return Color.INSTANCE.h();
        }

        @Override // b5.p
        public androidx.compose.ui.graphics.c h() {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static p c(p pVar) {
        return pVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static float e(p pVar) {
        return ((BrushStyle) pVar).getAlpha();
    }

    /* JADX INFO: renamed from: a */
    float getAlpha();

    /* JADX INFO: renamed from: b */
    long getValue();

    default p d(p other) {
        boolean z15 = other instanceof BrushStyle;
        if (z15 && (this instanceof BrushStyle)) {
            BrushStyle cVar = (BrushStyle) other;
            return new BrushStyle(cVar.getValue(), m.d(cVar.getAlpha(), new er.a() { // from class: b5.n
                @Override // er.a
                public final Object a() {
                    return Float.valueOf(p.e(this.f16643a));
                }
            }));
        }
        if (!z15 || (this instanceof BrushStyle)) {
            return (z15 || !(this instanceof BrushStyle)) ? other.f(new er.a() { // from class: b5.o
                @Override // er.a
                public final Object a() {
                    return p.c(this.f16644a);
                }
            }) : this;
        }
        return other;
    }

    default p f(er.a<? extends p> other) {
        return !fr.t.c(this, b.f16647b) ? this : other.a();
    }

    androidx.compose.ui.graphics.c h();
}
