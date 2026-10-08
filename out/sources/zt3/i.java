package zt3;

import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import st3.AddressData;
import st3.AddressFormVMSSetupData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lzt3/i;", "Lk00/a;", "Lst3/g$b;", "Lst3/g$c;", "Lst3/g$a;", "Lst3/g;", "Lst3/i;", "setupData", "<init>", "(Lst3/i;)V", "Loq/i0;", "b", "(Lm2/r;I)V", "f", "Lst3/i;", "a", "()Lst3/i;", "addressform_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i extends k00.a<st3.g.b, st3.g.c, st3.g.a> implements st3.g {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final AddressFormVMSSetupData setupData;

    public i(AddressFormVMSSetupData addressFormVMSSetupData) {
        super(new st3.g.c.Content(AddressData.INSTANCE.a()));
        this.setupData = addressFormVMSSetupData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i(i iVar, int i15, p076m2.r rVar, int i16) {
        iVar.b(rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    @Override // st3.g
    /* JADX INFO: renamed from: a, reason: from getter */
    public AddressFormVMSSetupData getSetupData() {
        return this.setupData;
    }

    @Override // ty.c, ty.a
    public void b(p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-222555364);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(this) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-222555364, i16, -1, "pl.gov.coi.mobywatel.segment.addressform.presentation.addressformvms.AddressFormVMSAdapterImpl.Render (AddressFormVMSAdapterImpl.kt:21)");
            }
            l1.k((d0) f(d0.class, this, rVarH, ((i16 << 3) & 112) | ((i16 << 6) & 896)), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: zt3.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.i(this.f237608a, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
