package p079n1;

import android.view.InputDevice;
import android.view.KeyEvent;
import androidx.compose.ui.platform.r2;
import er.l;
import f3.m;
import l3.g;
import l3.o;
import p071kotlin.Metadata;
import y3.b;
import y3.c;
import y3.d;
import y3.f;
import y3.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\u000b\u001a\u00020\n*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lf3/m;", "Ln1/s3;", "state", "Ll3/o;", "focusManager", "b", "(Lf3/m;Ln1/s3;Ll3/o;)Lf3/m;", "Ly3/b;", "", "keyCode", "", "c", "(Landroid/view/KeyEvent;I)Z", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class u4 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements l<b, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ o f130478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ s3 f130479b;

        a(o oVar, s3 s3Var) {
            this.f130478a = oVar;
            this.f130479b = s3Var;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Boolean b(b bVar) {
            return c(bVar.getNativeKeyEvent());
        }

        public final Boolean c(KeyEvent keyEvent) {
            InputDevice device = keyEvent.getDevice();
            boolean zH = false;
            if (device != null && device.supportsSource(513) && ((!device.isVirtual() || keyEvent.getSource() == 33554433) && c.e(d.b(keyEvent), c.INSTANCE.a()) && keyEvent.getSource() != 257)) {
                if (u4.c(keyEvent, 19)) {
                    zH = this.f130478a.h(g.INSTANCE.h());
                } else if (u4.c(keyEvent, 20)) {
                    zH = this.f130478a.h(g.INSTANCE.a());
                } else if (u4.c(keyEvent, 21)) {
                    zH = this.f130478a.h(g.INSTANCE.d());
                } else if (u4.c(keyEvent, 22)) {
                    zH = this.f130478a.h(g.INSTANCE.g());
                } else if (u4.c(keyEvent, 23)) {
                    r2 keyboardController = this.f130479b.getKeyboardController();
                    if (keyboardController != null) {
                        keyboardController.a();
                    }
                    zH = true;
                }
            }
            return Boolean.valueOf(zH);
        }
    }

    public static final m b(m mVar, s3 s3Var, o oVar) {
        return f.b(mVar, new a(oVar, s3Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(KeyEvent keyEvent, int i15) {
        return i.b(d.a(keyEvent)) == i15;
    }
}
