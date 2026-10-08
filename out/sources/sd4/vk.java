package sd4;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf43/e;", "Ls84/h;", "b", "(Lf43/e;)Ls84/h;", "mObywatel_prodRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class vk {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f180908a;

        static {
            int[] iArr = new int[f43.e.values().length];
            try {
                iArr[f43.e.ABSENCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f43.e.SCHOOL_REASONS_ABSENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f43.e.LATENESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[f43.e.EXCUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[f43.e.JUSTIFICATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[f43.e.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f180908a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s84.h b(f43.e eVar) {
        switch (a.f180908a[eVar.ordinal()]) {
            case 1:
                return s84.h.ABSENCE;
            case 2:
                return s84.h.SCHOOL_REASONS_ABSENCE;
            case 3:
                return s84.h.LATENESS;
            case 4:
                return s84.h.EXCUSE;
            case 5:
                return s84.h.JUSTIFICATION;
            case 6:
                return null;
            default:
                throw new oq.p();
        }
    }
}
