package p046f2;

import androidx.compose.ui.window.l;
import er.a;
import er.p;
import f3.m;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B9\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\f\u0010\u0017¨\u0006\u0018"}, d2 = {"Lf2/j0;", "", "Lkotlin/Function0;", "Loq/i0;", "onDismissRequest", "Lf3/m;", "modifier", "Landroidx/compose/ui/window/l;", "properties", "content", "<init>", "(Ler/a;Lf3/m;Landroidx/compose/ui/window/l;Ler/p;)V", "a", "Ler/a;", "c", "()Ler/a;", "b", "Lf3/m;", "()Lf3/m;", "Landroidx/compose/ui/window/l;", "d", "()Landroidx/compose/ui/window/l;", "Ler/p;", "()Ler/p;", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a<i0> onDismissRequest;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final m modifier;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final l properties;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p<r, Integer, i0> content;

    /* JADX WARN: Multi-variable type inference failed */
    public j0(a<i0> aVar, m mVar, l lVar, p<? super r, ? super Integer, i0> pVar) {
        this.onDismissRequest = aVar;
        this.modifier = mVar;
        this.properties = lVar;
        this.content = pVar;
    }

    public final p<r, Integer, i0> a() {
        return this.content;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final m getModifier() {
        return this.modifier;
    }

    public final a<i0> c() {
        return this.onDismissRequest;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final l getProperties() {
        return this.properties;
    }
}
