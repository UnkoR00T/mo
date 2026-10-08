package xe;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import oq.k;
import oq.l;
import oq.o;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001b\u0010\u0005\u001a\u00020\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\n\u001a\u00020\u0007*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Landroid/os/Handler;", "a", "Loq/k;", "f", "()Landroid/os/Handler;", "MAIN_HANDLER", "Landroid/graphics/drawable/Drawable;", "Lm3/k;", "e", "(Landroid/graphics/drawable/Drawable;)J", "intrinsicSize", "drawablepainter_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final k f218106a = l.b(o.NONE, new er.a() { // from class: xe.b
        @Override // er.a
        public final Object a() {
            return c.b();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler b() {
        return new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long e(Drawable drawable) {
        return (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) ? m3.k.INSTANCE.a() : m3.l.a(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler f() {
        return (Handler) f218106a.getValue();
    }
}
