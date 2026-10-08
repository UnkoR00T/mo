package r11;

import oq.p;
import p071kotlin.Metadata;
import th0.UserCertificateMobileApi;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lth0/t$b;", "Lrq0/b$d;", "a", "(Lth0/t$b;)Lrq0/b$d;", "certificates_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f170498a;

        static {
            int[] iArr = new int[UserCertificateMobileApi.b.values().length];
            try {
                iArr[UserCertificateMobileApi.b.CITIZEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserCertificateMobileApi.b.REFUGEE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UserCertificateMobileApi.b.UNIVERSITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[UserCertificateMobileApi.b.SCHOOL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[UserCertificateMobileApi.b.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f170498a = iArr;
        }
    }

    public static final rq0.b.d a(UserCertificateMobileApi.b bVar) {
        int i15 = a.f170498a[bVar.ordinal()];
        if (i15 == 1) {
            return rq0.b.d.ID_CARD;
        }
        if (i15 == 2) {
            return rq0.b.d.DIIA_REFUGEE_CARD;
        }
        if (i15 == 3) {
            return rq0.b.d.STUDENT_CARD;
        }
        if (i15 == 4) {
            return rq0.b.d.SCHOOL_CARD;
        }
        if (i15 == 5) {
            return null;
        }
        throw new p();
    }
}
