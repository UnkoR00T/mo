package mk0;

import jk0.l;
import nk0.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnk0/p;", "Ljk0/l;", "a", "(Lnk0/p;)Ljk0/l;", "digitalservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f126963a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.VALID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.REVOKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.INVALID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[p.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f126963a = iArr;
        }
    }

    public static final l a(p pVar) {
        int i15 = a.f126963a[pVar.ordinal()];
        if (i15 == 1) {
            return l.VALID;
        }
        if (i15 == 2) {
            return l.REVOKED;
        }
        if (i15 != 3 && i15 != 4) {
            throw new oq.p();
        }
        return l.INVALID;
    }
}
