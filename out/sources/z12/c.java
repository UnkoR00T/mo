package z12;

import d1.e0;
import d1.i;
import d1.x;
import er.p;
import j40.DropDownButtonData;
import j40.l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ju.p0;
import lr.m;
import oq.i0;
import oq.u;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import pq.v;
import pq.v0;
import tq.e;
import vq.j;
import vq.k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001BG\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R&\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lz12/c;", "Lb50/a;", "", "Ly12/c$b;", "inputs", "Lkotlin/Function2;", "Ly12/c$c;", "", "Loq/i0;", "onFocusChanged", "fieldTypeToScroll", "Lkotlin/Function0;", "onScrollToField", "<init>", "(Ljava/util/List;Ler/p;Ly12/c$c;Ler/a;)V", "a", "()Ler/p;", "Ljava/util/List;", "b", "Ler/p;", "c", "Ly12/c$c;", "d", "Ler/a;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements b50.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<y12.c.b> inputs;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p<y12.c.InterfaceC5962c, Boolean, i0> onFocusChanged;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final y12.c.InterfaceC5962c fieldTypeToScroll;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final er.a<i0> onScrollToField;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends k implements p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f232294e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f232295f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f232296g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f232297h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ Map<y12.c.InterfaceC5962c, j1.a> f232299k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Map<y12.c.InterfaceC5962c, ? extends j1.a> map, e<? super a> eVar) {
            super(2, eVar);
            this.f232299k = map;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c cVar;
            Object objE = uq.b.e();
            int i15 = this.f232297h;
            if (i15 == 0) {
                u.b(obj);
                y12.c.InterfaceC5962c interfaceC5962c = c.this.fieldTypeToScroll;
                if (interfaceC5962c != null) {
                    Map<y12.c.InterfaceC5962c, j1.a> map = this.f232299k;
                    c cVar2 = c.this;
                    j1.a aVar = (j1.a) v0.j(map, interfaceC5962c);
                    this.f232294e = cVar2;
                    this.f232295f = j.a(interfaceC5962c);
                    this.f232296g = 0;
                    this.f232297h = 1;
                    if (j1.a.a(aVar, null, this, 1, null) == objE) {
                        return objE;
                    }
                    cVar = cVar2;
                }
                return i0.f148189a;
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cVar = (c) this.f232294e;
            u.b(obj);
            cVar.onScrollToField.a();
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return c.this.new a(this.f232299k, eVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(List<? extends y12.c.b> list, p<? super y12.c.InterfaceC5962c, ? super Boolean, i0> pVar, y12.c.InterfaceC5962c interfaceC5962c, er.a<i0> aVar) {
        this.inputs = list;
        this.onFocusChanged = pVar;
        this.fieldTypeToScroll = interfaceC5962c;
        this.onScrollToField = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(c cVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(1741054390, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.advancedsearch.content.SearchRadioButtonContent.content.<anonymous> (SearchRadioButtonContent.kt:31)");
            }
            Object objE = rVar.E();
            if (objE == r.INSTANCE.a()) {
                wq.a<y12.c.InterfaceC5962c.a> aVarE = y12.c.InterfaceC5962c.a.e();
                LinkedHashMap linkedHashMap = new LinkedHashMap(m.e(v0.e(v.y(aVarE, 10)), 16));
                Iterator<y12.c.InterfaceC5962c.a> it = aVarE.iterator();
                while (it.hasNext()) {
                    linkedHashMap.put(it.next(), j1.e.a());
                }
                wq.a<y12.c.InterfaceC5962c.b> aVarE2 = y12.c.InterfaceC5962c.b.e();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(m.e(v0.e(v.y(aVarE2, 10)), 16));
                Iterator<y12.c.InterfaceC5962c.b> it4 = aVarE2.iterator();
                while (it4.hasNext()) {
                    linkedHashMap2.put(it4.next(), j1.e.a());
                }
                Map mapO = v0.o(linkedHashMap, linkedHashMap2);
                wq.a<y12.c.InterfaceC5962c.EnumC5963c> aVarE3 = y12.c.InterfaceC5962c.EnumC5963c.e();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(m.e(v0.e(v.y(aVarE3, 10)), 16));
                Iterator<y12.c.InterfaceC5962c.EnumC5963c> it5 = aVarE3.iterator();
                while (it5.hasNext()) {
                    linkedHashMap3.put(it5.next(), j1.e.a());
                }
                objE = v0.o(mapO, linkedHashMap3);
                rVar.v(objE);
            }
            Map map = (Map) objE;
            y12.c.InterfaceC5962c interfaceC5962c = cVar.fieldTypeToScroll;
            boolean zG = rVar.G(cVar) | rVar.G(map);
            Object objE2 = rVar.E();
            if (zG || objE2 == r.INSTANCE.a()) {
                objE2 = cVar.new a(map, null);
                rVar.v(objE2);
            }
            Function0.d(interfaceC5962c, (p) objE2, rVar, 0);
            i.f fVarR = i.f39152a.r(k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200());
            f3.m.Companion companion = f3.m.INSTANCE;
            w0 w0VarA = e0.a(fVarR, f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, companion);
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
            rVar.X(-1915078534);
            for (y12.c.b bVar : cVar.inputs) {
                rVar.J(-1382982006, bVar.getType());
                if (bVar instanceof y12.c.b.DropDownButton) {
                    rVar.X(-1382979404);
                    y12.c.b.DropDownButton dropDownButton = (y12.c.b.DropDownButton) bVar;
                    f3.m mVarB = d60.c.INSTANCE.b(j1.e.b(f3.m.INSTANCE, (j1.a) v0.j(map, dropDownButton.getType())), g(cVar, dropDownButton.getType(), rVar, 0));
                    w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
                    int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
                    p076m2.e0 e0VarT2 = rVar.t();
                    f3.m mVarE2 = f3.j.e(rVar, mVarB);
                    androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
                    er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
                    if (rVar.l() == null) {
                        p076m2.m.d();
                    }
                    rVar.K();
                    if (rVar.getInserting()) {
                        rVar.H(aVarB2);
                    } else {
                        rVar.u();
                    }
                    r rVarC2 = n6.c(rVar);
                    n6.i(rVarC2, w0VarI, companion3.d());
                    n6.i(rVarC2, e0VarT2, companion3.f());
                    n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
                    n6.g(rVarC2, companion3.a());
                    n6.i(rVarC2, mVarE2, companion3.e());
                    x xVar = x.f39368a;
                    l.m(dropDownButton.getDropDownButtonData(), rVar, DropDownButtonData.f99359i);
                    rVar.x();
                    rVar.R();
                } else {
                    if (!(bVar instanceof y12.c.b.TextInput)) {
                        rVar.X(-1382981148);
                        rVar.R();
                        throw new oq.p();
                    }
                    rVar.X(-1382964327);
                    y12.c.b.TextInput textInput = (y12.c.b.TextInput) bVar;
                    f3.m mVarB2 = j1.e.b(f3.m.INSTANCE, (j1.a) v0.j(map, textInput.getType()));
                    w0 w0VarI2 = d1.r.i(f3.c.INSTANCE.o(), false);
                    int iHashCode3 = Long.hashCode(p076m2.m.b(rVar, 0));
                    p076m2.e0 e0VarT3 = rVar.t();
                    f3.m mVarE3 = f3.j.e(rVar, mVarB2);
                    androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
                    er.a<androidx.compose.ui.node.c> aVarB3 = companion4.b();
                    if (rVar.l() == null) {
                        p076m2.m.d();
                    }
                    rVar.K();
                    if (rVar.getInserting()) {
                        rVar.H(aVarB3);
                    } else {
                        rVar.u();
                    }
                    r rVarC3 = n6.c(rVar);
                    n6.i(rVarC3, w0VarI2, companion4.d());
                    n6.i(rVarC3, e0VarT3, companion4.f());
                    n6.i(rVarC3, Integer.valueOf(iHashCode3), companion4.c());
                    n6.g(rVarC3, companion4.a());
                    n6.i(rVarC3, mVarE3, companion4.e());
                    x xVar2 = x.f39368a;
                    u50.v0.g(textInput.getTextInputData(), g(cVar, textInput.getType(), rVar, 0), rVar, v50.c.f203957t, 0);
                    rVar.x();
                    rVar.R();
                }
                rVar.U();
            }
            rVar.R();
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    private static final d60.c g(final c cVar, final y12.c.InterfaceC5962c interfaceC5962c, r rVar, int i15) {
        if (t.k()) {
            t.o(1999580286, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.advancedsearch.content.SearchRadioButtonContent.content.<anonymous>.createFieldFocusHost (SearchRadioButtonContent.kt:49)");
        }
        boolean zG = ((((i15 & 14) ^ 6) > 4 && rVar.W(interfaceC5962c)) || (i15 & 6) == 4) | rVar.G(cVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new er.l() { // from class: z12.b
                @Override // er.l
                public final Object b(Object obj) {
                    return c.h(this.f232288a, interfaceC5962c, ((Boolean) obj).booleanValue());
                }
            };
            rVar.v(objE);
        }
        d60.c cVarB = d60.e.b(false, (er.l) objE, rVar, 0, 1);
        if (t.k()) {
            t.n();
        }
        return cVarB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(c cVar, y12.c.InterfaceC5962c interfaceC5962c, boolean z15) {
        cVar.onFocusChanged.B(interfaceC5962c, Boolean.valueOf(z15));
        return i0.f148189a;
    }

    @Override // b50.a
    public p<r, Integer, i0> a() {
        return y2.m.b(1741054390, true, new p() { // from class: z12.a
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return c.f(this.f232287a, (r) obj, ((Integer) obj2).intValue());
            }
        });
    }
}
