package jd;

import oq.i0;
import p071kotlin.Metadata;
import p076m2.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a\r\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\u000e\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ljd/b;", "d", "(Lm2/r;I)Ljd/b;", "a", "()Ljd/b;", "Loq/i0;", "e", "(Ljd/b;Ltq/e;)Ljava/lang/Object;", "Lfd/f;", "composition", "Ljd/k;", "clipSpec", "", "speed", "c", "(Lfd/f;Ljd/k;F)F", "lottie-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class d {
    public static final b a() {
        return new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float c(fd.f fVar, k kVar, float f15) {
        if (f15 < 0.0f && fVar == null) {
            return 1.0f;
        }
        if (fVar == null) {
            return 0.0f;
        }
        if (f15 < 0.0f) {
            if (kVar != null) {
                return kVar.a(fVar);
            }
            return 1.0f;
        }
        if (kVar != null) {
            return kVar.b(fVar);
        }
        return 0.0f;
    }

    public static final b d(p076m2.r rVar, int i15) {
        rVar.C(2024497114);
        if (t.k()) {
            t.o(2024497114, i15, -1, "com.airbnb.lottie.compose.rememberLottieAnimatable (LottieAnimatable.kt:28)");
        }
        rVar.C(-610207850);
        Object objE = rVar.E();
        if (objE == p076m2.r.INSTANCE.a()) {
            objE = a();
            rVar.v(objE);
        }
        b bVar = (b) objE;
        rVar.V();
        if (t.k()) {
            t.n();
        }
        rVar.V();
        return bVar;
    }

    public static final Object e(b bVar, tq.e<? super i0> eVar) {
        Object objB = b.a.b(bVar, null, c(bVar.u(), bVar.v(), bVar.o()), 1, false, eVar, 9, null);
        return objB == uq.b.e() ? objB : i0.f148189a;
    }
}
