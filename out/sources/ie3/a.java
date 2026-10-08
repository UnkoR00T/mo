package ie3;

import ez.e;
import fz.b;
import fz.c;
import java.util.List;
import mx.Label;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import sv0.Insurance;
import sv0.a0;
import sv0.v0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0001*\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\u000f\u001a\u00020\u000e2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0019\u0010\u0014\u001a\u00020\f*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lsv0/v0;", "", "e", "(Lsv0/v0;)I", "Lsv0/a0;", "d", "(Lsv0/a0;)I", "c", "(Lsv0/a0;)Ljava/lang/Integer;", "", "Lsv0/r;", "list", "", "tag", "Lmx/a;", "b", "(Ljava/util/List;Ljava/lang/String;)Lmx/a;", "Lez/e;", "Lfz/b$f;", "date", "a", "(Lez/e;Lfz/b$f;)Ljava/lang/String;", "vehiclecollision_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: ie3.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C2179a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f92076a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f92077b;

        static {
            int[] iArr = new int[v0.values().length];
            try {
                iArr[v0.FRONT_DAMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[v0.BACK_DAMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[v0.TOP_DAMAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[v0.LEFT_FRONT_DAMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[v0.RIGHT_FRONT_DAMAGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[v0.LEFT_SIDE_DAMAGE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[v0.RIGHT_SIDE_DAMAGE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[v0.LEFT_BACK_DAMAGE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[v0.RIGHT_BACK_DAMAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[v0.UNKNOWN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f92076a = iArr;
            int[] iArr2 = new int[a0.values().length];
            try {
                iArr2[a0.IDENTITY_REJECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[a0.DESCRIPTION_REJECTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            f92077b = iArr2;
        }
    }

    public static final String a(e eVar, b.OffsetDateTime offsetDateTime) {
        return eVar.d(new b.LocalDateTime(offsetDateTime.getDate().toLocalDateTime()), c.FULL_MONTH_DATE_TIME_COMMA);
    }

    public static final Label b(List<Insurance> list, String str) {
        StringBuilder sb5 = new StringBuilder();
        int i15 = 0;
        for (Object obj : list) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            sb5.append(((Insurance) obj).getInsurerName());
            if (i15 != v.p(list)) {
                sb5.append(", ");
            }
            i15 = i16;
        }
        return mx.b.d(sb5.toString(), str);
    }

    public static final Integer c(a0 a0Var) {
        int i15 = C2179a.f92077b[a0Var.ordinal()];
        if (i15 == 1) {
            return null;
        }
        if (i15 == 2) {
            return Integer.valueOf(md3.b.f125758k2);
        }
        throw new p();
    }

    public static final int d(a0 a0Var) {
        int i15 = C2179a.f92077b[a0Var.ordinal()];
        if (i15 == 1) {
            return md3.b.F2;
        }
        if (i15 == 2) {
            return md3.b.f125766l2;
        }
        throw new p();
    }

    public static final int e(v0 v0Var) {
        switch (C2179a.f92076a[v0Var.ordinal()]) {
            case 1:
                return md3.b.M5;
            case 2:
                return md3.b.I5;
            case 3:
                return md3.b.W5;
            case 4:
                return md3.b.N5;
            case 5:
                return md3.b.O5;
            case 6:
                return md3.b.P5;
            case 7:
                return md3.b.R5;
            case 8:
                return md3.b.J5;
            case 9:
                return md3.b.K5;
            case 10:
                return md3.b.Q5;
            default:
                throw new p();
        }
    }
}
