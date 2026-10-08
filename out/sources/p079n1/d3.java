package p079n1;

import android.view.KeyEvent;
import p071kotlin.Metadata;
import y3.c;
import y3.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ly3/b;", "", "a", "(Landroid/view/KeyEvent;)Z", "Loq/i0;", "b", "()V", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d3 {
    public static final boolean a(KeyEvent keyEvent) {
        return keyEvent.getKeyCode() == 4 && c.e(d.b(keyEvent), c.INSTANCE.b());
    }

    public static final void b() {
    }
}
