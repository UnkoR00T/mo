package p079n1;

import androidx.compose.ui.node.c;
import c5.b;
import er.l;
import er.p;
import er.q;
import f3.m;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import oq.i0;
import oq.r;
import p036e4.a2;
import p036e4.v0;
import p036e4.w0;
import p036e4.x0;
import p036e4.y0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.g4;
import p076m2.n6;
import p076m2.t;
import pq.v;
import q4.Placeholder;
import q4.e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\u001aa\u0010\r\u001a:\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t0\u0006\u0012 \u0012\u001e\u0012\u001a\u0012\u0018\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n0\u0007j\u0002`\f0\u00060\u0005*\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u0000H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a;\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00002\"\u0010\u0013\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n0\u0007j\u0002`\f0\u0006H\u0001¢\u0006\u0004\b\u0014\u0010\u0015\"L\u0010\u0018\u001a:\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t0\u0006\u0012 \u0012\u001e\u0012\u001a\u0012\u0018\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n0\u0007j\u0002`\f0\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017*\u0018\b\u0000\u0010\u0019\"\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0012\u0004\u0012\u00020\b0\u0007*0\b\u0000\u0010\u001a\"\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n0\u00072\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n0\u0007¨\u0006\u001b"}, d2 = {"Lq4/e;", "", "", "Ln1/b3;", "inlineContent", "Loq/r;", "", "Lq4/e$d;", "Lq4/g0;", "Landroidx/compose/foundation/text/PlaceholderRange;", "Lkotlin/Function1;", "Loq/i0;", "Landroidx/compose/foundation/text/InlineContentRange;", "e", "(Lq4/e;Ljava/util/Map;)Loq/r;", "", "d", "(Lq4/e;)Z", "text", "inlineContents", "b", "(Lq4/e;Ljava/util/List;Lm2/r;I)V", "a", "Loq/r;", "EmptyInlineContent", "PlaceholderRange", "InlineContentRange", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final r<List<e.Range<Placeholder>>, List<e.Range<q<String, p076m2.r, Integer, i0>>>> f130111a = new r<>(v.n(), v.n());

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f130112a = new a();

        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 b(List list, a2.a aVar) {
            int size = list.size();
            for (int i15 = 0; i15 < size; i15++) {
                a2.a.I(aVar, (a2) list.get(i15), 0, 0, 0.0f, 4, null);
            }
            return i0.f148189a;
        }

        @Override // p036e4.w0
        public final x0 e(y0 y0Var, List<? extends v0> list, long j15) {
            final ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i15 = 0; i15 < size; i15++) {
                arrayList.add(list.get(i15).o0(j15));
            }
            return y0.j2(y0Var, b.l(j15), b.k(j15), null, new l() { // from class: n1.i
                @Override // er.l
                public final Object b(Object obj) {
                    return j.a.b(arrayList, (a2.a) obj);
                }
            }, 4, null);
        }
    }

    public static final void b(final e eVar, final List<e.Range<q<String, p076m2.r, Integer, i0>>> list, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1794596951);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(eVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(list) ? 32 : 16;
        }
        int i17 = 0;
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(-1794596951, i16, -1, "androidx.compose.foundation.text.InlineChildren (AnnotatedStringResolveInlineContent.kt:67)");
            }
            int size = list.size();
            int i18 = 0;
            while (i18 < size) {
                e.Range<q<String, p076m2.r, Integer, i0>> range = list.get(i18);
                q<String, p076m2.r, Integer, i0> qVarA = range.a();
                int start = range.getStart();
                int end = range.getEnd();
                Object objE = rVarH.E();
                if (objE == p076m2.r.INSTANCE.a()) {
                    objE = a.f130112a;
                    rVarH.v(objE);
                }
                w0 w0Var = (w0) objE;
                m.Companion companion = m.INSTANCE;
                int iHashCode = Long.hashCode(p076m2.m.b(rVarH, i17));
                e0 e0VarT = rVarH.t();
                m mVarE = f3.j.e(rVarH, companion);
                c.Companion companion2 = c.INSTANCE;
                er.a<c> aVarB = companion2.b();
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
                int i19 = i17;
                n6.i(rVarC, w0Var, companion2.d());
                n6.i(rVarC, e0VarT, companion2.f());
                n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
                n6.g(rVarC, companion2.a());
                n6.i(rVarC, mVarE, companion2.e());
                qVarA.w(eVar.subSequence(start, end).getText(), rVarH, Integer.valueOf(i19));
                rVarH.x();
                i18++;
                i17 = i19;
            }
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: n1.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.c(eVar, list, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(e eVar, List list, int i15, p076m2.r rVar, int i16) {
        b(eVar, list, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final boolean d(e eVar) {
        return eVar.p("androidx.compose.foundation.text.inlineContent", 0, eVar.getText().length());
    }

    public static final r<List<e.Range<Placeholder>>, List<e.Range<q<String, p076m2.r, Integer, i0>>>> e(e eVar, Map<String, b3> map) {
        if (map == null || map.isEmpty()) {
            return f130111a;
        }
        List<e.Range<String>> listJ = eVar.j("androidx.compose.foundation.text.inlineContent", 0, eVar.getText().length());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = listJ.size();
        for (int i15 = 0; i15 < size; i15++) {
            e.Range<String> range = listJ.get(i15);
            b3 b3Var = map.get(range.g());
            if (b3Var != null) {
                arrayList.add(new e.Range(b3Var.getPlaceholder(), range.h(), range.f()));
                arrayList2.add(new e.Range(b3Var.a(), range.h(), range.f()));
            }
        }
        return new r<>(arrayList, arrayList2);
    }
}
