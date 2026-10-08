package p079n1;

import c5.b;
import c5.c;
import c5.n;
import er.a;
import er.l;
import java.util.ArrayList;
import java.util.List;
import m3.g;
import oq.i0;
import oq.r;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p036e4.a2;
import p036e4.v0;
import p036e4.w0;
import p036e4.x0;
import p036e4.y0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00050\u0002¢\u0006\u0004\b\b\u0010\tJ)\u0010\u0010\u001a\u00020\u000f*\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R$\u0010\u0007\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Ln1/c7;", "Le4/w0;", "Lkotlin/Function0;", "", "shouldMeasureLinks", "", "Lm3/g;", "placements", "<init>", "(Ler/a;Ler/a;)V", "Le4/y0;", "Le4/v0;", "measurables", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "e", "(Le4/y0;Ljava/util/List;J)Le4/x0;", "a", "Ler/a;", "b", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class c7 implements w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a<Boolean> shouldMeasureLinks;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a<List<g>> placements;

    /* JADX WARN: Multi-variable type inference failed */
    public c7(a<Boolean> aVar, a<? extends List<g>> aVar2) {
        this.shouldMeasureLinks = aVar;
        this.placements = aVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 b(List list, List list2, a2.a aVar) {
        if (list != null) {
            int size = list.size();
            for (int i15 = 0; i15 < size; i15++) {
                r rVar = (r) list.get(i15);
                a2.a.G(aVar, (a2) rVar.a(), ((n) rVar.b()).getPackedValue(), 0.0f, 2, null);
            }
        }
        if (list2 != null) {
            int size2 = list2.size();
            for (int i16 = 0; i16 < size2; i16++) {
                r rVar2 = (r) list2.get(i16);
                a2 a2Var = (a2) rVar2.a();
                a aVar2 = (a) rVar2.b();
                a2.a.G(aVar, a2Var, aVar2 != null ? ((n) aVar2.a()).getPackedValue() : n.INSTANCE.b(), 0.0f, 2, null);
            }
        }
        return i0.f148189a;
    }

    @Override // p036e4.w0
    public x0 e(y0 y0Var, List<? extends v0> list, long j15) {
        final ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList(list.size());
        List<? extends v0> list2 = list;
        int size = list2.size();
        for (int i15 = 0; i15 < size; i15++) {
            v0 v0Var = list.get(i15);
            if (!(v0Var.getParentData() instanceof g7)) {
                arrayList2.add(v0Var);
            }
        }
        List<g> listA = this.placements.a();
        if (listA != null) {
            ArrayList arrayList3 = new ArrayList(listA.size());
            int size2 = listA.size();
            for (int i16 = 0; i16 < size2; i16++) {
                g gVar = listA.get(i16);
                r rVar = gVar != null ? new r(((v0) arrayList2.get(i16)).o0(c.b(0, (int) Math.floor(gVar.getRight() - gVar.getLeft()), 0, (int) Math.floor(gVar.getBottom() - gVar.getTop()), 5, null)), n.c(n.d((((long) Math.round(gVar.getTop())) & BodyPartID.bodyIdMax) | (((long) Math.round(gVar.getLeft())) << 32)))) : null;
                if (rVar != null) {
                    arrayList3.add(rVar);
                }
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        ArrayList arrayList4 = new ArrayList(list.size());
        int size3 = list2.size();
        for (int i17 = 0; i17 < size3; i17++) {
            v0 v0Var2 = list.get(i17);
            if (v0Var2.getParentData() instanceof g7) {
                arrayList4.add(v0Var2);
            }
        }
        final List listI = k0.I(arrayList4, this.shouldMeasureLinks);
        return y0.j2(y0Var, b.l(j15), b.k(j15), null, new l() { // from class: n1.b7
            @Override // er.l
            public final Object b(Object obj) {
                return c7.b(arrayList, listI, (a2.a) obj);
            }
        }, 4, null);
    }
}
