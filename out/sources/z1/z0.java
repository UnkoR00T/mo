package z1;

import a4.PointerInputChange;
import android.view.MotionEvent;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u001a\u0010\b\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\t"}, d2 = {"La4/o;", "", "b", "(La4/o;)Z", "Lz1/p0;", "a", "Lz1/p0;", "()Lz1/p0;", "FirstLongPressSelectionAdjustment", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p0 f232268a = p0.INSTANCE.n();

    public static final p0 a() {
        return f232268a;
    }

    public static final boolean b(a4.o oVar) {
        MotionEvent motionEventG;
        List<PointerInputChange> listC = oVar.c();
        int size = listC.size();
        for (int i15 = 0; i15 < size; i15++) {
            if (!a4.p0.i(listC.get(i15).getType(), a4.p0.INSTANCE.b())) {
                MotionEvent motionEventG2 = oVar.g();
                if ((motionEventG2 == null || !motionEventG2.isFromSource(8194)) && ((motionEventG = oVar.g()) == null || !motionEventG.isFromSource(1048584))) {
                    return false;
                }
            }
        }
        return true;
    }
}
