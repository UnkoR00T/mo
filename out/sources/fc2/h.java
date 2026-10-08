package fc2;

import er.l;
import fr.t;
import i50.BaseScaffoldData;
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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001aB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ)\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\n*\u00020\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0011\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lfc2/h;", "Lxw/f;", "Lfc2/h$a;", "Ldc2/g$a;", "Lmx/c;", "labelProvider", "Lib2/a;", "identityCardInvalidationEndpoints", "<init>", "(Lmx/c;Lib2/a;)V", "T", "Ldc2/d$d;", "Lkotlin/Function0;", "block", "x", "(Ldc2/d$d;Ler/a;)Ljava/lang/Object;", "", "resId", "Loq/i0;", "onClick", "Ln50/g;", "l", "(ILer/a;)Ln50/g;", "params", "m", "(Lfc2/h$a;)Ldc2/g$a;", "a", "Lmx/c;", "b", "Lib2/a;", "identitycardinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements xw.f<Params, dc2.g.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ib2.a identityCardInvalidationEndpoints;

    /* JADX INFO: renamed from: fc2.h$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b\u0018\u0010!R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b\"\u0010\u001fR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010 \u001a\u0004\b\u001c\u0010!¨\u0006#"}, d2 = {"Lfc2/h$a;", "", "Ldc2/d;", "state", "Lkotlin/Function1;", "Lhl0/c;", "Loq/i0;", "onReasonSelected", "Lkotlin/Function0;", "onBackClick", "", "onUrlClick", "onCloseClick", "<init>", "(Ldc2/d;Ler/l;Ler/a;Ler/l;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ldc2/d;", "e", "()Ldc2/d;", "b", "Ler/l;", "c", "()Ler/l;", "Ler/a;", "()Ler/a;", "d", "identitycardinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final dc2.d state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<hl0.c, i0> onReasonSelected;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onUrlClick;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseClick;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(dc2.d dVar, l<? super hl0.c, i0> lVar, er.a<i0> aVar, l<? super String, i0> lVar2, er.a<i0> aVar2) {
            this.state = dVar;
            this.onReasonSelected = lVar;
            this.onBackClick = aVar;
            this.onUrlClick = lVar2;
            this.onCloseClick = aVar2;
        }

        public final er.a<i0> a() {
            return this.onBackClick;
        }

        public final er.a<i0> b() {
            return this.onCloseClick;
        }

        public final l<hl0.c, i0> c() {
            return this.onReasonSelected;
        }

        public final l<String, i0> d() {
            return this.onUrlClick;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final dc2.d getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onReasonSelected, params.onReasonSelected) && t.c(this.onBackClick, params.onBackClick) && t.c(this.onUrlClick, params.onUrlClick) && t.c(this.onCloseClick, params.onCloseClick);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.onReasonSelected.hashCode()) * 31) + this.onBackClick.hashCode()) * 31) + this.onUrlClick.hashCode()) * 31) + this.onCloseClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onReasonSelected=" + this.onReasonSelected + ", onBackClick=" + this.onBackClick + ", onUrlClick=" + this.onUrlClick + ", onCloseClick=" + this.onCloseClick + ')';
        }
    }

    public h(mx.c cVar, ib2.a aVar) {
        this.labelProvider = cVar;
        this.identityCardInvalidationEndpoints = aVar;
    }

    private final DefaultSingleCardData l(int resId, er.a<i0> onClick) {
        return new DefaultSingleCardData(null, onClick, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(resId), null, null, 0, 0, null, 62, null)), null, 5, null), null, x0.Icon.INSTANCE.b(), null, 2813, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(Params params) {
        params.c().b(hl0.c.DAMAGE);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(Params params) {
        params.c().b(hl0.c.LOSS);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DefaultSingleCardData s(h hVar, final Params params) {
        return hVar.l(hb2.b.f82780d0, new er.a() { // from class: fc2.c
            @Override // er.a
            public final Object a() {
                return h.u(params);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(Params params) {
        params.c().b(hl0.c.IDENTITY_THEFT);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c30.b.c v(h hVar, Params params) {
        return new c30.b.c(null, null, null, hVar.labelProvider.c(hb2.b.U), null, null, new c30.a.Link(new LinkData(null, hVar.labelProvider.c(hb2.b.f82821y), hVar.identityCardInvalidationEndpoints.N(), LinkData.EnumC5775a.WEBSITE, false, params.d(), 17, null)), 55, null);
    }

    private final <T> T x(dc2.d.InterfaceC0902d interfaceC0902d, er.a<? extends T> aVar) {
        boolean isTheftEnabled = interfaceC0902d.getIsTheftEnabled();
        Boolean boolValueOf = Boolean.valueOf(isTheftEnabled);
        if (!isTheftEnabled) {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            return aVar.a();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // er.l
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public dc2.g.a b(final Params params) {
        dc2.d state = params.getState();
        if (state instanceof dc2.d.a) {
            return new dc2.g.a.Error(((dc2.d.a) params.getState()).getVmsAdapter());
        }
        if (!(state instanceof dc2.d.InterfaceC0902d)) {
            throw new p();
        }
        dc2.d.InterfaceC0902d interfaceC0902d = (dc2.d.InterfaceC0902d) state;
        return new dc2.g.a.Initialized(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(hb2.b.K), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.b(), 6, null)), null, 20, null), null, null, null, null, 61, null), this.labelProvider.c(hb2.b.f82782e0), v.s(l(hb2.b.f82776b0, new er.a() { // from class: fc2.d
            @Override // er.a
            public final Object a() {
                return h.q(params);
            }
        }), l(hb2.b.f82778c0, new er.a() { // from class: fc2.e
            @Override // er.a
            public final Object a() {
                return h.r(params);
            }
        }), x(interfaceC0902d, new er.a() { // from class: fc2.f
            @Override // er.a
            public final Object a() {
                return h.s(this.f61103a, params);
            }
        })), new c30.b.c(null, null, null, this.labelProvider.c(hb2.b.V), null, null, new c30.a.Link(new LinkData(null, this.labelProvider.c(hb2.b.f82821y), this.identityCardInvalidationEndpoints.A(), LinkData.EnumC5775a.WEBSITE, false, params.d(), 17, null)), 55, null), (c30.b) x(interfaceC0902d, new er.a() { // from class: fc2.g
            @Override // er.a
            public final Object a() {
                return h.v(this.f61105a, params);
            }
        }), params.a());
    }
}
