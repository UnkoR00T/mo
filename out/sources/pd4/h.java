package pd4;

import java.util.Iterator;
import mz.k;
import mz.l;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lpd4/h;", "Lgz/a;", "Lgz/b$a$a;", "Loq/i0;", "Lmz/l;", "intentManager", "Lyn3/d;", "verificationIntentHandler", "Lpl/gov/mc/fringers/mobywatel/g;", "launchAppIntentHandler", "<init>", "(Lmz/l;Lyn3/d;Lpl/gov/mc/fringers/mobywatel/g;)V", "params", "b", "(Lgz/b$a$a;)V", "a", "Lmz/l;", "Lyn3/d;", "c", "Lpl/gov/mc/fringers/mobywatel/g;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements gz.a<gz.b.a.C1792a, i0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l intentManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final yn3.d verificationIntentHandler;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final pl.gov.mc.fringers.mobywatel.g launchAppIntentHandler;

    public h(l lVar, yn3.d dVar, pl.gov.mc.fringers.mobywatel.g gVar) {
        this.intentManager = lVar;
        this.verificationIntentHandler = dVar;
        this.launchAppIntentHandler = gVar;
    }

    public void b(gz.b.a.C1792a params) {
        Iterator it = v.q(this.verificationIntentHandler, this.launchAppIntentHandler).iterator();
        while (it.hasNext()) {
            this.intentManager.a((k) it.next());
        }
    }
}
