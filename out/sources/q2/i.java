package q2;

import e3.ComposeStackTraceFrame;
import java.util.List;
import p071kotlin.Metadata;
import p076m2.t;
import p2.SlotWriter;
import pq.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001a/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a/\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a/\u0010\u0014\u001a\u00020\u0010*\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001b\u0010\u0016\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0017*\f\b\u0000\u0010\u0018\"\u00020\u00052\u00020\u0005¨\u0006\u0019"}, d2 = {"Lp2/o;", "slots", "Lm2/c;", "", "applier", "", "index", "Loq/i0;", "j", "(Lp2/o;Lm2/c;I)V", "h", "(Lp2/o;)I", "Lp2/c;", "anchor", "i", "(Lp2/o;Lp2/c;Lm2/c;)I", "", "Lq2/g;", "errorContext", "writer", "f", "(Ljava/lang/Throwable;Lq2/g;Lp2/o;Lp2/c;)Ljava/lang/Throwable;", "k", "(Lq2/g;Lp2/o;)Lq2/g;", "IntParameter", "runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class i {

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"q2/i$a", "Lq2/g;", "", "currentOffset", "", "Le3/d;", "b", "(Ljava/lang/Integer;)Ljava/util/List;", "", "c", "()Z", "sourceInformationEnabled", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f163845a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SlotWriter f163846b;

        a(g gVar, SlotWriter slotWriter) {
            this.f163845a = gVar;
            this.f163846b = slotWriter;
        }

        @Override // q2.g
        public List<ComposeStackTraceFrame> b(Integer currentOffset) {
            List<ComposeStackTraceFrame> listB = this.f163845a.b(null);
            int parent = this.f163846b.getParent();
            if (parent < 0) {
                return listB;
            }
            SlotWriter slotWriter = this.f163846b;
            return v.L0(e3.c.b(slotWriter, currentOffset, parent, Integer.valueOf(slotWriter.L0(parent))), listB);
        }

        @Override // q2.g
        public boolean c() {
            return this.f163845a.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable f(Throwable th4, final g gVar, final SlotWriter slotWriter, final p2.c cVar) {
        return gVar == null ? th4 : e3.e.b(th4, new er.a() { // from class: q2.h
            @Override // er.a
            public final Object a() {
                return i.g(cVar, slotWriter, gVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e3.a g(p2.c cVar, SlotWriter slotWriter, g gVar) {
        if (cVar != null) {
            slotWriter.Y0(cVar);
        }
        List listC = e3.c.c(slotWriter, null, 0, null, 7, null);
        ComposeStackTraceFrame composeStackTraceFrame = (ComposeStackTraceFrame) v.z0(listC);
        Integer groupOffset = composeStackTraceFrame != null ? composeStackTraceFrame.getGroupOffset() : null;
        List<ComposeStackTraceFrame> listB = gVar.b(groupOffset);
        if (groupOffset != null && !listB.isEmpty()) {
            listB = v.L0(v.e(ComposeStackTraceFrame.b((ComposeStackTraceFrame) v.l0(listB), 0, null, groupOffset, 3, null)), v.f0(listB, 1));
        }
        return new e3.a(v.L0(listC, listB), gVar.c());
    }

    private static final int h(SlotWriter slotWriter) {
        int currentGroup = slotWriter.getCurrentGroup();
        int parent = slotWriter.getParent();
        while (parent >= 0 && !slotWriter.w0(parent)) {
            parent = slotWriter.L0(parent);
        }
        int iL0 = parent + 1;
        int iJ0 = 0;
        while (iL0 < currentGroup) {
            if (slotWriter.q0(currentGroup, iL0)) {
                if (slotWriter.w0(iL0)) {
                    iJ0 = 0;
                }
                iL0++;
            } else {
                iJ0 += slotWriter.w0(iL0) ? 1 : slotWriter.J0(iL0);
                iL0 += slotWriter.l0(iL0);
            }
        }
        return iJ0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int i(SlotWriter slotWriter, p2.c cVar, p076m2.c<Object> cVar2) {
        int iC = slotWriter.C(cVar);
        if (!(slotWriter.getCurrentGroup() < iC)) {
            t.b("Check failed");
        }
        j(slotWriter, cVar2, iC);
        int iH = h(slotWriter);
        while (slotWriter.getCurrentGroup() < iC) {
            if (slotWriter.p0(iC)) {
                if (slotWriter.v0()) {
                    cVar2.g(slotWriter.H0(slotWriter.getCurrentGroup()));
                    iH = 0;
                }
                slotWriter.m1();
            } else {
                iH += slotWriter.c1();
            }
        }
        if (!(slotWriter.getCurrentGroup() == iC)) {
            t.b("Check failed");
        }
        return iH;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(SlotWriter slotWriter, p076m2.c<Object> cVar, int i15) {
        while (!slotWriter.r0(i15)) {
            slotWriter.d1();
            if (slotWriter.w0(slotWriter.getParent())) {
                cVar.j();
            }
            slotWriter.S();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g k(g gVar, SlotWriter slotWriter) {
        return new a(gVar, slotWriter);
    }
}
