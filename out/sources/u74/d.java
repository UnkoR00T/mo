package u74;

import ay.j;
import fr.q0;
import iz3.PushDataDto;
import p071kotlin.Metadata;
import s74.DecryptedMessage;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lu74/d;", "Ly74/b;", "Lay/j;", "jsonSerializer", "<init>", "(Lay/j;)V", "", "pushJson", "Ls74/a;", "a", "(Ljava/lang/String;)Ls74/a;", "Lay/j;", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements y74.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j jsonSerializer;

    public d(j jVar) {
        this.jsonSerializer = jVar;
    }

    @Override // y74.b
    public DecryptedMessage a(String pushJson) {
        return e.b((PushDataDto) this.jsonSerializer.a(pushJson, q0.n(PushDataDto.class)));
    }
}
