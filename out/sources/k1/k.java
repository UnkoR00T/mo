package k1;

import er.l;
import g4.j1;
import h3.s;
import h3.w;
import h3.x;
import n4.f0;
import oq.i0;
import p071kotlin.Metadata;
import w0.r1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010JW\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\r*\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lk1/k;", "Landroidx/compose/foundation/c;", "", "value", "Lb1/l;", "interactionSource", "Lw0/r1;", "indicationNodeFactory", "useLocalIndication", "enabled", "Ln4/l;", "role", "Lkotlin/Function1;", "Loq/i0;", "onValueChange", "<init>", "(ZLb1/l;Lw0/r1;ZZLn4/l;Ler/l;Lfr/k;)V", "z4", "(ZLb1/l;Lw0/r1;ZZLn4/l;Ler/l;)V", "Ln4/i0;", "F3", "(Ln4/i0;)V", "t0", "Z", "u0", "Ler/l;", "Lkotlin/Function0;", "v0", "Ler/a;", "get_onClick", "()Ler/a;", "_onClick", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class k extends androidx.compose.foundation.c {

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    private boolean value;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    private l<? super Boolean, i0> onValueChange;

    /* JADX INFO: renamed from: v0, reason: collision with root package name and from kotlin metadata */
    private final er.a<i0> _onClick;

    public /* synthetic */ k(boolean z15, b1.l lVar, r1 r1Var, boolean z16, boolean z17, n4.l lVar2, l lVar3, fr.k kVar) {
        this(z15, lVar, r1Var, z16, z17, lVar2, lVar3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w4(l lVar, boolean z15) {
        lVar.b(Boolean.valueOf(!z15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x4(k kVar) {
        kVar.onValueChange.b(Boolean.valueOf(!kVar.value));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean y4(n4.i0 i0Var, w wVar) {
        Boolean boolB = wVar.b();
        if (boolB == null) {
            return false;
        }
        f0.G0(i0Var, p4.b.a(boolB.booleanValue()));
        return true;
    }

    @Override // androidx.compose.foundation.a
    public void F3(final n4.i0 i0Var) {
        f0.G0(i0Var, p4.b.a(this.value));
        f0.b0(i0Var, s.INSTANCE.b());
        w wVarA = x.a(w.INSTANCE, this.value);
        if (wVarA != null) {
            f0.h0(i0Var, wVarA);
        }
        f0.A(i0Var, null, new l() { // from class: k1.h
            @Override // er.l
            public final Object b(Object obj) {
                return Boolean.valueOf(k.y4(i0Var, (w) obj));
            }
        }, 1, null);
    }

    public final void z4(boolean value, b1.l interactionSource, r1 indicationNodeFactory, boolean useLocalIndication, boolean enabled, n4.l role, l<? super Boolean, i0> onValueChange) {
        if (this.value != value) {
            this.value = value;
            j1.d(this);
        }
        this.onValueChange = onValueChange;
        super.s4(interactionSource, indicationNodeFactory, useLocalIndication, enabled, null, role, this._onClick);
    }

    private k(final boolean z15, b1.l lVar, r1 r1Var, boolean z16, boolean z17, n4.l lVar2, final l<? super Boolean, i0> lVar3) {
        super(lVar, r1Var, z16, z17, null, lVar2, new er.a() { // from class: k1.i
            @Override // er.a
            public final Object a() {
                return k.w4(lVar3, z15);
            }
        }, null);
        this.value = z15;
        this.onValueChange = lVar3;
        this._onClick = new er.a() { // from class: k1.j
            @Override // er.a
            public final Object a() {
                return k.x4(this.f107277a);
            }
        };
    }
}
