package o90;

import h90.BERegisterDeviceResponse;
import p071kotlin.Metadata;
import y74.RegisterDeviceResponse;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lo90/g0;", "", "<init>", "()V", "Lh90/i;", "Ly74/c;", "a", "(Lh90/i;)Ly74/c;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g0 f143414a = new g0();

    private g0() {
    }

    public final RegisterDeviceResponse a(BERegisterDeviceResponse bERegisterDeviceResponse) {
        return new RegisterDeviceResponse(bERegisterDeviceResponse.getEncryptingKey());
    }
}
