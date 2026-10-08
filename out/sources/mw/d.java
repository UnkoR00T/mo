package mw;

import fr.t;
import fu.MatchGroup;
import fu.l;
import fu.o;
import java.util.List;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0016\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0017\u0012B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\r\u001a\u00020\f2\n\u0010\u0007\u001a\u00060\u0005R\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\n\u0010\u0007\u001a\u00060\u0005R\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0017\u001a\u00020\u00162\n\u0010\u0007\u001a\u00060\u0005R\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u0019\u001a\u0004\u0018\u00010\b2\n\u0010\u0007\u001a\u00060\u0005R\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lmw/d;", "Lkw/d;", "Liw/f$a;", "<init>", "()V", "Liw/d$a;", "Liw/d;", "pos", "Lmw/d$b;", "openingInfo", "Liw/h;", "productionHolder", "Loq/i0;", "c", "(Liw/d$a;Lmw/d$b;Liw/h;)V", "stateInfo", "", "Lkw/b;", "b", "(Liw/d$a;Liw/h;Liw/f$a;)Ljava/util/List;", "Ljw/b;", CryptoServicesPermission.CONSTRAINTS, "", "a", "(Liw/d$a;Ljw/b;)Z", "d", "(Liw/d$a;Ljw/b;)Lmw/d$b;", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public class d implements kw.d<iw.f.a> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final o f128689c = new o("^ {0,3}(~~~+|```+)([^`]*)$");

    /* JADX INFO: renamed from: mw.d$b, reason: from toString */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0084\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\bJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, d2 = {"Lmw/d$b;", "", "", "delimiter", "info", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "()Ljava/lang/String;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "b", "c", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
    protected static final /* data */ class OpeningInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String delimiter;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String info;

        public OpeningInfo(String str, String str2) {
            this.delimiter = str;
            this.info = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getInfo() {
            return this.info;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDelimiter() {
            return this.delimiter;
        }

        public final String c() {
            return this.info;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OpeningInfo)) {
                return false;
            }
            OpeningInfo openingInfo = (OpeningInfo) other;
            return t.c(this.delimiter, openingInfo.delimiter) && t.c(this.info, openingInfo.info);
        }

        public int hashCode() {
            return (this.delimiter.hashCode() * 31) + this.info.hashCode();
        }

        public String toString() {
            return "OpeningInfo(delimiter=" + this.delimiter + ", info=" + this.info + ')';
        }
    }

    private final void c(iw.d.a pos, OpeningInfo openingInfo, iw.h productionHolder) {
        int iG = pos.g() - openingInfo.getInfo().length();
        productionHolder.b(v.e(new nw.f.Node(new lr.i(pos.getGlobalPos(), iG), yv.e.F)));
        if (openingInfo.c().length() > 0) {
            productionHolder.b(v.e(new nw.f.Node(new lr.i(iG, pos.g()), yv.e.E)));
        }
    }

    @Override // kw.d
    public boolean a(iw.d.a pos, jw.b constraints) {
        return d(pos, constraints) != null;
    }

    @Override // kw.d
    public List<kw.b> b(iw.d.a pos, iw.h productionHolder, iw.f.a stateInfo) {
        OpeningInfo openingInfoD = d(pos, stateInfo.getCurrentConstraints());
        if (openingInfoD == null) {
            return v.n();
        }
        c(pos, openingInfoD, productionHolder);
        return v.e(new lw.d(stateInfo.getCurrentConstraints(), productionHolder, openingInfoD.getDelimiter()));
    }

    protected OpeningInfo d(iw.d.a pos, jw.b constraints) {
        l lVarC;
        if (!kw.d.INSTANCE.a(pos, constraints) || (lVarC = o.c(f128689c, pos.d(), 0, 2, null)) == null) {
            return null;
        }
        MatchGroup matchGroup = lVarC.getGroups().get(1);
        String value = matchGroup != null ? matchGroup.getValue() : null;
        MatchGroup matchGroup2 = lVarC.getGroups().get(2);
        return new OpeningInfo(value, matchGroup2 != null ? matchGroup2.getValue() : null);
    }
}
