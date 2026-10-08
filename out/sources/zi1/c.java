package zi1;

import oq.p;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lr50/f;", "Landroidx/compose/ui/graphics/Color;", "b", "(Lr50/f;Lm2/r;I)J", "defencetraining_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f235354a;

        static {
            int[] iArr = new int[r50.f.values().length];
            try {
                iArr[r50.f.POSITIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r50.f.INFORMATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[r50.f.NEGATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[r50.f.WARNING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f235354a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long b(r50.f fVar, r rVar, int i15) {
        long jD;
        if (t.k()) {
            t.o(-284344091, i15, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.components.getIconColor (OccupancyInfoCardCustomContent.kt:83)");
        }
        int i16 = a.f235354a[fVar.ordinal()];
        if (i16 == 1) {
            rVar.X(1623239443);
            jD = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().d();
            rVar.R();
        } else if (i16 == 2) {
            rVar.X(1623242032);
            jD = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().j();
            rVar.R();
        } else if (i16 == 3) {
            rVar.X(1623244433);
            jD = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().g();
            rVar.R();
        } else {
            if (i16 != 4) {
                rVar.X(1623237289);
                rVar.R();
                throw new p();
            }
            rVar.X(1623246835);
            jD = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().f();
            rVar.R();
        }
        if (t.k()) {
            t.n();
        }
        return jD;
    }
}
