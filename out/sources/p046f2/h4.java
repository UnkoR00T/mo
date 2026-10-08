package p046f2;

import androidx.compose.ui.graphics.Color;
import p071kotlin.Metadata;
import p076m2.b4;
import p076m2.d0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0006"}, d2 = {"Lm2/b4;", "Landroidx/compose/ui/graphics/Color;", "a", "Lm2/b4;", "()Lm2/b4;", "LocalContentColor", "material3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class h4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b4<Color> f56054a = d0.h(null, a.f56055a, 1, null);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements er.a<Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f56055a = new a();

        a() {
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ Color a() {
            return Color.m0boximpl(c());
        }

        public final long c() {
            return Color.INSTANCE.a();
        }
    }

    public static final b4<Color> a() {
        return f56054a;
    }
}
