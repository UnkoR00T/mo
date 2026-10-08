package v4;

import android.os.Build;
import android.view.inputmethod.InputConnection;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/view/inputmethod/InputConnection;", "delegate", "Lkotlin/Function1;", "Lv4/c0;", "Loq/i0;", "onConnectionClosed", "a", "(Landroid/view/inputmethod/InputConnection;Ler/l;)Lv4/c0;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class h0 {
    public static final c0 a(InputConnection inputConnection, er.l<? super c0, oq.i0> lVar) {
        return Build.VERSION.SDK_INT >= 34 ? new g0(inputConnection, lVar) : new f0(inputConnection, lVar);
    }
}
