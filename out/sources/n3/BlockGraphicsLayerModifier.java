package n3;

import androidx.compose.ui.node.NodeCoordinator;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: n3.g1, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0012\u001a\u00020\u0011*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\u0006*\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R.\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\tR\u001a\u0010$\u001a\u00020\u001f8\u0016X\u0096D¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010#¨\u0006'"}, d2 = {"Ln3/g1;", "Lg4/z;", "Lg4/i1;", "Lf3/m$c;", "Lkotlin/Function1;", "Ln3/a2;", "Loq/i0;", "layerBlock", "<init>", "(Ler/l;)V", "o3", "()V", "Le4/y0;", "Le4/v0;", "measurable", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "c", "(Le4/y0;Le4/v0;J)Le4/x0;", "", "toString", "()Ljava/lang/String;", "Ln4/i0;", "E2", "(Ln4/i0;)V", "r", "Ler/l;", "n3", "()Ler/l;", "p3", "", "s", "Z", "R", "()Z", "isImportantForBounds", "R2", "shouldAutoInvalidate", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BlockGraphicsLayerModifier extends f3.m.c implements g4.z, g4.i1 {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private er.l<? super a2, oq.i0> block;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final boolean isImportantForBounds;

    /* JADX INFO: renamed from: n3.g1$a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Le4/a2$a;", "Loq/i0;", "c", "(Le4/a2$a;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends fr.w implements er.l<e4.a2.a, oq.i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p036e4.a2 f130992b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BlockGraphicsLayerModifier f130993c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p036e4.a2 a2Var, BlockGraphicsLayerModifier blockGraphicsLayerModifier) {
            super(1);
            this.f130992b = a2Var;
            this.f130993c = blockGraphicsLayerModifier;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(e4.a2.a aVar) {
            c(aVar);
            return oq.i0.f148189a;
        }

        public final void c(e4.a2.a aVar) {
            e4.a2.a.d0(aVar, this.f130992b, 0, 0, 0.0f, this.f130993c.n3(), 4, null);
        }
    }

    public BlockGraphicsLayerModifier(er.l<? super a2, oq.i0> lVar) {
        this.block = lVar;
    }

    @Override // g4.i1
    public void E2(n4.i0 i0Var) {
        boolean lastClip;
        y2 shape;
        if (f3.h.isGraphicsLayerShapeSemanticsEnabled) {
            NodeCoordinator nodeCoordinatorN = g4.h.n(this, g4.s0.a(2));
            if (nodeCoordinatorN.getWasLayerBlockInvoked()) {
                y2 lastShape = nodeCoordinatorN.getLastShape();
                lastClip = nodeCoordinatorN.getLastClip();
                shape = lastShape;
            } else {
                if (z1.f131123a == null) {
                    z1.f131123a = new v2();
                } else {
                    z1.f131123a.O();
                }
                v2 v2Var = z1.f131123a;
                v2Var.Q(nodeCoordinatorN.getLayoutNode().getDensity());
                v2Var.T(c5.s.e(nodeCoordinatorN.b()));
                c3.l.Companion companion = c3.l.INSTANCE;
                c3.l lVarD = companion.d();
                er.l<Object, oq.i0> lVarG = lVarD != null ? lVarD.g() : null;
                c3.l lVarE = companion.e(lVarD);
                try {
                    this.block.b(v2Var);
                    oq.i0 i0Var2 = oq.i0.f148189a;
                    companion.l(lVarD, lVarE, lVarG);
                    shape = v2Var.getShape();
                    lastClip = v2Var.getClip();
                } catch (Throwable th4) {
                    companion.l(lVarD, lVarE, lVarG);
                    throw th4;
                }
            }
            if (lastClip) {
                n4.f0.v0(i0Var, shape);
            }
        }
    }

    @Override // g4.i1
    /* JADX INFO: renamed from: R, reason: from getter */
    public boolean getIsImportantForBounds() {
        return this.isImportantForBounds;
    }

    @Override // f3.m.c
    /* JADX INFO: renamed from: R2 */
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // g4.z
    public p036e4.x0 c(p036e4.y0 y0Var, p036e4.v0 v0Var, long j15) {
        p036e4.a2 a2VarO0 = v0Var.o0(j15);
        return p036e4.y0.j2(y0Var, a2VarO0.getWidth(), a2VarO0.getHeight(), null, new a(a2VarO0, this), 4, null);
    }

    public final er.l<a2, oq.i0> n3() {
        return this.block;
    }

    public final void o3() {
        g4.b0.e(this, this.block);
    }

    public final void p3(er.l<? super a2, oq.i0> lVar) {
        this.block = lVar;
    }

    public String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.block + ')';
    }
}
