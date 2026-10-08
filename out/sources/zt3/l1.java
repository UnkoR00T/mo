package zt3;

import d1.r3;
import j40.DropDownButtonData;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001f\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a9\u0010\u0018\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00142\b\u0010\u0006\u001a\u0004\u0018\u00018\u00002\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0015H\u0003¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lzt3/g;", "viewModel", "Loq/i0;", "k", "(Lzt3/g;Lm2/r;I)V", "Lzt3/g$b;", "data", "n", "(Lzt3/g$b;Lm2/r;I)V", "Lj40/a;", "Lj1/a;", "bringIntoViewRequester", "t", "(Lj40/a;Lj1/a;Lm2/r;I)V", "Lv50/c;", "z", "(Lv50/c;Lj1/a;Lm2/r;I)V", "Lzt3/g$a$a;", "v", "(Lzt3/g$a$a;Lj1/a;Lm2/r;I)V", "T", "Lkotlin/Function2;", "Ld1/h0;", "content", "q", "(Ljava/lang/Object;Ler/r;Lm2/r;I)V", "addressform_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class l1 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f237626e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f237627f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f237628g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f237629h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ g.Data f237630j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ Map<m1, j1.a> f237631k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(g.Data data, Map<m1, ? extends j1.a> map, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f237630j = data;
            this.f237631k = map;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            g.Data data;
            Object objE = uq.b.e();
            int i15 = this.f237629h;
            if (i15 == 0) {
                oq.u.b(obj);
                m1 scrollToField = this.f237630j.getScrollToField();
                if (scrollToField != null) {
                    Map<m1, j1.a> map = this.f237631k;
                    g.Data data2 = this.f237630j;
                    j1.a aVar = (j1.a) pq.v0.j(map, scrollToField);
                    this.f237626e = data2;
                    this.f237627f = vq.j.a(scrollToField);
                    this.f237628g = 0;
                    this.f237629h = 1;
                    if (j1.a.a(aVar, null, this, 1, null) == objE) {
                        return objE;
                    }
                    data = data2;
                }
                return oq.i0.f148189a;
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            data = (g.Data) this.f237626e;
            oq.u.b(obj);
            data.b().a();
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f237630j, this.f237631k, eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A(v50.c cVar, j1.a aVar, int i15, p076m2.r rVar, int i16) {
        z(cVar, aVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void k(final g gVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1417276728);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(gVar) : rVarH.G(gVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1417276728, i16, -1, "pl.gov.coi.mobywatel.segment.addressform.presentation.addressformvms.AddressFormView (AddressFormView.kt:32)");
            }
            g.Data dataL = l(m7.b.c(gVar.getState(), null, null, null, rVarH, 0, 7));
            int i17 = DropDownButtonData.f99359i;
            int i18 = v50.c.f203957t;
            n(dataL, rVarH, i17 | s50.a.f177982i | i18 | i18 | i18);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: zt3.b1
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l1.m(gVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final g.Data l(f6<g.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(g gVar, int i15, p076m2.r rVar, int i16) {
        k(gVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private static final void n(final g.Data data, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(719120053);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(data) : rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(719120053, i16, -1, "pl.gov.coi.mobywatel.segment.addressform.presentation.addressformvms.AddressFormViewContent (AddressFormView.kt:40)");
            }
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                wq.a<m1> aVarE = m1.e();
                LinkedHashMap linkedHashMap = new LinkedHashMap(lr.m.e(pq.v0.e(pq.v.y(aVarE, 10)), 16));
                Iterator<m1> it = aVarE.iterator();
                while (it.hasNext()) {
                    linkedHashMap.put(it.next(), j1.e.a());
                }
                rVarH.v(linkedHashMap);
                objE = linkedHashMap;
            }
            Map map = (Map) objE;
            m1 scrollToField = data.getScrollToField();
            boolean zG = ((i16 & 14) == 4 || ((i16 & 8) != 0 && rVarH.G(data))) | rVarH.G(map);
            Object objE2 = rVarH.E();
            if (zG || objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = new a(data, map, null);
                rVarH.v(objE2);
            }
            Function0.d(scrollToField, (er.p) objE2, rVarH, 0);
            f3.m.Companion companion = f3.m.INSTANCE;
            Object objE3 = rVarH.E();
            if (objE3 == p076m2.r.INSTANCE.a()) {
                objE3 = new er.l() { // from class: zt3.c1
                    @Override // er.l
                    public final Object b(Object obj) {
                        return l1.o((n4.i0) obj);
                    }
                };
                rVarH.v(objE3);
            }
            f3.m mVarD = n4.v.d(companion, false, (er.l) objE3, 1, null);
            p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarD);
            androidx.compose.ui.node.c.Companion aVar = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = aVar.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, aVar.d());
            n6.i(rVarC, e0VarT, aVar.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), aVar.c());
            n6.g(rVarC, aVar.a());
            n6.i(rVarC, mVarE, aVar.e());
            d1.i0 i0Var = d1.i0.f39176a;
            DropDownButtonData provinceData = data.getAddressSection().getProvinceData();
            j1.a aVar2 = (j1.a) pq.v0.j(map, m1.PROVINCE);
            int i17 = DropDownButtonData.f99359i;
            t(provinceData, aVar2, rVarH, i17);
            k70.a aVar3 = k70.a.f108864a;
            int i18 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar3.b(rVarH, i18).getSpacing200()), rVarH, 0);
            t(data.getAddressSection().getCountyData(), (j1.a) pq.v0.j(map, m1.COUNTY), rVarH, i17);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar3.b(rVarH, i18).getSpacing200()), rVarH, 0);
            t(data.getAddressSection().getCommunityData(), (j1.a) pq.v0.j(map, m1.COMMUNITY), rVarH, i17);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar3.b(rVarH, i18).getSpacing200()), rVarH, 0);
            t(data.getAddressSection().getCityData(), (j1.a) pq.v0.j(map, m1.CITY), rVarH, i17);
            if (data.getAddressSection().getPostalCodeData() == null) {
                rVarH.X(-368319445);
            } else {
                rVarH.X(-368319444);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar3.b(rVarH, i18).getSpacing200()), rVarH, 0);
                z(data.getAddressSection().getPostalCodeData(), (j1.a) pq.v0.j(map, m1.POSTAL_CODE), rVarH, v50.c.f203957t);
            }
            rVarH.R();
            g.AddressSection.StreetData streetData = data.getAddressSection().getStreetData();
            if (streetData == null) {
                rVarH.X(-368019706);
            } else {
                rVarH.X(-368019705);
                v(streetData, (j1.a) pq.v0.j(map, m1.STREET), rVarH, i17 | s50.a.f177982i);
            }
            rVarH.R();
            if (data.getAddressSection().getBuildingNumberData() == null) {
                rVarH.X(-367796413);
            } else {
                rVarH.X(-367796412);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar3.b(rVarH, i18).getSpacing200()), rVarH, 0);
                z(data.getAddressSection().getBuildingNumberData(), (j1.a) pq.v0.j(map, m1.BUILDING_NUMBER), rVarH, v50.c.f203957t);
            }
            rVarH.R();
            if (data.getAddressSection().getApartmentNumberData() == null) {
                rVarH.X(-367476927);
            } else {
                rVarH.X(-367476926);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar3.b(rVarH, i18).getSpacing200()), rVarH, 0);
                z(data.getAddressSection().getApartmentNumberData(), (j1.a) pq.v0.j(map, m1.APARTMENT_NUMBER), rVarH, v50.c.f203957t);
            }
            rVarH.R();
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: zt3.d1
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l1.p(data, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(n4.i0 i0Var) {
        t70.i.A(i0Var);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p(g.Data data, int i15, p076m2.r rVar, int i16) {
        n(data, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final <T> void q(final T t15, final er.r<? super d1.h0, ? super T, ? super p076m2.r, ? super Integer, oq.i0> rVar, p076m2.r rVar2, final int i15) {
        final int i16;
        p076m2.r rVarH = rVar2.h(1937314022);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(t15) : rVarH.G(t15) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(rVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1937314022, i16, -1, "pl.gov.coi.mobywatel.segment.addressform.presentation.addressformvms.AnimatedComponent (AddressFormView.kt:159)");
            }
            p114t0.k.g(t15 != null, null, null, null, null, y2.m.d(-1736342082, true, new er.q() { // from class: zt3.j1
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return l1.r(t15, rVar, i16, (p114t0.l) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, 196608, 30);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: zt3.k1
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l1.s(t15, rVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r(Object obj, er.r rVar, int i15, p114t0.l lVar, p076m2.r rVar2, int i16) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1736342082, i16, -1, "pl.gov.coi.mobywatel.segment.addressform.presentation.addressformvms.AnimatedComponent.<anonymous> (AddressFormView.kt:161)");
        }
        if (obj == null) {
            rVar2.X(1219162733);
        } else {
            rVar2.X(1219162734);
            f3.m.Companion companion = f3.m.INSTANCE;
            p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar2, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar2, 0));
            p076m2.e0 e0VarT = rVar2.t();
            f3.m mVarE = f3.j.e(rVar2, companion);
            androidx.compose.ui.node.c.Companion aVar = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = aVar.b();
            if (rVar2.l() == null) {
                p076m2.m.d();
            }
            rVar2.K();
            if (rVar2.getInserting()) {
                rVar2.H(aVarB);
            } else {
                rVar2.u();
            }
            p076m2.r rVarC = n6.c(rVar2);
            n6.i(rVarC, w0VarA, aVar.d());
            n6.i(rVarC, e0VarT, aVar.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), aVar.c());
            n6.g(rVarC, aVar.a());
            n6.i(rVarC, mVarE, aVar.e());
            rVar.g(d1.i0.f39176a, obj, rVar2, Integer.valueOf(((i15 & 8) << 3) | 6));
            rVar2.x();
        }
        rVar2.R();
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s(Object obj, er.r rVar, int i15, p076m2.r rVar2, int i16) {
        q(obj, rVar, rVar2, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void t(final DropDownButtonData dropDownButtonData, final j1.a aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1292951174);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(dropDownButtonData) : rVarH.G(dropDownButtonData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(aVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1292951174, i16, -1, "pl.gov.coi.mobywatel.segment.addressform.presentation.addressformvms.DropDownButton (AddressFormView.kt:112)");
            }
            f3.m mVarB = j1.e.b(f3.m.INSTANCE, aVar);
            p036e4.w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarB);
            androidx.compose.ui.node.c.Companion aVar2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = aVar2.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarI, aVar2.d());
            n6.i(rVarC, e0VarT, aVar2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), aVar2.c());
            n6.g(rVarC, aVar2.a());
            n6.i(rVarC, mVarE, aVar2.e());
            d1.x xVar = d1.x.f39368a;
            j40.l.m(dropDownButtonData, rVarH, DropDownButtonData.f99359i | (i16 & 14));
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: zt3.e1
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l1.u(dropDownButtonData, aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u(DropDownButtonData dropDownButtonData, j1.a aVar, int i15, p076m2.r rVar, int i16) {
        t(dropDownButtonData, aVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void v(final g.AddressSection.StreetData streetData, final j1.a aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-115752683);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(streetData) : rVarH.G(streetData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(aVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-115752683, i16, -1, "pl.gov.coi.mobywatel.segment.addressform.presentation.addressformvms.StreetComponent (AddressFormView.kt:134)");
            }
            q(streetData.getButton(), y2.m.d(-497087616, true, new er.r() { // from class: zt3.g1
                @Override // er.r
                public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                    return l1.w(aVar, (d1.h0) obj, (DropDownButtonData) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
                }
            }, rVarH, 54), rVarH, DropDownButtonData.f99359i | 48);
            q(streetData.getSwitch(), y2.m.d(-1748264280, true, new er.r() { // from class: zt3.h1
                @Override // er.r
                public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                    return l1.x(streetData, (d1.h0) obj, (s50.a) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
                }
            }, rVarH, 54), rVarH, s50.a.f177982i | 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: zt3.i1
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l1.y(streetData, aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w(j1.a aVar, d1.h0 h0Var, DropDownButtonData dropDownButtonData, p076m2.r rVar, int i15) {
        if ((i15 & 48) == 0) {
            i15 |= (i15 & 64) == 0 ? rVar.W(dropDownButtonData) : rVar.G(dropDownButtonData) ? 32 : 16;
        }
        if (rVar.r((i15 & 145) != 144, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-497087616, i15, -1, "pl.gov.coi.mobywatel.segment.addressform.presentation.addressformvms.StreetComponent.<anonymous> (AddressFormView.kt:136)");
            }
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200()), rVar, 0);
            t(dropDownButtonData, aVar, rVar, DropDownButtonData.f99359i | ((i15 >> 3) & 14));
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 x(g.AddressSection.StreetData streetData, d1.h0 h0Var, s50.a aVar, p076m2.r rVar, int i15) {
        float spacing100;
        if ((i15 & 48) == 0) {
            i15 |= (i15 & 64) == 0 ? rVar.W(aVar) : rVar.G(aVar) ? 32 : 16;
        }
        if (rVar.r((i15 & 145) != 144, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1748264280, i15, -1, "pl.gov.coi.mobywatel.segment.addressform.presentation.addressformvms.StreetComponent.<anonymous> (AddressFormView.kt:144)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            if (streetData.getButton() == null) {
                rVar.X(-749756270);
                spacing100 = k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200();
                rVar.R();
            } else {
                rVar.X(-749754766);
                spacing100 = k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing100();
                rVar.R();
            }
            r3.a(androidx.compose.foundation.layout.d.i(companion, spacing100), rVar, 0);
            s50.d.b(aVar, rVar, s50.a.f177982i | ((i15 >> 3) & 14));
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y(g.AddressSection.StreetData streetData, j1.a aVar, int i15, p076m2.r rVar, int i16) {
        v(streetData, aVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void z(final v50.c cVar, final j1.a aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1315386768);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(aVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1315386768, i16, -1, "pl.gov.coi.mobywatel.segment.addressform.presentation.addressformvms.TextInput (AddressFormView.kt:124)");
            }
            f3.m mVarB = j1.e.b(f3.m.INSTANCE, aVar);
            p036e4.w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarB);
            androidx.compose.ui.node.c.Companion aVar2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = aVar2.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarI, aVar2.d());
            n6.i(rVarC, e0VarT, aVar2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), aVar2.c());
            n6.g(rVarC, aVar2.a());
            n6.i(rVarC, mVarE, aVar2.e());
            d1.x xVar = d1.x.f39368a;
            u50.v0.g(cVar, null, rVarH, v50.c.f203957t | (i16 & 14), 2);
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: zt3.f1
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l1.A(cVar, aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
