package f64;

import java.util.List;
import p071kotlin.Metadata;
import r54.LocalVehicleNotification;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lf64/c;", "Ls54/c;", "Le64/b;", "localNotificationsRepository", "<init>", "(Le64/b;)V", "Lgz/b$a$a;", "params", "Lmu/g;", "", "Lr54/d;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Le64/b;", "localnotifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements s54.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e64.b localNotificationsRepository;

    public c(e64.b bVar) {
        this.localNotificationsRepository = bVar;
    }

    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, tq.e<? super mu.g<? extends List<LocalVehicleNotification>>> eVar) {
        return this.localNotificationsRepository.l(eVar);
    }
}
