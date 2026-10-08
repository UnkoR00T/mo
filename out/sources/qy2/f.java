package qy2;

import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqy2/d$a;", "Lrq0/b;", "a", "(Lqy2/d$a;)Lrq0/b;", "pwzcard_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class f {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f169586a;

        static {
            int[] iArr = new int[NipipCardContainerData.a.values().length];
            try {
                iArr[NipipCardContainerData.a.NURSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NipipCardContainerData.a.MIDWIFE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f169586a = iArr;
        }
    }

    public static final rq0.b a(NipipCardContainerData.a aVar) {
        int i15 = a.f169586a[aVar.ordinal()];
        if (i15 == 1) {
            return rq0.b.d.NURSE_CARD;
        }
        if (i15 == 2) {
            return rq0.b.d.MIDWIFE_CARD;
        }
        throw new p();
    }
}
