package ml1;

import er.l;
import fr.t;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.List;
import kl1.g;
import mx.Label;
import mx.c;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import x40.LinkData;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0015\u001a\u00020\u0012*\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lml1/b;", "Lxw/f;", "Lml1/b$a;", "Lkl1/g$a;", "Lmx/c;", "labelProvider", "Lhk1/a;", "endpoints", "<init>", "(Lmx/c;Lhk1/a;)V", "params", "f", "(Lml1/b$a;)Lkl1/g$a;", "a", "Lmx/c;", "b", "Lhk1/a;", "Lfl0/b;", "", "e", "(Lfl0/b;)I", "labelResId", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, g.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final hk1.a endpoints;

    /* JADX INFO: renamed from: ml1.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b \u0010\u001fR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\b\u0018\u0010\"R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b\u001c\u0010\"¨\u0006$"}, d2 = {"Lml1/b$a;", "", "Lkl1/f;", "state", "Lkotlin/Function1;", "", "Loq/i0;", "onUrlClick", "Lfl0/b;", "onReasonSelected", "Lkotlin/Function0;", "backAction", "closeAction", "<init>", "(Lkl1/f;Ler/l;Ler/l;Ler/a;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkl1/f;", "getState", "()Lkl1/f;", "b", "Ler/l;", "d", "()Ler/l;", "c", "Ler/a;", "()Ler/a;", "e", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final kl1.f state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onUrlClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<fl0.b, i0> onReasonSelected;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> closeAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(kl1.f fVar, l<? super String, i0> lVar, l<? super fl0.b, i0> lVar2, er.a<i0> aVar, er.a<i0> aVar2) {
            this.state = fVar;
            this.onUrlClick = lVar;
            this.onReasonSelected = lVar2;
            this.backAction = aVar;
            this.closeAction = aVar2;
        }

        public final er.a<i0> a() {
            return this.backAction;
        }

        public final er.a<i0> b() {
            return this.closeAction;
        }

        public final l<fl0.b, i0> c() {
            return this.onReasonSelected;
        }

        public final l<String, i0> d() {
            return this.onUrlClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onUrlClick, params.onUrlClick) && t.c(this.onReasonSelected, params.onReasonSelected) && t.c(this.backAction, params.backAction) && t.c(this.closeAction, params.closeAction);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.onUrlClick.hashCode()) * 31) + this.onReasonSelected.hashCode()) * 31) + this.backAction.hashCode()) * 31) + this.closeAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onUrlClick=" + this.onUrlClick + ", onReasonSelected=" + this.onReasonSelected + ", backAction=" + this.backAction + ", closeAction=" + this.closeAction + ')';
        }
    }

    /* JADX INFO: renamed from: ml1.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C3131b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f127071a;

        static {
            int[] iArr = new int[fl0.b.values().length];
            try {
                iArr[fl0.b.Damage.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fl0.b.Loss.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f127071a = iArr;
        }
    }

    public b(c cVar, hk1.a aVar) {
        this.labelProvider = cVar;
        this.endpoints = aVar;
    }

    private final int e(fl0.b bVar) {
        int i15 = C3131b.f127071a[bVar.ordinal()];
        if (i15 == 1) {
            return gk1.a.I;
        }
        if (i15 == 2) {
            return gk1.a.L;
        }
        throw new p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(Params params, fl0.b bVar) {
        params.c().b(bVar);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public g.Data b(final Params params) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(gk1.a.f73466x0), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.b(), 6, null)), null, 20, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(gk1.a.J);
        List<fl0.b> listQ = v.q(fl0.b.Damage, fl0.b.Loss);
        ArrayList arrayList = new ArrayList(v.y(listQ, 10));
        for (final fl0.b bVar : listQ) {
            arrayList.add(new DefaultSingleCardData(null, new er.a() { // from class: ml1.a
                @Override // er.a
                public final Object a() {
                    return b.h(params, bVar);
                }
            }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(e(bVar)), null, null, 0, 0, null, 62, null)), null, 5, null), null, x0.Icon.INSTANCE.b(), null, 2813, null));
        }
        return new g.Data(baseScaffoldData, labelC, arrayList, new c30.b.c(null, null, null, this.labelProvider.c(gk1.a.K), null, null, new c30.a.Link(new LinkData(null, this.labelProvider.c(gk1.a.G), this.endpoints.K(), LinkData.EnumC5775a.WEBSITE, false, params.d(), 17, null)), 55, null));
    }
}
