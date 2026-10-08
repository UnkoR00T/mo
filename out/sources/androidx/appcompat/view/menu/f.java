package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p007NuL.s;

/* JADX INFO: loaded from: classes.dex */
class f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, j.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f8495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.appcompat.app.b f8496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    c f8497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private j.a f8498d;

    public f(e eVar) {
        this.f8495a = eVar;
    }

    public void a() {
        androidx.appcompat.app.b bVar = this.f8496b;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    public void b(IBinder iBinder) {
        e eVar = this.f8495a;
        androidx.appcompat.app.b.a aVar = new androidx.appcompat.app.b.a(eVar.u());
        c cVar = new c(aVar.getContext(), s.f413j);
        this.f8497c = cVar;
        cVar.e(this);
        this.f8495a.b(this.f8497c);
        aVar.a(this.f8497c.a(), this);
        View viewY = eVar.y();
        if (viewY != null) {
            aVar.b(viewY);
        } else {
            aVar.c(eVar.w()).setTitle(eVar.x());
        }
        aVar.e(this);
        androidx.appcompat.app.b bVarCreate = aVar.create();
        this.f8496b = bVarCreate;
        bVarCreate.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f8496b.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= PKIFailureInfo.unsupportedVersion;
        this.f8496b.show();
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void c(e eVar, boolean z15) {
        if (z15 || eVar == this.f8495a) {
            a();
        }
        j.a aVar = this.f8498d;
        if (aVar != null) {
            aVar.c(eVar, z15);
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public boolean d(e eVar) {
        j.a aVar = this.f8498d;
        if (aVar != null) {
            return aVar.d(eVar);
        }
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i15) {
        this.f8495a.M((g) this.f8497c.a().getItem(i15), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f8497c.c(this.f8495a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i15, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i15 == 82 || i15 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f8496b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f8496b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f8495a.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f8495a.performShortcut(i15, keyEvent, 0);
    }
}
