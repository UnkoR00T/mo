package rl1;

import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmk1/a;", "Lrl1/a;", "a", "(Lmk1/a;)Lrl1/a;", "dependentidinvalidation_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f174837a;

        static {
            int[] iArr = new int[mk1.a.values().length];
            try {
                iArr[mk1.a.FATHERS_NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[mk1.a.MOTHERS_NAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[mk1.a.MOTHERS_FAMILY_NAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f174837a = iArr;
        }
    }

    public static final rl1.a a(mk1.a aVar) {
        int i15 = a.f174837a[aVar.ordinal()];
        if (i15 == 1) {
            return rl1.a.FATHERS_NAME;
        }
        if (i15 == 2) {
            return rl1.a.MOTHERS_NAME;
        }
        if (i15 == 3) {
            return rl1.a.MOTHERS_FAMILY_NAME;
        }
        throw new p();
    }
}
