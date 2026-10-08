package t3;

import androidx.compose.ui.graphics.Color;
import java.util.List;
import n3.BlendModeColorFilter;
import n3.a1;
import n3.a3;
import n3.b3;
import n3.n1;
import n3.o2;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0005\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0015\u0010\b\u001a\u00020\u0002*\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\b\u0010\t\"\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0017\u0010\u0015\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014\"\u0017\u0010\u0018\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0017\u0010\u0014\"\u0017\u0010\u001b\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u001a\u0010\u0014\"\u0017\u0010\u001f\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0017\u0010!\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\f\u0010\u0014¨\u0006\""}, d2 = {"Landroidx/compose/ui/graphics/Color;", "other", "", "e", "(JJ)Z", "g", "(J)J", "Ln3/n1;", "f", "(Ln3/n1;)Z", "", "Lt3/h;", "a", "Ljava/util/List;", "d", "()Ljava/util/List;", "EmptyPath", "Ln3/a3;", "b", "I", "()I", "DefaultStrokeLineCap", "Ln3/b3;", "c", "DefaultStrokeLineJoin", "Ln3/a1;", "getDefaultTintBlendMode", "DefaultTintBlendMode", "J", "getDefaultTintColor", "()J", "DefaultTintColor", "Ln3/o2;", "DefaultFillType", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<h> f187380a = v.n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f187381b = a3.INSTANCE.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f187382c = b3.INSTANCE.b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f187383d = a1.INSTANCE.z();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f187384e = Color.INSTANCE.g();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f187385f = o2.INSTANCE.b();

    public static final int a() {
        return f187385f;
    }

    public static final int b() {
        return f187381b;
    }

    public static final int c() {
        return f187382c;
    }

    public static final List<h> d() {
        return f187380a;
    }

    public static final boolean e(long j15, long j16) {
        return Color.m16getRedimpl(j15) == Color.m16getRedimpl(j16) && Color.m15getGreenimpl(j15) == Color.m15getGreenimpl(j16) && Color.m13getBlueimpl(j15) == Color.m13getBlueimpl(j16);
    }

    public static final boolean f(n1 n1Var) {
        if (!(n1Var instanceof BlendModeColorFilter)) {
            return n1Var == null;
        }
        BlendModeColorFilter blendModeColorFilter = (BlendModeColorFilter) n1Var;
        int blendMode = blendModeColorFilter.getBlendMode();
        a1.Companion companion = a1.INSTANCE;
        return a1.E(blendMode, companion.z()) || a1.E(blendModeColorFilter.getBlendMode(), companion.B());
    }

    public static final long g(long j15) {
        return Color.m12getAlphaimpl(j15) == 1.0f ? j15 : Color.m9copywmQWz5c$default(j15, 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
    }
}
