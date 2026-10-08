package fg;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import io.sentry.android.core.c2;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Messenger f62318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f62319b;

    y(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.f62318a = new Messenger(iBinder);
            this.f62319b = null;
        } else {
            if (!Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
                c2.g("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
                throw new RemoteException();
            }
            this.f62319b = new l(iBinder);
            this.f62318a = null;
        }
    }

    final void a(Message message) throws RemoteException {
        Messenger messenger = this.f62318a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        l lVar = this.f62319b;
        if (lVar == null) {
            throw new IllegalStateException("Both messengers are null");
        }
        lVar.b(message);
    }
}
