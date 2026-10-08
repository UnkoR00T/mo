package nb4;

import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lnb4/f;", "Lk00/a;", "Loq/i0;", "Lhb4/c;", "Ljb4/b;", "initialData", "<init>", "(Ljb4/b;)V", "b", "(Lm2/r;I)V", "f", "Ljb4/b;", "c", "()Ljb4/b;", "error_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f extends k00.a<oq.i0, oq.i0, oq.i0> implements hb4.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final jb4.b initialData;

    public f(jb4.b bVar) {
        super(oq.i0.f148189a);
        this.initialData = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i(f fVar, int i15, p076m2.r rVar, int i16) {
        fVar.b(rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    @Override // ty.c, ty.a
    public void b(p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(695502109);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(this) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(695502109, i16, -1, "pl.gov.coi.shared.segment.error.presentation.vms.ErrorVMSAdapterImpl.Render (ErrorVMSAdapterImpl.kt:14)");
            }
            r.e((i) f(i.class, this, rVarH, ((i16 << 3) & 112) | ((i16 << 6) & 896)), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: nb4.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.i(this.f133851a, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // hb4.c
    /* JADX INFO: renamed from: c, reason: from getter */
    public jb4.b getInitialData() {
        return this.initialData;
    }
}
