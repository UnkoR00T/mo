package km1;

import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lmm1/a;", "", "b", "(Lmm1/a;)I", "titleResId", "dependentidsuspension_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f111408a;

        static {
            int[] iArr = new int[mm1.a.values().length];
            try {
                iArr[mm1.a.CHILD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[mm1.a.WARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f111408a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(mm1.a aVar) {
        int i15 = a.f111408a[aVar.ordinal()];
        if (i15 == 1) {
            return em1.a.f51992z;
        }
        if (i15 == 2) {
            return em1.a.f51980s;
        }
        throw new p();
    }
}
