package fb4;

import cb4.DialogData;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010²\u0006\f\u0010\u000f\u001a\u00020\u000e8\nX\u008a\u0084\u0002"}, d2 = {"Lfb4/p;", "Lk00/a;", "Loq/i0;", "Lcb4/i;", "Lcb4/d;", "initialData", "<init>", "(Lcb4/d;)V", "b", "(Lm2/r;I)V", "f", "Lcb4/d;", "c", "()Lcb4/d;", "Li40/a;", "state", "dialog_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p extends k00.a<i0, i0, i0> implements cb4.i {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final DialogData initialData;

    public p(DialogData dialogData) {
        super(i0.f148189a);
        this.initialData = dialogData;
    }

    private static final i40.a i(f6<? extends i40.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(p pVar, int i15, p076m2.r rVar, int i16) {
        pVar.b(rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    @Override // ty.c, ty.a
    public void b(p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(910562343);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(this) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(910562343, i16, -1, "pl.gov.coi.shared.segment.dialog.presentation.vms.DialogVMSAdapterImpl.Render (DialogVMSAdapterImpl.kt:18)");
            }
            i40.e.d(i(m7.b.c(((s) f(s.class, this, rVarH, ((i16 << 6) & 896) | ((i16 << 3) & 112))).getState(), null, null, null, rVarH, 0, 7)), rVarH, i40.a.f89015k);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: fb4.o
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.j(this.f61063a, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // cb4.i
    /* JADX INFO: renamed from: c, reason: from getter */
    public DialogData getInitialData() {
        return this.initialData;
    }
}
