package androidx.compose.material3.internal.ripple;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import g4.f;
import g4.r;
import j2.j;
import j2.k;
import j2.n;
import j2.v;
import n3.f0;
import n3.h1;
import n3.p1;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0014H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0014H\u0016¢\u0006\u0004\b#\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R(\u0010-\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010'8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006."}, d2 = {"Landroidx/compose/material3/internal/ripple/a;", "Landroidx/compose/material3/internal/ripple/RippleNode;", "Lj2/k;", "Lb1/j;", "interactionSource", "", "bounded", "Lc5/h;", "radius", "Ln3/p1;", "color", "Lkotlin/Function0;", "Landroidx/compose/material3/internal/ripple/b;", "rippleNodeConfig", "<init>", "(Lb1/j;ZFLn3/p1;Ler/a;Lfr/k;)V", "Lj2/j;", "U3", "()Lj2/j;", "Lp3/f;", "Loq/i0;", "D3", "(Lp3/f;)V", "Lb1/n$b;", "interaction", "Lm3/k;", "size", "", "targetRadius", "C3", "(Lb1/n$b;JF)V", "Q3", "(Lb1/n$b;)V", "X2", "()V", "G", i.f37087n, "Lj2/j;", "rippleContainer", "Lj2/n;", "value", "I", "Lj2/n;", "V3", "(Lj2/n;)V", "rippleHostView", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a extends RippleNode implements k {

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private j rippleContainer;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private n rippleHostView;

    public /* synthetic */ a(b1.j jVar, boolean z15, float f15, p1 p1Var, er.a aVar, fr.k kVar) {
        this(jVar, z15, f15, p1Var, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 T3(a aVar) {
        r.a(aVar);
        return i0.f148189a;
    }

    private final j U3() {
        j jVar = this.rippleContainer;
        if (jVar != null) {
            return jVar;
        }
        j jVarC = v.c(v.e((View) f.a(this, AndroidCompositionLocals_androidKt.g())));
        this.rippleContainer = jVarC;
        return jVarC;
    }

    private final void V3(n nVar) {
        this.rippleHostView = nVar;
        r.a(this);
    }

    @Override // androidx.compose.material3.internal.ripple.RippleNode
    public void C3(b1.n.b interaction, long size, float targetRadius) {
        n nVarB = U3().b(this);
        b.d press = L3().a().getPress();
        nVarB.b(interaction, getBounded(), size, hr.a.d(targetRadius), K3(), press instanceof b.d.C0210b ? ((b.d.C0210b) press).getAlpha() : 0.0f, new er.a() { // from class: j2.a
            @Override // er.a
            public final Object a() {
                return androidx.compose.material3.internal.ripple.a.T3(this.f98583a);
            }
        });
        V3(nVarB);
    }

    @Override // androidx.compose.material3.internal.ripple.RippleNode
    public void D3(p3.f fVar) {
        h1 h1VarF = fVar.getDrawContext().f();
        n nVar = this.rippleHostView;
        if (nVar != null) {
            b.d press = L3().a().getPress();
            nVar.f(getRippleSize(), hr.a.d(getTargetRadius()), K3(), press instanceof b.d.C0210b ? ((b.d.C0210b) press).getAlpha() : 0.0f);
            nVar.draw(f0.d(h1VarF));
        }
    }

    @Override // j2.k
    public void G() {
        V3(null);
    }

    @Override // androidx.compose.material3.internal.ripple.RippleNode
    public void Q3(b1.n.b interaction) {
        n nVar = this.rippleHostView;
        if (nVar != null) {
            nVar.e();
        }
    }

    @Override // f3.m.c
    public void X2() {
        j jVar = this.rippleContainer;
        if (jVar != null) {
            jVar.a(this);
        }
    }

    private a(b1.j jVar, boolean z15, float f15, p1 p1Var, er.a<b> aVar) {
        super(jVar, z15, f15, p1Var, aVar, null);
    }
}
