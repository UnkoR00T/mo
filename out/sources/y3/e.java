package y3;

import er.l;
import g4.l0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001a¨\u0006\u001d"}, d2 = {"Ly3/e;", "Lg4/l0;", "Ly3/h;", "Lkotlin/Function1;", "Ly3/b;", "", "onKeyEvent", "onPreKeyEvent", "<init>", "(Ler/l;Ler/l;)V", "a", "()Ly3/h;", "node", "Loq/i0;", "l", "(Ly3/h;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "d", "Ler/l;", "getOnKeyEvent", "()Ler/l;", "e", "getOnPreKeyEvent", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class e extends l0<h> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final l<b, Boolean> onKeyEvent;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final l<b, Boolean> onPreKeyEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public e(l<? super b, Boolean> lVar, l<? super b, Boolean> lVar2) {
        this.onKeyEvent = lVar;
        this.onPreKeyEvent = lVar2;
    }

    @Override // g4.l0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public h create() {
        return new h(this.onKeyEvent, this.onPreKeyEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof e)) {
            return false;
        }
        e eVar = (e) other;
        return this.onKeyEvent == eVar.onKeyEvent && this.onPreKeyEvent == eVar.onPreKeyEvent;
    }

    public int hashCode() {
        l<b, Boolean> lVar = this.onKeyEvent;
        int iHashCode = (lVar != null ? lVar.hashCode() : 0) * 31;
        l<b, Boolean> lVar2 = this.onPreKeyEvent;
        return iHashCode + (lVar2 != null ? lVar2.hashCode() : 0);
    }

    @Override // g4.l0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void update(h node) {
        node.n3(this.onKeyEvent);
        node.o3(this.onPreKeyEvent);
    }
}
