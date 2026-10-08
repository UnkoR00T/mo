package androidx.compose.ui.platform;

import p071kotlin.Metadata;
import p076m2.c6;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tR\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR+\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\r\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u001f¨\u0006!"}, d2 = {"Landroidx/compose/ui/platform/a2;", "Landroidx/compose/ui/platform/n3;", "<init>", "()V", "Lkotlin/Function0;", "Landroidx/compose/ui/platform/i1;", "onInitializeContainerSize", "Loq/i0;", "e", "(Ler/a;)V", "a", "Ler/a;", "Lm2/a3;", "b", "Lm2/a3;", "_containerSize", "", "<set-?>", "c", "()Z", "f", "(Z)V", "isWindowFocused", "La4/o0;", "value", "getKeyboardModifiers-k7X9c1A", "()I", "d", "(I)V", "keyboardModifiers", "Lc5/r;", "()J", "containerSize", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a2 implements n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private er.a<i1> onInitializeContainerSize;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private p076m2.a3<i1> _containerSize;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p076m2.a3 isWindowFocused = c6.e(Boolean.FALSE, null, 2, null);

    @Override // androidx.compose.ui.platform.n3
    public long a() {
        i1 i1VarC;
        if (this._containerSize == null) {
            er.a<i1> aVar = this.onInitializeContainerSize;
            if (aVar == null || (i1VarC = aVar.a()) == null) {
                i1VarC = i1.INSTANCE.c();
            }
            this._containerSize = c6.e(i1VarC, null, 2, null);
            this.onInitializeContainerSize = null;
        }
        return this._containerSize.getValue().getPxSize();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.platform.n3
    public boolean b() {
        return ((Boolean) this.isWindowFocused.getValue()).booleanValue();
    }

    public void d(int i15) {
        o3.INSTANCE.a().setValue(a4.o0.a(i15));
    }

    public final void e(er.a<i1> onInitializeContainerSize) {
        if (this._containerSize == null) {
            this.onInitializeContainerSize = onInitializeContainerSize;
        }
    }

    public void f(boolean z15) {
        this.isWindowFocused.setValue(Boolean.valueOf(z15));
    }
}
