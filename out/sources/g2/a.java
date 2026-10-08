package g2;

import fr.t;
import java.util.ArrayList;
import java.util.List;
import n3.s2;
import p071kotlin.Metadata;
import p076m2.r;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u000f\u0010\u0006\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "Lob/c;", "foldingFeatures", "Lg2/f;", "a", "(Ljava/util/List;)Lg2/f;", "b", "(Lm2/r;I)Lg2/f;", "adaptive"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class a {
    public static final Posture a(List<? extends ob.c> list) {
        ArrayList arrayList = new ArrayList();
        boolean z15 = false;
        for (ob.c cVar : list) {
            if (t.c(cVar.a(), ob.c.b.f144156d) && t.c(cVar.getState(), ob.c.C3575c.f144160d)) {
                z15 = true;
            }
            arrayList.add(new HingeInfo(s2.e(cVar.getBounds()), t.c(cVar.getState(), ob.c.C3575c.f144159c), t.c(cVar.a(), ob.c.b.f144155c), cVar.b(), t.c(cVar.c(), ob.c.a.f144152d)));
        }
        return new Posture(z15, arrayList);
    }

    public static final Posture b(r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(702079131, i15, -1, "androidx.compose.material3.adaptive.calculatePosture (AndroidPosture.android.kt:55)");
        }
        Posture postureA = a(b.a(rVar, 0).getValue());
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return postureA;
    }
}
