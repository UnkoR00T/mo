package dv3;

import oq.i0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.t;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ldv3/j;", "Lk00/a;", "", "Loq/i0;", "Lbv3/a;", "Lbv3/c;", "setupData", "<init>", "(Lbv3/c;)V", "b", "(Lm2/r;I)V", "f", "Lbv3/c;", "a", "()Lbv3/c;", "documentcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j extends k00.a<Object, i0, i0> implements bv3.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f44718g = k00.a.f107183e | bv3.c.f21763f;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final bv3.c setupData;

    public j(bv3.c cVar) {
        super(i0.f148189a);
        this.setupData = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(j jVar, int i15, p076m2.r rVar, int i16) {
        jVar.b(rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    @Override // bv3.a
    /* JADX INFO: renamed from: a, reason: from getter */
    public bv3.c getSetupData() {
        return this.setupData;
    }

    @Override // ty.c, ty.a
    public void b(p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1276838889);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(this) : rVarH.G(this) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1276838889, i16, -1, "pl.gov.coi.mobywatel.segment.documentcard.presentation.DocumentCardVMSAdapterImpl.Render (DocumentCardVMSAdapterImpl.kt:20)");
            }
            int i17 = bv3.c.f21763f;
            int i18 = k00.a.f107183e;
            p.b((g) f(g.class, this, rVarH, ((i17 | i18) << 6) | ((i17 | i18) << 3) | ((i16 << 3) & 112) | ((i16 << 6) & 896)), rVarH, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: dv3.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.i(this.f44716a, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
