package s84;

import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ls84/c;", "Ls84/h;", "a", "(Ls84/c;)Ls84/h;", "b", "(Ls84/h;)Ls84/c;", "schoolattendance_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class g {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f179317a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f179318b;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.ABSENCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.SCHOOL_REASONS_ABSENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.LATENESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c.EXCUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[c.JUSTIFICATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[c.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f179317a = iArr;
            int[] iArr2 = new int[h.values().length];
            try {
                iArr2[h.ABSENCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[h.JUSTIFICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[h.EXCUSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[h.LATENESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[h.SCHOOL_REASONS_ABSENCE.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            f179318b = iArr2;
        }
    }

    public static final h a(c cVar) {
        switch (a.f179317a[cVar.ordinal()]) {
            case 1:
                return h.ABSENCE;
            case 2:
                return h.SCHOOL_REASONS_ABSENCE;
            case 3:
                return h.LATENESS;
            case 4:
                return h.EXCUSE;
            case 5:
                return h.JUSTIFICATION;
            case 6:
                return null;
            default:
                throw new p();
        }
    }

    public static final c b(h hVar) {
        int i15 = a.f179318b[hVar.ordinal()];
        if (i15 == 1) {
            return c.ABSENCE;
        }
        if (i15 == 2) {
            return c.JUSTIFICATION;
        }
        if (i15 == 3) {
            return c.EXCUSE;
        }
        if (i15 == 4) {
            return c.LATENESS;
        }
        if (i15 == 5) {
            return c.SCHOOL_REASONS_ABSENCE;
        }
        throw new p();
    }
}
