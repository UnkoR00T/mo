package i92;

import er.p;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;
import u50.v0;
import v50.c;
import y2.m;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Li92/b;", "Lb50/a;", "Lv50/c;", "officeTextInputData", "<init>", "(Lv50/c;)V", "Lkotlin/Function0;", "Loq/i0;", "a", "()Ler/p;", "Lv50/c;", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements b50.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f90535b = c.f203957t;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c officeTextInputData;

    public b(c cVar) {
        this.officeTextInputData = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(b bVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-1476047360, i15, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.violationdescription.content.ViolationRadioButtonContent.content.<anonymous> (ViolationRadioButtonContent.kt:9)");
            }
            v0.g(bVar.officeTextInputData, null, rVar, c.f203957t, 2);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    @Override // b50.a
    public p<r, Integer, i0> a() {
        return m.b(-1476047360, true, new p() { // from class: i92.a
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return b.c(this.f90534a, (r) obj, ((Integer) obj2).intValue());
            }
        });
    }
}
