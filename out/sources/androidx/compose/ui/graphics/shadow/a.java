package androidx.compose.ui.graphics.shadow;

import c5.d;
import c5.t;
import n3.y2;
import p071kotlin.Metadata;
import s3.Shadow;
import s3.e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bà\u0080\u0001\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ7\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/graphics/shadow/a;", "", "Ln3/y2;", "shape", "Lm3/k;", "size", "Lc5/t;", "layoutDirection", "Lc5/d;", "density", "Ls3/g;", "shadow", "Ls3/e;", "b", "(Ln3/y2;JLc5/t;Lc5/d;Ls3/g;)Ls3/e;", "a", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f9977a;

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.shadow.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/compose/ui/graphics/shadow/a$a;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/shadow/a;", "b", "Landroidx/compose/ui/graphics/shadow/a;", "a", "()Landroidx/compose/ui/graphics/shadow/a;", "Default", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f9977a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final a Default = C0214a.f9979c;

        /* JADX INFO: renamed from: androidx.compose.ui.graphics.shadow.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\n¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Ln3/y2;", "shape", "Lm3/k;", "size", "Lc5/t;", "layoutDirection", "Lc5/d;", "density", "Ls3/g;", "dropShadow", "Ls3/e;", "b", "(Ln3/y2;JLc5/t;Lc5/d;Ls3/g;)Ls3/e;"}, k = 3, mv = {2, 1, 0})
        static final class C0214a implements a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final C0214a f9979c = new C0214a();

            C0214a() {
            }

            @Override // androidx.compose.ui.graphics.shadow.a
            public final e b(y2 y2Var, long j15, t tVar, d dVar, Shadow shadow) {
                return new e(shadow, y2Var.a(j15, tVar, dVar));
            }
        }

        private Companion() {
        }

        public final a a() {
            return Default;
        }
    }

    e b(y2 shape, long size, t layoutDirection, d density, Shadow shadow);
}
