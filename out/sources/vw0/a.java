package vw0;

import er.l;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import jx.b;
import k30.d;
import mx.Label;
import mx.c;
import n30.CardListData;
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
import xw0.g;
import xw0.h;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lvw0/a;", "Lxw/f;", "Lvw0/a$a;", "Lxw0/h$a;", "Lmx/c;", "labelProvider", "Lu04/a;", "endpoints", "<init>", "(Lmx/c;Lu04/a;)V", "params", "c", "(Lvw0/a$a;)Lxw0/h$a;", "a", "Lmx/c;", "b", "Lu04/a;", "aboutapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, h.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u04.a endpoints;

    /* JADX INFO: renamed from: vw0.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\b\u001c\u0010\"R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b#\u0010\"R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b\u0018\u0010\"¨\u0006$"}, d2 = {"Lvw0/a$a;", "", "Lxw0/g;", "state", "Lkotlin/Function1;", "", "Loq/i0;", "onOpenUrlAction", "Lkotlin/Function0;", "onGoToLicenseAction", "onGoToLegalInformationAction", "onUpdateAction", "onBackAction", "<init>", "(Lxw0/g;Ler/l;Ler/a;Ler/a;Ler/a;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lxw0/g;", "f", "()Lxw0/g;", "b", "Ler/l;", "d", "()Ler/l;", "c", "Ler/a;", "()Ler/a;", "e", "aboutapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final g state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onOpenUrlAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onGoToLicenseAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onGoToLegalInformationAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onUpdateAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(g gVar, l<? super String, i0> lVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4) {
            this.state = gVar;
            this.onOpenUrlAction = lVar;
            this.onGoToLicenseAction = aVar;
            this.onGoToLegalInformationAction = aVar2;
            this.onUpdateAction = aVar3;
            this.onBackAction = aVar4;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        public final er.a<i0> b() {
            return this.onGoToLegalInformationAction;
        }

        public final er.a<i0> c() {
            return this.onGoToLicenseAction;
        }

        public final l<String, i0> d() {
            return this.onOpenUrlAction;
        }

        public final er.a<i0> e() {
            return this.onUpdateAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onOpenUrlAction, params.onOpenUrlAction) && t.c(this.onGoToLicenseAction, params.onGoToLicenseAction) && t.c(this.onGoToLegalInformationAction, params.onGoToLegalInformationAction) && t.c(this.onUpdateAction, params.onUpdateAction) && t.c(this.onBackAction, params.onBackAction);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final g getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.onOpenUrlAction.hashCode()) * 31) + this.onGoToLicenseAction.hashCode()) * 31) + this.onGoToLegalInformationAction.hashCode()) * 31) + this.onUpdateAction.hashCode()) * 31) + this.onBackAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onOpenUrlAction=" + this.onOpenUrlAction + ", onGoToLicenseAction=" + this.onGoToLicenseAction + ", onGoToLegalInformationAction=" + this.onGoToLegalInformationAction + ", onUpdateAction=" + this.onUpdateAction + ", onBackAction=" + this.onBackAction + ')';
        }
    }

    public a(c cVar, u04.a aVar) {
        this.labelProvider = cVar;
        this.endpoints = aVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public h.a b(Params params) {
        DefaultSingleCardData defaultSingleCardData;
        g state = params.getState();
        if (t.c(state, g.b.f221656a)) {
            return h.a.b.f221664a;
        }
        if (!(state instanceof g.Content)) {
            throw new p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Medium(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(rw0.a.f176537g), null, null, false, null, 60, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(rw0.a.f176535e);
        LinkData linkData = new LinkData(null, this.labelProvider.c(rw0.a.f176534d), this.endpoints.f(), LinkData.EnumC5775a.WEBSITE, false, params.d(), 17, null);
        b.a updateAvailabilityState = ((g.Content) params.getState()).getUpdateAvailabilityState();
        if (t.c(updateAvailabilityState, b.a.C2531a.f106453b)) {
            defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(rw0.a.f176536f), null, null, 0, 0, null, 62, null), new n50.b.StatusBadge(new r50.a.WithIcon(null, mx.b.b(((g.Content) state).getAppVersion(), "AppVersion"), null, 0, false, r50.g.NOTICE, 13, null)), new SingleCardLabel(this.labelProvider.c(rw0.a.f176539i), null, null, 0, 0, null, 62, null)), null, new x0.Button(new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(this.labelProvider.c(rw0.a.f176531a), null, 2, null), d.a.f107773a, null, params.e(), 35, null)), null, 2815, null);
        } else if (t.c(updateAvailabilityState, b.a.C2532b.f106454b)) {
            defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(rw0.a.f176536f), null, null, 0, 0, null, 62, null), new n50.b.StatusBadge(new r50.a.WithIcon(null, mx.b.b(((g.Content) state).getAppVersion(), "AppVersion"), null, 0, false, r50.g.POSITIVE, 13, null)), new SingleCardLabel(this.labelProvider.c(rw0.a.f176538h), null, null, 0, 0, null, 62, null)), null, null, null, 3839, null);
        } else {
            if (!t.c(updateAvailabilityState, b.a.c.f106455b)) {
                throw new p();
            }
            defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(rw0.a.f176536f), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(((g.Content) state).getAppVersion(), "AppVersion"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        }
        er.a<i0> aVarB = params.b();
        BodySection bodySection = new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(rw0.a.f176532b), null, null, 0, 0, null, 62, null)), null, 5, null);
        x0.Icon.Companion companion = x0.Icon.INSTANCE;
        return new h.a.Content(baseScaffoldData, labelC, linkData, new CardListData(v.q(defaultSingleCardData, new DefaultSingleCardData(null, aVarB, false, null, null, false, null, null, bodySection, null, companion.b(), null, 2813, null), new DefaultSingleCardData(null, params.c(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(rw0.a.f176533c), null, null, 0, 0, null, 62, null)), null, 5, null), null, companion.b(), null, 2813, null)), null, false, null, null, 30, null), params.a(), ((g.Content) params.getState()).getShouldShowKPOLogo());
    }
}
