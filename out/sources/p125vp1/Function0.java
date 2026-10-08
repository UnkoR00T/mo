package p125vp1;

import androidx.compose.ui.graphics.Color;
import c5.h;
import d1.a3;
import d1.e0;
import d1.h0;
import d1.i;
import d1.k;
import d1.x;
import er.l;
import er.p;
import er.q;
import f3.j;
import f3.m;
import fr.q0;
import fr.v0;
import g1.t0;
import g1.v;
import i30.ButtonIconData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import l70.DefaultColors;
import l70.f;
import mx.Label;
import n3.o1;
import oq.i0;
import oq.y;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p036e4.w0;
import p046f2.c2;
import p046f2.y1;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import p70.n;

/* JADX INFO: renamed from: vp1.e, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\t\u001a\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u0011\u0010\f\u001a\u00020\u0006*\u00020\u000b¢\u0006\u0004\b\f\u0010\r\u001a\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "close", "h", "(Ler/a;Lm2/r;I)V", "Loq/r;", "", "Landroidx/compose/ui/graphics/Color;", "color", "e", "(Loq/r;Lm2/r;I)V", "", "l", "(I)Ljava/lang/String;", "k", "(J)Ljava/lang/String;", "developer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function0 {

    /* JADX INFO: renamed from: vp1.e$a */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f207856a = new a();

        a() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-337230071);
            if (t.k()) {
                t.o(-337230071, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.colors.DeveloperColorScreen.<anonymous>.<anonymous> (DeveloperColorScreen.kt:47)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jB;
        }
    }

    /* JADX INFO: renamed from: vp1.e$b */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f207857a = new b();

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Void b(oq.r<? extends String, ? extends Color> rVar) {
            return null;
        }
    }

    /* JADX INFO: renamed from: vp1.e$c */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c implements l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f207858a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f207859b;

        public c(l lVar, List list) {
            this.f207858a = lVar;
            this.f207859b = list;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Object b(Integer num) {
            return c(num.intValue());
        }

        public final Object c(int i15) {
            return this.f207858a.b(this.f207859b.get(i15));
        }
    }

    /* JADX INFO: renamed from: vp1.e$d */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class d implements er.r<v, Integer, r, Integer, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f207860a;

        public d(List list) {
            this.f207860a = list;
        }

        public final void c(v vVar, int i15, r rVar, int i16) {
            int i17;
            if ((i16 & 6) == 0) {
                i17 = (rVar.W(vVar) ? 4 : 2) | i16;
            } else {
                i17 = i16;
            }
            if ((i16 & 48) == 0) {
                i17 |= rVar.c(i15) ? 32 : 16;
            }
            if (!rVar.r((i17 & 147) != 146, i17 & 1)) {
                rVar.O();
                return;
            }
            if (t.k()) {
                t.o(-1117249557, i17, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:539)");
            }
            oq.r rVar2 = (oq.r) this.f207860a.get(i15);
            rVar.X(1292978771);
            Function0.e(rVar2, rVar, 0);
            rVar.R();
            if (t.k()) {
                t.n();
            }
        }

        @Override // er.r
        public /* bridge */ /* synthetic */ i0 g(v vVar, Integer num, r rVar, Integer num2) {
            c(vVar, num.intValue(), rVar, num2.intValue());
            return i0.f148189a;
        }
    }

    public static final void e(final oq.r<String, Color> rVar, r rVar2, final int i15) {
        int i16;
        r rVar3;
        r rVarH = rVar2.h(-1868016743);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(rVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1868016743, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.colors.ColorItem (DeveloperColorScreen.kt:96)");
            }
            m mVarN = a3.n(m.INSTANCE, h.n(6));
            y1 y1Var = y1.f58315a;
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            c2.c(mVarN, aVar.e(rVarH, i17).getRadius50(), null, y1Var.c(aVar.c(rVarH, i17).getLevel0(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, rVarH, y1.f58316b << 18, 62), null, y2.m.d(-2135077529, true, new q() { // from class: vp1.a
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return Function0.f(rVar, (h0) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, 196614, 20);
            rVar3 = rVarH;
            if (t.k()) {
                t.n();
            }
        } else {
            rVar3 = rVarH;
            rVar3.O();
        }
        d5 d5VarM = rVar3.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: vp1.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.g(rVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(oq.r rVar, h0 h0Var, r rVar2, int i15) {
        if (rVar2.r((i15 & 17) != 16, i15 & 1)) {
            if (t.k()) {
                t.o(-2135077529, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.colors.ColorItem.<anonymous> (DeveloperColorScreen.kt:104)");
            }
            f3.c.Companion companion = f3.c.INSTANCE;
            f3.c.b bVarG = companion.g();
            m.Companion companion2 = m.INSTANCE;
            i iVar = i.f39152a;
            w0 w0VarA = e0.a(iVar.k(), bVarG, rVar2, 48);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar2, 0));
            p076m2.e0 e0VarT = rVar2.t();
            m mVarE = j.e(rVar2, companion2);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
            if (rVar2.l() == null) {
                p076m2.m.d();
            }
            rVar2.K();
            if (rVar2.getInserting()) {
                rVar2.H(aVarB);
            } else {
                rVar2.u();
            }
            r rVarC = n6.c(rVar2);
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            m mVarD = w0.i.d(k.b(companion2, 1.0f, false, 2, null), ((Color) rVar.d()).m20unboximpl(), null, 2, null);
            w0 w0VarI = d1.r.i(companion.o(), false);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar2, 0));
            p076m2.e0 e0VarT2 = rVar2.t();
            m mVarE2 = j.e(rVar2, mVarD);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
            if (rVar2.l() == null) {
                p076m2.m.d();
            }
            rVar2.K();
            if (rVar2.getInserting()) {
                rVar2.H(aVarB2);
            } else {
                rVar2.u();
            }
            r rVarC2 = n6.c(rVar2);
            n6.i(rVarC2, w0VarI, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            x xVar = x.f39368a;
            m mVarF = androidx.compose.foundation.layout.d.f(companion2, 0.0f, 1, null);
            w0 w0VarA2 = e0.a(iVar.e(), companion.g(), rVar2, 54);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVar2, 0));
            p076m2.e0 e0VarT3 = rVar2.t();
            m mVarE3 = j.e(rVar2, mVarF);
            er.a<androidx.compose.ui.node.c> aVarB3 = companion3.b();
            if (rVar2.l() == null) {
                p076m2.m.d();
            }
            rVar2.K();
            if (rVar2.getInserting()) {
                rVar2.H(aVarB3);
            } else {
                rVar2.u();
            }
            r rVarC3 = n6.c(rVar2);
            n6.i(rVarC3, w0VarA2, companion3.d());
            n6.i(rVarC3, e0VarT3, companion3.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion3.c());
            n6.g(rVarC3, companion3.a());
            n6.i(rVarC3, mVarE3, companion3.e());
            m mVarP = a3.p(companion2, h.n(2), 0.0f, 2, null);
            Label labelB = mx.b.b(k(((Color) rVar.d()).m20unboximpl()), "");
            b5.j.Companion companion4 = b5.j.INSTANCE;
            j70.h.g(mVarP, null, labelB, null, null, 0L, 0L, null, null, null, 0L, null, b5.j.h(companion4.a()), 0L, 0, false, 0, 0, null, null, null, null, false, false, null, rVar2, 6, 0, 0, 33550330);
            rVar2.x();
            rVar2.x();
            j70.h.g(null, null, mx.b.b((String) rVar.c(), ""), null, null, 0L, 0L, null, null, null, 0L, null, b5.j.h(companion4.a()), 0L, 0, false, 0, 0, null, null, null, null, false, false, null, rVar2, 0, 0, 0, 33550331);
            rVar2.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(oq.r rVar, int i15, r rVar2, int i16) {
        e(rVar, rVar2, g4.a(i15 | 1));
        return i0.f148189a;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final void h(final er.a<i0> aVar, r rVar, final int i15) {
        r rVar2;
        r rVarH = rVar.h(1356458146);
        int i16 = (i15 & 6) == 0 ? (rVarH.G(aVar) ? 4 : 2) | i15 : i15;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1356458146, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.colors.DeveloperColorScreen (DeveloperColorScreen.kt:39)");
            }
            m mVarH = androidx.compose.foundation.layout.d.h(m.INSTANCE, 0.0f, 1, null);
            w0 w0VarA = e0.a(i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            m mVarE = j.e(rVarH, mVarH);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            n.g(null, null, mx.b.b("Colors 1.1.9", ""), null, null, 0L, null, new ButtonIconData(null, jz.a.U, a.f207856a, null, c70.a.f23835a.a().R(), aVar, 9, null), rVarH, ButtonIconData.f88935g << 21, 123);
            final ArrayList arrayList = new ArrayList();
            for (mr.n nVar : nr.d.a(q0.c(DefaultColors.class))) {
                String name = nVar.getName();
                switch (name.hashCode()) {
                    case -1854767153:
                        if (name.equals("support")) {
                            Collection<mr.n> collectionA = nr.d.a(q0.c(l70.h.b.class));
                            ArrayList arrayList2 = new ArrayList(pq.v.y(collectionA, 10));
                            for (mr.n nVar2 : collectionA) {
                                or.a.b(nVar2, true);
                                arrayList2.add(y.a(nVar.getName() + '_' + nVar2.getName(), (Color) nVar2.get(l70.h.b.f116747a)));
                            }
                            arrayList.addAll(arrayList2);
                        } else {
                            arrayList.add(y.a(nVar.getName(), Color.m0boximpl(Color.INSTANCE.g())));
                        }
                        break;
                    case -1853231955:
                        if (name.equals("surface")) {
                            Collection<mr.n> collectionA2 = nr.d.a(q0.c(l70.i.b.class));
                            ArrayList arrayList3 = new ArrayList(pq.v.y(collectionA2, 10));
                            for (mr.n nVar3 : collectionA2) {
                                or.a.b(nVar3, true);
                                arrayList3.add(y.a(nVar.getName() + '_' + nVar3.getName(), (Color) nVar3.get(l70.i.b.f116763a)));
                            }
                            arrayList.addAll(arrayList3);
                        } else {
                            arrayList.add(y.a(nVar.getName(), Color.m0boximpl(Color.INSTANCE.g())));
                        }
                        break;
                    case 3016401:
                        if (name.equals("base")) {
                            Collection<mr.n> collectionA3 = nr.d.a(q0.c(f.class));
                            ArrayList arrayList4 = new ArrayList(pq.v.y(collectionA3, 10));
                            for (mr.n nVar4 : collectionA3) {
                                or.a.b(nVar4, true);
                                arrayList4.add(y.a(nVar.getName() + '_' + nVar4.getName(), (Color) nVar4.get(f.f116726a)));
                            }
                            arrayList.addAll(arrayList4);
                        } else {
                            arrayList.add(y.a(nVar.getName(), Color.m0boximpl(Color.INSTANCE.g())));
                        }
                        break;
                    case 1844321735:
                        if (name.equals(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.f37063p)) {
                            Collection<mr.n> collectionA4 = nr.d.a(q0.c(a20.a.b.class));
                            ArrayList arrayList5 = new ArrayList(pq.v.y(collectionA4, 10));
                            for (mr.n nVar5 : collectionA4) {
                                or.a.b(nVar5, true);
                                arrayList5.add(y.a(nVar.getName() + '_' + nVar5.getName(), (Color) nVar5.get(a20.a.b.f2065a)));
                            }
                            arrayList.addAll(arrayList5);
                        } else {
                            arrayList.add(y.a(nVar.getName(), Color.m0boximpl(Color.INSTANCE.g())));
                        }
                        break;
                    default:
                        arrayList.add(y.a(nVar.getName(), Color.m0boximpl(Color.INSTANCE.g())));
                        break;
                }
            }
            m mVarD = w0.i.d(m.INSTANCE, k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a(), null, 2, null);
            w0 w0VarA2 = e0.a(i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            m mVarE2 = j.e(rVarH, mVarD);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB2 = companion2.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB2);
            } else {
                rVarH.u();
            }
            r rVarC2 = n6.c(rVarH);
            n6.i(rVarC2, w0VarA2, companion2.d());
            n6.i(rVarC2, e0VarT2, companion2.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion2.c());
            n6.g(rVarC2, companion2.a());
            n6.i(rVarC2, mVarE2, companion2.e());
            d1.i0 i0Var2 = d1.i0.f39176a;
            g1.b.a aVar2 = new g1.b.a(4);
            boolean zG = rVarH.G(arrayList);
            Object objE = rVarH.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: vp1.c
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.i(arrayList, (t0) obj);
                    }
                };
                rVarH.v(objE);
            }
            g1.i.c(aVar2, null, null, null, false, null, null, null, false, null, (l) objE, rVarH, 0, 0, 1022);
            rVar2 = rVarH;
            rVar2.x();
            rVar2.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: vp1.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.j(aVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(List list, t0 t0Var) {
        t0Var.g(list.size(), null, null, new c(b.f207857a, list), y2.m.b(-1117249557, true, new d(list)));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(er.a aVar, int i15, r rVar, int i16) {
        h(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final String k(long j15) {
        return l(o1.j(j15));
    }

    public static final String l(int i15) {
        v0 v0Var = v0.f66418a;
        return String.format("#%06X", Arrays.copyOf(new Object[]{Long.valueOf(BodyPartID.bodyIdMax & ((long) i15))}, 1));
    }
}
