package p049fm;

import er.p;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f65212a = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static p<r, Integer, i0> f65213b = y2.m.b(-1984375736, false, new p() { // from class: fm.k
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return m.d((r) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static p<r, Integer, i0> f65214c = y2.m.b(-400333435, false, new p() { // from class: fm.l
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return m.e((r) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d(r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-1984375736, i15, -1, "com.google.maps.android.compose.ComposableSingletons$GoogleMapKt.lambda$-1984375736.<anonymous> (GoogleMap.kt:106)");
            }
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-400333435, i15, -1, "com.google.maps.android.compose.ComposableSingletons$GoogleMapKt.lambda$-400333435.<anonymous> (GoogleMap.kt:304)");
            }
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    public final p<r, Integer, i0> c() {
        return f65213b;
    }
}
