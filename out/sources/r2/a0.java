package r2;

import e3.ObjectLocation;
import java.util.ConcurrentModificationException;
import java.util.List;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;
import p076m2.b5;
import p076m2.c5;
import p076m2.f4;
import p076m2.h4;
import p076m2.i5;
import p076m2.l0;
import p076m2.o1;
import p076m2.o2;
import p076m2.r2;
import p076m2.s1;
import p076m2.s2;
import p076m2.v4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\n\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\f\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\f\u0010\u000b\u001a#\u0010\u0011\u001a\u00020\r2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e2\u0006\u0010\u0010\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a5\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00072\f\u0010\u0019\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a+\u0010\"\u001a\u0004\u0018\u00010!*\u00020\u00012\u0014\u0010 \u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\u0004\u0012\u00020\u001f0\u001dH\u0000¢\u0006\u0004\b\"\u0010#\u001a'\u0010'\u001a\u00020\u0004*\u00020\u00012\n\u0010$\u001a\u00060\rj\u0002`\u000e2\u0006\u0010&\u001a\u00020%H\u0000¢\u0006\u0004\b'\u0010(\u001a)\u0010-\u001a\u0004\u0018\u00010,*\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0)2\n\u0010+\u001a\u00060\rj\u0002`*H\u0002¢\u0006\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lm2/i5;", "Lr2/o;", "f", "(Lm2/i5;)Lr2/o;", "Loq/i0;", "o", "()V", "Lr2/t;", "Lo2/e;", "rememberManager", "m", "(Lr2/t;Lo2/e;)V", "g", "", "Landroidx/compose/runtime/composer/linkbuffer/GroupAddress;", "groupAddress", "table", "k", "(ILr2/o;)I", "Lm2/l0;", "composition", "Lm2/s2;", "reference", "slots", "Lm2/c;", "applier", "Lm2/r2;", "i", "(Lm2/l0;Lm2/s2;Lr2/t;Lm2/c;)Lm2/r2;", "Lkotlin/Function1;", "", "", "filter", "Le3/u;", "j", "(Lr2/o;Ler/l;)Le3/u;", "group", "Lm2/h4;", "newOwner", "e", "(Lr2/o;ILm2/h4;)V", "", "Landroidx/compose/runtime/composer/linkbuffer/SlotRange;", "slotRegion", "Lm2/f4;", "l", "([Ljava/lang/Object;I)Lm2/f4;", "runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a0 {

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"r2/a0$a", "Lm2/h4;", "Lm2/f4;", "scope", "", "instance", "Lm2/s1;", "i", "(Lm2/f4;Ljava/lang/Object;)Lm2/s1;", "Loq/i0;", "g", "(Lm2/f4;)V", "value", "a", "(Ljava/lang/Object;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements h4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l0 f170737a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ s2 f170738b;

        a(l0 l0Var, s2 s2Var) {
            this.f170737a = l0Var;
            this.f170738b = s2Var;
        }

        @Override // p076m2.h4
        public void a(Object value) {
        }

        @Override // p076m2.h4
        public void g(f4 scope) {
        }

        @Override // p076m2.h4
        public s1 i(f4 scope, Object instance) {
            s1 s1VarI;
            l0 l0Var = this.f170737a;
            h4 h4Var = l0Var instanceof h4 ? (h4) l0Var : null;
            if (h4Var == null || (s1VarI = h4Var.i(scope, instance)) == null) {
                s1VarI = s1.IGNORED;
            }
            if (s1VarI != s1.IGNORED) {
                return s1VarI;
            }
            s2 s2Var = this.f170738b;
            List<oq.r<f4, Object>> listD = s2Var.d();
            if (instance == null) {
                instance = c5.f122830a;
            }
            s2Var.i(pq.v.M0(listD, oq.y.a(scope, instance)));
            return s1.SCHEDULED;
        }
    }

    public static final void e(o oVar, int i15, h4 h4Var) {
        int i16;
        int[] groups = oVar.getAddressSpace().getGroups();
        Object[] slots = oVar.getAddressSpace().getSlots();
        q addressSpace = oVar.getAddressSpace();
        if (i15 < 0) {
            return;
        }
        o1 o1Var = new o1();
        int[] groups2 = addressSpace.getGroups();
        int iG = i15;
        while (true) {
            f4 f4VarL = l(slots, groups[iG + 5]);
            if (f4VarL != null) {
                f4VarL.c(h4Var);
            }
            if (iG != i15 && (i16 = groups2[iG + 1]) >= 0) {
                o1Var.i(i16);
            }
            iG = groups2[iG + 3];
            if (iG < 0) {
                if (o1Var.tos == 0) {
                    return;
                } else {
                    iG = o1Var.g();
                }
            }
        }
    }

    public static final o f(i5 i5Var) {
        o oVar = i5Var instanceof o ? (o) i5Var : null;
        if (oVar != null) {
            return oVar;
        }
        p076m2.t.c("Inconsistent composer");
        throw new oq.g();
    }

    public static final void g(t tVar, final o2.e eVar) {
        tVar.O(tVar.getCurrent(), new t.a() { // from class: r2.z
            @Override // r2.t.a
            public final boolean a(int i15, int i16, Object obj) {
                return a0.h(eVar, i15, i16, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(o2.e eVar, int i15, int i16, Object obj) {
        if (obj instanceof p076m2.n) {
            eVar.e((p076m2.n) obj);
            return false;
        }
        if (obj instanceof b5) {
            return false;
        }
        if (obj instanceof v4) {
            eVar.c((v4) obj);
            return true;
        }
        if (!(obj instanceof f4)) {
            return false;
        }
        ((f4) obj).A();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r2 i(l0 l0Var, s2 s2Var, t tVar, p076m2.c<?> cVar) {
        int current = tVar.getCurrent();
        if (cVar != null && tVar.y(current) > 0) {
            q addressSpace = tVar.getTable().getAddressSpace();
            int parent = tVar.getParent();
            int[] groups = addressSpace.getGroups();
            int i15 = groups[parent + 2];
            while (true) {
                if (i15 <= 0) {
                    if (!(i15 != 0)) {
                        p076m2.t.b("Traversing parent of group not in the slot table: " + parent);
                    }
                    i15 = -1;
                    break;
                }
                if (tVar.r(i15)) {
                    break;
                }
                i15 = groups[i15 + 2];
            }
            if (i15 >= 0 && tVar.r(i15)) {
                Object objX = tVar.x(i15);
                if (objX == null) {
                    p076m2.t.b("Invalid slot table structure");
                    objX = i0.f148189a;
                }
                int iK = k(current, tVar.getTable());
                int iY = tVar.y(current);
                cVar.g(objX);
                cVar.b(iK, iY);
                cVar.j();
            }
        }
        o table = tVar.getTable();
        o.Companion companion = o.INSTANCE;
        r rVar = new r(table.getAddressSpace(), false, false);
        rVar.f();
        o2<Object> o2VarC = s2Var.c();
        rVar.B(126665345, o2VarC == p076m2.r.INSTANCE.a() ? 0 : 16777216, o2VarC, null, null);
        rVar.b(268435456);
        rVar.c(s2Var.getParameter());
        rVar.u(tVar, (((long) 0) << 32) | (((long) oq.b0.e(tVar.e(j.c(s2Var.getAnchor()).getAddress()))) & BodyPartID.bodyIdMax));
        rVar.i();
        o oVarD = rVar.d();
        r2 r2Var = new r2(oVarD);
        if (oVarD.G()) {
            p076m2.t.b("Cannot read while an editor is pending");
        }
        q addressSpace2 = oVarD.getAddressSpace();
        int root = oVarD.getRoot();
        if (root < 0) {
            return r2Var;
        }
        o1 o1Var = new o1();
        int[] groups2 = addressSpace2.getGroups();
        a aVar = null;
        while (true) {
            int i16 = oVarD.E()[root + 5];
            if (i16 != -1) {
                q addressSpace3 = oVarD.getAddressSpace();
                int iC = (i16 & 15) + 1;
                int i17 = i16 >> 4;
                if (iC > 15) {
                    iC = addressSpace3.o().c(i17);
                }
                for (int i18 = 0; i18 < iC; i18++) {
                    Object obj = oVarD.Q()[i17 + i18];
                    if (fr.t.c(obj, p076m2.r.INSTANCE.a())) {
                        break;
                    }
                    if (obj instanceof f4) {
                        if (aVar == null) {
                            aVar = new a(l0Var, s2Var);
                        }
                        ((f4) obj).c(aVar);
                        aVar = aVar;
                    }
                }
            }
            int i19 = groups2[root + 1];
            if (i19 >= 0) {
                o1Var.i(i19);
            }
            root = groups2[root + 3];
            if (root < 0) {
                if (o1Var.tos == 0) {
                    return r2Var;
                }
                root = o1Var.g();
            }
        }
    }

    public static final ObjectLocation j(o oVar, er.l<Object, Boolean> lVar) {
        int i15;
        b0 b0VarY = oVar.Y();
        try {
            int root = oVar.getRoot();
            q addressSpace = oVar.getAddressSpace();
            if (root >= 0) {
                o1 o1Var = new o1();
                int[] groups = addressSpace.getGroups();
                int iG = root;
                while (true) {
                    if (b0VarY.P(iG) && lVar.b(b0VarY.S(iG)).booleanValue()) {
                        ObjectLocation objectLocation = new ObjectLocation(iG, null);
                        b0VarY.d();
                        return objectLocation;
                    }
                    int i16 = oVar.E()[iG + 5];
                    if (i16 != -1) {
                        q addressSpace2 = oVar.getAddressSpace();
                        int iC = (i16 & 15) + 1;
                        int i17 = i16 >> 4;
                        if (iC > 15) {
                            iC = addressSpace2.o().c(i17);
                        }
                        for (int i18 = 0; i18 < iC; i18++) {
                            Object obj = oVar.Q()[i17 + i18];
                            if (fr.t.c(obj, p076m2.r.INSTANCE.a())) {
                                break;
                            }
                            if (lVar.b(obj).booleanValue()) {
                                ObjectLocation objectLocation2 = new ObjectLocation(iG, Integer.valueOf(i18));
                                b0VarY.d();
                                return objectLocation2;
                            }
                        }
                    }
                    if (iG != root && (i15 = groups[iG + 1]) >= 0) {
                        o1Var.i(i15);
                    }
                    iG = groups[iG + 3];
                    if (iG < 0) {
                        if (o1Var.tos == 0) {
                            break;
                        }
                        iG = o1Var.g();
                    }
                }
            }
            i0 i0Var = i0.f148189a;
            b0VarY.d();
            return null;
        } catch (Throwable th4) {
            b0VarY.d();
            throw th4;
        }
    }

    public static final int k(int i15, o oVar) {
        q addressSpace = oVar.getAddressSpace();
        int[] groups = addressSpace.getGroups();
        int i16 = 0;
        while (i15 > 0) {
            int i17 = groups[i15 + 2];
            int[] groups2 = addressSpace.getGroups();
            for (int i18 = groups2[i17 + 3]; i18 > 0 && i18 != i15; i18 = groups2[i18 + 1]) {
                int i19 = groups[i15 + 4];
                i16 += (i19 & 8388608) == 8388608 ? 1 : 8388607 & i19;
            }
            if ((groups[i17 + 4] & 8388608) == 8388608) {
                return i16;
            }
            i15 = i17;
        }
        return i16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f4 l(Object[] objArr, int i15) {
        if (i15 < 0) {
            return null;
        }
        Object obj = objArr[i15 >> 4];
        if (obj instanceof f4) {
            return (f4) obj;
        }
        return null;
    }

    public static final void m(t tVar, final o2.e eVar) {
        tVar.O(tVar.getCurrent(), new t.a() { // from class: r2.y
            @Override // r2.t.a
            public final boolean a(int i15, int i16, Object obj) {
                return a0.n(eVar, i15, i16, obj);
            }
        });
        t.D(tVar, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(o2.e eVar, int i15, int i16, Object obj) {
        if (obj instanceof p076m2.n) {
            eVar.a((p076m2.n) obj);
        }
        if (obj instanceof v4) {
            eVar.c((v4) obj);
        }
        if (!(obj instanceof f4)) {
            return false;
        }
        ((f4) obj).A();
        return false;
    }

    public static final void o() {
        throw new ConcurrentModificationException();
    }
}
