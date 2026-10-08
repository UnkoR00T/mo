package tb2;

import java.time.LocalDateTime;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ltb2/a;", "Lgz/a;", "Lgz/b$a$a;", "", "Lez/e;", "dateFormatter", "<init>", "(Lez/e;)V", "params", "b", "(Lgz/b$a$a;)Ljava/lang/String;", "a", "Lez/e;", "identitycardinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gz.a<gz.b.a.C1792a, String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    public a(ez.e eVar) {
        this.dateFormatter = eVar;
    }

    public String b(gz.b.a.C1792a params) {
        return this.dateFormatter.d(new fz.b.LocalDateTime(LocalDateTime.now()), fz.c.NO_SPACES);
    }
}
