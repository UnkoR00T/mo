package a4;

import android.view.MotionEvent;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a/\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a/\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0000¢\u0006\u0004\b\t\u0010\b\u001a-\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0000¢\u0006\u0004\b\f\u0010\r\u001a7\u0010\u0010\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"La4/o;", "Lm3/e;", "offset", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "Loq/i0;", "block", "c", "(La4/o;JLer/l;)V", "b", "", "nowMillis", "a", "(JLer/l;)V", "", "cancel", "d", "(La4/o;JLer/l;Z)V", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class n0 {
    public static final void a(long j15, er.l<? super MotionEvent, oq.i0> lVar) {
        MotionEvent motionEventObtain = MotionEvent.obtain(j15, j15, 3, 0.0f, 0.0f, 0);
        motionEventObtain.setSource(0);
        lVar.b(motionEventObtain);
        motionEventObtain.recycle();
    }

    public static final void b(o oVar, long j15, er.l<? super MotionEvent, oq.i0> lVar) {
        d(oVar, j15, lVar, true);
    }

    public static final void c(o oVar, long j15, er.l<? super MotionEvent, oq.i0> lVar) {
        d(oVar, j15, lVar, false);
    }

    private static final void d(o oVar, long j15, er.l<? super MotionEvent, oq.i0> lVar, boolean z15) {
        MotionEvent motionEventG = oVar.g();
        if (motionEventG == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
        }
        int action = motionEventG.getAction();
        if (z15) {
            motionEventG.setAction(3);
        }
        int i15 = (int) (j15 >> 32);
        float f15 = -Float.intBitsToFloat(i15);
        int i16 = (int) (j15 & BodyPartID.bodyIdMax);
        motionEventG.offsetLocation(f15, -Float.intBitsToFloat(i16));
        lVar.b(motionEventG);
        motionEventG.offsetLocation(Float.intBitsToFloat(i15), Float.intBitsToFloat(i16));
        motionEventG.setAction(action);
    }
}
