package td4;

import oq.p;
import p071kotlin.Metadata;
import p145z43.m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ltd4/i;", "Lxw/f;", "Ltd4/j;", "Lz43/m;", "<init>", "()V", "entryPoint", "c", "(Ltd4/j;)Lz43/m;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i implements xw.f<j, m> {
    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public m b(j entryPoint) {
        if (entryPoint instanceof j.e) {
            return m.e.f232882a;
        }
        if (entryPoint instanceof j.c) {
            return m.c.f232880a;
        }
        if (entryPoint instanceof j.a) {
            return m.a.f232878a;
        }
        if (entryPoint instanceof j.b) {
            return m.b.f232879a;
        }
        if (entryPoint instanceof j.d) {
            return new m.MakeProposalService(((j.d) entryPoint).getSupplementOrigin());
        }
        throw new p();
    }
}
