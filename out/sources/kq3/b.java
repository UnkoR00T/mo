package kq3;

import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkq3/a;", "", "b", "(Lkq3/a;)I", "a", "(I)Lkq3/a;", "voteidea_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f112274a;

        static {
            int[] iArr = new int[kq3.a.values().length];
            try {
                iArr[kq3.a.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kq3.a.DOCUMENTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[kq3.a.SERVICES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[kq3.a.OTHER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f112274a = iArr;
        }
    }

    public static final kq3.a a(int i15) {
        if (i15 == 0) {
            return kq3.a.ALL;
        }
        if (i15 != 1) {
            return i15 != 2 ? kq3.a.OTHER : kq3.a.SERVICES;
        }
        return kq3.a.DOCUMENTS;
    }

    public static final int b(kq3.a aVar) {
        int i15 = a.f112274a[aVar.ordinal()];
        if (i15 == 1) {
            return 0;
        }
        if (i15 == 2) {
            return 1;
        }
        if (i15 == 3) {
            return 2;
        }
        if (i15 == 4) {
            return 3;
        }
        throw new p();
    }
}
