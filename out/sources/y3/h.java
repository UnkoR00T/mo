package y3;

import android.view.KeyEvent;
import er.l;
import f3.m;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\fR0\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R0\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013¨\u0006\u0017"}, d2 = {"Ly3/h;", "Ly3/g;", "Lf3/m$c;", "Lkotlin/Function1;", "Ly3/b;", "", "onEvent", "onPreEvent", "<init>", "(Ler/l;Ler/l;)V", "event", "W1", "(Landroid/view/KeyEvent;)Z", "v1", "r", "Ler/l;", "getOnEvent", "()Ler/l;", "n3", "(Ler/l;)V", "s", "getOnPreEvent", "o3", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class h extends m.c implements g {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private l<? super b, Boolean> onEvent;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private l<? super b, Boolean> onPreEvent;

    public h(l<? super b, Boolean> lVar, l<? super b, Boolean> lVar2) {
        this.onEvent = lVar;
        this.onPreEvent = lVar2;
    }

    @Override // y3.g
    public boolean W1(KeyEvent event) {
        l<? super b, Boolean> lVar = this.onEvent;
        if (lVar != null) {
            return lVar.b(b.a(event)).booleanValue();
        }
        return false;
    }

    public final void n3(l<? super b, Boolean> lVar) {
        this.onEvent = lVar;
    }

    public final void o3(l<? super b, Boolean> lVar) {
        this.onPreEvent = lVar;
    }

    @Override // y3.g
    public boolean v1(KeyEvent event) {
        l<? super b, Boolean> lVar = this.onPreEvent;
        if (lVar != null) {
            return lVar.b(b.a(event)).booleanValue();
        }
        return false;
    }
}
