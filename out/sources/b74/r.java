package b74;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lb74/r;", "Lv64/o;", "Lu64/b;", "repository", "La74/a;", "userRepository", "Lz64/b;", "userCommonInteractor", "<init>", "(Lu64/b;La74/a;Lz64/b;)V", "Lgz/b$a$a;", "params", "", "b", "(Lgz/b$a$a;)Ljava/lang/Boolean;", "a", "Lu64/b;", "La74/a;", "c", "Lz64/b;", "user_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r implements v64.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u64.b repository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a74.a userRepository;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final z64.b userCommonInteractor;

    public r(u64.b bVar, a74.a aVar, z64.b bVar2) {
        this.repository = bVar;
        this.userRepository = aVar;
        this.userCommonInteractor = bVar2;
    }

    @Override // gz.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean a(gz.b.a.C1792a params) {
        return Boolean.valueOf(this.userCommonInteractor.a() ? this.userRepository.b() : this.repository.b());
    }
}
