package p143z0;

import a4.PointerInputChange;
import a4.o;
import android.os.Build;
import android.view.ViewConfiguration;
import c5.d;
import c5.h;
import java.util.List;
import m3.e;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0001¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0007*\u00020\u0006H\u0001¢\u0006\u0004\b\n\u0010\tJ#\u0010\u0010\u001a\u00020\u000f*\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lz0/u;", "Lz0/d2;", "Landroid/view/ViewConfiguration;", "viewConfiguration", "<init>", "(Landroid/view/ViewConfiguration;)V", "Lc5/d;", "", "e", "(Lc5/d;)F", "d", "La4/o;", "event", "Lc5/r;", "bounds", "Lm3/e;", "c", "(Lc5/d;La4/o;J)J", "a", "Landroid/view/ViewConfiguration;", "getViewConfiguration", "()Landroid/view/ViewConfiguration;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ViewConfiguration viewConfiguration;

    public u(ViewConfiguration viewConfiguration) {
        this.viewConfiguration = viewConfiguration;
    }

    @Override // p143z0.d2
    public long c(d dVar, o oVar, long j15) {
        float f15 = -e(dVar);
        float f16 = -d(dVar);
        List<PointerInputChange> listC = oVar.c();
        e eVarD = e.d(e.INSTANCE.c());
        int size = listC.size();
        for (int i15 = 0; i15 < size; i15++) {
            eVarD = e.d(e.q(eVarD.getPackedValue(), listC.get(i15).getScrollDelta()));
        }
        long packedValue = eVarD.getPackedValue();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (packedValue >> 32)) * f16;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (packedValue & BodyPartID.bodyIdMax)) * f15;
        return e.e((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & BodyPartID.bodyIdMax));
    }

    public final float d(d dVar) {
        return Build.VERSION.SDK_INT > 26 ? o3.f231522a.a(this.viewConfiguration) : dVar.l2(h.n(64));
    }

    public final float e(d dVar) {
        return Build.VERSION.SDK_INT > 26 ? o3.f231522a.b(this.viewConfiguration) : dVar.l2(h.n(64));
    }
}
