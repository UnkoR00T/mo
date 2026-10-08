package p046f2;

import androidx.compose.ui.window.t;
import er.a;
import p036e4.b0;
import p036e4.y0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003*\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rR\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u0012\u0010\r¨\u0006\u0013"}, d2 = {"Lf2/kr;", "Lf2/jr;", "Lkotlin/Function0;", "Le4/b0;", "getAnchorBounds", "Landroidx/compose/ui/window/t;", "positionProvider", "<init>", "(Ler/a;Landroidx/compose/ui/window/t;)V", "Le4/y0;", "b", "(Le4/y0;)Le4/b0;", "a", "()Landroidx/compose/ui/window/t;", "Ler/a;", "getGetAnchorBounds", "()Ler/a;", "Landroidx/compose/ui/window/t;", "getPositionProvider", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class kr implements jr {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a<b0> getAnchorBounds;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final t positionProvider;

    /* JADX WARN: Multi-variable type inference failed */
    public kr(a<? extends b0> aVar, t tVar) {
        this.getAnchorBounds = aVar;
        this.positionProvider = tVar;
    }

    @Override // p046f2.jr
    /* JADX INFO: renamed from: a, reason: from getter */
    public t getPositionProvider() {
        return this.positionProvider;
    }

    @Override // p046f2.jr
    public b0 b(y0 y0Var) {
        return this.getAnchorBounds.a();
    }
}
