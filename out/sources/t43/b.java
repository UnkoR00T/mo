package t43;

import oq.p;
import p071kotlin.Metadata;
import w43.OnlineServiceUrls;
import w43.c;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lt43/b;", "Lxw/f;", "Lw43/c;", "Lw43/d;", "Ly04/a;", "buildConfigRepository", "<init>", "(Ly04/a;)V", "p1", "c", "(Lw43/c;)Lw43/d;", "a", "Ly04/a;", "services_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<c, OnlineServiceUrls> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final y04.a buildConfigRepository;

    public b(y04.a aVar) {
        this.buildConfigRepository = aVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public OnlineServiceUrls b(c p15) {
        String str;
        if (p15 instanceof c.e) {
            str = this.buildConfigRepository.getPrescriptionScheme() + "://" + this.buildConfigRepository.getPrescriptionHost() + '/' + this.buildConfigRepository.getPrescriptionContext();
        } else if (p15 instanceof c.C5527c) {
            str = this.buildConfigRepository.getIpolakScheme() + "://" + this.buildConfigRepository.getIpolakHost() + '/' + this.buildConfigRepository.getIpolakContext();
        } else if (p15 instanceof c.a) {
            str = this.buildConfigRepository.getPkpScheme() + "://" + this.buildConfigRepository.getPkpHost() + '/' + this.buildConfigRepository.getPkpContext();
        } else if (p15 instanceof c.b) {
            str = this.buildConfigRepository.getCityCardScheme() + "://" + this.buildConfigRepository.getCityCardHost() + '/' + this.buildConfigRepository.getCityCardContext();
        } else {
            if (!(p15 instanceof c.d)) {
                throw new p();
            }
            str = this.buildConfigRepository.getCoalProposalScheme() + "://" + this.buildConfigRepository.getCoalProposalHost() + '/' + this.buildConfigRepository.getCoalProposalContext();
        }
        return new OnlineServiceUrls(str);
    }
}
