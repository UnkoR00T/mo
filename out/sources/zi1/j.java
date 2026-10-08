package zi1;

import er.p;
import n50.j0;
import oq.i0;
import p046f2.lh;
import p046f2.oh;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import t70.x;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0003¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "isSelected", "Ln50/j0;", "singleCardState", "Loq/i0;", "b", "(ZLn50/j0;Lm2/r;I)V", "Lr50/f;", "Landroidx/compose/ui/graphics/Color;", "f", "(Lr50/f;Lm2/r;I)J", "defencetraining_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class j {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f235369a;

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
            f235369a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(final boolean z15, final j0 j0Var, r rVar, final int i15) {
        int i16;
        r rVar2;
        long jG;
        long jG2;
        r rVarH = rVar.h(-1718887493);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.a(z15) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? rVarH.W(j0Var) : rVarH.G(j0Var) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(-1718887493, i16, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.components.SingleCardRadioButton (OccupancyRadioCardCustomContent.kt:115)");
            }
            x xVar = new x();
            lh lhVar = lh.f56740a;
            boolean z16 = j0Var instanceof j0.Error;
            if (z16) {
                rVarH.X(1518131985);
                jG = k70.a.f108864a.a(rVarH, k70.a.f108865b).getSupport().g();
                rVarH.R();
            } else {
                rVarH.X(1518080153);
                jG = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().c();
                rVarH.R();
            }
            long j15 = jG;
            if (z16) {
                rVarH.X(1518314513);
                jG2 = k70.a.f108864a.a(rVarH, k70.a.f108865b).getSupport().g();
                rVarH.R();
            } else {
                rVarH.X(1518257876);
                jG2 = k70.a.f108864a.a(rVarH, k70.a.f108865b).getNeutral().a();
                rVarH.R();
            }
            long j16 = jG2;
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            rVar2 = rVarH;
            oh.c(z15, null, null, true, lhVar.b(j15, j16, aVar.a(rVarH, i17).getNeutral().g(), aVar.a(rVarH, i17).getNeutral().g(), rVar2, lh.f56741b << 12, 0), xVar, rVarH, (i16 & 14) | 3120, 4);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: zi1.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.c(z15, j0Var, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(boolean z15, j0 j0Var, int i15, r rVar, int i16) {
        b(z15, j0Var, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long f(r50.f fVar, r rVar, int i15) {
        long jD;
        if (t.k()) {
            t.o(-1363939966, i15, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.components.getIconColor (OccupancyRadioCardCustomContent.kt:139)");
        }
        int i16 = a.f235369a[fVar.ordinal()];
        if (i16 == 1) {
            rVar.X(-781278096);
            jD = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().d();
            rVar.R();
        } else if (i16 == 2) {
            rVar.X(-781275507);
            jD = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().j();
            rVar.R();
        } else if (i16 == 3) {
            rVar.X(-781273106);
            jD = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().g();
            rVar.R();
        } else {
            if (i16 != 4) {
                rVar.X(-781280250);
                rVar.R();
                throw new oq.p();
            }
            rVar.X(-781270704);
            jD = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().f();
            rVar.R();
        }
        if (t.k()) {
            t.n();
        }
        return jD;
    }
}
