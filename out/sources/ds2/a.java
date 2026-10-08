package ds2;

import cs2.d;
import cs2.e;
import er.l;
import fr.t;
import i50.BaseScaffoldData;
import mx.c;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import x40.LinkData;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lds2/a;", "Lxw/f;", "Lds2/a$a;", "Lcs2/e$a;", "Lmx/c;", "labelProvider", "Lu04/a;", "commonEndpoints", "<init>", "(Lmx/c;Lu04/a;)V", "params", "c", "(Lds2/a$a;)Lcs2/e$a;", "a", "Lmx/c;", "b", "Lu04/a;", "penaltypoints_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, e.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u04.a commonEndpoints;

    /* JADX INFO: renamed from: ds2.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0019\u0010\u001e¨\u0006\u001f"}, d2 = {"Lds2/a$a;", "", "Lcs2/d;", "state", "Lkotlin/Function0;", "Loq/i0;", "onClose", "Lkotlin/Function1;", "", "openUrl", "<init>", "(Lcs2/d;Ler/a;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcs2/d;", "getState", "()Lcs2/d;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/l;", "()Ler/l;", "penaltypoints_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final d state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> openUrl;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(d dVar, er.a<i0> aVar, l<? super String, i0> lVar) {
            this.state = dVar;
            this.onClose = aVar;
            this.openUrl = lVar;
        }

        public final er.a<i0> a() {
            return this.onClose;
        }

        public final l<String, i0> b() {
            return this.openUrl;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onClose, params.onClose) && t.c(this.openUrl, params.openUrl);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.onClose.hashCode()) * 31) + this.openUrl.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onClose=" + this.onClose + ", openUrl=" + this.openUrl + ')';
        }
    }

    public a(c cVar, u04.a aVar) {
        this.labelProvider = cVar;
        this.commonEndpoints = aVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public e.Data b(Params params) {
        return new e.Data(new e.Data.Content(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.a()), this.labelProvider.c(zr2.a.f236505r), null, null, null, 28, null), null, null, null, null, 61, null), v.q(new e.Data.Content.MiddleSection(this.labelProvider.c(zr2.a.f236498k), this.labelProvider.c(zr2.a.f236493f), v.q(this.labelProvider.c(zr2.a.f236494g), this.labelProvider.c(zr2.a.f236495h), this.labelProvider.c(zr2.a.f236496i), this.labelProvider.c(zr2.a.f236497j))), new e.Data.Content.MiddleSection(this.labelProvider.c(zr2.a.f236502o), this.labelProvider.c(zr2.a.f236499l), v.q(this.labelProvider.c(zr2.a.f236500m), this.labelProvider.c(zr2.a.f236501n))), new e.Data.Content.MiddleSection(this.labelProvider.c(zr2.a.f236504q), this.labelProvider.c(zr2.a.f236503p), null, 4, null)), new e.Data.Content.BottomSection(this.labelProvider.c(zr2.a.f236492e), new LinkData(null, this.labelProvider.c(zr2.a.f236489b), this.commonEndpoints.D(), LinkData.EnumC5775a.WEBSITE, false, params.b(), 17, null))), params.a());
    }
}
