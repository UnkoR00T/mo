package h;

import android.hardware.camera2.params.MeteringRectangle;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001Jo\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0013\u0010\u0014ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"Lh/o;", "", "Lh/a;", "aeMode", "Lh/b;", "afMode", "Lh/d;", "awbMode", "", "Landroid/hardware/camera2/params/MeteringRectangle;", "aeRegions", "afRegions", "awbRegions", "Lju/w0;", "Lh/m1;", "m", "(Lh/a;Lh/b;Lh/d;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lju/w0;", "p", "()Lju/w0;", "h", "(Lh/a;)Lju/w0;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface o {
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ ju.w0 b(o oVar, a aVar, b bVar, d dVar, List list, List list2, List list3, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: update3A-ydBZfZg");
        }
        if ((i15 & 1) != 0) {
            aVar = null;
        }
        if ((i15 & 2) != 0) {
            bVar = null;
        }
        if ((i15 & 4) != 0) {
            dVar = null;
        }
        if ((i15 & 8) != 0) {
            list = null;
        }
        if ((i15 & 16) != 0) {
            list2 = null;
        }
        if ((i15 & 32) != 0) {
            list3 = null;
        }
        return oVar.m(aVar, bVar, dVar, list, list2, list3);
    }

    ju.w0<Result3A> h(a aeMode);

    ju.w0<Result3A> m(a aeMode, b afMode, d awbMode, List<MeteringRectangle> aeRegions, List<MeteringRectangle> afRegions, List<MeteringRectangle> awbRegions);

    ju.w0<Result3A> p();
}
