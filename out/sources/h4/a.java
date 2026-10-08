package h4;

import androidx.compose.ui.semantics.SemanticsConfiguration;
import fr.w;
import java.util.ArrayList;
import java.util.List;
import k6.p;
import m3.e;
import n4.CollectionInfo;
import n4.c0;
import n4.q;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001d\u0010\r\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0012\u001a\n \u0011*\u0004\u0018\u00010\u00100\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a#\u0010\u0017\u001a\n \u0011*\u0004\u0018\u00010\u00160\u0016*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\"\u0018\u0010\u001b\u001a\u00020\b*\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Ln4/w;", "node", "Lk6/p;", "info", "Loq/i0;", "d", "(Ln4/w;Lk6/p;)V", "e", "", "b", "(Ln4/w;)Z", "", "items", "a", "(Ljava/util/List;)Z", "Ln4/d;", "Lk6/p$f;", "kotlin.jvm.PlatformType", "f", "(Ln4/d;)Lk6/p$f;", "Ln4/e;", "itemNode", "Lk6/p$g;", "g", "(Ln4/e;Ln4/w;)Lk6/p$g;", "c", "(Ln4/d;)Z", "isLazyCollection", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: h4.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 1, 0})
    static final class C1853a extends w implements er.a<Boolean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C1853a f80776b = new C1853a();

        C1853a() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean a() {
            return Boolean.FALSE;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 1, 0})
    static final class b extends w implements er.a<Boolean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f80777b = new b();

        b() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean a() {
            return Boolean.FALSE;
        }
    }

    private static final boolean a(List<n4.w> list) {
        List listN;
        long packedValue;
        if (list.size() < 2) {
            return true;
        }
        if (list.size() <= 1) {
            listN = v.n();
        } else {
            ArrayList arrayList = new ArrayList();
            n4.w wVar = list.get(0);
            int iP = v.p(list);
            int i15 = 0;
            while (i15 < iP) {
                i15++;
                n4.w wVar2 = list.get(i15);
                n4.w wVar3 = wVar2;
                n4.w wVar4 = wVar;
                arrayList.add(e.d(e.e((((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (wVar4.k().g() >> 32)) - Float.intBitsToFloat((int) (wVar3.k().g() >> 32))))) << 32) | (((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (wVar4.k().g() & BodyPartID.bodyIdMax)) - Float.intBitsToFloat((int) (wVar3.k().g() & BodyPartID.bodyIdMax))))) & BodyPartID.bodyIdMax))));
                wVar = wVar2;
            }
            listN = arrayList;
        }
        if (listN.size() == 1) {
            packedValue = ((e) v.l0(listN)).getPackedValue();
        } else {
            if (listN.isEmpty()) {
                e5.b.g("Empty collection can't be reduced.");
            }
            Object objL0 = v.l0(listN);
            int iP2 = v.p(listN);
            if (1 <= iP2) {
                int i16 = 1;
                while (true) {
                    objL0 = e.d(e.q(((e) objL0).getPackedValue(), ((e) listN.get(i16)).getPackedValue()));
                    if (i16 == iP2) {
                        break;
                    }
                    i16++;
                }
            }
            packedValue = ((e) objL0).getPackedValue();
        }
        return Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & packedValue)) < Float.intBitsToFloat((int) (packedValue >> 32));
    }

    public static final boolean b(n4.w wVar) {
        SemanticsConfiguration semanticsConfigurationP = wVar.p();
        c0 c0Var = c0.f131174a;
        return (q.a(semanticsConfigurationP, c0Var.a()) == null && q.a(wVar.p(), c0Var.G()) == null) ? false : true;
    }

    private static final boolean c(CollectionInfo collectionInfo) {
        return collectionInfo.getRowCount() < 0 || collectionInfo.getColumnCount() < 0;
    }

    public static final void d(n4.w wVar, p pVar) {
        SemanticsConfiguration semanticsConfigurationP = wVar.p();
        c0 c0Var = c0.f131174a;
        CollectionInfo collectionInfo = (CollectionInfo) q.a(semanticsConfigurationP, c0Var.a());
        if (collectionInfo != null) {
            pVar.q0(f(collectionInfo));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (q.a(wVar.p(), c0Var.G()) != null) {
            List<n4.w> listV = wVar.v();
            int size = listV.size();
            for (int i15 = 0; i15 < size; i15++) {
                n4.w wVar2 = listV.get(i15);
                if (wVar2.p().g(c0.f131174a.H())) {
                    arrayList.add(wVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean zA = a(arrayList);
        pVar.q0(p.f.a(zA ? 1 : arrayList.size(), zA ? arrayList.size() : 1, false, 0));
    }

    public static final void e(n4.w wVar, p pVar) {
        SemanticsConfiguration semanticsConfigurationP = wVar.p();
        c0 c0Var = c0.f131174a;
        n4.e eVar = (n4.e) q.a(semanticsConfigurationP, c0Var.b());
        if (eVar != null) {
            pVar.r0(g(eVar, wVar));
        }
        n4.w wVarT = wVar.t();
        if (wVarT == null || q.a(wVarT.p(), c0Var.G()) == null) {
            return;
        }
        CollectionInfo collectionInfo = (CollectionInfo) q.a(wVarT.p(), c0Var.a());
        if ((collectionInfo == null || !c(collectionInfo)) && wVar.p().g(c0Var.H())) {
            ArrayList arrayList = new ArrayList();
            List<n4.w> listV = wVarT.v();
            int size = listV.size();
            int i15 = 0;
            for (int i16 = 0; i16 < size; i16++) {
                n4.w wVar2 = listV.get(i16);
                if (wVar2.p().g(c0.f131174a.H())) {
                    arrayList.add(wVar2);
                    if (wVar2.getLayoutNode().D0() < wVar.getLayoutNode().D0()) {
                        i15++;
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            boolean zA = a(arrayList);
            p.g gVarA = p.g.a(zA ? 0 : i15, 1, zA ? i15 : 0, 1, false, ((Boolean) wVar.p().n(c0.f131174a.H(), C1853a.f80776b)).booleanValue());
            if (gVarA != null) {
                pVar.r0(gVarA);
            }
        }
    }

    private static final p.f f(CollectionInfo collectionInfo) {
        return p.f.a(collectionInfo.getRowCount(), collectionInfo.getColumnCount(), false, 0);
    }

    private static final p.g g(n4.e eVar, n4.w wVar) {
        return p.g.a(eVar.getRowIndex(), eVar.getRowSpan(), eVar.getColumnIndex(), eVar.getColumnSpan(), false, ((Boolean) wVar.p().n(c0.f131174a.H(), b.f80777b)).booleanValue());
    }
}
