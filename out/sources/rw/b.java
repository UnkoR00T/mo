package rw;

import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import fr.t;
import mu.b0;
import mu.r0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p006NUl.c;
import p071kotlin.Metadata;
import p087nuL.h0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0005*\u0001\u001d\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R&\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lrw/b;", "Loz/b;", "Landroid/content/Intent;", "LNUl/c;", "Lbx/a;", "Lrw/a;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lbx/c;", "status", "Loq/i0;", "u", "(Lbx/c;)V", "v", "()Lbx/c;", "d", "Landroid/content/Context;", "Lmu/b0;", "e", "Lmu/b0;", "bluetoothStatus", "LnuL/b0;", "f", "LnuL/b0;", "r", "()LnuL/b0;", "contract", "rw/b$a", "g", "Lrw/b$a;", "bluetoothReceiver", "bluetooth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b extends oz.b<Intent, c> implements bx.a, rw.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final b0<bx.c> bluetoothStatus = r0.a(v());

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p087nuL.b0<Intent, c> contract = new h0();

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final a bluetoothReceiver = new a();

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"rw/b$a", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Loq/i0;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "bluetooth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action;
            if (intent == null || (action = intent.getAction()) == null || !t.c(action, "android.bluetooth.adapter.action.STATE_CHANGED")) {
                return;
            }
            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", PKIFailureInfo.systemUnavail);
            if (intExtra == Integer.MIN_VALUE) {
                b.this.u(bx.b.f21906a);
            } else if (intExtra == 10) {
                b.this.u(bx.c.a.f21907a);
            } else {
                if (intExtra != 12) {
                    return;
                }
                b.this.u(bx.c.b.f21908a);
            }
        }
    }

    public b(Context context) {
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(bx.c status) {
        this.bluetoothStatus.f(status);
    }

    @Override // oz.b
    public p087nuL.b0<Intent, c> r() {
        return this.contract;
    }

    public bx.c v() {
        Object systemService = this.context.getSystemService("bluetooth");
        BluetoothManager bluetoothManager = systemService instanceof BluetoothManager ? (BluetoothManager) systemService : null;
        if ((bluetoothManager != null ? bluetoothManager.getAdapter() : null) == null) {
            return bx.b.f21906a;
        }
        return bluetoothManager.getAdapter().isEnabled() ? bx.c.b.f21908a : bx.c.a.f21907a;
    }
}
