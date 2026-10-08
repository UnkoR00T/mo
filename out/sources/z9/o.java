package z9;

import p071kotlin.Metadata;
import p136y9.z0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B5\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lz9/o;", "Ly9/z0;", "Lz9/n$b;", "Lz9/n;", "navigator", "", "route", "Landroidx/compose/ui/window/l;", "dialogProperties", "Lkotlin/Function1;", "Ly9/w;", "Loq/i0;", "content", "<init>", "(Lz9/n;Ljava/lang/String;Landroidx/compose/ui/window/l;Ler/q;)V", "f", "()Lz9/n$b;", "h", "Lz9/n;", "dialogNavigator", "i", "Landroidx/compose/ui/window/l;", "j", "Ler/q;", "navigation-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class o extends z0<n.b> {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final n dialogNavigator;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final androidx.compose.ui.window.l dialogProperties;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final er.q<p136y9.w, p076m2.r, Integer, oq.i0> content;

    /* JADX WARN: Multi-variable type inference failed */
    public o(n nVar, String str, androidx.compose.ui.window.l lVar, er.q<? super p136y9.w, ? super p076m2.r, ? super Integer, oq.i0> qVar) {
        super(nVar, str);
        this.dialogNavigator = nVar;
        this.dialogProperties = lVar;
        this.content = qVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p136y9.z0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public n.b e() {
        return new n.b(this.dialogNavigator, this.dialogProperties, this.content);
    }
}
