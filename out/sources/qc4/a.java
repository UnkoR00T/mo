package qc4;

import b54.c;
import c54.b;
import p071kotlin.Metadata;
import v64.o;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lqc4/a;", "Ll04/a;", "Lc54/b;", "isFeatureEnabledUseCase", "Lv64/o;", "isLoggedInUseCase", "<init>", "(Lc54/b;Lv64/o;)V", "", "a", "()Z", "b", "Lc54/b;", "Lv64/o;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements l04.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b isFeatureEnabledUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final o isLoggedInUseCase;

    public a(b bVar, o oVar) {
        this.isFeatureEnabledUseCase = bVar;
        this.isLoggedInUseCase = oVar;
    }

    @Override // l04.a
    public boolean a() {
        return this.isFeatureEnabledUseCase.a(c.MOB_DB_CONTAINERS).booleanValue();
    }

    @Override // l04.a
    public boolean b() {
        return this.isLoggedInUseCase.a(gz.b.a.C1792a.f78542a).booleanValue();
    }
}
