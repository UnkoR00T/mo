package zp3;

import er.l;
import fr.t;
import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import oo0.k;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import x40.LinkData;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001fB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ)\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001a\u00020\u00132\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f0\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lzp3/d;", "Lxw/f;", "Lzp3/d$a;", "Lyp3/f$a;", "Lmx/c;", "labelProvider", "Lu04/a;", "commonEndpoints", "<init>", "(Lmx/c;Lu04/a;)V", "Lkotlin/Function1;", "Loo0/k;", "Loq/i0;", "onClick", "", "Ln50/g;", "m", "(Ler/l;)Ljava/util/List;", "", "Lc30/b$c;", "l", "(Ler/l;)Lc30/b$c;", "Lmx/a;", "titleLabel", "descriptionLabel", "Lkotlin/Function0;", "h", "(Lmx/a;Lmx/a;Ler/a;)Ln50/g;", "params", "i", "(Lzp3/d$a;)Lyp3/f$a;", "a", "Lmx/c;", "b", "Lu04/a;", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements f<Params, yp3.f.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u04.a commonEndpoints;

    /* JADX INFO: renamed from: zp3.d$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001b\u0010\u001a¨\u0006\u001c"}, d2 = {"Lzp3/d$a;", "", "Lkotlin/Function0;", "Loq/i0;", "closeAction", "Lkotlin/Function1;", "Loo0/k;", "goToSendIdeaDetails", "", "openUrl", "<init>", "(Ler/a;Ler/l;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "()Ler/a;", "b", "Ler/l;", "()Ler/l;", "c", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> closeAction;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<k, i0> goToSendIdeaDetails;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> openUrl;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(er.a<i0> aVar, l<? super k, i0> lVar, l<? super String, i0> lVar2) {
            this.closeAction = aVar;
            this.goToSendIdeaDetails = lVar;
            this.openUrl = lVar2;
        }

        public final er.a<i0> a() {
            return this.closeAction;
        }

        public final l<k, i0> b() {
            return this.goToSendIdeaDetails;
        }

        public final l<String, i0> c() {
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
            return t.c(this.closeAction, params.closeAction) && t.c(this.goToSendIdeaDetails, params.goToSendIdeaDetails) && t.c(this.openUrl, params.openUrl);
        }

        public int hashCode() {
            return (((this.closeAction.hashCode() * 31) + this.goToSendIdeaDetails.hashCode()) * 31) + this.openUrl.hashCode();
        }

        public String toString() {
            return "Params(closeAction=" + this.closeAction + ", goToSendIdeaDetails=" + this.goToSendIdeaDetails + ", openUrl=" + this.openUrl + ')';
        }
    }

    public d(mx.c cVar, u04.a aVar) {
        this.labelProvider = cVar;
        this.commonEndpoints = aVar;
    }

    private final DefaultSingleCardData h(Label titleLabel, Label descriptionLabel, er.a<i0> onClick) {
        return new DefaultSingleCardData(null, onClick, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(titleLabel, null, null, 0, 0, null, 62, null)), new SingleCardLabel(descriptionLabel, null, null, 0, 0, null, 62, null), 1, null), null, x0.Icon.INSTANCE.b(), null, 2813, null);
    }

    private final c30.b.c l(l<? super String, i0> onClick) {
        return new c30.b.c(null, null, this.labelProvider.c(gp3.a.f76161x0), this.labelProvider.c(gp3.a.f76159w0), null, null, new c30.a.Link(new LinkData(null, this.labelProvider.c(gp3.a.f76157v0), this.commonEndpoints.Q(), LinkData.EnumC5775a.WEBSITE, false, onClick, 17, null)), 51, null);
    }

    private final List<DefaultSingleCardData> m(final l<? super k, i0> onClick) {
        return v.q(h(this.labelProvider.c(gp3.a.I0), this.labelProvider.c(gp3.a.G0), new er.a() { // from class: zp3.a
            @Override // er.a
            public final Object a() {
                return d.q(onClick);
            }
        }), h(this.labelProvider.c(gp3.a.P0), this.labelProvider.c(gp3.a.N0), new er.a() { // from class: zp3.b
            @Override // er.a
            public final Object a() {
                return d.r(onClick);
            }
        }), h(this.labelProvider.c(gp3.a.L0), this.labelProvider.c(gp3.a.K0), new er.a() { // from class: zp3.c
            @Override // er.a
            public final Object a() {
                return d.s(onClick);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(l lVar) {
        lVar.b(k.DOCUMENTS);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(l lVar) {
        lVar.b(k.SERVICES);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(l lVar) {
        lVar.b(k.OTHER);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public yp3.f.Data b(Params params) {
        return new yp3.f.Data(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(gp3.a.E0), null, null, null, 28, null), null, null, null, null, 61, null), this.labelProvider.c(gp3.a.C0), m(params.b()), l(params.c()));
    }
}
