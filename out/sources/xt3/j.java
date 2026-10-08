package xt3;

import iy.c0;
import j14.o;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lr.m;
import p071kotlin.Metadata;
import pq.v;
import pq.v0;
import zt3.m1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0096B¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lxt3/j;", "Lxt3/i;", "Lmx/c;", "labelProvider", "Lxt3/b;", "isBuildingNumberValidUseCase", "Lxt3/c;", "isOptionalApartmentNumberValidUC", "Lhz/d;", "conditionValidator", "Lj14/o;", "checkPolishPostalCodeCorrectUC", "<init>", "(Lmx/c;Lxt3/b;Lxt3/c;Lhz/d;Lj14/o;)V", "Lxt3/i$a;", "params", "", "Lzt3/m1;", "Lhz/g;", "d", "(Lxt3/i$a;Ltq/e;)Ljava/lang/Object;", "a", "Lmx/c;", "b", "Lxt3/b;", "c", "Lxt3/c;", "Lhz/d;", "e", "Lj14/o;", "addressform_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b isBuildingNumberValidUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c isOptionalApartmentNumberValidUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final hz.d conditionValidator;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final o checkPolishPostalCodeCorrectUC;

    public j(mx.c cVar, b bVar, c cVar2, hz.d dVar, o oVar) {
        this.labelProvider = cVar;
        this.isBuildingNumberValidUseCase = bVar;
        this.isOptionalApartmentNumberValidUC = cVar2;
        this.conditionValidator = dVar;
        this.checkPolishPostalCodeCorrectUC = oVar;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0071  */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(i.Params params, tq.e<? super Map<m1, ? extends hz.g>> eVar) {
        hz.g gVarA;
        List listS = v.s(params.getProvince(), params.getCounty(), params.getCommunity(), params.getCity(), params.getStreet());
        LinkedHashMap linkedHashMap = new LinkedHashMap(m.e(v0.e(v.y(listS, 10)), 16));
        Iterator it = listS.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Object obj = (zt3.d) next;
            if ((obj instanceof zt3.d.Enabled ? (zt3.d.Enabled) obj : null) != null) {
                gVarA = this.conditionValidator.e(this.labelProvider.c(rt3.a.f176101d)).a(vq.b.a(((zt3.d.Enabled) obj).getSelected() != null));
                if (gVarA == null) {
                    gVarA = hz.g.b.f86853b;
                }
            } else {
                gVarA = hz.g.b.f86853b;
            }
            linkedHashMap.put(next, gVarA);
        }
        hz.g gVarA2 = params.getPostalCode() != null ? this.checkPolishPostalCodeCorrectUC.a(new o.Params(c0.g(params.getPostalCode().getValue()), params.getPostalCode().getIsRequired())) : null;
        hz.g gVarB = params.getBuildingNumber() != null ? this.isBuildingNumberValidUseCase.b(new b.Params(params.getBuildingNumber().getValue(), params.getBuildingNumber().getIsRequired())) : null;
        Object objB = params.getApartmentNumber() != null ? this.isOptionalApartmentNumberValidUC.b(new c.Params(params.getApartmentNumber().getValue(), params.getApartmentNumber().getIsRequired())) : null;
        Map mapC = v0.c();
        mapC.put(m1.PROVINCE, v0.j(linkedHashMap, params.getProvince()));
        mapC.put(m1.COUNTY, v0.j(linkedHashMap, params.getCounty()));
        mapC.put(m1.COMMUNITY, v0.j(linkedHashMap, params.getCommunity()));
        mapC.put(m1.CITY, v0.j(linkedHashMap, params.getCity()));
        if (gVarA2 != null) {
        }
        if (params.getStreet() != null) {
        }
        if (gVarB != null) {
        }
        if (objB != null) {
            mapC.put(m1.APARTMENT_NUMBER, objB);
        }
        return v0.b(mapC);
    }
}
