package sk1;

import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lkk1/a;", "", "b", "(Lkk1/a;)I", "titleResId", "dependentidinvalidation_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f182123a;

        static {
            int[] iArr = new int[kk1.a.values().length];
            try {
                iArr[kk1.a.CHILD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kk1.a.WARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f182123a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(kk1.a aVar) {
        int i15 = a.f182123a[aVar.ordinal()];
        if (i15 == 1) {
            return gk1.a.U;
        }
        if (i15 == 2) {
            return gk1.a.H;
        }
        throw new p();
    }
}
