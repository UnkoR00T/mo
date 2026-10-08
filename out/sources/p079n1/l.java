package p079n1;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.c;
import p071kotlin.Metadata;
import p076m2.b4;
import p076m2.d0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a'\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\t\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/graphics/c;", "brush", "Landroidx/compose/ui/graphics/Color;", "color", "defaultColor", "e", "(Landroidx/compose/ui/graphics/c;JJ)Landroidx/compose/ui/graphics/c;", "Lm2/b4;", "a", "Lm2/b4;", "c", "()Lm2/b4;", "LocalAutofillHighlightBrush", "b", "d", "getLocalAutofillHighlightColor$annotations", "()V", "LocalAutofillHighlightColor", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b4<c> f130175a = d0.h(null, new er.a() { // from class: n1.k
        @Override // er.a
        public final Object a() {
            return l.b();
        }
    }, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b4<Color> f130176b = d0.h(null, a.f130177a, 1, null);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements er.a<Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f130177a = new a();

        a() {
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ Color a() {
            return Color.m0boximpl(c());
        }

        public final long c() {
            return m.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c b() {
        return new SolidColor(m.a(), null);
    }

    public static final b4<c> c() {
        return f130175a;
    }

    public static final b4<Color> d() {
        return f130176b;
    }

    public static final c e(c cVar, long j15, long j16) {
        return !Color.m11equalsimpl0(j15, j16) ? new SolidColor(j15, null) : cVar;
    }
}
