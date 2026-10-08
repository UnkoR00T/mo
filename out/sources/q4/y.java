package q4;

import androidx.compose.ui.graphics.Color;
import java.util.List;
import n3.Shadow;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0013\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0018\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\u001c\u0010\u0015J\u001f\u0010\u001e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0016H&¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020 2\u0006\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b#\u0010\"J\u0017\u0010%\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\rH&¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'H&¢\u0006\u0004\b)\u0010*J'\u00101\u001a\u0002002\u0006\u0010+\u001a\u00020\t2\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H&¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b3\u0010\u000bJ)\u00109\u001a\u0002082\u0006\u00104\u001a\u0002002\u0006\u00106\u001a\u0002052\b\b\u0001\u00107\u001a\u00020\u0002H&¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u0002002\u0006\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b;\u0010<JO\u0010I\u001a\u0002082\u0006\u0010>\u001a\u00020=2\b\b\u0002\u0010@\u001a\u00020?2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010A2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010C2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010E2\b\b\u0002\u0010H\u001a\u00020GH&¢\u0006\u0004\bI\u0010JJW\u0010N\u001a\u0002082\u0006\u0010>\u001a\u00020=2\u0006\u0010L\u001a\u00020K2\b\b\u0002\u0010M\u001a\u00020\r2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010A2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010C2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010E2\b\b\u0002\u0010H\u001a\u00020GH&¢\u0006\u0004\bN\u0010OR\u0014\u0010R\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0014\u0010T\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bS\u0010QR\u0014\u0010V\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bU\u0010QR\u0014\u0010X\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bW\u0010QR\u0014\u0010Z\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bY\u0010QR\u0014\u0010\\\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b[\u0010QR\u0014\u0010_\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^R\u0014\u0010b\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b`\u0010aR\u001c\u0010f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0c8&X¦\u0004¢\u0006\u0006\u001a\u0004\bd\u0010e\u0082\u0001\u0001gø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006hÀ\u0006\u0003"}, d2 = {"Lq4/y;", "", "", "start", "end", "Ln3/m2;", "t", "(II)Ln3/m2;", "offset", "Lm3/g;", "h", "(I)Lm3/g;", "lineIndex", "", "v", "(I)F", "o", "a", "e", "p", "b", "(I)I", "", "visibleEnd", "n", "(IZ)I", "m", "(I)Z", "z", "usePrimaryDirection", "u", "(IZ)F", "Lb5/i;", "g", "(I)Lb5/i;", "B", "vertical", "s", "(F)I", "Lm3/e;", "position", "k", "(J)I", "rect", "Lq4/m3;", "granularity", "Lq4/q3;", "inclusionStrategy", "Lq4/z3;", "q", "(Lm3/g;ILq4/q3;)J", "C", "range", "", "array", "arrayStart", "Loq/i0;", "x", "(J[FI)V", "i", "(I)J", "Ln3/h1;", "canvas", "Landroidx/compose/ui/graphics/Color;", "color", "Ln3/w2;", "shadow", "Lb5/k;", "textDecoration", "Lp3/g;", "drawStyle", "Ln3/a1;", "blendMode", "w", "(Ln3/h1;JLn3/w2;Lb5/k;Lp3/g;I)V", "Landroidx/compose/ui/graphics/c;", "brush", "alpha", "A", "(Ln3/h1;Landroidx/compose/ui/graphics/c;FLn3/w2;Lb5/k;Lp3/g;I)V", "l", "()F", "width", "getHeight", "height", "f", "minIntrinsicWidth", "d", "maxIntrinsicWidth", "j", "firstBaseline", "y", "lastBaseline", "r", "()Z", "didExceedMaxLines", "c", "()I", "lineCount", "", ip.a.f96138c, "()Ljava/util/List;", "placeholderRects", "Lq4/b;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface y {
    static /* synthetic */ void E(y yVar, n3.h1 h1Var, androidx.compose.ui.graphics.c cVar, float f15, Shadow shadow, b5.k kVar, p3.g gVar, int i15, int i16, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-hn5TExg");
        }
        if ((i16 & 4) != 0) {
            f15 = Float.NaN;
        }
        yVar.A(h1Var, cVar, f15, (i16 & 8) != 0 ? null : shadow, (i16 & 16) != 0 ? null : kVar, (i16 & 32) != 0 ? null : gVar, (i16 & 64) != 0 ? p3.f.INSTANCE.a() : i15);
    }

    static /* synthetic */ void F(y yVar, n3.h1 h1Var, long j15, Shadow shadow, b5.k kVar, p3.g gVar, int i15, int i16, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-LG529CI");
        }
        yVar.w(h1Var, (i16 & 2) != 0 ? Color.INSTANCE.h() : j15, (i16 & 4) != 0 ? null : shadow, (i16 & 8) != 0 ? null : kVar, (i16 & 16) == 0 ? gVar : null, (i16 & 32) != 0 ? p3.f.INSTANCE.a() : i15);
    }

    void A(n3.h1 canvas, androidx.compose.ui.graphics.c brush, float alpha, Shadow shadow, b5.k textDecoration, p3.g drawStyle, int blendMode);

    b5.i B(int offset);

    m3.g C(int offset);

    List<m3.g> D();

    float a(int lineIndex);

    int b(int lineIndex);

    int c();

    float d();

    float e(int lineIndex);

    float f();

    b5.i g(int offset);

    float getHeight();

    m3.g h(int offset);

    long i(int offset);

    float j();

    int k(long position);

    float l();

    boolean m(int lineIndex);

    int n(int lineIndex, boolean visibleEnd);

    float o(int lineIndex);

    float p(int lineIndex);

    long q(m3.g rect, int granularity, q3 inclusionStrategy);

    boolean r();

    int s(float vertical);

    n3.m2 t(int start, int end);

    float u(int offset, boolean usePrimaryDirection);

    float v(int lineIndex);

    void w(n3.h1 canvas, long color, Shadow shadow, b5.k textDecoration, p3.g drawStyle, int blendMode);

    void x(long range, float[] array, int arrayStart);

    float y();

    int z(int offset);
}
