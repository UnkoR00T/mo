package sr3;

import er.l;
import fr.t;
import i50.BaseScaffoldData;
import mx.c;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import rr3.e;
import tr3.ZusVisitInfoPageSection;
import x40.LinkData;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lsr3/a;", "Lxw/f;", "Lsr3/a$a;", "Lrr3/e$a;", "Lmx/c;", "labelProvider", "Lu04/a;", "commonEndpoints", "<init>", "(Lmx/c;Lu04/a;)V", "params", "c", "(Lsr3/a$a;)Lrr3/e$a;", "a", "Lmx/c;", "b", "Lu04/a;", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, e.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u04.a commonEndpoints;

    /* JADX INFO: renamed from: sr3.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lsr3/a$a;", "", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "Lkotlin/Function1;", "", "onOpenUrl", "<init>", "(Ler/a;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "()Ler/a;", "b", "Ler/l;", "()Ler/l;", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onOpenUrl;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(er.a<i0> aVar, l<? super String, i0> lVar) {
            this.onBackAction = aVar;
            this.onOpenUrl = lVar;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        public final l<String, i0> b() {
            return this.onOpenUrl;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.onBackAction, params.onBackAction) && t.c(this.onOpenUrl, params.onOpenUrl);
        }

        public int hashCode() {
            return (this.onBackAction.hashCode() * 31) + this.onOpenUrl.hashCode();
        }

        public String toString() {
            return "Params(onBackAction=" + this.onBackAction + ", onOpenUrl=" + this.onOpenUrl + ')';
        }
    }

    public a(c cVar, u04.a aVar) {
        this.labelProvider = cVar;
        this.commonEndpoints = aVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public e.Data b(Params params) {
        return new e.Data(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.a()), this.labelProvider.c(ir3.a.f96829v), null, null, null, 28, null), null, null, null, null, 61, null), params.a(), v.q(new ZusVisitInfoPageSection(this.labelProvider.c(ir3.a.R), v.q(this.labelProvider.c(ir3.a.U), this.labelProvider.c(ir3.a.W), this.labelProvider.c(ir3.a.V), this.labelProvider.c(ir3.a.T), this.labelProvider.c(ir3.a.S)), this.labelProvider.c(ir3.a.Q), new LinkData(null, this.labelProvider.c(ir3.a.X), this.commonEndpoints.F(), LinkData.EnumC5775a.WEBSITE, false, params.b(), 17, null)), new ZusVisitInfoPageSection(this.labelProvider.c(ir3.a.Y), v.q(this.labelProvider.c(ir3.a.f96767a0), this.labelProvider.c(ir3.a.f96773c0), this.labelProvider.c(ir3.a.Z), this.labelProvider.c(ir3.a.f96770b0)), null, null, 12, null)));
    }
}
