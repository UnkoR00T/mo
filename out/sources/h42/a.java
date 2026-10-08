package h42;

import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyr0/a;", "Lqx3/a;", "a", "(Lyr0/a;)Lqx3/a;", "epayments_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: h42.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C1862a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f80977a;

        static {
            int[] iArr = new int[yr0.a.values().length];
            try {
                iArr[yr0.a.BLIK_T6_CODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[yr0.a.BLIK_ONE_CLICK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[yr0.a.CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[yr0.a.WALLET_GP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[yr0.a.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f80977a = iArr;
        }
    }

    public static final qx3.a a(yr0.a aVar) {
        int i15 = C1862a.f80977a[aVar.ordinal()];
        if (i15 == 1) {
            return qx3.a.BLIK_T6_CODE;
        }
        if (i15 == 2) {
            return qx3.a.BLIK_ONE_CLICK;
        }
        if (i15 == 3) {
            return qx3.a.CARD;
        }
        if (i15 == 4) {
            return qx3.a.WALLET_GP;
        }
        if (i15 == 5) {
            return qx3.a.UNKNOWN;
        }
        throw new p();
    }
}
