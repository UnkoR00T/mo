package y1;

import n3.m1;
import n3.m2;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;
import p076m2.u4;
import q4.TextLayoutResult;
import z1.Selection;
import z1.g0;
import z1.o1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001eR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010!R\u0018\u0010$\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010#R\u0017\u0010*\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Ly1/k;", "Lm2/u4;", "", "selectableId", "Lz1/o1;", "selectionRegistrar", "Landroidx/compose/ui/graphics/Color;", "backgroundSelectionColor", "Ly1/n;", "params", "<init>", "(JLz1/o1;JLy1/n;Lfr/k;)V", "Loq/i0;", "c", "()V", "e", "d", "Lq4/t3;", "textLayoutResult", "m", "(Lq4/t3;)V", "Le4/b0;", "coordinates", "l", "(Le4/b0;)V", "Lp3/f;", "drawScope", "g", "(Lp3/f;)V", "a", "J", "b", "Lz1/o1;", "Ly1/n;", "Lz1/g0;", "Lz1/g0;", "selectable", "Lf3/m;", "f", "Lf3/m;", "h", "()Lf3/m;", "modifier", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k implements u4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long selectableId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final o1 selectionRegistrar;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long backgroundSelectionColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private n params;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private g0 selectable;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final f3.m modifier;

    public /* synthetic */ k(long j15, o1 o1Var, long j16, n nVar, fr.k kVar) {
        this(j15, o1Var, j16, nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p036e4.b0 i(k kVar) {
        return kVar.params.getLayoutCoordinates();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p036e4.b0 j(k kVar) {
        return kVar.params.getLayoutCoordinates();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextLayoutResult k(k kVar) {
        return kVar.params.getTextLayoutResult();
    }

    @Override // p076m2.u4
    public void c() {
        this.selectable = this.selectionRegistrar.g(new z1.v(this.selectableId, new er.a() { // from class: y1.h
            @Override // er.a
            public final Object a() {
                return k.j(this.f223101a);
            }
        }, new er.a() { // from class: y1.i
            @Override // er.a
            public final Object a() {
                return k.k(this.f223102a);
            }
        }));
    }

    @Override // p076m2.u4
    public void d() {
        g0 g0Var = this.selectable;
        if (g0Var != null) {
            this.selectionRegistrar.e(g0Var);
            this.selectable = null;
        }
    }

    @Override // p076m2.u4
    public void e() {
        g0 g0Var = this.selectable;
        if (g0Var != null) {
            this.selectionRegistrar.e(g0Var);
            this.selectable = null;
        }
    }

    public final void g(p3.f drawScope) {
        Selection selectionB = this.selectionRegistrar.c().b(this.selectableId);
        if (selectionB == null) {
            return;
        }
        int offset = !selectionB.getHandlesCrossed() ? selectionB.getStart().getOffset() : selectionB.getEnd().getOffset();
        int offset2 = !selectionB.getHandlesCrossed() ? selectionB.getEnd().getOffset() : selectionB.getStart().getOffset();
        if (offset == offset2) {
            return;
        }
        g0 g0Var = this.selectable;
        int iA = g0Var != null ? g0Var.a() : 0;
        m2 m2VarE = this.params.e(lr.m.j(offset, iA), lr.m.j(offset2, iA));
        if (m2VarE == null) {
            return;
        }
        if (!this.params.f()) {
            p3.f.e2(drawScope, m2VarE, this.backgroundSelectionColor, 0.0f, null, null, 0, 60, null);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.a() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.a() & BodyPartID.bodyIdMax));
        int iB = m1.INSTANCE.b();
        p3.d drawContext = drawScope.getDrawContext();
        long jA = drawContext.a();
        drawContext.f().q();
        try {
            drawContext.getTransform().c(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, iB);
            p3.f.e2(drawScope, m2VarE, this.backgroundSelectionColor, 0.0f, null, null, 0, 60, null);
        } finally {
            drawContext.f().j();
            drawContext.g(jA);
        }
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final f3.m getModifier() {
        return this.modifier;
    }

    public final void l(p036e4.b0 coordinates) {
        this.params = n.c(this.params, coordinates, null, 2, null);
        this.selectionRegistrar.d(this.selectableId);
    }

    public final void m(TextLayoutResult textLayoutResult) {
        TextLayoutResult textLayoutResult2 = this.params.getTextLayoutResult();
        if (textLayoutResult2 != null && !fr.t.c(textLayoutResult2.getLayoutInput().getText(), textLayoutResult.getLayoutInput().getText())) {
            this.selectionRegistrar.f(this.selectableId);
        }
        this.params = n.c(this.params, null, textLayoutResult, 1, null);
    }

    private k(long j15, o1 o1Var, long j16, n nVar) {
        this.selectableId = j15;
        this.selectionRegistrar = o1Var;
        this.backgroundSelectionColor = j16;
        this.params = nVar;
        this.modifier = a4.x.b(m.a(o1Var, j15, new er.a() { // from class: y1.j
            @Override // er.a
            public final Object a() {
                return k.i(this.f223103a);
            }
        }), a4.w.INSTANCE.c(), false, 2, null);
    }

    public /* synthetic */ k(long j15, o1 o1Var, long j16, n nVar, int i15, fr.k kVar) {
        this(j15, o1Var, j16, (i15 & 8) != 0 ? n.INSTANCE.a() : nVar, null);
    }
}
