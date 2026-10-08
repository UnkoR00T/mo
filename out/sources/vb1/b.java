package vb1;

import d1.e0;
import d1.i;
import er.p;
import f3.j;
import f3.m;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import u50.v0;
import v50.c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lvb1/b;", "Lb50/a;", "Lv50/c;", "accountingOfficeInputData", "nipInputData", "<init>", "(Lv50/c;Lv50/c;)V", "Lkotlin/Function0;", "Loq/i0;", "a", "()Ler/p;", "Lv50/c;", "b", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements b50.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f205943c = c.f203957t;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c accountingOfficeInputData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c nipInputData;

    public b(c cVar, c cVar2) {
        this.accountingOfficeInputData = cVar;
        this.nipInputData = cVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(b bVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(608810124, i15, -1, "pl.gov.coi.mobywatel.feature.companyappliacation.presentation.steps.accountingdocumentselection.content.AccountingDocumentRadioButtonContent.content.<anonymous> (AccountingDocumentRadioButtonContent.kt:15)");
            }
            i.f fVarR = i.f39152a.r(k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200());
            m.Companion companion = m.INSTANCE;
            w0 w0VarA = e0.a(fVarR, f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            m mVarE = j.e(rVar, companion);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            c cVar = bVar.accountingOfficeInputData;
            int i16 = c.f203957t;
            v0.g(cVar, null, rVar, i16, 2);
            v0.g(bVar.nipInputData, null, rVar, i16, 2);
            rVar.x();
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
        return y2.m.b(608810124, true, new p() { // from class: vb1.a
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return b.c(this.f205942a, (r) obj, ((Integer) obj2).intValue());
            }
        });
    }
}
