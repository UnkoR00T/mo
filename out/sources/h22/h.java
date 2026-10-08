package h22;

import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lg22/d$a$b;", "Lg22/b;", "c", "(Lg22/d$a$b;)Lg22/b;", "d", "(Lg22/b;)Lg22/d$a$b;", "electronicdelivery_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class h {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f80118a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f80119b;

        static {
            int[] iArr = new int[g22.d.Data.b.values().length];
            try {
                iArr[g22.d.Data.b.PHONE_NUMBER_WITH_PREFIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g22.d.Data.b.EMAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f80118a = iArr;
            int[] iArr2 = new int[g22.b.values().length];
            try {
                iArr2[g22.b.PHONE_NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[g22.b.PHONE_PREFIX.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[g22.b.EMAIL.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f80119b = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g22.b c(g22.d.Data.b bVar) {
        int i15 = a.f80118a[bVar.ordinal()];
        if (i15 == 1) {
            return g22.b.PHONE_NUMBER;
        }
        if (i15 == 2) {
            return g22.b.EMAIL;
        }
        throw new p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g22.d.Data.b d(g22.b bVar) {
        int i15 = a.f80119b[bVar.ordinal()];
        if (i15 == 1 || i15 == 2) {
            return g22.d.Data.b.PHONE_NUMBER_WITH_PREFIX;
        }
        if (i15 == 3) {
            return g22.d.Data.b.EMAIL;
        }
        throw new p();
    }
}
