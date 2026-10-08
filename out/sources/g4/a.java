package g4;

import androidx.compose.ui.node.NodeCoordinator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010%\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\b*\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H$¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0010J\u000f\u0010\u0017\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0017\u0010\u0010J\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0010J\u001b\u0010\u001b\u001a\u00020\u0019*\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H$¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010(\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010+\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010#\u001a\u0004\b)\u0010%\"\u0004\b*\u0010'R\"\u0010.\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010#\u001a\u0004\b,\u0010%\"\u0004\b-\u0010'R\"\u00102\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b/\u0010#\u001a\u0004\b0\u0010%\"\u0004\b1\u0010'R\"\u00105\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010#\u001a\u0004\b3\u0010%\"\u0004\b4\u0010'R\"\u00108\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010#\u001a\u0004\b6\u0010%\"\u0004\b7\u0010'R\u0018\u00109\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001eR \u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010;R\u0014\u0010>\u001a\u00020!8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b=\u0010%R\u0014\u0010@\u001a\u00020!8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b?\u0010%R$\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u0011*\u00020\n8$X¤\u0004¢\u0006\u0006\u001a\u0004\b/\u0010A\u0082\u0001\u0002CD¨\u0006E"}, d2 = {"Lg4/a;", "", "Lg4/b;", "alignmentLinesOwner", "<init>", "(Lg4/b;)V", "Le4/a;", "alignmentLine", "", "initialPosition", "Landroidx/compose/ui/node/NodeCoordinator;", "initialCoordinator", "Loq/i0;", "c", "(Le4/a;ILandroidx/compose/ui/node/NodeCoordinator;)V", "o", "()V", "", "h", "()Ljava/util/Map;", "i", "(Landroidx/compose/ui/node/NodeCoordinator;Le4/a;)I", "n", "p", "m", "Lm3/e;", "position", "d", "(Landroidx/compose/ui/node/NodeCoordinator;J)J", "a", "Lg4/b;", "f", "()Lg4/b;", "", "b", "Z", "g", "()Z", "setDirty$ui", "(Z)V", "dirty", "getUsedDuringParentMeasurement$ui", "u", "usedDuringParentMeasurement", "l", "t", "usedDuringParentLayout", "e", "getPreviousUsedDuringParentLayout$ui", "q", "previousUsedDuringParentLayout", "getUsedByModifierMeasurement$ui", "s", "usedByModifierMeasurement", "getUsedByModifierLayout$ui", "r", "usedByModifierLayout", "queryOwner", "", "Ljava/util/Map;", "alignmentLineMap", "j", "queried", "k", "required", "(Landroidx/compose/ui/node/NodeCoordinator;)Ljava/util/Map;", "alignmentLinesMap", "Lg4/d0;", "Lg4/i0;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b alignmentLinesOwner;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean dirty;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean usedDuringParentMeasurement;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean usedDuringParentLayout;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean previousUsedDuringParentLayout;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean usedByModifierMeasurement;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean usedByModifierLayout;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private b queryOwner;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Map<p036e4.a, Integer> alignmentLineMap;

    /* JADX INFO: renamed from: g4.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lg4/b;", "childOwner", "Loq/i0;", "c", "(Lg4/b;)V"}, k = 3, mv = {2, 1, 0})
    static final class C1596a extends fr.w implements er.l<b, oq.i0> {
        C1596a() {
            super(1);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(b bVar) {
            c(bVar);
            return oq.i0.f148189a;
        }

        public final void c(b bVar) {
            if (bVar.getPlaceOrder() == Integer.MAX_VALUE) {
                return;
            }
            if (bVar.getAlignmentLines().getDirty()) {
                bVar.T();
            }
            Map map = bVar.getAlignmentLines().alignmentLineMap;
            a aVar = a.this;
            for (Map.Entry entry : map.entrySet()) {
                aVar.c((p036e4.a) entry.getKey(), ((Number) entry.getValue()).intValue(), bVar.X());
            }
            for (NodeCoordinator wrappedBy = bVar.X().getWrappedBy(); !fr.t.c(wrappedBy, a.this.getAlignmentLinesOwner().X()); wrappedBy = wrappedBy.getWrappedBy()) {
                Set<p036e4.a> setKeySet = a.this.e(wrappedBy).keySet();
                a aVar2 = a.this;
                for (p036e4.a aVar3 : setKeySet) {
                    aVar2.c(aVar3, aVar2.i(wrappedBy, aVar3), wrappedBy);
                }
            }
        }
    }

    public /* synthetic */ a(b bVar, fr.k kVar) {
        this(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(p036e4.a alignmentLine, int initialPosition, NodeCoordinator initialCoordinator) {
        float f15 = initialPosition;
        long jE = m3.e.e((((long) Float.floatToRawIntBits(f15)) << 32) | (((long) Float.floatToRawIntBits(f15)) & BodyPartID.bodyIdMax));
        while (true) {
            jE = d(initialCoordinator, jE);
            initialCoordinator = initialCoordinator.getWrappedBy();
            if (fr.t.c(initialCoordinator, this.alignmentLinesOwner.X())) {
                break;
            } else if (e(initialCoordinator).containsKey(alignmentLine)) {
                float fI = i(initialCoordinator, alignmentLine);
                jE = m3.e.e((((long) Float.floatToRawIntBits(fI)) << 32) | (((long) Float.floatToRawIntBits(fI)) & BodyPartID.bodyIdMax));
            }
        }
        int iRound = Math.round(alignmentLine instanceof p036e4.q ? Float.intBitsToFloat((int) (jE & BodyPartID.bodyIdMax)) : Float.intBitsToFloat((int) (jE >> 32)));
        Map<p036e4.a, Integer> map = this.alignmentLineMap;
        if (map.containsKey(alignmentLine)) {
            iRound = p036e4.b.c(alignmentLine, ((Number) pq.v0.j(this.alignmentLineMap, alignmentLine)).intValue(), iRound);
        }
        map.put(alignmentLine, Integer.valueOf(iRound));
    }

    protected abstract long d(NodeCoordinator nodeCoordinator, long j15);

    protected abstract Map<p036e4.a, Integer> e(NodeCoordinator nodeCoordinator);

    /* JADX INFO: renamed from: f, reason: from getter */
    public final b getAlignmentLinesOwner() {
        return this.alignmentLinesOwner;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getDirty() {
        return this.dirty;
    }

    public final Map<p036e4.a, Integer> h() {
        return this.alignmentLineMap;
    }

    protected abstract int i(NodeCoordinator nodeCoordinator, p036e4.a aVar);

    public final boolean j() {
        return this.usedDuringParentMeasurement || this.previousUsedDuringParentLayout || this.usedByModifierMeasurement || this.usedByModifierLayout;
    }

    public final boolean k() {
        o();
        return this.queryOwner != null;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getUsedDuringParentLayout() {
        return this.usedDuringParentLayout;
    }

    public final void m() {
        this.dirty = true;
        b bVarH = this.alignmentLinesOwner.H();
        if (bVarH == null) {
            return;
        }
        if (this.usedDuringParentMeasurement) {
            bVarH.B0();
        } else if (this.previousUsedDuringParentLayout || this.usedDuringParentLayout) {
            bVarH.requestLayout();
        }
        if (this.usedByModifierMeasurement) {
            this.alignmentLinesOwner.B0();
        }
        if (this.usedByModifierLayout) {
            this.alignmentLinesOwner.requestLayout();
        }
        bVarH.getAlignmentLines().m();
    }

    public final void n() {
        this.alignmentLineMap.clear();
        this.alignmentLinesOwner.F(new C1596a());
        this.alignmentLineMap.putAll(e(this.alignmentLinesOwner.X()));
        this.dirty = false;
    }

    public final void o() {
        b bVar;
        a aVarI;
        a aVarI2;
        if (j()) {
            bVar = this.alignmentLinesOwner;
        } else {
            b bVarH = this.alignmentLinesOwner.H();
            if (bVarH == null) {
                return;
            }
            bVar = bVarH.getAlignmentLines().queryOwner;
            if (bVar == null || !bVar.getAlignmentLines().j()) {
                b bVar2 = this.queryOwner;
                if (bVar2 == null || bVar2.getAlignmentLines().j()) {
                    return;
                }
                b bVarH2 = bVar2.H();
                if (bVarH2 != null && (aVarI2 = bVarH2.getAlignmentLines()) != null) {
                    aVarI2.o();
                }
                b bVarH3 = bVar2.H();
                bVar = (bVarH3 == null || (aVarI = bVarH3.getAlignmentLines()) == null) ? null : aVarI.queryOwner;
            }
        }
        this.queryOwner = bVar;
    }

    public final void p() {
        this.dirty = true;
        this.usedDuringParentMeasurement = false;
        this.previousUsedDuringParentLayout = false;
        this.usedDuringParentLayout = false;
        this.usedByModifierMeasurement = false;
        this.usedByModifierLayout = false;
        this.queryOwner = null;
    }

    public final void q(boolean z15) {
        this.previousUsedDuringParentLayout = z15;
    }

    public final void r(boolean z15) {
        this.usedByModifierLayout = z15;
    }

    public final void s(boolean z15) {
        this.usedByModifierMeasurement = z15;
    }

    public final void t(boolean z15) {
        this.usedDuringParentLayout = z15;
    }

    public final void u(boolean z15) {
        this.usedDuringParentMeasurement = z15;
    }

    private a(b bVar) {
        this.alignmentLinesOwner = bVar;
        this.dirty = true;
        this.alignmentLineMap = new HashMap();
    }
}
