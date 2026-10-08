package p036e4;

import er.l;
import f3.m;
import g4.s;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bR.\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\b¨\u0006\u0011"}, d2 = {"Le4/m1;", "Lf3/m$c;", "Lg4/s;", "Lkotlin/Function1;", "Le4/b0;", "Loq/i0;", "callback", "<init>", "(Ler/l;)V", "coordinates", "h", "(Le4/b0;)V", "r", "Ler/l;", "getCallback", "()Ler/l;", "n3", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class m1 extends m.c implements s {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private l<? super b0, i0> callback;

    public m1(l<? super b0, i0> lVar) {
        this.callback = lVar;
    }

    @Override // g4.s
    public void h(b0 coordinates) {
        this.callback.b(coordinates);
    }

    public final void n3(l<? super b0, i0> lVar) {
        this.callback = lVar;
    }
}
