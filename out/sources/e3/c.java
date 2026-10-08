package e3;

import java.util.List;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.e1;
import p076m2.u4;
import p076m2.v4;
import p2.SlotReader;
import p2.SlotWriter;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a+\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a+\u0010\u0014\u001a\u0004\u0018\u00010\u0013*\u00020\u000f2\u0014\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00110\u0010H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u0003*\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lp2/o;", "", "child", "", "group", "parent", "", "Le3/d;", "b", "(Lp2/o;Ljava/lang/Object;ILjava/lang/Integer;)Ljava/util/List;", "Lp2/j;", "a", "(Lp2/j;)Ljava/util/List;", "g", "(Lp2/j;ILjava/lang/Object;)Ljava/util/List;", "Lp2/l;", "Lkotlin/Function1;", "", "filter", "Le3/u;", "d", "(Lp2/l;Ler/l;)Le3/u;", "Lm2/v;", "context", "e", "(Lp2/l;Lm2/v;)Ljava/lang/Integer;", "runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c {
    public static final List<ComposeStackTraceFrame> a(SlotReader slotReader) {
        if (slotReader.getClosed() || slotReader.getGroupsSize() == 0) {
            return pq.v.n();
        }
        y yVar = new y(slotReader);
        int parent = slotReader.getParent();
        Object objValueOf = Integer.valueOf(slotReader.y());
        while (parent >= 0) {
            yVar.f(slotReader.D(parent), slotReader.H(parent) ? slotReader.E(parent) : p076m2.r.INSTANCE.a(), slotReader.getTable().Z(parent), objValueOf);
            objValueOf = slotReader.a(parent);
            parent = slotReader.Q(parent);
        }
        return yVar.i();
    }

    public static final List<ComposeStackTraceFrame> b(SlotWriter slotWriter, Object obj, int i15, Integer num) {
        int iL0;
        int iJ0;
        if (slotWriter.getClosed() || slotWriter.f0() == 0) {
            return pq.v.n();
        }
        c0 c0Var = new c0(slotWriter);
        if (num != null) {
            iL0 = num.intValue();
        } else {
            iL0 = slotWriter.getParent() < 0 ? slotWriter.L0(i15) : slotWriter.getParent();
        }
        if (obj == null) {
            obj = Integer.valueOf(slotWriter.m0(i15));
        }
        if (slotWriter.x0(i15)) {
            iJ0 = slotWriter.j0(i15);
        } else {
            int iL1 = iL0 >= 0 ? slotWriter.L0(iL0) : iL0;
            iJ0 = slotWriter.j0(iL0);
            int i16 = iL0;
            iL0 = iL1;
            i15 = i16;
        }
        while (i15 >= 0) {
            c0Var.f(iJ0, slotWriter.n0(i15) ? slotWriter.k0(i15) : p076m2.r.INSTANCE.a(), slotWriter.k1(i15), obj);
            obj = slotWriter.B(i15);
            if (iL0 >= 0) {
                int iL2 = slotWriter.L0(iL0);
                iJ0 = slotWriter.j0(iL0);
                int i17 = iL0;
                iL0 = iL2;
                i15 = i17;
            } else {
                i15 = iL0;
            }
        }
        return c0Var.i();
    }

    public static /* synthetic */ List c(SlotWriter slotWriter, Object obj, int i15, Integer num, int i16, Object obj2) {
        if ((i16 & 1) != 0) {
            obj = null;
        }
        if ((i16 & 2) != 0) {
            i15 = slotWriter.getCurrentGroup();
        }
        if ((i16 & 4) != 0) {
            num = null;
        }
        return b(slotWriter, obj, i15, num);
    }

    public static final ObjectLocation d(p2.l lVar, er.l<Object, Boolean> lVar2) {
        SlotReader slotReaderU = lVar.U();
        for (int i15 = 0; i15 < lVar.getGroupsSize(); i15++) {
            try {
                if (slotReaderU.K(i15) && lVar2.b(slotReaderU.M(i15)).booleanValue()) {
                    ObjectLocation objectLocation = new ObjectLocation(i15, null);
                    slotReaderU.d();
                    return objectLocation;
                }
                int iV = slotReaderU.V(i15);
                for (int i16 = 0; i16 < iV; i16++) {
                    if (lVar2.b(slotReaderU.C(i15, i16)).booleanValue()) {
                        ObjectLocation objectLocation2 = new ObjectLocation(i15, Integer.valueOf(i16));
                        slotReaderU.d();
                        return objectLocation2;
                    }
                }
            } catch (Throwable th4) {
                slotReaderU.d();
                throw th4;
            }
        }
        i0 i0Var = i0.f148189a;
        slotReaderU.d();
        return null;
    }

    public static final Integer e(p2.l lVar, p076m2.v vVar) {
        SlotReader slotReaderU = lVar.U();
        try {
            return f(slotReaderU, vVar, 0, slotReaderU.getGroupsSize());
        } finally {
            slotReaderU.d();
        }
    }

    private static final Integer f(SlotReader slotReader, p076m2.v vVar, int i15, int i16) {
        Integer numF;
        while (true) {
            if (i15 >= i16) {
                return null;
            }
            int iF = slotReader.F(i15) + i15;
            if (slotReader.G(i15) && slotReader.D(i15) == 206 && fr.t.c(slotReader.E(i15), p076m2.t.j())) {
                Object objC = slotReader.C(i15, 0);
                v4 v4Var = objC instanceof v4 ? (v4) objC : null;
                u4 wrapped = v4Var != null ? v4Var.getWrapped() : null;
                e1.a aVar = wrapped instanceof e1.a ? (e1.a) wrapped : null;
                if (aVar != null && fr.t.c(aVar.getRef(), vVar)) {
                    return Integer.valueOf(i15);
                }
            }
            if (slotReader.e(i15) && (numF = f(slotReader, vVar, i15 + 1, iF)) != null) {
                return Integer.valueOf(numF.intValue());
            }
            i15 = iF;
        }
    }

    public static final List<ComposeStackTraceFrame> g(SlotReader slotReader, int i15, Object obj) {
        y yVar = new y(slotReader);
        i15 = slotReader.Q(i15);
        p2.c cVarA = slotReader.a(i15);
        while (i15 >= 0) {
            yVar.f(slotReader.D(i15), slotReader.H(i15) ? slotReader.E(i15) : p076m2.r.INSTANCE.a(), slotReader.getTable().Z(i15), obj);
            if (i15 >= 0) {
                p2.c cVar = cVarA;
                cVarA = slotReader.a(i15);
                i15 = slotReader.Q(i15);
                obj = cVar;
            } else {
                obj = cVarA;
            }
        }
        return yVar.i();
    }
}
