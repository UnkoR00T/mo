package androidx.compose.material.ripple;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b1.j;
import b1.n;
import e2.RippleAlpha;
import e2.d;
import e2.e;
import e2.h;
import fr.k;
import g4.f;
import g4.r;
import n3.f0;
import n3.h1;
import n3.p1;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0014H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0014H\u0016¢\u0006\u0004\b#\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R(\u0010-\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010'8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006."}, d2 = {"Landroidx/compose/material/ripple/a;", "Landroidx/compose/material/ripple/RippleNode;", "Le2/e;", "Lb1/j;", "interactionSource", "", "bounded", "Lc5/h;", "radius", "Ln3/p1;", "color", "Lkotlin/Function0;", "Le2/b;", "rippleAlpha", "<init>", "(Lb1/j;ZFLn3/p1;Ler/a;Lfr/k;)V", "Le2/d;", "E3", "()Le2/d;", "Lp3/f;", "Loq/i0;", "t3", "(Lp3/f;)V", "Lb1/n$b;", "interaction", "Lm3/k;", "size", "", "targetRadius", "s3", "(Lb1/n$b;JF)V", "A3", "(Lb1/n$b;)V", "X2", "()V", "G", "C", "Le2/d;", "rippleContainer", "Le2/h;", "value", ip.a.f96138c, "Le2/h;", "F3", "(Le2/h;)V", "rippleHostView", "material-ripple"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a extends RippleNode implements e {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private d rippleContainer;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private h rippleHostView;

    public /* synthetic */ a(j jVar, boolean z15, float f15, p1 p1Var, er.a aVar, k kVar) {
        this(jVar, z15, f15, p1Var, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D3(a aVar) {
        r.a(aVar);
        return i0.f148189a;
    }

    private final d E3() {
        d dVar = this.rippleContainer;
        if (dVar != null) {
            return dVar;
        }
        d dVarC = e2.j.c(e2.j.e((View) f.a(this, AndroidCompositionLocals_androidKt.g())));
        this.rippleContainer = dVarC;
        return dVarC;
    }

    private final void F3(h hVar) {
        this.rippleHostView = hVar;
        r.a(this);
    }

    @Override // androidx.compose.material.ripple.RippleNode
    public void A3(n.b interaction) {
        h hVar = this.rippleHostView;
        if (hVar != null) {
            hVar.e();
        }
    }

    @Override // e2.e
    public void G() {
        F3(null);
    }

    @Override // f3.m.c
    public void X2() {
        d dVar = this.rippleContainer;
        if (dVar != null) {
            dVar.a(this);
        }
    }

    @Override // androidx.compose.material.ripple.RippleNode
    public void s3(n.b interaction, long size, float targetRadius) {
        h hVarB = E3().b(this);
        hVarB.b(interaction, getBounded(), size, hr.a.d(targetRadius), w3(), v3().a().getPressedAlpha(), new er.a() { // from class: e2.a
            @Override // er.a
            public final Object a() {
                return androidx.compose.material.ripple.a.D3(this.f46883a);
            }
        });
        F3(hVarB);
    }

    @Override // androidx.compose.material.ripple.RippleNode
    public void t3(p3.f fVar) {
        h1 h1VarF = fVar.getDrawContext().f();
        h hVar = this.rippleHostView;
        if (hVar != null) {
            hVar.f(getRippleSize(), hr.a.d(getTargetRadius()), w3(), v3().a().getPressedAlpha());
            hVar.draw(f0.d(h1VarF));
        }
    }

    private a(j jVar, boolean z15, float f15, p1 p1Var, er.a<RippleAlpha> aVar) {
        super(jVar, z15, f15, p1Var, aVar, null);
    }
}
