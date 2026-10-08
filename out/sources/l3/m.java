package l3;

import androidx.compose.ui.node.Owner;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import r0.i1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\nJ\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001bR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001e¨\u0006 "}, d2 = {"Ll3/m;", "", "Ll3/s;", "focusOwner", "Landroidx/compose/ui/node/Owner;", "owner", "<init>", "(Ll3/s;Landroidx/compose/ui/node/Owner;)V", "Loq/i0;", "c", "()V", "d", "Ll3/p0;", "node", "g", "(Ll3/p0;)V", "Ll3/j;", "f", "(Ll3/j;)V", "e", "", "b", "()Z", "a", "Ll3/s;", "Landroidx/compose/ui/node/Owner;", "Lr0/u0;", "Lr0/u0;", "focusTargetNodes", "focusEventNodes", "Z", "isInvalidationScheduled", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final s focusOwner;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Owner owner;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final r0.u0<p0> focusTargetNodes = i1.b();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final r0.u0<j> focusEventNodes = i1.b();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean isInvalidationScheduled;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final /* synthetic */ class a extends fr.q implements er.a<oq.i0> {
        a(Object obj) {
            super(0, obj, m.class, "invalidateNodes", "invalidateNodes()V", 0);
        }

        public final void E() {
            ((m) this.f66391b).c();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ oq.i0 a() {
            E();
            return oq.i0.f148189a;
        }
    }

    public m(s sVar, Owner owner) {
        this.focusOwner = sVar;
        this.owner = owner;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:69:0x013e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x0140 A[LOOP:4: B:60:0x0112->B:70:0x0140, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:91:0x0143 A[EDGE_INSN: B:91:0x0143->B:71:0x0143 BREAK  A[LOOP:4: B:60:0x0112->B:70:0x0140], SYNTHETIC] */
    public final void c() {
        g4.p0 nodes;
        long j15;
        p0 p0VarK = this.focusOwner.k();
        long j16 = 255;
        if (p0VarK == null) {
            r0.u0<j> u0Var = this.focusEventNodes;
            Object[] objArr = u0Var.elements;
            long[] jArr = u0Var.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i15 = 0;
                while (true) {
                    long j17 = jArr[i15];
                    if ((((~j17) << 7) & j17 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i16 = 8 - ((~(i15 - length)) >>> 31);
                        int i17 = 0;
                        while (i17 < i16) {
                            if ((j17 & j16) < 128) {
                                ((j) objArr[(i15 << 3) + i17]).i(m0.Inactive);
                            }
                            j17 >>= 8;
                            i17++;
                            j16 = j16;
                        }
                        j15 = j16;
                        if (i16 != 8) {
                            break;
                        }
                    } else {
                        j15 = j16;
                    }
                    if (i15 == length) {
                        break;
                    }
                    i15++;
                    j16 = j15;
                }
            }
        } else if (p0VarK.getIsAttached()) {
            if (this.focusTargetNodes.a(p0VarK)) {
                p0VarK.A3();
            }
            m0 m0VarD0 = p0VarK.d0();
            int iA = g4.s0.a(1024) | g4.s0.a(PKIFailureInfo.certConfirmed);
            if (!p0VarK.getNode().getIsAttached()) {
                d4.a.c("visitAncestors called on an unattached node");
            }
            f3.m.c node = p0VarK.getNode();
            androidx.compose.ui.node.g gVarS = g4.h.s(p0VarK);
            int i18 = 0;
            while (gVarS != null) {
                if ((gVarS.getNodes().getHead().getAggregateChildKindSet() & iA) != 0) {
                    while (node != null) {
                        if ((node.getKindSet() & iA) != 0) {
                            if ((g4.s0.a(1024) & node.getKindSet()) != 0) {
                                i18++;
                            }
                            if ((node instanceof j) && this.focusEventNodes.a(node)) {
                                if (i18 <= 1) {
                                    ((j) node).i(m0VarD0);
                                } else {
                                    ((j) node).i(m0.ActiveParent);
                                }
                                this.focusEventNodes.z(node);
                            }
                        }
                        node = node.getParent();
                    }
                }
                gVarS = gVarS.C0();
                node = (gVarS == null || (nodes = gVarS.getNodes()) == null) ? null : nodes.getTail();
            }
            r0.u0<j> u0Var2 = this.focusEventNodes;
            Object[] objArr2 = u0Var2.elements;
            long[] jArr2 = u0Var2.metadata;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i19 = 0;
                while (true) {
                    long j18 = jArr2[i19];
                    if ((((~j18) << 7) & j18 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i19 != length2) {
                            break;
                            break;
                        }
                        i19++;
                    } else {
                        int i25 = 8 - ((~(i19 - length2)) >>> 31);
                        for (int i26 = 0; i26 < i25; i26++) {
                            if ((j18 & 255) < 128) {
                                ((j) objArr2[(i19 << 3) + i26]).i(m0.Inactive);
                            }
                            j18 >>= 8;
                        }
                        if (i25 != 8) {
                            break;
                        } else if (i19 != length2) {
                            break;
                        } else {
                            i19++;
                        }
                    }
                }
            }
        }
        d();
        this.focusTargetNodes.n();
        this.focusEventNodes.n();
        this.isInvalidationScheduled = false;
    }

    private final void d() {
        if (this.focusOwner.k() == null || this.focusOwner.w() == m0.Inactive) {
            this.focusOwner.b();
        }
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsInvalidationScheduled() {
        return this.isInvalidationScheduled;
    }

    public final void e() {
        if (this.isInvalidationScheduled) {
            return;
        }
        this.owner.Q(new a(this));
        this.isInvalidationScheduled = true;
    }

    public final void f(j node) {
        if (this.focusEventNodes.i(node)) {
            e();
        }
    }

    public final void g(p0 node) {
        if (this.focusTargetNodes.i(node)) {
            e();
        }
    }
}
