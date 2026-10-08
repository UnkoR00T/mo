package p079n1;

import android.view.KeyEvent;
import p071kotlin.Metadata;
import y3.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001a\u0010\u0004\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003¨\u0006\u0005"}, d2 = {"Ln1/e3;", "a", "Ln1/e3;", "()Ln1/e3;", "platformDefaultKeyMapping", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class g3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final e3 f130038a = new a();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"n1/g3$a", "Ln1/e3;", "Ly3/b;", "event", "Ln1/c3;", "a", "(Landroid/view/KeyEvent;)Ln1/c3;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements e3 {
        a() {
        }

        @Override // p079n1.e3
        public c3 a(KeyEvent event) {
            int iA = i3.a(event);
            h3.Companion companion = h3.INSTANCE;
            c3 c3Var = null;
            if (h3.j(iA, companion.b())) {
                long jA = d.a(event);
                y3.a.Companion companion2 = y3.a.INSTANCE;
                if (y3.a.R(jA, companion2.k())) {
                    c3Var = c3.SELECT_LINE_LEFT;
                } else if (y3.a.R(jA, companion2.l())) {
                    c3Var = c3.SELECT_LINE_RIGHT;
                } else if (y3.a.R(jA, companion2.m())) {
                    c3Var = c3.SELECT_HOME;
                } else if (y3.a.R(jA, companion2.j())) {
                    c3Var = c3.SELECT_END;
                }
            } else if (h3.j(iA, companion.a())) {
                long jA2 = d.a(event);
                y3.a.Companion companion3 = y3.a.INSTANCE;
                if (y3.a.R(jA2, companion3.k())) {
                    c3Var = c3.LINE_LEFT;
                } else if (y3.a.R(jA2, companion3.l())) {
                    c3Var = c3.LINE_RIGHT;
                } else if (y3.a.R(jA2, companion3.m())) {
                    c3Var = c3.HOME;
                } else if (y3.a.R(jA2, companion3.j())) {
                    c3Var = c3.END;
                } else if (y3.a.R(jA2, companion3.d())) {
                    c3Var = c3.DELETE_FROM_LINE_START;
                }
            }
            return c3Var == null ? f3.b().a(event) : c3Var;
        }
    }

    public static final e3 a() {
        return f130038a;
    }
}
